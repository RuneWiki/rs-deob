import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class147 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lmk;")
    public static class52 field2350 = new class52(0, -1);

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "[[B")
    public static byte[][] field2355 = new byte[1000][];

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Ldb;")
    public static class298 field2353;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field2356;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
    public static int[] field2354;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1060(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIBLoa;I)V", line = 4)
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class651 arg7, int arg8) {
        field2351++;
        class532 var9 = (class532) class219.method1390(arg1, arg3, arg8);
        if (var9 != null) {
            class58 var10 = class470.field6288.method1258(var9.method146(false), (byte) -48);
            int var11 = var9.method152(true) & 0x3;
            int var12 = var9.method151((byte) 78);
            if (var10.field809 == -1) {
                int var13 = arg2;
                if (var10.field816 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3566(var13, arg5, arg6 ^ 0xFFFFFF93, 4, arg0);
                    } else if (var11 == 1) {
                        arg7.method3570(arg5, 1, var13, arg0, 4);
                    } else if (var11 == 2) {
                        arg7.method3566(var13, arg5 + 3, arg6 + -40, 4, arg0);
                    } else if (var11 == 3) {
                        arg7.method3570(arg5, 1, var13, arg0 + 3, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method3567(1, arg5, 1, arg0, var13, (byte) 113);
                    } else if (var11 == 1) {
                        arg7.method3567(1, arg5 + 3, 1, arg0, var13, (byte) 95);
                    } else if (var11 == 2) {
                        arg7.method3567(1, arg5 + 3, 1, arg0 + 3, var13, (byte) 109);
                    } else if (var11 == 3) {
                        arg7.method3567(1, arg5, 1, arg0 + 3, var13, (byte) 110);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3570(arg5, 1, var13, arg0, 4);
                    } else if (var11 == 1) {
                        arg7.method3566(var13, arg5 + 3, 127, 4, arg0);
                    } else if (var11 == 2) {
                        arg7.method3570(arg5, arg6 ^ 0xFFFFFFEF, var13, arg0 + 3, 4);
                    } else if (var11 == 3) {
                        arg7.method3566(var13, arg5, 40, 4, arg0);
                    }
                }
            } else {
                class304.method1841(arg7, var11, var10, arg0, arg5, (byte) -100);
            }
        }
        class532 var14 = (class532) class503.method2793(arg1, arg3, arg8, field2356 == null ? (field2356 = method1060("qi")) : field2356);
        if (var14 != null) {
            class58 var15 = class470.field6288.method1258(var14.method146(false), (byte) -124);
            int var16 = var14.method152(true) & 0x3;
            int var17 = var14.method151((byte) 78);
            if (var15.field809 != -1) {
                class304.method1841(arg7, var16, var15, arg0, arg5, (byte) -123);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field816 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method3565(false, arg0, arg0 + 3, arg5 + 3, arg5, var18);
                } else {
                    arg7.method3565(false, arg0 + 3, arg0, arg5 + 3, arg5, var18);
                }
            }
        }
        if (arg6 != -18) {
            method1059(true);
        }
        class532 var19 = (class532) class34.method269(arg1, arg3, arg8);
        if (var19 == null) {
            return;
        }
        class58 var20 = class470.field6288.method1258(var19.method146(false), (byte) -81);
        int var21 = var19.method152(true) & 0x3;
        if (var20.field809 != -1) {
            class304.method1841(arg7, var21, var20, arg0, arg5, (byte) -122);
            return;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V", line = 147)
    public static void method1059(boolean arg0) {
        field2354 = null;
        field2355 = null;
        field2350 = null;
        field2353 = null;
        if (!arg0) {
            method1059(false);
        }
    }
}
