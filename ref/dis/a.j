.version 45 3
.class public super a
.super java/applet/Applet
.implements java/lang/Runnable
.implements java/awt/event/MouseListener
.implements java/awt/event/MouseMotionListener
.implements java/awt/event/KeyListener
.implements java/awt/event/FocusListener
.implements java/awt/event/WindowListener
.field private a Z
.field private b Z
.field private c I
.field private d Z
.field private e B
.field private f I
.field private g I
.field private h I
.field public i I
.field private j [J
.field public k I
.field public l I
.field public m I
.field public n Ljava/awt/Graphics;
.field public o Lqb;
.field public p [Lhb;
.field public q Lb;
.field public r Z
.field public s I
.field public t I
.field public u I
.field public v I
.field public w I
.field public x I
.field public y I
.field public z [I
.field private A [I
.field private B I
.field private C I
.field public static D I

.method public final a : (III)V
    .code stack 7 locals 5
        .catch java/lang/RuntimeException from L0 to L94 using L95
L0:     iload_3
L1:     ifeq L11
L4:     aload_0
L5:     sipush 411
L8:     putfield Field a c I
L11:    aload_0
L12:    iload_2
L13:    putfield Field a l I
L16:    aload_0
L17:    iload_1
L18:    putfield Field a m I
L21:    aload_0
L22:    new b
L25:    dup
L26:    aload_0
L27:    getfield Field a m I
L30:    ldc 35731
L32:    aload_0
L33:    aload_0
L34:    getfield Field a l I
L37:    invokespecial Method b <init> (IILa;I)V
L40:    putfield Field a q Lb;
L43:    aload_0
L44:    aload_0
L45:    aload_0
L46:    getfield Field a e B
L49:    invokevirtual Method a b (B)Ljava/awt/Component;
L52:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L55:    putfield Field a n Ljava/awt/Graphics;
L58:    aload_0
L59:    new qb
L62:    dup
L63:    aload_0
L64:    aload_0
L65:    getfield Field a e B
L68:    invokevirtual Method a b (B)Ljava/awt/Component;
L71:    aload_0
L72:    getfield Field a l I
L75:    sipush 299
L78:    aload_0
L79:    getfield Field a m I
L82:    invokespecial Method qb <init> (Ljava/awt/Component;III)V
L85:    putfield Field a o Lqb;
L88:    aload_0
L89:    aload_0
L90:    iconst_1
L91:    invokevirtual Method a a (Ljava/lang/Runnable;I)V
L94:    return
L95:    astore 4
L97:    new java/lang/StringBuffer
L100:   dup
L101:   ldc "32828, "
L103:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L106:   iload_1
L107:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L110:   ldc ", "
L112:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L115:   iload_2
L116:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L119:   ldc ", "
L121:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L124:   iload_3
L125:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L128:   ldc ", "
L130:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L133:   aload 4
L135:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L138:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L141:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L144:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L147:   new java/lang/RuntimeException
L150:   dup
L151:   invokespecial Method java/lang/RuntimeException <init> ()V
L154:   athrow
L155:   
    .end code
.end method

.method public final a : (IZI)V
    .code stack 7 locals 5
        .catch java/lang/RuntimeException from L0 to L72 using L73
L0:     aload_0
L1:     iload_3
L2:     putfield Field a l I
L5:     aload_0
L6:     iload_1
L7:     putfield Field a m I
L10:    aload_0
L11:    aload_0
L12:    aload_0
L13:    getfield Field a e B
L16:    invokevirtual Method a b (B)Ljava/awt/Component;
L19:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L22:    putfield Field a n Ljava/awt/Graphics;
L25:    aload_0
L26:    new qb
L29:    dup
L30:    aload_0
L31:    aload_0
L32:    getfield Field a e B
L35:    invokevirtual Method a b (B)Ljava/awt/Component;
L38:    aload_0
L39:    getfield Field a l I
L42:    sipush 299
L45:    aload_0
L46:    getfield Field a m I
L49:    invokespecial Method qb <init> (Ljava/awt/Component;III)V
L52:    putfield Field a o Lqb;
L55:    iload_2
L56:    ifeq L66
L59:    aload_0
L60:    sipush -370
L63:    putfield Field a c I
L66:    aload_0
L67:    aload_0
L68:    iconst_1
L69:    invokevirtual Method a a (Ljava/lang/Runnable;I)V
L72:    return
L73:    astore 4
L75:    new java/lang/StringBuffer
L78:    dup
L79:    ldc "68129, "
L81:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L84:    iload_1
L85:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L88:    ldc ", "
L90:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L93:    iload_2
L94:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L97:    ldc ", "
L99:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L102:   iload_3
L103:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L106:   ldc ", "
L108:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L111:   aload 4
L113:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L116:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L119:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L122:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L125:   new java/lang/RuntimeException
L128:   dup
L129:   invokespecial Method java/lang/RuntimeException <init> ()V
L132:   athrow
L133:   
    .end code
.end method

.method public run : ()V
    .code stack 7 locals 12
L0:     getstatic Field a D I
L3:     istore 11
L5:     aload_0
L6:     aload_0
L7:     getfield Field a e B
L10:    invokevirtual Method a b (B)Ljava/awt/Component;
L13:    aload_0
L14:    invokevirtual Method java/awt/Component addMouseListener (Ljava/awt/event/MouseListener;)V
L17:    aload_0
L18:    aload_0
L19:    getfield Field a e B
L22:    invokevirtual Method a b (B)Ljava/awt/Component;
L25:    aload_0
L26:    invokevirtual Method java/awt/Component addMouseMotionListener (Ljava/awt/event/MouseMotionListener;)V
L29:    aload_0
L30:    aload_0
L31:    getfield Field a e B
L34:    invokevirtual Method a b (B)Ljava/awt/Component;
L37:    aload_0
L38:    invokevirtual Method java/awt/Component addKeyListener (Ljava/awt/event/KeyListener;)V
L41:    aload_0
L42:    aload_0
L43:    getfield Field a e B
L46:    invokevirtual Method a b (B)Ljava/awt/Component;
L49:    aload_0
L50:    invokevirtual Method java/awt/Component addFocusListener (Ljava/awt/event/FocusListener;)V
L53:    aload_0
L54:    getfield Field a q Lb;
L57:    ifnull L68
L60:    aload_0
L61:    getfield Field a q Lb;
L64:    aload_0
L65:    invokevirtual Method java/awt/Window addWindowListener (Ljava/awt/event/WindowListener;)V
L68:    aload_0
L69:    iconst_1
L70:    ldc "Loading..."
L72:    iconst_0
L73:    invokevirtual Method a a (ZLjava/lang/String;I)V
L76:    aload_0
L77:    invokevirtual Method a a ()V
L80:    iconst_0
L81:    istore_3
L82:    sipush 256
L85:    istore 4
L87:    iconst_1
L88:    istore 5
L90:    iconst_0
L91:    istore 6
L93:    iconst_0
L94:    istore 7
L96:    iload 11
L98:    ifeq L114
L101:   aload_0
L102:   getfield Field a j [J
L105:   iload 7
L107:   invokestatic Method java/lang/System currentTimeMillis ()J
L110:   lastore
L111:   iinc 7 1
L114:   iload 7
L116:   bipush 10
L118:   if_icmplt L101
L121:   invokestatic Method java/lang/System currentTimeMillis ()J
L124:   lstore_1
L125:   iload 11
L127:   ifeq L450
L130:   aload_0
L131:   getfield Field a g I
L134:   ifle L162
L137:   aload_0
L138:   dup
L139:   getfield Field a g I
L142:   iconst_1
L143:   isub
L144:   putfield Field a g I
L147:   aload_0
L148:   getfield Field a g I
L151:   ifne L162
L154:   aload_0
L155:   sipush -652
L158:   invokevirtual Method a a (I)V
L161:   return
L162:   iload 4
L164:   istore 8
L166:   iload 5
L168:   istore 9
L170:   sipush 300
L173:   istore 4
L175:   iconst_1
L176:   istore 5
L178:   invokestatic Method java/lang/System currentTimeMillis ()J
L181:   lstore_1
L182:   aload_0
L183:   getfield Field a j [J
L186:   iload_3
L187:   laload
L188:   lconst_0
L189:   lcmp
L190:   ifne L206
L193:   iload 8
L195:   istore 4
L197:   iload 9
L199:   istore 5
L201:   iload 11
L203:   ifeq L238
L206:   lload_1
L207:   aload_0
L208:   getfield Field a j [J
L211:   iload_3
L212:   laload
L213:   lcmp
L214:   ifle L238
L217:   sipush 2560
L220:   aload_0
L221:   getfield Field a h I
L224:   imul
L225:   i2l
L226:   lload_1
L227:   aload_0
L228:   getfield Field a j [J
L231:   iload_3
L232:   laload
L233:   lsub
L234:   ldiv
L235:   l2i
L236:   istore 4
L238:   iload 4
L240:   bipush 25
L242:   if_icmpge L249
L245:   bipush 25
L247:   istore 4
L249:   iload 4
L251:   sipush 256
L254:   if_icmple L283
L257:   sipush 256
L260:   istore 4
L262:   aload_0
L263:   getfield Field a h I
L266:   i2l
L267:   lload_1
L268:   aload_0
L269:   getfield Field a j [J
L272:   iload_3
L273:   laload
L274:   lsub
L275:   ldc2_w 10L
L278:   ldiv
L279:   lsub
L280:   l2i
L281:   istore 5
L283:   aload_0
L284:   getfield Field a j [J
L287:   iload_3
L288:   lload_1
L289:   lastore
L290:   iload_3
L291:   iconst_1
L292:   iadd
L293:   bipush 10
L295:   irem
L296:   istore_3
L297:   iload 5
L299:   iconst_1
L300:   if_icmple L346
L303:   iconst_0
L304:   istore 10
L306:   iload 11
L308:   ifeq L339
L311:   aload_0
L312:   getfield Field a j [J
L315:   iload 10
L317:   laload
L318:   lconst_0
L319:   lcmp
L320:   ifeq L336
L323:   aload_0
L324:   getfield Field a j [J
L327:   iload 10
L329:   dup2
L330:   laload
L331:   iload 5
L333:   i2l
L334:   ladd
L335:   lastore
L336:   iinc 10 1
L339:   iload 10
L341:   bipush 10
L343:   if_icmplt L311
L346:   iload 5
L348:   aload_0
L349:   getfield Field a i I
L352:   if_icmpge L361
L355:   aload_0
L356:   getfield Field a i I
L359:   istore 5
        .catch java/lang/InterruptedException from L361 to L367 using L370
L361:   iload 5
L363:   i2l
L364:   invokestatic Method java/lang/Thread sleep (J)V
L367:   goto L403
L370:   pop
L371:   iload 11
L373:   ifeq L403
L376:   aload_0
L377:   sipush 437
L380:   invokevirtual Method a b (I)V
L383:   aload_0
L384:   iconst_0
L385:   putfield Field a w I
L388:   aload_0
L389:   aload_0
L390:   getfield Field a C I
L393:   putfield Field a B I
L396:   iload 6
L398:   iload 4
L400:   iadd
L401:   istore 6
L403:   iload 6
L405:   sipush 256
L408:   if_icmplt L376
L411:   iload 6
L413:   sipush 255
L416:   iand
L417:   istore 6
L419:   aload_0
L420:   getfield Field a h I
L423:   ifle L445
L426:   aload_0
L427:   sipush 1000
L430:   iload 4
L432:   imul
L433:   aload_0
L434:   getfield Field a h I
L437:   sipush 256
L440:   imul
L441:   idiv
L442:   putfield Field a k I
L445:   aload_0
L446:   iconst_0
L447:   invokevirtual Method a b (Z)V
L450:   aload_0
L451:   getfield Field a g I
L454:   ifge L130
L457:   aload_0
L458:   getfield Field a g I
L461:   iconst_m1
L462:   if_icmpne L472
L465:   aload_0
L466:   sipush -652
L469:   invokevirtual Method a a (I)V
L472:   return
L473:   
    .end code
.end method

.method public final a : (I)V
    .code stack 4 locals 3
L0:     getstatic Field a D I
L3:     ifeq L22
L6:     aload_0
L7:     aload_0
L8:     getfield Field a d Z
L11:    ifeq L18
L14:    iconst_0
L15:    goto L19
L18:    iconst_1
L19:    putfield Field a d Z
L22:    iload_1
L23:    ifge L6
L26:    aload_0
L27:    bipush -2
L29:    putfield Field a g I
L32:    aload_0
L33:    bipush -28
L35:    invokevirtual Method a a (B)V
        .catch java/lang/Exception from L38 to L44 using L47
L38:    ldc2_w 1000L
L41:    invokestatic Method java/lang/Thread sleep (J)V
L44:    goto L48
L47:    pop
        .catch java/lang/Throwable from L48 to L52 using L53
        .catch java/lang/RuntimeException from L0 to L55 using L55
L48:    iconst_0
L49:    invokestatic Method java/lang/System exit (I)V
L52:    return
L53:    pop
L54:    return
L55:    astore_2
L56:    new java/lang/StringBuffer
L59:    dup
L60:    ldc "31182, "
L62:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L65:    iload_1
L66:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L69:    ldc ", "
L71:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L74:    aload_2
L75:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L78:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L81:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L84:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L87:    new java/lang/RuntimeException
L90:    dup
L91:    invokespecial Method java/lang/RuntimeException <init> ()V
L94:    athrow
L95:    
    .end code
.end method

.method public final a : (II)V
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L29 using L30
L0:     aload_0
L1:     sipush 1000
L4:     iload_2
L5:     idiv
L6:     putfield Field a h I
L9:     iload_1
L10:    ifgt L79
L13:    aload_0
L14:    aload_0
L15:    getfield Field a a Z
L18:    ifeq L25
L21:    iconst_0
L22:    goto L26
L25:    iconst_1
L26:    putfield Field a a Z
L29:    return
L30:    astore_3
L31:    new java/lang/StringBuffer
L34:    dup
L35:    ldc "9789, "
L37:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L40:    iload_1
L41:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L44:    ldc ", "
L46:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L49:    iload_2
L50:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L53:    ldc ", "
L55:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L58:    aload_3
L59:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L65:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L68:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L71:    new java/lang/RuntimeException
L74:    dup
L75:    invokespecial Method java/lang/RuntimeException <init> ()V
L78:    athrow
L79:    return
L80:    
    .end code
.end method

.method public final start : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     getfield Field a g I
L4:     iflt L12
L7:     aload_0
L8:     iconst_0
L9:     putfield Field a g I
L12:    return
L13:    
    .end code
.end method

.method public final stop : ()V
    .code stack 3 locals 1
L0:     aload_0
L1:     getfield Field a g I
L4:     iflt L19
L7:     aload_0
L8:     sipush 4000
L11:    aload_0
L12:    getfield Field a h I
L15:    idiv
L16:    putfield Field a g I
L19:    return
L20:    
    .end code
.end method

.method public final destroy : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     iconst_m1
L2:     putfield Field a g I
        .catch java/lang/Exception from L5 to L11 using L14
L5:     ldc2_w 5000L
L8:     invokestatic Method java/lang/Thread sleep (J)V
L11:    goto L15
L14:    pop
L15:    aload_0
L16:    getfield Field a g I
L19:    iconst_m1
L20:    if_icmpne L30
L23:    aload_0
L24:    sipush -652
L27:    invokevirtual Method a a (I)V
L30:    return
L31:    
    .end code
.end method

.method public final update : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field a n Ljava/awt/Graphics;
L4:     ifnonnull L12
L7:     aload_0
L8:     aload_1
L9:     putfield Field a n Ljava/awt/Graphics;
L12:    aload_0
L13:    iconst_1
L14:    putfield Field a r Z
L17:    aload_0
L18:    iconst_3
L19:    invokevirtual Method a c (I)V
L22:    return
L23:    
    .end code
.end method

.method public final paint : (Ljava/awt/Graphics;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field a n Ljava/awt/Graphics;
L4:     ifnonnull L12
L7:     aload_0
L8:     aload_1
L9:     putfield Field a n Ljava/awt/Graphics;
L12:    aload_0
L13:    iconst_1
L14:    putfield Field a r Z
L17:    aload_0
L18:    iconst_3
L19:    invokevirtual Method a c (I)V
L22:    return
L23:    
    .end code
.end method

.method public final mousePressed : (Ljava/awt/event/MouseEvent;)V
    .code stack 5 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field a q Lb;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field a s I
L28:    aload_0
L29:    iload_2
L30:    putfield Field a x I
L33:    aload_0
L34:    iload_3
L35:    putfield Field a y I
L38:    aload_1
L39:    invokevirtual Method java/awt/event/InputEvent isMetaDown ()Z
L42:    ifeq L61
L45:    aload_0
L46:    iconst_2
L47:    putfield Field a w I
L50:    aload_0
L51:    iconst_2
L52:    putfield Field a t I
L55:    getstatic Field a D I
L58:    ifeq L71
L61:    aload_0
L62:    iconst_1
L63:    putfield Field a w I
L66:    aload_0
L67:    iconst_1
L68:    putfield Field a t I
L71:    getstatic Field e e Z
L74:    ifeq L95
L77:    iload_2
L78:    aload_1
L79:    invokevirtual Method java/awt/event/InputEvent isMetaDown ()Z
L82:    ifeq L89
L85:    iconst_1
L86:    goto L90
L89:    iconst_0
L90:    iload_3
L91:    iconst_4
L92:    invokestatic Method e a (IIIB)V
L95:    return
L96:    
    .end code
.end method

.method public final mouseReleased : (Ljava/awt/event/MouseEvent;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_0
L2:     putfield Field a s I
L5:     aload_0
L6:     iconst_0
L7:     putfield Field a t I
L10:    getstatic Field e e Z
L13:    ifeq L32
L16:    aload_1
L17:    invokevirtual Method java/awt/event/InputEvent isMetaDown ()Z
L20:    ifeq L27
L23:    iconst_1
L24:    goto L28
L27:    iconst_0
L28:    iconst_0
L29:    invokestatic Method e b (II)V
L32:    return
L33:    
    .end code
.end method

.method public final mouseClicked : (Ljava/awt/event/MouseEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final mouseEntered : (Ljava/awt/event/MouseEvent;)V
    .code stack 1 locals 2
L0:     getstatic Field e e Z
L3:     ifeq L12
L6:     sipush -657
L9:     invokestatic Method e f (I)V
L12:    return
L13:    
    .end code
.end method

.method public final mouseExited : (Ljava/awt/event/MouseEvent;)V
    .code stack 1 locals 2
L0:     getstatic Field e e Z
L3:     ifeq L10
L6:     iconst_0
L7:     invokestatic Method e a (Z)V
L10:    return
L11:    
    .end code
.end method

.method public final mouseDragged : (Ljava/awt/event/MouseEvent;)V
    .code stack 3 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field a q Lb;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field a s I
L28:    aload_0
L29:    iload_2
L30:    putfield Field a u I
L33:    aload_0
L34:    iload_3
L35:    putfield Field a v I
L38:    getstatic Field e e Z
L41:    ifeq L50
L44:    iload_3
L45:    iconst_1
L46:    iload_2
L47:    invokestatic Method e a (IZI)V
L50:    return
L51:    
    .end code
.end method

.method public final mouseMoved : (Ljava/awt/event/MouseEvent;)V
    .code stack 3 locals 4
L0:     aload_1
L1:     invokevirtual Method java/awt/event/MouseEvent getX ()I
L4:     istore_2
L5:     aload_1
L6:     invokevirtual Method java/awt/event/MouseEvent getY ()I
L9:     istore_3
L10:    aload_0
L11:    getfield Field a q Lb;
L14:    ifnull L23
L17:    iinc 2 -4
L20:    iinc 3 -22
L23:    aload_0
L24:    iconst_0
L25:    putfield Field a s I
L28:    aload_0
L29:    iload_2
L30:    putfield Field a u I
L33:    aload_0
L34:    iload_3
L35:    putfield Field a v I
L38:    getstatic Field e e Z
L41:    ifeq L50
L44:    iload_3
L45:    iconst_1
L46:    iload_2
L47:    invokestatic Method e a (IZI)V
L50:    return
L51:    
    .end code
.end method

.method public final keyPressed : (Ljava/awt/event/KeyEvent;)V
    .code stack 4 locals 5
L0:     getstatic Field a D I
L3:     istore 4
L5:     aload_0
L6:     iconst_0
L7:     putfield Field a s I
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L14:    istore_2
L15:    aload_1
L16:    invokevirtual Method java/awt/event/KeyEvent getKeyChar ()C
L19:    istore_3
L20:    iload_3
L21:    bipush 30
L23:    if_icmpge L28
L26:    iconst_0
L27:    istore_3
L28:    iload_2
L29:    bipush 37
L31:    if_icmpne L36
L34:    iconst_1
L35:    istore_3
L36:    iload_2
L37:    bipush 39
L39:    if_icmpne L44
L42:    iconst_2
L43:    istore_3
L44:    iload_2
L45:    bipush 38
L47:    if_icmpne L52
L50:    iconst_3
L51:    istore_3
L52:    iload_2
L53:    bipush 40
L55:    if_icmpne L60
L58:    iconst_4
L59:    istore_3
L60:    iload_2
L61:    bipush 17
L63:    if_icmpne L68
L66:    iconst_5
L67:    istore_3
L68:    iload_2
L69:    bipush 8
L71:    if_icmpne L77
L74:    bipush 8
L76:    istore_3
L77:    iload_2
L78:    bipush 127
L80:    if_icmpne L86
L83:    bipush 8
L85:    istore_3
L86:    iload_2
L87:    bipush 9
L89:    if_icmpne L95
L92:    bipush 9
L94:    istore_3
L95:    iload_2
L96:    bipush 10
L98:    if_icmpne L104
L101:   bipush 10
L103:   istore_3
L104:   iload_2
L105:   bipush 112
L107:   if_icmplt L125
L110:   iload_2
L111:   bipush 123
L113:   if_icmpgt L125
L116:   sipush 1008
L119:   iload_2
L120:   iadd
L121:   bipush 112
L123:   isub
L124:   istore_3
L125:   iload_2
L126:   bipush 36
L128:   if_icmpne L135
L131:   sipush 1000
L134:   istore_3
L135:   iload_2
L136:   bipush 35
L138:   if_icmpne L145
L141:   sipush 1001
L144:   istore_3
L145:   iload_2
L146:   bipush 33
L148:   if_icmpne L155
L151:   sipush 1002
L154:   istore_3
L155:   iload_2
L156:   bipush 34
L158:   if_icmpne L165
L161:   sipush 1003
L164:   istore_3
L165:   iload_3
L166:   ifle L183
L169:   iload_3
L170:   sipush 128
L173:   if_icmpge L183
L176:   aload_0
L177:   getfield Field a z [I
L180:   iload_3
L181:   iconst_1
L182:   iastore
L183:   iload_3
L184:   iconst_4
L185:   if_icmple L211
L188:   aload_0
L189:   getfield Field a A [I
L192:   aload_0
L193:   getfield Field a C I
L196:   iload_3
L197:   iastore
L198:   aload_0
L199:   aload_0
L200:   getfield Field a C I
L203:   iconst_1
L204:   iadd
L205:   bipush 127
L207:   iand
L208:   putfield Field a C I
L211:   getstatic Field e e Z
L214:   ifeq L222
L217:   iload_3
L218:   iconst_1
L219:   invokestatic Method e a (IZ)V
L222:   getstatic Field u d I
L225:   ifeq L236
L228:   iinc 4 1
L231:   iload 4
L233:   putstatic Field a D I
L236:   return
L237:   
    .end code
.end method

.method public final keyReleased : (Ljava/awt/event/KeyEvent;)V
    .code stack 3 locals 4
L0:     aload_0
L1:     iconst_0
L2:     putfield Field a s I
L5:     aload_1
L6:     invokevirtual Method java/awt/event/KeyEvent getKeyCode ()I
L9:     istore_2
L10:    aload_1
L11:    invokevirtual Method java/awt/event/KeyEvent getKeyChar ()C
L14:    istore_3
L15:    iload_3
L16:    bipush 30
L18:    if_icmpge L23
L21:    iconst_0
L22:    istore_3
L23:    iload_2
L24:    bipush 37
L26:    if_icmpne L31
L29:    iconst_1
L30:    istore_3
L31:    iload_2
L32:    bipush 39
L34:    if_icmpne L39
L37:    iconst_2
L38:    istore_3
L39:    iload_2
L40:    bipush 38
L42:    if_icmpne L47
L45:    iconst_3
L46:    istore_3
L47:    iload_2
L48:    bipush 40
L50:    if_icmpne L55
L53:    iconst_4
L54:    istore_3
L55:    iload_2
L56:    bipush 17
L58:    if_icmpne L63
L61:    iconst_5
L62:    istore_3
L63:    iload_2
L64:    bipush 8
L66:    if_icmpne L72
L69:    bipush 8
L71:    istore_3
L72:    iload_2
L73:    bipush 127
L75:    if_icmpne L81
L78:    bipush 8
L80:    istore_3
L81:    iload_2
L82:    bipush 9
L84:    if_icmpne L90
L87:    bipush 9
L89:    istore_3
L90:    iload_2
L91:    bipush 10
L93:    if_icmpne L99
L96:    bipush 10
L98:    istore_3
L99:    iload_3
L100:   ifle L117
L103:   iload_3
L104:   sipush 128
L107:   if_icmpge L117
L110:   aload_0
L111:   getfield Field a z [I
L114:   iload_3
L115:   iconst_0
L116:   iastore
L117:   getstatic Field e e Z
L120:   ifeq L128
L123:   iload_3
L124:   iconst_1
L125:   invokestatic Method e c (II)V
L128:   return
L129:   
    .end code
.end method

.method public final keyTyped : (Ljava/awt/event/KeyEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final focusGained : (Ljava/awt/event/FocusEvent;)V
    .code stack 2 locals 2
L0:     aload_0
L1:     iconst_1
L2:     putfield Field a r Z
L5:     aload_0
L6:     iconst_3
L7:     invokevirtual Method a c (I)V
L10:    getstatic Field e e Z
L13:    ifeq L22
L16:    sipush -936
L19:    invokestatic Method e d (I)V
L22:    return
L23:    
    .end code
.end method

.method public final focusLost : (Ljava/awt/event/FocusEvent;)V
    .code stack 1 locals 2
L0:     getstatic Field e e Z
L3:     ifeq L10
L6:     iconst_0
L7:     invokestatic Method e e (I)V
L10:    return
L11:    
    .end code
.end method

.method public final a : (Z)I
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L44 using L44
L0:     iconst_m1
L1:     istore_2
L2:     iload_1
L3:     ifeq L8
L6:     iconst_2
L7:     ireturn
L8:     aload_0
L9:     getfield Field a C I
L12:    aload_0
L13:    getfield Field a B I
L16:    if_icmpeq L42
L19:    aload_0
L20:    getfield Field a A [I
L23:    aload_0
L24:    getfield Field a B I
L27:    iaload
L28:    istore_2
L29:    aload_0
L30:    aload_0
L31:    getfield Field a B I
L34:    iconst_1
L35:    iadd
L36:    bipush 127
L38:    iand
L39:    putfield Field a B I
L42:    iload_2
L43:    ireturn
L44:    astore_2
L45:    new java/lang/StringBuffer
L48:    dup
L49:    ldc "3026, "
L51:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L54:    iload_1
L55:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L58:    ldc ", "
L60:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L63:    aload_2
L64:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L67:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L70:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L73:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L76:    new java/lang/RuntimeException
L79:    dup
L80:    invokespecial Method java/lang/RuntimeException <init> ()V
L83:    athrow
L84:    
    .end code
.end method

.method public final windowActivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowClosed : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowClosing : (Ljava/awt/event/WindowEvent;)V
    .code stack 1 locals 2
L0:     aload_0
L1:     invokevirtual Method a destroy ()V
L4:     return
L5:     
    .end code
.end method

.method public final windowDeactivated : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowDeiconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowIconified : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public final windowOpened : (Ljava/awt/event/WindowEvent;)V
    .code stack 0 locals 2
L0:     return
L1:     
    .end code
.end method

.method public a : ()V
    .code stack 0 locals 1
L0:     return
L1:     
    .end code
.end method

.method public b : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L20 using L21
L0:     iload_1
L1:     ifgt L61
L4:     aload_0
L5:     aload_0
L6:     getfield Field a b Z
L9:     ifeq L16
L12:    iconst_0
L13:    goto L17
L16:    iconst_1
L17:    putfield Field a b Z
L20:    return
L21:    astore_2
L22:    new java/lang/StringBuffer
L25:    dup
L26:    ldc "39582, "
L28:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L31:    iload_1
L32:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L35:    ldc ", "
L37:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L40:    aload_2
L41:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L44:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L47:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L50:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L53:    new java/lang/RuntimeException
L56:    dup
L57:    invokespecial Method java/lang/RuntimeException <init> ()V
L60:    athrow
L61:    return
L62:    
    .end code
.end method

.method public a : (B)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L13 using L14
L0:     iload_1
L1:     bipush -28
L3:     if_icmpeq L54
L6:     aload_0
L7:     sipush -407
L10:    putfield Field a f I
L13:    return
L14:    astore_2
L15:    new java/lang/StringBuffer
L18:    dup
L19:    ldc "60526, "
L21:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L24:    iload_1
L25:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L28:    ldc ", "
L30:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L33:    aload_2
L34:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L37:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L40:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L43:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L46:    new java/lang/RuntimeException
L49:    dup
L50:    invokespecial Method java/lang/RuntimeException <init> ()V
L53:    athrow
L54:    return
L55:    
    .end code
.end method

.method public b : (Z)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L20 using L21
L0:     iload_1
L1:     ifeq L61
L4:     aload_0
L5:     aload_0
L6:     getfield Field a d Z
L9:     ifeq L16
L12:    iconst_0
L13:    goto L17
L16:    iconst_1
L17:    putfield Field a d Z
L20:    return
L21:    astore_2
L22:    new java/lang/StringBuffer
L25:    dup
L26:    ldc "89494, "
L28:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L31:    iload_1
L32:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L35:    ldc ", "
L37:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L40:    aload_2
L41:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L44:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L47:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L50:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L53:    new java/lang/RuntimeException
L56:    dup
L57:    invokespecial Method java/lang/RuntimeException <init> ()V
L60:    athrow
L61:    return
L62:    
    .end code
.end method

.method public c : (I)V
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L26 using L27
L0:     iload_1
L1:     iconst_3
L2:     if_icmplt L10
L5:     iload_1
L6:     iconst_3
L7:     if_icmple L26
L10:    aload_0
L11:    aload_0
L12:    getfield Field a b Z
L15:    ifeq L22
L18:    iconst_0
L19:    goto L23
L22:    iconst_1
L23:    putfield Field a b Z
L26:    return
L27:    astore_2
L28:    new java/lang/StringBuffer
L31:    dup
L32:    ldc "40825, "
L34:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L37:    iload_1
L38:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L41:    ldc ", "
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    aload_2
L47:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L50:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L53:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L56:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L59:    new java/lang/RuntimeException
L62:    dup
L63:    invokespecial Method java/lang/RuntimeException <init> ()V
L66:    athrow
L67:    
    .end code
.end method

.method public b : (B)Ljava/awt/Component;
    .code stack 3 locals 3
        .catch java/lang/RuntimeException from L0 to L27 using L27
L0:     iload_1
L1:     iconst_3
L2:     if_icmpeq L13
L5:     new java/lang/NullPointerException
L8:     dup
L9:     invokespecial Method java/lang/NullPointerException <init> ()V
L12:    athrow
L13:    aload_0
L14:    getfield Field a q Lb;
L17:    ifnull L25
L20:    aload_0
L21:    getfield Field a q Lb;
L24:    areturn
L25:    aload_0
L26:    areturn
L27:    astore_2
L28:    new java/lang/StringBuffer
L31:    dup
L32:    ldc "24145, "
L34:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L37:    iload_1
L38:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L41:    ldc ", "
L43:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L46:    aload_2
L47:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L50:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L53:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L56:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L59:    new java/lang/RuntimeException
L62:    dup
L63:    invokespecial Method java/lang/RuntimeException <init> ()V
L66:    athrow
L67:    
    .end code
.end method

.method public a : (Ljava/lang/Runnable;I)V
    .code stack 3 locals 4
L0:     new java/lang/Thread
L3:     dup
L4:     aload_1
L5:     invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L8:     astore_3
L9:     aload_3
L10:    invokevirtual Method java/lang/Thread start ()V
L13:    aload_3
L14:    iload_2
L15:    invokevirtual Method java/lang/Thread setPriority (I)V
L18:    return
L19:    
    .end code
.end method

.method public a : (ZLjava/lang/String;I)V
    .code stack 7 locals 11
L0:     getstatic Field a D I
L3:     istore 9
L5:     iload 9
L7:     ifeq L66
L10:    getstatic Field u d I
L13:    istore 10
L15:    iinc 10 1
L18:    iload 10
L20:    putstatic Field u d I
L23:    aload_0
L24:    aload_0
L25:    aload_0
L26:    getfield Field a e B
L29:    invokevirtual Method a b (B)Ljava/awt/Component;
L32:    invokevirtual Method java/awt/Component getGraphics ()Ljava/awt/Graphics;
L35:    putfield Field a n Ljava/awt/Graphics;
        .catch java/lang/Exception from L38 to L49 using L52
L38:    aload_0
L39:    aload_0
L40:    getfield Field a e B
L43:    invokevirtual Method a b (B)Ljava/awt/Component;
L46:    invokevirtual Method java/awt/Component repaint ()V
L49:    goto L53
L52:    pop
        .catch java/lang/Exception from L53 to L59 using L62
        .catch java/lang/RuntimeException from L5 to L349 using L350
L53:    ldc2_w 1000L
L56:    invokestatic Method java/lang/Thread sleep (J)V
L59:    goto L66
L62:    pop
L63:    goto L66
L66:    aload_0
L67:    getfield Field a n Ljava/awt/Graphics;
L70:    ifnull L23
L73:    new java/awt/Font
L76:    dup
L77:    ldc "Helvetica"
L79:    iconst_1
L80:    bipush 13
L82:    invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L85:    astore 4
L87:    aload_0
L88:    aload_0
L89:    getfield Field a e B
L92:    invokevirtual Method a b (B)Ljava/awt/Component;
L95:    aload 4
L97:    invokevirtual Method java/awt/Component getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
L100:   astore 5
L102:   new java/awt/Font
L105:   dup
L106:   ldc "Helvetica"
L108:   iconst_0
L109:   bipush 13
L111:   invokespecial Method java/awt/Font <init> (Ljava/lang/String;II)V
L114:   astore 6
L116:   aload_0
L117:   aload_0
L118:   getfield Field a e B
L121:   invokevirtual Method a b (B)Ljava/awt/Component;
L124:   aload 6
L126:   invokevirtual Method java/awt/Component getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
L129:   pop
L130:   aload_0
L131:   getfield Field a r Z
L134:   ifeq L169
L137:   aload_0
L138:   getfield Field a n Ljava/awt/Graphics;
L141:   getstatic Field java/awt/Color black Ljava/awt/Color;
L144:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L147:   aload_0
L148:   getfield Field a n Ljava/awt/Graphics;
L151:   iconst_0
L152:   iconst_0
L153:   aload_0
L154:   getfield Field a l I
L157:   aload_0
L158:   getfield Field a m I
L161:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L164:   aload_0
L165:   iconst_0
L166:   putfield Field a r Z
L169:   new java/awt/Color
L172:   dup
L173:   sipush 140
L176:   bipush 17
L178:   bipush 17
L180:   invokespecial Method java/awt/Color <init> (III)V
L183:   astore 7
L185:   aload_0
L186:   getfield Field a m I
L189:   iconst_2
L190:   idiv
L191:   bipush 18
L193:   isub
L194:   istore 8
L196:   aload_0
L197:   getfield Field a n Ljava/awt/Graphics;
L200:   aload 7
L202:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L205:   aload_0
L206:   getfield Field a n Ljava/awt/Graphics;
L209:   aload_0
L210:   getfield Field a l I
L213:   iconst_2
L214:   idiv
L215:   sipush 152
L218:   isub
L219:   iload 8
L221:   sipush 304
L224:   bipush 34
L226:   invokevirtual Method java/awt/Graphics drawRect (IIII)V
L229:   aload_0
L230:   getfield Field a n Ljava/awt/Graphics;
L233:   aload_0
L234:   getfield Field a l I
L237:   iconst_2
L238:   idiv
L239:   sipush 150
L242:   isub
L243:   iload 8
L245:   iconst_2
L246:   iadd
L247:   iload_3
L248:   iconst_3
L249:   imul
L250:   bipush 30
L252:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L255:   aload_0
L256:   getfield Field a n Ljava/awt/Graphics;
L259:   getstatic Field java/awt/Color black Ljava/awt/Color;
L262:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L265:   aload_0
L266:   getfield Field a n Ljava/awt/Graphics;
L269:   aload_0
L270:   getfield Field a l I
L273:   iconst_2
L274:   idiv
L275:   sipush 150
L278:   isub
L279:   iload_3
L280:   iconst_3
L281:   imul
L282:   iadd
L283:   iload 8
L285:   iconst_2
L286:   iadd
L287:   sipush 300
L290:   iload_3
L291:   iconst_3
L292:   imul
L293:   isub
L294:   bipush 30
L296:   invokevirtual Method java/awt/Graphics fillRect (IIII)V
L299:   aload_0
L300:   getfield Field a n Ljava/awt/Graphics;
L303:   aload 4
L305:   invokevirtual Method java/awt/Graphics setFont (Ljava/awt/Font;)V
L308:   aload_0
L309:   getfield Field a n Ljava/awt/Graphics;
L312:   getstatic Field java/awt/Color white Ljava/awt/Color;
L315:   invokevirtual Method java/awt/Graphics setColor (Ljava/awt/Color;)V
L318:   iload_1
L319:   ifne L323
L322:   return
L323:   aload_0
L324:   getfield Field a n Ljava/awt/Graphics;
L327:   aload_2
L328:   aload_0
L329:   getfield Field a l I
L332:   aload 5
L334:   aload_2
L335:   invokevirtual Method java/awt/FontMetrics stringWidth (Ljava/lang/String;)I
L338:   isub
L339:   iconst_2
L340:   idiv
L341:   iload 8
L343:   bipush 22
L345:   iadd
L346:   invokevirtual Method java/awt/Graphics drawString (Ljava/lang/String;II)V
L349:   return
L350:   astore 4
L352:   new java/lang/StringBuffer
L355:   dup
L356:   ldc "55533, "
L358:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L361:   iload_1
L362:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L365:   ldc ", "
L367:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L370:   aload_2
L371:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L374:   ldc ", "
L376:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L379:   iload_3
L380:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L383:   ldc ", "
L385:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L388:   aload 4
L390:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L393:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L396:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L399:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L402:   new java/lang/RuntimeException
L405:   dup
L406:   invokespecial Method java/lang/RuntimeException <init> ()V
L409:   athrow
L410:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/applet/Applet <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field a a Z
L9:     aload_0
L10:    iconst_0
L11:    putfield Field a b Z
L14:    aload_0
L15:    iconst_0
L16:    putfield Field a d Z
L19:    aload_0
L20:    iconst_3
L21:    putfield Field a e B
L24:    aload_0
L25:    sipush 27808
L28:    putfield Field a f I
L31:    aload_0
L32:    bipush 20
L34:    putfield Field a h I
L37:    aload_0
L38:    iconst_1
L39:    putfield Field a i I
L42:    aload_0
L43:    bipush 10
L45:    newarray long
L47:    putfield Field a j [J
L50:    aload_0
L51:    bipush 6
L53:    anewarray hb
L56:    putfield Field a p [Lhb;
L59:    aload_0
L60:    iconst_1
L61:    putfield Field a r Z
L64:    aload_0
L65:    sipush 128
L68:    newarray int
L70:    putfield Field a z [I
L73:    aload_0
L74:    sipush 128
L77:    newarray int
L79:    putfield Field a A [I
L82:    return
L83:    
    .end code
.end method
.end class
