.version 45 3
.class public super g
.super java/lang/Object
.field public static a [Lg;
.field public b I
.field public c Lf;
.field public d I
.field public e [I
.field public f [I
.field public g [I
.field public h [I

.method public static a : (ZLub;)V
    .code stack 8 locals 24
L0:     getstatic Field eb Rb Z
L3:     istore 23
        .catch java/lang/RuntimeException from L5 to L570 using L571
L5:     iload_0
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    new kb
L20:    dup
L21:    sipush 363
L24:    aload_1
L25:    ldc "frame_head.dat"
L27:    aconst_null
L28:    iconst_2
L29:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L32:    invokespecial Method kb <init> (I[B)V
L35:    astore_2
L36:    new kb
L39:    dup
L40:    sipush 363
L43:    aload_1
L44:    ldc "frame_tran1.dat"
L46:    aconst_null
L47:    iconst_2
L48:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L51:    invokespecial Method kb <init> (I[B)V
L54:    astore_3
L55:    new kb
L58:    dup
L59:    sipush 363
L62:    aload_1
L63:    ldc "frame_tran2.dat"
L65:    aconst_null
L66:    iconst_2
L67:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L70:    invokespecial Method kb <init> (I[B)V
L73:    astore 4
L75:    new kb
L78:    dup
L79:    sipush 363
L82:    aload_1
L83:    ldc "frame_del.dat"
L85:    aconst_null
L86:    iconst_2
L87:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L90:    invokespecial Method kb <init> (I[B)V
L93:    astore 5
L95:    aload_2
L96:    invokevirtual Method kb e ()I
L99:    istore 6
L101:   aload_2
L102:   invokevirtual Method kb e ()I
L105:   istore 7
L107:   iload 7
L109:   iconst_1
L110:   iadd
L111:   anewarray g
L114:   putstatic Field g a [Lg;
L117:   sipush 500
L120:   newarray int
L122:   astore 8
L124:   sipush 500
L127:   newarray int
L129:   astore 9
L131:   sipush 500
L134:   newarray int
L136:   astore 10
L138:   sipush 500
L141:   newarray int
L143:   astore 11
L145:   iconst_0
L146:   istore 12
L148:   iload 23
L150:   ifeq L563
L153:   aload_2
L154:   invokevirtual Method kb e ()I
L157:   istore 13
L159:   getstatic Field g a [Lg;
L162:   iload 13
L164:   new g
L167:   dup
L168:   invokespecial Method g <init> ()V
L171:   dup_x2
L172:   aastore
L173:   astore 14
L175:   aload 14
L177:   aload 5
L179:   invokevirtual Method kb c ()I
L182:   putfield Field g b I
L185:   aload_2
L186:   invokevirtual Method kb e ()I
L189:   istore 15
L191:   getstatic Field f a [Lf;
L194:   iload 15
L196:   aaload
L197:   astore 16
L199:   aload 14
L201:   aload 16
L203:   putfield Field g c Lf;
L206:   aload_2
L207:   invokevirtual Method kb c ()I
L210:   istore 17
L212:   iconst_m1
L213:   istore 18
L215:   iconst_0
L216:   istore 19
L218:   iconst_0
L219:   istore 20
L221:   iload 23
L223:   ifeq L440
L226:   aload_3
L227:   invokevirtual Method kb c ()I
L230:   istore 21
L232:   iload 21
L234:   ifle L437
L237:   aload 16
L239:   getfield Field f c [I
L242:   iload 20
L244:   iaload
L245:   ifeq L313
L248:   iload 20
L250:   iconst_1
L251:   isub
L252:   istore 22
L254:   iload 23
L256:   ifeq L306
L259:   aload 16
L261:   getfield Field f c [I
L264:   iload 22
L266:   iaload
L267:   ifne L303
L270:   aload 8
L272:   iload 19
L274:   iload 22
L276:   iastore
L277:   aload 9
L279:   iload 19
L281:   iconst_0
L282:   iastore
L283:   aload 10
L285:   iload 19
L287:   iconst_0
L288:   iastore
L289:   aload 11
L291:   iload 19
L293:   iconst_0
L294:   iastore
L295:   iinc 19 1
L298:   iload 23
L300:   ifeq L313
L303:   iinc 22 -1
L306:   iload 22
L308:   iload 18
L310:   if_icmpgt L259
L313:   aload 8
L315:   iload 19
L317:   iload 20
L319:   iastore
L320:   iconst_0
L321:   istore 22
L323:   aload 16
L325:   getfield Field f c [I
L328:   aload 8
L330:   iload 19
L332:   iaload
L333:   iaload
L334:   iconst_3
L335:   if_icmpne L343
L338:   sipush 128
L341:   istore 22
L343:   iload 21
L345:   iconst_1
L346:   iand
L347:   ifeq L365
L350:   aload 9
L352:   iload 19
L354:   aload 4
L356:   invokevirtual Method kb j ()I
L359:   iastore
L360:   iload 23
L362:   ifeq L372
L365:   aload 9
L367:   iload 19
L369:   iload 22
L371:   iastore
L372:   iload 21
L374:   iconst_2
L375:   iand
L376:   ifeq L394
L379:   aload 10
L381:   iload 19
L383:   aload 4
L385:   invokevirtual Method kb j ()I
L388:   iastore
L389:   iload 23
L391:   ifeq L401
L394:   aload 10
L396:   iload 19
L398:   iload 22
L400:   iastore
L401:   iload 21
L403:   iconst_4
L404:   iand
L405:   ifeq L423
L408:   aload 11
L410:   iload 19
L412:   aload 4
L414:   invokevirtual Method kb j ()I
L417:   iastore
L418:   iload 23
L420:   ifeq L430
L423:   aload 11
L425:   iload 19
L427:   iload 22
L429:   iastore
L430:   iload 20
L432:   istore 18
L434:   iinc 19 1
L437:   iinc 20 1
L440:   iload 20
L442:   iload 17
L444:   if_icmplt L226
L447:   aload 14
L449:   iload 19
L451:   putfield Field g d I
L454:   aload 14
L456:   iload 19
L458:   newarray int
L460:   putfield Field g e [I
L463:   aload 14
L465:   iload 19
L467:   newarray int
L469:   putfield Field g f [I
L472:   aload 14
L474:   iload 19
L476:   newarray int
L478:   putfield Field g g [I
L481:   aload 14
L483:   iload 19
L485:   newarray int
L487:   putfield Field g h [I
L490:   iconst_0
L491:   istore 21
L493:   iload 23
L495:   ifeq L553
L498:   aload 14
L500:   getfield Field g e [I
L503:   iload 21
L505:   aload 8
L507:   iload 21
L509:   iaload
L510:   iastore
L511:   aload 14
L513:   getfield Field g f [I
L516:   iload 21
L518:   aload 9
L520:   iload 21
L522:   iaload
L523:   iastore
L524:   aload 14
L526:   getfield Field g g [I
L529:   iload 21
L531:   aload 10
L533:   iload 21
L535:   iaload
L536:   iastore
L537:   aload 14
L539:   getfield Field g h [I
L542:   iload 21
L544:   aload 11
L546:   iload 21
L548:   iaload
L549:   iastore
L550:   iinc 21 1
L553:   iload 21
L555:   iload 19
L557:   if_icmplt L498
L560:   iinc 12 1
L563:   iload 12
L565:   iload 6
L567:   if_icmplt L153
L570:   return
L571:   astore_2
L572:   new java/lang/StringBuffer
L575:   dup
L576:   ldc "10576, "
L578:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L581:   iload_0
L582:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L585:   ldc ", "
L587:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L590:   aload_1
L591:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L594:   ldc ", "
L596:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L599:   aload_2
L600:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L603:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L606:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L609:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L612:   new java/lang/RuntimeException
L615:   dup
L616:   invokespecial Method java/lang/RuntimeException <init> ()V
L619:   athrow
L620:   
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
