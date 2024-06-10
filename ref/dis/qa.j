.version 45 3
.class final super qa
.super java/awt/Canvas
.field private a Ljava/awt/Component;
.field static b F
.field static c Z
.field static d Z

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L8 using L11
L0:     aload_0
L1:     getfield Field qa a Ljava/awt/Component;
L4:     aload_1
L5:     invokevirtual Method java/awt/Component update (Ljava/awt/Graphics;)V
L8:     goto L51
L11:    astore_2
L12:    aload_2
L13:    new java/lang/StringBuffer
L16:    dup
L17:    invokespecial Method java/lang/StringBuffer <init> ()V
L20:    ldc "qa.update("
L22:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L25:    aload_1
L26:    ifnull L34
L29:    ldc "{...}"
L31:    goto L36
L34:    ldc "null"
L36:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L39:    bipush 41
L41:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L44:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L47:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L50:    athrow
L51:    return
L52:    
        .linenumbertable
            L0 9
            L8 12
            L11 10
            L12 11
            L51 13
        .end linenumbertable
    .end code
.end method

.method static final a : (B)V
    .code stack 3 locals 3
L0:     iload_0
L1:     bipush -26
L3:     if_icmplt L11
L6:     ldc 3.1640977e-1f
L8:     putstatic Field qa b F
L11:    getstatic Field ca d Lma;
L14:    ifnonnull L20
L17:    goto L40
L20:    getstatic Field ca d Lma;
L23:    dup
L24:    astore_1
L25:    monitorenter
        .catch [0] from L26 to L32 using L35
L26:    aconst_null
L27:    putstatic Field ca d Lma;
L30:    aload_1
L31:    monitorexit
L32:    goto L40
        .catch [0] from L35 to L38 using L35
        .catch java/lang/RuntimeException from L0 to L40 using L43
L35:    astore_2
L36:    aload_1
L37:    monitorexit
L38:    aload_2
L39:    athrow
L40:    goto L73
L43:    astore_1
L44:    aload_1
L45:    new java/lang/StringBuffer
L48:    dup
L49:    invokespecial Method java/lang/StringBuffer <init> ()V
L52:    ldc "qa.B("
L54:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L57:    iload_0
L58:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L61:    bipush 41
L63:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L66:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L69:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L72:    athrow
L73:    return
L74:    
        .linenumbertable
            L0 22
            L6 23
            L11 25
            L20 28
            L26 29
            L30 30
            L40 35
            L43 33
            L44 34
            L73 36
        .end linenumbertable
    .end code
.end method

.method static final a : (JZ)V
    .code stack 7 locals 4
        .catch java/lang/RuntimeException from L0 to L15 using L66
L0:     lload_0
L1:     ldc2_w -1L
L4:     lxor
L5:     ldc2_w -1L
L8:     lcmp
L9:     ifge L15
L12:    goto L16
L15:    return
        .catch java/lang/RuntimeException from L16 to L63 using L66
L16:    lconst_0
L17:    lload_0
L18:    ldc2_w 10L
L21:    lrem
L22:    lcmp
L23:    ifeq L38
L26:    lload_0
L27:    bipush 124
L29:    invokestatic Method bb a (JI)V
L32:    getstatic Field loginapplet o I
L35:    ifeq L54
L38:    lload_0
L39:    ldc2_w -1L
L42:    ladd
L43:    bipush 126
L45:    invokestatic Method bb a (JI)V
L48:    lconst_1
L49:    bipush 88
L51:    invokestatic Method bb a (JI)V
L54:    iload_2
L55:    ifeq L63
L58:    bipush -122
L60:    invokestatic Method qa a (B)V
L63:    goto L105
L66:    astore_3
L67:    aload_3
L68:    new java/lang/StringBuffer
L71:    dup
L72:    invokespecial Method java/lang/StringBuffer <init> ()V
L75:    ldc "qa.A("
L77:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L80:    lload_0
L81:    invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L84:    bipush 44
L86:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L89:    iload_2
L90:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L93:    bipush 41
L95:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L98:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L101:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L104:   athrow
L105:   return
L106:   
        .linenumbertable
            L0 43
            L15 45
            L16 47
            L26 48
            L38 51
            L48 52
            L54 55
            L58 56
            L63 60
            L66 58
            L67 59
            L105 61
        .end linenumbertable
    .end code
.end method

.method <init> : (Ljava/awt/Component;)V
    .code stack 3 locals 3
L0:     aload_0
L1:     invokespecial Method java/awt/Canvas <init> ()V
        .catch java/lang/RuntimeException from L4 to L9 using L12
L4:     aload_0
L5:     aload_1
L6:     putfield Field qa a Ljava/awt/Component;
L9:     goto L52
L12:    astore_2
L13:    aload_2
L14:    new java/lang/StringBuffer
L17:    dup
L18:    invokespecial Method java/lang/StringBuffer <init> ()V
L21:    ldc "qa.<init>("
L23:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L26:    aload_1
L27:    ifnull L35
L30:    ldc "{...}"
L32:    goto L37
L35:    ldc "null"
L37:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L40:    bipush 41
L42:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L45:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L48:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L51:    athrow
L52:    return
L53:    
        .linenumbertable
            L0 62
            L4 64
            L9 67
            L12 65
            L13 66
            L52 68
        .end linenumbertable
    .end code
.end method

.method public final paint : (Ljava/awt/Graphics;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L8 using L11
L0:     aload_0
L1:     getfield Field qa a Ljava/awt/Component;
L4:     aload_1
L5:     invokevirtual Method java/awt/Component paint (Ljava/awt/Graphics;)V
L8:     goto L51
L11:    astore_2
L12:    aload_2
L13:    new java/lang/StringBuffer
L16:    dup
L17:    invokespecial Method java/lang/StringBuffer <init> ()V
L20:    ldc "qa.paint("
L22:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L25:    aload_1
L26:    ifnull L34
L29:    ldc "{...}"
L31:    goto L36
L34:    ldc "null"
L36:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L39:    bipush 41
L41:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L44:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L47:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L50:    athrow
L51:    return
L52:    
        .linenumbertable
            L0 80
            L8 83
            L11 81
            L12 82
            L51 84
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field qa d Z
L4:     iconst_0
L5:     putstatic Field qa c Z
L8:     return
L9:     
        .linenumbertable
            L0 74
            L4 88
            L8 89
        .end linenumbertable
    .end code
.end method
.sourcefile "qa.java"
.end class
