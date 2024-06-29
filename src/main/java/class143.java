import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class143 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lsg;")
    public static class169 field2660 = class165.method1060("me", 1536);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lsg;")
    public static class169 field2661 = class165.method1060("blaugr-Un:", 1536);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lsg;")
    public static class169 field2659 = class165.method1060("rot:", 1536);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public static int[] field2657 = new int[5];

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lsg;")
    private static class169 field2663 = class165.method1060("scroll:", 1536);

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lsg;")
    public static class169 field2666 = field2663;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lsg;")
    public static class169 field2665 = field2663;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[Lbg;")
    public static class18[] field2667;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method946(boolean arg0) {
        field2659 = null;
        field2657 = null;
        field2665 = null;
        field2666 = null;
        field2660 = null;
        field2663 = null;
        field2661 = null;
        field2667 = null;
        if (arg0) {
            field2659 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILke;)V")
    public static final void method947(int arg0, class95 arg1) {
        class13.field313 = arg1;
        class115.field2115 = class13.field313.method570((byte) 113, arg0);
        field2658++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static final void method948(byte arg0) {
        field2664++;
        if (class171.field3307 != null || class37.field726 != null) {
            return;
        }
        if (arg0 != 84) {
            method946(false);
        }
        int var1 = class56.field1040;
        if (class189.field3707) {
            if (var1 != 1) {
                int var2 = class22.field459;
                int var3 = class150.field2806;
                if (class19.field422 - 10 > var2 || class73.field1388 + class19.field422 + 10 < var2 || class167.field3217 - 10 > var3 || var3 > class178.field3475 + class167.field3217 + 10) {
                    class189.field3707 = false;
                    class5.method35(class178.field3475, class73.field1388, true, class19.field422, class167.field3217);
                }
            }
            if (var1 == 1) {
                int var4 = class19.field422;
                int var5 = class167.field3217;
                int var6 = class73.field1388;
                int var7 = class178.field3480;
                int var8 = class42.field796;
                int var9 = -1;
                for (int var10 = 0; var10 < class20.field436; var10++) {
                    int var11 = (class20.field436 - var10 - 1) * 15 + var5 + 31;
                    if (var4 < var7 && var7 < var4 + var6 && var11 - 13 < var8 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class60.method375((byte) 17, var9);
                }
                class189.field3707 = false;
                class5.method35(class178.field3475, class73.field1388, true, class19.field422, class167.field3217);
                return;
            }
            return;
        }
        if (var1 == 1 && class20.field436 > 0) {
            int var12 = class149.field2746[class20.field436 - 1];
            if (var12 == 36 || var12 == 12 || var12 == 48 || var12 == 29 || var12 == 30 || var12 == 41 || var12 == 23 || var12 == 39 || var12 == 9 || var12 == 43 || var12 == 19 || var12 == 1002) {
                int var13 = class123.field2271[class20.field436 - 1];
                int var14 = class155.field2978[class20.field436 - 1];
                class150 var15 = class62.method385((byte) 41, var14);
                if (class42.method274((byte) -121, class70.method436(var15, 58)) || class89.method523(-59, class70.method436(var15, arg0 - 196))) {
                    class26.field544 = false;
                    class49.field880 = 0;
                    if (class171.field3307 != null) {
                        class64.method404(105, class171.field3307);
                    }
                    class171.field3307 = class62.method385((byte) 41, var14);
                    class150.field2792 = class178.field3480;
                    class69.field1292 = class42.field796;
                    class141.field2619 = var13;
                    class64.method404(107, class171.field3307);
                    return;
                }
            }
        }
        if (var1 == 1 && (class112.field2054 == 1 && class20.field436 > 2 || class149.method977(class20.field436 - 1, arg0 + -31))) {
            var1 = 2;
        }
        if (var1 == 1 && class20.field436 > 0) {
            class60.method375((byte) 17, class20.field436 - 1);
        }
        if (var1 != 2 || class20.field436 <= 0) {
            return;
        }
        class91.method534((byte) 108);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[Lvb;Log;)V")
    public static final void method949(int arg0, class191[] arg1, class133 arg2) {
        field2662++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class159.field3040[var3][var111][var112] & 0x1) == 1) {
                        int var113 = var3;
                        if ((class159.field3040[1][var111][var112] & 0x2) == 2) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method1268(var112, (byte) 1, var111);
                        }
                    }
                }
            }
        }
        class32.field687 += (int) (Math.random() * 5.0D) - 2;
        if (class32.field687 < -8) {
            class32.field687 = -8;
        }
        if (class32.field687 > 8) {
            class32.field687 = 8;
        }
        class165.field3170 += (int) (Math.random() * 5.0D) - 2;
        if (class165.field3170 < -16) {
            class165.field3170 = -16;
        }
        if (class165.field3170 > 16) {
            class165.field3170 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = client.field577[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 96;
                    int var103 = class139.field2588[var4][var101][var50 + 1] - class139.field2588[var4][var101][var50 - 1];
                    int var104 = class139.field2588[var4][var101 + 1][var50] - class139.field2588[var4][var101 - 1][var50];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var108 * -50 + var106 * -50 + var107 * -10) / var49 + var102;
                    int var110 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1) + (var47[var101][var50 - 1] >> 2) + (var47[var101 + 1][var50] >> 3);
                    class112.field2058[var101][var50] = var109 - var110;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class169.field3251[var51] = 0;
                class1.field22[var51] = 0;
                class116.field2147[var51] = 0;
                class202.field3938[var51] = 0;
                class81.field1497[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class167.field3185[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class35 var97 = class101.method593(var96 - 1, (byte) 62);
                            class169.field3251[var55] += var97.field708;
                            class1.field22[var55] += var97.field698;
                            class116.field2147[var55] += var97.field701;
                            class202.field3938[var55] += var97.field703;
                            var10002 = class81.field1497[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class167.field3185[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class35 var100 = class101.method593(var99 - 1, (byte) -94);
                            class169.field3251[var55] -= var100.field708;
                            class1.field22[var55] -= var100.field698;
                            class116.field2147[var55] -= var100.field701;
                            class202.field3938[var55] -= var100.field703;
                            var10002 = class81.field1497[var55]--;
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
                            var60 += class81.field1497[var62];
                            var58 += class1.field22[var62];
                            var57 += class116.field2147[var62];
                            var56 += class169.field3251[var62];
                            var59 += class202.field3938[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class81.field1497[var63];
                            var58 -= class1.field22[var63];
                            var57 -= class116.field2147[var63];
                            var59 -= class202.field3938[var63];
                            var56 -= class169.field3251[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class105.field1925 || (class159.field3040[0][var52][var61] & 0x2) != 0 || (class159.field3040[var4][var52][var61] & 0x10) == 0 && class88.method519(var4, 127, var61, var52) == class26.field537)) {
                            if (var4 < class135.field2522) {
                                class135.field2522 = var4;
                            }
                            int var64 = class167.field3185[var4][var52][var61] & 0xFF;
                            int var65 = class147.field2704[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class139.field2588[var4][var52][var61];
                                int var67 = class139.field2588[var4][var52 + 1][var61];
                                int var68 = class139.field2588[var4][var52 + 1][var61 + 1];
                                int var69 = class139.field2588[var4][var52][var61 + 1];
                                int var70 = class112.field2058[var52][var61];
                                int var71 = class112.field2058[var52 + 1][var61];
                                int var72 = class112.field2058[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = class112.field2058[var52][var61 + 1];
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var58 / var60;
                                    int var78 = var57 / var60;
                                    var73 = class46.method291(var76, var78, var77, arg0);
                                    int var79 = class165.field3170 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = var76 + class32.field687 & 0xFF;
                                    var75 = class46.method291(var80, var79, var77, 0);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && client.field587[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class110.method681(112, var65 - 1).field1020) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class159.field3034[var4][var52][var61] = class10.method56(class159.field3034[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class12.field286[class174.method1157(var75, 96, 127)];
                                }
                                if (var65 == 0) {
                                    arg2.method889(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class174.method1157(var73, var70, 127), class174.method1157(var73, var71, arg0 + 127), class174.method1157(var73, var72, 127), class174.method1157(var73, var74, 127), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class116.field2149[var4][var52][var61];
                                    int var84 = client.field587[var4][var52][var61] + 1;
                                    class56 var85 = class110.method681(112, var65 - 1);
                                    int var86 = var85.field1029;
                                    if (var86 >= 0 && !class12.field275.method605(var86, 112)) {
                                        var86 = -1;
                                    }
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class12.field275.method603(var86, true);
                                        var88 = -1;
                                    } else if (var85.field1017 == 16711935) {
                                        var86 = -1;
                                        var88 = -2;
                                        var87 = -2;
                                    } else {
                                        var88 = class46.method291(var85.field1034, var85.field1019, var85.field1025, 0);
                                        int var89 = var85.field1034 + class32.field687 & 0xFF;
                                        int var90 = class165.field3170 + var85.field1019;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class46.method291(var89, var90, var85.field1025, 0);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class12.field286[class55.method348(arg0 + 9326, var87, 96)];
                                    }
                                    if (var85.field1028 != -1) {
                                        int var92 = var85.field1027 + class32.field687 & 0xFF;
                                        int var93 = class165.field3170 + var85.field1015;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class46.method291(var92, var93, var85.field1022, arg0);
                                        var91 = class12.field286[class55.method348(9326, var94, 96)];
                                    }
                                    arg2.method889(var4, var52, var61, var84, var83, var86, var66, var67, var68, var69, class174.method1157(var73, var70, 127), class174.method1157(var73, var71, 127), class174.method1157(var73, var72, 127), class174.method1157(var73, var74, arg0 ^ 0x7F), class55.method348(arg0 + 9326, var88, var70), class55.method348(9326, var88, var71), class55.method348(arg0 + 9326, var88, var72), class55.method348(arg0 ^ 0x246E, var88, var74), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method865(var4, var54, var53, class88.method519(var4, 113, var53, var54));
                }
            }
            class167.field3185[var4] = null;
            class147.field2704[var4] = null;
            client.field587[var4] = null;
            class116.field2149[var4] = null;
            client.field577[var4] = null;
        }
        arg2.method886(-50, -10, -50);
        for (int var5 = arg0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class159.field3040[1][var5][var46] & 0x2) == 2) {
                    arg2.method913(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class159.field3034[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            int var15;
                            for (var15 = var11; var15 < 104 && (class159.field3034[var10][var12][var15 + 1] & var6) != 0; var15++) {
                            }
                            int var16 = var10;
                            while (var13 > 0 && (class159.field3034[var10][var12][var13 - 1] & var6) != 0) {
                                var13--;
                            }
                            label358: while (var16 > 0) {
                                for (int var17 = var13; var17 <= var15; var17++) {
                                    if ((var6 & class159.field3034[var16 - 1][var12][var17]) == 0) {
                                        break label358;
                                    }
                                }
                                var16--;
                            }
                            label347: while (var14 < var9) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((class159.field3034[var14 + 1][var12][var18] & var6) == 0) {
                                        break label347;
                                    }
                                }
                                var14++;
                            }
                            int var19 = (var15 + 1 - var13) * (var14 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class139.field2588[var14][var12][var13] - var20;
                                int var22 = class139.field2588[var16][var12][var13];
                                class133.method911(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var14; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class159.field3034[var23][var12][var24] = class150.method984(class159.field3034[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class159.field3034[var10][var12][var11] & var8) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var8 & class159.field3034[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && (var8 & class159.field3034[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            label413: while (var27 > 0) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((class159.field3034[var27 - 1][var28][var11] & var8) == 0) {
                                        break label413;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label401: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class159.field3034[var29 + 1][var30][var11] & var8) == 0) {
                                        break label401;
                                    }
                                }
                            }
                            int var31 = (var26 + 1 - var25) * (var29 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class139.field2588[var27][var25][var11];
                                int var34 = class139.field2588[var29][var25][var11] - var32;
                                class133.method911(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class159.field3034[var35][var36][var11] = class150.method984(class159.field3034[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class159.field3034[var10][var12][var11] & var7) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (class159.field3034[var10][var12][var39 - 1] & var7) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var7 & class159.field3034[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label467: while (var38 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var7 & class159.field3034[var10][var38 - 1][var41]) == 0) {
                                        break label467;
                                    }
                                }
                                var38--;
                            }
                            label456: while (var37 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class159.field3034[var10][var37 + 1][var42] & var7) == 0) {
                                        break label456;
                                    }
                                }
                                var37++;
                            }
                            if ((var40 + 1 - var39) * (var37 - var38 + 1) >= 4) {
                                int var43 = class139.field2588[var10][var38][var39];
                                class133.method911(var9, 4, var38 * 128, var37 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class159.field3034[var10][var44][var45] = class150.method984(class159.field3034[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
    public abstract int method270(int arg0, int arg1, int arg2);
}
