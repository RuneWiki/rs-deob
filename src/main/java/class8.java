import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lea;")
    public static class38 field186 = class9.method46((byte) 125, "Benutzername: ");

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lea;")
    public static class38 field187 = class9.method46((byte) 116, "");

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILdd;Ldd;Ldd;)V")
    public static final void method42(int arg0, class32 arg1, class32 arg2, class32 arg3) {
        field188++;
        class130.field2780 = arg3;
        if (arg0 != 2) {
            field186 = null;
        }
        class98.field2180 = arg2;
        class18.field374 = arg1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([Lfh;Lre;I)V")
    public static final void method43(class54[] arg0, class157 arg1, int arg2) {
        field190++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class3.field104[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class3.field104[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method395(var111, -4, var110);
                        }
                    }
                }
            }
        }
        class38.field816 += (int) (Math.random() * 5.0D) - 2;
        class116.field2544 += (int) (Math.random() * 5.0D) - 2;
        if (class38.field816 < -16) {
            class38.field816 = -16;
        }
        if (class116.field2544 < -8) {
            class116.field2544 = -8;
        }
        if (class116.field2544 > 8) {
            class116.field2544 = 8;
        }
        if (class38.field816 > 16) {
            class38.field816 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class162.field3371[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class154.field3209[var4][var101 + 1][var50] - class154.field3209[var4][var101 - 1][var50];
                    int var103 = class154.field3209[var4][var101][var50 + 1] - class154.field3209[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var47[var101][var50 + 1] >> 3) + (var47[var101][var50 - 1] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101 + -1][var50] >> 2) + (var47[var101][var50] >> 1);
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var106 * -50 + var105 * -10 + var108 * -50) / var49 + 96;
                    class160.field3344[var101][var50] = var109 - var107;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class25.field511[var51] = 0;
                class134.field2819[var51] = 0;
                class92.field2079[var51] = 0;
                class180.field3628[var51] = 0;
                class190.field3761[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class196.field3852[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class7 var97 = class140.method1005(var96 - 1, (byte) -92);
                            class25.field511[var55] += var97.field176;
                            class134.field2819[var55] += var97.field178;
                            class92.field2079[var55] += var97.field166;
                            class180.field3628[var55] += var97.field170;
                            var10002 = class190.field3761[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class196.field3852[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class7 var100 = class140.method1005(var99 - 1, (byte) -92);
                            class25.field511[var55] -= var100.field176;
                            class134.field2819[var55] -= var100.field178;
                            class92.field2079[var55] -= var100.field166;
                            class180.field3628[var55] -= var100.field170;
                            var10002 = class190.field3761[var55]--;
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
                            var58 += class180.field3628[var62];
                            var60 += class190.field3761[var62];
                            var57 += class134.field2819[var62];
                            var56 += class25.field511[var62];
                            var59 += class92.field2079[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class134.field2819[var63];
                            var58 -= class180.field3628[var63];
                            var59 -= class92.field2079[var63];
                            var60 -= class190.field3761[var63];
                            var56 -= class25.field511[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class31.field610 || (class3.field104[0][var52][var61] & 0x2) != 0 || (class3.field104[var4][var52][var61] & 0x10) == 0 && class123.method923(114, var4, var52, var61) == class115.field2537)) {
                            if (class111.field2491 > var4) {
                                class111.field2491 = var4;
                            }
                            int var64 = class196.field3852[var4][var52][var61] & 0xFF;
                            int var65 = class32.field652[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class154.field3209[var4][var52][var61];
                                int var67 = class154.field3209[var4][var52 + 1][var61 + 1];
                                int var68 = class160.field3344[var52][var61];
                                int var69 = class160.field3344[var52 + 1][var61];
                                int var70 = class154.field3209[var4][var52][var61 + 1];
                                int var71 = class160.field3344[var52][var61 + 1];
                                int var72 = -1;
                                int var73 = class154.field3209[var4][var52 + 1][var61];
                                int var74 = -1;
                                int var75 = class160.field3344[var52 + 1][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var58;
                                    int var77 = var57 / var60;
                                    int var78 = var59 / var60;
                                    var72 = class126.method938(-125, var78, var77, var76);
                                    int var79 = class38.field816 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class116.field2544 + var76 & 0xFF;
                                    var74 = class126.method938(-122, var79, var77, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class124.field2670[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class63.method449(true, var65 - 1).field1409) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var73 && var66 == var67 && var66 == var70) {
                                        class10.field232[var4][var52][var61] = class94.method794(class10.field232[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class93.field2111[class43.method313((byte) 79, var74, 96)];
                                }
                                if (var65 == 0) {
                                    arg1.method1110(var4, var52, var61, 0, 0, -1, var66, var73, var67, var70, class43.method313((byte) 89, var72, var68), class43.method313((byte) 94, var72, var69), class43.method313((byte) 88, var72, var75), class43.method313((byte) 108, var72, var71), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class124.field2670[var4][var52][var61] + 1;
                                    byte var84 = class67.field1695[var4][var52][var61];
                                    class55 var85 = class63.method449(true, var65 - 1);
                                    int var86 = var85.field1396;
                                    if (var86 >= 0 && !class93.field2107.method1248(var86, -79)) {
                                        var86 = -1;
                                    }
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class93.field2107.method1247((byte) -29, var86);
                                    } else if (var85.field1400 == 16711935) {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class126.method938(-126, var85.field1403, var85.field1402, var85.field1411);
                                        int var89 = class116.field2544 + var85.field1411 & 0xFF;
                                        int var90 = var85.field1403 + class38.field816;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class126.method938(-125, var90, var85.field1402, var89);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class93.field2111[class59.method425(96, var88, 12108)];
                                    }
                                    if (var85.field1407 != -1) {
                                        int var92 = class38.field816 + var85.field1401;
                                        int var93 = class116.field2544 + var85.field1405 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class126.method938(-122, var92, var85.field1410, var93);
                                        var91 = class93.field2111[class59.method425(96, var94, 12108)];
                                    }
                                    arg1.method1110(var4, var52, var61, var83, var84, var86, var66, var73, var67, var70, class43.method313((byte) 98, var72, var68), class43.method313((byte) 89, var72, var69), class43.method313((byte) 100, var72, var75), class43.method313((byte) 74, var72, var71), class59.method425(var68, var87, 12108), class59.method425(var69, var87, 12108), class59.method425(var75, var87, 12108), class59.method425(var71, var87, 12108), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method1116(var4, var54, var53, class123.method923(104, var4, var54, var53));
                }
            }
            class196.field3852[var4] = null;
            class32.field652[var4] = null;
            class124.field2670[var4] = null;
            class67.field1695[var4] = null;
            class162.field3371[var4] = null;
        }
        arg1.method1092(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class3.field104[1][var5][var46] & 0x2) == 2) {
                    arg1.method1108(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        if (arg2 >= -94) {
            field187 = null;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class10.field232[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class10.field232[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (var6 & class10.field232[var10][var12][var14 + 1]) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16;
                            label362: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class10.field232[var16 - 1][var12][var17] & var6) == 0) {
                                        break label362;
                                    }
                                }
                            }
                            label351: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class10.field232[var15 + 1][var12][var18] & var6) == 0) {
                                        break label351;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var14 + 1 - var13) * (var15 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class154.field3209[var15][var12][var13] - var20;
                                int var22 = class154.field3209[var16][var12][var13];
                                class157.method1130(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class10.field232[var23][var12][var24] = class52.method380(class10.field232[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class10.field232[var10][var12][var11] & var7) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 > 0 && (var7 & class10.field232[var10][var26 - 1][var11]) != 0; var26--) {
                            }
                            while (var25 < 104 && (class10.field232[var10][var25 + 1][var11] & var7) != 0) {
                                var25++;
                            }
                            int var27 = var10;
                            int var28 = var10;
                            label417: while (var27 > 0) {
                                for (int var29 = var26; var29 <= var25; var29++) {
                                    if ((class10.field232[var27 - 1][var29][var11] & var7) == 0) {
                                        break label417;
                                    }
                                }
                                var27--;
                            }
                            label406: while (var9 > var28) {
                                for (int var30 = var26; var30 <= var25; var30++) {
                                    if ((var7 & class10.field232[var28 + 1][var30][var11]) == 0) {
                                        break label406;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var25 + 1 - var26);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class154.field3209[var27][var26][var11];
                                int var34 = class154.field3209[var28][var26][var11] - var32;
                                class157.method1130(var9, 2, var26 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var26; var36 <= var25; var36++) {
                                        class10.field232[var35][var36][var11] = class52.method380(class10.field232[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class10.field232[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var12;
                            while (var38 > 0 && (class10.field232[var10][var12][var38 - 1] & var8) != 0) {
                                var38--;
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class10.field232[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label471: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((var8 & class10.field232[var10][var37 - 1][var41]) == 0) {
                                        break label471;
                                    }
                                }
                                var37--;
                            }
                            label460: while (var39 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((class10.field232[var10][var39 + 1][var42] & var8) == 0) {
                                        break label460;
                                    }
                                }
                                var39++;
                            }
                            if ((var40 + 1 - var38) * (-var37 + var39 + 1) >= 4) {
                                int var43 = class154.field3209[var10][var37][var38];
                                class157.method1130(var9, 4, var37 * 128, var39 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var39; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class10.field232[var10][var44][var45] = class52.method380(class10.field232[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method44(byte arg0) {
        field187 = null;
        field186 = null;
        int var1 = -128 / ((40 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
    public static final void method45(byte arg0, long arg1) {
        if (arg0 != 117) {
            field189 = 73;
        }
        field185++;
        if (arg1 != 0L) {
            class111.field2483.method169(-1494101117, 163);
            class111.field2483.method480(arg1, (byte) 40);
            class99.field2212++;
        }
    }
}
