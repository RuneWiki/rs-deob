import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class146 extends class206 {

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[Lmh;")
    public static class62[] field2317 = new class62[500];

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "[I")
    public static int[] field2314 = new int[25];

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lw;")
    public static class38 field2315 = new class38(64);

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lhi;")
    public static class26 field2318;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lsg;I)V", line = 5)
    public static final void method1064(class191 arg0, int arg1) {
        field2313++;
        int var2 = arg0.field3083;
        if (var2 == 324) {
            if (class24.field269 == -1) {
                class24.field269 = arg0.field3166;
                class249.field4232 = arg0.field3091;
            }
            if (class162.field2616.field201) {
                arg0.field3166 = class24.field269;
            } else {
                arg0.field3166 = class249.field4232;
            }
        } else if (var2 == 325) {
            if (class24.field269 == -1) {
                class249.field4232 = arg0.field3091;
                class24.field269 = arg0.field3166;
            }
            if (class162.field2616.field201) {
                arg0.field3166 = class249.field4232;
            } else {
                arg0.field3166 = class24.field269;
            }
        } else if (var2 == 327) {
            arg0.field3182 = 150;
            arg0.field3192 = (int) (Math.sin((double) class199.field3367 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3141 = -1;
            arg0.field3105 = 5;
        } else {
            if (arg1 != -11465) {
                method1064((class191) null, 98);
            }
            if (var2 == 328) {
                if (class268.field4551.field2430 == null) {
                    arg0.field3141 = 0;
                } else {
                    arg0.field3182 = 150;
                    arg0.field3192 = (int) (Math.sin((double) class199.field3367 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field3105 = 5;
                    arg0.field3141 = ((int) class268.field4551.field2430.method451(53) << 11) + 2047;
                    arg0.field3177 = class268.field4551.field3876;
                    arg0.field3160 = class268.field4551.field3838;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 88)
    public static void method1065(int arg0) {
        if (arg0 != 0) {
            method1068(126, (byte) -126);
        }
        field2314 = null;
        field2317 = null;
        field2318 = null;
        field2315 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Lsg;I)Z", line = 111)
    public static final boolean method1066(class191 arg0, int arg1) {
        field2316++;
        if (arg1 != 0) {
            method1068(62, (byte) 118);
        }
        if (arg0.field3083 == 205) {
            class260.field4377 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 131)
    public static final void method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class187 var20 = new class187(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class256.field4320[var21][arg1][arg2] == null) {
                    class256.field4320[var21][arg1][arg2] = new class166(var21, arg1, arg2);
                }
            }
            class256.field4320[arg0][arg1][arg2].field2710 = var20;
        } else if (arg3 == 1) {
            class187 var22 = new class187(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class256.field4320[var23][arg1][arg2] == null) {
                    class256.field4320[var23][arg1][arg2] = new class166(var23, arg1, arg2);
                }
            }
            class256.field4320[arg0][arg1][arg2].field2710 = var22;
        } else {
            class295 var24 = new class295(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class256.field4320[var25][arg1][arg2] == null) {
                    class256.field4320[var25][arg1][arg2] = new class166(var25, arg1, arg2);
                }
            }
            class256.field4320[arg0][arg1][arg2].field2719 = var24;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V", line = 183)
    public static final void method1068(int arg0, byte arg1) {
        class29.field399.method1390(arg0, -61);
        if (arg1 < 67) {
            method1064((class191) null, 8);
        }
        field2308++;
        class112.field1832.method1390(arg0, -69);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)Z", line = 204)
    public static final boolean method1069(boolean arg0, int arg1) {
        field2319++;
        if (arg0) {
            return false;
        } else {
            return (arg1 >> 31 & 0x1) != 0;
        }
    }
}
