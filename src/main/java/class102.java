import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class102 extends class123 {

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    private int[] field2356 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "[S")
    private short[] field2372 = new short[6];

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "[S")
    private short[] field2371 = new short[6];

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public int field2378 = -1;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "Z")
    public boolean field2387 = false;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Lvc;")
    public static class137 field2359 = class45.method325(" )2>", -46);

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[Ltc;")
    public static class125[] field2358 = new class125[2048];

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lvc;")
    public static class137 field2360 = class45.method325("Lade Eingabe)2Steuerungsprogramm)3)3)3", -46);

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lvc;")
    public static class137 field2376 = class45.method325("Verbindung mit", -46);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lvc;")
    public static class137 field2357 = class45.method325("overlay_multiway", -46);

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lvc;")
    public static class137 field2379 = class45.method325("leuchten2:", -46);

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "[I")
    public static int[] field2380 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "Lvc;")
    private static class137 field2375 = class45.method325("Username: ", -46);

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "[J")
    public static long[] field2365 = new long[32];

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lvc;")
    public static class137 field2370 = field2375;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "Lvd;")
    public static class138 field2366;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lnb;")
    public static class88 field2368;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "[I")
    private int[] field2385;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "[Z")
    public static boolean[] field2386;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Z")
    public final boolean method739(int arg0) {
        field2367++;
        if (arg0 <= 125) {
            this.method739(-20);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2356[var3] != -1 && !class70.field1480.method647(this.field2356[var3], (byte) 91, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)Z")
    public final boolean method740(int arg0) {
        field2384++;
        if (this.field2385 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2385.length; var3++) {
            if (!class70.field1480.method647(this.field2385[var3], (byte) 82, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
    public static final void method741(int arg0, int arg1) {
        field2382++;
        if (~arg1 == arg0 || !field2386[arg1]) {
            return;
        }
        class108.field2509.method664(arg1, -1);
        if (class36.field795[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class36.field795[arg1].length; var3++) {
            if (class36.field795[arg1][var3] != null) {
                if (class36.field795[arg1][var3].field1952 == 2) {
                    var2 = false;
                } else {
                    class36.field795[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class36.field795[arg1] = null;
        }
        field2386[arg1] = false;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Lwd;")
    public final class144 method742(byte arg0) {
        field2362++;
        int var2 = 0;
        class144[] var3 = new class144[5];
        if (arg0 != -12) {
            method747(12, null, (byte) -61, false);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2356[var4] != -1) {
                var3[var2++] = class144.method1111(class70.field1480, this.field2356[var4], 0);
            }
        }
        class144 var5 = new class144(var3, var2);
        for (int var6 = 0; var6 < 6 && this.field2371[var6] != 0; var6++) {
            var5.method1114(this.field2371[var6], this.field2372[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII[Lme;III)V")
    public static final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class85[] arg8, int arg9, int arg10, int arg11) {
        field2363++;
        if (arg1 != -11588) {
            method746((byte) -74);
        }
        if (arg0 < arg3 || arg10 > arg2 || arg11 <= arg0 || arg9 <= arg2) {
            return;
        }
        for (int var12 = 0; var12 < arg8.length; var12++) {
            class85 var13 = arg8[var12];
            if (var13 != null && var13.field1945 == arg7 && (!var13.field1967 || !class8.method58(var13, 1792))) {
                int var14 = var13.field2007 + arg10 - arg5;
                int var15 = var13.field1985 + arg3 - arg4;
                if (var13.field1952 == 8 && var15 <= arg0 && arg2 >= var14 && var15 + var13.field1929 > arg0 && arg2 < var13.field1975 + var14) {
                    class39.field857 = var12;
                }
                if ((var13.field1944 >= 0 || var13.field1947 != 0) && arg0 >= var15 && var14 <= arg2 && arg0 < var15 + var13.field1929 && arg2 < var13.field1975 + var14) {
                    if (var13.field1944 < 0) {
                        class10.field198 = var12;
                    } else {
                        class10.field198 = var13.field1944;
                    }
                }
                if (var13.field1952 == 0) {
                    if (!var13.field1967 && class8.method58(var13, 1792) && !class12.method75(arg6, (byte) 122, var12)) {
                        continue;
                    }
                    method743(arg0, -11588, arg2, var15, var13.field1932, var13.field1927, arg6, var13.field1910, arg8, var13.field1975 + var14, var14, var13.field1929 + var15);
                    if (var13.field1980 != null) {
                        method743(arg0, arg1, arg2, var15, var13.field1932, var13.field1927, arg6, var13.field1910, var13.field1980, var14 + var13.field1975, var14, var13.field1929 + var15);
                    }
                    if (var13.field1975 < var13.field1993 && !var13.field1967) {
                        class112.method870(var13, var13.field1975, var13.field1993, var15 + var13.field1929, arg6, arg2, (byte) -83, arg0, var14);
                    }
                    if (!var13.field1967) {
                        continue;
                    }
                }
                if (var13.field1925 == 1 && arg0 >= var15 && arg2 >= var14 && var13.field1929 + var15 > arg0 && arg2 < var14 + var13.field1975) {
                    boolean var16 = false;
                    if (var13.field1914 != 0) {
                        var16 = class80.method585(true, var13);
                    }
                    if (!var16) {
                        class71.method498(6, class45.field999, 0, 0, 2916, var13.field1910, var13.field1943);
                        class53.field1174++;
                    }
                }
                if (var13.field1925 == 2 && !class39.field865 && arg0 >= var15 && var14 <= arg2 && arg0 < var13.field1929 + var15 && var14 + var13.field1975 > arg2) {
                    class137 var17 = class109.method834((byte) -36, var13);
                    if (var17 != null) {
                        class131.field3036++;
                        class71.method498(56, class88.method666(arg1 ^ 0x2D2F, new class137[] { class34.field731, var13.field2017 }), 0, -1, arg1 + 14504, var13.field1910, var17);
                    }
                }
                if (var13.field1925 == 3 && var15 <= arg0 && var14 <= arg2 && arg0 < var15 + var13.field1929 && var13.field1975 + var14 > arg2) {
                    class124.field2873++;
                    byte var18;
                    if (arg6 == 3) {
                        var18 = 54;
                    } else {
                        var18 = 35;
                    }
                    class71.method498(var18, class45.field999, 0, 0, 2916, var13.field1910, class28.field626);
                }
                if (var13.field1925 == 4 && var15 <= arg0 && var14 <= arg2 && arg0 < var15 + var13.field1929 && arg2 < var14 + var13.field1975) {
                    class61.field1311++;
                    class71.method498(43, class45.field999, 0, 0, 2916, var13.field1910, var13.field1943);
                }
                if (var13.field1925 == 5 && arg0 >= var15 && var14 <= arg2 && arg0 < var13.field1929 + var15 && var13.field1975 + var14 > arg2) {
                    class71.method498(41, class45.field999, 0, 0, 2916, var13.field1910, var13.field1943);
                    class88.field2077++;
                }
                if (var13.field1925 == 6 && class105.field2433 == -1 && arg0 >= var15 && var14 <= arg2 && arg0 < var13.field1929 + var15 && var13.field1975 + var14 > arg2) {
                    class71.method498(2, class45.field999, 0, -1, 2916, var13.field1910, var13.field1943);
                    class85.field2027++;
                }
                if (var13.field1952 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field1975; var20++) {
                        for (int var21 = 0; var21 < var13.field1929; var21++) {
                            int var22 = (var13.field1933 + 32) * var21 + var15;
                            int var23 = (var13.field2019 + 32) * var20 + var14;
                            if (var19 < 20) {
                                var23 += var13.field2014[var19];
                                var22 += var13.field1965[var19];
                            }
                            if (var22 <= arg0 && var23 <= arg2 && arg0 < var22 + 32 && arg2 < var23 + 32) {
                                class111.field2651 = var13.field1910;
                                class142.field3354 = var19;
                                if (var13.field2008[var19] > 0) {
                                    class141 var24 = class39.method286((byte) -18, var13.field2008[var19] - 1);
                                    if (class98.field2288 == 1 && class4.method28(false, class28.method218(arg1 + 26073, var13))) {
                                        if (class139.field3228 != var13.field1910 || class111.field2647 != var19) {
                                            class21.field452++;
                                            class71.method498(53, class88.method666(arg1 + 11471, new class137[] { class111.field2644, class8.field179, var24.field3316 }), var24.field3315, var19, 2916, var13.field1910, class37.field825);
                                        }
                                    } else if (!class39.field865 || !class4.method28(false, class28.method218(14485, var13))) {
                                        class114.field2722++;
                                        class137[] var25 = var24.field3289;
                                        if (class129.field3025) {
                                            var25 = class80.method592(var25, false);
                                        }
                                        if (class4.method28(false, class28.method218(14485, var13))) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 7;
                                                    } else {
                                                        var27 = 5;
                                                    }
                                                    class119.field2792++;
                                                    class71.method498(var27, class88.method666(114, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, 2916, var13.field1910, var25[var26]);
                                                } else if (var26 == 4) {
                                                    class21.field466++;
                                                    class71.method498(5, class88.method666(119, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, 2916, var13.field1910, class78.field1739);
                                                }
                                            }
                                        }
                                        if (class143.method1100(arg1 ^ 0xFFFFD2CB, class28.method218(14485, var13))) {
                                            class106.field2462++;
                                            class71.method498(17, class88.method666(117, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, arg1 + 14504, var13.field1910, class37.field825);
                                        }
                                        if (class4.method28(false, class28.method218(14485, var13)) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    byte var29 = 0;
                                                    class10.field217++;
                                                    if (var28 == 0) {
                                                        var29 = 14;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 19;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 29;
                                                    }
                                                    class71.method498(var29, class88.method666(arg1 + 11709, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, arg1 + 14504, var13.field1910, var25[var28]);
                                                }
                                            }
                                        }
                                        class137[] var30 = var13.field1953;
                                        if (class129.field3025) {
                                            var30 = class80.method592(var30, false);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    byte var32 = 0;
                                                    class115.field2728++;
                                                    if (var31 == 0) {
                                                        var32 = 47;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 38;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 32;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 13;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 25;
                                                    }
                                                    class71.method498(var32, class88.method666(arg1 + 11569, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, arg1 + 14504, var13.field1910, var30[var31]);
                                                }
                                            }
                                        }
                                        class71.method498(1002, class88.method666(arg1 ^ 0x2D7C, new class137[] { class99.field2301, var24.field3316 }), var24.field3315, var19, 2916, var13.field1910, class86.field2054);
                                    } else if ((class29.field653 & 0x10) == 16) {
                                        class71.method498(11, class88.method666(arg1 + 11702, new class137[] { class13.field281, class8.field179, var24.field3316 }), var24.field3315, var19, arg1 ^ 0xFFFFD9D8, var13.field1910, class99.field2302);
                                        class42.field924++;
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field1967) {
                    if (class39.field865) {
                        if (class108.method784(class28.method218(14485, var13), false) && (class29.field653 & 0x20) == 32 && arg0 >= var15 && var14 <= arg2 && arg0 < var13.field1929 + var15 && arg2 < var13.field1975 + var14) {
                            class7.field133++;
                            class71.method498(33, class88.method666(arg1 + 11570, new class137[] { class13.field281, class106.field2473, var13.field1934 }), 0, var13.field1920, 2916, var13.field1910, class99.field2302);
                        }
                    } else if (var15 <= arg0 && var14 <= arg2 && arg0 < var13.field1929 + var15 && arg2 < var13.field1975 + var14) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class137 var37 = class99.method717(var13, (byte) -74, var33);
                            if (var37 != null) {
                                class71.method498(49, var13.field1934, var33 + 1, var13.field1920, 2916, var13.field1910, var37);
                                class72.field1528++;
                            }
                        }
                        class137 var34 = class109.method834((byte) -36, var13);
                        if (var34 != null) {
                            class71.method498(56, var13.field1934, 0, var13.field1920, 2916, var13.field1910, var34);
                            class131.field3036++;
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class137 var36 = class99.method717(var13, (byte) -23, var35);
                            if (var36 != null) {
                                class72.field1528++;
                                class71.method498(49, var13.field1934, var35 + 1, var13.field1920, 2916, var13.field1910, var36);
                            }
                        }
                        if (class13.method90((byte) 91, class28.method218(14485, var13))) {
                            class71.method498(2, class45.field999, 0, -1, 2916, var13.field1910, var13.field1943);
                            class85.field2027++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILqe;I)V")
    private final void method744(int arg0, class109 arg1, int arg2) {
        if (~arg2 == arg0) {
            this.field2378 = arg1.method838(255);
        } else if (arg2 == 2) {
            int var4 = arg1.method838(255);
            this.field2385 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2385[var5] = arg1.method835(2);
            }
        } else if (arg2 == 3) {
            this.field2387 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2371[arg2 - 40] = (short) arg1.method835(arg0 + 4);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2372[arg2 - 50] = (short) arg1.method835(2);
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2356[arg2 - 60] = arg1.method835(2);
        }
        field2374++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lqe;I)V")
    public final void method745(class109 arg0, int arg1) {
        field2383++;
        while (true) {
            int var3 = arg0.method838(255);
            if (var3 == 0) {
                int var4 = -92 % ((arg1 + 55) / 44);
                return;
            }
            this.method744(-2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
    public static void method746(byte arg0) {
        field2358 = null;
        field2359 = null;
        field2376 = null;
        field2366 = null;
        field2379 = null;
        field2368 = null;
        field2357 = null;
        field2375 = null;
        field2380 = null;
        field2370 = null;
        if (arg0 <= 16) {
            method747(-73, null, (byte) -120, true);
        }
        field2360 = null;
        field2365 = null;
        field2386 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILha;BZ)Z")
    public static final boolean method747(int arg0, class50 arg1, byte arg2, boolean arg3) {
        field2369++;
        if (!class139.method1070(-1, arg3, arg1)) {
            return false;
        }
        if (arg2 < 120) {
            method743(-8, -84, 52, -63, 79, 34, -100, -1, null, -103, -88, -58);
        }
        if (arg0 > 0) {
            class13.field294 = new class105(arg0);
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)Lwd;")
    public final class144 method748(int arg0) {
        field2373++;
        if (this.field2385 == null) {
            return null;
        }
        class144[] var2 = new class144[this.field2385.length];
        int var3 = 0;
        if (arg0 <= 49) {
            field2358 = null;
        }
        while (var3 < this.field2385.length) {
            var2[var3] = class144.method1111(class70.field1480, this.field2385[var3], 0);
            var3++;
        }
        class144 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class144(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2371[var5] != 0; var5++) {
            var4.method1114(this.field2371[var5], this.field2372[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)V")
    public static final void method749(byte arg0) {
        field2377++;
        while (class103.field2391.method846(46, class68.field1399) >= 27) {
            int var1 = class103.field2391.method847(15, (byte) 68);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class125.field2914[var1] == null) {
                var2 = true;
                class125.field2914[var1] = new class56();
            }
            class56 var3 = class125.field2914[var1];
            class72.field1526[class107.field2498++] = var1;
            var3.field1667 = class112.field2667;
            int var4 = class103.field2391.method847(5, (byte) 100);
            int var5 = class103.field2391.method847(5, (byte) 90);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class8.field189[class103.field2391.method847(3, (byte) 126)];
            if (var2) {
                var3.field1652 = var6;
            }
            int var7 = class103.field2391.method847(1, (byte) 62);
            if (var7 == 1) {
                class85.field2036[class68.field1416++] = var1;
            }
            int var8 = class103.field2391.method847(1, (byte) 92);
            var3.field1203 = class67.method476(true, class103.field2391.method847(13, (byte) 79));
            var3.field1677 = var3.field1203.field3246;
            var3.field1688 = var3.field1203.field3247;
            var3.field1634 = var3.field1203.field3241;
            var3.field1676 = var3.field1203.field3219;
            var3.field1639 = var3.field1203.field3198;
            var3.field1630 = var3.field1203.field3223;
            var3.field1685 = var3.field1203.field3239;
            var3.field1673 = var3.field1203.field3243;
            var3.field1649 = var3.field1203.field3217;
            if (var3.field1634 == 0) {
                var3.field1652 = 0;
            }
            var3.method559(var8 == 1, (byte) -103, class104.field2412.field1624[0] + var4, class104.field2412.field1647[0] - -var5);
        }
        if (arg0 >= -110) {
            method741(-46, -82);
        }
        class103.field2391.method854(false);
    }
}
