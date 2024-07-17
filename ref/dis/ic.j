.version 45 3
.class public super ic
.super java/lang/Object
.field private static a I
.field public static b [Lic;
.field public c Z
.field public d Z
.field public e Z
.field public f Z
.field public g Z

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_1
L6:     putfield Field ic c Z
L9:     aload_0
L10:    iconst_0
L11:    putfield Field ic d Z
L14:    aload_0
L15:    iconst_1
L16:    putfield Field ic e Z
L19:    aload_0
L20:    iconst_1
L21:    putfield Field ic f Z
L24:    aload_0
L25:    iconst_0
L26:    putfield Field ic g Z
L29:    return
L30:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush 473
L3:     putstatic Field ic a I
L6:     return
L7:     
    .end code
.end method
.end class
