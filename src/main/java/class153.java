import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class153 extends class175 {

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "[I")
    private int[] field2694 = new int[3];

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    private int field2683 = 3216;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    private int field2691 = 4096;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    private int field2704 = 3216;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "[I")
    public static int[] field2689 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Lmb;")
    public static class96 field2685 = class243.method1708("Lade)3)3)3", (byte) 117);

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "Lmb;")
    public static class96 field2702 = class243.method1708("Lade Wordpack )2 ", (byte) 116);

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lmb;")
    public static class96 field2699 = class243.method1708(")3", (byte) 113);

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lmb;")
    public static class96 field2696 = class243.method1708("Weiter", (byte) 95);

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "[I")
    public static int[] field2681;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2690;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ[Lsi;)V")
    public static final void method1116(boolean arg0, boolean arg1, class207[] arg2) {
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        ++field2688;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        if (~(1 & class132.field2376[var4][var5][var6]) == -2) {
                            int var7 = var4;
                            if ((2 & class132.field2376[1][var5][var6]) == 2) {
                                var7 = var4 - 1;
                            }
                            if (~var7 <= -1) {
                                arg2[var7].method1441(var6, var5, 3);
                            }
                        }
                    }
                }
            }
            class192.field3322 += (int) (5.0D * Math.random()) - 2;
            if (class192.field3322 < -8) {
                class192.field3322 = -8;
            }
            class239.field4159 += (int) (Math.random() * 5.0D) - 2;
            if (~class239.field4159 > 15) {
                class239.field4159 = -16;
            }
            if (~class192.field3322 < -9) {
                class192.field3322 = 8;
            }
            if (class239.field4159 > 16) {
                class239.field4159 = 16;
            }
        }
        int var8 = class192.field3322 >> 2 << 10;
        int var9 = class239.field4159 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (!arg0) {
            method1119((class3) null, 34, -38);
        }
        for (int var12 = 0; ~var12 > ~var3; ++var12) {
            byte[][] var51 = class27.field462[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; ~var54 > -104; ++var54) {
                for (int var100 = 1; var100 < 103; ++var100) {
                    byte var101 = 74;
                    int var102 = class173.field3022[var12][var100 + 1][var54] + -class173.field3022[var12][var100 + -1][var54];
                    int var103 = class173.field3022[var12][var100][var54 + 1] - class173.field3022[var12][var100][var54 + -1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var51[var100][var54 + -1] >> 2) + ((var51[var100 + -1][var54] >> 2) - (-(var51[var100][var54 + 1] >> 3) + -(var51[var100 + 1][var54] >> 3) + -(var51[var100][var54] >> 1)));
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var106 * -10 + (var105 * -50 - -(var108 * -50))) / var53 + var101;
                    var10[var100][var54] = -var107 + var109;
                }
            }
            for (int var55 = 0; ~var55 > -105; ++var55) {
                class233.field4003[var55] = 0;
                class54.field939[var55] = 0;
                class214.field3688[var55] = 0;
                class10.field175[var55] = 0;
                class154.field2713[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; ++var56) {
                for (int var85 = 0; ~var85 > -105; ++var85) {
                    int var94 = var56 - -5;
                    int var10002;
                    if (~var94 > -105) {
                        int var95 = 255 & class48.field857[var12][var94][var85];
                        if (var95 > 0) {
                            class211 var96 = class219.method1509((byte) 117, var95 - 1);
                            class233.field4003[var85] += var96.field3645;
                            class54.field939[var85] += var96.field3642;
                            class214.field3688[var85] += var96.field3633;
                            class10.field175[var85] += var96.field3648;
                            var10002 = class154.field2713[var85]++;
                        }
                    }
                    int var97 = var56 + -5;
                    if (var97 >= 0) {
                        int var98 = class48.field857[var12][var97][var85] & 255;
                        if (var98 > 0) {
                            class211 var99 = class219.method1509((byte) 104, var98 - 1);
                            class233.field4003[var85] -= var99.field3645;
                            class54.field939[var85] -= var99.field3642;
                            class214.field3688[var85] -= var99.field3633;
                            class10.field175[var85] -= var99.field3648;
                            var10002 = class154.field2713[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; ++var91) {
                        int var92 = var91 + 5;
                        int var93 = var91 + -5;
                        if (~var92 > -105) {
                            var87 += class10.field175[var92];
                            var89 += class154.field2713[var92];
                            var86 += class233.field4003[var92];
                            var88 += class54.field939[var92];
                            var90 += class214.field3688[var92];
                        }
                        if (var93 >= 0) {
                            var88 -= class54.field939[var93];
                            var89 -= class154.field2713[var93];
                            var86 -= class233.field4003[var93];
                            var87 -= class10.field175[var93];
                            var90 -= class214.field3688[var93];
                        }
                        if (~var91 <= -1 && var89 > 0) {
                            var11[var56][var91] = class264.method1823(var90 / var89, var86 * 256 / var87, var88 / var89, -1041654687);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; ++var57) {
                for (int var58 = 1; var58 < 103; ++var58) {
                    if (arg1 || class106.method786(122) || ~(class132.field2376[0][var57][var58] & 2) != -1 || (class132.field2376[var12][var57][var58] & 16) == 0 && ~class76.method551(var57, var58, var12, (byte) -117) == ~class277.field4822) {
                        if (~var12 > ~class41.field707) {
                            class41.field707 = var12;
                        }
                        int var59 = class247.field4276[var12][var57][var58] & 255;
                        int var60 = class48.field857[var12][var57][var58] & 255;
                        if (var60 > 0 || ~var59 < -1) {
                            int var61 = class173.field3022[var12][var57][var58];
                            int var62 = class173.field3022[var12][var57 + 1][var58];
                            int var63 = class173.field3022[var12][var57 + 1][var58 + 1];
                            int var64 = class173.field3022[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (~var60 == -1 && ~class272.field4733[var12][var57][var58] != -1) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class248.method1734(var59 - 1, -108).field3336) {
                                    var65 = false;
                                }
                                if (var65 && ~var61 == ~var62 && ~var61 == ~var63 && var61 == var64) {
                                    class162.field2889[var12][var57][var58] = class45.method348(class162.field2889[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var60 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var11[var57][var58];
                                int var68 = (var67 & 127) + var9;
                                if (~var68 <= -1) {
                                    if (~var68 < -128) {
                                        var68 = 127;
                                    }
                                } else {
                                    var68 = 0;
                                }
                                int var69 = (var67 - -var8 & 64512) + (896 & var67) - -var68;
                                var66 = class240.field4166[class11.method85(96, -12520, var69)];
                            }
                            int var70 = var10[var57 - -1][var58];
                            int var71 = var10[var57][var58];
                            int var72 = var10[var57][var58 + 1];
                            int var73 = var10[var57 + 1][var58 + 1];
                            if (var59 != 0) {
                                byte var74 = class169.field2969[var12][var57][var58];
                                int var75 = class272.field4733[var12][var57][var58] + 1;
                                class193 var76 = class248.method1734(var59 + -1, -122);
                                int var77 = var76.field3328;
                                if (var77 >= 0 && !class240.field4167.method895(var77, 1)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (~var77 > -1) {
                                    if (var76.field3326 == -1) {
                                        var78 = -2;
                                        var79 = 0;
                                    } else {
                                        var78 = var76.field3326;
                                        int var80 = (var78 & 127) - -var9;
                                        if (~var80 > -1) {
                                            var80 = 0;
                                        } else if (~var80 < -128) {
                                            var80 = 127;
                                        }
                                        int var81 = (var78 - -var8 & 64512) + (var78 & 896) + var80;
                                        var79 = class240.field4166[class234.method1589(96, 124, var81)];
                                    }
                                } else {
                                    var78 = -1;
                                    var79 = class240.field4166[class234.method1589(96, 125, class240.field4167.method896(var77, 0))];
                                }
                                if (var76.field3331 >= 0) {
                                    int var82 = var76.field3331;
                                    int var83 = (127 & var82) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (~var83 < -128) {
                                        var83 = 127;
                                    }
                                    int var84 = (64512 & var8 + var82) - (-(896 & var82) + -var83);
                                    var79 = class240.field4166[class234.method1589(96, 110, var84)];
                                }
                                class37.method297(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class11.method85(var71, -12520, var67), class11.method85(var70, -12520, var67), class11.method85(var73, -12520, var67), class11.method85(var72, -12520, var67), class234.method1589(var71, 93, var78), class234.method1589(var70, 110, var78), class234.method1589(var73, 102, var78), class234.method1589(var72, 95, var78), var66, var79);
                            } else {
                                class37.method297(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class11.method85(var71, -12520, var67), class11.method85(var70, -12520, var67), class11.method85(var73, -12520, var67), class11.method85(var72, -12520, var67), 0, 0, 0, 0, var66, 0);
                            }
                        }
                    }
                }
            }
            class48.field857[var12] = null;
            class247.field4276[var12] = null;
            class272.field4733[var12] = null;
            class169.field2969[var12] = null;
            class27.field462[var12] = null;
        }
        class168.method1209(-50, -10, -50);
        if (!arg1) {
            for (int var13 = 0; var13 < 104; ++var13) {
                for (int var50 = 0; ~var50 > -105; ++var50) {
                    if (~(2 & class132.field2376[1][var13][var50]) == -3) {
                        class200.method1397(var13, var50);
                    }
                }
            }
            for (int var14 = 0; var14 < 4; ++var14) {
                for (int var15 = 0; ~var15 >= -105; ++var15) {
                    for (int var16 = 0; var16 <= 104; ++var16) {
                        if (~(class162.field2889[var14][var16][var15] & 1) != -1) {
                            int var17;
                            for (var17 = var15; var17 > 0 && ~(class162.field2889[var14][var16][var17 + -1] & 1) != -1; --var17) {
                            }
                            int var18 = var14;
                            int var19 = var14;
                            int var20;
                            for (var20 = var15; var20 < 104 && ~(class162.field2889[var14][var16][var20 + 1] & 1) != -1; ++var20) {
                            }
                            label352: while (~var19 < -1) {
                                for (int var21 = var17; ~var20 <= ~var21; ++var21) {
                                    if ((class162.field2889[var19 + -1][var16][var21] & 1) == 0) {
                                        break label352;
                                    }
                                }
                                --var19;
                            }
                            label341: while (var18 < 3) {
                                for (int var22 = var17; var20 >= var22; ++var22) {
                                    if ((1 & class162.field2889[var18 + 1][var16][var22]) == 0) {
                                        break label341;
                                    }
                                }
                                ++var18;
                            }
                            int var23 = (-var17 + var20 - -1) * (var18 - -1 + -var19);
                            if (~var23 <= -9) {
                                short var24 = 240;
                                int var25 = class173.field3022[var18][var16][var17] + -var24;
                                int var26 = class173.field3022[var19][var16][var17];
                                class226.method1537(1, var16 * 128, var16 * 128, var17 * 128, var20 * 128 - -128, var25, var26);
                                for (int var27 = var19; var18 >= var27; ++var27) {
                                    for (int var28 = var17; ~var28 >= ~var20; ++var28) {
                                        class162.field2889[var27][var16][var28] = class130.method985(class162.field2889[var27][var16][var28], -2);
                                    }
                                }
                            }
                        }
                        if ((class162.field2889[var14][var16][var15] & 2) != 0) {
                            int var29;
                            for (var29 = var16; ~var29 > -105 && ~(class162.field2889[var14][var29 - -1][var15] & 2) != -1; ++var29) {
                            }
                            int var30 = var16;
                            int var31 = var14;
                            while (var30 > 0 && (class162.field2889[var14][var30 + -1][var15] & 2) != 0) {
                                --var30;
                            }
                            int var32;
                            label406: for (var32 = var14; ~var32 < -1; --var32) {
                                for (int var33 = var30; ~var29 <= ~var33; ++var33) {
                                    if ((class162.field2889[var32 + -1][var33][var15] & 2) == 0) {
                                        break label406;
                                    }
                                }
                            }
                            label395: while (var31 < 3) {
                                for (int var34 = var30; ~var34 >= ~var29; ++var34) {
                                    if ((2 & class162.field2889[var31 + 1][var34][var15]) == 0) {
                                        break label395;
                                    }
                                }
                                ++var31;
                            }
                            int var35 = (-var30 + 1 + var29) * (var31 + 1 + -var32);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class173.field3022[var31][var30][var15] + -var36;
                                int var38 = class173.field3022[var32][var30][var15];
                                class226.method1537(2, var30 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var32; ~var39 >= ~var31; ++var39) {
                                    for (int var40 = var30; ~var29 <= ~var40; ++var40) {
                                        class162.field2889[var39][var40][var15] = class130.method985(class162.field2889[var39][var40][var15], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & class162.field2889[var14][var16][var15]) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; ~var43 < -1 && ~(class162.field2889[var14][var16][var43 - 1] & 4) != -1; --var43) {
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && ~(4 & class162.field2889[var14][var16][var44 + 1]) != -1; ++var44) {
                            }
                            label461: while (var41 > 0) {
                                for (int var45 = var43; ~var45 >= ~var44; ++var45) {
                                    if (~(4 & class162.field2889[var14][var41 + -1][var45]) == -1) {
                                        break label461;
                                    }
                                }
                                --var41;
                            }
                            label450: while (var42 < 104) {
                                for (int var46 = var43; ~var44 <= ~var46; ++var46) {
                                    if ((class162.field2889[var14][var42 + 1][var46] & 4) == 0) {
                                        break label450;
                                    }
                                }
                                ++var42;
                            }
                            if (~((-var43 + var44 + 1) * (var42 + 1 + -var41)) <= -5) {
                                int var47 = class173.field3022[var14][var41][var43];
                                class226.method1537(4, var41 * 128, var42 * 128 - -128, var43 * 128, var44 * 128 + 128, var47, var47);
                                for (int var48 = var41; var42 >= var48; ++var48) {
                                    for (int var49 = var43; ~var44 <= ~var49; ++var49) {
                                        class162.field2889[var14][var48][var49] = class130.method985(class162.field2889[var14][var48][var49], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B[B)V")
    public static final void method1117(byte arg0, byte[] arg1) {
        ++field2682;
        class239 var2 = new class239(arg1);
        var2.field4124 = arg1.length + -2;
        class252.field4368 = var2.method1663((byte) 114);
        class176.field3064 = new int[class252.field4368];
        class170.field2982 = new int[class252.field4368];
        class217.field3724 = new byte[class252.field4368][];
        class180.field3113 = new boolean[class252.field4368];
        class163.field2894 = new byte[class252.field4368][];
        class31.field490 = new int[class252.field4368];
        class241.field4187 = new int[class252.field4368];
        var2.field4124 = arg1.length + -7 - class252.field4368 * 8;
        class249.field4309 = var2.method1663((byte) 62);
        class109.field2019 = var2.method1663((byte) 82);
        int var3 = 1 + (var2.method1651(4139) & 255);
        for (int var4 = 0; class252.field4368 > var4; ++var4) {
            class241.field4187[var4] = var2.method1663((byte) -96);
        }
        for (int var5 = 0; ~class252.field4368 < ~var5; ++var5) {
            class176.field3064[var5] = var2.method1663((byte) 114);
        }
        for (int var6 = 0; var6 < class252.field4368; ++var6) {
            class31.field490[var6] = var2.method1663((byte) 86);
        }
        for (int var7 = 0; class252.field4368 > var7; ++var7) {
            class170.field2982[var7] = var2.method1663((byte) -48);
        }
        var2.field4124 = -(class252.field4368 * 8) + -7 + arg1.length + -((var3 + -1) * 3);
        class139.field2492 = new int[var3];
        for (int var8 = 1; var3 > var8; ++var8) {
            class139.field2492[var8] = var2.method1660(-335289648);
            if (class139.field2492[var8] == 0) {
                class139.field2492[var8] = 1;
            }
        }
        var2.field4124 = 0;
        for (int var9 = 0; var9 < class252.field4368; ++var9) {
            int var10 = class31.field490[var9];
            int var11 = class170.field2982[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class217.field3724[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class163.field2894[var9] = var14;
            int var16 = var2.method1651(4139);
            if ((var16 & 1) != 0) {
                int var17 = 0;
                label92: while (true) {
                    if (var10 <= var17) {
                        if (~(var16 & 2) == -1) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (~var10 >= ~var18) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var11; ++var19) {
                                byte var20 = var14[var10 * var19 + var18] = var2.method1656(80);
                                var15 |= ~var20 != 0;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; var21 < var11; ++var21) {
                        var13[var10 * var21 + var17] = var2.method1656(arg0 + -33);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; ~var12 < ~var22; ++var22) {
                    var13[var22] = var2.method1656(49);
                }
                if ((2 & var16) != 0) {
                    for (int var23 = 0; ~var23 > ~var12; ++var23) {
                        byte var24 = var14[var23] = var2.method1656(class94.method657(arg0, 39));
                        var15 |= var24 != -1;
                    }
                }
            }
            class180.field3113[var9] = var15;
        }
        if (arg0 != -94) {
            field2699 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BZ)Li;")
    public static final class18 method1118(byte[] arg0, boolean arg1) {
        ++field2703;
        if (arg0 == null) {
            return null;
        } else if (!arg1) {
            return null;
        } else {
            class12 var2 = new class12(arg0, class241.field4187, class176.field3064, class31.field490, class170.field2982, class217.field3724);
            class192.method1344(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lff;II)Z")
    public static final boolean method1119(class3 arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            field2690 = null;
        }
        byte[] var3 = arg0.method42(-24324, arg1);
        ++field2697;
        if (var3 == null) {
            return false;
        } else {
            method1117((byte) -94, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.method1124((byte) -124);
        if (arg0 == 2) {
            ++field2692;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
    public static final void method1120(byte arg0) {
        ++field2686;
        ++class276.field4806;
        class140.field2505.method1012((byte) -123, 216);
        int var1 = 124 % ((arg0 - -59) / 53);
        class140.field2505.method1632(true, class264.field4610);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lff;Lff;I)V")
    public static final void method1121(class3 arg0, class3 arg1, int arg2) {
        class266.field4642 = arg1;
        ++field2695;
        if (arg2 != 96) {
            field2699 = null;
        }
        class163.field2892 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)V")
    public static void method1122(byte arg0) {
        field2696 = null;
        field2689 = null;
        if (arg0 == -93) {
            field2690 = null;
            field2699 = null;
            field2685 = null;
            field2681 = null;
            field2702 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)Z")
    public static final boolean method1123(int arg0, int arg1, int arg2) {
        int var3 = class247.field4278[arg0][arg1][arg2];
        if (-client.field1990 == var3) {
            return false;
        } else if (client.field1990 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class272.method1851(var4 + 1, class173.field3022[arg0][arg1][arg2], var5 + 1) && class272.method1851(var4 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg2], var5 + 1) && class272.method1851(var4 + 128 - 1, class173.field3022[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class272.method1851(var4 + 1, class173.field3022[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class247.field4278[arg0][arg1][arg2] = client.field1990;
                return true;
            } else {
                class247.field4278[arg0][arg1][arg2] = -client.field1990;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(B)V")
    private final void method1124(byte arg0) {
        ++field2701;
        double var2 = Math.cos((double) ((float) this.field2683 / 4096.0F));
        this.field2694[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2704 / 4096.0F)));
        this.field2694[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2704 / 4096.0F)));
        int var4 = 27 / ((arg0 - -34) / 59);
        this.field2694[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2683 / 4096.0F)));
        int var5 = this.field2694[1] * this.field2694[1] >> 12;
        int var6 = this.field2694[0] * this.field2694[0] >> 12;
        int var7 = this.field2694[2] * this.field2694[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field2694[2] = (this.field2694[2] << 12) / var8;
            this.field2694[0] = (this.field2694[0] << 12) / var8;
            this.field2694[1] = (this.field2694[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2683 = arg2.method1663((byte) -55);
                }
            } else {
                this.field2704 = arg2.method1663((byte) 75);
            }
        } else {
            this.field2691 = arg2.method1663((byte) 94);
        }
        int var5 = -123 / ((arg0 - -22) / 58);
        ++field2693;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field2687;
        int var3 = -80 / ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) 64, arg1);
        if (super.field3044.field2150) {
            int var5 = class161.field2838 * this.field2691 >> 12;
            int[] var6 = this.method1255(0, class92.field1520 & arg1 + -1, 128);
            int[] var7 = this.method1255(0, arg1, 128);
            int[] var8 = this.method1255(0, class92.field1520 & arg1 + 1, 128);
            for (int var9 = 0; ~class1.field11 < ~var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class194.field3343 & var9 + -1] + -var7[var9 + 1 & class194.field3343]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class227.field3868[var12 - -((var13 + 1) * var13 >> 1)];
                int var15 = var14 * 4096 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = this.field2694[2] * var15 >> 12;
                int var18 = var10 * var14 >> 8;
                int var19 = this.field2694[1] * var18 >> 12;
                int var20 = this.field2694[0] * var16 >> 12;
                var4[var9] = var17 + var20 + var19;
            }
        }
        return var4;
    }
}
