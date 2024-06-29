import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class383 {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field5610 = -1;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field5611 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lkg;")
    public static class317 field5609;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lfb;I)V", line = 7)
    public static final void method2488(class341 arg0, int arg1) {
        field5606++;
        if (arg0.field5042.length - arg0.field5049 < 1) {
            return;
        }
        int var2 = arg0.method2233((byte) 104);
        if (var2 < 0 || var2 > 14) {
            return;
        }
        byte var3;
        if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field5042.length - arg0.field5049)) {
            return;
        }
        class378.field5531 = arg0.method2233((byte) 104);
        if (class378.field5531 < 1) {
            class378.field5531 = 1;
        } else if (class378.field5531 > 4) {
            class378.field5531 = 4;
        }
        class7.method40(arg0.method2233((byte) 104) == 1, -29254);
        class232.field3223 = arg0.method2233((byte) 104) == 1;
        class24.field434 = arg0.method2233((byte) 104) == 1;
        class397.field5799 = arg0.method2233((byte) 104) == 1;
        class116.field1508 = arg0.method2233((byte) 104) == 1 ? 1 : 0;
        class407.field5937 = arg0.method2233((byte) 104) == 1;
        class423.field6169 = arg0.method2233((byte) 104) == 1;
        class354.field5256 = arg0.method2233((byte) 104) == 1;
        class330.field4863 = arg0.method2233((byte) 104);
        if (class330.field4863 > 2) {
            class330.field4863 = 2;
        }
        if (var2 < 2) {
            class273.field4015 = arg0.method2233((byte) 104) == 1;
            arg0.method2233((byte) 104);
        } else {
            class273.field4015 = arg0.method2233((byte) 104) == 1;
        }
        class452.field6560 = arg0.method2233((byte) 104) == 1;
        class1.field10 = arg0.method2233((byte) 104) == 1;
        class355.field5263 = arg0.method2233((byte) 104);
        if (class355.field5263 > 2) {
            class355.field5263 = 2;
        }
        class104.field1359 = class355.field5263;
        class338.field4993 = arg0.method2233((byte) 104) == 1;
        class227.field3128 = arg0.method2233((byte) 104);
        if (class227.field3128 > 127) {
            class227.field3128 = 127;
        }
        class154.field1961 = arg0.method2233((byte) 104);
        class389.field5692 = arg0.method2233((byte) 104);
        if (class389.field5692 > 127) {
            class389.field5692 = 127;
        }
        if (var2 >= 1) {
            class289.field4338 = arg0.method2239(-1076227960);
            class197.field2724 = arg0.method2239(-1076227960);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method2233((byte) 104);
        }
        if (var2 >= 4) {
            int var4 = arg0.method2233((byte) 104);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class393.field5727 < 96) {
                var4 = 0;
            }
            class199.method1313(105, var4);
        }
        if (var2 >= 5) {
            class241.field3377 = arg0.method2232(-68);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class195.field2700 = var5 = arg0.method2233((byte) 104);
        }
        if (class195.field2700 != 1 && class195.field2700 != 2) {
            class195.field2700 = 2;
        }
        if (var2 >= 7) {
            class257.field3777 = arg0.method2233((byte) 104) == 1;
        }
        if (var2 >= 8) {
            class331.field4880 = arg0.method2233((byte) 104) == 1;
        }
        if (var2 >= 9) {
            class249.field3681 = arg0.method2233((byte) 104);
        }
        if (class249.field3681 < 0 || class249.field3681 > 3) {
            class249.field3681 = 0;
        }
        if (var2 >= 10) {
            class256.field3747 = arg0.method2233((byte) 104) != 0;
        }
        if (var2 >= 11) {
            class389.field5689 = arg0.method2233((byte) 104) != 0;
        }
        if (var2 >= 12) {
            class116.field1508 = arg0.method2233((byte) 104);
        }
        if (class116.field1508 < 0 || class116.field1508 > 2) {
            class116.field1508 = 1;
        }
        if (arg1 >= -44) {
            return;
        }
        if (var2 >= 13) {
            class257.field3775 = arg0.method2233((byte) 104) == 1;
        }
        if (var2 >= 14) {
            class325.field4817 = arg0.method2233((byte) 104);
        } else if (var5 == 0) {
            class325.field4817 = 2;
        } else {
            class325.field4817 = 1;
        }
        if (class325.field4817 < 0 || class325.field4817 > 3) {
            class325.field4817 = 2;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V", line = 224)
    public static final void method2489(long arg0, int arg1) {
        field5607++;
        int var3 = class424.field6188 + field5609.field5921;
        int var4 = class78.field1092 + field5609.field5930;
        if (arg1 != 844) {
            field5610 = -17;
        }
        if (class357.field5297 - var3 < -500 || (class357.field5297 - var3) > 500 || class159.field2065 - var4 < -500 || (class159.field2065 - var4) > 500) {
            class357.field5297 = var3;
            class159.field2065 = var4;
        }
        if (class357.field5297 != var3) {
            int var5 = var3 - class357.field5297;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class357.field5297 += var6;
        }
        if (class159.field2065 != var4) {
            int var7 = var4 - class159.field2065;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class159.field2065 += var8;
        }
        if (!class331.field4880) {
            class247.field3479 += (float) arg0 * class267.field3961 / 6.0F;
            class39.field588 += (float) arg0 * class397.field5791 / 6.0F;
        }
        class356.method2342((byte) -104);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 314)
    public static void method2490(boolean arg0) {
        field5609 = null;
        if (arg0) {
            field5609 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[[[B", line = 336)
    public static final byte[][][] method2491(int arg0, int arg1) {
        field5608++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[arg0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var22 << 1 <= var127) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if ((var31 >> 1) >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var34 << 1) <= var123) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= (var37 >> 1)) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var3 / 2 >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= var3 / 2) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var79 - var4 / 2)) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - (var4 / 2)) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - var4 / 2 >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= var88 - (var4 / 2)) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - var4 / 2 <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - var4 / 2)) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }
}
