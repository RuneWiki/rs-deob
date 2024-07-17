.version 45 3
.class public final super BISVHPUN
.super java/lang/Object
.field private a Z
.field private b I
.field public c LPPOHBEGB;
.field private d LPPOHBEGB;

.method public <init> : (I)V
    .code stack 3 locals 3
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field BISVHPUN a Z
L9:     aload_0
L10:    sipush -589
L13:    putfield Field BISVHPUN b I
L16:    aload_0
L17:    new PPOHBEGB
L20:    dup
L21:    invokespecial Method PPOHBEGB <init> ()V
L24:    putfield Field BISVHPUN c LPPOHBEGB;
        .catch java/lang/RuntimeException from L27 to L59 using L60
L27:    iload_1
L28:    ifeq L37
L31:    aload_0
L32:    bipush -25
L34:    putfield Field BISVHPUN b I
L37:    aload_0
L38:    getfield Field BISVHPUN c LPPOHBEGB;
L41:    aload_0
L42:    getfield Field BISVHPUN c LPPOHBEGB;
L45:    putfield Field PPOHBEGB f LPPOHBEGB;
L48:    aload_0
L49:    getfield Field BISVHPUN c LPPOHBEGB;
L52:    aload_0
L53:    getfield Field BISVHPUN c LPPOHBEGB;
L56:    putfield Field PPOHBEGB g LPPOHBEGB;
L59:    return
L60:    astore_2
L61:    new java/lang/StringBuffer
L64:    dup
L65:    ldc "656, "
L67:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L70:    iload_1
L71:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L74:    ldc ", "
L76:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L79:    aload_2
L80:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L83:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L86:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L89:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L92:    new java/lang/RuntimeException
L95:    dup
L96:    invokespecial Method java/lang/RuntimeException <init> ()V
L99:    athrow
L100:   
    .end code
.end method

.method public a : (LPPOHBEGB;)V
    .code stack 2 locals 2
L0:     aload_1
L1:     getfield Field PPOHBEGB g LPPOHBEGB;
L4:     ifnull L11
L7:     aload_1
L8:     invokevirtual Method PPOHBEGB b ()V
L11:    aload_1
L12:    aload_0
L13:    getfield Field BISVHPUN c LPPOHBEGB;
L16:    getfield Field PPOHBEGB g LPPOHBEGB;
L19:    putfield Field PPOHBEGB g LPPOHBEGB;
L22:    aload_1
L23:    aload_0
L24:    getfield Field BISVHPUN c LPPOHBEGB;
L27:    putfield Field PPOHBEGB f LPPOHBEGB;
L30:    aload_1
L31:    getfield Field PPOHBEGB g LPPOHBEGB;
L34:    aload_1
L35:    putfield Field PPOHBEGB f LPPOHBEGB;
L38:    aload_1
L39:    getfield Field PPOHBEGB f LPPOHBEGB;
L42:    aload_1
L43:    putfield Field PPOHBEGB g LPPOHBEGB;
L46:    return
L47:    
    .end code
.end method

.method public a : ()LPPOHBEGB;
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field BISVHPUN c LPPOHBEGB;
L4:     getfield Field PPOHBEGB f LPPOHBEGB;
L7:     astore_1
L8:     aload_1
L9:     aload_0
L10:    getfield Field BISVHPUN c LPPOHBEGB;
L13:    if_acmpne L18
L16:    aconst_null
L17:    areturn
L18:    aload_1
L19:    invokevirtual Method PPOHBEGB b ()V
L22:    aload_1
L23:    areturn
L24:    
    .end code
.end method

.method public b : ()LPPOHBEGB;
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field BISVHPUN c LPPOHBEGB;
L4:     getfield Field PPOHBEGB f LPPOHBEGB;
L7:     astore_1
L8:     aload_1
L9:     aload_0
L10:    getfield Field BISVHPUN c LPPOHBEGB;
L13:    if_acmpne L23
L16:    aload_0
L17:    aconst_null
L18:    putfield Field BISVHPUN d LPPOHBEGB;
L21:    aconst_null
L22:    areturn
L23:    aload_0
L24:    aload_1
L25:    getfield Field PPOHBEGB f LPPOHBEGB;
L28:    putfield Field BISVHPUN d LPPOHBEGB;
L31:    aload_1
L32:    areturn
L33:    
    .end code
.end method

.method public a : (Z)LPPOHBEGB;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L42 using L42
L0:     iload_1
L1:     ifeq L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow
L12:    aload_0
L13:    getfield Field BISVHPUN d LPPOHBEGB;
L16:    astore_2
L17:    aload_2
L18:    aload_0
L19:    getfield Field BISVHPUN c LPPOHBEGB;
L22:    if_acmpne L32
L25:    aload_0
L26:    aconst_null
L27:    putfield Field BISVHPUN d LPPOHBEGB;
L30:    aconst_null
L31:    areturn
L32:    aload_0
L33:    aload_2
L34:    getfield Field PPOHBEGB f LPPOHBEGB;
L37:    putfield Field BISVHPUN d LPPOHBEGB;
L40:    aload_2
L41:    areturn
L42:    astore_2
L43:    new java/lang/StringBuffer
L46:    dup
L47:    ldc "42563, "
L49:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L52:    iload_1
L53:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L56:    ldc ", "
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    aload_2
L62:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L65:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L68:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L71:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L74:    new java/lang/RuntimeException
L77:    dup
L78:    invokespecial Method java/lang/RuntimeException <init> ()V
L81:    athrow
L82:    
    .end code
.end method

.method public c : ()I
    .code stack 3 locals 3
L0:     iconst_0
L1:     istore_1
L2:     aload_0
L3:     getfield Field BISVHPUN c LPPOHBEGB;
L6:     getfield Field PPOHBEGB f LPPOHBEGB;
L9:     astore_2
L10:    getstatic Field PPOHBEGB h I
L13:    ifeq L24
L16:    iinc 1 1
L19:    aload_2
L20:    getfield Field PPOHBEGB f LPPOHBEGB;
L23:    astore_2
L24:    aload_2
L25:    aload_0
L26:    getfield Field BISVHPUN c LPPOHBEGB;
L29:    if_acmpne L16
L32:    iload_1
L33:    ireturn
L34:    
    .end code
.end method
.end class
