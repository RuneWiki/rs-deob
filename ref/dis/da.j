.version 45 3
.class final super da
.super java/lang/Object
.field static a Lsa;
.field static b Ljava/io/DataInputStream;
.field static c I
.field static volatile d Z

.method static final synchronized a : (BI)[B
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L41 using L135
L0:     iload_1
L1:     bipush 100
L3:     if_icmpne L42
L6:     getstatic Field ua d I
L9:     iconst_m1
L10:    ixor
L11:    iconst_m1
L12:    if_icmplt L18
L15:    goto L42
L18:    getstatic Field e g [[B
L21:    getstatic Field ua d I
L24:    iconst_1
L25:    isub
L26:    dup
L27:    putstatic Field ua d I
L30:    aaload
L31:    astore_2
L32:    getstatic Field e g [[B
L35:    getstatic Field ua d I
L38:    aconst_null
L39:    aastore
L40:    aload_2
L41:    areturn
        .catch java/lang/RuntimeException from L42 to L90 using L135
L42:    iload_0
L43:    iflt L51
L46:    bipush -123
L48:    putstatic Field da c I
L51:    iload_1
L52:    sipush 5000
L55:    if_icmpne L91
L58:    iconst_m1
L59:    getstatic Field d b I
L62:    iconst_m1
L63:    ixor
L64:    if_icmple L91
L67:    getstatic Field p l [[B
L70:    getstatic Field d b I
L73:    iconst_1
L74:    isub
L75:    dup
L76:    putstatic Field d b I
L79:    aaload
L80:    astore_2
L81:    getstatic Field p l [[B
L84:    getstatic Field d b I
L87:    aconst_null
L88:    aastore
L89:    aload_2
L90:    areturn
        .catch java/lang/RuntimeException from L91 to L130 using L135
L91:    iload_1
L92:    sipush 30000
L95:    if_icmpne L131
L98:    getstatic Field v c I
L101:   ifgt L107
L104:   goto L131
L107:   getstatic Field ua a [[B
L110:   getstatic Field v c I
L113:   iconst_1
L114:   isub
L115:   dup
L116:   putstatic Field v c I
L119:   aaload
L120:   astore_2
L121:   getstatic Field ua a [[B
L124:   getstatic Field v c I
L127:   aconst_null
L128:   aastore
L129:   aload_2
L130:   areturn
        .catch java/lang/RuntimeException from L131 to L134 using L135
L131:   iload_1
L132:   newarray byte
L134:   areturn
L135:   astore_2
L136:   aload_2
L137:   new java/lang/StringBuffer
L140:   dup
L141:   invokespecial Method java/lang/StringBuffer <init> ()V
L144:   ldc "da.C("
L146:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L149:   iload_0
L150:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L153:   bipush 44
L155:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L158:   iload_1
L159:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L162:   bipush 41
L164:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L167:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L170:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L173:   athrow
L174:   
        .linenumbertable
            L0 7
            L18 11
            L32 12
            L40 13
            L42 16
            L46 17
            L51 19
            L67 22
            L81 23
            L89 24
            L91 27
            L107 31
            L121 32
            L129 33
            L131 36
            L135 37
            L136 38
        .end linenumbertable
    .end code
.end method

.method public static a : (Z)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L19 using L22
L0:     iload_0
L1:     ifeq L11
L4:     aconst_null
L5:     checkcast java/io/DataInputStream
L8:     putstatic Field da b Ljava/io/DataInputStream;
L11:    aconst_null
L12:    putstatic Field da b Ljava/io/DataInputStream;
L15:    aconst_null
L16:    putstatic Field da a Lsa;
L19:    goto L52
L22:    astore_1
L23:    aload_1
L24:    new java/lang/StringBuffer
L27:    dup
L28:    invokespecial Method java/lang/StringBuffer <init> ()V
L31:    ldc "da.B("
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    iload_0
L37:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L40:    bipush 41
L42:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L45:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L48:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L51:    athrow
L52:    return
L53:    
        .linenumbertable
            L0 60
            L4 61
            L11 63
            L15 64
            L19 67
            L22 65
            L23 66
            L52 68
        .end linenumbertable
    .end code
.end method

.method static final a : (IZ)I
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L26 using L27
L0:     iload_1
L1:     iconst_1
L2:     if_icmpeq L12
L5:     bipush -125
L7:     iconst_1
L8:     invokestatic Method da a (IZ)I
L11:    pop
L12:    ldc2_w 1e-2
L15:    iload_0
L16:    i2d
L17:    dmul
L18:    invokestatic Method java/lang/Math cos (D)D
L21:    ldc2_w 1e1
L24:    dmul
L25:    d2i
L26:    ireturn
L27:    astore_2
L28:    aload_2
L29:    new java/lang/StringBuffer
L32:    dup
L33:    invokespecial Method java/lang/StringBuffer <init> ()V
L36:    ldc "da.A("
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    iload_0
L42:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L45:    bipush 44
L47:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L50:    iload_1
L51:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L54:    bipush 41
L56:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L59:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L62:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L65:    athrow
L66:    
        .linenumbertable
            L0 72
            L5 73
            L12 75
            L27 76
            L28 77
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     iconst_0
L1:     putstatic Field da c I
L4:     bipush 20
L6:     bipush 26
L8:     invokestatic Method ab a (IB)Lsa;
L11:    putstatic Field da a Lsa;
L14:    iconst_1
L15:    putstatic Field da d Z
L18:    return
L19:    
        .linenumbertable
            L0 54
            L4 82
            L14 92
            L18 93
        .end linenumbertable
    .end code
.end method
.sourcefile "da.java"
.end class
