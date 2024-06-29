import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static volatile int field2754 = -1;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lid;")
    public static class60 field2750 = class11.method72("und Ihr Passwort ein)3", (byte) 111);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lid;")
    public static class60 field2751 = class11.method72("mapedge", (byte) 100);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2757 = 1;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lid;")
    public static class60 field2758 = class11.method72("Lade)3)3)3", (byte) 95);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lie;")
    public static class61 field2748;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[Lpb;BIIIIII)V")
    public static final void method933(int arg0, byte[] arg1, class106[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2755++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg7 + var15 > 0 && arg7 + var15 < 103) {
                    arg2[arg9].field2602[arg4 + var10][arg7 + var15] = class80.method680(arg2[arg9].field2602[arg4 + var10][arg7 + var15], -16777217);
                }
            }
        }
        class103 var11 = new class103(arg1);
        if (arg3 != -51) {
            method936(46, (byte) 67);
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && arg8 <= var13 && arg8 + 8 > var13 && var14 >= arg0 && arg0 + 8 > var14) {
                        class135.method1058(arg5, 0, arg7 + class100.method787(arg5, var13 & 0x7, var14 & 0x7, 56), 0, class45.method354(77, var13 & 0x7, arg5, var14 & 0x7) + arg4, 21, var11, arg9);
                    } else {
                        class135.method1058(0, 0, -1, 0, -1, arg3 ^ -72, var11, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLl;[Lpb;)V")
    public static final void method934(byte arg0, class76 arg1, class106[] arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class124.field2869[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class124.field2869[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method874(2097152, var110, var111);
                        }
                    }
                }
            }
        }
        field2753++;
        class50.field1282 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 < 103) {
            return;
        }
        if (class50.field1282 < -8) {
            class50.field1282 = -8;
        }
        class155.field3530 += (int) (Math.random() * 5.0D) - 2;
        if (class50.field1282 > 8) {
            class50.field1282 = 8;
        }
        if (class155.field3530 < -16) {
            class155.field3530 = -16;
        }
        if (class155.field3530 > 16) {
            class155.field3530 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class77.field1889[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class113.field2711[var4][var101 + 1][var50] - class113.field2711[var4][var101 - 1][var50];
                    int var103 = class113.field2711[var4][var101][var50 + 1] - class113.field2711[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50 + 1] >> 3) + ((var47[var101 - 1][var50] >> 2) - (-(var47[var101 + 1][var50] >> 3) - ((var47[var101][var50 - 1] >> 2) + (var47[var101][var50] >> 1))));
                    class97.field2377[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class18.field459[var51] = 0;
                class132.field2995[var51] = 0;
                class106.field2596[var51] = 0;
                class87.field2174[var51] = 0;
                class116.field2736[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class152.field3417[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class132 var97 = class18.method150(57, var96 - 1);
                            class18.field459[var55] += var97.field3004;
                            class132.field2995[var55] += var97.field3002;
                            class106.field2596[var55] += var97.field3003;
                            class87.field2174[var55] += var97.field2990;
                            var10002 = class116.field2736[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class152.field3417[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class132 var100 = class18.method150(-127, var99 - 1);
                            class18.field459[var55] -= var100.field3004;
                            class132.field2995[var55] -= var100.field3002;
                            class106.field2596[var55] -= var100.field3003;
                            class87.field2174[var55] -= var100.field2990;
                            var10002 = class116.field2736[var55]--;
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
                            var58 += class106.field2596[var62];
                            var57 += class132.field2995[var62];
                            var56 += class18.field459[var62];
                            var60 += class87.field2174[var62];
                            var59 += class116.field2736[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var56 -= class18.field459[var63];
                            var59 -= class116.field2736[var63];
                            var57 -= class132.field2995[var63];
                            var58 -= class106.field2596[var63];
                            var60 -= class87.field2174[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class22.field548 || (class124.field2869[0][var52][var61] & 0x2) != 0 || (class124.field2869[var4][var52][var61] & 0x10) == 0 && class32.method241(var52, var4, var61, -101) == class153.field3423)) {
                            if (class7.field95 > var4) {
                                class7.field95 = var4;
                            }
                            int var64 = class152.field3417[var4][var52][var61] & 0xFF;
                            int var65 = class22.field520[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class113.field2711[var4][var52][var61];
                                int var67 = class113.field2711[var4][var52 + 1][var61 + 1];
                                int var68 = class113.field2711[var4][var52 + 1][var61];
                                int var69 = class97.field2377[var52][var61];
                                int var70 = class113.field2711[var4][var52][var61 + 1];
                                int var71 = class97.field2377[var52 + 1][var61 + 1];
                                int var72 = class97.field2377[var52 + 1][var61];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class97.field2377[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var57 / var59;
                                    int var78 = var58 / var59;
                                    var73 = class10.method67(false, var78, var77, var76);
                                    int var79 = class155.field3530 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class50.field1282 + var76 & 0xFF;
                                    var74 = class10.method67(false, var79, var77, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class8.field117[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class35.method261(false, var65 - 1).field2974) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var68 && var66 == var67 && var66 == var70) {
                                        class55.field1380[var4][var52][var61] = class97.method769(class55.field1380[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class127.field2904[class21.method166(var74, 96, (byte) -85)];
                                }
                                if (var65 == 0) {
                                    arg1.method596(var4, var52, var61, 0, 0, -1, var66, var68, var67, var70, class21.method166(var73, var69, (byte) -85), class21.method166(var73, var72, (byte) -85), class21.method166(var73, var71, (byte) -85), class21.method166(var73, var75, (byte) -85), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class18.field458[var4][var52][var61];
                                    int var84 = class8.field117[var4][var52][var61] + 1;
                                    class131 var85 = class35.method261(false, var65 - 1);
                                    int var86 = var85.field2979;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class127.field2914.method911((byte) 58, var86);
                                        var88 = -1;
                                    } else if (var85.field2965 == 16711935) {
                                        var86 = -1;
                                        var87 = -2;
                                        var88 = -2;
                                    } else {
                                        var88 = class10.method67(false, var85.field2967, var85.field2978, var85.field2969);
                                        int var89 = class50.field1282 + var85.field2969 & 0xFF;
                                        int var90 = var85.field2967 + class155.field3530;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class10.method67(false, var90, var85.field2978, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class127.field2904[class38.method294(var87, 127, 96)];
                                    }
                                    if (var85.field2976 != -1) {
                                        int var92 = class50.field1282 + var85.field2975 & 0xFF;
                                        int var93 = class155.field3530 + var85.field2973;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class10.method67(false, var93, var85.field2984, var92);
                                        var91 = class127.field2904[class38.method294(var94, 127, 96)];
                                    }
                                    arg1.method596(var4, var52, var61, var84, var83, var86, var66, var68, var67, var70, class21.method166(var73, var69, (byte) -85), class21.method166(var73, var72, (byte) -85), class21.method166(var73, var71, (byte) -85), class21.method166(var73, var75, (byte) -85), class38.method294(var88, 127, var69), class38.method294(var88, 127, var72), class38.method294(var88, 127, var71), class38.method294(var88, 127, var75), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method608(var4, var54, var53, class32.method241(var54, var4, var53, -123));
                }
            }
            class152.field3417[var4] = null;
            class22.field520[var4] = null;
            class8.field117[var4] = null;
            class18.field458[var4] = null;
            class77.field1889[var4] = null;
        }
        arg1.method573(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class124.field2869[1][var5][var46] & 0x2) == 2) {
                    arg1.method620(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
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
                        if ((var6 & class55.field1380[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class55.field1380[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (var6 & class55.field1380[var10][var12][var14 + 1]) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16;
                            label356: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((var6 & class55.field1380[var16 - 1][var12][var17]) == 0) {
                                        break label356;
                                    }
                                }
                            }
                            label345: while (var9 > var15) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class55.field1380[var15 + 1][var12][var18] & var6) == 0) {
                                        break label345;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var15 + 1 - var16) * (-var13 + 1 + var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class113.field2711[var15][var12][var13] - var20;
                                int var22 = class113.field2711[var16][var12][var13];
                                class76.method579(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class55.field1380[var23][var12][var24] = class80.method680(class55.field1380[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class55.field1380[var10][var12][var11] & var7) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var7 & class55.field1380[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26;
                            for (var26 = var12; var26 < 104 && (var7 & class55.field1380[var10][var26 + 1][var11]) != 0; var26++) {
                            }
                            int var27 = var10;
                            int var28 = var10;
                            label411: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var7 & class55.field1380[var27 - 1][var29][var11]) == 0) {
                                        break label411;
                                    }
                                }
                                var27--;
                            }
                            label400: while (var9 > var28) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class55.field1380[var28 + 1][var30][var11]) == 0) {
                                        break label400;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var26 + 1 + -var25);
                            if (var31 >= 8) {
                                int var32 = class113.field2711[var27][var25][var11];
                                short var33 = 240;
                                int var34 = class113.field2711[var28][var25][var11] - var33;
                                class76.method579(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var32);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class55.field1380[var35][var36][var11] = class80.method680(class55.field1380[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class55.field1380[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (class55.field1380[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            while (var39 > 0 && (class55.field1380[var10][var12][var39 - 1] & var8) != 0) {
                                var39--;
                            }
                            label466: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var8 & class55.field1380[var10][var37 - 1][var41]) == 0) {
                                        break label466;
                                    }
                                }
                                var37--;
                            }
                            label455: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class55.field1380[var10][var38 + 1][var42] & var8) == 0) {
                                        break label455;
                                    }
                                }
                                var38++;
                            }
                            if ((var40 + 1 - var39) * (-var37 + var38 + 1) >= 4) {
                                int var43 = class113.field2711[var10][var37][var39];
                                class76.method579(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class55.field1380[var10][var44][var45] = class80.method680(class55.field1380[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lie;BLid;Lid;)[Le;")
    public static final class29[] method935(class61 arg0, byte arg1, class60 arg2, class60 arg3) {
        if (arg1 > -72) {
            field2758 = null;
        }
        field2761++;
        int var4 = arg0.method482(13975, arg2);
        int var5 = arg0.method464((byte) -113, arg3, var4);
        return class44.method345(var4, arg0, -93, var5);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method936(int arg0, byte arg1) {
        int var2 = 14 / ((-arg1 - 26) / 40);
        field2752++;
        for (class62 var3 = (class62) class101.field2457.method713(12421); var3 != null; var3 = (class62) class101.field2457.method711(121)) {
            if ((var3.field2929 >> 48 & 0xFFFFL) == (long) arg0) {
                var3.method1009((byte) 60);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method937(int arg0) {
        field2760++;
        class145 var1 = class133.field3041;
        synchronized (class133.field3041) {
            class1.field34 = class89.field2204;
            if (class52.field1315 >= 0) {
                while (class52.field1315 != class22.field545) {
                    int var3 = class154.field3500[class22.field545];
                    class22.field545 = class22.field545 + 1 & 0x7F;
                    if (var3 < 0) {
                        class61.field1512[~var3] = false;
                    } else {
                        class61.field1512[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class61.field1512[var2] = false;
                }
                class52.field1315 = class22.field545;
            }
            class89.field2204 = class146.field3282;
        }
        if (arg0 < 8) {
            method934((byte) -106, null, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method938(byte arg0) {
        field2748 = null;
        if (arg0 != 92) {
            method933(118, null, null, (byte) 106, -49, -89, -67, -36, -77, -77);
        }
        field2750 = null;
        field2751 = null;
        field2758 = null;
    }
}
