.version 45 3
.class final super t
.super java/lang/Object
.field static a I

.method static final synchronized a : (Z)J
    .code stack 6 locals 3
        .catch java/lang/RuntimeException from L0 to L50 using L51
L0:     iload_0
L1:     iconst_1
L2:     if_icmpeq L15
L5:     bipush -29
L7:     aconst_null
L8:     checkcast [B
L11:    invokestatic Method t a (I[B)[B
L14:    pop
L15:    invokestatic Method java/lang/System currentTimeMillis ()J
L18:    lstore_1
L19:    getstatic Field b a J
L22:    lload_1
L23:    lcmp
L24:    ifle L40
L27:    getstatic Field ea p J
L30:    getstatic Field b a J
L33:    lload_1
L34:    lneg
L35:    ladd
L36:    ladd
L37:    putstatic Field ea p J
L40:    lload_1
L41:    putstatic Field b a J
L44:    lload_1
L45:    getstatic Field ea p J
L48:    lneg
L49:    lsub
L50:    lreturn
L51:    astore_1
L52:    aload_1
L53:    new java/lang/StringBuffer
L56:    dup
L57:    invokespecial Method java/lang/StringBuffer <init> ()V
L60:    ldc "t.C("
L62:    invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L65:    iload_0
L66:    invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L69:    bipush 41
L71:    invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L74:    invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L77:    invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L80:    athrow
L81:    
        .linenumbertable
            L0 8
            L5 9
            L15 12
            L19 13
            L27 17
            L40 20
            L44 21
            L51 22
            L52 23
        .end linenumbertable
    .end code
.end method

.method static final a : (II)V
    .code stack 11 locals 13
L0:     getstatic Field loginapplet o I
L3:     istore 12
        .catch java/lang/RuntimeException from L5 to L323 using L326
L5:     iconst_0
L6:     istore_2
L7:     iload_2
L8:     iconst_m1
L9:     ixor
L10:    bipush -3
L12:    if_icmple L313
L15:    iload_2
L16:    bipush 100
L18:    imul
L19:    bipush -40
L21:    iadd
L22:    istore_3
L23:    iconst_0
L24:    istore 4
L26:    iload 4
L28:    iconst_m1
L29:    ixor
L30:    bipush -5
L32:    if_icmple L305
L35:    iconst_5
L36:    iload 4
L38:    imul
L39:    iconst_4
L40:    iload_2
L41:    iconst_1
L42:    iadd
L43:    imul
L44:    iadd
L45:    istore 7
L47:    iload 4
L49:    iconst_5
L50:    imul
L51:    bipush 7
L53:    iload_2
L54:    imul
L55:    bipush 7
L57:    iadd
L58:    iadd
L59:    istore 5
L61:    bipush 6
L63:    iload_2
L64:    imul
L65:    bipush -6
L67:    iload 4
L69:    iconst_5
L70:    imul
L71:    isub
L72:    isub
L73:    istore 6
L75:    iload_3
L76:    ldc2_w 5e-1
L79:    iload 5
L81:    i2d
L82:    iload_0
L83:    i2d
L84:    getstatic Field ca b [[D
L87:    iload_2
L88:    aaload
L89:    iconst_0
L90:    daload
L91:    dmul
L92:    invokestatic Method java/lang/Math sin (D)D
L95:    dmul
L96:    iload_0
L97:    i2d
L98:    getstatic Field e h [[D
L101:   iload_2
L102:   aaload
L103:   iconst_0
L104:   daload
L105:   dmul
L106:   invokestatic Method java/lang/Math sin (D)D
L109:   iload 6
L111:   i2d
L112:   dmul
L113:   dadd
L114:   getstatic Field p m [[D
L117:   iload_2
L118:   aaload
L119:   iconst_0
L120:   daload
L121:   iload_0
L122:   i2d
L123:   dmul
L124:   invokestatic Method java/lang/Math sin (D)D
L127:   iload 7
L129:   i2d
L130:   dmul
L131:   dadd
L132:   dadd
L133:   d2i
L134:   iadd
L135:   bipush 100
L137:   iadd
L138:   istore 8
L140:   iconst_0
L141:   istore 10
L143:   iload 8
L145:   istore 9
L147:   iconst_1
L148:   istore 11
L150:   iload 11
L152:   iconst_m1
L153:   ixor
L154:   sipush -401
L157:   if_icmple L294
L160:   iload 5
L162:   i2d
L163:   getstatic Field ca b [[D
L166:   iload_2
L167:   aaload
L168:   iconst_1
L169:   daload
L170:   iload 11
L172:   i2d
L173:   dmul
L174:   iload_0
L175:   i2d
L176:   getstatic Field ca b [[D
L179:   iload_2
L180:   aaload
L181:   iconst_0
L182:   daload
L183:   dmul
L184:   dadd
L185:   invokestatic Method java/lang/Math sin (D)D
L188:   dmul
L189:   iload 6
L191:   i2d
L192:   iload 11
L194:   i2d
L195:   getstatic Field e h [[D
L198:   iload_2
L199:   aaload
L200:   iconst_1
L201:   daload
L202:   dmul
L203:   iload_0
L204:   i2d
L205:   getstatic Field e h [[D
L208:   iload_2
L209:   aaload
L210:   iconst_0
L211:   daload
L212:   dmul
L213:   dadd
L214:   invokestatic Method java/lang/Math sin (D)D
L217:   dmul
L218:   dadd
L219:   getstatic Field p m [[D
L222:   iload_2
L223:   aaload
L224:   iconst_0
L225:   daload
L226:   iload_0
L227:   i2d
L228:   dmul
L229:   getstatic Field p m [[D
L232:   iload_2
L233:   aaload
L234:   iconst_1
L235:   daload
L236:   iload 11
L238:   i2d
L239:   dmul
L240:   dadd
L241:   invokestatic Method java/lang/Math sin (D)D
L244:   iload 7
L246:   i2d
L247:   dmul
L248:   dadd
L249:   ldc2_w 5e-1
L252:   dadd
L253:   d2i
L254:   bipush 100
L256:   iload_3
L257:   iadd
L258:   iadd
L259:   istore 8
L261:   iload 10
L263:   iload 9
L265:   iload 11
L267:   iload 8
L269:   sipush -12118
L272:   invokestatic Method ha d (I)I
L275:   invokestatic Method ia b (IIIII)V
L278:   iload 11
L280:   istore 10
L282:   iload 8
L284:   istore 9
L286:   iinc 11 1
L289:   iload 12
L291:   ifeq L150
L294:   iconst_0
L295:   istore 10
L297:   iinc 4 1
L300:   iload 12
L302:   ifeq L26
L305:   iinc 2 1
L308:   iload 12
L310:   ifeq L7
L313:   iload_1
L314:   bipush -119
L316:   if_icmplt L323
L319:   iconst_5
L320:   putstatic Field t a I
L323:   goto L365
L326:   astore_2
L327:   aload_2
L328:   new java/lang/StringBuffer
L331:   dup
L332:   invokespecial Method java/lang/StringBuffer <init> ()V
L335:   ldc "t.D("
L337:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L340:   iload_0
L341:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L344:   bipush 44
L346:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L349:   iload_1
L350:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L353:   bipush 41
L355:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L358:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L361:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L364:   athrow
L365:   return
L366:   
        .linenumbertable
            L5 33
            L7 34
            L15 37
            L23 40
            L26 41
            L35 46
            L47 47
            L61 48
            L75 50
            L140 53
            L143 54
            L147 57
            L150 58
            L160 60
            L261 61
            L278 62
            L282 63
            L286 58
            L294 67
            L297 41
            L305 34
            L313 74
            L319 75
            L323 79
            L326 77
            L327 78
            L365 80
        .end linenumbertable
    .end code
.end method

.method static final a : (I)Laa;
    .code stack 6 locals 6
L0:     getstatic Field loginapplet o I
L3:     istore 5
        .catch java/lang/RuntimeException from L5 to L119 using L120
L5:     new aa
L8:     dup
L9:     invokespecial Method aa <init> ()V
L12:    astore_1
L13:    aload_1
L14:    getstatic Field cb b [I
L17:    iload_0
L18:    iaload
L19:    putfield Field aa r I
L22:    aload_1
L23:    getstatic Field o b [I
L26:    iconst_0
L27:    iaload
L28:    putfield Field aa s I
L31:    aload_1
L32:    getstatic Field cb a [I
L35:    iconst_0
L36:    iaload
L37:    putfield Field aa q I
L40:    aload_1
L41:    getstatic Field ea j [I
L44:    iconst_0
L45:    iaload
L46:    putfield Field aa t I
L49:    getstatic Field j a [[B
L52:    iconst_0
L53:    aaload
L54:    astore_3
L55:    aload_1
L56:    getfield Field aa r I
L59:    aload_1
L60:    getfield Field aa t I
L63:    imul
L64:    istore_2
L65:    aload_1
L66:    iload_2
L67:    newarray int
L69:    putfield Field aa p [I
L72:    iconst_0
L73:    istore 4
L75:    iload 4
L77:    iconst_m1
L78:    ixor
L79:    iload_2
L80:    iconst_m1
L81:    ixor
L82:    if_icmple L114
L85:    aload_1
L86:    getfield Field aa p [I
L89:    iload 4
L91:    getstatic Field f v [I
L94:    aload_3
L95:    iload 4
L97:    baload
L98:    sipush 255
L101:   invokestatic Method d a (II)I
L104:   iaload
L105:   iastore
L106:   iinc 4 1
L109:   iload 5
L111:   ifeq L75
L114:   iconst_m1
L115:   invokestatic Method d a (I)V
L118:   aload_1
L119:   areturn
L120:   astore_1
L121:   aload_1
L122:   new java/lang/StringBuffer
L125:   dup
L126:   invokespecial Method java/lang/StringBuffer <init> ()V
L129:   ldc "t.A("
L131:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L134:   iload_0
L135:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L138:   bipush 41
L140:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L143:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L146:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L149:   athrow
L150:   
        .linenumbertable
            L5 103
            L13 104
            L22 106
            L31 107
            L40 108
            L49 110
            L55 111
            L65 112
            L72 115
            L75 116
            L85 117
            L106 116
            L114 120
            L118 121
            L120 122
            L121 123
        .end linenumbertable
    .end code
.end method

.method static final a : (I[B)[B
    .code stack 6 locals 7
        .catch java/lang/RuntimeException from L0 to L20 using L180
L0:     new ea
L3:     dup
L4:     aload_1
L5:     invokespecial Method ea <init> ([B)V
L8:     astore_2
L9:     iload_0
L10:    sipush 3268
L13:    if_icmpeq L21
L16:    aconst_null
L17:    checkcast [B
L20:    areturn
        .catch java/lang/RuntimeException from L21 to L156 using L180
L21:    aload_2
L22:    iconst_0
L23:    invokevirtual Method ea a (Z)I
L26:    istore_3
L27:    aload_2
L28:    iconst_m1
L29:    invokevirtual Method ea d (I)I
L32:    istore 4
L34:    iload 4
L36:    iflt L57
L39:    iconst_0
L40:    getstatic Field ma d I
L43:    if_icmpeq L65
L46:    getstatic Field ma d I
L49:    iload 4
L51:    if_icmplt L57
L54:    goto L65
L57:    new java/lang/RuntimeException
L60:    dup
L61:    invokespecial Method java/lang/RuntimeException <init> ()V
L64:    athrow
L65:    iconst_m1
L66:    iload_3
L67:    iconst_m1
L68:    ixor
L69:    if_icmpeq L157
L72:    aload_2
L73:    iconst_m1
L74:    invokevirtual Method ea d (I)I
L77:    istore 5
L79:    iconst_0
L80:    iload 5
L82:    if_icmpgt L102
L85:    iconst_m1
L86:    getstatic Field ma d I
L89:    iconst_m1
L90:    ixor
L91:    if_icmpeq L110
L94:    iload 5
L96:    getstatic Field ma d I
L99:    if_icmple L110
L102:   new java/lang/RuntimeException
L105:   dup
L106:   invokespecial Method java/lang/RuntimeException <init> ()V
L109:   athrow
L110:   iload 5
L112:   newarray byte
L114:   astore 6
L116:   bipush -2
L118:   iload_3
L119:   iconst_m1
L120:   ixor
L121:   if_icmpeq L141
L124:   getstatic Field ra h Loa;
L127:   bipush 65
L129:   aload_2
L130:   aload 6
L132:   invokevirtual Method oa a (ILea;[B)V
L135:   getstatic Field loginapplet o I
L138:   ifeq L154
L141:   aload 6
L143:   iload 5
L145:   aload_1
L146:   iload 4
L148:   bipush 9
L150:   invokestatic Method n a ([BI[BII)I
L153:   pop
L154:   aload 6
L156:   areturn
        .catch java/lang/RuntimeException from L157 to L179 using L180
L157:   iload 4
L159:   newarray byte
L161:   astore 5
L163:   aload_2
L164:   aload 5
L166:   iload 4
L168:   iload_0
L169:   sipush -3322
L172:   ixor
L173:   iconst_0
L174:   invokevirtual Method ea a ([BIII)V
L177:   aload 5
L179:   areturn
L180:   astore_2
L181:   aload_2
L182:   new java/lang/StringBuffer
L185:   dup
L186:   invokespecial Method java/lang/StringBuffer <init> ()V
L189:   ldc "t.B("
L191:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L194:   iload_0
L195:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L198:   bipush 44
L200:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L203:   aload_1
L204:   ifnull L212
L207:   ldc "{...}"
L209:   goto L214
L212:   ldc "null"
L214:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L217:   bipush 41
L219:   invokevirtual Method java/lang/StringBuffer append (C)Ljava/lang/StringBuffer;
L222:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L225:   invokestatic Method m a (Ljava/lang/Throwable;Ljava/lang/String;)La;
L228:   athrow
L229:   
        .linenumbertable
            L0 135
            L9 138
            L16 139
            L21 141
            L27 142
            L34 143
            L57 147
            L65 151
            L72 154
            L79 155
            L102 158
            L110 163
            L116 164
            L124 165
            L141 167
            L154 169
            L157 174
            L163 175
            L177 176
            L180 179
            L181 180
        .end linenumbertable
    .end code
.end method

.method static <clinit> : ()V
    .code stack 1 locals 0
L0:     bipush 20
L2:     putstatic Field t a I
L5:     return
L6:     
        .linenumbertable
            L0 94
            L5 95
        .end linenumbertable
    .end code
.end method
.sourcefile "t.java"
.end class
