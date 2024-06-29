import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 extends class65 {

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field2341 = -1;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public int field2362 = 0;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Lrc;")
    private static class105 field2349 = class43.method374("Existing user", 0);

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lrc;")
    private static class105 field2363 = class43.method374("glow1:", 0);

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Lrc;")
    public static class105 field2360 = class43.method374("sch-Utteln:", 0);

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static volatile int field2343 = 0;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "[I")
    public static int[] field2358 = new int[5];

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field2354 = 0;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lrc;")
    public static class105 field2369 = field2349;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lrc;")
    private static class105 field2365 = class43.method374("go back to the main RuneScape webpage", 0);

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Lrc;")
    public static class105 field2366 = field2363;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lrc;")
    public static class105 field2367 = field2365;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lrc;")
    public static class105 field2350 = class43.method374("Wen m-Ochten Sie der Liste hinzuf-Ugen?", 0);

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "[I")
    public static int[] field2361;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
    public static int[] field2364;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[[I")
    public static int[][] field2345;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 22)
    public static void method821(int arg0) {
        field2367 = null;
        field2361 = null;
        if (arg0 != 49) {
            return;
        }
        field2360 = null;
        field2363 = null;
        field2358 = null;
        field2349 = null;
        field2345 = null;
        field2365 = null;
        field2364 = null;
        field2366 = null;
        field2369 = null;
        field2350 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[BIII[Lsb;III)V", line = 54)
    public static final void method822(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class110[] arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 37) {
            field2360 = null;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg3 + var15 > 0 && arg3 + var15 < 103) {
                    arg6[arg1].field2548[arg4 + var10][arg3 + var15] = class100.method807(arg6[arg1].field2548[arg4 + var10][arg3 + var15], -16777217);
                }
            }
        }
        class7 var11 = new class7(arg2);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg5 == var12 && var13 >= arg8 && arg8 + 8 > var13 && var14 >= arg9 && arg9 + 8 > var14) {
                        class129.method1039(var11, -28, 0, arg1, arg4 + class72.method612(arg7, var14 & 0x7, -127, var13 & 0x7), arg7, 0, arg3 + class36.method334(arg7, var14 & 0x7, var13 & 0x7, -28294));
                    } else {
                        class129.method1039(var11, arg0 + 62, 0, 0, -1, 0, 0, -1);
                    }
                }
            }
        }
        field2352++;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 143)
    private static final void method823(int arg0) {
        field2342++;
        if (class39.field893 == 0) {
            return;
        }
        class77 var1 = class6.field79;
        int var2 = 0;
        if (~class24.field580 != arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class37.field856[var3] != null) {
                int var4 = class120.field2896[var3];
                class105 var5 = class92.field2116[var3];
                byte var6 = 0;
                if (var5 != null && var5.method848(class80.field1796, 0)) {
                    var6 = 1;
                    var5 = var5.method862(5, (byte) 104);
                }
                if (var5 != null && var5.method848(class43.field998, 0)) {
                    var5 = var5.method862(5, (byte) -93);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class134.field3270 == 0 || class134.field3270 == 1 && class74.method627(var5, 13))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var1.method664(class10.field203, var7, var8, 0);
                    var2++;
                    var1.method664(class10.field203, var7, var8 - 1, 65535);
                    int var9 = var7 + var1.method662(class10.field203);
                    int var10 = var9 + var1.method654(32);
                    if (var6 == 1) {
                        class74.field1652[0].method134(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class74.field1652[1].method134(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method664(class108.method878(new class105[] { var5, class61.field1360, class37.field856[var3] }, arg0 + 2868), var10, var8, 0);
                    var1.method664(class108.method878(new class105[] { var5, class61.field1360, class37.field856[var3] }, arg0 ^ 0xFFFFF4CC), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class134.field3270 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method664(class37.field856[var3], 4, var11, 0);
                    var1.method664(class37.field856[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class134.field3270 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method664(class108.method878(new class105[] { class22.field545, class89.field2052, var5, class61.field1360, class37.field856[var3] }, 2867), 4, var12, 0);
                    var1.method664(class108.method878(new class105[] { class22.field545, class89.field2052, var5, class61.field1360, class37.field856[var3] }, 2867), 4, var12 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 273)
    public static final void method824(byte arg0) {
        field2346++;
        if (class57.field1199 == 0 && class122.field3003 == 0) {
            class105.method832(4, class35.field816, 0, (byte) 127, class43.field992, class90.field2068, class75.field1664);
            class109.field2495++;
        }
        int var1 = -1;
        if (arg0 != 32) {
            method821(72);
        }
        for (int var2 = 0; var2 < class56.field1162; var2++) {
            int var3 = class56.field1153[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 29 & 0x3;
            int var6 = var3 >> 14 & 0x7FFF;
            int var7 = var3 >> 7 & 0x7F;
            if (var1 != var3) {
                var1 = var3;
                if (var5 == 2 && class130.field3161.method494(class73.field1619, var4, var7, var3) >= 0) {
                    class121 var8 = class12.method149(var6, (byte) 62);
                    if (var8.field2909 != null) {
                        var8 = var8.method978((byte) -24);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class57.field1199 == 1) {
                        class105.method832(18, var7, var3, (byte) 124, class108.method878(new class105[] { class29.field661, class108.field2476, var8.field2928 }, arg0 ^ 0xB13), class43.field1007, var4);
                        class116.field2684++;
                    } else if (class122.field3003 != 1) {
                        class60.field1338++;
                        class105[] var9 = var8.field2946;
                        if (class128.field3114) {
                            var9 = class96.method799(113, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class117.field2726++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 7;
                                    }
                                    if (var10 == 1) {
                                        var11 = 19;
                                    }
                                    if (var10 == 2) {
                                        var11 = 49;
                                    }
                                    if (var10 == 3) {
                                        var11 = 52;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1004;
                                    }
                                    class105.method832(var11, var7, var3, (byte) 121, class108.method878(new class105[] { class75.field1678, var8.field2928 }, 2867), var9[var10], var4);
                                }
                            }
                        }
                        class105.method832(1002, var7, var8.field2965 << 14, (byte) 121, class108.method878(new class105[] { class75.field1678, var8.field2928 }, 2867), class51.field1082, var4);
                    } else if ((class84.field1886 & 0x4) == 4) {
                        class125.field3044++;
                        class105.method832(45, var7, var3, (byte) 121, class108.method878(new class105[] { class105.field2386, class108.field2476, var8.field2928 }, 2867), class84.field1884, var4);
                    }
                }
                if (var5 == 1) {
                    class115 var12 = class19.field466[var6];
                    if (var12.field2681.field461 == 1 && (var12.field1229 & 0x7F) == 64 && (var12.field1274 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class133.field3229; var13++) {
                            class115 var16 = class19.field466[class24.field578[var13]];
                            if (var16 != null && var12 != var16 && var16.field2681.field461 == 1 && var12.field1229 == var16.field1229 && var12.field1274 == var16.field1274) {
                                class100.method811(class24.field578[var13], var4, var16.field2681, var7, (byte) 42);
                            }
                        }
                        for (int var14 = 0; var14 < class97.field2250; var14++) {
                            class15 var15 = class58.field1303[class121.field2956[var14]];
                            if (var15 != null && var12.field1229 == var15.field1229 && var12.field1274 == var15.field1274) {
                                class115.method937(var7, var4, var15, class121.field2956[var14], 2000);
                            }
                        }
                    }
                    class100.method811(var6, var4, var12.field2681, var7, (byte) 42);
                }
                if (var5 == 0) {
                    class15 var17 = class58.field1303[var6];
                    if ((var17.field1229 & 0x7F) == 64 && (var17.field1274 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class133.field3229; var18++) {
                            class115 var21 = class19.field466[class24.field578[var18]];
                            if (var21 != null && var21.field2681.field461 == 1 && var17.field1229 == var21.field1229 && var17.field1274 == var21.field1274) {
                                class100.method811(class24.field578[var18], var4, var21.field2681, var7, (byte) 42);
                            }
                        }
                        for (int var19 = 0; var19 < class97.field2250; var19++) {
                            class15 var20 = class58.field1303[class121.field2956[var19]];
                            if (var20 != null && var17 != var20 && var17.field1229 == var20.field1229 && var17.field1274 == var20.field1274) {
                                class115.method937(var7, var4, var20, class121.field2956[var19], 2000);
                            }
                        }
                    }
                    class115.method937(var7, var4, var17, var6, 2000);
                }
                if (var5 == 3) {
                    class3 var22 = class126.field3060[class73.field1619][var4][var7];
                    if (var22 != null) {
                        for (class98 var23 = (class98) var22.method25(false); var23 != null; var23 = (class98) var22.method32(false)) {
                            class31 var24 = class75.method636(var23.field2255, 0);
                            if (class57.field1199 == 1) {
                                class105.method832(37, var7, var23.field2255, (byte) 126, class108.method878(new class105[] { class29.field661, class96.field2220, var24.field706 }, 2867), class43.field1007, var4);
                                class90.field2061++;
                            } else if (class122.field3003 != 1) {
                                class23.field564++;
                                class105[] var25 = var24.field749;
                                if (class128.field3114) {
                                    var25 = class96.method799(103, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 47;
                                        }
                                        if (var26 == 1) {
                                            var27 = 26;
                                        }
                                        if (var26 == 2) {
                                            var27 = 51;
                                        }
                                        class9.field164++;
                                        if (var26 == 3) {
                                            var27 = 8;
                                        }
                                        if (var26 == 4) {
                                            var27 = 40;
                                        }
                                        class105.method832(var27, var7, var23.field2255, (byte) 122, class108.method878(new class105[] { class134.field3263, var24.field706 }, 2867), var25[var26], var4);
                                    } else if (var26 == 2) {
                                        class105.method832(51, var7, var23.field2255, (byte) 121, class108.method878(new class105[] { class134.field3263, var24.field706 }, 2867), class39.field909, var4);
                                        class55.field1096++;
                                    }
                                }
                                class105.method832(1006, var7, var23.field2255, (byte) 124, class108.method878(new class105[] { class134.field3263, var24.field706 }, 2867), class51.field1082, var4);
                            } else if ((class84.field1886 & 0x1) == 1) {
                                class105.method832(54, var7, var23.field2255, (byte) 124, class108.method878(new class105[] { class105.field2386, class96.field2220, var24.field706 }, 2867), class84.field1884, var4);
                                class81.field1818++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 578)
    public static final void method825(int arg0) {
        field2347++;
        method823(-1);
        if (class24.field583 == 1) {
            class23.field558[class133.field3228 / 100].method265(class16.field334 - 12, class81.field1835 + -12);
        }
        if (class24.field583 == 2) {
            class23.field558[class133.field3228 / 100 + 4].method265(class16.field334 - 12, class81.field1835 + -8 + -4);
        }
        if (class6.field71 != -1) {
            class116.method939(class6.field71, (byte) 51);
            class87.method719(class6.field71, 0, 0, 334, 104, 512, 4);
        }
        if (arg0 >= -104) {
            method823(36);
        }
        if (class18.field418 != -1) {
            class116.method939(class18.field418, (byte) 51);
            class87.method719(class18.field418, 0, 0, 334, 104, 512, 0);
        }
        class102.method817(-61);
        if (!class130.field3165) {
            class89.method739((byte) -113);
            class120.method972(55);
        } else if (class1.field13 == 0) {
            class130.method1045(false);
        }
        if (class108.field2482 == 1) {
            class72.field1600.method265(472, 296);
        }
        if (class127.field3070) {
            short var1 = 507;
            byte var2 = 20;
            class6.field79.method671(class108.method878(new class105[] { class128.field3105, class75.method637(class26.field588, 8241) }, 2867), var1, var2, 16776960);
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var5 = 16776960;
            int var9 = var2 + 15;
            if (var4 > 32768 && class109.field2520) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class109.field2520) {
                var5 = 16711680;
            }
            class6.field79.method671(class108.method878(new class105[] { class136.field3332, class75.method637(var4, 8241), class76.field1712 }, 2867), var1, var9, var5);
            var9 += 15;
            if (class28.field629) {
                class6.field79.method671(class80.field1804, var1, var9, 16711680);
                class28.field629 = false;
                var9 += 15;
            }
            if (class28.field620) {
                class6.field79.method671(class95.field2204, var1, var9, 16711680);
                var9 += 15;
                class28.field620 = false;
            }
            if (class107.field2459) {
                class6.field79.method671(class14.field280, var1, var9, 16711680);
                var9 += 15;
                class107.field2459 = false;
            }
        }
        if (class24.field580 == 0) {
            return;
        }
        int var6 = class24.field580 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 < 10) {
            class6.field79.method664(class108.method878(new class105[] { class58.field1306, class75.method637(var7, 8241), class123.field3032, class75.method637(var8, 8241) }, 2867), 4, 329, 16776960);
        } else {
            class6.field79.method664(class108.method878(new class105[] { class58.field1306, class75.method637(var7, 8241), class18.field413, class75.method637(var8, 8241) }, 2867), 4, 329, 16776960);
        }
    }
}
