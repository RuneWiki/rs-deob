import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class15 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Loc;")
    public static class99 field353 = class48.method402((byte) -104, ":0");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Loc;")
    private static class99 field360 = class48.method402((byte) -104, " from your ignore list first");

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Loc;")
    public static class99 field358 = field360;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Loc;")
    private static class99 field361 = class48.method402((byte) -104, "Please use a different world)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Loc;")
    public static class99 field365 = field361;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Loc;")
    public static class99 field371 = class48.method402((byte) -104, "@lre@");

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field354 = 0;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Loc;")
    public static class99 field367 = field361;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Loc;")
    private static class99 field370 = class48.method402((byte) -104, "green:");

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Loc;")
    public static class99 field359 = field370;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Loc;")
    public static class99 field372 = field370;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method150(boolean arg0) {
        if (arg0) {
            class27.field665.method998(true);
            class138.field3443.method998(arg0);
            field355++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method151(int arg0) {
        field359 = null;
        field353 = null;
        field371 = null;
        field360 = null;
        field361 = null;
        field365 = null;
        if (arg0 != 1) {
            field362 = 118;
        }
        field370 = null;
        field372 = null;
        field358 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lpc;Lpc;ZLpc;Luc;)Z")
    public static final boolean method152(class105 arg0, class105 arg1, boolean arg2, class105 arg3, class135 arg4) {
        class140.field3465 = arg3;
        class109.field2706 = arg1;
        class135.field3371 = arg0;
        field373++;
        if (arg2) {
            method154(22, null, null);
        }
        class46.field1131 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method153(byte arg0) {
        if (class136.field3389[98]) {
            class144.field3604 += (12 - class144.field3604) / 2;
        } else if (class136.field3389[99]) {
            class144.field3604 += (-class144.field3604 - 12) / 2;
        } else {
            class144.field3604 /= 2;
        }
        int var1 = class53.field1274 + class69.field1770.field3077;
        if (arg0 < 89) {
            field356 = 106;
        }
        if (class136.field3389[96]) {
            class39.field961 += (-class39.field961 - 24) / 2;
        } else if (class136.field3389[97]) {
            class39.field961 += (24 - class39.field961) / 2;
        } else {
            class39.field961 /= 2;
        }
        class140.field3478 = class39.field961 / 2 + class140.field3478 & 0x7FF;
        class67.field1717 += class144.field3604 / 2;
        int var2 = 0;
        field363++;
        int var3 = class141.field3494 + class69.field1770.field3115;
        if (class133.field3253 - var3 < -500 || class133.field3253 - var3 > 500 || class88.field2184 - var1 < -500 || class88.field2184 - var1 > 500) {
            class133.field3253 = var3;
            class88.field2184 = var1;
        }
        if (class67.field1717 < 128) {
            class67.field1717 = 128;
        }
        if (class67.field1717 > 383) {
            class67.field1717 = 383;
        }
        if (class88.field2184 != var1) {
            class88.field2184 += (var1 - class88.field2184) / 16;
        }
        int var4 = class88.field2184 >> 7;
        if (class133.field3253 != var3) {
            class133.field3253 += (var3 - class133.field3253) / 16;
        }
        int var5 = class133.field3253 >> 7;
        int var6 = class137.method1144(true, class133.field3253, class88.field2184, class84.field2116);
        if (var5 > 3 && var4 > 3 && var5 < 100 && var4 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class84.field2116;
                    if (var9 < 3 && (class81.field2028[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class121.field2964[var9][var7][var8];
                    if (var2 < var10) {
                        var2 = var10;
                    }
                }
            }
        }
        int var11 = var2 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class48.field1175) {
            class48.field1175 += (var11 - class48.field1175) / 24;
        } else if (var11 < class48.field1175) {
            class48.field1175 += (var11 - class48.field1175) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[Lee;Lae;)V")
    public static final void method154(int arg0, class34[] arg1, class6 arg2) {
        field357++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class81.field2028[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class81.field2028[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method287(var111, var110, 2097152);
                        }
                    }
                }
            }
        }
        class58.field1540 += (int) (Math.random() * 5.0D) - 2;
        class149.field3698 += (int) (Math.random() * 5.0D) - 2;
        if (class58.field1540 < -8) {
            class58.field1540 = -8;
        }
        if (class149.field3698 < -16) {
            class149.field3698 = -16;
        }
        if (class149.field3698 > 16) {
            class149.field3698 = 16;
        }
        if (class58.field1540 > 8) {
            class58.field1540 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class9.field227[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class121.field2964[var4][var101 + 1][var50] - class121.field2964[var4][var101 - 1][var50];
                    int var103 = class121.field2964[var4][var101][var50 + 1] - class121.field2964[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50] >> 1) + (var47[var101 - -1][var50] >> 3) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50 + 1] >> 3);
                    int var109 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    class112.field2807[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class16.field385[var51] = 0;
                class86.field2160[var51] = 0;
                class23.field539[var51] = 0;
                class11.field264[var51] = 0;
                class149.field3692[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class20.field486[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class145 var97 = class21.method192((byte) 57, var96 - 1);
                            class16.field385[var55] += var97.field3615;
                            class86.field2160[var55] += var97.field3630;
                            class23.field539[var55] += var97.field3623;
                            class11.field264[var55] += var97.field3629;
                            var10002 = class149.field3692[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class20.field486[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class145 var100 = class21.method192((byte) 95, var99 - 1);
                            class16.field385[var55] -= var100.field3615;
                            class86.field2160[var55] -= var100.field3630;
                            class23.field539[var55] -= var100.field3623;
                            class11.field264[var55] -= var100.field3629;
                            var10002 = class149.field3692[var55]--;
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
                            var57 += class16.field385[var62];
                            var59 += class11.field264[var62];
                            var56 += class86.field2160[var62];
                            var60 += class149.field3692[var62];
                            var58 += class23.field539[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class149.field3692[var63];
                            var57 -= class16.field385[var63];
                            var59 -= class11.field264[var63];
                            var58 -= class23.field539[var63];
                            var56 -= class86.field2160[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class27.field684 || (class81.field2028[0][var52][var61] & 0x2) != 0 || (class81.field2028[var4][var52][var61] & 0x10) == 0 && class77.method680(var4, var52, -120, var61) == class23.field560)) {
                            if (class12.field290 > var4) {
                                class12.field290 = var4;
                            }
                            int var64 = class2.field39[var4][var52][var61] & 0xFF;
                            int var65 = class20.field486[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class121.field2964[var4][var52][var61];
                                int var67 = class121.field2964[var4][var52 + 1][var61];
                                int var68 = class121.field2964[var4][var52 + 1][var61 + 1];
                                int var69 = class121.field2964[var4][var52][var61 + 1];
                                int var70 = class112.field2807[var52][var61];
                                int var71 = class112.field2807[var52 + 1][var61];
                                int var72 = class112.field2807[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class112.field2807[var52][var61 + 1];
                                if (var65 > 0) {
                                    int var76 = var57 * 256 / var59;
                                    int var77 = var56 / var60;
                                    int var78 = var58 / var60;
                                    var73 = class112.method953(var78, var77, -108, var76);
                                    int var79 = class58.field1540 + var76 & 0xFF;
                                    int var80 = class149.field3698 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class112.method953(var80, var77, 60, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class133.field3259[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class88.method743(var64 - 1, arg0 + -125).field579) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class2.field31[var4][var52][var61] = class88.method744(class2.field31[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class40.field998[class2.method11(96, true, var74)];
                                }
                                if (var64 == 0) {
                                    arg2.method36(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class2.method11(var70, true, var73), class2.method11(var71, true, var73), class2.method11(var72, true, var73), class2.method11(var75, true, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class133.field3259[var4][var52][var61] + 1;
                                    byte var84 = class4.field74[var4][var52][var61];
                                    class25 var85 = class88.method743(var64 - 1, -85);
                                    int var86 = var85.field577;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class40.field989.method588(true, var86);
                                        var88 = -1;
                                    } else if (var85.field571 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var88 = class112.method953(var85.field580, var85.field591, 80, var85.field573);
                                        int var89 = class149.field3698 + var85.field580;
                                        int var90 = class58.field1540 + var85.field573 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var87 = class112.method953(var89, var85.field591, -49, var90);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class40.field998[class59.method526(var87, arg0 + 121, 96)];
                                    }
                                    if (var85.field570 != -1) {
                                        int var92 = class58.field1540 + var85.field588 & 0xFF;
                                        int var93 = class149.field3698 + var85.field576;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class112.method953(var93, var85.field589, arg0 + 127, var92);
                                        var91 = class40.field998[class59.method526(var94, -56, 96)];
                                    }
                                    arg2.method36(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class2.method11(var70, true, var73), class2.method11(var71, true, var73), class2.method11(var72, true, var73), class2.method11(var75, true, var73), class59.method526(var88, 122, var70), class59.method526(var88, -43, var71), class59.method526(var88, arg0 + 121, var72), class59.method526(var88, -21, var75), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method64(var4, var54, var53, class77.method680(var4, var54, 72, var53));
                }
            }
            class20.field486[var4] = null;
            class2.field39[var4] = null;
            class133.field3259[var4] = null;
            class4.field74[var4] = null;
            class9.field227[var4] = null;
        }
        arg2.method61(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class81.field2028[1][var5][var46] & 0x2) == 2) {
                    arg2.method52(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = arg0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var6 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class2.field31[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class2.field31[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14 = var10;
                            int var15;
                            for (var15 = var11; var15 < 104 && (var6 & class2.field31[var10][var12][var15 + 1]) != 0; var15++) {
                            }
                            label354: while (var14 > 0) {
                                for (int var16 = var13; var16 <= var15; var16++) {
                                    if ((class2.field31[var14 - 1][var12][var16] & var6) == 0) {
                                        break label354;
                                    }
                                }
                                var14--;
                            }
                            int var17;
                            label342: for (var17 = var10; var17 < var9; var17++) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((var6 & class2.field31[var17 + 1][var12][var18]) == 0) {
                                        break label342;
                                    }
                                }
                            }
                            int var19 = (var15 + 1 - var13) * (var17 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class121.field2964[var17][var12][var13] - var20;
                                int var22 = class121.field2964[var14][var12][var13];
                                class6.method49(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var17; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class2.field31[var23][var12][var24] = class17.method171(class2.field31[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class2.field31[var10][var12][var11] & var7) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            while (var25 > 0 && (var7 & class2.field31[var10][var25 - 1][var11]) != 0) {
                                var25--;
                            }
                            int var27 = var10;
                            while (var26 < 104 && (class2.field31[var10][var26 + 1][var11] & var7) != 0) {
                                var26++;
                            }
                            label409: while (var27 > 0) {
                                for (int var28 = var25; var28 <= var26; var28++) {
                                    if ((var7 & class2.field31[var27 - 1][var28][var11]) == 0) {
                                        break label409;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label397: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class2.field31[var29 + 1][var30][var11]) == 0) {
                                        break label397;
                                    }
                                }
                            }
                            int var31 = (var26 + 1 - var25) * (var29 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class121.field2964[var29][var25][var11] - var32;
                                int var34 = class121.field2964[var27][var25][var11];
                                class6.method49(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class2.field31[var35][var36][var11] = class17.method171(class2.field31[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class2.field31[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (class2.field31[var10][var12][var39 - 1] & var8) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class2.field31[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label463: while (var38 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var8 & class2.field31[var10][var38 - 1][var41]) == 0) {
                                        break label463;
                                    }
                                }
                                var38--;
                            }
                            label452: while (var37 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class2.field31[var10][var37 + 1][var42] & var8) == 0) {
                                        break label452;
                                    }
                                }
                                var37++;
                            }
                            if ((var37 + 1 - var38) * (var40 + 1 - var39) >= 4) {
                                int var43 = class121.field2964[var10][var38][var39];
                                class6.method49(var9, 4, var38 * 128, var37 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class2.field31[var10][var44][var45] = class17.method171(class2.field31[var10][var44][var45], ~var8);
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
