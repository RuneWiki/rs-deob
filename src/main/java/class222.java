import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class222 extends class18 {

    @OriginalMember(owner = "client!gg", name = "Ob", descriptor = "Lqe;")
    public static class168 field3807 = class66.method448("Gegenstand f-Ur Mitglieder", 11);

    @OriginalMember(owner = "client!gg", name = "Wb", descriptor = "I")
    public static int field3815 = 1;

    @OriginalMember(owner = "client!gg", name = "Sb", descriptor = "I")
    public static int field3811 = 0;

    @OriginalMember(owner = "client!gg", name = "Xb", descriptor = "Lqe;")
    public static class168 field3816 = class66.method448("", -109);

    @OriginalMember(owner = "client!gg", name = "Mb", descriptor = "Lqe;")
    public static class168 field3805 = field3816;

    @OriginalMember(owner = "client!gg", name = "Rb", descriptor = "Lqe;")
    public static class168 field3810 = field3816;

    @OriginalMember(owner = "client!gg", name = "Nb", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!gg", name = "Pb", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!gg", name = "Tb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!gg", name = "Ub", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!gg", name = "Yb", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!gg", name = "Zb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!gg", name = "Vb", descriptor = "Lfj;")
    public class180 field3814;

    @OriginalMember(owner = "client!gg", name = "Qb", descriptor = "[Luj;")
    public static class158[] field3809;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Z")
    public final boolean method87(int arg0) {
        ++field3817;
        if (arg0 != -1570135920) {
            field3811 = -68;
        }
        return this.field3814 != null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3816 = null;
        if (arg0 > 39) {
            field3810 = null;
            field3807 = null;
            field3805 = null;
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3818;
        if (this.field3814 != null) {
            class237 var11 = ~super.field216 != 0 && super.field170 == 0 ? class213.method1370(-1, super.field216) : null;
            class237 var12 = super.field223 == -1 || super.field224 == super.field223 && var11 != null ? null : class213.method1370(-1, super.field223);
            class188 var13 = this.field3814.method1194(-120, super.field169, super.field189, var12, var11);
            if (var13 != null) {
                super.field184 = var13.method43();
                class180 var14 = this.field3814;
                if (var14.field3206 != null) {
                    var14 = var14.method1192(-1);
                }
                if (class253.field4382 && var14.field3211) {
                    class188 var15 = class18.method89(super.field213, this.field3814.field3189, -1, super.field166, this.field3814.field3205, super.field190, arg0, this.field3814.field3175, super.field202, var12 != null ? var12 : var11, this.field3814.field3160, var12 == null ? super.field189 : super.field169, var13, this.field3814.field3212);
                    var15.method49(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field3814.field3185 != -1 && ~this.field3814.field3167 != -1) {
                    int var19 = class248.field4297[arg0];
                    int var20 = class248.field4301[arg0];
                    short var21 = this.field3814.field3185;
                    short var22 = this.field3814.field3167;
                    int var23 = -var22 / 2;
                    int var24 = var21 / 2;
                    int var25 = -var22 / 2;
                    int var26 = -var21 / 2;
                    int var27 = var20 * var25 + -(var19 * var26) >> 16;
                    int var28 = var19 * var23 - -(var20 * var24) >> 16;
                    int var29 = var20 * var23 - var19 * var24 >> 16;
                    int var30 = var19 * var25 + var20 * var26 >> 16;
                    int var31 = class236.method1535(super.field190 - -var30, class196.field3401, super.field166 - -var27, 0);
                    int var32 = -var21 / 2;
                    int var33 = var22 / 2;
                    int var34 = class236.method1535(super.field190 + var28, class196.field3401, super.field166 - -var29, 0);
                    int var35 = var20 * var33 + -(var19 * var32) >> 16;
                    int var36 = var19 * var33 + var20 * var32 >> 16;
                    int var37 = class236.method1535(super.field190 + var36, class196.field3401, super.field166 + var35, 0);
                    int var38 = var21 / 2;
                    int var39 = var22 / 2;
                    int var40 = var19 * var39 - -(var20 * var38) >> 16;
                    int var41 = var34 > var31 ? var31 : var34;
                    int var42 = ~var37 < ~var31 ? var31 : var37;
                    int var43 = var20 * var39 + -(var19 * var38) >> 16;
                    int var44 = class236.method1535(super.field190 + var40, class196.field3401, super.field166 + var43, 0);
                    int var45 = ~var37 > ~var44 ? var37 : var44;
                    int var46 = ~var34 <= ~var44 ? var44 : var34;
                    int var47 = var31 + var44;
                    if (var47 > var34 + var37) {
                        var47 = var34 + var37;
                    }
                    var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var45 + var41), (double) var22));
                    if (var16 != 0) {
                        var13.method223(var16);
                    }
                    var17 = (int) (325.95D * Math.atan2((double) (-var46 + var42), (double) var21)) & 2047;
                    if (var17 != 0) {
                        var13.method242(var17);
                    }
                    var18 = (var47 >> 1) + -super.field202;
                    if (~var18 != -1) {
                        var13.method245(0, var18, 0);
                    }
                }
                class188 var48 = null;
                if (super.field198 != -1 && super.field183 != -1) {
                    class213 var49 = class128.method865(super.field198, 1);
                    var48 = var49.method1375(-89, super.field183);
                    if (var48 != null) {
                        var48.method245(0, -super.field218, 0);
                        if (var49.field3676) {
                            if (var16 != 0) {
                                var48.method223(var16);
                            }
                            if (~var17 != -1) {
                                var48.method242(var17);
                            }
                            if (~var18 != -1) {
                                var48.method245(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class37) var13).method247(var48);
                }
                if (this.field3814.field3189 == 1) {
                    var13.field3294 = true;
                }
                var13.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()I")
    public final int method43() {
        ++field3812;
        return super.field184;
    }
}
