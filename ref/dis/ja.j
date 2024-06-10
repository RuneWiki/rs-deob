.version 45 3
.class final super ja
.super ia
.field private p [B
.field private q I
.field private r I
.field s I
.field t I
.field private u I
.field private v I
.field private w [I

.method final a : (II)V
    .code stack 9 locals 10
L0:     iload_1
L1:     aload_0
L2:     getfield Field ja q I
L5:     iadd
L6:     istore_1
L7:     iload_2
L8:     aload_0
L9:     getfield Field ja v I
L12:    iadd
L13:    istore_2
L14:    iload_1
L15:    iload_2
L16:    getstatic Field ia k I
L19:    imul
L20:    iadd
L21:    istore_3
L22:    iconst_0
L23:    istore 4
L25:    aload_0
L26:    getfield Field ja r I
L29:    istore 5
L31:    aload_0
L32:    getfield Field ja u I
L35:    istore 6
L37:    getstatic Field ia k I
L40:    iload 6
L42:    isub
L43:    istore 7
L45:    iconst_0
L46:    istore 8
L48:    iload_2
L49:    getstatic Field ia j I
L52:    if_icmpge L92
L55:    getstatic Field ia j I
L58:    iload_2
L59:    isub
L60:    istore 9
L62:    iload 5
L64:    iload 9
L66:    isub
L67:    istore 5
L69:    getstatic Field ia j I
L72:    istore_2
L73:    iload 4
L75:    iload 9
L77:    iload 6
L79:    imul
L80:    iadd
L81:    istore 4
L83:    iload_3
L84:    iload 9
L86:    getstatic Field ia k I
L89:    imul
L90:    iadd
L91:    istore_3
L92:    iload_2
L93:    iload 5
L95:    iadd
L96:    getstatic Field ia m I
L99:    if_icmple L115
L102:   iload 5
L104:   iload_2
L105:   iload 5
L107:   iadd
L108:   getstatic Field ia m I
L111:   isub
L112:   isub
L113:   istore 5
L115:   iload_1
L116:   getstatic Field ia i I
L119:   if_icmpge L166
L122:   getstatic Field ia i I
L125:   iload_1
L126:   isub
L127:   istore 9
L129:   iload 6
L131:   iload 9
L133:   isub
L134:   istore 6
L136:   getstatic Field ia i I
L139:   istore_1
L140:   iload 4
L142:   iload 9
L144:   iadd
L145:   istore 4
L147:   iload_3
L148:   iload 9
L150:   iadd
L151:   istore_3
L152:   iload 8
L154:   iload 9
L156:   iadd
L157:   istore 8
L159:   iload 7
L161:   iload 9
L163:   iadd
L164:   istore 7
L166:   iload_1
L167:   iload 6
L169:   iadd
L170:   getstatic Field ia l I
L173:   if_icmple L207
L176:   iload_1
L177:   iload 6
L179:   iadd
L180:   getstatic Field ia l I
L183:   isub
L184:   istore 9
L186:   iload 6
L188:   iload 9
L190:   isub
L191:   istore 6
L193:   iload 8
L195:   iload 9
L197:   iadd
L198:   istore 8
L200:   iload 7
L202:   iload 9
L204:   iadd
L205:   istore 7
L207:   iload 6
L209:   ifle L217
L212:   iload 5
L214:   ifgt L218
L217:   return
L218:   getstatic Field ia o [I
L221:   aload_0
L222:   getfield Field ja p [B
L225:   aload_0
L226:   getfield Field ja w [I
L229:   iload 4
L231:   iload_3
L232:   iload 6
L234:   iload 5
L236:   iload 7
L238:   iload 8
L240:   invokestatic Method ja a ([I[B[IIIIIII)V
L243:   return
L244:   
        .linenumbertable
            L0 24
            L7 25
            L14 27
            L22 29
            L25 31
            L31 33
            L37 35
            L45 37
            L48 38
            L55 41
            L62 42
            L69 43
            L73 44
            L83 45
            L92 48
            L102 49
            L115 51
            L122 54
            L129 55
            L136 56
            L140 57
            L147 58
            L152 59
            L159 60
            L166 63
            L176 66
            L186 67
            L193 68
            L200 69
            L207 72
            L217 73
            L218 75
            L243 76
        .end linenumbertable
    .end code
.end method

.method private static final a : ([I[B[IIIIIII)V
    .code stack 5 locals 13
L0:     iload 5
L2:     iconst_2
L3:     ishr
L4:     ineg
L5:     istore 9
L7:     iload 5
L9:     iconst_3
L10:    iand
L11:    ineg
L12:    istore 5
L14:    iload 6
L16:    ineg
L17:    istore 10
L19:    iload 10
L21:    ifge L242
L24:    iload 9
L26:    istore 11
L28:    iload 11
L30:    ifge L175
L33:    aload_1
L34:    iload_3
L35:    iinc 3 1
L38:    baload
L39:    istore 12
L41:    iload 12
L43:    ifeq L64
L46:    aload_0
L47:    iload 4
L49:    iinc 4 1
L52:    aload_2
L53:    iload 12
L55:    sipush 255
L58:    iand
L59:    iaload
L60:    iastore
L61:    goto L67
L64:    iinc 4 1
L67:    aload_1
L68:    iload_3
L69:    iinc 3 1
L72:    baload
L73:    istore 12
L75:    iload 12
L77:    ifeq L98
L80:    aload_0
L81:    iload 4
L83:    iinc 4 1
L86:    aload_2
L87:    iload 12
L89:    sipush 255
L92:    iand
L93:    iaload
L94:    iastore
L95:    goto L101
L98:    iinc 4 1
L101:   aload_1
L102:   iload_3
L103:   iinc 3 1
L106:   baload
L107:   istore 12
L109:   iload 12
L111:   ifeq L132
L114:   aload_0
L115:   iload 4
L117:   iinc 4 1
L120:   aload_2
L121:   iload 12
L123:   sipush 255
L126:   iand
L127:   iaload
L128:   iastore
L129:   goto L135
L132:   iinc 4 1
L135:   aload_1
L136:   iload_3
L137:   iinc 3 1
L140:   baload
L141:   istore 12
L143:   iload 12
L145:   ifeq L166
L148:   aload_0
L149:   iload 4
L151:   iinc 4 1
L154:   aload_2
L155:   iload 12
L157:   sipush 255
L160:   iand
L161:   iaload
L162:   iastore
L163:   goto L169
L166:   iinc 4 1
L169:   iinc 11 1
L172:   goto L28
L175:   iload 5
L177:   istore 11
L179:   iload 11
L181:   ifge L224
L184:   aload_1
L185:   iload_3
L186:   iinc 3 1
L189:   baload
L190:   istore 12
L192:   iload 12
L194:   ifeq L215
L197:   aload_0
L198:   iload 4
L200:   iinc 4 1
L203:   aload_2
L204:   iload 12
L206:   sipush 255
L209:   iand
L210:   iaload
L211:   iastore
L212:   goto L218
L215:   iinc 4 1
L218:   iinc 11 1
L221:   goto L179
L224:   iload 4
L226:   iload 7
L228:   iadd
L229:   istore 4
L231:   iload_3
L232:   iload 8
L234:   iadd
L235:   istore_3
L236:   iinc 10 1
L239:   goto L19
L242:   return
L243:   
        .linenumbertable
            L0 81
            L7 82
            L14 85
            L19 86
            L24 90
            L28 91
            L33 94
            L41 95
            L46 96
            L64 98
            L67 100
            L75 101
            L80 102
            L98 104
            L101 106
            L109 107
            L114 108
            L132 110
            L135 112
            L143 113
            L148 114
            L166 116
            L169 91
            L175 123
            L179 124
            L184 127
            L192 128
            L197 129
            L215 131
            L218 124
            L224 136
            L231 137
            L236 86
            L242 141
        .end linenumbertable
    .end code
.end method

.method <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method ia <init> ()V
L4:     return
L5:     
        .linenumbertable
            L0 156
            L4 157
        .end linenumbertable
    .end code
.end method
.sourcefile "ja.java"
.end class
