import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lsc;")
    public static class128 field3464 = class129.method1017(false, "(U5");

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lsc;")
    private static class128 field3471 = class129.method1017(false, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lsc;")
    public static class128 field3468 = class129.method1017(false, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lsc;")
    public static class128 field3479 = class129.method1017(false, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lsc;")
    public static class128 field3482 = field3471;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Lsc;")
    public static class128 field3481 = class129.method1017(false, ":chalreq:");

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lsc;")
    public static class128 field3462 = field3471;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Z")
    public static boolean field3488 = false;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lsc;")
    public static class128 field3489 = class129.method1017(false, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lhd;")
    public static class53 field3473;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lb;")
    public static class8 field3475;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[B")
    public byte[] field3466;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "[B")
    public byte[] field3485;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lsc;II)V")
    public static final void method1198(class128 arg0, int arg1, int arg2) {
        field3483++;
        class128 var3 = arg0.method1008((byte) 95).method987(arg2 ^ 0x147);
        boolean var4 = false;
        for (int var5 = 0; var5 < class134.field3151; var5++) {
            class53 var6 = class106.field2421[class65.field1441[var5]];
            if (var6 != null && var6.field1050 != null && var6.field1050.method1010(1, var3)) {
                var4 = true;
                class43.method306(var6.field962[0], 0, 0, 1, 2, var6.field989[0], 1, (byte) -2, false, field3473.field989[0], field3473.field962[0], 0);
                if (arg1 == 1) {
                    class150.field3453++;
                    class152.field3502.method507(-98, 115);
                    class152.field3502.method660(class65.field1441[var5], -18562);
                } else if (arg1 == 4) {
                    class152.field3502.method507(59, 106);
                    class152.field3502.method631(class65.field1441[var5], (byte) 115);
                    class104.field2365++;
                } else if (arg1 == 6) {
                    class152.field3502.method507(-122, 120);
                    class159.field3640++;
                    class152.field3502.method660(class65.field1441[var5], -18562);
                } else if (arg1 == 7) {
                    class111.field2492++;
                    class152.field3502.method507(68, 208);
                    class152.field3502.method631(class65.field1441[var5], (byte) 112);
                }
                break;
            }
        }
        if (!var4) {
            class126.method958(0, 1, class18.field323, class51.method395(new class128[] { class62.field1337, var3 }, false));
        }
        if (arg2 != 256) {
            method1201(-50, -108, -31, 115, 79);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field3489 = null;
        field3468 = null;
        field3473 = null;
        field3471 = null;
        field3464 = null;
        field3479 = null;
        int var1 = 75 / ((arg0 + 35) / 48);
        field3475 = null;
        field3462 = null;
        field3481 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z[Lda;Lbe;)V")
    public static final void method1200(boolean arg0, class23[] arg1, class13 arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class110.field2485[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class110.field2485[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method213(var110, var111, (byte) 11);
                        }
                    }
                }
            }
        }
        field3487++;
        class142.field3336 += (int) (Math.random() * 5.0D) - 2;
        if (class142.field3336 < -16) {
            class142.field3336 = -16;
        }
        class113.field2552 += (int) (Math.random() * 5.0D) - 2;
        if (class113.field2552 < -8) {
            class113.field2552 = -8;
        }
        if (class142.field3336 > 16) {
            class142.field3336 = 16;
        }
        if (class113.field2552 > 8) {
            class113.field2552 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class29.field559[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class55.field1229[var4][var101 + 1][var50] - class55.field1229[var4][var101 - 1][var50];
                    int var103 = class55.field1229[var4][var101][var50 + 1] - class55.field1229[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50] >> 1) + (var47[var101][var50 + -1] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 + 1] >> 3);
                    int var109 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    class131.field2999[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class37.field713[var51] = 0;
                class115.field2590[var51] = 0;
                class46.field848[var51] = 0;
                class119.field2686[var51] = 0;
                class63.field1354[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class9.field139[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class118 var97 = class124.method946(var96 - 1, (byte) -115);
                            class37.field713[var55] += var97.field2665;
                            class115.field2590[var55] += var97.field2666;
                            class46.field848[var55] += var97.field2670;
                            class119.field2686[var55] += var97.field2681;
                            var10002 = class63.field1354[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class9.field139[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class118 var100 = class124.method946(var99 - 1, (byte) -67);
                            class37.field713[var55] -= var100.field2665;
                            class115.field2590[var55] -= var100.field2666;
                            class46.field848[var55] -= var100.field2670;
                            class119.field2686[var55] -= var100.field2681;
                            var10002 = class63.field1354[var55]--;
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
                        int var63 = var61 - 5;
                        if (var62 >= 0 && var62 < 104) {
                            var57 += class115.field2590[var62];
                            var56 += class37.field713[var62];
                            var59 += class119.field2686[var62];
                            var58 += class46.field848[var62];
                            var60 += class63.field1354[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var59 -= class119.field2686[var63];
                            var60 -= class63.field1354[var63];
                            var58 -= class46.field848[var63];
                            var57 -= class115.field2590[var63];
                            var56 -= class37.field713[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class110.field2487 || (class110.field2485[0][var52][var61] & 0x2) != 0 || (class110.field2485[var4][var52][var61] & 0x10) == 0 && class100.method763(var4, (byte) -110, var52, var61) == class73.field1634)) {
                            if (var4 < class93.field2146) {
                                class93.field2146 = var4;
                            }
                            int var64 = class9.field139[var4][var52][var61] & 0xFF;
                            int var65 = class16.field305[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class55.field1229[var4][var52][var61];
                                int var67 = class55.field1229[var4][var52 + 1][var61 + 1];
                                int var68 = class55.field1229[var4][var52 + 1][var61];
                                int var69 = class131.field2999[var52 + 1][var61];
                                int var70 = class55.field1229[var4][var52][var61 + 1];
                                int var71 = class131.field2999[var52][var61];
                                int var72 = class131.field2999[var52 + 1][var61 + 1];
                                int var73 = class131.field2999[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var58 / var60;
                                    int var78 = var57 / var60;
                                    var74 = class124.method942(var77, var76, var78, (byte) 61);
                                    int var79 = var76 + class113.field2552 & 0xFF;
                                    int var80 = class142.field3336 + var77;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class124.method942(var80, var79, var78, (byte) 61);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class106.field2418[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class43.method305(-2287, var65 - 1).field3392) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var68 && var66 == var67 && var66 == var70) {
                                        class95.field2229[var4][var52][var61] = class97.method751(class95.field2229[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class114.field2561[class135.method1094(var75, 14077, 96)];
                                }
                                if (var65 == 0) {
                                    arg2.method124(var4, var52, var61, 0, 0, -1, var66, var68, var67, var70, class135.method1094(var74, 14077, var71), class135.method1094(var74, 14077, var69), class135.method1094(var74, 14077, var72), class135.method1094(var74, 14077, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class106.field2418[var4][var52][var61] + 1;
                                    byte var84 = class156.field3585[var4][var52][var61];
                                    class146 var85 = class43.method305(-2287, var65 - 1);
                                    int var86 = var85.field3374;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class114.field2560.method228(!arg0, var86);
                                        var87 = -1;
                                    } else if (var85.field3385 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var90 = -2;
                                    } else {
                                        var87 = class124.method942(var85.field3388, var85.field3381, var85.field3379, (byte) 61);
                                        int var88 = var85.field3388 + class142.field3336;
                                        if (var88 < 0) {
                                            var88 = 0;
                                        } else if (var88 > 255) {
                                            var88 = 255;
                                        }
                                        int var89 = class113.field2552 + var85.field3381 & 0xFF;
                                        var90 = class124.method942(var88, var89, var85.field3379, (byte) 61);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class114.field2561[class9.method69(2, 96, var90)];
                                    }
                                    if (var85.field3387 != -1) {
                                        int var92 = class142.field3336 + var85.field3376;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var93 = class113.field2552 + var85.field3395 & 0xFF;
                                        int var94 = class124.method942(var92, var93, var85.field3393, (byte) 61);
                                        var91 = class114.field2561[class9.method69(2, 96, var94)];
                                    }
                                    arg2.method124(var4, var52, var61, var83, var84, var86, var66, var68, var67, var70, class135.method1094(var74, 14077, var71), class135.method1094(var74, 14077, var69), class135.method1094(var74, 14077, var72), class135.method1094(var74, 14077, var73), class9.method69(2, var71, var87), class9.method69(2, var69, var87), class9.method69(2, var72, var87), class9.method69(2, var73, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method125(var4, var54, var53, class100.method763(var4, (byte) -110, var54, var53));
                }
            }
            class9.field139[var4] = null;
            class16.field305[var4] = null;
            class106.field2418[var4] = null;
            class156.field3585[var4] = null;
            class29.field559[var4] = null;
        }
        arg2.method137(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class110.field2485[1][var5][var46] & 0x2) == 2) {
                    arg2.method122(var5, var46);
                }
            }
        }
        int var6 = 2;
        int var7 = 1;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class95.field2229[var10][var12][var11] & var7) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            while (var13 > 0 && (class95.field2229[var10][var12][var13 - 1] & var7) != 0) {
                                var13--;
                            }
                            int var15;
                            for (var15 = var11; var15 < 104 && (class95.field2229[var10][var12][var15 + 1] & var7) != 0; var15++) {
                            }
                            int var16;
                            label362: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var15; var17++) {
                                    if ((class95.field2229[var16 - 1][var12][var17] & var7) == 0) {
                                        break label362;
                                    }
                                }
                            }
                            label351: while (var14 < var9) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((var7 & class95.field2229[var14 + 1][var12][var18]) == 0) {
                                        break label351;
                                    }
                                }
                                var14++;
                            }
                            int var19 = (var15 + 1 - var13) * (var14 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class55.field1229[var14][var12][var13] - var20;
                                int var22 = class55.field1229[var16][var12][var13];
                                class13.method94(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var14; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class95.field2229[var23][var12][var24] = class25.method224(class95.field2229[var23][var12][var24], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var6 & class95.field2229[var10][var12][var11]) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class95.field2229[var10][var25 - 1][var11] & var6) != 0; var25--) {
                            }
                            int var26;
                            for (var26 = var12; var26 < 104 && (class95.field2229[var10][var26 + 1][var11] & var6) != 0; var26++) {
                            }
                            int var27 = var10;
                            int var28 = var10;
                            label417: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var6 & class95.field2229[var27 - 1][var29][var11]) == 0) {
                                        break label417;
                                    }
                                }
                                var27--;
                            }
                            label406: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class95.field2229[var28 + 1][var30][var11] & var6) == 0) {
                                        break label406;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var26 + 1 - var25) * (var28 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class55.field1229[var28][var25][var11] - var32;
                                int var34 = class55.field1229[var27][var25][var11];
                                class13.method94(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class95.field2229[var35][var36][var11] = class25.method224(class95.field2229[var35][var36][var11], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class95.field2229[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var11;
                            while (var38 > 0 && (class95.field2229[var10][var12][var38 - 1] & var8) != 0) {
                                var38--;
                            }
                            while (var39 < 104 && (var8 & class95.field2229[var10][var12][var39 + 1]) != 0) {
                                var39++;
                            }
                            int var40;
                            label472: for (var40 = var12; var40 > 0; var40--) {
                                for (int var41 = var38; var41 <= var39; var41++) {
                                    if ((class95.field2229[var10][var40 - 1][var41] & var8) == 0) {
                                        break label472;
                                    }
                                }
                            }
                            label461: while (var37 < 104) {
                                for (int var42 = var38; var42 <= var39; var42++) {
                                    if ((var8 & class95.field2229[var10][var37 + 1][var42]) == 0) {
                                        break label461;
                                    }
                                }
                                var37++;
                            }
                            if ((var39 + 1 - var38) * (-var40 + 1 + var37) >= 4) {
                                int var43 = class55.field1229[var10][var40][var38];
                                class13.method94(var9, 4, var40 * 128, var37 * 128 + 128, var38 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var40; var44 <= var37; var44++) {
                                    for (int var45 = var38; var45 <= var39; var45++) {
                                        class95.field2229[var10][var44][var45] = class25.method224(class95.field2229[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method1199(87);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3461++;
        class159 var5 = (class159) class46.field858.method969((long) arg4, arg0 ^ 0xE69);
        if (var5 == null) {
            var5 = new class159();
            class46.field858.method964(false, var5, (long) arg4);
        }
        if (var5.field3641.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3641.length; var8++) {
                var6[var8] = var5.field3641[var8];
                var7[var8] = var5.field3647[var8];
            }
            for (int var9 = var5.field3641.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3647 = var7;
            var5.field3641 = var6;
        }
        var5.field3641[arg3] = arg2;
        var5.field3647[arg3] = arg1;
        if (arg0 != -3598) {
            field3465 = -107;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
    public static final int method1202(byte arg0, int arg1) {
        field3477++;
        if (arg0 != -36) {
            field3476 = 16;
        }
        return arg1 >> 17 & 0x7;
    }
}
