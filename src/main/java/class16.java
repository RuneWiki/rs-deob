import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lad;")
    public static class5 field433 = class88.method674(" x", -114);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
    public static boolean field438 = false;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field442 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
    public static int[] field432;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
    public static int[] field440;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lrc;ILad;)Lad;", line = 3)
    public static final class5 method125(class105 arg0, int arg1, class5 arg2) {
        field441++;
        if (arg2.method32(class35.field870, 0) == -1) {
            return arg1 == 4 ? arg2 : null;
        }
        while (true) {
            int var3 = arg2.method32(class104.field2532, 0);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method32(class103.field2512, 0);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method32(class46.field1206, arg1 - 4);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method32(class49.field1276, arg1 - 4);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method32(class88.field2052, 0);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method32(class36.field922, 0);
                                                    if (var8 == -1) {
                                                        return arg1 == 4 ? arg2 : null;
                                                    }
                                                    class5 var9 = class135.field3269;
                                                    if (class47.field1222 != null) {
                                                        var9 = class30.method249(class47.field1222.field1515, (byte) 76);
                                                        try {
                                                            if (class47.field1222.field1516 != null) {
                                                                byte[] var10 = ((String) class47.field1222.field1516).getBytes("ISO-8859-1");
                                                                var9 = class91.method696(0, var10.length, 0, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -75, 0, var8), var9, arg2.method52(var8 + 4, (byte) -54) });
                                                }
                                            }
                                            arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -81, 0, var7), class32.method256(class94.method718(4, (byte) -42, arg0), (byte) -98), arg2.method52(var7 + 2, (byte) -85) });
                                        }
                                    }
                                    arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -64, 0, var6), class32.method256(class94.method718(3, (byte) -42, arg0), (byte) -111), arg2.method52(var6 + 2, (byte) -88) });
                                }
                            }
                            arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -71, 0, var5), class32.method256(class94.method718(2, (byte) -42, arg0), (byte) -61), arg2.method52(var5 + 2, (byte) -119) });
                        }
                    }
                    arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -112, 0, var4), class32.method256(class94.method718(1, (byte) -42, arg0), (byte) -119), arg2.method52(var4 + 2, (byte) -75) });
                }
            }
            arg2 = class69.method546(true, new class5[] { arg2.method51((byte) -34, 0, var3), class32.method256(class94.method718(0, (byte) -42, arg0), (byte) -65), arg2.method52(var3 + 2, (byte) -63) });
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 101)
    public static final void method126(int arg0) {
        field439++;
        class40.field1048 = true;
        class97.field2341 = true;
        if (arg0 != -1) {
            field437 = 103;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 124)
    public static void method127(int arg0) {
        field433 = null;
        int var1 = -114 / ((arg0 - 11) / 44);
        field432 = null;
        field440 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 142)
    public static final void method128(byte arg0) {
        for (int var1 = 0; var1 < class109.field2727; var1++) {
            int var2 = class13.field380[var1];
            class112 var3 = class7.field251[var2];
            int var4 = class36.field907.method330(-30864);
            if ((var4 & 0x8) != 0) {
                var4 += class36.field907.method330(-30864) << 8;
            }
            class49.method425(var2, var3, var4, -30);
        }
        if (arg0 >= -124) {
            field437 = 91;
        }
        field435++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLrc;)Lrc;", line = 175)
    public static final class105 method129(byte arg0, class105 arg1) {
        field434++;
        int var2;
        if (arg1.field2568 < 0) {
            var2 = arg1.field2575 >> 16;
        } else {
            var2 = arg1.field2568 >> 16;
        }
        if (arg0 >= -125) {
            method129((byte) 46, null);
        }
        if (!class116.method928(-96, var2)) {
            return null;
        } else if (arg1.field2581 < 0) {
            class105 var3 = class121.field3013[var2][arg1.field2581 >> 15 & 0xFFFF];
            return var3.field2562[arg1.field2581 & 0x7FFF];
        } else {
            return class121.field3013[var2][arg1.field2581 & 0xFFFF];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Ljd;Lqa;)V", line = 229)
    public static final void method130(int arg0, class58[] arg1, class97 arg2) {
        field436++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class12.field371[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class12.field371[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method464(var111, var110, (byte) 86);
                        }
                    }
                }
            }
        }
        class87.field2010 += (int) (Math.random() * 5.0D) - 2;
        class3.field73 += (int) (Math.random() * 5.0D) - 2;
        if (class3.field73 < -16) {
            class3.field73 = -16;
        }
        if (class3.field73 > 16) {
            class3.field73 = 16;
        }
        if (class87.field2010 < -8) {
            class87.field2010 = -8;
        }
        if (class87.field2010 > 8) {
            class87.field2010 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = client.field497[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class42.field1062[var4][var101 + 1][var50] - class42.field1062[var4][var101 - 1][var50];
                    int var103 = class42.field1062[var4][var101][var50 + 1] - class42.field1062[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var47[var101][var50 - 1] >> 2) + (var47[var101][var50] >> 1) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 + 1] >> 3) + (var47[var101 + -1][var50] >> 2);
                    int var109 = (var107 * -50 + var105 * -50 + var106 * -10) / var49 + 96;
                    class58.field1411[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class34.field861[var51] = 0;
                class56.field1397[var51] = 0;
                class40.field1035[var51] = 0;
                class21.field551[var51] = 0;
                class116.field2885[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class105.field2546[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class92 var97 = class34.method267(119, var96 - 1);
                            class34.field861[var55] += var97.field2192;
                            class56.field1397[var55] += var97.field2206;
                            class40.field1035[var55] += var97.field2204;
                            class21.field551[var55] += var97.field2208;
                            var10002 = class116.field2885[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class105.field2546[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class92 var100 = class34.method267(122, var99 - 1);
                            class34.field861[var55] -= var100.field2192;
                            class56.field1397[var55] -= var100.field2206;
                            class40.field1035[var55] -= var100.field2204;
                            class21.field551[var55] -= var100.field2208;
                            var10002 = class116.field2885[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && var62 < 104) {
                            var58 += class56.field1397[var62];
                            var56 += class40.field1035[var62];
                            var59 += class116.field2885[var62];
                            var57 += class34.field861[var62];
                            var60 += class21.field551[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class56.field1397[var63];
                            var56 -= class40.field1035[var63];
                            var57 -= class34.field861[var63];
                            var59 -= class116.field2885[var63];
                            var60 -= class21.field551[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class40.field1048 || (class12.field371[0][var52][var61] & 0x2) != 0 || (class12.field371[var4][var52][var61] & 0x10) == 0 && class94.method719(arg0 ^ 0xFFFFFF00, var52, var61, var4) == class83.field1951)) {
                            if (class52.field1309 > var4) {
                                class52.field1309 = var4;
                            }
                            int var64 = class112.field2796[var4][var52][var61] & 0xFF;
                            int var65 = class105.field2546[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class42.field1062[var4][var52 + 1][var61 + 1];
                                int var67 = class42.field1062[var4][var52][var61];
                                int var68 = class58.field1411[var52][var61];
                                int var69 = class42.field1062[var4][var52 + 1][var61];
                                int var70 = class42.field1062[var4][var52][var61 + 1];
                                int var71 = class58.field1411[var52 + 1][var61 + 1];
                                int var72 = class58.field1411[var52 + 1][var61];
                                int var73 = -1;
                                int var74 = class58.field1411[var52][var61 + 1];
                                int var75 = -1;
                                if (var65 > 0) {
                                    int var76 = var58 / var59;
                                    int var77 = var57 * 256 / var60;
                                    int var78 = var56 / var59;
                                    var73 = class104.method835(var76, var77, false, var78);
                                    int var79 = class3.field73 + var78;
                                    int var80 = class87.field2010 + var77 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var75 = class104.method835(var76, var80, false, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class105.field2638[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class86.method655((byte) 117, var64 - 1).field2442) {
                                        var81 = false;
                                    }
                                    if (var81 && var67 == var69 && var66 == var67 && var67 == var70) {
                                        class60.field1491[var4][var52][var61] = class5.method54(class60.field1491[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class114.field2827[class109.method882(var75, 96, (byte) -37)];
                                }
                                if (var64 == 0) {
                                    arg2.method783(var4, var52, var61, 0, 0, -1, var67, var69, var66, var70, class109.method882(var73, var68, (byte) 98), class109.method882(var73, var72, (byte) 70), class109.method882(var73, var71, (byte) 51), class109.method882(var73, var74, (byte) -42), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class105.field2638[var4][var52][var61] + 1;
                                    byte var84 = class77.field1815[var4][var52][var61];
                                    class101 var85 = class86.method655((byte) 117, var64 - 1);
                                    int var86 = var85.field2450;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class114.field2838.method512(var86, true);
                                        var88 = -1;
                                    } else if (var85.field2452 == 16711935) {
                                        var86 = -1;
                                        var87 = -2;
                                        var88 = -2;
                                    } else {
                                        var88 = class104.method835(var85.field2443, var85.field2457, false, var85.field2445);
                                        int var89 = class3.field73 + var85.field2445;
                                        int var90 = class87.field2010 + var85.field2457 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var87 = class104.method835(var85.field2443, var90, false, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class114.field2827[class88.method670(96, (byte) -84, var87)];
                                    }
                                    if (var85.field2446 != -1) {
                                        int var92 = class3.field73 + var85.field2469;
                                        int var93 = class87.field2010 + var85.field2454 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class104.method835(var85.field2441, var93, false, var92);
                                        var91 = class114.field2827[class88.method670(96, (byte) -81, var94)];
                                    }
                                    arg2.method783(var4, var52, var61, var83, var84, var86, var67, var69, var66, var70, class109.method882(var73, var68, (byte) 78), class109.method882(var73, var72, (byte) 94), class109.method882(var73, var71, (byte) 51), class109.method882(var73, var74, (byte) -69), class88.method670(var68, (byte) -57, var88), class88.method670(var72, (byte) -52, var88), class88.method670(var71, (byte) -73, var88), class88.method670(var74, (byte) -59, var88), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method750(var4, var54, var53, class94.method719(arg0 - 256, var54, var53, var4));
                }
            }
            class105.field2546[var4] = null;
            class112.field2796[var4] = null;
            class105.field2638[var4] = null;
            class77.field1815[var4] = null;
            client.field497[var4] = null;
        }
        arg2.method758(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class12.field371[1][var5][var46] & 0x2) == 2) {
                    arg2.method751(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        int var9 = 0;
        if (arg0 != 255) {
            method130(-37, null, null);
        }
        while (var9 < 4) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class60.field1491[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            while (var13 > 0 && (var6 & class60.field1491[var10][var12][var13 - 1]) != 0) {
                                var13--;
                            }
                            int var15 = var10;
                            while (var14 < 104 && (class60.field1491[var10][var12][var14 + 1] & var6) != 0) {
                                var14++;
                            }
                            int var16;
                            label355: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class60.field1491[var16 - 1][var12][var17] & var6) == 0) {
                                        break label355;
                                    }
                                }
                            }
                            label344: while (var9 > var15) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((var6 & class60.field1491[var15 + 1][var12][var18]) == 0) {
                                        break label344;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var15 + 1 - var16) * (var14 + 1 - var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class42.field1062[var15][var12][var13] - var20;
                                int var22 = class42.field1062[var16][var12][var13];
                                class97.method771(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class60.field1491[var23][var12][var24] = class104.method832(class60.field1491[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class60.field1491[var10][var12][var11]) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class60.field1491[var10][var25 - 1][var11] & var7) != 0; var25--) {
                            }
                            int var26;
                            for (var26 = var12; var26 < 104 && (var7 & class60.field1491[var10][var26 + 1][var11]) != 0; var26++) {
                            }
                            int var27 = var10;
                            int var28;
                            label410: for (var28 = var10; var28 > 0; var28--) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class60.field1491[var28 - 1][var29][var11] & var7) == 0) {
                                        break label410;
                                    }
                                }
                            }
                            label399: while (var27 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class60.field1491[var27 + 1][var30][var11] & var7) == 0) {
                                        break label399;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var26 + 1 - var25) * (var27 + 1 - var28);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class42.field1062[var28][var25][var11];
                                int var34 = class42.field1062[var27][var25][var11] - var32;
                                class97.method771(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class60.field1491[var35][var36][var11] = class104.method832(class60.field1491[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class60.field1491[var10][var12][var11] & var8) != 0) {
                            int var37 = var11;
                            int var38 = var12;
                            int var39 = var12;
                            while (var37 < 104 && (var8 & class60.field1491[var10][var12][var37 + 1]) != 0) {
                                var37++;
                            }
                            int var40;
                            for (var40 = var11; var40 > 0 && (var8 & class60.field1491[var10][var12][var40 - 1]) != 0; var40--) {
                            }
                            label465: while (var39 > 0) {
                                for (int var41 = var40; var41 <= var37; var41++) {
                                    if ((class60.field1491[var10][var39 - 1][var41] & var8) == 0) {
                                        break label465;
                                    }
                                }
                                var39--;
                            }
                            label454: while (var38 < 104) {
                                for (int var42 = var40; var42 <= var37; var42++) {
                                    if ((var8 & class60.field1491[var10][var38 + 1][var42]) == 0) {
                                        break label454;
                                    }
                                }
                                var38++;
                            }
                            if ((var37 + 1 - var40) * (var38 + 1 - var39) >= 4) {
                                int var43 = class42.field1062[var10][var39][var40];
                                class97.method771(var9, 4, var39 * 128, var38 * 128 + 128, var40 * 128, var37 * 128 + 128, var43, var43);
                                for (int var44 = var39; var44 <= var38; var44++) {
                                    for (int var45 = var40; var45 <= var37; var45++) {
                                        class60.field1491[var10][var44][var45] = class104.method832(class60.field1491[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }
}
