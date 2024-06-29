import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class294 extends class300 {

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4712 = 0;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4715 = "Starting 3d Library";

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field4717 = -1;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static void method1987(int arg0) {
        field4715 = null;
        if (arg0 != 10405) {
            method1989(1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z[Lji;B[[[I)V")
    public static final void method1988(boolean arg0, class99[] arg1, byte arg2, int[][][] arg3) {
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class74.field1121[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class74.field1121[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method676(var5, var6, false);
                            }
                        }
                    }
                }
            }
            class251.field4111 += (int) (Math.random() * 5.0D) - 2;
            class6.field87 += (int) (Math.random() * 5.0D) - 2;
            if (class6.field87 < -16) {
                class6.field87 = -16;
            }
            if (class6.field87 > 16) {
                class6.field87 = 16;
            }
            if (class251.field4111 < -8) {
                class251.field4111 = -8;
            }
            if (class251.field4111 > 8) {
                class251.field4111 = 8;
            }
        }
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field4716++;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class251.field4111 >> 2 << 10;
        int var12 = class6.field87 >> 1;
        if (arg2 >= -10) {
            return;
        }
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class41.field503[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class8.field114[var13][var101 + 1][var55] - class8.field114[var13][var101 - 1][var55];
                    byte var103 = 74;
                    int var104 = class8.field114[var13][var101][var55 + 1] - class8.field114[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var102 * var102 + var104 * var104 + 65536));
                    int var106 = -65536 / var105;
                    int var107 = (var102 << 8) / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var107 * -50 + var106 * -10 + var108 * -50) / var54 + var103;
                    int var110 = (var52[var101][var55] >> 1) + (var52[var101][var55 + 1] >> 3) + (var52[var101][var55 + -1] >> 2) + (var52[var101 + -1][var55] >> 2) + (var52[var101 + 1][var55] >> 3);
                    var10[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class46.field578[var56] = 0;
                class46.field562[var56] = 0;
                class169.field2601[var56] = 0;
                class306.field4884[var56] = 0;
                class268.field4353[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class104.field1520[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class230 var97 = class77.method526(var96 - 1, (byte) -95);
                            class46.field578[var86] += var97.field3558;
                            class46.field562[var86] += var97.field3550;
                            class169.field2601[var86] += var97.field3562;
                            class306.field4884[var86] += var97.field3556;
                            var10002 = class268.field4353[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class104.field1520[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class230 var100 = class77.method526(var99 - 1, (byte) -98);
                            class46.field578[var86] -= var100.field3558;
                            class46.field562[var86] -= var100.field3550;
                            class169.field2601[var86] -= var100.field3562;
                            class306.field4884[var86] -= var100.field3556;
                            var10002 = class268.field4353[var86]--;
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
                            var91 += class306.field4884[var93];
                            var90 += class268.field4353[var93];
                            var87 += class46.field578[var93];
                            var89 += class169.field2601[var93];
                            var88 += class46.field562[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var87 -= class46.field578[var94];
                            var90 -= class268.field4353[var94];
                            var88 -= class46.field562[var94];
                            var91 -= class306.field4884[var94];
                            var89 -= class169.field2601[var94];
                        }
                        if (var92 >= 0 && var90 > 0) {
                            var9[var57][var92] = class181.method1286(var89 / var90, var87 * 256 / var91, -19695, var88 / var90);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg0 || class60.method384(-4) || (class74.field1121[0][var58][var59] & 0x2) != 0 || (class74.field1121[var13][var58][var59] & 0x10) == 0 && class309.method2083(var59, -5293, var58, var13) == class250.field4051) {
                        if (var13 < class211.field3289) {
                            class211.field3289 = var13;
                        }
                        int var60 = class31.field378[var13][var58][var59] & 0xFF;
                        int var61 = class104.field1520[var13][var58][var59] & 0xFF;
                        if (var61 > 0 || var60 > 0) {
                            int var62 = class8.field114[var13][var58 + 1][var59];
                            int var63 = class8.field114[var13][var58 + 1][var59 + 1];
                            int var64 = class8.field114[var13][var58][var59];
                            int var65 = class8.field114[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var61 == 0 && class150.field2211[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var60 > 0 && !class139.method879((byte) 57, var60 - 1).field1574) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var64 && var63 == var64 && var64 == var65) {
                                    class97.field1463[var13][var58][var59] = class243.method1723(class97.field1463[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var61 <= 0) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var9[var58][var59];
                                int var69 = (var68 & 0x7F) + var12;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var68 & 0x380) + (var11 + var68 & 0xFC00) + var69;
                                var67 = class221.field3467[class254.method1805(96, 94, var70)];
                            }
                            int var71 = var10[var58][var59];
                            int var72 = var10[var58 + 1][var59];
                            int var73 = var10[var58 + 1][var59 + 1];
                            int var74 = var10[var58][var59 + 1];
                            if (var60 == 0) {
                                class41.method238(var13, var58, var59, 0, 0, -1, var64, var62, var63, var65, class254.method1805(var71, 123, var68), class254.method1805(var72, 115, var68), class254.method1805(var73, 82, var68), class254.method1805(var74, 85, var68), 0, 0, 0, 0, var67, 0);
                            } else {
                                byte var75 = class268.field4358[var13][var58][var59];
                                int var76 = class150.field2211[var13][var58][var59] + 1;
                                class108 var77 = class139.method879((byte) 57, var60 - 1);
                                int var78 = var77.field1565;
                                if (var78 >= 0 && !class221.field3464.method579(127, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class221.field3467[class271.method1889(96, 255, class221.field3464.method577((byte) 126, var78))];
                                } else if (var77.field1572 == -1) {
                                    var79 = -2;
                                    var80 = 0;
                                } else {
                                    var79 = var77.field1572;
                                    int var81 = (var79 & 0x7F) + var12;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var11 + var79 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class221.field3467[class271.method1889(96, 255, var82)];
                                }
                                if (var77.field1571 >= 0) {
                                    int var83 = var77.field1571;
                                    int var84 = (var83 & 0x7F) + var12;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 + var11 & 0xFC00) + (var83 & 0x380) + var84;
                                    var80 = class221.field3467[class271.method1889(96, 255, var85)];
                                }
                                class41.method238(var13, var58, var59, var76, var75, var78, var64, var62, var63, var65, class254.method1805(var71, 112, var68), class254.method1805(var72, 107, var68), class254.method1805(var73, 87, var68), class254.method1805(var74, 87, var68), class271.method1889(var71, 255, var79), class271.method1889(var72, 255, var79), class271.method1889(var73, 255, var79), class271.method1889(var74, 255, var79), var67, var80);
                            }
                        }
                    }
                }
            }
            class104.field1520[var13] = null;
            class31.field378[var13] = null;
            class150.field2211[var13] = null;
            class268.field4358[var13] = null;
            class41.field503[var13] = null;
        }
        class64.method412(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class74.field1121[1][var14][var51] & 0x2) == 2) {
                    class182.method1294(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class97.field1463[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class97.field1463[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var15;
                        int var20;
                        for (var20 = var16; var20 < 104 && (class97.field1463[var15][var17][var20 + 1] & 0x1) != 0; var20++) {
                        }
                        int var21 = var15;
                        label353: while (var19 > 0) {
                            for (int var22 = var18; var22 <= var20; var22++) {
                                if ((class97.field1463[var19 - 1][var17][var22] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var19--;
                        }
                        label342: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var20; var23++) {
                                if ((class97.field1463[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var20 + 1 - var18) * (var21 + 1 - var19);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class8.field114[var19][var17][var18];
                            int var27 = class8.field114[var21][var17][var18] - var25;
                            class76.method525(1, var17 * 128, var17 * 128, var18 * 128, var20 * 128 + 128, var27, var26);
                            for (int var28 = var19; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var20; var29++) {
                                    class97.field1463[var28][var17][var29] = class205.method1411(class97.field1463[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class97.field1463[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class97.field1463[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var17;
                        int var32 = var15;
                        int var33 = var15;
                        while (var31 < 104 && (class97.field1463[var15][var31 + 1][var16] & 0x2) != 0) {
                            var31++;
                        }
                        label408: while (var32 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class97.field1463[var32 - 1][var34][var16] & 0x2) == 0) {
                                    break label408;
                                }
                            }
                            var32--;
                        }
                        label397: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class97.field1463[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label397;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var31 + 1 - var30) * (var33 + 1 - var32);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class8.field114[var33][var30][var16] - var37;
                            int var39 = class8.field114[var32][var30][var16];
                            class76.method525(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class97.field1463[var40][var41][var16] = class205.method1411(class97.field1463[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class97.field1463[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 > 0 && (class97.field1463[var15][var17][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        int var45;
                        for (var45 = var16; var45 < 104 && (class97.field1463[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label462: while (var43 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class97.field1463[var15][var43 - 1][var46] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var43--;
                        }
                        label451: while (var42 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class97.field1463[var15][var42 + 1][var47] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var42++;
                        }
                        if (((var42 + 1 - var43) * (var45 + 1 - var44)) >= 4) {
                            int var48 = class8.field114[var15][var43][var44];
                            class76.method525(4, var43 * 128, var42 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var43; var49 <= var42; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class97.field1463[var15][var49][var50] = class205.method1411(class97.field1463[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class294() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        field4709++;
        return arg1 == -957953300 ? class5.field73 : null;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        field4714++;
        if (arg0 != -1) {
            field4715 = null;
        }
        if (class42.field506 != -1) {
            class21.method118(-1, class42.field506, -1, false, 69);
            class42.field506 = -1;
        }
    }
}
