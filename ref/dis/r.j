.version 45 3
.class public super r
.super java/lang/Object
.implements java/lang/Runnable
.field public a Ljava/applet/Applet;
.field public b Lk;
.field public c Ljava/awt/EventQueue;
.field private d Z
.field public e Lk;
.field private f Lta;
.field private g Lta;
.field public static h Ljava/lang/String;
.field public i [Lk;
.field public static j Ljava/lang/String;
.field public k Ljava/io/File;
.field public static l I
.field public static m Ljava/lang/reflect/Method;
.field public static n Ljava/lang/reflect/Method;
.field private o Ljava/io/File;
.field private static p Ljava/lang/String;
.field public q Lk;
.field private r Ljava/lang/Thread;

.method public final a : (Ljava/net/URL;I)Lta;
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L28 using L29
L0:     iload_2
L1:     iconst_2
L2:     if_icmpeq L18
L5:     aload_0
L6:     aconst_null
L7:     checkcast java/lang/String
L10:    bipush -106
L12:    bipush 77
L14:    invokevirtual Method r a (Ljava/lang/String;BI)Lta;
L17:    pop
L18:    aload_0
L19:    bipush -33
L21:    iconst_0
L22:    iconst_4
L23:    iconst_0
L24:    aload_1
L25:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L28:    areturn
L29:    astore_3
L30:    aload_3
L31:    athrow
L32:    
        .linenumbertable
            L0 6
            L5 7
            L18 9
            L29 10
            L30 11
        .end linenumbertable
    .end code
.end method

.method public final a : (Ljava/lang/Runnable;II)Lta;
    .code stack 6 locals 5
        .catch java/lang/RuntimeException from L0 to L20 using L21
L0:     iload_2
L1:     iconst_2
L2:     if_icmpeq L10
L5:     bipush -123
L7:     putstatic Field r l I
L10:    aload_0
L11:    bipush -33
L13:    iload_3
L14:    iconst_2
L15:    iconst_0
L16:    aload_1
L17:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L20:    areturn
L21:    astore 4
L23:    aload 4
L25:    athrow
L26:    
        .linenumbertable
            L0 16
            L5 17
            L10 19
            L21 20
            L23 21
        .end linenumbertable
    .end code
.end method

.method public final run : ()V
    .code stack 5 locals 5
L0:     aload_0
L1:     dup
L2:     astore_2
L3:     monitorenter
L4:     aload_0
L5:     getfield Field r d Z
L8:     ifne L14
L11:    goto L17
L14:    aload_2
L15:    monitorexit
L16:    return
L17:    aload_0
L18:    getfield Field r f Lta;
L21:    ifnonnull L27
L24:    goto L58
L27:    aload_0
L28:    getfield Field r f Lta;
L31:    astore_1
L32:    aload_0
L33:    aload_0
L34:    getfield Field r f Lta;
L37:    getfield Field ta e Lta;
L40:    putfield Field r f Lta;
L43:    aload_0
L44:    getfield Field r f Lta;
L47:    ifnonnull L69
L50:    aload_0
L51:    aconst_null
L52:    putfield Field r g Lta;
L55:    goto L69
        .catch java/lang/InterruptedException from L58 to L62 using L65
        .catch [0] from L4 to L16 using L74
        .catch [0] from L17 to L71 using L74
L58:    aload_0
L59:    invokevirtual Method java/lang/Object wait ()V
L62:    goto L4
L65:    astore_3
L66:    goto L4
L69:    aload_2
L70:    monitorexit
L71:    goto L81
        .catch [0] from L74 to L78 using L74
L74:    astore 4
L76:    aload_2
L77:    monitorexit
L78:    aload 4
L80:    athrow
        .catch java/lang/ThreadDeath from L81 to L292 using L295
        .catch java/lang/Throwable from L81 to L292 using L298
        .catch java/lang/RuntimeException from L0 to L16 using L307
        .catch java/lang/RuntimeException from L17 to L307 using L307
L81:    aload_1
L82:    getfield Field ta b I
L85:    istore_2
L86:    iconst_1
L87:    iload_2
L88:    if_icmpne L119
L91:    aload_1
L92:    new java/net/Socket
L95:    dup
L96:    aload_1
L97:    getfield Field ta f Ljava/lang/Object;
L100:   checkcast java/lang/String
L103:   invokestatic Method java/net/InetAddress getByName (Ljava/lang/String;)Ljava/net/InetAddress;
L106:   aload_1
L107:   getfield Field ta c I
L110:   invokespecial Method java/net/Socket <init> (Ljava/net/InetAddress;I)V
L113:   putfield Field ta a Ljava/lang/Object;
L116:   goto L287
L119:   iconst_2
L120:   iload_2
L121:   if_icmpne L164
L124:   new java/lang/Thread
L127:   dup
L128:   aload_1
L129:   getfield Field ta f Ljava/lang/Object;
L132:   checkcast java/lang/Runnable
L135:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L138:   astore_3
L139:   aload_3
L140:   iconst_1
L141:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L144:   aload_3
L145:   invokevirtual Method java/lang/Thread start ()V
L148:   aload_3
L149:   aload_1
L150:   getfield Field ta c I
L153:   invokevirtual Method java/lang/Thread setPriority (I)V
L156:   aload_1
L157:   aload_3
L158:   putfield Field ta a Ljava/lang/Object;
L161:   goto L287
L164:   iload_2
L165:   iconst_4
L166:   if_icmpne L193
L169:   aload_1
L170:   new java/io/DataInputStream
L173:   dup
L174:   aload_1
L175:   getfield Field ta f Ljava/lang/Object;
L178:   checkcast java/net/URL
L181:   invokevirtual Method java/net/URL openStream ()Ljava/io/InputStream;
L184:   invokespecial Method java/io/DataInputStream <init> (Ljava/io/InputStream;)V
L187:   putfield Field ta a Ljava/lang/Object;
L190:   goto L287
L193:   iload_2
L194:   bipush 8
L196:   if_icmpne L241
L199:   aload_1
L200:   getfield Field ta f Ljava/lang/Object;
L203:   checkcast [Ljava/lang/Object;
L206:   checkcast [Ljava/lang/Object;
L209:   astore_3
L210:   aload_1
L211:   aload_3
L212:   iconst_0
L213:   aaload
L214:   checkcast java/lang/Class
L217:   aload_3
L218:   iconst_1
L219:   aaload
L220:   checkcast java/lang/String
L223:   aload_3
L224:   iconst_2
L225:   aaload
L226:   checkcast [Ljava/lang/Class;
L229:   checkcast [Ljava/lang/Class;
L232:   invokevirtual Method java/lang/Class getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
L235:   putfield Field ta a Ljava/lang/Object;
L238:   goto L287
L241:   iload_2
L242:   iconst_m1
L243:   ixor
L244:   bipush -10
L246:   if_icmpeq L257
L249:   new java/lang/Exception
L252:   dup
L253:   invokespecial Method java/lang/Exception <init> ()V
L256:   athrow
L257:   aload_1
L258:   getfield Field ta f Ljava/lang/Object;
L261:   checkcast [Ljava/lang/Object;
L264:   checkcast [Ljava/lang/Object;
L267:   astore_3
L268:   aload_1
L269:   aload_3
L270:   iconst_0
L271:   aaload
L272:   checkcast java/lang/Class
L275:   aload_3
L276:   iconst_1
L277:   aaload
L278:   checkcast java/lang/String
L281:   invokevirtual Method java/lang/Class getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
L284:   putfield Field ta a Ljava/lang/Object;
L287:   aload_1
L288:   iconst_1
L289:   putfield Field ta d I
L292:   goto L304
L295:   astore_2
L296:   aload_2
L297:   athrow
L298:   astore_2
L299:   aload_1
L300:   iconst_2
L301:   putfield Field ta d I
L304:   goto L0
L307:   astore_1
L308:   aload_1
L309:   athrow
L310:   
        .linenumbertable
            L0 32
            L4 35
            L14 37
            L17 39
            L27 42
            L32 43
            L43 44
            L50 45
            L58 51
            L62 53
            L65 52
            L66 53
            L69 56
            L81 59
            L86 60
            L91 62
            L119 65
            L124 68
            L139 69
            L144 70
            L148 71
            L156 72
            L161 73
            L164 75
            L169 77
            L193 80
            L199 85
            L210 86
            L238 87
            L241 89
            L249 91
            L257 98
            L268 99
            L287 106
            L292 113
            L295 107
            L296 108
            L298 109
            L299 112
            L304 114
            L307 116
            L308 117
        .end linenumbertable
    .end code
.end method

.method public final a : (Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lta;
    .code stack 9 locals 6
        .catch java/lang/RuntimeException from L0 to L50 using L51
L0:     iload 4
L2:     bipush -26
L4:     if_icmpeq L21
L7:     aload_0
L8:     bipush 55
L10:    bipush 48
L12:    aconst_null
L13:    checkcast java/lang/String
L16:    bipush -38
L18:    invokespecial Method r a (IILjava/lang/String;I)V
L21:    aload_0
L22:    iload 4
L24:    bipush 57
L26:    ixor
L27:    iconst_0
L28:    bipush 8
L30:    iconst_0
L31:    iconst_3
L32:    anewarray java/lang/Object
L35:    dup
L36:    iconst_0
L37:    aload_1
L38:    aastore
L39:    dup
L40:    iconst_1
L41:    aload_3
L42:    aastore
L43:    dup
L44:    iconst_2
L45:    aload_2
L46:    aastore
L47:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L50:    areturn
L51:    astore 5
L53:    aload 5
L55:    athrow
L56:    
        .linenumbertable
            L0 127
            L7 128
            L21 130
            L51 131
            L53 132
        .end linenumbertable
    .end code
.end method

.method private final a : (IILjava/lang/String;I)V
    .code stack 9 locals 14
L0:     bipush -33
L2:     iload_1
L3:     iconst_m1
L4:     ixor
L5:     if_icmplt L17
L8:     iload_1
L9:     bipush 34
L11:    if_icmpgt L17
L14:    goto L20
L17:    bipush 32
L19:    istore_1
L20:    iconst_2
L21:    anewarray java/lang/String
L24:    dup
L25:    iconst_0
L26:    new java/lang/StringBuffer
L29:    dup
L30:    invokespecial Method java/lang/StringBuffer <init> ()V
L33:    ldc ".jagex_cache_"
L35:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L38:    iload_1
L39:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L42:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L45:    aastore
L46:    dup
L47:    iconst_1
L48:    new java/lang/StringBuffer
L51:    dup
L52:    invokespecial Method java/lang/StringBuffer <init> ()V
L55:    ldc ".file_store_"
L57:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L60:    iload_1
L61:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L64:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L67:    aastore
L68:    astore 6
L70:    bipush 8
L72:    anewarray java/lang/String
L75:    dup
L76:    iconst_0
L77:    ldc "c:/rscache/"
L79:    aastore
L80:    dup
L81:    iconst_1
L82:    ldc "/rscache/"
L84:    aastore
L85:    dup
L86:    iconst_2
L87:    ldc "c:/windows/"
L89:    aastore
L90:    dup
L91:    iconst_3
L92:    ldc "c:/winnt/"
L94:    aastore
L95:    dup
L96:    iconst_4
L97:    ldc "c:/"
L99:    aastore
L100:   dup
L101:   iconst_5
L102:   getstatic Field r p Ljava/lang/String;
L105:   aastore
L106:   dup
L107:   bipush 6
L109:   ldc "/tmp/"
L111:   aastore
L112:   dup
L113:   bipush 7
L115:   ldc ""
L117:   aastore
L118:   astore 5
L120:   iload_2
L121:   bipush 32
L123:   if_icmpeq L134
L126:   aload_0
L127:   aconst_null
L128:   checkcast java/awt/EventQueue
L131:   putfield Field r c Ljava/awt/EventQueue;
L134:   iconst_0
L135:   istore 7
L137:   iload 7
L139:   iconst_2
L140:   if_icmpge L690
L143:   iconst_0
L144:   istore 8
L146:   aload 6
L148:   arraylength
L149:   iconst_m1
L150:   ixor
L151:   iload 8
L153:   iconst_m1
L154:   ixor
L155:   if_icmpge L684
L158:   iconst_0
L159:   istore 9
L161:   aload 5
L163:   arraylength
L164:   iconst_m1
L165:   ixor
L166:   iload 9
L168:   iconst_m1
L169:   ixor
L170:   if_icmpge L678
L173:   aload 5
L175:   iload 9
L177:   aaload
L178:   astore 10
L180:   iconst_0
L181:   aload 10
L183:   invokevirtual Method java/lang/String length ()I
L186:   if_icmpge L207
L189:   new java/io/File
L192:   dup
L193:   aload 10
L195:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L198:   invokevirtual Method java/io/File exists ()Z
L201:   ifne L207
L204:   goto L672
L207:   new java/io/File
L210:   dup
L211:   new java/lang/StringBuffer
L214:   dup
L215:   invokespecial Method java/lang/StringBuffer <init> ()V
L218:   aload 10
L220:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L223:   aload 6
L225:   iload 8
L227:   aaload
L228:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L231:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L234:   invokespecial Method java/io/File <init> (Ljava/lang/String;)V
L237:   astore 11
L239:   iload 7
L241:   iconst_m1
L242:   ixor
L243:   bipush -2
L245:   if_icmpne L274
L248:   aload 11
L250:   invokevirtual Method java/io/File exists ()Z
L253:   ifne L274
L256:   aload 11
L258:   invokevirtual Method java/io/File mkdir ()Z
L261:   istore 12
L263:   iload 12
L265:   ifeq L271
L268:   goto L274
L271:   goto L672
L274:   aload_0
L275:   getfield Field r b Lk;
L278:   ifnonnull L339
        .catch java/lang/Exception from L281 to L329 using L332
L281:   new java/io/File
L284:   dup
L285:   aload 11
L287:   ldc "random.dat"
L289:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L292:   astore 12
L294:   bipush -2
L296:   iload 7
L298:   iconst_m1
L299:   ixor
L300:   if_icmpeq L311
L303:   aload 12
L305:   invokevirtual Method java/io/File exists ()Z
L308:   ifeq L329
L311:   aload_0
L312:   new k
L315:   dup
L316:   aload 12
L318:   ldc "rw"
L320:   ldc2_w 25L
L323:   invokespecial Method k <init> (Ljava/io/File;Ljava/lang/String;J)V
L326:   putfield Field r b Lk;
L329:   goto L339
L332:   astore 12
L334:   aload_0
L335:   aconst_null
L336:   putfield Field r b Lk;
L339:   aconst_null
L340:   aload_0
L341:   getfield Field r o Ljava/io/File;
L344:   if_acmpeq L350
L347:   goto L647
        .catch java/lang/Exception from L350 to L391 using L558
L350:   new java/io/File
L353:   dup
L354:   aload 11
L356:   aload_3
L357:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L360:   astore 11
L362:   iconst_1
L363:   iload 7
L365:   if_icmpne L394
L368:   aload 11
L370:   invokevirtual Method java/io/File exists ()Z
L373:   ifne L394
L376:   aload 11
L378:   invokevirtual Method java/io/File mkdir ()Z
L381:   istore 12
L383:   iload 12
L385:   ifeq L391
L388:   goto L394
L391:   goto L672
        .catch java/lang/Exception from L394 to L423 using L558
L394:   new java/io/File
L397:   dup
L398:   aload 11
L400:   ldc "main_file_cache.dat2"
L402:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L405:   astore 12
L407:   iload 7
L409:   iconst_m1
L410:   ixor
L411:   iconst_m1
L412:   if_icmpne L426
L415:   aload 12
L417:   invokevirtual Method java/io/File exists ()Z
L420:   ifne L426
L423:   goto L672
        .catch java/lang/Exception from L426 to L555 using L558
L426:   aload_0
L427:   new k
L430:   dup
L431:   aload 12
L433:   ldc "rw"
L435:   ldc2_w 52428800L
L438:   invokespecial Method k <init> (Ljava/io/File;Ljava/lang/String;J)V
L441:   putfield Field r q Lk;
L444:   aload_0
L445:   iload 4
L447:   anewarray k
L450:   putfield Field r i [Lk;
L453:   iconst_0
L454:   istore 13
L456:   iload 4
L458:   iload 13
L460:   if_icmple L517
L463:   aload_0
L464:   getfield Field r i [Lk;
L467:   iload 13
L469:   new k
L472:   dup
L473:   new java/io/File
L476:   dup
L477:   aload 11
L479:   new java/lang/StringBuffer
L482:   dup
L483:   invokespecial Method java/lang/StringBuffer <init> ()V
L486:   ldc "main_file_cache.idx"
L488:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L491:   iload 13
L493:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L496:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L499:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L502:   ldc "rw"
L504:   ldc2_w 1048576L
L507:   invokespecial Method k <init> (Ljava/io/File;Ljava/lang/String;J)V
L510:   aastore
L511:   iinc 13 1
L514:   goto L456
L517:   aload_0
L518:   new k
L521:   dup
L522:   new java/io/File
L525:   dup
L526:   aload 11
L528:   ldc "main_file_cache.idx255"
L530:   invokespecial Method java/io/File <init> (Ljava/io/File;Ljava/lang/String;)V
L533:   ldc "rw"
L535:   ldc2_w 1048576L
L538:   invokespecial Method k <init> (Ljava/io/File;Ljava/lang/String;J)V
L541:   putfield Field r e Lk;
L544:   aload_0
L545:   aload_0
L546:   aload 11
L548:   dup_x1
L549:   putfield Field r o Ljava/io/File;
L552:   putfield Field r k Ljava/io/File;
L555:   goto L647
L558:   astore 12
        .catch java/lang/Exception from L560 to L617 using L620
        .catch java/lang/Exception from L173 to L204 using L650
        .catch java/lang/Exception from L207 to L271 using L650
        .catch java/lang/Exception from L274 to L391 using L650
        .catch java/lang/Exception from L394 to L423 using L650
        .catch java/lang/Exception from L426 to L647 using L650
        .catch java/lang/RuntimeException from L0 to L671 using L708
L560:   aload_0
L561:   getfield Field r q Lk;
L564:   iload_2
L565:   sipush 21689
L568:   ixor
L569:   invokevirtual Method k a (I)V
L572:   iconst_0
L573:   istore 13
L575:   iload 13
L577:   iconst_m1
L578:   ixor
L579:   iload 4
L581:   iconst_m1
L582:   ixor
L583:   if_icmple L607
L586:   aload_0
L587:   getfield Field r i [Lk;
L590:   iload 13
L592:   aaload
L593:   iload_2
L594:   sipush 21689
L597:   ixor
L598:   invokevirtual Method k a (I)V
L601:   iinc 13 1
L604:   goto L575
L607:   aload_0
L608:   getfield Field r e Lk;
L611:   sipush 21657
L614:   invokevirtual Method k a (I)V
L617:   goto L622
L620:   astore 13
L622:   aload_0
L623:   aload_0
L624:   aconst_null
L625:   dup_x1
L626:   putfield Field r o Ljava/io/File;
L629:   putfield Field r k Ljava/io/File;
L632:   aload_0
L633:   aload_0
L634:   aconst_null
L635:   dup_x1
L636:   putfield Field r e Lk;
L639:   putfield Field r q Lk;
L642:   aload_0
L643:   aconst_null
L644:   putfield Field r i [Lk;
L647:   goto L652
L650:   astore 10
L652:   aconst_null
L653:   aload_0
L654:   getfield Field r b Lk;
L657:   if_acmpeq L672
L660:   aconst_null
L661:   aload_0
L662:   getfield Field r o Ljava/io/File;
L665:   if_acmpne L671
L668:   goto L672
L671:   return
        .catch java/lang/RuntimeException from L672 to L705 using L708
L672:   iinc 9 1
L675:   goto L161
L678:   iinc 8 1
L681:   goto L146
L684:   iinc 7 1
L687:   goto L137
L690:   aload_0
L691:   getfield Field r o Ljava/io/File;
L694:   ifnonnull L705
L697:   new java/lang/RuntimeException
L700:   dup
L701:   invokespecial Method java/lang/RuntimeException <init> ()V
L704:   athrow
L705:   goto L713
L708:   astore 5
L710:   aload 5
L712:   athrow
L713:   return
L714:   
        .linenumbertable
            L0 140
            L17 142
            L20 145
            L70 146
            L120 148
            L126 149
            L134 152
            L137 153
            L143 157
            L146 158
            L158 162
            L161 163
            L173 169
            L180 170
            L204 174
            L207 178
            L239 179
            L256 182
            L263 183
            L271 188
            L274 193
            L281 197
            L294 198
            L311 200
            L329 207
            L332 203
            L334 204
            L339 210
            L350 214
            L362 215
            L376 218
            L383 219
            L391 224
            L394 230
            L407 231
            L423 235
            L426 240
            L444 241
            L453 244
            L456 245
            L463 246
            L511 245
            L517 249
            L544 250
            L555 269
            L558 251
            L560 255
            L572 258
            L575 259
            L586 260
            L601 259
            L607 263
            L617 265
            L620 264
            L622 266
            L632 267
            L642 268
            L647 275
            L650 272
            L652 276
            L671 281
            L672 163
            L678 158
            L684 153
            L690 293
            L697 296
            L705 302
            L708 300
            L710 301
            L713 303
        .end linenumbertable
    .end code
.end method

.method private final a : (IIIILjava/lang/Object;)Lta;
    .code stack 4 locals 9
L0:     iload_1
L1:     bipush -33
L3:     if_icmpeq L11
L6:     aconst_null
L7:     checkcast ta
L10:    areturn
L11:    new ta
L14:    dup
L15:    invokespecial Method ta <init> ()V
L18:    astore 6
L20:    aload 6
L22:    iload_2
L23:    putfield Field ta c I
L26:    aload 6
L28:    iload_3
L29:    putfield Field ta b I
L32:    aload 6
L34:    aload 5
L36:    putfield Field ta f Ljava/lang/Object;
L39:    aload_0
L40:    dup
L41:    astore 7
L43:    monitorenter
        .catch [0] from L44 to L87 using L90
L44:    aload_0
L45:    getfield Field r g Lta;
L48:    ifnonnull L65
L51:    aload_0
L52:    aload_0
L53:    aload 6
L55:    dup_x1
L56:    putfield Field r f Lta;
L59:    putfield Field r g Lta;
L62:    goto L80
L65:    aload_0
L66:    getfield Field r g Lta;
L69:    aload 6
L71:    putfield Field ta e Lta;
L74:    aload_0
L75:    aload 6
L77:    putfield Field r g Lta;
L80:    aload_0
L81:    invokevirtual Method java/lang/Object notify ()V
L84:    aload 7
L86:    monitorexit
L87:    goto L98
        .catch [0] from L90 to L95 using L90
        .catch java/lang/RuntimeException from L0 to L10 using L101
        .catch java/lang/RuntimeException from L11 to L100 using L101
L90:    astore 8
L92:    aload 7
L94:    monitorexit
L95:    aload 8
L97:    athrow
L98:    aload 6
L100:   areturn
L101:   astore 6
L103:   aload 6
L105:   athrow
L106:   
        .linenumbertable
            L0 311
            L6 312
            L11 315
            L20 316
            L26 317
            L32 320
            L39 321
            L44 322
            L51 324
            L65 328
            L74 329
            L80 332
            L84 333
            L98 334
            L101 335
            L103 336
        .end linenumbertable
    .end code
.end method

.method public final a : (ILjava/lang/Class;Ljava/lang/String;)Lta;
    .code stack 9 locals 5
        .catch java/lang/RuntimeException from L0 to L35 using L36
L0:     iload_1
L1:     sipush -5134
L4:     if_icmpeq L13
L7:     aload_0
L8:     bipush 96
L10:    invokevirtual Method r a (B)V
L13:    aload_0
L14:    bipush -33
L16:    iconst_0
L17:    bipush 9
L19:    iconst_0
L20:    iconst_2
L21:    anewarray java/lang/Object
L24:    dup
L25:    iconst_0
L26:    aload_2
L27:    aastore
L28:    dup
L29:    iconst_1
L30:    aload_3
L31:    aastore
L32:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L35:    areturn
L36:    astore 4
L38:    aload 4
L40:    athrow
L41:    
        .linenumbertable
            L0 345
            L7 346
            L13 348
            L36 349
            L38 350
        .end linenumbertable
    .end code
.end method

.method public final a : (BI)Lta;
    .code stack 6 locals 4
        .catch java/lang/RuntimeException from L0 to L24 using L25
L0:     iload_1
L1:     bipush 71
L3:     if_icmpgt L14
L6:     aload_0
L7:     iconst_0
L8:     bipush 26
L10:    invokevirtual Method r a (BI)Lta;
L13:    pop
L14:    aload_0
L15:    bipush -33
L17:    iload_2
L18:    iconst_3
L19:    iconst_0
L20:    aconst_null
L21:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L24:    areturn
L25:    astore_3
L26:    aload_3
L27:    athrow
L28:    
        .linenumbertable
            L0 359
            L6 360
            L14 362
            L25 363
            L26 364
        .end linenumbertable
    .end code
.end method

.method public final a : (Ljava/lang/String;BI)Lta;
    .code stack 6 locals 5
        .catch java/lang/RuntimeException from L0 to L22 using L23
L0:     bipush 47
L2:     bipush -48
L4:     iload_2
L5:     isub
L6:     bipush 33
L8:     idiv
L9:     irem
L10:    istore 4
L12:    aload_0
L13:    bipush -33
L15:    iload_3
L16:    iconst_1
L17:    iconst_0
L18:    aload_1
L19:    invokespecial Method r a (IIIILjava/lang/Object;)Lta;
L22:    areturn
L23:    astore 4
L25:    aload 4
L27:    athrow
L28:    
        .linenumbertable
            L0 391
            L12 392
            L23 393
            L25 394
        .end linenumbertable
    .end code
.end method

.method public final a : (B)V
    .code stack 3 locals 4
L0:     aload_0
L1:     dup
L2:     astore_2
L3:     monitorenter
        .catch [0] from L4 to L15 using L18
L4:     aload_0
L5:     iconst_1
L6:     putfield Field r d Z
L9:     aload_0
L10:    invokevirtual Method java/lang/Object notifyAll ()V
L13:    aload_2
L14:    monitorexit
L15:    goto L23
        .catch [0] from L18 to L21 using L18
L18:    astore_3
L19:    aload_2
L20:    monitorexit
L21:    aload_3
L22:    athrow
        .catch java/lang/InterruptedException from L23 to L41 using L44
L23:    bipush -50
L25:    iload_1
L26:    bipush 72
L28:    isub
L29:    bipush 45
L31:    idiv
L32:    irem
L33:    istore_2
L34:    aload_0
L35:    getfield Field r r Ljava/lang/Thread;
L38:    invokevirtual Method java/lang/Thread join ()V
L41:    goto L45
L44:    astore_2
L45:    aconst_null
L46:    aload_0
L47:    getfield Field r q Lk;
L50:    if_acmpne L56
L53:    goto L70
        .catch java/io/IOException from L56 to L66 using L69
L56:    aload_0
L57:    getfield Field r q Lk;
L60:    sipush 21657
L63:    invokevirtual Method k a (I)V
L66:    goto L70
L69:    astore_2
L70:    aload_0
L71:    getfield Field r e Lk;
L74:    ifnull L91
        .catch java/io/IOException from L77 to L87 using L90
L77:    aload_0
L78:    getfield Field r e Lk;
L81:    sipush 21657
L84:    invokevirtual Method k a (I)V
L87:    goto L91
L90:    astore_2
L91:    aconst_null
L92:    aload_0
L93:    getfield Field r i [Lk;
L96:    if_acmpeq L149
L99:    iconst_0
L100:   istore_2
L101:   iload_2
L102:   iconst_m1
L103:   ixor
L104:   aload_0
L105:   getfield Field r i [Lk;
L108:   arraylength
L109:   iconst_m1
L110:   ixor
L111:   if_icmple L149
L114:   aconst_null
L115:   aload_0
L116:   getfield Field r i [Lk;
L119:   iload_2
L120:   aaload
L121:   if_acmpne L127
L124:   goto L143
        .catch java/io/IOException from L127 to L139 using L142
L127:   aload_0
L128:   getfield Field r i [Lk;
L131:   iload_2
L132:   aaload
L133:   sipush 21657
L136:   invokevirtual Method k a (I)V
L139:   goto L143
L142:   astore_3
L143:   iinc 2 1
L146:   goto L101
L149:   aconst_null
L150:   aload_0
L151:   getfield Field r b Lk;
L154:   if_acmpne L160
L157:   goto L174
        .catch java/io/IOException from L160 to L170 using L173
        .catch java/lang/RuntimeException from L0 to L174 using L177
L160:   aload_0
L161:   getfield Field r b Lk;
L164:   sipush 21657
L167:   invokevirtual Method k a (I)V
L170:   goto L174
L173:   astore_2
L174:   goto L180
L177:   astore_2
L178:   aload_2
L179:   athrow
L180:   return
L181:   
        .linenumbertable
            L0 412
            L4 413
            L9 414
            L13 415
            L23 418
            L34 419
            L41 421
            L44 420
            L45 422
            L56 425
            L66 427
            L69 426
            L70 429
            L77 431
            L87 433
            L90 432
            L91 435
            L99 439
            L101 440
            L114 442
            L127 445
            L139 447
            L142 446
            L143 440
            L149 454
            L160 457
            L170 459
            L173 458
            L174 463
            L177 461
            L178 462
            L180 464
        .end linenumbertable
    .end code
.end method

.method public <init> : (ZLjava/applet/Applet;ILjava/lang/String;I)V
    .code stack 6 locals 7
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     aconst_null
L6:     putfield Field r a Ljava/applet/Applet;
L9:     aload_0
L10:    aconst_null
L11:    putfield Field r b Lk;
L14:    aload_0
L15:    aconst_null
L16:    putfield Field r g Lta;
L19:    aload_0
L20:    aconst_null
L21:    putfield Field r f Lta;
L24:    aload_0
L25:    aconst_null
L26:    putfield Field r e Lk;
L29:    aload_0
L30:    iconst_0
L31:    putfield Field r d Z
L34:    aload_0
L35:    aconst_null
L36:    putfield Field r k Ljava/io/File;
L39:    aload_0
L40:    aconst_null
L41:    putfield Field r o Ljava/io/File;
L44:    aload_0
L45:    aconst_null
L46:    putfield Field r q Lk;
L49:    ldc "1.1"
L51:    putstatic Field r j Ljava/lang/String;
L54:    ldc "Unknown"
L56:    putstatic Field r h Ljava/lang/String;
L59:    aload_0
L60:    aload_2
L61:    putfield Field r a Ljava/applet/Applet;
        .catch java/lang/Exception from L64 to L80 using L83
L64:    ldc "java.vendor"
L66:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L69:    putstatic Field r h Ljava/lang/String;
L72:    ldc "java.version"
L74:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L77:    putstatic Field r j Ljava/lang/String;
L80:    goto L85
L83:    astore 6
        .catch java/lang/Exception from L85 to L126 using L129
L85:    ldc "user.home"
L87:    invokestatic Method java/lang/System getProperty (Ljava/lang/String;)Ljava/lang/String;
L90:    putstatic Field r p Ljava/lang/String;
L93:    getstatic Field r p Ljava/lang/String;
L96:    ifnonnull L102
L99:    goto L126
L102:   new java/lang/StringBuffer
L105:   dup
L106:   invokespecial Method java/lang/StringBuffer <init> ()V
L109:   getstatic Field r p Ljava/lang/String;
L112:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L115:   ldc "/"
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L120:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L123:   putstatic Field r p Ljava/lang/String;
L126:   goto L131
L129:   astore 6
L131:   getstatic Field r p Ljava/lang/String;
L134:   ifnull L140
L137:   goto L145
L140:   ldc "~/"
L142:   putstatic Field r p Ljava/lang/String;
        .catch java/lang/Throwable from L145 to L155 using L158
L145:   aload_0
L146:   invokestatic Method java/awt/Toolkit getDefaultToolkit ()Ljava/awt/Toolkit;
L149:   invokevirtual Method java/awt/Toolkit getSystemEventQueue ()Ljava/awt/EventQueue;
L152:   putfield Field r c Ljava/awt/EventQueue;
L155:   goto L160
L158:   astore 6
        .catch java/lang/Exception from L160 to L213 using L216
L160:   aconst_null
L161:   aload_2
L162:   if_acmpeq L190
L165:   aload_2
L166:   invokevirtual Method java/lang/Object getClass ()Ljava/lang/Class;
L169:   ldc "setFocusTraversalKeysEnabled"
L171:   iconst_1
L172:   anewarray java/lang/Class
L175:   dup
L176:   iconst_0
L177:   getstatic Field java/lang/Boolean TYPE Ljava/lang/Class;
L180:   aastore
L181:   invokevirtual Method java/lang/Class getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
L184:   putstatic Field r n Ljava/lang/reflect/Method;
L187:   goto L213
L190:   ldc "java.awt.Component"
L192:   invokestatic Method java/lang/Class forName (Ljava/lang/String;)Ljava/lang/Class;
L195:   ldc "setFocusTraversalKeysEnabled"
L197:   iconst_1
L198:   anewarray java/lang/Class
L201:   dup
L202:   iconst_0
L203:   getstatic Field java/lang/Boolean TYPE Ljava/lang/Class;
L206:   aastore
L207:   invokevirtual Method java/lang/Class getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
L210:   putstatic Field r n Ljava/lang/reflect/Method;
L213:   goto L218
L216:   astore 6
        .catch java/lang/Exception from L218 to L270 using L273
        .catch java/lang/RuntimeException from L49 to L331 using L334
L218:   aload_2
L219:   ifnull L247
L222:   aload_2
L223:   invokevirtual Method java/lang/Object getClass ()Ljava/lang/Class;
L226:   ldc "setFocusCycleRoot"
L228:   iconst_1
L229:   anewarray java/lang/Class
L232:   dup
L233:   iconst_0
L234:   getstatic Field java/lang/Boolean TYPE Ljava/lang/Class;
L237:   aastore
L238:   invokevirtual Method java/lang/Class getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
L241:   putstatic Field r m Ljava/lang/reflect/Method;
L244:   goto L270
L247:   ldc "java.awt.Container"
L249:   invokestatic Method java/lang/Class forName (Ljava/lang/String;)Ljava/lang/Class;
L252:   ldc "setFocusCycleRoot"
L254:   iconst_1
L255:   anewarray java/lang/Class
L258:   dup
L259:   iconst_0
L260:   getstatic Field java/lang/Boolean TYPE Ljava/lang/Class;
L263:   aastore
L264:   invokevirtual Method java/lang/Class getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
L267:   putstatic Field r m Ljava/lang/reflect/Method;
L270:   goto L275
L273:   astore 6
L275:   iload_1
L276:   ifeq L290
L279:   aload_0
L280:   iload_3
L281:   bipush 32
L283:   aload 4
L285:   iload 5
L287:   invokespecial Method r a (IILjava/lang/String;I)V
L290:   aload_0
L291:   iconst_0
L292:   putfield Field r d Z
L295:   aload_0
L296:   new java/lang/Thread
L299:   dup
L300:   aload_0
L301:   invokespecial Method java/lang/Thread <init> (Ljava/lang/Runnable;)V
L304:   putfield Field r r Ljava/lang/Thread;
L307:   aload_0
L308:   getfield Field r r Ljava/lang/Thread;
L311:   bipush 10
L313:   invokevirtual Method java/lang/Thread setPriority (I)V
L316:   aload_0
L317:   getfield Field r r Ljava/lang/Thread;
L320:   iconst_1
L321:   invokevirtual Method java/lang/Thread setDaemon (Z)V
L324:   aload_0
L325:   getfield Field r r Ljava/lang/Thread;
L328:   invokevirtual Method java/lang/Thread start ()V
L331:   goto L339
L334:   astore 6
L336:   aload 6
L338:   athrow
L339:   return
L340:   
        .linenumbertable
            L0 483
            L4 307
            L9 355
            L14 371
            L19 380
            L24 384
            L29 400
            L34 406
            L39 472
            L44 481
            L49 485
            L54 486
            L59 487
            L64 489
            L72 490
            L80 492
            L83 491
            L85 494
            L93 495
            L102 497
            L126 500
            L129 499
            L131 501
            L140 503
            L145 506
            L155 508
            L158 507
            L160 512
            L165 513
            L190 515
            L213 518
            L216 517
            L218 520
            L222 521
            L247 523
            L270 526
            L273 525
            L275 529
            L279 533
            L290 538
            L295 539
            L307 540
            L316 541
            L324 542
            L331 545
            L334 543
            L336 544
            L339 546
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_3
L1:     putstatic Field r l I
L4:     return
L5:     
        .linenumbertable
            L0 476
            L4 477
        .end linenumbertable
    .end code
.end method
.sourcefile "r.java"
.end class
