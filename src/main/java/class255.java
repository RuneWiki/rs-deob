import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class255 extends class107 {

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Lfe;")
    public static class234 field4451 = null;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[[B")
    public static byte[][] field4457 = new byte[50][];

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Z")
    public static boolean field4450;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "[Ltg;")
    public static class171[] field4449;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "[[Z")
    public static boolean[][] field4453;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4453 = null;
        field4449 = null;
        if (arg0 == -19395) {
            field4457 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        class184.method1306((byte) 97);
        class124.method928((byte) 83);
        class183.method1299(0);
        field4455++;
        class195.method1380((byte) -98);
        int var1 = -125 % ((46 - arg0) / 41);
        class100.method731((byte) -121);
        class125.method933(-111);
        class198.method1391(5);
        class242.method1659(-8193);
        class161.method1140((byte) -125);
        class41.method211(-103);
        class244.method1666((byte) 11);
        class96.method714(13302);
        class170.method1181(2);
        class4.method16(256);
        class107.field1757.method1353(-90);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class255() {
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ[Lkf;)V")
    public static final void method1742(byte arg0, boolean arg1, class170[] arg2) {
        field4456++;
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
                        if ((class160.field2626[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class160.field2626[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1182(var6, 23, var5);
                            }
                        }
                    }
                }
            }
            class145.field2421 += (int) (Math.random() * 5.0D) - 2;
            if (class145.field2421 < -16) {
                class145.field2421 = -16;
            }
            if (class145.field2421 > 16) {
                class145.field2421 = 16;
            }
            class87.field1450 += (int) (Math.random() * 5.0D) - 2;
            if (class87.field1450 < -8) {
                class87.field1450 = -8;
            }
            if (class87.field1450 > 8) {
                class87.field1450 = 8;
            }
        }
        int var8 = class87.field1450 >> 2 << 10;
        int var9 = class145.field2421 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (arg0 != -32) {
            method1741(5);
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class64.field1039[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class172.field2820[var12][var100][var54 + 1] - class172.field2820[var12][var100][var54 - 1];
                    int var103 = class172.field2820[var12][var100 + 1][var54] - class172.field2820[var12][var100 - 1][var54];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var107 * -50 + (var106 * -50 + (var105 * -10))) / var53 + var101;
                    int var109 = (var51[var100][var54 - 1] >> 2) + ((var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3)) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54] >> 1);
                    var10[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class172.field2825[var55] = 0;
                class17.field261[var55] = 0;
                class42.field683[var55] = 0;
                class13.field198[var55] = 0;
                class3.field23[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class142.field2383[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class140 var96 = class218.method1501(var95 - 1, (byte) -64);
                            class172.field2825[var85] += var96.field2353;
                            class17.field261[var85] += var96.field2358;
                            class42.field683[var85] += var96.field2360;
                            class13.field198[var85] += var96.field2354;
                            var10002 = class3.field23[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class142.field2383[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class140 var99 = class218.method1501(var98 - 1, (byte) -123);
                            class172.field2825[var85] -= var99.field2353;
                            class17.field261[var85] -= var99.field2358;
                            class42.field683[var85] -= var99.field2360;
                            class13.field198[var85] -= var99.field2354;
                            var10002 = class3.field23[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var87 += class172.field2825[var93];
                            var88 += class13.field198[var93];
                            var89 += class3.field23[var93];
                            var90 += class42.field683[var93];
                            var86 += class17.field261[var93];
                        }
                        if (var92 >= 0) {
                            var86 -= class17.field261[var92];
                            var88 -= class13.field198[var92];
                            var90 -= class42.field683[var92];
                            var89 -= class3.field23[var92];
                            var87 -= class172.field2825[var92];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var11[var56][var91] = class39.method193(var90 / var89, var86 / var89, var87 * 256 / var88, (byte) 53);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class34.method170(117) || (class160.field2626[0][var57][var58] & 0x2) != 0 || (class160.field2626[var12][var57][var58] & 0x10) == 0 && class259.method1763((byte) 107, var58, var12, var57) == class245.field4253) {
                        if (var12 < class62.field1010) {
                            class62.field1010 = var12;
                        }
                        int var59 = class142.field2383[var12][var57][var58] & 0xFF;
                        int var60 = class3.field18[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class172.field2820[var12][var57][var58];
                            int var62 = class172.field2820[var12][var57 + 1][var58];
                            int var63 = class172.field2820[var12][var57][var58 + 1];
                            int var64 = class172.field2820[var12][var57 + 1][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class57.field954[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class115.method847(var60 - 1, 126).field1579) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var64 && var61 == var63) {
                                    class5.field56[var12][var57][var58] = class82.method642(class5.field56[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var11[var57][var58];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var8 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var66 = class73.field1161[class29.method147(var69, 96, true)];
                            }
                            int var70 = var10[var57 + 1][var58];
                            int var71 = var10[var57][var58 + 1];
                            int var72 = var10[var57 + 1][var58 + 1];
                            int var73 = var10[var57][var58];
                            if (var60 == 0) {
                                class75.method538(var12, var57, var58, 0, 0, -1, var61, var62, var64, var63, class29.method147(var67, var73, true), class29.method147(var67, var70, true), class29.method147(var67, var72, true), class29.method147(var67, var71, true), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class57.field954[var12][var57][var58] + 1;
                                byte var75 = class195.field3263[var12][var57][var58];
                                class95 var76 = class115.method847(var60 - 1, 108);
                                int var77 = var76.field1566;
                                if (var77 >= 0 && !class73.field1166.method469(var77, 64)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class73.field1161[class52.method333(96, class73.field1166.method460(arg0 ^ 0x6FB, var77), (byte) -101)];
                                    var79 = -1;
                                } else if (var76.field1574 == -1) {
                                    var78 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var76.field1574;
                                    int var80 = (var79 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var79 & 0x380) + ((var79 + var8 & 0xFC00) + var80);
                                    var78 = class73.field1161[class52.method333(96, var81, (byte) -97)];
                                }
                                if (var76.field1576 >= 0) {
                                    int var82 = var76.field1576;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class73.field1161[class52.method333(96, var84, (byte) 2)];
                                }
                                class75.method538(var12, var57, var58, var74, var75, var77, var61, var62, var64, var63, class29.method147(var67, var73, true), class29.method147(var67, var70, true), class29.method147(var67, var72, true), class29.method147(var67, var71, true), class52.method333(var73, var79, (byte) 121), class52.method333(var70, var79, (byte) 31), class52.method333(var72, var79, (byte) 120), class52.method333(var71, var79, (byte) -111), var66, var78);
                            }
                        }
                    }
                }
            }
            class142.field2383[var12] = null;
            class3.field18[var12] = null;
            class57.field954[var12] = null;
            class195.field3263[var12] = null;
            class64.field1039[var12] = null;
        }
        class261.method1774(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class160.field2626[1][var13][var50] & 0x2) == 2) {
                    class179.method1277(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class5.field56[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var14;
                        int var19 = var15;
                        while (var17 > 0 && (class5.field56[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        int var20 = var14;
                        while (var19 < 104 && (class5.field56[var14][var16][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        label351: while (var18 > 0) {
                            for (int var21 = var17; var21 <= var19; var21++) {
                                if ((class5.field56[var18 - 1][var16][var21] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var18--;
                        }
                        label340: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var19; var22++) {
                                if ((class5.field56[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var19 + 1 - var17) * (var20 + 1 - var18);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class172.field2820[var20][var16][var17] - var24;
                            int var26 = class172.field2820[var18][var16][var17];
                            class45.method226(1, var16 * 128, var16 * 128, var17 * 128, var19 * 128 + 128, var25, var26);
                            for (int var27 = var18; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var19; var28++) {
                                    class5.field56[var27][var16][var28] = class191.method1366(class5.field56[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class5.field56[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 < 104 && (class5.field56[var14][var29 + 1][var15] & 0x2) != 0; var29++) {
                        }
                        int var30 = var14;
                        int var31 = var14;
                        int var32;
                        for (var32 = var16; var32 > 0 && (class5.field56[var14][var32 - 1][var15] & 0x2) != 0; var32--) {
                        }
                        label405: while (var31 > 0) {
                            for (int var33 = var32; var33 <= var29; var33++) {
                                if ((class5.field56[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                            var31--;
                        }
                        label394: while (var30 < 3) {
                            for (int var34 = var32; var34 <= var29; var34++) {
                                if ((class5.field56[var30 + 1][var34][var15] & 0x2) == 0) {
                                    break label394;
                                }
                            }
                            var30++;
                        }
                        int var35 = (var30 + 1 - var31) * (var29 + 1 - var32);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class172.field2820[var30][var32][var15] - var36;
                            int var38 = class172.field2820[var31][var32][var15];
                            class45.method226(2, var32 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var30; var39++) {
                                for (int var40 = var32; var40 <= var29; var40++) {
                                    class5.field56[var39][var40][var15] = class191.method1366(class5.field56[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class5.field56[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42;
                        for (var42 = var15; var42 < 104 && (class5.field56[var14][var16][var42 + 1] & 0x4) != 0; var42++) {
                        }
                        int var43 = var15;
                        int var44 = var16;
                        while (var43 > 0 && (class5.field56[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var42; var45++) {
                                if ((class5.field56[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var44 < 104) {
                            for (int var46 = var43; var46 <= var42; var46++) {
                                if ((class5.field56[var14][var44 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var44++;
                        }
                        if ((var44 + 1 - var41) * (var42 + 1 - var43) >= 4) {
                            int var47 = class172.field2820[var14][var41][var43];
                            class45.method226(4, var41 * 128, var44 * 128 + 128, var43 * 128, var42 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var44; var48++) {
                                for (int var49 = var43; var49 <= var42; var49++) {
                                    class5.field56[var14][var48][var49] = class191.method1366(class5.field56[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
    public class255(int arg0) {
        this.field4454 = arg0;
    }
}
