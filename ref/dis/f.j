.version 45 3
.class public super f
.super java/lang/Object
.field public static a [Lf;
.field public b I
.field public c [I
.field public d [[I

.method public static a : (ZLub;)V
    .code stack 8 locals 16
L0:     getstatic Field eb Rb Z
L3:     istore 15
        .catch java/lang/RuntimeException from L5 to L261 using L262
L5:     new kb
L8:     dup
L9:     sipush 363
L12:    aload_1
L13:    ldc "base_head.dat"
L15:    aconst_null
L16:    iconst_2
L17:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L20:    invokespecial Method kb <init> (I[B)V
L23:    astore_2
L24:    new kb
L27:    dup
L28:    sipush 363
L31:    aload_1
L32:    ldc "base_type.dat"
L34:    aconst_null
L35:    iconst_2
L36:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L39:    invokespecial Method kb <init> (I[B)V
L42:    astore_3
L43:    new kb
L46:    dup
L47:    sipush 363
L50:    aload_1
L51:    ldc "base_label.dat"
L53:    aconst_null
L54:    iconst_2
L55:    invokevirtual Method ub a (Ljava/lang/String;[BB)[B
L58:    invokespecial Method kb <init> (I[B)V
L61:    astore 4
L63:    aload_2
L64:    invokevirtual Method kb e ()I
L67:    istore 5
L69:    aload_2
L70:    invokevirtual Method kb e ()I
L73:    istore 6
L75:    iload 6
L77:    iconst_1
L78:    iadd
L79:    anewarray f
L82:    putstatic Field f a [Lf;
L85:    iload_0
L86:    ifeq L97
L89:    new java/lang/NullPointerException
L92:    dup
L93:    invokespecial Method java/lang/NullPointerException <init> ()V
L96:    athrow
L97:    iconst_0
L98:    istore 7
L100:   iload 15
L102:   ifeq L254
L105:   aload_2
L106:   invokevirtual Method kb e ()I
L109:   istore 8
L111:   aload_2
L112:   invokevirtual Method kb c ()I
L115:   istore 9
L117:   iload 9
L119:   newarray int
L121:   astore 10
L123:   iload 9
L125:   multianewarray [[I 1
L129:   astore 11
L131:   iconst_0
L132:   istore 12
L134:   iload 15
L136:   ifeq L198
L139:   aload 10
L141:   iload 12
L143:   aload_3
L144:   invokevirtual Method kb c ()I
L147:   iastore
L148:   aload 4
L150:   invokevirtual Method kb c ()I
L153:   istore 13
L155:   aload 11
L157:   iload 12
L159:   iload 13
L161:   newarray int
L163:   aastore
L164:   iconst_0
L165:   istore 14
L167:   iload 15
L169:   ifeq L188
L172:   aload 11
L174:   iload 12
L176:   aaload
L177:   iload 14
L179:   aload 4
L181:   invokevirtual Method kb c ()I
L184:   iastore
L185:   iinc 14 1
L188:   iload 14
L190:   iload 13
L192:   if_icmplt L172
L195:   iinc 12 1
L198:   iload 12
L200:   iload 9
L202:   if_icmplt L139
L205:   getstatic Field f a [Lf;
L208:   iload 8
L210:   new f
L213:   dup
L214:   invokespecial Method f <init> ()V
L217:   aastore
L218:   getstatic Field f a [Lf;
L221:   iload 8
L223:   aaload
L224:   iload 9
L226:   putfield Field f b I
L229:   getstatic Field f a [Lf;
L232:   iload 8
L234:   aaload
L235:   aload 10
L237:   putfield Field f c [I
L240:   getstatic Field f a [Lf;
L243:   iload 8
L245:   aaload
L246:   aload 11
L248:   putfield Field f d [[I
L251:   iinc 7 1
L254:   iload 7
L256:   iload 5
L258:   if_icmplt L105
L261:   return
L262:   astore_2
L263:   new java/lang/StringBuffer
L266:   dup
L267:   ldc "88924, "
L269:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L272:   iload_0
L273:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L276:   ldc ", "
L278:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L281:   aload_1
L282:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L285:   ldc ", "
L287:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L290:   aload_2
L291:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L294:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L297:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L300:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L303:   new java/lang/RuntimeException
L306:   dup
L307:   invokespecial Method java/lang/RuntimeException <init> ()V
L310:   athrow
L311:   
    .end code
.end method

.method public <init> : ()V
    .code stack 1 locals 1
L0:     aload_0
L1:     invokespecial Method java/lang/Object <init> ()V
L4:     return
L5:     
    .end code
.end method
.end class
