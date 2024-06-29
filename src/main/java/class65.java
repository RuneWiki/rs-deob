import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class65 extends class352 {

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lcm;")
    public static class449 field910 = new class449(49, 2);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
    public static int[] field901;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field901 = null;
        field910 = null;
        if (arg0 <= 62) {
            method434((class24) null, 60, (class5) null, (byte) -93, (class496) null, 87);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIII)V")
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field911 = arg3;
        this.field907 = arg0;
        this.field904 = arg2;
        this.field903 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public final void method136(int arg0, int arg1, int arg2) {
        ++field908;
        if (arg0 != 1244456711) {
            field910 = null;
        }
        int var4 = this.field907 * arg1 >> 12;
        int var5 = this.field904 * arg1 >> 12;
        int var6 = this.field903 * arg2 >> 12;
        int var7 = this.field911 * arg2 >> 12;
        class268.method1713(super.field5453, var4, var6, var7, 5090, var5);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)V")
    public final void method132(int arg0, byte arg1, int arg2) {
        if (arg1 < -43) {
            ++field906;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbo;ILps;BLqa;I)Z")
    public static final boolean method434(class24 arg0, int arg1, class5 arg2, byte arg3, class496 arg4, int arg5) {
        ++field909;
        if (arg3 != -72) {
            method433((byte) 93);
        }
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field358 != null) {
            var8 = class135.field1976 - (arg0.field364 + arg2.field66 + -class135.field1989) * (-class135.field1985 + class135.field1976) / (-class135.field1989 + class135.field1972);
            var9 = -((class135.field1976 - class135.field1985) * (-class135.field1989 + arg2.field66 + arg0.field359) / (-class135.field1989 + class135.field1972)) + class135.field1976;
            var7 = (arg0.field376 + arg2.field69 - class135.field1988) * (class135.field1971 - class135.field1987) / (-class135.field1988 + class135.field1975) + class135.field1987;
            var6 = (class135.field1971 - class135.field1987) * (arg0.field370 + arg2.field69 + -class135.field1988) / (-class135.field1988 + class135.field1975) + class135.field1987;
        }
        class191 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg0.field381 != 0) {
            if (arg2.field71 && arg0.field399 != -1) {
                var10 = arg0.method198(arg4, 112, true);
            } else {
                var10 = arg0.method198(arg4, 108, false);
            }
            if (var10 != null) {
                var11 = arg2.field67 - (var10.method209() - -1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg2.field67 - -(var10.method209() - -1 >> 1);
                var13 = arg2.field72 + -(1 + var10.method219() >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field72 - -(1 + var10.method219() >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class171 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field375 != null) {
            var15 = class483.method2886(arg0.field389, (byte) 119);
            if (var15 != null) {
                var16 = class326.field4997.method35(160, (int[]) null, class519.field7697, arg0.field375, (class191[]) null);
                int var23 = arg2.field72;
                if (var10 != null) {
                    var17 = var23 - ((var10.method219() >> 1) - -(var16 * var15.method1203()));
                } else {
                    var17 = var23 - var15.method1204() * var16 / 2;
                }
                for (int var24 = 0; var16 > var24; ++var24) {
                    String var25 = class519.field7697[var24];
                    if (~(var16 + -1) < ~var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method1202(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field67 - (var18 / 2 - arg1);
                var20 = var18 / 2 + arg2.field67 + arg1;
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg5 + var17;
                if (~var20 < ~var7) {
                    var7 = var20;
                }
                var22 = arg5 + var16 * var15.method1203() + var17;
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                if (~var9 > ~var22) {
                    var9 = var22;
                }
            }
        }
        if (class135.field1987 <= var7 && ~var6 >= ~class135.field1971 && ~class135.field1985 >= ~var9 && ~class135.field1976 <= ~var8) {
            if (arg0.field358 != null) {
                int[] var27 = new int[arg0.field358.length];
                for (int var28 = 0; var27.length / 2 > var28; ++var28) {
                    int var30 = arg0.field358[var28 * 2] - -arg2.field69;
                    int var31 = arg0.field358[var28 * 2 + 1] + arg2.field66;
                    var27[var28 * 2] = (class135.field1971 - class135.field1987) * (-class135.field1988 + var30) / (class135.field1975 - class135.field1988) + class135.field1987;
                    var27[var28 * 2 + 1] = -((var31 - class135.field1989) * (-class135.field1985 + class135.field1976) / (class135.field1972 - class135.field1989)) + class135.field1976;
                }
                class402.method2464(arg4, var27, arg0.field369);
                for (int var29 = 0; var29 < var27.length / 2 + -1; ++var29) {
                    arg4.method2953(arg0.field395, var27[var29 * 2], var27[var29 * 2 + 1], var27[(var29 - -1) * 2 - -1], var27[var29 * 2 + 2], 47);
                }
                arg4.method2953(arg0.field395, var27[var27.length + -2], var27[var27.length + -1], var27[1], var27[0], 84);
            }
            if (var10 != null) {
                if (class56.field756 > 0 && (~class13.field207 != 0 && ~class13.field207 == ~arg2.field65 || class80.field1072 != -1 && class80.field1072 == arg0.field393)) {
                    int var32;
                    if (~class480.field7013 < -51) {
                        var32 = (-class480.field7013 + 100) * 2;
                    } else {
                        var32 = class480.field7013 * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg4.method2950(var33, var10.method220() / 2 + 7, (byte) 104, arg2.field72, arg2.field67);
                    arg4.method2950(var33, var10.method220() / 2 + 5, (byte) 104, arg2.field72, arg2.field67);
                    arg4.method2950(var33, 3 + var10.method220() / 2, (byte) 104, arg2.field72, arg2.field67);
                    arg4.method2950(var33, var10.method220() / 2 + 1, (byte) 104, arg2.field72, arg2.field67);
                    arg4.method2950(var33, var10.method220() / 2, (byte) 104, arg2.field72, arg2.field67);
                }
                var10.method1332(arg2.field67 - (var10.method209() >> 1), arg2.field72 - (var10.method219() >> 1));
            }
            if (arg0.field375 != null && var15 != null) {
                class455.method2738(var17, arg2, arg0, var15, arg4, var18, (byte) -75, var16);
            }
            if (~arg0.field381 != 0 || arg0.field375 != null) {
                class204 var34 = new class204(arg2);
                var34.field2865 = var14;
                var34.field2863 = var21;
                var34.field2872 = var22;
                var34.field2868 = var13;
                var34.field2864 = var11;
                var34.field2870 = var19;
                var34.field2862 = var12;
                var34.field2869 = var20;
                class178.field2537.method1958(var34, arg3 + 72);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IBI)V")
    public static final void method435(int arg0, byte arg1, int arg2) {
        ++field905;
        if (arg1 >= 115) {
            class377 var3 = class99.method672(arg2, false, 7);
            var3.method2340((byte) 126);
            var3.field5763 = arg0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg1 == -2) {
            ++field902;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lhu;I)[Lmg;")
    public static final class168[] method436(class469 arg0, int arg1) {
        ++field900;
        if (!arg0.method2794((byte) 121)) {
            return new class168[0];
        } else {
            class125 var2 = arg0.method2790(5);
            while (var2.field1791 == 0) {
                class106.method710(10L, (byte) 6);
            }
            if (~var2.field1791 == -3) {
                return new class168[0];
            } else {
                int[] var3 = (int[]) var2.field1793;
                int var4 = -126 / ((51 - arg1) / 59);
                class168[] var5 = new class168[var3.length >> 2];
                for (int var6 = 0; var5.length > var6; ++var6) {
                    class168 var7 = new class168();
                    var5[var6] = var7;
                    var7.field2441 = var3[var6 << 2];
                    var7.field2437 = var3[(var6 << 2) - -1];
                    var7.field2439 = var3[(var6 << 2) + 2];
                    var7.field2443 = var3[(var6 << 2) + 3];
                }
                return var5;
            }
        }
    }
}
