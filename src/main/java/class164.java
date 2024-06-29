import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class164 extends class137 {

    @OriginalMember(owner = "client!hg", name = "Lb", descriptor = "[J")
    public static long[] field2643 = new long[256];

    @OriginalMember(owner = "client!hg", name = "Pb", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!hg", name = "Ub", descriptor = "Z")
    public static boolean field2652;

    @OriginalMember(owner = "client!hg", name = "Xb", descriptor = "Lqj;")
    private static class196 field2655;

    @OriginalMember(owner = "client!hg", name = "Zb", descriptor = "Lqj;")
    public static class196 field2657;

    @OriginalMember(owner = "client!hg", name = "Kb", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!hg", name = "Mb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!hg", name = "Nb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!hg", name = "Ob", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!hg", name = "Rb", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!hg", name = "Sb", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!hg", name = "Vb", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!hg", name = "Yb", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!hg", name = "Qb", descriptor = "La;")
    public class111 field2648;

    @OriginalMember(owner = "client!hg", name = "Tb", descriptor = "[I")
    public static int[] field2651;

    @OriginalMember(owner = "client!hg", name = "Wb", descriptor = "[[[I")
    public static int[][][] field2654;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2654 = null;
        field2651 = null;
        if (arg0 <= 59) {
            method1035(true);
        }
        field2643 = null;
        field2657 = null;
        field2655 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILic;)V")
    public static final void method1032(int arg0, class134 arg1) {
        class72 var2 = (class72) class35.field423.method1551(32768, arg1.field1924.method1330(0));
        ++field2644;
        int var3 = 80 / ((30 - arg0) / 61);
        if (var2 == null) {
            class82.method512((class145) null, -80, arg1.field2046[0], 0, arg1, (class164) null, arg1.field2102[0], class27.field335);
        } else {
            var2.method462((byte) -128);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lec;III)V")
    public static final void method1033(class178 arg0, int arg1, int arg2, int arg3) {
        if (~arg0.field3151 == -1) {
            arg0.field3042 = arg0.field3155;
        } else if (~arg0.field3151 != -2) {
            if (arg0.field3151 != 2) {
                if (~arg0.field3151 != -4) {
                    if (~arg0.field3151 == -5) {
                        arg0.field3042 = (arg0.field3155 * arg3 >> 14) + (arg3 - arg0.field3085) / 2;
                    } else {
                        arg0.field3042 = -(arg0.field3155 * arg3 >> 14) + -arg0.field3085 + arg3;
                    }
                } else {
                    arg0.field3042 = arg0.field3155 * arg3 >> 14;
                }
            } else {
                arg0.field3042 = -arg0.field3155 + arg3 + -arg0.field3085;
            }
        } else {
            arg0.field3042 = (-arg0.field3085 + arg3) / 2 + arg0.field3155;
        }
        ++field2646;
        if (arg2 != -2) {
            field2657 = null;
        }
        if (~arg0.field3150 != -1) {
            if (~arg0.field3150 == -2) {
                arg0.field3105 = (arg1 - arg0.field2997) / 2 + arg0.field3013;
            } else if (arg0.field3150 == 2) {
                arg0.field3105 = -arg0.field3013 + -arg0.field2997 + arg1;
            } else if (~arg0.field3150 != -4) {
                if (~arg0.field3150 == -5) {
                    arg0.field3105 = (arg1 - arg0.field2997) / 2 - -(arg0.field3013 * arg1 >> 14);
                } else {
                    arg0.field3105 = -arg0.field2997 + arg1 + -(arg0.field3013 * arg1 >> 14);
                }
            } else {
                arg0.field3105 = arg0.field3013 * arg1 >> 14;
            }
        } else {
            arg0.field3105 = arg0.field3013;
        }
        if (class236.field4195) {
            if (~client.method614(arg0) != -1 || ~arg0.field3123 == -1) {
                if (arg0.field3105 >= 0) {
                    if (~arg1 > ~(arg0.field3105 + arg0.field2997)) {
                        arg0.field3105 = -arg0.field2997 + arg1;
                    }
                } else {
                    arg0.field3105 = 0;
                }
                if (~arg0.field3042 <= -1) {
                    if (arg0.field3085 + arg0.field3042 > arg3) {
                        arg0.field3042 = -arg0.field3085 + arg3;
                        return;
                    }
                } else {
                    arg0.field3042 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Z")
    public final boolean method811(int arg0) {
        int var2 = 40 % ((arg0 - 66) / 54);
        ++field2642;
        return this.field2648 != null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([BII)I")
    public static final int method1034(byte[] arg0, int arg1, int arg2) {
        if (arg1 != -19097) {
            field2652 = false;
        }
        ++field2645;
        return class65.method406(0, -2, arg2, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2653;
        if (this.field2648 != null) {
            class149 var11 = ~super.field2086 != 0 && super.field2084 == 0 ? class116.method704(super.field2086, -10304) : null;
            class149 var12 = ~super.field2063 == 0 || ~super.field2091 == ~super.field2063 && var11 != null ? null : class116.method704(super.field2063, -10304);
            class119 var13 = this.field2648.method663(super.field2105, var11, var12, super.field2098, 110);
            if (var13 != null) {
                super.field2100 = var13.method266();
                class111 var14 = this.field2648;
                if (var14.field1591 != null) {
                    var14 = var14.method659(40);
                }
                if (class151.field2444 && var14.field1608) {
                    class119 var15 = class251.method1696(this.field2648.field1635, super.field2081, super.field2085, var12 == null ? var11 : var12, super.field2054, arg0, this.field2648.field1616, super.field2069, 256, this.field2648.field1597, var13, var12 == null ? super.field2105 : super.field2098, this.field2648.field1599, this.field2648.field1620);
                    var15.method269(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field2648.field1605 != -1 && ~this.field2648.field1638 != -1) {
                    int var19 = class15.field170[arg0];
                    int var20 = class15.field172[arg0];
                    short var21 = this.field2648.field1605;
                    int var22 = -var21 / 2;
                    short var23 = this.field2648.field1638;
                    int var24 = -var23 / 2;
                    int var25 = var20 * var24 + -(var19 * var22) >> 16;
                    int var26 = var19 * var24 + var20 * var22 >> 16;
                    int var27 = var21 / 2;
                    int var28 = class74.method470(super.field2085 + var25, class27.field335, 103, super.field2081 + var26);
                    int var29 = -var23 / 2;
                    int var30 = var20 * var29 - var19 * var27 >> 16;
                    int var31 = var19 * var29 - -(var20 * var27) >> 16;
                    int var32 = -var21 / 2;
                    int var33 = class74.method470(super.field2085 - -var30, class27.field335, 103, super.field2081 + var31);
                    int var34 = var23 / 2;
                    int var35 = var19 * var34 + var20 * var32 >> 16;
                    int var36 = var20 * var34 + -(var19 * var32) >> 16;
                    int var37 = var21 / 2;
                    int var38 = class74.method470(super.field2085 - -var36, class27.field335, 103, super.field2081 + var35);
                    int var39 = var23 / 2;
                    int var40 = var20 * var39 + -(var19 * var37) >> 16;
                    int var41 = var19 * var39 + var20 * var37 >> 16;
                    int var42 = class74.method470(super.field2085 + var40, class27.field335, 103, super.field2081 + var41);
                    int var43 = var28 + var42;
                    if (~var43 < ~(var33 + var38)) {
                        var43 = var33 + var38;
                    }
                    int var44 = ~var33 >= ~var28 ? var33 : var28;
                    int var45 = ~var38 > ~var42 ? var38 : var42;
                    int var46 = var42 <= var33 ? var42 : var33;
                    var17 = (int) (325.95D * Math.atan2((double) (-var45 + var44), (double) var23)) & 2047;
                    int var47 = ~var38 >= ~var28 ? var38 : var28;
                    if (var17 != 0) {
                        var13.method737(var17);
                    }
                    var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var21));
                    if (var16 != 0) {
                        var13.method739(var16);
                    }
                    var18 = (var43 >> 1) + -super.field2054;
                    if (~var18 != -1) {
                        var13.method729(0, var18, 0);
                    }
                }
                class119 var48 = null;
                if (super.field2113 != -1 && ~super.field2059 != 0) {
                    class209 var49 = class148.method929(1, super.field2113);
                    var48 = var49.method1446(super.field2059, (byte) -51);
                    if (var48 != null) {
                        var48.method729(0, -super.field2053, 0);
                        if (var49.field3778) {
                            if (var17 != 0) {
                                var48.method737(var17);
                            }
                            if (var16 != 0) {
                                var48.method739(var16);
                            }
                            if (var18 != 0) {
                                var48.method729(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class167) var13).method1082(var48);
                }
                if (~this.field2648.field1599 == -2) {
                    var13.field1730 = true;
                }
                var13.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)Lqh;")
    public static final class68 method1035(boolean arg0) {
        ++field2649;
        if (arg0) {
            method1032(-124, (class134) null);
        }
        class68 var1 = new class68(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[0], class77.field1126[0], class31.field392[0], class203.field3645[0], class84.field1237);
        class168.method1099(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()I")
    public final int method266() {
        ++field2650;
        return super.field2100;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field2643[var0] = var1;
        }
        field2652 = true;
        field2655 = class80.method502(" more options", -48);
        field2657 = field2655;
    }
}
