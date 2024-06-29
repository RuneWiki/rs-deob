import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class58 {

    @OriginalMember(owner = "client!db", name = "Qb", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!db", name = "Mb", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!db", name = "Nb", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!db", name = "Ob", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!db", name = "Pb", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!db", name = "Sb", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!db", name = "Tb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!db", name = "Ub", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!db", name = "Rb", descriptor = "Lah;")
    public class263 field247;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3) {
        class171 var4 = class85.method579(11, 0, arg3);
        ++field248;
        if (arg2 >= -105) {
            field246 = -50;
        }
        var4.method1140(-28981);
        var4.field2951 = arg0;
        var4.field2948 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(II)Z")
    public static final boolean method125(int arg0, int arg1) {
        ++field249;
        if (arg1 <= 21) {
            return true;
        } else {
            return ~(arg0 >> 30 & 1) != -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static final void method126(int arg0) {
        ++class43.field737;
        ++field241;
        class207.field3618.method483(arg0 + -24260, 143);
        class207.field3618.method1674((byte) 101, (long) arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field244;
        if (arg5 >= 0 && arg0 >= 0 && ~arg5 > -104 && arg0 < 103) {
            if (~arg3 == -1) {
                class233 var8 = class251.method1735(arg6, arg5, arg0);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field4028 >>> 32);
                    if (~arg4 != -3) {
                        var8.field4040 = new class8(var9, arg4, arg1, arg6, arg5, arg0, arg2, false, var8.field4040);
                    } else {
                        var8.field4040 = new class8(var9, 2, arg1 + 4, arg6, arg5, arg0, arg2, false, var8.field4040);
                        var8.field4025 = new class8(var9, 2, arg1 + 1 & 3, arg6, arg5, arg0, arg2, false, var8.field4025);
                    }
                }
            }
            if (~arg3 == -2) {
                class267 var10 = class202.method1387(arg6, arg5, arg0);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field4751 >>> 32);
                    if (arg4 != 4 && ~arg4 != -6) {
                        if (~arg4 == -7) {
                            var10.field4759 = new class8(var11, 4, arg1 + 4, arg6, arg5, arg0, arg2, false, var10.field4759);
                        } else if (~arg4 == -8) {
                            var10.field4759 = new class8(var11, 4, (3 & arg1 - -2) - -4, arg6, arg5, arg0, arg2, false, var10.field4759);
                        } else if (arg4 == 8) {
                            var10.field4759 = new class8(var11, 4, arg1 + 4, arg6, arg5, arg0, arg2, false, var10.field4759);
                            var10.field4753 = new class8(var11, 4, (3 & arg1 - -2) + 4, arg6, arg5, arg0, arg2, false, var10.field4753);
                        }
                    } else {
                        var10.field4759 = new class8(var11, 4, arg1, arg6, arg5, arg0, arg2, false, var10.field4759);
                    }
                }
            }
            if (arg3 == 2) {
                if (~arg4 == -12) {
                    arg4 = 10;
                }
                class213 var12 = class76.method535(arg6, arg5, arg0);
                if (var12 != null) {
                    var12.field3724 = new class8(Integer.MAX_VALUE & (int) (var12.field3728 >>> 32), arg4, arg1, arg6, arg5, arg0, arg2, false, var12.field3724);
                }
            }
            if (arg3 == 3) {
                class93 var13 = class37.method248(arg6, arg5, arg0);
                if (var13 != null) {
                    var13.field1700 = new class8(Integer.MAX_VALUE & (int) (var13.field1708 >>> 32), 22, arg1, arg6, arg5, arg0, arg2, false, var13.field1700);
                }
            }
        }
        if (arg7 != 3) {
            field246 = -116;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field242;
        if (this.field247 != null) {
            class106 var11 = ~super.field1056 != 0 && super.field1053 == 0 ? class101.method704(1, super.field1056) : null;
            class106 var12 = ~super.field1057 == 0 || super.field1057 == super.field1014 && var11 != null ? null : class101.method704(1, super.field1057);
            class26 var13 = this.field247.method1807(var11, super.field1032, 28879, var12, super.field1044);
            if (var13 != null) {
                super.field1012 = var13.method6();
                class263 var14 = this.field247;
                if (var14.field4695 != null) {
                    var14 = var14.method1794((byte) 77);
                }
                if (class273.field4826 && var14.field4685) {
                    class26 var15 = class45.method315(arg0, this.field247.field4692, super.field1065, super.field1045, -19071, this.field247.field4697, super.field1042, var12 == null ? var11 : var12, var12 != null ? super.field1032 : super.field1044, this.field247.field4700, super.field1027, this.field247.field4672, var13, this.field247.field4649);
                    var15.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field247.field4660 != 0 || this.field247.field4683 != 0) {
                    int var19 = class173.field2984[arg0];
                    int var20 = class173.field2995[arg0];
                    short var21 = this.field247.field4660;
                    int var22 = -var21 / 2;
                    short var23 = this.field247.field4683;
                    int var24 = -var23 / 2;
                    int var25 = var19 * var24 + var20 * var22 >> 16;
                    int var26 = var20 * var24 + -(var19 * var22) >> 16;
                    int var27 = var21 / 2;
                    int var28 = class246.method1660(604124551, super.field1042 - -var25, class116.field2066, super.field1027 + var26);
                    int var29 = -var23 / 2;
                    int var30 = var20 * var29 + -(var19 * var27) >> 16;
                    int var31 = var19 * var29 - -(var20 * var27) >> 16;
                    int var32 = var23 / 2;
                    int var33 = -var21 / 2;
                    int var34 = class246.method1660(604124551, super.field1042 + var31, class116.field2066, super.field1027 + var30);
                    int var35 = var19 * var32 + var20 * var33 >> 16;
                    int var36 = var20 * var32 + -(var19 * var33) >> 16;
                    int var37 = class246.method1660(604124551, super.field1042 - -var35, class116.field2066, super.field1027 + var36);
                    int var38 = var21 / 2;
                    int var39 = var23 / 2;
                    int var40 = var19 * var39 + var20 * var38 >> 16;
                    int var41 = var20 * var39 - var19 * var38 >> 16;
                    int var42 = class246.method1660(604124551, super.field1042 + var40, class116.field2066, super.field1027 + var41);
                    int var43 = var28 + var42;
                    int var44 = var28 < var34 ? var28 : var34;
                    if (~var43 < ~(var34 + var37)) {
                        var43 = var34 - -var37;
                    }
                    int var45 = var37 < var42 ? var37 : var42;
                    if (~var23 != -1) {
                        var16 = 2047 & (int) (325.95D * Math.atan2((double) (var44 - var45), (double) var23));
                        if (~var16 != -1) {
                            var13.method182(var16);
                        }
                    }
                    int var46 = var34 < var42 ? var34 : var42;
                    int var47 = ~var37 < ~var28 ? var28 : var37;
                    if (~var21 != -1) {
                        var17 = (int) (325.95D * Math.atan2((double) (var47 - var46), (double) var21)) & 2047;
                        if (var17 != 0) {
                            var13.method172(var17);
                        }
                    }
                    var18 = (var43 >> 1) - super.field1045;
                    if (~var18 != -1) {
                        var13.method177(0, var18, 0);
                    }
                }
                class26 var48 = null;
                if (super.field1064 != -1 && ~super.field1022 != 0) {
                    class71 var49 = class87.method647((byte) 127, super.field1064);
                    var48 = var49.method497(0, super.field1022);
                    if (var48 != null) {
                        var48.method177(0, -super.field1051, 0);
                        if (var49.field1337) {
                            if (~var16 != -1) {
                                var48.method182(var16);
                            }
                            if (var17 != 0) {
                                var48.method172(var17);
                            }
                            if (var18 != 0) {
                                var48.method177(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class42) var13).method293(var48);
                }
                if (this.field247.field4700 == 1) {
                    var13.field405 = true;
                }
                var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
    public final boolean method128(int arg0) {
        ++field245;
        if (arg0 != 10) {
            this.field247 = null;
        }
        return this.field247 != null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()I")
    public final int method6() {
        ++field243;
        return super.field1012;
    }
}
