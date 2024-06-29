import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class221 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field3505 = 2048;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field3504 = 2048;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field3511 = 0;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field3514 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Leg;")
    public static class188 field3513 = new class188(64);

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field3521 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[Lng;")
    public static class245[] field3509;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILgn;B)V", line = 8)
    public final void method1470(int arg0, class303 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method2043((byte) -116);
            if (var4 == 0) {
                field3520++;
                int var5 = 101 % ((arg2 + 38) / 36);
                return;
            }
            this.method1474(var4, true, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lrm;Lwf;ILwf;)V", line = 24)
    public static final void method1471(class5 arg0, class306 arg1, int arg2, class306 arg3) {
        class196.field2941 = arg0;
        field3518++;
        class58.field823 = arg3;
        if (arg2 != 1274) {
            return;
        }
        class45.field641 = arg1;
        if (class58.field823 != null) {
            class227.field3628 = class58.field823.method2086(0, 1);
        }
        if (class45.field641 != null) {
            class59.field841 = class45.field641.method2086(arg2 - 1274, 1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 44)
    public static void method1472(int arg0) {
        field3513 = null;
        field3509 = null;
        if (arg0 != -32303) {
            method1478((byte) -115, 93, 34, -68, 83, -5, 104);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLwd;ILwf;Lwf;)V", line = 55)
    public static final void method1473(boolean arg0, class232 arg1, int arg2, class306 arg3, class306 arg4) {
        class80.field1193 = arg4;
        class68.field1020 = arg3;
        field3519++;
        class213.field3378 = arg0;
        int var5 = class80.field1193.method2092(-1) - 1;
        class298.field4563 = class80.field1193.method2086(arg2 + 6093, var5) + var5 * 256;
        class80.field1186 = arg1;
        if (arg2 == -6093) {
            class126.field1974 = new String[] { null, null, null, null, class177.field2712 };
            class63.field883 = new String[] { null, null, class125.field1951, null, null };
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLgn;I)V", line = 77)
    private final void method1474(int arg0, boolean arg1, class303 arg2, int arg3) {
        if (!arg1) {
            method1473(false, (class232) null, -25, (class306) null, (class306) null);
        }
        field3503++;
        if (arg0 == 1) {
            this.field3511 = arg2.method2043((byte) -124);
        } else if (arg0 == 2) {
            this.field3504 = arg2.method1994(false);
        } else if (arg0 == 3) {
            this.field3505 = arg2.method1994(false);
        } else if (arg0 == 4) {
            this.field3514 = arg2.method2042(7);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIB[Ljh;IIII)V", line = 110)
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, byte arg4, class207[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class333.field5166) {
            class238.method1633(arg2, arg9, arg6, arg0);
        } else {
            class57.method395(arg2, arg9, arg6, arg0);
            class12.method95();
        }
        field3510++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class207 var11 = arg5[var10];
            if (var11 != null && (var11.field3232 == arg3 || arg3 == -1412584499 && class50.field706 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class15.field159[class64.field963] = var11.field3177 + arg7;
                    class194.field2932[class64.field963] = var11.field3212 + arg1;
                    class167.field2563[class64.field963] = var11.field3169;
                    class233.field3750[class64.field963] = var11.field3239;
                    var12 = class64.field963++;
                } else {
                    var12 = arg8;
                }
                var11.field3284 = var12;
                var11.field3159 = class343.field5341;
                if (!var11.field3267 || !client.method889(var11)) {
                    if (var11.field3149 > 0) {
                        class24.method179(-1, var11);
                    }
                    int var13 = var11.field3212 + arg1;
                    int var14 = var11.field3177 + arg7;
                    int var15 = var11.field3269;
                    if (class269.field4149 && (client.method888(var11).field1664 != 0 || var11.field3273 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class50.field706 == var11) {
                        if (arg3 != -1412584499 && !var11.field3175) {
                            class265.field4092 = arg1;
                            class17.field206 = arg7;
                            class76.field1128 = arg5;
                            continue;
                        }
                        if (!var11.field3175) {
                            var15 = 128;
                        }
                        if (class257.field4000 && class259.field4032) {
                            int var16 = class199.field2985;
                            int var17 = var16 - class106.field1624;
                            int var18 = class107.field1636;
                            int var19 = var18 - class282.field4332;
                            if (var17 < class181.field2773) {
                                var17 = class181.field2773;
                            }
                            if (var19 < class116.field1802) {
                                var19 = class116.field1802;
                            }
                            if (var19 + var11.field3239 > class116.field1802 + class117.field1809.field3239) {
                                var19 = class116.field1802 + class117.field1809.field3239 - var11.field3239;
                            }
                            if (var17 + var11.field3169 > class181.field2773 + class117.field1809.field3169) {
                                var17 = class117.field1809.field3169 + class181.field2773 - var11.field3169;
                            }
                            var13 = var19;
                            var14 = var17;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field3273 == 2) {
                        var21 = arg9;
                        var24 = arg6;
                        var20 = arg2;
                        var25 = arg0;
                    } else {
                        var20 = arg2 >= var14 ? arg2 : var14;
                        var21 = var13 <= arg9 ? arg9 : var13;
                        int var22 = var11.field3169 + var14;
                        int var23 = var13 + var11.field3239;
                        if (var11.field3273 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = arg6 > var22 ? var22 : arg6;
                        var25 = arg0 > var23 ? var23 : arg0;
                    }
                    if (!var11.field3267 || var20 < var24 && var25 > var21) {
                        if (var11.field3149 != 0) {
                            if (var11.field3149 == 1337 || var11.field3149 == 1403) {
                                class303.field4726 = var13;
                                class80.field1190 = var14;
                                class162.field2509 = var11;
                                class339.method2345(var14, var11.field3169, var11.field3239, var13, var11.field3149 == 1403, true);
                                class2.field12[var12] = true;
                                if (class333.field5166) {
                                    class238.method1633(arg2, arg9, arg6, arg0);
                                } else {
                                    class57.method395(arg2, arg9, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field3149 == 1338) {
                                if (!var11.method1391(72)) {
                                    continue;
                                }
                                class206.method1379(var11, var13, var12, 32, var14);
                                if (class333.field5166) {
                                    class238.method1633(arg2, arg9, arg6, arg0);
                                } else {
                                    class57.method395(arg2, arg9, arg6, arg0);
                                }
                                if (class278.field4288 != 0 && class278.field4288 != 3 || class260.field4036 || var20 > class302.field4661 || var21 > class308.field4847 || class302.field4661 >= var24 || var25 <= class308.field4847) {
                                    continue;
                                }
                                int var41 = class302.field4661 - var14;
                                int var42 = class308.field4847 - var13;
                                int var43 = var11.field3160[var42];
                                if (var43 > var41 || var41 > (var43 + var11.field3281[var42])) {
                                    continue;
                                }
                                int var44 = var41 - var11.field3169 / 2;
                                int var45 = var42 - var11.field3239 / 2;
                                int var46 = (int) class123.field1922 + class138.field2133 & 0x7FF;
                                int var47 = class12.field121[var46];
                                int var48 = (class14.field148 + 256) * var47 >> 8;
                                int var49 = class12.field127[var46];
                                int var50 = (class14.field148 + 256) * var49 >> 8;
                                int var51 = var45 * var48 + (var44 * var50) >> 11;
                                int var52 = var45 * var50 - (var44 * var48) >> 11;
                                int var53 = class79.field1173.field537 + var51 - ((class79.field1173.method271((byte) 52) + -1) * 64) >> 7;
                                int var54 = (class79.field1173.field519 - (class79.field1173.method271((byte) 111) - 1) * 64) - var52 >> 7;
                                if (class120.field1841 && (class310.field4920 & 0x40) != 0) {
                                    class207 var55 = class276.method1812(true, class197.field2954, class253.field3934);
                                    if (var55 == null) {
                                        class175.method1189(-1);
                                    } else {
                                        class85.method584(1L, (short) 39, var54, (byte) -109, " ->", var53, class227.field3638, class139.field2150);
                                    }
                                    continue;
                                }
                                if (class2.field25 == 1) {
                                    class85.method584(1L, (short) 38, var54, (byte) -111, "", var53, class282.field4336, -1);
                                }
                                class85.method584(1L, (short) 37, var54, (byte) -119, "", var53, class23.field291, -1);
                                continue;
                            }
                            if (var11.field3149 == 1339) {
                                if (var11.method1391(arg4 ^ 0xFFFFFFA0)) {
                                    class184.method1269(2, var11, var12, var14, var13);
                                    if (class333.field5166) {
                                        class238.method1633(arg2, arg9, arg6, arg0);
                                    } else {
                                        class57.method395(arg2, arg9, arg6, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3149 == 1400) {
                                class335.method2333(var11.field3239, var14, var13, -28, var11.field3169);
                                class2.field12[var12] = true;
                                class19.field267[var12] = true;
                                if (class333.field5166) {
                                    class238.method1633(arg2, arg9, arg6, arg0);
                                } else {
                                    class57.method395(arg2, arg9, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field3149 == 1401) {
                                class104.method709(var14, -19025, var13, var11.field3169, var11.field3239);
                                class2.field12[var12] = true;
                                class19.field267[var12] = true;
                                if (class333.field5166) {
                                    class238.method1633(arg2, arg9, arg6, arg0);
                                } else {
                                    class57.method395(arg2, arg9, arg6, arg0);
                                }
                                continue;
                            }
                            if (var11.field3149 == 1402) {
                                if (!class333.field5166) {
                                    class289.method1885(var14, var13, (byte) 17);
                                    class2.field12[var12] = true;
                                    class19.field267[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field3149 == 1405) {
                                if (!class315.field4964) {
                                    continue;
                                }
                                int var26 = var11.field3169 + var14;
                                int var27 = var13 + 15;
                                class179.field2736.method1231("Fps:" + class240.field3813, var26, var27, 16776960, -1);
                                int var142 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class179.field2736.method1231("Mem:" + var29 + "k", var26, var142, var30, -1);
                                var27 = var142 + 15;
                                if (class333.field5166) {
                                    int var31 = 16776960;
                                    int var32 = (class301.field4648 + class301.field4647 + class301.field4650) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class179.field2736.method1231("Card:" + var32 + "k", var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 29; var37++) {
                                    var34 += class226.field3617[var37].method1705((byte) -97);
                                    var36 += class226.field3617[var37].method1708(false);
                                    var35 += class226.field3617[var37].method1710(122);
                                }
                                int var38 = var35 * 100 / var34;
                                int var39 = var36 * 10000 / var34;
                                String var40 = "Cache:" + class261.method1740(true, 2, (byte) 18, (long) var39, 0) + "% (" + var38 + "%)";
                                class342.field5329.method1231(var40, var26, var27, var33, -1);
                                var27 += 12;
                                class2.field12[var12] = true;
                                class19.field267[var12] = true;
                                continue;
                            }
                            if (var11.field3149 == 1406) {
                                class222.field3537 = var11;
                                class75.field1123 = var14;
                                class40.field575 = var13;
                                continue;
                            }
                        }
                        if (!class260.field4036) {
                            if (var11.field3273 == 0 && var11.field3295 && var20 <= class302.field4661 && var21 <= class308.field4847 && var24 > class302.field4661 && class308.field4847 < var25 && !class269.field4149) {
                                class242.field3830[0] = class79.field1176;
                                class194.field2925[0] = 1007;
                                class76.field1144[0] = "";
                                class89.field1355[0] = class161.field2499;
                                class168.field2565 = 1;
                            }
                            if (class302.field4661 >= var20 && class308.field4847 >= var21 && class302.field4661 < var24 && var25 > class308.field4847) {
                                class86.method587(var11, class308.field4847 - var13, -var14 + class302.field4661, (byte) -94);
                            }
                        }
                        if (var11.field3273 == 0) {
                            if (!var11.field3267 && client.method889(var11) && class168.field2575 != var11) {
                                continue;
                            }
                            if (!var11.field3267) {
                                if (var11.field3270 > var11.field3187 - var11.field3239) {
                                    var11.field3270 = var11.field3187 - var11.field3239;
                                }
                                if (var11.field3270 < 0) {
                                    var11.field3270 = 0;
                                }
                            }
                            if (class333.field5166 && var11.field3149 == 1407) {
                                class279.method1840(var14, var13, var11.field3169, var11.field3239);
                            }
                            method1475(var25, var13 - var11.field3270, var20, var11.field3250, (byte) -63, arg5, var24, var14 - var11.field3245, var12, var21);
                            if (var11.field3253 != null) {
                                method1475(var25, var13 - var11.field3270, var20, var11.field3250, (byte) -63, var11.field3253, var24, var14 - var11.field3245, var12, var21);
                            }
                            class45 var56 = (class45) class166.field2557.method1558((long) var11.field3250, false);
                            if (var56 != null) {
                                if (var56.field638 == 0 && !class260.field4036 && var20 <= class302.field4661 && class308.field4847 >= var21 && class302.field4661 < var24 && class308.field4847 < var25 && !class269.field4149) {
                                    class89.field1355[0] = class161.field2499;
                                    class168.field2565 = 1;
                                    class194.field2925[0] = 1007;
                                    class242.field3830[0] = class79.field1176;
                                    class76.field1144[0] = "";
                                }
                                class282.method1855(var24, arg4 + 318, var25, var12, var13, var14, var20, var21, var56.field640);
                            }
                            if (class333.field5166 && var11.field3149 == 1407) {
                                class279.method1842();
                            }
                            if (class333.field5166) {
                                class238.method1633(arg2, arg9, arg6, arg0);
                            } else {
                                class57.method395(arg2, arg9, arg6, arg0);
                                class12.method95();
                            }
                        }
                        if (class71.field1057[var12] || class288.field4416 > 1) {
                            if (var11.field3273 == 0 && !var11.field3267 && var11.field3187 > var11.field3239) {
                                class278.method1832(-15, var11.field3169 + var14, var11.field3270, var11.field3187, var11.field3239, var13);
                            }
                            if (var11.field3273 != 1) {
                                if (var11.field3273 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field3132; var58++) {
                                        for (int var59 = 0; var59 < var11.field3264; var59++) {
                                            int var60 = (var11.field3217 + 32) * var58 + var13;
                                            int var61 = (var11.field3134 + 32) * var59 + var14;
                                            if (var57 < 20) {
                                                var60 += var11.field3304[var57];
                                                var61 += var11.field3230[var57];
                                            }
                                            if (var11.field3301[var57] > 0) {
                                                boolean var63 = false;
                                                boolean var64 = false;
                                                int var65 = var11.field3301[var57] - 1;
                                                if (arg2 < (var61 + 32) && arg6 > var61 && arg9 < var60 + 32 && arg0 > var60 || class294.field4529 == var11 && class64.field974 == var57) {
                                                    class245 var66;
                                                    if (class81.field1199 == 1 && class203.field3061 == var57 && class83.field1259 == var11.field3250) {
                                                        var66 = class338.method2340(0, var11.field3162, var11.field3227[var57], (byte) 19, 2, (class172) null, var65);
                                                    } else {
                                                        var66 = class338.method2340(3153952, var11.field3162, var11.field3227[var57], (byte) 19, 1, (class172) null, var65);
                                                    }
                                                    if (class12.field122) {
                                                        class2.field12[var12] = true;
                                                    }
                                                    if (var66 == null) {
                                                        class277.method1822(arg4 ^ 0xFFFFEFC1, var11);
                                                    } else if (class294.field4529 == var11 && class64.field974 == var57) {
                                                        int var67 = class107.field1636 - class155.field2427;
                                                        int var68 = class199.field2985 - class272.field4180;
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (class52.field739 < 5) {
                                                            var68 = 0;
                                                            var67 = 0;
                                                        }
                                                        var66.method913(var61 + var68, var60 + var67, 128);
                                                        if (arg3 != -1) {
                                                            int var69;
                                                            int var70;
                                                            if (class333.field5166) {
                                                                var69 = class238.field3809;
                                                                var70 = class238.field3805;
                                                            } else {
                                                                var69 = class57.field799;
                                                                var70 = class57.field795;
                                                            }
                                                            class207 var71 = arg5[arg3 & 0xFFFF];
                                                            if (var60 + var67 < var70 && var71.field3270 > 0) {
                                                                int var72 = (var70 - var67 - var60) * class81.field1208 / 3;
                                                                if (var72 > class81.field1208 * 10) {
                                                                    var72 = class81.field1208 * 10;
                                                                }
                                                                if (var72 > var71.field3270) {
                                                                    var72 = var71.field3270;
                                                                }
                                                                var71.field3270 -= var72;
                                                                class155.field2427 += var72;
                                                                class277.method1822(arg4 ^ 0xFFFFEFC1, var71);
                                                            }
                                                            if (var69 < var60 + var67 + 32 && (var71.field3187 - var71.field3239) > var71.field3270) {
                                                                int var73 = (var60 + var67 + 32 - var69) * class81.field1208 / 3;
                                                                if (var73 > (class81.field1208 * 10)) {
                                                                    var73 = class81.field1208 * 10;
                                                                }
                                                                if (var73 > (var71.field3187 - var71.field3270 - var71.field3239)) {
                                                                    var73 = var71.field3187 - var71.field3239 - var71.field3270;
                                                                }
                                                                var71.field3270 += var73;
                                                                class155.field2427 -= var73;
                                                                class277.method1822(arg4 ^ 0xFFFFEFC1, var71);
                                                            }
                                                        }
                                                    } else if (class237.field3803 == var11 && class200.field3004 == var57) {
                                                        var66.method913(var61, var60, 128);
                                                    } else {
                                                        var66.method921(var61, var60);
                                                    }
                                                }
                                            } else if (var11.field3286 != null && var57 < 20) {
                                                class245 var62 = var11.method1397((byte) -47, var57);
                                                if (var62 != null) {
                                                    var62.method921(var61, var60);
                                                } else if (class312.field4939) {
                                                    class277.method1822(arg4 + 4159, var11);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field3273 == 3) {
                                    int var74;
                                    if (class248.method1686((byte) -18, var11)) {
                                        var74 = var11.field3300;
                                        if (class168.field2575 == var11 && var11.field3129 != 0) {
                                            var74 = var11.field3129;
                                        }
                                    } else {
                                        var74 = var11.field3139;
                                        if (class168.field2575 == var11 && var11.field3240 != 0) {
                                            var74 = var11.field3240;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3216) {
                                            if (class333.field5166) {
                                                class238.method1636(var14, var13, var11.field3169, var11.field3239, var74);
                                            } else {
                                                class57.method375(var14, var13, var11.field3169, var11.field3239, var74);
                                            }
                                        } else if (class333.field5166) {
                                            class238.method1621(var14, var13, var11.field3169, var11.field3239, var74);
                                        } else {
                                            class57.method388(var14, var13, var11.field3169, var11.field3239, var74);
                                        }
                                    } else if (var11.field3216) {
                                        if (class333.field5166) {
                                            class238.method1627(var14, var13, var11.field3169, var11.field3239, var74, 256 - (var15 & 0xFF));
                                        } else {
                                            class57.method382(var14, var13, var11.field3169, var11.field3239, var74, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class333.field5166) {
                                        class238.method1628(var14, var13, var11.field3169, var11.field3239, var74, 256 - (var15 & 0xFF));
                                    } else {
                                        class57.method376(var14, var13, var11.field3169, var11.field3239, var74, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3273 == 4) {
                                    class180 var75 = var11.method1393(class192.field2904, 1);
                                    if (var75 != null) {
                                        String var76 = var11.field3291;
                                        int var77;
                                        if (class248.method1686((byte) -18, var11)) {
                                            var77 = var11.field3300;
                                            if (class168.field2575 == var11 && var11.field3129 != 0) {
                                                var77 = var11.field3129;
                                            }
                                            if (var11.field3150.length() > 0) {
                                                var76 = var11.field3150;
                                            }
                                        } else {
                                            var77 = var11.field3139;
                                            if (class168.field2575 == var11 && var11.field3240 != 0) {
                                                var77 = var11.field3240;
                                            }
                                        }
                                        if (var11.field3267 && var11.field3142 != -1) {
                                            class291 var78 = class160.method1106(var11.field3142, arg4 + 187);
                                            var76 = var78.field4468;
                                            if (var76 == null) {
                                                var76 = "null";
                                            }
                                            if ((var78.field4440 == 1 || var11.field3231 != 1) && var11.field3231 != -1) {
                                                var76 = "<col=ff9040>" + var76 + "</col> x" + class320.method2172(67, var11.field3231);
                                            }
                                        }
                                        if (class108.field1674 == var11) {
                                            var76 = class164.field2530;
                                            var77 = var11.field3139;
                                        }
                                        if (!var11.field3267) {
                                            var76 = class148.method1044(var76, var11, -1);
                                        }
                                        var75.method1236(var76, var14, var13, var11.field3169, var11.field3239, var77, var11.field3189 ? 0 : -1, var11.field3192, var11.field3174, var11.field3154);
                                    } else if (class312.field4939) {
                                        class277.method1822(arg4 + 4159, var11);
                                    }
                                } else if (var11.field3273 == 5) {
                                    if (!var11.field3267) {
                                        class245 var141 = var11.method1396(93, class248.method1686((byte) -18, var11));
                                        if (var141 != null) {
                                            var141.method921(var14, var13);
                                        } else if (class312.field4939) {
                                            class277.method1822(4096, var11);
                                        }
                                    } else if (var11.field3195 >= 0) {
                                        class67 var125 = var11.method1394(arg4 + 62);
                                        if (class333.field5166) {
                                            var125.method484(0, var14, var13, var11.field3169, var11.field3239, var11.field3184, var11.field3165, 0);
                                        } else {
                                            var125.method483(0, var14, var13, var11.field3169, var11.field3239, var11.field3184, var11.field3165, 0);
                                        }
                                    } else {
                                        class245 var126;
                                        if (var11.field3142 == -1) {
                                            var126 = var11.method1396(34, false);
                                        } else if (var11.field3190 && class79.field1173.field1247 != null) {
                                            var126 = class338.method2340(var11.field3287, var11.field3162, var11.field3231, (byte) 19, var11.field3265, class79.field1173.field1247, var11.field3142);
                                        } else {
                                            var126 = class338.method2340(var11.field3287, var11.field3162, var11.field3231, (byte) 19, var11.field3265, (class172) null, var11.field3142);
                                        }
                                        if (var126 != null) {
                                            int var127 = var126.field3849;
                                            int var128 = var126.field3842;
                                            if (var11.field3199) {
                                                int var130 = (var11.field3169 + var127 - 1) / var127;
                                                int var131 = (var11.field3239 + var128 - 1) / var128;
                                                if (class333.field5166) {
                                                    class238.method1632(var14, var13, var11.field3169 + var14, var11.field3239 + var13);
                                                    boolean var132 = class122.method833(84, var126.field3847);
                                                    boolean var133 = class122.method833(-119, var126.field3844);
                                                    class186 var134 = (class186) var126;
                                                    if (var132 && var133) {
                                                        if (var15 == 0) {
                                                            var134.method1278(var14, var13, var130, var131);
                                                        } else {
                                                            var134.method1275(var14, var13, 256 - (var15 & 0xFF), var130, var131);
                                                        }
                                                    } else if (var132) {
                                                        for (int var135 = 0; var135 < var131; var135++) {
                                                            if (var15 == 0) {
                                                                var134.method1278(var14, var128 * var135 + var13, var130, 1);
                                                            } else {
                                                                var134.method1275(var14, var128 * var135 + var13, 256 - (var15 & 0xFF), var130, 1);
                                                            }
                                                        }
                                                    } else if (var133) {
                                                        for (int var138 = 0; var138 < var130; var138++) {
                                                            if (var15 == 0) {
                                                                var134.method1278(var127 * var138 + var14, var13, 1, var131);
                                                            } else {
                                                                var134.method1275(var127 * var138 + var14, var13, 256 - (var15 & 0xFF), 1, var131);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var136 = 0; var136 < var130; var136++) {
                                                            for (int var137 = 0; var137 < var131; var137++) {
                                                                if (var15 == 0) {
                                                                    var126.method921(var127 * var136 + var14, var128 * var137 + var13);
                                                                } else {
                                                                    var126.method913(var127 * var136 + var14, var13 - -(var128 * var137), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class238.method1633(arg2, arg9, arg6, arg0);
                                                } else {
                                                    class57.method383(var14, var13, var11.field3169 + var14, var13 - -var11.field3239);
                                                    for (int var139 = 0; var139 < var130; var139++) {
                                                        for (int var140 = 0; var140 < var131; var140++) {
                                                            if (var11.field3246 != 0) {
                                                                var126.method1660(var128 * var140 + (var13 + (var128 / 2)), var11.field3246, var127 / 2 + var14 + (var127 * var139), -9806, 4096);
                                                            } else if (var15 == 0) {
                                                                var126.method921(var127 * var139 + var14, var13 - -(var128 * var140));
                                                            } else {
                                                                var126.method913(var127 * var139 + var14, var128 * var140 + var13, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class57.method395(arg2, arg9, arg6, arg0);
                                                }
                                            } else {
                                                int var129 = var11.field3169 * 4096 / var127;
                                                if (var11.field3246 != 0) {
                                                    var126.method1660(var13 + (var11.field3239 / 2), var11.field3246, var14 + (var11.field3169 / 2), -9806, var129);
                                                } else if (var15 != 0) {
                                                    var126.method925(var14, var13, var11.field3169, var11.field3239, 256 - (var15 & 0xFF));
                                                } else if (var11.field3169 == var127 && var11.field3239 == var128) {
                                                    var126.method921(var14, var13);
                                                } else {
                                                    var126.method919(var14, var13, var11.field3169, var11.field3239);
                                                }
                                            }
                                        } else if (class312.field4939) {
                                            class277.method1822(4096, var11);
                                        }
                                    }
                                } else if (var11.field3273 == 6) {
                                    boolean var106 = class248.method1686((byte) -18, var11);
                                    class295 var107 = null;
                                    int var108;
                                    if (var106) {
                                        var108 = var11.field3226;
                                    } else {
                                        var108 = var11.field3243;
                                    }
                                    int var109 = 0;
                                    if (var11.field3142 != -1) {
                                        class291 var114 = class160.method1106(var11.field3142, -73);
                                        if (var114 != null) {
                                            class291 var115 = var114.method1897(var11.field3231, (byte) 62);
                                            class222 var116 = var108 == -1 ? null : class118.method809((byte) 102, var108);
                                            if (var11.field3190 && class79.field1173.field1247 != null) {
                                                var107 = var115.method1894(var116, var11.field3210, 1, (byte) -113, class79.field1173.field1247, var11.field3289, var11.field3275);
                                            } else {
                                                var107 = var115.method1894(var116, var11.field3210, 1, (byte) 28, (class172) null, var11.field3289, var11.field3275);
                                            }
                                            if (var107 == null) {
                                                class277.method1822(4096, var11);
                                            } else {
                                                var109 = -var107.method112() / 2;
                                            }
                                        }
                                    } else if (var11.field3204 == 5) {
                                        if (var11.field3207 == -1) {
                                            var107 = class44.field632.method1163(0, -1, 0, (byte) -124, (class222) null, (class222) null, -1, -1, (class262[]) null, -1, true);
                                        } else {
                                            int var110 = var11.field3207 & 0x7FF;
                                            if (class124.field1944 == var110) {
                                                var110 = 2047;
                                            }
                                            class82 var111 = class64.field966[var110];
                                            class222 var112 = var108 == -1 ? null : class118.method809((byte) 40, var108);
                                            if (var111 != null && (int) class108.method723(var111.field1218, arg4 ^ 0x7A) << 11 == (var11.field3207 & 0xFFFFF800)) {
                                                var107 = var111.field1247.method1163(0, var11.field3289, 0, (byte) -44, var112, (class222) null, -1, -1, (class262[]) null, 0, true);
                                            }
                                        }
                                    } else if (var108 == -1) {
                                        var107 = var11.method1385(class79.field1173.field1247, 0, -1, -1, 0, (class222) null, var106);
                                        if (var107 == null && class312.field4939) {
                                            class277.method1822(4096, var11);
                                        }
                                    } else {
                                        class222 var113 = class118.method809((byte) 110, var108);
                                        var107 = var11.method1385(class79.field1173.field1247, var11.field3275, var11.field3289, var11.field3210, 0, var113, var106);
                                        if (var107 == null && class312.field4939) {
                                            class277.method1822(4096, var11);
                                        }
                                    }
                                    if (var107 != null) {
                                        int var117;
                                        if (var11.field3213 > 0) {
                                            var117 = (var11.field3169 << 8) / var11.field3213;
                                        } else {
                                            var117 = 256;
                                        }
                                        int var118;
                                        if (var11.field3193 <= 0) {
                                            var118 = 256;
                                        } else {
                                            var118 = (var11.field3239 << 8) / var11.field3193;
                                        }
                                        int var119 = (var11.field3244 * var117 >> 8) + var11.field3169 / 2 + var14;
                                        int var120 = var11.field3239 / 2 + (var11.field3279 * var118 >> 8) + var13;
                                        if (class333.field5166) {
                                            if (var11.field3200) {
                                                class333.method2311(var119, var120, var11.field3183, var11.field3292, var117, var118);
                                            } else {
                                                class333.method2318(var119, var120, var117, var118);
                                                class333.method2321((float) var11.field3176, (float) var11.field3292 * 1.5F);
                                            }
                                            class333.method2309();
                                            class333.method2316(true);
                                            class333.method2312(false);
                                            class204.method1374(class88.field1322, 8212);
                                            if (class270.field4159) {
                                                class238.method1629();
                                                class333.method2291();
                                                class238.method1633(arg2, arg9, arg6, arg0);
                                                class270.field4159 = false;
                                            }
                                            if (var11.field3252) {
                                                class333.method2290();
                                            }
                                            int var123 = class12.field121[var11.field3247] * var11.field3183 >> 16;
                                            int var124 = class12.field127[var11.field3247] * var11.field3183 >> 16;
                                            if (var11.field3267) {
                                                var107.method965(0, var11.field3215, var11.field3249, var11.field3247, var11.field3296, var109 + var123 + var11.field3167, var11.field3167 + var124, -1L);
                                            } else {
                                                var107.method965(0, var11.field3215, 0, var11.field3247, 0, var123, var124, -1L);
                                            }
                                            if (var11.field3252) {
                                                class333.method2301();
                                            }
                                        } else {
                                            class12.method98(var119, var120);
                                            int var121 = class12.field127[var11.field3247] * var11.field3183 >> 16;
                                            int var122 = class12.field121[var11.field3247] * var11.field3183 >> 16;
                                            if (!var11.field3267) {
                                                var107.method965(0, var11.field3215, 0, var11.field3247, 0, var122, var121, -1L);
                                            } else if (var11.field3200) {
                                                ((class141) var107).method970(0, var11.field3215, var11.field3249, var11.field3247, var11.field3296, var122 + var109 + var11.field3167, var11.field3167 + var121, var11.field3183);
                                            } else {
                                                var107.method965(0, var11.field3215, var11.field3249, var11.field3247, var11.field3296, var109 + var11.field3167 + var122, var11.field3167 + var121, -1L);
                                            }
                                            class12.method102();
                                        }
                                    }
                                } else {
                                    if (var11.field3273 == 7) {
                                        class180 var79 = var11.method1393(class192.field2904, 1);
                                        if (var79 == null) {
                                            if (class312.field4939) {
                                                class277.method1822(4096, var11);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var11.field3132; var81++) {
                                            for (int var82 = 0; var82 < var11.field3264; var82++) {
                                                if (var11.field3301[var80] > 0) {
                                                    class291 var83 = class160.method1106(var11.field3301[var80] - 1, arg4 + 173);
                                                    String var84;
                                                    if (var83.field4440 != 1 && var11.field3227[var80] == 1) {
                                                        var84 = "<col=ff9040>" + var83.field4468 + "</col>";
                                                    } else {
                                                        var84 = "<col=ff9040>" + var83.field4468 + "</col> x" + class320.method2172(77, var11.field3227[var80]);
                                                    }
                                                    int var85 = (var11.field3134 + 115) * var82 + var14;
                                                    int var86 = (var11.field3217 + 12) * var81 + var13;
                                                    if (var11.field3192 == 0) {
                                                        var79.method1237(var84, var85, var86, var11.field3139, var11.field3189 ? 0 : -1);
                                                    } else if (var11.field3192 == 1) {
                                                        var79.method1245(var84, var85 + 57, var86, var11.field3139, var11.field3189 ? 0 : -1);
                                                    } else {
                                                        var79.method1231(var84, var85 + 114, var86, var11.field3139, var11.field3189 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var11.field3273 == 8 && class310.field4907 == var11 && class233.field3741 == class170.field2591) {
                                        int var87 = 0;
                                        int var88 = 0;
                                        class180 var89 = class179.field2736;
                                        String var90 = var11.field3291;
                                        String var91 = class148.method1044(var90, var11, -1);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf("<br>");
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            int var94 = var89.method1247(var93);
                                            if (var88 < var94) {
                                                var88 = var94;
                                            }
                                            var87 += var89.field2757 + 1;
                                        }
                                        var88 += 6;
                                        var87 += 7;
                                        int var95 = var14 + var11.field3169 - var88 - 5;
                                        int var96 = var13 + var11.field3239 + 5;
                                        if (arg0 < (var87 + var96)) {
                                            var96 = arg0 - var87;
                                        }
                                        if (var95 < var14 + 5) {
                                            var95 = var14 + 5;
                                        }
                                        if (arg6 < (var95 + var88)) {
                                            var95 = arg6 - var88;
                                        }
                                        if (class333.field5166) {
                                            class238.method1636(var95, var96, var88, var87, 16777120);
                                            class238.method1621(var95, var96, var88, var87, 0);
                                        } else {
                                            class57.method375(var95, var96, var88, var87, 16777120);
                                            class57.method388(var95, var96, var88, var87, 0);
                                        }
                                        int var97 = var96 + var89.field2757 + 2;
                                        String var98 = var11.field3291;
                                        String var99 = class148.method1044(var98, var11, -1);
                                        while (var99.length() > 0) {
                                            int var100 = var99.indexOf("<br>");
                                            String var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = "";
                                            } else {
                                                var101 = var99.substring(0, var100);
                                                var99 = var99.substring(var100 + 4);
                                            }
                                            var89.method1237(var101, var95 + 3, var97, 0, -1);
                                            var97 += var89.field2757 + 1;
                                        }
                                    }
                                    if (var11.field3273 == 9) {
                                        int var102;
                                        int var103;
                                        int var104;
                                        int var105;
                                        if (var11.field3221) {
                                            var103 = var11.field3239 + var13;
                                            var102 = var13;
                                            var104 = var11.field3169 + var14;
                                            var105 = var14;
                                        } else {
                                            var102 = var13 + var11.field3239;
                                            var103 = var13;
                                            var104 = var11.field3169 + var14;
                                            var105 = var14;
                                        }
                                        if (var11.field3171 == 1) {
                                            if (class333.field5166) {
                                                class238.method1635(var105, var103, var104, var102, var11.field3139);
                                            } else {
                                                class57.method372(var105, var103, var104, var102, var11.field3139);
                                            }
                                        } else if (class333.field5166) {
                                            class238.method1634(var105, var103, var104, var102, var11.field3139, var11.field3171);
                                        } else {
                                            class57.method387(var105, var103, var104, var102, var11.field3139, var11.field3171);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != -63) {
            field3521 = -81;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)I", line = 1409)
    public static final int method1476(int arg0, String arg1) {
        field3516++;
        if (arg0 != 593474565) {
            field3521 = 43;
        }
        int var2 = 0;
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = class110.method745(arg1.charAt(var4), (byte) 19) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z[[I)V", line = 1436)
    public static final void method1477(boolean arg0, int[][] arg1) {
        class175.field2675 = arg1;
        field3512++;
        if (!arg0) {
            field3509 = (class245[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIIIIII)V", line = 1466)
    public static final void method1478(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3507++;
        int var7 = class3.method20(class323.field5030, arg5, class88.field1324, -27521);
        int var8 = class3.method20(class323.field5030, arg4, class88.field1324, arg0 ^ 0xFFFF9479);
        int var9 = class3.method20(class256.field3995, arg6, class118.field1834, arg0 - 27527);
        if (arg0 != 6) {
            field3521 = -52;
        }
        int var10 = class3.method20(class256.field3995, arg2, class118.field1834, -27521);
        int var11 = class3.method20(class323.field5030, arg5 + arg1, class88.field1324, -27521);
        int var12 = class3.method20(class323.field5030, arg4 - arg1, class88.field1324, arg0 - 27527);
        for (int var13 = var7; var13 < var11; var13++) {
            class253.method1704(var9, var10, arg3, class175.field2675[var13], 7);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class253.method1704(var9, var10, arg3, class175.field2675[var14], 7);
        }
        int var15 = class3.method20(class256.field3995, arg6 + arg1, class118.field1834, -27521);
        int var16 = class3.method20(class256.field3995, arg2 - arg1, class118.field1834, -27521);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class175.field2675[var17];
            class253.method1704(var9, var15, arg3, var18, arg0 + 1);
            class253.method1704(var16, var10, arg3, var18, 7);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V", line = 1518)
    public static final void method1479(boolean arg0, int arg1) {
        if (arg1 != 12918) {
            field3506 = -103;
        }
        field3508++;
        class166.method1135(11487, class253.field3936, arg0, class334.field5203, class174.field2644);
    }
}
