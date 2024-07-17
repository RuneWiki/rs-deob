.version 45 3
.class public super db
.super u
.field e Ldb;
.field f Ldb;
.field public static g I

.method public b : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field db f Ldb;
L4:     ifnonnull L8
L7:     return
L8:     aload_0
L9:     getfield Field db f Ldb;
L12:    aload_0
L13:    getfield Field db e Ldb;
L16:    putfield Field db e Ldb;
L19:    aload_0
L20:    getfield Field db e Ldb;
L23:    aload_0
L24:    getfield Field db f Ldb;
L27:    putfield Field db f Ldb;
L30:    aload_0
L31:    aconst_null
L32:    putfield Field db e Ldb;
L35:    aload_0
L36:    aconst_null
L37:    putfield Field db f Ldb;
L40:    return
L41:    
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method u <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
