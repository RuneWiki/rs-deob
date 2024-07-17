.version 45 3
.class public final super jb
.super fb
.field private v Z
.field private w B
.field private x B
.field private y B
.field private z I
.field private A I
.field B [[B
.field C [I
.field D [I
.field E [I
.field F [I
.field G [I
.field H [I
.field public I I
.field J Ljava/util/Random;
.field static K [I

.method public <init> : (Lub;Ljava/lang/String;I)V
    .code stack 8 locals 17
L0:     getstatic Field fb u I
L3:     istore 15
L5:     aload_0
L6:     invokespecial Method fb <init> ()V
L9:     aload_0
L10:    iconst_1
L11:    putfield Field jb v Z
L14:    aload_0
L15:    bipush 8
L17:    putfield Field jb w B
L20:    aload_0
L21:    bipush 6
L23:    putfield Field jb x B
L26:    aload_0
L27:    iconst_2
L28:    putfield Field jb y B
L31:    aload_0
L32:    sipush -708
L35:    putfield Field jb z I
L38:    aload_0
L39:    sipush 997
L42:    putfield Field jb A I
L45:    aload_0
L46:    bipush 94
L48:    multianewarray [[B 1
L52:    putfield Field jb B [[B
L55:    aload_0
L56:    bipush 94
L58:    newarray int
L60:    putfield Field jb C [I
L63:    aload_0
L64:    bipush 94
L66:    newarray int
L68:    putfield Field jb D [I
L71:    aload_0
L72:    bipush 94
L74:    newarray int
L76:    putfield Field jb E [I
L79:    aload_0
L80:    bipush 94
L82:    newarray int
L84:    putfield Field jb F [I
L87:    aload_0
L88:    bipush 95
L90:    newarray int
L92:    putfield Field jb G [I
L95:    aload_0
L96:    sipush 256
L99:    newarray int
L101:   putfield Field jb H [I
L104:   aload_0
L105:   new java/util/Random
L108:   dup
L109:   invokespecial Method java/util/Random <init> ()V
L112:   putfield Field jb J Ljava/util/Random;
        .catch java/lang/RuntimeException from L115 to L659 using L660
L115:   new kb
L118:   dup
L119:   sipush 363
L122:   aload_1
L123:   new java/lang/StringBuffer
L126:   dup
L127:   aload_2
L128:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L131:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L134:   ldc ".dat"
L136:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L139:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L142:   aconst_null
L143:   iconst_2
L144:   invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L147:   invokespecial Method kb <init> (I[B)V
L150:   astore 4
L152:   new kb
L155:   dup
L156:   sipush 363
L159:   aload_1
L160:   ldc "index.dat"
L162:   aconst_null
L163:   iconst_2
L164:   invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L167:   invokespecial Method kb <init> (I[B)V
L170:   astore 5
L172:   aload 5
L174:   aload 4
L176:   invokevirtual Method kb e ()I
L179:   iconst_4
L180:   iadd
L181:   putfield Field kb r I
L184:   aload 5
L186:   invokevirtual Method kb c ()I
L189:   istore 6
L191:   iload 6
L193:   ifle L212
L196:   aload 5
L198:   dup
L199:   getfield Field kb r I
L202:   iconst_3
L203:   iload 6
L205:   iconst_1
L206:   isub
L207:   imul
L208:   iadd
L209:   putfield Field kb r I
L212:   iconst_0
L213:   istore 7
L215:   iload 15
L217:   ifeq L596
L220:   getstatic Field u d I
L223:   istore 16
L225:   iinc 16 1
L228:   iload 16
L230:   putstatic Field u d I
L233:   aload_0
L234:   getfield Field jb E [I
L237:   iload 7
L239:   aload 5
L241:   invokevirtual Method kb c ()I
L244:   iastore
L245:   aload_0
L246:   getfield Field jb F [I
L249:   iload 7
L251:   aload 5
L253:   invokevirtual Method kb c ()I
L256:   iastore
L257:   aload_0
L258:   getfield Field jb C [I
L261:   iload 7
L263:   aload 5
L265:   invokevirtual Method kb e ()I
L268:   dup_x2
L269:   iastore
L270:   istore 8
L272:   aload_0
L273:   getfield Field jb D [I
L276:   iload 7
L278:   aload 5
L280:   invokevirtual Method kb e ()I
L283:   dup_x2
L284:   iastore
L285:   istore 9
L287:   aload 5
L289:   invokevirtual Method kb c ()I
L292:   istore 10
L294:   iload 8
L296:   iload 9
L298:   imul
L299:   istore 11
L301:   aload_0
L302:   getfield Field jb B [[B
L305:   iload 7
L307:   iload 11
L309:   newarray byte
L311:   aastore
L312:   iload 10
L314:   ifne L355
L317:   iconst_0
L318:   istore 12
L320:   iload 15
L322:   ifeq L343
L325:   aload_0
L326:   getfield Field jb B [[B
L329:   iload 7
L331:   aaload
L332:   iload 12
L334:   aload 4
L336:   invokevirtual Method kb d ()B
L339:   bastore
L340:   iinc 12 1
L343:   iload 12
L345:   iload 11
L347:   if_icmplt L325
L350:   iload 15
L352:   ifeq L418
L355:   iload 10
L357:   iconst_1
L358:   if_icmpne L418
L361:   iconst_0
L362:   istore 12
L364:   iload 15
L366:   ifeq L411
L369:   iconst_0
L370:   istore 13
L372:   iload 15
L374:   ifeq L401
L377:   aload_0
L378:   getfield Field jb B [[B
L381:   iload 7
L383:   aaload
L384:   iload 12
L386:   iload 13
L388:   iload 8
L390:   imul
L391:   iadd
L392:   aload 4
L394:   invokevirtual Method kb d ()B
L397:   bastore
L398:   iinc 13 1
L401:   iload 13
L403:   iload 9
L405:   if_icmplt L377
L408:   iinc 12 1
L411:   iload 12
L413:   iload 8
L415:   if_icmplt L369
L418:   iload 9
L420:   aload_0
L421:   getfield Field jb I I
L424:   if_icmple L433
L427:   aload_0
L428:   iload 9
L430:   putfield Field jb I I
L433:   aload_0
L434:   getfield Field jb E [I
L437:   iload 7
L439:   iconst_1
L440:   iastore
L441:   aload_0
L442:   getfield Field jb G [I
L445:   iload 7
L447:   iload 8
L449:   iconst_2
L450:   iadd
L451:   iastore
L452:   iconst_0
L453:   istore 12
L455:   iload 9
L457:   bipush 7
L459:   idiv
L460:   istore 13
L462:   iload 15
L464:   ifeq L488
L467:   iload 12
L469:   aload_0
L470:   getfield Field jb B [[B
L473:   iload 7
L475:   aaload
L476:   iload 13
L478:   iload 8
L480:   imul
L481:   baload
L482:   iadd
L483:   istore 12
L485:   iinc 13 1
L488:   iload 13
L490:   iload 9
L492:   if_icmplt L467
L495:   iload 12
L497:   iload 9
L499:   bipush 7
L501:   idiv
L502:   if_icmpgt L524
L505:   aload_0
L506:   getfield Field jb G [I
L509:   iload 7
L511:   dup2
L512:   iaload
L513:   iconst_1
L514:   isub
L515:   iastore
L516:   aload_0
L517:   getfield Field jb E [I
L520:   iload 7
L522:   iconst_0
L523:   iastore
L524:   iconst_0
L525:   istore 12
L527:   iload 9
L529:   bipush 7
L531:   idiv
L532:   istore 14
L534:   iload 15
L536:   ifeq L565
L539:   iload 12
L541:   aload_0
L542:   getfield Field jb B [[B
L545:   iload 7
L547:   aaload
L548:   iload 8
L550:   iconst_1
L551:   isub
L552:   iload 14
L554:   iload 8
L556:   imul
L557:   iadd
L558:   baload
L559:   iadd
L560:   istore 12
L562:   iinc 14 1
L565:   iload 14
L567:   iload 9
L569:   if_icmplt L539
L572:   iload 12
L574:   iload 9
L576:   bipush 7
L578:   idiv
L579:   if_icmpgt L593
L582:   aload_0
L583:   getfield Field jb G [I
L586:   iload 7
L588:   dup2
L589:   iaload
L590:   iconst_1
L591:   isub
L592:   iastore
L593:   iinc 7 1
L596:   iload 7
L598:   bipush 94
L600:   if_icmplt L233
L603:   bipush 9
L605:   iload_3
L606:   idiv
L607:   istore_3
L608:   aload_0
L609:   getfield Field jb G [I
L612:   bipush 94
L614:   aload_0
L615:   getfield Field jb G [I
L618:   bipush 8
L620:   iaload
L621:   iastore
L622:   iconst_0
L623:   istore 8
L625:   iload 15
L627:   ifeq L651
L630:   aload_0
L631:   getfield Field jb H [I
L634:   iload 8
L636:   aload_0
L637:   getfield Field jb G [I
L640:   getstatic Field jb K [I
L643:   iload 8
L645:   iaload
L646:   iaload
L647:   iastore
L648:   iinc 8 1
L651:   iload 8
L653:   sipush 256
L656:   if_icmplt L630
L659:   return
L660:   astore 4
L662:   new java/lang/StringBuffer
L665:   dup
L666:   ldc "26392, "
L668:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L671:   aload_1
L672:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L675:   ldc ", "
L677:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L680:   aload_2
L681:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L684:   ldc ", "
L686:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L689:   iload_3
L690:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L693:   ldc ", "
L695:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L698:   aload 4
L700:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L703:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L706:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L709:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L712:   new java/lang/RuntimeException
L715:   dup
L716:   invokespecial Method java/lang/RuntimeException <init> ()V
L719:   athrow
L720:   
    .end code
.end method

.method public a : (IBILjava/lang/String;I)V
    .code stack 6 locals 7
        .catch java/lang/RuntimeException from L0 to L34 using L35
L0:     iload_2
L1:     bipush 6
L3:     if_icmpeq L13
L6:     aload_0
L7:     sipush 140
L10:    putfield Field jb A I
L13:    aload_0
L14:    iload 5
L16:    aload_0
L17:    iconst_0
L18:    aload 4
L20:    invokevirtual Method jb a (ZLjava/lang/String;)I
L23:    iconst_2
L24:    idiv
L25:    isub
L26:    iload_1
L27:    iconst_0
L28:    iload_3
L29:    aload 4
L31:    invokevirtual Method jb a (IIZILjava/lang/String;)V
L34:    return
L35:    astore 6
L37:    new java/lang/StringBuffer
L40:    dup
L41:    ldc "38285, "
L43:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L46:    iload_1
L47:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L50:    ldc ", "
L52:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L55:    iload_2
L56:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L59:    ldc ", "
L61:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L64:    iload_3
L65:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L68:    ldc ", "
L70:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L73:    aload 4
L75:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L78:    ldc ", "
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    iload 5
L85:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L88:    ldc ", "
L90:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L93:    aload 6
L95:    invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L98:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L101:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L104:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L107:   new java/lang/RuntimeException
L110:   dup
L111:   invokespecial Method java/lang/RuntimeException <init> ()V
L114:   athrow
L115:   
    .end code
.end method

.method public a : (IIZILjava/lang/String;I)V
    .code stack 7 locals 8
        .catch java/lang/RuntimeException from L0 to L44 using L45
L0:     aload_0
L1:     iload_1
L2:     aload_0
L3:     iconst_0
L4:     aload 5
L6:     invokevirtual Method jb a (ZLjava/lang/String;)I
L9:     iconst_2
L10:    idiv
L11:    isub
L12:    bipush 6
L14:    iload 4
L16:    aload 5
L18:    iload_3
L19:    iload_2
L20:    invokevirtual Method jb a (IIILjava/lang/String;ZI)V
L23:    iload 6
L25:    ifeq L135
L28:    aload_0
L29:    aload_0
L30:    getfield Field jb v Z
L33:    ifeq L40
L36:    iconst_0
L37:    goto L41
L40:    iconst_1
L41:    putfield Field jb v Z
L44:    return
L45:    astore 7
L47:    new java/lang/StringBuffer
L50:    dup
L51:    ldc "53756, "
L53:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L56:    iload_1
L57:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L60:    ldc ", "
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L65:    iload_2
L66:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L69:    ldc ", "
L71:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L74:    iload_3
L75:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L78:    ldc ", "
L80:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L83:    iload 4
L85:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L88:    ldc ", "
L90:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L93:    aload 5
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    ldc ", "
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   iload 6
L105:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L108:   ldc ", "
L110:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L113:   aload 7
L115:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L118:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L121:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L124:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L127:   new java/lang/RuntimeException
L130:   dup
L131:   invokespecial Method java/lang/RuntimeException <init> ()V
L134:   athrow
L135:   return
L136:   
    .end code
.end method

.method public a : (ZLjava/lang/String;)I
    .code stack 5 locals 6
L0:     getstatic Field fb u I
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L101 using L101
L5:     aload_2
L6:     ifnonnull L11
L9:     iconst_0
L10:    ireturn
L11:    iconst_0
L12:    istore_3
L13:    iload_1
L14:    ifeq L22
L17:    aload_0
L18:    getfield Field jb z I
L21:    ireturn
L22:    iconst_0
L23:    istore 4
L25:    iload 5
L27:    ifeq L90
L30:    aload_2
L31:    iload 4
L33:    invokevirtual Method java/lang/String charAt (I)C
L36:    bipush 64
L38:    if_icmpne L73
L41:    iload 4
L43:    iconst_4
L44:    iadd
L45:    aload_2
L46:    invokevirtual Method java/lang/String length ()I
L49:    if_icmpge L73
L52:    aload_2
L53:    iload 4
L55:    iconst_4
L56:    iadd
L57:    invokevirtual Method java/lang/String charAt (I)C
L60:    bipush 64
L62:    if_icmpne L73
L65:    iinc 4 4
L68:    iload 5
L70:    ifeq L87
L73:    iload_3
L74:    aload_0
L75:    getfield Field jb H [I
L78:    aload_2
L79:    iload 4
L81:    invokevirtual Method java/lang/String charAt (I)C
L84:    iaload
L85:    iadd
L86:    istore_3
L87:    iinc 4 1
L90:    iload 4
L92:    aload_2
L93:    invokevirtual Method java/lang/String length ()I
L96:    if_icmplt L30
L99:    iload_3
L100:   ireturn
L101:   astore_3
L102:   new java/lang/StringBuffer
L105:   dup
L106:   ldc "24781, "
L108:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L111:   iload_1
L112:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L115:   ldc ", "
L117:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L120:   aload_2
L121:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L124:   ldc ", "
L126:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L129:   aload_3
L130:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L136:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L139:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L142:   new java/lang/RuntimeException
L145:   dup
L146:   invokespecial Method java/lang/RuntimeException <init> ()V
L149:   athrow
L150:   
    .end code
.end method

.method public a : (IIZILjava/lang/String;)V
    .code stack 8 locals 8
        .catch java/lang/RuntimeException from L0 to L130 using L131
L0:     aload 5
L2:     ifnonnull L6
L5:     return
L6:     iload_2
L7:     aload_0
L8:     getfield Field jb I I
L11:    isub
L12:    istore_2
L13:    iload_3
L14:    ifeq L33
L17:    aload_0
L18:    aload_0
L19:    getfield Field jb v Z
L22:    ifeq L29
L25:    iconst_0
L26:    goto L30
L29:    iconst_1
L30:    putfield Field jb v Z
L33:    iconst_0
L34:    istore 6
L36:    getstatic Field fb u I
L39:    ifeq L120
L42:    getstatic Field jb K [I
L45:    aload 5
L47:    iload 6
L49:    invokevirtual Method java/lang/String charAt (I)C
L52:    iaload
L53:    istore 7
L55:    iload 7
L57:    bipush 94
L59:    if_icmpeq L107
L62:    aload_0
L63:    aload_0
L64:    getfield Field jb B [[B
L67:    iload 7
L69:    aaload
L70:    iload_1
L71:    aload_0
L72:    getfield Field jb E [I
L75:    iload 7
L77:    iaload
L78:    iadd
L79:    iload_2
L80:    aload_0
L81:    getfield Field jb F [I
L84:    iload 7
L86:    iaload
L87:    iadd
L88:    aload_0
L89:    getfield Field jb C [I
L92:    iload 7
L94:    iaload
L95:    aload_0
L96:    getfield Field jb D [I
L99:    iload 7
L101:   iaload
L102:   iload 4
L104:   invokespecial Method jb a ([BIIIII)V
L107:   iload_1
L108:   aload_0
L109:   getfield Field jb G [I
L112:   iload 7
L114:   iaload
L115:   iadd
L116:   istore_1
L117:   iinc 6 1
L120:   iload 6
L122:   aload 5
L124:   invokevirtual Method java/lang/String length ()I
L127:   if_icmplt L42
L130:   return
L131:   astore 6
L133:   new java/lang/StringBuffer
L136:   dup
L137:   ldc "10686, "
L139:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L142:   iload_1
L143:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L146:   ldc ", "
L148:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L151:   iload_2
L152:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L155:   ldc ", "
L157:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L160:   iload_3
L161:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L164:   ldc ", "
L166:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L169:   iload 4
L171:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L174:   ldc ", "
L176:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L179:   aload 5
L181:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L184:   ldc ", "
L186:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L189:   aload 6
L191:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L194:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L197:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L200:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L203:   new java/lang/RuntimeException
L206:   dup
L207:   invokespecial Method java/lang/RuntimeException <init> ()V
L210:   athrow
L211:   
    .end code
.end method

.method public a : (IBIIILjava/lang/String;)V
    .code stack 11 locals 10
L0:     getstatic Field fb u I
L3:     istore 9
        .catch java/lang/RuntimeException from L5 to L176 using L177
L5:     aload 6
L7:     ifnonnull L11
L10:    return
L11:    iload_3
L12:    aload_0
L13:    iconst_0
L14:    aload 6
L16:    invokevirtual Method jb a (ZLjava/lang/String;)I
L19:    iconst_2
L20:    idiv
L21:    isub
L22:    istore_3
L23:    iload 4
L25:    aload_0
L26:    getfield Field jb I I
L29:    isub
L30:    istore 4
L32:    iload_2
L33:    aload_0
L34:    getfield Field jb w B
L37:    if_icmpeq L56
L40:    iconst_1
L41:    istore 7
L43:    iload 9
L45:    ifeq L51
L48:    iinc 7 1
L51:    iload 7
L53:    ifgt L48
L56:    iconst_0
L57:    istore 7
L59:    iload 9
L61:    ifeq L166
L64:    getstatic Field jb K [I
L67:    aload 6
L69:    iload 7
L71:    invokevirtual Method java/lang/String charAt (I)C
L74:    iaload
L75:    istore 8
L77:    iload 8
L79:    bipush 94
L81:    if_icmpeq L153
L84:    aload_0
L85:    aload_0
L86:    getfield Field jb B [[B
L89:    iload 8
L91:    aaload
L92:    iload_3
L93:    aload_0
L94:    getfield Field jb E [I
L97:    iload 8
L99:    iaload
L100:   iadd
L101:   iload 4
L103:   aload_0
L104:   getfield Field jb F [I
L107:   iload 8
L109:   iaload
L110:   iadd
L111:   iload 7
L113:   i2d
L114:   ldc2_w 2e0
L117:   ddiv
L118:   iload_1
L119:   i2d
L120:   ldc2_w 5e0
L123:   ddiv
L124:   dadd
L125:   invokestatic Method java/lang/Math sin (D)D
L128:   ldc2_w 5e0
L131:   dmul
L132:   d2i
L133:   iadd
L134:   aload_0
L135:   getfield Field jb C [I
L138:   iload 8
L140:   iaload
L141:   aload_0
L142:   getfield Field jb D [I
L145:   iload 8
L147:   iaload
L148:   iload 5
L150:   invokespecial Method jb a ([BIIIII)V
L153:   iload_3
L154:   aload_0
L155:   getfield Field jb G [I
L158:   iload 8
L160:   iaload
L161:   iadd
L162:   istore_3
L163:   iinc 7 1
L166:   iload 7
L168:   aload 6
L170:   invokevirtual Method java/lang/String length ()I
L173:   if_icmplt L64
L176:   return
L177:   astore 7
L179:   new java/lang/StringBuffer
L182:   dup
L183:   ldc "9153, "
L185:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L188:   iload_1
L189:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L192:   ldc ", "
L194:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L197:   iload_2
L198:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L201:   ldc ", "
L203:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L206:   iload_3
L207:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L210:   ldc ", "
L212:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L215:   iload 4
L217:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L220:   ldc ", "
L222:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L225:   iload 5
L227:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L230:   ldc ", "
L232:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L235:   aload 6
L237:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L240:   ldc ", "
L242:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L245:   aload 7
L247:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L250:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L253:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L256:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L259:   new java/lang/RuntimeException
L262:   dup
L263:   invokespecial Method java/lang/RuntimeException <init> ()V
L266:   athrow
L267:   
    .end code
.end method

.method public a : (IIILjava/lang/String;ZI)V
    .code stack 8 locals 10
L0:     getstatic Field fb u I
L3:     istore 9
        .catch java/lang/RuntimeException from L5 to L240 using L240
L5:     aload 4
L7:     ifnonnull L11
L10:    return
L11:    iload_3
L12:    aload_0
L13:    getfield Field jb I I
L16:    isub
L17:    istore_3
L18:    iconst_0
L19:    istore 7
L21:    iload 9
L23:    ifeq L223
L26:    aload 4
L28:    iload 7
L30:    invokevirtual Method java/lang/String charAt (I)C
L33:    bipush 64
L35:    if_icmpne L92
L38:    iload 7
L40:    iconst_4
L41:    iadd
L42:    aload 4
L44:    invokevirtual Method java/lang/String length ()I
L47:    if_icmpge L92
L50:    aload 4
L52:    iload 7
L54:    iconst_4
L55:    iadd
L56:    invokevirtual Method java/lang/String charAt (I)C
L59:    bipush 64
L61:    if_icmpne L92
L64:    aload_0
L65:    iconst_0
L66:    aload 4
L68:    iload 7
L70:    iconst_1
L71:    iadd
L72:    iload 7
L74:    iconst_4
L75:    iadd
L76:    invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L79:    invokevirtual Method jb a (ILjava/lang/String;)I
L82:    istore 6
L84:    iinc 7 4
L87:    iload 9
L89:    ifeq L220
L92:    getstatic Field jb K [I
L95:    aload 4
L97:    iload 7
L99:    invokevirtual Method java/lang/String charAt (I)C
L102:   iaload
L103:   istore 8
L105:   iload 8
L107:   bipush 94
L109:   if_icmpeq L210
L112:   iload 5
L114:   ifeq L165
L117:   aload_0
L118:   aload_0
L119:   getfield Field jb B [[B
L122:   iload 8
L124:   aaload
L125:   iload_1
L126:   aload_0
L127:   getfield Field jb E [I
L130:   iload 8
L132:   iaload
L133:   iadd
L134:   iconst_1
L135:   iadd
L136:   iload_3
L137:   aload_0
L138:   getfield Field jb F [I
L141:   iload 8
L143:   iaload
L144:   iadd
L145:   iconst_1
L146:   iadd
L147:   aload_0
L148:   getfield Field jb C [I
L151:   iload 8
L153:   iaload
L154:   aload_0
L155:   getfield Field jb D [I
L158:   iload 8
L160:   iaload
L161:   iconst_0
L162:   invokespecial Method jb a ([BIIIII)V
L165:   aload_0
L166:   aload_0
L167:   getfield Field jb B [[B
L170:   iload 8
L172:   aaload
L173:   iload_1
L174:   aload_0
L175:   getfield Field jb E [I
L178:   iload 8
L180:   iaload
L181:   iadd
L182:   iload_3
L183:   aload_0
L184:   getfield Field jb F [I
L187:   iload 8
L189:   iaload
L190:   iadd
L191:   aload_0
L192:   getfield Field jb C [I
L195:   iload 8
L197:   iaload
L198:   aload_0
L199:   getfield Field jb D [I
L202:   iload 8
L204:   iaload
L205:   iload 6
L207:   invokespecial Method jb a ([BIIIII)V
L210:   iload_1
L211:   aload_0
L212:   getfield Field jb G [I
L215:   iload 8
L217:   iaload
L218:   iadd
L219:   istore_1
L220:   iinc 7 1
L223:   iload 7
L225:   aload 4
L227:   invokevirtual Method java/lang/String length ()I
L230:   if_icmplt L26
L233:   iload_2
L234:   bipush 6
L236:   if_icmpeq L330
L239:   return
L240:   astore 7
L242:   new java/lang/StringBuffer
L245:   dup
L246:   ldc "2788, "
L248:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L251:   iload_1
L252:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L255:   ldc ", "
L257:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L260:   iload_2
L261:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L264:   ldc ", "
L266:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L269:   iload_3
L270:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L273:   ldc ", "
L275:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L278:   aload 4
L280:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L283:   ldc ", "
L285:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L288:   iload 5
L290:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L293:   ldc ", "
L295:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L298:   iload 6
L300:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L303:   ldc ", "
L305:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L308:   aload 7
L310:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L313:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L316:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L319:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L322:   new java/lang/RuntimeException
L325:   dup
L326:   invokespecial Method java/lang/RuntimeException <init> ()V
L329:   athrow
L330:   return
L331:   
    .end code
.end method

.method public a : (IZBIILjava/lang/String;I)V
    .code stack 11 locals 12
L0:     getstatic Field fb u I
L3:     istore 11
        .catch java/lang/RuntimeException from L5 to L302 using L303
L5:     aload 6
L7:     ifnonnull L11
L10:    return
L11:    aload_0
L12:    getfield Field jb J Ljava/util/Random;
L15:    iload_1
L16:    i2l
L17:    invokevirtual Method java/util/Random setSeed (J)V
L20:    sipush 192
L23:    aload_0
L24:    getfield Field jb J Ljava/util/Random;
L27:    invokevirtual Method java/util/Random nextInt ()I
L30:    bipush 31
L32:    iand
L33:    iadd
L34:    istore 8
L36:    iload 4
L38:    aload_0
L39:    getfield Field jb I I
L42:    isub
L43:    istore 4
L45:    iload_3
L46:    bipush -121
L48:    if_icmpeq L58
L51:    aload_0
L52:    sipush 341
L55:    putfield Field jb A I
L58:    iconst_0
L59:    istore 9
L61:    iload 11
L63:    ifeq L292
L66:    aload 6
L68:    iload 9
L70:    invokevirtual Method java/lang/String charAt (I)C
L73:    bipush 64
L75:    if_icmpne L132
L78:    iload 9
L80:    iconst_4
L81:    iadd
L82:    aload 6
L84:    invokevirtual Method java/lang/String length ()I
L87:    if_icmpge L132
L90:    aload 6
L92:    iload 9
L94:    iconst_4
L95:    iadd
L96:    invokevirtual Method java/lang/String charAt (I)C
L99:    bipush 64
L101:   if_icmpne L132
L104:   aload_0
L105:   iconst_0
L106:   aload 6
L108:   iload 9
L110:   iconst_1
L111:   iadd
L112:   iload 9
L114:   iconst_4
L115:   iadd
L116:   invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L119:   invokevirtual Method jb a (ILjava/lang/String;)I
L122:   istore 5
L124:   iinc 9 4
L127:   iload 11
L129:   ifeq L289
L132:   getstatic Field jb K [I
L135:   aload 6
L137:   iload 9
L139:   invokevirtual Method java/lang/String charAt (I)C
L142:   iaload
L143:   istore 10
L145:   iload 10
L147:   bipush 94
L149:   if_icmpeq L262
L152:   iload_2
L153:   ifeq L211
L156:   aload_0
L157:   aload_0
L158:   getfield Field jb B [[B
L161:   iload 10
L163:   aaload
L164:   bipush 6
L166:   iload 7
L168:   aload_0
L169:   getfield Field jb E [I
L172:   iload 10
L174:   iaload
L175:   iadd
L176:   iconst_1
L177:   iadd
L178:   aload_0
L179:   getfield Field jb D [I
L182:   iload 10
L184:   iaload
L185:   iconst_0
L186:   iload 4
L188:   aload_0
L189:   getfield Field jb F [I
L192:   iload 10
L194:   iaload
L195:   iadd
L196:   iconst_1
L197:   iadd
L198:   sipush 192
L201:   aload_0
L202:   getfield Field jb C [I
L205:   iload 10
L207:   iaload
L208:   invokespecial Method jb a ([BBIIIIII)V
L211:   aload_0
L212:   aload_0
L213:   getfield Field jb B [[B
L216:   iload 10
L218:   aaload
L219:   bipush 6
L221:   iload 7
L223:   aload_0
L224:   getfield Field jb E [I
L227:   iload 10
L229:   iaload
L230:   iadd
L231:   aload_0
L232:   getfield Field jb D [I
L235:   iload 10
L237:   iaload
L238:   iload 5
L240:   iload 4
L242:   aload_0
L243:   getfield Field jb F [I
L246:   iload 10
L248:   iaload
L249:   iadd
L250:   iload 8
L252:   aload_0
L253:   getfield Field jb C [I
L256:   iload 10
L258:   iaload
L259:   invokespecial Method jb a ([BBIIIIII)V
L262:   iload 7
L264:   aload_0
L265:   getfield Field jb G [I
L268:   iload 10
L270:   iaload
L271:   iadd
L272:   istore 7
L274:   aload_0
L275:   getfield Field jb J Ljava/util/Random;
L278:   invokevirtual Method java/util/Random nextInt ()I
L281:   iconst_3
L282:   iand
L283:   ifne L289
L286:   iinc 7 1
L289:   iinc 9 1
L292:   iload 9
L294:   aload 6
L296:   invokevirtual Method java/lang/String length ()I
L299:   if_icmplt L66
L302:   return
L303:   astore 8
L305:   new java/lang/StringBuffer
L308:   dup
L309:   ldc "44689, "
L311:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L314:   iload_1
L315:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L318:   ldc ", "
L320:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L323:   iload_2
L324:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L327:   ldc ", "
L329:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L332:   iload_3
L333:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L336:   ldc ", "
L338:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L341:   iload 4
L343:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L346:   ldc ", "
L348:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L351:   iload 5
L353:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L356:   ldc ", "
L358:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L361:   aload 6
L363:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L366:   ldc ", "
L368:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L371:   iload 7
L373:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L376:   ldc ", "
L378:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L381:   aload 8
L383:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L386:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L389:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L392:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L395:   new java/lang/RuntimeException
L398:   dup
L399:   invokespecial Method java/lang/RuntimeException <init> ()V
L402:   athrow
L403:   
    .end code
.end method

.method public a : (ILjava/lang/String;)I
    .code stack 3 locals 4
        .catch java/lang/RuntimeException from L0 to L218 using L218
L0:     iload_1
L1:     ifeq L11
L4:     aload_0
L5:     sipush 450
L8:     putfield Field jb z I
L11:    aload_2
L12:    ldc "red"
L14:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L17:    ifeq L23
L20:    ldc 16711680
L22:    ireturn
L23:    aload_2
L24:    ldc "gre"
L26:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L29:    ifeq L35
L32:    ldc 65280
L34:    ireturn
L35:    aload_2
L36:    ldc "blu"
L38:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L41:    ifeq L48
L44:    sipush 255
L47:    ireturn
L48:    aload_2
L49:    ldc "yel"
L51:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L54:    ifeq L60
L57:    ldc 16776960
L59:    ireturn
L60:    aload_2
L61:    ldc "cya"
L63:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L66:    ifeq L72
L69:    ldc 65535
L71:    ireturn
L72:    aload_2
L73:    ldc "mag"
L75:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L78:    ifeq L84
L81:    ldc 16711935
L83:    ireturn
L84:    aload_2
L85:    ldc "whi"
L87:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L90:    ifeq L96
L93:    ldc 16777215
L95:    ireturn
L96:    aload_2
L97:    ldc "bla"
L99:    invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L102:   ifeq L107
L105:   iconst_0
L106:   ireturn
L107:   aload_2
L108:   ldc "lre"
L110:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L113:   ifeq L119
L116:   ldc 16748608
L118:   ireturn
L119:   aload_2
L120:   ldc "dre"
L122:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L125:   ifeq L131
L128:   ldc 8388608
L130:   ireturn
L131:   aload_2
L132:   ldc "dbl"
L134:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L137:   ifeq L144
L140:   sipush 128
L143:   ireturn
L144:   aload_2
L145:   ldc "or1"
L147:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L150:   ifeq L156
L153:   ldc 16756736
L155:   ireturn
L156:   aload_2
L157:   ldc "or2"
L159:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L162:   ifeq L168
L165:   ldc 16740352
L167:   ireturn
L168:   aload_2
L169:   ldc "or3"
L171:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L174:   ifeq L180
L177:   ldc 16723968
L179:   ireturn
L180:   aload_2
L181:   ldc "gr1"
L183:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L186:   ifeq L192
L189:   ldc 12648192
L191:   ireturn
L192:   aload_2
L193:   ldc "gr2"
L195:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L198:   ifeq L204
L201:   ldc 8453888
L203:   ireturn
L204:   aload_2
L205:   ldc "gr3"
L207:   invokevirtual Method java/lang/String equals (Ljava/lang/Object;)Z
L210:   ifeq L216
L213:   ldc 4259584
L215:   ireturn
L216:   iconst_0
L217:   ireturn
L218:   astore_3
L219:   new java/lang/StringBuffer
L222:   dup
L223:   ldc "82682, "
L225:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L228:   iload_1
L229:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L232:   ldc ", "
L234:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L237:   aload_2
L238:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L241:   ldc ", "
L243:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L246:   aload_3
L247:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L250:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L253:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L256:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L259:   new java/lang/RuntimeException
L262:   dup
L263:   invokespecial Method java/lang/RuntimeException <init> ()V
L266:   athrow
L267:   
    .end code
.end method

.method private a : ([BIIIII)V
    .code stack 10 locals 12
L0:     iload_2
L1:     iload_3
L2:     getstatic Field fb l I
L5:     imul
L6:     iadd
L7:     istore 7
L9:     getstatic Field fb l I
L12:    iload 4
L14:    isub
L15:    istore 8
L17:    iconst_0
L18:    istore 9
L20:    iconst_0
L21:    istore 10
L23:    iload_3
L24:    getstatic Field fb n I
L27:    if_icmpge L69
L30:    getstatic Field fb n I
L33:    iload_3
L34:    isub
L35:    istore 11
L37:    iload 5
L39:    iload 11
L41:    isub
L42:    istore 5
L44:    getstatic Field fb n I
L47:    istore_3
L48:    iload 10
L50:    iload 11
L52:    iload 4
L54:    imul
L55:    iadd
L56:    istore 10
L58:    iload 7
L60:    iload 11
L62:    getstatic Field fb l I
L65:    imul
L66:    iadd
L67:    istore 7
L69:    iload_3
L70:    iload 5
L72:    iadd
L73:    getstatic Field fb o I
L76:    if_icmplt L94
L79:    iload 5
L81:    iload_3
L82:    iload 5
L84:    iadd
L85:    getstatic Field fb o I
L88:    isub
L89:    iconst_1
L90:    iadd
L91:    isub
L92:    istore 5
L94:    iload_2
L95:    getstatic Field fb p I
L98:    if_icmpge L147
L101:   getstatic Field fb p I
L104:   iload_2
L105:   isub
L106:   istore 11
L108:   iload 4
L110:   iload 11
L112:   isub
L113:   istore 4
L115:   getstatic Field fb p I
L118:   istore_2
L119:   iload 10
L121:   iload 11
L123:   iadd
L124:   istore 10
L126:   iload 7
L128:   iload 11
L130:   iadd
L131:   istore 7
L133:   iload 9
L135:   iload 11
L137:   iadd
L138:   istore 9
L140:   iload 8
L142:   iload 11
L144:   iadd
L145:   istore 8
L147:   iload_2
L148:   iload 4
L150:   iadd
L151:   getstatic Field fb q I
L154:   if_icmplt L190
L157:   iload_2
L158:   iload 4
L160:   iadd
L161:   getstatic Field fb q I
L164:   isub
L165:   iconst_1
L166:   iadd
L167:   istore 11
L169:   iload 4
L171:   iload 11
L173:   isub
L174:   istore 4
L176:   iload 9
L178:   iload 11
L180:   iadd
L181:   istore 9
L183:   iload 8
L185:   iload 11
L187:   iadd
L188:   istore 8
L190:   iload 4
L192:   ifle L200
L195:   iload 5
L197:   ifgt L201
L200:   return
L201:   aload_0
L202:   getstatic Field fb k [I
L205:   aload_1
L206:   iload 6
L208:   iload 10
L210:   iload 7
L212:   iload 4
L214:   iload 5
L216:   iload 8
L218:   iload 9
L220:   invokespecial Method jb a ([I[BIIIIIII)V
L223:   return
L224:   
    .end code
.end method

.method private a : ([I[BIIIIIII)V
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
L26:    ifeq L210
L29:    iload 10
L31:    istore 12
L33:    iload 14
L35:    ifeq L145
L38:    aload_2
L39:    iload 4
L41:    iinc 4 1
L44:    baload
L45:    ifeq L61
L48:    aload_1
L49:    iload 5
L51:    iinc 5 1
L54:    iload_3
L55:    iastore
L56:    iload 14
L58:    ifeq L64
L61:    iinc 5 1
L64:    aload_2
L65:    iload 4
L67:    iinc 4 1
L70:    baload
L71:    ifeq L87
L74:    aload_1
L75:    iload 5
L77:    iinc 5 1
L80:    iload_3
L81:    iastore
L82:    iload 14
L84:    ifeq L90
L87:    iinc 5 1
L90:    aload_2
L91:    iload 4
L93:    iinc 4 1
L96:    baload
L97:    ifeq L113
L100:   aload_1
L101:   iload 5
L103:   iinc 5 1
L106:   iload_3
L107:   iastore
L108:   iload 14
L110:   ifeq L116
L113:   iinc 5 1
L116:   aload_2
L117:   iload 4
L119:   iinc 4 1
L122:   baload
L123:   ifeq L139
L126:   aload_1
L127:   iload 5
L129:   iinc 5 1
L132:   iload_3
L133:   iastore
L134:   iload 14
L136:   ifeq L142
L139:   iinc 5 1
L142:   iinc 12 1
L145:   iload 12
L147:   iflt L38
L150:   iload 6
L152:   istore 13
L154:   iload 14
L156:   ifeq L188
L159:   aload_2
L160:   iload 4
L162:   iinc 4 1
L165:   baload
L166:   ifeq L182
L169:   aload_1
L170:   iload 5
L172:   iinc 5 1
L175:   iload_3
L176:   iastore
L177:   iload 14
L179:   ifeq L185
L182:   iinc 5 1
L185:   iinc 13 1
L188:   iload 13
L190:   iflt L159
L193:   iload 5
L195:   iload 8
L197:   iadd
L198:   istore 5
L200:   iload 4
L202:   iload 9
L204:   iadd
L205:   istore 4
L207:   iinc 11 1
L210:   iload 11
L212:   iflt L29
L215:   return
L216:   
    .end code
.end method

.method private a : ([BBIIIIII)V
    .code stack 12 locals 14
        .catch java/lang/RuntimeException from L0 to L241 using L242
L0:     iload_2
L1:     aload_0
L2:     getfield Field jb x B
L5:     if_icmpeq L9
L8:     return
L9:     iload_3
L10:    iload 6
L12:    getstatic Field fb l I
L15:    imul
L16:    iadd
L17:    istore 9
L19:    getstatic Field fb l I
L22:    iload 8
L24:    isub
L25:    istore 10
L27:    iconst_0
L28:    istore 11
L30:    iconst_0
L31:    istore 12
L33:    iload 6
L35:    getstatic Field fb n I
L38:    if_icmpge L82
L41:    getstatic Field fb n I
L44:    iload 6
L46:    isub
L47:    istore 13
L49:    iload 4
L51:    iload 13
L53:    isub
L54:    istore 4
L56:    getstatic Field fb n I
L59:    istore 6
L61:    iload 12
L63:    iload 13
L65:    iload 8
L67:    imul
L68:    iadd
L69:    istore 12
L71:    iload 9
L73:    iload 13
L75:    getstatic Field fb l I
L78:    imul
L79:    iadd
L80:    istore 9
L82:    iload 6
L84:    iload 4
L86:    iadd
L87:    getstatic Field fb o I
L90:    if_icmplt L109
L93:    iload 4
L95:    iload 6
L97:    iload 4
L99:    iadd
L100:   getstatic Field fb o I
L103:   isub
L104:   iconst_1
L105:   iadd
L106:   isub
L107:   istore 4
L109:   iload_3
L110:   getstatic Field fb p I
L113:   if_icmpge L162
L116:   getstatic Field fb p I
L119:   iload_3
L120:   isub
L121:   istore 13
L123:   iload 8
L125:   iload 13
L127:   isub
L128:   istore 8
L130:   getstatic Field fb p I
L133:   istore_3
L134:   iload 12
L136:   iload 13
L138:   iadd
L139:   istore 12
L141:   iload 9
L143:   iload 13
L145:   iadd
L146:   istore 9
L148:   iload 11
L150:   iload 13
L152:   iadd
L153:   istore 11
L155:   iload 10
L157:   iload 13
L159:   iadd
L160:   istore 10
L162:   iload_3
L163:   iload 8
L165:   iadd
L166:   getstatic Field fb q I
L169:   if_icmplt L205
L172:   iload_3
L173:   iload 8
L175:   iadd
L176:   getstatic Field fb q I
L179:   isub
L180:   iconst_1
L181:   iadd
L182:   istore 13
L184:   iload 8
L186:   iload 13
L188:   isub
L189:   istore 8
L191:   iload 11
L193:   iload 13
L195:   iadd
L196:   istore 11
L198:   iload 10
L200:   iload 13
L202:   iadd
L203:   istore 10
L205:   iload 8
L207:   ifle L215
L210:   iload 4
L212:   ifgt L216
L215:   return
L216:   aload_0
L217:   iload 4
L219:   iload 9
L221:   iload 8
L223:   getstatic Field fb k [I
L226:   aload_1
L227:   iload 7
L229:   iload 12
L231:   iload 10
L233:   iload 11
L235:   iconst_2
L236:   iload 5
L238:   invokespecial Method jb a (III[I[BIIIIBI)V
L241:   return
L242:   astore 9
L244:   new java/lang/StringBuffer
L247:   dup
L248:   ldc "13931, "
L250:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L253:   aload_1
L254:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L257:   ldc ", "
L259:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L262:   iload_2
L263:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L266:   ldc ", "
L268:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L271:   iload_3
L272:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L275:   ldc ", "
L277:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L280:   iload 4
L282:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L285:   ldc ", "
L287:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L290:   iload 5
L292:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L295:   ldc ", "
L297:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L300:   iload 6
L302:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L305:   ldc ", "
L307:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L310:   iload 7
L312:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L315:   ldc ", "
L317:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L320:   iload 8
L322:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L325:   ldc ", "
L327:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L330:   aload 9
L332:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L335:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L338:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L341:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L344:   new java/lang/RuntimeException
L347:   dup
L348:   invokespecial Method java/lang/RuntimeException <init> ()V
L351:   athrow
L352:   
    .end code
.end method

.method private a : (III[I[BIIIIBI)V
    .code stack 6 locals 16
L0:     getstatic Field fb u I
L3:     istore 15
        .catch java/lang/RuntimeException from L5 to L181 using L182
L5:     iload 11
L7:     ldc 16711935
L9:     iand
L10:    iload 6
L12:    imul
L13:    ldc -16711936
L15:    iand
L16:    iload 11
L18:    ldc 65280
L20:    iand
L21:    iload 6
L23:    imul
L24:    ldc 16711680
L26:    iand
L27:    iadd
L28:    bipush 8
L30:    ishr
L31:    istore 11
L33:    iload 10
L35:    aload_0
L36:    getfield Field jb y B
L39:    if_icmpne L50
L42:    iconst_0
L43:    istore 10
L45:    iload 15
L47:    ifeq L66
L50:    iconst_1
L51:    istore 12
L53:    iload 15
L55:    ifeq L61
L58:    iinc 12 1
L61:    iload 12
L63:    ifgt L58
L66:    sipush 256
L69:    iload 6
L71:    isub
L72:    istore 6
L74:    iload_1
L75:    ineg
L76:    istore 12
L78:    iload 15
L80:    ifeq L176
L83:    iload_3
L84:    ineg
L85:    istore 13
L87:    iload 15
L89:    ifeq L156
L92:    aload 5
L94:    iload 7
L96:    iinc 7 1
L99:    baload
L100:   ifeq L150
L103:   aload 4
L105:   iload_2
L106:   iaload
L107:   istore 14
L109:   aload 4
L111:   iload_2
L112:   iinc 2 1
L115:   iload 14
L117:   ldc 16711935
L119:   iand
L120:   iload 6
L122:   imul
L123:   ldc -16711936
L125:   iand
L126:   iload 14
L128:   ldc 65280
L130:   iand
L131:   iload 6
L133:   imul
L134:   ldc 16711680
L136:   iand
L137:   iadd
L138:   bipush 8
L140:   ishr
L141:   iload 11
L143:   iadd
L144:   iastore
L145:   iload 15
L147:   ifeq L153
L150:   iinc 2 1
L153:   iinc 13 1
L156:   iload 13
L158:   iflt L92
L161:   iload_2
L162:   iload 8
L164:   iadd
L165:   istore_2
L166:   iload 7
L168:   iload 9
L170:   iadd
L171:   istore 7
L173:   iinc 12 1
L176:   iload 12
L178:   iflt L83
L181:   return
L182:   astore 12
L184:   new java/lang/StringBuffer
L187:   dup
L188:   ldc "64154, "
L190:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L193:   iload_1
L194:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L197:   ldc ", "
L199:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L202:   iload_2
L203:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L206:   ldc ", "
L208:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L211:   iload_3
L212:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L215:   ldc ", "
L217:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L220:   aload 4
L222:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L225:   ldc ", "
L227:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L230:   aload 5
L232:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L235:   ldc ", "
L237:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L240:   iload 6
L242:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L245:   ldc ", "
L247:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L250:   iload 7
L252:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L255:   ldc ", "
L257:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L260:   iload 8
L262:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L265:   ldc ", "
L267:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L270:   iload 9
L272:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L275:   ldc ", "
L277:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L280:   iload 10
L282:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L285:   ldc ", "
L287:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L290:   iload 11
L292:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L295:   ldc ", "
L297:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L300:   aload 12
L302:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L305:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L308:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L311:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L314:   new java/lang/RuntimeException
L317:   dup
L318:   invokespecial Method java/lang/RuntimeException <init> ()V
L321:   athrow
L322:   
    .end code
.end method

.method static <clinit> : ()V
    .code stack 3 locals 3
L0:     sipush 256
L3:     newarray int
L5:     putstatic Field jb K [I
L8:     ldc "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00A3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
L10:    astore_0
L11:    iconst_0
L12:    istore_1
L13:    goto L39
L16:    aload_0
L17:    iload_1
L18:    invokevirtual Method java/lang/String indexOf (I)I
L21:    istore_2
L22:    iload_2
L23:    iconst_m1
L24:    if_icmpne L30
L27:    bipush 74
L29:    istore_2
L30:    getstatic Field jb K [I
L33:    iload_1
L34:    iload_2
L35:    iastore
L36:    iinc 1 1
L39:    iload_1
L40:    sipush 256
L43:    if_icmplt L16
L46:    return
L47:    
    .end code
.end method
.end class
