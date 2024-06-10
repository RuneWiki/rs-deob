.version 45 3
.class final super v
.super java/lang/Object
.field static a Ljava/util/Random;
.field static b Lsa;
.field static c I
.field static d I
.field private e [I

.method final a : (II)I
    .code stack 3 locals 6
        .catch java/lang/RuntimeException from L0 to L58 using L80
L0:     aload_0
L1:     getfield Field v e [I
L4:     arraylength
L5:     iconst_2
L6:     isub
L7:     istore_3
L8:     iload_2
L9:     bipush 93
L11:    if_icmpge L23
L14:    aload_0
L15:    bipush 123
L17:    bipush 36
L19:    invokevirtual Method v a (II)I
L22:    pop
L23:    iload_1
L24:    ldc 877319201
L26:    ishl
L27:    iload_3
L28:    iand
L29:    istore 4
L31:    aload_0
L32:    getfield Field v e [I
L35:    iload 4
L37:    iaload
L38:    istore 5
L40:    iload_1
L41:    iload 5
L43:    if_icmpeq L49
L46:    goto L59
L49:    aload_0
L50:    getfield Field v e [I
L53:    iload 4
L55:    iconst_m1
L56:    isub
L57:    iaload
L58:    ireturn
        .catch java/lang/RuntimeException from L59 to L68 using L80
L59:    iconst_0
L60:    iload 5
L62:    iconst_m1
L63:    ixor
L64:    if_icmpne L69
L67:    iconst_m1
L68:    ireturn
        .catch java/lang/RuntimeException from L69 to L80 using L80
L69:    iload 4
L71:    iconst_2
L72:    iadd
L73:    iload_3
L74:    iand
L75:    istore 4
L77:    goto L31
L80:    astore_3
L81:    aload_3
L82:    new java/lang/StringBuffer
L85:    dup
L86:    invokespecial Method java/lang/StringBuffer <init> ()V
L89:    ldc "v.C("
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    iload_1
L95:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L98:    bipush 44
L100:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L103:   iload_2
L104:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L107:   bipush 41
L109:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L112:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L115:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L118:   athrow
L119:   
        .linenumbertable
            L0 27
            L8 28
            L14 29
            L23 32
            L31 36
            L40 37
            L49 39
            L59 41
            L67 42
            L69 44
            L77 45
            L80 47
            L81 48
        .end linenumbertable
    .end code
.end method

.method static final a : ([BI)[B
    .code stack 5 locals 4
        .catch java/lang/RuntimeException from L0 to L32 using L33
L0:     iload_1
L1:     ldc 877319201
L3:     if_icmpeq L16
L6:     aconst_null
L7:     checkcast [B
L10:    bipush -100
L12:    invokestatic Method v a ([BI)[B
L15:    pop
L16:    aload_0
L17:    arraylength
L18:    istore_2
L19:    iload_2
L20:    newarray byte
L22:    astore_3
L23:    aload_0
L24:    iconst_0
L25:    aload_3
L26:    iconst_0
L27:    iload_2
L28:    invokestatic Method va a ([BI[BII)V
L31:    aload_3
L32:    areturn
L33:    astore_2
L34:    aload_2
L35:    new java/lang/StringBuffer
L38:    dup
L39:    invokespecial Method java/lang/StringBuffer <init> ()V
L42:    ldc "v.A("
L44:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L47:    aload_0
L48:    ifnull L56
L51:    ldc "{...}"
L53:    goto L58
L56:    ldc "null"
L58:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L61:    bipush 44
L63:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L66:    iload_1
L67:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L70:    bipush 41
L72:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L75:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L78:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L81:    athrow
L82:    
        .linenumbertable
            L0 57
            L6 58
            L16 60
            L19 62
            L23 63
            L31 64
            L33 65
            L34 66
        .end linenumbertable
    .end code
.end method

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L19 using L22
L0:     aconst_null
L1:     putstatic Field v b Lsa;
L4:     aconst_null
L5:     putstatic Field v a Ljava/util/Random;
L8:     iload_0
L9:     ifeq L19
L12:    aconst_null
L13:    checkcast sa
L16:    putstatic Field v b Lsa;
L19:    goto L52
L22:    astore_1
L23:    aload_1
L24:    new java/lang/StringBuffer
L27:    dup
L28:    invokespecial Method java/lang/StringBuffer <init> ()V
L31:    ldc "v.B("
L33:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L36:    iload_0
L37:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L40:    bipush 41
L42:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L45:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L48:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L51:    athrow
L52:    return
L53:    
        .linenumbertable
            L0 71
            L4 72
            L8 73
            L12 74
            L19 78
            L22 76
            L23 77
            L52 79
        .end linenumbertable
    .end code
.end method

.method <init> : ([I)V
    .code stack 5 locals 6
L0:     getstatic Field loginapplet o I
L3:     istore 5
L5:     aload_0
L6:     invokespecial Method java/lang/Object <init> ()V
        .catch java/lang/RuntimeException from L9 to L152 using L155
L9:     iconst_1
L10:    istore_2
L11:    iload_2
L12:    aload_1
L13:    arraylength
L14:    aload_1
L15:    arraylength
L16:    ldc 248172417
L18:    ishr
L19:    ineg
L20:    isub
L21:    if_icmpgt L33
L24:    iload_2
L25:    iconst_1
L26:    ishl
L27:    istore_2
L28:    iload 5
L30:    ifeq L11
L33:    aload_0
L34:    iload_2
L35:    iload_2
L36:    iadd
L37:    newarray int
L39:    putfield Field v e [I
L42:    iconst_0
L43:    istore_3
L44:    iload_3
L45:    iconst_m1
L46:    ixor
L47:    iload_2
L48:    iload_2
L49:    iadd
L50:    iconst_m1
L51:    ixor
L52:    if_icmple L70
L55:    aload_0
L56:    getfield Field v e [I
L59:    iload_3
L60:    iconst_m1
L61:    iastore
L62:    iinc 3 1
L65:    iload 5
L67:    ifeq L44
L70:    iconst_0
L71:    istore_3
L72:    aload_1
L73:    arraylength
L74:    iload_3
L75:    if_icmple L152
L78:    iload_2
L79:    iconst_1
L80:    isub
L81:    aload_1
L82:    iload_3
L83:    iaload
L84:    iand
L85:    istore 4
L87:    iconst_m1
L88:    aload_0
L89:    getfield Field v e [I
L92:    iconst_1
L93:    iload 4
L95:    iadd
L96:    iload 4
L98:    iadd
L99:    iaload
L100:   if_icmpeq L118
L103:   iload_2
L104:   iconst_1
L105:   isub
L106:   iload 4
L108:   iconst_1
L109:   iadd
L110:   iand
L111:   istore 4
L113:   iload 5
L115:   ifeq L87
L118:   aload_0
L119:   getfield Field v e [I
L122:   iload 4
L124:   iload 4
L126:   iadd
L127:   aload_1
L128:   iload_3
L129:   iaload
L130:   iastore
L131:   aload_0
L132:   getfield Field v e [I
L135:   iconst_1
L136:   iload 4
L138:   iload 4
L140:   iadd
L141:   iadd
L142:   iload_3
L143:   iastore
L144:   iinc 3 1
L147:   iload 5
L149:   ifeq L72
L152:   goto L195
L155:   astore_2
L156:   aload_2
L157:   new java/lang/StringBuffer
L160:   dup
L161:   invokespecial Method java/lang/StringBuffer <init> ()V
L164:   ldc "v.<init>("
L166:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L169:   aload_1
L170:   ifnull L178
L173:   ldc "{...}"
L175:   goto L180
L178:   ldc "null"
L180:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L183:   bipush 41
L185:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L188:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L191:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L194:   athrow
L195:   return
L196:   
        .linenumbertable
            L5 99
            L9 102
            L11 103
            L24 104
            L33 106
            L42 109
            L44 110
            L55 111
            L62 110
            L70 116
            L72 117
            L78 120
            L87 121
            L103 122
            L118 124
            L131 125
            L144 117
            L152 131
            L155 129
            L156 130
            L195 132
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 2 locals 0
L0:     new java/util/Random
L3:     dup
L4:     invokespecial Method java/util/Random <init> ()V
L7:     putstatic Field v a Ljava/util/Random;
L10:    bipush 67
L12:    ldc "submit_expanded_"
L14:    invokestatic Method ca a (ILjava/lang/String;)Lsa;
L17:    putstatic Field v b Lsa;
L20:    iconst_0
L21:    putstatic Field v c I
L24:    return
L25:    
        .linenumbertable
            L0 21
            L10 83
            L20 96
            L24 97
        .end linenumbertable
    .end code
.end method
.sourcefile "v.java"
.end class
