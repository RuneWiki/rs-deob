import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class80 {

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field1284 = 0;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
    private boolean field1292 = false;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field1289 = 0;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
    public static volatile boolean field1281 = true;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "J")
    public long field1287;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lfg;")
    public static class13 field1296;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[I")
    public static int[] field1286;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1288;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        this.field1299 = class136.field2193[this.field1279];
        field1297++;
        this.field1278 = (int) Math.sqrt((double) (this.field1293 * this.field1293 + this.field1295 * this.field1295 + this.field1291 * this.field1291));
        int var2 = -19 / ((arg0 + 5) / 41);
        if (this.field1285 == 0) {
            this.field1285 = 1;
        }
        if (this.field1280 == 0) {
            this.field1287 = 2147483647L;
        } else if (this.field1280 == 1) {
            this.field1287 = (long) (this.field1278 * 8 / this.field1285);
            this.field1287 *= this.field1287;
        } else if (this.field1280 == 2) {
            this.field1287 = (long) (this.field1278 * 8 / this.field1285);
        }
        if (this.field1292) {
            this.field1278 *= -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfj;B)V")
    public final void method577(class274 arg0, byte arg1) {
        field1302++;
        if (arg1 < 60) {
            method578((int[][][]) null, (class55[]) null, true, 47);
        }
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                return;
            }
            this.method580(var3, arg0, -8);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([[[I[Lkb;ZI)V")
    public static final void method578(int[][][] arg0, class55[] arg1, boolean arg2, int arg3) {
        field1290++;
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class214.field3386[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class214.field3386[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method359(var7, var6, true);
                            }
                        }
                    }
                }
            }
            class106.field1654 += (int) (Math.random() * 5.0D) - 2;
            class44.field658 += (int) (Math.random() * 5.0D) - 2;
            if (class44.field658 < -8) {
                class44.field658 = -8;
            }
            if (class44.field658 > 8) {
                class44.field658 = 8;
            }
            if (class106.field1654 < -16) {
                class106.field1654 = -16;
            }
            if (class106.field1654 > 16) {
                class106.field1654 = 16;
            }
        }
        int var9 = class44.field658 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = class106.field1654 >> 1;
        int var13 = 0;
        if (arg3 >= 0) {
            method578((int[][][]) null, (class55[]) null, true, -127);
        }
        while (var4 > var13) {
            byte[][] var52 = class255.field4213[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class166.field2746[var13][var101 + 1][var55] - class166.field2746[var13][var101 - 1][var55];
                    int var104 = class166.field2746[var13][var101][var55 + 1] - class166.field2746[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var108 * -50 + var106 * -50 + var107 * -10) / var54 + var102;
                    int var110 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55] >> 1) + (var52[var101 - 1][var55] >> 2) + (var52[var101 - -1][var55] >> 3);
                    var11[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class48.field702[var56] = 0;
                class169.field2769[var56] = 0;
                class33.field549[var56] = 0;
                class166.field2750[var56] = 0;
                class159.field2599[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class250.field4102[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class97 var97 = class152.method1028((byte) -103, var96 - 1);
                            class48.field702[var86] += var97.field1531;
                            class169.field2769[var86] += var97.field1529;
                            class33.field549[var86] += var97.field1522;
                            class166.field2750[var86] += var97.field1536;
                            var10002 = class159.field2599[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class250.field4102[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class97 var100 = class152.method1028((byte) -127, var99 - 1);
                            class48.field702[var86] -= var100.field1531;
                            class169.field2769[var86] -= var100.field1529;
                            class33.field549[var86] -= var100.field1522;
                            class166.field2750[var86] -= var100.field1536;
                            var10002 = class159.field2599[var86]--;
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
                            var88 += class169.field2769[var93];
                            var87 += class48.field702[var93];
                            var90 += class166.field2750[var93];
                            var89 += class33.field549[var93];
                            var91 += class159.field2599[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var87 -= class48.field702[var94];
                            var89 -= class33.field549[var94];
                            var91 -= class159.field2599[var94];
                            var88 -= class169.field2769[var94];
                            var90 -= class166.field2750[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var10[var57][var92] = class65.method430(var89 / var91, var87 * 256 / var90, true, var88 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg2 || class143.method981(22351) || (class214.field3386[0][var58][var59] & 0x2) != 0 || (class214.field3386[var13][var58][var59] & 0x10) == 0 && class250.method1703(var13, false, var59, var58) == class87.field1367) {
                        if (class272.field4390 > var13) {
                            class272.field4390 = var13;
                        }
                        int var60 = class27.field480[var13][var58][var59] & 0xFF;
                        int var61 = class250.field4102[var13][var58][var59] & 0xFF;
                        if (var61 > 0 || var60 > 0) {
                            int var62 = class166.field2746[var13][var58][var59];
                            int var63 = class166.field2746[var13][var58][var59 + 1];
                            int var64 = class166.field2746[var13][var58 + 1][var59 + 1];
                            int var65 = class166.field2746[var13][var58 + 1][var59];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var61 == 0 && class202.field3280[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var60 > 0 && !class251.method1705(var60 - 1, (byte) 50).field1745) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var65 && var62 == var64 && var62 == var63) {
                                    class44.field657[var13][var58][var59] = class76.method555(class44.field657[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var61 <= 0) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var10[var58][var59];
                                int var69 = (var68 & 0x7F) + var12;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var9 + var68 & 0xFC00) + (var68 & 0x380) + var69;
                                var67 = class136.field2192[class41.method286(var70, 96, 32)];
                            }
                            int var71 = var11[var58][var59];
                            int var72 = var11[var58 + 1][var59 + 1];
                            int var73 = var11[var58][var59 + 1];
                            int var74 = var11[var58 + 1][var59];
                            if (var60 == 0) {
                                class24.method193(var13, var58, var59, 0, 0, -1, var62, var65, var64, var63, class41.method286(var68, var71, 32), class41.method286(var68, var74, 32), class41.method286(var68, var72, 32), class41.method286(var68, var73, 32), 0, 0, 0, 0, var67, 0);
                            } else {
                                int var75 = class202.field3280[var13][var58][var59] + 1;
                                byte var76 = class68.field1084[var13][var58][var59];
                                class114 var77 = class251.method1705(var60 - 1, (byte) 50);
                                int var78 = var77.field1741;
                                if (var78 >= 0 && !class136.field2196.method1025((byte) -123, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class136.field2192[class24.method197(class136.field2196.method1027((byte) 87, var78), 55, 96)];
                                } else if (var77.field1738 == -1) {
                                    var80 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var77.field1738;
                                    int var81 = (var79 & 0x7F) + var12;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class136.field2192[class24.method197(var82, 89, 96)];
                                }
                                if (var77.field1739 >= 0) {
                                    int var83 = var77.field1739;
                                    int var84 = (var83 & 0x7F) + var12;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 & 0x380) + ((var83 + var9 & 0xFC00) + var84);
                                    var80 = class136.field2192[class24.method197(var85, 49, 96)];
                                }
                                class24.method193(var13, var58, var59, var75, var76, var78, var62, var65, var64, var63, class41.method286(var68, var71, 32), class41.method286(var68, var74, 32), class41.method286(var68, var72, 32), class41.method286(var68, var73, 32), class24.method197(var79, 83, var71), class24.method197(var79, 69, var74), class24.method197(var79, 83, var72), class24.method197(var79, 43, var73), var67, var80);
                            }
                        }
                    }
                }
            }
            class250.field4102[var13] = null;
            class27.field480[var13] = null;
            class202.field3280[var13] = null;
            class68.field1084[var13] = null;
            class255.field4213[var13] = null;
            var13++;
        }
        class278.method1898(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class214.field3386[1][var14][var51] & 0x2) == 2) {
                    class12.method99(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class44.field657[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19 = var16;
                        int var20 = var15;
                        while (var18 > 0 && (class44.field657[var15][var17][var18 - 1] & 0x1) != 0) {
                            var18--;
                        }
                        while (var19 < 104 && (class44.field657[var15][var17][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        int var21 = var15;
                        label350: while (var20 > 0) {
                            for (int var22 = var18; var22 <= var19; var22++) {
                                if ((class44.field657[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label350;
                                }
                            }
                            var20--;
                        }
                        label339: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class44.field657[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label339;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var19 + 1 - var18) * (var21 + 1 - var20);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class166.field2746[var21][var17][var18] - var25;
                            int var27 = class166.field2746[var20][var17][var18];
                            class219.method1492(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var26, var27);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class44.field657[var28][var17][var29] = class233.method1609(class44.field657[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class44.field657[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31;
                        for (var31 = var17; var31 < 104 && (class44.field657[var15][var31 + 1][var16] & 0x2) != 0; var31++) {
                        }
                        int var32 = var15;
                        while (var30 > 0 && (class44.field657[var15][var30 - 1][var16] & 0x2) != 0) {
                            var30--;
                        }
                        int var33;
                        label404: for (var33 = var15; var33 > 0; var33--) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class44.field657[var33 - 1][var34][var16] & 0x2) == 0) {
                                    break label404;
                                }
                            }
                        }
                        label393: while (var32 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class44.field657[var32 + 1][var35][var16] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                            var32++;
                        }
                        int var36 = (var31 + 1 - var30) * (var32 + 1 - var33);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class166.field2746[var33][var30][var16];
                            int var39 = class166.field2746[var32][var30][var16] - var37;
                            class219.method1492(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var39, var38);
                            for (int var40 = var33; var40 <= var32; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class44.field657[var40][var41][var16] = class233.method1609(class44.field657[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class44.field657[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 < 104 && (class44.field657[var15][var17][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        int var45;
                        for (var45 = var16; var45 > 0 && (class44.field657[var15][var17][var45 - 1] & 0x4) != 0; var45--) {
                        }
                        label459: while (var42 > 0) {
                            for (int var46 = var45; var46 <= var44; var46++) {
                                if ((class44.field657[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var42--;
                        }
                        label448: while (var43 < 104) {
                            for (int var47 = var45; var47 <= var44; var47++) {
                                if ((class44.field657[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var43++;
                        }
                        if (((var43 + 1 - var42) * (var44 + 1 - var45)) >= 4) {
                            int var48 = class166.field2746[var15][var42][var45];
                            class219.method1492(4, var42 * 128, var43 * 128 + 128, var45 * 128, var44 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var45; var50 <= var44; var50++) {
                                    class44.field657[var15][var49][var50] = class233.method1609(class44.field657[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method579(boolean arg0) {
        field1286 = null;
        field1288 = null;
        field1296 = null;
        if (!arg0) {
            field1286 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILfj;I)V")
    private final void method580(int arg0, class274 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1279 = arg1.method1837(252);
        } else if (arg0 == 2) {
            arg1.method1849(255);
        } else if (arg0 == 3) {
            this.field1295 = arg1.method1833((byte) -104);
            this.field1291 = arg1.method1833((byte) -104);
            this.field1293 = arg1.method1833((byte) -104);
        } else if (arg0 == 4) {
            this.field1280 = arg1.method1849(255);
            this.field1285 = arg1.method1833((byte) -104);
        } else if (arg0 == 6) {
            this.field1282 = arg1.method1849(255);
        } else if (arg0 == 8) {
            this.field1289 = 1;
        } else if (arg0 == 9) {
            this.field1284 = 1;
        } else if (arg0 == 10) {
            this.field1292 = true;
        }
        field1283++;
        if (arg2 != -8) {
            method578((int[][][]) null, (class55[]) null, true, -55);
        }
    }
}
