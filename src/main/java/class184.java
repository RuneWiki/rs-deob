import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class184 extends class113 {

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lcd;")
    public static class23 field3613 = class54.method414(" ", -1);

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Lcd;")
    public static class23 field3620 = class54.method414("RuneScape wurde aktualisiert(Q", -1);

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "Lcd;")
    public static class23 field3611 = class54.method414("sl_arrows", -1);

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Lcd;")
    public static class23 field3625 = class54.method414("leuchten2:", -1);

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Lcd;")
    public class23 field3612;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "[I")
    public int[] field3622;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "[I")
    public int[] field3624;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[Lcd;")
    public class23[] field3616;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Z")
    public static final boolean method1130(byte arg0, int arg1) {
        field3618++;
        if (arg0 >= -72) {
            return false;
        } else {
            return (arg1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([Lfh;Lob;I)V")
    public static final void method1131(class54[] arg0, class127 arg1, int arg2) {
        field3614++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class53.field1253[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class53.field1253[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method418(var110, var111, 16384);
                        }
                    }
                }
            }
        }
        class98.field2102 += (int) (Math.random() * 5.0D) - 2;
        class159.field3191 += (int) (Math.random() * 5.0D) - 2;
        if (class98.field2102 < -8) {
            class98.field2102 = -8;
        }
        if (class159.field3191 < -16) {
            class159.field3191 = -16;
        }
        if (class159.field3191 > 16) {
            class159.field3191 = 16;
        }
        if (class98.field2102 > 8) {
            class98.field2102 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class110.field2337[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class182.field3596[var4][var101][var50 + 1] - class182.field3596[var4][var101][var50 - 1];
                    int var103 = class182.field3596[var4][var101 + 1][var50] - class182.field3596[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var47[var101][var50 - 1] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1) + (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3);
                    int var107 = (var103 << 8) / var104;
                    int var108 = 65536 / var104;
                    int var109 = (var105 * -50 + var107 * -50 + var108 * -10) / var49 + 96;
                    class19.field407[var101][var50] = var109 - var106;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class39.field824[var51] = 0;
                class136.field2822[var51] = 0;
                class169.field3375[var51] = 0;
                class111.field2353[var51] = 0;
                class105.field2267[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class9.field185[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class86 var97 = class85.method564(116, var96 - 1);
                            class39.field824[var55] += var97.field1851;
                            class136.field2822[var55] += var97.field1840;
                            class169.field3375[var55] += var97.field1839;
                            class111.field2353[var55] += var97.field1841;
                            var10002 = class105.field2267[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class9.field185[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class86 var100 = class85.method564(42, var99 - 1);
                            class39.field824[var55] -= var100.field1851;
                            class136.field2822[var55] -= var100.field1840;
                            class169.field3375[var55] -= var100.field1839;
                            class111.field2353[var55] -= var100.field1841;
                            var10002 = class105.field2267[var55]--;
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
                            var58 += class169.field3375[var62];
                            var60 += class105.field2267[var62];
                            var56 += class136.field2822[var62];
                            var59 += class111.field2353[var62];
                            var57 += class39.field824[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class169.field3375[var63];
                            var57 -= class39.field824[var63];
                            var59 -= class111.field2353[var63];
                            var60 -= class105.field2267[var63];
                            var56 -= class136.field2822[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class193.field3810 || (class53.field1253[0][var52][var61] & 0x2) != 0 || (class53.field1253[var4][var52][var61] & 0x10) == 0 && class169.method1036(var52, var4, var61, -53) == class28.field614)) {
                            if (var4 < class21.field445) {
                                class21.field445 = var4;
                            }
                            int var64 = class9.field185[var4][var52][var61] & 0xFF;
                            int var65 = class163.field3270[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class182.field3596[var4][var52][var61];
                                int var67 = class182.field3596[var4][var52 + 1][var61 + 1];
                                int var68 = class182.field3596[var4][var52 + 1][var61];
                                int var69 = class182.field3596[var4][var52][var61 + 1];
                                int var70 = class19.field407[var52][var61];
                                int var71 = class19.field407[var52 + 1][var61 + 1];
                                int var72 = class19.field407[var52 + 1][var61];
                                int var73 = class19.field407[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var57 * 256 / var59;
                                    int var77 = var56 / var60;
                                    int var78 = var58 / var60;
                                    var74 = class40.method329(var76, var77, var78, (byte) -82);
                                    int var79 = class98.field2102 + var76 & 0xFF;
                                    int var80 = class159.field3191 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class40.method329(var79, var77, var80, (byte) -82);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class60.field1402[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class17.method88(-1, var65 - 1).field3169) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var68 && var66 == var67 && var66 == var69) {
                                        class40.field852[var4][var52][var61] = class119.method745(class40.field852[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class140.field2888[class36.method257(2670, var75, 96)];
                                }
                                if (var65 == 0) {
                                    arg1.method785(var4, var52, var61, 0, 0, -1, var66, var68, var67, var69, class36.method257(2670, var74, var70), class36.method257(2670, var74, var72), class36.method257(2670, var74, var71), class36.method257(2670, var74, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class12.field233[var4][var52][var61];
                                    int var84 = class60.field1402[var4][var52][var61] + 1;
                                    class159 var85 = class17.method88(-1, var65 - 1);
                                    int var86 = var85.field3180;
                                    if (var86 >= 0 && !class140.field2890.method87(-1265, var86)) {
                                        var86 = -1;
                                    }
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class140.field2890.method103(28899, var86);
                                        var87 = -1;
                                    } else if (var85.field3178 == 16711935) {
                                        var87 = -2;
                                        var90 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class40.method329(var85.field3177, var85.field3179, var85.field3172, (byte) -82);
                                        int var88 = class98.field2102 + var85.field3177 & 0xFF;
                                        int var89 = class159.field3191 + var85.field3172;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class40.method329(var88, var85.field3179, var89, (byte) -82);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class140.field2888[class160.method984(96, (byte) -114, var90)];
                                    }
                                    if (var85.field3181 != -1) {
                                        int var92 = class98.field2102 + var85.field3184 & 0xFF;
                                        int var93 = class159.field3191 + var85.field3173;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class40.method329(var92, var85.field3176, var93, (byte) -82);
                                        var91 = class140.field2888[class160.method984(96, (byte) -122, var94)];
                                    }
                                    arg1.method785(var4, var52, var61, var84, var83, var86, var66, var68, var67, var69, class36.method257(2670, var74, var70), class36.method257(2670, var74, var72), class36.method257(2670, var74, var71), class36.method257(2670, var74, var73), class160.method984(var70, (byte) -91, var87), class160.method984(var72, (byte) -111, var87), class160.method984(var71, (byte) -122, var87), class160.method984(var73, (byte) -118, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method799(var4, var54, var53, class169.method1036(var54, var4, var53, -44));
                }
            }
            class9.field185[var4] = null;
            class163.field3270[var4] = null;
            class60.field1402[var4] = null;
            class12.field233[var4] = null;
            class110.field2337[var4] = null;
        }
        arg1.method825(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class53.field1253[1][var5][var46] & 0x2) == 2) {
                    arg1.method805(var5, var46);
                }
            }
        }
        int var6 = 1;
        if (arg2 < 7) {
            field3613 = null;
        }
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
                        if ((var6 & class40.field852[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class40.field852[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14 = var10;
                            int var15 = var10;
                            int var16;
                            for (var16 = var11; var16 < 104 && (var6 & class40.field852[var10][var12][var16 + 1]) != 0; var16++) {
                            }
                            label362: while (var14 > 0) {
                                for (int var17 = var13; var17 <= var16; var17++) {
                                    if ((class40.field852[var14 - 1][var12][var17] & var6) == 0) {
                                        break label362;
                                    }
                                }
                                var14--;
                            }
                            label351: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var16; var18++) {
                                    if ((var6 & class40.field852[var15 + 1][var12][var18]) == 0) {
                                        break label351;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var16 + 1 - var13) * (var15 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class182.field3596[var14][var12][var13];
                                int var22 = class182.field3596[var15][var12][var13] - var20;
                                class127.method782(var9, 1, var12 * 128, var12 * 128, var13 * 128, var16 * 128 + 128, var22, var21);
                                for (int var23 = var14; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var16; var24++) {
                                        class40.field852[var23][var12][var24] = class27.method198(class40.field852[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class40.field852[var10][var12][var11] & var8) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var8 & class40.field852[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && (class40.field852[var10][var26 + 1][var11] & var8) != 0) {
                                var26++;
                            }
                            int var28 = var10;
                            label416: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class40.field852[var27 - 1][var29][var11] & var8) == 0) {
                                        break label416;
                                    }
                                }
                                var27--;
                            }
                            label405: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class40.field852[var28 + 1][var30][var11] & var8) == 0) {
                                        break label405;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var26 + 1 - var25) * (var28 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class182.field3596[var27][var25][var11];
                                int var34 = class182.field3596[var28][var25][var11] - var32;
                                class127.method782(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class40.field852[var35][var36][var11] = class27.method198(class40.field852[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((var7 & class40.field852[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var11;
                            while (var38 > 0 && (class40.field852[var10][var12][var38 - 1] & var7) != 0) {
                                var38--;
                            }
                            while (var39 < 104 && (var7 & class40.field852[var10][var12][var39 + 1]) != 0) {
                                var39++;
                            }
                            int var40;
                            label471: for (var40 = var12; var40 > 0; var40--) {
                                for (int var41 = var38; var41 <= var39; var41++) {
                                    if ((var7 & class40.field852[var10][var40 - 1][var41]) == 0) {
                                        break label471;
                                    }
                                }
                            }
                            label460: while (var37 < 104) {
                                for (int var42 = var38; var42 <= var39; var42++) {
                                    if ((class40.field852[var10][var37 + 1][var42] & var7) == 0) {
                                        break label460;
                                    }
                                }
                                var37++;
                            }
                            if ((var39 + 1 - var38) * (var37 + 1 - var40) >= 4) {
                                int var43 = class182.field3596[var10][var40][var38];
                                class127.method782(var9, 4, var40 * 128, var37 * 128 + 128, var38 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var40; var44 <= var37; var44++) {
                                    for (int var45 = var38; var45 <= var39; var45++) {
                                        class40.field852[var10][var44][var45] = class27.method198(class40.field852[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lcd;")
    public static final class23 method1132(int arg0, int arg1) {
        field3615++;
        if (arg0 != -1) {
            method1132(-91, 38);
        }
        return class156.method956(false, 10, arg1, false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILgd;)V")
    public static final void method1133(int arg0, int arg1, class58 arg2) {
        if (arg1 <= 119) {
            field3620 = null;
        }
        field3621++;
        if (class44.field924 == null) {
            class161.method988(255, (byte) 0, 6116423, 255, true, null, 0);
            class7.field140[arg0] = arg2;
        } else {
            class44.field924.field3752 = arg0 * 8 + 5;
            int var3 = class44.field924.method1190(-4);
            int var4 = class44.field924.method1190(-4);
            arg2.method444(-32, var3, var4);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field3620 = null;
        field3613 = null;
        if (arg0 != -21693) {
            field3625 = null;
        }
        field3625 = null;
        field3611 = null;
    }
}
