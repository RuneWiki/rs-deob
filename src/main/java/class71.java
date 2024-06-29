import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class71 extends class142 {

    @OriginalMember(owner = "client!ie", name = "Wb", descriptor = "Lli;")
    public static class185 field1243 = class245.method1649(" zuerst von Ihrer Ignorieren)2Liste(Q", 124);

    @OriginalMember(owner = "client!ie", name = "Yb", descriptor = "Lli;")
    public static class185 field1245 = class245.method1649("jaune:", -83);

    @OriginalMember(owner = "client!ie", name = "Rb", descriptor = "[[[Lfl;")
    public static class191[][][] field1238 = new class191[4][104][104];

    @OriginalMember(owner = "client!ie", name = "dc", descriptor = "Lli;")
    public static class185 field1250 = class245.method1649("null", 1);

    @OriginalMember(owner = "client!ie", name = "fc", descriptor = "Lli;")
    public static class185 field1252 = class245.method1649(" )2> <col=ff9040>", -4);

    @OriginalMember(owner = "client!ie", name = "Qb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ie", name = "Sb", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ie", name = "Tb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ie", name = "Vb", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ie", name = "Xb", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ie", name = "Zb", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ie", name = "ac", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ie", name = "bc", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ie", name = "cc", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ie", name = "ec", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ie", name = "Pb", descriptor = "Lca;")
    public class81 field1236;

    @OriginalMember(owner = "client!ie", name = "Ub", descriptor = "[[B")
    public static byte[][] field1241;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z")
    public final boolean method463(boolean arg0) {
        if (!arg0) {
            field1252 = null;
        }
        ++field1237;
        return this.field1236 != null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        ++field1244;
        if (this.field1236 != null) {
            class2 var13 = ~super.field2655 != 0 && ~super.field2691 == -1 ? class253.method1712(super.field2655, -119) : null;
            class2 var14 = ~super.field2654 == 0 || ~super.field2693 == ~super.field2654 && var13 != null ? null : class253.method1712(super.field2654, -128);
            class98 var15 = this.field1236.method526(var14, super.field2663, var13, (byte) -83, super.field2652);
            if (var15 != null) {
                super.field2715 = var15.method62();
                class81 var16 = this.field1236;
                if (var16.field1411 != null) {
                    var16 = var16.method525((byte) -88);
                }
                if (class194.field3578 && var16.field1451) {
                    class98 var17 = class181.method1277(this.field1236.field1427, var14 != null ? var14 : var13, this.field1236.field1418, super.field2711, super.field2694, super.field2690, var14 != null ? super.field2652 : super.field2663, this.field1236.field1426, super.field2687, this.field1236.field1414, arg0, this.field1236.field1452, (byte) 2, var15);
                    var17.method48(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2692);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (this.field1236.field1466 != 0 || this.field1236.field1432 != 0) {
                    int var21 = class167.field3110[arg0];
                    int var22 = class167.field3112[arg0];
                    short var23 = this.field1236.field1466;
                    short var24 = this.field1236.field1432;
                    int var25 = -var24 / 2;
                    int var26 = -var23 / 2;
                    int var27 = var21 * var25 + var22 * var26 >> 16;
                    int var28 = var22 * var25 + -(var21 * var26) >> 16;
                    int var29 = var23 / 2;
                    int var30 = class236.method1606(82, super.field2687 - -var28, super.field2694 + var27, class265.field4703);
                    int var31 = -var24 / 2;
                    int var32 = var21 * var31 - -(var22 * var29) >> 16;
                    int var33 = var22 * var31 + -(var21 * var29) >> 16;
                    int var34 = class236.method1606(66, super.field2687 + var33, super.field2694 + var32, class265.field4703);
                    int var35 = var24 / 2;
                    int var36 = -var23 / 2;
                    int var37 = var22 * var35 + -(var21 * var36) >> 16;
                    int var38 = var21 * var35 + var22 * var36 >> 16;
                    int var39 = var23 / 2;
                    int var40 = class236.method1606(35, super.field2687 - -var37, super.field2694 - -var38, class265.field4703);
                    int var41 = var24 / 2;
                    int var42 = var21 * var41 + var22 * var39 >> 16;
                    int var43 = var22 * var41 + -(var21 * var39) >> 16;
                    int var44 = class236.method1606(63, super.field2687 + var43, super.field2694 + var42, class265.field4703);
                    int var45 = var30 + var44;
                    if (var34 + var40 < var45) {
                        var45 = var34 - -var40;
                    }
                    int var46 = ~var40 <= ~var44 ? var44 : var40;
                    int var47 = ~var30 > ~var34 ? var30 : var34;
                    if (var24 != 0) {
                        var18 = (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var24)) & 2047;
                        if (~var18 != -1) {
                            var15.method635(var18);
                        }
                    }
                    int var48 = var44 > var34 ? var34 : var44;
                    int var49 = ~var30 > ~var40 ? var30 : var40;
                    if (~var23 != -1) {
                        var20 = (int) (325.95D * Math.atan2((double) (-var48 + var49), (double) var23)) & 2047;
                        if (~var20 != -1) {
                            var15.method634(var20);
                        }
                    }
                    var19 = (var45 >> 1) + -super.field2711;
                    if (var19 != 0) {
                        var15.method628(0, var19, 0);
                    }
                }
                class98 var50 = null;
                if (super.field2709 != -1 && ~super.field2656 != 0) {
                    class233 var51 = class255.method1728(super.field2709, (byte) 95);
                    var50 = var51.method1595(7208, super.field2656);
                    if (var50 != null) {
                        var50.method628(0, -super.field2674, 0);
                        if (var51.field4201) {
                            if (~var18 != -1) {
                                var50.method635(var18);
                            }
                            if (~var20 != -1) {
                                var50.method634(var20);
                            }
                            if (~var19 != -1) {
                                var50.method628(0, var19, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class222) var15).method1537(var50);
                }
                if (this.field1236.field1452 == 1) {
                    var15.field1822 = true;
                }
                var15.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2692);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)Lrk;")
    public static final class148 method464(byte arg0, int arg1) {
        ++field1246;
        if (arg0 != 119) {
            return null;
        } else {
            class148 var2 = (class148) class5.field130.method1615(-28166, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3;
                if (~arg1 <= -32769) {
                    var3 = class124.field2234.method1688(0, 32767 & arg1, 0);
                } else {
                    var3 = class278.field4939.method1688(arg0 ^ 119, arg1, 0);
                }
                class148 var4 = new class148();
                if (var3 != null) {
                    var4.method1055(arg0 ^ 10, new class118(var3));
                }
                if (arg1 >= 32768) {
                    var4.method1048(-3);
                }
                class5.field130.method1620(var4, (byte) 49, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static void method465(int arg0) {
        field1250 = null;
        field1238 = null;
        if (arg0 > -50) {
            field1241 = null;
        }
        field1241 = null;
        field1252 = null;
        field1243 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1251;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
    public final int method62() {
        ++field1249;
        return super.field2715;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1247;
        if (this.field1236 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
    public static final int method466(int arg0, int arg1) {
        if (arg1 != -10998) {
            method464((byte) -124, -69);
        }
        ++field1242;
        return arg0 == 16711935 ? -1 : class191.method1380(96, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lca;I)V")
    public final void method467(class81 arg0, int arg1) {
        ++field1248;
        this.field1236 = arg0;
        if (super.field2692 != null) {
            super.field2692.method120();
        }
        if (arg1 < 3) {
            method466(-101, -87);
        }
    }
}
