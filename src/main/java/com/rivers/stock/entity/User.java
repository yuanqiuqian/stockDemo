package com.rivers.stock.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String sex;
    private int age;
}
