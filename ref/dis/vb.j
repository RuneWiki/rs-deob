.version 45 3
.class public final super vb
.super java/lang/Object
.field private static a Z
.field private static b B
.field private static c I
.field private static d Z
.field private static e I
.field static f [C
.field static g [C

.method public static a : (Ljava/lang/String;)J
    .code stack 5 locals 6
L0:     getstatic Field kb C Z
L3:     istore 5
L5:     lconst_0
L6:     lstore_1
L7:     iconst_0
L8:     istore_3
L9:     iload 5
L11:    ifeq L116
L14:    aload_0
L15:    iload_3
L16:    invokevirtual Method java/lang/String charAt (I)C
L19:    istore 4
L21:    lload_1
L22:    ldc2_w 37L
L25:    lmul
L26:    lstore_1
L27:    iload 4
L29:    bipush 65
L31:    if_icmplt L57
L34:    iload 4
L36:    bipush 90
L38:    if_icmpgt L57
L41:    lload_1
L42:    iconst_1
L43:    iload 4
L45:    iadd
L46:    bipush 65
L48:    isub
L49:    i2l
L50:    ladd
L51:    lstore_1
L52:    iload 5
L54:    ifeq L113
L57:    iload 4
L59:    bipush 97
L61:    if_icmplt L87
L64:    iload 4
L66:    bipush 122
L68:    if_icmpgt L87
L71:    lload_1
L72:    iconst_1
L73:    iload 4
L75:    iadd
L76:    bipush 97
L78:    isub
L79:    i2l
L80:    ladd
L81:    lstore_1
L82:    iload 5
L84:    ifeq L113
L87:    iload 4
L89:    bipush 48
L91:    if_icmplt L113
L94:    iload 4
L96:    bipush 57
L98:    if_icmpgt L113
L101:   lload_1
L102:   bipush 27
L104:   iload 4
L106:   iadd
L107:   bipush 48
L109:   isub
L110:   i2l
L111:   ladd
L112:   lstore_1
L113:   iinc 3 1
L116:   iload_3
L117:   aload_0
L118:   invokevirtual Method java/lang/String length ()I
L121:   if_icmpge L141
L124:   iload_3
L125:   bipush 12
L127:   if_icmplt L14
L130:   iload 5
L132:   ifeq L141
L135:   lload_1
L136:   ldc2_w 37L
L139:   ldiv
L140:   lstore_1
L141:   lload_1
L142:   ldc2_w 37L
L145:   lrem
L146:   lconst_0
L147:   lcmp
L148:   ifne L157
L151:   lload_1
L152:   lconst_0
L153:   lcmp
L154:   ifne L135
L157:   lload_1
L158:   lreturn
L159:   
    .end code
.end method

.method public static a : (JZ)Ljava/lang/String;
    .code stack 10 locals 6
        .catch java/lang/RuntimeException from L0 to L103 using L103
L0:     lload_0
L1:     lconst_0
L2:     lcmp
L3:     ifle L14
L6:     lload_0
L7:     ldc2_w 6582952005840035281L
L10:    lcmp
L11:    iflt L17
L14:    ldc "invalid_name"
L16:    areturn
L17:    lload_0
L18:    ldc2_w 37L
L21:    lrem
L22:    lconst_0
L23:    lcmp
L24:    ifne L30
L27:    ldc "invalid_name"
L29:    areturn
L30:    iconst_0
L31:    istore_3
L32:    iload_2
L33:    ifeq L81
L36:    sipush -363
L39:    putstatic Field vb e I
L42:    getstatic Field kb C Z
L45:    ifeq L81
L48:    lload_0
L49:    lstore 4
L51:    lload_0
L52:    ldc2_w 37L
L55:    ldiv
L56:    lstore_0
L57:    getstatic Field vb f [C
L60:    bipush 11
L62:    iload_3
L63:    iinc 3 1
L66:    isub
L67:    getstatic Field vb g [C
L70:    lload 4
L72:    lload_0
L73:    ldc2_w 37L
L76:    lmul
L77:    lsub
L78:    l2i
L79:    caload
L80:    castore
L81:    lload_0
L82:    lconst_0
L83:    lcmp
L84:    ifne L48
L87:    new java/lang/String
L90:    dup
L91:    getstatic Field vb f [C
L94:    bipush 12
L96:    iload_3
L97:    isub
L98:    iload_3
L99:    invokespecial Method java/lang/String <init> ([CII)V
L102:   areturn
L103:   astore_3
L104:   new java/lang/StringBuffer
L107:   dup
L108:   ldc "15228, "
L110:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L113:   lload_0
L114:   invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L117:   ldc ", "
L119:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L122:   iload_2
L123:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L126:   ldc ", "
L128:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L131:   aload_3
L132:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L135:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L138:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L141:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L144:   new java/lang/RuntimeException
L147:   dup
L148:   invokespecial Method java/lang/RuntimeException <init> ()V
L151:   athrow
L152:   
    .end code
.end method

.method public static a : (ILjava/lang/String;)J
    .code stack 6 locals 5
        .catch java/lang/RuntimeException from L0 to L71 using L71
L0:     iload_0
L1:     ifeq L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow
L12:    aload_1
L13:    invokevirtual Method java/lang/String toUpperCase ()Ljava/lang/String;
L16:    astore_1
L17:    lconst_0
L18:    lstore_2
L19:    iconst_0
L20:    istore 4
L22:    getstatic Field kb C Z
L25:    ifeq L60
L28:    lload_2
L29:    ldc2_w 61L
L32:    lmul
L33:    aload_1
L34:    iload 4
L36:    invokevirtual Method java/lang/String charAt (I)C
L39:    i2l
L40:    ladd
L41:    ldc2_w 32L
L44:    lsub
L45:    lstore_2
L46:    lload_2
L47:    lload_2
L48:    bipush 56
L50:    lshr
L51:    ladd
L52:    ldc2_w 72057594037927935L
L55:    land
L56:    lstore_2
L57:    iinc 4 1
L60:    iload 4
L62:    aload_1
L63:    invokevirtual Method java/lang/String length ()I
L66:    if_icmplt L28
L69:    lload_2
L70:    lreturn
L71:    astore_2
L72:    new java/lang/StringBuffer
L75:    dup
L76:    ldc "43144, "
L78:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L81:    iload_0
L82:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L85:    ldc ", "
L87:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L90:    aload_1
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    ldc ", "
L96:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L99:    aload_2
L100:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L103:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L106:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L109:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L112:   new java/lang/RuntimeException
L115:   dup
L116:   invokespecial Method java/lang/RuntimeException <init> ()V
L119:   athrow
L120:   
    .end code
.end method

.method public static a : (II)Ljava/lang/String;
    .code stack 4 locals 3
        .catch java/lang/RuntimeException from L0 to L85 using L85
L0:     iload_0
L1:     iflt L18
L4:     getstatic Field vb a Z
L7:     ifeq L14
L10:    iconst_0
L11:    goto L15
L14:    iconst_1
L15:    putstatic Field vb a Z
L18:    new java/lang/StringBuffer
L21:    dup
L22:    iload_1
L23:    bipush 24
L25:    ishr
L26:    sipush 255
L29:    iand
L30:    invokestatic Method java/lang/String valueOf (I)Ljava/lang/String;
L33:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L36:    ldc "."
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    iload_1
L42:    bipush 16
L44:    ishr
L45:    sipush 255
L48:    iand
L49:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L52:    ldc "."
L54:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L57:    iload_1
L58:    bipush 8
L60:    ishr
L61:    sipush 255
L64:    iand
L65:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L68:    ldc "."
L70:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L73:    iload_1
L74:    sipush 255
L77:    iand
L78:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L81:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L84:    areturn
L85:    astore_2
L86:    new java/lang/StringBuffer
L89:    dup
L90:    ldc "89303, "
L92:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L95:    iload_0
L96:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L99:    ldc ", "
L101:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L104:   iload_1
L105:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L108:   ldc ", "
L110:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L113:   aload_2
L114:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L120:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L123:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L126:   new java/lang/RuntimeException
L129:   dup
L130:   invokespecial Method java/lang/RuntimeException <init> ()V
L133:   athrow
L134:   
    .end code
.end method

.method public static b : (ILjava/lang/String;)Ljava/lang/String;
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L139 using L139
L0:     iload_0
L1:     ifeq L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow
L12:    aload_1
L13:    invokevirtual Method java/lang/String length ()I
L16:    ifle L137
L19:    aload_1
L20:    invokevirtual Method java/lang/String toCharArray ()[C
L23:    astore_2
L24:    iconst_0
L25:    istore_3
L26:    getstatic Field kb C Z
L29:    ifeq L93
L32:    aload_2
L33:    iload_3
L34:    caload
L35:    bipush 95
L37:    if_icmpne L90
L40:    aload_2
L41:    iload_3
L42:    bipush 32
L44:    castore
L45:    iload_3
L46:    iconst_1
L47:    iadd
L48:    aload_2
L49:    arraylength
L50:    if_icmpge L90
L53:    aload_2
L54:    iload_3
L55:    iconst_1
L56:    iadd
L57:    caload
L58:    bipush 97
L60:    if_icmplt L90
L63:    aload_2
L64:    iload_3
L65:    iconst_1
L66:    iadd
L67:    caload
L68:    bipush 122
L70:    if_icmpgt L90
L73:    aload_2
L74:    iload_3
L75:    iconst_1
L76:    iadd
L77:    aload_2
L78:    iload_3
L79:    iconst_1
L80:    iadd
L81:    caload
L82:    bipush 65
L84:    iadd
L85:    bipush 97
L87:    isub
L88:    i2c
L89:    castore
L90:    iinc 3 1
L93:    iload_3
L94:    aload_2
L95:    arraylength
L96:    if_icmplt L32
L99:    aload_2
L100:   iconst_0
L101:   caload
L102:   bipush 97
L104:   if_icmplt L128
L107:   aload_2
L108:   iconst_0
L109:   caload
L110:   bipush 122
L112:   if_icmpgt L128
L115:   aload_2
L116:   iconst_0
L117:   aload_2
L118:   iconst_0
L119:   caload
L120:   bipush 65
L122:   iadd
L123:   bipush 97
L125:   isub
L126:   i2c
L127:   castore
L128:   new java/lang/String
L131:   dup
L132:   aload_2
L133:   invokespecial Method java/lang/String <init> ([C)V
L136:   areturn
L137:   aload_1
L138:   areturn
L139:   astore_2
L140:   new java/lang/StringBuffer
L143:   dup
L144:   ldc "71479, "
L146:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L149:   iload_0
L150:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L153:   ldc ", "
L155:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L158:   aload_1
L159:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L162:   ldc ", "
L164:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L167:   aload_2
L168:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L171:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L174:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L177:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L180:   new java/lang/RuntimeException
L183:   dup
L184:   invokespecial Method java/lang/RuntimeException <init> ()V
L187:   athrow
L188:   
    .end code
.end method

.method public static a : (Ljava/lang/String;I)Ljava/lang/String;
    .code stack 5 locals 7
        .catch java/lang/RuntimeException from L0 to L107 using L107
L0:     aload_0
L1:     invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L4:     astore_0
L5:     iload_1
L6:     ifeq L14
L9:     bipush -18
L11:    putstatic Field vb c I
L14:    aload_0
L15:    invokevirtual Method java/lang/String toCharArray ()[C
L18:    astore_2
L19:    aload_2
L20:    arraylength
L21:    istore_3
L22:    iconst_1
L23:    istore 4
L25:    iconst_0
L26:    istore 5
L28:    getstatic Field kb C Z
L31:    ifeq L92
L34:    aload_2
L35:    iload 5
L37:    caload
L38:    istore 6
L40:    iload 4
L42:    ifeq L72
L45:    iload 6
L47:    bipush 97
L49:    if_icmplt L72
L52:    iload 6
L54:    bipush 122
L56:    if_icmpgt L72
L59:    aload_2
L60:    iload 5
L62:    dup2
L63:    caload
L64:    bipush -32
L66:    iadd
L67:    i2c
L68:    castore
L69:    iconst_0
L70:    istore 4
L72:    iload 6
L74:    bipush 46
L76:    if_icmpeq L86
L79:    iload 6
L81:    bipush 33
L83:    if_icmpne L89
L86:    iconst_1
L87:    istore 4
L89:    iinc 5 1
L92:    iload 5
L94:    iload_3
L95:    if_icmplt L34
L98:    new java/lang/String
L101:   dup
L102:   aload_2
L103:   invokespecial Method java/lang/String <init> ([C)V
L106:   areturn
L107:   astore_2
L108:   new java/lang/StringBuffer
L111:   dup
L112:   ldc "53394, "
L114:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L117:   aload_0
L118:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L121:   ldc ", "
L123:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L126:   iload_1
L127:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L130:   ldc ", "
L132:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L135:   aload_2
L136:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L139:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L142:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L145:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L148:   new java/lang/RuntimeException
L151:   dup
L152:   invokespecial Method java/lang/RuntimeException <init> ()V
L155:   athrow
L156:   
    .end code
.end method

.method public static c : (ILjava/lang/String;)Ljava/lang/String;
    .code stack 4 locals 4
        .catch java/lang/RuntimeException from L0 to L58 using L58
L0:     ldc ""
L2:     astore_2
L3:     iload_0
L4:     bipush 7
L6:     if_icmpeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    iconst_0
L18:    istore_3
L19:    getstatic Field kb C Z
L22:    ifeq L48
L25:    new java/lang/StringBuffer
L28:    dup
L29:    aload_2
L30:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L33:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L36:    ldc "*"
L38:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L41:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L44:    astore_2
L45:    iinc 3 1
L48:    iload_3
L49:    aload_1
L50:    invokevirtual Method java/lang/String length ()I
L53:    if_icmplt L25
L56:    aload_2
L57:    areturn
L58:    astore_2
L59:    new java/lang/StringBuffer
L62:    dup
L63:    ldc "91128, "
L65:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L68:    iload_0
L69:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L72:    ldc ", "
L74:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L77:    aload_1
L78:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L81:    ldc ", "
L83:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L86:    aload_2
L87:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L90:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L93:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L96:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L99:    new java/lang/RuntimeException
L102:   dup
L103:   invokespecial Method java/lang/RuntimeException <init> ()V
L106:   athrow
L107:   
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     bipush 25
L2:     putstatic Field vb b B
L5:     iconst_3
L6:     putstatic Field vb c I
L9:     iconst_1
L10:    putstatic Field vb d Z
L13:    sipush 629
L16:    putstatic Field vb e I
L19:    bipush 12
L21:    newarray char
L23:    putstatic Field vb f [C
L26:    bipush 37
L28:    newarray char
L30:    dup
L31:    iconst_0
L32:    bipush 95
L34:    castore
L35:    dup
L36:    iconst_1
L37:    bipush 97
L39:    castore
L40:    dup
L41:    iconst_2
L42:    bipush 98
L44:    castore
L45:    dup
L46:    iconst_3
L47:    bipush 99
L49:    castore
L50:    dup
L51:    iconst_4
L52:    bipush 100
L54:    castore
L55:    dup
L56:    iconst_5
L57:    bipush 101
L59:    castore
L60:    dup
L61:    bipush 6
L63:    bipush 102
L65:    castore
L66:    dup
L67:    bipush 7
L69:    bipush 103
L71:    castore
L72:    dup
L73:    bipush 8
L75:    bipush 104
L77:    castore
L78:    dup
L79:    bipush 9
L81:    bipush 105
L83:    castore
L84:    dup
L85:    bipush 10
L87:    bipush 106
L89:    castore
L90:    dup
L91:    bipush 11
L93:    bipush 107
L95:    castore
L96:    dup
L97:    bipush 12
L99:    bipush 108
L101:   castore
L102:   dup
L103:   bipush 13
L105:   bipush 109
L107:   castore
L108:   dup
L109:   bipush 14
L111:   bipush 110
L113:   castore
L114:   dup
L115:   bipush 15
L117:   bipush 111
L119:   castore
L120:   dup
L121:   bipush 16
L123:   bipush 112
L125:   castore
L126:   dup
L127:   bipush 17
L129:   bipush 113
L131:   castore
L132:   dup
L133:   bipush 18
L135:   bipush 114
L137:   castore
L138:   dup
L139:   bipush 19
L141:   bipush 115
L143:   castore
L144:   dup
L145:   bipush 20
L147:   bipush 116
L149:   castore
L150:   dup
L151:   bipush 21
L153:   bipush 117
L155:   castore
L156:   dup
L157:   bipush 22
L159:   bipush 118
L161:   castore
L162:   dup
L163:   bipush 23
L165:   bipush 119
L167:   castore
L168:   dup
L169:   bipush 24
L171:   bipush 120
L173:   castore
L174:   dup
L175:   bipush 25
L177:   bipush 121
L179:   castore
L180:   dup
L181:   bipush 26
L183:   bipush 122
L185:   castore
L186:   dup
L187:   bipush 27
L189:   bipush 48
L191:   castore
L192:   dup
L193:   bipush 28
L195:   bipush 49
L197:   castore
L198:   dup
L199:   bipush 29
L201:   bipush 50
L203:   castore
L204:   dup
L205:   bipush 30
L207:   bipush 51
L209:   castore
L210:   dup
L211:   bipush 31
L213:   bipush 52
L215:   castore
L216:   dup
L217:   bipush 32
L219:   bipush 53
L221:   castore
L222:   dup
L223:   bipush 33
L225:   bipush 54
L227:   castore
L228:   dup
L229:   bipush 34
L231:   bipush 55
L233:   castore
L234:   dup
L235:   bipush 35
L237:   bipush 56
L239:   castore
L240:   dup
L241:   bipush 36
L243:   bipush 57
L245:   castore
L246:   putstatic Field vb g [C
L249:   return
L250:   
    .end code
.end method
.end class
