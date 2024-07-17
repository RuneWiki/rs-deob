.version 45 3
.class public super SXYSOXTR
.super java/lang/Object
.field private static a I
.field public static b I
.field public static c [LSXYSOXTR;
.field public d Ljava/lang/String;
.field public e I
.field public f I
.field public g I
.field public h Z
.field public i I
.field public j I

.method public static a : (ILXTGLDHGX;)V
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L145 using L146
L0:     iload_0
L1:     ifeq L9
L4:     bipush 91
L6:     putstatic Field SXYSOXTR a I
L9:     new MBMGIXGO
L12:    dup
L13:    aload_1
L14:    ldc "varbit.dat"
L16:    aconst_null
L17:    invokevirtual Method XTGLDHGX a (Ljava/lang/String;[B)[B
L20:    sipush 891
L23:    invokespecial Method MBMGIXGO <init> ([BI)V
L26:    astore_2
L27:    aload_2
L28:    invokevirtual Method MBMGIXGO e ()I
L31:    putstatic Field SXYSOXTR b I
L34:    getstatic Field SXYSOXTR c [LSXYSOXTR;
L37:    ifnonnull L49
L40:    getstatic Field SXYSOXTR b I
L43:    anewarray SXYSOXTR
L46:    putstatic Field SXYSOXTR c [LSXYSOXTR;
L49:    iconst_0
L50:    istore_3
L51:    getstatic Field LKGEGIEW t I
L54:    ifeq L118
L57:    getstatic Field SXYSOXTR c [LSXYSOXTR;
L60:    iload_3
L61:    aaload
L62:    ifnonnull L77
L65:    getstatic Field SXYSOXTR c [LSXYSOXTR;
L68:    iload_3
L69:    new SXYSOXTR
L72:    dup
L73:    invokespecial Method SXYSOXTR <init> ()V
L76:    aastore
L77:    getstatic Field SXYSOXTR c [LSXYSOXTR;
L80:    iload_3
L81:    aaload
L82:    aload_2
L83:    iconst_0
L84:    iload_3
L85:    invokevirtual Method SXYSOXTR a (LMBMGIXGO;ZI)V
L88:    getstatic Field SXYSOXTR c [LSXYSOXTR;
L91:    iload_3
L92:    aaload
L93:    getfield Field SXYSOXTR h Z
L96:    ifeq L115
L99:    getstatic Field VGXVBFVC d [LVGXVBFVC;
L102:   getstatic Field SXYSOXTR c [LSXYSOXTR;
L105:   iload_3
L106:   aaload
L107:   getfield Field SXYSOXTR e I
L110:   aaload
L111:   iconst_1
L112:   putfield Field VGXVBFVC p Z
L115:   iinc 3 1
L118:   iload_3
L119:   getstatic Field SXYSOXTR b I
L122:   if_icmplt L57
L125:   aload_2
L126:   getfield Field MBMGIXGO z I
L129:   aload_2
L130:   getfield Field MBMGIXGO y [B
L133:   arraylength
L134:   if_icmpeq L195
L137:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L140:   ldc "varbit load mismatch"
L142:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L145:   return
L146:   astore_2
L147:   new java/lang/StringBuffer
L150:   dup
L151:   ldc "95423, "
L153:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L156:   iload_0
L157:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L160:   ldc ", "
L162:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L165:   aload_1
L166:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L169:   ldc ", "
L171:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L174:   aload_2
L175:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L178:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L181:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L184:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L187:   new java/lang/RuntimeException
L190:   dup
L191:   invokespecial Method java/lang/RuntimeException <init> ()V
L194:   athrow
L195:   return
L196:   
    .end code
.end method

.method public a : (LMBMGIXGO;ZI)V
    .code stack 5 locals 6
L0:     getstatic Field LKGEGIEW t I
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L157 using L157
L5:     iload_2
L6:     ifeq L10
L9:     return
L10:    aload_1
L11:    invokevirtual Method MBMGIXGO c ()I
L14:    istore 4
L16:    iload 4
L18:    ifne L22
L21:    return
L22:    iload 4
L24:    iconst_1
L25:    if_icmpne L57
L28:    aload_0
L29:    aload_1
L30:    invokevirtual Method MBMGIXGO e ()I
L33:    putfield Field SXYSOXTR e I
L36:    aload_0
L37:    aload_1
L38:    invokevirtual Method MBMGIXGO c ()I
L41:    putfield Field SXYSOXTR f I
L44:    aload_0
L45:    aload_1
L46:    invokevirtual Method MBMGIXGO c ()I
L49:    putfield Field SXYSOXTR g I
L52:    iload 5
L54:    ifeq L10
L57:    iload 4
L59:    bipush 10
L61:    if_icmpne L77
L64:    aload_0
L65:    aload_1
L66:    invokevirtual Method MBMGIXGO i ()Ljava/lang/String;
L69:    putfield Field SXYSOXTR d Ljava/lang/String;
L72:    iload 5
L74:    ifeq L10
L77:    iload 4
L79:    iconst_2
L80:    if_icmpne L93
L83:    aload_0
L84:    iconst_1
L85:    putfield Field SXYSOXTR h Z
L88:    iload 5
L90:    ifeq L10
L93:    iload 4
L95:    iconst_3
L96:    if_icmpne L112
L99:    aload_0
L100:   aload_1
L101:   invokevirtual Method MBMGIXGO h ()I
L104:   putfield Field SXYSOXTR i I
L107:   iload 5
L109:   ifeq L10
L112:   iload 4
L114:   iconst_4
L115:   if_icmpne L131
L118:   aload_0
L119:   aload_1
L120:   invokevirtual Method MBMGIXGO h ()I
L123:   putfield Field SXYSOXTR j I
L126:   iload 5
L128:   ifeq L10
L131:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L134:   new java/lang/StringBuffer
L137:   dup
L138:   ldc "Error unrecognised config code: "
L140:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L143:   iload 4
L145:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L148:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L151:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L154:   goto L10
L157:   astore 4
L159:   new java/lang/StringBuffer
L162:   dup
L163:   ldc "71039, "
L165:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L168:   aload_1
L169:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L172:   ldc ", "
L174:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L177:   iload_2
L178:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L181:   ldc ", "
L183:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L186:   iload_3
L187:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L190:   ldc ", "
L192:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L195:   aload 4
L197:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L200:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L203:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L206:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L209:   new java/lang/RuntimeException
L212:   dup
L213:   invokespecial Method java/lang/RuntimeException <init> ()V
L216:   athrow
L217:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field SXYSOXTR h Z
L9:     aload_0
L10:    iconst_m1
L11:    putfield Field SXYSOXTR i I
L14:    return
L15:    
    .end code
.end method
.end class
