import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class433 extends class75 {

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!us", name = "X", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!us", name = "Y", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "Lok;")
    public static class74 field6407;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
    public static final void method2554(int arg0, int arg1, int arg2) {
        ++field6409;
        if (arg2 == -18634) {
            class506 var3 = class14.method185(-1304589728, arg0, 5);
            var3.method2992(0);
            var3.field7442 = arg1;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLkh;I)V")
    public static final void method2555(int arg0, int arg1, byte arg2, class400 arg3, int arg4) {
        if (arg2 <= 32) {
            method2556(8);
        }
        ++field6412;
        class192 var5 = arg3.method2415(0);
        int var6 = -arg3.field5994.field3412 + arg3.field6005 & 16383;
        if (~arg4 != 0) {
            if (~arg3.field5991 == 0 || var6 < 10240 && ~var6 < -2049) {
                if (var6 == 0 && arg3.field5993 <= 25) {
                    arg3.field5979 = false;
                    if (~arg4 == -3 && var5.field2832 != -1) {
                        arg3.field6043 = var5.field2832;
                    } else if (arg4 == 0 && var5.field2814 != -1) {
                        arg3.field6043 = var5.field2814;
                    } else {
                        arg3.field6043 = var5.field2798;
                    }
                } else {
                    arg3.field5979 = false;
                    if (arg4 == 2 && ~var5.field2832 != 0) {
                        if (~arg0 > -1 && var5.field2795 != -1) {
                            arg3.field6043 = var5.field2795;
                        } else if (arg0 > 0 && ~var5.field2831 != 0) {
                            arg3.field6043 = var5.field2831;
                        } else {
                            arg3.field6043 = var5.field2832;
                        }
                    } else if (~arg4 == -1 && ~var5.field2814 != 0) {
                        if (arg0 < 0 && ~var5.field2843 != 0) {
                            arg3.field6043 = var5.field2843;
                        } else if (arg0 > 0 && var5.field2804 != -1) {
                            arg3.field6043 = var5.field2804;
                        } else {
                            arg3.field6043 = var5.field2814;
                        }
                    } else if (arg0 < 0 && var5.field2816 != -1) {
                        arg3.field6043 = var5.field2816;
                    } else if (~arg0 < -1 && ~var5.field2818 != 0) {
                        arg3.field6043 = var5.field2818;
                    } else {
                        arg3.field6043 = var5.field2798;
                    }
                }
            } else {
                int var7 = 16383 & class399.field5955[arg1] + -arg3.field5994.field3412;
                if (~arg4 == -3 && var5.field2832 != -1) {
                    if (~var7 < -2049 && var7 <= 6144 && var5.field2802 != -1) {
                        arg3.field6043 = var5.field2802;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field2815 != -1) {
                        arg3.field6043 = var5.field2815;
                    } else if (~var7 < -6145 && ~var7 > -10241 && var5.field2834 != -1) {
                        arg3.field6043 = var5.field2834;
                    } else {
                        arg3.field6043 = var5.field2832;
                    }
                } else if (~arg4 == -1 && ~var5.field2814 != 0) {
                    if (var7 > 2048 && ~var7 >= -6145 && ~var5.field2813 != 0) {
                        arg3.field6043 = var5.field2813;
                    } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field2841 != 0) {
                        arg3.field6043 = var5.field2841;
                    } else if (~var7 < -6145 && ~var7 > -10241 && var5.field2809 != -1) {
                        arg3.field6043 = var5.field2809;
                    } else {
                        arg3.field6043 = var5.field2814;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && var5.field2799 != -1) {
                    arg3.field6043 = var5.field2799;
                } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field2839 != 0) {
                    arg3.field6043 = var5.field2839;
                } else if (~var7 < -6145 && var7 < 10240 && ~var5.field2824 != 0) {
                    arg3.field6043 = var5.field2824;
                } else {
                    arg3.field6043 = var5.field2798;
                }
                arg3.field5979 = false;
            }
        } else if (var6 == 0 && arg3.field5993 <= 25) {
            if (!arg3.field5979 || !var5.method1278(45, arg3.field6043)) {
                arg3.field6043 = var5.method1281(false);
                arg3.field5979 = ~arg3.field6043 != 0;
            }
        } else {
            arg3.field5979 = false;
            if (arg0 < 0 && ~var5.field2844 != 0) {
                arg3.field6043 = var5.field2844;
            } else if (arg0 > 0 && var5.field2821 != -1) {
                arg3.field6043 = var5.field2821;
            } else {
                arg3.field6043 = var5.field2798;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
    public static void method2556(int arg0) {
        field6407 = null;
        if (arg0 > -30) {
            field6407 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Lrt;")
    public static final class133 method2557(int arg0) {
        ++field6411;
        try {
            if (arg0 != -6145) {
                field6407 = null;
            }
            return (class133) Class.forName("kb").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 > -45) {
            field6407 = null;
        }
        ++field6410;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681 && this.method552(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1055 * super.field1055;
            for (int var8 = 0; class367.field5597 > var8; ++var8) {
                int var9 = super.field1057[var8 % super.field1063 + var7];
                var6[var8] = class140.method1023(var9, 255) << 4;
                var5[var8] = class140.method1023(var9 >> 4, 4080);
                var4[var8] = class140.method1023(4080, var9 >> 12);
            }
        }
        return var3;
    }
}
