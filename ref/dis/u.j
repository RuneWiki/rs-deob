.version 45 3
.class public super u
.super java/lang/Object
.field a J
.field public b Lu;
.field c Lu;
.field public static d I

.method public a : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field u c Lu;
L4:     ifnonnull L8
L7:     return
L8:     aload_0
L9:     getfield Field u c Lu;
L12:    aload_0
L13:    getfield Field u b Lu;
L16:    putfield Field u b Lu;
L19:    aload_0
L20:    getfield Field u b Lu;
L23:    aload_0
L24:    getfield Field u c Lu;
L27:    putfield Field u c Lu;
L30:    aload_0
L31:    aconst_null
L32:    putfield Field u b Lu;
L35:    aload_0
L36:    aconst_null
L37:    putfield Field u c Lu;
L40:    return
L41:    
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
