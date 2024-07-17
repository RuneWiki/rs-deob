.version 45 3
.class public super VGXVBFVC
.super java/lang/Object
.field private static a Z
.field private b I
.field public static c I
.field public static d [LVGXVBFVC;
.field public static e I
.field public static f [I
.field public g Ljava/lang/String;
.field public h I
.field public i I
.field public j Z
.field public k Z
.field public l I
.field public m Z
.field public n I
.field public o I
.field public p Z
.field public q I

.method public static a : (ILXTGLDHGX;)V
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L145 using L146
L0:     new MBMGIXGO
L3:     dup
L4:     aload_1
L5:     ldc "varp.dat"
L7:     aconst_null
L8:     invokevirtual Method XTGLDHGX a (Ljava/lang/String;[B)[B
L11:    sipush 891
L14:    invokespecial Method MBMGIXGO <init> ([BI)V
L17:    astore_2
L18:    iconst_0
L19:    putstatic Field VGXVBFVC e I
L22:    aload_2
L23:    invokevirtual Method MBMGIXGO e ()I
L26:    putstatic Field VGXVBFVC c I
L29:    getstatic Field VGXVBFVC d [LVGXVBFVC;
L32:    ifnonnull L44
L35:    getstatic Field VGXVBFVC c I
L38:    anewarray VGXVBFVC
L41:    putstatic Field VGXVBFVC d [LVGXVBFVC;
L44:    getstatic Field VGXVBFVC f [I
L47:    ifnonnull L58
L50:    getstatic Field VGXVBFVC c I
L53:    newarray int
L55:    putstatic Field VGXVBFVC f [I
L58:    iconst_0
L59:    istore_3
L60:    getstatic Field LKGEGIEW t I
L63:    ifeq L100
L66:    getstatic Field VGXVBFVC d [LVGXVBFVC;
L69:    iload_3
L70:    aaload
L71:    ifnonnull L86
L74:    getstatic Field VGXVBFVC d [LVGXVBFVC;
L77:    iload_3
L78:    new VGXVBFVC
L81:    dup
L82:    invokespecial Method VGXVBFVC <init> ()V
L85:    aastore
L86:    getstatic Field VGXVBFVC d [LVGXVBFVC;
L89:    iload_3
L90:    aaload
L91:    aload_2
L92:    iconst_0
L93:    iload_3
L94:    invokevirtual Method VGXVBFVC a (LMBMGIXGO;ZI)V
L97:    iinc 3 1
L100:   iload_3
L101:   getstatic Field VGXVBFVC c I
L104:   if_icmplt L66
L107:   iload_0
L108:   ifeq L125
L111:   getstatic Field VGXVBFVC a Z
L114:   ifeq L121
L117:   iconst_0
L118:   goto L122
L121:   iconst_1
L122:   putstatic Field VGXVBFVC a Z
L125:   aload_2
L126:   getfield Field MBMGIXGO z I
L129:   aload_2
L130:   getfield Field MBMGIXGO y [B
L133:   arraylength
L134:   if_icmpeq L195
L137:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L140:   ldc "varptype load mismatch"
L142:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L145:   return
L146:   astore_2
L147:   new java/lang/StringBuffer
L150:   dup
L151:   ldc "14989, "
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
        .catch java/lang/RuntimeException from L5 to L289 using L289
L5:     iload_2
L6:     ifeq L15
L9:     aload_0
L10:    bipush -91
L12:    putfield Field VGXVBFVC b I
L15:    aload_1
L16:    invokevirtual Method MBMGIXGO c ()I
L19:    istore 4
L21:    iload 4
L23:    ifne L27
L26:    return
L27:    iload 4
L29:    iconst_1
L30:    if_icmpne L46
L33:    aload_0
L34:    aload_1
L35:    invokevirtual Method MBMGIXGO c ()I
L38:    putfield Field VGXVBFVC h I
L41:    iload 5
L43:    ifeq L15
L46:    iload 4
L48:    iconst_2
L49:    if_icmpne L65
L52:    aload_0
L53:    aload_1
L54:    invokevirtual Method MBMGIXGO c ()I
L57:    putfield Field VGXVBFVC i I
L60:    iload 5
L62:    ifeq L15
L65:    iload 4
L67:    iconst_3
L68:    if_icmpne L95
L71:    aload_0
L72:    iconst_1
L73:    putfield Field VGXVBFVC j Z
L76:    getstatic Field VGXVBFVC f [I
L79:    getstatic Field VGXVBFVC e I
L82:    dup
L83:    iconst_1
L84:    iadd
L85:    putstatic Field VGXVBFVC e I
L88:    iload_3
L89:    iastore
L90:    iload 5
L92:    ifeq L15
L95:    iload 4
L97:    iconst_4
L98:    if_icmpne L111
L101:   aload_0
L102:   iconst_0
L103:   putfield Field VGXVBFVC k Z
L106:   iload 5
L108:   ifeq L15
L111:   iload 4
L113:   iconst_5
L114:   if_icmpne L130
L117:   aload_0
L118:   aload_1
L119:   invokevirtual Method MBMGIXGO e ()I
L122:   putfield Field VGXVBFVC l I
L125:   iload 5
L127:   ifeq L15
L130:   iload 4
L132:   bipush 6
L134:   if_icmpne L147
L137:   aload_0
L138:   iconst_1
L139:   putfield Field VGXVBFVC m Z
L142:   iload 5
L144:   ifeq L15
L147:   iload 4
L149:   bipush 7
L151:   if_icmpne L167
L154:   aload_0
L155:   aload_1
L156:   invokevirtual Method MBMGIXGO h ()I
L159:   putfield Field VGXVBFVC n I
L162:   iload 5
L164:   ifeq L15
L167:   iload 4
L169:   bipush 8
L171:   if_icmpne L189
L174:   aload_0
L175:   iconst_1
L176:   putfield Field VGXVBFVC o I
L179:   aload_0
L180:   iconst_1
L181:   putfield Field VGXVBFVC p Z
L184:   iload 5
L186:   ifeq L15
L189:   iload 4
L191:   bipush 10
L193:   if_icmpne L209
L196:   aload_0
L197:   aload_1
L198:   invokevirtual Method MBMGIXGO i ()Ljava/lang/String;
L201:   putfield Field VGXVBFVC g Ljava/lang/String;
L204:   iload 5
L206:   ifeq L15
L209:   iload 4
L211:   bipush 11
L213:   if_icmpne L226
L216:   aload_0
L217:   iconst_1
L218:   putfield Field VGXVBFVC p Z
L221:   iload 5
L223:   ifeq L15
L226:   iload 4
L228:   bipush 12
L230:   if_icmpne L246
L233:   aload_0
L234:   aload_1
L235:   invokevirtual Method MBMGIXGO h ()I
L238:   putfield Field VGXVBFVC q I
L241:   iload 5
L243:   ifeq L15
L246:   iload 4
L248:   bipush 13
L250:   if_icmpne L263
L253:   aload_0
L254:   iconst_2
L255:   putfield Field VGXVBFVC o I
L258:   iload 5
L260:   ifeq L15
L263:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L266:   new java/lang/StringBuffer
L269:   dup
L270:   ldc "Error unrecognised config code: "
L272:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L275:   iload 4
L277:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L280:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L283:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L286:   goto L15
L289:   astore 4
L291:   new java/lang/StringBuffer
L294:   dup
L295:   ldc "43224, "
L297:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L300:   aload_1
L301:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L304:   ldc ", "
L306:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L309:   iload_2
L310:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L313:   ldc ", "
L315:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L318:   iload_3
L319:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L322:   ldc ", "
L324:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L327:   aload 4
L329:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L332:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L335:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L338:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L341:   new java/lang/RuntimeException
L344:   dup
L345:   invokespecial Method java/lang/RuntimeException <init> ()V
L348:   athrow
L349:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     sipush -32357
L8:     putfield Field VGXVBFVC b I
L11:    aload_0
L12:    iconst_0
L13:    putfield Field VGXVBFVC j Z
L16:    aload_0
L17:    iconst_1
L18:    putfield Field VGXVBFVC k Z
L21:    aload_0
L22:    iconst_0
L23:    putfield Field VGXVBFVC m Z
L26:    aload_0
L27:    iconst_0
L28:    putfield Field VGXVBFVC p Z
L31:    aload_0
L32:    iconst_m1
L33:    putfield Field VGXVBFVC q I
L36:    return
L37:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_1
L1:     putstatic Field VGXVBFVC a Z
L4:     return
L5:     
    .end code
.end method
.end class
