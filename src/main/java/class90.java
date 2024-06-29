import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class90 {

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Llm;")
    public static class150 field1304 = new class150(64);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[B")
    public byte[] field1306;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "[B")
    public byte[] field1312;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)I")
    public static final int method579(int arg0, int arg1, byte arg2) {
        if (arg2 > -62) {
            method586(true, (String) null);
        }
        field1303++;
        class205 var3 = (class205) class278.field4412.method1453(true, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field3061.length) {
            return var3.field3061[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lej;I[[[IZ)V")
    public static final void method580(class213[] arg0, int arg1, int[][][] arg2, boolean arg3) {
        field1307++;
        if (!arg3) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class164.field2333[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class164.field2333[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method1339(var5, -8928, var6);
                            }
                        }
                    }
                }
            }
            class153.field2127 += (int) (Math.random() * 5.0D) - 2;
            class277.field4403 += (int) (Math.random() * 5.0D) - 2;
            if (class153.field2127 < -16) {
                class153.field2127 = -16;
            }
            if (class277.field4403 < -8) {
                class277.field4403 = -8;
            }
            if (class277.field4403 > 8) {
                class277.field4403 = 8;
            }
            if (class153.field2127 > 16) {
                class153.field2127 = 16;
            }
        }
        if (arg1 != 1) {
            method587((Component) null, false);
        }
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int[][] var9 = new int[104][104];
        int var10 = class277.field4403 >> 2 << 10;
        int[][] var11 = new int[104][104];
        int var12 = class153.field2127 >> 1;
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class184.field2796[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class185.field2812[var13][var101 + 1][var55] - class185.field2812[var13][var101 - 1][var55];
                    int var104 = class185.field2812[var13][var101][var55 + 1] - class185.field2812[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var52[var101 + 1][var55] >> 3) + (var52[var101][var55] >> 1) + (var52[var101 + -1][var55] >> 2) + (var52[var101][var55 + 1] >> 3) + (var52[var101][var55 + -1] >> 2);
                    int var107 = (var103 << 8) / var105;
                    int var108 = -65536 / var105;
                    int var109 = (var104 << 8) / var105;
                    int var110 = (var109 * -50 + var107 * -50 + var108 * -10) / var54 + var102;
                    var11[var101][var55] = var110 - var106;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class39.field588[var56] = 0;
                class174.field2459[var56] = 0;
                class208.field3087[var56] = 0;
                class243.field3813[var56] = 0;
                class131.field1833[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class16.field284[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class243 var97 = class104.method663((byte) -128, var96 - 1);
                            class39.field588[var86] += var97.field3811;
                            class174.field2459[var86] += var97.field3812;
                            class208.field3087[var86] += var97.field3810;
                            class243.field3813[var86] += var97.field3820;
                            var10002 = class131.field1833[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class16.field284[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class243 var100 = class104.method663((byte) -119, var99 - 1);
                            class39.field588[var86] -= var100.field3811;
                            class174.field2459[var86] -= var100.field3812;
                            class208.field3087[var86] -= var100.field3810;
                            class243.field3813[var86] -= var100.field3820;
                            var10002 = class131.field1833[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var89 += class208.field3087[var93];
                            var91 += class243.field3813[var93];
                            var88 += class174.field2459[var93];
                            var90 += class131.field1833[var93];
                            var87 += class39.field588[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var90 -= class131.field1833[var94];
                            var87 -= class39.field588[var94];
                            var89 -= class208.field3087[var94];
                            var88 -= class174.field2459[var94];
                            var91 -= class243.field3813[var94];
                        }
                        if (var92 >= 0 && var90 > 0) {
                            var9[var57][var92] = class254.method1655(var87 * 256 / var91, var89 / var90, -124, var88 / var90);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg3 || class294.method1973(2) || (class164.field2333[0][var58][var59] & 0x2) != 0 || (class164.field2333[var13][var58][var59] & 0x10) == 0 && class110.method704(var59, var13, -1, var58) == class249.field3890) {
                        if (var13 < class137.field1873) {
                            class137.field1873 = var13;
                        }
                        int var60 = class16.field284[var13][var58][var59] & 0xFF;
                        int var61 = class124.field1753[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class185.field2812[var13][var58][var59];
                            int var63 = class185.field2812[var13][var58][var59 + 1];
                            int var64 = class185.field2812[var13][var58 + 1][var59 + 1];
                            int var65 = class185.field2812[var13][var58 + 1][var59];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class18.field313[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class272.method1771(4, var61 - 1).field2218) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var65 && var62 == var64 && var62 == var63) {
                                    class257.field4161[var13][var58][var59] = class161.method1003(class257.field4161[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var9[var58][var59];
                                int var68 = (var67 & 0x7F) + var12;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var10 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var70 = class118.field1695[class91.method590(var69, (byte) 63, 96)];
                            } else {
                                var70 = 0;
                                var67 = -1;
                            }
                            int var71 = var11[var58][var59];
                            int var72 = var11[var58 + 1][var59 + 1];
                            int var73 = var11[var58][var59 + 1];
                            int var74 = var11[var58 + 1][var59];
                            if (var61 == 0) {
                                class291.method1957(var13, var58, var59, 0, 0, -1, var62, var65, var64, var63, class91.method590(var67, (byte) 63, var71), class91.method590(var67, (byte) 63, var74), class91.method590(var67, (byte) 63, var72), class91.method590(var67, (byte) 63, var73), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var75 = class109.field1551[var13][var58][var59];
                                int var76 = class18.field313[var13][var58][var59] + 1;
                                class159 var77 = class272.method1771(arg1 + 3, var61 + -1);
                                int var78 = var77.field2204;
                                if (var78 >= 0 && !class118.field1696.method564(15, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class118.field1695[class142.method893(class118.field1696.method560(var78, 65535), 96, false)];
                                    var80 = -1;
                                } else if (var77.field2217 == -1) {
                                    var80 = -2;
                                    var79 = 0;
                                } else {
                                    var80 = var77.field2217;
                                    int var81 = (var80 & 0x7F) + var12;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var10 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class118.field1695[class142.method893(var82, 96, false)];
                                }
                                if (var77.field2210 >= 0) {
                                    int var83 = var77.field2210;
                                    int var84 = (var83 & 0x7F) + var12;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var10 + var83 & 0xFC00) - (-(var83 & 0x380) - var84);
                                    var79 = class118.field1695[class142.method893(var85, 96, false)];
                                }
                                class291.method1957(var13, var58, var59, var76, var75, var78, var62, var65, var64, var63, class91.method590(var67, (byte) 63, var71), class91.method590(var67, (byte) 63, var74), class91.method590(var67, (byte) 63, var72), class91.method590(var67, (byte) 63, var73), class142.method893(var80, var71, false), class142.method893(var80, var74, false), class142.method893(var80, var72, false), class142.method893(var80, var73, false), var70, var79);
                            }
                        }
                    }
                }
            }
            class16.field284[var13] = null;
            class124.field1753[var13] = null;
            class18.field313[var13] = null;
            class109.field1551[var13] = null;
            class184.field2796[var13] = null;
        }
        class252.method1642(-50, -10, -50);
        if (arg3) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class164.field2333[1][var14][var51] & 0x2) == 2) {
                    class71.method473(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class257.field4161[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19 = var16;
                        while (var18 > 0 && (class257.field4161[var15][var17][var18 - 1] & 0x1) != 0) {
                            var18--;
                        }
                        while (var19 < 104 && (class257.field4161[var15][var17][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        int var20;
                        label354: for (var20 = var15; var20 > 0; var20--) {
                            for (int var21 = var18; var21 <= var19; var21++) {
                                if ((class257.field4161[var20 - 1][var17][var21] & 0x1) == 0) {
                                    break label354;
                                }
                            }
                        }
                        int var22;
                        label342: for (var22 = var15; var22 < 3; var22++) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class257.field4161[var22 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                        }
                        int var24 = (var22 - (var20 - 1)) * (var19 + 1 - var18);
                        if (var24 >= 8) {
                            int var25 = class185.field2812[var20][var17][var18];
                            short var26 = 240;
                            int var27 = class185.field2812[var22][var17][var18] - var26;
                            class115.method739(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var25);
                            for (int var28 = var20; var28 <= var22; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class257.field4161[var28][var17][var29] = class32.method199(class257.field4161[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class257.field4161[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31 = var17;
                        int var32 = var15;
                        while (var30 > 0 && (class257.field4161[var15][var30 - 1][var16] & 0x2) != 0) {
                            var30--;
                        }
                        int var33 = var15;
                        while (var31 < 104 && (class257.field4161[var15][var31 + 1][var16] & 0x2) != 0) {
                            var31++;
                        }
                        label408: while (var33 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class257.field4161[var33 - 1][var34][var16] & 0x2) == 0) {
                                    break label408;
                                }
                            }
                            var33--;
                        }
                        label397: while (var32 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class257.field4161[var32 + 1][var35][var16] & 0x2) == 0) {
                                    break label397;
                                }
                            }
                            var32++;
                        }
                        int var36 = (var32 + 1 - var33) * (var31 + 1 - var30);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class185.field2812[var32][var30][var16] - var37;
                            int var39 = class185.field2812[var33][var30][var16];
                            class115.method739(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var33; var40 <= var32; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class257.field4161[var40][var41][var16] = class32.method199(class257.field4161[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class257.field4161[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 < 104 && (class257.field4161[var15][var17][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        int var45;
                        for (var45 = var16; var45 > 0 && (class257.field4161[var15][var17][var45 - 1] & 0x4) != 0; var45--) {
                        }
                        label462: while (var42 > 0) {
                            for (int var46 = var45; var46 <= var44; var46++) {
                                if ((class257.field4161[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var42--;
                        }
                        label451: while (var43 < 104) {
                            for (int var47 = var45; var47 <= var44; var47++) {
                                if ((class257.field4161[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var43++;
                        }
                        if ((var43 + 1 - var42) * (var44 + 1 - var45) >= 4) {
                            int var48 = class185.field2812[var15][var42][var45];
                            class115.method739(4, var42 * 128, var43 * 128 + 128, var45 * 128, var44 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var45; var50 <= var44; var50++) {
                                    class257.field4161[var15][var49][var50] = class32.method199(class257.field4161[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1298++;
        class76 var13 = new class76();
        var13.field1078 = arg3;
        var13.field1069 = arg2;
        var13.field1064 = arg9;
        var13.field1065 = arg8;
        var13.field1070 = arg4;
        var13.field1062 = arg12;
        if (arg1 < 66) {
            method587((Component) null, false);
        }
        var13.field1076 = arg5;
        var13.field1063 = arg7;
        var13.field1066 = arg6;
        var13.field1061 = arg11;
        var13.field1072 = arg10;
        var13.field1079 = arg0;
        class229.field3585.method370((byte) -22, var13);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1304 = null;
        if (arg0 <= 7) {
            field1315 = 59;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIIIII)V")
    public static final void method583(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1305++;
        if (arg1 != -9474) {
            return;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class167.field2377 = (short) arg2;
        if (arg3 < 1) {
            arg3 = 1;
        }
        class260.field4185 = (short) arg3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
    public static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class129.method822(class247.field3876[arg3], arg1 - arg5, -2426, arg0, arg1 + arg5);
        field1296++;
        int var6 = 0;
        if (arg2 < 99) {
            method580((class213[]) null, -119, (int[][][]) null, true);
        }
        int var7 = arg5 * arg5;
        int var8 = arg4 << 1;
        int var9 = var7 << 1;
        int var10 = var7 << 2;
        int var11 = arg4 * arg4;
        int var12 = var11 << 1;
        int var13 = var11 << 2;
        int var14 = var11 - (var8 - 1) * var9;
        int var15 = arg4;
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = (var6 + 1) * var13;
        int var18 = (1 - var8) * var7 + var12;
        int var19 = ((arg4 << 1) - 3) * var9;
        int var20 = (arg4 - 1) * var10;
        while (var15 > 0) {
            var15--;
            int var21 = arg3 - var15;
            if (var18 < 0) {
                while (var18 < 0) {
                    var6++;
                    var14 += var17;
                    var17 += var13;
                    var18 += var16;
                    var16 += var13;
                }
            }
            if (var14 < 0) {
                var14 += var17;
                var18 += var16;
                var6++;
                var16 += var13;
                var17 += var13;
            }
            int var22 = arg1 + var6;
            var18 += -var20;
            int var23 = arg3 + var15;
            int var24 = arg1 - var6;
            class129.method822(class247.field3876[var21], var24, -2426, arg0, var22);
            var20 -= var10;
            class129.method822(class247.field3876[var23], var24, -2426, arg0, var22);
            var14 += -var19;
            var19 -= var10;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    public static final void method585(int arg0, int arg1) {
        int var2 = -117 / ((-arg1 - 13) / 41);
        field1317++;
        class20.field327.method943(arg0, true);
        class70.field1020.method943(arg0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method586(boolean arg0, String arg1) {
        field1300++;
        if (arg1 == null) {
            return false;
        } else if (arg0) {
            for (int var2 = 0; var2 < class43.field643; var2++) {
                if (arg1.equalsIgnoreCase(class206.field3081[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class250.field3905.field5053);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method587(Component arg0, boolean arg1) {
        arg0.removeKeyListener(class257.field4154);
        if (!arg1) {
            field1304 = null;
        }
        field1297++;
        arg0.removeFocusListener(class257.field4154);
        class129.field1797 = -1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBIII)V")
    public static final void method588(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1301++;
        class193[] var7 = class267.field4286;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class193 var10 = var7[var8];
            if (var10 != null && var10.field2944 == 2) {
                class157.method972(0, arg6, arg5 >> 1, (var10.field2942 - class228.field3570 << 7) + var10.field2951, var10.field2955 * 2, (var10.field2947 - class170.field2421 << 7) + var10.field2954, arg1, arg4 >> 1);
                if (class105.field1512 > -1 && (class35.field533 % 20) < 10) {
                    class99.field1435[var10.field2946].method694(class105.field1512 + arg2 - 12, class161.field2250 + arg0 + -28);
                }
            }
        }
        int var9 = 108 % ((arg3 - 19) / 47);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLbj;)V")
    public static final void method589(byte arg0, class215 arg1) {
        field1309++;
        int var2 = 21 % ((-arg0 - 24) / 52);
        int var3 = class97.field1399 >> 1;
        int var4 = class97.field1402 >> 2 << 10;
        byte[][] var5 = new byte[class97.field1405][class97.field1406];
        while (arg1.field3287.length > arg1.field3280) {
            int var34 = 0;
            boolean var35 = false;
            int var36 = 0;
            if (arg1.method1374((byte) -60) == 1) {
                var34 = arg1.method1374((byte) -60);
                var36 = arg1.method1374((byte) -60);
                var35 = true;
            }
            int var37 = arg1.method1374((byte) -60);
            int var38 = arg1.method1374((byte) -60);
            int var39 = var37 * 64 - class97.field1400;
            int var40 = class97.field1406 + class97.field1397 - (var38 * 64) - 1;
            if (var39 >= 0 && (var40 - 63) >= 0 && class97.field1405 > var39 + 63 && class97.field1406 > var40) {
                for (int var41 = 0; var41 < 64; var41++) {
                    byte[] var42 = var5[var39 + var41];
                    for (int var43 = 0; var43 < 64; var43++) {
                        if (!var35 || var41 >= var34 * 8 && var34 * 8 + 8 > var41 && var36 * 8 <= var43 && var43 < var36 * 8 + 8) {
                            var42[var40 - var43] = arg1.method1350((byte) 99);
                        }
                    }
                }
            } else if (var35) {
                arg1.field3280 += 64;
            } else {
                arg1.field3280 += 4096;
            }
        }
        int var6 = class97.field1405;
        int var7 = class97.field1406;
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        int[] var10 = new int[var7];
        int[] var11 = new int[var7];
        int[] var12 = new int[var7];
        for (int var13 = -5; var13 < var6; var13++) {
            if ((var13 & 0x1FF) == 0) {
                class255.method1658(-26, true);
            }
            for (int var14 = 0; var14 < var7; var14++) {
                int var28 = var13 + 5;
                int var10002;
                if (var6 > var28) {
                    int var29 = var5[var28][var14] & 0xFF;
                    if (var29 > 0) {
                        class243 var30 = class104.method663((byte) 106, var29 - 1);
                        var8[var14] += var30.field3811;
                        var9[var14] += var30.field3812;
                        var10[var14] += var30.field3810;
                        var11[var14] += var30.field3820;
                        var10002 = var12[var14]++;
                    }
                }
                int var31 = var13 - 5;
                if (var31 >= 0) {
                    int var32 = var5[var31][var14] & 0xFF;
                    if (var32 > 0) {
                        class243 var33 = class104.method663((byte) -120, var32 - 1);
                        var8[var14] -= var33.field3811;
                        var9[var14] -= var33.field3812;
                        var10[var14] -= var33.field3810;
                        var11[var14] -= var33.field3820;
                        var10002 = var12[var14]--;
                    }
                }
            }
            if (var13 >= 0) {
                int[][] var15 = class97.field1409[var13 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                for (int var21 = -5; var21 < var7; var21++) {
                    int var22 = var21 + 5;
                    if (var7 > var22) {
                        var16 += var8[var22];
                        var19 += var12[var22];
                        var18 += var11[var22];
                        var20 += var10[var22];
                        var17 += var9[var22];
                    }
                    int var23 = var21 - 5;
                    if (var23 >= 0) {
                        var20 -= var10[var23];
                        var19 -= var12[var23];
                        var18 -= var11[var23];
                        var17 -= var9[var23];
                        var16 -= var8[var23];
                    }
                    if (var21 >= 0 && var19 > 0) {
                        int[] var24 = var15[var21 >> 6];
                        int var25 = var18 == 0 ? 0 : class254.method1655(var16 * 256 / var18, var20 / var19, -121, var17 / var19);
                        if (var5[var13][var21] != 0) {
                            int var26 = (var25 & 0x7F) + var3;
                            if (var26 < 0) {
                                var26 = 0;
                            } else if (var26 > 127) {
                                var26 = 127;
                            }
                            int var27 = (var25 & 0x380) + ((var4 + var25 & 0xFC00) + var26);
                            if (var24 == null) {
                                var24 = var15[var21 >> 6] = new int[4096];
                            }
                            var24[class32.method199(var13, 63) + class32.method199(4032, var21 << 6)] = class118.field1695[class91.method590(var27, (byte) 63, 96)];
                        } else if (var24 != null) {
                            var24[class32.method199(var13, 63) + (class32.method199(var21, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }
}
