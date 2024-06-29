import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class244 extends class349 {

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "Z")
    private boolean field3283 = true;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    private int field3280 = 4096;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "Lcb;")
    public static class318 field3284 = new class318(27, 8);

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "[[I")
    public static int[][] field3288;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Lmaa;")
    public static final class588 method1492(int arg0) {
        ++field3282;
        if (class561.field7658 != null && class20.field184 != null) {
            class20.field184.method420(class561.field7658, false);
            if (arg0 != 0) {
                field3284 = null;
            }
            class588 var1 = (class588) class20.field184.method415((byte) -30);
            if (var1 == null) {
                return null;
            } else {
                class679 var2 = class561.field7649.method218(var1.field8076, (byte) 13);
                return var2 != null && var2.field9613 && var2.method3747((byte) 91, class561.field7645) ? var1 : class273.method1669(arg0);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field3287;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = -48 % ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[] var5 = this.method2181(0, -1090477337, arg0 + -1 & class4.field38);
            int[] var6 = this.method2181(0, -1090477337, arg0);
            int[] var7 = this.method2181(0, -1090477337, class4.field38 & arg0 + 1);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class39.field497 < ~var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field3280;
                int var13 = (var6[var11 + 1 & class144.field1839] + -var6[class144.field1839 & var11 + -1]) * this.field3280;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 - -4096 + var17) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = var13 / var18;
                    var21 = var12 / var18;
                    var19 = 16777216 / var18;
                }
                if (this.field3283) {
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var11] = var20;
                var9[var11] = var21;
                var10[var11] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field3288 = null;
        if (arg0 <= -78) {
            field3284 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 == 4095) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field3283 = arg2.method957((byte) -84) == 1;
                }
            } else {
                this.field3280 = arg2.method922((byte) -124);
            }
            ++field3285;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(III)Z")
    public static final boolean method1494(int arg0, int arg1, int arg2) {
        ++field3281;
        if (arg0 != 19446) {
            return false;
        } else {
            return class512.method2896((byte) 122, arg2, arg1) | ~(arg2 & 262144) != -1 || class395.method2346(arg1, 34165, arg2);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)[[[B")
    public static final byte[][][] method1495(boolean arg0, int arg1) {
        ++field3286;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var4 > var7; ++var7) {
            for (int var132 = 0; ~var132 > ~var3; ++var132) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var131 = 0; ~var131 > ~var4; ++var131) {
                if (~var10 <= ~var131) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; var130 < var3; ++var130) {
                if (~var13 >= ~var130) {
                    var12[var11] = -1;
                }
                ++var11;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 + -1; ~var16 <= -1; --var16) {
            for (int var129 = 0; ~var3 < ~var129; ++var129) {
                if (~var16 >= ~var129) {
                    var15[var14] = -1;
                }
                ++var14;
            }
        }
        var2[0][3] = var15;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; --var19) {
            for (int var128 = 0; ~var3 < ~var128; ++var128) {
                if (var19 >> 1 >= var128) {
                    var17[var18] = -1;
                }
                ++var18;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; ~var4 < ~var22; ++var22) {
            for (int var127 = 0; ~var3 < ~var127; ++var127) {
                if (var21 >= 0 && ~var21 > ~var20.length) {
                    if (var127 >= var22 << 1) {
                        var20[var21] = -1;
                    }
                    ++var21;
                } else {
                    ++var21;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; ++var25) {
            for (int var126 = var3 - 1; var126 >= 0; --var126) {
                if (~(var25 >> 1) <= ~var126) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 + -1; ~var28 <= -1; --var28) {
            for (int var125 = var3 + -1; var125 >= 0; --var125) {
                if (var28 << 1 <= var125) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; var31 >= 0; --var31) {
            for (int var124 = var3 - 1; var124 >= 0; --var124) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; ~var34 <= -1; --var34) {
            for (int var123 = 0; var3 > var123; ++var123) {
                if (var34 << 1 <= var123) {
                    var33[var32] = -1;
                }
                ++var32;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; ~var4 < ~var37; ++var37) {
            for (int var122 = 0; ~var3 < ~var122; ++var122) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                ++var36;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var4 > var40; ++var40) {
            for (int var121 = var3 - 1; var121 >= 0; --var121) {
                if (~(var40 << 1) >= ~var121) {
                    var38[var39] = -1;
                }
                ++var39;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
            for (int var120 = 0; var3 > var120; ++var120) {
                if (~var120 <= ~(var43 >> 1)) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                ++var44;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; ~var4 < ~var49; ++var49) {
            for (int var118 = var3 + -1; var118 >= 0; --var118) {
                if (~(var49 >> 1) >= ~var118) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 + -1; var52 >= 0; --var52) {
            for (int var117 = var3 + -1; var117 >= 0; --var117) {
                if (var52 << 1 >= var117) {
                    var50[var51] = -1;
                }
                ++var51;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 + -1; var55 >= 0; --var55) {
            for (int var116 = var3 + -1; var116 >= 0; --var116) {
                if (~var116 <= ~(var55 >> 1)) {
                    var54[var53] = -1;
                }
                ++var53;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; --var58) {
            for (int var115 = 0; ~var3 < ~var115; ++var115) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; ~var61 > ~var4; ++var61) {
            for (int var114 = 0; var3 > var114; ++var114) {
                if (var61 >> 1 <= var114) {
                    var59[var60] = -1;
                }
                ++var60;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; ~var64 > ~var4; ++var64) {
            for (int var113 = var3 + -1; var113 >= 0; --var113) {
                if (var113 <= var64 << 1) {
                    var63[var62] = -1;
                }
                ++var62;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; ++var67) {
            for (int var112 = 0; ~var112 > ~var3; ++var112) {
                if (var3 / 2 >= var112) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; ~var4 < ~var70; ++var70) {
            for (int var111 = 0; var111 < var3; ++var111) {
                if (var70 <= var4 / 2) {
                    var69[var68] = -1;
                }
                ++var68;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; ~var73 > ~var4; ++var73) {
            for (int var110 = 0; ~var110 > ~var3; ++var110) {
                if (var3 / 2 <= var110) {
                    var72[var71] = -1;
                }
                ++var71;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; ~var4 < ~var76; ++var76) {
            for (int var109 = 0; var109 < var3; ++var109) {
                if (var76 >= var4 / 2) {
                    var75[var74] = -1;
                }
                ++var74;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        if (!arg0) {
            return null;
        } else {
            for (int var79 = 0; ~var4 < ~var79; ++var79) {
                for (int var108 = 0; var108 < var3; ++var108) {
                    if (~var108 >= ~(-(var4 / 2) + var79)) {
                        var77[var78] = -1;
                    }
                    ++var78;
                }
            }
            var2[6][0] = var77;
            int var80 = 0;
            byte[] var81 = new byte[var3 * var4];
            for (int var82 = var4 + -1; var82 >= 0; --var82) {
                for (int var107 = 0; ~var3 < ~var107; ++var107) {
                    if (var107 <= -(var4 / 2) + var82) {
                        var81[var80] = -1;
                    }
                    ++var80;
                }
            }
            var2[6][1] = var81;
            byte[] var83 = new byte[var3 * var4];
            int var84 = 0;
            for (int var85 = var4 + -1; var85 >= 0; --var85) {
                for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                    if (var106 <= -(var4 / 2) + var85) {
                        var83[var84] = -1;
                    }
                    ++var84;
                }
            }
            var2[6][2] = var83;
            int var86 = 0;
            byte[] var87 = new byte[var3 * var4];
            for (int var88 = 0; ~var4 < ~var88; ++var88) {
                for (int var105 = var3 + -1; ~var105 <= -1; --var105) {
                    if (-(var4 / 2) + var88 >= var105) {
                        var87[var86] = -1;
                    }
                    ++var86;
                }
            }
            var2[6][3] = var87;
            int var89 = 0;
            byte[] var90 = new byte[var3 * var4];
            for (int var91 = 0; var91 < var4; ++var91) {
                for (int var104 = 0; var104 < var3; ++var104) {
                    if (~var104 <= ~(var91 - var4 / 2)) {
                        var90[var89] = -1;
                    }
                    ++var89;
                }
            }
            var2[7][0] = var90;
            int var92 = 0;
            byte[] var93 = new byte[var3 * var4];
            for (int var94 = var4 + -1; var94 >= 0; --var94) {
                for (int var103 = 0; ~var3 < ~var103; ++var103) {
                    if (~var103 <= ~(var94 - var4 / 2)) {
                        var93[var92] = -1;
                    }
                    ++var92;
                }
            }
            var2[7][1] = var93;
            byte[] var95 = new byte[var3 * var4];
            int var96 = 0;
            for (int var97 = var4 + -1; ~var97 <= -1; --var97) {
                for (int var102 = var3 + -1; var102 >= 0; --var102) {
                    if (~(-(var4 / 2) + var97) >= ~var102) {
                        var95[var96] = -1;
                    }
                    ++var96;
                }
            }
            var2[7][2] = var95;
            byte[] var98 = new byte[var3 * var4];
            int var99 = 0;
            for (int var100 = 0; ~var100 > ~var4; ++var100) {
                for (int var101 = var3 + -1; var101 >= 0; --var101) {
                    if (~var101 <= ~(-(var4 / 2) + var100)) {
                        var98[var99] = -1;
                    }
                    ++var99;
                }
            }
            var2[7][3] = var98;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lfca;IIZB)V")
    public static final void method1496(class188 arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        ++field3279;
        int var5 = -121 % ((19 - arg4) / 47);
        int var6 = arg0.field2438;
        if (~arg0.field2374 != -1) {
            if (arg0.field2374 != 1) {
                if (arg0.field2374 == 2) {
                    arg0.field2438 = arg0.field2323 * arg2 >> 14;
                }
            } else {
                arg0.field2438 = arg2 - arg0.field2323;
            }
        } else {
            arg0.field2438 = arg0.field2323;
        }
        int var7 = arg0.field2371;
        if (arg0.field2411 != 0) {
            if (~arg0.field2411 == -2) {
                arg0.field2371 = -arg0.field2455 + arg1;
            } else if (arg0.field2411 == 2) {
                arg0.field2371 = arg0.field2455 * arg1 >> 14;
            }
        } else {
            arg0.field2371 = arg0.field2455;
        }
        if (arg0.field2374 == 4) {
            arg0.field2438 = arg0.field2371 * arg0.field2347 / arg0.field2336;
        }
        if (arg0.field2411 == 4) {
            arg0.field2371 = arg0.field2438 * arg0.field2336 / arg0.field2347;
        }
        if (class380.field5455 && (~client.method1411(arg0).field3648 != -1 || arg0.field2304 == 0)) {
            if (~arg0.field2371 > -6 && arg0.field2438 < 5) {
                arg0.field2371 = 5;
                arg0.field2438 = 5;
            } else {
                if (arg0.field2371 <= 0) {
                    arg0.field2371 = 5;
                }
                if (~arg0.field2438 >= -1) {
                    arg0.field2438 = 5;
                }
            }
        }
        if (~class668.field9502 == ~arg0.field2412) {
            class166.field2077 = arg0;
        }
        if (arg3 && arg0.field2403 != null) {
            if (arg0.field2438 != var6 || ~arg0.field2371 != ~var7) {
                class425 var8 = new class425();
                var8.field5911 = arg0;
                var8.field5913 = arg0.field2403;
                class380.field5450.method378(var8, 31316);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
    public class244() {
        super(1, false);
    }
}
