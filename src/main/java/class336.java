import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class336 extends class309 {

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
    public boolean field4947;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "B")
    public byte field4960;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "B")
    public byte field4956;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "S")
    public short field4950;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "S")
    public short field4961;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "S")
    public short field4957;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "S")
    public short field4959;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lbn;")
    public static class160 field4962 = new class160(55, 4);

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
    public static boolean field4964 = true;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Ljn;")
    public static class409 field4963 = new class409("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field4965 = 0;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lct;")
    public static class104 field4967;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lae;")
    public static class285 field4966;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    public static final void method2176(boolean arg0, int arg1) {
        class160.field2138.method2300(arg1, arg0);
        field4955++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method2177(String[] arg0, boolean arg1) {
        field4949++;
        String[] var2 = new String[5];
        if (!arg1) {
            field4967 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I")
    public abstract int method268(byte arg0);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[Lkg;III)V")
    public static final void method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class223[] arg6, int arg7, int arg8, int arg9) {
        class74.field942.method77(arg3, arg0, arg4, arg5);
        if (arg8 > -57) {
            field4967 = null;
        }
        field4953++;
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class223 var11 = arg6[var10];
            if (var11 != null && (var11.field3319 == arg7 || arg7 == -1412584499 && class157.field2113 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class267.field3958[class147.field1996].setBounds(var11.field3288 + arg2, var11.field3362 + arg1, var11.field3233, var11.field3352);
                    var12 = class147.field1996++;
                } else {
                    var12 = arg9;
                }
                var11.field3268 = class388.field5665;
                var11.field3365 = var12;
                if (!client.method1809(var11)) {
                    if (var11.field3357 != 0) {
                        class213.method1462(var11, 5);
                    }
                    int var13 = var11.field3288 + arg2;
                    int var14 = var11.field3362 + arg1;
                    int var15 = var11.field3225;
                    if (class159.field2133 && (client.method1811(var11).field4926 != 0 || var11.field3216 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class157.field2113 == var11) {
                        if (arg7 != -1412584499 && (class419.field6072 == var11.field3259 || class266.field3951 == var11.field3259)) {
                            class271.field4013 = arg1;
                            class69.field912 = arg2;
                            class359.field5214 = arg6;
                            continue;
                        }
                        if (class322.field4760 && class237.field3529) {
                            int var16 = class223.field3295.method411(0);
                            int var17 = class223.field3295.method415(-74);
                            int var18 = var16 - class133.field1834;
                            int var19 = var17 - class155.field2082;
                            if (class44.field589 > var18) {
                                var18 = class44.field589;
                            }
                            if (class30.field420 > var19) {
                                var19 = class30.field420;
                            }
                            if ((var18 + var11.field3233) > (class44.field589 + class42.field567.field3233)) {
                                var18 = class44.field589 + class42.field567.field3233 - var11.field3233;
                            }
                            if (class30.field420 + class42.field567.field3352 < var11.field3352 + var19) {
                                var19 = class30.field420 + class42.field567.field3352 - var11.field3352;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class266.field3951 == var11.field3259) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3216 == 2) {
                        var20 = arg5;
                        var21 = arg4;
                        var22 = arg0;
                        var23 = arg3;
                    } else {
                        int var24 = var11.field3233 + var13;
                        int var25 = var11.field3352 + var14;
                        var22 = var14 <= arg0 ? arg0 : var14;
                        if (var11.field3216 == 9) {
                            var24++;
                            var25++;
                        }
                        var23 = arg3 >= var13 ? arg3 : var13;
                        var21 = var24 < arg4 ? var24 : arg4;
                        var20 = var25 >= arg5 ? arg5 : var25;
                    }
                    if (var23 < var21 && var20 > var22) {
                        if (var11.field3357 != 0) {
                            if (class135.field1850 == var11.field3357 || class354.field5165 == var11.field3357) {
                                class142.method940(var11.field3352, var11.field3233, var14, var13, (byte) 43, class354.field5165 == var11.field3357);
                                class344.field5053[var12] = true;
                                class74.field942.method77(arg3, arg0, arg4, arg5);
                                continue;
                            }
                            if (class134.field1844 == var11.field3357) {
                                if (var11.method1534((byte) -111, class74.field942) != null) {
                                    class60.method457(14597);
                                    class67.method504(class74.field942, var14, var11, -2, var13);
                                    class67.field895[var12] = true;
                                    class74.field942.method77(arg3, arg0, arg4, arg5);
                                }
                                continue;
                            }
                            if (class146.field1976 == var11.field3357) {
                                if (var11.method1534((byte) -111, class74.field942) != null) {
                                    class86.method580(var14, var13, var11, 14504);
                                    class67.field895[var12] = true;
                                    class74.field942.method77(arg3, arg0, arg4, arg5);
                                }
                                continue;
                            }
                            if (class129.field1720 == var11.field3357) {
                                class84.method560(var11.field3233, var11.field3352, 15, class259.field3819, class74.field942, var14, var13);
                                class344.field5053[var12] = true;
                                class74.field942.method77(arg3, arg0, arg4, arg5);
                                continue;
                            }
                            if (class227.field3412 == var11.field3357) {
                                class316.method2089(var13, class74.field942, var11.field3352, var14, 16776960, var11.field3233);
                                class344.field5053[var12] = true;
                                class74.field942.method77(arg3, arg0, arg4, arg5);
                                continue;
                            }
                            if (class276.field4080 == var11.field3357) {
                                if (!class76.field961 && !class339.field5001) {
                                    continue;
                                }
                                int var26 = var11.field3233 + var13;
                                int var27 = var14 + 15;
                                if (class76.field961) {
                                    class13.field215.method566(var27, 0, var26, -256, -1, "Fps:" + class392.field5704);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class13.field215.method566(var27, 0, var26, var30, -1, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    int var31 = class74.field942.method153() / 1024;
                                    class13.field215.method566(var27, 0, var26, var31 <= 65536 ? -256 : -65536, -1, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class298.field4344[var35].method1998((byte) -125);
                                        var33 += class298.field4344[var35].method2004(-71);
                                        var34 += class298.field4344[var35].method2001((byte) 48);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class380.method2405(true, 2, 0, 0, (long) var37) + "% (" + var36 + "%)";
                                    class55.field675.method566(var27, 0, var26, -256, -1, var38);
                                    var27 += 12;
                                }
                                if (class115.field1567 > 0) {
                                    class55.field675.method566(var27, 0, var26, -256, -1, "Particles: " + class177.field2453 + " / " + class115.field1567);
                                }
                                var27 += 12;
                                if (class339.field5001) {
                                    class55.field675.method566(var27, 0, var26, -256, -1, "Polys: " + class74.field942.method91() + " Models: " + class74.field942.method112());
                                    var27 += 12;
                                    class55.field675.method566(var27, 0, var26, -256, -1, "Ls: " + class131.field1785 + " La: " + class294.field4274 + " NPC: " + class264.field3912 + " Pl: " + class167.field2197);
                                    class440.method2701(0);
                                    var27 += 12;
                                }
                                class344.field5053[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3216 == 0) {
                            if (class42.field568 == var11.field3357 && class74.field942.method168()) {
                                class74.field942.method152(var13, var14, var11.field3233, var11.field3352);
                            }
                            method2178(var22, var14 - var11.field3307, var13 - var11.field3214, var23, var21, var20, arg6, var11.field3223, -74, var12);
                            if (var11.field3340 != null) {
                                method2178(var22, var14 - var11.field3307, -var11.field3214 + var13, var23, var21, var20, var11.field3340, var11.field3223, -115, var12);
                            }
                            class182 var39 = (class182) class252.field3703.method609((long) var11.field3223, 88);
                            if (var39 != null) {
                                class403.method2518(var39.field2564, var22, var23, var14, var13, var21, var20, (byte) 40, var12);
                            }
                            if (class42.field568 == var11.field3357 && class74.field942.method168()) {
                                class74.field942.method125();
                                class72.field941 = true;
                            }
                            class74.field942.method77(arg3, arg0, arg4, arg5);
                        }
                        if (class115.field1569[var12] || class170.field2217 > 1) {
                            if (var11.field3216 == 3) {
                                if (var15 == 0) {
                                    if (var11.field3327) {
                                        class74.field942.method164(var13, var14, var11.field3233, var11.field3352, var11.field3300, 0);
                                    } else {
                                        class74.field942.method156(var13, var14, var11.field3233, var11.field3352, var11.field3300, 0);
                                    }
                                } else if (var11.field3327) {
                                    class74.field942.method164(var13, var14, var11.field3233, var11.field3352, var11.field3300 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class74.field942.method156(var13, var14, var11.field3233, var11.field3352, var11.field3300 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field3216 == 4) {
                                class85 var40 = var11.method1530(-1, class74.field942);
                                if (var40 != null) {
                                    int var41 = var11.field3300;
                                    String var42 = var11.field3354;
                                    if (var11.field3363 != -1) {
                                        class427 var43 = class157.field2119.method176((byte) -71, var11.field3363);
                                        var42 = var43.field6145;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field6165 == 1 || var11.field3328 != 1) && var11.field3328 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class184.method1267(-120, var11.field3328);
                                        }
                                    }
                                    if (class378.field5539 == var11) {
                                        var42 = class132.field1805.method2543(false, class153.field2073);
                                        var41 = var11.field3300;
                                    }
                                    if (class245.field3627) {
                                        class74.field942.method170(var13, var14, var11.field3233 + var13, var11.field3352 + var14);
                                    }
                                    var40.method567(var11.field3322 ? 255 - (var15 & 0xFF) << 24 : -1, var14, 0, var11.field3314, var11.field3324, (int[]) null, true, var41 | 255 - (var15 & 0xFF) << 24, 0, class115.field1559, var13, var11.field3233, (class195) null, var11.field3352, var42, var11.field3241);
                                    if (class245.field3627) {
                                        class74.field942.method77(arg3, arg0, arg4, arg5);
                                    }
                                } else if (class60.field806) {
                                    class15.method216((byte) 125, var11);
                                }
                            } else if (var11.field3216 == 5) {
                                if (var11.field3224 < 0) {
                                    class285 var45;
                                    if (var11.field3363 == -1) {
                                        var45 = var11.method1526(false, class74.field942);
                                    } else {
                                        class259 var44 = var11.field3360 ? class187.field2619.field5556 : null;
                                        var45 = class157.field2119.method182(-127, var11.field3328, class74.field942, var11.field3345, var44, var11.field3363, var11.field3250, var11.field3228 | 0xFF000000);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method1861();
                                        int var47 = var45.method1860();
                                        if (var11.field3245) {
                                            class74.field942.method170(var13, var14, var11.field3233 + var13, var11.field3352 + var14);
                                            if (var11.field3282 != 0) {
                                                int var49 = (var11.field3233 + var46 - 1) / var46;
                                                int var50 = (var47 + var11.field3352 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        var45.method1921((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field3282);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var45.method1866(var13, var14, var11.field3233, var11.field3352, 0, 0, 1);
                                            } else {
                                                var45.method1866(var13, var14, var11.field3233, var11.field3352, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class74.field942.method77(arg3, arg0, arg4, arg5);
                                        } else if (var15 != 0) {
                                            int var48 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field3282 != 0) {
                                                var45.method1917((float) var11.field3233 / 2.0F + (float) var13, (float) var11.field3352 / 2.0F + (float) var14, var11.field3233 * 4096 / var46, var11.field3282, 1, var48, 1);
                                            } else if (var11.field3233 == var46 && var11.field3352 == var47) {
                                                var45.method927(var13, var14, 1, var48, 1);
                                            } else {
                                                var45.method929(var13, var14, var11.field3233, var11.field3352, 1, var48, 1);
                                            }
                                        } else if (var11.field3282 != 0) {
                                            var45.method1921((float) var11.field3233 / 2.0F + (float) var13, (float) var11.field3352 / 2.0F + (float) var14, var11.field3233 * 4096 / var46, var11.field3282);
                                        } else if (var11.field3233 == var46 && var11.field3352 == var47) {
                                            var45.method1915(var13, var14);
                                        } else {
                                            var45.method1919(var13, var14, var11.field3233, var11.field3352);
                                        }
                                    } else if (class60.field806) {
                                        class15.method216((byte) 123, var11);
                                    }
                                } else {
                                    var11.method1527(true).method2186(var11.field3233, var11.field3352, 0, var11.field3286 << 3, 0, true, var11.field3334 << 3, var14, var13, class74.field942);
                                }
                            } else if (var11.field3216 == 6) {
                                class88.method590(11805);
                                class143 var53 = null;
                                int var54 = 0;
                                if (var11.field3363 != -1) {
                                    class427 var55 = class157.field2119.method176((byte) -91, var11.field3363);
                                    if (var55 != null) {
                                        class427 var56 = var55.method2626(-4038, var11.field3328);
                                        class196 var57 = var11.field3242 == -1 ? null : class83.method556(var11.field3242, 100);
                                        class259 var58 = var11.field3360 ? class187.field2619.field5556 : null;
                                        var53 = var56.method2631(var11.field3344, var58, class74.field942, 1, -129, var11.field3287, var11.field3289, var57, 1024);
                                        if (var53 == null) {
                                            class15.method216((byte) 127, var11);
                                        } else {
                                            var54 = -var53.method950() / 2;
                                        }
                                    }
                                } else if (var11.field3337 == 5) {
                                    int var63 = var11.field3343;
                                    if (var63 >= 0 && var63 < 2048) {
                                        class380 var64 = class455.field6731[var63];
                                        class196 var65 = var11.field3242 == -1 ? null : class83.method556(var11.field3242, 70);
                                        if (var64 != null && (class420.field6085 == var63 || class92.method628(0, var64.field5587) == var11.field3239)) {
                                            var53 = var64.field5556.method1775(true, (class196) null, var65, var11.field3344, var11.field3287, class74.field942, -1, var11.field3289, (class69[]) null, 0, class157.field2119, -577888989, 1024, 0);
                                        }
                                    }
                                } else if (var11.field3337 == 8 || var11.field3337 == 9) {
                                    class243 var60 = class46.method378(var11.field3343, false, false);
                                    class196 var61 = var11.field3242 == -1 ? null : class83.method556(var11.field3242, 127);
                                    if (var60 != null) {
                                        class259 var62 = var11.field3360 ? class187.field2619.field5556 : null;
                                        var53 = var60.method1628(var11.field3239, var11.field3337 == 9, -128, 1024, var62, var61, var11.field3287, var11.field3344, var11.field3289, class74.field942);
                                    }
                                } else if (var11.field3242 == -1) {
                                    var53 = var11.method1532(1024, 0, (class196) null, class74.field942, false, -1, -1, class187.field2619.field5556, class157.field2119);
                                    if (var53 == null && class60.field806) {
                                        class15.method216((byte) 124, var11);
                                    }
                                } else {
                                    class196 var59 = class83.method556(var11.field3242, 67);
                                    var53 = var11.method1532(1024, var11.field3287, var59, class74.field942, false, var11.field3344, var11.field3289, class187.field2619.field5556, class157.field2119);
                                    if (var53 == null && class60.field806) {
                                        class15.method216((byte) 125, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field3326 > 0) {
                                        var66 = (var11.field3233 << 9) / var11.field3326;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field3291 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field3352 << 9) / var11.field3291;
                                    }
                                    int var68 = (var11.field3273 * var66 >> 9) + var11.field3233 / 2 + var13;
                                    int var69 = (var11.field3253 * var67 >> 9) + (var14 + (var11.field3352 / 2));
                                    class444.field6476.method827();
                                    class74.field942.method107(class444.field6476);
                                    int var70 = class327.field4863[var11.field3204 << 3] * var11.field3353 >> 15;
                                    int var71 = class327.field4862[var11.field3204 << 3] * var11.field3353 >> 15;
                                    class74.field942.method101(var68, var69, var66, var67);
                                    class74.field942.method81((float) var11.field3349, var11.field3321 ? (float) var11.field3208 : (float) var11.field3208 * 1.5F);
                                    if (arg7 == -1412584499 || class72.field941) {
                                        class74.field942.method162();
                                        class74.field942.method131();
                                        class74.field942.method77(arg3, arg0, arg4, arg5);
                                        class72.field941 = false;
                                    }
                                    if (var11.field3339) {
                                        class74.field942.method146(false);
                                    }
                                    class282.field4146.method833(-var11.field3317 << 3);
                                    class282.field4146.method821(var11.field3213 << 3);
                                    class282.field4146.method823(var11.field3316, var54 + var11.field3252 + var70, var11.field3252 + var71);
                                    class282.field4146.method830(var11.field3204 << 3);
                                    if (class245.field3627) {
                                        class74.field942.method170(var13, var14, var11.field3233 + var13, var11.field3352 + var14);
                                    }
                                    if (var11.field3321) {
                                        var53.method949(class282.field4146, (class396) null, var11.field3353, 1);
                                    } else {
                                        var53.method947(class282.field4146, (class396) null, 1);
                                    }
                                    if (class245.field3627) {
                                        class74.field942.method77(arg3, arg0, arg4, arg5);
                                    }
                                    if (var11.field3339) {
                                        class74.field942.method146(true);
                                    }
                                }
                            } else if (var11.field3216 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field3338) {
                                    var75 = var14 + var11.field3352;
                                    var72 = var13;
                                    var74 = var11.field3233 + var13;
                                    var73 = var14;
                                } else {
                                    var72 = var13;
                                    var73 = var11.field3352 + var14;
                                    var74 = var13 + var11.field3233;
                                    var75 = var14;
                                }
                                if (var11.field3271 == 1) {
                                    class74.field942.method137(var72, var75, var74, var73, var11.field3300, 0);
                                } else {
                                    class74.field942.method134(var72, var75, var74, var73, var11.field3300, var11.field3271, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)V")
    public void method449(byte arg0) {
        if (arg0 != -28) {
            this.field4950 = -75;
        }
        field4948++;
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(B)V")
    public static void method2179(byte arg0) {
        field4967 = null;
        field4962 = null;
        if (arg0 <= 40) {
            field4962 = null;
        }
        field4963 = null;
        field4966 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4954 = (short) arg1;
        this.field4947 = arg8;
        this.field4960 = (byte) arg0;
        this.field4956 = arg9;
        this.field4950 = (short) arg7;
        this.field4961 = (short) arg4;
        this.field4951 = (short) arg3;
        this.field4957 = (short) arg5;
        this.field4959 = (short) arg6;
        this.field4952 = (short) arg2;
    }
}
