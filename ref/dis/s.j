.version 45 3
.class final super s
.super pa

.method <init> : ([B[I[I[I[I[I[[B)V
    .code stack 8 locals 8
L0:     aload_0
L1:     aload_1
L2:     aload_2
L3:     aload_3
L4:     aload 4
L6:     aload 5
L8:     aload 6
L10:    aload 7
L12:    invokespecial Method pa <init> ([B[I[I[I[I[I[[B)V
L15:    return
L16:    
        .linenumbertable
            L0 5
            L15 6
        .end linenumbertable
    .end code
.end method

.method final b : ([BIIIII)V
    .code stack 9 locals 12
L0:     iload_2
L1:     iload_3
L2:     getstatic Field ia k I
L5:     imul
L6:     iadd
L7:     istore 7
L9:     getstatic Field ia k I
L12:    iload 4
L14:    isub
L15:    istore 8
L17:    iconst_0
L18:    istore 9
L20:    iconst_0
L21:    istore 10
L23:    iload_3
L24:    getstatic Field ia j I
L27:    if_icmpge L69
L30:    getstatic Field ia j I
L33:    iload_3
L34:    isub
L35:    istore 11
L37:    iload 5
L39:    iload 11
L41:    isub
L42:    istore 5
L44:    getstatic Field ia j I
L47:    istore_3
L48:    iload 10
L50:    iload 11
L52:    iload 4
L54:    imul
L55:    iadd
L56:    istore 10
L58:    iload 7
L60:    iload 11
L62:    getstatic Field ia k I
L65:    imul
L66:    iadd
L67:    istore 7
L69:    iload_3
L70:    iload 5
L72:    iadd
L73:    getstatic Field ia m I
L76:    if_icmple L92
L79:    iload 5
L81:    iload_3
L82:    iload 5
L84:    iadd
L85:    getstatic Field ia m I
L88:    isub
L89:    isub
L90:    istore 5
L92:    iload_2
L93:    getstatic Field ia i I
L96:    if_icmpge L145
L99:    getstatic Field ia i I
L102:   iload_2
L103:   isub
L104:   istore 11
L106:   iload 4
L108:   iload 11
L110:   isub
L111:   istore 4
L113:   getstatic Field ia i I
L116:   istore_2
L117:   iload 10
L119:   iload 11
L121:   iadd
L122:   istore 10
L124:   iload 7
L126:   iload 11
L128:   iadd
L129:   istore 7
L131:   iload 9
L133:   iload 11
L135:   iadd
L136:   istore 9
L138:   iload 8
L140:   iload 11
L142:   iadd
L143:   istore 8
L145:   iload_2
L146:   iload 4
L148:   iadd
L149:   getstatic Field ia l I
L152:   if_icmple L186
L155:   iload_2
L156:   iload 4
L158:   iadd
L159:   getstatic Field ia l I
L162:   isub
L163:   istore 11
L165:   iload 4
L167:   iload 11
L169:   isub
L170:   istore 4
L172:   iload 9
L174:   iload 11
L176:   iadd
L177:   istore 9
L179:   iload 8
L181:   iload 11
L183:   iadd
L184:   istore 8
L186:   iload 4
L188:   ifle L196
L191:   iload 5
L193:   ifgt L197
L196:   return
L197:   getstatic Field ia o [I
L200:   aload_1
L201:   iload 6
L203:   iload 10
L205:   iload 7
L207:   iload 4
L209:   iload 5
L211:   iload 8
L213:   iload 9
L215:   invokestatic Method pa a ([I[BIIIIIII)V
L218:   return
L219:   
        .linenumbertable
            L0 9
            L9 11
            L17 13
            L20 15
            L23 16
            L30 19
            L37 20
            L44 21
            L48 22
            L58 23
            L69 26
            L79 27
            L92 29
            L99 32
            L106 33
            L113 34
            L117 35
            L124 36
            L131 37
            L138 38
            L145 41
            L155 44
            L165 45
            L172 46
            L179 47
            L186 50
            L196 51
            L197 53
            L218 54
        .end linenumbertable
    .end code
.end method

.method final a : ([BIIIIII)V
    .code stack 10 locals 13
L0:     iload_2
L1:     iload_3
L2:     getstatic Field ia k I
L5:     imul
L6:     iadd
L7:     istore 8
L9:     getstatic Field ia k I
L12:    iload 4
L14:    isub
L15:    istore 9
L17:    iconst_0
L18:    istore 10
L20:    iconst_0
L21:    istore 11
L23:    iload_3
L24:    getstatic Field ia j I
L27:    if_icmpge L69
L30:    getstatic Field ia j I
L33:    iload_3
L34:    isub
L35:    istore 12
L37:    iload 5
L39:    iload 12
L41:    isub
L42:    istore 5
L44:    getstatic Field ia j I
L47:    istore_3
L48:    iload 11
L50:    iload 12
L52:    iload 4
L54:    imul
L55:    iadd
L56:    istore 11
L58:    iload 8
L60:    iload 12
L62:    getstatic Field ia k I
L65:    imul
L66:    iadd
L67:    istore 8
L69:    iload_3
L70:    iload 5
L72:    iadd
L73:    getstatic Field ia m I
L76:    if_icmple L92
L79:    iload 5
L81:    iload_3
L82:    iload 5
L84:    iadd
L85:    getstatic Field ia m I
L88:    isub
L89:    isub
L90:    istore 5
L92:    iload_2
L93:    getstatic Field ia i I
L96:    if_icmpge L145
L99:    getstatic Field ia i I
L102:   iload_2
L103:   isub
L104:   istore 12
L106:   iload 4
L108:   iload 12
L110:   isub
L111:   istore 4
L113:   getstatic Field ia i I
L116:   istore_2
L117:   iload 11
L119:   iload 12
L121:   iadd
L122:   istore 11
L124:   iload 8
L126:   iload 12
L128:   iadd
L129:   istore 8
L131:   iload 10
L133:   iload 12
L135:   iadd
L136:   istore 10
L138:   iload 9
L140:   iload 12
L142:   iadd
L143:   istore 9
L145:   iload_2
L146:   iload 4
L148:   iadd
L149:   getstatic Field ia l I
L152:   if_icmple L186
L155:   iload_2
L156:   iload 4
L158:   iadd
L159:   getstatic Field ia l I
L162:   isub
L163:   istore 12
L165:   iload 4
L167:   iload 12
L169:   isub
L170:   istore 4
L172:   iload 10
L174:   iload 12
L176:   iadd
L177:   istore 10
L179:   iload 9
L181:   iload 12
L183:   iadd
L184:   istore 9
L186:   iload 4
L188:   ifle L196
L191:   iload 5
L193:   ifgt L197
L196:   return
L197:   getstatic Field ia o [I
L200:   aload_1
L201:   iload 6
L203:   iload 11
L205:   iload 8
L207:   iload 4
L209:   iload 5
L211:   iload 9
L213:   iload 10
L215:   iload 7
L217:   invokestatic Method pa a ([I[BIIIIIIII)V
L220:   return
L221:   
        .linenumbertable
            L0 58
            L9 60
            L17 62
            L20 64
            L23 65
            L30 68
            L37 69
            L44 70
            L48 71
            L58 72
            L69 75
            L79 76
            L92 78
            L99 81
            L106 82
            L113 83
            L117 84
            L124 85
            L131 86
            L138 87
            L145 90
            L155 93
            L165 94
            L172 95
            L179 96
            L186 99
            L196 100
            L197 102
            L220 103
        .end linenumbertable
    .end code
.end method
.sourcefile "s.java"
.end class
