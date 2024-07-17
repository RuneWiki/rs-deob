.version 45 3
.class public final super IGSLDTHC
.super java/lang/Object
.field private a I
.field private b Z
.field static c [B
.field d Ljava/io/RandomAccessFile;
.field e Ljava/io/RandomAccessFile;
.field f I
.field g I

.method public <init> : (ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;IZ)V
    .code stack 3 locals 7
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     sipush 923
L8:     putfield Field IGSLDTHC a I
L11:    aload_0
L12:    iconst_1
L13:    putfield Field IGSLDTHC b Z
L16:    aload_0
L17:    ldc 65000
L19:    putfield Field IGSLDTHC g I
        .catch java/lang/RuntimeException from L22 to L56 using L57
L22:    aload_0
L23:    iload 4
L25:    putfield Field IGSLDTHC f I
L28:    iload 5
L30:    ifne L41
L33:    new java/lang/NullPointerException
L36:    dup
L37:    invokespecial Method java/lang/NullPointerException <init> ()V
L40:    athrow
L41:    aload_0
L42:    aload_2
L43:    putfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L46:    aload_0
L47:    aload_3
L48:    putfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L51:    aload_0
L52:    iload_1
L53:    putfield Field IGSLDTHC g I
L56:    return
L57:    astore 6
L59:    new java/lang/StringBuffer
L62:    dup
L63:    ldc "33536, "
L65:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L68:    iload_1
L69:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L72:    ldc ", "
L74:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L77:    aload_2
L78:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L81:    ldc ", "
L83:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L86:    aload_3
L87:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L90:    ldc ", "
L92:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L95:    iload 4
L97:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L100:   ldc ", "
L102:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L105:   iload 5
L107:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L110:   ldc ", "
L112:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L115:   aload 6
L117:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L120:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L123:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L126:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L129:   new java/lang/RuntimeException
L132:   dup
L133:   invokespecial Method java/lang/RuntimeException <init> ()V
L136:   athrow
L137:   
    .end code
.end method

.method public synchronized a : (ZI)[B
    .code stack 7 locals 16
L0:     getstatic Field MBMGIXGO L Z
L3:     istore 15
L5:     iload_1
L6:     ifne L17
L9:     new java/lang/NullPointerException
L12:    dup
L13:    invokespecial Method java/lang/NullPointerException <init> ()V
L16:    athrow
        .catch java/io/IOException from L17 to L499 using L499
        .catch java/lang/RuntimeException from L5 to L502 using L502
L17:    aload_0
L18:    aload_0
L19:    getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L22:    sipush -660
L25:    iload_2
L26:    bipush 6
L28:    imul
L29:    invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L32:    iconst_0
L33:    istore_3
L34:    iload 15
L36:    ifeq L69
L39:    aload_0
L40:    getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L43:    getstatic Field IGSLDTHC c [B
L46:    iload_3
L47:    bipush 6
L49:    iload_3
L50:    isub
L51:    invokevirtual Method java/io/RandomAccessFile read ([BII)I
L54:    istore 4
L56:    iload 4
L58:    iconst_m1
L59:    if_icmpne L64
L62:    aconst_null
L63:    areturn
L64:    iload_3
L65:    iload 4
L67:    iadd
L68:    istore_3
L69:    iload_3
L70:    bipush 6
L72:    if_icmplt L39
L75:    getstatic Field IGSLDTHC c [B
L78:    iconst_0
L79:    baload
L80:    sipush 255
L83:    iand
L84:    bipush 16
L86:    ishl
L87:    getstatic Field IGSLDTHC c [B
L90:    iconst_1
L91:    baload
L92:    sipush 255
L95:    iand
L96:    bipush 8
L98:    ishl
L99:    iadd
L100:   getstatic Field IGSLDTHC c [B
L103:   iconst_2
L104:   baload
L105:   sipush 255
L108:   iand
L109:   iadd
L110:   istore 4
L112:   getstatic Field IGSLDTHC c [B
L115:   iconst_3
L116:   baload
L117:   sipush 255
L120:   iand
L121:   bipush 16
L123:   ishl
L124:   getstatic Field IGSLDTHC c [B
L127:   iconst_4
L128:   baload
L129:   sipush 255
L132:   iand
L133:   bipush 8
L135:   ishl
L136:   iadd
L137:   getstatic Field IGSLDTHC c [B
L140:   iconst_5
L141:   baload
L142:   sipush 255
L145:   iand
L146:   iadd
L147:   istore 5
L149:   iload 4
L151:   iflt L163
L154:   iload 4
L156:   aload_0
L157:   getfield Field IGSLDTHC g I
L160:   if_icmple L165
L163:   aconst_null
L164:   areturn
L165:   iload 5
L167:   ifle L188
L170:   iload 5
L172:   i2l
L173:   aload_0
L174:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L177:   invokevirtual Method java/io/RandomAccessFile length ()J
L180:   ldc2_w 520L
L183:   ldiv
L184:   lcmp
L185:   ifle L190
L188:   aconst_null
L189:   areturn
L190:   iload 4
L192:   newarray byte
L194:   astore 6
L196:   iconst_0
L197:   istore 7
L199:   iconst_0
L200:   istore 8
L202:   iload 15
L204:   ifeq L489
L207:   iload 5
L209:   ifne L214
L212:   aconst_null
L213:   areturn
L214:   aload_0
L215:   aload_0
L216:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L219:   sipush -660
L222:   iload 5
L224:   sipush 520
L227:   imul
L228:   invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L231:   iconst_0
L232:   istore_3
L233:   iload 4
L235:   iload 7
L237:   isub
L238:   istore 9
L240:   iload 9
L242:   sipush 512
L245:   if_icmple L291
L248:   sipush 512
L251:   istore 9
L253:   iload 15
L255:   ifeq L291
L258:   aload_0
L259:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L262:   getstatic Field IGSLDTHC c [B
L265:   iload_3
L266:   iload 9
L268:   bipush 8
L270:   iadd
L271:   iload_3
L272:   isub
L273:   invokevirtual Method java/io/RandomAccessFile read ([BII)I
L276:   istore 10
L278:   iload 10
L280:   iconst_m1
L281:   if_icmpne L286
L284:   aconst_null
L285:   areturn
L286:   iload_3
L287:   iload 10
L289:   iadd
L290:   istore_3
L291:   iload_3
L292:   iload 9
L294:   bipush 8
L296:   iadd
L297:   if_icmplt L258
L300:   getstatic Field IGSLDTHC c [B
L303:   iconst_0
L304:   baload
L305:   sipush 255
L308:   iand
L309:   bipush 8
L311:   ishl
L312:   getstatic Field IGSLDTHC c [B
L315:   iconst_1
L316:   baload
L317:   sipush 255
L320:   iand
L321:   iadd
L322:   istore 10
L324:   getstatic Field IGSLDTHC c [B
L327:   iconst_2
L328:   baload
L329:   sipush 255
L332:   iand
L333:   bipush 8
L335:   ishl
L336:   getstatic Field IGSLDTHC c [B
L339:   iconst_3
L340:   baload
L341:   sipush 255
L344:   iand
L345:   iadd
L346:   istore 11
L348:   getstatic Field IGSLDTHC c [B
L351:   iconst_4
L352:   baload
L353:   sipush 255
L356:   iand
L357:   bipush 16
L359:   ishl
L360:   getstatic Field IGSLDTHC c [B
L363:   iconst_5
L364:   baload
L365:   sipush 255
L368:   iand
L369:   bipush 8
L371:   ishl
L372:   iadd
L373:   getstatic Field IGSLDTHC c [B
L376:   bipush 6
L378:   baload
L379:   sipush 255
L382:   iand
L383:   iadd
L384:   istore 12
L386:   getstatic Field IGSLDTHC c [B
L389:   bipush 7
L391:   baload
L392:   sipush 255
L395:   iand
L396:   istore 13
L398:   iload 10
L400:   iload_2
L401:   if_icmpne L420
L404:   iload 11
L406:   iload 8
L408:   if_icmpne L420
L411:   iload 13
L413:   aload_0
L414:   getfield Field IGSLDTHC f I
L417:   if_icmpeq L422
L420:   aconst_null
L421:   areturn
L422:   iload 12
L424:   iflt L445
L427:   iload 12
L429:   i2l
L430:   aload_0
L431:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L434:   invokevirtual Method java/io/RandomAccessFile length ()J
L437:   ldc2_w 520L
L440:   ldiv
L441:   lcmp
L442:   ifle L447
L445:   aconst_null
L446:   areturn
L447:   iconst_0
L448:   istore 14
L450:   iload 15
L452:   ifeq L475
L455:   aload 6
L457:   iload 7
L459:   iinc 7 1
L462:   getstatic Field IGSLDTHC c [B
L465:   iload 14
L467:   bipush 8
L469:   iadd
L470:   baload
L471:   bastore
L472:   iinc 14 1
L475:   iload 14
L477:   iload 9
L479:   if_icmplt L455
L482:   iload 12
L484:   istore 5
L486:   iinc 8 1
L489:   iload 7
L491:   iload 4
L493:   if_icmplt L207
L496:   aload 6
L498:   areturn
L499:   pop
L500:   aconst_null
L501:   areturn
L502:   astore_3
L503:   new java/lang/StringBuffer
L506:   dup
L507:   ldc "78178, "
L509:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L512:   iload_1
L513:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L516:   ldc ", "
L518:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L521:   iload_2
L522:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L525:   ldc ", "
L527:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L530:   aload_3
L531:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L534:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L537:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L540:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L543:   new java/lang/RuntimeException
L546:   dup
L547:   invokespecial Method java/lang/RuntimeException <init> ()V
L550:   athrow
L551:   
    .end code
.end method

.method public synchronized a : (I[BBI)Z
    .code stack 7 locals 6
        .catch java/lang/RuntimeException from L0 to L65 using L65
L0:     aload_0
L1:     iconst_1
L2:     sipush 923
L5:     iload 4
L7:     iload_1
L8:     aload_2
L9:     invokespecial Method IGSLDTHC a (ZIII[B)Z
L12:    istore 5
L14:    iload_3
L15:    iconst_2
L16:    if_icmpne L27
L19:    iconst_0
L20:    istore_3
L21:    getstatic Field MBMGIXGO L Z
L24:    ifeq L43
L27:    aload_0
L28:    aload_0
L29:    getfield Field IGSLDTHC b Z
L32:    ifeq L39
L35:    iconst_0
L36:    goto L40
L39:    iconst_1
L40:    putfield Field IGSLDTHC b Z
L43:    iload 5
L45:    ifne L62
L48:    aload_0
L49:    iconst_0
L50:    sipush 923
L53:    iload 4
L55:    iload_1
L56:    aload_2
L57:    invokespecial Method IGSLDTHC a (ZIII[B)Z
L60:    istore 5
L62:    iload 5
L64:    ireturn
L65:    astore 5
L67:    new java/lang/StringBuffer
L70:    dup
L71:    ldc "94130, "
L73:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L76:    iload_1
L77:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L80:    ldc ", "
L82:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L85:    aload_2
L86:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L89:    ldc ", "
L91:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L94:    iload_3
L95:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L98:    ldc ", "
L100:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L103:   iload 4
L105:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L108:   ldc ", "
L110:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L113:   aload 5
L115:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L118:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L121:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L124:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L127:   new java/lang/RuntimeException
L130:   dup
L131:   invokespecial Method java/lang/RuntimeException <init> ()V
L134:   athrow
L135:   
    .end code
.end method

.method private synchronized a : (ZIII[B)Z
    .code stack 7 locals 15
L0:     getstatic Field MBMGIXGO L Z
L3:     istore 14
L5:     bipush 27
L7:     iload_2
L8:     idiv
L9:     istore_2
        .catch java/io/IOException from L10 to L711 using L711
        .catch java/lang/RuntimeException from L5 to L714 using L714
L10:    iload_1
L11:    ifeq L140
L14:    aload_0
L15:    aload_0
L16:    getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L19:    sipush -660
L22:    iload_3
L23:    bipush 6
L25:    imul
L26:    invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L29:    iconst_0
L30:    istore 7
L32:    iload 14
L34:    ifeq L71
L37:    aload_0
L38:    getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L41:    getstatic Field IGSLDTHC c [B
L44:    iload 7
L46:    bipush 6
L48:    iload 7
L50:    isub
L51:    invokevirtual Method java/io/RandomAccessFile read ([BII)I
L54:    istore 8
L56:    iload 8
L58:    iconst_m1
L59:    if_icmpne L64
L62:    iconst_0
L63:    ireturn
L64:    iload 7
L66:    iload 8
L68:    iadd
L69:    istore 7
L71:    iload 7
L73:    bipush 6
L75:    if_icmplt L37
L78:    getstatic Field IGSLDTHC c [B
L81:    iconst_3
L82:    baload
L83:    sipush 255
L86:    iand
L87:    bipush 16
L89:    ishl
L90:    getstatic Field IGSLDTHC c [B
L93:    iconst_4
L94:    baload
L95:    sipush 255
L98:    iand
L99:    bipush 8
L101:   ishl
L102:   iadd
L103:   getstatic Field IGSLDTHC c [B
L106:   iconst_5
L107:   baload
L108:   sipush 255
L111:   iand
L112:   iadd
L113:   istore 6
L115:   iload 6
L117:   ifle L138
L120:   iload 6
L122:   i2l
L123:   aload_0
L124:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L127:   invokevirtual Method java/io/RandomAccessFile length ()J
L130:   ldc2_w 520L
L133:   ldiv
L134:   lcmp
L135:   ifle L166
L138:   iconst_0
L139:   ireturn
L140:   aload_0
L141:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L144:   invokevirtual Method java/io/RandomAccessFile length ()J
L147:   ldc2_w 519L
L150:   ladd
L151:   ldc2_w 520L
L154:   ldiv
L155:   l2i
L156:   istore 6
L158:   iload 6
L160:   ifne L166
L163:   iconst_1
L164:   istore 6
L166:   getstatic Field IGSLDTHC c [B
L169:   iconst_0
L170:   iload 4
L172:   bipush 16
L174:   ishr
L175:   i2b
L176:   bastore
L177:   getstatic Field IGSLDTHC c [B
L180:   iconst_1
L181:   iload 4
L183:   bipush 8
L185:   ishr
L186:   i2b
L187:   bastore
L188:   getstatic Field IGSLDTHC c [B
L191:   iconst_2
L192:   iload 4
L194:   i2b
L195:   bastore
L196:   getstatic Field IGSLDTHC c [B
L199:   iconst_3
L200:   iload 6
L202:   bipush 16
L204:   ishr
L205:   i2b
L206:   bastore
L207:   getstatic Field IGSLDTHC c [B
L210:   iconst_4
L211:   iload 6
L213:   bipush 8
L215:   ishr
L216:   i2b
L217:   bastore
L218:   getstatic Field IGSLDTHC c [B
L221:   iconst_5
L222:   iload 6
L224:   i2b
L225:   bastore
L226:   aload_0
L227:   aload_0
L228:   getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L231:   sipush -660
L234:   iload_3
L235:   bipush 6
L237:   imul
L238:   invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L241:   aload_0
L242:   getfield Field IGSLDTHC e Ljava/io/RandomAccessFile;
L245:   getstatic Field IGSLDTHC c [B
L248:   iconst_0
L249:   bipush 6
L251:   invokevirtual Method java/io/RandomAccessFile write ([BII)V
L254:   iconst_0
L255:   istore 7
L257:   iconst_0
L258:   istore 8
L260:   iload 14
L262:   ifeq L702
L265:   iconst_0
L266:   istore 9
L268:   iload_1
L269:   ifeq L490
L272:   aload_0
L273:   aload_0
L274:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L277:   sipush -660
L280:   iload 6
L282:   sipush 520
L285:   imul
L286:   invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L289:   iconst_0
L290:   istore 10
L292:   iload 14
L294:   ifeq L329
L297:   aload_0
L298:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L301:   getstatic Field IGSLDTHC c [B
L304:   iload 10
L306:   bipush 8
L308:   iload 10
L310:   isub
L311:   invokevirtual Method java/io/RandomAccessFile read ([BII)I
L314:   istore 11
L316:   iload 11
L318:   iconst_m1
L319:   if_icmpeq L336
L322:   iload 10
L324:   iload 11
L326:   iadd
L327:   istore 10
L329:   iload 10
L331:   bipush 8
L333:   if_icmplt L297
L336:   iload 10
L338:   bipush 8
L340:   if_icmpne L490
L343:   getstatic Field IGSLDTHC c [B
L346:   iconst_0
L347:   baload
L348:   sipush 255
L351:   iand
L352:   bipush 8
L354:   ishl
L355:   getstatic Field IGSLDTHC c [B
L358:   iconst_1
L359:   baload
L360:   sipush 255
L363:   iand
L364:   iadd
L365:   istore 11
L367:   getstatic Field IGSLDTHC c [B
L370:   iconst_2
L371:   baload
L372:   sipush 255
L375:   iand
L376:   bipush 8
L378:   ishl
L379:   getstatic Field IGSLDTHC c [B
L382:   iconst_3
L383:   baload
L384:   sipush 255
L387:   iand
L388:   iadd
L389:   istore 12
L391:   getstatic Field IGSLDTHC c [B
L394:   iconst_4
L395:   baload
L396:   sipush 255
L399:   iand
L400:   bipush 16
L402:   ishl
L403:   getstatic Field IGSLDTHC c [B
L406:   iconst_5
L407:   baload
L408:   sipush 255
L411:   iand
L412:   bipush 8
L414:   ishl
L415:   iadd
L416:   getstatic Field IGSLDTHC c [B
L419:   bipush 6
L421:   baload
L422:   sipush 255
L425:   iand
L426:   iadd
L427:   istore 9
L429:   getstatic Field IGSLDTHC c [B
L432:   bipush 7
L434:   baload
L435:   sipush 255
L438:   iand
L439:   istore 13
L441:   iload 11
L443:   iload_3
L444:   if_icmpne L463
L447:   iload 12
L449:   iload 8
L451:   if_icmpne L463
L454:   iload 13
L456:   aload_0
L457:   getfield Field IGSLDTHC f I
L460:   if_icmpeq L465
L463:   iconst_0
L464:   ireturn
L465:   iload 9
L467:   iflt L488
L470:   iload 9
L472:   i2l
L473:   aload_0
L474:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L477:   invokevirtual Method java/io/RandomAccessFile length ()J
L480:   ldc2_w 520L
L483:   ldiv
L484:   lcmp
L485:   ifle L490
L488:   iconst_0
L489:   ireturn
L490:   iload 9
L492:   ifne L533
L495:   iconst_0
L496:   istore_1
L497:   aload_0
L498:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L501:   invokevirtual Method java/io/RandomAccessFile length ()J
L504:   ldc2_w 519L
L507:   ladd
L508:   ldc2_w 520L
L511:   ldiv
L512:   l2i
L513:   istore 9
L515:   iload 9
L517:   ifne L523
L520:   iinc 9 1
L523:   iload 9
L525:   iload 6
L527:   if_icmpne L533
L530:   iinc 9 1
L533:   iload 4
L535:   iload 7
L537:   isub
L538:   sipush 512
L541:   if_icmpgt L547
L544:   iconst_0
L545:   istore 9
L547:   getstatic Field IGSLDTHC c [B
L550:   iconst_0
L551:   iload_3
L552:   bipush 8
L554:   ishr
L555:   i2b
L556:   bastore
L557:   getstatic Field IGSLDTHC c [B
L560:   iconst_1
L561:   iload_3
L562:   i2b
L563:   bastore
L564:   getstatic Field IGSLDTHC c [B
L567:   iconst_2
L568:   iload 8
L570:   bipush 8
L572:   ishr
L573:   i2b
L574:   bastore
L575:   getstatic Field IGSLDTHC c [B
L578:   iconst_3
L579:   iload 8
L581:   i2b
L582:   bastore
L583:   getstatic Field IGSLDTHC c [B
L586:   iconst_4
L587:   iload 9
L589:   bipush 16
L591:   ishr
L592:   i2b
L593:   bastore
L594:   getstatic Field IGSLDTHC c [B
L597:   iconst_5
L598:   iload 9
L600:   bipush 8
L602:   ishr
L603:   i2b
L604:   bastore
L605:   getstatic Field IGSLDTHC c [B
L608:   bipush 6
L610:   iload 9
L612:   i2b
L613:   bastore
L614:   getstatic Field IGSLDTHC c [B
L617:   bipush 7
L619:   aload_0
L620:   getfield Field IGSLDTHC f I
L623:   i2b
L624:   bastore
L625:   aload_0
L626:   aload_0
L627:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L630:   sipush -660
L633:   iload 6
L635:   sipush 520
L638:   imul
L639:   invokevirtual Method IGSLDTHC a (Ljava/io/RandomAccessFile;II)V
L642:   aload_0
L643:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L646:   getstatic Field IGSLDTHC c [B
L649:   iconst_0
L650:   bipush 8
L652:   invokevirtual Method java/io/RandomAccessFile write ([BII)V
L655:   iload 4
L657:   iload 7
L659:   isub
L660:   istore 10
L662:   iload 10
L664:   sipush 512
L667:   if_icmple L675
L670:   sipush 512
L673:   istore 10
L675:   aload_0
L676:   getfield Field IGSLDTHC d Ljava/io/RandomAccessFile;
L679:   aload 5
L681:   iload 7
L683:   iload 10
L685:   invokevirtual Method java/io/RandomAccessFile write ([BII)V
L688:   iload 7
L690:   iload 10
L692:   iadd
L693:   istore 7
L695:   iload 9
L697:   istore 6
L699:   iinc 8 1
L702:   iload 7
L704:   iload 4
L706:   if_icmplt L265
L709:   iconst_1
L710:   ireturn
L711:   pop
L712:   iconst_0
L713:   ireturn
L714:   astore 6
L716:   new java/lang/StringBuffer
L719:   dup
L720:   ldc "3304, "
L722:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L725:   iload_1
L726:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L729:   ldc ", "
L731:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L734:   iload_2
L735:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L738:   ldc ", "
L740:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L743:   iload_3
L744:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L747:   ldc ", "
L749:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L752:   iload 4
L754:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L757:   ldc ", "
L759:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L762:   aload 5
L764:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L767:   ldc ", "
L769:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L772:   aload 6
L774:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L777:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L780:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L783:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L786:   new java/lang/RuntimeException
L789:   dup
L790:   invokespecial Method java/lang/RuntimeException <init> ()V
L793:   athrow
L794:   
    .end code
.end method

.method public synchronized a : (Ljava/io/RandomAccessFile;II)V
    .code stack 5 locals 5
L0:     getstatic Field MBMGIXGO L Z
L3:     ifeq L7
L6:     return
L7:     iload_2
L8:     ifge L6
L11:    iload_3
L12:    iflt L21
L15:    iload_3
L16:    ldc 62914560
L18:    if_icmple L71
L21:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L24:    new java/lang/StringBuffer
L27:    dup
L28:    ldc "Badseek - pos:"
L30:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L33:    iload_3
L34:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L37:    ldc " len:"
L39:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L42:    aload_1
L43:    invokevirtual Method java/io/RandomAccessFile length ()J
L46:    invokevirtual Method java/lang/StringBuffer append (J)Ljava/lang/StringBuffer;
L49:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L52:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L55:    ldc 62914560
L57:    istore_3
        .catch java/lang/Exception from L58 to L64 using L67
        .catch java/lang/RuntimeException from L0 to L77 using L78
L58:    ldc2_w 1000L
L61:    invokestatic Method java/lang/Thread sleep (J)V
L64:    goto L71
L67:    pop
L68:    goto L71
L71:    aload_1
L72:    iload_3
L73:    i2l
L74:    invokevirtual Method java/io/RandomAccessFile seek (J)V
L77:    return
L78:    astore 4
L80:    new java/lang/StringBuffer
L83:    dup
L84:    ldc "97845, "
L86:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L89:    aload_1
L90:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L93:    ldc ", "
L95:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L98:    iload_2
L99:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L102:   ldc ", "
L104:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L107:   iload_3
L108:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L111:   ldc ", "
L113:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L116:   aload 4
L118:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L121:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L124:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L127:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L130:   new java/lang/RuntimeException
L133:   dup
L134:   invokespecial Method java/lang/RuntimeException <init> ()V
L137:   athrow
L138:   
    .end code
    .exceptions java/io/IOException
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     sipush 520
L3:     newarray byte
L5:     putstatic Field IGSLDTHC c [B
L8:     return
L9:     
    .end code
.end method
.end class
