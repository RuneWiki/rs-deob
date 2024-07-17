.version 45 3
.class public super jc
.super java/lang/Object
.field private static a Z
.field private static b I
.field public static c I
.field public static d [Ljc;
.field public e I
.field public f [I
.field public g [I
.field public h [I
.field public i I
.field public j [I
.field public k Z
.field public l I
.field public m I
.field public n I
.field public o I
.field public static p Z

.method public static a : (Lub;I)V
    .code stack 8 locals 4
        .catch java/lang/RuntimeException from L0 to L107 using L108
L0:     new kb
L3:     dup
L4:     sipush 363
L7:     aload_0
L8:     ldc "seq.dat"
L10:    aconst_null
L11:    iconst_2
L12:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L15:    invokespecial Method kb <init> (I[B)V
L18:    astore_2
L19:    iload_1
L20:    ifgt L37
L23:    getstatic Field jc a Z
L26:    ifeq L33
L29:    iconst_0
L30:    goto L34
L33:    iconst_1
L34:    putstatic Field jc a Z
L37:    aload_2
L38:    invokevirtual Method kb e ()I
L41:    putstatic Field jc c I
L44:    getstatic Field jc d [Ljc;
L47:    ifnonnull L59
L50:    getstatic Field jc c I
L53:    anewarray jc
L56:    putstatic Field jc d [Ljc;
L59:    iconst_0
L60:    istore_3
L61:    getstatic Field jc p Z
L64:    ifeq L100
L67:    getstatic Field jc d [Ljc;
L70:    iload_3
L71:    aaload
L72:    ifnonnull L87
L75:    getstatic Field jc d [Ljc;
L78:    iload_3
L79:    new jc
L82:    dup
L83:    invokespecial Method jc <init> ()V
L86:    aastore
L87:    getstatic Field jc d [Ljc;
L90:    iload_3
L91:    aaload
L92:    iconst_0
L93:    aload_2
L94:    invokevirtual Method jc a (ZLkb;)V
L97:    iinc 3 1
L100:   iload_3
L101:   getstatic Field jc c I
L104:   if_icmplt L67
L107:   return
L108:   astore_2
L109:   new java/lang/StringBuffer
L112:   dup
L113:   ldc "35892, "
L115:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L118:   aload_0
L119:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L122:   ldc ", "
L124:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L127:   iload_1
L128:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L131:   ldc ", "
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L136:   aload_2
L137:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L140:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L143:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L146:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L149:   new java/lang/RuntimeException
L152:   dup
L153:   invokespecial Method java/lang/RuntimeException <init> ()V
L156:   athrow
L157:   
    .end code
.end method

.method public a : (ZLkb;)V
    .code stack 6 locals 7
L0:     getstatic Field jc p Z
L3:     istore 6
        .catch java/lang/RuntimeException from L5 to L458 using L459
L5:     iload_1
L6:     ifeq L23
L9:     iconst_1
L10:    istore_3
L11:    iload 6
L13:    ifeq L19
L16:    iinc 3 1
L19:    iload_3
L20:    ifgt L16
L23:    aload_2
L24:    invokevirtual Method kb c ()I
L27:    istore_3
L28:    iload_3
L29:    ifne L35
L32:    goto L404
L35:    iload_3
L36:    iconst_1
L37:    if_icmpne L205
L40:    aload_0
L41:    aload_2
L42:    invokevirtual Method kb c ()I
L45:    putfield Field jc e I
L48:    aload_0
L49:    aload_0
L50:    getfield Field jc e I
L53:    newarray int
L55:    putfield Field jc f [I
L58:    aload_0
L59:    aload_0
L60:    getfield Field jc e I
L63:    newarray int
L65:    putfield Field jc g [I
L68:    aload_0
L69:    aload_0
L70:    getfield Field jc e I
L73:    newarray int
L75:    putfield Field jc h [I
L78:    iconst_0
L79:    istore 4
L81:    iload 6
L83:    ifeq L191
L86:    aload_0
L87:    getfield Field jc f [I
L90:    iload 4
L92:    aload_2
L93:    invokevirtual Method kb e ()I
L96:    iastore
L97:    aload_0
L98:    getfield Field jc g [I
L101:   iload 4
L103:   aload_2
L104:   invokevirtual Method kb e ()I
L107:   iastore
L108:   aload_0
L109:   getfield Field jc g [I
L112:   iload 4
L114:   iaload
L115:   ldc 65535
L117:   if_icmpne L128
L120:   aload_0
L121:   getfield Field jc g [I
L124:   iload 4
L126:   iconst_m1
L127:   iastore
L128:   aload_0
L129:   getfield Field jc h [I
L132:   iload 4
L134:   aload_2
L135:   invokevirtual Method kb e ()I
L138:   iastore
L139:   aload_0
L140:   getfield Field jc h [I
L143:   iload 4
L145:   iaload
L146:   ifne L170
L149:   aload_0
L150:   getfield Field jc h [I
L153:   iload 4
L155:   getstatic Field g a [Lg;
L158:   aload_0
L159:   getfield Field jc f [I
L162:   iload 4
L164:   iaload
L165:   aaload
L166:   getfield Field g b I
L169:   iastore
L170:   aload_0
L171:   getfield Field jc h [I
L174:   iload 4
L176:   iaload
L177:   ifne L188
L180:   aload_0
L181:   getfield Field jc h [I
L184:   iload 4
L186:   iconst_1
L187:   iastore
L188:   iinc 4 1
L191:   iload 4
L193:   aload_0
L194:   getfield Field jc e I
L197:   if_icmplt L86
L200:   iload 6
L202:   ifeq L23
L205:   iload_3
L206:   iconst_2
L207:   if_icmpne L223
L210:   aload_0
L211:   aload_2
L212:   invokevirtual Method kb e ()I
L215:   putfield Field jc i I
L218:   iload 6
L220:   ifeq L23
L223:   iload_3
L224:   iconst_3
L225:   if_icmpne L287
L228:   aload_2
L229:   invokevirtual Method kb c ()I
L232:   istore 4
L234:   aload_0
L235:   iload 4
L237:   iconst_1
L238:   iadd
L239:   newarray int
L241:   putfield Field jc j [I
L244:   iconst_0
L245:   istore 5
L247:   iload 6
L249:   ifeq L266
L252:   aload_0
L253:   getfield Field jc j [I
L256:   iload 5
L258:   aload_2
L259:   invokevirtual Method kb c ()I
L262:   iastore
L263:   iinc 5 1
L266:   iload 5
L268:   iload 4
L270:   if_icmplt L252
L273:   aload_0
L274:   getfield Field jc j [I
L277:   iload 4
L279:   ldc 9999999
L281:   iastore
L282:   iload 6
L284:   ifeq L23
L287:   iload_3
L288:   iconst_4
L289:   if_icmpne L302
L292:   aload_0
L293:   iconst_1
L294:   putfield Field jc k Z
L297:   iload 6
L299:   ifeq L23
L302:   iload_3
L303:   iconst_5
L304:   if_icmpne L320
L307:   aload_0
L308:   aload_2
L309:   invokevirtual Method kb c ()I
L312:   putfield Field jc l I
L315:   iload 6
L317:   ifeq L23
L320:   iload_3
L321:   bipush 6
L323:   if_icmpne L339
L326:   aload_0
L327:   aload_2
L328:   invokevirtual Method kb e ()I
L331:   putfield Field jc m I
L334:   iload 6
L336:   ifeq L23
L339:   iload_3
L340:   bipush 7
L342:   if_icmpne L358
L345:   aload_0
L346:   aload_2
L347:   invokevirtual Method kb e ()I
L350:   putfield Field jc n I
L353:   iload 6
L355:   ifeq L23
L358:   iload_3
L359:   bipush 8
L361:   if_icmpne L377
L364:   aload_0
L365:   aload_2
L366:   invokevirtual Method kb c ()I
L369:   putfield Field jc o I
L372:   iload 6
L374:   ifeq L23
L377:   getstatic Field java/lang/System out Ljava/io/PrintStream;
L380:   new java/lang/StringBuffer
L383:   dup
L384:   ldc "Error unrecognised seq config code: "
L386:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L389:   iload_3
L390:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L393:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L396:   invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L399:   iload 6
L401:   ifeq L23
L404:   aload_0
L405:   getfield Field jc e I
L408:   ifne L508
L411:   aload_0
L412:   iconst_1
L413:   putfield Field jc e I
L416:   aload_0
L417:   iconst_1
L418:   newarray int
L420:   putfield Field jc f [I
L423:   aload_0
L424:   getfield Field jc f [I
L427:   iconst_0
L428:   iconst_m1
L429:   iastore
L430:   aload_0
L431:   iconst_1
L432:   newarray int
L434:   putfield Field jc g [I
L437:   aload_0
L438:   getfield Field jc g [I
L441:   iconst_0
L442:   iconst_m1
L443:   iastore
L444:   aload_0
L445:   iconst_1
L446:   newarray int
L448:   putfield Field jc h [I
L451:   aload_0
L452:   getfield Field jc h [I
L455:   iconst_0
L456:   iconst_m1
L457:   iastore
L458:   return
L459:   astore_3
L460:   new java/lang/StringBuffer
L463:   dup
L464:   ldc "38080, "
L466:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L469:   iload_1
L470:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L473:   ldc ", "
L475:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L478:   aload_2
L479:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L482:   ldc ", "
L484:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L487:   aload_3
L488:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L491:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L494:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L497:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L500:   new java/lang/RuntimeException
L503:   dup
L504:   invokespecial Method java/lang/RuntimeException <init> ()V
L507:   athrow
L508:   return
L509:   
    .end code
.end method

.method public <init> : ()V
    .code stack 2 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     iconst_m1
L6:     putfield Field jc i I
L9:     aload_0
L10:    iconst_0
L11:    putfield Field jc k Z
L14:    aload_0
L15:    iconst_5
L16:    putfield Field jc l I
L19:    aload_0
L20:    iconst_m1
L21:    putfield Field jc m I
L24:    aload_0
L25:    iconst_m1
L26:    putfield Field jc n I
L29:    aload_0
L30:    bipush 99
L32:    putfield Field jc o I
L35:    return
L36:    
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_1
L1:     putstatic Field jc a Z
L4:     sipush 473
L7:     putstatic Field jc b I
L10:    return
L11:    
    .end code
.end method
.end class
