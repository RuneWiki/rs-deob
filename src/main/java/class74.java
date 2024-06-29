import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class74 extends Canvas {

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1016;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1010 = null;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "J")
    public static long field1013 = 0L;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1015 = -1;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!th", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1016.paint(arg0);
        field1005++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V")
    public static final void method563(int arg0, long arg1) {
        field1014++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class264.field4224 < 100 || class222.field3539) || class264.field4224 >= 200) {
            class297.method1986(0, "", true, class49.field665);
            return;
        }
        String var3 = class94.method659(arg1, (byte) -103);
        for (int var4 = 0; var4 < class264.field4224; var4++) {
            if (class266.field4313[var4] == arg1) {
                class297.method1986(0, "", true, var3 + class104.field1730);
                return;
            }
        }
        for (int var5 = 0; var5 < class33.field399; var5++) {
            if (class140.field2301[var5] == arg1) {
                class297.method1986(0, "", true, class87.field1184 + var3 + class169.field2742);
                return;
            }
        }
        if (var3.equals(class197.field3179.field3735)) {
            class297.method1986(0, "", true, class206.field3308);
            return;
        }
        class28.field338[class264.field4224] = var3;
        class266.field4313[class264.field4224] = arg1;
        class216.field3466++;
        class151.field2430[class264.field4224] = arg0;
        class160.field2598[class264.field4224] = "";
        class171.field2758[class264.field4224] = 0;
        class127.field2133[class264.field4224] = false;
        class264.field4224++;
        class204.field3273 = class64.field906;
        class83.field1148.method1238(45, -136478397);
        class83.field1148.method1762(arg1, (byte) -104);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static final void method564(boolean arg0) {
        field1009++;
        class185.field2959.method1831(-102);
        if (!arg0) {
            field1013 = 94L;
        }
        class85.field1163.method1831(-118);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class74(Component arg0) {
        this.field1016 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B[Lpi;Z[[[I)V")
    public static final void method565(byte arg0, class281[] arg1, boolean arg2, int[][][] arg3) {
        field1008++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class134.field2251[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class134.field2251[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method1886(var6, var5, (byte) -72);
                            }
                        }
                    }
                }
            }
            class81.field1125 += (int) (Math.random() * 5.0D) - 2;
            class25.field299 += (int) (Math.random() * 5.0D) - 2;
            if (class25.field299 < -8) {
                class25.field299 = -8;
            }
            if (class25.field299 > 8) {
                class25.field299 = 8;
            }
            if (class81.field1125 < -16) {
                class81.field1125 = -16;
            }
            if (class81.field1125 > 16) {
                class81.field1125 = 16;
            }
        }
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class25.field299 >> 2 << 10;
        int var10 = class81.field1125 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class109.field1896[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class229.field3641[var13][var101 + 1][var55] - class229.field3641[var13][var101 - 1][var55];
                    int var104 = class229.field3641[var13][var101][var55 + 1] - class229.field3641[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + (var103 * var103 + 65536)));
                    int var106 = (var103 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var107 * -10 + var106 * -50 + var108 * -50) / var54 + var102;
                    int var110 = (var52[var101 - 1][var55] >> 2) + (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1) - (-(var52[var101 + 1][var55] >> 3) - (var52[var101][var55 - 1] >> 2));
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class131.field2189[var56] = 0;
                class150.field2411[var56] = 0;
                class122.field2046[var56] = 0;
                class279.field4465[var56] = 0;
                class266.field4321[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class161.field2624[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class120 var97 = class248.method1641(var96 - 1, (byte) -46);
                            class131.field2189[var86] += var97.field2033;
                            class150.field2411[var86] += var97.field2028;
                            class122.field2046[var86] += var97.field2030;
                            class279.field4465[var86] += var97.field2017;
                            var10002 = class266.field4321[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class161.field2624[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class120 var100 = class248.method1641(var99 - 1, (byte) -36);
                            class131.field2189[var86] -= var100.field2033;
                            class150.field2411[var86] -= var100.field2028;
                            class122.field2046[var86] -= var100.field2030;
                            class279.field4465[var86] -= var100.field2017;
                            var10002 = class266.field4321[var86]--;
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
                            var88 += class150.field2411[var93];
                            var90 += class266.field4321[var93];
                            var91 += class122.field2046[var93];
                            var89 += class279.field4465[var93];
                            var87 += class131.field2189[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var87 -= class131.field2189[var94];
                            var90 -= class266.field4321[var94];
                            var91 -= class122.field2046[var94];
                            var89 -= class279.field4465[var94];
                            var88 -= class150.field2411[var94];
                        }
                        if (var92 >= 0 && var90 > 0) {
                            var11[var57][var92] = class173.method1206(var91 / var90, var88 / var90, var87 * 256 / var89, 92);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg2 || class200.method1349(false) || (class134.field2251[0][var58][var59] & 0x2) != 0 || (class134.field2251[var13][var58][var59] & 0x10) == 0 && class140.method958(0, var13, var58, var59) == class109.field1891) {
                        if (class184.field2945 > var13) {
                            class184.field2945 = var13;
                        }
                        int var60 = class161.field2624[var13][var58][var59] & 0xFF;
                        int var61 = class265.field4259[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class229.field3641[var13][var58][var59];
                            int var63 = class229.field3641[var13][var58 + 1][var59];
                            int var64 = class229.field3641[var13][var58][var59 + 1];
                            int var65 = class229.field3641[var13][var58 + 1][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class281.field4501[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class184.method1260((byte) -119, var61 - 1).field3916) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var65 && var62 == var64) {
                                    class116.field1983[var13][var58][var59] = class45.method348(class116.field1983[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var60 <= 0) {
                                var67 = -1;
                                var68 = 0;
                            } else {
                                var67 = var11[var58][var59];
                                int var69 = (var67 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var9 + var67 & 0xFC00) + (var67 & 0x380) + var69;
                                var68 = class145.field2347[class198.method1338(96, -3, var70)];
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59];
                            int var73 = var12[var58][var59 + 1];
                            int var74 = var12[var58 + 1][var59 + 1];
                            if (var61 == 0) {
                                class95.method679(var13, var58, var59, 0, 0, -1, var62, var63, var65, var64, class198.method1338(var71, -3, var67), class198.method1338(var72, -3, var67), class198.method1338(var74, -3, var67), class198.method1338(var73, -3, var67), 0, 0, 0, 0, var68, 0);
                            } else {
                                byte var75 = class197.field3178[var13][var58][var59];
                                int var76 = class281.field4501[var13][var58][var59] + 1;
                                class244 var77 = class184.method1260((byte) -124, var61 - 1);
                                int var78 = var77.field3909;
                                if (var78 >= 0 && !class145.field2350.method308((byte) -85, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var82;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var82 = class145.field2347[class6.method41(class145.field2350.method310(64, var78), -90, 96)];
                                } else if (var77.field3911 == -1) {
                                    var82 = 0;
                                    var79 = -2;
                                } else {
                                    var79 = var77.field3911;
                                    int var80 = (var79 & 0x7F) + var10;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var82 = class145.field2347[class6.method41(var81, -89, 96)];
                                }
                                if (var77.field3906 >= 0) {
                                    int var83 = var77.field3906;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 + var9 & 0xFC00) + (var83 & 0x380) + var84;
                                    var82 = class145.field2347[class6.method41(var85, -93, 96)];
                                }
                                class95.method679(var13, var58, var59, var76, var75, var78, var62, var63, var65, var64, class198.method1338(var71, -3, var67), class198.method1338(var72, -3, var67), class198.method1338(var74, -3, var67), class198.method1338(var73, -3, var67), class6.method41(var79, -112, var71), class6.method41(var79, -104, var72), class6.method41(var79, -114, var74), class6.method41(var79, -109, var73), var68, var82);
                            }
                        }
                    }
                }
            }
            class161.field2624[var13] = null;
            class265.field4259[var13] = null;
            class281.field4501[var13] = null;
            class197.field3178[var13] = null;
            class109.field1896[var13] = null;
        }
        class291.method1949(-50, -10, -50);
        if (!arg2) {
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var51 = 0; var51 < 104; var51++) {
                    if ((class134.field2251[1][var14][var51] & 0x2) == 2) {
                        class149.method1011(var14, var51);
                    }
                }
            }
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    for (int var17 = 0; var17 <= 104; var17++) {
                        if ((class116.field1983[var15][var17][var16] & 0x1) != 0) {
                            int var18;
                            for (var18 = var16; var18 > 0 && (class116.field1983[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                            }
                            int var19;
                            for (var19 = var16; var19 < 104 && (class116.field1983[var15][var17][var19 + 1] & 0x1) != 0; var19++) {
                            }
                            int var20;
                            label353: for (var20 = var15; var20 > 0; var20--) {
                                for (int var21 = var18; var21 <= var19; var21++) {
                                    if ((class116.field1983[var20 - 1][var17][var21] & 0x1) == 0) {
                                        break label353;
                                    }
                                }
                            }
                            int var22;
                            label341: for (var22 = var15; var22 < 3; var22++) {
                                for (int var23 = var18; var23 <= var19; var23++) {
                                    if ((class116.field1983[var22 + 1][var17][var23] & 0x1) == 0) {
                                        break label341;
                                    }
                                }
                            }
                            int var24 = (var19 + 1 - var18) * (var22 + 1 - var20);
                            if (var24 >= 8) {
                                short var25 = 240;
                                int var26 = class229.field3641[var22][var17][var18] - var25;
                                int var27 = class229.field3641[var20][var17][var18];
                                class281.method1879(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var26, var27);
                                for (int var28 = var20; var28 <= var22; var28++) {
                                    for (int var29 = var18; var29 <= var19; var29++) {
                                        class116.field1983[var28][var17][var29] = class204.method1369(class116.field1983[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if ((class116.field1983[var15][var17][var16] & 0x2) != 0) {
                            int var30;
                            for (var30 = var17; var30 > 0 && (class116.field1983[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                            }
                            int var31 = var15;
                            int var32 = var17;
                            int var33 = var15;
                            while (var32 < 104 && (class116.field1983[var15][var32 + 1][var16] & 0x2) != 0) {
                                var32++;
                            }
                            label408: while (var31 > 0) {
                                for (int var34 = var30; var34 <= var32; var34++) {
                                    if ((class116.field1983[var31 - 1][var34][var16] & 0x2) == 0) {
                                        break label408;
                                    }
                                }
                                var31--;
                            }
                            label397: while (var33 < 3) {
                                for (int var35 = var30; var35 <= var32; var35++) {
                                    if ((class116.field1983[var33 + 1][var35][var16] & 0x2) == 0) {
                                        break label397;
                                    }
                                }
                                var33++;
                            }
                            int var36 = (var33 + 1 - var31) * (var32 + 1 - var30);
                            if (var36 >= 8) {
                                int var37 = class229.field3641[var31][var30][var16];
                                short var38 = 240;
                                int var39 = class229.field3641[var33][var30][var16] - var38;
                                class281.method1879(2, var30 * 128, var32 * 128 + 128, var16 * 128, var16 * 128, var39, var37);
                                for (int var40 = var31; var40 <= var33; var40++) {
                                    for (int var41 = var30; var41 <= var32; var41++) {
                                        class116.field1983[var40][var41][var16] = class204.method1369(class116.field1983[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if ((class116.field1983[var15][var17][var16] & 0x4) != 0) {
                            int var42 = var17;
                            int var43 = var17;
                            int var44 = var16;
                            int var45 = var16;
                            while (var44 < 104 && (class116.field1983[var15][var17][var44 + 1] & 0x4) != 0) {
                                var44++;
                            }
                            while (var45 > 0 && (class116.field1983[var15][var17][var45 - 1] & 0x4) != 0) {
                                var45--;
                            }
                            label462: while (var42 > 0) {
                                for (int var46 = var45; var46 <= var44; var46++) {
                                    if ((class116.field1983[var15][var42 - 1][var46] & 0x4) == 0) {
                                        break label462;
                                    }
                                }
                                var42--;
                            }
                            label451: while (var43 < 104) {
                                for (int var47 = var45; var47 <= var44; var47++) {
                                    if ((class116.field1983[var15][var43 + 1][var47] & 0x4) == 0) {
                                        break label451;
                                    }
                                }
                                var43++;
                            }
                            if (((var43 + 1 - var42) * (var44 + 1 - var45)) >= 4) {
                                int var48 = class229.field3641[var15][var42][var45];
                                class281.method1879(4, var42 * 128, var43 * 128 + 128, var45 * 128, var44 * 128 + 128, var48, var48);
                                for (int var49 = var42; var49 <= var43; var49++) {
                                    for (int var50 = var45; var50 <= var44; var50++) {
                                        class116.field1983[var15][var49][var50] = class204.method1369(class116.field1983[var15][var49][var50], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -69) {
            field1010 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1007++;
        this.field1016.update(arg0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method566(byte arg0) {
        field1010 = null;
        if (arg0 != 8) {
            field1015 = -92;
        }
    }
}
