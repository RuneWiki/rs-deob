import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class242 extends class216 {

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    private int field3378;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    private int field3370;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Lwu;")
    public static class557 field3376;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method327(int arg0, byte arg1, int arg2) {
        ++field3379;
        int var4 = this.field3381 * arg2 >> 12;
        int var5 = this.field3370 * arg2 >> 12;
        int var6 = this.field3378 * arg0 >> 12;
        if (arg1 != 23) {
            method1540(91, true, 125, (class712) null, 40);
        }
        int var7 = this.field3377 * arg0 >> 12;
        class295.method1737(super.field3063, var7, var4, false, var6, var5);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V", line = 23)
    public final void method330(int arg0, int arg1, int arg2) {
        ++field3373;
        if (arg2 != 382254306) {
            this.method327(-12, (byte) -15, -60);
        }
        int var4 = this.field3381 * arg0 >> 12;
        int var5 = this.field3370 * arg0 >> 12;
        int var6 = this.field3378 * arg1 >> 12;
        int var7 = this.field3377 * arg1 >> 12;
        class359.method2023(super.field3062, (byte) 32, var7, var4, super.field3060, var6, var5);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)V", line = 45)
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field3371;
        int var4 = this.field3381 * arg2 >> 12;
        int var5 = this.field3370 * arg2 >> 12;
        if (arg0) {
            this.method327(63, (byte) -77, -103);
        }
        int var6 = this.field3378 * arg1 >> 12;
        int var7 = this.field3377 * arg1 >> 12;
        class233.method1497(super.field3060, var6, var4, 11, var7, super.field3063, var5, super.field3062);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lvj;I)Lmga;", line = 67)
    public static final class29 method1537(class26 arg0, int arg1) {
        ++field3374;
        if (arg1 != 17910) {
            return null;
        } else {
            int var2 = arg0.method189(255);
            return new class29(var2);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3378 = arg1;
        this.field3381 = arg0;
        this.field3377 = arg3;
        this.field3370 = arg2;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 98)
    public static void method1538(int arg0) {
        if (arg0 == 5716) {
            field3376 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIIIII)V", line = 108)
    public static final void method1539(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3372;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 - -var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        if (!arg0) {
            field3376 = null;
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) - -3) * var10;
        int var18 = ((arg3 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class675.field9512 <= arg5 && class395.field5484 >= arg5) {
            int var20 = class325.method1901(arg4 - -arg1, class490.field6592, class116.field1628, true);
            int var21 = class325.method1901(arg4 - arg1, class490.field6592, class116.field1628, true);
            class721.method4044(class591.field8480[arg5], var21, (byte) -126, var20, arg2);
        }
        int var22 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                ++var6;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var22 -= var15;
            int var23 = -var7 + arg5;
            int var24 = arg5 + var7;
            if (var24 >= class675.field9512 && ~class395.field5484 <= ~var23) {
                int var25 = class325.method1901(arg4 + var6, class490.field6592, class116.field1628, true);
                int var26 = class325.method1901(-var6 + arg4, class490.field6592, class116.field1628, true);
                if (class675.field9512 <= var23) {
                    class721.method4044(class591.field8480[var23], var26, (byte) -122, var25, arg2);
                }
                if (class395.field5484 >= var24) {
                    class721.method4044(class591.field8480[var24], var26, (byte) -128, var25, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZILpaa;I)V", line = 210)
    public static final void method1540(int arg0, boolean arg1, int arg2, class712 arg3, int arg4) {
        ++field3375;
        int var5 = arg3.field9966;
        int var6 = 120 / ((-67 - arg2) / 56);
        if (arg3.field10020 == 0) {
            arg3.field9966 = arg3.field9982;
        } else if (~arg3.field10020 != -2) {
            if (arg3.field10020 == 2) {
                arg3.field9966 = arg3.field9982 * arg0 >> 14;
            }
        } else {
            arg3.field9966 = -arg3.field9982 + arg0;
        }
        int var7 = arg3.field10011;
        if (arg3.field9993 == 0) {
            arg3.field10011 = arg3.field10103;
        } else if (arg3.field9993 != 1) {
            if (arg3.field9993 == 2) {
                arg3.field10011 = arg3.field10103 * arg4 >> 14;
            }
        } else {
            arg3.field10011 = arg4 - arg3.field10103;
        }
        if (~arg3.field10020 == -5) {
            arg3.field9966 = arg3.field9934 * arg3.field10011 / arg3.field10065;
        }
        if (~arg3.field9993 == -5) {
            arg3.field10011 = arg3.field9966 * arg3.field10065 / arg3.field9934;
        }
        if (class399.field5526 && (~client.method2675(arg3).field1372 != -1 || arg3.field10039 == 0)) {
            if (~arg3.field10011 > -6 && arg3.field9966 < 5) {
                arg3.field10011 = 5;
                arg3.field9966 = 5;
            } else {
                if (~arg3.field9966 >= -1) {
                    arg3.field9966 = 5;
                }
                if (~arg3.field10011 >= -1) {
                    arg3.field10011 = 5;
                }
            }
        }
        if (class224.field3145 == arg3.field9930) {
            class713.field10107 = arg3;
        }
        if (arg1 && arg3.field10061 != null) {
            if (arg3.field9966 != var5 || arg3.field10011 != var7) {
                class700 var8 = new class700();
                var8.field9745 = arg3;
                var8.field9757 = arg3.field10061;
                class14.field200.method3116(29066, var8);
            }
        }
    }
}
