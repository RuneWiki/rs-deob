.version 45 3
.class final super va
.super java/lang/Object

.method static final a : ([BI[BII)V
    .code stack 4 locals 5
L0:     aload_0
L1:     aload_2
L2:     if_acmpne L176
L5:     iload_1
L6:     iload_3
L7:     if_icmpne L11
L10:    return
L11:    iload_3
L12:    iload_1
L13:    if_icmple L176
L16:    iload_3
L17:    iload_1
L18:    iload 4
L20:    iadd
L21:    if_icmpge L176
L24:    iinc 4 -1
L27:    iload_1
L28:    iload 4
L30:    iadd
L31:    istore_1
L32:    iload_3
L33:    iload 4
L35:    iadd
L36:    istore_3
L37:    iload_1
L38:    iload 4
L40:    isub
L41:    istore 4
L43:    iinc 4 7
L46:    iload_1
L47:    iload 4
L49:    if_icmplt L151
L52:    aload_2
L53:    iload_3
L54:    iinc 3 -1
L57:    aload_0
L58:    iload_1
L59:    iinc 1 -1
L62:    baload
L63:    bastore
L64:    aload_2
L65:    iload_3
L66:    iinc 3 -1
L69:    aload_0
L70:    iload_1
L71:    iinc 1 -1
L74:    baload
L75:    bastore
L76:    aload_2
L77:    iload_3
L78:    iinc 3 -1
L81:    aload_0
L82:    iload_1
L83:    iinc 1 -1
L86:    baload
L87:    bastore
L88:    aload_2
L89:    iload_3
L90:    iinc 3 -1
L93:    aload_0
L94:    iload_1
L95:    iinc 1 -1
L98:    baload
L99:    bastore
L100:   aload_2
L101:   iload_3
L102:   iinc 3 -1
L105:   aload_0
L106:   iload_1
L107:   iinc 1 -1
L110:   baload
L111:   bastore
L112:   aload_2
L113:   iload_3
L114:   iinc 3 -1
L117:   aload_0
L118:   iload_1
L119:   iinc 1 -1
L122:   baload
L123:   bastore
L124:   aload_2
L125:   iload_3
L126:   iinc 3 -1
L129:   aload_0
L130:   iload_1
L131:   iinc 1 -1
L134:   baload
L135:   bastore
L136:   aload_2
L137:   iload_3
L138:   iinc 3 -1
L141:   aload_0
L142:   iload_1
L143:   iinc 1 -1
L146:   baload
L147:   bastore
L148:   goto L46
L151:   iinc 4 -7
L154:   iload_1
L155:   iload 4
L157:   if_icmplt L175
L160:   aload_2
L161:   iload_3
L162:   iinc 3 -1
L165:   aload_0
L166:   iload_1
L167:   iinc 1 -1
L170:   baload
L171:   bastore
L172:   goto L154
L175:   return
L176:   iload 4
L178:   iload_1
L179:   iadd
L180:   istore 4
L182:   iinc 4 -7
L185:   iload_1
L186:   iload 4
L188:   if_icmpge L290
L191:   aload_2
L192:   iload_3
L193:   iinc 3 1
L196:   aload_0
L197:   iload_1
L198:   iinc 1 1
L201:   baload
L202:   bastore
L203:   aload_2
L204:   iload_3
L205:   iinc 3 1
L208:   aload_0
L209:   iload_1
L210:   iinc 1 1
L213:   baload
L214:   bastore
L215:   aload_2
L216:   iload_3
L217:   iinc 3 1
L220:   aload_0
L221:   iload_1
L222:   iinc 1 1
L225:   baload
L226:   bastore
L227:   aload_2
L228:   iload_3
L229:   iinc 3 1
L232:   aload_0
L233:   iload_1
L234:   iinc 1 1
L237:   baload
L238:   bastore
L239:   aload_2
L240:   iload_3
L241:   iinc 3 1
L244:   aload_0
L245:   iload_1
L246:   iinc 1 1
L249:   baload
L250:   bastore
L251:   aload_2
L252:   iload_3
L253:   iinc 3 1
L256:   aload_0
L257:   iload_1
L258:   iinc 1 1
L261:   baload
L262:   bastore
L263:   aload_2
L264:   iload_3
L265:   iinc 3 1
L268:   aload_0
L269:   iload_1
L270:   iinc 1 1
L273:   baload
L274:   bastore
L275:   aload_2
L276:   iload_3
L277:   iinc 3 1
L280:   aload_0
L281:   iload_1
L282:   iinc 1 1
L285:   baload
L286:   bastore
L287:   goto L185
L290:   iinc 4 7
L293:   iload_1
L294:   iload 4
L296:   if_icmpge L314
L299:   aload_2
L300:   iload_3
L301:   iinc 3 1
L304:   aload_0
L305:   iload_1
L306:   iinc 1 1
L309:   baload
L310:   bastore
L311:   goto L293
L314:   return
L315:   
        .linenumbertable
            L0 15
            L5 17
            L10 18
            L11 20
            L24 22
            L27 23
            L32 24
            L37 25
            L43 26
            L46 27
            L52 29
            L64 30
            L76 31
            L88 32
            L100 33
            L112 34
            L124 35
            L136 36
            L151 39
            L154 40
            L160 41
            L175 43
            L176 48
            L182 49
            L185 50
            L191 52
            L203 53
            L215 54
            L227 55
            L239 56
            L251 57
            L263 58
            L275 59
            L290 62
            L293 63
            L299 64
            L314 66
        .end linenumbertable
    .end code
.end method
.sourcefile "va.java"
.end class
