import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class125 extends class127 {

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3006 = 0;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3007 = -1;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Lfc;")
    public static class34 field3016 = new class34(50);

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lhb;")
    public static class44 field3028 = class102.method810("scrollen:", -28606);

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Lhb;")
    public static class44 field3026 = class102.method810("leuchten2:", -28606);

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field3032 = -1;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Lhb;")
    public static class44 field3019 = class102.method810("runes", -28606);

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lhb;")
    public static class44 field3031 = class102.method810("und haben es deaktiviert)3 Benutzen Sie die", -28606);

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "Lhb;")
    private static class44 field3030 = class102.method810("To create a new account you need to", -28606);

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "[Lde;")
    public static class24[] field3025 = new class24[4];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lhb;")
    public static class44 field3023 = field3030;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "B")
    public static byte field3033 = 0;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lhb;")
    public static class44 field3021 = class102.method810("Fehler beim Laden Ihres Charakter)2Profils", -28606);

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lhb;")
    private static class44 field3035 = class102.method810("glow1:", -28606);

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Lhb;")
    public static class44 field3034 = class102.method810("Konfig geladen)3", -28606);

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "Lhb;")
    public static class44 field3037 = field3035;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Led;B[Lpb;)V", line = 21)
    public static final void method942(class29 arg0, byte arg1, class92[] arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class104.field2668[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class104.field2668[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method736(var110, -126, var111);
                        }
                    }
                }
            }
        }
        class1.field5 += (int) (Math.random() * 5.0D) - 2;
        class93.field2359 += (int) (Math.random() * 5.0D) - 2;
        if (class93.field2359 < -8) {
            class93.field2359 = -8;
        }
        field3008++;
        if (class1.field5 < -16) {
            class1.field5 = -16;
        }
        if (class93.field2359 > 8) {
            class93.field2359 = 8;
        }
        if (class1.field5 > 16) {
            class1.field5 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class96.field2435[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class64.field1620[var4][var101 + 1][var50] - class64.field1620[var4][var101 - 1][var50];
                    int var103 = class64.field1620[var4][var101][var50 + 1] - class64.field1620[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var106 * -50 + var105 * -50 + var107 * -10) / var49 + 96;
                    int var109 = (var47[var101][var50] >> 1) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101 - 1][var50] >> 2) + (var47[var101 - -1][var50] >> 3);
                    class93.field2357[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class1.field27[var51] = 0;
                class15.field301[var51] = 0;
                class4.field105[var51] = 0;
                class77.field1921[var51] = 0;
                class93.field2360[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class80.field2046[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class77 var97 = class116.method881(var96 - 1, 2789);
                            class1.field27[var55] += var97.field1920;
                            class15.field301[var55] += var97.field1930;
                            class4.field105[var55] += var97.field1936;
                            class77.field1921[var55] += var97.field1944;
                            var10002 = class93.field2360[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class80.field2046[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class77 var100 = class116.method881(var99 - 1, 2789);
                            class1.field27[var55] -= var100.field1920;
                            class15.field301[var55] -= var100.field1930;
                            class4.field105[var55] -= var100.field1936;
                            class77.field1921[var55] -= var100.field1944;
                            var10002 = class93.field2360[var55]--;
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
                            var57 += class15.field301[var62];
                            var60 += class93.field2360[var62];
                            var58 += class77.field1921[var62];
                            var56 += class1.field27[var62];
                            var59 += class4.field105[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class93.field2360[var63];
                            var56 -= class1.field27[var63];
                            var58 -= class77.field1921[var63];
                            var57 -= class15.field301[var63];
                            var59 -= class4.field105[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class81.field2085 || (class104.field2668[0][var52][var61] & 0x2) != 0 || (class104.field2668[var4][var52][var61] & 0x10) == 0 && class79.method653(27466, var52, var4, var61) == class16.field316)) {
                            if (var4 < class94.field2405) {
                                class94.field2405 = var4;
                            }
                            int var64 = class85.field2169[var4][var52][var61] & 0xFF;
                            int var65 = class80.field2046[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class64.field1620[var4][var52][var61];
                                int var67 = class64.field1620[var4][var52 + 1][var61];
                                int var68 = class64.field1620[var4][var52 + 1][var61 + 1];
                                int var69 = class64.field1620[var4][var52][var61 + 1];
                                int var70 = class93.field2357[var52][var61];
                                int var71 = class93.field2357[var52 + 1][var61];
                                int var72 = class93.field2357[var52 + 1][var61 + 1];
                                int var73 = class93.field2357[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var65 > 0) {
                                    int var76 = var56 * 256 / var58;
                                    int var77 = var59 / var60;
                                    int var78 = var57 / var60;
                                    var75 = class9.method70(var76, var78, var77, (byte) -109);
                                    int var79 = class93.field2359 + var76 & 0xFF;
                                    int var80 = class1.field5 + var77;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class9.method70(var79, var78, var80, (byte) -105);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class55.field1394[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class97.method771(var64 - 1, 4).field2227) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class101.field2563[var4][var52][var61] = class40.method350(class101.field2563[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class58.field1512[class19.method147(96, var74, -64)];
                                }
                                if (var64 == 0) {
                                    arg0.method245(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class19.method147(var70, var75, -93), class19.method147(var71, var75, 88), class19.method147(var72, var75, -72), class19.method147(var73, var75, 101), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class55.field1394[var4][var52][var61] + 1;
                                    byte var84 = class67.field1681[var4][var52][var61];
                                    class88 var85 = class97.method771(var64 - 1, 4);
                                    int var86 = var85.field2245;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class58.field1516.method759(var86, -27989);
                                        var87 = -1;
                                    } else if (var85.field2232 == 16711935) {
                                        var90 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var87 = class9.method70(var85.field2224, var85.field2246, var85.field2237, (byte) -101);
                                        int var88 = class93.field2359 + var85.field2224 & 0xFF;
                                        int var89 = class1.field5 + var85.field2237;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class9.method70(var88, var85.field2246, var89, (byte) -117);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class58.field1512[class107.method840((byte) 74, var90, 96)];
                                    }
                                    if (var85.field2235 != -1) {
                                        int var92 = class93.field2359 + var85.field2228 & 0xFF;
                                        int var93 = class1.field5 + var85.field2243;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class9.method70(var92, var85.field2253, var93, (byte) -128);
                                        var91 = class58.field1512[class107.method840((byte) 74, var94, 96)];
                                    }
                                    arg0.method245(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class19.method147(var70, var75, 108), class19.method147(var71, var75, 118), class19.method147(var72, var75, 46), class19.method147(var73, var75, 26), class107.method840((byte) 74, var87, var70), class107.method840((byte) 74, var87, var71), class107.method840((byte) 74, var87, var72), class107.method840((byte) 74, var87, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method251(var4, var54, var53, class79.method653(27466, var54, var4, var53));
                }
            }
            class80.field2046[var4] = null;
            class85.field2169[var4] = null;
            class55.field1394[var4] = null;
            class67.field1681[var4] = null;
            class96.field2435[var4] = null;
        }
        arg0.method258(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class104.field2668[1][var5][var46] & 0x2) == 2) {
                    arg0.method240(var5, var46);
                }
            }
        }
        if (arg1 >= -17) {
            return;
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var6 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class101.field2563[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class101.field2563[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (class101.field2563[var10][var12][var14 + 1] & var6) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16;
                            label357: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class101.field2563[var16 - 1][var12][var17] & var6) == 0) {
                                        break label357;
                                    }
                                }
                            }
                            label346: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((var6 & class101.field2563[var15 + 1][var12][var18]) == 0) {
                                        break label346;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var15 + 1 - var16) * (var14 + 1 + -var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class64.field1620[var16][var12][var13];
                                int var22 = class64.field1620[var15][var12][var13] - var20;
                                class29.method241(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var22, var21);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class101.field2563[var23][var12][var24] = class118.method914(class101.field2563[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class101.field2563[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26 = var10;
                            while (var25 < 104 && (var7 & class101.field2563[var10][var25 + 1][var11]) != 0) {
                                var25++;
                            }
                            int var27;
                            for (var27 = var12; var27 > 0 && (class101.field2563[var10][var27 - 1][var11] & var7) != 0; var27--) {
                            }
                            int var28 = var10;
                            label412: while (var26 > 0) {
                                for (int var29 = var27; var29 <= var25; var29++) {
                                    if ((class101.field2563[var26 - 1][var29][var11] & var7) == 0) {
                                        break label412;
                                    }
                                }
                                var26--;
                            }
                            label401: while (var28 < var9) {
                                for (int var30 = var27; var30 <= var25; var30++) {
                                    if ((var7 & class101.field2563[var28 + 1][var30][var11]) == 0) {
                                        break label401;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var26) * (-var27 + var25 + 1);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class64.field1620[var28][var27][var11] - var32;
                                int var34 = class64.field1620[var26][var27][var11];
                                class29.method241(var9, 2, var27 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var28; var35++) {
                                    for (int var36 = var27; var36 <= var25; var36++) {
                                        class101.field2563[var35][var36][var11] = class118.method914(class101.field2563[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class101.field2563[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (var8 & class101.field2563[var10][var12][var39 - 1]) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (class101.field2563[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            label467: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var8 & class101.field2563[var10][var37 - 1][var41]) == 0) {
                                        break label467;
                                    }
                                }
                                var37--;
                            }
                            label456: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class101.field2563[var10][var38 + 1][var42] & var8) == 0) {
                                        break label456;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (var40 + 1 + -var39) >= 4) {
                                int var43 = class64.field1620[var10][var37][var39];
                                class29.method241(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class101.field2563[var10][var44][var45] = class118.method914(class101.field2563[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 763)
    public static void method943(int arg0) {
        field3016 = null;
        field3031 = null;
        field3037 = null;
        field3035 = null;
        field3026 = null;
        field3034 = null;
        field3030 = null;
        field3019 = null;
        field3021 = null;
        field3023 = null;
        field3025 = null;
        if (arg0 == -1) {
            field3028 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lhb;BLhb;Ltd;)Lee;", line = 785)
    public static final class30 method944(class44 arg0, byte arg1, class44 arg2, class116 arg3) {
        if (arg1 != 119) {
            field3023 = null;
        }
        field3013++;
        int var4 = arg3.method897(arg1 - 174, arg0);
        int var5 = arg3.method890((byte) 87, arg2, var4);
        return class47.method438((byte) -127, var5, var4, arg3);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILtd;II)[Lne;", line = 800)
    public static final class83[] method945(int arg0, class116 arg1, int arg2, int arg3) {
        field3012++;
        if (class74.method629(-12890, arg2, arg1, arg3)) {
            if (arg0 != -50) {
                method944(null, (byte) 62, null, null);
            }
            return class85.method691(-106);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)V", line = 814)
    public static final void method946(int arg0, byte arg1, int arg2) {
        field3005++;
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class95.field2409[var4] != null) {
                int var5 = class95.field2407[var4];
                int var6 = class86.field2190 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class44 var7 = class64.field1624[var4];
                if (var7 != null && var7.method400((byte) -75, class5.field122)) {
                    var7 = var7.method380(5, (byte) 121);
                }
                if (var7 != null && var7.method400((byte) -65, class48.field1190)) {
                    var7 = var7.method380(5, (byte) 116);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class89.field2263 == 0 || class89.field2263 == 1 && class57.method530(var7, false))) {
                    if (var6 - 14 < arg2 && arg2 <= var6 && !var7.method382((byte) -85, class72.field1820.field2651)) {
                        class105.field2682++;
                        class100.field2542++;
                        if (class51.field1240 >= 1) {
                            class81.field2078++;
                            class52.method495(0, 32, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class53.field1321);
                        }
                        class52.method495(0, 49, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class84.field2152);
                        class52.method495(0, 6, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class66.field1672);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class102.field2590 == 0 && (var5 == 7 || class39.field881 == 0 || class39.field881 == 1 && class57.method530(var7, false))) {
                    if (var6 - 14 < arg2 && var6 >= arg2) {
                        if (class51.field1240 >= 1) {
                            class52.method495(0, 32, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class53.field1321);
                            class81.field2078++;
                        }
                        class100.field2542++;
                        class105.field2682++;
                        class52.method495(0, 49, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class84.field2152);
                        class52.method495(0, 6, 0, 0, arg1 + 1045, class117.method903(new class44[] { class25.field583, var7 }, false), class66.field1672);
                    }
                    var3++;
                }
                if (var5 == 4 && (class71.field1745 == 0 || class71.field1745 == 1 && class57.method530(var7, false))) {
                    if (var6 - 14 < arg2 && var6 >= arg2) {
                        class28.field663++;
                        class52.method495(0, 56, 0, 0, 1000, class117.method903(new class44[] { class25.field583, var7 }, false), class128.field3075);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class102.field2590 == 0 && class39.field881 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class71.field1745 == 0 || class71.field1745 == 1 && class57.method530(var7, false))) {
                    var3++;
                    if (arg2 > var6 - 14 && arg2 <= var6) {
                        class52.method495(0, 38, 0, 0, arg1 ^ 0xFFFFFC3B, class117.method903(new class44[] { class25.field583, var7 }, false), class51.field1253);
                        class100.field2528++;
                    }
                }
            }
        }
        if (arg1 != -45) {
            method943(64);
        }
    }
}
