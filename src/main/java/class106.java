import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    private int field2287;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[[I")
    private int[][] field2286;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field2275;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
    public static int[] field2283 = new int[99];

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[J")
    public static long[] field2288 = new long[100];

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
    public static boolean field2292;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lcb;")
    public static class17 field2291;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lod;")
    public static class101 field2293;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lqe;")
    public static class116 field2280;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lc;")
    public static class15 field2277;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lnc;")
    public static class93 field2294;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[I")
    public static int[] field2289;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
    public final int method758(int arg0, boolean arg1) {
        field2282++;
        if (this.field2286 != null) {
            arg0 = (int) ((long) this.field2275 * (long) arg0 / (long) this.field2287);
        }
        if (!arg1) {
            field2277 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public final int method759(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field2287 = -97;
        }
        if (this.field2286 != null) {
            arg0 = (int) ((long) this.field2275 * (long) arg0 / (long) this.field2287) + 6;
        }
        field2281++;
        return arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method760(int arg0) {
        field2288 = null;
        field2283 = null;
        field2293 = null;
        field2289 = null;
        field2291 = null;
        field2280 = null;
        field2294 = null;
        field2277 = null;
        if (arg0 != 2) {
            method760(-126);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
    public static final int method761(byte arg0) {
        if (arg0 == 0) {
            field2284++;
            return 6;
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[B)[B")
    public final byte[] method762(byte arg0, byte[] arg1) {
        int var3 = -100 / ((arg0 - 31) / 60);
        field2276++;
        if (this.field2286 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field2275 / (long) this.field2287) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                int[] var11 = this.field2286[var6];
                byte var12 = arg1[var8];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var7 + var13] += var11[var13] * var12;
                }
                int var14 = this.field2275 + var6;
                int var15 = var14 / this.field2287;
                var7 += var15;
                var6 = var14 - this.field2287 * var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 > 127) {
                    arg1[var9] = 127;
                } else {
                    arg1[var9] = (byte) var10;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static final void method763(boolean arg0) {
        class73.method511(79);
        field2279++;
        class105.method752((byte) 93);
        class6.method29(1);
        class131.method1007((byte) 107);
        class94.method656((byte) 81);
        class101.method704(-28346);
        class48.method356(28);
        class42.method317(-105);
        client.method167(465);
        class156.method1214(-1);
        class78.method522(4);
        class49.method368(-1);
        ((class118) class124.field2720).method891(32);
        class20.field434.method135(0);
        class47.field1113.method103(2);
        if (arg0) {
            field2293 = null;
        }
        class27.field717.method103(2);
        class150.field3436.method103(2);
        class141.field3258.method103(2);
        class152.field3469.method103(2);
        class12.field245.method103(2);
        class31.field810.method103(2);
        class20.field442.method103(2);
        class54.field1236.method103(2);
        class85.field1864.method103(2);
        class97.field2103.method103(2);
        class130.field2960.method103(2);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)Z")
    public static final boolean method764(int arg0, int arg1) {
        field2285++;
        if (arg1 == 255) {
            return (arg0 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class98.method680(arg0, arg1, 123);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2287 = var4;
            this.field2286 = new int[var4][14];
            this.field2275 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2286[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLle;[Lge;)V")
    public static final void method765(byte arg0, class81 arg1, class47[] arg2) {
        field2290++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class86.field1905[var3][var111][var112] & 0x1) == 1) {
                        int var113 = var3;
                        if ((class86.field1905[1][var111][var112] & 0x2) == 2) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg2[var113].method337(var112, var111, true);
                        }
                    }
                }
            }
        }
        class137.field3141 += (int) (Math.random() * 5.0D) - 2;
        if (class137.field3141 < -16) {
            class137.field3141 = -16;
        }
        if (class137.field3141 > 16) {
            class137.field3141 = 16;
        }
        class84.field1831 += (int) (Math.random() * 5.0D) - 2;
        if (class84.field1831 < -8) {
            class84.field1831 = -8;
        }
        int var4 = 75 / ((27 - arg0) / 46);
        if (class84.field1831 > 8) {
            class84.field1831 = 8;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = class83.field1807[var5];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; var51++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    int var103 = class20.field431[var5][var102 + 1][var51] - class20.field431[var5][var102 - 1][var51];
                    int var104 = class20.field431[var5][var102][var51 + 1] - class20.field431[var5][var102][var51 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var108 * -50 + var107 * -10 + var106 * -50) / var50 + 96;
                    int var110 = (var48[var102 - 1][var51] >> 2) + (var48[var102][var51 - 1] >> 2) + (var48[var102][var51] >> 1) + (var48[var102][var51 - -1] >> 3) + (var48[var102 + 1][var51] >> 3);
                    class35.field894[var102][var51] = var109 - var110;
                }
            }
            for (int var52 = 0; var52 < 104; var52++) {
                class56.field1262[var52] = 0;
                class115.field2562[var52] = 0;
                class65.field1470[var52] = 0;
                class43.field1036[var52] = 0;
                class23.field530[var52] = 0;
            }
            for (int var53 = -5; var53 < 109; var53++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < 104) {
                        int var97 = class137.field3128[var5][var96][var56] & 0xFF;
                        if (var97 > 0) {
                            class54 var98 = class137.method1048((byte) -86, var97 - 1);
                            class56.field1262[var56] += var98.field1246;
                            class115.field2562[var56] += var98.field1229;
                            class65.field1470[var56] += var98.field1221;
                            class43.field1036[var56] += var98.field1253;
                            var10002 = class23.field530[var56]++;
                        }
                    }
                    int var99 = var53 - 5;
                    if (var99 >= 0 && var99 < 104) {
                        int var100 = class137.field3128[var5][var99][var56] & 0xFF;
                        if (var100 > 0) {
                            class54 var101 = class137.method1048((byte) -86, var100 - 1);
                            class56.field1262[var56] -= var101.field1246;
                            class115.field2562[var56] -= var101.field1229;
                            class65.field1470[var56] -= var101.field1221;
                            class43.field1036[var56] -= var101.field1253;
                            var10002 = class23.field530[var56]--;
                        }
                    }
                }
                if (var53 >= 1 && var53 < 103) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 109; var62++) {
                        int var63 = var62 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 += class115.field2562[var63];
                            var60 += class43.field1036[var63];
                            var61 += class23.field530[var63];
                            var59 += class56.field1262[var63];
                            var58 += class65.field1470[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0 && var64 < 104) {
                            var57 -= class115.field2562[var64];
                            var61 -= class23.field530[var64];
                            var60 -= class43.field1036[var64];
                            var58 -= class65.field1470[var64];
                            var59 -= class56.field1262[var64];
                        }
                        if (var62 >= 1 && var62 < 103 && (!class10.field152 || (class86.field1905[0][var53][var62] & 0x2) != 0 || (class86.field1905[var5][var53][var62] & 0x10) == 0 && class80.method539(var5, var53, var62, (byte) -20) == class112.field2414)) {
                            if (class34.field859 > var5) {
                                class34.field859 = var5;
                            }
                            int var65 = class11.field202[var5][var53][var62] & 0xFF;
                            int var66 = class137.field3128[var5][var53][var62] & 0xFF;
                            if (var66 > 0 || var65 > 0) {
                                int var67 = class20.field431[var5][var53][var62];
                                int var68 = class20.field431[var5][var53 + 1][var62];
                                int var69 = class20.field431[var5][var53 + 1][var62 + 1];
                                int var70 = class20.field431[var5][var53][var62 + 1];
                                int var71 = class35.field894[var53 + 1][var62];
                                int var72 = class35.field894[var53 + 1][var62 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class35.field894[var53][var62];
                                int var76 = class35.field894[var53][var62 + 1];
                                if (var66 > 0) {
                                    int var77 = var59 * 256 / var60;
                                    int var78 = var57 / var61;
                                    int var79 = var58 / var61;
                                    var73 = class46.method331(179, var79, var78, var77);
                                    int var80 = class137.field3141 + var79;
                                    int var81 = class84.field1831 + var77 & 0xFF;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class46.method331(179, var80, var78, var81);
                                }
                                if (var5 > 0) {
                                    boolean var82 = true;
                                    if (var66 == 0 && class63.field1404[var5][var53][var62] != 0) {
                                        var82 = false;
                                    }
                                    if (var65 > 0 && !class152.method1179(-25570, var65 - 1).field2981) {
                                        var82 = false;
                                    }
                                    if (var82 && var67 == var68 && var67 == var69 && var67 == var70) {
                                        class138.field3182[var5][var53][var62] = class13.method96(class138.field3182[var5][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (var74 != -1) {
                                    var83 = class124.field2702[class133.method1030(-1, 96, var74)];
                                }
                                if (var65 == 0) {
                                    arg1.method589(var5, var53, var62, 0, 0, -1, var67, var68, var69, var70, class133.method1030(-1, var75, var73), class133.method1030(-1, var71, var73), class133.method1030(-1, var72, var73), class133.method1030(-1, var76, var73), 0, 0, 0, 0, var83, 0);
                                } else {
                                    int var84 = class63.field1404[var5][var53][var62] + 1;
                                    byte var85 = class144.field3329[var5][var53][var62];
                                    class131 var86 = class152.method1179(-25570, var65 - 1);
                                    int var87 = var86.field2982;
                                    int var88;
                                    int var91;
                                    if (var87 >= 0) {
                                        var88 = -1;
                                        var91 = class124.field2720.method749(var87, 9960);
                                    } else if (var86.field2980 == 16711935) {
                                        var87 = -1;
                                        var91 = -2;
                                        var88 = -2;
                                    } else {
                                        var88 = class46.method331(179, var86.field2993, var86.field2978, var86.field2979);
                                        int var89 = class137.field3141 + var86.field2993;
                                        int var90 = var86.field2979 + class84.field1831 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var91 = class46.method331(179, var89, var86.field2978, var90);
                                    }
                                    int var92 = 0;
                                    if (var91 != -2) {
                                        var92 = class124.field2702[class73.method513(96, var91, 102)];
                                    }
                                    if (var86.field2988 != -1) {
                                        int var93 = var86.field2998 + class84.field1831 & 0xFF;
                                        int var94 = class137.field3141 + var86.field3000;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = class46.method331(179, var94, var86.field2994, var93);
                                        var92 = class124.field2702[class73.method513(96, var95, 111)];
                                    }
                                    arg1.method589(var5, var53, var62, var84, var85, var87, var67, var68, var69, var70, class133.method1030(-1, var75, var73), class133.method1030(-1, var71, var73), class133.method1030(-1, var72, var73), class133.method1030(-1, var76, var73), class73.method513(var75, var88, 84), class73.method513(var71, var88, 125), class73.method513(var72, var88, 104), class73.method513(var76, var88, 86), var83, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var55 = 1; var55 < 103; var55++) {
                    arg1.method570(var5, var55, var54, class80.method539(var5, var55, var54, (byte) 102));
                }
            }
            class137.field3128[var5] = null;
            class11.field202[var5] = null;
            class63.field1404[var5] = null;
            class144.field3329[var5] = null;
            class83.field1807[var5] = null;
        }
        arg1.method562(-50, -10, -50);
        for (int var6 = 0; var6 < 104; var6++) {
            for (int var47 = 0; var47 < 104; var47++) {
                if ((class86.field1905[1][var6][var47] & 0x2) == 2) {
                    arg1.method544(var6, var47);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= 104; var12++) {
                    for (int var13 = 0; var13 <= 104; var13++) {
                        if ((class138.field3182[var11][var13][var12] & var7) != 0) {
                            int var14;
                            for (var14 = var12; var14 < 104 && (var7 & class138.field3182[var11][var13][var14 + 1]) != 0; var14++) {
                            }
                            int var15 = var11;
                            int var16 = var12;
                            int var17 = var11;
                            while (var16 > 0 && (class138.field3182[var11][var13][var16 - 1] & var7) != 0) {
                                var16--;
                            }
                            label351: while (var15 > 0) {
                                for (int var18 = var16; var18 <= var14; var18++) {
                                    if ((var7 & class138.field3182[var15 - 1][var13][var18]) == 0) {
                                        break label351;
                                    }
                                }
                                var15--;
                            }
                            label340: while (var10 > var17) {
                                for (int var19 = var16; var19 <= var14; var19++) {
                                    if ((var7 & class138.field3182[var17 + 1][var13][var19]) == 0) {
                                        break label340;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var15) * (var14 + 1 - var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class20.field431[var17][var13][var16] - var21;
                                int var23 = class20.field431[var15][var13][var16];
                                class81.method571(var10, 1, var13 * 128, var13 * 128, var16 * 128, var14 * 128 + 128, var22, var23);
                                for (int var24 = var15; var24 <= var17; var24++) {
                                    for (int var25 = var16; var25 <= var14; var25++) {
                                        class138.field3182[var24][var13][var25] = class41.method307(class138.field3182[var24][var13][var25], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class138.field3182[var11][var13][var12]) != 0) {
                            int var26;
                            for (var26 = var13; var26 > 0 && (class138.field3182[var11][var26 - 1][var12] & var8) != 0; var26--) {
                            }
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var27 < 104 && (var8 & class138.field3182[var11][var27 + 1][var12]) != 0) {
                                var27++;
                            }
                            label405: while (var29 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((class138.field3182[var29 - 1][var30][var12] & var8) == 0) {
                                        break label405;
                                    }
                                }
                                var29--;
                            }
                            label394: while (var10 > var28) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((var8 & class138.field3182[var28 + 1][var31][var12]) == 0) {
                                        break label394;
                                    }
                                }
                                var28++;
                            }
                            int var32 = (var28 + 1 - var29) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = class20.field431[var28][var26][var12] - var33;
                                int var35 = class20.field431[var29][var26][var12];
                                class81.method571(var10, 2, var26 * 128, var27 * 128 + 128, var12 * 128, var12 * 128, var34, var35);
                                for (int var36 = var29; var36 <= var28; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        class138.field3182[var36][var37][var12] = class41.method307(class138.field3182[var36][var37][var12], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class138.field3182[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var12;
                            int var40 = var12;
                            while (var39 < 104 && (var9 & class138.field3182[var11][var13][var39 + 1]) != 0) {
                                var39++;
                            }
                            int var41 = var13;
                            while (var40 > 0 && (var9 & class138.field3182[var11][var13][var40 - 1]) != 0) {
                                var40--;
                            }
                            label459: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var39; var42++) {
                                    if ((var9 & class138.field3182[var11][var38 - 1][var42]) == 0) {
                                        break label459;
                                    }
                                }
                                var38--;
                            }
                            label448: while (var41 < 104) {
                                for (int var43 = var40; var43 <= var39; var43++) {
                                    if ((var9 & class138.field3182[var11][var41 + 1][var43]) == 0) {
                                        break label448;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var38) * (var39 + 1 - var40) >= 4) {
                                int var44 = class20.field431[var11][var38][var40];
                                class81.method571(var10, 4, var38 * 128, var41 * 128 + 128, var40 * 128, var39 * 128 + 128, var44, var44);
                                for (int var45 = var38; var45 <= var41; var45++) {
                                    for (int var46 = var40; var46 <= var39; var46++) {
                                        class138.field3182[var11][var45][var46] = class41.method307(class138.field3182[var11][var45][var46], ~var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2283[var1] = var0 / 4;
        }
        field2292 = false;
        field2291 = new class17(64);
        field2293 = class46.method335(102, ": ");
        field2295 = 2;
    }
}
