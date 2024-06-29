import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class31 extends class180 {

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public int field480 = -1;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Ltc;")
    public static class196 field479 = new class196();

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field482 = 1;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "[S")
    public static short[] field484 = new short[256];

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "[Lf;")
    public static class450[] field486 = new class450[29];

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field492 = null;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field491 = -1;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Ltf;")
    public static class162 field483;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Ljava/lang/String;")
    public String field474;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Ljava/lang/String;")
    public String field475;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "Z")
    public static boolean field488;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)V", line = 6)
    public static final void method235(int arg0) {
        ++field478;
        class190 var1 = class414.field6007;
        synchronized (class414.field6007) {
            class414.field6007.method1243(1000);
        }
        class190 var2 = class188.field2607;
        synchronized (class188.field2607) {
            class188.field2607.method1243(arg0 ^ 1000);
        }
        if (arg0 != 0) {
            method238((byte) -96);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILaa;[[BI[[IIILsm;[[B[[BLsm;[[BZ)V", line = 22)
    public static final void method236(int arg0, class281 arg1, byte[][] arg2, int arg3, int[][] arg4, int arg5, int arg6, class156 arg7, byte[][] arg8, byte[][] arg9, class156 arg10, byte[][] arg11, boolean arg12) {
        ++field477;
        int var13 = 0;
        if (arg3 != -31584) {
            field491 = -89;
        }
        while (var13 < arg0) {
            int var14 = var13 >= arg0 + -1 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < arg6; ++var15) {
                int var16 = var15 >= arg6 + -1 ? var15 : var15 - -1;
                if (class67.method457(31862) || class76.method542(client.field2349, var13, arg5, (byte) -119, var15)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg8[var13][var15];
                    int var21 = arg2[var13][var15];
                    int var22 = arg9[var13][var15] & 255;
                    int var23 = arg11[var13][var15] & 255;
                    int var24 = 255 & arg11[var13][var16];
                    int var25 = arg11[var14][var16] & 255;
                    int var26 = arg11[var14][var15] & 255;
                    if (~var22 != -1 || ~var23 != -1) {
                        class6 var27 = var22 != 0 ? class364.method2340(true, var22 + -1) : null;
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class170 var28 = ~var23 == -1 ? null : class223.method1415(var23 + -1, (byte) -88);
                        class6 var29 = var27;
                        if (var27 != null) {
                            if (var27.field107 == -1 && ~var27.field90 == 0) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && ~var20 != -1) {
                                var18 = var27.field96;
                            }
                        }
                        if ((~var20 == -1 || ~var20 == -13) && var13 > 0 && ~var15 < -1 && ~var13 > ~arg0 && arg6 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (~arg11[var14][var15 + -1] != ~var23 ? -1 : 1);
                            int var34 = var32 + (~arg11[var14][var16] != ~var23 ? -1 : 1);
                            byte var35 = 0;
                            int var36 = var30 + (arg11[var13 - 1][var15 + -1] == var23 ? 1 : -1);
                            int var37 = var35 + (~arg11[var13 + -1][var16] != ~var23 ? -1 : 1);
                            if (arg11[var13][var15 + -1] == var23) {
                                ++var33;
                                ++var36;
                            } else {
                                --var36;
                                --var33;
                            }
                            if (~arg11[var14][var15] == ~var23) {
                                ++var34;
                                ++var33;
                            } else {
                                --var34;
                                --var33;
                            }
                            if (arg11[var13][var16] != var23) {
                                --var34;
                                --var37;
                            } else {
                                ++var37;
                                ++var34;
                            }
                            if (arg11[var13 + -1][var15] != var23) {
                                --var37;
                                --var36;
                            } else {
                                ++var37;
                                ++var36;
                            }
                            int var38 = -var34 + var36;
                            if (~var38 > -1) {
                                var38 = -var38;
                            }
                            int var39 = -var37 + var33;
                            if (~var39 > -1) {
                                var39 = -var39;
                            }
                            if (~var38 == ~var39) {
                                var38 = arg7.method275(var13, var15) + -arg7.method275(var14, var16);
                                var39 = arg7.method275(var14, var15) - arg7.method275(var13, var16);
                                if (~var38 > -1) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; ++var40) {
                            class368.field5157[var40] = -1;
                            class43.field654[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field96 ? class43.field658[var20] : class358.field5041[var20];
                        class408.method2615(var28, var15, -74, var20, var27, arg2, arg8, arg1, arg0, var21, var13, arg6, arg9, var19);
                        boolean var42 = var27 != null && ~var27.field90 != ~var27.field107;
                        if (!var42) {
                            for (int var43 = 0; ~var43 > -9; ++var43) {
                                if (~class368.field5157[var43] <= -1 && ~class383.field5461[var43] != ~class296.field4118[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[3 & var21 + 1]) {
                            var19[1] = class289.method1868(var19[1], class318.method2028(class43.field654[2], class43.field654[4]) == 0);
                        }
                        if (!var41[3 & var21 + 3]) {
                            var19[3] = class289.method1868(var19[3], class318.method2028(class43.field654[0], class43.field654[6]) == 0);
                        }
                        if (!var41[-(-var21) & 3]) {
                            var19[0] = class289.method1868(var19[0], ~class318.method2028(class43.field654[0], class43.field654[2]) == -1);
                        }
                        if (!var41[var21 + 2 & 3]) {
                            var19[2] = class289.method1868(var19[2], ~class318.method2028(class43.field654[6], class43.field654[4]) == -1);
                        }
                        if (!var18 && (~var20 == -1 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var19[0] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = ~var20 != -1 ? 14 : 13;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = ~var20 != -1 ? 14 : 13;
                                var19[1] = var19[2] = false;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var19[2] = var19[3] = false;
                                var20 = ~var20 != -1 ? 14 : 13;
                                var21 = 1;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        if (!var44) {
                            if (!var18) {
                                var46 = class144.field2095[var20];
                                var47 = var27 != null ? class163.field2297[var20] : 0;
                                var48 = var28 != null ? class103.field1559[var20] : 0;
                                var49 = class129.field1799[var20];
                                var45 = class403.field5873[var20];
                                var50 = class11.field152[var20];
                            } else {
                                var47 = var27 != null ? class237.field3229[var20] : 0;
                                var46 = class29.field456[var20];
                                var49 = class137.field1961[var20];
                                var45 = class359.field5061[var20];
                                var50 = class181.field2533[var20];
                                var48 = var28 == null ? 0 : class65.field1026[var20];
                            }
                        } else {
                            var46 = class382.field5417[var20];
                            var49 = class108.field1597[var20];
                            var48 = var28 == null ? 0 : class46.field684[var20];
                            var47 = var27 != null ? class5.field80[var20] : 0;
                            var50 = class71.field1100[var20];
                        }
                        int var51 = var47 + var48;
                        if (~var51 >= -1) {
                            class61.method403(arg5, var13, var15);
                        } else {
                            if (var19[0]) {
                                ++var51;
                            }
                            if (var19[2]) {
                                ++var51;
                            }
                            if (var19[1]) {
                                ++var51;
                            }
                            if (var19[3]) {
                                ++var51;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = !arg12 ? null : new int[var54];
                            int[] var56 = !var42 ? null : new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field107;
                                var63 = arg1.method1790() ? var27.field103 : var27.field97;
                                var64 = var27.field94;
                                int var65 = class438.method2750(arg1, (byte) -85, var27);
                                for (int var66 = 0; ~var66 > ~var47; ++var66) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[3 & -var21] && ~var45[0] == ~var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 1;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 1;
                                        class451.field6566[4] = var50[var52];
                                        var68 = 6;
                                        class451.field6566[5] = var46[var52];
                                    } else if (var19[-var21 + 2 & 3] && ~var45[2] == ~var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 5;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 5;
                                        class451.field6566[4] = var50[var52];
                                        var68 = 6;
                                        class451.field6566[5] = var46[var52];
                                    } else if (var19[1 - var21 & 3] && ~var45[1] == ~var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 3;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 3;
                                        class451.field6566[4] = var50[var52];
                                        class451.field6566[5] = var46[var52];
                                        var68 = 6;
                                    } else if (var19[3 & -var21 + 3] && ~var45[3] == ~var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 7;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 7;
                                        class451.field6566[4] = var50[var52];
                                        class451.field6566[5] = var46[var52];
                                        var68 = 6;
                                    } else {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = var50[var52];
                                        class451.field6566[2] = var46[var52];
                                        var68 = 3;
                                    }
                                    ++var52;
                                    for (int var69 = 0; var69 < var68; ++var69) {
                                        int var70 = class451.field6566[var69];
                                        int var71 = 7 & var70 - var21 * 2;
                                        int var72 = class286.field3941[var70];
                                        int var73 = class188.field2613[var70];
                                        if (~var21 == -2) {
                                            var57[var53] = var73;
                                            var58[var53] = -var72 + 128;
                                        } else if (var21 != 2) {
                                            if (var21 != 3) {
                                                var57[var53] = var72;
                                                var58[var53] = var73;
                                            } else {
                                                var57[var53] = -var73 + 128;
                                                var58[var53] = var72;
                                            }
                                        } else {
                                            var57[var53] = -var72 + 128;
                                            var58[var53] = -var73 + 128;
                                        }
                                        if (arg12 && class230.field3087[var20][var70]) {
                                            int var74 = (var13 << 7) + var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg10.method278(var74, var75) - arg7.method278(var74, var75);
                                        }
                                        if (var70 < 8 && class368.field5157[var71] > var27.field104) {
                                            if (var56 != null) {
                                                var56[var53] = class296.field4118[var71];
                                            }
                                            var61[var53] = class127.field1791[var71];
                                            var60[var53] = class108.field1598[var71];
                                            var59[var53] = class383.field5461[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = !arg1.method1790() ? var27.field97 : var27.field103;
                                            var61[var53] = var27.field94;
                                            var59[var53] = var62;
                                        }
                                        ++var53;
                                    }
                                }
                                if (!arg12 && ~arg5 == -1) {
                                    class163.method1085(var13, var15, var27.field106, var27.field101 * 8);
                                }
                                if (~var20 != -13 && var27.field107 != -1 && var27.field93) {
                                    var17 = true;
                                }
                            } else if (!var44) {
                                if (var18) {
                                    var52 += class237.field3229[var20];
                                } else {
                                    var52 += class163.field2297[var20];
                                }
                            } else {
                                var52 += class5.field80[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (~var25 == -1) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class170 var76 = class223.method1415(var23 + -1, (byte) -88);
                                class170 var77 = class223.method1415(var24 - 1, (byte) -88);
                                class170 var78 = class223.method1415(var25 - 1, (byte) -88);
                                class170 var79 = class223.method1415(var26 + -1, (byte) -88);
                                for (int var80 = 0; ~var80 > ~var48; ++var80) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[-var21 & 3] && var45[0] == var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 1;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 1;
                                        class451.field6566[4] = var50[var52];
                                        var82 = 6;
                                        class451.field6566[5] = var46[var52];
                                    } else if (var19[3 & -var21 + 2] && ~var45[2] == ~var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 5;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 5;
                                        class451.field6566[4] = var50[var52];
                                        class451.field6566[5] = var46[var52];
                                        var82 = 6;
                                    } else if (var19[1 - var21 & 3] && var45[1] == var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 3;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 3;
                                        class451.field6566[4] = var50[var52];
                                        var82 = 6;
                                        class451.field6566[5] = var46[var52];
                                    } else if (var19[-var21 + 3 & 3] && var45[3] == var52) {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = 7;
                                        class451.field6566[2] = var46[var52];
                                        class451.field6566[3] = 7;
                                        class451.field6566[4] = var50[var52];
                                        var82 = 6;
                                        class451.field6566[5] = var46[var52];
                                    } else {
                                        class451.field6566[0] = var49[var52];
                                        class451.field6566[1] = var50[var52];
                                        class451.field6566[2] = var46[var52];
                                        var82 = 3;
                                    }
                                    for (int var83 = 0; ~var82 < ~var83; ++var83) {
                                        int var84 = class451.field6566[var83];
                                        int var85 = 7 & var84 - var21 * 2;
                                        int var86 = class286.field3941[var84];
                                        int var87 = class188.field2613[var84];
                                        int var88;
                                        int var89;
                                        if (var21 != 1) {
                                            if (var21 != 2) {
                                                if (var21 == 3) {
                                                    var88 = var86;
                                                    var89 = -var87 + 128;
                                                } else {
                                                    var89 = var86;
                                                    var88 = var87;
                                                }
                                            } else {
                                                var88 = -var87 + 128;
                                                var89 = -var86 + 128;
                                            }
                                        } else {
                                            var89 = var87;
                                            var88 = -var86 + 128;
                                        }
                                        var57[var53] = var89;
                                        var58[var53] = var88;
                                        if (arg12 && class230.field3087[var20][var84]) {
                                            int var90 = (var13 << 7) - -var89;
                                            int var91 = (var15 << 7) - -var88;
                                            var55[var53] = arg10.method278(var90, var91) + -arg7.method278(var90, var91);
                                        }
                                        if (~var84 > -9 && ~class368.field5157[var85] <= -1) {
                                            if (var56 != null) {
                                                var56[var53] = class296.field4118[var85];
                                            }
                                            var61[var53] = class127.field1791[var85];
                                            var60[var53] = class108.field1598[var85];
                                            var59[var53] = class383.field5461[var85];
                                        } else {
                                            if (var18 && class230.field3087[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (~var89 == -1 && var88 == 0) {
                                                var59[var53] = arg4[var13][var15];
                                                var60[var53] = var76.field2428;
                                                var61[var53] = var76.field2431;
                                            } else if (var89 == 0 && var88 == 128) {
                                                var59[var53] = arg4[var13][var16];
                                                var60[var53] = var77.field2428;
                                                var61[var53] = var77.field2431;
                                            } else if (var89 == 128 && ~var88 == -129) {
                                                var59[var53] = arg4[var14][var16];
                                                var60[var53] = var78.field2428;
                                                var61[var53] = var78.field2431;
                                            } else if (~var89 == -129 && ~var88 == -1) {
                                                var59[var53] = arg4[var14][var15];
                                                var60[var53] = var79.field2428;
                                                var61[var53] = var79.field2431;
                                            } else {
                                                if (~var89 > -65) {
                                                    if (var88 >= 64) {
                                                        var60[var53] = var77.field2428;
                                                        var61[var53] = var77.field2431;
                                                    } else {
                                                        var60[var53] = var76.field2428;
                                                        var61[var53] = var76.field2431;
                                                    }
                                                } else if (var88 < 64) {
                                                    var60[var53] = var79.field2428;
                                                    var61[var53] = var79.field2431;
                                                } else {
                                                    var60[var53] = var78.field2428;
                                                    var61[var53] = var78.field2431;
                                                }
                                                int var92 = class63.method424(arg4[var14][var15], var89 << 7 >> 7, arg4[var13][var15], 128);
                                                int var93 = class63.method424(arg4[var14][var16], var89 << 7 >> 7, arg4[var13][var16], 128);
                                                var59[var53] = class63.method424(var93, var88 << 7 >> 7, var92, 128);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        ++var53;
                                    }
                                    ++var52;
                                }
                                if (~var20 != -1 && var28.field2427) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg7.method275(var13, var15);
                            int var95 = arg7.method275(var14, var15);
                            int var96 = arg7.method275(var14, var16);
                            int var97 = arg7.method275(var13, var16);
                            if (arg5 > 0) {
                                boolean var98 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var98 = false;
                                }
                                if (~var22 < -1 && var29 != null && !var29.field100) {
                                    var98 = false;
                                }
                                if (var98 && var94 == var95 && ~var94 == ~var96 && ~var94 == ~var97) {
                                    class267.field3651[arg5][var13][var15] = (byte) class311.method1970(class267.field3651[arg5][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg12) {
                                var99 = class54.method365(var13, var15);
                                var100 = class258.method1582(var13, var15);
                            }
                            arg7.method270(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class61.method403(arg5, var13, var15);
                        }
                    }
                }
            }
            ++var13;
        }
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V", line = 829)
    public static final void method237(int arg0) {
        if (arg0 == 7) {
            class190 var1 = class236.field3212;
            synchronized (class236.field3212) {
                class236.field3212.method1249(1);
            }
            ++field487;
            class190 var2 = class395.field5772;
            synchronized (class395.field5772) {
                class395.field5772.method1249(1);
            }
            class272 var3 = class362.field5075;
            synchronized (class362.field5075) {
                class362.field5075.method1674((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)V", line = 850)
    public static void method238(byte arg0) {
        field479 = null;
        field484 = null;
        field486 = null;
        if (arg0 > -12) {
            method235(7);
        }
        field492 = null;
        field483 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)Lrp;", line = 865)
    public final class250 method239(boolean arg0) {
        ++field473;
        if (arg0) {
            this.method239(false);
        }
        return class1.field4[super.field2515];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZB)V", line = 876)
    public static final void method240(boolean arg0, byte arg1) {
        ++field490;
        class154.method1038(0);
        if (~class79.field1220 == -31 || class79.field1220 == 25) {
            if (arg1 != 37) {
                field482 = 14;
            }
            ++class207.field2806;
            if (~class207.field2806 <= -51 || arg0) {
                class207.field2806 = 0;
                if (!class28.field439 && class199.field2749 != null) {
                    ++class423.field6087;
                    class442.field6400.method158((byte) 7, 185);
                    try {
                        class199.field2749.method1579(0, 5000, class442.field6400.field5258, class442.field6400.field5273);
                        class442.field6400.field5273 = 0;
                    } catch (IOException var2) {
                        class28.field439 = true;
                    }
                }
                class154.method1038(0);
            }
        }
    }
}
