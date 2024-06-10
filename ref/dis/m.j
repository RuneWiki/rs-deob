.version 45 3
.class final super m
.super java/lang/Object
.field static a Lsa;
.field static b Lsa;
.field static c Lsa;
.field static volatile d I

.method static final a : (ILjava/awt/Component;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L32 using L35
L0:     aload_1
L1:     getstatic Field f t Lo;
L4:     invokevirtual Method java/awt/Component removeMouseListener (Ljava/awt/event/MouseListener;)V
L7:     aload_1
L8:     getstatic Field f t Lo;
L11:    invokevirtual Method java/awt/Component removeMouseMotionListener (Ljava/awt/event/MouseMotionListener;)V
L14:    aload_1
L15:    getstatic Field f t Lo;
L18:    invokevirtual Method java/awt/Component removeFocusListener (Ljava/awt/event/FocusListener;)V
L21:    iload_0
L22:    bipush 12
L24:    if_icmpeq L32
L27:    bipush -69
L29:    putstatic Field m d I
L32:    goto L84
L35:    astore_2
L36:    aload_2
L37:    new java/lang/StringBuffer
L40:    dup
L41:    invokespecial Method java/lang/StringBuffer <init> ()V
L44:    ldc "m.D("
L46:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L49:    iload_0
L50:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L53:    bipush 44
L55:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L58:    aload_1
L59:    ifnull L67
L62:    ldc "{...}"
L64:    goto L69
L67:    ldc "null"
L69:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L72:    bipush 41
L74:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L77:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L80:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L83:    athrow
L84:    return
L85:    
        .linenumbertable
            L0 4
            L7 5
            L14 6
            L21 9
            L27 10
            L32 14
            L35 12
            L36 13
            L84 15
        .end linenumbertable
    .end code
.end method

.method static final a : (ZI)I
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L26 using L27
L0:     iload_0
L1:     iconst_1
L2:     if_icmpeq L12
L5:     aconst_null
L6:     checkcast sa
L9:     putstatic Field m a Lsa;
L12:    ldc2_w 1e-2
L15:    iload_1
L16:    i2d
L17:    dmul
L18:    invokestatic Method java/lang/Math sin (D)D
L21:    ldc2_w 1e1
L24:    dmul
L25:    d2i
L26:    ireturn
L27:    astore_2
L28:    aload_2
L29:    new java/lang/StringBuffer
L32:    dup
L33:    invokespecial Method java/lang/StringBuffer <init> ()V
L36:    ldc "m.C("
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    iload_0
L42:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L45:    bipush 44
L47:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L50:    iload_1
L51:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L54:    bipush 41
L56:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L59:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L62:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L65:    athrow
L66:    
        .linenumbertable
            L0 23
            L5 24
            L12 26
            L27 27
            L28 28
        .end linenumbertable
    .end code
.end method

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L22 using L25
L0:     bipush -43
L2:     iload_0
L3:     iconst_m1
L4:     isub
L5:     bipush 46
L7:     idiv
L8:     idiv
L9:     istore_1
L10:    aconst_null
L11:    putstatic Field m b Lsa;
L14:    aconst_null
L15:    putstatic Field m c Lsa;
L18:    aconst_null
L19:    putstatic Field m a Lsa;
L22:    goto L55
L25:    astore_1
L26:    aload_1
L27:    new java/lang/StringBuffer
L30:    dup
L31:    invokespecial Method java/lang/StringBuffer <init> ()V
L34:    ldc "m.E("
L36:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L39:    iload_0
L40:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L43:    bipush 41
L45:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L48:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L51:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L54:    athrow
L55:    return
L56:    
        .linenumbertable
            L0 36
            L10 37
            L14 38
            L18 39
            L22 42
            L25 40
            L26 41
            L55 43
        .end linenumbertable
    .end code
.end method

.method static final a : (BIILjava/awt/Component;)Lga;
    .code stack 5 locals 6
        .catch java/lang/Throwable from L0 to L42 using L43
        .catch java/lang/RuntimeException from L0 to L42 using L67
L0:     ldc "q"
L2:     invokestatic Method java/lang/Class forName (Ljava/lang/String;)Ljava/lang/Class;
L5:     astore 4
L7:     aload 4
L9:     invokevirtual Method java/lang/Class newInstance ()Ljava/lang/Object;
L12:    checkcast ga
L15:    astore 5
L17:    aload 5
L19:    iload_1
L20:    aload_3
L21:    bipush -14
L23:    iload_2
L24:    invokevirtual Method ga a (ILjava/awt/Component;BI)V
L27:    iload_0
L28:    bipush 52
L30:    if_icmpgt L40
L33:    aconst_null
L34:    checkcast sa
L37:    putstatic Field m b Lsa;
L40:    aload 5
L42:    areturn
        .catch java/lang/RuntimeException from L43 to L66 using L67
L43:    astore 4
L45:    new ha
L48:    dup
L49:    invokespecial Method ha <init> ()V
L52:    astore 5
L54:    aload 5
L56:    iload_1
L57:    aload_3
L58:    bipush -14
L60:    iload_2
L61:    invokevirtual Method ga a (ILjava/awt/Component;BI)V
L64:    aload 5
L66:    areturn
L67:    astore 4
L69:    aload 4
L71:    new java/lang/StringBuffer
L74:    dup
L75:    invokespecial Method java/lang/StringBuffer <init> ()V
L78:    ldc "m.A("
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    iload_0
L84:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L87:    bipush 44
L89:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L92:    iload_1
L93:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L96:    bipush 44
L98:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L101:   iload_2
L102:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L105:   bipush 44
L107:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L110:   aload_3
L111:   ifnull L119
L114:   ldc "{...}"
L116:   goto L121
L119:   ldc "null"
L121:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L124:   bipush 41
L126:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L129:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L132:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L135:   athrow
L136:   
        .linenumbertable
            L0 56
            L7 58
            L17 59
            L27 60
            L33 61
            L40 63
            L43 64
            L45 66
            L54 67
            L64 68
            L67 70
            L69 71
        .end linenumbertable
    .end code
.end method

.method static final a : (Ljava/lang/Throwable;Ljava/lang/String;)La;
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L56 using L57
L0:     aload_0
L1:     instanceof a
L4:     ifeq L45
L7:     aload_0
L8:     checkcast a
L11:    astore_2
L12:    new java/lang/StringBuffer
L15:    dup
L16:    invokespecial Method java/lang/StringBuffer <init> ()V
L19:    aload_2
L20:    dup_x1
L21:    getfield Field a a Ljava/lang/String;
L24:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L27:    bipush 32
L29:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L32:    aload_1
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L39:    putfield Field a a Ljava/lang/String;
L42:    goto L55
L45:    new a
L48:    dup
L49:    aload_0
L50:    aload_1
L51:    invokespecial Method a <init> (Ljava/lang/Throwable;Ljava/lang/String;)V
L54:    astore_2
L55:    aload_2
L56:    areturn
L57:    astore_2
L58:    aload_2
L59:    athrow
L60:    
        .linenumbertable
            L0 87
            L7 89
            L12 90
            L45 93
            L55 95
            L57 96
            L58 97
        .end linenumbertable
    .end code
.end method

.method static final a : (FFIFFFF)F
    .code stack 5 locals 12
        .catch java/lang/RuntimeException from L0 to L74 using L75
L0:     iload_2
L1:     sipush -10343
L4:     if_icmpeq L14
L7:     aconst_null
L8:     checkcast sa
L11:    putstatic Field m b Lsa;
L14:    fload 4
L16:    fload_1
L17:    fsub
L18:    fstore 7
L20:    fload_0
L21:    fload_3
L22:    iconst_0
L23:    fload_0
L24:    fload_3
L25:    invokestatic Method i a (FFZFF)F
L28:    fstore 9
L30:    fload 5
L32:    fload 6
L34:    fsub
L35:    fstore 8
L37:    fload 7
L39:    fload 8
L41:    iconst_0
L42:    fload 7
L44:    fload 8
L46:    invokestatic Method i a (FFZFF)F
L49:    fstore 10
L51:    fload 7
L53:    fload_3
L54:    iconst_0
L55:    fload_0
L56:    fload 8
L58:    invokestatic Method i a (FFZFF)F
L61:    fstore 11
L63:    fload 10
L65:    fload 11
L67:    fload 11
L69:    fmul
L70:    fload 9
L72:    fdiv
L73:    fsub
L74:    freturn
L75:    astore 7
L77:    aload 7
L79:    new java/lang/StringBuffer
L82:    dup
L83:    invokespecial Method java/lang/StringBuffer <init> ()V
L86:    ldc "m.F("
L88:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L91:    fload_0
L92:    invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L95:    bipush 44
L97:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L100:   fload_1
L101:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L104:   bipush 44
L106:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L109:   iload_2
L110:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L113:   bipush 44
L115:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L118:   fload_3
L119:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L122:   bipush 44
L124:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L127:   fload 4
L129:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L132:   bipush 44
L134:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L137:   fload 5
L139:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L142:   bipush 44
L144:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L147:   fload 6
L149:   invokevirtual Method java/lang/StringBuffer append (F)Ljava/lang/StringBuffer;
L152:   bipush 41
L154:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L157:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L160:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L163:   athrow
L164:   
        .linenumbertable
            L0 109
            L7 110
            L14 114
            L20 116
            L30 117
            L37 119
            L51 121
            L63 122
            L75 123
            L77 124
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     bipush 12
L2:     bipush -120
L4:     invokestatic Method ab a (IB)Lsa;
L7:     putstatic Field m a Lsa;
L10:    getstatic Field m a Lsa;
L13:    putstatic Field m b Lsa;
L16:    iconst_0
L17:    putstatic Field m d I
L20:    bipush -92
L22:    ldc "box_left_plain"
L24:    invokestatic Method ca a (ILjava/lang/String;)Lsa;
L27:    putstatic Field m c Lsa;
L30:    return
L31:    
        .linenumbertable
            L0 81
            L10 128
            L16 132
            L20 135
            L30 136
        .end linenumbertable
    .end code
.end method
.sourcefile "m.java"
.end class
