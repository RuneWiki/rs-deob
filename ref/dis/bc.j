.version 45 3
.class final super bc
.super java/lang/Object
.field private a Z
.field public static b I
.field private static c [I
.field private static d Lkb;
.field private static e [Lbc;
.field private static f I
.field private g J
.field public h Ljava/lang/String;
.field public i [B
.field public j B
.field private k [I
.field private l [I
.field public m I
.field public n I
.field public o I
.field public p I
.field public q I
.field private r Z
.field private s [I
.field private t [I
.field public u [Ljava/lang/String;
.field public v I
.field public w I
.field public x I
.field public y Z
.field public z I
.field private A I
.field private B I
.field public static C Ls;

.method public static final a : (Lub;)V
    .code stack 8 locals 6
L0:     getstatic Field dc c Z
L3:     istore 5
L5:     new kb
L8:     dup
L9:     sipush 363
L12:    aload_0
L13:    ldc "npc.dat"
L15:    aconst_null
L16:    iconst_2
L17:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L20:    invokespecial Method kb <init> (I[B)V
L23:    putstatic Field bc d Lkb;
L26:    new kb
L29:    dup
L30:    sipush 363
L33:    aload_0
L34:    ldc "npc.idx"
L36:    aconst_null
L37:    iconst_2
L38:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L41:    invokespecial Method kb <init> (I[B)V
L44:    astore_1
L45:    aload_1
L46:    invokevirtual Method kb e ()I
L49:    putstatic Field bc b I
L52:    getstatic Field bc b I
L55:    newarray int
L57:    putstatic Field bc c [I
L60:    iconst_2
L61:    istore_2
L62:    iconst_0
L63:    istore_3
L64:    iload 5
L66:    ifeq L85
L69:    getstatic Field bc c [I
L72:    iload_3
L73:    iload_2
L74:    iastore
L75:    iload_2
L76:    aload_1
L77:    invokevirtual Method kb e ()I
L80:    iadd
L81:    istore_2
L82:    iinc 3 1
L85:    iload_3
L86:    getstatic Field bc b I
L89:    if_icmplt L69
L92:    bipush 20
L94:    anewarray bc
L97:    putstatic Field bc e [Lbc;
L100:   iconst_0
L101:   istore 4
L103:   iload 5
L105:   ifeq L124
L108:   getstatic Field bc e [Lbc;
L111:   iload 4
L113:   new bc
L116:   dup
L117:   invokespecial Method bc <init> ()V
L120:   aastore
L121:   iinc 4 1
L124:   iload 4
L126:   bipush 20
L128:   if_icmplt L108
L131:   return
L132:   
    .end code
.end method

.method public static final a : (Z)V
    .code stack 4 locals 2
        .catch java/lang/RuntimeException from L0 to L35 using L36
L0:     aconst_null
L1:     putstatic Field bc C Ls;
L4:     aconst_null
L5:     putstatic Field bc c [I
L8:     aconst_null
L9:     putstatic Field bc e [Lbc;
L12:    iload_0
L13:    ifne L31
L16:    iconst_1
L17:    istore_1
L18:    getstatic Field dc c Z
L21:    ifeq L27
L24:    iinc 1 1
L27:    iload_1
L28:    ifgt L24
L31:    aconst_null
L32:    putstatic Field bc d Lkb;
L35:    return
L36:    astore_1
L37:    new java/lang/StringBuffer
L40:    dup
L41:    ldc "32991, "
L43:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L46:    iload_0
L47:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L50:    ldc ", "
L52:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L55:    aload_1
L56:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L59:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L62:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L65:    invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L68:    new java/lang/RuntimeException
L71:    dup
L72:    invokespecial Method java/lang/RuntimeException <init> ()V
L75:    athrow
L76:    
    .end code
.end method

.method public static final a : (I)Lbc;
    .code stack 5 locals 3
L0:     iconst_0
L1:     istore_1
L2:     getstatic Field dc c Z
L5:     ifeq L31
L8:     getstatic Field bc e [Lbc;
L11:    iload_1
L12:    aaload
L13:    getfield Field bc g J
L16:    iload_0
L17:    i2l
L18:    lcmp
L19:    ifne L28
L22:    getstatic Field bc e [Lbc;
L25:    iload_1
L26:    aaload
L27:    areturn
L28:    iinc 1 1
L31:    iload_1
L32:    bipush 20
L34:    if_icmplt L8
L37:    getstatic Field bc f I
L40:    iconst_1
L41:    iadd
L42:    bipush 20
L44:    irem
L45:    putstatic Field bc f I
L48:    getstatic Field bc e [Lbc;
L51:    getstatic Field bc f I
L54:    new bc
L57:    dup
L58:    invokespecial Method bc <init> ()V
L61:    dup_x2
L62:    aastore
L63:    astore_2
L64:    getstatic Field bc d Lkb;
L67:    getstatic Field bc c [I
L70:    iload_0
L71:    iaload
L72:    putfield Field kb r I
L75:    aload_2
L76:    iload_0
L77:    i2l
L78:    putfield Field bc g J
L81:    aload_2
L82:    iconst_0
L83:    getstatic Field bc d Lkb;
L86:    invokespecial Method bc a (ZLkb;)V
L89:    aload_2
L90:    areturn
L91:    
    .end code
.end method

.method private final a : (ZLkb;)V
    .code stack 4 locals 7
L0:     getstatic Field dc c Z
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L561 using L561
L5:     iload_1
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_2
L18:    invokevirtual Method kb c ()I
L21:    istore_3
L22:    iload_3
L23:    ifne L27
L26:    return
L27:    iload_3
L28:    iconst_1
L29:    if_icmpne L80
L32:    aload_2
L33:    invokevirtual Method kb c ()I
L36:    istore 4
L38:    aload_0
L39:    iload 4
L41:    newarray int
L43:    putfield Field bc k [I
L46:    iconst_0
L47:    istore 5
L49:    iload 6
L51:    ifeq L68
L54:    aload_0
L55:    getfield Field bc k [I
L58:    iload 5
L60:    aload_2
L61:    invokevirtual Method kb e ()I
L64:    iastore
L65:    iinc 5 1
L68:    iload 5
L70:    iload 4
L72:    if_icmplt L54
L75:    iload 6
L77:    ifeq L17
L80:    iload_3
L81:    iconst_2
L82:    if_icmpne L98
L85:    aload_0
L86:    aload_2
L87:    invokevirtual Method kb i ()Ljava/lang/String;
L90:    putfield Field bc h Ljava/lang/String;
L93:    iload 6
L95:    ifeq L17
L98:    iload_3
L99:    iconst_3
L100:   if_icmpne L118
L103:   aload_0
L104:   aload_2
L105:   bipush 31
L107:   invokevirtual Method kb b (B)[B
L110:   putfield Field bc i [B
L113:   iload 6
L115:   ifeq L17
L118:   iload_3
L119:   bipush 12
L121:   if_icmpne L137
L124:   aload_0
L125:   aload_2
L126:   invokevirtual Method kb d ()B
L129:   putfield Field bc j B
L132:   iload 6
L134:   ifeq L17
L137:   iload_3
L138:   bipush 13
L140:   if_icmpne L156
L143:   aload_0
L144:   aload_2
L145:   invokevirtual Method kb e ()I
L148:   putfield Field bc m I
L151:   iload 6
L153:   ifeq L17
L156:   iload_3
L157:   bipush 14
L159:   if_icmpne L175
L162:   aload_0
L163:   aload_2
L164:   invokevirtual Method kb e ()I
L167:   putfield Field bc n I
L170:   iload 6
L172:   ifeq L17
L175:   iload_3
L176:   bipush 16
L178:   if_icmpne L191
L181:   aload_0
L182:   iconst_1
L183:   putfield Field bc r Z
L186:   iload 6
L188:   ifeq L17
L191:   iload_3
L192:   bipush 17
L194:   if_icmpne L234
L197:   aload_0
L198:   aload_2
L199:   invokevirtual Method kb e ()I
L202:   putfield Field bc n I
L205:   aload_0
L206:   aload_2
L207:   invokevirtual Method kb e ()I
L210:   putfield Field bc o I
L213:   aload_0
L214:   aload_2
L215:   invokevirtual Method kb e ()I
L218:   putfield Field bc p I
L221:   aload_0
L222:   aload_2
L223:   invokevirtual Method kb e ()I
L226:   putfield Field bc q I
L229:   iload 6
L231:   ifeq L17
L234:   iload_3
L235:   bipush 30
L237:   if_icmplt L306
L240:   iload_3
L241:   bipush 40
L243:   if_icmpge L306
L246:   aload_0
L247:   getfield Field bc u [Ljava/lang/String;
L250:   ifnonnull L261
L253:   aload_0
L254:   iconst_5
L255:   anewarray java/lang/String
L258:   putfield Field bc u [Ljava/lang/String;
L261:   aload_0
L262:   getfield Field bc u [Ljava/lang/String;
L265:   iload_3
L266:   bipush 30
L268:   isub
L269:   aload_2
L270:   invokevirtual Method kb i ()Ljava/lang/String;
L273:   aastore
L274:   aload_0
L275:   getfield Field bc u [Ljava/lang/String;
L278:   iload_3
L279:   bipush 30
L281:   isub
L282:   aaload
L283:   ldc "hidden"
L285:   invokevirtual Method java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
L288:   ifeq L17
L291:   aload_0
L292:   getfield Field bc u [Ljava/lang/String;
L295:   iload_3
L296:   bipush 30
L298:   isub
L299:   aconst_null
L300:   aastore
L301:   iload 6
L303:   ifeq L17
L306:   iload_3
L307:   bipush 40
L309:   if_icmpne L379
L312:   aload_2
L313:   invokevirtual Method kb c ()I
L316:   istore 4
L318:   aload_0
L319:   iload 4
L321:   newarray int
L323:   putfield Field bc s [I
L326:   aload_0
L327:   iload 4
L329:   newarray int
L331:   putfield Field bc t [I
L334:   iconst_0
L335:   istore 5
L337:   iload 6
L339:   ifeq L367
L342:   aload_0
L343:   getfield Field bc s [I
L346:   iload 5
L348:   aload_2
L349:   invokevirtual Method kb e ()I
L352:   iastore
L353:   aload_0
L354:   getfield Field bc t [I
L357:   iload 5
L359:   aload_2
L360:   invokevirtual Method kb e ()I
L363:   iastore
L364:   iinc 5 1
L367:   iload 5
L369:   iload 4
L371:   if_icmplt L342
L374:   iload 6
L376:   ifeq L17
L379:   iload_3
L380:   bipush 60
L382:   if_icmpne L433
L385:   aload_2
L386:   invokevirtual Method kb c ()I
L389:   istore 4
L391:   aload_0
L392:   iload 4
L394:   newarray int
L396:   putfield Field bc l [I
L399:   iconst_0
L400:   istore 5
L402:   iload 6
L404:   ifeq L421
L407:   aload_0
L408:   getfield Field bc l [I
L411:   iload 5
L413:   aload_2
L414:   invokevirtual Method kb e ()I
L417:   iastore
L418:   iinc 5 1
L421:   iload 5
L423:   iload 4
L425:   if_icmplt L407
L428:   iload 6
L430:   ifeq L17
L433:   iload_3
L434:   bipush 90
L436:   if_icmpne L452
L439:   aload_0
L440:   aload_2
L441:   invokevirtual Method kb e ()I
L444:   putfield Field bc v I
L447:   iload 6
L449:   ifeq L17
L452:   iload_3
L453:   bipush 91
L455:   if_icmpne L471
L458:   aload_0
L459:   aload_2
L460:   invokevirtual Method kb e ()I
L463:   putfield Field bc w I
L466:   iload 6
L468:   ifeq L17
L471:   iload_3
L472:   bipush 92
L474:   if_icmpne L490
L477:   aload_0
L478:   aload_2
L479:   invokevirtual Method kb e ()I
L482:   putfield Field bc x I
L485:   iload 6
L487:   ifeq L17
L490:   iload_3
L491:   bipush 93
L493:   if_icmpne L506
L496:   aload_0
L497:   iconst_0
L498:   putfield Field bc y Z
L501:   iload 6
L503:   ifeq L17
L506:   iload_3
L507:   bipush 95
L509:   if_icmpne L525
L512:   aload_0
L513:   aload_2
L514:   invokevirtual Method kb e ()I
L517:   putfield Field bc z I
L520:   iload 6
L522:   ifeq L17
L525:   iload_3
L526:   bipush 97
L528:   if_icmpne L544
L531:   aload_0
L532:   aload_2
L533:   invokevirtual Method kb e ()I
L536:   putfield Field bc A I
L539:   iload 6
L541:   ifeq L17
L544:   iload_3
L545:   bipush 98
L547:   if_icmpne L17
L550:   aload_0
L551:   aload_2
L552:   invokevirtual Method kb e ()I
L555:   putfield Field bc B I
L558:   goto L17
L561:   astore_3
L562:   new java/lang/StringBuffer
L565:   dup
L566:   ldc "30732, "
L568:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L571:   iload_1
L572:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L575:   ldc ", "
L577:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L580:   aload_2
L581:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L584:   ldc ", "
L586:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L589:   aload_3
L590:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L593:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L596:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L599:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L602:   new java/lang/RuntimeException
L605:   dup
L606:   invokespecial Method java/lang/RuntimeException <init> ()V
L609:   athrow
L610:   
    .end code
.end method

.method public final a : (II[I)Leb;
    .code stack 8 locals 10
L0:     getstatic Field dc c Z
L3:     istore 9
L5:     aconst_null
L6:     astore 4
L8:     getstatic Field bc C Ls;
L11:    aload_0
L12:    getfield Field bc g J
L15:    invokevirtual Method s a (J)Ldb;
L18:    checkcast eb
L21:    astore 5
L23:    aload 5
L25:    ifnonnull L196
L28:    aload_0
L29:    getfield Field bc k [I
L32:    arraylength
L33:    anewarray eb
L36:    astore 6
L38:    iconst_0
L39:    istore 7
L41:    iload 9
L43:    ifeq L69
L46:    aload 6
L48:    iload 7
L50:    new eb
L53:    dup
L54:    iconst_0
L55:    aload_0
L56:    getfield Field bc k [I
L59:    iload 7
L61:    iaload
L62:    invokespecial Method eb <init> (ZI)V
L65:    aastore
L66:    iinc 7 1
L69:    iload 7
L71:    aload_0
L72:    getfield Field bc k [I
L75:    arraylength
L76:    if_icmplt L46
L79:    aload 6
L81:    arraylength
L82:    iconst_1
L83:    if_icmpne L97
L86:    aload 6
L88:    iconst_0
L89:    aaload
L90:    astore 5
L92:    iload 9
L94:    ifeq L112
L97:    new eb
L100:   dup
L101:   iconst_0
L102:   aload 6
L104:   aload 6
L106:   arraylength
L107:   invokespecial Method eb <init> (I[Leb;I)V
L110:   astore 5
L112:   aload_0
L113:   getfield Field bc s [I
L116:   ifnull L159
L119:   iconst_0
L120:   istore 8
L122:   iload 9
L124:   ifeq L149
L127:   aload 5
L129:   aload_0
L130:   getfield Field bc s [I
L133:   iload 8
L135:   iaload
L136:   aload_0
L137:   getfield Field bc t [I
L140:   iload 8
L142:   iaload
L143:   invokevirtual Method eb b (II)V
L146:   iinc 8 1
L149:   iload 8
L151:   aload_0
L152:   getfield Field bc s [I
L155:   arraylength
L156:   if_icmplt L127
L159:   aload 5
L161:   iconst_4
L162:   invokevirtual Method eb c (I)V
L165:   aload 5
L167:   bipush 64
L169:   sipush 850
L172:   bipush -30
L174:   bipush -50
L176:   bipush -30
L178:   iconst_1
L179:   invokevirtual Method eb a (IIIIIZ)V
L182:   getstatic Field bc C Ls;
L185:   bipush 6
L187:   aload_0
L188:   getfield Field bc g J
L191:   aload 5
L193:   invokevirtual Method s a (IJLdb;)V
L196:   new eb
L199:   dup
L200:   iconst_0
L201:   aload 5
L203:   aload_0
L204:   getfield Field bc r Z
L207:   ifeq L214
L210:   iconst_0
L211:   goto L215
L214:   iconst_1
L215:   invokespecial Method eb <init> (ILeb;Z)V
L218:   astore 4
L220:   iload_1
L221:   iconst_m1
L222:   if_icmpeq L244
L225:   iload_2
L226:   iconst_m1
L227:   if_icmpeq L244
L230:   aload 4
L232:   iload_2
L233:   iconst_3
L234:   iload_1
L235:   aload_3
L236:   invokevirtual Method eb a (III[I)V
L239:   iload 9
L241:   ifeq L258
L244:   iload_1
L245:   iconst_m1
L246:   if_icmpeq L258
L249:   aload 4
L251:   sipush -16599
L254:   iload_1
L255:   invokevirtual Method eb a (II)V
L258:   aload_0
L259:   getfield Field bc A I
L262:   sipush 128
L265:   if_icmpne L278
L268:   aload_0
L269:   getfield Field bc B I
L272:   sipush 128
L275:   if_icmpeq L296
L278:   aload 4
L280:   aload_0
L281:   getfield Field bc A I
L284:   iconst_2
L285:   aload_0
L286:   getfield Field bc B I
L289:   aload_0
L290:   getfield Field bc A I
L293:   invokevirtual Method eb b (IIII)V
L296:   aload 4
L298:   sipush 2992
L301:   invokevirtual Method eb a (I)V
L304:   aload 4
L306:   aconst_null
L307:   putfield Field eb U [[I
L310:   aload 4
L312:   aconst_null
L313:   putfield Field eb T [[I
L316:   aload_0
L317:   getfield Field bc j B
L320:   iconst_1
L321:   if_icmpne L330
L324:   aload 4
L326:   iconst_1
L327:   putfield Field eb V Z
L330:   aload 4
L332:   areturn
L333:   
    .end code
.end method

.method public final b : (Z)Leb;
    .code stack 8 locals 7
L0:     getstatic Field dc c Z
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L150 using L150
L5:     iload_1
L6:     ifeq L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
L17:    aload_0
L18:    getfield Field bc l [I
L21:    ifnonnull L26
L24:    aconst_null
L25:    areturn
L26:    aload_0
L27:    getfield Field bc l [I
L30:    arraylength
L31:    anewarray eb
L34:    astore_2
L35:    iconst_0
L36:    istore_3
L37:    iload 6
L39:    ifeq L62
L42:    aload_2
L43:    iload_3
L44:    new eb
L47:    dup
L48:    iconst_0
L49:    aload_0
L50:    getfield Field bc l [I
L53:    iload_3
L54:    iaload
L55:    invokespecial Method eb <init> (ZI)V
L58:    aastore
L59:    iinc 3 1
L62:    iload_3
L63:    aload_0
L64:    getfield Field bc l [I
L67:    arraylength
L68:    if_icmplt L42
L71:    aload_2
L72:    arraylength
L73:    iconst_1
L74:    if_icmpne L87
L77:    aload_2
L78:    iconst_0
L79:    aaload
L80:    astore 4
L82:    iload 6
L84:    ifeq L100
L87:    new eb
L90:    dup
L91:    iconst_0
L92:    aload_2
L93:    aload_2
L94:    arraylength
L95:    invokespecial Method eb <init> (I[Leb;I)V
L98:    astore 4
L100:   aload_0
L101:   getfield Field bc s [I
L104:   ifnull L147
L107:   iconst_0
L108:   istore 5
L110:   iload 6
L112:   ifeq L137
L115:   aload 4
L117:   aload_0
L118:   getfield Field bc s [I
L121:   iload 5
L123:   iaload
L124:   aload_0
L125:   getfield Field bc t [I
L128:   iload 5
L130:   iaload
L131:   invokevirtual Method eb b (II)V
L134:   iinc 5 1
L137:   iload 5
L139:   aload_0
L140:   getfield Field bc s [I
L143:   arraylength
L144:   if_icmplt L115
L147:   aload 4
L149:   areturn
L150:   astore_2
L151:   new java/lang/StringBuffer
L154:   dup
L155:   ldc "86097, "
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

.method <init> : ()V
    .code stack 3 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_0
L6:     putfield Field bc a Z
L9:     aload_0
L10:    ldc2_w -1L
L13:    putfield Field bc g J
L16:    aload_0
L17:    iconst_1
L18:    putfield Field bc j B
L21:    aload_0
L22:    iconst_m1
L23:    putfield Field bc m I
L26:    aload_0
L27:    iconst_m1
L28:    putfield Field bc n I
L31:    aload_0
L32:    iconst_m1
L33:    putfield Field bc o I
L36:    aload_0
L37:    iconst_m1
L38:    putfield Field bc p I
L41:    aload_0
L42:    iconst_m1
L43:    putfield Field bc q I
L46:    aload_0
L47:    iconst_0
L48:    putfield Field bc r Z
L51:    aload_0
L52:    iconst_m1
L53:    putfield Field bc v I
L56:    aload_0
L57:    iconst_m1
L58:    putfield Field bc w I
L61:    aload_0
L62:    iconst_m1
L63:    putfield Field bc x I
L66:    aload_0
L67:    iconst_1
L68:    putfield Field bc y Z
L71:    aload_0
L72:    iconst_m1
L73:    putfield Field bc z I
L76:    aload_0
L77:    sipush 128
L80:    putfield Field bc A I
L83:    aload_0
L84:    sipush 128
L87:    putfield Field bc B I
L90:    return
L91:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     new s
L3:     dup
L4:     iconst_0
L5:     bipush 30
L7:     invokespecial Method s <init> (BI)V
L10:    putstatic Field bc C Ls;
L13:    return
L14:    
    .end code
.end method
.end class
