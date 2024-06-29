import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class380 extends class642 {

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
    private int field5722 = 4096;

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
    private int field5724 = 409;

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "[I")
    private int[] field5725 = new int[3];

    @OriginalMember(owner = "client!kfa", name = "L", descriptor = "I")
    private int field5730 = 4096;

    @OriginalMember(owner = "client!kfa", name = "M", descriptor = "I")
    private int field5731 = 4096;

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
    public static int field5728 = 0;

    @OriginalMember(owner = "client!kfa", name = "N", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!kfa", name = "D", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!kfa", name = "H", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!kfa", name = "I", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!kfa", name = "O", descriptor = "Lmv;")
    public static class295 field5733;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field5729;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            this.field5725 = null;
        }
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class338.field4909; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field5725[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field5724 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5725[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field5724) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field5725[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5724 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5730 * var12 >> 12;
                            var9[var11] = this.field5722 * var14 >> 12;
                            var10[var11] = this.field5731 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field5723;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method3154((byte) -113);
                            this.field5725[2] = class425.method2563(var5, 255) >> 12;
                            this.field5725[1] = class425.method2563(4080, var5 >> 4);
                            this.field5725[0] = class425.method2563(var5 << 4, 267386880);
                        }
                    } else {
                        this.field5730 = arg1.method3169(26488);
                    }
                } else {
                    this.field5722 = arg1.method3169(26488);
                }
            } else {
                this.field5731 = arg1.method3169(26488);
            }
        } else {
            this.field5724 = arg1.method3169(26488);
        }
        if (arg2 <= 29) {
            field5728 = -36;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjava/lang/String;)Lmd;")
    public static final class244 method2355(int arg0, int arg1, String arg2) {
        ++field5726;
        class244 var3;
        try {
            var3 = (class244) Class.forName("maa").newInstance();
        } catch (Throwable var4) {
            var3 = new class159();
        }
        var3.field3238 = arg0;
        if (arg1 != -1) {
            field5728 = 86;
        }
        var3.field3233 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5733 = null;
        if (arg0 != -849780020) {
            field5721 = -17;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
    public class380() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILr;II)V")
    public static final void method2357(int arg0, class98 arg1, int arg2, int arg3) {
        if (arg3 >= -33) {
            field5728 = 21;
        }
        ++field5727;
        if (arg2 >= 0 && arg0 >= 0 && class658.field9397 != 0 && ~class488.field6937 != -1) {
            arg1.method667(class62.field989, class153.field2163, class658.field9397, class488.field6937);
            arg1.method652(class164.field2309, class533.field7838, class658.field9397, class488.field6937);
            class151 var4 = arg1.method717();
            var4.method878(class281.field3717, class98.field1497, class375.field5657, class502.field7105, class47.field743, class103.field1545);
            arg1.method616(var4);
            if (class262.field3404 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg1.method668();
                int var8 = (-class62.field989 + arg2) * var7 / class658.field9397;
                int var9 = (arg0 - class153.field2163) * var7 / class488.field6937;
                int var10 = arg1.method608();
                int var11 = (arg2 - class62.field989) * var10 / class658.field9397;
                int var12 = (-class153.field2163 + arg0) * var10 / class488.field6937;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method882(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method882(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] + -var13[1];
                int var18 = var14[2] - var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 9;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 9;
                    if (var20 > 0 && var22 > 0 && var20 < class72.field1144 && ~class668.field9444 < ~var22) {
                        int var23 = class321.field4681.field7905;
                        if (var23 < 3 && (class317.field4622[1][var20][var22] & 2) != 0) {
                            ++var23;
                        }
                        if ((float) class262.field3404[var23].method3824(var19, 124, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = var19 + (class321.field4681.method422((byte) -71) - 1 << 8) >> 9;
                            var6 = var21 - -(class321.field4681.method422((byte) 102) + -1 << 8) >> 9;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class240.field3164 && ~(64 & class282.field3771) != -1) {
                        class5 var24 = class194.method1261(class412.field6116, class492.field7003, 6);
                        if (var24 == null) {
                            class541.method3183(1);
                        } else {
                            class621.method3581(class697.field9824, var6, 57, 0L, var5, (byte) 127, " ->", false, -1, class142.field2061, true);
                        }
                    } else {
                        if (class327.field4736) {
                            class621.method3581(class279.field3652.method1654(-92, class262.field3401), var6, 17, 0L, var5, (byte) 127, "", false, -1, -1, true);
                        }
                        class621.method3581(class365.field5356, var6, 10, 0L, var5, (byte) 127, "", false, -1, class132.field1924, true);
                        ++class180.field2492;
                    }
                }
            }
            class383 var25 = class604.field8729;
            for (class218 var26 = (class218) var25.method2370(-26173); var26 != null; var26 = (class218) var25.method2369((byte) 127)) {
                if ((class240.field3162 || class321.field4681.field7905 == var26.field2900.field7905) && var26.method1374(arg1, 127, arg2, arg0)) {
                    boolean var27 = false;
                    boolean var28 = false;
                    int var29;
                    int var30;
                    if (var26.field2900 instanceof class293) {
                        var29 = ((class293) var26.field2900).field4299;
                        var30 = ((class293) var26.field2900).field4300;
                    } else {
                        var29 = var26.field2900.field7895 >> 9;
                        var30 = var26.field2900.field7896 >> 9;
                    }
                    if (var26.field2900 instanceof class71) {
                        class71 var31 = (class71) var26.field2900;
                        int var32 = var31.method422((byte) 90);
                        if (~(1 & var32) == -1 && ~(var31.field7895 & 511) == -1 && (var31.field7896 & 511) == 0 || ~(1 & var32) == -2 && (511 & var31.field7895) == 256 && ~(var31.field7896 & 511) == -257) {
                            int var33 = var31.field7895 - (-1 + var31.method422((byte) -105) << 8);
                            int var34 = var31.field7896 - (-1 + var31.method422((byte) 54) << 8);
                            for (int var35 = 0; var35 < class155.field2213; ++var35) {
                                class177 var42 = (class177) class271.field3550.method2002((byte) -117, (long) class523.field7379[var35]);
                                if (var42 != null) {
                                    class53 var43 = var42.field2476;
                                    if (~class45.field685 != ~var43.field7381 && var43.field7372) {
                                        int var44 = -(var43.field805.field1239 - 1 << 8) + var43.field7895;
                                        int var45 = -(var43.field805.field1239 - 1 << 8) + var43.field7896;
                                        if (var33 <= var44 && ~var43.field805.field1239 >= ~(-(-var33 + var44 >> 9) + var31.method422((byte) 51)) && var45 >= var34 && ~var43.field805.field1239 >= ~(var31.method422((byte) -110) + -(-var34 + var45 >> 9))) {
                                            class661.method3717(~class321.field4681.field7905 != ~var26.field2900.field7905, var43, false);
                                            var43.field7381 = class45.field685;
                                        }
                                    }
                                }
                            }
                            int var36 = class416.field6150;
                            int[] var37 = class35.field554;
                            for (int var38 = 0; ~var36 < ~var38; ++var38) {
                                class71 var39 = class35.field551[var37[var38]];
                                if (var39 != null && ~class45.field685 != ~var39.field7381 && var31 != var39 && var39.field7372) {
                                    int var40 = var39.field7895 - (var39.method422((byte) -81) + -1 << 8);
                                    int var41 = var39.field7896 - (-1 + var39.method422((byte) 70) << 8);
                                    if (var33 <= var40 && ~var39.method422((byte) -61) >= ~(-(var40 - var33 >> 9) + var31.method422((byte) -64)) && var34 <= var41 && ~var39.method422((byte) 101) >= ~(var31.method422((byte) -65) + -(-var34 + var41 >> 9))) {
                                        class203.method1315(class321.field4681.field7905 != var26.field2900.field7905, var39, (byte) 73);
                                        var39.field7381 = class45.field685;
                                    }
                                }
                            }
                        }
                        if (~class45.field685 == ~var31.field7381) {
                            continue;
                        }
                        class203.method1315(class321.field4681.field7905 != var26.field2900.field7905, var31, (byte) 73);
                        var31.field7381 = class45.field685;
                    }
                    if (var26.field2900 instanceof class53) {
                        class53 var46 = (class53) var26.field2900;
                        if (var46.field805 != null) {
                            if ((1 & var46.field805.field1239) == 0 && ~(var46.field7895 & 511) == -1 && (var46.field7896 & 511) == 0 || ~(1 & var46.field805.field1239) == -2 && ~(511 & var46.field7895) == -257 && ~(511 & var46.field7896) == -257) {
                                int var47 = -(var46.field805.field1239 + -1 << 8) + var46.field7895;
                                int var48 = var46.field7896 - (var46.field805.field1239 + -1 << 8);
                                for (int var49 = 0; class155.field2213 > var49; ++var49) {
                                    class177 var56 = (class177) class271.field3550.method2002((byte) -106, (long) class523.field7379[var49]);
                                    if (var56 != null) {
                                        class53 var57 = var56.field2476;
                                        if (class45.field685 != var57.field7381 && var46 != var57 && var57.field7372) {
                                            int var58 = -(var57.field805.field1239 + -1 << 8) + var57.field7895;
                                            int var59 = var57.field7896 - (var57.field805.field1239 - 1 << 8);
                                            if (var58 >= var47 && ~(-(-var47 + var58 >> 9) + var46.field805.field1239) <= ~var57.field805.field1239 && var48 <= var59 && -(-var48 + var59 >> 9) + var46.field805.field1239 >= var57.field805.field1239) {
                                                class661.method3717(class321.field4681.field7905 != var26.field2900.field7905, var57, false);
                                                var57.field7381 = class45.field685;
                                            }
                                        }
                                    }
                                }
                                int var50 = class416.field6150;
                                int[] var51 = class35.field554;
                                for (int var52 = 0; ~var52 > ~var50; ++var52) {
                                    class71 var53 = class35.field551[var51[var52]];
                                    if (var53 != null && class45.field685 != var53.field7381 && var53.field7372) {
                                        int var54 = var53.field7895 + -(var53.method422((byte) -112) + -1 << 8);
                                        int var55 = var53.field7896 + -(var53.method422((byte) -56) - 1 << 8);
                                        if (var47 <= var54 && var53.method422((byte) -90) <= -(var54 - var47 >> 9) + var46.field805.field1239 && var48 <= var55 && var53.method422((byte) 123) <= var46.field805.field1239 - (-var48 + var55 >> 9)) {
                                            class203.method1315(~class321.field4681.field7905 != ~var26.field2900.field7905, var53, (byte) 73);
                                            var53.field7381 = class45.field685;
                                        }
                                    }
                                }
                            }
                            if (class45.field685 == var46.field7381) {
                                continue;
                            }
                            class661.method3717(~class321.field4681.field7905 != ~var26.field2900.field7905, var46, false);
                            var46.field7381 = class45.field685;
                        }
                    }
                    if (var26.field2900 instanceof class417) {
                        int var60 = var29 - -class397.field6005;
                        int var61 = var30 - -class403.field6049;
                        class668 var62 = (class668) class86.field1336.method2002((byte) -124, (long) (var60 | var26.field2900.field7905 << 28 | var61 << 14));
                        if (var62 != null) {
                            for (class678 var63 = (class678) var62.field9445.method1906((byte) 111); var63 != null; var63 = (class678) var62.field9445.method1911((byte) -83)) {
                                class390 var64 = class259.field3355.method2382(var63.field9594, (byte) 28);
                                if (class240.field3164 && ~class321.field4681.field7905 == ~var26.field2900.field7905) {
                                    class278 var65 = ~class2.field21 != 0 ? class141.field2041.method1503(true, class2.field21) : null;
                                    if (~(1 & class282.field3771) != -1 && (var65 == null || ~var64.method2410(var65.field3615, -15881, class2.field21) != ~var65.field3615)) {
                                        class621.method3581(class697.field9824, var30, 3, (long) var63.field9594, var29, (byte) 127, class372.field5508 + " -> <col=ff9040>" + var64.field5869, false, -1, class142.field2061, true);
                                        ++class400.field6025;
                                    }
                                }
                                if (~class321.field4681.field7905 == ~var26.field2900.field7905) {
                                    String[] var66 = var64.field5848;
                                    for (int var67 = 4; ~var67 <= -1; --var67) {
                                        if (var66 != null && var66[var67] != null) {
                                            byte var68 = 0;
                                            if (var67 == 0) {
                                                var68 = 45;
                                            }
                                            int var69 = class379.field5696;
                                            if (var67 == 1) {
                                                var68 = 25;
                                            }
                                            if (var67 == 2) {
                                                var68 = 5;
                                            }
                                            if (~var67 == -4) {
                                                var68 = 8;
                                            }
                                            if (var67 == 4) {
                                                var68 = 51;
                                            }
                                            if (~var64.field5872 == ~var67) {
                                                var69 = var64.field5900;
                                            }
                                            if (~var64.field5883 == ~var67) {
                                                var69 = var64.field5853;
                                            }
                                            ++class357.field5278;
                                            class621.method3581(var66[var67], var30, var68, (long) var63.field9594, var29, (byte) 127, "<col=ff9040>" + var64.field5869, false, -1, var69, true);
                                        }
                                    }
                                }
                                ++class631.field9136;
                                class621.method3581(class279.field3647.method1654(-56, class262.field3401), var30, 1010, (long) var63.field9594, var29, (byte) 127, "<col=ff9040>" + var64.field5869, class321.field4681.field7905 != var26.field2900.field7905, -1, class13.field307, true);
                            }
                        }
                    }
                    if (var26.field2900 instanceof class83) {
                        class83 var70 = (class83) var26.field2900;
                        class289 var71 = class60.field965.method2596(0, var70.method277((byte) 95));
                        if (var71.field4213 != null) {
                            var71 = var71.method1788(class308.field4545, -68);
                        }
                        if (var71 != null) {
                            if (class240.field3164 && ~class321.field4681.field7905 == ~var26.field2900.field7905) {
                                class278 var72 = class2.field21 != -1 ? class141.field2041.method1503(true, class2.field21) : null;
                                if (~(class282.field3771 & 4) != -1 && (var72 == null || var71.method1783(class2.field21, (byte) -98, var72.field3615) != var72.field3615)) {
                                    ++class526.field7476;
                                    class621.method3581(class697.field9824, var30, 9, class108.method820(var30, -1164670508, var70, var29), var29, (byte) 127, class372.field5508 + " -> <col=00ffff>" + var71.field4182, false, -1, class142.field2061, true);
                                }
                            }
                            if (~class321.field4681.field7905 == ~var26.field2900.field7905) {
                                String[] var73 = var71.field4218;
                                if (var73 != null) {
                                    for (int var74 = 4; ~var74 <= -1; --var74) {
                                        if (var73[var74] != null) {
                                            short var75 = 0;
                                            if (~var74 == -1) {
                                                var75 = 21;
                                            }
                                            int var76 = class379.field5696;
                                            if (~var74 == -2) {
                                                var75 = 18;
                                            }
                                            if (var74 == 2) {
                                                var75 = 11;
                                            }
                                            if (~var74 == -4) {
                                                var75 = 4;
                                            }
                                            if (var74 == 4) {
                                                var75 = 1003;
                                            }
                                            if (~var71.field4238 == ~var74) {
                                                var76 = var71.field4186;
                                            }
                                            if (var71.field4267 == var74) {
                                                var76 = var71.field4239;
                                            }
                                            class621.method3581(var73[var74], var30, var75, class108.method820(var30, -1164670508, var70, var29), var29, (byte) 127, "<col=00ffff>" + var71.field4182, false, -1, var76, true);
                                            ++class6.field208;
                                        }
                                    }
                                }
                            }
                            ++class56.field876;
                            class621.method3581(class279.field3647.method1654(-38, class262.field3401), var30, 1007, (long) var71.field4224, var29, (byte) 127, "<col=00ffff>" + var71.field4182, ~class321.field4681.field7905 != ~var26.field2900.field7905, -1, class13.field307, true);
                        }
                    }
                }
            }
        }
    }
}
