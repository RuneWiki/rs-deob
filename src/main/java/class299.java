import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class299 extends class130 {

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field5149 = 0;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field5163 = 0;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "Lqm;")
    public static class222 field5154;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Lqm;")
    public static class222 field5161;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Lcd;")
    public class64 field5159;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)I", line = 6)
    public final int method2086(byte arg0) {
        field5158++;
        if (arg0 != -63) {
            this.method2087((byte) 124);
        }
        return (int) (this.field417 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)I", line = 22)
    public final int method2087(byte arg0) {
        if (arg0 > -104) {
            this.field5157 = 0;
        }
        field5156++;
        return (int) this.field417;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)J", line = 36)
    public final long method2088(int arg0) {
        int var2 = -108 / ((19 - arg0) / 55);
        field5151++;
        return Long.MAX_VALUE & this.field2312;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 53)
    public static void method2089(byte arg0) {
        field5154 = null;
        field5161 = null;
        if (arg0 != -21) {
            field5161 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V", line = 72)
    public static final void method2090(int arg0) {
        class241.field4157 &= 0x7FF;
        if (class77.field1459 < 128) {
            class77.field1459 = 128;
        }
        field5160++;
        int var1 = class48.field798 >> 7;
        int var2 = class108.field2006 >> 7;
        if (class77.field1459 > 383) {
            class77.field1459 = 383;
        }
        int var3 = class15.method169(class48.field798, 13257, class20.field364, class108.field2006);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= (var2 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class20.field364;
                    if (var7 < 3 && (class82.field1508[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class96.field1764[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (arg0 < var9) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class201.field3451) {
            class201.field3451 += (var9 - class201.field3451) / 24;
        } else if (var9 < class201.field3451) {
            class201.field3451 += (var9 - class201.field3451) / 80;
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V", line = 142)
    public final void method2091(int arg0) {
        field5155++;
        if (arg0 >= 10) {
            this.field2312 |= Long.MIN_VALUE;
            if (this.method2088(98) == 0L) {
                class312.field5285.method1694(this, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ[Lwf;)V", line = 157)
    public static final void method2092(byte arg0, boolean arg1, class54[] arg2) {
        field5162++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class82.field1508[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class82.field1508[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method424(var6, (byte) 31, var5);
                            }
                        }
                    }
                }
            }
            class189.field3251 += (int) (Math.random() * 5.0D) - 2;
            class12.field237 += (int) (Math.random() * 5.0D) - 2;
            if (class189.field3251 < -16) {
                class189.field3251 = -16;
            }
            if (class12.field237 < -8) {
                class12.field237 = -8;
            }
            if (class12.field237 > 8) {
                class12.field237 = 8;
            }
            if (class189.field3251 > 16) {
                class189.field3251 = 16;
            }
        }
        int var8 = class12.field237 >> 2 << 10;
        if (arg0 != -80) {
            method2089((byte) 15);
        }
        int var9 = class189.field3251 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class168.field2912[var12];
            if (!class123.field2216) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class96.field1764[var12][var17 + 1][var16] - class96.field1764[var12][var17 - 1][var16];
                        int var20 = class96.field1764[var12][var17][var16 + 1] - class96.field1764[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var20 * var20 + var19 * var19 + 65536));
                        int var22 = (var19 << 8) / var21;
                        int var23 = (var20 << 8) / var21;
                        int var24 = -65536 / var21;
                        int var25 = (var13[var17][var16 - 1] >> 2) + (var13[var17 - 1][var16] >> 2) + (var13[var17 + 1][var16] >> 3) + (var13[var17][var16] >> 1) + (var13[var17][var16 + 1] >> 3);
                        int var26 = (var22 * -50 + var23 * -50 + var24 * -10) / var15 + var18;
                        var11[var17][var16] = var26 - var25;
                    }
                }
            } else if (class274.field4701) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44][var43 + 1] >> 3) + (var13[var44 - 1][var43] >> 2) + (var13[var44 + 1][var43] >> 3) + (var13[var44][var43 - 1] >> 2) + (var13[var44][var43] >> 1);
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class52.field844[0];
                int var28 = (int) class52.field844[1];
                int var29 = (int) class52.field844[2];
                int var30 = (int) Math.sqrt((double) (var28 * var28 + (var27 * var27 + (var29 * var29))));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class96.field1764[var12][var33 + 1][var32] - class96.field1764[var12][var33 - 1][var32];
                        byte var35 = 96;
                        int var36 = class96.field1764[var12][var33][var32 + 1] - class96.field1764[var12][var33][var32 - 1];
                        int var37 = (int) Math.sqrt((double) (var36 * var36 + var34 * var34 + 65536));
                        int var38 = -65536 / var37;
                        int var39 = (var36 << 8) / var37;
                        int var40 = (var34 << 8) / var37;
                        int var41 = (var29 * var39 + var27 * var40 + var28 * var38) / var31 + var35;
                        int var42 = (var13[var33][var32 + 1] >> 3) + (var13[var33][var32 - 1] >> 2) + (var13[var33 + -1][var32] >> 2) + ((var13[var33 + 1][var32] >> 3) - -(var13[var33][var32] >> 1));
                        var11[var33][var32] = var41 - ((int) ((float) var42 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class113.field2088[var47] = 0;
                class304.field5196[var47] = 0;
                class72.field1389[var47] = 0;
                class105.field1942[var47] = 0;
                class17.field349[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class30.field511[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class137 var52 = class169.method1204(var51 - 1, 1);
                            class113.field2088[var49] += var52.field2441;
                            class304.field5196[var49] += var52.field2434;
                            class72.field1389[var49] += var52.field2443;
                            class105.field1942[var49] += var52.field2446;
                            var10002 = class17.field349[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class30.field511[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class137 var55 = class169.method1204(var54 - 1, arg0 ^ 0xFFFFFFB1);
                            class113.field2088[var49] -= var55.field2441;
                            class304.field5196[var49] -= var55.field2434;
                            class72.field1389[var49] -= var55.field2443;
                            class105.field1942[var49] -= var55.field2446;
                            var10002 = class17.field349[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        int var63 = var61 - 5;
                        if (var62 < 104) {
                            var57 += class72.field1389[var62];
                            var60 += class105.field1942[var62];
                            var56 += class304.field5196[var62];
                            var59 += class17.field349[var62];
                            var58 += class113.field2088[var62];
                        }
                        if (var63 >= 0) {
                            var60 -= class105.field1942[var63];
                            var58 -= class113.field2088[var63];
                            var57 -= class72.field1389[var63];
                            var59 -= class17.field349[var63];
                            var56 -= class304.field5196[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class304.method2122(var56 / var59, var58 * 256 / var60, var57 / var59, (byte) -124);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label773: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class141.method1001((byte) -108) || (class82.field1508[0][var64][var65] & 0x2) != 0 || (class82.field1508[var12][var64][var65] & 0x10) == 0 && class77.method611(var64, var12, var65, (byte) -115) == class27.field438) {
                        if (class120.field2173 > var12) {
                            class120.field2173 = var12;
                        }
                        int var66 = class71.field1365[var12][var64][var65] & 0xFF;
                        int var67 = class30.field511[var12][var64][var65] & 0xFF;
                        if (var67 > 0 || var66 > 0) {
                            int var68 = class96.field1764[var12][var64 + 1][var65];
                            int var69 = class96.field1764[var12][var64][var65];
                            int var70 = class96.field1764[var12][var64][var65 + 1];
                            int var71 = class96.field1764[var12][var64 + 1][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var67 == 0 && class227.field3858[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var66 > 0 && !class42.method327((byte) -33, var66 - 1).field2410) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var71 && var69 == var70) {
                                    class222.field3784[var12][var64][var65] = class11.method91(class222.field3784[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var67 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var10[var64][var65];
                                int var75 = (var73 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var73 & 0xFC00) + var75 + (var73 & 0x380);
                                var74 = class50.field829[class185.method1302(var76, 96, 107)];
                            }
                            int var77 = var11[var64 + 1][var65];
                            int var78 = var11[var64][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var66 == 0) {
                                class169.method1202(var12, var64, var65, 0, 0, -1, var69, var68, var71, var70, class185.method1302(var73, var78, 125), class185.method1302(var73, var77, arg0 - 26), class185.method1302(var73, var79, -48), class185.method1302(var73, var80, -69), 0, 0, 0, 0, var74, 0);
                                if (class123.field2216 && var12 > 0 && var73 != -1 && class169.method1204(var67 - 1, 1).field2431) {
                                    class302.method2106(0, 0, true, false, var64, var65, var69 - class96.field1764[0][var64][var65], -class96.field1764[0][var64 + 1][var65] + var68, var71 - class96.field1764[0][var64 + 1][var65 + 1], var70 - class96.field1764[0][var64][var65 + 1]);
                                }
                                if (class123.field2216 && !arg1 && class187.field3205 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class71.field1365[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class135 var84 = class42.method327((byte) -33, var83 - 1);
                                                    if (var84.field2403 != -1 && class50.field816.method664(var84.field2403, 106) == 4) {
                                                        class187.field3205[var64][var65] = (var84.field2396 << 24) + var84.field2391;
                                                        continue label773;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class70.field1359[var12][var64][var65];
                                int var86 = class227.field3858[var12][var64][var65] + 1;
                                class135 var87 = class42.method327((byte) -33, var66 - 1);
                                if (class123.field2216 && !arg1 && class187.field3205 != null && var12 == 0) {
                                    if (var87.field2403 != -1 && class50.field816.method664(var87.field2403, 19) == 4) {
                                        class187.field3205[var64][var65] = (var87.field2396 << 24) + var87.field2391;
                                    } else {
                                        label754: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class71.field1365[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class135 var91 = class42.method327((byte) -33, var90 - 1);
                                                        if (var91.field2403 != -1 && class50.field816.method664(var91.field2403, 126) == 4) {
                                                            class187.field3205[var64][var65] = (var91.field2396 << 24) + var91.field2391;
                                                            break label754;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field2403;
                                if (var92 >= 0 && !class50.field816.method669(var92, 0)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var96;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var96 = class50.field829[class197.method1383(arg0 + 82, class50.field816.method666(true, var92), 96)];
                                } else if (var87.field2397 == -1) {
                                    var96 = 0;
                                    var93 = -2;
                                } else {
                                    var93 = var87.field2397;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 & 0x380) + (var8 + var93 & 0xFC00) + var94;
                                    var96 = class50.field829[class197.method1383(2, var95, 96)];
                                }
                                if (var87.field2402 >= 0) {
                                    int var97 = var87.field2402;
                                    int var98 = (var97 & 0x7F) + var9;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var8 + var97 & 0xFC00) + (var97 & 0x380) + var98;
                                    var96 = class50.field829[class197.method1383(2, var99, 96)];
                                }
                                class169.method1202(var12, var64, var65, var86, var85, var92, var69, var68, var71, var70, class185.method1302(var73, var78, arg0 ^ 0xFFFFFFB7), class185.method1302(var73, var77, 124), class185.method1302(var73, var79, 116), class185.method1302(var73, var80, -73), class197.method1383(arg0 + 82, var93, var78), class197.method1383(2, var93, var77), class197.method1383(2, var93, var79), class197.method1383(arg0 ^ 0xFFFFFFB2, var93, var80), var74, var96);
                                if (class123.field2216 && var12 > 0) {
                                    class302.method2106(var86, var85, var93 == -2 || !var87.field2405, var73 == -1 || !class169.method1204(var67 - 1, arg0 + 81).field2431, var64, var65, var69 - class96.field1764[0][var64][var65], -class96.field1764[0][var64 - -1][var65] + var68, var71 - class96.field1764[0][var64 + 1][var65 + 1], -class96.field1764[0][var64][var65 - -1] + var70);
                                }
                            }
                        }
                    }
                }
            }
            if (class123.field2216) {
                int[][] var100 = class96.field1764[var12];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class204[] var109 = class31.method269(var11, var103, var101, var102, class70.field1359[var12], class266.field4571[0], class82.field1508, var12, class187.field3205, class71.field1365[var12], class96.field1764[var12], (byte) -93, var10, class30.field511[var12], class227.field3858[var12]);
                            class180.method1280(var12, var109);
                            break;
                        }
                        class204[] var110 = class31.method269(var11, var103, var101, var102, class70.field1359[var12], (int[][]) null, class82.field1508, var12, (int[][]) null, class71.field1365[var12], class96.field1764[var12], (byte) -105, var10, class30.field511[var12], class227.field3858[var12]);
                        class204[] var111 = class60.method465(var12, class227.field3858[var12], class70.field1359[var12], class96.field1764[var12], var102, var101, class30.field511[var12], var11, class82.field1508, class71.field1365[var12], var103, (byte) 59);
                        class204[] var112 = new class204[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class180.method1280(var12, var112);
                        class69.method561(var101, class227.field3858[var12], class96.field1764[var12], false, var103, class70.field1359[var12], var12, class30.field511[var12], var102, class177.field3019, class71.field1365[var12], class177.field3014);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var100[var105 + 1][var104] - var100[var105 - 1][var104];
                        int var107 = var100[var105][var104 + 1] - var100[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var102[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class30.field511[var12] = (byte[][]) null;
            class71.field1365[var12] = (byte[][]) null;
            class227.field3858[var12] = (byte[][]) null;
            class70.field1359[var12] = (byte[][]) null;
            class168.field2912[var12] = (byte[][]) null;
        }
        class195.method1373(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class82.field1508[1][var115][var116] & 0x2) == 2) {
                    class59.method452(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class222.field3784[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class222.field3784[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var118;
                        int var122 = var117;
                        int var123 = var117;
                        while (var121 < 104 && (class222.field3784[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        label455: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class222.field3784[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label455;
                                }
                            }
                            var122--;
                        }
                        label444: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class222.field3784[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label444;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 - (var122 - 1)) * (var121 + 1 - var120);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class96.field1764[var122][var119][var120];
                            int var129 = class96.field1764[var123][var119][var120] - var127;
                            class278.method1927(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var128);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class222.field3784[var130][var119][var131] = class224.method1614(class222.field3784[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class222.field3784[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class222.field3784[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133 = var117;
                        int var134;
                        for (var134 = var119; var134 < 104 && (class222.field3784[var117][var134 + 1][var118] & 0x2) != 0; var134++) {
                        }
                        label510: while (var133 > 0) {
                            for (int var135 = var132; var135 <= var134; var135++) {
                                if ((class222.field3784[var133 - 1][var135][var118] & 0x2) == 0) {
                                    break label510;
                                }
                            }
                            var133--;
                        }
                        int var136;
                        label498: for (var136 = var117; var136 < 3; var136++) {
                            for (int var137 = var132; var137 <= var134; var137++) {
                                if ((class222.field3784[var136 + 1][var137][var118] & 0x2) == 0) {
                                    break label498;
                                }
                            }
                        }
                        int var138 = (var134 + 1 - var132) * (var136 + 1 - var133);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class96.field1764[var136][var132][var118] - var139;
                            int var141 = class96.field1764[var133][var132][var118];
                            class278.method1927(2, var132 * 128, var134 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var133; var142 <= var136; var142++) {
                                for (int var143 = var132; var143 <= var134; var143++) {
                                    class222.field3784[var142][var143][var118] = class224.method1614(class222.field3784[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class222.field3784[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145;
                        for (var145 = var118; var145 > 0 && (class222.field3784[var117][var119][var145 - 1] & 0x4) != 0; var145--) {
                        }
                        int var146 = var119;
                        int var147;
                        for (var147 = var118; var147 < 104 && (class222.field3784[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label564: while (var144 > 0) {
                            for (int var148 = var145; var148 <= var147; var148++) {
                                if ((class222.field3784[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label564;
                                }
                            }
                            var144--;
                        }
                        label553: while (var146 < 104) {
                            for (int var149 = var145; var149 <= var147; var149++) {
                                if ((class222.field3784[var117][var146 + 1][var149] & 0x4) == 0) {
                                    break label553;
                                }
                            }
                            var146++;
                        }
                        if (((var147 + 1 - var145) * (var146 + 1 - var144)) >= 4) {
                            int var150 = class96.field1764[var117][var144][var145];
                            class278.method1927(4, var144 * 128, var146 * 128 + 128, var145 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var146; var151++) {
                                for (int var152 = var145; var152 <= var147; var152++) {
                                    class222.field3784[var117][var151][var152] = class224.method1614(class222.field3784[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(B)V", line = 1133)
    public final void method2093(byte arg0) {
        if (arg0 >= -14) {
            field5163 = -13;
        }
        this.field2312 = class154.method1114(true) + 500L | Long.MIN_VALUE & this.field2312;
        class77.field1455.method1694(this, 0);
        field5150++;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V", line = 1144)
    public class299(int arg0, int arg1) {
        this.field417 = (long) arg1 | (long) arg0 << 32;
    }
}
