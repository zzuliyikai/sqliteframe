package com.yikai.sqliteframe;


import com.yikai.sqlitemodule.db.BaseDao;

import java.util.List;

public class UserDao extends BaseDao {

    @Override
    public String createTable() {
        return "create table if not exists tb_user(tb_id int,tb_name varchar(20),tb_password varchar(10))";
    }


    @Override
    public List query(Object sql) {
        //如果自己想连表查询的话
        if (sql instanceof String) {
            return null;
        } else {
            return super.query(sql);
        }
    }
}
