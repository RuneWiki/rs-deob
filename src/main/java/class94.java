import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 extends class60 {

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "Z")
    public boolean field2415 = false;

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
    private int field2406 = 0;

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "I")
    private int field2418 = 0;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!pd", name = "Lb", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Loe;")
    private class89 field2399;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "Lv;")
    private static class122 field2412 = class55.method425(-114, "From");

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lv;")
    public static class122 field2407 = field2412;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "Z")
    public static boolean field2422 = false;

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "Lv;")
    public static class122 field2417 = class55.method425(-91, "sideicons");

    @OriginalMember(owner = "client!pd", name = "Hb", descriptor = "Lv;")
    public static class122 field2426 = class55.method425(-87, "Entfernen");

    @OriginalMember(owner = "client!pd", name = "Ib", descriptor = "Lv;")
    public static class122 field2427 = class55.method425(-67, "::errortest");

    @OriginalMember(owner = "client!pd", name = "Eb", descriptor = "[Lnb;")
    public static class80[] field2423 = new class80[16384];

    @OriginalMember(owner = "client!pd", name = "Jb", descriptor = "J")
    public static long field2428 = 0L;

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Lv;")
    public static class122 field2421 = class55.method425(-84, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
    public static int field2429 = 0;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "Z")
    public static boolean field2409 = true;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pd", name = "Gb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Lvb;")
    public static class124 field2420;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "[I")
    public static int[] field2410;

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "[Lab;")
    public static class3[] field2416;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 6)
    public final void method746(int arg0, int arg1) {
        field2408++;
        if (arg1 <= 62) {
            this.method746(-20, -78);
        }
        if (this.field2415) {
            return;
        }
        this.field2418 += arg0;
        while (this.field2399.field2287[this.field2406] < this.field2418) {
            this.field2418 -= this.field2399.field2287[this.field2406];
            this.field2406++;
            if (this.field2406 >= this.field2399.field2299.length) {
                this.field2415 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V", line = 44)
    public static final void method747(int arg0, int arg1) {
        if (arg1 != -1) {
            field2409 = true;
        }
        field2425++;
        class80.field2095 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z[Lcc;La;)V", line = 66)
    public static final void method748(boolean arg0, class16[] arg1, class1 arg2) {
        field2404++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class54.field1408[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class54.field1408[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method162(var110, -110, var111);
                        }
                    }
                }
            }
        }
        class36.field950 += (int) (Math.random() * 5.0D) - 2;
        class67.field1735 += (int) (Math.random() * 5.0D) - 2;
        if (class67.field1735 < -16) {
            class67.field1735 = -16;
        }
        if (class36.field950 < -8) {
            class36.field950 = -8;
        }
        if (class36.field950 > 8) {
            class36.field950 = 8;
        }
        if (class67.field1735 > 16) {
            class67.field1735 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class25.field678[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class93.field2372[var4][var101 + 1][var50] - class93.field2372[var4][var101 - 1][var50];
                    int var103 = class93.field2372[var4][var101][var50 + 1] - class93.field2372[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1) + (var47[var101 - -1][var50] >> 3) + (var47[var101 + -1][var50] >> 2) + (var47[var101][var50 + -1] >> 2);
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var108 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    class50.field1257[var101][var50] = var109 - var106;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class112.field2739[var51] = 0;
                class131.field3184[var51] = 0;
                class100.field2484[var51] = 0;
                class25.field687[var51] = 0;
                class70.field1831[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class21.field582[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class41 var97 = class14.method127(var96 - 1, (byte) -122);
                            class112.field2739[var55] += var97.field1040;
                            class131.field3184[var55] += var97.field1025;
                            class100.field2484[var55] += var97.field1052;
                            class25.field687[var55] += var97.field1033;
                            var10002 = class70.field1831[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class21.field582[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class41 var100 = class14.method127(var99 - 1, (byte) -122);
                            class112.field2739[var55] -= var100.field1040;
                            class131.field3184[var55] -= var100.field1025;
                            class100.field2484[var55] -= var100.field1052;
                            class25.field687[var55] -= var100.field1033;
                            var10002 = class70.field1831[var55]--;
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
                            var60 += class70.field1831[var62];
                            var58 += class100.field2484[var62];
                            var56 += class112.field2739[var62];
                            var57 += class25.field687[var62];
                            var59 += class131.field3184[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var56 -= class112.field2739[var63];
                            var60 -= class70.field1831[var63];
                            var59 -= class131.field3184[var63];
                            var57 -= class25.field687[var63];
                            var58 -= class100.field2484[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class109.field2703 || (class54.field1408[0][var52][var61] & 0x2) != 0 || (class54.field1408[var4][var52][var61] & 0x10) == 0 && class38.method331(var61, var52, !arg0, var4) == class61.field1560)) {
                            if (class92.field2344 > var4) {
                                class92.field2344 = var4;
                            }
                            int var64 = class21.field582[var4][var52][var61] & 0xFF;
                            int var65 = class14.field362[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class93.field2372[var4][var52 + 1][var61];
                                int var67 = class93.field2372[var4][var52][var61];
                                int var68 = class93.field2372[var4][var52 + 1][var61 + 1];
                                int var69 = class93.field2372[var4][var52][var61 + 1];
                                int var70 = class50.field1257[var52][var61];
                                int var71 = class50.field1257[var52 + 1][var61];
                                int var72 = class50.field1257[var52][var61 + 1];
                                int var73 = class50.field1257[var52 + 1][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var57;
                                    int var77 = var58 / var60;
                                    int var78 = var59 / var60;
                                    var74 = class102.method779(var76, var77, var78, 2);
                                    int var79 = class67.field1735 + var77;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class36.field950 + var76 & 0xFF;
                                    var75 = class102.method779(var80, var79, var78, 2);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class34.field864[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class21.method217(var65 - 1, -93).field2384) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var67 == var68 && var67 == var69) {
                                        class84.field2193[var4][var52][var61] = class74.method623(class84.field2193[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class77.field2058[class42.method357((byte) -77, var75, 96)];
                                }
                                if (var65 == 0) {
                                    arg2.method15(var4, var52, var61, 0, 0, -1, var67, var66, var68, var69, class42.method357((byte) -77, var74, var70), class42.method357((byte) -77, var74, var71), class42.method357((byte) -77, var74, var73), class42.method357((byte) -77, var74, var72), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class120.field2906[var4][var52][var61];
                                    int var84 = class34.field864[var4][var52][var61] + 1;
                                    class93 var85 = class21.method217(var65 - 1, -99);
                                    int var86 = var85.field2381;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class77.field2067.method246(var86, 77);
                                    } else if (var85.field2366 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var87 = class102.method779(var85.field2394, var85.field2391, var85.field2374, 2);
                                        int var89 = var85.field2391 + class67.field1735;
                                        int var90 = class36.field950 + var85.field2394 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var88 = class102.method779(var90, var89, var85.field2374, 2);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class77.field2058[class49.method393(96, var88, 32)];
                                    }
                                    if (var85.field2392 != -1) {
                                        int var92 = class67.field1735 + var85.field2367;
                                        int var93 = var85.field2389 + class36.field950 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class102.method779(var93, var92, var85.field2393, 2);
                                        var91 = class77.field2058[class49.method393(96, var94, 32)];
                                    }
                                    arg2.method15(var4, var52, var61, var84, var83, var86, var67, var66, var68, var69, class42.method357((byte) -77, var74, var70), class42.method357((byte) -77, var74, var71), class42.method357((byte) -77, var74, var73), class42.method357((byte) -77, var74, var72), class49.method393(var70, var87, 32), class49.method393(var71, var87, 32), class49.method393(var73, var87, 32), class49.method393(var72, var87, 32), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method2(var4, var54, var53, class38.method331(var53, var54, true, var4));
                }
            }
            class21.field582[var4] = null;
            class14.field362[var4] = null;
            class34.field864[var4] = null;
            class120.field2906[var4] = null;
            class25.field678[var4] = null;
        }
        arg2.method13(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class54.field1408[1][var5][var46] & 0x2) == 2) {
                    arg2.method17(var5, var46);
                }
            }
        }
        if (arg0) {
            method747(-39, 26);
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
                        if ((class84.field2193[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            int var15 = var10;
                            while (var13 < 104 && (class84.field2193[var10][var12][var13 + 1] & var6) != 0) {
                                var13++;
                            }
                            int var16 = var10;
                            while (var14 > 0 && (class84.field2193[var10][var12][var14 - 1] & var6) != 0) {
                                var14--;
                            }
                            label360: while (var15 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((var6 & class84.field2193[var15 - 1][var12][var17]) == 0) {
                                        break label360;
                                    }
                                }
                                var15--;
                            }
                            label349: while (var16 < var9) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((var6 & class84.field2193[var16 + 1][var12][var18]) == 0) {
                                        break label349;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var14) * (var16 + 1 - var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class93.field2372[var16][var12][var14] - var20;
                                int var22 = class93.field2372[var15][var12][var14];
                                class1.method50(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class84.field2193[var23][var12][var24] = class30.method286(class84.field2193[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class84.field2193[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 < 104 && (class84.field2193[var10][var26 + 1][var11] & var7) != 0; var26++) {
                            }
                            int var27 = var10;
                            while (var25 > 0 && (class84.field2193[var10][var25 - 1][var11] & var7) != 0) {
                                var25--;
                            }
                            label415: while (var27 > 0) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((class84.field2193[var27 - 1][var28][var11] & var7) == 0) {
                                        break label415;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label403: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class84.field2193[var29 + 1][var30][var11]) == 0) {
                                        break label403;
                                    }
                                }
                            }
                            int var31 = (var29 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class93.field2372[var29][var25][var11] - var32;
                                int var34 = class93.field2372[var27][var25][var11];
                                class1.method50(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class84.field2193[var35][var36][var11] = class30.method286(class84.field2193[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class84.field2193[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; var38 > 0 && (var8 & class84.field2193[var10][var12][var38 - 1]) != 0; var38--) {
                            }
                            int var39 = var12;
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class84.field2193[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label469: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((var8 & class84.field2193[var10][var37 - 1][var41]) == 0) {
                                        break label469;
                                    }
                                }
                                var37--;
                            }
                            label458: while (var39 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((var8 & class84.field2193[var10][var39 + 1][var42]) == 0) {
                                        break label458;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var37) * (var40 + 1 - var38) >= 4) {
                                int var43 = class93.field2372[var10][var37][var38];
                                class1.method50(var9, 4, var37 * 128, var39 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var39; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class84.field2193[var10][var44][var45] = class30.method286(class84.field2193[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Llb;", line = 810)
    public final class68 method424(boolean arg0) {
        field2401++;
        if (arg0) {
            return null;
        }
        class114 var2 = class126.method999((byte) 88, this.field2413);
        class68 var3;
        if (this.field2415) {
            var3 = var2.method868(-1, (byte) -77);
        } else {
            var3 = var2.method868(this.field2406, (byte) -106);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V", line = 917)
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2413 = arg0;
        this.field2403 = arg2;
        this.field2424 = arg3;
        this.field2400 = arg4;
        this.field2419 = arg1;
        this.field2430 = arg5 + arg6;
        int var8 = class126.method999((byte) 88, this.field2413).field2784;
        if (var8 == -1) {
            this.field2415 = true;
        } else {
            this.field2415 = false;
            this.field2399 = class51.method401(-30325, var8);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V", line = 860)
    public static void method749(byte arg0) {
        field2427 = null;
        field2410 = null;
        if (arg0 <= 3) {
            field2417 = null;
        }
        field2421 = null;
        field2417 = null;
        field2412 = null;
        field2416 = null;
        field2420 = null;
        field2407 = null;
        field2426 = null;
        field2423 = null;
    }
}
