import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class583 extends class332 {

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "J")
    public static long field8145 = 0L;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lwp;")
    public static class453 field8146 = new class453(87, 6);

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[I")
    public static int[] field8148 = new int[1000];

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "[I")
    public static int[] field8151 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "J")
    public static long field8142;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Ljf;")
    public static class28 field8147;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Lhl;")
    public static class322 field8149;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method3211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8141;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg5 + arg1;
        int var12 = -arg5 + arg3;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = -123 % ((-8 - arg4) / 38);
        int var26 = (-var22 + 1) * var15 + var19;
        int var27 = var16 - (var22 + -1) * var20;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 + -3) * var18;
        int var34 = var19 * 3;
        int var35 = (var22 + -3) * var20;
        int var36 = var29;
        int var37 = (arg3 + -1) * var28;
        int var38 = var31;
        int var39 = (var12 + -1) * var30;
        int[] var40 = class550.field7650[arg6];
        class57.method362(-arg1 + arg0, var40, arg2, -var11 + arg0, -107);
        class57.method362(-var11 + arg0, var40, arg7, arg0 + var11, -128);
        class57.method362(arg0 - -var11, var40, arg2, arg0 - -arg1, 65);
        while (~var9 < -1) {
            boolean var41 = ~var9 >= ~var12;
            if (var41) {
                if (var26 < 0) {
                    while (~var26 > -1) {
                        var27 += var38;
                        var26 += var34;
                        var38 += var31;
                        ++var10;
                        var34 += var31;
                    }
                }
                if (var27 < 0) {
                    var26 += var34;
                    var27 += var38;
                    var38 += var31;
                    ++var10;
                    var34 += var31;
                }
                var27 += -var35;
                var26 += -var39;
                var35 -= var30;
                var39 -= var30;
            }
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var23 += var32;
                    var24 += var36;
                    var36 += var29;
                    var32 += var29;
                    ++var8;
                }
            }
            if (var24 < 0) {
                var23 += var32;
                var24 += var36;
                var32 += var29;
                var36 += var29;
                ++var8;
            }
            var24 += -var33;
            var23 += -var37;
            --var9;
            var37 -= var28;
            var33 -= var28;
            int var42 = -var9 + arg6;
            int var43 = arg6 - -var9;
            int var44 = arg0 + var8;
            int var45 = -var8 + arg0;
            if (var41) {
                int var46 = arg0 + var10;
                int var47 = -var10 + arg0;
                class57.method362(var45, class550.field7650[var42], arg2, var47, 47);
                class57.method362(var47, class550.field7650[var42], arg7, var46, 119);
                class57.method362(var46, class550.field7650[var42], arg2, var44, -113);
                class57.method362(var45, class550.field7650[var43], arg2, var47, 20);
                class57.method362(var47, class550.field7650[var43], arg7, var46, 39);
                class57.method362(var46, class550.field7650[var43], arg2, var44, -116);
            } else {
                class57.method362(var45, class550.field7650[var42], arg2, var44, 62);
                class57.method362(var45, class550.field7650[var43], arg2, var44, 102);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)V", line = 174)
    public final void method2(int arg0, int arg1, byte arg2, int arg3) {
        super.field4247 = arg0;
        super.field4235 = arg3;
        ++field8144;
        if (arg2 <= -18) {
            super.field4236 = arg1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V", line = 192)
    public static void method3212(int arg0) {
        field8148 = null;
        field8149 = null;
        if (arg0 != 0) {
            method3211(77, 57, 55, -115, 106, -18, -3, 44);
        }
        field8151 = null;
        field8146 = null;
        field8147 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IF)V", line = 211)
    public final void method1(int arg0, float arg1) {
        ++field8150;
        super.field4239 = arg1;
        if (arg0 != 0) {
            field8146 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIF)V", line = 222)
    public class583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)V", line = 226)
    public static final void method3213(int arg0) {
        int var1 = 0;
        if (arg0 < 26) {
            field8147 = null;
        }
        while (~var1 > ~class683.field9599.length) {
            for (int var2 = 0; class683.field9599[var1].length > var2; ++var2) {
                class683.field9599[var1][var2] = class286.field3552;
            }
            ++var1;
        }
        ++field8143;
    }
}
