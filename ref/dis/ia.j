.version 45 3
.class super ia
.super wa
.field static i I
.field static j I
.field static k I
.field static l I
.field static m I
.field private static n I
.field static o [I

.method private static final a : (IIII)V
    .code stack 4 locals 6
L0:     iload_0
L1:     getstatic Field ia i I
L4:     if_icmplt L14
L7:     iload_0
L8:     getstatic Field ia l I
L11:    if_icmplt L15
L14:    return
L15:    iload_1
L16:    getstatic Field ia j I
L19:    if_icmpge L34
L22:    iload_2
L23:    getstatic Field ia j I
L26:    iload_1
L27:    isub
L28:    isub
L29:    istore_2
L30:    getstatic Field ia j I
L33:    istore_1
L34:    iload_1
L35:    iload_2
L36:    iadd
L37:    getstatic Field ia m I
L40:    if_icmple L49
L43:    getstatic Field ia m I
L46:    iload_1
L47:    isub
L48:    istore_2
L49:    iload_0
L50:    iload_1
L51:    getstatic Field ia k I
L54:    imul
L55:    iadd
L56:    istore 4
L58:    iconst_0
L59:    istore 5
L61:    iload 5
L63:    iload_2
L64:    if_icmpge L87
L67:    getstatic Field ia o [I
L70:    iload 4
L72:    iload 5
L74:    getstatic Field ia k I
L77:    imul
L78:    iadd
L79:    iload_3
L80:    iastore
L81:    iinc 5 1
L84:    goto L61
L87:    return
L88:    
        .linenumbertable
            L0 5
            L14 6
            L15 8
            L22 10
            L30 11
            L34 14
            L43 15
            L49 18
            L58 21
            L61 22
            L67 23
            L81 22
            L87 26
        .end linenumbertable
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method wa <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 28
            L4 29
        .end linenumbertable
    .end code
.end method

.method static final b : (IIII)V
    .code stack 3 locals 6
L0:     iload_1
L1:     getstatic Field ia j I
L4:     if_icmplt L14
L7:     iload_1
L8:     getstatic Field ia m I
L11:    if_icmplt L15
L14:    return
L15:    iload_0
L16:    getstatic Field ia i I
L19:    if_icmpge L34
L22:    iload_2
L23:    getstatic Field ia i I
L26:    iload_0
L27:    isub
L28:    isub
L29:    istore_2
L30:    getstatic Field ia i I
L33:    istore_0
L34:    iload_0
L35:    iload_2
L36:    iadd
L37:    getstatic Field ia l I
L40:    if_icmple L49
L43:    getstatic Field ia l I
L46:    iload_0
L47:    isub
L48:    istore_2
L49:    iload_0
L50:    iload_1
L51:    getstatic Field ia k I
L54:    imul
L55:    iadd
L56:    istore 4
L58:    iconst_0
L59:    istore 5
L61:    iload 5
L63:    iload_2
L64:    if_icmpge L83
L67:    getstatic Field ia o [I
L70:    iload 4
L72:    iload 5
L74:    iadd
L75:    iload_3
L76:    iastore
L77:    iinc 5 1
L80:    goto L61
L83:    return
L84:    
        .linenumbertable
            L0 34
            L14 35
            L15 37
            L22 39
            L30 40
            L34 43
            L43 44
            L49 47
            L58 50
            L61 51
            L67 52
            L77 51
            L83 55
        .end linenumbertable
    .end code
.end method

.method static final a : ()V
    .code stack 3 locals 2
L0:     iconst_0
L1:     istore_0
L2:     getstatic Field ia k I
L5:     getstatic Field ia n I
L8:     imul
L9:     bipush 7
L11:    isub
L12:    istore_1
L13:    iload_0
L14:    iload_1
L15:    if_icmpge L93
L18:    getstatic Field ia o [I
L21:    iload_0
L22:    iinc 0 1
L25:    iconst_0
L26:    iastore
L27:    getstatic Field ia o [I
L30:    iload_0
L31:    iinc 0 1
L34:    iconst_0
L35:    iastore
L36:    getstatic Field ia o [I
L39:    iload_0
L40:    iinc 0 1
L43:    iconst_0
L44:    iastore
L45:    getstatic Field ia o [I
L48:    iload_0
L49:    iinc 0 1
L52:    iconst_0
L53:    iastore
L54:    getstatic Field ia o [I
L57:    iload_0
L58:    iinc 0 1
L61:    iconst_0
L62:    iastore
L63:    getstatic Field ia o [I
L66:    iload_0
L67:    iinc 0 1
L70:    iconst_0
L71:    iastore
L72:    getstatic Field ia o [I
L75:    iload_0
L76:    iinc 0 1
L79:    iconst_0
L80:    iastore
L81:    getstatic Field ia o [I
L84:    iload_0
L85:    iinc 0 1
L88:    iconst_0
L89:    iastore
L90:    goto L13
L93:    iinc 1 7
L96:    iload_0
L97:    iload_1
L98:    if_icmpge L113
L101:   getstatic Field ia o [I
L104:   iload_0
L105:   iinc 0 1
L108:   iconst_0
L109:   iastore
L110:   goto L96
L113:   return
L114:   
        .linenumbertable
            L0 58
            L2 60
            L13 61
            L18 63
            L27 64
            L36 65
            L45 66
            L54 67
            L63 68
            L72 69
            L81 70
            L93 73
            L96 74
            L101 75
            L113 77
        .end linenumbertable
    .end code
.end method

.method static final a : (IIIII)V
    .code stack 4 locals 5
L0:     iload_0
L1:     iload_1
L2:     iload_2
L3:     iload 4
L5:     invokestatic Method ia b (IIII)V
L8:     iload_0
L9:     iload_1
L10:    iload_3
L11:    iadd
L12:    iconst_1
L13:    isub
L14:    iload_2
L15:    iload 4
L17:    invokestatic Method ia b (IIII)V
L20:    iload_0
L21:    iload_1
L22:    iload_3
L23:    iload 4
L25:    invokestatic Method ia a (IIII)V
L28:    iload_0
L29:    iload_2
L30:    iadd
L31:    iconst_1
L32:    isub
L33:    iload_1
L34:    iload_3
L35:    iload 4
L37:    invokestatic Method ia a (IIII)V
L40:    return
L41:    
        .linenumbertable
            L0 81
            L8 82
            L20 83
            L28 84
            L40 85
        .end linenumbertable
    .end code
.end method

.method public static b : ()V
    .code stack 1 locals 0
L0:     aconst_null
L1:     putstatic Field ia o [I
L4:     return
L5:     
        .linenumbertable
            L0 88
            L4 89
        .end linenumbertable
    .end code
.end method

.method static final a : ([III)V
    .code stack 4 locals 3
L0:     aload_0
L1:     putstatic Field ia o [I
L4:     iload_1
L5:     putstatic Field ia k I
L8:     iload_2
L9:     putstatic Field ia n I
L12:    iconst_0
L13:    iconst_0
L14:    iload_1
L15:    iload_2
L16:    invokestatic Method ia c (IIII)V
L19:    return
L20:    
        .linenumbertable
            L0 97
            L4 98
            L8 99
            L12 100
            L19 101
        .end linenumbertable
    .end code
.end method

.method private static final a : (IIIIIIII[II[IIIIIIII)V
    .code stack 6 locals 19
L0:     iload 17
L2:     ifge L136
L5:     iload 14
L7:     istore_3
L8:     iload 12
L10:    istore 4
L12:    iload 13
L14:    istore 18
L16:    iload 18
L18:    ifge L109
L21:    iload_3
L22:    iload 6
L24:    if_icmpge L88
L27:    aload 10
L29:    iload 6
L31:    iload_3
L32:    isub
L33:    iload 9
L35:    imul
L36:    iload 6
L38:    idiv
L39:    iaload
L40:    istore_0
L41:    aload 8
L43:    iload 7
L45:    iaload
L46:    istore_1
L47:    iload_0
L48:    iload_1
L49:    iadd
L50:    istore_2
L51:    iload_0
L52:    ldc 16711935
L54:    iand
L55:    iload_1
L56:    ldc 16711935
L58:    iand
L59:    iadd
L60:    istore_0
L61:    iload_0
L62:    ldc 16777472
L64:    iand
L65:    iload_2
L66:    iload_0
L67:    isub
L68:    ldc 65536
L70:    iand
L71:    iadd
L72:    istore_1
L73:    aload 8
L75:    iload 7
L77:    iload_2
L78:    iload_1
L79:    isub
L80:    iload_1
L81:    iload_1
L82:    bipush 8
L84:    iushr
L85:    isub
L86:    ior
L87:    iastore
L88:    iinc 7 1
L91:    iload_3
L92:    iload 4
L94:    iadd
L95:    istore_3
L96:    iload 4
L98:    iload 5
L100:   iadd
L101:   istore 4
L103:   iinc 18 1
L106:   goto L16
L109:   iload 7
L111:   iload 11
L113:   iadd
L114:   istore 7
L116:   iload 14
L118:   iload 15
L120:   iadd
L121:   istore 14
L123:   iload 15
L125:   iload 16
L127:   iadd
L128:   istore 15
L130:   iinc 17 1
L133:   goto L0
L136:   return
L137:   
        .linenumbertable
            L0 113
            L5 115
            L8 116
            L12 119
            L16 120
            L21 122
            L27 124
            L41 125
            L47 126
            L51 127
            L61 128
            L73 129
            L88 132
            L91 133
            L96 134
            L103 120
            L109 138
            L116 139
            L123 140
            L130 113
            L136 144
        .end linenumbertable
    .end code
.end method

.method static final b : (IIIII)V
    .code stack 4 locals 7
L0:     iload_2
L1:     iload_0
L2:     isub
L3:     istore_2
L4:     iload_3
L5:     iload_1
L6:     isub
L7:     istore_3
L8:     iload_3
L9:     ifne L43
L12:    iload_2
L13:    iflt L29
L16:    iload_0
L17:    iload_1
L18:    iload_2
L19:    iconst_1
L20:    iadd
L21:    iload 4
L23:    invokestatic Method ia b (IIII)V
L26:    goto L42
L29:    iload_0
L30:    iload_2
L31:    iadd
L32:    iload_1
L33:    iload_2
L34:    ineg
L35:    iconst_1
L36:    iadd
L37:    iload 4
L39:    invokestatic Method ia b (IIII)V
L42:    return
L43:    iload_2
L44:    ifne L78
L47:    iload_3
L48:    iflt L64
L51:    iload_0
L52:    iload_1
L53:    iload_3
L54:    iconst_1
L55:    iadd
L56:    iload 4
L58:    invokestatic Method ia a (IIII)V
L61:    goto L77
L64:    iload_0
L65:    iload_1
L66:    iload_3
L67:    iadd
L68:    iload_3
L69:    ineg
L70:    iconst_1
L71:    iadd
L72:    iload 4
L74:    invokestatic Method ia a (IIII)V
L77:    return
L78:    iload_2
L79:    iload_3
L80:    iadd
L81:    ifge L98
L84:    iload_0
L85:    iload_2
L86:    iadd
L87:    istore_0
L88:    iload_2
L89:    ineg
L90:    istore_2
L91:    iload_1
L92:    iload_3
L93:    iadd
L94:    istore_1
L95:    iload_3
L96:    ineg
L97:    istore_3
L98:    iload_2
L99:    iload_3
L100:   if_icmple L227
L103:   iload_1
L104:   bipush 16
L106:   ishl
L107:   istore_1
L108:   iload_1
L109:   ldc 32768
L111:   iadd
L112:   istore_1
L113:   iload_3
L114:   bipush 16
L116:   ishl
L117:   istore_3
L118:   iload_3
L119:   i2d
L120:   iload_2
L121:   i2d
L122:   ddiv
L123:   ldc2_w 5e-1
L126:   dadd
L127:   invokestatic Method java/lang/Math floor (D)D
L130:   d2i
L131:   istore 5
L133:   iload_2
L134:   iload_0
L135:   iadd
L136:   istore_2
L137:   iload_0
L138:   getstatic Field ia i I
L141:   if_icmpge L159
L144:   iload_1
L145:   iload 5
L147:   getstatic Field ia i I
L150:   iload_0
L151:   isub
L152:   imul
L153:   iadd
L154:   istore_1
L155:   getstatic Field ia i I
L158:   istore_0
L159:   iload_2
L160:   getstatic Field ia l I
L163:   if_icmplt L172
L166:   getstatic Field ia l I
L169:   iconst_1
L170:   isub
L171:   istore_2
L172:   iload_0
L173:   iload_2
L174:   if_icmpgt L224
L177:   iload_1
L178:   bipush 16
L180:   ishr
L181:   istore 6
L183:   iload 6
L185:   getstatic Field ia j I
L188:   if_icmplt L213
L191:   iload 6
L193:   getstatic Field ia m I
L196:   if_icmpge L213
L199:   getstatic Field ia o [I
L202:   iload_0
L203:   iload 6
L205:   getstatic Field ia k I
L208:   imul
L209:   iadd
L210:   iload 4
L212:   iastore
L213:   iload_1
L214:   iload 5
L216:   iadd
L217:   istore_1
L218:   iinc 0 1
L221:   goto L172
L224:   goto L348
L227:   iload_0
L228:   bipush 16
L230:   ishl
L231:   istore_0
L232:   iload_0
L233:   ldc 32768
L235:   iadd
L236:   istore_0
L237:   iload_2
L238:   bipush 16
L240:   ishl
L241:   istore_2
L242:   iload_2
L243:   i2d
L244:   iload_3
L245:   i2d
L246:   ddiv
L247:   ldc2_w 5e-1
L250:   dadd
L251:   invokestatic Method java/lang/Math floor (D)D
L254:   d2i
L255:   istore 5
L257:   iload_3
L258:   iload_1
L259:   iadd
L260:   istore_3
L261:   iload_1
L262:   getstatic Field ia j I
L265:   if_icmpge L283
L268:   iload_0
L269:   iload 5
L271:   getstatic Field ia j I
L274:   iload_1
L275:   isub
L276:   imul
L277:   iadd
L278:   istore_0
L279:   getstatic Field ia j I
L282:   istore_1
L283:   iload_3
L284:   getstatic Field ia m I
L287:   if_icmplt L296
L290:   getstatic Field ia m I
L293:   iconst_1
L294:   isub
L295:   istore_3
L296:   iload_1
L297:   iload_3
L298:   if_icmpgt L348
L301:   iload_0
L302:   bipush 16
L304:   ishr
L305:   istore 6
L307:   iload 6
L309:   getstatic Field ia i I
L312:   if_icmplt L337
L315:   iload 6
L317:   getstatic Field ia l I
L320:   if_icmpge L337
L323:   getstatic Field ia o [I
L326:   iload 6
L328:   iload_1
L329:   getstatic Field ia k I
L332:   imul
L333:   iadd
L334:   iload 4
L336:   iastore
L337:   iload_0
L338:   iload 5
L340:   iadd
L341:   istore_0
L342:   iinc 1 1
L345:   goto L296
L348:   return
L349:   
        .linenumbertable
            L0 148
            L4 149
            L8 150
            L12 152
            L16 153
            L29 155
            L42 157
            L43 160
            L47 162
            L51 163
            L64 165
            L77 167
            L78 170
            L84 172
            L88 173
            L91 174
            L95 175
            L98 178
            L103 180
            L108 181
            L113 182
            L118 184
            L133 185
            L137 186
            L144 188
            L155 189
            L159 192
            L166 193
            L172 195
            L177 198
            L183 199
            L199 200
            L213 202
            L218 203
            L221 204
            L224 206
            L227 209
            L232 210
            L237 211
            L242 213
            L257 214
            L261 215
            L268 217
            L279 218
            L283 221
            L290 222
            L296 224
            L301 227
            L307 228
            L323 229
            L337 231
            L342 232
            L345 233
            L348 237
        .end linenumbertable
    .end code
.end method

.method static final c : (IIIII)V
    .code stack 3 locals 9
L0:     iload_0
L1:     getstatic Field ia i I
L4:     if_icmpge L19
L7:     iload_2
L8:     getstatic Field ia i I
L11:    iload_0
L12:    isub
L13:    isub
L14:    istore_2
L15:    getstatic Field ia i I
L18:    istore_0
L19:    iload_1
L20:    getstatic Field ia j I
L23:    if_icmpge L38
L26:    iload_3
L27:    getstatic Field ia j I
L30:    iload_1
L31:    isub
L32:    isub
L33:    istore_3
L34:    getstatic Field ia j I
L37:    istore_1
L38:    iload_0
L39:    iload_2
L40:    iadd
L41:    getstatic Field ia l I
L44:    if_icmple L53
L47:    getstatic Field ia l I
L50:    iload_0
L51:    isub
L52:    istore_2
L53:    iload_1
L54:    iload_3
L55:    iadd
L56:    getstatic Field ia m I
L59:    if_icmple L68
L62:    getstatic Field ia m I
L65:    iload_1
L66:    isub
L67:    istore_3
L68:    getstatic Field ia k I
L71:    iload_2
L72:    isub
L73:    istore 5
L75:    iload_0
L76:    iload_1
L77:    getstatic Field ia k I
L80:    imul
L81:    iadd
L82:    istore 6
L84:    iload_3
L85:    ineg
L86:    istore 7
L88:    iload 7
L90:    ifge L132
L93:    iload_2
L94:    ineg
L95:    istore 8
L97:    iload 8
L99:    ifge L119
L102:   getstatic Field ia o [I
L105:   iload 6
L107:   iinc 6 1
L110:   iload 4
L112:   iastore
L113:   iinc 8 1
L116:   goto L97
L119:   iload 6
L121:   iload 5
L123:   iadd
L124:   istore 6
L126:   iinc 7 1
L129:   goto L88
L132:   return
L133:   
        .linenumbertable
            L0 242
            L7 244
            L15 245
            L19 248
            L26 250
            L34 251
            L38 254
            L47 255
            L53 257
            L62 258
            L68 261
            L75 263
            L84 266
            L88 267
            L93 271
            L97 272
            L102 274
            L113 272
            L119 278
            L126 267
            L132 282
        .end linenumbertable
    .end code
.end method

.method private static final c : (IIII)V
    .code stack 2 locals 4
L0:     iload_0
L1:     ifge L6
L4:     iconst_0
L5:     istore_0
L6:     iload_1
L7:     ifge L12
L10:    iconst_0
L11:    istore_1
L12:    iload_2
L13:    getstatic Field ia k I
L16:    if_icmple L23
L19:    getstatic Field ia k I
L22:    istore_2
L23:    iload_3
L24:    getstatic Field ia n I
L27:    if_icmple L34
L30:    getstatic Field ia n I
L33:    istore_3
L34:    iload_0
L35:    putstatic Field ia i I
L38:    iload_1
L39:    putstatic Field ia j I
L42:    iload_2
L43:    putstatic Field ia l I
L46:    iload_3
L47:    putstatic Field ia m I
L50:    return
L51:    
        .linenumbertable
            L0 292
            L4 293
            L6 295
            L10 296
            L12 298
            L19 299
            L23 301
            L30 302
            L34 304
            L38 305
            L42 306
            L46 307
            L50 308
        .end linenumbertable
    .end code
.end method

.method static final a : (IIII[I)V
    .code stack 19 locals 24
L0:     iload_2
L1:     iload_2
L2:     imul
L3:     istore 5
L5:     iload_0
L6:     iload_2
L7:     isub
L8:     iconst_4
L9:     ishr
L10:    istore 6
L12:    iload_0
L13:    iload_2
L14:    iadd
L15:    bipush 15
L17:    iadd
L18:    iconst_4
L19:    ishr
L20:    istore 7
L22:    iload_1
L23:    iload_2
L24:    isub
L25:    iconst_4
L26:    ishr
L27:    istore 8
L29:    iload_1
L30:    iload_2
L31:    iadd
L32:    bipush 15
L34:    iadd
L35:    iconst_4
L36:    ishr
L37:    istore 9
L39:    iload 6
L41:    getstatic Field ia i I
L44:    if_icmpge L52
L47:    getstatic Field ia i I
L50:    istore 6
L52:    iload 7
L54:    getstatic Field ia l I
L57:    if_icmple L65
L60:    getstatic Field ia l I
L63:    istore 7
L65:    iload 8
L67:    getstatic Field ia j I
L70:    if_icmpge L78
L73:    getstatic Field ia j I
L76:    istore 8
L78:    iload 9
L80:    getstatic Field ia m I
L83:    if_icmple L91
L86:    getstatic Field ia m I
L89:    istore 9
L91:    iload 6
L93:    iconst_4
L94:    ishl
L95:    iload_0
L96:    isub
L97:    istore 10
L99:    iload 10
L101:   iload 10
L103:   imul
L104:   istore 10
L106:   iload 6
L108:   iconst_1
L109:   iadd
L110:   iconst_4
L111:   ishl
L112:   iload_0
L113:   isub
L114:   istore 11
L116:   iload 11
L118:   iload 11
L120:   imul
L121:   istore 11
L123:   iload 6
L125:   iconst_2
L126:   iadd
L127:   iconst_4
L128:   ishl
L129:   iload_0
L130:   isub
L131:   istore 12
L133:   iload 12
L135:   iload 12
L137:   imul
L138:   istore 12
L140:   iload 11
L142:   iload 10
L144:   isub
L145:   istore 13
L147:   iload 12
L149:   iload 11
L151:   isub
L152:   istore 14
L154:   iload 14
L156:   iload 13
L158:   isub
L159:   istore 15
L161:   iload 8
L163:   iconst_4
L164:   ishl
L165:   iload_1
L166:   isub
L167:   istore 16
L169:   iload 16
L171:   iload 16
L173:   imul
L174:   istore 16
L176:   iload 8
L178:   iconst_1
L179:   iadd
L180:   iconst_4
L181:   ishl
L182:   iload_1
L183:   isub
L184:   istore 17
L186:   iload 17
L188:   iload 17
L190:   imul
L191:   istore 17
L193:   iload 8
L195:   iconst_2
L196:   iadd
L197:   iconst_4
L198:   ishl
L199:   iload_1
L200:   isub
L201:   istore 18
L203:   iload 18
L205:   iload 18
L207:   imul
L208:   istore 18
L210:   iload 17
L212:   iload 16
L214:   isub
L215:   istore 19
L217:   iload 18
L219:   iload 17
L221:   isub
L222:   istore 20
L224:   iload 20
L226:   iload 19
L228:   isub
L229:   istore 21
L231:   iload 6
L233:   iload 8
L235:   getstatic Field ia k I
L238:   imul
L239:   iadd
L240:   istore 22
L242:   getstatic Field ia k I
L245:   iload 6
L247:   iadd
L248:   iload 7
L250:   isub
L251:   istore 23
L253:   iconst_0
L254:   iconst_0
L255:   iconst_0
L256:   iconst_0
L257:   iconst_0
L258:   iload 15
L260:   iload 5
L262:   iload 22
L264:   getstatic Field ia o [I
L267:   iload_3
L268:   aload 4
L270:   iload 23
L272:   iload 13
L274:   iload 6
L276:   iload 7
L278:   isub
L279:   iload 16
L281:   iload 10
L283:   iadd
L284:   iload 19
L286:   iload 21
L288:   iload 8
L290:   iload 9
L292:   isub
L293:   invokestatic Method ia a (IIIIIIII[II[IIIIIIII)V
L296:   return
L297:   
        .linenumbertable
            L0 315
            L5 317
            L12 319
            L22 321
            L29 323
            L39 324
            L47 325
            L52 327
            L60 328
            L65 330
            L73 331
            L78 333
            L86 334
            L91 337
            L99 338
            L106 340
            L116 341
            L123 343
            L133 344
            L140 346
            L147 348
            L154 350
            L161 352
            L169 353
            L176 355
            L186 356
            L193 358
            L203 359
            L210 361
            L217 363
            L224 365
            L231 367
            L242 369
            L253 370
            L296 371
        .end linenumbertable
    .end code
.end method

.method static final a : (IIIIII)V
    .code stack 4 locals 12
L0:     iload_0
L1:     getstatic Field ia i I
L4:     if_icmpge L19
L7:     iload_2
L8:     getstatic Field ia i I
L11:    iload_0
L12:    isub
L13:    isub
L14:    istore_2
L15:    getstatic Field ia i I
L18:    istore_0
L19:    iload_1
L20:    getstatic Field ia j I
L23:    if_icmpge L38
L26:    iload_3
L27:    getstatic Field ia j I
L30:    iload_1
L31:    isub
L32:    isub
L33:    istore_3
L34:    getstatic Field ia j I
L37:    istore_1
L38:    iload_0
L39:    iload_2
L40:    iadd
L41:    getstatic Field ia l I
L44:    if_icmple L53
L47:    getstatic Field ia l I
L50:    iload_0
L51:    isub
L52:    istore_2
L53:    iload_1
L54:    iload_3
L55:    iadd
L56:    getstatic Field ia m I
L59:    if_icmple L68
L62:    getstatic Field ia m I
L65:    iload_1
L66:    isub
L67:    istore_3
L68:    iload 4
L70:    ldc 16711935
L72:    iand
L73:    iload 5
L75:    imul
L76:    bipush 8
L78:    ishr
L79:    ldc 16711935
L81:    iand
L82:    iload 4
L84:    ldc 65280
L86:    iand
L87:    iload 5
L89:    imul
L90:    bipush 8
L92:    ishr
L93:    ldc 65280
L95:    iand
L96:    iadd
L97:    istore 4
L99:    sipush 256
L102:   iload 5
L104:   isub
L105:   istore 6
L107:   getstatic Field ia k I
L110:   iload_2
L111:   isub
L112:   istore 7
L114:   iload_0
L115:   iload_1
L116:   getstatic Field ia k I
L119:   imul
L120:   iadd
L121:   istore 8
L123:   iconst_0
L124:   istore 9
L126:   iload 9
L128:   iload_3
L129:   if_icmpge L213
L132:   iload_2
L133:   ineg
L134:   istore 10
L136:   iload 10
L138:   ifge L200
L141:   getstatic Field ia o [I
L144:   iload 8
L146:   iaload
L147:   istore 11
L149:   iload 11
L151:   ldc 16711935
L153:   iand
L154:   iload 6
L156:   imul
L157:   bipush 8
L159:   ishr
L160:   ldc 16711935
L162:   iand
L163:   iload 11
L165:   ldc 65280
L167:   iand
L168:   iload 6
L170:   imul
L171:   bipush 8
L173:   ishr
L174:   ldc 65280
L176:   iand
L177:   iadd
L178:   istore 11
L180:   getstatic Field ia o [I
L183:   iload 8
L185:   iinc 8 1
L188:   iload 4
L190:   iload 11
L192:   iadd
L193:   iastore
L194:   iinc 10 1
L197:   goto L136
L200:   iload 8
L202:   iload 7
L204:   iadd
L205:   istore 8
L207:   iinc 9 1
L210:   goto L126
L213:   return
L214:   
        .linenumbertable
            L0 376
            L7 378
            L15 379
            L19 382
            L26 384
            L34 385
            L38 388
            L47 389
            L53 391
            L62 392
            L68 394
            L99 396
            L107 398
            L114 400
            L123 403
            L126 404
            L132 408
            L136 409
            L141 412
            L149 413
            L180 414
            L194 409
            L200 418
            L207 404
            L213 422
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     iconst_0
L1:     putstatic Field ia i I
L4:     iconst_0
L5:     putstatic Field ia j I
L8:     iconst_0
L9:     putstatic Field ia m I
L12:    iconst_0
L13:    putstatic Field ia l I
L16:    return
L17:    
        .linenumbertable
            L0 94
            L4 107
            L8 285
            L12 310
            L16 311
        .end linenumbertable
    .end code
.end method
.sourcefile "ia.java"
.end class
