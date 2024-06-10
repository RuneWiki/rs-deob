.version 45 3
.class final super oa
.super java/lang/Object
.field static a Laa;
.field static b I
.field static c Z
.field static d I
.field static e Z
.field private f Ljava/util/zip/Inflater;
.field static g I
.field static h J

.method public static a : (I)V
    .code stack 3 locals 2
        .catch java/lang/RuntimeException from L0 to L16 using L19
L0:     aconst_null
L1:     putstatic Field oa a Laa;
L4:     iload_0
L5:     bipush -68
L7:     if_icmple L16
L10:    ldc2_w 26L
L13:    putstatic Field oa h J
L16:    goto L49
L19:    astore_1
L20:    aload_1
L21:    new java/lang/StringBuffer
L24:    dup
L25:    invokespecial Method java/lang/StringBuffer <init> ()V
L28:    ldc "oa.A("
L30:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L33:    iload_0
L34:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L37:    bipush 41
L39:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L42:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L45:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L48:    athrow
L49:    return
L50:    
        .linenumbertable
            L0 37
            L4 38
            L10 39
            L16 43
            L19 41
            L20 42
            L49 44
        .end linenumbertable
    .end code
.end method

.method final a : (ILea;[B)V
    .code stack 5 locals 5
L0:     bipush -32
L2:     aload_2
L3:     getfield Field ea k [B
L6:     aload_2
L7:     getfield Field ea n I
L10:    baload
L11:    iconst_m1
L12:    ixor
L13:    if_icmpne L34
L16:    bipush 116
L18:    aload_2
L19:    getfield Field ea k [B
L22:    iconst_1
L23:    aload_2
L24:    getfield Field ea n I
L27:    iadd
L28:    baload
L29:    iconst_m1
L30:    ixor
L31:    if_icmpeq L44
L34:    new java/lang/RuntimeException
L37:    dup
L38:    ldc "Invalid GZIP header!"
L40:    invokespecial Method java/lang/RuntimeException <init> (Ljava/lang/String;)V
L43:    athrow
L44:    iload_1
L45:    bipush 35
L47:    if_icmpge L64
L50:    aload_0
L51:    bipush 23
L53:    aconst_null
L54:    checkcast ea
L57:    aconst_null
L58:    checkcast [B
L61:    invokevirtual Method oa a (ILea;[B)V
L64:    aconst_null
L65:    aload_0
L66:    getfield Field oa f Ljava/util/zip/Inflater;
L69:    if_acmpne L84
L72:    aload_0
L73:    new java/util/zip/Inflater
L76:    dup
L77:    iconst_1
L78:    invokespecial Method java/util/zip/Inflater <init> (Z)V
L81:    putfield Field oa f Ljava/util/zip/Inflater;
        .catch java/lang/Exception from L84 to L125 using L128
        .catch java/lang/RuntimeException from L0 to L154 using L157
L84:    aload_0
L85:    getfield Field oa f Ljava/util/zip/Inflater;
L88:    aload_2
L89:    getfield Field ea k [B
L92:    aload_2
L93:    getfield Field ea n I
L96:    bipush -10
L98:    isub
L99:    aload_2
L100:   getfield Field ea k [B
L103:   arraylength
L104:   bipush -18
L106:   iadd
L107:   aload_2
L108:   getfield Field ea n I
L111:   ineg
L112:   iadd
L113:   invokevirtual Method java/util/zip/Inflater setInput ([BII)V
L116:   aload_0
L117:   getfield Field oa f Ljava/util/zip/Inflater;
L120:   aload_3
L121:   invokevirtual Method java/util/zip/Inflater inflate ([B)I
L124:   pop
L125:   goto L147
L128:   astore 4
L130:   aload_0
L131:   getfield Field oa f Ljava/util/zip/Inflater;
L134:   invokevirtual Method java/util/zip/Inflater reset ()V
L137:   new java/lang/RuntimeException
L140:   dup
L141:   ldc "Invalid GZIP compressed data!"
L143:   invokespecial Method java/lang/RuntimeException <init> (Ljava/lang/String;)V
L146:   athrow
L147:   aload_0
L148:   getfield Field oa f Ljava/util/zip/Inflater;
L151:   invokevirtual Method java/util/zip/Inflater reset ()V
L154:   goto L227
L157:   astore 4
L159:   aload 4
L161:   new java/lang/StringBuffer
L164:   dup
L165:   invokespecial Method java/lang/StringBuffer <init> ()V
L168:   ldc "oa.B("
L170:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L173:   iload_1
L174:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L177:   bipush 44
L179:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L182:   aload_2
L183:   ifnull L191
L186:   ldc "{...}"
L188:   goto L193
L191:   ldc "null"
L193:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L196:   bipush 44
L198:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L201:   aload_3
L202:   ifnull L210
L205:   ldc "{...}"
L207:   goto L212
L210:   ldc "null"
L212:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L215:   bipush 41
L217:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L220:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L223:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L226:   athrow
L227:   return
L228:   
        .linenumbertable
            L0 63
            L34 64
            L44 66
            L50 67
            L64 69
            L72 70
            L84 73
            L116 74
            L125 78
            L128 75
            L130 76
            L137 77
            L147 79
            L154 82
            L157 80
            L159 81
            L227 83
        .end linenumbertable
    .end code
.end method

.method private <init> : (III)V
    .code stack 1 locals 4
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     goto L7
L7:     return
L8:     
        .linenumbertable
            L0 89
            L4 99
            L7 100
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 4 locals 1
L0:     aload_0
L1:     iconst_m1
L2:     ldc 1000000
L4:     ldc 1000000
L6:     invokespecial Method oa <init> (III)V
L9:     return
L10:    
        .linenumbertable
            L0 103
            L9 104
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field oa b I
L4:     iconst_0
L5:     putstatic Field oa c Z
L8:     iconst_0
L9:     putstatic Field oa e Z
L12:    return
L13:    
        .linenumbertable
            L0 12
            L4 50
            L8 59
            L12 109
        .end linenumbertable
    .end code
.end method
.sourcefile "oa.java"
.end class
