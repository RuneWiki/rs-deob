.version 45 3
.class final super ha
.super ga
.implements java/awt/image/ImageProducer
.implements java/awt/image/ImageObserver
.field static i Ljava/awt/Frame;
.field private j Ljava/awt/image/ColorModel;
.field private k Ljava/awt/image/ImageConsumer;

.method public final synchronized removeConsumer : (Ljava/awt/image/ImageConsumer;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L13 using L16
L0:     aload_0
L1:     getfield Field ha k Ljava/awt/image/ImageConsumer;
L4:     aload_1
L5:     if_acmpne L13
L8:     aload_0
L9:     aconst_null
L10:    putfield Field ha k Ljava/awt/image/ImageConsumer;
L13:    goto L56
L16:    astore_2
L17:    aload_2
L18:    new java/lang/StringBuffer
L21:    dup
L22:    invokespecial Method java/lang/StringBuffer <init> ()V
L25:    ldc "ha.removeConsumer("
L27:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L30:    aload_1
L31:    ifnull L39
L34:    ldc "{...}"
L36:    goto L41
L39:    ldc "null"
L41:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L44:    bipush 41
L46:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L49:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L52:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L55:    athrow
L56:    return
L57:    
        .linenumbertable
            L0 4
            L8 5
            L13 9
            L16 7
            L17 8
            L56 10
        .end linenumbertable
    .end code
.end method

.method static final a : (ILjava/awt/event/KeyEvent;)I
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L28 using L48
L0:     bipush 122
L2:     iload_0
L3:     bipush 37
L5:     isub
L6:     bipush 54
L8:     idiv
L9:     idiv
L10:    istore_2
L11:    aload_1
L12:    invokevirtual Method java/awt/event/KeyEvent getKeyChar ()C
L15:    istore_3
L16:    iload_3
L17:    iconst_m1
L18:    ixor
L19:    sipush -8365
L22:    if_icmpne L29
L25:    sipush 128
L28:    ireturn
        .catch java/lang/RuntimeException from L29 to L47 using L48
L29:    iconst_0
L30:    iload_3
L31:    if_icmpge L44
L34:    sipush 256
L37:    iload_3
L38:    if_icmple L44
L41:    goto L46
L44:    iconst_m1
L45:    istore_3
L46:    iload_3
L47:    ireturn
L48:    astore_2
L49:    aload_2
L50:    new java/lang/StringBuffer
L53:    dup
L54:    invokespecial Method java/lang/StringBuffer <init> ()V
L57:    ldc "ha.G("
L59:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L62:    iload_0
L63:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L66:    bipush 44
L68:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L71:    aload_1
L72:    ifnull L80
L75:    ldc "{...}"
L77:    goto L82
L80:    ldc "null"
L82:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L85:    bipush 41
L87:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L90:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L93:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L96:    athrow
L97:    
        .linenumbertable
            L0 14
            L11 16
            L16 17
            L25 18
            L29 20
            L44 22
            L46 24
            L48 25
            L49 26
        .end linenumbertable
    .end code
.end method

.method static final a : ([BBI)I
    .code stack 4 locals 4
        .catch java/lang/RuntimeException from L0 to L8 using L18
L0:     iload_1
L1:     bipush 9
L3:     if_icmpge L9
L6:     bipush -90
L8:     ireturn
        .catch java/lang/RuntimeException from L9 to L17 using L18
L9:     aload_0
L10:    bipush 58
L12:    iload_2
L13:    iconst_0
L14:    invokestatic Method i a ([BIII)I
L17:    ireturn
L18:    astore_3
L19:    aload_3
L20:    new java/lang/StringBuffer
L23:    dup
L24:    invokespecial Method java/lang/StringBuffer <init> ()V
L27:    ldc "ha.F("
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L32:    aload_0
L33:    ifnull L41
L36:    ldc "{...}"
L38:    goto L43
L41:    ldc "null"
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    bipush 44
L48:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L51:    iload_1
L52:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L55:    bipush 44
L57:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L60:    iload_2
L61:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L64:    bipush 41
L66:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L69:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L72:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L75:    athrow
L76:    
        .linenumbertable
            L0 32
            L6 33
            L9 35
            L18 36
            L19 37
        .end linenumbertable
    .end code
.end method

.method public final synchronized addConsumer : (Ljava/awt/image/ImageConsumer;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L44 using L47
L0:     aload_0
L1:     aload_1
L2:     putfield Field ha k Ljava/awt/image/ImageConsumer;
L5:     aload_1
L6:     aload_0
L7:     getfield Field ga d I
L10:    aload_0
L11:    getfield Field ga e I
L14:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setDimensions (II)V 3
L19:    aload_1
L20:    aconst_null
L21:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setProperties (Ljava/util/Hashtable;)V 2
L26:    aload_1
L27:    aload_0
L28:    getfield Field ha j Ljava/awt/image/ColorModel;
L31:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setColorModel (Ljava/awt/image/ColorModel;)V 2
L36:    aload_1
L37:    bipush 14
L39:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setHints (I)V 2
L44:    goto L87
L47:    astore_2
L48:    aload_2
L49:    new java/lang/StringBuffer
L52:    dup
L53:    invokespecial Method java/lang/StringBuffer <init> ()V
L56:    ldc "ha.addConsumer("
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    aload_1
L62:    ifnull L70
L65:    ldc "{...}"
L67:    goto L72
L70:    ldc "null"
L72:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L75:    bipush 41
L77:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L80:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L83:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L86:    athrow
L87:    return
L88:    
        .linenumbertable
            L0 45
            L5 46
            L19 47
            L26 48
            L36 49
            L44 52
            L47 50
            L48 51
            L87 53
        .end linenumbertable
    .end code
.end method

.method private final synchronized b : (I)V
    .code stack 9 locals 3
        .catch java/lang/RuntimeException from L0 to L7 using L67
L0:     aload_0
L1:     getfield Field ha k Ljava/awt/image/ImageConsumer;
L4:     ifnonnull L8
L7:     return
        .catch java/lang/RuntimeException from L8 to L64 using L67
L8:     aload_0
L9:     getfield Field ha k Ljava/awt/image/ImageConsumer;
L12:    iconst_0
L13:    iconst_0
L14:    aload_0
L15:    getfield Field ga d I
L18:    aload_0
L19:    getfield Field ga e I
L22:    aload_0
L23:    getfield Field ha j Ljava/awt/image/ColorModel;
L26:    aload_0
L27:    getfield Field ga h [I
L30:    iconst_0
L31:    aload_0
L32:    getfield Field ga d I
L35:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer setPixels (IIIILjava/awt/image/ColorModel;[III)V 9
L40:    iload_1
L41:    bipush 14
L43:    if_icmpeq L54
L46:    aload_0
L47:    aconst_null
L48:    checkcast java/awt/image/ImageConsumer
L51:    invokevirtual Method ha addConsumer (Ljava/awt/image/ImageConsumer;)V
L54:    aload_0
L55:    getfield Field ha k Ljava/awt/image/ImageConsumer;
L58:    iconst_2
L59:    invokeinterface InterfaceMethod java/awt/image/ImageConsumer imageComplete (I)V 2
L64:    goto L97
L67:    astore_2
L68:    aload_2
L69:    new java/lang/StringBuffer
L72:    dup
L73:    invokespecial Method java/lang/StringBuffer <init> ()V
L76:    ldc "ha.B("
L78:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L81:    iload_1
L82:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L85:    bipush 41
L87:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L90:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L93:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L96:    athrow
L97:    return
L98:    
        .linenumbertable
            L0 57
            L7 58
            L8 60
            L40 61
            L46 62
            L54 64
            L64 67
            L67 65
            L68 66
            L97 68
        .end linenumbertable
    .end code
.end method

.method public static c : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L15 using L18
L0:     bipush -15
L2:     bipush 58
L4:     iload_0
L5:     isub
L6:     bipush 61
L8:     idiv
L9:     irem
L10:    istore_1
L11:    aconst_null
L12:    putstatic Field ha i Ljava/awt/Frame;
L15:    goto L48
L18:    astore_1
L19:    aload_1
L20:    new java/lang/StringBuffer
L23:    dup
L24:    invokespecial Method java/lang/StringBuffer <init> ()V
L27:    ldc "ha.C("
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L32:    iload_0
L33:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L36:    bipush 41
L38:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L41:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L44:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L47:    athrow
L48:    return
L49:    
        .linenumbertable
            L0 72
            L11 73
            L15 76
            L18 74
            L19 75
            L48 77
        .end linenumbertable
    .end code
.end method

.method public final requestTopDownLeftRightResend : (Ljava/awt/image/ImageConsumer;)V
    .code stack 0 locals 2
L0:     return
L1:     
        .linenumbertable
            L0 79
        .end linenumbertable
    .end code
.end method

.method public final imageUpdate : (Ljava/awt/Image;IIIII)Z
    .code stack 3 locals 8
        .catch java/lang/RuntimeException from L0 to L1 using L2
L0:     iconst_1
L1:     ireturn
L2:     astore 7
L4:     aload 7
L6:     new java/lang/StringBuffer
L9:     dup
L10:    invokespecial Method java/lang/StringBuffer <init> ()V
L13:    ldc "ha.imageUpdate("
L15:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L18:    aload_1
L19:    ifnull L27
L22:    ldc "{...}"
L24:    goto L29
L27:    ldc "null"
L29:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L32:    bipush 44
L34:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L37:    iload_2
L38:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L41:    bipush 44
L43:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L46:    iload_3
L47:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L50:    bipush 44
L52:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L55:    iload 4
L57:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L60:    bipush 44
L62:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L65:    iload 5
L67:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L70:    bipush 44
L72:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L75:    iload 6
L77:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L80:    bipush 41
L82:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L85:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L88:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L91:    athrow
L92:    
        .linenumbertable
            L0 84
            L2 85
            L4 86
        .end linenumbertable
    .end code
.end method

.method public final startProduction : (Ljava/awt/image/ImageConsumer;)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L5 using L8
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method ha addConsumer (Ljava/awt/image/ImageConsumer;)V
L5:     goto L48
L8:     astore_2
L9:     aload_2
L10:    new java/lang/StringBuffer
L13:    dup
L14:    invokespecial Method java/lang/StringBuffer <init> ()V
L17:    ldc "ha.startProduction("
L19:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L22:    aload_1
L23:    ifnull L31
L26:    ldc "{...}"
L28:    goto L33
L31:    ldc "null"
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    bipush 41
L38:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L41:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L44:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L47:    athrow
L48:    return
L49:    
        .linenumbertable
            L0 92
            L5 95
            L8 93
            L9 94
            L48 96
        .end linenumbertable
    .end code
.end method

.method final a : (IILjava/awt/Graphics;I)V
    .code stack 5 locals 6
        .catch java/lang/RuntimeException from L0 to L32 using L35
L0:     aload_0
L1:     bipush 14
L3:     invokespecial Method ha b (I)V
L6:     iload_2
L7:     sipush 17932
L10:    if_icmpeq L19
L13:    aload_0
L14:    bipush 65
L16:    invokespecial Method ha b (I)V
L19:    aload_3
L20:    aload_0
L21:    getfield Field ga c Ljava/awt/Image;
L24:    iload 4
L26:    iload_1
L27:    aload_0
L28:    invokevirtual Method java/awt/Graphics drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
L31:    pop
L32:    goto L105
L35:    astore 5
L37:    aload 5
L39:    new java/lang/StringBuffer
L42:    dup
L43:    invokespecial Method java/lang/StringBuffer <init> ()V
L46:    ldc "ha.D("
L48:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L51:    iload_1
L52:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L55:    bipush 44
L57:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L60:    iload_2
L61:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L64:    bipush 44
L66:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L69:    aload_3
L70:    ifnull L78
L73:    ldc "{...}"
L75:    goto L80
L78:    ldc "null"
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    bipush 44
L85:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L88:    iload 4
L90:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L93:    bipush 41
L95:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L98:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L101:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L104:   athrow
L105:   return
L106:   
        .linenumbertable
            L0 102
            L6 103
            L13 104
            L19 106
            L32 109
            L35 107
            L37 108
            L105 110
        .end linenumbertable
    .end code
.end method

.method static final d : (I)I
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L16 using L17
L0:     iload_0
L1:     sipush -12118
L4:     if_icmpeq L14
L7:     aconst_null
L8:     checkcast java/awt/Frame
L11:    putstatic Field ha i Ljava/awt/Frame;
L14:    ldc 8282943
L16:    ireturn
L17:    astore_1
L18:    aload_1
L19:    new java/lang/StringBuffer
L22:    dup
L23:    invokespecial Method java/lang/StringBuffer <init> ()V
L26:    ldc "ha.A("
L28:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L31:    iload_0
L32:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L35:    bipush 41
L37:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L46:    athrow
L47:    
        .linenumbertable
            L0 113
            L7 114
            L14 116
            L17 117
            L18 118
        .end linenumbertable
    .end code
.end method

.method final a : (ILjava/awt/Component;BI)V
    .code stack 7 locals 6
        .catch java/lang/RuntimeException from L0 to L29 using L118
L0:     aload_0
L1:     iconst_1
L2:     iload_1
L3:     iload 4
L5:     imul
L6:     iadd
L7:     newarray int
L9:     putfield Field ga h [I
L12:    aload_0
L13:    iload 4
L15:    putfield Field ga d I
L18:    aload_0
L19:    iload_1
L20:    putfield Field ga e I
L23:    iload_3
L24:    bipush -14
L26:    if_icmpeq L30
L29:    return
        .catch java/lang/RuntimeException from L30 to L115 using L118
L30:    aload_0
L31:    new java/awt/image/DirectColorModel
L34:    dup
L35:    bipush 32
L37:    ldc 16711680
L39:    ldc 65280
L41:    sipush 255
L44:    invokespecial Method java/awt/image/DirectColorModel <init> (IIII)V
L47:    putfield Field ha j Ljava/awt/image/ColorModel;
L50:    aload_0
L51:    aload_2
L52:    aload_0
L53:    invokevirtual Method java/awt/Component createImage (Ljava/awt/image/ImageProducer;)Ljava/awt/Image;
L56:    putfield Field ga c Ljava/awt/Image;
L59:    aload_0
L60:    bipush 14
L62:    invokespecial Method ha b (I)V
L65:    aload_2
L66:    aload_0
L67:    getfield Field ga c Ljava/awt/Image;
L70:    aload_0
L71:    invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L74:    pop
L75:    aload_0
L76:    bipush 14
L78:    invokespecial Method ha b (I)V
L81:    aload_2
L82:    aload_0
L83:    getfield Field ga c Ljava/awt/Image;
L86:    aload_0
L87:    invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L90:    pop
L91:    aload_0
L92:    iload_3
L93:    bipush -4
L95:    ixor
L96:    invokespecial Method ha b (I)V
L99:    aload_2
L100:   aload_0
L101:   getfield Field ga c Ljava/awt/Image;
L104:   aload_0
L105:   invokevirtual Method java/awt/Component prepareImage (Ljava/awt/Image;Ljava/awt/image/ImageObserver;)Z
L108:   pop
L109:   aload_0
L110:   bipush 94
L112:   invokevirtual Method ga a (I)V
L115:   goto L188
L118:   astore 5
L120:   aload 5
L122:   new java/lang/StringBuffer
L125:   dup
L126:   invokespecial Method java/lang/StringBuffer <init> ()V
L129:   ldc "ha.E("
L131:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L134:   iload_1
L135:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L138:   bipush 44
L140:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L143:   aload_2
L144:   ifnull L152
L147:   ldc "{...}"
L149:   goto L154
L152:   ldc "null"
L154:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L157:   bipush 44
L159:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L162:   iload_3
L163:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L166:   bipush 44
L168:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L171:   iload 4
L173:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L176:   bipush 41
L178:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L181:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L184:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L187:   athrow
L188:   return
L189:   
        .linenumbertable
            L0 123
            L12 124
            L18 125
            L23 126
            L29 127
            L30 129
            L50 130
            L59 131
            L65 132
            L75 133
            L81 134
            L91 135
            L99 136
            L109 137
            L115 140
            L118 138
            L120 139
            L188 141
        .end linenumbertable
    .end code
.end method

.method public final synchronized isConsumer : (Ljava/awt/image/ImageConsumer;)Z
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L13 using L14
L0:     aload_0
L1:     getfield Field ha k Ljava/awt/image/ImageConsumer;
L4:     aload_1
L5:     if_acmpne L12
L8:     iconst_1
L9:     goto L13
L12:    iconst_0
L13:    ireturn
L14:    astore_2
L15:    aload_2
L16:    new java/lang/StringBuffer
L19:    dup
L20:    invokespecial Method java/lang/StringBuffer <init> ()V
L23:    ldc "ha.isConsumer("
L25:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L28:    aload_1
L29:    ifnull L37
L32:    ldc "{...}"
L34:    goto L39
L37:    ldc "null"
L39:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L42:    bipush 41
L44:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L47:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L50:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L53:    athrow
L54:    
        .linenumbertable
            L0 148
            L14 149
            L15 150
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method ga <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 158
            L4 159
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 0 locals 0
L0:     return
L1:     
        .linenumbertable
            L0 157
        .end linenumbertable
    .end code
.end method
.sourcefile "ha.java"
.end class
