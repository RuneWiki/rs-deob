import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lwb;")
    private static class130 field1186 = class26.method212("Unable to find ", -32376);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lwb;")
    private static class130 field1189 = class26.method212("Remove", -32376);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Z")
    public static volatile boolean field1191 = true;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lwb;")
    public static class130 field1193 = class26.method212("da dieser Computer gegen unsere ", -32376);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lwb;")
    public static class130 field1196 = field1186;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lwb;")
    public static class130 field1199 = class26.method212("Unerwartete Antwort vom Anmelde)2Server)3", -32376);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lwb;")
    public static class130 field1200 = field1189;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lwc;")
    public static class131 field1187;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lda;")
    public static class20 field1190;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lec;")
    public static class28 field1194;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lk;")
    public static class60 field1195;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lqd;")
    public static class100[] field1185;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[Lec;")
    public static class28[] field1198;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[[[B")
    public static byte[][][] field1188;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfc;[Luc;I)V", line = 40)
    public static final void method409(class34 arg0, class121[] arg1, int arg2) {
        field1192++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class56.field1435[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class56.field1435[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method926(var111, (byte) 48, var110);
                        }
                    }
                }
            }
        }
        class101.field2440 += (int) (Math.random() * 5.0D) - 2;
        if (class101.field2440 < -16) {
            class101.field2440 = -16;
        }
        if (class101.field2440 > 16) {
            class101.field2440 = 16;
        }
        class117.field2896 += (int) (Math.random() * 5.0D) - 2;
        if (class117.field2896 < -8) {
            class117.field2896 = -8;
        }
        if (class117.field2896 > 8) {
            class117.field2896 = 8;
        }
        if (arg2 != 128) {
            field1196 = null;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class117.field2879[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class69.field1781[var4][var101 + 1][var50] - class69.field1781[var4][var101 - 1][var50];
                    int var103 = class69.field1781[var4][var101][var50 + 1] - class69.field1781[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -50 + var106 * -10) / var49 + 96;
                    int var109 = (var47[var101][var50] >> 1) + ((var47[var101 + 1][var50] >> 3) + (var47[var101 - 1][var50] >> 2) + (var47[var101][var50 + -1] >> 2) + (var47[var101][var50 + 1] >> 3));
                    class81.field1941[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class106.field2578[var51] = 0;
                class4.field167[var51] = 0;
                class56.field1441[var51] = 0;
                class68.field1763[var51] = 0;
                class105.field2536[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class8.field288[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class94 var97 = class63.method525(-201, var96 - 1);
                            class106.field2578[var55] += var97.field2283;
                            class4.field167[var55] += var97.field2291;
                            class56.field1441[var55] += var97.field2280;
                            class68.field1763[var55] += var97.field2265;
                            var10002 = class105.field2536[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class8.field288[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class94 var100 = class63.method525(-201, var99 - 1);
                            class106.field2578[var55] -= var100.field2283;
                            class4.field167[var55] -= var100.field2291;
                            class56.field1441[var55] -= var100.field2280;
                            class68.field1763[var55] -= var100.field2265;
                            var10002 = class105.field2536[var55]--;
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
                            var60 += class68.field1763[var62];
                            var58 += class4.field167[var62];
                            var59 += class105.field2536[var62];
                            var57 += class56.field1441[var62];
                            var56 += class106.field2578[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class4.field167[var63];
                            var59 -= class105.field2536[var63];
                            var56 -= class106.field2578[var63];
                            var57 -= class56.field1441[var63];
                            var60 -= class68.field1763[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class4.field189 || (class56.field1435[0][var52][var61] & 0x2) != 0 || (class56.field1435[var4][var52][var61] & 0x10) == 0 && class132.method1021(var52, (byte) -91, var61, var4) == class111.field2726)) {
                            if (class128.field3028 > var4) {
                                class128.field3028 = var4;
                            }
                            int var64 = class8.field288[var4][var52][var61] & 0xFF;
                            int var65 = class6.field228[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class69.field1781[var4][var52 + 1][var61];
                                int var67 = class69.field1781[var4][var52][var61];
                                int var68 = class69.field1781[var4][var52 + 1][var61 + 1];
                                int var69 = class69.field1781[var4][var52][var61 + 1];
                                int var70 = class81.field1941[var52][var61];
                                int var71 = class81.field1941[var52 + 1][var61];
                                int var72 = class81.field1941[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = class81.field1941[var52][var61 + 1];
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var58 / var59;
                                    int var78 = var57 / var59;
                                    var75 = class89.method661(var76, var77, var78, (byte) -32);
                                    int var79 = class117.field2896 + var76 & 0xFF;
                                    int var80 = class101.field2440 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var73 = class89.method661(var79, var77, var80, (byte) -32);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && field1188[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class48.method430(arg2 ^ 0xFFFFFF00, var65 - 1).field434) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var67 == var68 && var67 == var69) {
                                        class117.field2895[var4][var52][var61] = class129.method950(class117.field2895[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var73 != -1) {
                                    var82 = class12.field354[class2.method7((byte) 49, var73, 96)];
                                }
                                if (var65 == 0) {
                                    arg0.method275(var4, var52, var61, 0, 0, -1, var67, var66, var68, var69, class2.method7((byte) 49, var75, var70), class2.method7((byte) 49, var75, var71), class2.method7((byte) 49, var75, var72), class2.method7((byte) 49, var75, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = field1188[var4][var52][var61] + 1;
                                    byte var84 = class8.field263[var4][var52][var61];
                                    class15 var85 = class48.method430(-128, var65 - 1);
                                    int var86 = var85.field432;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class12.field362.method43(var86, arg2 - 17476);
                                        var88 = -1;
                                    } else if (var85.field431 == 16711935) {
                                        var88 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var88 = class89.method661(var85.field416, var85.field425, var85.field433, (byte) -32);
                                        int var89 = class101.field2440 + var85.field433;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        int var90 = class117.field2896 + var85.field416 & 0xFF;
                                        var87 = class89.method661(var90, var85.field425, var89, (byte) -32);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class12.field354[class75.method591(var87, 96, 127)];
                                    }
                                    if (var85.field429 != -1) {
                                        int var92 = class101.field2440 + var85.field418;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var93 = class117.field2896 + var85.field430 & 0xFF;
                                        int var94 = class89.method661(var93, var85.field427, var92, (byte) -32);
                                        var91 = class12.field354[class75.method591(var94, 96, 127)];
                                    }
                                    arg0.method275(var4, var52, var61, var83, var84, var86, var67, var66, var68, var69, class2.method7((byte) 49, var75, var70), class2.method7((byte) 49, var75, var71), class2.method7((byte) 49, var75, var72), class2.method7((byte) 49, var75, var74), class75.method591(var88, var70, 127), class75.method591(var88, var71, 127), class75.method591(var88, var72, 127), class75.method591(var88, var74, arg2 - 1), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method277(var4, var54, var53, class132.method1021(var54, (byte) -44, var53, var4));
                }
            }
            class8.field288[var4] = null;
            class6.field228[var4] = null;
            field1188[var4] = null;
            class8.field263[var4] = null;
            class117.field2879[var4] = null;
        }
        arg0.method290(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class56.field1435[1][var5][var46] & 0x2) == 2) {
                    arg0.method279(var5, var46);
                }
            }
        }
        int var6 = 2;
        int var7 = 1;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class117.field2895[var10][var12][var11] & var7) != 0) {
                            int var13;
                            for (var13 = var11; var13 < 104 && (class117.field2895[var10][var12][var13 + 1] & var7) != 0; var13++) {
                            }
                            int var14 = var11;
                            int var15 = var10;
                            int var16 = var10;
                            while (var14 > 0 && (var7 & class117.field2895[var10][var12][var14 - 1]) != 0) {
                                var14--;
                            }
                            label355: while (var15 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((var7 & class117.field2895[var15 - 1][var12][var17]) == 0) {
                                        break label355;
                                    }
                                }
                                var15--;
                            }
                            label344: while (var16 < var9) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((var7 & class117.field2895[var16 + 1][var12][var18]) == 0) {
                                        break label344;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var16 + 1 - var15) * (var13 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class69.field1781[var16][var12][var14] - var20;
                                int var22 = class69.field1781[var15][var12][var14];
                                class34.method274(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class117.field2895[var23][var12][var24] = class32.method257(class117.field2895[var23][var12][var24], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class117.field2895[var10][var12][var11] & var6) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class117.field2895[var10][var25 - 1][var11] & var6) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            int var28 = var10;
                            while (var26 < 104 && (var6 & class117.field2895[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            label409: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var6 & class117.field2895[var27 - 1][var29][var11]) == 0) {
                                        break label409;
                                    }
                                }
                                var27--;
                            }
                            label398: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class117.field2895[var28 + 1][var30][var11] & var6) == 0) {
                                        break label398;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var26 + 1 - var25) * (var28 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class69.field1781[var28][var25][var11] - var32;
                                int var34 = class69.field1781[var27][var25][var11];
                                class34.method274(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class117.field2895[var35][var36][var11] = class32.method257(class117.field2895[var35][var36][var11], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class117.field2895[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; var38 > 0 && (class117.field2895[var10][var12][var38 - 1] & var8) != 0; var38--) {
                            }
                            int var39 = var11;
                            int var40 = var12;
                            while (var39 < 104 && (var8 & class117.field2895[var10][var12][var39 + 1]) != 0) {
                                var39++;
                            }
                            label463: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var39; var41++) {
                                    if ((class117.field2895[var10][var37 - 1][var41] & var8) == 0) {
                                        break label463;
                                    }
                                }
                                var37--;
                            }
                            label452: while (var40 < 104) {
                                for (int var42 = var38; var42 <= var39; var42++) {
                                    if ((class117.field2895[var10][var40 + 1][var42] & var8) == 0) {
                                        break label452;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var37) * (var39 + 1 - var38) >= 4) {
                                int var43 = class69.field1781[var10][var37][var38];
                                class34.method274(var9, 4, var37 * 128, var40 * 128 + 128, var38 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var40; var44++) {
                                    for (int var45 = var38; var45 <= var39; var45++) {
                                        class117.field2895[var10][var44][var45] = class32.method257(class117.field2895[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 769)
    public static void method410(byte arg0) {
        field1186 = null;
        field1187 = null;
        field1200 = null;
        field1188 = null;
        field1185 = null;
        field1195 = null;
        field1196 = null;
        field1190 = null;
        field1193 = null;
        field1189 = null;
        if (arg0 >= -42) {
            method409(null, null, -81);
        }
        field1199 = null;
        field1198 = null;
        field1194 = null;
    }
}
