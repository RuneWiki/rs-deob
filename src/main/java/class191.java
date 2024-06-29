import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class191 extends class218 {

    @OriginalMember(owner = "client!rf", name = "Jb", descriptor = "Li;")
    public static class88 field3686 = class208.method1425(105, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!rf", name = "Gb", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!rf", name = "Kb", descriptor = "[I")
    public static int[] field3687 = new int[128];

    @OriginalMember(owner = "client!rf", name = "Ib", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!rf", name = "Lb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!rf", name = "Mb", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!rf", name = "Hb", descriptor = "Llf;")
    public class126 field3684;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        if (arg0 != -1) {
            this.method88();
        }
        ++field3688;
        return this.field3684 != null;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field3686 = null;
        field3687 = null;
        if (arg0 != -14327) {
            method1331(100);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
    public final int method88() {
        ++field3689;
        return super.field4109;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3685;
        if (this.field3684 != null) {
            class109 var11 = ~super.field4079 != 0 && super.field4142 == 0 ? class15.method75(super.field4079, (byte) -128) : null;
            class109 var12 = ~super.field4108 == 0 || ~super.field4108 == ~super.field4107 && var11 != null ? null : class15.method75(super.field4108, (byte) -75);
            class30 var13 = this.field3684.method867(0, var12, super.field4129, super.field4103, var11);
            if (var13 != null) {
                super.field4109 = var13.method88();
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                if (this.field3684.field2352 != 0 && this.field3684.field2331 != 0) {
                    int var17 = class173.field3361[arg0];
                    int var18 = class173.field3356[arg0];
                    short var19 = this.field3684.field2352;
                    short var20 = this.field3684.field2331;
                    int var21 = -var19 / 2;
                    int var22 = -var20 / 2;
                    int var23 = var18 * var22 + -(var17 * var21) >> 16;
                    int var24 = var17 * var22 + var18 * var21 >> 16;
                    int var25 = class239.method1586(super.field4138 - -var24, super.field4123 + var23, 2, class149.field2909);
                    int var26 = var19 / 2;
                    int var27 = -var20 / 2;
                    int var28 = var17 * var27 + var18 * var26 >> 16;
                    int var29 = var18 * var27 + -(var17 * var26) >> 16;
                    int var30 = class239.method1586(super.field4138 + var28, super.field4123 + var29, 2, class149.field2909);
                    int var31 = -var19 / 2;
                    int var32 = var20 / 2;
                    int var33 = var17 * var32 + var18 * var31 >> 16;
                    int var34 = var18 * var32 + -(var17 * var31) >> 16;
                    int var35 = var19 / 2;
                    int var36 = var20 / 2;
                    int var37 = var17 * var36 + var18 * var35 >> 16;
                    int var38 = class239.method1586(super.field4138 - -var33, super.field4123 - -var34, 2, class149.field2909);
                    int var39 = var18 * var36 + -(var17 * var35) >> 16;
                    int var40 = class239.method1586(super.field4138 + var37, super.field4123 - -var39, 2, class149.field2909);
                    int var41 = var25 + var40;
                    if (~var41 < ~(var30 - -var38)) {
                        var41 = var30 + var38;
                    }
                    int var42 = var40 <= var30 ? var40 : var30;
                    int var43 = ~var25 > ~var30 ? var25 : var30;
                    int var44 = var25 < var38 ? var25 : var38;
                    int var45 = var40 <= var38 ? var40 : var38;
                    var14 = 2047 & (int) (325.95D * Math.atan2((double) (-var45 + var43), (double) var20));
                    if (~var14 != -1) {
                        var13.method197(var14);
                    }
                    var15 = (int) (Math.atan2((double) (-var42 + var44), (double) var19) * 325.95D) & 2047;
                    if (var15 != 0) {
                        var13.method191(var15);
                    }
                    var16 = (var41 >> 1) + -super.field4099;
                    if (~var16 != -1) {
                        var13.method180(0, var16, 0);
                    }
                }
                class30 var46 = null;
                if (super.field4082 != -1 && super.field4077 != -1) {
                    class33 var47 = class62.method441(super.field4082, (byte) 101);
                    var46 = var47.method209(super.field4077, (byte) -62);
                    if (var46 != null) {
                        var46.method180(0, -super.field4127, 0);
                        if (var47.field527) {
                            if (~var14 != -1) {
                                var46.method197(var14);
                            }
                            if (var15 != 0) {
                                var46.method191(var15);
                            }
                            if (var16 != 0) {
                                var46.method180(0, var16, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class125) var13).method852(var46);
                }
                if (~this.field3684.field2351 == -2) {
                    var13.field494 = true;
                }
                var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
