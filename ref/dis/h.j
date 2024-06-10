.version 45 3
.class final super h
.super java/lang/Object

.method static final a : (Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;
    .code stack 2 locals 4
        .catch java/lang/RuntimeException from L0 to L10 using L20
L0:     iload_1
L1:     bipush -69
L3:     if_icmple L11
L6:     aconst_null
L7:     checkcast java/lang/Object
L10:    areturn
        .catch java/lang/RuntimeException from L11 to L19 using L20
L11:    aload_2
L12:    invokestatic Method netscape/javascript/JSObject getWindow (Ljava/applet/Applet;)Lnetscape/javascript/JSObject;
L15:    aload_0
L16:    invokevirtual Method netscape/javascript/JSObject eval (Ljava/lang/String;)Ljava/lang/Object;
L19:    areturn
L20:    astore_3
L21:    aload_3
L22:    athrow
L23:    
        .linenumbertable
            L0 4
            L6 5
            L11 7
            L20 8
            L21 9
        .end linenumbertable
    .end code
    .exceptions java/lang/Throwable
.end method
.sourcefile "h.java"
.end class
