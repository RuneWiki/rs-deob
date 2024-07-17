.version 45 3
.class public final super wb
.super java/lang/Object
.field public static a [C
.field private static b [C

.method public static a : (Lkb;II)Ljava/lang/String;
    .code stack 6 locals 10
L0:     getstatic Field kb C Z
L3:     istore 9
        .catch java/lang/RuntimeException from L5 to L280 using L280
L5:     iconst_0
L6:     istore_3
L7:     iconst_m1
L8:     istore 4
L10:    bipush 43
L12:    iload_1
L13:    idiv
L14:    istore_1
L15:    iconst_0
L16:    istore 5
L18:    iload 9
L20:    ifeq L182
L23:    aload_0
L24:    invokevirtual Method kb c ()I
L27:    istore 6
L29:    iload 6
L31:    iconst_4
L32:    ishr
L33:    bipush 15
L35:    iand
L36:    istore 7
L38:    iload 4
L40:    iconst_m1
L41:    if_icmpne L79
L44:    iload 7
L46:    bipush 13
L48:    if_icmpge L70
L51:    getstatic Field wb a [C
L54:    iload_3
L55:    iinc 3 1
L58:    getstatic Field wb b [C
L61:    iload 7
L63:    caload
L64:    castore
L65:    iload 9
L67:    ifeq L105
L70:    iload 7
L72:    istore 4
L74:    iload 9
L76:    ifeq L105
L79:    getstatic Field wb a [C
L82:    iload_3
L83:    iinc 3 1
L86:    getstatic Field wb b [C
L89:    iload 4
L91:    iconst_4
L92:    ishl
L93:    iload 7
L95:    iadd
L96:    sipush 195
L99:    isub
L100:   caload
L101:   castore
L102:   iconst_m1
L103:   istore 4
L105:   iload 6
L107:   bipush 15
L109:   iand
L110:   istore 7
L112:   iload 4
L114:   iconst_m1
L115:   if_icmpne L153
L118:   iload 7
L120:   bipush 13
L122:   if_icmpge L144
L125:   getstatic Field wb a [C
L128:   iload_3
L129:   iinc 3 1
L132:   getstatic Field wb b [C
L135:   iload 7
L137:   caload
L138:   castore
L139:   iload 9
L141:   ifeq L179
L144:   iload 7
L146:   istore 4
L148:   iload 9
L150:   ifeq L179
L153:   getstatic Field wb a [C
L156:   iload_3
L157:   iinc 3 1
L160:   getstatic Field wb b [C
L163:   iload 4
L165:   iconst_4
L166:   ishl
L167:   iload 7
L169:   iadd
L170:   sipush 195
L173:   isub
L174:   caload
L175:   castore
L176:   iconst_m1
L177:   istore 4
L179:   iinc 5 1
L182:   iload 5
L184:   iload_2
L185:   if_icmplt L23
L188:   iconst_1
L189:   istore 6
L191:   iconst_0
L192:   istore 7
L194:   iload 9
L196:   ifeq L261
L199:   getstatic Field wb a [C
L202:   iload 7
L204:   caload
L205:   istore 8
L207:   iload 6
L209:   ifeq L241
L212:   iload 8
L214:   bipush 97
L216:   if_icmplt L241
L219:   iload 8
L221:   bipush 122
L223:   if_icmpgt L241
L226:   getstatic Field wb a [C
L229:   iload 7
L231:   dup2
L232:   caload
L233:   bipush -32
L235:   iadd
L236:   i2c
L237:   castore
L238:   iconst_0
L239:   istore 6
L241:   iload 8
L243:   bipush 46
L245:   if_icmpeq L255
L248:   iload 8
L250:   bipush 33
L252:   if_icmpne L258
L255:   iconst_1
L256:   istore 6
L258:   iinc 7 1
L261:   iload 7
L263:   iload_3
L264:   if_icmplt L199
L267:   new java/lang/String
L270:   dup
L271:   getstatic Field wb a [C
L274:   iconst_0
L275:   iload_3
L276:   invokespecial Method java/lang/String <init> ([CII)V
L279:   areturn
L280:   astore_3
L281:   new java/lang/StringBuffer
L284:   dup
L285:   ldc "31206, "
L287:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L290:   aload_0
L291:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L294:   ldc ", "
L296:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L299:   iload_1
L300:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L303:   ldc ", "
L305:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L308:   iload_2
L309:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L312:   ldc ", "
L314:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L317:   aload_3
L318:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L321:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L324:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L327:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L330:   new java/lang/RuntimeException
L333:   dup
L334:   invokespecial Method java/lang/RuntimeException <init> ()V
L337:   athrow
L338:   
    .end code
.end method

.method public static a : (Lkb;ZLjava/lang/String;)V
    .code stack 5 locals 9
L0:     getstatic Field kb C Z
L3:     istore 8
        .catch java/lang/RuntimeException from L5 to L203 using L204
L5:     aload_2
L6:     invokevirtual Method java/lang/String length ()I
L9:     bipush 80
L11:    if_icmple L22
L14:    aload_2
L15:    iconst_0
L16:    bipush 80
L18:    invokevirtual Method java/lang/String substring (II)Ljava/lang/String;
L21:    astore_2
L22:    aload_2
L23:    invokevirtual Method java/lang/String toLowerCase ()Ljava/lang/String;
L26:    astore_2
L27:    iconst_m1
L28:    istore_3
L29:    iconst_0
L30:    istore 4
L32:    iload 8
L34:    ifeq L177
L37:    aload_2
L38:    iload 4
L40:    invokevirtual Method java/lang/String charAt (I)C
L43:    istore 5
L45:    iconst_0
L46:    istore 6
L48:    iconst_0
L49:    istore 7
L51:    iload 8
L53:    ifeq L79
L56:    iload 5
L58:    getstatic Field wb b [C
L61:    iload 7
L63:    caload
L64:    if_icmpne L76
L67:    iload 7
L69:    istore 6
L71:    iload 8
L73:    ifeq L88
L76:    iinc 7 1
L79:    iload 7
L81:    getstatic Field wb b [C
L84:    arraylength
L85:    if_icmplt L56
L88:    iload 6
L90:    bipush 12
L92:    if_icmple L101
L95:    wide iinc 6 195
L101:   iload_3
L102:   iconst_m1
L103:   if_icmpne L132
L106:   iload 6
L108:   bipush 13
L110:   if_icmpge L121
L113:   iload 6
L115:   istore_3
L116:   iload 8
L118:   ifeq L174
L121:   aload_0
L122:   iload 6
L124:   invokevirtual Method kb a (I)V
L127:   iload 8
L129:   ifeq L174
L132:   iload 6
L134:   bipush 13
L136:   if_icmpge L156
L139:   aload_0
L140:   iload_3
L141:   iconst_4
L142:   ishl
L143:   iload 6
L145:   iadd
L146:   invokevirtual Method kb a (I)V
L149:   iconst_m1
L150:   istore_3
L151:   iload 8
L153:   ifeq L174
L156:   aload_0
L157:   iload_3
L158:   iconst_4
L159:   ishl
L160:   iload 6
L162:   iconst_4
L163:   ishr
L164:   iadd
L165:   invokevirtual Method kb a (I)V
L168:   iload 6
L170:   bipush 15
L172:   iand
L173:   istore_3
L174:   iinc 4 1
L177:   iload 4
L179:   aload_2
L180:   invokevirtual Method java/lang/String length ()I
L183:   if_icmplt L37
L186:   iload_1
L187:   ifne L191
L190:   return
L191:   iload_3
L192:   iconst_m1
L193:   if_icmpeq L262
L196:   aload_0
L197:   iload_3
L198:   iconst_4
L199:   ishl
L200:   invokevirtual Method kb a (I)V
L203:   return
L204:   astore_3
L205:   new java/lang/StringBuffer
L208:   dup
L209:   ldc "98255, "
L211:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L214:   aload_0
L215:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L218:   ldc ", "
L220:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L223:   iload_1
L224:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L227:   ldc ", "
L229:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L232:   aload_2
L233:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L236:   ldc ", "
L238:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L241:   aload_3
L242:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L245:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L248:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L251:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L254:   new java/lang/RuntimeException
L257:   dup
L258:   invokespecial Method java/lang/RuntimeException <init> ()V
L261:   athrow
L262:   return
L263:   
    .end code
.end method

.method static <clinit> : ()V
    .code stack 4 locals 0
L0:     bipush 100
L2:     newarray char
L4:     putstatic Field wb a [C
L7:     bipush 61
L9:     newarray char
L11:    dup
L12:    iconst_0
L13:    bipush 32
L15:    castore
L16:    dup
L17:    iconst_1
L18:    bipush 101
L20:    castore
L21:    dup
L22:    iconst_2
L23:    bipush 116
L25:    castore
L26:    dup
L27:    iconst_3
L28:    bipush 97
L30:    castore
L31:    dup
L32:    iconst_4
L33:    bipush 111
L35:    castore
L36:    dup
L37:    iconst_5
L38:    bipush 105
L40:    castore
L41:    dup
L42:    bipush 6
L44:    bipush 104
L46:    castore
L47:    dup
L48:    bipush 7
L50:    bipush 110
L52:    castore
L53:    dup
L54:    bipush 8
L56:    bipush 115
L58:    castore
L59:    dup
L60:    bipush 9
L62:    bipush 114
L64:    castore
L65:    dup
L66:    bipush 10
L68:    bipush 100
L70:    castore
L71:    dup
L72:    bipush 11
L74:    bipush 108
L76:    castore
L77:    dup
L78:    bipush 12
L80:    bipush 117
L82:    castore
L83:    dup
L84:    bipush 13
L86:    bipush 109
L88:    castore
L89:    dup
L90:    bipush 14
L92:    bipush 119
L94:    castore
L95:    dup
L96:    bipush 15
L98:    bipush 99
L100:   castore
L101:   dup
L102:   bipush 16
L104:   bipush 121
L106:   castore
L107:   dup
L108:   bipush 17
L110:   bipush 102
L112:   castore
L113:   dup
L114:   bipush 18
L116:   bipush 103
L118:   castore
L119:   dup
L120:   bipush 19
L122:   bipush 112
L124:   castore
L125:   dup
L126:   bipush 20
L128:   bipush 98
L130:   castore
L131:   dup
L132:   bipush 21
L134:   bipush 118
L136:   castore
L137:   dup
L138:   bipush 22
L140:   bipush 107
L142:   castore
L143:   dup
L144:   bipush 23
L146:   bipush 120
L148:   castore
L149:   dup
L150:   bipush 24
L152:   bipush 106
L154:   castore
L155:   dup
L156:   bipush 25
L158:   bipush 113
L160:   castore
L161:   dup
L162:   bipush 26
L164:   bipush 122
L166:   castore
L167:   dup
L168:   bipush 27
L170:   bipush 48
L172:   castore
L173:   dup
L174:   bipush 28
L176:   bipush 49
L178:   castore
L179:   dup
L180:   bipush 29
L182:   bipush 50
L184:   castore
L185:   dup
L186:   bipush 30
L188:   bipush 51
L190:   castore
L191:   dup
L192:   bipush 31
L194:   bipush 52
L196:   castore
L197:   dup
L198:   bipush 32
L200:   bipush 53
L202:   castore
L203:   dup
L204:   bipush 33
L206:   bipush 54
L208:   castore
L209:   dup
L210:   bipush 34
L212:   bipush 55
L214:   castore
L215:   dup
L216:   bipush 35
L218:   bipush 56
L220:   castore
L221:   dup
L222:   bipush 36
L224:   bipush 57
L226:   castore
L227:   dup
L228:   bipush 37
L230:   bipush 32
L232:   castore
L233:   dup
L234:   bipush 38
L236:   bipush 33
L238:   castore
L239:   dup
L240:   bipush 39
L242:   bipush 63
L244:   castore
L245:   dup
L246:   bipush 40
L248:   bipush 46
L250:   castore
L251:   dup
L252:   bipush 41
L254:   bipush 44
L256:   castore
L257:   dup
L258:   bipush 42
L260:   bipush 58
L262:   castore
L263:   dup
L264:   bipush 43
L266:   bipush 59
L268:   castore
L269:   dup
L270:   bipush 44
L272:   bipush 40
L274:   castore
L275:   dup
L276:   bipush 45
L278:   bipush 41
L280:   castore
L281:   dup
L282:   bipush 46
L284:   bipush 45
L286:   castore
L287:   dup
L288:   bipush 47
L290:   bipush 38
L292:   castore
L293:   dup
L294:   bipush 48
L296:   bipush 42
L298:   castore
L299:   dup
L300:   bipush 49
L302:   bipush 92
L304:   castore
L305:   dup
L306:   bipush 50
L308:   bipush 39
L310:   castore
L311:   dup
L312:   bipush 51
L314:   bipush 64
L316:   castore
L317:   dup
L318:   bipush 52
L320:   bipush 35
L322:   castore
L323:   dup
L324:   bipush 53
L326:   bipush 43
L328:   castore
L329:   dup
L330:   bipush 54
L332:   bipush 61
L334:   castore
L335:   dup
L336:   bipush 55
L338:   sipush 163
L341:   castore
L342:   dup
L343:   bipush 56
L345:   bipush 36
L347:   castore
L348:   dup
L349:   bipush 57
L351:   bipush 37
L353:   castore
L354:   dup
L355:   bipush 58
L357:   bipush 34
L359:   castore
L360:   dup
L361:   bipush 59
L363:   bipush 91
L365:   castore
L366:   dup
L367:   bipush 60
L369:   bipush 93
L371:   castore
L372:   putstatic Field wb b [C
L375:   return
L376:   
    .end code
.end method
.end class
