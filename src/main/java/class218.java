import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class218 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[J")
    public static long[] field3317 = new long[256];

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "[[Z")
    public static boolean[][] field3322;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[[S")
    public static short[][] field3326;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3324;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
    public static int[] field3325;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[[[I")
    public static int[][][] field3321;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)V", line = 10)
    public static final void method1535(int arg0, byte arg1) {
        field3320++;
        class50.field803 = null;
        class50.field801 = -1;
        class48.field781 = 0;
        class150.field2266 = false;
        class165.field2479 = arg0;
        class225.field3583 = 1;
        class1.field5 = -1;
        int var2 = 57 % ((arg1 - 74) / 45);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V", line = 37)
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3318++;
        if (class313.field4858 == 0) {
            int var7 = class5.field50;
            int var8 = class53.field899;
            int var9 = class91.field1445;
            int var10 = (arg4 - arg5) * (var8 - var9) / arg1 + var9;
            int var11 = class325.field5062;
            int var12 = (arg0 - arg6) * (var7 - var11) / arg2 + var11;
            if (class35.field545 && (class11.field172 & 0x40) != 0) {
                class220 var13 = class177.method1263(class224.field3573, -118, class52.field868);
                if (var13 == null) {
                    class216.method1530(-20640);
                } else {
                    class231.method1628(var12, class344.field5344, 0, " ->", var10, (short) 58, class332.field5173, 0L);
                }
            } else {
                if (class288.field4491 == 1) {
                    class231.method1628(var12, -1, 0, "", var10, (short) 22, class60.field973, 0L);
                }
                class296.field4574++;
                class231.method1628(var12, -1, 0, "", var10, (short) 24, class152.field2294, 0L);
            }
        }
        if (arg3 <= 81) {
            method1536(7, -108, 21, -111, 74, -128, 115);
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class315.field4903; var16++) {
            long var17 = class176.field2674[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x6763E5A5) >> 29;
            int var21 = ((int) var17 & 0x3F9B) >> 7;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class137.method995(class205.field3101, var19, var21, var17)) {
                    class85 var23 = class201.method1431(-84, var22);
                    if (var23.field1375 != null) {
                        var23 = var23.method598((byte) -80);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class313.field4858 == 1) {
                        class231.method1628(var19, class34.field533, 0, class136.field2149 + " -> <col=00ffff>" + var23.field1356, var21, (short) 12, class186.field2776, var17);
                        class7.field86++;
                    } else if (class35.field545) {
                        class177 var28 = class115.field1765 == -1 ? null : class299.method2044(class115.field1765, (byte) -51);
                        if ((class11.field172 & 0x4) != 0 && (var28 == null || var23.method602(class115.field1765, var28.field2684, 58) != var28.field2684)) {
                            class47.field772++;
                            class231.method1628(var19, class344.field5344, 0, class254.field3997 + " -> <col=00ffff>" + var23.field1356, var21, (short) 16, class332.field5173, var17);
                        }
                    } else {
                        class212.field3218++;
                        String[] var24 = var23.field1361;
                        if (class131.field2054) {
                            var24 = class290.method1990((byte) 126, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class313.field4851++;
                                    int var26 = -1;
                                    if (var23.field1330 == var25) {
                                        var26 = var23.field1373;
                                    }
                                    if (var23.field1389 == var25) {
                                        var26 = var23.field1363;
                                    }
                                    short var27 = 0;
                                    if (var25 == 0) {
                                        var27 = 29;
                                    }
                                    if (var25 == 1) {
                                        var27 = 8;
                                    }
                                    if (var25 == 2) {
                                        var27 = 42;
                                    }
                                    if (var25 == 3) {
                                        var27 = 35;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1007;
                                    }
                                    class231.method1628(var19, var26, 0, "<col=00ffff>" + var23.field1356, var21, var27, var24[var25], var17);
                                }
                            }
                        }
                        class231.method1628(var19, class131.field2060, 0, "<col=00ffff>" + var23.field1356, var21, (short) 1006, class149.field2258, (long) var23.field1321);
                    }
                }
                if (var20 == 1) {
                    class313 var29 = class254.field3989[var22];
                    if ((var29.field4859.field3118 & 0x1) == 0 && (var29.field1905 & 0x7F) == 0 && (var29.field1868 & 0x7F) == 0 || (var29.field4859.field3118 & 0x1) == 1 && (var29.field1905 & 0x7F) == 64 && (var29.field1868 & 0x7F) == 64) {
                        int var30 = var29.field1905 - ((var29.field4859.field3118 - 1) * 64);
                        int var31 = var29.field1868 + 64 - var29.field4859.field3118 * 64;
                        for (int var32 = 0; var32 < class312.field4839; var32++) {
                            class313 var33 = class254.field3989[class325.field5049[var32]];
                            if (var33 != null && !var33.field1921 && var29 != var33 && var33.field1925) {
                                int var34 = var33.field1905 - ((var33.field4859.field3118 - 1) * 64);
                                int var35 = var33.field1868 - ((var33.field4859.field3118 - 1) * 64);
                                if (var30 <= var34 && var33.field4859.field3118 <= var29.field4859.field3118 - (var34 - var30 >> 7) && var31 <= var35 && var33.field4859.field3118 <= (var29.field4859.field3118 - (var35 - var31 >> 7))) {
                                    class203.method1442(var19, var21, class325.field5049[var32], var33.field4859, 1024);
                                    var33.field1921 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class310.field4816; var36++) {
                            class33 var37 = class254.field3992[class103.field1606[var36]];
                            if (var37 != null && !var37.field1921 && var37.field1925) {
                                int var38 = var37.field1905 + 64 - (var37.method280(false) * 64);
                                int var39 = var37.field1868 + 64 - (var37.method280(false) * 64);
                                if (var30 <= var38 && var37.method280(false) <= var29.field4859.field3118 - (var38 - var30 >> 7) && var31 <= var39 && var37.method280(false) <= (var29.field4859.field3118 - (var39 - var31 >> 7))) {
                                    class284.method1963(class103.field1606[var36], var19, var37, var21, (byte) 116);
                                    var37.field1921 = true;
                                }
                            }
                        }
                    }
                    if (var29.field1921) {
                        continue;
                    }
                    class203.method1442(var19, var21, var22, var29.field4859, 1024);
                    var29.field1921 = true;
                }
                if (var20 == 0) {
                    class33 var40 = class254.field3992[var22];
                    if ((var40.field1905 & 0x7F) == 64 && (var40.field1868 & 0x7F) == 64) {
                        int var41 = var40.field1905 - (var40.method280(false) - 1) * 64;
                        int var42 = var40.field1868 - ((var40.method280(false) - 1) * 64);
                        for (int var43 = 0; var43 < class312.field4839; var43++) {
                            class313 var44 = class254.field3989[class325.field5049[var43]];
                            if (var44 != null && !var44.field1921 && var44.field1925) {
                                int var45 = var44.field1905 + 64 - (var44.field4859.field3118 * 64);
                                int var46 = var44.field1868 - ((var44.field4859.field3118 - 1) * 64);
                                if (var45 >= var41 && var44.field4859.field3118 <= var40.method280(false) - (var45 - var41 >> 7) && var42 <= var46 && var44.field4859.field3118 <= (var40.method280(false) - (var46 - var42 >> 7))) {
                                    class203.method1442(var19, var21, class325.field5049[var43], var44.field4859, 1024);
                                    var44.field1921 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class310.field4816; var47++) {
                            class33 var48 = class254.field3992[class103.field1606[var47]];
                            if (var48 != null && !var48.field1921 && var40 != var48 && var48.field1925) {
                                int var49 = var48.field1905 - ((var48.method280(false) - 1) * 64);
                                int var50 = var48.field1868 + 64 - var48.method280(false) * 64;
                                if (var49 >= var41 && var48.method280(false) <= (var40.method280(false) - (var49 - var41 >> 7)) && var50 >= var42 && var48.method280(false) <= (var40.method280(false) - (var50 - var42 >> 7))) {
                                    class284.method1963(class103.field1606[var47], var19, var48, var21, (byte) 116);
                                    var48.field1921 = true;
                                }
                            }
                        }
                    }
                    if (var40.field1921) {
                        continue;
                    }
                    class284.method1963(var22, var19, var40, var21, (byte) 116);
                    var40.field1921 = true;
                }
                if (var20 == 3) {
                    class87 var51 = class280.field4315[class205.field3101][var19][var21];
                    if (var51 != null) {
                        for (class84 var52 = (class84) var51.method635((byte) 98); var52 != null; var52 = (class84) var51.method630((byte) -122)) {
                            int var53 = var52.field1308.field1456;
                            class299 var54 = class237.method1657(2, var53);
                            if (class313.field4858 == 1) {
                                class231.method1628(var19, class34.field533, 0, class136.field2149 + " -> <col=ff9040>" + var54.field4650, var21, (short) 38, class186.field2776, (long) var53);
                                class20.field261++;
                            } else if (class35.field545) {
                                class177 var55 = class115.field1765 == -1 ? null : class299.method2044(class115.field1765, (byte) -31);
                                if ((class11.field172 & 0x1) != 0 && (var55 == null || var54.method2036(class115.field1765, 2, var55.field2684) != var55.field2684)) {
                                    class71.field1161++;
                                    class231.method1628(var19, class344.field5344, 0, class254.field3997 + " -> <col=ff9040>" + var54.field4650, var21, (short) 36, class332.field5173, (long) var53);
                                }
                            } else {
                                String[] var56 = var54.field4643;
                                if (class131.field2054) {
                                    var56 = class290.method1990((byte) 126, var56);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        byte var58 = 0;
                                        class276.field4253++;
                                        int var59 = -1;
                                        if (var54.field4656 == var57) {
                                            var59 = var54.field4659;
                                        }
                                        if (var54.field4653 == var57) {
                                            var59 = var54.field4646;
                                        }
                                        if (var57 == 0) {
                                            var58 = 48;
                                        }
                                        if (var57 == 1) {
                                            var58 = 2;
                                        }
                                        if (var57 == 2) {
                                            var58 = 41;
                                        }
                                        if (var57 == 3) {
                                            var58 = 28;
                                        }
                                        if (var57 == 4) {
                                            var58 = 39;
                                        }
                                        class231.method1628(var19, var59, 0, "<col=ff9040>" + var54.field4650, var21, var58, var56[var57], (long) var53);
                                    }
                                }
                                class231.method1628(var19, class131.field2060, 0, "<col=ff9040>" + var54.field4650, var21, (short) 1001, class149.field2258, (long) var53);
                                class179.field2701++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ltb;II)I", line = 465)
    public static final int method1537(class220 arg0, int arg1, int arg2) {
        field3319++;
        if (arg0.field3470 == null || arg1 >= arg0.field3470.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3470[arg1];
            int var4 = 0;
            int var5 = 0;
            if (arg2 != 20) {
                field3317 = (long[]) null;
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class46.field764[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class128.field2004[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class48.field791[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class220 var12 = class68.method524((byte) -113, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class237.method1657(2, var13).field4609 || class166.field2527)) {
                        for (int var14 = 0; var14 < var12.field3428.length; var14++) {
                            if ((var13 + 1) == var12.field3428[var14]) {
                                var9 += var12.field3409[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class285.field4461[var3[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 6) {
                    var9 = class242.field3869[class128.field2004[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class285.field4461[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class98.field1566.field505;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class125.field1960[var15]) {
                            var9 += class128.field2004[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class220 var18 = class68.method524((byte) -112, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class237.method1657(2, var19).field4609 || class166.field2527)) {
                        for (int var20 = 0; var20 < var18.field3428.length; var20++) {
                            if ((var19 + 1) == var18.field3428[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class216.field3276;
                }
                if (var7 == 12) {
                    var9 = class281.field4343;
                }
                if (var7 == 13) {
                    int var21 = class285.field4461[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class2.method9(0, var23);
                }
                if (var7 == 18) {
                    var9 = (class98.field1566.field1905 >> 7) + class213.field3249;
                }
                if (var7 == 19) {
                    var9 = (class98.field1566.field1868 >> 7) + class342.field5328;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 690)
    public static final void method1538(int arg0) {
        int var1 = class131.field2058;
        int var2 = class308.field4792;
        field3316++;
        if (arg0 <= 19) {
            method1538(1);
        }
        int var3 = class40.field604;
        int var4 = class112.field1737;
        int var5 = 6116423;
        if (class94.field1516) {
            class167.method1186(var2, var3, var1, var4, var5);
            class167.method1186(var2 + 1, var3 + 1, var1 - 2, 16, 0);
            class167.method1189(var2 + 1, var3 + 18, var1 - 2, var4 + -19, 0);
        } else {
            class109.method812(var2, var3, var1, var4, var5);
            class109.method812(var2 + 1, var3 + 1, var1 - 2, 16, 0);
            class109.method801(var2 + 1, var3 + 18, var1 - 2, var4 + -19, 0);
        }
        class344.field5343.method2245(class174.field2630, var2 + 3, var3 + 14, var5, -1);
        int var6 = class119.field1815;
        int var7 = class253.field3984;
        for (int var8 = 0; var8 < class301.field4706; var8++) {
            int var9 = 16777215;
            int var10 = ((class301.field4706 - var8 - 1) * 15) + var3 + 31;
            if (var2 < var6 && var6 < (var1 + var2) && var7 > var10 - 13 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class344.field5343.method2245(class288.method1979(var8, -60), var2 + 3, var10, var9, 0);
        }
        class285.method1978(class112.field1737, class40.field604, 0, class308.field4792, class131.field2058);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIIIIII)V", line = 756)
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            return;
        }
        field3315++;
        class220 var7 = class177.method1263(arg2, arg4 - 122, arg0);
        if (var7 != null && var7.field3385 != null) {
            class240 var8 = new class240();
            var8.field3834 = var7;
            var8.field3826 = var7.field3385;
            class336.method2337(var8, (byte) -71);
        }
        class35.field545 = true;
        class115.field1765 = arg6;
        class52.field868 = arg0;
        class344.field5344 = arg1;
        class11.field172 = arg3;
        class207.field3175 = arg5;
        class224.field3573 = arg2;
        class26.method241(3095, var7);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Ljava/lang/String;", line = 795)
    public static final String method1540(byte arg0) {
        field3313++;
        String var1 = "www";
        if (class60.field967 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class120.field1827 != null) {
            var2 = "/p=" + class120.field1827;
        }
        if (arg0 <= 48) {
            field3323 = 20;
        }
        return "http://" + var1 + ".runescape.com/l=" + class195.field2920 + "/a=" + class233.field3708 + var2 + "/";
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3317[var0] = var1;
        }
        field3322 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };
        field3326 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field3324 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 838)
    public static final void method1541(byte arg0) {
        class341.method2361((byte) -52, false);
        field3314++;
        class241.field3852 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class303.field4723.length; var2++) {
            if (class199.field2973[var2] != -1 && class303.field4723[var2] == null) {
                class303.field4723[var2] = class225.field3575.method980(class199.field2973[var2], 0, 5);
                if (class303.field4723[var2] == null) {
                    var1 = false;
                    class241.field3852++;
                }
            }
            if (class241.field3865[var2] != -1 && class170.field2566[var2] == null) {
                class170.field2566[var2] = class225.field3575.method957(-123, 0, class150.field2269[var2], class241.field3865[var2]);
                if (class170.field2566[var2] == null) {
                    class241.field3852++;
                    var1 = false;
                }
            }
            if (class94.field1516) {
                if (class153.field2308[var2] != -1 && class29.field430[var2] == null) {
                    class29.field430[var2] = class225.field3575.method980(class153.field2308[var2], 0, 5);
                    if (class29.field430[var2] == null) {
                        var1 = false;
                        class241.field3852++;
                    }
                }
                if (class300.field4689[var2] != -1 && class128.field2027[var2] == null) {
                    class128.field2027[var2] = class225.field3575.method980(class300.field4689[var2], 0, 5);
                    if (class128.field2027[var2] == null) {
                        var1 = false;
                        class241.field3852++;
                    }
                }
            }
            if (class206.field3171 != null && class270.field4197[var2] == null && class206.field3171[var2] != -1) {
                class270.field4197[var2] = class225.field3575.method957(-124, 0, class150.field2269[var2], class206.field3171[var2]);
                if (class270.field4197[var2] == null) {
                    var1 = false;
                    class241.field3852++;
                }
            }
        }
        if (class80.field1266 == null) {
            if (class170.field2577 == null || !class162.field2432.method964(-99, class170.field2577.field42 + "_labels")) {
                class80.field1266 = new class300(0);
            } else if (class162.field2432.method962((byte) -116, class170.field2577.field42 + "_labels")) {
                class80.field1266 = class220.method1568(class170.field2577.field42 + "_labels", class162.field2432, 0);
            } else {
                var1 = false;
                class241.field3852++;
            }
        }
        if (!var1) {
            class7.field95 = 1;
            return;
        }
        class202.field3034 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class303.field4723.length; var4++) {
            byte[] var5 = class170.field2566[var4];
            if (var5 != null) {
                int var6 = (class331.field5158[var4] >> 8) * 64 - class213.field3249;
                int var7 = (class331.field5158[var4] & 0xFF) * 64 - class342.field5328;
                if (class92.field1463) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class315.method2137(var5, (byte) -122, var6, var7);
            }
            if (class94.field1516) {
                byte[] var8 = class128.field2027[var4];
                if (var8 != null) {
                    int var9 = (class331.field5158[var4] >> 8) * 64 - class213.field3249;
                    int var10 = (class331.field5158[var4] & 0xFF) * 64 - class342.field5328;
                    if (class92.field1463) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class315.method2137(var8, (byte) -126, var9, var10);
                }
            }
        }
        if (!var3) {
            class7.field95 = 2;
            return;
        }
        boolean var11 = false;
        if (class7.field95 != 0) {
            class173.method1244(class156.field2334 + "<br>(100%)", 17, true);
        }
        class170.method1225((byte) -97);
        class171.method1235((byte) -106);
        if (class94.field1516 && class300.field4691) {
            for (int var12 = 0; var12 < class303.field4723.length; var12++) {
                if (class128.field2027[var12] != null || class29.field430[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class338.method2349(4, 104, 104, class94.field1516 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class224.field3570[var13].method2068((byte) -50);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class92.field1468[var14][var15][var16] = 0;
                }
            }
        }
        class12.method89((byte) -99, false);
        if (class94.field1516) {
            class6.field78.method1211();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class6.field79[var17][var18].field4711 = true;
                }
            }
        }
        if (class94.field1516) {
            class183.method1310();
        }
        if (class94.field1516) {
            class332.method2310(0);
        }
        class170.method1225((byte) -97);
        System.gc();
        class341.method2361((byte) -52, true);
        class308.method2101(false, (byte) 108);
        int var19 = 24 / ((29 - arg0) / 55);
        if (!class92.field1463) {
            class30.method257(4, false);
            class341.method2361((byte) -52, true);
            if (class94.field1516) {
                int var20 = class98.field1566.field1910[0] >> 3;
                int var21 = class98.field1566.field1938[0] >> 3;
                class224.method1587(var20, var21, (byte) -49);
            }
            class148.method1029(-2, false);
            if (class270.field4197 != null) {
                class233.method1645(-29066);
            }
        }
        if (class92.field1463) {
            class263.method1798(false, (byte) 52);
            class341.method2361((byte) -52, true);
            if (class94.field1516) {
                int var22 = class98.field1566.field1910[0] >> 3;
                int var23 = class98.field1566.field1938[0] >> 3;
                class224.method1587(var22, var23, (byte) -49);
            }
            class224.method1586(false, false);
        }
        class171.method1235((byte) -110);
        class341.method2361((byte) -52, true);
        class160.method1090(class224.field3570, false, (byte) -88, class92.field1463 ? class315.field4897 : (int[][][]) null);
        if (class94.field1516) {
            class183.method1303();
        }
        class341.method2361((byte) -52, true);
        int var24 = class237.field3779;
        if (var24 > class205.field3101) {
            var24 = class205.field3101;
        }
        if ((class205.field3101 - 1) > var24) {
            int var25 = class205.field3101 - 1;
        }
        if (class19.method150(-88)) {
            class85.method613(0);
        } else {
            class85.method613(class237.field3779);
        }
        class299.method2037((byte) -5);
        if (class94.field1516 && var11) {
            class298.method2022(true);
            class308.method2101(true, (byte) 108);
            if (!class92.field1463) {
                class30.method257(4, true);
                class341.method2361((byte) -52, true);
                class148.method1029(-2, true);
            }
            if (class92.field1463) {
                class263.method1798(true, (byte) 52);
                class341.method2361((byte) -52, true);
                class224.method1586(true, false);
            }
            class171.method1235((byte) -114);
            class341.method2361((byte) -52, true);
            class160.method1090(class224.field3570, true, (byte) -88, class92.field1463 ? class315.field4897 : (int[][][]) null);
            class341.method2361((byte) -52, true);
            class299.method2037((byte) -67);
            class298.method2022(false);
        }
        if (class94.field1516) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    class6.field79[var26][var27].method2056(field3321[0], var26 * 8, var27 * 8);
                }
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class276.method1893(var29, var28, false);
            }
        }
        class98.method729((byte) 19);
        class170.method1225((byte) -97);
        class294.method2003(90);
        class171.method1235((byte) -78);
        class146.field2236 = false;
        if (class94.field1516) {
            class318.method2162(true, -27838);
        }
        if (class92.field1464 != null && class295.field4568 != null && class131.field2052 == 25) {
            class149.field2260++;
            class106.field1642.method753(-41, 228);
            class106.field1642.method1174((byte) -32, 1057001181);
        }
        if (!class92.field1463) {
            int var30 = (class81.field1272 - 6) / 8;
            int var31 = (class81.field1272 + 6) / 8;
            int var32 = (class315.field4887 - 6) / 8;
            int var33 = (class315.field4887 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= var31 + 1; var34++) {
                for (int var35 = var32 - 1; var35 <= var33 + 1; var35++) {
                    if (var30 > var34 || var34 > var31 || var35 < var32 || var33 < var35) {
                        class225.field3575.method966(-46, "m" + var34 + "_" + var35);
                        class225.field3575.method966(-126, "l" + var34 + "_" + var35);
                    }
                }
            }
        }
        if (class131.field2052 == 28) {
            class88.method640(10, (byte) 49);
        } else {
            class88.method640(30, (byte) 49);
            if (class295.field4568 != null) {
                class106.field1642.method753(126, 248);
            }
        }
        class40.method330(21894);
        class170.method1225((byte) -97);
        class282.method1931((byte) -51);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 1335)
    public static void method1542(boolean arg0) {
        field3324 = null;
        field3326 = (short[][]) null;
        field3325 = null;
        field3322 = (boolean[][]) null;
        if (arg0) {
            method1535(80, (byte) 29);
        }
        field3317 = null;
        field3321 = (int[][][]) null;
    }
}
