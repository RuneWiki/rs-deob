import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class546 extends class392 {

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Lcp;")
    public static class271 field7568;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
    public final int method3157(int arg0) {
        ++field7563;
        if (arg0 != 17539) {
            field7568 = null;
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static void method3158(byte arg0) {
        if (arg0 == -104) {
            field7568 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
    public static final void method3159(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        if (var3 != null) {
            class347.method2117(var3.field2591);
            class347.method2117(var3.field2598);
            if (var3.field2591 != null) {
                var3.field2591 = null;
            }
            if (var3.field2598 != null) {
                var3.field2598 = null;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(Z)V")
    public static final void method3160(boolean arg0) {
        ++field7567;
        if (class789.field10788 == null) {
            class789.field10788 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var3 = 0;
            if (arg0) {
                method3159(-24, -5, -93);
            }
            while (~var3 > -65537) {
                double var4 = (double) (63 & var3 >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D + -var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (-var18 + var16) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (!(var20 * 3.0D < 2.0D)) {
                        var10 = var18;
                    } else {
                        var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (var4 * 3.0D < 2.0D) {
                        var12 = (0.6666666666666666D - var4) * (-var18 + var16) * 6.0D + var18;
                    } else {
                        var12 = var18;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (var24 * 2.0D < 1.0D) {
                            var14 = var16;
                        } else if (!(var24 * 3.0D < 2.0D)) {
                            var14 = var18;
                        } else {
                            var14 = (var16 - var18) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                class789.field10788[var3] = var35;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field7565;
        if (!arg0) {
            return 95;
        } else {
            return !super.field5454.method3782((byte) -89) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lw;)V")
    public class546(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field7569;
        return arg1 > -124 ? 58 : 3;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7562;
        if (class742.field10301 <= arg0 && ~arg0 >= ~class435.field6058 && ~arg4 <= ~class742.field10301 && ~class435.field6058 <= ~arg4 && class742.field10301 <= arg7 && class435.field6058 >= arg7 && arg9 >= class742.field10301 && ~arg9 >= ~class435.field6058 && class515.field7102 <= arg2 && arg2 <= class698.field9801 && ~class515.field7102 >= ~arg8 && arg8 <= class698.field9801 && ~class515.field7102 >= ~arg5 && class698.field9801 >= arg5 && arg3 >= class515.field7102 && ~arg3 >= ~class698.field9801) {
            class274.method1742(arg5, arg2, arg8, arg0, arg1, arg4, arg7, true, arg9, arg3);
        } else {
            class251.method1666(arg0, arg7, arg9, arg2, arg1, arg4, arg8, arg3, (byte) -111, arg5);
        }
        if (arg6 > -49) {
            method3161(-107, 32, -72, 33, -95, -9, 30, 55, 124, -31);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field7566;
        if (!arg0) {
            super.field5452 = this.method292(true);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        ++field7564;
        int var3 = 89 / ((-80 - arg0) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(ILw;)V")
    public class546(int arg0, class675 arg1) {
        super(arg0, arg1);
    }
}
