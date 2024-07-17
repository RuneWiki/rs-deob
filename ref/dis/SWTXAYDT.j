.version 45 3
.class final super SWTXAYDT
.super XHHRODPC
.field public m I
.field public n I
.field private o I
.field private p D
.field private q D
.field private r D
.field private s D
.field private t D
.field public u Z
.field public v I
.field public w I
.field public x I
.field public y I
.field private z I
.field public A D
.field public B D
.field public C D
.field public D I
.field public E I
.field public F I
.field private G Z
.field private H LMUDLUUBC;
.field private I I
.field private J I
.field public K I
.field public L I
.field public M I

.method public final a : (IIIIB)V
    .code stack 9 locals 12
        .catch java/lang/RuntimeException from L0 to L225 using L226
L0:     aload_0
L1:     getfield Field SWTXAYDT u Z
L4:     ifne L93
L7:     iload 4
L9:     aload_0
L10:    getfield Field SWTXAYDT v I
L13:    isub
L14:    i2d
L15:    dstore 6
L17:    iload_2
L18:    aload_0
L19:    getfield Field SWTXAYDT w I
L22:    isub
L23:    i2d
L24:    dstore 8
L26:    dload 6
L28:    dload 6
L30:    dmul
L31:    dload 8
L33:    dload 8
L35:    dmul
L36:    dadd
L37:    invokestatic Method java/lang/Math sqrt (D)D
L40:    dstore 10
L42:    aload_0
L43:    aload_0
L44:    getfield Field SWTXAYDT v I
L47:    i2d
L48:    dload 6
L50:    aload_0
L51:    getfield Field SWTXAYDT E I
L54:    i2d
L55:    dmul
L56:    dload 10
L58:    ddiv
L59:    dadd
L60:    putfield Field SWTXAYDT A D
L63:    aload_0
L64:    aload_0
L65:    getfield Field SWTXAYDT w I
L68:    i2d
L69:    dload 8
L71:    aload_0
L72:    getfield Field SWTXAYDT E I
L75:    i2d
L76:    dmul
L77:    dload 10
L79:    ddiv
L80:    dadd
L81:    putfield Field SWTXAYDT B D
L84:    aload_0
L85:    aload_0
L86:    getfield Field SWTXAYDT x I
L89:    i2d
L90:    putfield Field SWTXAYDT C D
L93:    aload_0
L94:    getfield Field SWTXAYDT n I
L97:    iconst_1
L98:    iadd
L99:    iload_1
L100:   isub
L101:   i2d
L102:   dstore 6
L104:   aload_0
L105:   iload 4
L107:   i2d
L108:   aload_0
L109:   getfield Field SWTXAYDT A D
L112:   dsub
L113:   dload 6
L115:   ddiv
L116:   putfield Field SWTXAYDT p D
L119:   iload 5
L121:   bipush -83
L123:   if_icmpeq L127
L126:   return
L127:   aload_0
L128:   iload_2
L129:   i2d
L130:   aload_0
L131:   getfield Field SWTXAYDT B D
L134:   dsub
L135:   dload 6
L137:   ddiv
L138:   putfield Field SWTXAYDT q D
L141:   aload_0
L142:   aload_0
L143:   getfield Field SWTXAYDT p D
L146:   aload_0
L147:   getfield Field SWTXAYDT p D
L150:   dmul
L151:   aload_0
L152:   getfield Field SWTXAYDT q D
L155:   aload_0
L156:   getfield Field SWTXAYDT q D
L159:   dmul
L160:   dadd
L161:   invokestatic Method java/lang/Math sqrt (D)D
L164:   putfield Field SWTXAYDT r D
L167:   aload_0
L168:   getfield Field SWTXAYDT u Z
L171:   ifne L196
L174:   aload_0
L175:   aload_0
L176:   getfield Field SWTXAYDT r D
L179:   dneg
L180:   aload_0
L181:   getfield Field SWTXAYDT D I
L184:   i2d
L185:   ldc2_w 2.454369e-2
L188:   dmul
L189:   invokestatic Method java/lang/Math tan (D)D
L192:   dmul
L193:   putfield Field SWTXAYDT s D
L196:   aload_0
L197:   ldc2_w 2e0
L200:   iload_3
L201:   i2d
L202:   aload_0
L203:   getfield Field SWTXAYDT C D
L206:   dsub
L207:   aload_0
L208:   getfield Field SWTXAYDT s D
L211:   dload 6
L213:   dmul
L214:   dsub
L215:   dmul
L216:   dload 6
L218:   dload 6
L220:   dmul
L221:   ddiv
L222:   putfield Field SWTXAYDT t D
L225:   return
L226:   astore 6
L228:   new java/lang/StringBuffer
L231:   dup
L232:   ldc "48918, "
L234:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L237:   iload_1
L238:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L241:   ldc ", "
L243:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L246:   iload_2
L247:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L250:   ldc ", "
L252:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L255:   iload_3
L256:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L259:   ldc ", "
L261:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L264:   iload 4
L266:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L269:   ldc ", "
L271:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L274:   iload 5
L276:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L279:   ldc ", "
L281:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L284:   aload 6
L286:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L289:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L292:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L295:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L298:   new java/lang/RuntimeException
L301:   dup
L302:   invokespecial Method java/lang/RuntimeException <init> ()V
L305:   athrow
L306:   
    .end code
.end method

.method public final a : (I)LZKARKDQW;
    .code stack 7 locals 5
        .catch java/lang/RuntimeException from L0 to L210 using L210
L0:     aload_0
L1:     getfield Field SWTXAYDT H LMUDLUUBC;
L4:     invokevirtual Method MUDLUUBC a ()LZKARKDQW;
L7:     astore_2
L8:     aload_2
L9:     ifnonnull L14
L12:    aconst_null
L13:    areturn
L14:    iconst_m1
L15:    istore_3
L16:    aload_0
L17:    getfield Field SWTXAYDT H LMUDLUUBC;
L20:    getfield Field MUDLUUBC h LLKGEGIEW;
L23:    ifnull L42
L26:    aload_0
L27:    getfield Field SWTXAYDT H LMUDLUUBC;
L30:    getfield Field MUDLUUBC h LLKGEGIEW;
L33:    getfield Field LKGEGIEW f [I
L36:    aload_0
L37:    getfield Field SWTXAYDT I I
L40:    iaload
L41:    istore_3
L42:    new ZKARKDQW
L45:    dup
L46:    bipush 9
L48:    iconst_1
L49:    iload_3
L50:    iconst_0
L51:    invokestatic Method SQHJOGRT a (IZ)Z
L54:    iconst_0
L55:    aload_2
L56:    invokespecial Method ZKARKDQW <init> (IZZZLZKARKDQW;)V
L59:    astore 4
L61:    iload_3
L62:    iconst_m1
L63:    if_icmpeq L93
L66:    aload 4
L68:    bipush -71
L70:    invokevirtual Method ZKARKDQW a (B)V
L73:    aload 4
L75:    iload_3
L76:    ldc 40542
L78:    invokevirtual Method ZKARKDQW c (II)V
L81:    aload 4
L83:    aconst_null
L84:    putfield Field ZKARKDQW eb [[I
L87:    aload 4
L89:    aconst_null
L90:    putfield Field ZKARKDQW db [[I
L93:    aload_0
L94:    getfield Field SWTXAYDT H LMUDLUUBC;
L97:    getfield Field MUDLUUBC k I
L100:   sipush 128
L103:   if_icmpne L119
L106:   aload_0
L107:   getfield Field SWTXAYDT H LMUDLUUBC;
L110:   getfield Field MUDLUUBC l I
L113:   sipush 128
L116:   if_icmpeq L149
L119:   aload 4
L121:   aload_0
L122:   getfield Field SWTXAYDT H LMUDLUUBC;
L125:   getfield Field MUDLUUBC k I
L128:   aload_0
L129:   getfield Field SWTXAYDT H LMUDLUUBC;
L132:   getfield Field MUDLUUBC k I
L135:   aload_0
L136:   getfield Field SWTXAYDT o I
L139:   aload_0
L140:   getfield Field SWTXAYDT H LMUDLUUBC;
L143:   getfield Field MUDLUUBC l I
L146:   invokevirtual Method ZKARKDQW b (IIII)V
L149:   aload 4
L151:   aload_0
L152:   getfield Field SWTXAYDT L I
L155:   iconst_1
L156:   invokevirtual Method ZKARKDQW d (II)V
L159:   aload 4
L161:   bipush 64
L163:   aload_0
L164:   getfield Field SWTXAYDT H LMUDLUUBC;
L167:   getfield Field MUDLUUBC n I
L170:   iadd
L171:   sipush 850
L174:   aload_0
L175:   getfield Field SWTXAYDT H LMUDLUUBC;
L178:   getfield Field MUDLUUBC o I
L181:   iadd
L182:   bipush -30
L184:   bipush -50
L186:   bipush -30
L188:   iconst_1
L189:   invokevirtual Method ZKARKDQW a (IIIIIZ)V
L192:   iload_1
L193:   sipush 4016
L196:   if_icmpeq L207
L199:   new java/lang/NullPointerException
L202:   dup
L203:   invokespecial Method java/lang/NullPointerException <init> ()V
L206:   athrow
L207:   aload 4
L209:   areturn
L210:   astore_2
L211:   new java/lang/StringBuffer
L214:   dup
L215:   ldc "73693, "
L217:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L220:   iload_1
L221:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L224:   ldc ", "
L226:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L229:   aload_2
L230:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L233:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L236:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L239:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L242:   new java/lang/RuntimeException
L245:   dup
L246:   invokespecial Method java/lang/RuntimeException <init> ()V
L249:   athrow
L250:   
    .end code
.end method

.method public <init> : (IIIIIIIIIIII)V
    .code stack 3 locals 14
L0:     aload_0
L1:     invokespecial Method XHHRODPC <init> ()V
L4:     aload_0
L5:     bipush 9
L7:     putfield Field SWTXAYDT o I
L10:    aload_0
L11:    iconst_0
L12:    putfield Field SWTXAYDT u Z
L15:    aload_0
L16:    iconst_1
L17:    putfield Field SWTXAYDT G Z
        .catch java/lang/RuntimeException from L20 to L115 using L116
L20:    aload_0
L21:    getstatic Field MUDLUUBC d [LMUDLUUBC;
L24:    iload 12
L26:    aaload
L27:    putfield Field SWTXAYDT H LMUDLUUBC;
L30:    iload_3
L31:    ldc 46883
L33:    if_icmpeq L52
L36:    aload_0
L37:    aload_0
L38:    getfield Field SWTXAYDT G Z
L41:    ifeq L48
L44:    iconst_0
L45:    goto L49
L48:    iconst_1
L49:    putfield Field SWTXAYDT G Z
L52:    aload_0
L53:    iload 7
L55:    putfield Field SWTXAYDT M I
L58:    aload_0
L59:    iload 10
L61:    putfield Field SWTXAYDT v I
L64:    aload_0
L65:    iload 9
L67:    putfield Field SWTXAYDT w I
L70:    aload_0
L71:    iload 8
L73:    putfield Field SWTXAYDT x I
L76:    aload_0
L77:    iload 4
L79:    putfield Field SWTXAYDT m I
L82:    aload_0
L83:    iload 5
L85:    putfield Field SWTXAYDT n I
L88:    aload_0
L89:    iload_1
L90:    putfield Field SWTXAYDT D I
L93:    aload_0
L94:    iload 6
L96:    putfield Field SWTXAYDT E I
L99:    aload_0
L100:   iload 11
L102:   putfield Field SWTXAYDT F I
L105:   aload_0
L106:   iload_2
L107:   putfield Field SWTXAYDT y I
L110:   aload_0
L111:   iconst_0
L112:   putfield Field SWTXAYDT u Z
L115:   return
L116:   astore 13
L118:   new java/lang/StringBuffer
L121:   dup
L122:   ldc "59291, "
L124:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L127:   iload_1
L128:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L131:   ldc ", "
L133:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L136:   iload_2
L137:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L140:   ldc ", "
L142:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L145:   iload_3
L146:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L149:   ldc ", "
L151:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L154:   iload 4
L156:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L159:   ldc ", "
L161:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L164:   iload 5
L166:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L169:   ldc ", "
L171:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L174:   iload 6
L176:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L179:   ldc ", "
L181:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L184:   iload 7
L186:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L189:   ldc ", "
L191:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L194:   iload 8
L196:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L199:   ldc ", "
L201:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L204:   iload 9
L206:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L209:   ldc ", "
L211:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L214:   iload 10
L216:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L219:   ldc ", "
L221:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L224:   iload 11
L226:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L229:   ldc ", "
L231:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L234:   iload 12
L236:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L239:   ldc ", "
L241:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L244:   aload 13
L246:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L249:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L252:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L255:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L258:   new java/lang/RuntimeException
L261:   dup
L262:   invokespecial Method java/lang/RuntimeException <init> ()V
L265:   athrow
L266:   
    .end code
.end method

.method public final a : (II)V
    .code stack 10 locals 4
        .catch java/lang/RuntimeException from L0 to L254 using L255
L0:     aload_0
L1:     iconst_1
L2:     putfield Field SWTXAYDT u Z
L5:     aload_0
L6:     dup
L7:     getfield Field SWTXAYDT A D
L10:    aload_0
L11:    getfield Field SWTXAYDT p D
L14:    iload_1
L15:    i2d
L16:    dmul
L17:    dadd
L18:    putfield Field SWTXAYDT A D
L21:    aload_0
L22:    dup
L23:    getfield Field SWTXAYDT B D
L26:    aload_0
L27:    getfield Field SWTXAYDT q D
L30:    iload_1
L31:    i2d
L32:    dmul
L33:    dadd
L34:    putfield Field SWTXAYDT B D
L37:    aload_0
L38:    dup
L39:    getfield Field SWTXAYDT C D
L42:    aload_0
L43:    getfield Field SWTXAYDT s D
L46:    iload_1
L47:    i2d
L48:    dmul
L49:    ldc2_w 5e-1
L52:    aload_0
L53:    getfield Field SWTXAYDT t D
L56:    dmul
L57:    iload_1
L58:    i2d
L59:    dmul
L60:    iload_1
L61:    i2d
L62:    dmul
L63:    dadd
L64:    dadd
L65:    putfield Field SWTXAYDT C D
L68:    aload_0
L69:    dup
L70:    getfield Field SWTXAYDT s D
L73:    aload_0
L74:    getfield Field SWTXAYDT t D
L77:    iload_1
L78:    i2d
L79:    dmul
L80:    dadd
L81:    putfield Field SWTXAYDT s D
L84:    iload_2
L85:    ifeq L94
L88:    aload_0
L89:    bipush 16
L91:    putfield Field SWTXAYDT z I
L94:    aload_0
L95:    aload_0
L96:    getfield Field SWTXAYDT p D
L99:    aload_0
L100:   getfield Field SWTXAYDT q D
L103:   invokestatic Method java/lang/Math atan2 (DD)D
L106:   ldc2_w 3.25949e2
L109:   dmul
L110:   d2i
L111:   sipush 1024
L114:   iadd
L115:   sipush 2047
L118:   iand
L119:   putfield Field SWTXAYDT K I
L122:   aload_0
L123:   aload_0
L124:   getfield Field SWTXAYDT s D
L127:   aload_0
L128:   getfield Field SWTXAYDT r D
L131:   invokestatic Method java/lang/Math atan2 (DD)D
L134:   ldc2_w 3.25949e2
L137:   dmul
L138:   d2i
L139:   sipush 2047
L142:   iand
L143:   putfield Field SWTXAYDT L I
L146:   aload_0
L147:   getfield Field SWTXAYDT H LMUDLUUBC;
L150:   getfield Field MUDLUUBC h LLKGEGIEW;
L153:   ifnull L304
L156:   aload_0
L157:   dup
L158:   getfield Field SWTXAYDT J I
L161:   iload_1
L162:   iadd
L163:   putfield Field SWTXAYDT J I
L166:   getstatic Field client Jj I
L169:   ifeq L231
L172:   aload_0
L173:   dup
L174:   getfield Field SWTXAYDT J I
L177:   aload_0
L178:   getfield Field SWTXAYDT H LMUDLUUBC;
L181:   getfield Field MUDLUUBC h LLKGEGIEW;
L184:   aload_0
L185:   getfield Field SWTXAYDT I I
L188:   bipush -39
L190:   invokevirtual Method LKGEGIEW a (IB)I
L193:   iconst_1
L194:   iadd
L195:   isub
L196:   putfield Field SWTXAYDT J I
L199:   aload_0
L200:   dup
L201:   getfield Field SWTXAYDT I I
L204:   iconst_1
L205:   iadd
L206:   putfield Field SWTXAYDT I I
L209:   aload_0
L210:   getfield Field SWTXAYDT I I
L213:   aload_0
L214:   getfield Field SWTXAYDT H LMUDLUUBC;
L217:   getfield Field MUDLUUBC h LLKGEGIEW;
L220:   getfield Field LKGEGIEW e I
L223:   if_icmplt L231
L226:   aload_0
L227:   iconst_0
L228:   putfield Field SWTXAYDT I I
L231:   aload_0
L232:   getfield Field SWTXAYDT J I
L235:   aload_0
L236:   getfield Field SWTXAYDT H LMUDLUUBC;
L239:   getfield Field MUDLUUBC h LLKGEGIEW;
L242:   aload_0
L243:   getfield Field SWTXAYDT I I
L246:   bipush -39
L248:   invokevirtual Method LKGEGIEW a (IB)I
L251:   if_icmpgt L172
L254:   return
L255:   astore_3
L256:   new java/lang/StringBuffer
L259:   dup
L260:   ldc "76529, "
L262:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L265:   iload_1
L266:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L269:   ldc ", "
L271:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L274:   iload_2
L275:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L278:   ldc ", "
L280:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L283:   aload_3
L284:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L287:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L290:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L293:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L296:   new java/lang/RuntimeException
L299:   dup
L300:   invokespecial Method java/lang/RuntimeException <init> ()V
L303:   athrow
L304:   return
L305:   
    .end code
.end method
.end class
