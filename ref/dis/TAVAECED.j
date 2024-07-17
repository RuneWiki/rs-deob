.version 45 3
.class public super TAVAECED
.super java/lang/Object
.field private a I
.field public static b I
.field public static c [LTAVAECED;
.field public d I
.field public e [I
.field public f [I
.field public g [I
.field public h [I
.field public i Z

.method public static a : (ILXTGLDHGX;)V
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L93 using L93
L0:     new MBMGIXGO
L3:     dup
L4:     aload_1
L5:     ldc "idk.dat"
L7:     aconst_null
L8:     invokevirtual Method XTGLDHGX a (Ljava/lang/String;[B)[B
L11:    sipush 891
L14:    invokespecial Method MBMGIXGO <init> ([BI)V
L17:    astore_2
L18:    aload_2
L19:    invokevirtual Method MBMGIXGO e ()I
L22:    putstatic Field TAVAECED b I
L25:    getstatic Field TAVAECED c [LTAVAECED;
L28:    ifnonnull L40
L31:    getstatic Field TAVAECED b I
L34:    anewarray TAVAECED
L37:    putstatic Field TAVAECED c [LTAVAECED;
L40:    iconst_0
L41:    istore_3
L42:    getstatic Field LKGEGIEW t I
L45:    ifeq L81
L48:    getstatic Field TAVAECED c [LTAVAECED;
L51:    iload_3
L52:    aaload
L53:    ifnonnull L68
L56:    getstatic Field TAVAECED c [LTAVAECED;
L59:    iload_3
L60:    new TAVAECED
L63:    dup
L64:    invokespecial Method TAVAECED <init> ()V
L67:    aastore
L68:    getstatic Field TAVAECED c [LTAVAECED;
L71:    iload_3
L72:    aaload
L73:    iconst_1
L74:    aload_2
L75:    invokevirtual Method TAVAECED a (ZLMBMGIXGO;)V
L78:    iinc 3 1
L81:    iload_3
L82:    getstatic Field TAVAECED b I
L85:    if_icmplt L48
L88:    iload_0
L89:    ifeq L142
L92:    return
L93:    astore_2
L94:    new java/lang/StringBuffer
L97:    dup
L98:    ldc "19348, "
L100:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L103:   iload_0
L104:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L107:   ldc ", "
L109:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L112:   aload_1
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L116:   ldc ", "
L118:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L121:   aload_2
L122:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L125:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L128:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L131:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L134:   new java/lang/RuntimeException
L137:   dup
L138:   invokespecial Method java/lang/RuntimeException <init> ()V
L141:   athrow
L142:   return
L143:   
    .end code
.end method

.method public a : (ZLMBMGIXGO;)V
    .code stack 5 locals 7
L0:     getstatic Field LKGEGIEW t I
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L228 using L228
L5:     iload_1
L6:     ifne L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_2
L18:    invokevirtual Method MBMGIXGO c ()I
L21:    istore_3
L22:    iload_3
L23:    ifne L27
L26:    return
L27:    iload_3
L28:    iconst_1
L29:    if_icmpne L45
L32:    aload_0
L33:    aload_2
L34:    invokevirtual Method MBMGIXGO c ()I
L37:    putfield Field TAVAECED d I
L40:    iload 6
L42:    ifeq L17
L45:    iload_3
L46:    iconst_2
L47:    if_icmpne L98
L50:    aload_2
L51:    invokevirtual Method MBMGIXGO c ()I
L54:    istore 4
L56:    aload_0
L57:    iload 4
L59:    newarray int
L61:    putfield Field TAVAECED e [I
L64:    iconst_0
L65:    istore 5
L67:    iload 6
L69:    ifeq L86
L72:    aload_0
L73:    getfield Field TAVAECED e [I
L76:    iload 5
L78:    aload_2
L79:    invokevirtual Method MBMGIXGO e ()I
L82:    iastore
L83:    iinc 5 1
L86:    iload 5
L88:    iload 4
L90:    if_icmplt L72
L93:    iload 6
L95:    ifeq L17
L98:    iload_3
L99:    iconst_3
L100:   if_icmpne L113
L103:   aload_0
L104:   iconst_1
L105:   putfield Field TAVAECED i Z
L108:   iload 6
L110:   ifeq L17
L113:   iload_3
L114:   bipush 40
L116:   if_icmplt L143
L119:   iload_3
L120:   bipush 50
L122:   if_icmpge L143
L125:   aload_0
L126:   getfield Field TAVAECED f [I
L129:   iload_3
L130:   bipush 40
L132:   isub
L133:   aload_2
L134:   invokevirtual Method MBMGIXGO e ()I
L137:   iastore
L138:   iload 6
L140:   ifeq L17
L143:   iload_3
L144:   bipush 50
L146:   if_icmplt L173
L149:   iload_3
L150:   bipush 60
L152:   if_icmpge L173
L155:   aload_0
L156:   getfield Field TAVAECED g [I
L159:   iload_3
L160:   bipush 50
L162:   isub
L163:   aload_2
L164:   invokevirtual Method MBMGIXGO e ()I
L167:   iastore
L168:   iload 6
L170:   ifeq L17
L173:   iload_3
L174:   bipush 60
L176:   if_icmplt L203
L179:   iload_3
L180:   bipush 70
L182:   if_icmpge L203
L185:   aload_0
L186:   getfield Field TAVAECED h [I
L189:   iload_3
L190:   bipush 60
L192:   isub
L193:   aload_2
L194:   invokevirtual Method MBMGIXGO e ()I
L197:   iastore
L198:   iload 6
L200:   ifeq L17
L203:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L206:   new java/lang/StringBuffer
L209:   dup
L210:   ldc "Error unrecognised config code: "
L212:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L215:   iload_3
L216:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L219:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L222:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L225:   goto L17
L228:   astore_3
L229:   new java/lang/StringBuffer
L232:   dup
L233:   ldc "91892, "
L235:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L238:   iload_1
L239:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L242:   ldc ", "
L244:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L247:   aload_2
L248:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L251:   ldc ", "
L253:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L256:   aload_3
L257:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L260:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L263:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L266:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L269:   new java/lang/RuntimeException
L272:   dup
L273:   invokespecial Method java/lang/RuntimeException <init> ()V
L276:   athrow
L277:   
    .end code
.end method

.method public a : (B)Z
    .code stack 4 locals 5
L0:     getstatic Field LKGEGIEW t I
L3:     istore 4
        .catch java/lang/RuntimeException from L5 to L77 using L77
L5:     aload_0
L6:     getfield Field TAVAECED e [I
L9:     ifnonnull L14
L12:    iconst_1
L13:    ireturn
L14:    iconst_1
L15:    istore_2
L16:    iload_1
L17:    iconst_2
L18:    if_icmpne L28
L21:    iconst_0
L22:    istore_1
L23:    iload 4
L25:    ifeq L42
L28:    iconst_1
L29:    istore_3
L30:    iload 4
L32:    ifeq L38
L35:    iinc 3 1
L38:    iload_3
L39:    ifgt L35
L42:    iconst_0
L43:    istore_3
L44:    iload 4
L46:    ifeq L66
L49:    aload_0
L50:    getfield Field TAVAECED e [I
L53:    iload_3
L54:    iaload
L55:    invokestatic Method ZKARKDQW c (I)Z
L58:    ifne L63
L61:    iconst_0
L62:    istore_2
L63:    iinc 3 1
L66:    iload_3
L67:    aload_0
L68:    getfield Field TAVAECED e [I
L71:    arraylength
L72:    if_icmplt L49
L75:    iload_2
L76:    ireturn
L77:    astore_2
L78:    new java/lang/StringBuffer
L81:    dup
L82:    ldc "9202, "
L84:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L87:    iload_1
L88:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L91:    ldc ", "
L93:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L96:    aload_2
L97:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L106:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L109:   new java/lang/RuntimeException
L112:   dup
L113:   invokespecial Method java/lang/RuntimeException <init> ()V
L116:   athrow
L117:   
    .end code
.end method

.method public a : (Z)LZKARKDQW;
    .code stack 6 locals 7
L0:     getstatic Field LKGEGIEW t I
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L150 using L150
L5:     iload_1
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_0
L18:    getfield Field TAVAECED e [I
L21:    ifnonnull L26
L24:    aconst_null
L25:    areturn
L26:    aload_0
L27:    getfield Field TAVAECED e [I
L30:    arraylength
L31:    anewarray ZKARKDQW
L34:    astore_2
L35:    iconst_0
L36:    istore_3
L37:    iload 6
L39:    ifeq L61
L42:    aload_2
L43:    iload_3
L44:    aload_0
L45:    getfield Field TAVAECED a I
L48:    aload_0
L49:    getfield Field TAVAECED e [I
L52:    iload_3
L53:    iaload
L54:    invokestatic Method ZKARKDQW b (II)LZKARKDQW;
L57:    aastore
L58:    iinc 3 1
L61:    iload_3
L62:    aload_0
L63:    getfield Field TAVAECED e [I
L66:    arraylength
L67:    if_icmplt L42
L70:    aload_2
L71:    arraylength
L72:    iconst_1
L73:    if_icmpne L86
L76:    aload_2
L77:    iconst_0
L78:    aaload
L79:    astore 4
L81:    iload 6
L83:    ifeq L100
L86:    new ZKARKDQW
L89:    dup
L90:    aload_2
L91:    arraylength
L92:    aload_2
L93:    bipush -38
L95:    invokespecial Method ZKARKDQW <init> (I[LZKARKDQW;I)V
L98:    astore 4
L100:   iconst_0
L101:   istore 5
L103:   iload 6
L105:   ifeq L140
L108:   aload_0
L109:   getfield Field TAVAECED f [I
L112:   iload 5
L114:   iaload
L115:   ifeq L147
L118:   aload 4
L120:   aload_0
L121:   getfield Field TAVAECED f [I
L124:   iload 5
L126:   iaload
L127:   aload_0
L128:   getfield Field TAVAECED g [I
L131:   iload 5
L133:   iaload
L134:   invokevirtual Method ZKARKDQW e (II)V
L137:   iinc 5 1
L140:   iload 5
L142:   bipush 6
L144:   if_icmplt L108
L147:   aload 4
L149:   areturn
L150:   astore_2
L151:   new java/lang/StringBuffer
L154:   dup
L155:   ldc "82138, "
L157:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L160:   iload_1
L161:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L164:   ldc ", "
L166:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L169:   aload_2
L170:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L173:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L176:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L179:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L182:   new java/lang/RuntimeException
L185:   dup
L186:   invokespecial Method java/lang/RuntimeException <init> ()V
L189:   athrow
L190:   
    .end code
.end method

.method public b : (Z)Z
    .code stack 4 locals 4
        .catch java/lang/RuntimeException from L0 to L56 using L56
L0:     iload_1
L1:     ifeq L12
L4:     new java/lang/NullPointerException
L7:     dup
L8:     invokespecial Method java/lang/NullPointerException <init> ()V
L11:    athrow
L12:    iconst_1
L13:    istore_2
L14:    iconst_0
L15:    istore_3
L16:    getstatic Field LKGEGIEW t I
L19:    ifeq L49
L22:    aload_0
L23:    getfield Field TAVAECED h [I
L26:    iload_3
L27:    iaload
L28:    iconst_m1
L29:    if_icmpeq L46
L32:    aload_0
L33:    getfield Field TAVAECED h [I
L36:    iload_3
L37:    iaload
L38:    invokestatic Method ZKARKDQW c (I)Z
L41:    ifne L46
L44:    iconst_0
L45:    istore_2
L46:    iinc 3 1
L49:    iload_3
L50:    iconst_5
L51:    if_icmplt L22
L54:    iload_2
L55:    ireturn
L56:    astore_2
L57:    new java/lang/StringBuffer
L60:    dup
L61:    ldc "71412, "
L63:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L66:    iload_1
L67:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L70:    ldc ", "
L72:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L75:    aload_2
L76:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L79:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L82:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L85:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L88:    new java/lang/RuntimeException
L91:    dup
L92:    invokespecial Method java/lang/RuntimeException <init> ()V
L95:    athrow
L96:    
    .end code
.end method

.method public a : (I)LZKARKDQW;
    .code stack 6 locals 8
L0:     getstatic Field LKGEGIEW t I
L3:     istore 7
        .catch java/lang/RuntimeException from L5 to L135 using L135
L5:     iload_1
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    iconst_5
L18:    anewarray ZKARKDQW
L21:    astore_2
L22:    iconst_0
L23:    istore_3
L24:    iconst_0
L25:    istore 4
L27:    iload 7
L29:    ifeq L66
L32:    aload_0
L33:    getfield Field TAVAECED h [I
L36:    iload 4
L38:    iaload
L39:    iconst_m1
L40:    if_icmpeq L63
L43:    aload_2
L44:    iload_3
L45:    iinc 3 1
L48:    aload_0
L49:    getfield Field TAVAECED a I
L52:    aload_0
L53:    getfield Field TAVAECED h [I
L56:    iload 4
L58:    iaload
L59:    invokestatic Method ZKARKDQW b (II)LZKARKDQW;
L62:    aastore
L63:    iinc 4 1
L66:    iload 4
L68:    iconst_5
L69:    if_icmplt L32
L72:    new ZKARKDQW
L75:    dup
L76:    iload_3
L77:    aload_2
L78:    bipush -38
L80:    invokespecial Method ZKARKDQW <init> (I[LZKARKDQW;I)V
L83:    astore 5
L85:    iconst_0
L86:    istore 6
L88:    iload 7
L90:    ifeq L125
L93:    aload_0
L94:    getfield Field TAVAECED f [I
L97:    iload 6
L99:    iaload
L100:   ifeq L132
L103:   aload 5
L105:   aload_0
L106:   getfield Field TAVAECED f [I
L109:   iload 6
L111:   iaload
L112:   aload_0
L113:   getfield Field TAVAECED g [I
L116:   iload 6
L118:   iaload
L119:   invokevirtual Method ZKARKDQW e (II)V
L122:   iinc 6 1
L125:   iload 6
L127:   bipush 6
L129:   if_icmplt L93
L132:   aload 5
L134:   areturn
L135:   astore_2
L136:   new java/lang/StringBuffer
L139:   dup
L140:   ldc "82628, "
L142:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L145:   iload_1
L146:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L149:   ldc ", "
L151:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L154:   aload_2
L155:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L158:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L161:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L164:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L167:   new java/lang/RuntimeException
L170:   dup
L171:   invokespecial Method java/lang/RuntimeException <init> ()V
L174:   athrow
L175:   
    .end code
.end method

.method public <init> : ()V
    .code stack 6 locals 2
L0:     getstatic Field LKGEGIEW t I
L3:     istore_1
L4:     aload_0
L5:     invokespecial Method java/lang/Object <init> ()V
L8:     aload_0
L9:     bipush 9
L11:    putfield Field TAVAECED a I
L14:    aload_0
L15:    iconst_m1
L16:    putfield Field TAVAECED d I
L19:    aload_0
L20:    bipush 6
L22:    newarray int
L24:    putfield Field TAVAECED f [I
L27:    aload_0
L28:    bipush 6
L30:    newarray int
L32:    putfield Field TAVAECED g [I
L35:    aload_0
L36:    iconst_5
L37:    newarray int
L39:    dup
L40:    iconst_0
L41:    iconst_m1
L42:    iastore
L43:    dup
L44:    iconst_1
L45:    iconst_m1
L46:    iastore
L47:    dup
L48:    iconst_2
L49:    iconst_m1
L50:    iastore
L51:    dup
L52:    iconst_3
L53:    iconst_m1
L54:    iastore
L55:    dup
L56:    iconst_4
L57:    iconst_m1
L58:    iastore
L59:    putfield Field TAVAECED h [I
L62:    aload_0
L63:    iconst_0
L64:    putfield Field TAVAECED i Z
L67:    getstatic Field PKVMXVTO e Z
L70:    ifeq L80
L73:    iinc 1 1
L76:    iload_1
L77:    putstatic Field LKGEGIEW t I
L80:    return
L81:    
    .end code
.end method
.end class
