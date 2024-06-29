import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class159 extends class114 {

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2048 = new String[] { method1347(method1346("dW(\u00152+")), method1347(method1346("dW(\u00155+")), method1347(method1346("dW(\u00151+")), method1347(method1346("mI%W")), method1347(method1346("x\u0012g\u0015\r")), method1347(method1346("dW(\u00154+")), method1347(method1346("dW(\u00156+")), method1347(method1346("Wjs\u001b")) };

    @OriginalMember(owner = "client!gka", name = "k", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!gka", name = "n", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!gka", name = "l", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!gka", name = "o", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!gka", name = "m", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!gka", name = "j", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!gka", name = "p", descriptor = "Ljava/lang/String;")
    private String field2041;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljc;I)V", line = 4)
    public final void method116(class711 arg0, int arg1) {
        try {
            field2047++;
            this.field2041 = arg0.method5144(-16414);
            if (arg1 != -27800) {
                field2046 = -39;
            }
            arg0.method5113(18443);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2048[2] + (arg0 == null ? field2048[3] : field2048[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1342(int arg0) {
        try {
            field2042++;
            for (class500 var1 = (class500) class687.field9624.method3696(arg0 + 8785); var1 != null; var1 = (class500) class687.field9624.method3697(arg0 ^ 0x226A)) {
                if (var1.field7313.method3100(10)) {
                    class531.method4019(var1.field7305, 75);
                } else {
                    var1.field7313.method1719((byte) 123);
                    try {
                        var1.field7313.method3107((byte) -79);
                    } catch (Exception var6) {
                        class162.method1374(var6, field2048[7] + var1.field7305, (byte) -93);
                        class531.method4019(var1.field7305, 125);
                    }
                    if (!var1.field7311 && !var1.field7303) {
                        class89 var3 = var1.field7313.method3101((byte) -108);
                        if (var3 != null) {
                            class754 var4 = var3.method882(0);
                            if (var4 != null) {
                                var4.method5467(var1.field7307, 0);
                                class261.field3699.method4230(var4);
                                var1.field7311 = true;
                            }
                        }
                    }
                }
            }
            if (arg0 != -8785) {
                method1343((byte) 59);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2048[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)V", line = 79)
    public static final void method1343(byte arg0) {
        try {
            if (arg0 >= -84) {
                method1343((byte) 32);
            }
            field2045++;
            class15.field193.method3690((byte) 118);
            class103.field1364.method3690((byte) 14);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2048[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIIIII)V", line = 92)
    public static final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field2043++;
            int var7 = class689.field9642;
            class318.field4354 = 0;
            int[] var8 = class599.field8595;
            for (int var9 = 0; var9 < class438.field6458 + var7; var9++) {
                class134 var10 = null;
                class170 var11;
                if (var7 > var9) {
                    var11 = class748.field10666[var8[var9]];
                } else {
                    var11 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var9 - var7])).field7672;
                    var10 = ((class717) var11).field10229;
                    if (var10.field1659 != null) {
                        var10 = var10.method1178(class734.field10459, (byte) -120);
                        if (var10 == null) {
                            continue;
                        }
                    }
                }
                if (var11.field2174 >= 0 && (class671.field9454 == var11.field2186 || class203.field2988.field2981 == var11.field2981)) {
                    class237.method1962(arg1, var11.method1439((byte) -95), arg6 >> 1, arg3 >> 1, var11, (byte) -50, arg5);
                    if (class302.field4219[0] >= 0) {
                        if (var11.field2170 != null && (var9 >= var7 || class391.field5715 == 0 || class391.field5715 == 3 || class391.field5715 == 1 && class521.method3963(((class339) var11).field4905, -1)) && class318.field4354 < class761.field10867) {
                            class761.field10862[class318.field4354] = class520.field7584.method1368(var11.field2170, -106) / 2;
                            class761.field10864[class318.field4354] = class302.field4219[0];
                            class761.field10868[class318.field4354] = class302.field4219[1];
                            class761.field10870[class318.field4354] = var11.field2205;
                            class761.field10869[class318.field4354] = var11.field2175;
                            class761.field10866[class318.field4354] = var11.field2222;
                            class761.field10865[class318.field4354] = var11.field2170;
                            class318.field4354++;
                        }
                        int var12 = arg2 + class302.field4219[1];
                        int var23;
                        if (var11.field2212 || var11.field2214 <= class694.field9700) {
                            var23 = var12 - Math.max(class520.field7584.field2071, class142.field1842[0].method1377());
                        } else {
                            boolean var13 = true;
                            byte var14 = 1;
                            int var16;
                            if (var9 < var7) {
                                class339 var15 = class748.field10666[var8[var9]];
                                var16 = var11.method1430(27750).field10896;
                                if (var15.field4909) {
                                    var14 = 2;
                                }
                            } else {
                                var16 = var10.field1662;
                                if (var16 == -1) {
                                    var16 = var11.method1430(arg0 ^ 0x3C543147).field10896;
                                }
                            }
                            class392[] var17 = class142.field1842;
                            if (var16 != -1) {
                                class392[] var18 = (class392[]) class255.field3662.method2053(arg0 - 1012161825, (long) var16);
                                if (var18 == null) {
                                    class66[] var19 = class66.method694(class524.field7640, var16, 0);
                                    if (var19 != null) {
                                        var18 = new class392[var19.length];
                                        for (int var20 = 0; var20 < var19.length; var20++) {
                                            var18[var20] = class236.field3418.method231(var19[var20], true);
                                        }
                                        class255.field3662.method2051((long) var16, var18, 93);
                                    }
                                }
                                if (var18 != null && var18.length >= 2) {
                                    var17 = var18;
                                }
                            }
                            if (var17.length <= var14) {
                                var14 = 1;
                            }
                            class392 var21 = var17[0];
                            class392 var22 = var17[var14];
                            var23 = var12 - Math.max(class520.field7584.field2071, var21.method1377());
                            int var24 = arg4 - ((var21.method1376() >> 1) - class302.field4219[0]);
                            int var25 = var21.method1376() * var11.field2190 / 255;
                            int var26 = var21.method1377();
                            if (var11.field2190 > 0 && var25 < 2) {
                                var25 = 2;
                            }
                            var21.method3074(var24, var23);
                            class236.field3418.method230(var24, var23, var24 + var25, var23 - -var26);
                            var22.method3074(var24, var23);
                            class236.field3418.method208(arg4, arg2, arg4 + arg6, arg2 + arg3);
                            class232.method1925(var23, var24, var23 + var26, var21.method1378() + var24, (byte) -126);
                        }
                        var23 -= 2;
                        if (!var11.field2212) {
                            if (var11.field2177 > class694.field9700) {
                                class392 var27 = class121.field1532[var11.field2220 ? 2 : 0];
                                class392 var28 = class121.field1532[var11.field2220 ? 3 : 1];
                                boolean var29 = true;
                                int var30;
                                if (var11 instanceof class717) {
                                    var30 = var10.field1694;
                                    if (var30 == -1) {
                                        var30 = var11.method1430(arg0 - 1012134075).field10890;
                                    }
                                } else {
                                    var30 = var11.method1430(27750).field10890;
                                }
                                if (var30 != -1) {
                                    class392[] var31 = (class392[]) class565.field8248.method2053(arg0 ^ 0x3C545D21, (long) var30);
                                    if (var31 == null) {
                                        class66[] var32 = class66.method694(class524.field7640, var30, 0);
                                        if (var32 != null) {
                                            var31 = new class392[var32.length];
                                            for (int var33 = 0; var33 < var32.length; var33++) {
                                                var31[var33] = class236.field3418.method231(var32[var33], true);
                                            }
                                            class565.field8248.method2051((long) var30, var31, 93);
                                        }
                                    }
                                    if (var31 != null && var31.length == 4) {
                                        var28 = var31[var11.field2220 ? 3 : 1];
                                        var27 = var31[var11.field2220 ? 2 : 0];
                                    }
                                }
                                int var34 = var11.field2177 - class694.field9700;
                                int var37;
                                if (var34 > var11.field2202) {
                                    int var35 = var34 - var11.field2202;
                                    int var36 = var11.field2185 == 0 ? 0 : (var11.field2225 - var35) / var11.field2185 * var11.field2185;
                                    var37 = var36 * var27.method1376() / var11.field2225;
                                } else {
                                    var37 = var27.method1376();
                                }
                                int var38 = var27.method1377();
                                var23 -= var38;
                                int var39 = class302.field4219[0] + arg4 - (var27.method1376() >> 1);
                                var27.method3074(var39, var23);
                                class236.field3418.method230(var39, var23, var37 + var39, var23 + var38);
                                var28.method3074(var39, var23);
                                class236.field3418.method208(arg4, arg2, arg4 + arg6, arg2 + arg3);
                                class232.method1925(var23, var39, var23 + var38, var27.method1378() + var39, (byte) -98);
                                var23 -= 2;
                            }
                            if (var7 > var9) {
                                class339 var41 = (class339) var11;
                                if (var41.field4944 != -1) {
                                    var23 -= 25;
                                    class392 var42 = class503.field7353[var41.field4944];
                                    var42.method3074(arg4 + class302.field4219[0] - 12, var23);
                                    class232.method1925(var23, arg4 + class302.field4219[0] - 12, var23 - -var42.method1380(), class302.field4219[0] + (arg4 - -var42.method1378()) - 12, (byte) 121);
                                    var23 -= 2;
                                }
                                if (var41.field4920 != -1) {
                                    var23 -= 25;
                                    class392 var43 = class89.field1242[var41.field4920];
                                    var43.method3074(class302.field4219[0] + arg4 - 12, var23);
                                    class232.method1925(var23, arg4 + class302.field4219[0] - 12, var23 + var43.method1380(), class302.field4219[0] + arg4 + var43.method1378() - 12, (byte) 82);
                                    var23 -= 2;
                                }
                            } else if (var10.field1716 >= 0 && class89.field1242.length > var10.field1716) {
                                var23 -= 25;
                                class392 var40 = class89.field1242[var10.field1716];
                                var40.method3074(arg4 + class302.field4219[0] - (var40.method1376() >> 1), var23);
                                class232.method1925(var23, arg4 + (class302.field4219[0] - (var40.method1376() >> 1)), var40.method1380() + var23, arg4 + class302.field4219[0] - (var40.method1376() >> 1) + var40.method1378(), (byte) -109);
                                var23 -= 2;
                            }
                        }
                        int var10000;
                        if (!(var11 instanceof class339)) {
                            int var44 = 0;
                            class337[] var45 = class99.field1336;
                            for (int var46 = 0; var46 < var45.length; var46++) {
                                class337 var47 = var45[var46];
                                if (var47 != null && var47.field4876 == 1 && class343.field4987[var9 - var7] == var47.field4877) {
                                    class392 var48 = class41.field624[var47.field4874];
                                    if (var48.method1377() > var44) {
                                        var44 = var48.method1377();
                                    }
                                    if (class694.field9700 % 20 < 10) {
                                        var48.method3074(class302.field4219[0] + arg4 - 12, -var48.method1377() + var23);
                                        class232.method1925(var23 - var48.method1377(), arg4 - -class302.field4219[0] - 12, var23 - var48.method1377() + var48.method1380(), class302.field4219[0] + arg4 + -12 + var48.method1378(), (byte) -68);
                                    }
                                }
                            }
                            if (var44 > 0) {
                                var10000 = var23 - (var44 + 2);
                            }
                        } else if (var9 >= 0) {
                            int var50 = 0;
                            class337[] var51 = class99.field1336;
                            for (int var52 = 0; var52 < var51.length; var52++) {
                                class337 var53 = var51[var52];
                                if (var53 != null && var53.field4876 == 10 && var8[var9] == var53.field4877) {
                                    class392 var54 = class41.field624[var53.field4874];
                                    if (var54.method1377() > var50) {
                                        var50 = var54.method1377();
                                    }
                                    var54.method3074(arg4 + class302.field4219[0] - 12, var23 - var54.method1377());
                                    class232.method1925(var23 - var54.method1377(), arg4 + -12 + class302.field4219[0], var23 - var54.method1377() + var54.method1380(), arg4 + -12 + (class302.field4219[0] - -var54.method1378()), (byte) -72);
                                }
                            }
                            if (var50 > 0) {
                                var10000 = var23 - (var50 + 2);
                            }
                        }
                        for (int var56 = 0; var56 < class455.field6642; var56++) {
                            int var57 = var11.field2213[var56];
                            int var58 = var11.field2179[var56];
                            class459 var59 = null;
                            int var60 = 0;
                            if (var58 >= 0) {
                                if (class694.field9700 >= var57) {
                                    continue;
                                }
                                var59 = class561.field8158.method1407((byte) -79, var11.field2179[var56]);
                                var60 = var59.field6694;
                            } else if (var57 < 0) {
                                continue;
                            }
                            int var61 = var11.field2208[var56];
                            class459 var62 = null;
                            if (var61 >= 0) {
                                var62 = class561.field8158.method1407((byte) 48, var61);
                            }
                            if ((var57 - var60) <= class694.field9700) {
                                int var63 = var11.field2210[var56];
                                if (var63 >= 0) {
                                    var11.field2190 = var63;
                                    var11.field2214 = class694.field9700 + 300;
                                    var11.field2210[var56] = -1;
                                }
                                if (var59 == null) {
                                    var11.field2213[var56] = -1;
                                } else {
                                    int var64 = var11.method1439((byte) -120) / 2;
                                    class237.method1962(arg1, var64, arg6 >> 1, arg3 >> 1, var11, (byte) -119, arg5);
                                    if (class302.field4219[0] > -1) {
                                        class302.field4219[0] += class128.field1601[var56];
                                        class302.field4219[1] += class274.field3887[var56];
                                        Object var65 = null;
                                        Object var66 = null;
                                        Object var67 = null;
                                        Object var68 = null;
                                        int var69 = 0;
                                        int var70 = 0;
                                        int var71 = 0;
                                        int var72 = 0;
                                        int var73 = 0;
                                        int var74 = 0;
                                        int var75 = 0;
                                        int var76 = 0;
                                        class392 var77 = null;
                                        class392 var78 = null;
                                        class392 var79 = null;
                                        class392 var80 = null;
                                        int var81 = 0;
                                        int var82 = 0;
                                        int var83 = 0;
                                        int var84 = 0;
                                        int var85 = 0;
                                        int var86 = 0;
                                        int var87 = 0;
                                        int var88 = 0;
                                        int var89 = 0;
                                        class392 var90 = var59.method3525((byte) -54, class236.field3418);
                                        if (var90 != null) {
                                            var69 = var90.method1376();
                                            int var91 = var90.method1377();
                                            if (var91 > var89) {
                                                var89 = var91;
                                            }
                                            var90.method1373(class314.field4308);
                                            var73 = class314.field4308[0];
                                        }
                                        class392 var92 = var59.method3530(class236.field3418, false);
                                        if (var92 != null) {
                                            var70 = var92.method1376();
                                            int var93 = var92.method1377();
                                            var92.method1373(class314.field4308);
                                            if (var93 > var89) {
                                                var89 = var93;
                                            }
                                            var74 = class314.field4308[0];
                                        }
                                        class392 var94 = var59.method3527((byte) 105, class236.field3418);
                                        if (var94 != null) {
                                            var71 = var94.method1376();
                                            int var95 = var94.method1377();
                                            if (var95 > var89) {
                                                var89 = var95;
                                            }
                                            var94.method1373(class314.field4308);
                                            var75 = class314.field4308[0];
                                        }
                                        class392 var96 = var59.method3532(class236.field3418, (byte) 104);
                                        if (var96 != null) {
                                            var72 = var96.method1376();
                                            int var97 = var96.method1377();
                                            if (var89 < var97) {
                                                var89 = var97;
                                            }
                                            var96.method1373(class314.field4308);
                                            var76 = class314.field4308[0];
                                        }
                                        if (var62 != null) {
                                            var77 = var62.method3525((byte) -114, class236.field3418);
                                            if (var77 != null) {
                                                var81 = var77.method1376();
                                                int var98 = var77.method1377();
                                                var77.method1373(class314.field4308);
                                                if (var98 > var89) {
                                                    var89 = var98;
                                                }
                                                var85 = class314.field4308[0];
                                            }
                                            var78 = var62.method3530(class236.field3418, false);
                                            if (var78 != null) {
                                                var82 = var78.method1376();
                                                int var99 = var78.method1377();
                                                var78.method1373(class314.field4308);
                                                if (var89 < var99) {
                                                    var89 = var99;
                                                }
                                                var86 = class314.field4308[0];
                                            }
                                            var79 = var62.method3527((byte) 105, class236.field3418);
                                            if (var79 != null) {
                                                var83 = var79.method1376();
                                                int var100 = var79.method1377();
                                                var79.method1373(class314.field4308);
                                                if (var89 < var100) {
                                                    var89 = var100;
                                                }
                                                var87 = class314.field4308[0];
                                            }
                                            var80 = var62.method3532(class236.field3418, (byte) 104);
                                            if (var80 != null) {
                                                var84 = var80.method1376();
                                                int var101 = var80.method1377();
                                                if (var89 < var101) {
                                                    var89 = var101;
                                                }
                                                var80.method1373(class314.field4308);
                                                var88 = class314.field4308[0];
                                            }
                                        }
                                        class216 var102 = class626.field8945;
                                        class216 var103 = class626.field8945;
                                        class161 var104 = class17.field218;
                                        class161 var105 = class17.field218;
                                        int var106 = var59.field6698;
                                        if (var106 >= 0) {
                                            class216 var107 = class72.method753(class236.field3418, var106, true, arg0 ^ 0xC3ABA2DE);
                                            class161 var108 = class768.method5545((byte) -126, class236.field3418, var106);
                                            if (var107 != null && var108 != null) {
                                                var104 = var108;
                                                var102 = var107;
                                            }
                                        }
                                        if (var62 != null) {
                                            int var109 = var62.field6698;
                                            if (var109 >= 0) {
                                                class216 var110 = class72.method753(class236.field3418, var109, true, -1);
                                                class161 var111 = class768.method5545((byte) -126, class236.field3418, var109);
                                                if (var110 != null && var111 != null) {
                                                    var103 = var110;
                                                    var105 = var111;
                                                }
                                            }
                                        }
                                        Object var112 = null;
                                        String var113 = null;
                                        boolean var114 = false;
                                        String var115 = var59.method3526(var11.field2197[var56], -2);
                                        int var116 = 0;
                                        int var117 = var104.method1368(var115, arg0 ^ 0xC3ABA292);
                                        if (var62 != null) {
                                            var113 = var62.method3526(var11.field2227[var56], -2);
                                            var116 = var105.method1368(var113, arg0 - 1012161945);
                                        }
                                        int var118 = 0;
                                        int var119 = 0;
                                        if (var70 > 0) {
                                            var118 = var117 / var70 + 1;
                                        }
                                        if (var62 != null && var82 > 0) {
                                            var119 = var116 / var82 + 1;
                                        }
                                        int var120 = 0;
                                        int var121 = var120;
                                        if (var69 > 0) {
                                            var120 += var69;
                                        }
                                        var120 += 2;
                                        int var122 = var120;
                                        if (var71 > 0) {
                                            var120 += var71;
                                        }
                                        int var123 = var120;
                                        int var124 = var120;
                                        int var125;
                                        if (var70 <= 0) {
                                            var125 = var117 + var120;
                                        } else {
                                            int var126 = var70 * var118;
                                            var125 = var120 + var126;
                                            var124 = (var126 - var117) / 2 + var120;
                                        }
                                        int var127 = var125;
                                        if (var72 > 0) {
                                            var125 += var72;
                                        }
                                        int var128 = 0;
                                        int var129 = 0;
                                        int var130 = 0;
                                        int var131 = 0;
                                        int var132 = 0;
                                        if (var62 != null) {
                                            var125 += 2;
                                            var128 = var125;
                                            if (var81 > 0) {
                                                var125 += var81;
                                            }
                                            var125 += 2;
                                            var129 = var125;
                                            if (var83 > 0) {
                                                var125 += var83;
                                            }
                                            var132 = var125;
                                            var130 = var125;
                                            if (var82 > 0) {
                                                int var133 = var82 * var119;
                                                var125 += var133;
                                                var132 += (var133 - var116) / 2;
                                            } else {
                                                var125 += var116;
                                            }
                                            var131 = var125;
                                            if (var84 > 0) {
                                                var125 += var84;
                                            }
                                        }
                                        int var134 = var11.field2213[var56] - class694.field9700;
                                        int var135 = var59.field6675 - (var59.field6675 * var134 / var59.field6694);
                                        int var136 = var59.field6693 * var134 / var59.field6694 - var59.field6693;
                                        int var137 = arg4 + class302.field4219[0] + var135 - (var125 >> 1);
                                        int var138 = class302.field4219[1] + var136 + arg2 - 12;
                                        int var139 = var138;
                                        int var140 = var89 + var138;
                                        int var141 = var138 + var59.field6702 + 15;
                                        int var142 = var141 - var104.field2071;
                                        int var143 = var104.field2062 + var141;
                                        if (var138 > var142) {
                                            var139 = var142;
                                        }
                                        if (var143 > var140) {
                                            var140 = var143;
                                        }
                                        int var144 = 0;
                                        if (var62 != null) {
                                            var144 = var138 + var62.field6702 + 15;
                                            int var145 = var144 - var105.field2071;
                                            if (var145 < var139) {
                                                var139 = var145;
                                            }
                                            int var146 = var105.field2062 + var144;
                                            if (var140 < var146) {
                                                var140 = var146;
                                            }
                                        }
                                        int var147 = 255;
                                        if (var59.field6684 >= 0) {
                                            var147 = (var134 << 8) / (var59.field6694 - var59.field6684);
                                        }
                                        if (var147 >= 0 && var147 < 255) {
                                            int var148 = var147 << 24;
                                            int var149 = var148 | 0xFFFFFF;
                                            if (var90 != null) {
                                                var90.method874(var121 + var137 - var73, var138, 0, var149, 1);
                                            }
                                            if (var94 != null) {
                                                var94.method874(var122 + var137 - var75, var138, 0, var149, 1);
                                            }
                                            if (var92 != null) {
                                                for (int var150 = 0; var150 < var118; var150++) {
                                                    var92.method874(var137 + var70 * var150 + var123 - var74, var138, 0, var149, 1);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method874(var137 + var127 - var76, var138, 0, var149, 1);
                                            }
                                            var102.method1828(var141, var115, true, 0, var137 + var124, var59.field6685 | var148);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method874(var137 + var128 - var85, var138, 0, var149, 1);
                                                }
                                                if (var79 != null) {
                                                    var79.method874(var137 + var129 - var87, var138, 0, var149, 1);
                                                }
                                                if (var78 != null) {
                                                    for (int var151 = 0; var151 < var119; var151++) {
                                                        var78.method874(var137 - (-var130 - ((var82 * var151) - var86)), var138, 0, var149, 1);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method874(var137 - (var88 - var131), var138, 0, var149, 1);
                                                }
                                                var103.method1828(var144, var113, true, 0, var137 + var132, var148 | var62.field6685);
                                            }
                                        } else {
                                            if (var90 != null) {
                                                var90.method3074(var121 + var137 - var73, var138);
                                            }
                                            if (var94 != null) {
                                                var94.method3074(var122 + var137 - var75, var138);
                                            }
                                            if (var92 != null) {
                                                for (int var152 = 0; var152 < var118; var152++) {
                                                    var92.method3074(var70 * var152 + var123 + var137 - var74, var138);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method3074(var127 + var137 - var76, var138);
                                            }
                                            var102.method1828(var141, var115, true, 0, var124 + var137, var59.field6685 | 0xFF000000);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method3074(var128 + var137 - var85, var138);
                                                }
                                                if (var79 != null) {
                                                    var79.method3074(var137 - (var87 - var129), var138);
                                                }
                                                if (var78 != null) {
                                                    for (int var153 = 0; var153 < var119; var153++) {
                                                        var78.method3074(var82 * var153 + var130 + var137 - var86, var138);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method3074(var131 + var137 - var88, var138);
                                                }
                                                var103.method1828(var144, var113, true, 0, var132 + var137, var62.field6685 | 0xFF000000);
                                            }
                                        }
                                        class232.method1925(var139, var137, var140 + 1, var125 + var137, (byte) 116);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arg0 != 1012161825) {
                field2046 = 102;
            }
            for (int var154 = 0; var154 < class130.field1619; var154++) {
                int var155 = class744.field10567[var154];
                class170 var156;
                if (var155 < 2048) {
                    var156 = class748.field10666[var155];
                } else {
                    var156 = ((class527) class479.field7063.method3693(false, (long) (var155 - 2048))).field7672;
                }
                int var157 = class38.field596[var154];
                class170 var158;
                if (var157 >= 2048) {
                    var158 = ((class527) class479.field7063.method3693(false, (long) (var157 - 2048))).field7672;
                } else {
                    var158 = class748.field10666[var157];
                }
                class82.method803(var156, arg5, --var156.field2191, arg4, var158, arg3, arg0 ^ 0x3C545D31, arg1, arg2, arg6);
            }
            int var159 = class520.field7584.field2071 + class520.field7584.field2062 + 2;
            for (int var160 = 0; var160 < class318.field4354; var160++) {
                int var161 = class761.field10864[var160];
                int var162 = class761.field10868[var160];
                int var163 = class761.field10862[var160];
                boolean var164 = true;
                while (var164) {
                    var164 = false;
                    for (int var165 = 0; var165 < var160; var165++) {
                        if (var162 + 2 > class761.field10868[var165] + -var159 && (var162 - var159) < (class761.field10868[var165] + 2) && var161 - var163 < class761.field10864[var165] + class761.field10862[var165] && class761.field10864[var165] - class761.field10862[var165] < var161 + var163 && (class761.field10868[var165] - var159) < var162) {
                            var164 = true;
                            var162 = class761.field10868[var165] - var159;
                        }
                    }
                }
                class761.field10868[var160] = var162;
                String var166 = class761.field10865[var160];
                int var167 = class520.field7584.method1368(var166, -127);
                int var168 = arg4 + var161;
                int var169 = arg2 + var162 - class520.field7584.field2071;
                int var170 = var167 + var168;
                int var171 = arg2 + var162 + class520.field7584.field2062;
                if (class524.field7642 == 0) {
                    int var172 = 16776960;
                    if (class761.field10870[var160] < 6) {
                        var172 = class215.field3139[class761.field10870[var160]];
                    }
                    if (class761.field10870[var160] == 6) {
                        var172 = (class671.field9454 % 20) < 10 ? 16711680 : 16776960;
                    }
                    if (class761.field10870[var160] == 7) {
                        var172 = class671.field9454 % 20 < 10 ? 255 : 65535;
                    }
                    if (class761.field10870[var160] == 8) {
                        var172 = (class671.field9454 % 20) < 10 ? 45056 : 8454016;
                    }
                    if (class761.field10870[var160] == 9) {
                        int var173 = 150 - class761.field10866[var160];
                        if (var173 < 50) {
                            var172 = var173 * 1280 + 16711680;
                        } else if (var173 < 100) {
                            var172 = 16776960 - ((var173 - 50) * 327680);
                        } else if (var173 < 150) {
                            var172 = (var173 * 5) + 65280 - 500;
                        }
                    }
                    if (class761.field10870[var160] == 10) {
                        int var174 = 150 - class761.field10866[var160];
                        if (var174 < 50) {
                            var172 = (var174 * 5) + 16711680;
                        } else if (var174 < 100) {
                            var172 = 16711935 - ((var174 - 50) * 327680);
                        } else if (var174 < 150) {
                            var172 = (var174 - 100) * 327680 + 255 + 500 - (var174 * 5);
                        }
                    }
                    if (class761.field10870[var160] == 11) {
                        int var175 = 150 - class761.field10866[var160];
                        if (var175 < 50) {
                            var172 = 16777215 - (var175 * 327685);
                        } else if (var175 < 100) {
                            var172 = (var175 * 327685) - 16318970;
                        } else if (var175 < 150) {
                            var172 = 16777215 + 32768000 - (var175 * 327680);
                        }
                    }
                    int var176 = var172 | 0xFF000000;
                    if (class761.field10869[var160] == 0) {
                        var168 -= var167 >> 1;
                        var170 -= var167 >> 1;
                        class200.field2954.method1825(arg2 + var162, arg4 - -var161, var176, -16777216, (byte) -101, var166);
                    }
                    if (class761.field10869[var160] == 1) {
                        var169 -= 5;
                        var168 -= var167 >> 1;
                        class200.field2954.method1823(var176, arg2 + var162, -16777216, var166, arg4 + var161, (byte) -124, class671.field9454);
                        var170 -= var167 >> 1;
                        var171 += 5;
                    }
                    if (class761.field10869[var160] == 2) {
                        var169 -= 5;
                        var168 -= (var167 >> 1) + 5;
                        class200.field2954.method1818(arg2 + var162, var166, arg4 + var161, var176, class671.field9454, -16777216, arg0 - 1012161735);
                        var170 -= (var167 >> 1) - 5;
                        var171 += 5;
                    }
                    if (class761.field10869[var160] == 3) {
                        var168 -= var167 >> 1;
                        var170 -= var167 >> 1;
                        var169 -= 7;
                        class200.field2954.method1817(-16777216, (byte) 18, var166, class671.field9454, 150 - class761.field10866[var160], arg4 + var161, arg2 + var162, var176);
                        var171 += 7;
                    }
                    if (class761.field10869[var160] == 4) {
                        int var177 = (150 - class761.field10866[var160]) * (class520.field7584.method1368(var166, -120) + 100) / 150;
                        class236.field3418.method230(arg4 + var161 - 50, arg2, arg4 + var161 + 50, arg2 + arg3);
                        class200.field2954.method1828(arg2 + var162, var166, true, -16777216, var161 + arg4 + 50 - var177, var176);
                        var170 += 50 - var177;
                        var168 += 50 - var177;
                        class236.field3418.method208(arg4, arg2, arg4 + arg6, arg2 + arg3);
                    }
                    if (class761.field10869[var160] == 5) {
                        int var178 = 150 - class761.field10866[var160];
                        int var179 = 0;
                        if (var178 < 25) {
                            var179 = var178 - 25;
                        } else if (var178 > 125) {
                            var179 = var178 - 125;
                        }
                        int var180 = class520.field7584.field2071 + class520.field7584.field2062;
                        class236.field3418.method230(arg4, arg2 + var162 - var180 - 1, arg4 + arg6, arg2 + var162 + 5);
                        var170 -= var167 >> 1;
                        var171 += var179;
                        var169 += var179;
                        var168 -= var167 >> 1;
                        class200.field2954.method1825(arg2 + var162 + var179, arg4 + var161, var176, -16777216, (byte) -81, var166);
                        class236.field3418.method208(arg4, arg2, arg4 + arg6, arg2 + arg3);
                    }
                } else {
                    var170 -= var167 >> 1;
                    class200.field2954.method1825(arg2 + var162, arg4 + var161, -256, -16777216, (byte) -94, var166);
                    var168 -= var167 >> 1;
                }
                class232.method1925(var169, var168, var171 + 1, var170 + 1, (byte) 118);
            }
        } catch (RuntimeException var182) {
            throw class665.method4799(var182, field2048[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lns;)V", line = 1258)
    public static final void method1345(class382 arg0) {
        if (class156.field1988 >= 65535) {
            return;
        }
        class330 var1 = arg0.field5573;
        class678.field9526[class156.field1988] = arg0;
        client.field9714[class156.field1988] = false;
        class156.field1988++;
        int var2 = arg0.field5559;
        if (arg0.field5565) {
            var2 = 0;
        }
        int var3 = arg0.field5559;
        if (arg0.field5574) {
            var3 = class293.field4121 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2592(true) + class157.field2000 - var1.method2594((byte) 21) >> class179.field2328;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2592(true) + var1.method2594((byte) 21) - class157.field2000 >> class179.field2328;
            if (var7 >= class700.field9795) {
                var7 = class700.field9795 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field5561[var5++];
                int var10 = (var1.method2595((byte) 98) + class157.field2000 - var1.method2594((byte) 21) >> class179.field2328) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class508.field7455) {
                    var11 = class508.field7455 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class502.field7334[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class502.field7334[var4][var12][var8] = var13 | (long) class156.field1988;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class502.field7334[var4][var12][var8] = var13 | (long) class156.field1988 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class502.field7334[var4][var12][var8] = var13 | (long) class156.field1988 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class502.field7334[var4][var12][var8] = var13 | (long) class156.field1988 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILwfa;)V", line = 1350)
    public final void method115(int arg0, class286 arg1) {
        try {
            if (arg0 != 95) {
                this.field2041 = null;
            }
            arg1.field4045 = this.field2041;
            field2044++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2048[5] + arg0 + ',' + (arg1 == null ? field2048[3] : field2048[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1346(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1347(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
