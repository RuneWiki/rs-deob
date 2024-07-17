.version 45 3
.class final super nb
.super u
.field public e I
.field public f I
.field public g I
.field public h I
.field public i I
.field public j Ljc;
.field public k I
.field public l I

.method public <init> : (ZIIIILjc;II)V
    .code stack 5 locals 10
L0:     aload_0
L1:     invokespecial Method u <init> ()V
        .catch java/lang/RuntimeException from L4 to L114 using L115
L4:     aload_0
L5:     iload_3
L6:     putfield Field nb e I
L9:     aload_0
L10:    iload 5
L12:    putfield Field nb f I
L15:    aload_0
L16:    iload 8
L18:    putfield Field nb g I
L21:    aload_0
L22:    iload 7
L24:    putfield Field nb h I
L27:    iload 4
L29:    ifeq L40
L32:    new java/lang/NullPointerException
L35:    dup
L36:    invokespecial Method java/lang/NullPointerException <init> ()V
L39:    athrow
L40:    aload_0
L41:    iload_2
L42:    putfield Field nb i I
L45:    aload_0
L46:    aload 6
L48:    putfield Field nb j Ljc;
L51:    iload_1
L52:    ifeq L104
L55:    aload 6
L57:    getfield Field jc i I
L60:    iconst_m1
L61:    if_icmpeq L104
L64:    aload_0
L65:    invokestatic Method java/lang/Math random ()D
L68:    aload_0
L69:    getfield Field nb j Ljc;
L72:    getfield Field jc e I
L75:    i2d
L76:    dmul
L77:    d2i
L78:    putfield Field nb k I
L81:    aload_0
L82:    invokestatic Method java/lang/Math random ()D
L85:    aload_0
L86:    getfield Field nb j Ljc;
L89:    getfield Field jc h [I
L92:    aload_0
L93:    getfield Field nb k I
L96:    iaload
L97:    i2d
L98:    dmul
L99:    d2i
L100:   putfield Field nb l I
L103:   return
L104:   aload_0
L105:   iconst_m1
L106:   putfield Field nb k I
L109:   aload_0
L110:   iconst_0
L111:   putfield Field nb l I
L114:   return
L115:   astore 9
L117:   new java/lang/StringBuffer
L120:   dup
L121:   ldc "91798, "
L123:   invokespecial Method java/lang/StringBuffer <init> (Ljava/lang/String;)V
L126:   iload_1
L127:   invokevirtual Method java/lang/StringBuffer append (Z)Ljava/lang/StringBuffer;
L130:   ldc ", "
L132:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L135:   iload_2
L136:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L139:   ldc ", "
L141:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L144:   iload_3
L145:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L148:   ldc ", "
L150:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L153:   iload 4
L155:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L158:   ldc ", "
L160:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L163:   iload 5
L165:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L168:   ldc ", "
L170:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L173:   aload 6
L175:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/Object;)Ljava/lang/StringBuffer;
L178:   ldc ", "
L180:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L183:   iload 7
L185:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L188:   ldc ", "
L190:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L193:   iload 8
L195:   invokevirtual Method java/lang/StringBuffer append (I)Ljava/lang/StringBuffer;
L198:   ldc ", "
L200:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L203:   aload 9
L205:   invokevirtual Method java/lang/Throwable toString ()Ljava/lang/String;
L208:   invokevirtual Method java/lang/StringBuffer append (Ljava/lang/String;)Ljava/lang/StringBuffer;
L211:   invokevirtual Method java/lang/StringBuffer toString ()Ljava/lang/String;
L214:   invokestatic Method sign/signlink reporterror (Ljava/lang/String;)V
L217:   new java/lang/RuntimeException
L220:   dup
L221:   invokespecial Method java/lang/RuntimeException <init> ()V
L224:   athrow
L225:   
    .end code
.end method
.end class
