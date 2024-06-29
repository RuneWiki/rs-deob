import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class219 extends class275 {

    @OriginalMember(owner = "client!li", name = "lb", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!li", name = "qb", descriptor = "Luf;")
    private static class168 field3563 = class148.method1019(-1720, "flash1:");

    @OriginalMember(owner = "client!li", name = "pb", descriptor = "Luf;")
    public static class168 field3562 = field3563;

    @OriginalMember(owner = "client!li", name = "tb", descriptor = "Luf;")
    public static class168 field3566 = class148.method1019(-1720, "huffman");

    @OriginalMember(owner = "client!li", name = "sb", descriptor = "Luf;")
    public static class168 field3565 = field3563;

    @OriginalMember(owner = "client!li", name = "ob", descriptor = "F")
    public static float field3561;

    @OriginalMember(owner = "client!li", name = "kb", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!li", name = "mb", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!li", name = "nb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!li", name = "rb", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!li", name = "ub", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILdk;)V", line = 6)
    public static final void method1514(int arg0, class241 arg1) {
        int var2 = -94 / ((arg0 - 28) / 49);
        field3567++;
        class271.field4564 = arg1.method1646(-27248, class180.field2903);
        class165.field2655 = arg1.method1646(-27248, class87.field1344);
        class183.field2941 = arg1.method1646(-27248, class15.field161);
        class261.field4436 = arg1.method1646(-27248, class73.field978);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([Lcg;IIIIIII[BIZ)V", line = 26)
    public static final void method1515(class253[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, boolean arg10) {
        class153 var11 = new class153(arg8);
        field3564++;
        if (arg4 != 7) {
            method1516((byte) 56);
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method1079((byte) -50);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1074((byte) -128);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var11.method1042((byte) 127);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg7 == var17 && var16 >= arg1 && arg1 + 8 > var16 && arg5 <= var18 && var18 < (arg5 + 8)) {
                    class161 var22 = class15.method64(var12, false);
                    int var23 = arg3 + class1.method2(var22.field2558, var18 & 0x7, var22.field2559, arg6, var20, -54, var16 & 0x7);
                    int var24 = class28.method146(24179, var22.field2559, var18 & 0x7, arg6, var20, var16 & 0x7, var22.field2558) + arg2;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class253 var25 = null;
                        if (!arg10) {
                            int var26 = arg9;
                            if ((class159.field2520[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class77.method460(var21, 0, arg9, arg9, var24, var12, var25, arg6 + var20 & 0x3, arg10, var23, !arg10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V", line = 125)
    public static void method1516(byte arg0) {
        field3566 = null;
        int var1 = 46 % ((arg0 + 1) / 36);
        field3565 = null;
        field3563 = null;
        field3562 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V", line = 138)
    public static final void method1517(int arg0, boolean arg1) {
        class215.field3510.method1428(arg0, 29946);
        if (arg1) {
            field3559++;
            class274.field4615.method1428(arg0, 29946);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[[I", line = 151)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            field3558 = -89;
        }
        field3560++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756 && this.method1899(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % this.field4633 * this.field4633;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class187.field2961; var8++) {
                int var9 = this.field4628[var8 % this.field4623 + var6];
                var7[var8] = class159.method1119(255, var9) << 4;
                var4[var8] = class159.method1119(var9, 65280) >> 4;
                var5[var8] = class159.method1119(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z[Lcg;Z)V", line = 215)
    public static final void method1518(boolean arg0, class253[] arg1, boolean arg2) {
        field3557++;
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class159.field2520[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class159.field2520[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method1737(var5, var6, 16909312);
                            }
                        }
                    }
                }
            }
            class138.field2134 += (int) (Math.random() * 5.0D) - 2;
            class71.field957 += (int) (Math.random() * 5.0D) - 2;
            if (class138.field2134 < -16) {
                class138.field2134 = -16;
            }
            if (class71.field957 < -8) {
                class71.field957 = -8;
            }
            if (class138.field2134 > 16) {
                class138.field2134 = 16;
            }
            if (class71.field957 > 8) {
                class71.field957 = 8;
            }
        }
        int var8 = class138.field2134 >> 1;
        int var9 = class71.field957 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (!arg0) {
            field3562 = (class168) null;
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class168.field2749[var12];
            if (class44.field539) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        int var16 = (var13[var15 - 1][var14] >> 2) + (var13[var15][var14] >> 1) + (var13[var15][var14 - -1] >> 3) + (var13[var15][var14 + -1] >> 2) + (var13[var15 + 1][var14] >> 3);
                        byte var17 = 74;
                        var11[var15][var14] = var17 - var16;
                    }
                }
            } else {
                int var18 = (int) class34.field402[1];
                int var19 = (int) class34.field402[0];
                int var20 = (int) class34.field402[2];
                int var21 = (int) Math.sqrt((double) (var20 * var20 + var18 * var18 + var19 * var19));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        byte var25 = 96;
                        int var26 = class227.field3686[var12][var24 + 1][var23] - class227.field3686[var12][var24 - 1][var23];
                        int var27 = class227.field3686[var12][var24][var23 + 1] - class227.field3686[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var27 * var27 + var26 * var26 + 65536));
                        int var29 = (var26 << 8) / var28;
                        int var30 = (var13[var24][var23 + 1] >> 3) + (var13[var24][var23] >> 1) + (var13[var24][var23 + -1] >> 2) + (var13[var24 + 1][var23] >> 3) + (var13[var24 + -1][var23] >> 2);
                        int var31 = -65536 / var28;
                        int var32 = (var27 << 8) / var28;
                        int var33 = (var20 * var32 + (var19 * var29 + (var18 * var31))) / var22 + var25;
                        var11[var24][var23] = var33 - ((int) ((float) var30 * 1.7F));
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class298.field5050[var34] = 0;
                class171.field2793[var34] = 0;
                class118.field1843[var34] = 0;
                class128.field2004[var34] = 0;
                class287.field4846[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = class272.field4579[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class149 var39 = class282.method1943(-124, var38 - 1);
                            class298.field5050[var36] += var39.field2308;
                            class171.field2793[var36] += var39.field2312;
                            class118.field1843[var36] += var39.field2306;
                            class128.field2004[var36] += var39.field2305;
                            var10002 = class287.field4846[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = class272.field4579[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class149 var42 = class282.method1943(39, var41 - 1);
                            class298.field5050[var36] -= var42.field2308;
                            class171.field2793[var36] -= var42.field2312;
                            class118.field1843[var36] -= var42.field2306;
                            class128.field2004[var36] -= var42.field2305;
                            var10002 = class287.field4846[var36]--;
                        }
                    }
                }
                if (var35 >= 0) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < 104; var48++) {
                        int var49 = var48 + 5;
                        if (var49 < 104) {
                            var45 += class118.field1843[var49];
                            var46 += class287.field4846[var49];
                            var43 += class298.field5050[var49];
                            var44 += class171.field2793[var49];
                            var47 += class128.field2004[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var44 -= class171.field2793[var50];
                            var46 -= class287.field4846[var50];
                            var45 -= class118.field1843[var50];
                            var43 -= class298.field5050[var50];
                            var47 -= class128.field2004[var50];
                        }
                        if (var48 >= 0 && var46 > 0) {
                            var10[var35][var48] = class179.method1284(var44 / var46, var43 * 256 / var47, var45 / var46, -118);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label741: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg2 || class155.method1102(124) || (class159.field2520[0][var51][var52] & 0x2) != 0 || (class159.field2520[var12][var51][var52] & 0x10) == 0 && class198.method1392(var12, false, var51, var52) == class199.field3288) {
                        if (class20.field250 > var12) {
                            class20.field250 = var12;
                        }
                        int var53 = class272.field4579[var12][var51][var52] & 0xFF;
                        int var54 = class105.field1614[var12][var51][var52] & 0xFF;
                        if (var53 > 0 || var54 > 0) {
                            int var55 = class227.field3686[var12][var51][var52];
                            int var56 = class227.field3686[var12][var51 + 1][var52];
                            int var57 = class227.field3686[var12][var51 + 1][var52 + 1];
                            int var58 = class227.field3686[var12][var51][var52 + 1];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var53 == 0 && class153.field2389[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var54 > 0 && !class76.method449(1446, var54 - 1).field3330) {
                                    var59 = false;
                                }
                                if (var59 && var55 == var56 && var55 == var57 && var55 == var58) {
                                    class58.field767[var12][var51][var52] = class80.method492(class58.field767[var12][var51][var52], 4);
                                }
                            }
                            int var60;
                            int var61;
                            if (var53 <= 0) {
                                var60 = -1;
                                var61 = 0;
                            } else {
                                var60 = var10[var51][var52];
                                int var62 = (var60 & 0x7F) + var8;
                                if (var62 < 0) {
                                    var62 = 0;
                                } else if (var62 > 127) {
                                    var62 = 127;
                                }
                                int var63 = (var60 + var9 & 0xFC00) + (var60 & 0x380) + var62;
                                var61 = class173.field2822[class180.method1292(var63, 96, true)];
                            }
                            int var64 = var11[var51][var52];
                            int var65 = var11[var51 + 1][var52];
                            int var66 = var11[var51 + 1][var52 + 1];
                            int var67 = var11[var51][var52 + 1];
                            if (var54 == 0) {
                                class171.method1235(var12, var51, var52, 0, 0, -1, var55, var56, var57, var58, class180.method1292(var60, var64, arg0), class180.method1292(var60, var65, arg0), class180.method1292(var60, var66, arg0), class180.method1292(var60, var67, arg0), 0, 0, 0, 0, var61, 0);
                                if (var12 > 0 && var60 != -1 && class282.method1943(120, var53 - 1).field2303) {
                                    class100.method752(0, 0, true, false, var51, var52, var55 - class227.field3686[0][var51][var52], -class227.field3686[0][var51 - -1][var52] + var56, var57 - class227.field3686[0][var51 + 1][var52 + 1], -class227.field3686[0][var51][var52 + 1] + var58);
                                }
                                if (!arg2 && class271.field4565 != null && var12 == 0) {
                                    for (int var68 = var51 - 1; var68 <= (var51 + 1); var68++) {
                                        for (int var69 = var52 - 1; var69 <= var52 + 1; var69++) {
                                            if ((var51 != var68 || var52 != var69) && var68 >= 0 && var68 < 104 && var69 >= 0 && var69 < 104) {
                                                int var70 = class105.field1614[var12][var68][var69] & 0xFF;
                                                if (var70 != 0) {
                                                    class203 var71 = class76.method449(1446, var70 - 1);
                                                    if (var71.field3327 != -1 && class173.field2815.method513(var71.field3327, 0) == 4) {
                                                        class271.field4565[var51][var52] = (var71.field3340 << 24) + var71.field3337;
                                                        continue label741;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var72 = class153.field2389[var12][var51][var52] + 1;
                                byte var73 = class291.field4912[var12][var51][var52];
                                class203 var74 = class76.method449(1446, var54 - 1);
                                if (!arg2 && class271.field4565 != null && var12 == 0) {
                                    if (var74.field3327 != -1 && class173.field2815.method513(var74.field3327, 0) == 4) {
                                        class271.field4565[var51][var52] = (var74.field3340 << 24) + var74.field3337;
                                    } else {
                                        label723: for (int var75 = var51 - 1; var75 <= var51 + 1; var75++) {
                                            for (int var76 = var52 - 1; var76 <= var52 + 1; var76++) {
                                                if ((var51 != var75 || var52 != var76) && var75 >= 0 && var75 < 104 && var76 >= 0 && var76 < 104) {
                                                    int var77 = class105.field1614[var12][var75][var76] & 0xFF;
                                                    if (var77 != 0) {
                                                        class203 var78 = class76.method449(1446, var77 - 1);
                                                        if (var78.field3327 != -1 && class173.field2815.method513(var78.field3327, 0) == 4) {
                                                            class271.field4565[var51][var52] = (var78.field3340 << 24) + var78.field3337;
                                                            break label723;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var79 = var74.field3327;
                                if (var79 >= 0 && !class173.field2815.method512(var79, 50)) {
                                    var79 = -1;
                                }
                                int var80;
                                int var83;
                                if (var79 >= 0) {
                                    var80 = -1;
                                    var83 = class173.field2822[class149.method1025(class173.field2815.method506(var79, -19800), 96, (byte) -24)];
                                } else if (var74.field3341 == -1) {
                                    var83 = 0;
                                    var80 = -2;
                                } else {
                                    var80 = var74.field3341;
                                    int var81 = (var80 & 0x7F) + var8;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var80 + var9 & 0xFC00) + (var80 & 0x380) + var81;
                                    var83 = class173.field2822[class149.method1025(var82, 96, (byte) -24)];
                                }
                                if (var74.field3331 >= 0) {
                                    int var84 = var74.field3331;
                                    int var85 = (var84 & 0x7F) + var8;
                                    if (var85 < 0) {
                                        var85 = 0;
                                    } else if (var85 > 127) {
                                        var85 = 127;
                                    }
                                    int var86 = (var84 + var9 & 0xFC00) + (var84 & 0x380) + var85;
                                    var83 = class173.field2822[class149.method1025(var86, 96, (byte) -24)];
                                }
                                class171.method1235(var12, var51, var52, var72, var73, var79, var55, var56, var57, var58, class180.method1292(var60, var64, true), class180.method1292(var60, var65, true), class180.method1292(var60, var66, arg0), class180.method1292(var60, var67, true), class149.method1025(var80, var64, (byte) -24), class149.method1025(var80, var65, (byte) -24), class149.method1025(var80, var66, (byte) -24), class149.method1025(var80, var67, (byte) -24), var61, var83);
                                if (var12 > 0) {
                                    class100.method752(var72, var73, var80 == -2 || !var74.field3326, var60 == -1 || !class282.method1943(-121, var53 - 1).field2303, var51, var52, var55 - class227.field3686[0][var51][var52], -class227.field3686[0][var51 + 1][var52] + var56, var57 - class227.field3686[0][var51 + 1][var52 + 1], -class227.field3686[0][var51][var52 + 1] + var58);
                                }
                            }
                        }
                    }
                }
            }
            float[][] var87 = new float[105][105];
            float[][] var88 = new float[105][105];
            float[][] var89 = new float[105][105];
            int[][] var90 = class227.field3686[var12];
            for (int var91 = 1; var91 <= 103; var91++) {
                for (int var92 = 1; var92 <= 103; var92++) {
                    int var93 = var90[var92 + 1][var91] - var90[var92 - 1][var91];
                    int var94 = var90[var92][var91 + 1] - var90[var92][var91 - 1];
                    float var95 = (float) Math.sqrt((double) (var94 * var94 + (var93 * var93 + 65536)));
                    var89[var92][var91] = (float) var93 / var95;
                    var87[var92][var91] = -256.0F / var95;
                    var88[var92][var91] = (float) var94 / var95;
                }
            }
            if (arg2) {
                class192[] var101 = class259.method1779(class172.field2804[0], true, class227.field3686[var12], class153.field2389[var12], class105.field1614[var12], class271.field4565, var88, class159.field2520, var11, var10, class272.field4579[var12], var12, var89, var87, class291.field4912[var12]);
                class273.method1888(var12, var101);
            } else {
                class192[] var96 = class259.method1779((int[][]) null, true, class227.field3686[var12], class153.field2389[var12], class105.field1614[var12], (int[][]) null, var88, class159.field2520, var11, var10, class272.field4579[var12], var12, var89, var87, class291.field4912[var12]);
                class192[] var97 = class275.method1901(class272.field4579[var12], -109, class153.field2389[var12], var87, var11, class291.field4912[var12], var89, var88, class227.field3686[var12], class105.field1614[var12], var12, class159.field2520);
                class192[] var98 = new class192[var96.length + var97.length];
                for (int var99 = 0; var99 < var96.length; var99++) {
                    var98[var99] = var96[var99];
                }
                for (int var100 = 0; var100 < var97.length; var100++) {
                    var98[var96.length + var100] = var97[var100];
                }
                class273.method1888(var12, var98);
                class119.method857(class105.field1614[var12], !arg0, var12, var87, var89, class257.field4371, class291.field4912[var12], class227.field3686[var12], class153.field2389[var12], var88, class272.field4579[var12], class257.field4370);
            }
            class272.field4579[var12] = (byte[][]) null;
            class105.field1614[var12] = (byte[][]) null;
            class153.field2389[var12] = (byte[][]) null;
            class291.field4912[var12] = (byte[][]) null;
            class168.field2749[var12] = (byte[][]) null;
        }
        class284.method1961(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                if ((class159.field2520[1][var102][var103] & 0x2) == 2) {
                    class275.method1902(var102, var103);
                }
            }
        }
        for (int var104 = 0; var104 < 4; var104++) {
            for (int var105 = 0; var105 <= 104; var105++) {
                for (int var106 = 0; var106 <= 104; var106++) {
                    if ((class58.field767[var104][var106][var105] & 0x1) != 0) {
                        int var107;
                        for (var107 = var105; var107 > 0 && (class58.field767[var104][var106][var107 - 1] & 0x1) != 0; var107--) {
                        }
                        int var108 = var104;
                        int var109;
                        for (var109 = var105; var109 < 104 && (class58.field767[var104][var106][var109 + 1] & 0x1) != 0; var109++) {
                        }
                        int var110 = var104;
                        label439: while (var108 > 0) {
                            for (int var111 = var107; var111 <= var109; var111++) {
                                if ((class58.field767[var108 - 1][var106][var111] & 0x1) == 0) {
                                    break label439;
                                }
                            }
                            var108--;
                        }
                        label428: while (var110 < 3) {
                            for (int var112 = var107; var112 <= var109; var112++) {
                                if ((class58.field767[var110 + 1][var106][var112] & 0x1) == 0) {
                                    break label428;
                                }
                            }
                            var110++;
                        }
                        int var113 = (var109 + 1 - var107) * (var110 + 1 - var108);
                        if (var113 >= 8) {
                            short var114 = 240;
                            int var115 = class227.field3686[var110][var106][var107] - var114;
                            int var116 = class227.field3686[var108][var106][var107];
                            class167.method1163(1, var106 * 128, var106 * 128, var107 * 128, var109 * 128 + 128, var115, var116);
                            for (int var117 = var108; var117 <= var110; var117++) {
                                for (int var118 = var107; var118 <= var109; var118++) {
                                    class58.field767[var117][var106][var118] = class159.method1119(class58.field767[var117][var106][var118], -2);
                                }
                            }
                        }
                    }
                    if ((class58.field767[var104][var106][var105] & 0x2) != 0) {
                        int var119;
                        for (var119 = var106; var119 < 104 && (class58.field767[var104][var119 + 1][var105] & 0x2) != 0; var119++) {
                        }
                        int var120 = var104;
                        int var121;
                        for (var121 = var106; var121 > 0 && (class58.field767[var104][var121 - 1][var105] & 0x2) != 0; var121--) {
                        }
                        int var122 = var104;
                        label494: while (var120 > 0) {
                            for (int var123 = var121; var123 <= var119; var123++) {
                                if ((class58.field767[var120 - 1][var123][var105] & 0x2) == 0) {
                                    break label494;
                                }
                            }
                            var120--;
                        }
                        label483: while (var122 < 3) {
                            for (int var124 = var121; var124 <= var119; var124++) {
                                if ((class58.field767[var122 + 1][var124][var105] & 0x2) == 0) {
                                    break label483;
                                }
                            }
                            var122++;
                        }
                        int var125 = (var119 + 1 - var121) * (var122 + 1 - var120);
                        if (var125 >= 8) {
                            short var126 = 240;
                            int var127 = class227.field3686[var122][var121][var105] - var126;
                            int var128 = class227.field3686[var120][var121][var105];
                            class167.method1163(2, var121 * 128, var119 * 128 + 128, var105 * 128, var105 * 128, var127, var128);
                            for (int var129 = var120; var129 <= var122; var129++) {
                                for (int var130 = var121; var130 <= var119; var130++) {
                                    class58.field767[var129][var130][var105] = class159.method1119(class58.field767[var129][var130][var105], -3);
                                }
                            }
                        }
                    }
                    if ((class58.field767[var104][var106][var105] & 0x4) != 0) {
                        int var131 = var106;
                        int var132 = var105;
                        int var133 = var106;
                        while (var132 > 0 && (class58.field767[var104][var106][var132 - 1] & 0x4) != 0) {
                            var132--;
                        }
                        int var134;
                        for (var134 = var105; var134 < 104 && (class58.field767[var104][var106][var134 + 1] & 0x4) != 0; var134++) {
                        }
                        label549: while (var131 > 0) {
                            for (int var135 = var132; var135 <= var134; var135++) {
                                if ((class58.field767[var104][var131 - 1][var135] & 0x4) == 0) {
                                    break label549;
                                }
                            }
                            var131--;
                        }
                        label538: while (var133 < 104) {
                            for (int var136 = var132; var136 <= var134; var136++) {
                                if ((class58.field767[var104][var133 + 1][var136] & 0x4) == 0) {
                                    break label538;
                                }
                            }
                            var133++;
                        }
                        if ((var133 - (var131 - 1)) * (var134 + 1 - var132) >= 4) {
                            int var137 = class227.field3686[var104][var131][var132];
                            class167.method1163(4, var131 * 128, var133 * 128 + 128, var132 * 128, var134 * 128 + 128, var137, var137);
                            for (int var138 = var131; var138 <= var133; var138++) {
                                for (int var139 = var132; var139 <= var134; var139++) {
                                    class58.field767[var104][var138][var139] = class159.method1119(class58.field767[var104][var138][var139], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
