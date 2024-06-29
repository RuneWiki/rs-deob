import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class170 extends class33 {

    @OriginalMember(owner = "client!bc", name = "Yb", descriptor = "Ljd;")
    public static class86 field3132 = class122.method868("::fps ", true);

    @OriginalMember(owner = "client!bc", name = "Xb", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!bc", name = "Zb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!bc", name = "ac", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!bc", name = "bc", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!bc", name = "Wb", descriptor = "Lhd;")
    public class11 field3130;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1219(boolean arg0) {
        field3132 = null;
        if (!arg0) {
            field3132 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
    public final int method233() {
        ++field3131;
        return super.field677;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZILbj;Lbj;)Lwk;")
    public static final class259 method1220(int arg0, boolean arg1, int arg2, class151 arg3, class151 arg4) {
        if (arg1) {
            field3132 = null;
        }
        ++field3134;
        return !class163.method1181(arg4, arg0, 10475, arg2) ? null : class25.method180(arg3.method1084((byte) -121, arg0, arg2), true);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
    public final boolean method238(int arg0) {
        if (arg0 != -24869) {
            this.method230(57, 6, 11, 1, -15, 69, -65, 25, -118L);
        }
        ++field3133;
        return this.field3130 != null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3135;
        if (this.field3130 != null) {
            class122 var11 = ~super.field683 != 0 && ~super.field724 == -1 ? class133.method952(super.field683, 127) : null;
            class122 var12 = ~super.field701 == 0 || super.field739 == super.field701 && var11 != null ? null : class133.method952(super.field701, 127);
            class32 var13 = this.field3130.method90(var12, super.field708, super.field693, -2, var11);
            if (var13 != null) {
                super.field677 = var13.method233();
                class11 var14 = this.field3130;
                if (var14.field348 != null) {
                    var14 = var14.method87(true);
                }
                if (class272.field4769 && var14.field329) {
                    class32 var15 = class10.method82(arg0, super.field694, this.field3130.field338, super.field685, var12 == null ? var11 : var12, this.field3130.field342, this.field3130.field379, this.field3130.field333, 15, this.field3130.field337, super.field676, var12 != null ? super.field693 : super.field708, super.field744, var13);
                    var15.method230(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field3130.field375 != -1 || this.field3130.field368 != 0) {
                    int var19 = class145.field2746[arg0];
                    short var20 = this.field3130.field368;
                    short var21 = this.field3130.field375;
                    int var22 = -var21 / 2;
                    int var23 = class145.field2742[arg0];
                    int var24 = -var20 / 2;
                    int var25 = var19 * var24 + var22 * var23 >> 16;
                    int var26 = var23 * var24 + -(var19 * var22) >> 16;
                    int var27 = class30.method198(31482, super.field676 + var25, super.field685 + var26, class180.field3244);
                    int var28 = var21 / 2;
                    int var29 = -var20 / 2;
                    int var30 = var23 * var29 + -(var19 * var28) >> 16;
                    int var31 = var19 * var29 + var23 * var28 >> 16;
                    int var32 = class30.method198(31482, super.field676 + var31, super.field685 - -var30, class180.field3244);
                    int var33 = var20 / 2;
                    int var34 = var21 / 2;
                    int var35 = var20 / 2;
                    int var36 = -var21 / 2;
                    int var37 = var19 * var35 - -(var23 * var34) >> 16;
                    int var38 = var19 * var33 - -(var23 * var36) >> 16;
                    int var39 = var23 * var35 - var19 * var34 >> 16;
                    int var40 = var23 * var33 + -(var19 * var36) >> 16;
                    int var41 = class30.method198(31482, super.field676 + var38, super.field685 + var40, class180.field3244);
                    int var42 = class30.method198(31482, super.field676 - -var37, super.field685 - -var39, class180.field3244);
                    int var43 = var27 + var42;
                    int var44 = var42 > var41 ? var41 : var42;
                    int var45 = ~var32 < ~var27 ? var27 : var32;
                    if (var32 - -var41 < var43) {
                        var43 = var32 + var41;
                    }
                    if (~var20 != -1) {
                        var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var44 + var45), (double) var20));
                        if (var16 != 0) {
                            var13.method231(var16);
                        }
                    }
                    int var46 = var41 > var27 ? var27 : var41;
                    int var47 = var42 > var32 ? var32 : var42;
                    if (~var21 != -1) {
                        var17 = 2047 & (int) (325.95D * Math.atan2((double) (-var47 + var46), (double) var21));
                        if (var17 != 0) {
                            var13.method228(var17);
                        }
                    }
                    var18 = (var43 >> 1) + -super.field744;
                    if (~var18 != -1) {
                        var13.method215(0, var18, 0);
                    }
                }
                class32 var48 = null;
                if (super.field690 != -1 && super.field691 != -1) {
                    class127 var49 = class219.method1547(super.field690, -122);
                    var48 = var49.method899(37, super.field691);
                    if (var48 != null) {
                        var48.method215(0, -super.field722, 0);
                        if (var49.field2451) {
                            if (var16 != 0) {
                                var48.method231(var16);
                            }
                            if (~var17 != -1) {
                                var48.method228(var17);
                            }
                            if (var18 != 0) {
                                var48.method215(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class89) var13).method660(var48);
                }
                if (~this.field3130.field333 == -2) {
                    var13.field673 = true;
                }
                var13.method230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
