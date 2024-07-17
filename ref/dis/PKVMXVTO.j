.version 45 3
.class public super PKVMXVTO
.super java/lang/Object
.field private a Z
.field public b J
.field public c LPKVMXVTO;
.field d LPKVMXVTO;
.field public static e Z

.method public a : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field PKVMXVTO d LPKVMXVTO;
L4:     ifnonnull L8
L7:     return
L8:     aload_0
L9:     getfield Field PKVMXVTO d LPKVMXVTO;
L12:    aload_0
L13:    getfield Field PKVMXVTO c LPKVMXVTO;
L16:    putfield Field PKVMXVTO c LPKVMXVTO;
L19:    aload_0
L20:    getfield Field PKVMXVTO c LPKVMXVTO;
L23:    aload_0
L24:    getfield Field PKVMXVTO d LPKVMXVTO;
L27:    putfield Field PKVMXVTO d LPKVMXVTO;
L30:    aload_0
L31:    aconst_null
L32:    putfield Field PKVMXVTO c LPKVMXVTO;
L35:    aload_0
L36:    aconst_null
L37:    putfield Field PKVMXVTO d LPKVMXVTO;
L40:    return
L41:    
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field PKVMXVTO a Z
L9:     return
L10:    
    .end code
.end method
.end class
