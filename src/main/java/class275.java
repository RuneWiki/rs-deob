import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class275 extends class71 {

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Lvf;")
    private static class265 field4854 = class87.method582(-46, " has logged out)3");

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lvf;")
    public static class265 field4851 = field4854;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field4852 = 0;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lvf;")
    public static class265 field4860 = class87.method582(-46, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)V")
    public static final void method1876(int arg0, int arg1, byte arg2) {
        if (arg2 < 92) {
            return;
        }
        if (class94.field1668 != arg0) {
            class277.field4894 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class277.field4894[var3] = (var3 << 12) / arg0;
            }
            class72.field1374 = arg0 == 64 ? 2048 : 4096;
            class94.field1668 = arg0;
            class1.field20 = arg0 - 1;
        }
        field4859++;
        if (class102.field1804 == arg1) {
            return;
        }
        if (class94.field1668 == arg1) {
            class219.field3951 = class277.field4894;
        } else {
            class219.field3951 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class219.field3951[var4] = (var4 << 12) / arg1;
            }
        }
        class102.field1804 = arg1;
        class11.field377 = arg1 - 1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILsd;IB)V")
    public static final void method1877(int arg0, class23 arg1, int arg2, byte arg3) {
        if (arg1.field2570 == arg2 && arg2 != -1) {
            class216 var4 = class174.method1142(arg2, false);
            int var5 = var4.field3880;
            if (var5 == 1) {
                arg1.field2552 = 0;
                arg1.field2581 = 0;
                arg1.field2589 = 0;
                arg1.field2591 = arg0;
                class268.method1832(var4, false, arg1.field2552, arg1.field2600, -2, arg1.field2564);
            }
            if (var5 == 2) {
                arg1.field2589 = 0;
            }
        } else if (arg2 == -1 || arg1.field2570 == -1 || class174.method1142(arg2, false).field3888 >= class174.method1142(arg1.field2570, false).field3888) {
            arg1.field2591 = arg0;
            arg1.field2590 = arg1.field2551;
            arg1.field2552 = 0;
            arg1.field2589 = 0;
            arg1.field2570 = arg2;
            arg1.field2581 = 0;
            if (arg1.field2570 != -1) {
                class268.method1832(class174.method1142(arg1.field2570, false), false, arg1.field2552, arg1.field2600, -2, arg1.field2564);
            }
        }
        int var6 = 91 % ((64 - arg3) / 33);
        field4849++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLr;IZZLr;I)I")
    public static final int method1878(boolean arg0, class229 arg1, int arg2, boolean arg3, boolean arg4, class229 arg5, int arg6) {
        field4853++;
        int var7 = class45.method371(arg5, arg1, (byte) -93, arg0, arg2);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (!arg3) {
            return -32;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class45.method371(arg5, arg1, (byte) -60, arg4, arg6);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static void method1879(int arg0) {
        if (arg0 != 6) {
            method1877(-87, (class23) null, 91, (byte) -84);
        }
        field4860 = null;
        field4851 = null;
        field4854 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public static final void method1880(int arg0, int arg1) {
        if (arg0 != -1) {
            field4851 = null;
        }
        class178 var2 = class188.method1282(arg1, 4, 261360480);
        var2.method1160(119);
        field4850++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([I[IBII)V")
    public static final void method1881(int[] arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -24) {
            return;
        }
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg1[var9] > (var9 & 0x1) + var7) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method1881(arg0, arg1, (byte) -24, arg3, var6 - 1);
            method1881(arg0, arg1, (byte) -24, var6 + 1, arg4);
        }
        field4858++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[Lgk;)V")
    public static final void method1882(int arg0, int arg1, class6[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class6 var4 = arg2[var3];
            if (var4 != null && var4.field142 == arg1 && (!var4.field226 || !client.method1472(var4))) {
                if (var4.field187 == 0) {
                    if (!var4.field226 && client.method1472(var4) && class44.field967 != var4) {
                        continue;
                    }
                    method1882(7602, var4.field219, arg2);
                    if (var4.field160 != null) {
                        method1882(7602, var4.field219, var4.field160);
                    }
                    class181 var5 = (class181) class49.field1042.method1842(arg0 ^ 0xFFFFE24D, (long) var4.field219);
                    if (var5 != null) {
                        class259.method1714(-108, var5.field3217);
                    }
                }
                if (var4.field187 == 6) {
                    if (var4.field150 != -1 || var4.field217 != -1) {
                        boolean var6 = class79.method548(var4, (byte) 119);
                        int var7;
                        if (var6) {
                            var7 = var4.field217;
                        } else {
                            var7 = var4.field150;
                        }
                        if (var7 != -1) {
                            class216 var8 = class174.method1142(var7, false);
                            if (var8 != null) {
                                var4.field174 += class84.field1572;
                                while (var4.field174 > var8.field3894[var4.field152]) {
                                    var4.field174 -= var8.field3894[var4.field152];
                                    var4.field152++;
                                    if (var8.field3890.length <= var4.field152) {
                                        var4.field152 -= var8.field3883;
                                        if (var4.field152 < 0 || var4.field152 >= var8.field3890.length) {
                                            var4.field152 = 0;
                                        }
                                    }
                                    class176.method1145((byte) -78, var4);
                                }
                            }
                        }
                    }
                    if (var4.field244 != 0 && !var4.field226) {
                        int var9 = var4.field244 << 16 >> 16;
                        int var10 = var4.field244 >> 16;
                        int var11 = class84.field1572 * var9;
                        int var12 = class84.field1572 * var10;
                        var4.field123 = var4.field123 + var11 & 0x7FF;
                        var4.field124 = var4.field124 + var12 & 0x7FF;
                        class176.method1145((byte) -120, var4);
                    }
                }
            }
        }
        if (arg0 == 7602) {
            field4855++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
    public static final void method1883(byte arg0, int arg1) {
        class89.field1597.method1891(-23549, arg1);
        field4856++;
        class52.field1085.method1891(-23549, arg1);
        class13.field417.method1891(-23549, arg1);
        if (arg0 >= -105) {
            field4854 = null;
        }
    }
}
