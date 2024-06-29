import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class247 extends class23 {

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Z")
    private boolean field4426 = true;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Z")
    private boolean field4437 = true;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Llc;")
    public static class143 field4428 = class66.method374("<)4col> x", -1);

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Z")
    public static boolean field4440 = false;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field4429 = 2;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Llc;")
    private static class143 field4442 = class66.method374("Loading textures )2 ", -1);

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Llc;")
    public static class143 field4439 = class66.method374(")4p=", -1);

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Llc;")
    public static class143 field4430 = field4442;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Ldj;")
    public static class289 field4427;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field4436;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[][] var4 = this.method161(!this.field4437 ? arg0 : -arg0 + class79.field1426, 0, 0);
            int[] var5 = var3[1];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            if (!this.field4426) {
                for (int var11 = 0; class72.field1359 > var11; ++var11) {
                    var8[var11] = var6[var11];
                    var5[var11] = var7[var11];
                    var9[var11] = var10[var11];
                }
            } else {
                for (int var12 = 0; class72.field1359 > var12; ++var12) {
                    var8[var12] = var6[-var12 + class172.field3077];
                    var5[var12] = var7[-var12 + class172.field3077];
                    var9[var12] = var10[-var12 + class172.field3077];
                }
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZIJ)Llc;")
    public static final class143 method1635(int arg0, int arg1, boolean arg2, int arg3, long arg4) {
        ++field4444;
        class143 var6 = class170.method1114(0, false);
        if (arg4 < 0L) {
            var6.method906(0, class21.field347);
            arg4 = -arg4;
        }
        class143 var7 = class211.field3921;
        class143 var8 = class27.field452;
        if (~arg1 == -2) {
            var7 = class27.field452;
            var8 = class211.field3921;
        }
        if (arg1 == 2) {
            var7 = class27.field452;
            var8 = class174.field3126;
        }
        if (arg1 == 3) {
            var8 = class211.field3921;
            var7 = class27.field452;
        }
        class143 var9 = class170.method1114(0, false);
        class143 var10 = class170.method1114(0, false);
        for (int var11 = 0; ~var11 > ~arg3; ++var11) {
            var10.method906(0, class274.method1806((int) (arg4 % 10L), true));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class268.field4810;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg2 && var12 != 0 && ~(var12 % 3) == -1) {
                var9.method906(0, var8);
            }
            var9.method906(0, class274.method1806((int) (arg4 % 10L), true));
            ++var12;
            arg4 /= 10L;
        }
        if (var10.method913((byte) 45) > 0) {
            var10.method906(0, var7);
        }
        if (arg0 < 22) {
            field4429 = 8;
        }
        return class25.method179(0, new class143[] { var6, var9.method909((byte) -119), var10.method909((byte) 101) });
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method1636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field4435;
        int var9 = arg0 - arg2;
        int var10 = -arg7 + arg1;
        int var11 = (-arg4 + arg8 << 16) / var9;
        int var12 = (arg3 - arg5 << 16) / var10;
        class185.method1209(var12, 0, var11, arg2, arg1, 0, arg4, arg5, arg7, arg0, (byte) 99);
        if (arg6 >= -23) {
            method1639(90, 104, -68, -6, -18, 35, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static void method1637(int arg0) {
        field4439 = null;
        field4430 = null;
        field4428 = null;
        field4442 = null;
        field4427 = null;
        int var1 = 85 % ((arg0 - 20) / 51);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ldc;B)V")
    public static final void method1638(class91 arg0, byte arg1) {
        if (arg1 == -91) {
            class146.method932(200000, -72, arg0);
            ++field4432;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field373 = arg0.method1265(114) == 1;
                }
            } else {
                this.field4437 = arg0.method1265(122) == 1;
            }
        } else {
            this.field4426 = arg0.method1265(114) == 1;
        }
        ++field4438;
        if (!arg2) {
            field4441 = -66;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class136.field2393 = 0;
        int var7 = 96 / ((arg6 - 8) / 41);
        for (int var8 = -1; class212.field3945 + class107.field1889 > var8; ++var8) {
            class228 var24;
            if (~var8 == 0) {
                var24 = class229.field4195;
            } else if (var8 >= class107.field1889) {
                var24 = class259.field4648[class56.field1093[-class107.field1889 + var8]];
            } else {
                var24 = class6.field97[class30.field467[var8]];
            }
            if (var24 != null && var24.method217(false)) {
                if (var24 instanceof class187) {
                    class85 var25 = ((class187) var24).field3384;
                    if (var25.field1538 != null) {
                        var25 = var25.method489(-23677);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (var8 >= class107.field1889) {
                    class85 var26 = ((class187) var24).field3384;
                    if (var26.field1538 != null) {
                        var26 = var26.method489(-23677);
                    }
                    if (~var26.field1554 <= -1 && var26.field1554 < class117.field2077.length) {
                        int var27;
                        if (~var26.field1544 == 0) {
                            var27 = 15 + var24.method1555(-111);
                        } else {
                            var27 = var26.field1544 + 15;
                        }
                        class277.method1832(1, arg2, arg3 >> 1, var27, arg0, var24, arg1 >> 1);
                        if (class33.field565 > -1) {
                            class117.field2077[var26.field1554].method1058(arg4 - 12 + class33.field565, arg5 + -30 - -class67.field1272);
                        }
                    }
                    int var28 = 0;
                    class58[] var29 = class250.field4510;
                    while (~var28 > ~var29.length) {
                        class58 var30 = var29[var28];
                        if (var30 != null && ~var30.field1112 == -2 && class56.field1093[-class107.field1889 + var8] == var30.field1123 && class146.field2635 % 20 < 10) {
                            int var31;
                            if (~var26.field1544 == 0) {
                                var31 = var24.method1555(-116) + 15;
                            } else {
                                var31 = var26.field1544 + 15;
                            }
                            class277.method1832(1, arg2, arg3 >> 1, var31, arg0, var24, arg1 >> 1);
                            if (~class33.field565 < 0) {
                                class140.field2442[var30.field1114].method1058(arg4 - -class33.field565 + -12, arg5 - 28 + class67.field1272);
                            }
                        }
                        ++var28;
                    }
                } else {
                    int var32 = 30;
                    class32 var33 = (class32) var24;
                    if (~var33.field524 != 0 || var33.field533 != -1) {
                        class277.method1832(1, arg2, arg3 >> 1, 15 + var24.method1555(-120), arg0, var24, arg1 >> 1);
                        if (class33.field565 > -1) {
                            if (var33.field524 != -1) {
                                class269.field4815[var33.field524].method1058(arg4 + -12 + class33.field565, -var32 + class67.field1272 + arg5);
                                var32 += 25;
                            }
                            if (~var33.field533 != 0) {
                                class117.field2077[var33.field533].method1058(class33.field565 + arg4 - 12, -var32 + arg5 - -class67.field1272);
                                var32 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        class58[] var34 = class250.field4510;
                        for (int var35 = 0; ~var34.length < ~var35; ++var35) {
                            class58 var36 = var34[var35];
                            if (var36 != null && ~var36.field1112 == -11 && ~class30.field467[var8] == ~var36.field1123) {
                                class277.method1832(1, arg2, arg3 >> 1, var24.method1555(-116) - -15, arg0, var24, arg1 >> 1);
                                if (class33.field565 > -1) {
                                    class140.field2442[var36.field1114].method1058(arg4 - (-class33.field565 + 12), class67.field1272 + arg5 - var32);
                                }
                            }
                        }
                    }
                }
                if (var24.field4117 != null && (var8 >= class107.field1889 || ~class208.field3825 == -1 || ~class208.field3825 == -4 || class208.field3825 == 1 && class271.method1788((byte) -77, ((class32) var24).field518))) {
                    class277.method1832(1, arg2, arg3 >> 1, var24.method1555(-119), arg0, var24, arg1 >> 1);
                    if (class33.field565 > -1 && class144.field2588 > class136.field2393) {
                        class144.field2597[class136.field2393] = class239.field4326.method1308(var24.field4117) / 2;
                        class144.field2586[class136.field2393] = class239.field4326.field3574;
                        class144.field2592[class136.field2393] = class33.field565;
                        class144.field2583[class136.field2393] = class67.field1272;
                        class144.field2595[class136.field2393] = var24.field4106;
                        class144.field2596[class136.field2393] = var24.field4163;
                        class144.field2598[class136.field2393] = var24.field4174;
                        class144.field2589[class136.field2393] = var24.field4117;
                        ++class136.field2393;
                    }
                }
                if (class146.field2635 < var24.field4116) {
                    class230 var37 = class72.field1358[1];
                    class230 var38 = class72.field1358[0];
                    int var39;
                    if (!(var24 instanceof class187)) {
                        var39 = var24.method1555(-110);
                    } else {
                        class187 var40 = (class187) var24;
                        class230[] var41 = (class230[]) class5.field74.method826((long) var40.field3384.field1529, false);
                        if (var41 == null) {
                            var41 = class214.method1482(109, 0, class140.field2439, var40.field3384.field1529);
                            if (var41 != null) {
                                class5.field74.method827(-3, var41, (long) var40.field3384.field1529);
                            }
                        }
                        class85 var42 = var40.field3384;
                        if (var41 != null && ~var41.length == -3) {
                            var37 = var41[1];
                            var38 = var41[0];
                        }
                        if (var42.field1544 == -1) {
                            var39 = var24.method1555(-127);
                        } else {
                            var39 = var42.field1544;
                        }
                    }
                    class277.method1832(1, arg2, arg3 >> 1, var39 - -10 + var38.field4208, arg0, var24, arg1 >> 1);
                    if (~class33.field565 < 0) {
                        int var43 = arg4 - -class33.field565 + -(var38.field4201 >> 1);
                        int var44 = class67.field1272 - 3 + arg5;
                        var38.method1058(var43, var44);
                        int var45 = var38.field4208;
                        int var46 = var24.field4143 * var38.field4201 / 255;
                        class260.method1717(var43, var44, var43 + var46, var44 + var45);
                        var37.method1058(var43, var44);
                        class260.method1738(arg4, arg5, arg4 - -arg1, arg3 + arg5);
                    }
                }
                for (int var47 = 0; ~var47 > -5; ++var47) {
                    if (class146.field2635 < var24.field4176[var47]) {
                        int var50;
                        if (var24 instanceof class187) {
                            class187 var48 = (class187) var24;
                            class85 var49 = var48.field3384;
                            if (var49.field1544 == -1) {
                                var50 = var24.method1555(-110) / 2;
                            } else {
                                var50 = var49.field1544 / 2;
                            }
                        } else {
                            var50 = var24.method1555(-109) / 2;
                        }
                        class277.method1832(1, arg2, arg3 >> 1, var50, arg0, var24, arg1 >> 1);
                        if (~class33.field565 < 0) {
                            if (var47 == 1) {
                                class67.field1272 -= 20;
                            }
                            if (var47 == 2) {
                                class33.field565 -= 15;
                                class67.field1272 -= 10;
                            }
                            if (~var47 == -4) {
                                class67.field1272 -= 10;
                                class33.field565 += 15;
                            }
                            class51.field1013[var24.field4147[var47]].method1058(arg4 + -12 - -class33.field565, class67.field1272 + arg5 - 12);
                            class256.field4608.method1325(class274.method1806(var24.field4140[var47], true), class33.field565 + arg4 + -1, class67.field1272 + arg5 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        ++field4431;
        for (int var9 = 0; var9 < class136.field2393; ++var9) {
            int var10 = class144.field2583[var9];
            int var11 = class144.field2592[var9];
            int var12 = class144.field2586[var9];
            int var13 = class144.field2597[var9];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var23 = 0; var23 < var9; ++var23) {
                    if (~(var10 + 2) < ~(class144.field2583[var23] - class144.field2586[var23]) && ~(-var12 + var10) > ~(class144.field2583[var23] - -2) && -var13 + var11 < class144.field2597[var23] + class144.field2592[var23] && var11 - -var13 > class144.field2592[var23] + -class144.field2597[var23] && var10 > class144.field2583[var23] + -class144.field2586[var23]) {
                        var14 = true;
                        var10 = class144.field2583[var23] + -class144.field2586[var23];
                    }
                }
            }
            class33.field565 = class144.field2592[var9];
            class67.field1272 = class144.field2583[var9] = var10;
            class143 var15 = class144.field2589[var9];
            if (~class164.field2939 != -1) {
                class239.field4326.method1325(var15, class33.field565 + arg4, arg5 - -class67.field1272, 16776960, 0);
            } else {
                int var16 = 16776960;
                if (class144.field2595[var9] < 6) {
                    var16 = class114.field2001[class144.field2595[var9]];
                }
                if (class144.field2595[var9] == 6) {
                    var16 = class141.field2460 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class144.field2595[var9] == 7) {
                    var16 = class141.field2460 % 20 >= 10 ? 65535 : 255;
                }
                if (~class144.field2595[var9] == -9) {
                    var16 = ~(class141.field2460 % 20) <= -11 ? 8454016 : 45056;
                }
                if (~class144.field2595[var9] == -10) {
                    int var17 = 150 - class144.field2598[var9];
                    if (~var17 > -51) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 >= 100) {
                        if (~var17 > -151) {
                            var16 = 64780 - -(var17 * 5);
                        }
                    } else {
                        var16 = -((var17 + -50) * 327680) + 16776960;
                    }
                }
                if (~class144.field2595[var9] == -11) {
                    int var18 = -class144.field2598[var9] + 150;
                    if (~var18 <= -51) {
                        if (var18 < 100) {
                            var16 = -(var18 * 327680) + 16384000 + 16711935;
                        } else if (~var18 > -151) {
                            var16 = (var18 + -100) * 327680 + 255 + -((var18 + -100) * 5);
                        }
                    } else {
                        var16 = 16711680 - -(var18 * 5);
                    }
                }
                if (class144.field2595[var9] == 11) {
                    int var19 = -class144.field2598[var9] + 150;
                    if (~var19 > -51) {
                        var16 = -(var19 * 327685) + 16777215;
                    } else if (~var19 <= -101) {
                        if (var19 < 150) {
                            var16 = -((var19 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var16 = var19 * 327685 + 65280 + -16384250;
                    }
                }
                if (class144.field2596[var9] == 0) {
                    class239.field4326.method1325(var15, arg4 - -class33.field565, arg5 - -class67.field1272, var16, 0);
                }
                if (~class144.field2596[var9] == -2) {
                    class239.field4326.method1324(var15, class33.field565 + arg4, class67.field1272 + arg5, var16, 0, class141.field2460);
                }
                if (~class144.field2596[var9] == -3) {
                    class239.field4326.method1330(var15, class33.field565 + arg4, arg5 - -class67.field1272, var16, 0, class141.field2460);
                }
                if (class144.field2596[var9] == 3) {
                    class239.field4326.method1329(var15, arg4 - -class33.field565, class67.field1272 + arg5, var16, 0, class141.field2460, -class144.field2598[var9] + 150);
                }
                if (~class144.field2596[var9] == -5) {
                    int var20 = (-class144.field2598[var9] + 150) * (class239.field4326.method1308(var15) + 100) / 150;
                    class260.method1717(arg4 + -50 - -class33.field565, arg5, arg4 - -50 + class33.field565, arg3 + arg5);
                    class239.field4326.method1319(var15, -var20 + 50 + class33.field565 + arg4, arg5 - -class67.field1272, var16, 0);
                    class260.method1738(arg4, arg5, arg4 - -arg1, arg3 + arg5);
                }
                if (~class144.field2596[var9] == -6) {
                    int var21 = 150 - class144.field2598[var9];
                    class260.method1717(arg4, arg5 - -class67.field1272 + -class239.field4326.field3574 - 1, arg1 + arg4, class67.field1272 + arg5 - -5);
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 + -25;
                    } else if (var21 > 125) {
                        var22 = var21 + -125;
                    }
                    class239.field4326.method1325(var15, arg4 - -class33.field565, class67.field1272 + arg5 - -var22, var16, 0);
                    class260.method1738(arg4, arg5, arg1 + arg4, arg3 + arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field4434;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (arg0 > -13) {
            this.field4426 = true;
        }
        if (super.field369.field1005) {
            int[] var4 = this.method155(this.field4437 ? class79.field1426 - arg1 : arg1, (byte) 109, 0);
            if (this.field4426) {
                for (int var5 = 0; ~class72.field1359 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class172.field3077];
                }
            } else {
                class275.method1810(var4, 0, var3, 0, class72.field1359);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method1640(boolean arg0) {
        class143.field2562.method824(-121);
        if (arg0) {
            class31.field507.method824(-121);
            ++field4433;
            class162.field2915.method824(-126);
            class64.field1205.method824(-123);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class247() {
        super(1, false);
    }
}
