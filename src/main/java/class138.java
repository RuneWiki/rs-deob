import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class138 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lrn;")
    public static class633 field1821 = new class633(18, -1);

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Luw;")
    public static class208 field1825 = new class208(27, -1);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "[F")
    public static float[] field1826 = new float[16];

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field1827;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1828;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method795(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 11)
    public static void method792(int arg0) {
        if (arg0 != -2343) {
            field1827 = 61;
        }
        field1826 = null;
        field1825 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIILha;III)V", line = 24)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, class570 arg5, int arg6, int arg7, int arg8) {
        field1822++;
        class274 var9 = (class274) class127.method741(arg7, arg3, arg8);
        if (var9 != null) {
            class773 var10 = class390.field4983.method4292(var9.method1010(-6546), (byte) -80);
            int var11 = var9.method1013((byte) 31) & 0x3;
            int var12 = var9.method1007(true);
            if (var10.field10510 == -1) {
                int var13 = arg2;
                if (var10.field10488 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg5.method3065(arg6, var13, 4, (byte) 17, arg4);
                    } else if (var11 == 1) {
                        arg5.method3076(4, arg4, true, var13, arg6);
                    } else if (var11 == 2) {
                        arg5.method3065(arg6, var13, 4, (byte) 17, arg4 + 3);
                    } else if (var11 == 3) {
                        arg5.method3076(4, arg4, true, var13, arg6 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg5.method3068(false, arg4, arg6, 1, var13, 1);
                    } else if (var11 == 1) {
                        arg5.method3068(false, arg4 + 3, arg6, 1, var13, 1);
                    } else if (var11 == 2) {
                        arg5.method3068(false, arg4 + 3, arg6 + 3, 1, var13, 1);
                    } else if (var11 == 3) {
                        arg5.method3068(false, arg4, arg6 + 3, 1, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method3076(4, arg4, true, var13, arg6);
                    } else if (var11 == 1) {
                        arg5.method3065(arg6, var13, 4, (byte) 17, arg4 + 3);
                    } else if (var11 == 2) {
                        arg5.method3076(4, arg4, true, var13, arg6 + 3);
                    } else if (var11 == 3) {
                        arg5.method3065(arg6, var13, 4, (byte) 17, arg4);
                    }
                }
            } else {
                class621.method3319(var11, 0, arg4, arg6, var10, arg5);
            }
        }
        class274 var14 = (class274) class238.method1571(arg7, arg3, arg8, field1828 == null ? (field1828 = method795("aia")) : field1828);
        if (var14 != null) {
            class773 var15 = class390.field4983.method4292(var14.method1010(-6546), (byte) -94);
            int var16 = var14.method1013((byte) -27) & 0x3;
            int var17 = var14.method1007(true);
            if (var15.field10510 != -1) {
                class621.method3319(var16, 0, arg4, arg6, var15, arg5);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field10488 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg5.method3066(var18, arg6, arg4, arg4 + 3, arg6 + 3, (byte) 126);
                } else {
                    arg5.method3066(var18, arg6 + 3, arg4, arg4 + 3, arg6, (byte) 126);
                }
            }
        }
        if (arg0 != -12856) {
            field1821 = null;
        }
        class274 var19 = (class274) class740.method4019(arg7, arg3, arg8);
        if (var19 == null) {
            return;
        }
        class773 var20 = class390.field4983.method4292(var19.method1010(-6546), (byte) -128);
        int var21 = var19.method1013((byte) -111) & 0x3;
        if (var20.field10510 != -1) {
            class621.method3319(var21, arg0 + 12856, arg4, arg6, var20, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 177)
    public static final void method794(int arg0) {
        if (arg0 != -24358) {
            method794(-95);
        }
        class678.method3646(9155);
        field1823++;
    }
}
