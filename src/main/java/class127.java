import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class127 {

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    private int field2231 = 0;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lpa;")
    private class204 field2221;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Ljd;")
    public static class85 field2222 = class221.method1499("(Z", (byte) 92);

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Ljd;")
    public static class85 field2223 = class221.method1499("Null", (byte) 107);

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Ljd;")
    public static class85 field2220 = class221.method1499("<img=1>", (byte) 104);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljb;")
    public static class255 field2217 = null;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lve;")
    public static class184 field2218 = new class184(260);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lsb;")
    public static class214 field2236 = new class214(128);

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lof;")
    private class253 field2219;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[[[B")
    public static byte[][][] field2216;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lof;")
    public final class253 method856(int arg0) {
        field2225++;
        if (arg0 != -17301) {
            this.method861(108);
        }
        this.field2231 = 0;
        return this.method861(-3);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;III)Lgj;")
    public static final class223 method857(Component arg0, int arg1, int arg2, int arg3) {
        field2237++;
        try {
            Class var4 = Class.forName("ca");
            int var5 = 54 / ((-arg3 - 48) / 44);
            class223 var6 = (class223) var4.getDeclaredConstructor().newInstance();
            var6.method366(arg0, arg1, arg2, (byte) 103);
            return var6;
        } catch (Throwable var8) {
            class54 var7 = new class54();
            var7.method366(arg0, arg1, arg2, (byte) 103);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public static final void method858(int arg0, int arg1, int arg2) {
        field2234++;
        if (arg0 < 36) {
            field2216 = null;
        }
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class24.field349[arg1];
        int var5 = class34.field512[arg1];
        if (arg2 == 0) {
            class234.field4053++;
            class207.field3618.method483(-24260, 42);
            class207.field3618.method1714(var3 + var3 + 3, -714043120);
        }
        if (arg2 == 1) {
            class123.field2186++;
            class207.field3618.method483(-24260, 131);
            class207.field3618.method1714(var3 + var3 + 3 + 14, -714043120);
        }
        if (arg2 == 2) {
            class92.field1694++;
            class207.field3618.method483(-24260, 160);
            class207.field3618.method1714(var3 + var3 + 3, -714043120);
        }
        class7.field79 = class24.field349[0];
        class18.field259 = class34.field512[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class207.field3618.method1714(class24.field349[arg1] - var4, -714043120);
            class207.field3618.method1672(true, class34.field512[arg1] - var5);
        }
        class207.field3618.method1673(class213.field3742 + var5, true);
        class207.field3618.method1680((byte) 77, class244.field4172 + var4);
        class207.field3618.method1699(class105.field1843[82] ? 1 : 0, -22728);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2218 = null;
        field2223 = null;
        if (arg0 != 1815) {
            method860(true, 42, (class264[]) null);
        }
        field2220 = null;
        field2217 = null;
        field2236 = null;
        field2216 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI[Lkc;)V")
    public static final void method860(boolean arg0, int arg1, class264[] arg2) {
        field2235++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class228.field3952[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class228.field3952[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method1820(true, var5, var4);
                            }
                        }
                    }
                }
            }
            class27.field408 += (int) (Math.random() * 5.0D) - 2;
            if (class27.field408 < -8) {
                class27.field408 = -8;
            }
            if (class27.field408 > 8) {
                class27.field408 = 8;
            }
            class2.field21 += (int) (Math.random() * 5.0D) - 2;
            if (class2.field21 < -16) {
                class2.field21 = -16;
            }
            if (class2.field21 > 16) {
                class2.field21 = 16;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int[][] var8 = new int[104][104];
        int[][] var9 = new int[104][104];
        int var10 = class2.field21 >> 1;
        int var11 = class27.field408 >> 2 << 10;
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class264.field4718[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class245.field4193[var12][var100][var54 + 1] - class245.field4193[var12][var100][var54 - 1];
                    int var103 = class245.field4193[var12][var100 + 1][var54] - class245.field4193[var12][var100 - 1][var54];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -50 + var106 * -10) / var53 + var101;
                    int var109 = (var51[var100][var54 - 1] >> 2) + (var51[var100 - 1][var54] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1);
                    var8[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class66.field1222[var55] = 0;
                class82.field1496[var55] = 0;
                class152.field2597[var55] = 0;
                class128.field2253[var55] = 0;
                class105.field1846[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class229.field3964[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class20 var96 = method862((byte) 103, var95 - 1);
                            class66.field1222[var85] += var96.field287;
                            class82.field1496[var85] += var96.field280;
                            class152.field2597[var85] += var96.field296;
                            class128.field2253[var85] += var96.field281;
                            var10002 = class105.field1846[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class229.field3964[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class20 var99 = method862((byte) 103, var98 - 1);
                            class66.field1222[var85] -= var99.field287;
                            class82.field1496[var85] -= var99.field280;
                            class152.field2597[var85] -= var99.field296;
                            class128.field2253[var85] -= var99.field281;
                            var10002 = class105.field1846[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var87 += class82.field1496[var92];
                            var90 += class105.field1846[var92];
                            var86 += class66.field1222[var92];
                            var89 += class128.field2253[var92];
                            var88 += class152.field2597[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var86 -= class66.field1222[var93];
                            var89 -= class128.field2253[var93];
                            var87 -= class82.field1496[var93];
                            var90 -= class105.field1846[var93];
                            var88 -= class152.field2597[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var9[var56][var91] = class242.method1643(var88 / var90, -767686425, var87 / var90, var86 * 256 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class121.method833((byte) 30) || (class228.field3952[0][var57][var58] & 0x2) != 0 || (class228.field3952[var12][var57][var58] & 0x10) == 0 && class251.method1733(var12, var57, (byte) 122, var58) == class82.field1498) {
                        if (class204.field3559 > var12) {
                            class204.field3559 = var12;
                        }
                        int var59 = class229.field3964[var12][var57][var58] & 0xFF;
                        int var60 = class151.field2557[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class245.field4193[var12][var57][var58];
                            int var62 = class245.field4193[var12][var57 + 1][var58 + 1];
                            int var63 = class245.field4193[var12][var57 + 1][var58];
                            int var64 = class245.field4193[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class49.field871[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class191.method1314(-51, var60 - 1).field3283) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var63 && var61 == var62 && var61 == var64) {
                                    class228.field3954[var12][var57][var58] = class75.method528(class228.field3954[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var9[var57][var58];
                                int var67 = (var66 & 0x7F) + var10;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var66 & 0x380) + (var11 + var66 & 0xFC00) + var67;
                                var69 = class173.field2990[class119.method829(75, var68, 96)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var8[var57][var58];
                            int var71 = var8[var57 + 1][var58];
                            int var72 = var8[var57 + 1][var58 + 1];
                            int var73 = var8[var57][var58 + 1];
                            if (var60 == 0) {
                                class1.method5(var12, var57, var58, 0, 0, -1, var61, var63, var62, var64, class119.method829(103, var66, var70), class119.method829(92, var66, var71), class119.method829(100, var66, var72), class119.method829(126, var66, var73), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class49.field871[var12][var57][var58] + 1;
                                byte var75 = class242.field4154[var12][var57][var58];
                                class191 var76 = class191.method1314(-113, var60 - 1);
                                int var77 = var76.field3279;
                                if (var77 >= 0 && !class173.field2987.method683(68, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class173.field2990[class71.method499(96, -8971, class173.field2987.method681((byte) 78, var77))];
                                } else if (var76.field3272 == -1) {
                                    var79 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field3272;
                                    int var80 = (var78 & 0x7F) + var10;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var11 + var78 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class173.field2990[class71.method499(96, -8971, var81)];
                                }
                                if (var76.field3282 >= 0) {
                                    int var82 = var76.field3282;
                                    int var83 = (var82 & 0x7F) + var10;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var11 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class173.field2990[class71.method499(96, -8971, var84)];
                                }
                                class1.method5(var12, var57, var58, var74, var75, var77, var61, var63, var62, var64, class119.method829(arg1 ^ 0xFFFF86D6, var66, var70), class119.method829(77, var66, var71), class119.method829(arg1 ^ 0xFFFF869D, var66, var72), class119.method829(117, var66, var73), class71.method499(var70, arg1 + 22025, var78), class71.method499(var71, -8971, var78), class71.method499(var72, arg1 ^ 0x5A19, var78), class71.method499(var73, -8971, var78), var69, var79);
                            }
                        }
                    }
                }
            }
            class229.field3964[var12] = null;
            class151.field2557[var12] = null;
            class49.field871[var12] = null;
            class242.field4154[var12] = null;
            class264.field4718[var12] = null;
        }
        if (arg1 != -30996) {
            field2218 = null;
        }
        class48.method325(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class228.field3952[1][var13][var50] & 0x2) == 2) {
                    class236.method1580(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class228.field3954[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 < 104 && (class228.field3954[var14][var16][var17 + 1] & 0x1) != 0; var17++) {
                        }
                        int var18;
                        for (var18 = var15; var18 > 0 && (class228.field3954[var14][var16][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var14;
                        int var20;
                        label354: for (var20 = var14; var20 > 0; var20--) {
                            for (int var21 = var18; var21 <= var17; var21++) {
                                if ((class228.field3954[var20 - 1][var16][var21] & 0x1) == 0) {
                                    break label354;
                                }
                            }
                        }
                        label343: while (var19 < 3) {
                            for (int var22 = var18; var22 <= var17; var22++) {
                                if ((class228.field3954[var19 + 1][var16][var22] & 0x1) == 0) {
                                    break label343;
                                }
                            }
                            var19++;
                        }
                        int var23 = (var19 + 1 - var20) * (var17 + 1 - var18);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class245.field4193[var19][var16][var18] - var24;
                            int var26 = class245.field4193[var20][var16][var18];
                            class37.method250(1, var16 * 128, var16 * 128, var18 * 128, var17 * 128 + 128, var25, var26);
                            for (int var27 = var20; var27 <= var19; var27++) {
                                for (int var28 = var18; var28 <= var17; var28++) {
                                    class228.field3954[var27][var16][var28] = class135.method899(class228.field3954[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class228.field3954[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class228.field3954[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var16;
                        int var31 = var14;
                        while (var30 < 104 && (class228.field3954[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        int var32 = var14;
                        label409: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class228.field3954[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label409;
                                }
                            }
                            var31--;
                        }
                        label398: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class228.field3954[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label398;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var30 + 1 - var29) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class245.field4193[var32][var29][var15] - var36;
                            int var38 = class245.field4193[var31][var29][var15];
                            class37.method250(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class228.field3954[var39][var40][var15] = class135.method899(class228.field3954[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class228.field3954[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42;
                        for (var42 = var15; var42 > 0 && (class228.field3954[var14][var16][var42 - 1] & 0x4) != 0; var42--) {
                        }
                        int var43 = var16;
                        int var44;
                        for (var44 = var15; var44 < 104 && (class228.field3954[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label464: while (var41 > 0) {
                            for (int var45 = var42; var45 <= var44; var45++) {
                                if ((class228.field3954[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label464;
                                }
                            }
                            var41--;
                        }
                        label453: while (var43 < 104) {
                            for (int var46 = var42; var46 <= var44; var46++) {
                                if ((class228.field3954[var14][var43 + 1][var46] & 0x4) == 0) {
                                    break label453;
                                }
                            }
                            var43++;
                        }
                        if (((var44 + 1 - var42) * (var43 + 1 - var41)) >= 4) {
                            int var47 = class245.field4193[var14][var41][var42];
                            class37.method250(4, var41 * 128, var43 * 128 + 128, var42 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var43; var48++) {
                                for (int var49 = var42; var49 <= var44; var49++) {
                                    class228.field3954[var14][var48][var49] = class135.method899(class228.field3954[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lof;")
    public final class253 method861(int arg0) {
        field2230++;
        if (arg0 != -3) {
            this.method856(-121);
        }
        if (this.field2231 > 0 && this.field2221.field3568[this.field2231 - 1] != this.field2219) {
            class253 var2 = this.field2219;
            this.field2219 = var2.field4370;
            return var2;
        }
        while (this.field2231 < this.field2221.field3555) {
            class253 var3 = this.field2221.field3568[this.field2231++].field4370;
            if (this.field2221.field3568[this.field2231 - 1] != var3) {
                this.field2219 = var3.field4370;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lbk;")
    public static final class20 method862(byte arg0, int arg1) {
        field2233++;
        class20 var2 = (class20) class54.field950.method1269((long) arg1, (byte) 114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class61.field1145.method464(-1, 1, arg1);
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method143((byte) 102, arg1, new class247(var3));
        }
        if (arg0 != 103) {
            field2223 = null;
        }
        class54.field950.method1271(-15561, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILti;)V")
    public static final void method863(int arg0, class5 arg1) {
        field2226++;
        int var2 = -56 % ((arg0 + 1) / 43);
        class252.method1741(111, arg1, 200000);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lpa;)V")
    public class127(class204 arg0) {
        this.field2221 = arg0;
    }
}
