import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class43 {

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lgg;")
    private static class63 field1035 = class116.method911(43, "Close");

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lgg;")
    public static class63 field1036 = class116.method911(43, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lgg;")
    public static class63 field1039 = field1035;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lgg;")
    public static class63 field1040 = class116.method911(43, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lgg;")
    public static class63 field1045 = class116.method911(43, "::qa_op_test");

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1044 = -1;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
    public static int[] field1043 = new int[50];

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lgg;")
    public static class63 field1046 = class116.method911(43, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lgg;")
    public static class63 field1038 = class116.method911(43, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljc;IIZ)[Lrc;")
    public static final class156[] method409(class85 arg0, int arg1, int arg2, boolean arg3) {
        field1042++;
        if (class117.method917(arg0, arg2, arg1, -20878)) {
            return arg3 ? null : class157.method1086((byte) 127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method410(byte arg0) {
        field1035 = null;
        if (arg0 < 104) {
            return;
        }
        field1038 = null;
        field1043 = null;
        field1045 = null;
        field1039 = null;
        field1036 = null;
        field1046 = null;
        field1040 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkf;Z)V")
    public static final void method411(class96 arg0, boolean arg1) {
        class118.field2630.method1034(0, arg0);
        while (true) {
            class96 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class96[][] var7;
            class96 var65;
            do {
                class96 var64;
                do {
                    class96 var63;
                    do {
                        class96 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class96) class118.field2630.method1036(-31644);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2291);
                                            var3 = var2.field2275;
                                            var4 = var2.field2278;
                                            var5 = var2.field2268;
                                            var6 = var2.field2282;
                                            var7 = class148.field3117[var5];
                                            if (!var2.field2281) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class96 var8 = class148.field3117[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2291) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= client.field704 && var3 > class129.field2820) {
                                                    class96 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2291 && (var9.field2281 || (var2.field2288 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= client.field704 && var3 < class166.field3396 - 1) {
                                                    class96 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2291 && (var10.field2281 || (var2.field2288 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class74.field1830 && var4 > class186.field3750) {
                                                    class96 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2291 && (var11.field2281 || (var2.field2288 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class74.field1830 && var4 < class142.field3039 - 1) {
                                                    class96 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2291 && (var12.field2281 || (var2.field2288 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2281 = false;
                                            if (var2.field2293 != null) {
                                                class96 var13 = var2.field2293;
                                                if (var13.field2283 == null) {
                                                    if (var13.field2289 != null && !class121.method932(0, var3, var4)) {
                                                        class12.method152(var13.field2289, class123.field2720, class195.field3915, class22.field511, class68.field1705, var3, var4);
                                                    }
                                                } else if (!class121.method932(0, var3, var4)) {
                                                    class127.method951(var13.field2283, 0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var3, var4);
                                                }
                                                class116 var14 = var13.field2277;
                                                if (var14 != null) {
                                                    var14.field2603.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var14.field2589 - class138.field2971, var14.field2596 - class103.field2373, var14.field2599 - class14.field344, var14.field2598);
                                                }
                                                for (int var15 = 0; var15 < var13.field2272; var15++) {
                                                    class98 var16 = var13.field2284[var15];
                                                    if (var16 != null) {
                                                        var16.field2316.method95(var16.field2326, class123.field2720, class195.field3915, class22.field511, class68.field1705, var16.field2318 - class138.field2971, var16.field2328 - class103.field2373, var16.field2331 - class14.field344, var16.field2319);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2283 == null) {
                                                if (var2.field2289 != null && !class121.method932(var6, var3, var4)) {
                                                    var17 = true;
                                                    class12.method152(var2.field2289, class123.field2720, class195.field3915, class22.field511, class68.field1705, var3, var4);
                                                }
                                            } else if (!class121.method932(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field2283.field3179 != 12345678 || class139.field2984 && var5 <= class143.field3076) {
                                                    class127.method951(var2.field2283, var6, class123.field2720, class195.field3915, class22.field511, class68.field1705, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class116 var20 = var2.field2277;
                                            class109 var21 = var2.field2271;
                                            if (var20 != null || var21 != null) {
                                                if (client.field704 == var3) {
                                                    var18++;
                                                } else if (client.field704 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class74.field1830 == var4) {
                                                    var18 += 3;
                                                } else if (class74.field1830 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class50.field1203[var18];
                                                var2.field2269 = class69.field1721[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field2600 & class77.field1880[var18]) == 0) {
                                                    var2.field2286 = 0;
                                                } else if (var20.field2600 == 16) {
                                                    var2.field2286 = 3;
                                                    var2.field2292 = class15.field373[var18];
                                                    var2.field2279 = 3 - var2.field2292;
                                                } else if (var20.field2600 == 32) {
                                                    var2.field2286 = 6;
                                                    var2.field2292 = class29.field689[var18];
                                                    var2.field2279 = 6 - var2.field2292;
                                                } else if (var20.field2600 == 64) {
                                                    var2.field2286 = 12;
                                                    var2.field2292 = class181.field3674[var18];
                                                    var2.field2279 = 12 - var2.field2292;
                                                } else {
                                                    var2.field2286 = 9;
                                                    var2.field2292 = class17.field411[var18];
                                                    var2.field2279 = 9 - var2.field2292;
                                                }
                                                if ((var20.field2600 & var19) != 0 && !class3.method27(var6, var3, var4, var20.field2600)) {
                                                    var20.field2603.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var20.field2589 - class138.field2971, var20.field2596 - class103.field2373, var20.field2599 - class14.field344, var20.field2598);
                                                }
                                                if ((var20.field2588 & var19) != 0 && !class3.method27(var6, var3, var4, var20.field2588)) {
                                                    var20.field2594.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var20.field2589 - class138.field2971, var20.field2596 - class103.field2373, var20.field2599 - class14.field344, var20.field2598);
                                                }
                                            }
                                            if (var21 != null && !class46.method458(var6, var3, var4, var21.field2467.field728)) {
                                                if ((var21.field2456 & var19) != 0) {
                                                    var21.field2467.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var21.field2455 + var21.field2458 - class138.field2971, var21.field2452 - class103.field2373, var21.field2460 + var21.field2462 - class14.field344, var21.field2449);
                                                } else if (var21.field2456 == 256) {
                                                    int var22 = var21.field2455 - class138.field2971;
                                                    int var23 = var21.field2452 - class103.field2373;
                                                    int var24 = var21.field2460 - class14.field344;
                                                    int var25 = var21.field2448;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2467.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var21.field2458 + var22, var23, var21.field2462 + var24, var21.field2449);
                                                    } else if (var21.field2463 != null) {
                                                        var21.field2463.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var22, var23, var24, var21.field2449);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class41 var28 = var2.field2294;
                                                if (var28 != null) {
                                                    var28.field953.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var28.field949 - class138.field2971, var28.field956 - class103.field2373, var28.field957 - class14.field344, var28.field961);
                                                }
                                                class147 var29 = var2.field2276;
                                                if (var29 != null && var29.field3106 == 0) {
                                                    if (var29.field3105 != null) {
                                                        var29.field3105.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var29.field3104 - class138.field2971, var29.field3099 - class103.field2373, var29.field3101 - class14.field344, var29.field3097);
                                                    }
                                                    if (var29.field3110 != null) {
                                                        var29.field3110.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var29.field3104 - class138.field2971, var29.field3099 - class103.field2373, var29.field3101 - class14.field344, var29.field3097);
                                                    }
                                                    if (var29.field3103 != null) {
                                                        var29.field3103.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var29.field3104 - class138.field2971, var29.field3099 - class103.field2373, var29.field3101 - class14.field344, var29.field3097);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field2288;
                                            if (var30 != 0) {
                                                if (var3 < client.field704 && (var30 & 0x4) != 0) {
                                                    class96 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field2291) {
                                                        class118.field2630.method1034(0, var31);
                                                    }
                                                }
                                                if (var4 < class74.field1830 && (var30 & 0x2) != 0) {
                                                    class96 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field2291) {
                                                        class118.field2630.method1034(0, var32);
                                                    }
                                                }
                                                if (var3 > client.field704 && (var30 & 0x1) != 0) {
                                                    class96 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field2291) {
                                                        class118.field2630.method1034(0, var33);
                                                    }
                                                }
                                                if (var4 > class74.field1830 && (var30 & 0x8) != 0) {
                                                    class96 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field2291) {
                                                        class118.field2630.method1034(0, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2286 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field2272; var36++) {
                                                if (class155.field3245 != var2.field2284[var36].field2323 && (var2.field2290[var36] & var2.field2286) == var2.field2292) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class116 var37 = var2.field2277;
                                                if (!class3.method27(var6, var3, var4, var37.field2600)) {
                                                    var37.field2603.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var37.field2589 - class138.field2971, var37.field2596 - class103.field2373, var37.field2599 - class14.field344, var37.field2598);
                                                }
                                                var2.field2286 = 0;
                                            }
                                        }
                                        if (!var2.field2285) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field2272;
                                            var2.field2285 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class98 var41 = var2.field2284[var40];
                                                if (class155.field3245 != var41.field2323) {
                                                    for (int var42 = var41.field2330; var42 <= var41.field2324; var42++) {
                                                        for (int var43 = var41.field2325; var43 <= var41.field2321; var43++) {
                                                            class96 var44 = var7[var42][var43];
                                                            if (var44.field2281) {
                                                                var2.field2285 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field2286 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field2330) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field2324) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field2325) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field2321) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field2286) == var2.field2279) {
                                                                    var2.field2285 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class176.field3618[var39++] = var41;
                                                    int var46 = client.field704 - var41.field2330;
                                                    int var47 = var41.field2324 - client.field704;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class74.field1830 - var41.field2325;
                                                    int var49 = var41.field2321 - class74.field1830;
                                                    if (var49 > var48) {
                                                        var41.field2320 = var46 + var49;
                                                    } else {
                                                        var41.field2320 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class98 var53 = class176.field3618[var52];
                                                    if (class155.field3245 != var53.field2323) {
                                                        if (var53.field2320 > var50) {
                                                            var50 = var53.field2320;
                                                            var51 = var52;
                                                        } else if (var53.field2320 == var50) {
                                                            int var54 = var53.field2318 - class138.field2971;
                                                            int var55 = var53.field2331 - class14.field344;
                                                            int var56 = class176.field3618[var51].field2318 - class138.field2971;
                                                            int var57 = class176.field3618[var51].field2331 - class14.field344;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class98 var58 = class176.field3618[var51];
                                                var58.field2323 = class155.field3245;
                                                if (!class72.method675(var6, var58.field2330, var58.field2324, var58.field2325, var58.field2321, var58.field2316.field728)) {
                                                    var58.field2316.method95(var58.field2326, class123.field2720, class195.field3915, class22.field511, class68.field1705, var58.field2318 - class138.field2971, var58.field2328 - class103.field2373, var58.field2331 - class14.field344, var58.field2319);
                                                }
                                                for (int var59 = var58.field2330; var59 <= var58.field2324; var59++) {
                                                    for (int var60 = var58.field2325; var60 <= var58.field2321; var60++) {
                                                        class96 var61 = var7[var59][var60];
                                                        if (var61.field2286 != 0) {
                                                            class118.field2630.method1034(0, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field2291) {
                                                            class118.field2630.method1034(0, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2285) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field2285 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2291);
                            } while (var2.field2286 != 0);
                            if (var3 > client.field704 || var3 <= class129.field2820) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field2291);
                        if (var3 < client.field704 || var3 >= class166.field3396 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field2291);
                    if (var4 > class74.field1830 || var4 <= class186.field3750) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field2291);
                if (var4 < class74.field1830 || var4 >= class142.field3039 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field2291);
            var2.field2291 = false;
            class176.field3624--;
            class147 var66 = var2.field2276;
            if (var66 != null && var66.field3106 != 0) {
                if (var66.field3105 != null) {
                    var66.field3105.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var66.field3104 - class138.field2971, var66.field3099 - class103.field2373 - var66.field3106, var66.field3101 - class14.field344, var66.field3097);
                }
                if (var66.field3110 != null) {
                    var66.field3110.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var66.field3104 - class138.field2971, var66.field3099 - class103.field2373 - var66.field3106, var66.field3101 - class14.field344, var66.field3097);
                }
                if (var66.field3103 != null) {
                    var66.field3103.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var66.field3104 - class138.field2971, var66.field3099 - class103.field2373 - var66.field3106, var66.field3101 - class14.field344, var66.field3097);
                }
            }
            if (var2.field2269 != 0) {
                class109 var67 = var2.field2271;
                if (var67 != null && !class46.method458(var6, var3, var4, var67.field2467.field728)) {
                    if ((var67.field2456 & var2.field2269) != 0) {
                        var67.field2467.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var67.field2455 + var67.field2458 - class138.field2971, var67.field2452 - class103.field2373, var67.field2460 + var67.field2462 - class14.field344, var67.field2449);
                    } else if (var67.field2456 == 256) {
                        int var68 = var67.field2455 - class138.field2971;
                        int var69 = var67.field2452 - class103.field2373;
                        int var70 = var67.field2460 - class14.field344;
                        int var71 = var67.field2448;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field2467.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var67.field2458 + var68, var69, var67.field2462 + var70, var67.field2449);
                        } else if (var67.field2463 != null) {
                            var67.field2463.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var68, var69, var70, var67.field2449);
                        }
                    }
                }
                class116 var74 = var2.field2277;
                if (var74 != null) {
                    if ((var74.field2588 & var2.field2269) != 0 && !class3.method27(var6, var3, var4, var74.field2588)) {
                        var74.field2594.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var74.field2589 - class138.field2971, var74.field2596 - class103.field2373, var74.field2599 - class14.field344, var74.field2598);
                    }
                    if ((var74.field2600 & var2.field2269) != 0 && !class3.method27(var6, var3, var4, var74.field2600)) {
                        var74.field2603.method95(0, class123.field2720, class195.field3915, class22.field511, class68.field1705, var74.field2589 - class138.field2971, var74.field2596 - class103.field2373, var74.field2599 - class14.field344, var74.field2598);
                    }
                }
            }
            if (var5 < class168.field3469 - 1) {
                class96 var75 = class148.field3117[var5 + 1][var3][var4];
                if (var75 != null && var75.field2291) {
                    class118.field2630.method1034(0, var75);
                }
            }
            if (var3 < client.field704) {
                class96 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field2291) {
                    class118.field2630.method1034(0, var76);
                }
            }
            if (var4 < class74.field1830) {
                class96 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field2291) {
                    class118.field2630.method1034(0, var77);
                }
            }
            if (var3 > client.field704) {
                class96 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field2291) {
                    class118.field2630.method1034(0, var78);
                }
            }
            if (var4 > class74.field1830) {
                class96 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field2291) {
                    class118.field2630.method1034(0, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class43() {
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Led;)V")
    public class43(class43 arg0) {
        this.field1047 = arg0.field1047;
        this.field1041 = arg0.field1041;
        this.field1048 = arg0.field1048;
        this.field1037 = arg0.field1037;
    }
}
