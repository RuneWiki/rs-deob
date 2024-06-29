import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class646 extends class445 {

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
    public static int[] field8584 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
    public static int field8583;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nia", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field8585;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3540(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 7)
    public static void method3537(int arg0) {
        field8584 = null;
        if (arg0 != 28616) {
            method3539(-22, -65, -45, 9, -47, 56, 21, 15, null);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IB)I", line = 23)
    public static final int method3538(int arg0, byte arg1) {
        int var2 = 33 / ((arg1 + 57) / 50);
        field8581++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIIILha;)V", line = 33)
    public static final void method3539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
        field8582++;
        class624 var9 = (class624) class672.method3710(arg0, arg3, arg4);
        if (var9 != null) {
            class100 var10 = class462.field6333.method2008((byte) -15, var9.method1759((byte) 96));
            int var11 = var9.method1752((byte) -111) & 0x3;
            int var12 = var9.method1757((byte) -117);
            if (var10.field1294 == -1) {
                int var13 = arg6;
                if (var10.field1363 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method509(var13, 1, 4, arg7, arg5);
                    } else if (var11 == 1) {
                        arg8.method467(53, arg7, 4, arg5, var13);
                    } else if (var11 == 2) {
                        arg8.method509(var13, 1, 4, arg7, arg5 + 3);
                    } else if (var11 == 3) {
                        arg8.method467(126, arg7 + 3, 4, arg5, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method489(1, 28, 1, arg7, arg5, var13);
                    } else if (var11 == 1) {
                        arg8.method489(1, 30, 1, arg7, arg5 + 3, var13);
                    } else if (var11 == 2) {
                        arg8.method489(1, 86, 1, arg7 + 3, arg5 + 3, var13);
                    } else if (var11 == 3) {
                        arg8.method489(1, arg1 ^ 0x6, 1, arg7 + 3, arg5, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method467(103, arg7, 4, arg5, var13);
                    } else if (var11 == 1) {
                        arg8.method509(var13, 1, 4, arg7, arg5 + 3);
                    } else if (var11 == 2) {
                        arg8.method467(-94, arg7 + 3, 4, arg5, var13);
                    } else if (var11 == 3) {
                        arg8.method509(var13, 1, 4, arg7, arg5);
                    }
                }
            } else {
                class65.method555(arg8, 4, arg5, arg7, var11, var10);
            }
        }
        class624 var14 = (class624) class490.method2780(arg0, arg3, arg4, field8585 == null ? (field8585 = method3540("paa")) : field8585);
        if (var14 != null) {
            class100 var15 = class462.field6333.method2008((byte) -74, var14.method1759((byte) 127));
            int var16 = var14.method1752((byte) -111) & 0x3;
            int var17 = var14.method1757((byte) 121);
            if (var15.field1294 != -1) {
                class65.method555(arg8, arg1 ^ 0x67, arg5, arg7, var16, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1363 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method427(arg5 + 3, arg7, arg7 + 3, var18, (byte) 49, arg5);
                } else {
                    arg8.method427(arg5 + 3, arg7 - -3, arg7, var18, (byte) 49, arg5);
                }
            }
        }
        class624 var19 = (class624) class694.method3906(arg0, arg3, arg4);
        if (arg1 != 99) {
            field8584 = null;
        }
        if (var19 == null) {
            return;
        }
        class100 var20 = class462.field6333.method2008((byte) -94, var19.method1759((byte) 64));
        int var21 = var19.method1752((byte) -111) & 0x3;
        if (var20.field1294 != -1) {
            class65.method555(arg8, 4, arg5, arg7, var21, var20);
            return;
        }
    }
}
