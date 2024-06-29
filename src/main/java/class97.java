import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class97 extends class297 {

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[B")
    public byte[] field1449;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[B")
    public byte[] field1456;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "[Ldi;")
    public class46[] field1464;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[Lda;")
    public class26[] field1444;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[S")
    public short[] field1465;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    private int[] field1455;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[B")
    public byte[] field1454;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lma;")
    public static class5 field1450 = class12.method119("::fpson", (byte) 52);

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Lma;")
    public static class5 field1445 = class12.method119(" )2> ", (byte) 66);

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lma;")
    private static class5 field1437 = class12.method119("OFF", (byte) 105);

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lma;")
    public static class5 field1452 = field1437;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lni;")
    public static class202 field1463;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Z")
    public static boolean[] field1443;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 10)
    public final void method617(int arg0) {
        field1461++;
        this.field1455 = null;
        if (arg0 != -7068) {
            field1460 = -69;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ[Lmc;)V", line = 21)
    public static final void method618(byte arg0, boolean arg1, class50[] arg2) {
        field1447++;
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
                        if ((class18.field321[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class18.field321[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method367((byte) -84, var6, var5);
                            }
                        }
                    }
                }
            }
            class218.field3526 += (int) (Math.random() * 5.0D) - 2;
            if (class218.field3526 < -8) {
                class218.field3526 = -8;
            }
            class260.field4436 += (int) (Math.random() * 5.0D) - 2;
            if (class218.field3526 > 8) {
                class218.field3526 = 8;
            }
            if (class260.field4436 < -16) {
                class260.field4436 = -16;
            }
            if (class260.field4436 > 16) {
                class260.field4436 = 16;
            }
        }
        int var8 = class218.field3526 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class260.field4436 >> 1;
        int[][] var11 = new int[104][104];
        if (arg0 != -13) {
            method624(-52, 10, 41, -34, -76, 80, (byte) 51, -124);
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class37.field583[var12];
            if (class8.field114) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        int var16 = (var13[var15][var14] >> 1) + (var13[var15][var14 - 1] >> 2) + (var13[var15 + 1][var14] >> 3) + (var13[var15][var14 - -1] >> 3) + (var13[var15 + -1][var14] >> 2);
                        byte var17 = 74;
                        var9[var15][var14] = var17 - var16;
                    }
                }
            } else {
                int var18 = (int) class293.field4955[0];
                int var19 = (int) class293.field4955[1];
                int var20 = (int) class293.field4955[2];
                int var21 = (int) Math.sqrt((double) (var19 * var19 + var18 * var18 + var20 * var20));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        int var25 = class208.field3304[var12][var24 + 1][var23] - class208.field3304[var12][var24 - 1][var23];
                        byte var26 = 96;
                        int var27 = class208.field3304[var12][var24][var23 + 1] - class208.field3304[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var27 * var27 + var25 * var25 + 65536));
                        int var29 = (var25 << 8) / var28;
                        int var30 = (var27 << 8) / var28;
                        int var31 = -65536 / var28;
                        int var32 = (var13[var24][var23 - 1] >> 2) + (var13[var24][var23 + 1] >> 3) + (var13[var24][var23] >> 1) + (var13[var24 - 1][var23] >> 2) + (var13[var24 + 1][var23] >> 3);
                        int var33 = (var20 * var30 + var18 * var29 + var19 * var31) / var22 + var26;
                        var9[var24][var23] = var33 - (int) ((float) var32 * 1.7F);
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class181.field2754[var34] = 0;
                class283.field4803[var34] = 0;
                class286.field4829[var34] = 0;
                class91.field1364[var34] = 0;
                class57.field904[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = class78.field1213[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class114 var39 = class260.method1802(var38 - 1, arg0 ^ 0x7DFE);
                            class181.field2754[var36] += var39.field1692;
                            class283.field4803[var36] += var39.field1694;
                            class286.field4829[var36] += var39.field1696;
                            class91.field1364[var36] += var39.field1706;
                            var10002 = class57.field904[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = class78.field1213[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class114 var42 = class260.method1802(var41 - 1, -32243);
                            class181.field2754[var36] -= var42.field1692;
                            class283.field4803[var36] -= var42.field1694;
                            class286.field4829[var36] -= var42.field1696;
                            class91.field1364[var36] -= var42.field1706;
                            var10002 = class57.field904[var36]--;
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
                            var47 += class91.field1364[var49];
                            var43 += class181.field2754[var49];
                            var46 += class57.field904[var49];
                            var44 += class286.field4829[var49];
                            var45 += class283.field4803[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var45 -= class283.field4803[var50];
                            var44 -= class286.field4829[var50];
                            var43 -= class181.field2754[var50];
                            var46 -= class57.field904[var50];
                            var47 -= class91.field1364[var50];
                        }
                        if (var48 >= 0 && var46 > 0) {
                            var11[var35][var48] = class88.method580(arg0 - 103, var44 / var46, var45 / var46, var43 * 256 / var47);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label736: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg1 || class152.method956((byte) -55) || (class18.field321[0][var51][var52] & 0x2) != 0 || (class18.field321[var12][var51][var52] & 0x10) == 0 && class255.method1784(var52, var51, 255, var12) == class276.field4709) {
                        if (class24.field415 > var12) {
                            class24.field415 = var12;
                        }
                        int var53 = class78.field1213[var12][var51][var52] & 0xFF;
                        int var54 = class152.field2235[var12][var51][var52] & 0xFF;
                        if (var53 > 0 || var54 > 0) {
                            int var55 = class208.field3304[var12][var51 + 1][var52 + 1];
                            int var56 = class208.field3304[var12][var51][var52];
                            int var57 = class208.field3304[var12][var51][var52 + 1];
                            int var58 = class208.field3304[var12][var51 + 1][var52];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var53 == 0 && class111.field1641[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var54 > 0 && !class236.method1672(var54 - 1, 29813).field293) {
                                    var59 = false;
                                }
                                if (var59 && var56 == var58 && var55 == var56 && var56 == var57) {
                                    class278.field4718[var12][var51][var52] = class264.method1820(class278.field4718[var12][var51][var52], 4);
                                }
                            }
                            int var60;
                            int var61;
                            if (var53 <= 0) {
                                var60 = -1;
                                var61 = 0;
                            } else {
                                var60 = var11[var51][var52];
                                int var62 = (var60 & 0x7F) + var10;
                                if (var62 < 0) {
                                    var62 = 0;
                                } else if (var62 > 127) {
                                    var62 = 127;
                                }
                                int var63 = (var8 + var60 & 0xFC00) + (var60 & 0x380) + var62;
                                var61 = class229.field3791[class184.method1209(var63, 96, (byte) -104)];
                            }
                            int var64 = var9[var51][var52];
                            int var65 = var9[var51 + 1][var52 + 1];
                            int var66 = var9[var51 + 1][var52];
                            int var67 = var9[var51][var52 + 1];
                            if (var54 == 0) {
                                class202.method1324(var12, var51, var52, 0, 0, -1, var56, var58, var55, var57, class184.method1209(var60, var64, (byte) -104), class184.method1209(var60, var66, (byte) -104), class184.method1209(var60, var65, (byte) -104), class184.method1209(var60, var67, (byte) -104), 0, 0, 0, 0, var61, 0);
                                if (var12 > 0 && var60 != -1 && class260.method1802(var53 - 1, -32243).field1703) {
                                    class134.method878(0, 0, true, false, var51, var52, var56 - class208.field3304[0][var51][var52], -class208.field3304[0][var51 + 1][var52] + var58, var55 - class208.field3304[0][var51 + 1][var52 + 1], -class208.field3304[0][var51][var52 + 1] + var57);
                                }
                                if (!arg1 && class150.field2162 != null && var12 == 0) {
                                    for (int var68 = var51 - 1; var68 <= var51 + 1; var68++) {
                                        for (int var69 = var52 - 1; var69 <= (var52 + 1); var69++) {
                                            if ((var51 != var68 || var52 != var69) && var68 >= 0 && var68 < 104 && var69 >= 0 && var69 < 104) {
                                                int var70 = class152.field2235[var12][var68][var69] & 0xFF;
                                                if (var70 != 0) {
                                                    class16 var71 = class236.method1672(var70 - 1, arg0 ^ 0xFFFF8B86);
                                                    if (var71.field283 != -1 && class229.field3802.method1099((byte) -124, var71.field283) == 4) {
                                                        class150.field2162[var51][var52] = (var71.field292 << 24) + var71.field282;
                                                        continue label736;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var72 = class111.field1641[var12][var51][var52] + 1;
                                byte var73 = class279.field4733[var12][var51][var52];
                                class16 var74 = class236.method1672(var54 - 1, 29813);
                                if (!arg1 && class150.field2162 != null && var12 == 0) {
                                    if (var74.field283 != -1 && class229.field3802.method1099((byte) -88, var74.field283) == 4) {
                                        class150.field2162[var51][var52] = (var74.field292 << 24) + var74.field282;
                                    } else {
                                        label718: for (int var75 = var51 - 1; var75 <= (var51 + 1); var75++) {
                                            for (int var76 = var52 - 1; var76 <= (var52 + 1); var76++) {
                                                if ((var51 != var75 || var52 != var76) && var75 >= 0 && var75 < 104 && var76 >= 0 && var76 < 104) {
                                                    int var77 = class152.field2235[var12][var75][var76] & 0xFF;
                                                    if (var77 != 0) {
                                                        class16 var78 = class236.method1672(var77 - 1, 29813);
                                                        if (var78.field283 != -1 && class229.field3802.method1099((byte) -90, var78.field283) == 4) {
                                                            class150.field2162[var51][var52] = (var78.field292 << 24) + var78.field282;
                                                            break label718;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var79 = var74.field283;
                                if (var79 >= 0 && !class229.field3802.method1092(-2, var79)) {
                                    var79 = -1;
                                }
                                int var80;
                                int var83;
                                if (var79 >= 0) {
                                    var83 = class229.field3791[class297.method2001(false, class229.field3802.method1088(var79, (byte) -69), 96)];
                                    var80 = -1;
                                } else if (var74.field295 == -1) {
                                    var83 = 0;
                                    var80 = -2;
                                } else {
                                    var80 = var74.field295;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var8 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var83 = class229.field3791[class297.method2001(false, var82, 96)];
                                }
                                if (var74.field298 >= 0) {
                                    int var84 = var74.field298;
                                    int var85 = (var84 & 0x7F) + var10;
                                    if (var85 < 0) {
                                        var85 = 0;
                                    } else if (var85 > 127) {
                                        var85 = 127;
                                    }
                                    int var86 = (var8 + var84 & 0xFC00) + (var84 & 0x380) + var85;
                                    var83 = class229.field3791[class297.method2001(false, var86, 96)];
                                }
                                class202.method1324(var12, var51, var52, var72, var73, var79, var56, var58, var55, var57, class184.method1209(var60, var64, (byte) -104), class184.method1209(var60, var66, (byte) -104), class184.method1209(var60, var65, (byte) -104), class184.method1209(var60, var67, (byte) -104), class297.method2001(false, var80, var64), class297.method2001(false, var80, var66), class297.method2001(false, var80, var65), class297.method2001(false, var80, var67), var61, var83);
                                if (var12 > 0) {
                                    class134.method878(var72, var73, var80 == -2 || !var74.field291, var60 == -1 || !class260.method1802(var53 - 1, -32243).field1703, var51, var52, var56 - class208.field3304[0][var51][var52], -class208.field3304[0][var51 - -1][var52] + var58, var55 - class208.field3304[0][var51 + 1][var52 + 1], var57 - class208.field3304[0][var51][var52 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            float[][] var87 = new float[105][105];
            float[][] var88 = new float[105][105];
            float[][] var89 = new float[105][105];
            int[][] var90 = class208.field3304[var12];
            for (int var91 = 1; var91 <= 103; var91++) {
                for (int var92 = 1; var92 <= 103; var92++) {
                    int var93 = var90[var92 + 1][var91] - var90[var92 - 1][var91];
                    int var94 = var90[var92][var91 + 1] - var90[var92][var91 - 1];
                    float var95 = (float) Math.sqrt((double) (var94 * var94 + var93 * var93 + 65536));
                    var87[var92][var91] = (float) var93 / var95;
                    var89[var92][var91] = -256.0F / var95;
                    var88[var92][var91] = (float) var94 / var95;
                }
            }
            if (arg1) {
                class56[] var101 = class286.method1926(var88, class78.field1213[var12], var9, class152.field2235[var12], var89, var87, var12, class88.field1318[0], class208.field3304[var12], class111.field1641[var12], -1, class150.field2162, class279.field4733[var12], class18.field321, var11);
                class244.method1714(var12, var101);
            } else {
                class56[] var96 = class286.method1926(var88, class78.field1213[var12], var9, class152.field2235[var12], var89, var87, var12, (int[][]) null, class208.field3304[var12], class111.field1641[var12], arg0 ^ 0xC, (int[][]) null, class279.field4733[var12], class18.field321, var11);
                class56[] var97 = class248.method1733(var88, var87, class279.field4733[var12], (byte) -23, class152.field2235[var12], class208.field3304[var12], class111.field1641[var12], var12, var89, var9, class18.field321, class78.field1213[var12]);
                class56[] var98 = new class56[var96.length + var97.length];
                for (int var99 = 0; var99 < var96.length; var99++) {
                    var98[var99] = var96[var99];
                }
                for (int var100 = 0; var100 < var97.length; var100++) {
                    var98[var96.length + var100] = var97[var100];
                }
                class244.method1714(var12, var98);
                class8.method97(class78.field1213[var12], var89, class111.field1641[var12], class279.field4733[var12], class152.field2235[var12], class208.field3304[var12], -1, var87, var12, class53.field844, var88, class53.field838);
            }
            class78.field1213[var12] = (byte[][]) null;
            class152.field2235[var12] = (byte[][]) null;
            class111.field1641[var12] = (byte[][]) null;
            class279.field4733[var12] = (byte[][]) null;
            class37.field583[var12] = (byte[][]) null;
        }
        class280.method1897(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                if ((class18.field321[1][var102][var103] & 0x2) == 2) {
                    class186.method1228(var102, var103);
                }
            }
        }
        for (int var104 = 0; var104 < 4; var104++) {
            for (int var105 = 0; var105 <= 104; var105++) {
                for (int var106 = 0; var106 <= 104; var106++) {
                    if ((class278.field4718[var104][var106][var105] & 0x1) != 0) {
                        int var107 = var105;
                        int var108 = var105;
                        while (var107 > 0 && (class278.field4718[var104][var106][var107 - 1] & 0x1) != 0) {
                            var107--;
                        }
                        int var109 = var104;
                        int var110 = var104;
                        while (var108 < 104 && (class278.field4718[var104][var106][var108 + 1] & 0x1) != 0) {
                            var108++;
                        }
                        label436: while (var109 > 0) {
                            for (int var111 = var107; var111 <= var108; var111++) {
                                if ((class278.field4718[var109 - 1][var106][var111] & 0x1) == 0) {
                                    break label436;
                                }
                            }
                            var109--;
                        }
                        label425: while (var110 < 3) {
                            for (int var112 = var107; var112 <= var108; var112++) {
                                if ((class278.field4718[var110 + 1][var106][var112] & 0x1) == 0) {
                                    break label425;
                                }
                            }
                            var110++;
                        }
                        int var113 = (var108 + 1 - var107) * (var110 + 1 - var109);
                        if (var113 >= 8) {
                            int var114 = class208.field3304[var109][var106][var107];
                            short var115 = 240;
                            int var116 = class208.field3304[var110][var106][var107] - var115;
                            class103.method651(1, var106 * 128, var106 * 128, var107 * 128, var108 * 128 + 128, var116, var114);
                            for (int var117 = var109; var117 <= var110; var117++) {
                                for (int var118 = var107; var118 <= var108; var118++) {
                                    class278.field4718[var117][var106][var118] = class204.method1354(class278.field4718[var117][var106][var118], -2);
                                }
                            }
                        }
                    }
                    if ((class278.field4718[var104][var106][var105] & 0x2) != 0) {
                        int var119 = var104;
                        int var120;
                        for (var120 = var106; var120 > 0 && (class278.field4718[var104][var120 - 1][var105] & 0x2) != 0; var120--) {
                        }
                        int var121 = var104;
                        int var122;
                        for (var122 = var106; var122 < 104 && (class278.field4718[var104][var122 + 1][var105] & 0x2) != 0; var122++) {
                        }
                        label490: while (var119 > 0) {
                            for (int var123 = var120; var123 <= var122; var123++) {
                                if ((class278.field4718[var119 - 1][var123][var105] & 0x2) == 0) {
                                    break label490;
                                }
                            }
                            var119--;
                        }
                        label479: while (var121 < 3) {
                            for (int var124 = var120; var124 <= var122; var124++) {
                                if ((class278.field4718[var121 + 1][var124][var105] & 0x2) == 0) {
                                    break label479;
                                }
                            }
                            var121++;
                        }
                        int var125 = (var121 + 1 - var119) * (var122 + 1 - var120);
                        if (var125 >= 8) {
                            short var126 = 240;
                            int var127 = class208.field3304[var121][var120][var105] - var126;
                            int var128 = class208.field3304[var119][var120][var105];
                            class103.method651(2, var120 * 128, var122 * 128 + 128, var105 * 128, var105 * 128, var127, var128);
                            for (int var129 = var119; var129 <= var121; var129++) {
                                for (int var130 = var120; var130 <= var122; var130++) {
                                    class278.field4718[var129][var130][var105] = class204.method1354(class278.field4718[var129][var130][var105], -3);
                                }
                            }
                        }
                    }
                    if ((class278.field4718[var104][var106][var105] & 0x4) != 0) {
                        int var131 = var106;
                        int var132 = var106;
                        int var133;
                        for (var133 = var105; var133 < 104 && (class278.field4718[var104][var106][var133 + 1] & 0x4) != 0; var133++) {
                        }
                        int var134;
                        for (var134 = var105; var134 > 0 && (class278.field4718[var104][var106][var134 - 1] & 0x4) != 0; var134--) {
                        }
                        label544: while (var131 > 0) {
                            for (int var135 = var134; var135 <= var133; var135++) {
                                if ((class278.field4718[var104][var131 - 1][var135] & 0x4) == 0) {
                                    break label544;
                                }
                            }
                            var131--;
                        }
                        label533: while (var132 < 104) {
                            for (int var136 = var134; var136 <= var133; var136++) {
                                if ((class278.field4718[var104][var132 + 1][var136] & 0x4) == 0) {
                                    break label533;
                                }
                            }
                            var132++;
                        }
                        if (((var132 + 1 - var131) * (var133 + 1 - var134)) >= 4) {
                            int var137 = class208.field3304[var104][var131][var134];
                            class103.method651(4, var131 * 128, var132 * 128 + 128, var134 * 128, var133 * 128 + 128, var137, var137);
                            for (int var138 = var131; var138 <= var132; var138++) {
                                for (int var139 = var134; var139 <= var133; var139++) {
                                    class278.field4718[var104][var138][var139] = class204.method1354(class278.field4718[var104][var138][var139], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 945)
    public static final void method619(int arg0) {
        field1448++;
        int var1 = class23.field406 * 128 + 64;
        int var2 = class240.field3984 * 128 + 64;
        int var3 = class20.method161(var2, var1, 1, class276.field4701) - class280.field4737;
        if (class303.field5099 < 100) {
            if (var1 > class239.field3970) {
                class239.field3970 += (var1 - class239.field3970) * class303.field5099 / 1000 + class24.field424;
                if (class239.field3970 > var1) {
                    class239.field3970 = var1;
                }
            }
            if (var1 < class239.field3970) {
                class239.field3970 -= class24.field424 + ((class239.field3970 - var1) * class303.field5099 / 1000);
                if (var1 > class239.field3970) {
                    class239.field3970 = var1;
                }
            }
            if (var2 > class303.field5108) {
                class303.field5108 += class24.field424 + ((var2 - class303.field5108) * class303.field5099 / 1000);
                if (var2 < class303.field5108) {
                    class303.field5108 = var2;
                }
            }
            if (var3 > class27.field437) {
                class27.field437 += (var3 - class27.field437) * class303.field5099 / 1000 + class24.field424;
                if (class27.field437 > var3) {
                    class27.field437 = var3;
                }
            }
            if (var2 < class303.field5108) {
                class303.field5108 -= (class303.field5108 - var2) * class303.field5099 / 1000 + class24.field424;
                if (var2 > class303.field5108) {
                    class303.field5108 = var2;
                }
            }
            if (var3 < class27.field437) {
                class27.field437 -= (class27.field437 - var3) * class303.field5099 / 1000 + class24.field424;
                if (var3 > class27.field437) {
                    class27.field437 = var3;
                }
            }
        } else {
            class303.field5108 = class240.field3984 * 128 + 64;
            class239.field3970 = class23.field406 * 128 + 64;
            class27.field437 = class20.method161(class303.field5108, class239.field3970, 1, class276.field4701) - class280.field4737;
        }
        int var4 = class170.field2618 * 128 + 64;
        int var5 = class73.field1141 * 128 + 64;
        int var6 = class20.method161(var4, var5, 1, class276.field4701) - class274.field4680;
        int var7 = var5 - class239.field3970;
        int var8 = var6 - class27.field437;
        int var9 = var4 - class303.field5108;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class207.field3287) {
            class207.field3287 += (var11 - class207.field3287) * class206.field3280 / 1000 + class283.field4797;
            if (class207.field3287 > var11) {
                class207.field3287 = var11;
            }
        }
        if (arg0 != 2048) {
            return;
        }
        int var13 = var12 - class114.field1710;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class207.field3287 > var11) {
            class207.field3287 -= (class207.field3287 - var11) * class206.field3280 / 1000 + class283.field4797;
            if (class207.field3287 < var11) {
                class207.field3287 = var11;
            }
        }
        if (var13 > 0) {
            class114.field1710 += class283.field4797 + (class206.field3280 * var13 / 1000);
            class114.field1710 &= 0x7FF;
        }
        if (var13 < 0) {
            class114.field1710 -= -var13 * class206.field3280 / 1000 + class283.field4797;
            class114.field1710 &= 0x7FF;
        }
        int var14 = var12 - class114.field1710;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class114.field1710 = var12;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lma;IZ)V", line = 1106)
    public static final void method620(class5 arg0, int arg1, boolean arg2) {
        field1462++;
        int var3 = -2 / ((78 - arg1) / 38);
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = class72.field1127.method2016(arg0, 250);
        int var7 = var4 + 6;
        int var8 = class72.field1127.method2024(arg0, 250) * 13;
        class124.method826(var7 - var4, var5 - var4, var4 + var6 + var4, var4 + var8 + var4, 0);
        class124.method823(var7 - var4, -var4 + var5, var6 - (-var4 - var4), var8 - -var4 + var4, 16777215);
        class72.field1127.method2018(arg0, var7, var5, var6, var8, 16777215, -1, 1, 1, 0);
        class84.method566(119, var8 - (-var4 - var4), -var4 + var5, var7 - var4, var4 + var4 + var6);
        if (arg2) {
            class45.method334();
        } else {
            class46.method344(var8, var5, var6, var7, false);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 1144)
    public static void method621(boolean arg0) {
        field1443 = null;
        field1463 = null;
        field1452 = null;
        field1450 = null;
        if (arg0) {
            field1445 = null;
            field1437 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I", line = 1170)
    public static final int method622(byte arg0, int arg1, int arg2) {
        if (arg0 > -94) {
            return 112;
        }
        field1441++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZLec;I)V", line = 1202)
    public static final void method623(int arg0, boolean arg1, class91 arg2, int arg3) {
        if ((arg3 & 0x80) != 0) {
            arg2.field204 = class200.field3184.method1501((byte) -56);
            if (arg2.field204.method65((byte) 116, 0) == 126) {
                arg2.field204 = arg2.field204.method78(-24938, 1);
                class69.method497(24077, arg2.method596((byte) -126), 2, arg2.field204);
            } else if (class151.field2183 == arg2) {
                class69.method497(24077, arg2.method596((byte) -126), 2, arg2.field204);
            }
            arg2.field193 = 150;
            arg2.field224 = 0;
            arg2.field183 = 0;
        }
        field1446++;
        if ((arg3 & 0x8) != 0) {
            int var4 = class200.field3184.method1527(true);
            int var5 = class200.field3184.method1547((byte) 55);
            int var6 = class200.field3184.method1544((byte) -118);
            int var7 = class200.field3184.field3610;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg2.field1367 != null && arg2.field1369 != null) {
                long var9 = arg2.field1367.method69(-49);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var8 && class57.field902 == 1 || class123.field1865 == 1) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class100.field1484; var12++) {
                            if (class202.field3226[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class236.field3904 == 0) {
                    class119.field1796.field3610 = 0;
                    class200.field3184.method1551(var6, -128, class119.field1796.field3617, 0);
                    class119.field1796.field3610 = 0;
                    int var13 = -1;
                    class5 var15;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class175 var14 = class286.method1930(class119.field1796, 1);
                        var13 = var14.field2681;
                        var15 = var14.field2667.method1654(true, class119.field1796);
                    } else {
                        var15 = class299.method2030(class103.method653(0, class119.field1796).method59(15624));
                    }
                    arg2.field204 = var15.method40((byte) -116);
                    arg2.field193 = 150;
                    arg2.field183 = var4 & 0xFF;
                    arg2.field224 = var4 >> 8;
                    if (var5 == 2) {
                        class238.method1682(var13, var15, (class5) null, (byte) -87, var8 ? 17 : 1, class288.method1940((byte) 123, new class5[] { class301.field5070, arg2.method596((byte) -126) }));
                    } else if (var5 == 1) {
                        class238.method1682(var13, var15, (class5) null, (byte) -73, var8 ? 17 : 1, class288.method1940((byte) 101, new class5[] { class89.field1338, arg2.method596((byte) -126) }));
                    } else {
                        class238.method1682(var13, var15, (class5) null, (byte) -66, var8 ? 17 : 2, arg2.method596((byte) -126));
                    }
                }
            }
            class200.field3184.field3610 = var6 + var7;
        }
        if (arg1) {
            return;
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field235 = class200.field3184.method1498((byte) -27);
            arg2.field207 = class200.field3184.method1498((byte) -27);
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field179 = class200.field3184.method1499(false);
            arg2.field209 = class200.field3184.method1509(true);
            arg2.field191 = class200.field3184.method1499(false);
            arg2.field188 = class200.field3184.method1499(false);
            arg2.field198 = class200.field3184.method1527(!arg1) + class50.field784;
            arg2.field231 = class200.field3184.method1527(!arg1) + class50.field784;
            arg2.field203 = class200.field3184.method1509(!arg1);
            arg2.field208 = 1;
            arg2.field172 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field223 = class200.field3184.method1524((byte) 105);
            if (arg2.field223 == 65535) {
                arg2.field223 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var16 = class200.field3184.method1544((byte) -38);
            byte[] var17 = new byte[var16];
            class221 var18 = new class221(var17);
            class200.field3184.method1545((byte) -96, 0, var16, var17);
            class129.field1933[arg0] = var18;
            arg2.method601(11186, var18);
        }
        if ((arg3 & 0x2) != 0) {
            int var19 = class200.field3184.method1524((byte) 123);
            int var20 = class200.field3184.method1509(true);
            if (var19 == 65535) {
                var19 = -1;
            }
            class13.method129(var19, arg2, var20, 93);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field222 = class200.field3184.method1528(-87);
            int var21 = class200.field3184.method1517((byte) -113);
            arg2.field236 = 0;
            if (arg2.field222 == 65535) {
                arg2.field222 = -1;
            }
            arg2.field195 = 0;
            arg2.field199 = (var21 & 0xFFFF) + class50.field784;
            if (class50.field784 < arg2.field199) {
                arg2.field236 = -1;
            }
            arg2.field213 = var21 >> 16;
            if (arg2.field222 != -1 && class50.field784 == arg2.field199) {
                int var22 = class57.method430(arg2.field222, 22867872).field753;
                if (var22 != -1) {
                    class33 var23 = class171.method1136(var22, -6722);
                    if (var23 != null && var23.field529 != null) {
                        class272.method1859(arg2.field178, arg2.field211, 64, 0, var23, class151.field2183 == arg2);
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            int var24 = class200.field3184.method1544((byte) -127);
            int var25 = class200.field3184.method1499(false);
            arg2.method126((byte) 49, var25, var24, class50.field784);
        }
        if ((arg3 & 0x10) == 0) {
            return;
        }
        int var26 = class200.field3184.method1499(false);
        int var27 = class200.field3184.method1547((byte) 127);
        arg2.method126((byte) 105, var27, var26, class50.field784);
        arg2.field212 = class50.field784 + 300;
        arg2.field177 = class200.field3184.method1544((byte) -51);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIBI)V", line = 1436)
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class139.field2063 - class2.field16) * var8 / 100 + class2.field16;
        int var10 = arg7 * var9 >> 8;
        int var11 = 2048 - arg0 & 0x7FF;
        field1439++;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = var10;
        if (arg6 < 67) {
            method623(3, true, (class91) null, 124);
        }
        int var15 = 0;
        if (var11 != 0) {
            int var16 = class229.field3805[var11];
            var15 = -var10 * var16 >> 16;
            int var17 = class229.field3806[var11];
            var14 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class229.field3805[var12];
            var13 = var14 * var18 >> 16;
            int var19 = class229.field3806[var12];
            var14 = var14 * var19 >> 16;
        }
        class239.field3970 = arg3 - var13;
        class303.field5108 = arg1 - var14;
        class114.field1710 = arg4;
        class27.field437 = arg2 - var15;
        class207.field3287 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lma;IB)V", line = 1495)
    public static final void method625(class5 arg0, int arg1, byte arg2) {
        field1453++;
        boolean var3 = false;
        class5 var4 = arg0.method56(0).method30(-89);
        for (int var5 = 0; var5 < class175.field2675; var5++) {
            class91 var6 = class267.field4593[class118.field1785[var5]];
            if (var6 != null && var6.field1367 != null && var6.field1367.method29(61, var4)) {
                class149.method939(0, 0, var6.field175[0], 1, 1, 0, 123, 2, var6.field186[0], false, class151.field2183.field186[0], class151.field2183.field175[0]);
                if (arg1 == 1) {
                    class114.field1709++;
                    class147.field2127.method1389((byte) -127, 31);
                    class147.field2127.method1526(26828, class118.field1785[var5]);
                } else if (arg1 == 4) {
                    class147.field2127.method1389((byte) -61, 55);
                    class2.field22++;
                    class147.field2127.method1539(class118.field1785[var5], false);
                } else if (arg1 == 5) {
                    class261.field4457++;
                    class147.field2127.method1389((byte) 101, 3);
                    class147.field2127.method1557(class118.field1785[var5], -7351);
                } else if (arg1 == 6) {
                    class117.field1776++;
                    class147.field2127.method1389((byte) 124, 59);
                    class147.field2127.method1526(26828, class118.field1785[var5]);
                } else if (arg1 == 7) {
                    class252.field4170++;
                    class147.field2127.method1389((byte) 126, 243);
                    class147.field2127.method1557(class118.field1785[var5], -7351);
                }
                var3 = true;
                break;
            }
        }
        int var7 = 91 / ((arg2 - 48) / 36);
        if (!var3) {
            class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 108, new class5[] { class72.field1136, var4 }));
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIBILma;J)V", line = 1569)
    public static final void method626(int arg0, int arg1, int arg2, byte arg3, int arg4, class5 arg5, long arg6) {
        field1440++;
        class221 var8 = new class221(128);
        var8.method1542(-64, 10);
        var8.method1539((int) (Math.random() * 99999.0D), false);
        var8.method1539(509, false);
        var8.method1548(false, arg6);
        var8.method1513((int) (Math.random() * 9.9999999E7D), false);
        var8.method1522(arg5, (byte) 64);
        var8.method1513((int) (Math.random() * 9.9999999E7D), false);
        var8.method1539(class249.field4119, false);
        var8.method1542(-106, arg0);
        if (arg3 != 8) {
            method627(0);
        }
        var8.method1542(-96, arg1);
        var8.method1513((int) (Math.random() * 9.9999999E7D), false);
        var8.method1539(arg4, false);
        var8.method1539(arg2, false);
        var8.method1513((int) (Math.random() * 9.9999999E7D), false);
        var8.method1523(arg3 ^ 0x33, class235.field3881, class275.field4688);
        class147.field2127.field3610 = 0;
        class147.field2127.method1542(-61, 155);
        class147.field2127.method1542(-84, var8.field3610);
        class147.field2127.method1531(0, arg3 ^ 0xFFFFFFC4, var8.field3610, var8.field3617);
        class241.field4019 = 0;
        class142.field2084 = -3;
        class257.field4394 = 0;
        class208.field3303 = 1;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V", line = 1604)
    public static final void method627(int arg0) {
        if (arg0 <= -2) {
            class281.field4751.method522(83);
            field1451++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BLpe;[I)Z", line = 1630)
    public final boolean method628(int arg0, byte[] arg1, class245 arg2, int[] arg3) {
        if (arg0 >= -3) {
            field1443 = (boolean[]) null;
        }
        field1457++;
        boolean var5 = true;
        class26 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1455[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1718((byte) -45, var9 >> 2, arg3);
                        } else {
                            var6 = arg2.method1716(arg3, var9 >> 2, 1);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field1444[var8] = var6;
                        this.field1455[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 1702)
    public class97() {
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V", line = 1704)
    public class97(byte[] arg0) {
        this.field1449 = new byte[128];
        this.field1456 = new byte[128];
        this.field1464 = new class46[128];
        this.field1444 = new class26[128];
        this.field1465 = new short[128];
        this.field1455 = new int[128];
        this.field1454 = new byte[128];
        class221 var2 = new class221(arg0);
        int var3;
        for (var3 = 0; var2.field3617[var2.field3610 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1543(false);
        }
        var3++;
        var2.field3610++;
        int var6 = var2.field3610;
        var2.field3610 += var3;
        int var7;
        for (var7 = 0; var2.field3617[var2.field3610 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1543(false);
        }
        var7++;
        var2.field3610++;
        int var10 = var2.field3610;
        var2.field3610 += var7;
        int var11;
        for (var11 = 0; var2.field3617[var2.field3610 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1543(false);
        }
        var11++;
        var2.field3610++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1509(true);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class46[] var19 = new class46[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class46 var21 = var19[var20] = new class46();
            int var22 = var2.method1509(true);
            if (var22 > 0) {
                var21.field713 = new byte[var22 * 2];
            }
            int var23 = var2.method1509(true);
            if (var23 > 0) {
                var21.field708 = new byte[var23 * 2 + 2];
                var21.field708[1] = 64;
            }
        }
        int var24 = var2.method1509(true);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method1509(true);
        int var27;
        for (var27 = 0; var2.field3617[var2.field3610 + var27] != 0; var27++) {
        }
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var2.method1543(false);
        }
        var2.field3610++;
        var27++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method1509(true);
            this.field1465[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method1509(true);
            this.field1465[var34] = (short) (this.field1465[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var35 < var29.length) {
                    var36 = var29[var35++];
                } else {
                    var36 = -1;
                }
                var37 = var2.method1552(-63);
            }
            var36--;
            this.field1465[var38] = (short) (this.field1465[var38] + (class204.method1354(2, var37 - 1) << 14));
            this.field1455[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1455[var42] != 0) {
                if (var41 == 0) {
                    if (var4.length > var39) {
                        var41 = var4[var39++];
                    } else {
                        var41 = -1;
                    }
                    var40 = var2.field3617[var6++] - 1;
                }
                this.field1456[var42] = (byte) var40;
                var41--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1455[var46] != 0) {
                if (var45 == 0) {
                    var43 = var2.field3617[var10++] + 16 << 2;
                    if (var44 >= var8.length) {
                        var45 = -1;
                    } else {
                        var45 = var8[var44++];
                    }
                }
                this.field1449[var46] = (byte) var43;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class46 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1455[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length > var47) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field1464[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length <= var53) {
                    var51 = -1;
                } else {
                    var51 = var29[var53++];
                }
                if (this.field1455[var54] > 0) {
                    var52 = var2.method1509(true) + 1;
                }
            }
            this.field1454[var54] = (byte) var52;
            var51--;
        }
        this.field1458 = var2.method1509(true) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class46 var56 = var19[var55];
            if (var56.field713 != null) {
                for (int var57 = 1; var57 < var56.field713.length; var57 += 2) {
                    var56.field713[var57] = var2.method1543(false);
                }
            }
            if (var56.field708 != null) {
                for (int var58 = 3; var58 < (var56.field708.length - 2); var58 += 2) {
                    var56.field708[var58] = var2.method1543(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method1543(false);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var2.method1543(false);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class46 var62 = var19[var61];
            if (var62.field708 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field708.length; var64 += 2) {
                    var63 = var63 + var2.method1509(true) + 1;
                    var62.field708[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class46 var66 = var19[var65];
            if (var66.field713 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field713.length; var68 += 2) {
                    var67 += var2.method1509(true) + 1;
                    var66.field713[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method1509(true);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var2.method1509(true) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1454[var73] = (byte) (this.field1454[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class175.method1146(var75 - var71, var77, false);
                    this.field1454[var78] = (byte) (this.field1454[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field1454[var81] = (byte) (this.field1454[var81] * var72 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var2.method1509(true);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var82 + var2.method1509(true) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1449[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1449[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class175.method1146(var89 - var84, var91, false);
                    int var94 = (this.field1449[var92] & 0xFF) + var93;
                    var91 += var90 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1449[var92] = (byte) var94;
                }
                var88 += 2;
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field1449[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field1449[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field716 = var2.method1509(true);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class46 var100 = var19[var99];
            if (var100.field713 != null) {
                var100.field715 = var2.method1509(true);
            }
            if (var100.field708 != null) {
                var100.field711 = var2.method1509(true);
            }
            if (var100.field716 > 0) {
                var100.field694 = var2.method1509(true);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field696 = var2.method1509(true);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class46 var103 = var19[var102];
            if (var103.field696 > 0) {
                var103.field709 = var2.method1509(true);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class46 var105 = var19[var104];
            if (var105.field709 > 0) {
                var105.field705 = var2.method1509(true);
            }
        }
    }
}
