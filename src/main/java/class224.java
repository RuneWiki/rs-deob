import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class224 extends class7 {

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Lob;")
    private static class141 field4224 = class175.method1195(40, "Loading textures )2 ");

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "Lob;")
    public static class141 field4231 = field4224;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "Lob;")
    private static class141 field4235 = class175.method1195(40, "Connection timed out)3");

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "Lob;")
    public static class141 field4221 = field4235;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "Lob;")
    public static class141 field4239 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "[Lfa;")
    public static class52[] field4230;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "[[B")
    public static byte[][] field4225;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "[[Lra;")
    public static class170[][] field4232;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -72 / ((-42 - arg1) / 41);
        ++field4236;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class117.field2272 > var8; ++var8) {
                this.method1437(arg0, var8, false);
                int[][] var9 = this.method42(class174.field3448, -51, 0);
                var5[var8] = var9[0][class133.field2531];
                var6[var8] = var9[1][class133.field2531];
                var7[var8] = var9[2][class133.field2531];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        field4231 = null;
        field4221 = null;
        field4232 = null;
        field4239 = null;
        if (arg0 != -90) {
            field4230 = null;
        }
        field4224 = null;
        field4235 = null;
        field4225 = null;
        field4230 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)V")
    private final void method1437(int arg0, int arg1, boolean arg2) {
        ++field4223;
        int var4 = class15.field272[arg1];
        if (arg2) {
            method1441(-14, (class220) null);
        }
        int var5 = class177.field3503[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class174.field3448 = arg0;
            class133.field2531 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class174.field3448 = arg1;
            class133.field2531 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class133.field2531 = class117.field2272 - arg0;
            class174.field3448 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class133.field2531 = arg1;
            class174.field3448 = class60.field1174 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class174.field3448 = -arg0 + class60.field1174;
            class133.field2531 = -arg1 + class117.field2272;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class174.field3448 = class60.field1174 - arg1;
            class133.field2531 = -arg0 + class117.field2272;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class133.field2531 = arg0;
            class174.field3448 = -arg1 + class60.field1174;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class133.field2531 = -arg1 + class117.field2272;
            class174.field3448 = arg0;
        }
        class133.field2531 &= class106.field2030;
        class174.field3448 &= class54.field1050;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field4228;
        if (~arg0 == -1) {
            super.field99 = arg2.method991(255) == 1;
        }
        int var4 = -115 / ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lhi;)V")
    public static final void method1438(int arg0, class79[] arg1) {
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var113 = 0; ~var113 > -105; ++var113) {
                for (int var114 = 0; ~var114 > -105; ++var114) {
                    if (~(1 & class164.field3177[var2][var113][var114]) == -2) {
                        int var115 = var2;
                        if ((class164.field3177[1][var113][var114] & 2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (~var115 <= -1) {
                            arg1[var115].method558(var114, false, var113);
                        }
                    }
                }
            }
        }
        ++field4227;
        class87.field1741 += -2 + (int) (5.0D * Math.random());
        class2.field28 += (int) (Math.random() * 5.0D) + -2;
        if (class2.field28 < -16) {
            class2.field28 = -16;
        }
        if (arg0 != 2210) {
            field4225 = null;
        }
        if (class2.field28 > 16) {
            class2.field28 = 16;
        }
        int var3 = class2.field28 >> 1;
        int[][] var4 = new int[104][104];
        if (~class87.field1741 > 7) {
            class87.field1741 = -8;
        }
        if (~class87.field1741 < -9) {
            class87.field1741 = 8;
        }
        int[][] var5 = new int[104][104];
        int var6 = class87.field1741 >> 2 << 10;
        for (int var7 = 0; ~var7 > -5; ++var7) {
            byte[][] var50 = class57.field1118[var7];
            int var51 = (int) Math.sqrt(5100.0D);
            byte var52 = 74;
            short var53 = 768;
            int var54 = var51 * var53 >> 8;
            for (int var55 = 1; var55 < 103; ++var55) {
                for (int var103 = 1; var103 < 103; ++var103) {
                    int var105 = class31.field617[var7][var103 - -1][var55] - class31.field617[var7][var103 + -1][var55];
                    int var106 = class31.field617[var7][var103][var55 + 1] - class31.field617[var7][var103][var55 + -1];
                    int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                    int var108 = -65536 / var107;
                    int var109 = (var105 << 8) / var107;
                    int var110 = (var106 << 8) / var107;
                    int var111 = (var110 * -50 + var108 * -10 + var109 * -50) / var54 + var52;
                    int var112 = (var50[var103 - 1][var55] >> 2) - (-(var50[var103][var55 + 1] >> 3) - (var50[var103][var55] >> 1)) + (var50[var103][var55 + -1] >> 2) + (var50[var103 + 1][var55] >> 3);
                    var4[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; ++var56) {
                class60.field1178[var56] = 0;
                class5.field61[var56] = 0;
                class139.field2676[var56] = 0;
                class209.field3953[var56] = 0;
                class165.field3190[var56] = 0;
            }
            for (int var57 = -5; ~var57 > -105; ++var57) {
                for (int var88 = 0; ~var88 > -105; ++var88) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (~var97 > -105) {
                        int var98 = 255 & class118.field2295[var7][var97][var88];
                        if (~var98 < -1) {
                            class15 var99 = class25.method174(-16884, var98 + -1);
                            class60.field1178[var88] += var99.field275;
                            class5.field61[var88] += var99.field281;
                            class139.field2676[var88] += var99.field282;
                            class209.field3953[var88] += var99.field276;
                            var10002 = class165.field3190[var88]++;
                        }
                    }
                    int var100 = var57 + -5;
                    if (var100 >= 0) {
                        int var101 = class118.field2295[var7][var100][var88] & 255;
                        if (var101 > 0) {
                            class15 var102 = class25.method174(-16884, var101 + -1);
                            class60.field1178[var88] -= var102.field275;
                            class5.field61[var88] -= var102.field281;
                            class139.field2676[var88] -= var102.field282;
                            class209.field3953[var88] -= var102.field276;
                            var10002 = class165.field3190[var88]--;
                        }
                    }
                }
                if (~var57 <= -1) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; ++var94) {
                        int var95 = var94 + 5;
                        int var96 = var94 + -5;
                        if (~var95 > -105) {
                            var90 += class60.field1178[var95];
                            var89 += class5.field61[var95];
                            var93 += class165.field3190[var95];
                            var92 += class209.field3953[var95];
                            var91 += class139.field2676[var95];
                        }
                        if (~var96 <= -1) {
                            var91 -= class139.field2676[var96];
                            var89 -= class5.field61[var96];
                            var93 -= class165.field3190[var96];
                            var92 -= class209.field3953[var96];
                            var90 -= class60.field1178[var96];
                        }
                        if (var94 >= 0 && ~var93 < -1) {
                            var5[var57][var94] = class176.method1201(var91 / var93, var89 / var93, var90 * 256 / var92, -66);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; ++var58) {
                for (int var61 = 1; ~var61 > -104; ++var61) {
                    if (!class8.field128 || (2 & class164.field3177[0][var58][var61]) != 0 || (class164.field3177[var7][var58][var61] & 16) == 0 && class6.method37(var58, var7, var61, false) == class54.field1055) {
                        if (~var7 > ~class103.field1991) {
                            class103.field1991 = var7;
                        }
                        int var62 = 255 & class118.field2295[var7][var58][var61];
                        int var63 = class191.field3694[var7][var58][var61] & 255;
                        if (~var62 < -1 || var63 > 0) {
                            int var64 = class31.field617[var7][var58][var61];
                            int var65 = class31.field617[var7][var58 + 1][var61];
                            int var66 = class31.field617[var7][var58 + 1][var61 + 1];
                            int var67 = class31.field617[var7][var58][var61 - -1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (~var62 == -1 && ~class176.field3497[var7][var58][var61] != -1) {
                                    var68 = false;
                                }
                                if (var63 > 0 && !class151.method1049(arg0 ^ 2256, var63 + -1).field3703) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var65 && var64 == var66 && ~var64 == ~var67) {
                                    class9.field158[var7][var58][var61] = class57.method389(class9.field158[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var72;
                            if (~var62 < -1) {
                                var69 = var5[var58][var61];
                                int var70 = (var69 & 127) + var3;
                                if (var70 >= 0) {
                                    if (~var70 < -128) {
                                        var70 = 127;
                                    }
                                } else {
                                    var70 = 0;
                                }
                                int var71 = (64512 & var6 + var69) - -(896 & var69) + var70;
                                var72 = class44.field851[class78.method540(var71, 18459, 96)];
                            } else {
                                var72 = 0;
                                var69 = -1;
                            }
                            int var73 = var4[var58 + 1][var61];
                            int var74 = var4[var58][var61];
                            int var75 = var4[var58][var61 - -1];
                            int var76 = var4[var58 - -1][var61 - -1];
                            if (~var63 == -1) {
                                class165.method1141(var7, var58, var61, 0, 0, -1, var64, var65, var66, var67, class78.method540(var69, arg0 ^ 16569, var74), class78.method540(var69, 18459, var73), class78.method540(var69, 18459, var76), class78.method540(var69, 18459, var75), 0, 0, 0, 0, var72, 0);
                            } else {
                                byte var77 = class132.field2519[var7][var58][var61];
                                int var78 = class176.field3497[var7][var58][var61] + 1;
                                class192 var79 = class151.method1049(-70, var63 + -1);
                                int var80 = var79.field3702;
                                if (~var80 <= -1 && !class44.field857.method957(var80, 121)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = class44.field851[class65.method432(41, class44.field857.method959(var80, -30480), 96)];
                                    var82 = -1;
                                } else if (var79.field3701 == -1) {
                                    var82 = -2;
                                    var81 = 0;
                                } else {
                                    var82 = var79.field3701;
                                    int var83 = (127 & var82) + var3;
                                    if (var83 >= 0) {
                                        if (~var83 < -128) {
                                            var83 = 127;
                                        }
                                    } else {
                                        var83 = 0;
                                    }
                                    int var84 = (var6 + var82 & 64512) + (var82 & 896) + var83;
                                    var81 = class44.field851[class65.method432(41, var84, 96)];
                                }
                                if (~var79.field3700 <= -1) {
                                    int var85 = var79.field3700;
                                    int var86 = (127 & var85) - -var3;
                                    if (var86 >= 0) {
                                        if (~var86 < -128) {
                                            var86 = 127;
                                        }
                                    } else {
                                        var86 = 0;
                                    }
                                    int var87 = (var85 - -var6 & 64512) + var86 - -(var85 & 896);
                                    var81 = class44.field851[class65.method432(41, var87, 96)];
                                }
                                class165.method1141(var7, var58, var61, var78, var77, var80, var64, var65, var66, var67, class78.method540(var69, 18459, var74), class78.method540(var69, arg0 + 16249, var73), class78.method540(var69, 18459, var76), class78.method540(var69, 18459, var75), class65.method432(arg0 ^ 2187, var82, var74), class65.method432(41, var82, var73), class65.method432(41, var82, var76), class65.method432(41, var82, var75), var72, var81);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; ++var59) {
                for (int var60 = 1; var60 < 103; ++var60) {
                    class116.method754(var7, var60, var59, class6.method37(var60, var7, var59, false));
                }
            }
            class118.field2295[var7] = null;
            class191.field3694[var7] = null;
            class176.field3497[var7] = null;
            class132.field2519[var7] = null;
            class57.field1118[var7] = null;
        }
        class81.method564(-50, -10, -50);
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var49 = 0; var49 < 104; ++var49) {
                if (~(2 & class164.field3177[1][var8][var49]) == -3) {
                    class161.method1123(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 4;
        int var11 = 2;
        for (int var12 = 0; var12 < 4; ++var12) {
            if (~var12 < -1) {
                var10 <<= 3;
                var11 <<= 3;
                var9 <<= 3;
            }
            for (int var13 = 0; var12 >= var13; ++var13) {
                for (int var14 = 0; ~var14 >= -105; ++var14) {
                    for (int var15 = 0; ~var15 >= -105; ++var15) {
                        if ((var9 & class9.field158[var13][var15][var14]) != 0) {
                            int var16 = var14;
                            int var17 = var13;
                            while (~var16 < -1 && (var9 & class9.field158[var13][var15][var16 + -1]) != 0) {
                                --var16;
                            }
                            int var18 = var14;
                            int var19 = var13;
                            while (var18 < 104 && (class9.field158[var13][var15][var18 - -1] & var9) != 0) {
                                ++var18;
                            }
                            label358: while (var17 > 0) {
                                for (int var20 = var16; ~var18 <= ~var20; ++var20) {
                                    if (~(var9 & class9.field158[var17 - 1][var15][var20]) == -1) {
                                        break label358;
                                    }
                                }
                                --var17;
                            }
                            label347: while (var19 < var12) {
                                for (int var21 = var16; ~var18 <= ~var21; ++var21) {
                                    if ((class9.field158[var19 + 1][var15][var21] & var9) == 0) {
                                        break label347;
                                    }
                                }
                                ++var19;
                            }
                            int var22 = (-var16 + 1 + var18) * (var19 + 1 + -var17);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class31.field617[var19][var15][var16] + -var23;
                                int var25 = class31.field617[var17][var15][var16];
                                class68.method451(var12, 1, var15 * 128, var15 * 128, var16 * 128, var18 * 128 - -128, var24, var25);
                                for (int var26 = var17; ~var26 >= ~var19; ++var26) {
                                    for (int var27 = var16; ~var18 <= ~var27; ++var27) {
                                        class9.field158[var26][var15][var27] = class15.method94(class9.field158[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if (~(class9.field158[var13][var15][var14] & var11) != -1) {
                            int var28 = var15;
                            int var29 = var15;
                            while (var28 < 104 && (var11 & class9.field158[var13][var28 + 1][var14]) != 0) {
                                ++var28;
                            }
                            while (var29 > 0 && (class9.field158[var13][var29 + -1][var14] & var11) != 0) {
                                --var29;
                            }
                            int var30 = var13;
                            int var31 = var13;
                            label412: while (var30 > 0) {
                                for (int var32 = var29; var28 >= var32; ++var32) {
                                    if ((class9.field158[var30 - 1][var32][var14] & var11) == 0) {
                                        break label412;
                                    }
                                }
                                --var30;
                            }
                            label401: while (var31 < var12) {
                                for (int var33 = var29; ~var28 <= ~var33; ++var33) {
                                    if (~(class9.field158[var31 + 1][var33][var14] & var11) == -1) {
                                        break label401;
                                    }
                                }
                                ++var31;
                            }
                            int var34 = (-var30 + var31 - -1) * (var28 - var29 + 1);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class31.field617[var31][var29][var14] + -var35;
                                int var37 = class31.field617[var30][var29][var14];
                                class68.method451(var12, 2, var29 * 128, var28 * 128 - -128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var30; ~var38 >= ~var31; ++var38) {
                                    for (int var39 = var29; var39 <= var28; ++var39) {
                                        class9.field158[var38][var39][var14] = class15.method94(class9.field158[var38][var39][var14], ~var11);
                                    }
                                }
                            }
                        }
                        if ((class9.field158[var13][var15][var14] & var10) != 0) {
                            int var40 = var14;
                            int var41 = var15;
                            while (~var40 < -1 && ~(class9.field158[var13][var15][var40 + -1] & var10) != -1) {
                                --var40;
                            }
                            int var42 = var15;
                            int var43;
                            for (var43 = var14; ~var43 > -105 && (class9.field158[var13][var15][var43 + 1] & var10) != 0; ++var43) {
                            }
                            label466: while (var41 > 0) {
                                for (int var44 = var40; var44 <= var43; ++var44) {
                                    if ((class9.field158[var13][var41 + -1][var44] & var10) == 0) {
                                        break label466;
                                    }
                                }
                                --var41;
                            }
                            label455: while (var42 < 104) {
                                for (int var45 = var40; ~var45 >= ~var43; ++var45) {
                                    if (~(class9.field158[var13][var42 - -1][var45] & var10) == -1) {
                                        break label455;
                                    }
                                }
                                ++var42;
                            }
                            if (~((-var41 + var42 - -1) * (-var40 + 1 + var43)) <= -5) {
                                int var46 = class31.field617[var13][var41][var40];
                                class68.method451(var12, 4, var41 * 128, var42 * 128 + 128, var40 * 128, var43 * 128 + 128, var46, var46);
                                for (int var47 = var41; ~var42 <= ~var47; ++var47) {
                                    for (int var48 = var40; ~var43 <= ~var48; ++var48) {
                                        class9.field158[var13][var47][var48] = class15.method94(class9.field158[var13][var47][var48], ~var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        class160.field3095.method1385(9946);
        if (arg0 > -93) {
            field4221 = null;
        }
        ++field4234;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lra;I)V")
    public static final void method1440(int arg0, class170[] arg1, int arg2) {
        ++field4229;
        if (arg2 == -15562) {
            for (int var3 = 0; arg1.length > var3; ++var3) {
                class170 var4 = arg1[var3];
                if (var4 != null) {
                    if (~var4.field3392 == -1) {
                        if (var4.field3337 != null) {
                            method1440(arg0, var4.field3337, -15562);
                        }
                        class174 var5 = (class174) class173.field3437.method792((long) var4.field3396, 22346);
                        if (var5 != null) {
                            class216.method1411(arg0, true, var5.field3454);
                        }
                    }
                    if (arg0 == 0 && var4.field3310 != null) {
                        class220 var6 = new class220();
                        var6.field4168 = var4;
                        var6.field4177 = var4.field3310;
                        method1441(-125, var6);
                    }
                    if (arg0 == 1 && var4.field3376 != null) {
                        if (~var4.field3357 <= -1) {
                            class170 var7 = class192.method1268(var4.field3396, -76);
                            if (var7 == null || var7.field3337 == null || ~var4.field3357 <= ~var7.field3337.length || var7.field3337[var4.field3357] != var4) {
                                continue;
                            }
                        }
                        class220 var8 = new class220();
                        var8.field4177 = var4.field3376;
                        var8.field4168 = var4;
                        method1441(arg2 + 15447, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILwc;)V")
    public static final void method1441(int arg0, class220 arg1) {
        ++field4222;
        if (arg0 <= -98) {
            class214.method1397(arg1, 200000, 26186);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)J")
    public static final long method1442(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        return var3 != null && var3.field2929 != null ? var3.field2929.field3417 : 0L;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field4238;
        if (arg0 < 13) {
            method1438(7, (class79[]) null);
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            for (int var4 = 0; var4 < class117.field2272; ++var4) {
                this.method1437(arg1, var4, false);
                int[] var5 = this.method52(class174.field3448, 0, 93);
                var3[var4] = var5[class133.field2531];
            }
        }
        return var3;
    }
}
