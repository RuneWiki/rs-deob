import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class38 extends class222 {

    @OriginalMember(owner = "client!ok", name = "Tb", descriptor = "Lhj;")
    private static class69 field520 = class181.method1318("Connection lost)3", (byte) -126);

    @OriginalMember(owner = "client!ok", name = "Zb", descriptor = "[I")
    public static int[] field526 = new int[500];

    @OriginalMember(owner = "client!ok", name = "Pb", descriptor = "Lhj;")
    public static class69 field516 = class181.method1318(" x ", (byte) -111);

    @OriginalMember(owner = "client!ok", name = "Sb", descriptor = "Lhj;")
    public static class69 field519 = field520;

    @OriginalMember(owner = "client!ok", name = "Yb", descriptor = "[I")
    public static int[] field525 = new int[2048];

    @OriginalMember(owner = "client!ok", name = "ac", descriptor = "I")
    public static int field527 = 2;

    @OriginalMember(owner = "client!ok", name = "bc", descriptor = "Lka;")
    public static class243 field528 = new class243();

    @OriginalMember(owner = "client!ok", name = "dc", descriptor = "[I")
    public static int[] field530 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ok", name = "gc", descriptor = "Lhj;")
    private static class69 field533 = class181.method1318("cyan:", (byte) -123);

    @OriginalMember(owner = "client!ok", name = "cc", descriptor = "Lhj;")
    public static class69 field529 = field533;

    @OriginalMember(owner = "client!ok", name = "ec", descriptor = "Lhj;")
    public static class69 field531 = field533;

    @OriginalMember(owner = "client!ok", name = "Rb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ok", name = "Vb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ok", name = "Wb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ok", name = "Xb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ok", name = "fc", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ok", name = "hc", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ok", name = "Qb", descriptor = "Lvi;")
    public class186 field517;

    @OriginalMember(owner = "client!ok", name = "Ub", descriptor = "Lnc;")
    public static class83 field521;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IB)V")
    public static final void method207(int arg0, byte arg1) {
        class109.field2089 = -1;
        class109.field2089 = -1;
        if (arg1 != -109) {
            field529 = null;
        }
        if (arg0 == 37) {
            class246.field4502 = 3.0F;
        } else if (~arg0 != -51) {
            if (arg0 == 75) {
                class246.field4502 = 6.0F;
            } else {
                class246.field4502 = 8.0F;
            }
        } else {
            class246.field4502 = 4.0F;
        }
        ++field524;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
    public static void method208(int arg0) {
        field519 = null;
        field516 = null;
        field533 = null;
        field525 = null;
        field528 = null;
        field530 = null;
        field526 = null;
        field521 = null;
        int var1 = 102 % ((82 - arg0) / 37);
        field520 = null;
        field529 = null;
        field531 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[B)Lhj;")
    public static final class69 method209(int arg0, int arg1, int arg2, byte[] arg3) {
        class69 var4 = new class69();
        if (arg0 < 91) {
            method208(26);
        }
        var4.field1351 = new byte[arg2];
        ++field522;
        var4.field1331 = 0;
        for (int var5 = arg1; arg1 - -arg2 > var5; ++var5) {
            if (arg3[var5] != 0) {
                var4.field1351[var4.field1331++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        if (arg0 != -30948) {
            method207(-100, (byte) -117);
        }
        ++field532;
        return this.field517 != null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
    public final int method211() {
        ++field518;
        return super.field3986;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field523;
        if (this.field517 != null) {
            class159 var11 = super.field4010 != -1 && super.field4006 == 0 ? class211.method1521(-81, super.field4010) : null;
            class159 var12 = ~super.field3996 == 0 || super.field3996 == super.field3982 && var11 != null ? null : class211.method1521(-53, super.field3996);
            class92 var13 = this.field517.method1352(var11, (byte) 53, super.field4055, super.field4022, var12);
            if (var13 != null) {
                super.field3986 = var13.method211();
                class186 var14 = this.field517;
                if (var14.field3375 != null) {
                    var14 = var14.method1358((byte) -36);
                }
                if (class233.field4261 && var14.field3403) {
                    class92 var15 = class59.method362(super.field4044, super.field3985, var12 != null ? super.field4055 : super.field4022, this.field517.field3360, arg0, this.field517.field3359, super.field4005, var12 == null ? var11 : var12, super.field4002, -5, this.field517.field3357, var13, this.field517.field3384, this.field517.field3362);
                    var15.method212(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field517.field3378 != -1 || this.field517.field3405 != 0) {
                    int var19 = class178.field3247[arg0];
                    short var20 = this.field517.field3378;
                    int var21 = class178.field3232[arg0];
                    short var22 = this.field517.field3405;
                    int var23 = -var22 / 2;
                    int var24 = -var20 / 2;
                    int var25 = var19 * var23 - -(var21 * var24) >> 16;
                    int var26 = -var22 / 2;
                    int var27 = var20 / 2;
                    int var28 = var21 * var23 + -(var19 * var24) >> 16;
                    int var29 = var19 * var26 + var21 * var27 >> 16;
                    int var30 = class156.method1179(super.field3985 + var25, super.field4005 + var28, 114, class52.field927);
                    int var31 = var21 * var26 + -(var19 * var27) >> 16;
                    int var32 = class156.method1179(super.field3985 + var29, super.field4005 - -var31, 67, class52.field927);
                    int var33 = var22 / 2;
                    int var34 = -var20 / 2;
                    int var35 = var19 * var33 + var21 * var34 >> 16;
                    int var36 = var20 / 2;
                    int var37 = var21 * var33 + -(var19 * var34) >> 16;
                    int var38 = var22 / 2;
                    int var39 = class156.method1179(super.field3985 + var35, super.field4005 + var37, 35, class52.field927);
                    int var40 = var19 * var38 - -(var21 * var36) >> 16;
                    int var41 = var30 >= var32 ? var32 : var30;
                    int var42 = var21 * var38 + -(var19 * var36) >> 16;
                    int var43 = var30 >= var39 ? var39 : var30;
                    int var44 = class156.method1179(super.field3985 + var40, super.field4005 + var42, 47, class52.field927);
                    int var45 = var39 >= var44 ? var44 : var39;
                    int var46 = ~var44 >= ~var32 ? var44 : var32;
                    int var47 = var30 + var44;
                    if (~var47 < ~(var32 + var39)) {
                        var47 = var32 + var39;
                    }
                    if (var22 != 0) {
                        var16 = (int) (325.95D * Math.atan2((double) (var41 - var45), (double) var22)) & 2047;
                        if (var16 != 0) {
                            var13.method663(var16);
                        }
                    }
                    if (~var20 != -1) {
                        var18 = 2047 & (int) (325.95D * Math.atan2((double) (-var46 + var43), (double) var20));
                        if (var18 != 0) {
                            var13.method668(var18);
                        }
                    }
                    var17 = (var47 >> 1) + -super.field4044;
                    if (~var17 != -1) {
                        var13.method652(0, var17, 0);
                    }
                }
                class92 var48 = null;
                if (~super.field3992 != 0 && super.field4027 != -1) {
                    class39 var49 = class213.method1533(128, super.field3992);
                    var48 = var49.method214(super.field4027, (byte) 116);
                    if (var48 != null) {
                        var48.method652(0, -super.field4035, 0);
                        if (var49.field557) {
                            if (~var16 != -1) {
                                var48.method663(var16);
                            }
                            if (var18 != 0) {
                                var48.method668(var18);
                            }
                            if (var17 != 0) {
                                var48.method652(0, var17, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class238) var13).method1690(var48);
                }
                if (this.field517.field3359 == 1) {
                    var13.field1731 = true;
                }
                var13.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
