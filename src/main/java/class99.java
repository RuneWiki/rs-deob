import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class99 {

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lrd;")
    public static class114 field2245 = class84.method656("Anmelde)2Limit -Uberschritten)3", (byte) 121);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
    public static boolean field2247 = false;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lrd;")
    public static class114 field2252 = class84.method656("Wen m-Ochten Sie entfernen?", (byte) 124);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lrd;")
    private static class114 field2240 = class84.method656("glow1:", (byte) 114);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lrd;")
    public static class114 field2251 = field2240;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lrd;")
    private static class114 field2244 = class84.method656("wishes to duel with you)3", (byte) 120);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lrd;")
    public static class114 field2246 = field2244;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2255 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Loa;")
    public static final class93 method744(int arg0) {
        field2242++;
        class93 var1 = new class93();
        var1.field2173 = class1.field14;
        var1.field2169 = class29.field599[0];
        var1.field2174 = class111.field2594[0];
        var1.field2170 = class31.field630;
        if (arg0 != -19457) {
            field2240 = null;
        }
        var1.field2172 = class120.field2814[0];
        var1.field2175 = class140.field3328[0];
        var1.field2171 = class140.field3346[0];
        var1.field2168 = class78.field1776;
        class34.method246(-1958111762);
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lua;B[Lnc;)V")
    public static final void method745(class129 arg0, byte arg1, class89[] arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class22.field430[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class22.field430[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method674(var110, var111, (byte) -77);
                        }
                    }
                }
            }
        }
        class62.field1323 += (int) (Math.random() * 5.0D) - 2;
        field2248++;
        if (arg1 > -43) {
            method745(null, (byte) 93, null);
        }
        if (class62.field1323 < -16) {
            class62.field1323 = -16;
        }
        if (class62.field1323 > 16) {
            class62.field1323 = 16;
        }
        class60.field1252 += (int) (Math.random() * 5.0D) - 2;
        if (class60.field1252 < -8) {
            class60.field1252 = -8;
        }
        if (class60.field1252 > 8) {
            class60.field1252 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class132.field3194[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class124.field2958[var4][var101 + 1][var50] - class124.field2958[var4][var101 - 1][var50];
                    int var103 = class124.field2958[var4][var101][var50 + 1] - class124.field2958[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var107 * -10 + var105 * -50 + var106 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 + -1] >> 2) + (var47[var101 + -1][var50] >> 2);
                    class47.field984[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class118.field2769[var51] = 0;
                class60.field1289[var51] = 0;
                class116.field2717[var51] = 0;
                class98.field2227[var51] = 0;
                class36.field773[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class92.field2144[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class117 var97 = class5.method49(true, var96 - 1);
                            class118.field2769[var55] += var97.field2751;
                            class60.field1289[var55] += var97.field2728;
                            class116.field2717[var55] += var97.field2744;
                            class98.field2227[var55] += var97.field2726;
                            var10002 = class36.field773[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class92.field2144[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class117 var100 = class5.method49(true, var99 - 1);
                            class118.field2769[var55] -= var100.field2751;
                            class60.field1289[var55] -= var100.field2728;
                            class116.field2717[var55] -= var100.field2744;
                            class98.field2227[var55] -= var100.field2726;
                            var10002 = class36.field773[var55]--;
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
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var56 += class118.field2769[var63];
                            var59 += class98.field2227[var63];
                            var57 += class116.field2717[var63];
                            var58 += class60.field1289[var63];
                            var60 += class36.field773[var63];
                        }
                        if (var62 >= 0 && var62 < 104) {
                            var56 -= class118.field2769[var62];
                            var59 -= class98.field2227[var62];
                            var60 -= class36.field773[var62];
                            var57 -= class116.field2717[var62];
                            var58 -= class60.field1289[var62];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class64.field1370 || (class22.field430[0][var52][var61] & 0x2) != 0 || (class22.field430[var4][var52][var61] & 0x10) == 0 && class106.method808((byte) -123, var52, var4, var61) == class7.field100)) {
                            if (client.field409 > var4) {
                                client.field409 = var4;
                            }
                            int var64 = class92.field2144[var4][var52][var61] & 0xFF;
                            int var65 = class128.field3064[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class124.field2958[var4][var52][var61];
                                int var67 = class124.field2958[var4][var52 + 1][var61];
                                int var68 = class124.field2958[var4][var52 + 1][var61 + 1];
                                int var69 = class124.field2958[var4][var52][var61 + 1];
                                int var70 = class47.field984[var52][var61];
                                int var71 = class47.field984[var52 + 1][var61 + 1];
                                int var72 = class47.field984[var52 + 1][var61];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class47.field984[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var58 / var60;
                                    int var78 = var57 / var60;
                                    var74 = class62.method509(var77, 27, var78, var76);
                                    int var79 = class60.field1252 + var76 & 0xFF;
                                    int var80 = class62.field1323 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var73 = class62.method509(var77, -78, var80, var79);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class123.field2904[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class49.method350(-128, var65 - 1).field1137) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class7.field90[var4][var52][var61] = class38.method271(class7.field90[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var73 != -1) {
                                    var82 = class134.field3264[class103.method795(var73, 96, (byte) -29)];
                                }
                                if (var65 == 0) {
                                    arg0.method1038(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class103.method795(var74, var70, (byte) -29), class103.method795(var74, var72, (byte) -29), class103.method795(var74, var71, (byte) -29), class103.method795(var74, var75, (byte) -29), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class123.field2904[var4][var52][var61] + 1;
                                    byte var84 = class1.field8[var4][var52][var61];
                                    class55 var85 = class49.method350(-128, var65 - 1);
                                    int var86 = var85.field1154;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class134.field3277.method129(-22953, var86);
                                        var88 = -1;
                                    } else if (var85.field1146 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var88 = class62.method509(var85.field1140, 112, var85.field1134, var85.field1139);
                                        int var89 = class60.field1252 + var85.field1139 & 0xFF;
                                        int var90 = class62.field1323 + var85.field1134;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class62.method509(var85.field1140, 66, var90, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class134.field3264[class12.method102(96, var87, 99)];
                                    }
                                    if (var85.field1155 != -1) {
                                        int var92 = class60.field1252 + var85.field1135 & 0xFF;
                                        int var93 = class62.field1323 + var85.field1149;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class62.method509(var85.field1138, 109, var93, var92);
                                        var91 = class134.field3264[class12.method102(96, var94, 47)];
                                    }
                                    arg0.method1038(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class103.method795(var74, var70, (byte) -29), class103.method795(var74, var72, (byte) -29), class103.method795(var74, var71, (byte) -29), class103.method795(var74, var75, (byte) -29), class12.method102(var70, var88, 30), class12.method102(var72, var88, 112), class12.method102(var71, var88, 73), class12.method102(var75, var88, 70), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method1030(var4, var54, var53, class106.method808((byte) -123, var54, var4, var53));
                }
            }
            class92.field2144[var4] = null;
            class128.field3064[var4] = null;
            class123.field2904[var4] = null;
            class1.field8[var4] = null;
            class132.field3194[var4] = null;
        }
        arg0.method1010(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class22.field430[1][var5][var46] & 0x2) == 2) {
                    arg0.method998(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class7.field90[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class7.field90[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (class7.field90[var10][var12][var14 + 1] & var6) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16;
                            label356: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class7.field90[var16 - 1][var12][var17] & var6) == 0) {
                                        break label356;
                                    }
                                }
                            }
                            label345: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((var6 & class7.field90[var15 + 1][var12][var18]) == 0) {
                                        break label345;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var14 + 1 - var13) * (var15 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class124.field2958[var15][var12][var13] - var20;
                                int var22 = class124.field2958[var16][var12][var13];
                                class129.method1037(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class7.field90[var23][var12][var24] = class96.method737(class7.field90[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class7.field90[var10][var12][var11] & var8) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class7.field90[var10][var25 - 1][var11] & var8) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && (var8 & class7.field90[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            int var28 = var10;
                            label411: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var8 & class7.field90[var27 - 1][var29][var11]) == 0) {
                                        break label411;
                                    }
                                }
                                var27--;
                            }
                            label400: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var8 & class7.field90[var28 + 1][var30][var11]) == 0) {
                                        break label400;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class124.field2958[var27][var25][var11];
                                int var34 = class124.field2958[var28][var25][var11] - var32;
                                class129.method1037(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class7.field90[var35][var36][var11] = class96.method737(class7.field90[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class7.field90[var10][var12][var11] & var7) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40 = var11;
                            while (var39 < 104 && (class7.field90[var10][var12][var39 + 1] & var7) != 0) {
                                var39++;
                            }
                            while (var40 > 0 && (var7 & class7.field90[var10][var12][var40 - 1]) != 0) {
                                var40--;
                            }
                            label466: while (var38 > 0) {
                                for (int var41 = var40; var41 <= var39; var41++) {
                                    if ((var7 & class7.field90[var10][var38 - 1][var41]) == 0) {
                                        break label466;
                                    }
                                }
                                var38--;
                            }
                            label455: while (var37 < 104) {
                                for (int var42 = var40; var42 <= var39; var42++) {
                                    if ((class7.field90[var10][var37 + 1][var42] & var7) == 0) {
                                        break label455;
                                    }
                                }
                                var37++;
                            }
                            if ((var37 + 1 - var38) * (-var40 + 1 + var39) >= 4) {
                                int var43 = class124.field2958[var10][var38][var40];
                                class129.method1037(var9, 4, var38 * 128, var37 * 128 + 128, var40 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var40; var45 <= var39; var45++) {
                                        class7.field90[var10][var44][var45] = class96.method737(class7.field90[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method746(int arg0) {
        try {
            Graphics var1 = class114.field2678.getGraphics();
            class121.field2834.method526(0, 4, 4, var1);
            if (arg0 >= -82) {
                method750(null, -27);
            }
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
        field2249++;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)J")
    public static final synchronized long method747(int arg0) {
        if (arg0 != 0) {
            return -116L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class145.field3460) {
            class58.field1201 += class145.field3460 - var1;
        }
        field2250++;
        class145.field3460 = var1;
        return class58.field1201 + var1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method748(byte arg0) {
        field2252 = null;
        if (arg0 != -104) {
            return;
        }
        field2244 = null;
        field2251 = null;
        field2240 = null;
        field2245 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
    public static final int method749(int arg0, int arg1, int arg2) {
        field2241++;
        class132 var3 = (class132) class132.field3197.method783(~arg2, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= arg2 && arg0 < var3.field3193.length) {
            return var3.field3193[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpb;I)V")
    public static final void method750(class100 arg0, int arg1) {
        class103.field2409 = arg0;
        field2254++;
        if (arg1 < 2) {
            field2252 = null;
        }
    }
}
