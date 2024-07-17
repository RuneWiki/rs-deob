.version 45 3
.class public super lc
.super java/lang/Object
.field private static a I
.field private static b I
.field public static c I
.field public static d [Llc;
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
.field public o Z

.method public static a : (Lub;I)V
    .code stack 8 locals 4
        .catch java/lang/RuntimeException from L0 to L115 using L116
L0:     new kb
L3:     dup
L4:     sipush 363
L7:     aload_0
L8:     ldc "varp.dat"
L10:    aconst_null
L11:    iconst_2
L12:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L15:    invokespecial Method kb <init> (I[B)V
L18:    astore_2
L19:    iconst_0
L20:    putstatic Field lc e I
L23:    bipush 28
L25:    iload_1
L26:    idiv
L27:    istore_1
L28:    aload_2
L29:    invokevirtual Method kb e ()I
L32:    putstatic Field lc c I
L35:    getstatic Field lc d [Llc;
L38:    ifnonnull L50
L41:    getstatic Field lc c I
L44:    anewarray lc
L47:    putstatic Field lc d [Llc;
L50:    getstatic Field lc f [I
L53:    ifnonnull L64
L56:    getstatic Field lc c I
L59:    newarray int
L61:    putstatic Field lc f [I
L64:    iconst_0
L65:    istore_3
L66:    getstatic Field jc p Z
L69:    ifeq L108
L72:    getstatic Field lc d [Llc;
L75:    iload_3
L76:    aaload
L77:    ifnonnull L92
L80:    getstatic Field lc d [Llc;
L83:    iload_3
L84:    new lc
L87:    dup
L88:    invokespecial Method lc <init> ()V
L91:    aastore
L92:    getstatic Field lc d [Llc;
L95:    iload_3
L96:    aaload
L97:    getstatic Field lc b I
L100:   iload_3
L101:   aload_2
L102:   invokevirtual Method lc a (IILkb;)V
L105:   iinc 3 1
L108:   iload_3
L109:   getstatic Field lc c I
L112:   if_icmplt L72
L115:   return
L116:   astore_2
L117:   new java/lang/StringBuffer
L120:   dup
L121:   ldc "45283, "
L123:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L126:   aload_0
L127:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L130:   ldc ", "
L132:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L135:   iload_1
L136:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L139:   ldc ", "
L141:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L144:   aload_2
L145:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L148:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L151:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L154:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L157:   new java/lang/RuntimeException
L160:   dup
L161:   invokespecial Method java/lang/RuntimeException <init> ()V
L164:   athrow
L165:   
    .end code
.end method

.method public a : (IILkb;)V
    .code stack 5 locals 6
L0:     getstatic Field jc p Z
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L228 using L228
L5:     iload_1
L6:     sipush 13703
L9:     if_icmpeq L13
L12:    return
L13:    aload_3
L14:    invokevirtual Method kb c ()I
L17:    istore 4
L19:    iload 4
L21:    ifne L25
L24:    return
L25:    iload 4
L27:    iconst_1
L28:    if_icmpne L44
L31:    aload_0
L32:    aload_3
L33:    invokevirtual Method kb c ()I
L36:    putfield Field lc h I
L39:    iload 5
L41:    ifeq L13
L44:    iload 4
L46:    iconst_2
L47:    if_icmpne L63
L50:    aload_0
L51:    aload_3
L52:    invokevirtual Method kb c ()I
L55:    putfield Field lc i I
L58:    iload 5
L60:    ifeq L13
L63:    iload 4
L65:    iconst_3
L66:    if_icmpne L93
L69:    aload_0
L70:    iconst_1
L71:    putfield Field lc j Z
L74:    getstatic Field lc f [I
L77:    getstatic Field lc e I
L80:    dup
L81:    iconst_1
L82:    iadd
L83:    putstatic Field lc e I
L86:    iload_2
L87:    iastore
L88:    iload 5
L90:    ifeq L13
L93:    iload 4
L95:    iconst_4
L96:    if_icmpne L109
L99:    aload_0
L100:   iconst_0
L101:   putfield Field lc k Z
L104:   iload 5
L106:   ifeq L13
L109:   iload 4
L111:   iconst_5
L112:   if_icmpne L128
L115:   aload_0
L116:   aload_3
L117:   invokevirtual Method kb e ()I
L120:   putfield Field lc l I
L123:   iload 5
L125:   ifeq L13
L128:   iload 4
L130:   bipush 6
L132:   if_icmpne L145
L135:   aload_0
L136:   iconst_1
L137:   putfield Field lc m Z
L140:   iload 5
L142:   ifeq L13
L145:   iload 4
L147:   bipush 7
L149:   if_icmpne L165
L152:   aload_0
L153:   aload_3
L154:   invokevirtual Method kb h ()I
L157:   putfield Field lc n I
L160:   iload 5
L162:   ifeq L13
L165:   iload 4
L167:   bipush 8
L169:   if_icmpne L182
L172:   aload_0
L173:   iconst_1
L174:   putfield Field lc o Z
L177:   iload 5
L179:   ifeq L13
L182:   iload 4
L184:   bipush 10
L186:   if_icmpne L202
L189:   aload_0
L190:   aload_3
L191:   invokevirtual Method kb i ()Ljava/lang/String;
L194:   putfield Field lc g Ljava/lang/String;
L197:   iload 5
L199:   ifeq L13
L202:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L205:   new java/lang/StringBuffer
L208:   dup
L209:   ldc "Error unrecognised config code: "
L211:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L214:   iload 4
L216:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L219:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L222:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L225:   goto L13
L228:   astore 4
L230:   new java/lang/StringBuffer
L233:   dup
L234:   ldc "67426, "
L236:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L239:   iload_1
L240:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L243:   ldc ", "
L245:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L248:   iload_2
L249:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L252:   ldc ", "
L254:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L257:   aload_3
L258:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L261:   ldc ", "
L263:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L266:   aload 4
L268:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L271:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L274:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L277:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L280:   new java/lang/RuntimeException
L283:   dup
L284:   invokespecial Method java/lang/RuntimeException <init> ()V
L287:   athrow
L288:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field lc j Z
L9:     aload_0
L10:    iconst_1
L11:    putfield Field lc k Z
L14:    aload_0
L15:    iconst_0
L16:    putfield Field lc m Z
L19:    aload_0
L20:    iconst_0
L21:    putfield Field lc o Z
L24:    return
L25:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush 473
L3:     putstatic Field lc a I
L6:     sipush 13703
L9:     putstatic Field lc b I
L12:    return
L13:    
    .end code
.end method
.end class
