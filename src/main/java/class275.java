import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class275 extends class63 {

    @OriginalMember(owner = "client!rc", name = "Wb", descriptor = "[I")
    public static int[] field4806 = new int[128];

    @OriginalMember(owner = "client!rc", name = "Tb", descriptor = "Z")
    public static volatile boolean field4803 = false;

    @OriginalMember(owner = "client!rc", name = "Ub", descriptor = "I")
    public static int field4804 = 0;

    @OriginalMember(owner = "client!rc", name = "Qb", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!rc", name = "Xb", descriptor = "I")
    public static int field4807 = 0;

    @OriginalMember(owner = "client!rc", name = "Yb", descriptor = "I")
    public static int field4808 = -1;

    @OriginalMember(owner = "client!rc", name = "Zb", descriptor = "Lsg;")
    public static class30 field4809 = class167.method1221((byte) 33, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!rc", name = "Ob", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!rc", name = "Pb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!rc", name = "Rb", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!rc", name = "Sb", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!rc", name = "Vb", descriptor = "Lsh;")
    public class241 field4805;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
    public final boolean method568(byte arg0) {
        int var2 = 66 % ((arg0 - 13) / 62);
        ++field4801;
        return this.field4805 != null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field4799;
        if (this.field4805 != null) {
            class138 var11 = ~super.field1364 != 0 && ~super.field1386 == -1 ? class193.method1396(-30590, super.field1364) : null;
            class138 var12 = super.field1370 == -1 || super.field1370 == super.field1362 && var11 != null ? null : class193.method1396(-30590, super.field1370);
            class217 var13 = this.field4805.method1708(95, super.field1351, super.field1402, var11, var12);
            if (var13 != null) {
                super.field1405 = var13.method22();
                class241 var14 = this.field4805;
                if (var14.field4295 != null) {
                    var14 = var14.method1700((byte) 59);
                }
                if (class113.field2240 && var14.field4262) {
                    class217 var15 = class21.method197(this.field4805.field4322, var13, super.field1343, super.field1379, var12 == null ? super.field1402 : super.field1351, arg0, this.field4805.field4292, true, this.field4805.field4328, this.field4805.field4270, this.field4805.field4307, super.field1360, var12 != null ? var12 : var11, super.field1336);
                    var15.method21(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field4805.field4323 != 0 || ~this.field4805.field4284 != -1) {
                    int var19 = class213.field3849[arg0];
                    int var20 = class213.field3846[arg0];
                    short var21 = this.field4805.field4323;
                    short var22 = this.field4805.field4284;
                    int var23 = -var22 / 2;
                    int var24 = -var21 / 2;
                    int var25 = var19 * var23 - -(var20 * var24) >> 16;
                    int var26 = var20 * var23 - var19 * var24 >> 16;
                    int var27 = class31.method303(super.field1360 - -var25, super.field1336 - -var26, class159.field2998, -4);
                    int var28 = var21 / 2;
                    int var29 = -var21 / 2;
                    int var30 = -var22 / 2;
                    int var31 = var19 * var30 + var20 * var28 >> 16;
                    int var32 = var20 * var30 + -(var19 * var28) >> 16;
                    int var33 = class31.method303(super.field1360 - -var31, super.field1336 - -var32, class159.field2998, -4);
                    int var34 = var22 / 2;
                    int var35 = var19 * var34 - -(var20 * var29) >> 16;
                    int var36 = var20 * var34 - var19 * var29 >> 16;
                    int var37 = var22 / 2;
                    int var38 = var21 / 2;
                    int var39 = class31.method303(super.field1360 - -var35, super.field1336 + var36, class159.field2998, -4);
                    int var40 = var19 * var37 - -(var20 * var38) >> 16;
                    int var41 = var20 * var37 + -(var19 * var38) >> 16;
                    int var42 = class31.method303(super.field1360 + var40, super.field1336 - -var41, class159.field2998, -4);
                    int var43 = var27 >= var33 ? var33 : var27;
                    int var44 = var42 <= var39 ? var42 : var39;
                    if (var22 != 0) {
                        var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var44 + var43), (double) var22));
                        if (var16 != 0) {
                            var13.method1570(var16);
                        }
                    }
                    int var45 = var27 - -var42;
                    if (~var45 < ~(var33 + var39)) {
                        var45 = var33 + var39;
                    }
                    int var46 = ~var42 < ~var33 ? var33 : var42;
                    int var47 = var39 <= var27 ? var39 : var27;
                    if (~var21 != -1) {
                        var18 = 2047 & (int) (Math.atan2((double) (-var46 + var47), (double) var21) * 325.95D);
                        if (var18 != 0) {
                            var13.method1559(var18);
                        }
                    }
                    var17 = (var45 >> 1) - super.field1379;
                    if (~var17 != -1) {
                        var13.method1549(0, var17, 0);
                    }
                }
                class217 var48 = null;
                if (~super.field1345 != 0 && super.field1403 != -1) {
                    class24 var49 = class263.method1819(super.field1345, -4);
                    var48 = var49.method217(0, super.field1403);
                    if (var48 != null) {
                        var48.method1549(0, -super.field1369, 0);
                        if (var49.field457) {
                            if (~var16 != -1) {
                                var48.method1570(var16);
                            }
                            if (~var18 != -1) {
                                var48.method1559(var18);
                            }
                            if (~var17 != -1) {
                                var48.method1549(0, var17, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class214) var13).method1561(var48);
                }
                if (this.field4805.field4307 == 1) {
                    var13.field3948 = true;
                }
                var13.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method1867(int arg0) {
        if (arg0 != -1) {
            field4803 = false;
        }
        field4809 = null;
        field4806 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)J")
    public static final long method1868(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 != null && var3.field3541 != null ? var3.field3541.field2087 : 0L;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
    public final int method22() {
        ++field4802;
        return super.field1405;
    }
}
