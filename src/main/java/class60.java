import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 extends class222 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "J")
    public long field1014;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lcf;")
    public static class93 field1019 = class147.method1066("", -48);

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1015 = 0;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lg;")
    public static class276 field1013 = new class276(64);

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1021 = 20;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lhg;")
    public static class177 field1018;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[Lcf;")
    public static class93[] field1017;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static void method379(int arg0) {
        field1017 = null;
        field1013 = null;
        field1018 = null;
        int var1 = 16 % ((arg0 - 54) / 61);
        field1019 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([Lvf;IZ)V")
    public static final void method380(class102[] arg0, int arg1, boolean arg2) {
        field1016++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class4.field53[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class4.field53[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method742(var5, var4, 2097152);
                            }
                        }
                    }
                }
            }
            class18.field232 += (int) (Math.random() * 5.0D) - 2;
            if (class18.field232 < -8) {
                class18.field232 = -8;
            }
            if (class18.field232 > 8) {
                class18.field232 = 8;
            }
            class11.field144 += (int) (Math.random() * 5.0D) - 2;
            if (class11.field144 < -16) {
                class11.field144 = -16;
            }
            if (class11.field144 > 16) {
                class11.field144 = 16;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class11.field144 >> 1;
        int var9 = class18.field232 >> 2 << 10;
        if (arg1 != -1) {
            method380((class102[]) null, -117, false);
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class227.field4071[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class233.field4151[var12][var100 + 1][var54] - class233.field4151[var12][var100 - 1][var54];
                    int var102 = class233.field4151[var12][var100][var54 + 1] - class233.field4151[var12][var100][var54 - 1];
                    byte var103 = 74;
                    int var104 = (int) Math.sqrt((double) (var101 * var101 + var102 * var102 + 65536));
                    int var105 = (var101 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var105 * -50 + var106 * -50 + var107 * -10) / var53 + var103;
                    int var109 = (var51[var100][var54 + 1] >> 3) + (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54 + -1] >> 2) + (var51[var100][var54] >> 1);
                    var10[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class167.field2942[var55] = 0;
                class94.field1705[var55] = 0;
                class125.field2223[var55] = 0;
                class135.field2370[var55] = 0;
                client.field2738[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class70.field1283[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class136 var96 = class223.method1545(var95 - 1, 1);
                            class167.field2942[var85] += var96.field2387;
                            class94.field1705[var85] += var96.field2380;
                            class125.field2223[var85] += var96.field2383;
                            class135.field2370[var85] += var96.field2389;
                            var10002 = client.field2738[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class70.field1283[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class136 var99 = class223.method1545(var98 - 1, 1);
                            class167.field2942[var85] -= var99.field2387;
                            class94.field1705[var85] -= var99.field2380;
                            class125.field2223[var85] -= var99.field2383;
                            class135.field2370[var85] -= var99.field2389;
                            var10002 = client.field2738[var85]--;
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
                        int var92 = var91 + 5;
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var86 += class167.field2942[var92];
                            var90 += client.field2738[var92];
                            var89 += class94.field1705[var92];
                            var88 += class135.field2370[var92];
                            var87 += class125.field2223[var92];
                        }
                        if (var93 >= 0) {
                            var90 -= client.field2738[var93];
                            var89 -= class94.field1705[var93];
                            var88 -= class135.field2370[var93];
                            var87 -= class125.field2223[var93];
                            var86 -= class167.field2942[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var11[var56][var91] = class170.method1226(var89 / var90, var87 / var90, arg1 + 25348, var86 * 256 / var88);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class13.method57(2357) || (class4.field53[0][var57][var58] & 0x2) != 0 || (class4.field53[var12][var57][var58] & 0x10) == 0 && class129.method939(var57, var12, false, var58) == class47.field767) {
                        if (class174.field3036 > var12) {
                            class174.field3036 = var12;
                        }
                        int var59 = class70.field1283[var12][var57][var58] & 0xFF;
                        int var60 = class164.field2887[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class233.field4151[var12][var57][var58];
                            int var62 = class233.field4151[var12][var57 + 1][var58];
                            int var63 = class233.field4151[var12][var57][var58 + 1];
                            int var64 = class233.field4151[var12][var57 + 1][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class187.field3447[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class33.method193(0, var60 - 1).field2604) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var64 && var61 == var63) {
                                    class200.field3620[var12][var57][var58] = class270.method1797(class200.field3620[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = -1;
                                var67 = 0;
                            } else {
                                var66 = var11[var57][var58];
                                int var68 = (var66 & 0x7F) + var8;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var9 + var66 & 0xFC00) + (var66 & 0x380) + var68;
                                var67 = class179.field3159[class32.method188(var69, 12345678, 96)];
                            }
                            int var70 = var10[var57][var58];
                            int var71 = var10[var57 + 1][var58];
                            int var72 = var10[var57][var58 + 1];
                            int var73 = var10[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class65.method451(var12, var57, var58, 0, 0, -1, var61, var62, var64, var63, class32.method188(var66, arg1 ^ 0xFF439EB1, var70), class32.method188(var66, 12345678, var71), class32.method188(var66, 12345678, var73), class32.method188(var66, arg1 ^ 0xFF439EB1, var72), 0, 0, 0, 0, var67, 0);
                            } else {
                                byte var74 = class249.field4490[var12][var57][var58];
                                int var75 = class187.field3447[var12][var57][var58] + 1;
                                class148 var76 = class33.method193(0, var60 - 1);
                                int var77 = var76.field2601;
                                if (var77 >= 0 && !class179.field3156.method1418(-74, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class179.field3159[class193.method1381(96, (byte) 123, class179.field3156.method1416((byte) 75, var77))];
                                    var79 = -1;
                                } else if (var76.field2597 == -1) {
                                    var78 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var76.field2597;
                                    int var80 = (var79 & 0x7F) + var8;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var78 = class179.field3159[class193.method1381(96, (byte) 113, var81)];
                                }
                                if (var76.field2607 >= 0) {
                                    int var82 = var76.field2607;
                                    int var83 = (var82 & 0x7F) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var9 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class179.field3159[class193.method1381(96, (byte) 117, var84)];
                                }
                                class65.method451(var12, var57, var58, var75, var74, var77, var61, var62, var64, var63, class32.method188(var66, 12345678, var70), class32.method188(var66, arg1 + 12345679, var71), class32.method188(var66, 12345678, var73), class32.method188(var66, 12345678, var72), class193.method1381(var70, (byte) 113, var79), class193.method1381(var71, (byte) 116, var79), class193.method1381(var73, (byte) 118, var79), class193.method1381(var72, (byte) 114, var79), var67, var78);
                            }
                        }
                    }
                }
            }
            class70.field1283[var12] = null;
            class164.field2887[var12] = null;
            class187.field3447[var12] = null;
            class249.field4490[var12] = null;
            class227.field4071[var12] = null;
        }
        class129.method937(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class4.field53[1][var13][var50] & 0x2) == 2) {
                    class176.method1253(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class200.field3620[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class200.field3620[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18;
                        for (var18 = var15; var18 < 104 && (class200.field3620[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var14;
                        int var20 = var14;
                        label352: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class200.field3620[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class200.field3620[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 + 1 - var17) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class233.field4151[var20][var16][var17] - var24;
                            int var26 = class233.field4151[var19][var16][var17];
                            class195.method1404(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class200.field3620[var27][var16][var28] = class58.method333(class200.field3620[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class200.field3620[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30;
                        for (var30 = var16; var30 < 104 && (class200.field3620[var14][var30 + 1][var15] & 0x2) != 0; var30++) {
                        }
                        while (var29 > 0 && (class200.field3620[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        int var31 = var14;
                        int var32 = var14;
                        label407: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class200.field3620[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var31--;
                        }
                        label396: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class200.field3620[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var30 + 1 - var29) * (var32 - (var31 - 1));
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class233.field4151[var32][var29][var15] - var36;
                            int var38 = class233.field4151[var31][var29][var15];
                            class195.method1404(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class200.field3620[var39][var40][var15] = class58.method333(class200.field3620[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class200.field3620[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44 = var15;
                        while (var43 > 0 && (class200.field3620[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        while (var44 < 104 && (class200.field3620[var14][var16][var44 + 1] & 0x4) != 0) {
                            var44++;
                        }
                        label461: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class200.field3620[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label461;
                                }
                            }
                            var41--;
                        }
                        label450: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class200.field3620[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                            var42++;
                        }
                        if (((var44 + 1 - var43) * (var42 + 1 - var41)) >= 4) {
                            int var47 = class233.field4151[var14][var41][var43];
                            class195.method1404(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class200.field3620[var14][var48][var49] = class58.method333(class200.field3620[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class60() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(J)V")
    public class60(long arg0) {
        this.field1014 = arg0;
    }
}
