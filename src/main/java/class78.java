import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class78 extends class67 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[Z")
    private boolean[] field1410;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "[I")
    public int[] field1409;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "[[I")
    public int[][] field1423;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lea;")
    public static class46 field1408 = new class46(8);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Li;")
    public static class88 field1411 = class208.method1425(105, "");

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Li;")
    public static class88 field1414 = null;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "[I")
    public static int[] field1420 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Li;")
    public static class88 field1421 = class208.method1425(105, "::gc");

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "Lnb;")
    public static class144 field1417;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "[[Lq;")
    public static class174[][] field1418;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "[[[Leg;")
    public static class52[][][] field1416;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1417 = null;
        int var1 = 65 % ((arg0 + 28) / 49);
        field1420 = null;
        field1408 = null;
        field1418 = null;
        field1414 = null;
        field1421 = null;
        field1411 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lfh;")
    public static final class64 method522(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        return var3 == null ? null : var3.field956;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZ[Lia;)V")
    public static final void method523(boolean arg0, boolean arg1, class89[] arg2) {
        field1419++;
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class116.field2100[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class116.field2100[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method653(var5, false, var4);
                            }
                        }
                    }
                }
            }
            class70.field1270 += (int) (Math.random() * 5.0D) - 2;
            class218.field4088 += (int) (Math.random() * 5.0D) - 2;
            if (class218.field4088 < -8) {
                class218.field4088 = -8;
            }
            if (class218.field4088 > 8) {
                class218.field4088 = 8;
            }
            if (class70.field1270 < -16) {
                class70.field1270 = -16;
            }
            if (class70.field1270 > 16) {
                class70.field1270 = 16;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class70.field1270 >> 1;
        int var9 = class218.field4088 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var55 = class111.field2022[var12];
            byte var56 = 74;
            short var57 = 768;
            int var58 = (int) Math.sqrt(5100.0D);
            int var59 = var57 * var58 >> 8;
            for (int var60 = 1; var60 < 103; var60++) {
                for (int var108 = 1; var108 < 103; var108++) {
                    int var110 = class62.field1137[var12][var108 + 1][var60] - class62.field1137[var12][var108 - 1][var60];
                    int var111 = class62.field1137[var12][var108][var60 + 1] - class62.field1137[var12][var108][var60 - 1];
                    int var112 = (int) Math.sqrt((double) (var110 * var110 + var111 * var111 + 65536));
                    int var113 = (var110 << 8) / var112;
                    int var114 = -65536 / var112;
                    int var115 = (var111 << 8) / var112;
                    int var116 = (var113 * -50 + var114 * -10 + var115 * -50) / var59 + var56;
                    int var117 = (var55[var108][var60] >> 1) + (var55[var108][var60 + 1] >> 3) + (var55[var108][var60 + -1] >> 2) + (var55[var108 + 1][var60] >> 3) + (var55[var108 + -1][var60] >> 2);
                    var11[var108][var60] = var116 - var117;
                }
            }
            for (int var61 = 0; var61 < 104; var61++) {
                class85.field1541[var61] = 0;
                class221.field4175[var61] = 0;
                class156.field3014[var61] = 0;
                class221.field4176[var61] = 0;
                class151.field2942[var61] = 0;
            }
            for (int var62 = -5; var62 < 104; var62++) {
                for (int var93 = 0; var93 < 104; var93++) {
                    int var102 = var62 + 5;
                    int var10002;
                    if (var102 < 104) {
                        int var103 = class164.field3144[var12][var102][var93] & 0xFF;
                        if (var103 > 0) {
                            class237 var104 = class29.method179(24, var103 - 1);
                            class85.field1541[var93] += var104.field4422;
                            class221.field4175[var93] += var104.field4412;
                            class156.field3014[var93] += var104.field4415;
                            class221.field4176[var93] += var104.field4409;
                            var10002 = class151.field2942[var93]++;
                        }
                    }
                    int var105 = var62 - 5;
                    if (var105 >= 0) {
                        int var106 = class164.field3144[var12][var105][var93] & 0xFF;
                        if (var106 > 0) {
                            class237 var107 = class29.method179(24, var106 - 1);
                            class85.field1541[var93] -= var107.field4422;
                            class221.field4175[var93] -= var107.field4412;
                            class156.field3014[var93] -= var107.field4415;
                            class221.field4176[var93] -= var107.field4409;
                            var10002 = class151.field2942[var93]--;
                        }
                    }
                }
                if (var62 >= 0) {
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    int var97 = 0;
                    int var98 = 0;
                    for (int var99 = -5; var99 < 104; var99++) {
                        int var100 = var99 + 5;
                        int var101 = var99 - 5;
                        if (var100 < 104) {
                            var98 += class151.field2942[var100];
                            var95 += class221.field4175[var100];
                            var97 += class156.field3014[var100];
                            var96 += class221.field4176[var100];
                            var94 += class85.field1541[var100];
                        }
                        if (var101 >= 0) {
                            var96 -= class221.field4176[var101];
                            var95 -= class221.field4175[var101];
                            var98 -= class151.field2942[var101];
                            var94 -= class85.field1541[var101];
                            var97 -= class156.field3014[var101];
                        }
                        if (var99 >= 0 && var98 > 0) {
                            var10[var62][var99] = class158.method1068(-22364, var94 * 256 / var96, var97 / var98, var95 / var98);
                        }
                    }
                }
            }
            for (int var63 = 1; var63 < 103; var63++) {
                for (int var66 = 1; var66 < 103; var66++) {
                    if (!arg1) {
                        if (class245.field4499 && (class116.field2100[0][var63][var66] & 0x2) == 0 && ((class116.field2100[var12][var63][var66] & 0x10) != 0 || class234.method1557(4570, var66, var63, var12) != class157.field3028)) {
                            continue;
                        }
                        if (var12 < class28.field468) {
                            class28.field468 = var12;
                        }
                    }
                    int var67 = class164.field3144[var12][var63][var66] & 0xFF;
                    int var68 = class109.field1964[var12][var63][var66] & 0xFF;
                    if (var67 > 0 || var68 > 0) {
                        int var69 = class62.field1137[var12][var63 + 1][var66];
                        int var70 = class62.field1137[var12][var63][var66];
                        int var71 = class62.field1137[var12][var63 + 1][var66 + 1];
                        int var72 = class62.field1137[var12][var63][var66 + 1];
                        if (var12 > 0) {
                            boolean var73 = true;
                            if (var67 == 0 && class8.field115[var12][var63][var66] != 0) {
                                var73 = false;
                            }
                            if (var68 > 0 && !class101.method706(var68 - 1, true).field113) {
                                var73 = false;
                            }
                            if (var73 && var69 == var70 && var70 == var71 && var70 == var72) {
                                class135.field2513[var12][var63][var66] = class204.method1405(class135.field2513[var12][var63][var66], 2340);
                            }
                        }
                        int var74;
                        int var77;
                        if (var67 > 0) {
                            var74 = var10[var63][var66];
                            int var75 = (var74 & 0x7F) + var8;
                            if (var75 < 0) {
                                var75 = 0;
                            } else if (var75 > 127) {
                                var75 = 127;
                            }
                            int var76 = (var74 + var9 & 0xFC00) + var75 + (var74 & 0x380);
                            var77 = class173.field3351[class13.method67(-13465, 96, var76)];
                        } else {
                            var74 = -1;
                            var77 = 0;
                        }
                        int var78 = var11[var63][var66];
                        int var79 = var11[var63 + 1][var66];
                        int var80 = var11[var63][var66 + 1];
                        int var81 = var11[var63 + 1][var66 + 1];
                        if (var68 == 0) {
                            class12.method58(var12, var63, var66, 0, 0, -1, var70, var69, var71, var72, class13.method67(-13465, var78, var74), class13.method67(-13465, var79, var74), class13.method67(-13465, var81, var74), class13.method67(-13465, var80, var74), 0, 0, 0, 0, var77, 0);
                        } else {
                            int var82 = class8.field115[var12][var63][var66] + 1;
                            byte var83 = class234.field4379[var12][var63][var66];
                            class7 var84 = class101.method706(var68 - 1, true);
                            if (!arg1 && class245.field4498 != null && var12 == 0) {
                                class245.field4498[var63][var66] = (var84.field112 << 24) + var84.field103;
                            }
                            int var85 = var84.field98;
                            if (var85 >= 0 && !class173.field3358.method436(var85, (byte) -69)) {
                                var85 = -1;
                            }
                            int var86;
                            int var87;
                            if (var85 >= 0) {
                                var86 = -1;
                                var87 = class173.field3351[class31.method202(12345678, 96, class173.field3358.method438(121, var85))];
                            } else if (var84.field111 == -1) {
                                var87 = 0;
                                var86 = -2;
                            } else {
                                var86 = var84.field111;
                                int var88 = (var86 & 0x7F) + var8;
                                if (var88 < 0) {
                                    var88 = 0;
                                } else if (var88 > 127) {
                                    var88 = 127;
                                }
                                int var89 = (var9 + var86 & 0xFC00) + (var86 & 0x380) + var88;
                                var87 = class173.field3351[class31.method202(12345678, 96, var89)];
                            }
                            if (var84.field104 >= 0) {
                                int var90 = var84.field104;
                                int var91 = (var90 & 0x7F) + var8;
                                if (var91 < 0) {
                                    var91 = 0;
                                } else if (var91 > 127) {
                                    var91 = 127;
                                }
                                int var92 = (var9 + var90 & 0xFC00) + var91 + (var90 & 0x380);
                                var87 = class173.field3351[class31.method202(12345678, 96, var92)];
                            }
                            class12.method58(var12, var63, var66, var82, var83, var85, var70, var69, var71, var72, class13.method67(-13465, var78, var74), class13.method67(-13465, var79, var74), class13.method67(-13465, var81, var74), class13.method67(-13465, var80, var74), class31.method202(12345678, var78, var86), class31.method202(12345678, var79, var86), class31.method202(12345678, var81, var86), class31.method202(12345678, var80, var86), var77, var87);
                        }
                    }
                }
            }
            if (!arg1) {
                for (int var64 = 1; var64 < 103; var64++) {
                    for (int var65 = 1; var65 < 103; var65++) {
                        class237.method1572(var12, var65, var64, class234.method1557(4570, var64, var65, var12));
                    }
                }
            }
            class164.field3144[var12] = null;
            class109.field1964[var12] = null;
            class8.field115[var12] = null;
            class234.field4379[var12] = null;
            class111.field2022[var12] = null;
        }
        class171.method1217(-50, -10, -50);
        if (arg0) {
            method522(-122, -56, -27);
        }
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var54 = 0; var54 < 104; var54++) {
                if ((class116.field2100[1][var13][var54] & 0x2) == 2) {
                    class157.method1065(var13, var54);
                }
            }
        }
        int var14 = 2;
        int var15 = 1;
        int var16 = 4;
        for (int var17 = 0; var17 < 4; var17++) {
            if (var17 > 0) {
                var14 <<= 0x3;
                var16 <<= 0x3;
                var15 <<= 0x3;
            }
            for (int var18 = 0; var18 <= var17; var18++) {
                for (int var19 = 0; var19 <= 104; var19++) {
                    for (int var20 = 0; var20 <= 104; var20++) {
                        if ((var15 & class135.field2513[var18][var20][var19]) != 0) {
                            int var21 = var19;
                            int var22 = var18;
                            int var23 = var18;
                            int var24 = var19;
                            while (var21 > 0 && (class135.field2513[var18][var20][var21 - 1] & var15) != 0) {
                                var21--;
                            }
                            while (var24 < 104 && (class135.field2513[var18][var20][var24 + 1] & var15) != 0) {
                                var24++;
                            }
                            label378: while (var22 > 0) {
                                for (int var25 = var21; var25 <= var24; var25++) {
                                    if ((class135.field2513[var22 - 1][var20][var25] & var15) == 0) {
                                        break label378;
                                    }
                                }
                                var22--;
                            }
                            label367: while (var23 < var17) {
                                for (int var26 = var21; var26 <= var24; var26++) {
                                    if ((class135.field2513[var23 + 1][var20][var26] & var15) == 0) {
                                        break label367;
                                    }
                                }
                                var23++;
                            }
                            int var27 = (var24 + 1 - var21) * (var23 + 1 + -var22);
                            if (var27 >= 8) {
                                short var28 = 240;
                                int var29 = class62.field1137[var22][var20][var21];
                                int var30 = class62.field1137[var23][var20][var21] - var28;
                                class151.method1038(var17, 1, var20 * 128, var20 * 128, var21 * 128, var24 * 128 + 128, var30, var29);
                                for (int var31 = var22; var31 <= var23; var31++) {
                                    for (int var32 = var21; var32 <= var24; var32++) {
                                        class135.field2513[var31][var20][var32] = class70.method470(class135.field2513[var31][var20][var32], ~var15);
                                    }
                                }
                            }
                        }
                        if ((var14 & class135.field2513[var18][var20][var19]) != 0) {
                            int var33 = var20;
                            int var34;
                            for (var34 = var20; var34 > 0 && (var14 & class135.field2513[var18][var34 - 1][var19]) != 0; var34--) {
                            }
                            int var35 = var18;
                            while (var33 < 104 && (var14 & class135.field2513[var18][var33 + 1][var19]) != 0) {
                                var33++;
                            }
                            label432: while (var35 > 0) {
                                for (int var36 = var34; var36 <= var33; var36++) {
                                    if ((class135.field2513[var35 - 1][var36][var19] & var14) == 0) {
                                        break label432;
                                    }
                                }
                                var35--;
                            }
                            int var37;
                            label420: for (var37 = var18; var37 < var17; var37++) {
                                for (int var38 = var34; var38 <= var33; var38++) {
                                    if ((var14 & class135.field2513[var37 + 1][var38][var19]) == 0) {
                                        break label420;
                                    }
                                }
                            }
                            int var39 = (var33 + 1 - var34) * (var37 + 1 + -var35);
                            if (var39 >= 8) {
                                short var40 = 240;
                                int var41 = class62.field1137[var35][var34][var19];
                                int var42 = class62.field1137[var37][var34][var19] - var40;
                                class151.method1038(var17, 2, var34 * 128, var33 * 128 + 128, var19 * 128, var19 * 128, var42, var41);
                                for (int var43 = var35; var43 <= var37; var43++) {
                                    for (int var44 = var34; var44 <= var33; var44++) {
                                        class135.field2513[var43][var44][var19] = class70.method470(class135.field2513[var43][var44][var19], ~var14);
                                    }
                                }
                            }
                        }
                        if ((var16 & class135.field2513[var18][var20][var19]) != 0) {
                            int var45 = var20;
                            int var46 = var20;
                            int var47;
                            for (var47 = var19; var47 > 0 && (var16 & class135.field2513[var18][var20][var47 - 1]) != 0; var47--) {
                            }
                            int var48;
                            for (var48 = var19; var48 < 104 && (var16 & class135.field2513[var18][var20][var48 + 1]) != 0; var48++) {
                            }
                            label486: while (var46 > 0) {
                                for (int var49 = var47; var49 <= var48; var49++) {
                                    if ((class135.field2513[var18][var46 - 1][var49] & var16) == 0) {
                                        break label486;
                                    }
                                }
                                var46--;
                            }
                            label475: while (var45 < 104) {
                                for (int var50 = var47; var50 <= var48; var50++) {
                                    if ((var16 & class135.field2513[var18][var45 + 1][var50]) == 0) {
                                        break label475;
                                    }
                                }
                                var45++;
                            }
                            if ((var45 + 1 - var46) * (-var47 + 1 + var48) >= 4) {
                                int var51 = class62.field1137[var18][var46][var47];
                                class151.method1038(var17, 4, var46 * 128, var45 * 128 + 128, var47 * 128, var48 * 128 + 128, var51, var51);
                                for (int var52 = var46; var52 <= var45; var52++) {
                                    for (int var53 = var47; var53 <= var48; var53++) {
                                        class135.field2513[var18][var52][var53] = class70.method470(class135.field2513[var18][var52][var53], ~var16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLea;I)Li;")
    public static final class88 method524(boolean arg0, class46 arg1, int arg2) {
        field1413++;
        try {
            if (!arg0) {
                return null;
            }
            class88 var3 = new class88();
            var3.field1660 = arg1.method350(123);
            if (var3.field1660 > arg2) {
                var3.field1660 = arg2;
            }
            var3.field1643 = new byte[var3.field1660];
            arg1.field831 += class112.field2035.method1459(-124, 0, var3.field1643, arg1.field842, var3.field1660, arg1.field831);
            return var3;
        } catch (Exception var4) {
            return class150.field2920;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Li;")
    public static final class88 method525(int arg0, boolean arg1) {
        field1415++;
        if (arg1) {
            return class201.field3838[arg0].method604((byte) -53) <= 0 ? class66.field1191[arg0] : class166.method1142(new class88[] { class66.field1191[arg0], class236.field4400, class201.field3838[arg0] }, -3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I[B)V")
    public class78(int arg0, byte[] arg1) {
        this.field1412 = arg0;
        class46 var3 = new class46(arg1);
        this.field1422 = var3.method347(26119);
        this.field1410 = new boolean[this.field1422];
        this.field1409 = new int[this.field1422];
        this.field1423 = new int[this.field1422][];
        for (int var4 = 0; var4 < this.field1422; var4++) {
            this.field1409[var4] = var3.method347(26119);
        }
        for (int var5 = 0; var5 < this.field1422; var5++) {
            this.field1410[var5] = var3.method347(26119) == 1;
        }
        for (int var6 = 0; var6 < this.field1422; var6++) {
            this.field1423[var6] = new int[var3.method347(26119)];
        }
        for (int var7 = 0; var7 < this.field1422; var7++) {
            for (int var8 = 0; var8 < this.field1423[var7].length; var8++) {
                this.field1423[var7][var8] = var3.method347(26119);
            }
        }
    }
}
