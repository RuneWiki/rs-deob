.version 45 3
.class public final super packet
.super java/lang/Object
.field public data [B
.field public pos I
.field private static crctable [I
.field private static final CRC32_POLYNOMIAL I = -306674912
.field private base64enctab [C

.method private <init> : ()V
    .code stack 5 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     bipush 64
L7:     newarray char
L9:     dup
L10:    iconst_0
L11:    bipush 65
L13:    castore
L14:    dup
L15:    iconst_1
L16:    bipush 66
L18:    castore
L19:    dup
L20:    iconst_2
L21:    bipush 67
L23:    castore
L24:    dup
L25:    iconst_3
L26:    bipush 68
L28:    castore
L29:    dup
L30:    iconst_4
L31:    bipush 69
L33:    castore
L34:    dup
L35:    iconst_5
L36:    bipush 70
L38:    castore
L39:    dup
L40:    bipush 6
L42:    bipush 71
L44:    castore
L45:    dup
L46:    bipush 7
L48:    bipush 72
L50:    castore
L51:    dup
L52:    bipush 8
L54:    bipush 73
L56:    castore
L57:    dup
L58:    bipush 9
L60:    bipush 74
L62:    castore
L63:    dup
L64:    bipush 10
L66:    bipush 75
L68:    castore
L69:    dup
L70:    bipush 11
L72:    bipush 76
L74:    castore
L75:    dup
L76:    bipush 12
L78:    bipush 77
L80:    castore
L81:    dup
L82:    bipush 13
L84:    bipush 78
L86:    castore
L87:    dup
L88:    bipush 14
L90:    bipush 79
L92:    castore
L93:    dup
L94:    bipush 15
L96:    bipush 80
L98:    castore
L99:    dup
L100:   bipush 16
L102:   bipush 81
L104:   castore
L105:   dup
L106:   bipush 17
L108:   bipush 82
L110:   castore
L111:   dup
L112:   bipush 18
L114:   bipush 83
L116:   castore
L117:   dup
L118:   bipush 19
L120:   bipush 84
L122:   castore
L123:   dup
L124:   bipush 20
L126:   bipush 85
L128:   castore
L129:   dup
L130:   bipush 21
L132:   bipush 86
L134:   castore
L135:   dup
L136:   bipush 22
L138:   bipush 87
L140:   castore
L141:   dup
L142:   bipush 23
L144:   bipush 88
L146:   castore
L147:   dup
L148:   bipush 24
L150:   bipush 89
L152:   castore
L153:   dup
L154:   bipush 25
L156:   bipush 90
L158:   castore
L159:   dup
L160:   bipush 26
L162:   bipush 97
L164:   castore
L165:   dup
L166:   bipush 27
L168:   bipush 98
L170:   castore
L171:   dup
L172:   bipush 28
L174:   bipush 99
L176:   castore
L177:   dup
L178:   bipush 29
L180:   bipush 100
L182:   castore
L183:   dup
L184:   bipush 30
L186:   bipush 101
L188:   castore
L189:   dup
L190:   bipush 31
L192:   bipush 102
L194:   castore
L195:   dup
L196:   bipush 32
L198:   bipush 103
L200:   castore
L201:   dup
L202:   bipush 33
L204:   bipush 104
L206:   castore
L207:   dup
L208:   bipush 34
L210:   bipush 105
L212:   castore
L213:   dup
L214:   bipush 35
L216:   bipush 106
L218:   castore
L219:   dup
L220:   bipush 36
L222:   bipush 107
L224:   castore
L225:   dup
L226:   bipush 37
L228:   bipush 108
L230:   castore
L231:   dup
L232:   bipush 38
L234:   bipush 109
L236:   castore
L237:   dup
L238:   bipush 39
L240:   bipush 110
L242:   castore
L243:   dup
L244:   bipush 40
L246:   bipush 111
L248:   castore
L249:   dup
L250:   bipush 41
L252:   bipush 112
L254:   castore
L255:   dup
L256:   bipush 42
L258:   bipush 113
L260:   castore
L261:   dup
L262:   bipush 43
L264:   bipush 114
L266:   castore
L267:   dup
L268:   bipush 44
L270:   bipush 115
L272:   castore
L273:   dup
L274:   bipush 45
L276:   bipush 116
L278:   castore
L279:   dup
L280:   bipush 46
L282:   bipush 117
L284:   castore
L285:   dup
L286:   bipush 47
L288:   bipush 118
L290:   castore
L291:   dup
L292:   bipush 48
L294:   bipush 119
L296:   castore
L297:   dup
L298:   bipush 49
L300:   bipush 120
L302:   castore
L303:   dup
L304:   bipush 50
L306:   bipush 121
L308:   castore
L309:   dup
L310:   bipush 51
L312:   bipush 122
L314:   castore
L315:   dup
L316:   bipush 52
L318:   bipush 48
L320:   castore
L321:   dup
L322:   bipush 53
L324:   bipush 49
L326:   castore
L327:   dup
L328:   bipush 54
L330:   bipush 50
L332:   castore
L333:   dup
L334:   bipush 55
L336:   bipush 51
L338:   castore
L339:   dup
L340:   bipush 56
L342:   bipush 52
L344:   castore
L345:   dup
L346:   bipush 57
L348:   bipush 53
L350:   castore
L351:   dup
L352:   bipush 58
L354:   bipush 54
L356:   castore
L357:   dup
L358:   bipush 59
L360:   bipush 55
L362:   castore
L363:   dup
L364:   bipush 60
L366:   bipush 56
L368:   castore
L369:   dup
L370:   bipush 61
L372:   bipush 57
L374:   castore
L375:   dup
L376:   bipush 62
L378:   bipush 43
L380:   castore
L381:   dup
L382:   bipush 63
L384:   bipush 47
L386:   castore
L387:   putfield Field packet base64enctab [C
L390:   return
L391:   
        .linenumbertable
            L0 31
            L4 311
            L72 312
            L74 311
            L78 312
            L80 311
            L84 312
            L86 311
            L90 312
            L92 311
            L96 312
            L98 311
            L102 312
            L104 311
            L108 312
            L110 311
            L114 312
            L116 311
            L120 312
            L122 311
            L126 312
            L128 311
            L132 312
            L134 311
            L138 313
            L140 311
            L144 313
            L146 311
            L150 313
            L152 311
            L156 313
            L158 311
            L162 313
            L164 311
            L168 313
            L170 311
            L174 313
            L176 311
            L180 313
            L182 311
            L186 313
            L188 311
            L192 313
            L194 311
            L198 313
            L200 311
            L204 314
            L206 311
            L210 314
            L212 311
            L216 314
            L218 311
            L222 314
            L224 311
            L228 314
            L230 311
            L234 314
            L236 311
            L240 314
            L242 311
            L246 314
            L248 311
            L252 314
            L254 311
            L258 314
            L260 311
            L264 314
            L266 311
            L270 315
            L272 311
            L276 315
            L278 311
            L282 315
            L284 311
            L288 315
            L290 311
            L294 315
            L296 311
            L300 315
            L302 311
            L306 315
            L308 311
            L312 315
            L314 311
            L318 315
            L320 311
            L324 315
            L326 311
            L330 315
            L332 311
            L336 316
            L338 311
            L342 316
            L344 311
            L348 316
            L350 311
            L354 316
            L356 311
            L360 316
            L362 311
            L366 316
            L368 311
            L372 316
            L374 311
            L378 316
            L380 311
            L384 316
            L386 311
            L390 31
        .end linenumbertable
    .end code
.end method

.method public <init> : ([B)V
    .code stack 5 locals 2
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     aload_0
L5:     bipush 64
L7:     newarray char
L9:     dup
L10:    iconst_0
L11:    bipush 65
L13:    castore
L14:    dup
L15:    iconst_1
L16:    bipush 66
L18:    castore
L19:    dup
L20:    iconst_2
L21:    bipush 67
L23:    castore
L24:    dup
L25:    iconst_3
L26:    bipush 68
L28:    castore
L29:    dup
L30:    iconst_4
L31:    bipush 69
L33:    castore
L34:    dup
L35:    iconst_5
L36:    bipush 70
L38:    castore
L39:    dup
L40:    bipush 6
L42:    bipush 71
L44:    castore
L45:    dup
L46:    bipush 7
L48:    bipush 72
L50:    castore
L51:    dup
L52:    bipush 8
L54:    bipush 73
L56:    castore
L57:    dup
L58:    bipush 9
L60:    bipush 74
L62:    castore
L63:    dup
L64:    bipush 10
L66:    bipush 75
L68:    castore
L69:    dup
L70:    bipush 11
L72:    bipush 76
L74:    castore
L75:    dup
L76:    bipush 12
L78:    bipush 77
L80:    castore
L81:    dup
L82:    bipush 13
L84:    bipush 78
L86:    castore
L87:    dup
L88:    bipush 14
L90:    bipush 79
L92:    castore
L93:    dup
L94:    bipush 15
L96:    bipush 80
L98:    castore
L99:    dup
L100:   bipush 16
L102:   bipush 81
L104:   castore
L105:   dup
L106:   bipush 17
L108:   bipush 82
L110:   castore
L111:   dup
L112:   bipush 18
L114:   bipush 83
L116:   castore
L117:   dup
L118:   bipush 19
L120:   bipush 84
L122:   castore
L123:   dup
L124:   bipush 20
L126:   bipush 85
L128:   castore
L129:   dup
L130:   bipush 21
L132:   bipush 86
L134:   castore
L135:   dup
L136:   bipush 22
L138:   bipush 87
L140:   castore
L141:   dup
L142:   bipush 23
L144:   bipush 88
L146:   castore
L147:   dup
L148:   bipush 24
L150:   bipush 89
L152:   castore
L153:   dup
L154:   bipush 25
L156:   bipush 90
L158:   castore
L159:   dup
L160:   bipush 26
L162:   bipush 97
L164:   castore
L165:   dup
L166:   bipush 27
L168:   bipush 98
L170:   castore
L171:   dup
L172:   bipush 28
L174:   bipush 99
L176:   castore
L177:   dup
L178:   bipush 29
L180:   bipush 100
L182:   castore
L183:   dup
L184:   bipush 30
L186:   bipush 101
L188:   castore
L189:   dup
L190:   bipush 31
L192:   bipush 102
L194:   castore
L195:   dup
L196:   bipush 32
L198:   bipush 103
L200:   castore
L201:   dup
L202:   bipush 33
L204:   bipush 104
L206:   castore
L207:   dup
L208:   bipush 34
L210:   bipush 105
L212:   castore
L213:   dup
L214:   bipush 35
L216:   bipush 106
L218:   castore
L219:   dup
L220:   bipush 36
L222:   bipush 107
L224:   castore
L225:   dup
L226:   bipush 37
L228:   bipush 108
L230:   castore
L231:   dup
L232:   bipush 38
L234:   bipush 109
L236:   castore
L237:   dup
L238:   bipush 39
L240:   bipush 110
L242:   castore
L243:   dup
L244:   bipush 40
L246:   bipush 111
L248:   castore
L249:   dup
L250:   bipush 41
L252:   bipush 112
L254:   castore
L255:   dup
L256:   bipush 42
L258:   bipush 113
L260:   castore
L261:   dup
L262:   bipush 43
L264:   bipush 114
L266:   castore
L267:   dup
L268:   bipush 44
L270:   bipush 115
L272:   castore
L273:   dup
L274:   bipush 45
L276:   bipush 116
L278:   castore
L279:   dup
L280:   bipush 46
L282:   bipush 117
L284:   castore
L285:   dup
L286:   bipush 47
L288:   bipush 118
L290:   castore
L291:   dup
L292:   bipush 48
L294:   bipush 119
L296:   castore
L297:   dup
L298:   bipush 49
L300:   bipush 120
L302:   castore
L303:   dup
L304:   bipush 50
L306:   bipush 121
L308:   castore
L309:   dup
L310:   bipush 51
L312:   bipush 122
L314:   castore
L315:   dup
L316:   bipush 52
L318:   bipush 48
L320:   castore
L321:   dup
L322:   bipush 53
L324:   bipush 49
L326:   castore
L327:   dup
L328:   bipush 54
L330:   bipush 50
L332:   castore
L333:   dup
L334:   bipush 55
L336:   bipush 51
L338:   castore
L339:   dup
L340:   bipush 56
L342:   bipush 52
L344:   castore
L345:   dup
L346:   bipush 57
L348:   bipush 53
L350:   castore
L351:   dup
L352:   bipush 58
L354:   bipush 54
L356:   castore
L357:   dup
L358:   bipush 59
L360:   bipush 55
L362:   castore
L363:   dup
L364:   bipush 60
L366:   bipush 56
L368:   castore
L369:   dup
L370:   bipush 61
L372:   bipush 57
L374:   castore
L375:   dup
L376:   bipush 62
L378:   bipush 43
L380:   castore
L381:   dup
L382:   bipush 63
L384:   bipush 47
L386:   castore
L387:   putfield Field packet base64enctab [C
L390:   aload_0
L391:   aload_1
L392:   putfield Field packet data [B
L395:   aload_0
L396:   iconst_0
L397:   putfield Field packet pos I
L400:   return
L401:   
        .linenumbertable
            L0 33
            L4 311
            L72 312
            L74 311
            L78 312
            L80 311
            L84 312
            L86 311
            L90 312
            L92 311
            L96 312
            L98 311
            L102 312
            L104 311
            L108 312
            L110 311
            L114 312
            L116 311
            L120 312
            L122 311
            L126 312
            L128 311
            L132 312
            L134 311
            L138 313
            L140 311
            L144 313
            L146 311
            L150 313
            L152 311
            L156 313
            L158 311
            L162 313
            L164 311
            L168 313
            L170 311
            L174 313
            L176 311
            L180 313
            L182 311
            L186 313
            L188 311
            L192 313
            L194 311
            L198 313
            L200 311
            L204 314
            L206 311
            L210 314
            L212 311
            L216 314
            L218 311
            L222 314
            L224 311
            L228 314
            L230 311
            L234 314
            L236 311
            L240 314
            L242 311
            L246 314
            L248 311
            L252 314
            L254 311
            L258 314
            L260 311
            L264 314
            L266 311
            L270 315
            L272 311
            L276 315
            L278 311
            L282 315
            L284 311
            L288 315
            L290 311
            L294 315
            L296 311
            L300 315
            L302 311
            L306 315
            L308 311
            L312 315
            L314 311
            L318 315
            L320 311
            L324 315
            L326 311
            L330 315
            L332 311
            L336 316
            L338 311
            L342 316
            L344 311
            L348 316
            L350 311
            L354 316
            L356 311
            L360 316
            L362 311
            L366 316
            L368 311
            L372 316
            L374 311
            L378 316
            L380 311
            L384 316
            L386 311
            L390 34
            L400 33
        .end linenumbertable
    .end code
.end method

.method public p1 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    i2b
L17:    bastore
L18:    return
L19:    
        .linenumbertable
            L0 41
            L18 40
        .end linenumbertable
    .end code
.end method

.method public p2 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    bipush 8
L18:    ishr
L19:    i2b
L20:    bastore
L21:    aload_0
L22:    getfield Field packet data [B
L25:    aload_0
L26:    dup
L27:    getfield Field packet pos I
L30:    dup_x1
L31:    iconst_1
L32:    iadd
L33:    putfield Field packet pos I
L36:    iload_1
L37:    i2b
L38:    bastore
L39:    return
L40:    
        .linenumbertable
            L0 45
            L21 46
            L39 44
        .end linenumbertable
    .end code
.end method

.method public ip2 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    i2b
L17:    bastore
L18:    aload_0
L19:    getfield Field packet data [B
L22:    aload_0
L23:    dup
L24:    getfield Field packet pos I
L27:    dup_x1
L28:    iconst_1
L29:    iadd
L30:    putfield Field packet pos I
L33:    iload_1
L34:    bipush 8
L36:    ishr
L37:    i2b
L38:    bastore
L39:    return
L40:    
        .linenumbertable
            L0 50
            L18 51
            L39 49
        .end linenumbertable
    .end code
.end method

.method public p3 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    bipush 16
L18:    ishr
L19:    i2b
L20:    bastore
L21:    aload_0
L22:    getfield Field packet data [B
L25:    aload_0
L26:    dup
L27:    getfield Field packet pos I
L30:    dup_x1
L31:    iconst_1
L32:    iadd
L33:    putfield Field packet pos I
L36:    iload_1
L37:    bipush 8
L39:    ishr
L40:    i2b
L41:    bastore
L42:    aload_0
L43:    getfield Field packet data [B
L46:    aload_0
L47:    dup
L48:    getfield Field packet pos I
L51:    dup_x1
L52:    iconst_1
L53:    iadd
L54:    putfield Field packet pos I
L57:    iload_1
L58:    i2b
L59:    bastore
L60:    return
L61:    
        .linenumbertable
            L0 55
            L21 56
            L42 57
            L60 54
        .end linenumbertable
    .end code
.end method

.method public p4 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    bipush 24
L18:    ishr
L19:    i2b
L20:    bastore
L21:    aload_0
L22:    getfield Field packet data [B
L25:    aload_0
L26:    dup
L27:    getfield Field packet pos I
L30:    dup_x1
L31:    iconst_1
L32:    iadd
L33:    putfield Field packet pos I
L36:    iload_1
L37:    bipush 16
L39:    ishr
L40:    i2b
L41:    bastore
L42:    aload_0
L43:    getfield Field packet data [B
L46:    aload_0
L47:    dup
L48:    getfield Field packet pos I
L51:    dup_x1
L52:    iconst_1
L53:    iadd
L54:    putfield Field packet pos I
L57:    iload_1
L58:    bipush 8
L60:    ishr
L61:    i2b
L62:    bastore
L63:    aload_0
L64:    getfield Field packet data [B
L67:    aload_0
L68:    dup
L69:    getfield Field packet pos I
L72:    dup_x1
L73:    iconst_1
L74:    iadd
L75:    putfield Field packet pos I
L78:    iload_1
L79:    i2b
L80:    bastore
L81:    return
L82:    
        .linenumbertable
            L0 61
            L21 62
            L42 63
            L63 64
            L81 60
        .end linenumbertable
    .end code
.end method

.method public ip4 : (I)V
    .code stack 5 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    iload_1
L16:    i2b
L17:    bastore
L18:    aload_0
L19:    getfield Field packet data [B
L22:    aload_0
L23:    dup
L24:    getfield Field packet pos I
L27:    dup_x1
L28:    iconst_1
L29:    iadd
L30:    putfield Field packet pos I
L33:    iload_1
L34:    bipush 8
L36:    ishr
L37:    i2b
L38:    bastore
L39:    aload_0
L40:    getfield Field packet data [B
L43:    aload_0
L44:    dup
L45:    getfield Field packet pos I
L48:    dup_x1
L49:    iconst_1
L50:    iadd
L51:    putfield Field packet pos I
L54:    iload_1
L55:    bipush 16
L57:    ishr
L58:    i2b
L59:    bastore
L60:    aload_0
L61:    getfield Field packet data [B
L64:    aload_0
L65:    dup
L66:    getfield Field packet pos I
L69:    dup_x1
L70:    iconst_1
L71:    iadd
L72:    putfield Field packet pos I
L75:    iload_1
L76:    bipush 24
L78:    ishr
L79:    i2b
L80:    bastore
L81:    return
L82:    
        .linenumbertable
            L0 68
            L18 69
            L39 70
            L60 71
            L81 67
        .end linenumbertable
    .end code
.end method

.method public p8 : (J)V
    .code stack 5 locals 3
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    lload_1
L16:    bipush 56
L18:    lshr
L19:    l2i
L20:    i2b
L21:    bastore
L22:    aload_0
L23:    getfield Field packet data [B
L26:    aload_0
L27:    dup
L28:    getfield Field packet pos I
L31:    dup_x1
L32:    iconst_1
L33:    iadd
L34:    putfield Field packet pos I
L37:    lload_1
L38:    bipush 48
L40:    lshr
L41:    l2i
L42:    i2b
L43:    bastore
L44:    aload_0
L45:    getfield Field packet data [B
L48:    aload_0
L49:    dup
L50:    getfield Field packet pos I
L53:    dup_x1
L54:    iconst_1
L55:    iadd
L56:    putfield Field packet pos I
L59:    lload_1
L60:    bipush 40
L62:    lshr
L63:    l2i
L64:    i2b
L65:    bastore
L66:    aload_0
L67:    getfield Field packet data [B
L70:    aload_0
L71:    dup
L72:    getfield Field packet pos I
L75:    dup_x1
L76:    iconst_1
L77:    iadd
L78:    putfield Field packet pos I
L81:    lload_1
L82:    bipush 32
L84:    lshr
L85:    l2i
L86:    i2b
L87:    bastore
L88:    aload_0
L89:    getfield Field packet data [B
L92:    aload_0
L93:    dup
L94:    getfield Field packet pos I
L97:    dup_x1
L98:    iconst_1
L99:    iadd
L100:   putfield Field packet pos I
L103:   lload_1
L104:   bipush 24
L106:   lshr
L107:   l2i
L108:   i2b
L109:   bastore
L110:   aload_0
L111:   getfield Field packet data [B
L114:   aload_0
L115:   dup
L116:   getfield Field packet pos I
L119:   dup_x1
L120:   iconst_1
L121:   iadd
L122:   putfield Field packet pos I
L125:   lload_1
L126:   bipush 16
L128:   lshr
L129:   l2i
L130:   i2b
L131:   bastore
L132:   aload_0
L133:   getfield Field packet data [B
L136:   aload_0
L137:   dup
L138:   getfield Field packet pos I
L141:   dup_x1
L142:   iconst_1
L143:   iadd
L144:   putfield Field packet pos I
L147:   lload_1
L148:   bipush 8
L150:   lshr
L151:   l2i
L152:   i2b
L153:   bastore
L154:   aload_0
L155:   getfield Field packet data [B
L158:   aload_0
L159:   dup
L160:   getfield Field packet pos I
L163:   dup_x1
L164:   iconst_1
L165:   iadd
L166:   putfield Field packet pos I
L169:   lload_1
L170:   l2i
L171:   i2b
L172:   bastore
L173:   return
L174:   
        .linenumbertable
            L0 75
            L22 76
            L44 77
            L66 78
            L88 79
            L110 80
            L132 81
            L154 82
            L173 74
        .end linenumbertable
    .end code
.end method

.method public pjstr : (Ljava/lang/String;)V
    .code stack 5 locals 2
L0:     aload_1
L1:     iconst_0
L2:     aload_1
L3:     invokevirtual Method java/lang/String length ()I
L6:     aload_0
L7:     getfield Field packet data [B
L10:    aload_0
L11:    getfield Field packet pos I
L14:    invokevirtual Method java/lang/String getBytes (II[BI)V
L17:    aload_0
L18:    dup
L19:    getfield Field packet pos I
L22:    aload_1
L23:    invokevirtual Method java/lang/String length ()I
L26:    iadd
L27:    putfield Field packet pos I
L30:    aload_0
L31:    getfield Field packet data [B
L34:    aload_0
L35:    dup
L36:    getfield Field packet pos I
L39:    dup_x1
L40:    iconst_1
L41:    iadd
L42:    putfield Field packet pos I
L45:    iconst_0
L46:    bastore
L47:    return
L48:    
        .linenumbertable
            L0 93
            L17 94
            L30 95
            L47 92
        .end linenumbertable
    .end code
.end method

.method public pdata : ([BII)V
    .code stack 5 locals 5
L0:     iload_2
L1:     istore 4
L3:     goto L29
L6:     aload_0
L7:     getfield Field packet data [B
L10:    aload_0
L11:    dup
L12:    getfield Field packet pos I
L15:    dup_x1
L16:    iconst_1
L17:    iadd
L18:    putfield Field packet pos I
L21:    aload_1
L22:    iload 4
L24:    baload
L25:    bastore
L26:    iinc 4 1
L29:    iload 4
L31:    iload_2
L32:    iload_3
L33:    iadd
L34:    if_icmplt L6
L37:    return
L38:    
        .linenumbertable
            L0 98
            L37 97
        .end linenumbertable
    .end code
.end method

.method public pad : (I)V
    .code stack 5 locals 2
L0:     goto L20
L3:     aload_0
L4:     getfield Field packet data [B
L7:     aload_0
L8:     dup
L9:     getfield Field packet pos I
L12:    dup_x1
L13:    iconst_1
L14:    iadd
L15:    putfield Field packet pos I
L18:    iconst_0
L19:    bastore
L20:    aload_0
L21:    getfield Field packet pos I
L24:    iload_1
L25:    if_icmplt L3
L28:    return
L29:    
        .linenumbertable
            L0 102
            L28 101
        .end linenumbertable
    .end code
.end method

.method public moveupdata : (I)V
    .code stack 4 locals 3
L0:     iload_1
L1:     aload_0
L2:     getfield Field packet pos I
L5:     if_icmplt L14
L8:     aload_0
L9:     iconst_0
L10:    putfield Field packet pos I
L13:    return
L14:    iload_1
L15:    istore_2
L16:    goto L36
L19:    aload_0
L20:    getfield Field packet data [B
L23:    iload_2
L24:    iload_1
L25:    isub
L26:    aload_0
L27:    getfield Field packet data [B
L30:    iload_2
L31:    baload
L32:    bastore
L33:    iinc 2 1
L36:    iload_2
L37:    aload_0
L38:    getfield Field packet pos I
L41:    if_icmplt L19
L44:    aload_0
L45:    dup
L46:    getfield Field packet pos I
L49:    iload_1
L50:    isub
L51:    putfield Field packet pos I
L54:    return
L55:    
        .linenumbertable
            L0 106
            L14 107
            L44 108
            L54 105
        .end linenumbertable
    .end code
.end method

.method public psize4 : (I)V
    .code stack 4 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     iload_1
L9:     isub
L10:    iconst_4
L11:    isub
L12:    iload_1
L13:    bipush 24
L15:    ishr
L16:    i2b
L17:    bastore
L18:    aload_0
L19:    getfield Field packet data [B
L22:    aload_0
L23:    getfield Field packet pos I
L26:    iload_1
L27:    isub
L28:    iconst_3
L29:    isub
L30:    iload_1
L31:    bipush 16
L33:    ishr
L34:    i2b
L35:    bastore
L36:    aload_0
L37:    getfield Field packet data [B
L40:    aload_0
L41:    getfield Field packet pos I
L44:    iload_1
L45:    isub
L46:    iconst_2
L47:    isub
L48:    iload_1
L49:    bipush 8
L51:    ishr
L52:    i2b
L53:    bastore
L54:    aload_0
L55:    getfield Field packet data [B
L58:    aload_0
L59:    getfield Field packet pos I
L62:    iload_1
L63:    isub
L64:    iconst_1
L65:    isub
L66:    iload_1
L67:    i2b
L68:    bastore
L69:    return
L70:    
        .linenumbertable
            L0 112
            L18 113
            L36 114
            L54 115
            L69 111
        .end linenumbertable
    .end code
.end method

.method public psize2 : (I)V
    .code stack 4 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     iload_1
L9:     isub
L10:    iconst_2
L11:    isub
L12:    iload_1
L13:    bipush 8
L15:    ishr
L16:    i2b
L17:    bastore
L18:    aload_0
L19:    getfield Field packet data [B
L22:    aload_0
L23:    getfield Field packet pos I
L26:    iload_1
L27:    isub
L28:    iconst_1
L29:    isub
L30:    iload_1
L31:    i2b
L32:    bastore
L33:    return
L34:    
        .linenumbertable
            L0 119
            L18 120
            L33 118
        .end linenumbertable
    .end code
.end method

.method public psize1 : (I)V
    .code stack 3 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     iload_1
L9:     isub
L10:    iconst_1
L11:    isub
L12:    iload_1
L13:    i2b
L14:    bastore
L15:    return
L16:    
        .linenumbertable
            L0 124
            L15 123
        .end linenumbertable
    .end code
.end method

.method public psmart : (I)V
    .code stack 4 locals 2
L0:     iload_1
L1:     bipush 64
L3:     if_icmpge L21
L6:     iload_1
L7:     bipush -64
L9:     if_icmplt L21
L12:    aload_0
L13:    iload_1
L14:    bipush 64
L16:    iadd
L17:    invokevirtual Method packet p1 (I)V
L20:    return
L21:    iload_1
L22:    sipush 16384
L25:    if_icmpge L44
L28:    iload_1
L29:    sipush -16384
L32:    if_icmplt L44
L35:    aload_0
L36:    iload_1
L37:    ldc 49152
L39:    iadd
L40:    invokevirtual Method packet p2 (I)V
L43:    return
L44:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L47:    new java/lang/StringBuffer
L50:    dup
L51:    ldc "<font color=red>Error psmart out of range: "
L53:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L56:    iload_1
L57:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L60:    ldc "</font>"
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L65:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L68:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L71:    return
L72:    
        .linenumbertable
            L0 128
            L21 129
            L44 130
            L71 127
        .end linenumbertable
    .end code
.end method

.method public psmarts : (I)V
    .code stack 4 locals 2
L0:     iload_1
L1:     sipush 128
L4:     if_icmpge L13
L7:     aload_0
L8:     iload_1
L9:     invokevirtual Method packet p1 (I)V
L12:    return
L13:    iload_1
L14:    ldc 32768
L16:    if_icmpge L28
L19:    aload_0
L20:    ldc 32768
L22:    iload_1
L23:    iadd
L24:    invokevirtual Method packet p2 (I)V
L27:    return
L28:    getstatic Field java/lang/System out Ljava/io/PrintStream;
L31:    new java/lang/StringBuffer
L34:    dup
L35:    ldc "<font color=red>Error psmarts out of range: "
L37:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L40:    iload_1
L41:    invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L44:    ldc "</font>"
L46:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L49:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L52:    invokevirtual Method java/io/PrintStream println (Ljava/lang/String;)V
L55:    return
L56:    
        .linenumbertable
            L0 134
            L13 135
            L28 136
            L55 133
        .end linenumbertable
    .end code
.end method

.method public pstrraw : (Ljava/lang/String;)V
    .code stack 5 locals 2
L0:     aload_0
L1:     aload_1
L2:     invokevirtual Method java/lang/String length ()I
L5:     invokevirtual Method packet p4 (I)V
L8:     aload_1
L9:     iconst_0
L10:    aload_1
L11:    invokevirtual Method java/lang/String length ()I
L14:    aload_0
L15:    getfield Field packet data [B
L18:    aload_0
L19:    getfield Field packet pos I
L22:    invokevirtual Method java/lang/String getBytes (II[BI)V
L25:    aload_0
L26:    dup
L27:    getfield Field packet pos I
L30:    aload_1
L31:    invokevirtual Method java/lang/String length ()I
L34:    iadd
L35:    putfield Field packet pos I
L38:    return
L39:    
        .linenumbertable
            L0 140
            L8 141
            L25 142
            L38 139
        .end linenumbertable
    .end code
.end method

.method public g1 : ()I
    .code stack 5 locals 1
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    baload
L16:    sipush 255
L19:    iand
L20:    ireturn
L21:    
        .linenumbertable
            L0 149
        .end linenumbertable
    .end code
.end method

.method public g1b : ()B
    .code stack 5 locals 1
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     dup
L6:     getfield Field packet pos I
L9:     dup_x1
L10:    iconst_1
L11:    iadd
L12:    putfield Field packet pos I
L15:    baload
L16:    ireturn
L17:    
        .linenumbertable
            L0 153
        .end linenumbertable
    .end code
.end method

.method public g2 : ()I
    .code stack 4 locals 1
L0:     aload_0
L1:     dup
L2:     getfield Field packet pos I
L5:     iconst_2
L6:     iadd
L7:     putfield Field packet pos I
L10:    aload_0
L11:    getfield Field packet data [B
L14:    aload_0
L15:    getfield Field packet pos I
L18:    iconst_2
L19:    isub
L20:    baload
L21:    sipush 255
L24:    iand
L25:    bipush 8
L27:    ishl
L28:    aload_0
L29:    getfield Field packet data [B
L32:    aload_0
L33:    getfield Field packet pos I
L36:    iconst_1
L37:    isub
L38:    baload
L39:    sipush 255
L42:    iand
L43:    iadd
L44:    ireturn
L45:    
        .linenumbertable
            L0 157
            L10 158
        .end linenumbertable
    .end code
.end method

.method public g2b : ()I
    .code stack 4 locals 2
L0:     aload_0
L1:     dup
L2:     getfield Field packet pos I
L5:     iconst_2
L6:     iadd
L7:     putfield Field packet pos I
L10:    aload_0
L11:    getfield Field packet data [B
L14:    aload_0
L15:    getfield Field packet pos I
L18:    iconst_2
L19:    isub
L20:    baload
L21:    sipush 255
L24:    iand
L25:    bipush 8
L27:    ishl
L28:    aload_0
L29:    getfield Field packet data [B
L32:    aload_0
L33:    getfield Field packet pos I
L36:    iconst_1
L37:    isub
L38:    baload
L39:    sipush 255
L42:    iand
L43:    iadd
L44:    istore_1
L45:    iload_1
L46:    sipush 32767
L49:    if_icmple L57
L52:    iload_1
L53:    ldc 65536
L55:    isub
L56:    istore_1
L57:    iload_1
L58:    ireturn
L59:    
        .linenumbertable
            L0 162
            L10 163
            L45 164
            L57 165
        .end linenumbertable
    .end code
.end method

.method public g3 : ()I
    .code stack 4 locals 1
L0:     aload_0
L1:     dup
L2:     getfield Field packet pos I
L5:     iconst_3
L6:     iadd
L7:     putfield Field packet pos I
L10:    aload_0
L11:    getfield Field packet data [B
L14:    aload_0
L15:    getfield Field packet pos I
L18:    iconst_3
L19:    isub
L20:    baload
L21:    sipush 255
L24:    iand
L25:    bipush 16
L27:    ishl
L28:    aload_0
L29:    getfield Field packet data [B
L32:    aload_0
L33:    getfield Field packet pos I
L36:    iconst_2
L37:    isub
L38:    baload
L39:    sipush 255
L42:    iand
L43:    bipush 8
L45:    ishl
L46:    iadd
L47:    aload_0
L48:    getfield Field packet data [B
L51:    aload_0
L52:    getfield Field packet pos I
L55:    iconst_1
L56:    isub
L57:    baload
L58:    sipush 255
L61:    iand
L62:    iadd
L63:    ireturn
L64:    
        .linenumbertable
            L0 169
            L10 170
        .end linenumbertable
    .end code
.end method

.method public g4 : ()I
    .code stack 4 locals 1
L0:     aload_0
L1:     dup
L2:     getfield Field packet pos I
L5:     iconst_4
L6:     iadd
L7:     putfield Field packet pos I
L10:    aload_0
L11:    getfield Field packet data [B
L14:    aload_0
L15:    getfield Field packet pos I
L18:    iconst_4
L19:    isub
L20:    baload
L21:    sipush 255
L24:    iand
L25:    bipush 24
L27:    ishl
L28:    aload_0
L29:    getfield Field packet data [B
L32:    aload_0
L33:    getfield Field packet pos I
L36:    iconst_3
L37:    isub
L38:    baload
L39:    sipush 255
L42:    iand
L43:    bipush 16
L45:    ishl
L46:    iadd
L47:    aload_0
L48:    getfield Field packet data [B
L51:    aload_0
L52:    getfield Field packet pos I
L55:    iconst_2
L56:    isub
L57:    baload
L58:    sipush 255
L61:    iand
L62:    bipush 8
L64:    ishl
L65:    iadd
L66:    aload_0
L67:    getfield Field packet data [B
L70:    aload_0
L71:    getfield Field packet pos I
L74:    iconst_1
L75:    isub
L76:    baload
L77:    sipush 255
L80:    iand
L81:    iadd
L82:    ireturn
L83:    
        .linenumbertable
            L0 174
            L10 175
        .end linenumbertable
    .end code
.end method

.method public g8 : ()J
    .code stack 4 locals 5
L0:     aload_0
L1:     invokevirtual Method packet g4 ()I
L4:     i2l
L5:     ldc2_w 4294967295L
L8:     land
L9:     lstore_1
L10:    aload_0
L11:    invokevirtual Method packet g4 ()I
L14:    i2l
L15:    ldc2_w 4294967295L
L18:    land
L19:    lstore_3
L20:    lload_1
L21:    bipush 32
L23:    lshl
L24:    lload_3
L25:    ladd
L26:    lreturn
L27:    
        .linenumbertable
            L0 179
            L10 180
            L20 181
        .end linenumbertable
    .end code
.end method

.method public fastgstr : ()Ljava/lang/String;
    .code stack 3 locals 1
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     baload
L9:     bipush 10
L11:    if_icmpne L26
L14:    aload_0
L15:    dup
L16:    getfield Field packet pos I
L19:    iconst_1
L20:    iadd
L21:    putfield Field packet pos I
L24:    aconst_null
L25:    areturn
L26:    aload_0
L27:    invokevirtual Method packet gstr ()Ljava/lang/String;
L30:    areturn
L31:    
        .linenumbertable
            L0 185
            L26 186
        .end linenumbertable
    .end code
.end method

.method public gstr : ()Ljava/lang/String;
    .code stack 6 locals 2
L0:     aload_0
L1:     getfield Field packet pos I
L4:     istore_1
L5:     goto L8
L8:     aload_0
L9:     getfield Field packet data [B
L12:    aload_0
L13:    dup
L14:    getfield Field packet pos I
L17:    dup_x1
L18:    iconst_1
L19:    iadd
L20:    putfield Field packet pos I
L23:    baload
L24:    bipush 10
L26:    if_icmpne L8
L29:    new java/lang/String
L32:    dup
L33:    aload_0
L34:    getfield Field packet data [B
L37:    iload_1
L38:    aload_0
L39:    getfield Field packet pos I
L42:    iload_1
L43:    isub
L44:    iconst_1
L45:    isub
L46:    invokespecial Method java/lang/String <init> ([BII)V
L49:    areturn
L50:    
        .linenumbertable
            L0 190
            L29 191
        .end linenumbertable
    .end code
.end method

.method public gstrbyte : ()[B
    .code stack 5 locals 4
L0:     aload_0
L1:     getfield Field packet pos I
L4:     istore_1
L5:     goto L8
L8:     aload_0
L9:     getfield Field packet data [B
L12:    aload_0
L13:    dup
L14:    getfield Field packet pos I
L17:    dup_x1
L18:    iconst_1
L19:    iadd
L20:    putfield Field packet pos I
L23:    baload
L24:    bipush 10
L26:    if_icmpne L8
L29:    aload_0
L30:    getfield Field packet pos I
L33:    iload_1
L34:    isub
L35:    iconst_1
L36:    isub
L37:    newarray byte
L39:    astore_2
L40:    iload_1
L41:    istore_3
L42:    goto L59
L45:    aload_2
L46:    iload_3
L47:    iload_1
L48:    isub
L49:    aload_0
L50:    getfield Field packet data [B
L53:    iload_3
L54:    baload
L55:    bastore
L56:    iinc 3 1
L59:    iload_3
L60:    aload_0
L61:    getfield Field packet pos I
L64:    iconst_1
L65:    isub
L66:    if_icmplt L45
L69:    aload_2
L70:    areturn
L71:    
        .linenumbertable
            L0 195
            L29 196
            L40 197
            L69 198
        .end linenumbertable
    .end code
.end method

.method public gdata : ([BII)V
    .code stack 7 locals 5
L0:     iload_2
L1:     istore 4
L3:     goto L29
L6:     aload_1
L7:     iload 4
L9:     aload_0
L10:    getfield Field packet data [B
L13:    aload_0
L14:    dup
L15:    getfield Field packet pos I
L18:    dup_x1
L19:    iconst_1
L20:    iadd
L21:    putfield Field packet pos I
L24:    baload
L25:    bastore
L26:    iinc 4 1
L29:    iload 4
L31:    iload_2
L32:    iload_3
L33:    iadd
L34:    if_icmplt L6
L37:    return
L38:    
        .linenumbertable
            L0 202
            L37 201
        .end linenumbertable
    .end code
.end method

.method public gsmart : ()I
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     baload
L9:     sipush 255
L12:    iand
L13:    istore_1
L14:    iload_1
L15:    sipush 128
L18:    if_icmpge L29
L21:    aload_0
L22:    invokevirtual Method packet g1 ()I
L25:    bipush 64
L27:    isub
L28:    ireturn
L29:    aload_0
L30:    invokevirtual Method packet g2 ()I
L33:    ldc 49152
L35:    isub
L36:    ireturn
L37:    
        .linenumbertable
            L0 206
            L14 207
        .end linenumbertable
    .end code
.end method

.method public gsmarts : ()I
    .code stack 2 locals 2
L0:     aload_0
L1:     getfield Field packet data [B
L4:     aload_0
L5:     getfield Field packet pos I
L8:     baload
L9:     sipush 255
L12:    iand
L13:    istore_1
L14:    iload_1
L15:    sipush 128
L18:    if_icmpge L26
L21:    aload_0
L22:    invokevirtual Method packet g1 ()I
L25:    ireturn
L26:    aload_0
L27:    invokevirtual Method packet g2 ()I
L30:    ldc 32768
L32:    isub
L33:    ireturn
L34:    
        .linenumbertable
            L0 211
            L14 212
            L26 213
        .end linenumbertable
    .end code
.end method

.method public gstrraw : ()Ljava/lang/String;
    .code stack 5 locals 3
L0:     aload_0
L1:     invokevirtual Method packet g4 ()I
L4:     istore_1
L5:     aload_0
L6:     getfield Field packet pos I
L9:     istore_2
L10:    aload_0
L11:    dup
L12:    getfield Field packet pos I
L15:    iload_1
L16:    iadd
L17:    putfield Field packet pos I
L20:    new java/lang/String
L23:    dup
L24:    aload_0
L25:    getfield Field packet data [B
L28:    iload_2
L29:    iload_1
L30:    invokespecial Method java/lang/String <init> ([BII)V
L33:    areturn
L34:    
        .linenumbertable
            L0 217
            L5 218
            L10 219
            L20 220
        .end linenumbertable
    .end code
.end method

.method public tinyenc : ([I)V
    .code stack 6 locals 9
L0:     aload_0
L1:     getfield Field packet pos I
L4:     bipush 8
L6:     idiv
L7:     istore_2
L8:     aload_0
L9:     iconst_0
L10:    putfield Field packet pos I
L13:    iconst_0
L14:    istore_3
L15:    goto L142
L18:    aload_0
L19:    invokevirtual Method packet g4 ()I
L22:    istore 4
L24:    aload_0
L25:    invokevirtual Method packet g4 ()I
L28:    istore 5
L30:    iconst_0
L31:    istore 6
L33:    ldc -1640531527
L35:    istore 7
L37:    bipush 32
L39:    istore 8
L41:    goto L108
L44:    iload 4
L46:    iload 5
L48:    iconst_4
L49:    ishl
L50:    iload 5
L52:    iconst_5
L53:    iushr
L54:    ixor
L55:    iload 5
L57:    iadd
L58:    iload 6
L60:    aload_1
L61:    iload 6
L63:    iconst_3
L64:    iand
L65:    iaload
L66:    iadd
L67:    ixor
L68:    iadd
L69:    istore 4
L71:    iload 6
L73:    iload 7
L75:    iadd
L76:    istore 6
L78:    iload 5
L80:    iload 4
L82:    iconst_4
L83:    ishl
L84:    iload 4
L86:    iconst_5
L87:    iushr
L88:    ixor
L89:    iload 4
L91:    iadd
L92:    iload 6
L94:    aload_1
L95:    iload 6
L97:    bipush 11
L99:    iushr
L100:   iconst_3
L101:   iand
L102:   iaload
L103:   iadd
L104:   ixor
L105:   iadd
L106:   istore 5
L108:   iload 8
L110:   iinc 8 -1
L113:   ifgt L44
L116:   aload_0
L117:   dup
L118:   getfield Field packet pos I
L121:   bipush 8
L123:   isub
L124:   putfield Field packet pos I
L127:   aload_0
L128:   iload 4
L130:   invokevirtual Method packet p4 (I)V
L133:   aload_0
L134:   iload 5
L136:   invokevirtual Method packet p4 (I)V
L139:   iinc 3 1
L142:   iload_3
L143:   iload_2
L144:   if_icmplt L18
L147:   return
L148:   
        .linenumbertable
            L0 227
            L13 228
            L18 229
            L30 230
            L41 231
            L44 232
            L71 233
            L78 234
            L108 231
            L116 236
            L139 228
            L147 226
        .end linenumbertable
    .end code
.end method

.method public tinydec : ([I)V
    .code stack 6 locals 9
L0:     aload_0
L1:     getfield Field packet pos I
L4:     bipush 8
L6:     idiv
L7:     istore_2
L8:     aload_0
L9:     iconst_0
L10:    putfield Field packet pos I
L13:    iconst_0
L14:    istore_3
L15:    goto L143
L18:    aload_0
L19:    invokevirtual Method packet g4 ()I
L22:    istore 4
L24:    aload_0
L25:    invokevirtual Method packet g4 ()I
L28:    istore 5
L30:    ldc -957401312
L32:    istore 6
L34:    ldc -1640531527
L36:    istore 7
L38:    bipush 32
L40:    istore 8
L42:    goto L109
L45:    iload 5
L47:    iload 4
L49:    iconst_4
L50:    ishl
L51:    iload 4
L53:    iconst_5
L54:    iushr
L55:    ixor
L56:    iload 4
L58:    iadd
L59:    iload 6
L61:    aload_1
L62:    iload 6
L64:    bipush 11
L66:    iushr
L67:    iconst_3
L68:    iand
L69:    iaload
L70:    iadd
L71:    ixor
L72:    isub
L73:    istore 5
L75:    iload 6
L77:    iload 7
L79:    isub
L80:    istore 6
L82:    iload 4
L84:    iload 5
L86:    iconst_4
L87:    ishl
L88:    iload 5
L90:    iconst_5
L91:    iushr
L92:    ixor
L93:    iload 5
L95:    iadd
L96:    iload 6
L98:    aload_1
L99:    iload 6
L101:   iconst_3
L102:   iand
L103:   iaload
L104:   iadd
L105:   ixor
L106:   isub
L107:   istore 4
L109:   iload 8
L111:   iinc 8 -1
L114:   ifgt L45
L117:   aload_0
L118:   dup
L119:   getfield Field packet pos I
L122:   bipush 8
L124:   isub
L125:   putfield Field packet pos I
L128:   aload_0
L129:   iload 4
L131:   invokevirtual Method packet p4 (I)V
L134:   aload_0
L135:   iload 5
L137:   invokevirtual Method packet p4 (I)V
L140:   iinc 3 1
L143:   iload_3
L144:   iload_2
L145:   if_icmplt L18
L148:   return
L149:   
        .linenumbertable
            L0 241
            L13 242
            L18 243
            L30 244
            L42 245
            L45 246
            L75 247
            L82 248
            L109 245
            L117 250
            L140 242
            L148 240
        .end linenumbertable
    .end code
.end method

.method public rsaenc : (Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .code stack 4 locals 8
L0:     aload_0
L1:     getfield Field packet pos I
L4:     istore_3
L5:     aload_0
L6:     iconst_0
L7:     putfield Field packet pos I
L10:    iload_3
L11:    newarray byte
L13:    astore 4
L15:    aload_0
L16:    aload 4
L18:    iconst_0
L19:    iload_3
L20:    invokevirtual Method packet gdata ([BII)V
L23:    new java/math/BigInteger
L26:    dup
L27:    aload 4
L29:    invokespecial Method java/math/BigInteger <init> ([B)V
L32:    astore 5
L34:    aload 5
L36:    aload_1
L37:    aload_2
L38:    invokevirtual Method java/math/BigInteger modPow (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
L41:    astore 6
L43:    aload 6
L45:    invokevirtual Method java/math/BigInteger toByteArray ()[B
L48:    astore 7
L50:    aload_0
L51:    iconst_0
L52:    putfield Field packet pos I
L55:    aload_0
L56:    aload 7
L58:    arraylength
L59:    invokevirtual Method packet p1 (I)V
L62:    aload_0
L63:    aload 7
L65:    iconst_0
L66:    aload 7
L68:    arraylength
L69:    invokevirtual Method packet pdata ([BII)V
L72:    return
L73:    
        .linenumbertable
            L0 255
            L10 256
            L23 257
            L34 258
            L43 259
            L50 260
            L72 254
        .end linenumbertable
    .end code
.end method

.method public rsadec : (Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .code stack 4 locals 8
L0:     aload_0
L1:     invokevirtual Method packet g1 ()I
L4:     istore_3
L5:     iload_3
L6:     newarray byte
L8:     astore 4
L10:    aload_0
L11:    aload 4
L13:    iconst_0
L14:    iload_3
L15:    invokevirtual Method packet gdata ([BII)V
L18:    new java/math/BigInteger
L21:    dup
L22:    aload 4
L24:    invokespecial Method java/math/BigInteger <init> ([B)V
L27:    astore 5
L29:    aload 5
L31:    aload_1
L32:    aload_2
L33:    invokevirtual Method java/math/BigInteger modPow (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
L36:    astore 6
L38:    aload 6
L40:    invokevirtual Method java/math/BigInteger toByteArray ()[B
L43:    astore 7
L45:    aload_0
L46:    iconst_0
L47:    putfield Field packet pos I
L50:    aload_0
L51:    aload 7
L53:    iconst_0
L54:    aload 7
L56:    arraylength
L57:    invokevirtual Method packet pdata ([BII)V
L60:    return
L61:    
        .linenumbertable
            L0 264
            L5 265
            L18 266
            L29 267
            L38 268
            L45 269
            L60 263
        .end linenumbertable
    .end code
.end method

.method public addcrc : ()I
    .code stack 5 locals 3
L0:     iconst_m1
L1:     istore_1
L2:     iconst_0
L3:     istore_2
L4:     goto L32
L7:     iload_1
L8:     bipush 8
L10:    iushr
L11:    getstatic Field packet crctable [I
L14:    iload_1
L15:    aload_0
L16:    getfield Field packet data [B
L19:    iload_2
L20:    baload
L21:    ixor
L22:    sipush 255
L25:    iand
L26:    iaload
L27:    ixor
L28:    istore_1
L29:    iinc 2 1
L32:    iload_2
L33:    aload_0
L34:    getfield Field packet pos I
L37:    if_icmplt L7
L40:    iload_1
L41:    iconst_m1
L42:    ixor
L43:    istore_1
L44:    aload_0
L45:    iload_1
L46:    invokevirtual Method packet p4 (I)V
L49:    iload_1
L50:    ireturn
L51:    
        .linenumbertable
            L0 273
            L2 274
            L7 275
            L29 274
            L40 277
            L44 278
        .end linenumbertable
    .end code
.end method

.method public g64encoded : (I)Ljava/lang/String;
    .code stack 6 locals 6
L0:     ldc ""
L2:     astore_2
L3:     iload_1
L4:     istore_3
L5:     iload_1
L6:     iconst_3
L7:     irem
L8:     istore 4
L10:    iload 4
L12:    ifeq L22
L15:    iload_1
L16:    iconst_3
L17:    iload 4
L19:    isub
L20:    iadd
L21:    istore_1
L22:    iconst_0
L23:    istore 5
L25:    goto L441
L28:    new java/lang/StringBuffer
L31:    dup
L32:    aload_2
L33:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L36:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L39:    aload_0
L40:    getfield Field packet base64enctab [C
L43:    aload_0
L44:    getfield Field packet data [B
L47:    iload 5
L49:    aload_0
L50:    getfield Field packet pos I
L53:    iadd
L54:    baload
L55:    iconst_2
L56:    ishr
L57:    bipush 63
L59:    iand
L60:    caload
L61:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L64:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L67:    astore_2
L68:    iload 5
L70:    iconst_3
L71:    iadd
L72:    iload_3
L73:    if_icmple L276
L76:    iload 4
L78:    iconst_1
L79:    if_icmpne L145
L82:    new java/lang/StringBuffer
L85:    dup
L86:    aload_2
L87:    invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L90:    invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L93:    aload_0
L94:    getfield Field packet base64enctab [C
L97:    aload_0
L98:    getfield Field packet data [B
L101:   iload 5
L103:   aload_0
L104:   getfield Field packet pos I
L107:   iadd
L108:   baload
L109:   iconst_4
L110:   ishl
L111:   bipush 48
L113:   iand
L114:   caload
L115:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L118:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L121:   astore_2
L122:   new java/lang/StringBuffer
L125:   dup
L126:   aload_2
L127:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L130:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L133:   ldc "=="
L135:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L138:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L141:   astore_2
L142:   goto L438
L145:   iload 4
L147:   iconst_2
L148:   if_icmpne L438
L151:   new java/lang/StringBuffer
L154:   dup
L155:   aload_2
L156:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L159:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L162:   aload_0
L163:   getfield Field packet base64enctab [C
L166:   aload_0
L167:   getfield Field packet data [B
L170:   iload 5
L172:   aload_0
L173:   getfield Field packet pos I
L176:   iadd
L177:   baload
L178:   iconst_4
L179:   ishl
L180:   bipush 48
L182:   iand
L183:   aload_0
L184:   getfield Field packet data [B
L187:   iload 5
L189:   iconst_1
L190:   iadd
L191:   aload_0
L192:   getfield Field packet pos I
L195:   iadd
L196:   baload
L197:   iconst_4
L198:   ishr
L199:   bipush 15
L201:   iand
L202:   ior
L203:   caload
L204:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L207:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L210:   astore_2
L211:   new java/lang/StringBuffer
L214:   dup
L215:   aload_2
L216:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L219:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L222:   aload_0
L223:   getfield Field packet base64enctab [C
L226:   aload_0
L227:   getfield Field packet data [B
L230:   iload 5
L232:   iconst_1
L233:   iadd
L234:   aload_0
L235:   getfield Field packet pos I
L238:   iadd
L239:   baload
L240:   iconst_2
L241:   ishl
L242:   bipush 60
L244:   iand
L245:   caload
L246:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L249:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L252:   astore_2
L253:   new java/lang/StringBuffer
L256:   dup
L257:   aload_2
L258:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L261:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L264:   ldc "="
L266:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L269:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L272:   astore_2
L273:   goto L438
L276:   new java/lang/StringBuffer
L279:   dup
L280:   aload_2
L281:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L284:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L287:   aload_0
L288:   getfield Field packet base64enctab [C
L291:   aload_0
L292:   getfield Field packet data [B
L295:   iload 5
L297:   aload_0
L298:   getfield Field packet pos I
L301:   iadd
L302:   baload
L303:   iconst_4
L304:   ishl
L305:   bipush 48
L307:   iand
L308:   aload_0
L309:   getfield Field packet data [B
L312:   iload 5
L314:   iconst_1
L315:   iadd
L316:   aload_0
L317:   getfield Field packet pos I
L320:   iadd
L321:   baload
L322:   iconst_4
L323:   ishr
L324:   bipush 15
L326:   iand
L327:   ior
L328:   caload
L329:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L332:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L335:   astore_2
L336:   new java/lang/StringBuffer
L339:   dup
L340:   aload_2
L341:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L344:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L347:   aload_0
L348:   getfield Field packet base64enctab [C
L351:   aload_0
L352:   getfield Field packet data [B
L355:   iload 5
L357:   iconst_1
L358:   iadd
L359:   aload_0
L360:   getfield Field packet pos I
L363:   iadd
L364:   baload
L365:   iconst_2
L366:   ishl
L367:   bipush 60
L369:   iand
L370:   aload_0
L371:   getfield Field packet data [B
L374:   iload 5
L376:   iconst_2
L377:   iadd
L378:   aload_0
L379:   getfield Field packet pos I
L382:   iadd
L383:   baload
L384:   bipush 6
L386:   ishr
L387:   iconst_3
L388:   iand
L389:   ior
L390:   caload
L391:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L394:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L397:   astore_2
L398:   new java/lang/StringBuffer
L401:   dup
L402:   aload_2
L403:   invokestatic Method java/lang/String valueOf (Ljava/lang/Object;)Ljava/lang/String;
L406:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L409:   aload_0
L410:   getfield Field packet base64enctab [C
L413:   aload_0
L414:   getfield Field packet data [B
L417:   iload 5
L419:   iconst_2
L420:   iadd
L421:   aload_0
L422:   getfield Field packet pos I
L425:   iadd
L426:   baload
L427:   bipush 63
L429:   iand
L430:   caload
L431:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L434:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L437:   astore_2
L438:   iinc 5 3
L441:   iload 5
L443:   iload_1
L444:   if_icmplt L28
L447:   aload_2
L448:   areturn
L449:   
        .linenumbertable
            L0 285
            L3 286
            L5 287
            L10 288
            L15 289
            L22 291
            L28 292
            L68 293
            L76 294
            L82 295
            L122 296
            L142 294
            L145 297
            L151 298
            L211 299
            L253 300
            L273 293
            L276 303
            L336 304
            L398 305
            L438 291
            L447 308
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 3 locals 3
L0:     sipush 256
L3:     newarray int
L5:     putstatic Field packet crctable [I
L8:     iconst_0
L9:     istore_1
L10:    goto L59
L13:    iload_1
L14:    istore_0
L15:    iconst_0
L16:    istore_2
L17:    goto L44
L20:    iload_0
L21:    iconst_1
L22:    iand
L23:    iconst_1
L24:    if_icmpne L37
L27:    iload_0
L28:    iconst_1
L29:    iushr
L30:    ldc -306674912
L32:    ixor
L33:    istore_0
L34:    goto L41
L37:    iload_0
L38:    iconst_1
L39:    iushr
L40:    istore_0
L41:    iinc 2 1
L44:    iload_2
L45:    bipush 8
L47:    if_icmplt L20
L50:    getstatic Field packet crctable [I
L53:    iload_1
L54:    iload_0
L55:    iastore
L56:    iinc 1 1
L59:    iload_1
L60:    sipush 256
L63:    if_icmplt L13
L66:    return
L67:    
        .linenumbertable
            L0 14
            L8 18
            L13 19
            L15 20
            L20 21
            L37 22
            L41 20
            L50 24
            L56 18
            L66 7
        .end linenumbertable
    .end code
.end method
.sourcefile "packet.java"
.end class
