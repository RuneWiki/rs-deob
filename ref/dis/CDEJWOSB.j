.version 45 3
.class public super CDEJWOSB
.super java/lang/Object
.field private static a I
.field private static b I

.method public static a : (IIIZ)I
    .code stack 4 locals 5
        .catch java/lang/RuntimeException from L0 to L53 using L53
L0:     iload_0
L1:     iconst_3
L2:     iand
L3:     istore_0
L4:     iload_3
L5:     ifeq L25
L8:     iconst_1
L9:     istore 4
L11:    getstatic Field LKGEGIEW t I
L14:    ifeq L20
L17:    iinc 4 1
L20:    iload 4
L22:    ifgt L17
L25:    iload_0
L26:    ifne L31
L29:    iload_2
L30:    ireturn
L31:    iload_0
L32:    iconst_1
L33:    if_icmpne L38
L36:    iload_1
L37:    ireturn
L38:    iload_0
L39:    iconst_2
L40:    if_icmpne L48
L43:    bipush 7
L45:    iload_2
L46:    isub
L47:    ireturn
L48:    bipush 7
L50:    iload_1
L51:    isub
L52:    ireturn
L53:    astore 4
L55:    new java/lang/StringBuffer
L58:    dup
L59:    ldc "92720, "
L61:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L64:    iload_0
L65:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L68:    ldc ", "
L70:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L73:    iload_1
L74:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L77:    ldc ", "
L79:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L82:    iload_2
L83:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L86:    ldc ", "
L88:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L91:    iload_3
L92:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L95:    ldc ", "
L97:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L100:   aload 4
L102:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L105:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L108:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L111:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L114:   new java/lang/RuntimeException
L117:   dup
L118:   invokespecial Method java/lang/RuntimeException <init> ()V
L121:   athrow
L122:   
    .end code
.end method

.method public static a : (IIII)I
    .code stack 3 locals 5
        .catch java/lang/RuntimeException from L0 to L42 using L42
L0:     iload_2
L1:     iflt L10
L4:     sipush -146
L7:     putstatic Field CDEJWOSB b I
L10:    iload_1
L11:    iconst_3
L12:    iand
L13:    istore_1
L14:    iload_1
L15:    ifne L20
L18:    iload_0
L19:    ireturn
L20:    iload_1
L21:    iconst_1
L22:    if_icmpne L30
L25:    bipush 7
L27:    iload_3
L28:    isub
L29:    ireturn
L30:    iload_1
L31:    iconst_2
L32:    if_icmpne L40
L35:    bipush 7
L37:    iload_0
L38:    isub
L39:    ireturn
L40:    iload_3
L41:    ireturn
L42:    astore 4
L44:    new java/lang/StringBuffer
L47:    dup
L48:    ldc "51053, "
L50:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L53:    iload_0
L54:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L57:    ldc ", "
L59:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L62:    iload_1
L63:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L66:    ldc ", "
L68:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L71:    iload_2
L72:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L75:    ldc ", "
L77:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L80:    iload_3
L81:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L84:    ldc ", "
L86:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L89:    aload 4
L91:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L94:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L97:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L100:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L103:   new java/lang/RuntimeException
L106:   dup
L107:   invokespecial Method java/lang/RuntimeException <init> ()V
L110:   athrow
L111:   
    .end code
.end method

.method public static a : (IIIBII)I
    .code stack 3 locals 7
        .catch java/lang/RuntimeException from L0 to L53 using L53
L0:     iload_3
L1:     bipush 113
L3:     if_icmpeq L10
L6:     getstatic Field CDEJWOSB a I
L9:     ireturn
L10:    iload_0
L11:    iconst_3
L12:    iand
L13:    istore_0
L14:    iload_0
L15:    ifne L20
L18:    iload_2
L19:    ireturn
L20:    iload_0
L21:    iconst_1
L22:    if_icmpne L28
L25:    iload 4
L27:    ireturn
L28:    iload_0
L29:    iconst_2
L30:    if_icmpne L43
L33:    bipush 7
L35:    iload_2
L36:    isub
L37:    iload 5
L39:    iconst_1
L40:    isub
L41:    isub
L42:    ireturn
L43:    bipush 7
L45:    iload 4
L47:    isub
L48:    iload_1
L49:    iconst_1
L50:    isub
L51:    isub
L52:    ireturn
L53:    astore 6
L55:    new java/lang/StringBuffer
L58:    dup
L59:    ldc "92592, "
L61:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L64:    iload_0
L65:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L68:    ldc ", "
L70:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L73:    iload_1
L74:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L77:    ldc ", "
L79:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L82:    iload_2
L83:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L86:    ldc ", "
L88:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L91:    iload_3
L92:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L95:    ldc ", "
L97:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L100:   iload 4
L102:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L105:   ldc ", "
L107:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L110:   iload 5
L112:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L115:   ldc ", "
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L120:   aload 6
L122:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L125:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L128:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L131:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L134:   new java/lang/RuntimeException
L137:   dup
L138:   invokespecial Method java/lang/RuntimeException <init> ()V
L141:   athrow
L142:   
    .end code
.end method

.method public static a : (IIIIII)I
    .code stack 3 locals 7
        .catch java/lang/RuntimeException from L0 to L51 using L51
L0:     iload_3
L1:     iconst_3
L2:     iand
L3:     istore_3
L4:     iload_0
L5:     iflt L12
L8:     getstatic Field CDEJWOSB b I
L11:    ireturn
L12:    iload_3
L13:    ifne L18
L16:    iload_1
L17:    ireturn
L18:    iload_3
L19:    iconst_1
L20:    if_icmpne L34
L23:    bipush 7
L25:    iload 5
L27:    isub
L28:    iload 4
L30:    iconst_1
L31:    isub
L32:    isub
L33:    ireturn
L34:    iload_3
L35:    iconst_2
L36:    if_icmpne L48
L39:    bipush 7
L41:    iload_1
L42:    isub
L43:    iload_2
L44:    iconst_1
L45:    isub
L46:    isub
L47:    ireturn
L48:    iload 5
L50:    ireturn
L51:    astore 6
L53:    new java/lang/StringBuffer
L56:    dup
L57:    ldc "62488, "
L59:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L62:    iload_0
L63:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L66:    ldc ", "
L68:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L71:    iload_1
L72:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L75:    ldc ", "
L77:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L80:    iload_2
L81:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L84:    ldc ", "
L86:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L89:    iload_3
L90:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L93:    ldc ", "
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    iload 4
L100:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L103:   ldc ", "
L105:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L108:   iload 5
L110:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L113:   ldc ", "
L115:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L118:   aload 6
L120:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L123:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L126:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L129:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L132:   new java/lang/RuntimeException
L135:   dup
L136:   invokespecial Method java/lang/RuntimeException <init> ()V
L139:   athrow
L140:   
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush -12499
L3:     putstatic Field CDEJWOSB a I
L6:     sipush -192
L9:     putstatic Field CDEJWOSB b I
L12:    return
L13:    
    .end code
.end method
.end class
