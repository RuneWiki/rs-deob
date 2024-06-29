import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class203 extends class228 {

    @OriginalMember(owner = "client!te", name = "zc", descriptor = "Loc;")
    public static class151 field3607 = class137.method873(2, "<img=0>");

    @OriginalMember(owner = "client!te", name = "Ec", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!te", name = "yc", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!te", name = "Bc", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!te", name = "Cc", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!te", name = "Dc", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!te", name = "Fc", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!te", name = "Ac", descriptor = "Lga;")
    public class67 field3608;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3610;
        if (this.field3608 != null) {
            class115 var11 = super.field3991 != -1 && ~super.field4004 == -1 ? class197.method1233(-122, super.field3991) : null;
            class115 var12 = ~super.field3993 == 0 || super.field4002 == super.field3993 && var11 != null ? null : class197.method1233(96, super.field3993);
            class18 var13 = this.field3608.method447(-103, var12, super.field3974, var11, super.field4020);
            if (var13 != null) {
                int var14 = 0;
                super.field4010 = var13.method74();
                int var15 = 0;
                int var16 = 0;
                if (~this.field3608.field1283 != -1 && ~this.field3608.field1316 != -1) {
                    short var17 = this.field3608.field1283;
                    int var18 = class61.field1191[arg0];
                    int var19 = class61.field1208[arg0];
                    int var20 = -var17 / 2;
                    short var21 = this.field3608.field1316;
                    int var22 = -var21 / 2;
                    int var23 = var18 * var22 + var19 * var20 >> 16;
                    int var24 = var19 * var22 + -(var18 * var20) >> 16;
                    int var25 = class195.method1225(super.field3976 + var23, class234.field4325, super.field4029 - -var24, (byte) -118);
                    int var26 = var17 / 2;
                    int var27 = -var21 / 2;
                    int var28 = var19 * var27 + -(var18 * var26) >> 16;
                    int var29 = -var17 / 2;
                    int var30 = var18 * var27 + var19 * var26 >> 16;
                    int var31 = class195.method1225(super.field3976 + var30, class234.field4325, super.field4029 + var28, (byte) -118);
                    int var32 = var21 / 2;
                    int var33 = var19 * var32 + -(var18 * var29) >> 16;
                    int var34 = var17 / 2;
                    int var35 = var21 / 2;
                    int var36 = var18 * var32 - -(var19 * var29) >> 16;
                    int var37 = class195.method1225(super.field3976 + var36, class234.field4325, super.field4029 - -var33, (byte) -118);
                    int var38 = var18 * var35 + var19 * var34 >> 16;
                    int var39 = var19 * var35 + -(var18 * var34) >> 16;
                    int var40 = class195.method1225(super.field3976 + var38, class234.field4325, super.field4029 + var39, (byte) -118);
                    int var41 = var25 < var31 ? var25 : var31;
                    int var42 = var25 + var40;
                    int var43 = ~var40 < ~var31 ? var31 : var40;
                    if (var31 + var37 < var42) {
                        var42 = var31 + var37;
                    }
                    int var44 = var37 > var25 ? var25 : var37;
                    int var45 = ~var37 > ~var40 ? var37 : var40;
                    var14 = 2047 & (int) (325.95D * Math.atan2((double) (-var45 + var41), (double) var21));
                    if (~var14 != -1) {
                        var13.method160(var14);
                    }
                    var16 = (int) (Math.atan2((double) (-var43 + var44), (double) var17) * 325.95D) & 2047;
                    if (var16 != 0) {
                        var13.method158(var16);
                    }
                    var15 = (var42 >> 1) + -super.field3989;
                    if (var15 != 0) {
                        var13.method149(0, var15, 0);
                    }
                }
                class18 var46 = null;
                if (super.field4016 != -1 && ~super.field4030 != 0) {
                    class52 var47 = class19.method166(super.field4016, 22883);
                    var46 = var47.method359(false, super.field4030);
                    if (var46 != null) {
                        var46.method149(0, -super.field4008, 0);
                        if (var47.field1041) {
                            if (~var14 != -1) {
                                var46.method160(var14);
                            }
                            if (~var16 != -1) {
                                var46.method158(var16);
                            }
                            if (var15 != 0) {
                                var46.method149(0, var15, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class76) var13).method497(var46);
                }
                if (this.field3608.field1317 == 1) {
                    var13.field393 = true;
                }
                var13.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
    public final int method74() {
        ++field3613;
        return super.field4010;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Loc;ILoc;Loc;)V")
    public static final void method1286(class151 arg0, int arg1, class151 arg2, class151 arg3) {
        if (arg1 == -28588) {
            class160.field2895 = arg3;
            ++field3609;
            class160.field2879 = arg0;
            class160.field2873 = arg2;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
    public final boolean method173(int arg0) {
        ++field3611;
        if (arg0 != 2) {
            method1287(3);
        }
        return this.field3608 != null;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method1287(int arg0) {
        if (arg0 == 11356) {
            field3607 = null;
        }
    }
}
