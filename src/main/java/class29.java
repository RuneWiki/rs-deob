import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Loa;")
    public static class98 field682 = class38.method349(255, "@yel@*V");

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Loa;")
    public static class98 field684 = class38.method349(255, "Fertigkeit)2");

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Loa;")
    private static class98 field675 = class38.method349(255, "Ok");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field677 = -1;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Loa;")
    public static class98 field674 = field675;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Loa;")
    public static class98 field680 = class38.method349(255, "Entfernen");

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Loa;")
    private static class98 field689 = class38.method349(255, " has logged out)3");

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Z")
    public static boolean field691 = false;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Loa;")
    public static class98 field685 = class38.method349(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Loa;")
    private static class98 field673 = class38.method349(255, "Loaded title screen");

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Loa;")
    public static class98 field678 = field689;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Loa;")
    public static class98 field692 = class38.method349(255, "mapmarker");

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Loa;")
    public static class98 field679 = field673;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    private static int field693 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Loa;")
    private static class98 field694 = class38.method349(255, "Loaded input handler");

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Loa;")
    public static class98 field683 = field694;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
    public static final void method293(byte arg0, int arg1) {
        int var2 = -7 / ((arg0 - 30) / 46);
        for (class86 var3 = (class86) class48.field1085.method10((byte) 54); var3 != null; var3 = (class86) class48.field1085.method14((byte) -96)) {
            if ((var3.field2729 >> 48 & 0xFFFFL) == (long) arg1) {
                var3.method975(-30);
            }
        }
        field687++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public static final void method294(int arg0, int arg1) {
        class31.method303((byte) -24, arg0);
        method293((byte) 116, arg0);
        if (arg1 == 11840) {
            field688++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILta;II)V")
    public static final void method295(int arg0, int arg1, int arg2, class129 arg3, int arg4, int arg5) {
        field676++;
        class126 var6 = new class126();
        var6.field2801 = arg0 * arg4;
        var6.field2818 = arg1 * 128;
        var6.field2823 = arg3.field2950;
        var6.field2819 = arg3.field2977 * 128;
        var6.field2794 = arg2;
        var6.field2800 = arg3.field2975;
        var6.field2817 = arg3.field2980;
        var6.field2811 = arg3.field2992;
        int var7 = arg3.field2993;
        int var8 = arg3.field2991;
        if (arg5 == 1 || arg5 == 3) {
            var8 = arg3.field2993;
            var7 = arg3.field2991;
        }
        var6.field2825 = (arg0 + var7) * 128;
        var6.field2828 = (arg1 + var8) * 128;
        if (arg3.field2932 != null) {
            var6.field2796 = arg3;
            var6.method990(arg4 ^ 0xFFFFFF7F);
        }
        class119.field2656.method508(99, var6);
        if (var6.field2823 != null) {
            var6.field2814 = var6.field2817 + (int) (Math.random() * (double) (var6.field2800 - var6.field2817));
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method296(int arg0) {
        int var1 = class71.field1480.method398(class135.field3299);
        field681++;
        for (int var2 = 0; var2 < class80.field1780; var2++) {
            int var12 = class71.field1480.method384(class32.field781[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class80.field1780 * 15 + 21;
        if (arg0 != 4) {
            return;
        }
        if (class77.field1694 != -1) {
            class71.field1463 = class80.field1780 * 15 + 22;
            int var10 = class150.field3717 - var1 / 2;
            class17.field339 = var1;
            class49.field1099 = 0;
            if (var1 + var10 > 765) {
                var10 = 765 - var1;
            }
            class145.field3529 = true;
            if (var10 < 0) {
                var10 = 0;
            }
            int var11 = class86.field1980;
            class137.field3357 = var10;
            if (var3 + var11 > 503) {
                var11 = 503 - var3;
            }
            if (var11 < 0) {
                var11 = 0;
            }
            class26.field623 = var11;
            return;
        }
        if (class150.field3717 > 4 && class86.field1980 > 4 && class150.field3717 < 516 && class86.field1980 < 338) {
            class17.field339 = var1;
            class49.field1099 = 0;
            class145.field3529 = true;
            int var4 = class86.field1980 - 4;
            int var5 = class150.field3717 - var1 / 2 - 4;
            class71.field1463 = class80.field1780 * 15 + 22;
            if (var5 + var1 > 512) {
                var5 = 512 - var1;
            }
            if (var3 + var4 > 334) {
                var4 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class137.field3357 = var5;
            if (var4 < 0) {
                var4 = 0;
            }
            class26.field623 = var4;
            return;
        }
        if (class150.field3717 > 553 && class86.field1980 > 205 && class150.field3717 < 743 && class86.field1980 < 466) {
            class71.field1463 = class80.field1780 * 15 + 22;
            class17.field339 = var1;
            class145.field3529 = true;
            int var6 = class150.field3717 - var1 / 2 - 553;
            class49.field1099 = 1;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            class137.field3357 = var6;
            int var7 = class86.field1980 - 205;
            if (var7 < 0) {
                var7 = 0;
            } else if (var3 + var7 > 261) {
                var7 = 261 - var3;
            }
            class26.field623 = var7;
            return;
        }
        if (class150.field3717 <= 17 || class86.field1980 <= 357 || class150.field3717 >= 496 || class86.field1980 >= 453) {
            return;
        }
        class71.field1463 = class80.field1780 * 15 + 22;
        class17.field339 = var1;
        class49.field1099 = 2;
        class145.field3529 = true;
        int var8 = class150.field3717 - var1 / 2 - 17;
        int var9 = class86.field1980 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class26.field623 = var9;
        class137.field3357 = var8;
        return;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method297(boolean arg0) {
        field673 = null;
        field675 = null;
        field678 = null;
        field679 = null;
        field692 = null;
        if (!arg0) {
            method293((byte) -20, -16);
        }
        field685 = null;
        field684 = null;
        field682 = null;
        field674 = null;
        field694 = null;
        field680 = null;
        field689 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B[Lwc;Ld;)V")
    public static final void method298(byte arg0, class149[] arg1, class22 arg2) {
        field690++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class80.field1771[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class80.field1771[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method1188((byte) -68, var111, var110);
                        }
                    }
                }
            }
        }
        field693 += (int) (Math.random() * 5.0D) - 2;
        if (field693 < -8) {
            field693 = -8;
        }
        class123.field2727 += (int) (Math.random() * 5.0D) - 2;
        if (class123.field2727 < -16) {
            class123.field2727 = -16;
        }
        if (field693 > 8) {
            field693 = 8;
        }
        if (class123.field2727 > 16) {
            class123.field2727 = 16;
        }
        int var4 = 0;
        if (arg0 < 118) {
            return;
        }
        while (var4 < 4) {
            byte[][] var47 = class139.field3392[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class25.field616[var4][var101][var50 + 1] - class25.field616[var4][var101][var50 - 1];
                    int var103 = class25.field616[var4][var101 + 1][var50] - class25.field616[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -50 + var106 * -10) / var49 + 96;
                    int var109 = (var47[var101][var50 - 1] >> 2) + (var47[var101 - 1][var50] >> 2) + (var47[var101][var50] >> 1) + (var47[var101][var50 + 1] >> 3) + (var47[var101 + 1][var50] >> 3);
                    class44.field1000[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class127.field2864[var51] = 0;
                class18.field402[var51] = 0;
                class44.field1001[var51] = 0;
                class78.field1722[var51] = 0;
                class65.field1399[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class51.field1126[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class97 var97 = class3.method16(var96 - 1, (byte) 20);
                            class127.field2864[var55] += var97.field2229;
                            class18.field402[var55] += var97.field2222;
                            class44.field1001[var55] += var97.field2232;
                            class78.field1722[var55] += var97.field2243;
                            var10002 = class65.field1399[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class51.field1126[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class97 var100 = class3.method16(var99 - 1, (byte) 54);
                            class127.field2864[var55] -= var100.field2229;
                            class18.field402[var55] -= var100.field2222;
                            class44.field1001[var55] -= var100.field2232;
                            class78.field1722[var55] -= var100.field2243;
                            var10002 = class65.field1399[var55]--;
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
                            var56 += class18.field402[var62];
                            var60 += class65.field1399[var62];
                            var58 += class78.field1722[var62];
                            var59 += class44.field1001[var62];
                            var57 += class127.field2864[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class65.field1399[var63];
                            var56 -= class18.field402[var63];
                            var58 -= class78.field1722[var63];
                            var57 -= class127.field2864[var63];
                            var59 -= class44.field1001[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class94.field2151 || (class80.field1771[0][var52][var61] & 0x2) != 0 || (class80.field1771[var4][var52][var61] & 0x10) == 0 && class102.method841(-70, var61, var4, var52) == class17.field346)) {
                            if (var4 < class80.field1792) {
                                class80.field1792 = var4;
                            }
                            int var64 = class51.field1126[var4][var52][var61] & 0xFF;
                            int var65 = class21.field450[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class25.field616[var4][var52][var61];
                                int var67 = class25.field616[var4][var52 + 1][var61 + 1];
                                int var68 = class25.field616[var4][var52 + 1][var61];
                                int var69 = class25.field616[var4][var52][var61 + 1];
                                int var70 = class44.field1000[var52][var61];
                                int var71 = class44.field1000[var52 + 1][var61];
                                int var72 = class44.field1000[var52 + 1][var61 + 1];
                                int var73 = class44.field1000[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var57 * 256 / var58;
                                    int var77 = var59 / var60;
                                    int var78 = var56 / var60;
                                    var74 = class87.method713(var76, -193, var77, var78);
                                    int var79 = class123.field2727 + var77;
                                    int var80 = field693 + var76 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var75 = class87.method713(var80, -193, var79, var78);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class138.field3366[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class87.method712(4, var65 - 1).field1277) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var68 && var66 == var67 && var66 == var69) {
                                        class88.field2026[var4][var52][var61] = class94.method751(class88.field2026[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class66.field1405[class141.method1134((byte) 33, var75, 96)];
                                }
                                if (var65 == 0) {
                                    arg2.method217(var4, var52, var61, 0, 0, -1, var66, var68, var67, var69, class141.method1134((byte) 33, var74, var70), class141.method1134((byte) 33, var74, var71), class141.method1134((byte) 33, var74, var72), class141.method1134((byte) 33, var74, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class138.field3366[var4][var52][var61] + 1;
                                    byte var84 = class51.field1117[var4][var52][var61];
                                    class58 var85 = class87.method712(4, var65 - 1);
                                    int var86 = var85.field1302;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class66.field1408.method314(var86, -31720);
                                        var88 = -1;
                                    } else if (var85.field1290 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var88 = class87.method713(var85.field1282, -193, var85.field1294, var85.field1287);
                                        int var89 = var85.field1294 + class123.field2727;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        int var90 = field693 + var85.field1282 & 0xFF;
                                        var87 = class87.method713(var90, -193, var89, var85.field1287);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class66.field1405[class96.method769(16777215, var87, 96)];
                                    }
                                    if (var85.field1286 != -1) {
                                        int var92 = var85.field1292 + field693 & 0xFF;
                                        int var93 = class123.field2727 + var85.field1295;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class87.method713(var92, -193, var93, var85.field1307);
                                        var91 = class66.field1405[class96.method769(16777215, var94, 96)];
                                    }
                                    arg2.method217(var4, var52, var61, var83, var84, var86, var66, var68, var67, var69, class141.method1134((byte) 33, var74, var70), class141.method1134((byte) 33, var74, var71), class141.method1134((byte) 33, var74, var72), class141.method1134((byte) 33, var74, var73), class96.method769(16777215, var88, var70), class96.method769(16777215, var88, var71), class96.method769(16777215, var88, var72), class96.method769(16777215, var88, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method236(var4, var54, var53, class102.method841(-78, var53, var4, var54));
                }
            }
            class51.field1126[var4] = null;
            class21.field450[var4] = null;
            class138.field3366[var4] = null;
            class51.field1117[var4] = null;
            class139.field3392[var4] = null;
            var4++;
        }
        arg2.method260(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class80.field1771[1][var5][var46] & 0x2) == 2) {
                    arg2.method218(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class88.field2026[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class88.field2026[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (class88.field2026[var10][var12][var14 + 1] & var6) != 0; var14++) {
                            }
                            int var15;
                            label357: for (var15 = var10; var15 > 0; var15--) {
                                for (int var16 = var13; var16 <= var14; var16++) {
                                    if ((var6 & class88.field2026[var15 - 1][var12][var16]) == 0) {
                                        break label357;
                                    }
                                }
                            }
                            int var17;
                            label345: for (var17 = var10; var17 < var9; var17++) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class88.field2026[var17 + 1][var12][var18] & var6) == 0) {
                                        break label345;
                                    }
                                }
                            }
                            int var19 = (var17 + 1 - var15) * (var14 + 1 + -var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class25.field616[var17][var12][var13] - var20;
                                int var22 = class25.field616[var15][var12][var13];
                                class22.method230(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var17; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class88.field2026[var23][var12][var24] = class150.method1211(class88.field2026[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class88.field2026[var10][var12][var11] & var8) != 0) {
                            int var25 = var12;
                            int var26 = var10;
                            int var27;
                            for (var27 = var12; var27 < 104 && (class88.field2026[var10][var27 + 1][var11] & var8) != 0; var27++) {
                            }
                            while (var25 > 0 && (class88.field2026[var10][var25 - 1][var11] & var8) != 0) {
                                var25--;
                            }
                            int var28 = var10;
                            label412: while (var26 > 0) {
                                for (int var29 = var25; var29 <= var27; var29++) {
                                    if ((class88.field2026[var26 - 1][var29][var11] & var8) == 0) {
                                        break label412;
                                    }
                                }
                                var26--;
                            }
                            label401: while (var9 > var28) {
                                for (int var30 = var25; var30 <= var27; var30++) {
                                    if ((class88.field2026[var28 + 1][var30][var11] & var8) == 0) {
                                        break label401;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var26) * (-var25 + var27 + 1);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class25.field616[var28][var25][var11] - var32;
                                int var34 = class25.field616[var26][var25][var11];
                                class22.method230(var9, 2, var25 * 128, var27 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var27; var36++) {
                                        class88.field2026[var35][var36][var11] = class150.method1211(class88.field2026[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class88.field2026[var10][var12][var11] & var7) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; var38 > 0 && (class88.field2026[var10][var12][var38 - 1] & var7) != 0; var38--) {
                            }
                            int var39;
                            for (var39 = var11; var39 < 104 && (class88.field2026[var10][var12][var39 + 1] & var7) != 0; var39++) {
                            }
                            int var40;
                            label466: for (var40 = var12; var40 > 0; var40--) {
                                for (int var41 = var38; var41 <= var39; var41++) {
                                    if ((var7 & class88.field2026[var10][var40 - 1][var41]) == 0) {
                                        break label466;
                                    }
                                }
                            }
                            label455: while (var37 < 104) {
                                for (int var42 = var38; var42 <= var39; var42++) {
                                    if ((var7 & class88.field2026[var10][var37 + 1][var42]) == 0) {
                                        break label455;
                                    }
                                }
                                var37++;
                            }
                            if ((var39 + 1 - var38) * (-var40 + 1 + var37) >= 4) {
                                int var43 = class25.field616[var10][var40][var38];
                                class22.method230(var9, 4, var40 * 128, var37 * 128 + 128, var38 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var40; var44 <= var37; var44++) {
                                    for (int var45 = var38; var45 <= var39; var45++) {
                                        class88.field2026[var10][var44][var45] = class150.method1211(class88.field2026[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
