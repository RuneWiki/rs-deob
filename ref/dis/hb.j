.version 45 3
.class public final super hb
.super fb
.field private v Z
.field private w I
.field private x Z
.field private y I
.field private z B
.field public A [I
.field public B I
.field public C I
.field public D I
.field public E I
.field public F I
.field public G I

.method public <init> : (II)V
    .code stack 4 locals 3
L0:     aload_0
L1:     invokespecial Method fb <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field hb v Z
L9:     aload_0
L10:    iconst_0
L11:    putfield Field hb x Z
L14:    aload_0
L15:    sipush 15223
L18:    putfield Field hb y I
L21:    aload_0
L22:    iconst_5
L23:    putfield Field hb z B
L26:    aload_0
L27:    iload_1
L28:    iload_2
L29:    imul
L30:    newarray int
L32:    putfield Field hb A [I
L35:    aload_0
L36:    aload_0
L37:    iload_1
L38:    dup_x1
L39:    putfield Field hb F I
L42:    putfield Field hb B I
L45:    aload_0
L46:    aload_0
L47:    iload_2
L48:    dup_x1
L49:    putfield Field hb G I
L52:    putfield Field hb C I
L55:    aload_0
L56:    aload_0
L57:    iconst_0
L58:    dup_x1
L59:    putfield Field hb E I
L62:    putfield Field hb D I
L65:    return
L66:    
    .end code
.end method

.method public <init> : ([BLjava/awt/Component;)V
    .code stack 10 locals 6
L0:     aload_0
L1:     invokespecial Method fb <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field hb v Z
L9:     aload_0
L10:    iconst_0
L11:    putfield Field hb x Z
L14:    aload_0
L15:    sipush 15223
L18:    putfield Field hb y I
L21:    aload_0
L22:    iconst_5
L23:    putfield Field hb z B
        .catch java/lang/Exception from L26 to L150 using L151
L26:    invokestatic Method java/awt/Toolkit getDefaultToolkit ()Ljava/awt/Toolkit;
L29:    aload_1
L30:    invokevirtual Method java/awt/Toolkit createImage ([B)Ljava/awt/Image;
L33:    astore_3
L34:    new java/awt/MediaTracker
L37:    dup
L38:    aload_2
L39:    invokespecial Method java/awt/MediaTracker <init> (Ljava/awt/Component;)V
L42:    astore 4
L44:    aload 4
L46:    aload_3
L47:    iconst_0
L48:    invokevirtual Method java/awt/MediaTracker addImage (Ljava/awt/Image;I)V
L51:    aload 4
L53:    invokevirtual Method java/awt/MediaTracker waitForAll ()V
L56:    aload_0
L57:    aload_3
L58:    aload_2
L59:    invokevirtual Method java/awt/Image getWidth (Ljava/awt/image/ImageObserver;)I
L62:    putfield Field hb B I
L65:    aload_0
L66:    aload_3
L67:    aload_2
L68:    invokevirtual Method java/awt/Image getHeight (Ljava/awt/image/ImageObserver;)I
L71:    putfield Field hb C I
L74:    aload_0
L75:    aload_0
L76:    getfield Field hb B I
L79:    putfield Field hb F I
L82:    aload_0
L83:    aload_0
L84:    getfield Field hb C I
L87:    putfield Field hb G I
L90:    aload_0
L91:    iconst_0
L92:    putfield Field hb D I
L95:    aload_0
L96:    iconst_0
L97:    putfield Field hb E I
L100:   aload_0
L101:   aload_0
L102:   getfield Field hb B I
L105:   aload_0
L106:   getfield Field hb C I
L109:   imul
L110:   newarray int
L112:   putfield Field hb A [I
L115:   new java/awt/image/PixelGrabber
L118:   dup
L119:   aload_3
L120:   iconst_0
L121:   iconst_0
L122:   aload_0
L123:   getfield Field hb B I
L126:   aload_0
L127:   getfield Field hb C I
L130:   aload_0
L131:   getfield Field hb A [I
L134:   iconst_0
L135:   aload_0
L136:   getfield Field hb B I
L139:   invokespecial Method java/awt/image/PixelGrabber <init> (Ljava/awt/Image;IIII[III)V
L142:   astore 5
L144:   aload 5
L146:   invokevirtual Method java/awt/image/PixelGrabber grabPixels ()Z
L149:   pop
L150:   return
L151:   pop
L152:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L155:   ldc "Error converting jpg"
L157:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L160:   return
L161:   
    .end code
.end method

.method public <init> : (Lub;Ljava/lang/String;I)V
    .code stack 8 locals 15
L0:     getstatic Field fb u I
L3:     istore 14
L5:     aload_0
L6:     invokespecial Method fb <init> ()V
L9:     aload_0
L10:    iconst_0
L11:    putfield Field hb v Z
L14:    aload_0
L15:    iconst_0
L16:    putfield Field hb x Z
L19:    aload_0
L20:    sipush 15223
L23:    putfield Field hb y I
L26:    aload_0
L27:    iconst_5
L28:    putfield Field hb z B
L31:    new kb
L34:    dup
L35:    sipush 363
L38:    aload_1
L39:    new java/lang/StringBuffer
L42:    dup
L43:    aload_2
L44:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L47:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L50:    ldc ".dat"
L52:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L55:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L58:    aconst_null
L59:    iconst_2
L60:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L63:    invokespecial Method kb <init> (I[B)V
L66:    astore 4
L68:    new kb
L71:    dup
L72:    sipush 363
L75:    aload_1
L76:    ldc "index.dat"
L78:    aconst_null
L79:    iconst_2
L80:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L83:    invokespecial Method kb <init> (I[B)V
L86:    astore 5
L88:    aload 5
L90:    aload 4
L92:    invokevirtual Method kb e ()I
L95:    putfield Field kb r I
L98:    aload_0
L99:    aload 5
L101:   invokevirtual Method kb e ()I
L104:   putfield Field hb F I
L107:   aload_0
L108:   aload 5
L110:   invokevirtual Method kb e ()I
L113:   putfield Field hb G I
L116:   aload 5
L118:   invokevirtual Method kb c ()I
L121:   istore 6
L123:   iload 6
L125:   newarray int
L127:   astore 7
L129:   iconst_0
L130:   istore 8
L132:   iload 14
L134:   ifeq L170
L137:   aload 7
L139:   iload 8
L141:   iconst_1
L142:   iadd
L143:   aload 5
L145:   invokevirtual Method kb g ()I
L148:   iastore
L149:   aload 7
L151:   iload 8
L153:   iconst_1
L154:   iadd
L155:   iaload
L156:   ifne L167
L159:   aload 7
L161:   iload 8
L163:   iconst_1
L164:   iadd
L165:   iconst_1
L166:   iastore
L167:   iinc 8 1
L170:   iload 8
L172:   iload 6
L174:   iconst_1
L175:   isub
L176:   if_icmplt L137
L179:   iconst_0
L180:   istore 9
L182:   iload 14
L184:   ifeq L233
L187:   aload 5
L189:   dup
L190:   getfield Field kb r I
L193:   iconst_2
L194:   iadd
L195:   putfield Field kb r I
L198:   aload 4
L200:   dup
L201:   getfield Field kb r I
L204:   aload 5
L206:   invokevirtual Method kb e ()I
L209:   aload 5
L211:   invokevirtual Method kb e ()I
L214:   imul
L215:   iadd
L216:   putfield Field kb r I
L219:   aload 5
L221:   dup
L222:   getfield Field kb r I
L225:   iconst_1
L226:   iadd
L227:   putfield Field kb r I
L230:   iinc 9 1
L233:   iload 9
L235:   iload_3
L236:   if_icmplt L187
L239:   aload_0
L240:   aload 5
L242:   invokevirtual Method kb c ()I
L245:   putfield Field hb D I
L248:   aload_0
L249:   aload 5
L251:   invokevirtual Method kb c ()I
L254:   putfield Field hb E I
L257:   aload_0
L258:   aload 5
L260:   invokevirtual Method kb e ()I
L263:   putfield Field hb B I
L266:   aload_0
L267:   aload 5
L269:   invokevirtual Method kb e ()I
L272:   putfield Field hb C I
L275:   aload 5
L277:   invokevirtual Method kb c ()I
L280:   istore 10
L282:   aload_0
L283:   getfield Field hb B I
L286:   aload_0
L287:   getfield Field hb C I
L290:   imul
L291:   istore 11
L293:   aload_0
L294:   iload 11
L296:   newarray int
L298:   putfield Field hb A [I
L301:   iload 10
L303:   ifne L340
L306:   iconst_0
L307:   istore 12
L309:   iload 14
L311:   ifeq L332
L314:   aload_0
L315:   getfield Field hb A [I
L318:   iload 12
L320:   aload 7
L322:   aload 4
L324:   invokevirtual Method kb c ()I
L327:   iaload
L328:   iastore
L329:   iinc 12 1
L332:   iload 12
L334:   iload 11
L336:   if_icmplt L314
L339:   return
L340:   iload 10
L342:   iconst_1
L343:   if_icmpne L409
L346:   iconst_0
L347:   istore 12
L349:   iload 14
L351:   ifeq L400
L354:   iconst_0
L355:   istore 13
L357:   iload 14
L359:   ifeq L388
L362:   aload_0
L363:   getfield Field hb A [I
L366:   iload 12
L368:   iload 13
L370:   aload_0
L371:   getfield Field hb B I
L374:   imul
L375:   iadd
L376:   aload 7
L378:   aload 4
L380:   invokevirtual Method kb c ()I
L383:   iaload
L384:   iastore
L385:   iinc 13 1
L388:   iload 13
L390:   aload_0
L391:   getfield Field hb C I
L394:   if_icmplt L362
L397:   iinc 12 1
L400:   iload 12
L402:   aload_0
L403:   getfield Field hb B I
L406:   if_icmplt L354
L409:   return
L410:   
    .end code
.end method

.method public a : (B)V
    .code stack 5 locals 3
        .catch java/lang/RuntimeException from L0 to L39 using L40
L0:     iload_1
L1:     bipush 62
L3:     if_icmpeq L21
L6:     iconst_1
L7:     istore_2
L8:     getstatic Field fb u I
L11:    ifeq L17
L14:    iinc 2 1
L17:    iload_2
L18:    ifgt L14
L21:    aload_0
L22:    getfield Field hb B I
L25:    aload_0
L26:    getfield Field hb A [I
L29:    sipush -657
L32:    aload_0
L33:    getfield Field hb C I
L36:    invokestatic Method fb a (I[III)V
L39:    return
L40:    astore_2
L41:    new java/lang/StringBuffer
L44:    dup
L45:    ldc "23946, "
L47:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L50:    iload_1
L51:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L54:    ldc ", "
L56:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L59:    aload_2
L60:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L63:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L66:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L69:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L72:    new java/lang/RuntimeException
L75:    dup
L76:    invokespecial Method java/lang/RuntimeException <init> ()V
L79:    athrow
L80:    
    .end code
.end method

.method public a : (IIIZ)V
    .code stack 6 locals 11
L0:     getstatic Field fb u I
L3:     istore 10
        .catch java/lang/RuntimeException from L5 to L196 using L196
L5:     iconst_0
L6:     istore 5
L8:     iload 10
L10:    ifeq L180
L13:    aload_0
L14:    getfield Field hb A [I
L17:    iload 5
L19:    iaload
L20:    istore 6
L22:    iload 6
L24:    ifeq L177
L27:    iload 6
L29:    bipush 16
L31:    ishr
L32:    sipush 255
L35:    iand
L36:    istore 7
L38:    iload 7
L40:    iload_1
L41:    iadd
L42:    istore 7
L44:    iload 7
L46:    iconst_1
L47:    if_icmpge L58
L50:    iconst_1
L51:    istore 7
L53:    iload 10
L55:    ifeq L71
L58:    iload 7
L60:    sipush 255
L63:    if_icmple L71
L66:    sipush 255
L69:    istore 7
L71:    iload 6
L73:    bipush 8
L75:    ishr
L76:    sipush 255
L79:    iand
L80:    istore 8
L82:    iload 8
L84:    iload_2
L85:    iadd
L86:    istore 8
L88:    iload 8
L90:    iconst_1
L91:    if_icmpge L102
L94:    iconst_1
L95:    istore 8
L97:    iload 10
L99:    ifeq L115
L102:   iload 8
L104:   sipush 255
L107:   if_icmple L115
L110:   sipush 255
L113:   istore 8
L115:   iload 6
L117:   sipush 255
L120:   iand
L121:   istore 9
L123:   iload 9
L125:   iload_3
L126:   iadd
L127:   istore 9
L129:   iload 9
L131:   iconst_1
L132:   if_icmpge L143
L135:   iconst_1
L136:   istore 9
L138:   iload 10
L140:   ifeq L156
L143:   iload 9
L145:   sipush 255
L148:   if_icmple L156
L151:   sipush 255
L154:   istore 9
L156:   aload_0
L157:   getfield Field hb A [I
L160:   iload 5
L162:   iload 7
L164:   bipush 16
L166:   ishl
L167:   iload 8
L169:   bipush 8
L171:   ishl
L172:   iadd
L173:   iload 9
L175:   iadd
L176:   iastore
L177:   iinc 5 1
L180:   iload 5
L182:   aload_0
L183:   getfield Field hb A [I
L186:   arraylength
L187:   if_icmplt L13
L190:   iload 4
L192:   ifne L266
L195:   return
L196:   astore 5
L198:   new java/lang/StringBuffer
L201:   dup
L202:   ldc "44391, "
L204:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L207:   iload_1
L208:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L211:   ldc ", "
L213:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L216:   iload_2
L217:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L220:   ldc ", "
L222:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L225:   iload_3
L226:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L229:   ldc ", "
L231:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L234:   iload 4
L236:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L239:   ldc ", "
L241:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L244:   aload 5
L246:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L249:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L252:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L255:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L258:   new java/lang/RuntimeException
L261:   dup
L262:   invokespecial Method java/lang/RuntimeException <init> ()V
L265:   athrow
L266:   return
L267:   
    .end code
.end method

.method public a : (III)V
    .code stack 10 locals 11
        .catch java/lang/RuntimeException from L0 to L261 using L262
L0:     iload_2
L1:     aload_0
L2:     getfield Field hb D I
L5:     iadd
L6:     istore_2
L7:     iload_3
L8:     aload_0
L9:     getfield Field hb E I
L12:    iadd
L13:    istore_3
L14:    iload_2
L15:    iload_3
L16:    getstatic Field fb l I
L19:    imul
L20:    iadd
L21:    istore 4
L23:    iconst_0
L24:    istore 5
L26:    aload_0
L27:    getfield Field hb C I
L30:    istore 6
L32:    aload_0
L33:    getfield Field hb B I
L36:    istore 7
L38:    getstatic Field fb l I
L41:    iload 7
L43:    isub
L44:    istore 8
L46:    iconst_0
L47:    istore 9
L49:    iload_3
L50:    getstatic Field fb n I
L53:    if_icmpge L95
L56:    getstatic Field fb n I
L59:    iload_3
L60:    isub
L61:    istore 10
L63:    iload 6
L65:    iload 10
L67:    isub
L68:    istore 6
L70:    getstatic Field fb n I
L73:    istore_3
L74:    iload 5
L76:    iload 10
L78:    iload 7
L80:    imul
L81:    iadd
L82:    istore 5
L84:    iload 4
L86:    iload 10
L88:    getstatic Field fb l I
L91:    imul
L92:    iadd
L93:    istore 4
L95:    iload_3
L96:    iload 6
L98:    iadd
L99:    getstatic Field fb o I
L102:   if_icmple L118
L105:   iload 6
L107:   iload_3
L108:   iload 6
L110:   iadd
L111:   getstatic Field fb o I
L114:   isub
L115:   isub
L116:   istore 6
L118:   iload_2
L119:   getstatic Field fb p I
L122:   if_icmpge L171
L125:   getstatic Field fb p I
L128:   iload_2
L129:   isub
L130:   istore 10
L132:   iload 7
L134:   iload 10
L136:   isub
L137:   istore 7
L139:   getstatic Field fb p I
L142:   istore_2
L143:   iload 5
L145:   iload 10
L147:   iadd
L148:   istore 5
L150:   iload 4
L152:   iload 10
L154:   iadd
L155:   istore 4
L157:   iload 9
L159:   iload 10
L161:   iadd
L162:   istore 9
L164:   iload 8
L166:   iload 10
L168:   iadd
L169:   istore 8
L171:   iload_2
L172:   iload 7
L174:   iadd
L175:   getstatic Field fb q I
L178:   if_icmple L212
L181:   iload_2
L182:   iload 7
L184:   iadd
L185:   getstatic Field fb q I
L188:   isub
L189:   istore 10
L191:   iload 7
L193:   iload 10
L195:   isub
L196:   istore 7
L198:   iload 9
L200:   iload 10
L202:   iadd
L203:   istore 9
L205:   iload 8
L207:   iload 10
L209:   iadd
L210:   istore 8
L212:   iload 7
L214:   ifle L222
L217:   iload 6
L219:   ifgt L223
L222:   return
L223:   aload_0
L224:   sipush 15223
L227:   aload_0
L228:   getfield Field hb A [I
L231:   iload 8
L233:   iload 6
L235:   iload 5
L237:   iload 9
L239:   iload 4
L241:   iload 7
L243:   getstatic Field fb k [I
L246:   invokespecial Method hb a (I[IIIIIII[I)V
L249:   iload_1
L250:   ldc 34676
L252:   if_icmpeq L322
L255:   aload_0
L256:   bipush 117
L258:   putfield Field hb w I
L261:   return
L262:   astore 4
L264:   new java/lang/StringBuffer
L267:   dup
L268:   ldc "18242, "
L270:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L273:   iload_1
L274:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L277:   ldc ", "
L279:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L282:   iload_2
L283:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L286:   ldc ", "
L288:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L291:   iload_3
L292:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L295:   ldc ", "
L297:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L300:   aload 4
L302:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L305:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L308:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L311:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L314:   new java/lang/RuntimeException
L317:   dup
L318:   invokespecial Method java/lang/RuntimeException <init> ()V
L321:   athrow
L322:   return
L323:   
    .end code
.end method

.method private a : (I[IIIIIII[I)V
    .code stack 5 locals 15
L0:     getstatic Field fb u I
L3:     istore 14
        .catch java/lang/RuntimeException from L5 to L183 using L184
L5:     iload 8
L7:     iconst_2
L8:     ishr
L9:     ineg
L10:    istore 10
L12:    iload 8
L14:    iconst_3
L15:    iand
L16:    ineg
L17:    istore 8
L19:    iload 4
L21:    ineg
L22:    istore 11
L24:    iload 14
L26:    ifeq L154
L29:    iload 10
L31:    istore 12
L33:    iload 14
L35:    ifeq L101
L38:    aload 9
L40:    iload 7
L42:    iinc 7 1
L45:    aload_2
L46:    iload 5
L48:    iinc 5 1
L51:    iaload
L52:    iastore
L53:    aload 9
L55:    iload 7
L57:    iinc 7 1
L60:    aload_2
L61:    iload 5
L63:    iinc 5 1
L66:    iaload
L67:    iastore
L68:    aload 9
L70:    iload 7
L72:    iinc 7 1
L75:    aload_2
L76:    iload 5
L78:    iinc 5 1
L81:    iaload
L82:    iastore
L83:    aload 9
L85:    iload 7
L87:    iinc 7 1
L90:    aload_2
L91:    iload 5
L93:    iinc 5 1
L96:    iaload
L97:    iastore
L98:    iinc 12 1
L101:   iload 12
L103:   iflt L38
L106:   iload 8
L108:   istore 13
L110:   iload 14
L112:   ifeq L133
L115:   aload 9
L117:   iload 7
L119:   iinc 7 1
L122:   aload_2
L123:   iload 5
L125:   iinc 5 1
L128:   iaload
L129:   iastore
L130:   iinc 13 1
L133:   iload 13
L135:   iflt L115
L138:   iload 7
L140:   iload_3
L141:   iadd
L142:   istore 7
L144:   iload 5
L146:   iload 6
L148:   iadd
L149:   istore 5
L151:   iinc 11 1
L154:   iload 11
L156:   iflt L29
L159:   iload_1
L160:   aload_0
L161:   getfield Field hb y I
L164:   if_icmpeq L304
L167:   iconst_1
L168:   istore 12
L170:   iload 14
L172:   ifeq L178
L175:   iinc 12 1
L178:   iload 12
L180:   ifgt L175
L183:   return
L184:   astore 10
L186:   new java/lang/StringBuffer
L189:   dup
L190:   ldc "15160, "
L192:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L195:   iload_1
L196:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L199:   ldc ", "
L201:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L204:   aload_2
L205:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L208:   ldc ", "
L210:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L213:   iload_3
L214:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L217:   ldc ", "
L219:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L222:   iload 4
L224:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L227:   ldc ", "
L229:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L232:   iload 5
L234:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L237:   ldc ", "
L239:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L242:   iload 6
L244:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L247:   ldc ", "
L249:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L252:   iload 7
L254:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L257:   ldc ", "
L259:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L262:   iload 8
L264:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L267:   ldc ", "
L269:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L272:   aload 9
L274:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L277:   ldc ", "
L279:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L282:   aload 10
L284:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L287:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L290:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L293:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L296:   new java/lang/RuntimeException
L299:   dup
L300:   invokespecial Method java/lang/RuntimeException <init> ()V
L303:   athrow
L304:   return
L305:   
    .end code
.end method

.method public a : (IIZ)V
    .code stack 10 locals 11
        .catch java/lang/RuntimeException from L0 to L257 using L258
L0:     iload_3
L1:     ifeq L10
L4:     aload_0
L5:     bipush 32
L7:     putfield Field hb y I
L10:    iload_2
L11:    aload_0
L12:    getfield Field hb D I
L15:    iadd
L16:    istore_2
L17:    iload_1
L18:    aload_0
L19:    getfield Field hb E I
L22:    iadd
L23:    istore_1
L24:    iload_2
L25:    iload_1
L26:    getstatic Field fb l I
L29:    imul
L30:    iadd
L31:    istore 4
L33:    iconst_0
L34:    istore 5
L36:    aload_0
L37:    getfield Field hb C I
L40:    istore 6
L42:    aload_0
L43:    getfield Field hb B I
L46:    istore 7
L48:    getstatic Field fb l I
L51:    iload 7
L53:    isub
L54:    istore 8
L56:    iconst_0
L57:    istore 9
L59:    iload_1
L60:    getstatic Field fb n I
L63:    if_icmpge L105
L66:    getstatic Field fb n I
L69:    iload_1
L70:    isub
L71:    istore 10
L73:    iload 6
L75:    iload 10
L77:    isub
L78:    istore 6
L80:    getstatic Field fb n I
L83:    istore_1
L84:    iload 5
L86:    iload 10
L88:    iload 7
L90:    imul
L91:    iadd
L92:    istore 5
L94:    iload 4
L96:    iload 10
L98:    getstatic Field fb l I
L101:   imul
L102:   iadd
L103:   istore 4
L105:   iload_1
L106:   iload 6
L108:   iadd
L109:   getstatic Field fb o I
L112:   if_icmple L128
L115:   iload 6
L117:   iload_1
L118:   iload 6
L120:   iadd
L121:   getstatic Field fb o I
L124:   isub
L125:   isub
L126:   istore 6
L128:   iload_2
L129:   getstatic Field fb p I
L132:   if_icmpge L181
L135:   getstatic Field fb p I
L138:   iload_2
L139:   isub
L140:   istore 10
L142:   iload 7
L144:   iload 10
L146:   isub
L147:   istore 7
L149:   getstatic Field fb p I
L152:   istore_2
L153:   iload 5
L155:   iload 10
L157:   iadd
L158:   istore 5
L160:   iload 4
L162:   iload 10
L164:   iadd
L165:   istore 4
L167:   iload 9
L169:   iload 10
L171:   iadd
L172:   istore 9
L174:   iload 8
L176:   iload 10
L178:   iadd
L179:   istore 8
L181:   iload_2
L182:   iload 7
L184:   iadd
L185:   getstatic Field fb q I
L188:   if_icmple L222
L191:   iload_2
L192:   iload 7
L194:   iadd
L195:   getstatic Field fb q I
L198:   isub
L199:   istore 10
L201:   iload 7
L203:   iload 10
L205:   isub
L206:   istore 7
L208:   iload 9
L210:   iload 10
L212:   iadd
L213:   istore 9
L215:   iload 8
L217:   iload 10
L219:   iadd
L220:   istore 8
L222:   iload 7
L224:   ifle L232
L227:   iload 6
L229:   ifgt L233
L232:   return
L233:   aload_0
L234:   getstatic Field fb k [I
L237:   aload_0
L238:   getfield Field hb A [I
L241:   iconst_0
L242:   iload 5
L244:   iload 4
L246:   iload 7
L248:   iload 6
L250:   iload 8
L252:   iload 9
L254:   invokespecial Method hb a ([I[IIIIIIII)V
L257:   return
L258:   astore 4
L260:   new java/lang/StringBuffer
L263:   dup
L264:   ldc "90492, "
L266:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L269:   iload_1
L270:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L273:   ldc ", "
L275:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L278:   iload_2
L279:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L282:   ldc ", "
L284:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L287:   iload_3
L288:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L291:   ldc ", "
L293:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L296:   aload 4
L298:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L301:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L304:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L307:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L310:   new java/lang/RuntimeException
L313:   dup
L314:   invokespecial Method java/lang/RuntimeException <init> ()V
L317:   athrow
L318:   
    .end code
.end method

.method private a : ([I[IIIIIIII)V
    .code stack 4 locals 15
L0:     getstatic Field fb u I
L3:     istore 14
L5:     iload 6
L7:     iconst_2
L8:     ishr
L9:     ineg
L10:    istore 10
L12:    iload 6
L14:    iconst_3
L15:    iand
L16:    ineg
L17:    istore 6
L19:    iload 7
L21:    ineg
L22:    istore 11
L24:    iload 14
L26:    ifeq L220
L29:    iload 10
L31:    istore 12
L33:    iload 14
L35:    ifeq L153
L38:    aload_2
L39:    iload 4
L41:    iinc 4 1
L44:    iaload
L45:    istore_3
L46:    iload_3
L47:    ifeq L63
L50:    aload_1
L51:    iload 5
L53:    iinc 5 1
L56:    iload_3
L57:    iastore
L58:    iload 14
L60:    ifeq L66
L63:    iinc 5 1
L66:    aload_2
L67:    iload 4
L69:    iinc 4 1
L72:    iaload
L73:    istore_3
L74:    iload_3
L75:    ifeq L91
L78:    aload_1
L79:    iload 5
L81:    iinc 5 1
L84:    iload_3
L85:    iastore
L86:    iload 14
L88:    ifeq L94
L91:    iinc 5 1
L94:    aload_2
L95:    iload 4
L97:    iinc 4 1
L100:   iaload
L101:   istore_3
L102:   iload_3
L103:   ifeq L119
L106:   aload_1
L107:   iload 5
L109:   iinc 5 1
L112:   iload_3
L113:   iastore
L114:   iload 14
L116:   ifeq L122
L119:   iinc 5 1
L122:   aload_2
L123:   iload 4
L125:   iinc 4 1
L128:   iaload
L129:   istore_3
L130:   iload_3
L131:   ifeq L147
L134:   aload_1
L135:   iload 5
L137:   iinc 5 1
L140:   iload_3
L141:   iastore
L142:   iload 14
L144:   ifeq L150
L147:   iinc 5 1
L150:   iinc 12 1
L153:   iload 12
L155:   iflt L38
L158:   iload 6
L160:   istore 13
L162:   iload 14
L164:   ifeq L198
L167:   aload_2
L168:   iload 4
L170:   iinc 4 1
L173:   iaload
L174:   istore_3
L175:   iload_3
L176:   ifeq L192
L179:   aload_1
L180:   iload 5
L182:   iinc 5 1
L185:   iload_3
L186:   iastore
L187:   iload 14
L189:   ifeq L195
L192:   iinc 5 1
L195:   iinc 13 1
L198:   iload 13
L200:   iflt L167
L203:   iload 5
L205:   iload 8
L207:   iadd
L208:   istore 5
L210:   iload 4
L212:   iload 9
L214:   iadd
L215:   istore 4
L217:   iinc 11 1
L220:   iload 11
L222:   iflt L29
L225:   return
L226:   
    .end code
.end method

.method public d : (IIIII)V
    .code stack 14 locals 17
L0:     iload 4
L2:     sipush 17713
L5:     if_icmpeq L9
L8:     return
        .catch java/lang/Exception from L9 to L392 using L393
        .catch java/lang/RuntimeException from L0 to L403 using L403
L9:     aload_0
L10:    getfield Field hb B I
L13:    istore 6
L15:    aload_0
L16:    getfield Field hb C I
L19:    istore 7
L21:    iconst_0
L22:    istore 8
L24:    iconst_0
L25:    istore 9
L27:    iload 6
L29:    bipush 16
L31:    ishl
L32:    iload_3
L33:    idiv
L34:    istore 10
L36:    iload 7
L38:    bipush 16
L40:    ishl
L41:    iload_1
L42:    idiv
L43:    istore 11
L45:    aload_0
L46:    getfield Field hb F I
L49:    istore 12
L51:    aload_0
L52:    getfield Field hb G I
L55:    istore 13
L57:    iload 12
L59:    bipush 16
L61:    ishl
L62:    iload_3
L63:    idiv
L64:    istore 10
L66:    iload 13
L68:    bipush 16
L70:    ishl
L71:    iload_1
L72:    idiv
L73:    istore 11
L75:    iload 5
L77:    aload_0
L78:    getfield Field hb D I
L81:    iload_3
L82:    imul
L83:    iload 12
L85:    iadd
L86:    iconst_1
L87:    isub
L88:    iload 12
L90:    idiv
L91:    iadd
L92:    istore 5
L94:    iload_2
L95:    aload_0
L96:    getfield Field hb E I
L99:    iload_1
L100:   imul
L101:   iload 13
L103:   iadd
L104:   iconst_1
L105:   isub
L106:   iload 13
L108:   idiv
L109:   iadd
L110:   istore_2
L111:   aload_0
L112:   getfield Field hb D I
L115:   iload_3
L116:   imul
L117:   iload 12
L119:   irem
L120:   ifeq L142
L123:   iload 12
L125:   aload_0
L126:   getfield Field hb D I
L129:   iload_3
L130:   imul
L131:   iload 12
L133:   irem
L134:   isub
L135:   bipush 16
L137:   ishl
L138:   iload_3
L139:   idiv
L140:   istore 8
L142:   aload_0
L143:   getfield Field hb E I
L146:   iload_1
L147:   imul
L148:   iload 13
L150:   irem
L151:   ifeq L173
L154:   iload 13
L156:   aload_0
L157:   getfield Field hb E I
L160:   iload_1
L161:   imul
L162:   iload 13
L164:   irem
L165:   isub
L166:   bipush 16
L168:   ishl
L169:   iload_1
L170:   idiv
L171:   istore 9
L173:   iload_3
L174:   aload_0
L175:   getfield Field hb B I
L178:   iload 8
L180:   bipush 16
L182:   ishr
L183:   isub
L184:   imul
L185:   iload 12
L187:   idiv
L188:   istore_3
L189:   iload_1
L190:   aload_0
L191:   getfield Field hb C I
L194:   iload 9
L196:   bipush 16
L198:   ishr
L199:   isub
L200:   imul
L201:   iload 13
L203:   idiv
L204:   istore_1
L205:   iload 5
L207:   iload_2
L208:   getstatic Field fb l I
L211:   imul
L212:   iadd
L213:   istore 14
L215:   getstatic Field fb l I
L218:   iload_3
L219:   isub
L220:   istore 15
L222:   iload_2
L223:   getstatic Field fb n I
L226:   if_icmpge L264
L229:   getstatic Field fb n I
L232:   iload_2
L233:   isub
L234:   istore 16
L236:   iload_1
L237:   iload 16
L239:   isub
L240:   istore_1
L241:   iconst_0
L242:   istore_2
L243:   iload 14
L245:   iload 16
L247:   getstatic Field fb l I
L250:   imul
L251:   iadd
L252:   istore 14
L254:   iload 9
L256:   iload 11
L258:   iload 16
L260:   imul
L261:   iadd
L262:   istore 9
L264:   iload_2
L265:   iload_1
L266:   iadd
L267:   getstatic Field fb o I
L270:   if_icmple L283
L273:   iload_1
L274:   iload_2
L275:   iload_1
L276:   iadd
L277:   getstatic Field fb o I
L280:   isub
L281:   isub
L282:   istore_1
L283:   iload 5
L285:   getstatic Field fb p I
L288:   if_icmpge L331
L291:   getstatic Field fb p I
L294:   iload 5
L296:   isub
L297:   istore 16
L299:   iload_3
L300:   iload 16
L302:   isub
L303:   istore_3
L304:   iconst_0
L305:   istore 5
L307:   iload 14
L309:   iload 16
L311:   iadd
L312:   istore 14
L314:   iload 8
L316:   iload 10
L318:   iload 16
L320:   imul
L321:   iadd
L322:   istore 8
L324:   iload 15
L326:   iload 16
L328:   iadd
L329:   istore 15
L331:   iload 5
L333:   iload_3
L334:   iadd
L335:   getstatic Field fb q I
L338:   if_icmple L363
L341:   iload 5
L343:   iload_3
L344:   iadd
L345:   getstatic Field fb q I
L348:   isub
L349:   istore 16
L351:   iload_3
L352:   iload 16
L354:   isub
L355:   istore_3
L356:   iload 15
L358:   iload 16
L360:   iadd
L361:   istore 15
L363:   aload_0
L364:   iload 8
L366:   iload 10
L368:   getstatic Field fb k [I
L371:   iconst_0
L372:   iload 11
L374:   iload 9
L376:   iconst_0
L377:   aload_0
L378:   getfield Field hb A [I
L381:   iload 15
L383:   iload 14
L385:   iload_1
L386:   iload 6
L388:   iload_3
L389:   invokespecial Method hb a (II[IIIII[IIIIII)V
L392:   return
L393:   pop
L394:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L397:   ldc "error in sprite clipping routine"
L399:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L402:   return
L403:   astore 6
L405:   new java/lang/StringBuffer
L408:   dup
L409:   ldc "90121, "
L411:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L414:   iload_1
L415:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L418:   ldc ", "
L420:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L423:   iload_2
L424:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L427:   ldc ", "
L429:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L432:   iload_3
L433:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L436:   ldc ", "
L438:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L441:   iload 4
L443:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L446:   ldc ", "
L448:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L451:   iload 5
L453:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L456:   ldc ", "
L458:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L461:   aload 6
L463:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L466:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L469:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L472:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L475:   new java/lang/RuntimeException
L478:   dup
L479:   invokespecial Method java/lang/RuntimeException <init> ()V
L482:   athrow
L483:   
    .end code
.end method

.method private a : (II[IIIII[IIIIII)V
    .code stack 4 locals 19
L0:     getstatic Field fb u I
L3:     istore 18
L5:     iload 7
L7:     ifeq L26
L10:    iconst_1
L11:    istore 14
L13:    iload 18
L15:    ifeq L21
L18:    iinc 14 1
L21:    iload 14
L23:    ifgt L18
        .catch java/lang/Exception from L26 to L130 using L131
        .catch java/lang/RuntimeException from L5 to L141 using L141
L26:    iload_1
L27:    istore 14
L29:    iload 11
L31:    ineg
L32:    istore 15
L34:    iload 18
L36:    ifeq L125
L39:    iload 6
L41:    bipush 16
L43:    ishr
L44:    iload 12
L46:    imul
L47:    istore 16
L49:    iload 13
L51:    ineg
L52:    istore 17
L54:    iload 18
L56:    ifeq L100
L59:    aload 8
L61:    iload_1
L62:    bipush 16
L64:    ishr
L65:    iload 16
L67:    iadd
L68:    iaload
L69:    istore 4
L71:    iload 4
L73:    ifeq L90
L76:    aload_3
L77:    iload 10
L79:    iinc 10 1
L82:    iload 4
L84:    iastore
L85:    iload 18
L87:    ifeq L93
L90:    iinc 10 1
L93:    iload_1
L94:    iload_2
L95:    iadd
L96:    istore_1
L97:    iinc 17 1
L100:   iload 17
L102:   iflt L59
L105:   iload 6
L107:   iload 5
L109:   iadd
L110:   istore 6
L112:   iload 14
L114:   istore_1
L115:   iload 10
L117:   iload 9
L119:   iadd
L120:   istore 10
L122:   iinc 15 1
L125:   iload 15
L127:   iflt L39
L130:   return
L131:   pop
L132:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L135:   ldc "error in plot_scale"
L137:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L140:   return
L141:   astore 14
L143:   new java/lang/StringBuffer
L146:   dup
L147:   ldc "94187, "
L149:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L152:   iload_1
L153:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L156:   ldc ", "
L158:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L161:   iload_2
L162:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L165:   ldc ", "
L167:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L170:   aload_3
L171:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L174:   ldc ", "
L176:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L179:   iload 4
L181:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L184:   ldc ", "
L186:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L189:   iload 5
L191:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L194:   ldc ", "
L196:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L199:   iload 6
L201:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L204:   ldc ", "
L206:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L209:   iload 7
L211:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L214:   ldc ", "
L216:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L219:   aload 8
L221:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L224:   ldc ", "
L226:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L229:   iload 9
L231:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L234:   ldc ", "
L236:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L239:   iload 10
L241:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L244:   ldc ", "
L246:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L249:   iload 11
L251:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L254:   ldc ", "
L256:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L259:   iload 12
L261:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L264:   ldc ", "
L266:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L269:   iload 13
L271:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L274:   ldc ", "
L276:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L279:   aload 14
L281:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L284:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L287:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L290:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L293:   new java/lang/RuntimeException
L296:   dup
L297:   invokespecial Method java/lang/RuntimeException <init> ()V
L300:   athrow
L301:   
    .end code
.end method

.method public a : (IIIB)V
    .code stack 13 locals 12
        .catch java/lang/RuntimeException from L0 to L274 using L275
L0:     iload 4
L2:     bipush -26
L4:     if_icmpeq L24
L7:     iconst_1
L8:     istore 5
L10:    getstatic Field fb u I
L13:    ifeq L19
L16:    iinc 5 1
L19:    iload 5
L21:    ifgt L16
L24:    iload_2
L25:    aload_0
L26:    getfield Field hb D I
L29:    iadd
L30:    istore_2
L31:    iload_3
L32:    aload_0
L33:    getfield Field hb E I
L36:    iadd
L37:    istore_3
L38:    iload_2
L39:    iload_3
L40:    getstatic Field fb l I
L43:    imul
L44:    iadd
L45:    istore 5
L47:    iconst_0
L48:    istore 6
L50:    aload_0
L51:    getfield Field hb C I
L54:    istore 7
L56:    aload_0
L57:    getfield Field hb B I
L60:    istore 8
L62:    getstatic Field fb l I
L65:    iload 8
L67:    isub
L68:    istore 9
L70:    iconst_0
L71:    istore 10
L73:    iload_3
L74:    getstatic Field fb n I
L77:    if_icmpge L119
L80:    getstatic Field fb n I
L83:    iload_3
L84:    isub
L85:    istore 11
L87:    iload 7
L89:    iload 11
L91:    isub
L92:    istore 7
L94:    getstatic Field fb n I
L97:    istore_3
L98:    iload 6
L100:   iload 11
L102:   iload 8
L104:   imul
L105:   iadd
L106:   istore 6
L108:   iload 5
L110:   iload 11
L112:   getstatic Field fb l I
L115:   imul
L116:   iadd
L117:   istore 5
L119:   iload_3
L120:   iload 7
L122:   iadd
L123:   getstatic Field fb o I
L126:   if_icmple L142
L129:   iload 7
L131:   iload_3
L132:   iload 7
L134:   iadd
L135:   getstatic Field fb o I
L138:   isub
L139:   isub
L140:   istore 7
L142:   iload_2
L143:   getstatic Field fb p I
L146:   if_icmpge L195
L149:   getstatic Field fb p I
L152:   iload_2
L153:   isub
L154:   istore 11
L156:   iload 8
L158:   iload 11
L160:   isub
L161:   istore 8
L163:   getstatic Field fb p I
L166:   istore_2
L167:   iload 6
L169:   iload 11
L171:   iadd
L172:   istore 6
L174:   iload 5
L176:   iload 11
L178:   iadd
L179:   istore 5
L181:   iload 10
L183:   iload 11
L185:   iadd
L186:   istore 10
L188:   iload 9
L190:   iload 11
L192:   iadd
L193:   istore 9
L195:   iload_2
L196:   iload 8
L198:   iadd
L199:   getstatic Field fb q I
L202:   if_icmple L236
L205:   iload_2
L206:   iload 8
L208:   iadd
L209:   getstatic Field fb q I
L212:   isub
L213:   istore 11
L215:   iload 8
L217:   iload 11
L219:   isub
L220:   istore 8
L222:   iload 10
L224:   iload 11
L226:   iadd
L227:   istore 10
L229:   iload 9
L231:   iload 11
L233:   iadd
L234:   istore 9
L236:   iload 8
L238:   ifle L246
L241:   iload 7
L243:   ifgt L247
L246:   return
L247:   aload_0
L248:   iload 5
L250:   iconst_0
L251:   aload_0
L252:   getfield Field hb A [I
L255:   iload_1
L256:   iload 7
L258:   getstatic Field fb k [I
L261:   iload 6
L263:   bipush 8
L265:   iload 8
L267:   iload 9
L269:   iload 10
L271:   invokespecial Method hb a (II[III[IIBIII)V
L274:   return
L275:   astore 5
L277:   new java/lang/StringBuffer
L280:   dup
L281:   ldc "1642, "
L283:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L286:   iload_1
L287:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L290:   ldc ", "
L292:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L295:   iload_2
L296:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L299:   ldc ", "
L301:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L304:   iload_3
L305:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L308:   ldc ", "
L310:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L313:   iload 4
L315:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L318:   ldc ", "
L320:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L323:   aload 5
L325:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L328:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L331:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L334:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L337:   new java/lang/RuntimeException
L340:   dup
L341:   invokespecial Method java/lang/RuntimeException <init> ()V
L344:   athrow
L345:   
    .end code
.end method

.method private a : (II[III[IIBIII)V
    .code stack 7 locals 17
L0:     getstatic Field fb u I
L3:     istore 16
        .catch java/lang/RuntimeException from L5 to L159 using L160
L5:     sipush 256
L8:     iload 4
L10:    isub
L11:    istore 12
L13:    iload 8
L15:    bipush 8
L17:    if_icmpeq L36
L20:    aload_0
L21:    aload_0
L22:    getfield Field hb v Z
L25:    ifeq L32
L28:    iconst_0
L29:    goto L33
L32:    iconst_1
L33:    putfield Field hb v Z
L36:    iload 5
L38:    ineg
L39:    istore 13
L41:    iload 16
L43:    ifeq L154
L46:    iload 9
L48:    ineg
L49:    istore 14
L51:    iload 16
L53:    ifeq L134
L56:    aload_3
L57:    iload 7
L59:    iinc 7 1
L62:    iaload
L63:    istore_2
L64:    iload_2
L65:    ifeq L128
L68:    aload 6
L70:    iload_1
L71:    iaload
L72:    istore 15
L74:    aload 6
L76:    iload_1
L77:    iinc 1 1
L80:    iload_2
L81:    ldc 16711935
L83:    iand
L84:    iload 4
L86:    imul
L87:    iload 15
L89:    ldc 16711935
L91:    iand
L92:    iload 12
L94:    imul
L95:    iadd
L96:    ldc -16711936
L98:    iand
L99:    iload_2
L100:   ldc 65280
L102:   iand
L103:   iload 4
L105:   imul
L106:   iload 15
L108:   ldc 65280
L110:   iand
L111:   iload 12
L113:   imul
L114:   iadd
L115:   ldc 16711680
L117:   iand
L118:   iadd
L119:   bipush 8
L121:   ishr
L122:   iastore
L123:   iload 16
L125:   ifeq L131
L128:   iinc 1 1
L131:   iinc 14 1
L134:   iload 14
L136:   iflt L56
L139:   iload_1
L140:   iload 10
L142:   iadd
L143:   istore_1
L144:   iload 7
L146:   iload 11
L148:   iadd
L149:   istore 7
L151:   iinc 13 1
L154:   iload 13
L156:   iflt L46
L159:   return
L160:   astore 12
L162:   new java/lang/StringBuffer
L165:   dup
L166:   ldc "62265, "
L168:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L171:   iload_1
L172:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L175:   ldc ", "
L177:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L180:   iload_2
L181:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L184:   ldc ", "
L186:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L189:   aload_3
L190:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L193:   ldc ", "
L195:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L198:   iload 4
L200:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L203:   ldc ", "
L205:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L208:   iload 5
L210:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L213:   ldc ", "
L215:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L218:   aload 6
L220:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L223:   ldc ", "
L225:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L228:   iload 7
L230:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L233:   ldc ", "
L235:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L238:   iload 8
L240:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L243:   ldc ", "
L245:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L248:   iload 9
L250:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L253:   ldc ", "
L255:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L258:   iload 10
L260:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L263:   ldc ", "
L265:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L268:   iload 11
L270:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L273:   ldc ", "
L275:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L278:   aload 12
L280:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L283:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L286:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L289:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L292:   new java/lang/RuntimeException
L295:   dup
L296:   invokespecial Method java/lang/RuntimeException <init> ()V
L299:   athrow
L300:   
    .end code
.end method

.method public a : (II[IIIIIIIZ[I)V
    .code stack 7 locals 24
L0:     getstatic Field fb u I
L3:     istore 23
L5:     iload 10
L7:     ifeq L26
L10:    aload_0
L11:    aload_0
L12:    getfield Field hb x Z
L15:    ifeq L22
L18:    iconst_0
L19:    goto L23
L22:    iconst_1
L23:    putfield Field hb x Z
        .catch java/lang/Exception from L26 to L278 using L279
        .catch java/lang/RuntimeException from L5 to L281 using L281
L26:    iload_2
L27:    ineg
L28:    iconst_2
L29:    idiv
L30:    istore 12
L32:    iload 4
L34:    ineg
L35:    iconst_2
L36:    idiv
L37:    istore 13
L39:    iload_1
L40:    i2d
L41:    ldc2_w 3.2611e2
L44:    ddiv
L45:    invokestatic Method java/lang/Math sin (D)D
L48:    ldc2_w 6.5536e4
L51:    dmul
L52:    d2i
L53:    istore 14
L55:    iload_1
L56:    i2d
L57:    ldc2_w 3.2611e2
L60:    ddiv
L61:    invokestatic Method java/lang/Math cos (D)D
L64:    ldc2_w 6.5536e4
L67:    dmul
L68:    d2i
L69:    istore 15
L71:    iload 14
L73:    iload 6
L75:    imul
L76:    bipush 8
L78:    ishr
L79:    istore 14
L81:    iload 15
L83:    iload 6
L85:    imul
L86:    bipush 8
L88:    ishr
L89:    istore 15
L91:    iload 7
L93:    bipush 16
L95:    ishl
L96:    iload 13
L98:    iload 14
L100:   imul
L101:   iload 12
L103:   iload 15
L105:   imul
L106:   iadd
L107:   iadd
L108:   istore 16
L110:   iload 5
L112:   bipush 16
L114:   ishl
L115:   iload 13
L117:   iload 15
L119:   imul
L120:   iload 12
L122:   iload 14
L124:   imul
L125:   isub
L126:   iadd
L127:   istore 17
L129:   iload 8
L131:   iload 9
L133:   getstatic Field fb l I
L136:   imul
L137:   iadd
L138:   istore 18
L140:   iconst_0
L141:   istore 9
L143:   iload 23
L145:   ifeq L271
L148:   aload_3
L149:   iload 9
L151:   iaload
L152:   istore 19
L154:   iload 18
L156:   iload 19
L158:   iadd
L159:   istore 20
L161:   iload 16
L163:   iload 15
L165:   iload 19
L167:   imul
L168:   iadd
L169:   istore 21
L171:   iload 17
L173:   iload 14
L175:   iload 19
L177:   imul
L178:   isub
L179:   istore 22
L181:   aload 11
L183:   iload 9
L185:   iaload
L186:   ineg
L187:   istore 8
L189:   iload 23
L191:   ifeq L241
L194:   getstatic Field fb k [I
L197:   iload 20
L199:   iinc 20 1
L202:   aload_0
L203:   getfield Field hb A [I
L206:   iload 21
L208:   bipush 16
L210:   ishr
L211:   iload 22
L213:   bipush 16
L215:   ishr
L216:   aload_0
L217:   getfield Field hb B I
L220:   imul
L221:   iadd
L222:   iaload
L223:   iastore
L224:   iload 21
L226:   iload 15
L228:   iadd
L229:   istore 21
L231:   iload 22
L233:   iload 14
L235:   isub
L236:   istore 22
L238:   iinc 8 1
L241:   iload 8
L243:   iflt L194
L246:   iload 16
L248:   iload 14
L250:   iadd
L251:   istore 16
L253:   iload 17
L255:   iload 15
L257:   iadd
L258:   istore 17
L260:   iload 18
L262:   getstatic Field fb l I
L265:   iadd
L266:   istore 18
L268:   iinc 9 1
L271:   iload 9
L273:   iload 4
L275:   if_icmplt L148
L278:   return
L279:   pop
L280:   return
L281:   astore 12
L283:   new java/lang/StringBuffer
L286:   dup
L287:   ldc "53177, "
L289:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L292:   iload_1
L293:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L296:   ldc ", "
L298:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L301:   iload_2
L302:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L305:   ldc ", "
L307:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L310:   aload_3
L311:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L314:   ldc ", "
L316:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L319:   iload 4
L321:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L324:   ldc ", "
L326:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L329:   iload 5
L331:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L334:   ldc ", "
L336:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L339:   iload 6
L341:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L344:   ldc ", "
L346:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L349:   iload 7
L351:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L354:   ldc ", "
L356:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L359:   iload 8
L361:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L364:   ldc ", "
L366:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L369:   iload 9
L371:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L374:   ldc ", "
L376:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L379:   iload 10
L381:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L384:   ldc ", "
L386:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L389:   aload 11
L391:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L394:   ldc ", "
L396:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L399:   aload 12
L401:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L404:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L407:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L410:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L413:   new java/lang/RuntimeException
L416:   dup
L417:   invokespecial Method java/lang/RuntimeException <init> ()V
L420:   athrow
L421:   
    .end code
.end method

.method public a : (Lib;IIB)V
    .code stack 12 locals 12
        .catch java/lang/RuntimeException from L0 to L262 using L263
L0:     iload_3
L1:     aload_0
L2:     getfield Field hb D I
L5:     iadd
L6:     istore_3
L7:     iload_2
L8:     aload_0
L9:     getfield Field hb E I
L12:    iadd
L13:    istore_2
L14:    iload_3
L15:    iload_2
L16:    getstatic Field fb l I
L19:    imul
L20:    iadd
L21:    istore 5
L23:    iconst_0
L24:    istore 6
L26:    iload 4
L28:    bipush -15
L30:    if_icmpeq L34
L33:    return
L34:    aload_0
L35:    getfield Field hb C I
L38:    istore 7
L40:    aload_0
L41:    getfield Field hb B I
L44:    istore 8
L46:    getstatic Field fb l I
L49:    iload 8
L51:    isub
L52:    istore 9
L54:    iconst_0
L55:    istore 10
L57:    iload_2
L58:    getstatic Field fb n I
L61:    if_icmpge L103
L64:    getstatic Field fb n I
L67:    iload_2
L68:    isub
L69:    istore 11
L71:    iload 7
L73:    iload 11
L75:    isub
L76:    istore 7
L78:    getstatic Field fb n I
L81:    istore_2
L82:    iload 6
L84:    iload 11
L86:    iload 8
L88:    imul
L89:    iadd
L90:    istore 6
L92:    iload 5
L94:    iload 11
L96:    getstatic Field fb l I
L99:    imul
L100:   iadd
L101:   istore 5
L103:   iload_2
L104:   iload 7
L106:   iadd
L107:   getstatic Field fb o I
L110:   if_icmple L126
L113:   iload 7
L115:   iload_2
L116:   iload 7
L118:   iadd
L119:   getstatic Field fb o I
L122:   isub
L123:   isub
L124:   istore 7
L126:   iload_3
L127:   getstatic Field fb p I
L130:   if_icmpge L179
L133:   getstatic Field fb p I
L136:   iload_3
L137:   isub
L138:   istore 11
L140:   iload 8
L142:   iload 11
L144:   isub
L145:   istore 8
L147:   getstatic Field fb p I
L150:   istore_3
L151:   iload 6
L153:   iload 11
L155:   iadd
L156:   istore 6
L158:   iload 5
L160:   iload 11
L162:   iadd
L163:   istore 5
L165:   iload 10
L167:   iload 11
L169:   iadd
L170:   istore 10
L172:   iload 9
L174:   iload 11
L176:   iadd
L177:   istore 9
L179:   iload_3
L180:   iload 8
L182:   iadd
L183:   getstatic Field fb q I
L186:   if_icmple L220
L189:   iload_3
L190:   iload 8
L192:   iadd
L193:   getstatic Field fb q I
L196:   isub
L197:   istore 11
L199:   iload 8
L201:   iload 11
L203:   isub
L204:   istore 8
L206:   iload 10
L208:   iload 11
L210:   iadd
L211:   istore 10
L213:   iload 9
L215:   iload 11
L217:   iadd
L218:   istore 9
L220:   iload 8
L222:   ifle L230
L225:   iload 7
L227:   ifgt L231
L230:   return
L231:   aload_0
L232:   iload 8
L234:   iload 10
L236:   iconst_0
L237:   sipush -478
L240:   iload 7
L242:   iload 6
L244:   getstatic Field fb k [I
L247:   aload_0
L248:   getfield Field hb A [I
L251:   iload 5
L253:   aload_1
L254:   getfield Field ib z [B
L257:   iload 9
L259:   invokespecial Method hb a (IIIIII[I[II[BI)V
L262:   return
L263:   astore 5
L265:   new java/lang/StringBuffer
L268:   dup
L269:   ldc "13593, "
L271:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L274:   aload_1
L275:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L278:   ldc ", "
L280:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L283:   iload_2
L284:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L287:   ldc ", "
L289:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L292:   iload_3
L293:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L296:   ldc ", "
L298:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L301:   iload 4
L303:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L306:   ldc ", "
L308:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L311:   aload 5
L313:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L316:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L319:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L322:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L325:   new java/lang/RuntimeException
L328:   dup
L329:   invokespecial Method java/lang/RuntimeException <init> ()V
L332:   athrow
L333:   
    .end code
.end method

.method private a : (IIIIII[I[II[BI)V
    .code stack 4 locals 17
L0:     getstatic Field fb u I
L3:     istore 16
        .catch java/lang/RuntimeException from L5 to L276 using L277
L5:     iload 4
L7:     iflt L11
L10:    return
L11:    iload_1
L12:    iconst_2
L13:    ishr
L14:    ineg
L15:    istore 12
L17:    iload_1
L18:    iconst_3
L19:    iand
L20:    ineg
L21:    istore_1
L22:    iload 5
L24:    ineg
L25:    istore 13
L27:    iload 16
L29:    ifeq L271
L32:    iload 12
L34:    istore 14
L36:    iload 16
L38:    ifeq L196
L41:    aload 8
L43:    iload 6
L45:    iinc 6 1
L48:    iaload
L49:    istore_3
L50:    iload_3
L51:    ifeq L76
L54:    aload 10
L56:    iload 9
L58:    baload
L59:    ifne L76
L62:    aload 7
L64:    iload 9
L66:    iinc 9 1
L69:    iload_3
L70:    iastore
L71:    iload 16
L73:    ifeq L79
L76:    iinc 9 1
L79:    aload 8
L81:    iload 6
L83:    iinc 6 1
L86:    iaload
L87:    istore_3
L88:    iload_3
L89:    ifeq L114
L92:    aload 10
L94:    iload 9
L96:    baload
L97:    ifne L114
L100:   aload 7
L102:   iload 9
L104:   iinc 9 1
L107:   iload_3
L108:   iastore
L109:   iload 16
L111:   ifeq L117
L114:   iinc 9 1
L117:   aload 8
L119:   iload 6
L121:   iinc 6 1
L124:   iaload
L125:   istore_3
L126:   iload_3
L127:   ifeq L152
L130:   aload 10
L132:   iload 9
L134:   baload
L135:   ifne L152
L138:   aload 7
L140:   iload 9
L142:   iinc 9 1
L145:   iload_3
L146:   iastore
L147:   iload 16
L149:   ifeq L155
L152:   iinc 9 1
L155:   aload 8
L157:   iload 6
L159:   iinc 6 1
L162:   iaload
L163:   istore_3
L164:   iload_3
L165:   ifeq L190
L168:   aload 10
L170:   iload 9
L172:   baload
L173:   ifne L190
L176:   aload 7
L178:   iload 9
L180:   iinc 9 1
L183:   iload_3
L184:   iastore
L185:   iload 16
L187:   ifeq L193
L190:   iinc 9 1
L193:   iinc 14 1
L196:   iload 14
L198:   iflt L41
L201:   iload_1
L202:   istore 15
L204:   iload 16
L206:   ifeq L250
L209:   aload 8
L211:   iload 6
L213:   iinc 6 1
L216:   iaload
L217:   istore_3
L218:   iload_3
L219:   ifeq L244
L222:   aload 10
L224:   iload 9
L226:   baload
L227:   ifne L244
L230:   aload 7
L232:   iload 9
L234:   iinc 9 1
L237:   iload_3
L238:   iastore
L239:   iload 16
L241:   ifeq L247
L244:   iinc 9 1
L247:   iinc 15 1
L250:   iload 15
L252:   iflt L209
L255:   iload 9
L257:   iload 11
L259:   iadd
L260:   istore 9
L262:   iload 6
L264:   iload_2
L265:   iadd
L266:   istore 6
L268:   iinc 13 1
L271:   iload 13
L273:   iflt L32
L276:   return
L277:   astore 12
L279:   new java/lang/StringBuffer
L282:   dup
L283:   ldc "76267, "
L285:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L288:   iload_1
L289:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L292:   ldc ", "
L294:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L297:   iload_2
L298:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L301:   ldc ", "
L303:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L306:   iload_3
L307:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L310:   ldc ", "
L312:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L315:   iload 4
L317:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L320:   ldc ", "
L322:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L325:   iload 5
L327:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L330:   ldc ", "
L332:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L335:   iload 6
L337:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L340:   ldc ", "
L342:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L345:   aload 7
L347:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L350:   ldc ", "
L352:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L355:   aload 8
L357:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L360:   ldc ", "
L362:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L365:   iload 9
L367:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L370:   ldc ", "
L372:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L375:   aload 10
L377:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L380:   ldc ", "
L382:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L385:   iload 11
L387:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L390:   ldc ", "
L392:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L395:   aload 12
L397:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L400:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L403:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L406:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L409:   new java/lang/RuntimeException
L412:   dup
L413:   invokespecial Method java/lang/RuntimeException <init> ()V
L416:   athrow
L417:   
    .end code
.end method
.end class
