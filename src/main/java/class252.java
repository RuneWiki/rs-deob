import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class252 extends class220 {

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[S")
    public static short[] field3654 = new short[] { 49, 51, 10, 28, 59, 21, 20, 16 };

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "[S")
    public static short[] field3659 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "[C")
    public static char[] field3661 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "Lqj;")
    public static class238 field3656;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "Lqa;")
    public static class243 field3658;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLqj;)Lhd;")
    public static final class17 method1551(int arg0, boolean arg1, class238 arg2) {
        ++field3657;
        byte[] var3 = arg2.method1466(arg0, -106);
        if (arg1) {
            field3656 = null;
        }
        return var3 == null ? null : new class17(var3);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            return null;
        } else {
            ++field3660;
            int[] var3 = super.field3125.method2005(arg1, (byte) -113);
            if (super.field3125.field4676) {
                int[][] var4 = this.method1369(0, (byte) 124, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class344.field5043 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        ++field3662;
        for (int var1 = 0; class7.field64 > var1; ++var1) {
            int var10002 = class408.field6111[var1]--;
            if (~class408.field6111[var1] <= 9) {
                class44 var3 = class60.field865[var1];
                if (var3 == null) {
                    var3 = class44.method328(class258.field3764, class95.field1316[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class408.field6111[var1] += var3.method326();
                    class60.field865[var1] = var3;
                }
                if (~class408.field6111[var1] > -1) {
                    int var10;
                    if (class358.field5246[var1] != 0) {
                        int var4 = (255 & class358.field5246[var1]) * 128;
                        int var5 = (class358.field5246[var1] & 16749838) >> 16;
                        int var6 = var5 * 128 + 64 - class100.field1350.field5284;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class358.field5246[var1] & 65531) >> 8;
                        int var8 = var7 * 128 - -64 + -class100.field1350.field5298;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + -128 + var6;
                        if (var9 > var4) {
                            class408.field6111[var1] = -100;
                            continue;
                        }
                        if (~var9 > -1) {
                            var9 = 0;
                        }
                        var10 = class189.field2577[var1] * class358.field5243 * (-var9 + var4) / var4 >> 8;
                    } else {
                        var10 = class189.field2577[var1] * class23.field409 >> 8;
                    }
                    if (var10 > 0) {
                        class61 var11 = var3.method327().method406(class142.field1871);
                        class290 var12 = class290.method1825(var11, 100, var10);
                        var12.method1859(class171.field2252[var1] + -1);
                        class405.field6092.method174(var12);
                    }
                    class408.field6111[var1] = -100;
                }
            } else {
                --class7.field64;
                for (int var2 = var1; ~class7.field64 < ~var2; ++var2) {
                    class95.field1316[var2] = class95.field1316[var2 - -1];
                    class60.field865[var2] = class60.field865[var2 + 1];
                    class171.field2252[var2] = class171.field2252[var2 - -1];
                    class408.field6111[var2] = class408.field6111[var2 + 1];
                    class358.field5246[var2] = class358.field5246[var2 + 1];
                    class189.field2577[var2] = class189.field2577[var2 + 1];
                }
                --var1;
            }
        }
        if (class164.field2139 && !class151.method985(0)) {
            if (~class407.field6101 != -1 && ~class280.field4128 != 0) {
                class297.method1883(class280.field4128, 0, class407.field6101, 73, false, class328.field4711);
            }
            class164.field2139 = false;
        } else if (class407.field6101 != 0 && ~class280.field4128 != 0 && !class151.method985(0)) {
            ++class419.field6234;
            class232.field3279.method756(0, 176);
            class232.field3279.method1704(class280.field4128, (byte) 126);
            class280.field4128 = -1;
        }
        if (arg0 < 40) {
            field3654 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILsn;ILqa;ILro;I)V")
    public static final void method1553(int arg0, int arg1, class449 arg2, int arg3, class243 arg4, int arg5, class249 arg6, int arg7) {
        ++field3655;
        if (arg4 != null) {
            int var8;
            if (~class5.field48 == -5) {
                var8 = 16383 & (int) class170.field2244;
            } else {
                var8 = (int) class170.field2244 - -class66.field942 & 16383;
            }
            int var9 = Math.max(arg6.field3578 / 2, arg6.field3604 / 2) - -10;
            int var10 = arg1 * arg1 + arg7 * arg7;
            if (~(var9 * var9) <= ~var10) {
                int var11 = class190.field2644[var8];
                int var12 = class190.field2635[var8];
                if (~class5.field48 != -5) {
                    var11 = var11 * 256 / (class59.field858 + 256);
                    var12 = var12 * 256 / (class59.field858 + 256);
                }
                int var13 = arg1 * var11 + arg7 * var12 >> 15;
                int var14 = arg1 * var12 + -(arg7 * var11) >> 15;
                arg4.method34(arg6.field3578 / 2 + arg0 + (var13 - arg4.method1088() / 2), -var14 + (arg5 - (-(arg6.field3604 / 2) + arg4.method1091() / arg3)), arg2, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public static void method1554(int arg0) {
        field3661 = null;
        field3658 = null;
        field3656 = null;
        field3659 = null;
        if (arg0 < -6) {
            field3654 = null;
        }
    }
}
