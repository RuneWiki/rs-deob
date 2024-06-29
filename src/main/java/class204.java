import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class204 {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lia;")
    public static class257 field3506 = class28.method234(101, "mod_icons");

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
    public static boolean field3503 = true;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lia;")
    public static class257 field3504 = class28.method234(-59, ":");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1371(int arg0) {
        if (arg0 != 255) {
            field3506 = null;
        }
        field3506 = null;
        field3504 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method1372(boolean arg0) {
        field3501++;
        if (!class69.method524((byte) 119) && class54.field1158 != class189.field3261) {
            class25.method222(arg0, class237.field4059, false, class137.field2441.field4119[0], class258.field4481, class137.field2441.field4182[0], class189.field3261);
            return;
        }
        if (arg0) {
            method1371(22);
        }
        if (class189.field3261 != class102.field1880) {
            class102.field1880 = class189.field3261;
            class44.method337(8303, class189.field3261);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[Lq;)V")
    public static final void method1373(int arg0, boolean arg1, class238[] arg2) {
        field3507++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class233.field4007[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class233.field4007[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1563(var6, (byte) -64, var5);
                            }
                        }
                    }
                }
            }
            class233.field3953 += (int) (Math.random() * 5.0D) - 2;
            if (class233.field3953 < -16) {
                class233.field3953 = -16;
            }
            if (class233.field3953 > 16) {
                class233.field3953 = 16;
            }
            class46.field1052 += (int) (Math.random() * 5.0D) - 2;
            if (class46.field1052 < -8) {
                class46.field1052 = -8;
            }
            if (class46.field1052 > 8) {
                class46.field1052 = 8;
            }
        }
        int var8 = class233.field3953 >> 1;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class46.field1052 >> 2 << 10;
        if (arg0 >= -45) {
            return;
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var55 = class2.field64[var12];
            int var56 = (int) Math.sqrt(5100.0D);
            int var57 = var56 * 768 >> 8;
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var106 = 1; var106 < 103; var106++) {
                    byte var107 = 74;
                    int var108 = class243.field4208[var12][var106 + 1][var58] - class243.field4208[var12][var106 - 1][var58];
                    int var109 = class243.field4208[var12][var106][var58 + 1] - class243.field4208[var12][var106][var58 - 1];
                    int var110 = (int) Math.sqrt((double) (var109 * var109 + (var108 * var108 + 65536)));
                    int var111 = (var109 << 8) / var110;
                    int var112 = (var55[var106 - 1][var58] >> 2) + (var55[var106 + 1][var58] >> 3) + (var55[var106][var58 - -1] >> 3) + (var55[var106][var58] >> 1) + (var55[var106][var58 + -1] >> 2);
                    int var113 = -65536 / var110;
                    int var114 = (var108 << 8) / var110;
                    int var115 = (var111 * -50 + (var114 * -50 + (var113 * -10))) / var57 + var107;
                    var10[var106][var58] = var115 - var112;
                }
            }
            for (int var59 = 0; var59 < 104; var59++) {
                class58.field1236[var59] = 0;
                class162.field2837[var59] = 0;
                class33.field637[var59] = 0;
                class228.field3832[var59] = 0;
                class94.field1770[var59] = 0;
            }
            for (int var60 = -5; var60 < 104; var60++) {
                for (int var91 = 0; var91 < 104; var91++) {
                    int var100 = var60 + 5;
                    int var10002;
                    if (var100 < 104) {
                        int var101 = class102.field1898[var12][var100][var91] & 0xFF;
                        if (var101 > 0) {
                            class16 var102 = class132.method919(var101 - 1, 1);
                            class58.field1236[var91] += var102.field345;
                            class162.field2837[var91] += var102.field353;
                            class33.field637[var91] += var102.field359;
                            class228.field3832[var91] += var102.field355;
                            var10002 = class94.field1770[var91]++;
                        }
                    }
                    int var103 = var60 - 5;
                    if (var103 >= 0) {
                        int var104 = class102.field1898[var12][var103][var91] & 0xFF;
                        if (var104 > 0) {
                            class16 var105 = class132.method919(var104 - 1, 1);
                            class58.field1236[var91] -= var105.field345;
                            class162.field2837[var91] -= var105.field353;
                            class33.field637[var91] -= var105.field359;
                            class228.field3832[var91] -= var105.field355;
                            var10002 = class94.field1770[var91]--;
                        }
                    }
                }
                if (var60 >= 0) {
                    int var92 = 0;
                    int var93 = 0;
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    for (int var97 = -5; var97 < 104; var97++) {
                        int var98 = var97 + 5;
                        if (var98 < 104) {
                            var96 += class33.field637[var98];
                            var93 += class162.field2837[var98];
                            var92 += class58.field1236[var98];
                            var94 += class228.field3832[var98];
                            var95 += class94.field1770[var98];
                        }
                        int var99 = var97 - 5;
                        if (var99 >= 0) {
                            var93 -= class162.field2837[var99];
                            var96 -= class33.field637[var99];
                            var92 -= class58.field1236[var99];
                            var95 -= class94.field1770[var99];
                            var94 -= class228.field3832[var99];
                        }
                        if (var97 >= 0 && var95 > 0) {
                            var9[var60][var97] = class242.method1588(var93 / var95, -180, var92 * 256 / var94, var96 / var95);
                        }
                    }
                }
            }
            for (int var61 = 1; var61 < 103; var61++) {
                for (int var64 = 1; var64 < 103; var64++) {
                    if (arg1 || class69.method524((byte) -29) || (class233.field4007[0][var61][var64] & 0x2) != 0 || (class233.field4007[var12][var61][var64] & 0x10) == 0 && class182.method1248(var12, var64, var61, 107) == class54.field1158) {
                        if (class12.field235 > var12) {
                            class12.field235 = var12;
                        }
                        int var65 = class102.field1898[var12][var61][var64] & 0xFF;
                        int var66 = class131.field2346[var12][var61][var64] & 0xFF;
                        if (var65 > 0 || var66 > 0) {
                            int var67 = class243.field4208[var12][var61][var64];
                            int var68 = class243.field4208[var12][var61 + 1][var64];
                            int var69 = class243.field4208[var12][var61 + 1][var64 + 1];
                            int var70 = class243.field4208[var12][var61][var64 + 1];
                            if (var12 > 0) {
                                boolean var71 = true;
                                if (var65 == 0 && class21.field442[var12][var61][var64] != 0) {
                                    var71 = false;
                                }
                                if (var66 > 0 && !class91.method676(-6707, var66 - 1).field2401) {
                                    var71 = false;
                                }
                                if (var71 && var67 == var68 && var67 == var69 && var67 == var70) {
                                    class164.field2869[var12][var61][var64] = class198.method1332(class164.field2869[var12][var61][var64], 2340);
                                }
                            }
                            int var72;
                            int var75;
                            if (var65 > 0) {
                                var72 = var9[var61][var64];
                                int var73 = (var72 & 0x7F) + var8;
                                if (var73 < 0) {
                                    var73 = 0;
                                } else if (var73 > 127) {
                                    var73 = 127;
                                }
                                int var74 = (var72 + var11 & 0xFC00) + (var72 & 0x380) + var73;
                                var75 = class101.field1873[class116.method829((byte) -120, var74, 96)];
                            } else {
                                var75 = 0;
                                var72 = -1;
                            }
                            int var76 = var10[var61][var64];
                            int var77 = var10[var61 + 1][var64];
                            int var78 = var10[var61 + 1][var64 + 1];
                            int var79 = var10[var61][var64 + 1];
                            if (var66 == 0) {
                                class243.method1593(var12, var61, var64, 0, 0, -1, var67, var68, var69, var70, class116.method829((byte) -113, var72, var76), class116.method829((byte) -116, var72, var77), class116.method829((byte) -115, var72, var78), class116.method829((byte) -121, var72, var79), 0, 0, 0, 0, var75, 0);
                            } else {
                                int var80 = class21.field442[var12][var61][var64] + 1;
                                byte var81 = class185.field3216[var12][var61][var64];
                                class134 var82 = class91.method676(-6707, var66 - 1);
                                int var83 = var82.field2395;
                                if (var83 >= 0 && !class101.field1870.method94(2, var83)) {
                                    var83 = -1;
                                }
                                int var84;
                                int var85;
                                if (var83 >= 0) {
                                    var84 = class101.field1873[class20.method178(class101.field1870.method97(var83, 65535), 96, (byte) 97)];
                                    var85 = -1;
                                } else if (var82.field2398 == -1) {
                                    var84 = 0;
                                    var85 = -2;
                                } else {
                                    var85 = var82.field2398;
                                    int var86 = (var85 & 0x7F) + var8;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var85 + var11 & 0xFC00) + (var85 & 0x380) + var86;
                                    var84 = class101.field1873[class20.method178(var87, 96, (byte) 96)];
                                }
                                if (var82.field2392 >= 0) {
                                    int var88 = var82.field2392;
                                    int var89 = (var88 & 0x7F) + var8;
                                    if (var89 < 0) {
                                        var89 = 0;
                                    } else if (var89 > 127) {
                                        var89 = 127;
                                    }
                                    int var90 = (var11 + var88 & 0xFC00) + (var88 & 0x380) + var89;
                                    var84 = class101.field1873[class20.method178(var90, 96, (byte) 113)];
                                }
                                class243.method1593(var12, var61, var64, var80, var81, var83, var67, var68, var69, var70, class116.method829((byte) -124, var72, var76), class116.method829((byte) -120, var72, var77), class116.method829((byte) -106, var72, var78), class116.method829((byte) -116, var72, var79), class20.method178(var85, var76, (byte) 112), class20.method178(var85, var77, (byte) 116), class20.method178(var85, var78, (byte) 90), class20.method178(var85, var79, (byte) 120), var75, var84);
                            }
                        }
                    }
                }
            }
            if (!arg1) {
                for (int var62 = 1; var62 < 103; var62++) {
                    for (int var63 = 1; var63 < 103; var63++) {
                        if ((class233.field4007[0][var63][var62] & 0x2) == 0) {
                            class123.method857(var12, var63, var62, class182.method1248(var12, var62, var63, -110));
                        } else {
                            class123.method857(var12, var63, var62, 0);
                        }
                    }
                }
            }
            class102.field1898[var12] = null;
            class131.field2346[var12] = null;
            class21.field442[var12] = null;
            class185.field3216[var12] = null;
            class2.field64[var12] = null;
        }
        class87.method653(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var54 = 0; var54 < 104; var54++) {
                if ((class233.field4007[1][var13][var54] & 0x2) == 2) {
                    class32.method271(var13, var54);
                }
            }
        }
        int var14 = 2;
        int var15 = 4;
        int var16 = 1;
        for (int var17 = 0; var17 < 4; var17++) {
            if (var17 > 0) {
                var15 <<= 0x3;
                var16 <<= 0x3;
                var14 <<= 0x3;
            }
            for (int var18 = 0; var18 <= var17; var18++) {
                for (int var19 = 0; var19 <= 104; var19++) {
                    for (int var20 = 0; var20 <= 104; var20++) {
                        if ((class164.field2869[var18][var20][var19] & var16) != 0) {
                            int var21 = var19;
                            int var22 = var19;
                            while (var21 < 104 && (var16 & class164.field2869[var18][var20][var21 + 1]) != 0) {
                                var21++;
                            }
                            while (var22 > 0 && (var16 & class164.field2869[var18][var20][var22 - 1]) != 0) {
                                var22--;
                            }
                            int var23 = var18;
                            int var24 = var18;
                            label374: while (var23 > 0) {
                                for (int var25 = var22; var25 <= var21; var25++) {
                                    if ((class164.field2869[var23 - 1][var20][var25] & var16) == 0) {
                                        break label374;
                                    }
                                }
                                var23--;
                            }
                            label363: while (var17 > var24) {
                                for (int var26 = var22; var26 <= var21; var26++) {
                                    if ((class164.field2869[var24 + 1][var20][var26] & var16) == 0) {
                                        break label363;
                                    }
                                }
                                var24++;
                            }
                            int var27 = (var21 + 1 - var22) * (var24 + 1 - var23);
                            if (var27 >= 8) {
                                short var28 = 240;
                                int var29 = class243.field4208[var24][var20][var22] - var28;
                                int var30 = class243.field4208[var23][var20][var22];
                                class258.method1724(var17, 1, var20 * 128, var20 * 128, var22 * 128, var21 * 128 + 128, var29, var30);
                                for (int var31 = var23; var31 <= var24; var31++) {
                                    for (int var32 = var22; var32 <= var21; var32++) {
                                        class164.field2869[var31][var20][var32] = class30.method252(class164.field2869[var31][var20][var32], ~var16);
                                    }
                                }
                            }
                        }
                        if ((class164.field2869[var18][var20][var19] & var14) != 0) {
                            int var33;
                            for (var33 = var20; var33 < 104 && (class164.field2869[var18][var33 + 1][var19] & var14) != 0; var33++) {
                            }
                            int var34 = var18;
                            int var35;
                            for (var35 = var20; var35 > 0 && (var14 & class164.field2869[var18][var35 - 1][var19]) != 0; var35--) {
                            }
                            int var36 = var18;
                            label428: while (var34 > 0) {
                                for (int var37 = var35; var37 <= var33; var37++) {
                                    if ((var14 & class164.field2869[var34 - 1][var37][var19]) == 0) {
                                        break label428;
                                    }
                                }
                                var34--;
                            }
                            label417: while (var36 < var17) {
                                for (int var38 = var35; var38 <= var33; var38++) {
                                    if ((var14 & class164.field2869[var36 + 1][var38][var19]) == 0) {
                                        break label417;
                                    }
                                }
                                var36++;
                            }
                            int var39 = (var33 + 1 - var35) * (var36 + 1 - var34);
                            if (var39 >= 8) {
                                short var40 = 240;
                                int var41 = class243.field4208[var36][var35][var19] - var40;
                                int var42 = class243.field4208[var34][var35][var19];
                                class258.method1724(var17, 2, var35 * 128, var33 * 128 + 128, var19 * 128, var19 * 128, var41, var42);
                                for (int var43 = var34; var43 <= var36; var43++) {
                                    for (int var44 = var35; var44 <= var33; var44++) {
                                        class164.field2869[var43][var44][var19] = class30.method252(class164.field2869[var43][var44][var19], ~var14);
                                    }
                                }
                            }
                        }
                        if ((class164.field2869[var18][var20][var19] & var15) != 0) {
                            int var45 = var20;
                            int var46 = var20;
                            int var47 = var19;
                            int var48 = var19;
                            while (var47 > 0 && (var15 & class164.field2869[var18][var20][var47 - 1]) != 0) {
                                var47--;
                            }
                            while (var48 < 104 && (class164.field2869[var18][var20][var48 + 1] & var15) != 0) {
                                var48++;
                            }
                            label483: while (var46 > 0) {
                                for (int var49 = var47; var49 <= var48; var49++) {
                                    if ((var15 & class164.field2869[var18][var46 - 1][var49]) == 0) {
                                        break label483;
                                    }
                                }
                                var46--;
                            }
                            label472: while (var45 < 104) {
                                for (int var50 = var47; var50 <= var48; var50++) {
                                    if ((var15 & class164.field2869[var18][var45 + 1][var50]) == 0) {
                                        break label472;
                                    }
                                }
                                var45++;
                            }
                            if ((var45 + 1 - var46) * (var48 + 1 - var47) >= 4) {
                                int var51 = class243.field4208[var18][var46][var47];
                                class258.method1724(var17, 4, var46 * 128, var45 * 128 + 128, var47 * 128, var48 * 128 + 128, var51, var51);
                                for (int var52 = var46; var52 <= var45; var52++) {
                                    for (int var53 = var47; var53 <= var48; var53++) {
                                        class164.field2869[var18][var52][var53] = class30.method252(class164.field2869[var18][var52][var53], ~var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method1374(byte[] arg0, boolean arg1, int arg2) {
        field3502++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 > ~arg0.length && !class83.field1620) {
            try {
                class250 var3 = (class250) Class.forName("td").getDeclaredConstructor().newInstance();
                var3.method1299(arg2 ^ 0xFFFFFF76, arg0);
                return var3;
            } catch (Throwable var4) {
                class83.field1620 = true;
            }
        }
        return arg1 ? class193.method1301(0, arg0) : arg0;
    }
}
