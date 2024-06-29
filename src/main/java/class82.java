import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 {

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lva;")
    private static class121 field1899 = class107.method797("Loading textures )2 ", -10983);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
    public static int[] field1903 = new int[5];

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lva;")
    public static class121 field1892 = field1899;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lva;")
    private static class121 field1917 = class107.method797("Starting game engine)3)3)3", -10983);

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lva;")
    public static class121 field1907 = field1917;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Li;")
    public static class48 field1896 = new class48(200);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "J")
    private long field1884;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "J")
    private long field1913;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lw;")
    public static class125 field1893;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lw;")
    public static class125 field1895;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Z")
    public boolean field1912;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public static int[] field1894;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
    private int[] field1905;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[I")
    private int[] field1914;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V", line = 5)
    public final void method559(boolean arg0, int arg1, int arg2) {
        field1910++;
        int var4 = this.field1914[arg1];
        if (arg2 != -1) {
            return;
        }
        if (arg0) {
            var4++;
            if (var4 >= class41.field930[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class41.field930[arg1].length - 1;
            }
        }
        this.field1914[arg1] = var4;
        this.method563(-14408);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 34)
    public static final void method560(int arg0) {
        if (arg0 < 106) {
            return;
        }
        field1891++;
        if (class90.field2048 != 0) {
            return;
        }
        int var1 = class21.field568;
        if (class22.field573 == 1 && class15.field280 >= 516 && field1909 >= 160 && class15.field280 <= 765 && field1909 <= 205) {
            var1 = 0;
        }
        if (!class100.field2245) {
            if (var1 == 1 && class26.field654 > 0) {
                int var2 = class35.field844[class26.field654 - 1];
                if (var2 == 3 || var2 == 6 || var2 == 38 || var2 == 29 || var2 == 42 || var2 == 16 || var2 == 11 || var2 == 20 || var2 == 18 || var2 == 36 || var2 == 27 || var2 == 1006) {
                    int var3 = class46.field1074[class26.field654 - 1];
                    int var4 = class25.field635[class26.field654 - 1];
                    class19 var5 = class125.method979(var4, 65535);
                    if (var5.field510 || var5.field497) {
                        class79.field1839 = 0;
                        class127.field2885 = field1909;
                        class45.field1065 = class15.field280;
                        class90.field2048 = 2;
                        class58.field1338 = var3;
                        class125.field2849 = var4;
                        if (var4 >> 16 == class26.field659) {
                            class90.field2048 = 1;
                        }
                        class47.field1092 = false;
                        if (var4 >> 16 == class90.field2038) {
                            class90.field2048 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class84.field1945 == 1 || class46.method309(class26.field654 - 1, (byte) 54)) && class26.field654 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class26.field654 > 0) {
                class71.method490(class26.field654 - 1, (byte) -94);
            }
            if (var1 == 2 && class26.field654 > 0) {
                class66.method468(-5);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class34.field822;
            int var7 = class19.field514;
            if (class13.field240 == 0) {
                var7 -= 4;
                var6 -= 4;
            }
            if (class13.field240 == 1) {
                var6 -= 553;
                var7 -= 205;
            }
            if (class13.field240 == 2) {
                var7 -= 357;
                var6 -= 17;
            }
            if (var6 < class91.field2064 - 10 || var6 > class97.field2165 + class91.field2064 + 10 || var7 < class40.field904 - 10 || var7 > field1901 + class40.field904 + 10) {
                class100.field2245 = false;
                if (class13.field240 == 2) {
                    class9.field140 = true;
                }
                if (class13.field240 == 1) {
                    class97.field2168 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class91.field2064;
        int var9 = class40.field904;
        int var10 = class97.field2165;
        int var11 = class15.field280;
        int var12 = field1909;
        if (class13.field240 == 0) {
            var11 -= 4;
            var12 -= 4;
        }
        if (class13.field240 == 1) {
            var11 -= 553;
            var12 -= 205;
        }
        if (class13.field240 == 2) {
            var12 -= 357;
            var11 -= 17;
        }
        int var13 = -1;
        for (int var14 = 0; var14 < class26.field654; var14++) {
            int var15 = (class26.field654 - var14 - 1) * 15 + var9 + 31;
            if (var8 < var11 && var11 < var8 + var10 && var12 > var15 - 13 && var15 + 3 > var12) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            class71.method490(var13, (byte) -55);
        }
        class100.field2245 = false;
        if (class13.field240 == 2) {
            class9.field140 = true;
        }
        if (class13.field240 != 1) {
            return;
        }
        class97.field2168 = true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILge;Lge;I)Lrb;", line = 220)
    public final class102 method561(boolean arg0, int arg1, class41 arg2, class41 arg3, int arg4) {
        field1887++;
        if (this.field1906 != -1) {
            return class63.method456((byte) 123, this.field1906).method127(arg2, arg1, arg3, -9500, arg4);
        }
        long var6 = this.field1884;
        int[] var8 = this.field1905;
        if (arg3 != null && (arg3.field911 >= 0 || arg3.field942 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1905[var9];
            }
            if (arg3.field911 >= 0) {
                var6 += arg3.field911 - this.field1905[5] << 8;
                var8[5] = arg3.field911;
            }
            if (arg3.field942 >= 0) {
                var6 += arg3.field942 - this.field1905[3] << 16;
                var8[3] = arg3.field942;
            }
        }
        class102 var10 = (class102) class46.field1072.method345(105, var6);
        if (arg0) {
            field1893 = null;
        }
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class127.method991(853, var20 - 256).method390((byte) -122)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class114.method872((byte) 121, var20 - 512).method917(11105, this.field1912)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1913 != -1L) {
                    var10 = (class102) class46.field1072.method345(104, this.field1913);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class102[] var13 = new class102[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class102 var18 = class127.method991(853, var17 - 256).method387((byte) 65);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class102 var19 = class114.method872((byte) 121, var17 - 512).method921(false, this.field1912);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class102(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1914[var16] != 0) {
                        var10.method704(class41.field930[var16][0], class41.field930[var16][this.field1914[var16]]);
                        if (var16 == 1) {
                            var10.method704(class13.field237[0], class13.field237[this.field1914[var16]]);
                        }
                    }
                }
                var10.method686();
                var10.method700(64, 850, -30, -50, -30, true);
                class46.field1072.method350((byte) 123, var10, var6);
                this.field1913 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class102 var21;
        if (arg3 != null && arg2 != null) {
            var21 = arg3.method274(arg4, var10, arg1, 1506013200, arg2);
        } else if (arg3 == null) {
            var21 = arg2.method270(arg1, var10, 16578);
        } else {
            var21 = arg3.method270(arg4, var10, 16578);
        }
        return var21;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lrb;", line = 395)
    public final class102 method562(int arg0) {
        field1886++;
        if (this.field1906 != -1) {
            return class63.method456((byte) -76, this.field1906).method135(0);
        }
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != 27) {
            this.method561(false, -42, null, null, -91);
        }
        while (var3 < 12) {
            int var12 = this.field1905[var3];
            if (var12 >= 256 && var12 < 512 && !class127.method991(853, var12 - 256).method381(0)) {
                var2 = true;
            }
            if (var12 >= 512 && !class114.method872((byte) 121, var12 - 512).method914((byte) -109, this.field1912)) {
                var2 = true;
            }
            var3++;
        }
        if (var2) {
            return null;
        }
        int var4 = 0;
        class102[] var5 = new class102[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1905[var6];
            if (var9 >= 256 && var9 < 512) {
                class102 var10 = class127.method991(arg0 + 826, var9 + -256).method386(4922);
                if (var10 != null) {
                    var5[var4++] = var10;
                }
            }
            if (var9 >= 512) {
                class102 var11 = class114.method872((byte) 121, var9 - 512).method923(this.field1912, arg0 ^ 0x478A);
                if (var11 != null) {
                    var5[var4++] = var11;
                }
            }
        }
        class102 var7 = new class102(var5, var4);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1914[var8] != 0) {
                var7.method704(class41.field930[var8][0], class41.field930[var8][this.field1914[var8]]);
                if (var8 == 1) {
                    var7.method704(class13.field237[0], class13.field237[this.field1914[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 506)
    private final void method563(int arg0) {
        long var2 = this.field1884;
        field1911++;
        int var4 = this.field1905[5];
        int var5 = this.field1905[9];
        this.field1905[5] = var5;
        this.field1905[9] = var4;
        this.field1884 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1884 <<= 0x4;
            if (this.field1905[var6] >= 256) {
                this.field1884 += this.field1905[var6] - 256;
            }
        }
        if (this.field1905[0] >= 256) {
            this.field1884 += this.field1905[0] - 256 >> 4;
        }
        if (this.field1905[1] >= 256) {
            this.field1884 += this.field1905[1] - 256 >> 8;
        }
        if (arg0 != -14408) {
            field1899 = null;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1884 <<= 0x3;
            this.field1884 += this.field1914[var7];
        }
        this.field1884 <<= 0x1;
        this.field1884 += this.field1912 ? 1 : 0;
        this.field1905[5] = var4;
        this.field1905[9] = var5;
        if (var2 != 0L && this.field1884 != var2) {
            class46.field1072.method341(-31, var2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 565)
    public static final void method564(boolean arg0) {
        field1897++;
        if (class116.field2640 == 61) {
            int var1 = class66.field1578.method821(true);
            int var2 = (var1 >> 4 & 0x7) + class35.field846;
            int var3 = (var1 & 0x7) + class80.field1858;
            int var4 = class66.field1578.method870(-1);
            int var5 = class66.field1578.method821(true);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            if (class62.field1494.field767[0] >= var2 - var6 && class62.field1494.field767[0] <= var2 + var6 && class62.field1494.field730[0] >= var3 - var6 && class62.field1494.field730[0] <= var3 + var6 && class107.field2445 != 0 && var7 > 0 && class50.field1191 < 50) {
                class78.field1804[class50.field1191] = var4;
                class114.field2598[class50.field1191] = var7;
                class118.field2680[class50.field1191] = 0;
                class90.field2039[class50.field1191] = null;
                class50.field1191++;
            }
        }
        if (class116.field2640 == 209) {
            int var8 = class66.field1578.method845(false);
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = class20.field545[var9];
            int var12 = class66.field1578.method821(true);
            int var13 = (var12 & 0x7) + class80.field1858;
            int var14 = class35.field846 + (var12 >> 4 & 0x7);
            if (var14 >= 0 && var13 >= 0 && var14 < 104 && var13 < 104) {
                class95.method637(var11, var14, -1, -1, 0, class121.field2807, var9, (byte) 17, var10, var13);
            }
        } else if (class116.field2640 == 18) {
            int var15 = class66.field1578.method853(true);
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = class20.field545[var16];
            int var19 = class66.field1578.method829(512);
            int var20 = class66.field1578.method845(false);
            int var21 = (var20 & 0x7) + class80.field1858;
            int var22 = (var20 >> 4 & 0x7) + class35.field846;
            if (var22 >= 0 && var21 >= 0 && var22 < 103 && var21 < 103) {
                int var23 = class45.field1058[class121.field2807][var22][var21];
                int var24 = class45.field1058[class121.field2807][var22 + 1][var21 + 1];
                int var25 = class45.field1058[class121.field2807][var22 + 1][var21];
                int var26 = class45.field1058[class121.field2807][var22][var21 + 1];
                if (var18 == 0) {
                    class107 var27 = class58.field1348.method733(class121.field2807, var22, var21);
                    if (var27 != null) {
                        int var28 = var27.field2433 >> 14 & 0x7FFF;
                        if (var16 == 2) {
                            var27.field2439 = new class128(var28, 2, var17 + 4, var23, var25, var24, var26, var19, false);
                            var27.field2444 = new class128(var28, 2, var17 + 1 & 0x3, var23, var25, var24, var26, var19, false);
                        } else {
                            var27.field2439 = new class128(var28, var16, var17, var23, var25, var24, var26, var19, false);
                        }
                    }
                }
                if (var18 == 1) {
                    class4 var29 = class58.field1348.method736(class121.field2807, var22, var21);
                    if (var29 != null) {
                        var29.field64 = new class128(var29.field61 >> 14 & 0x7FFF, 4, 0, var23, var25, var24, var26, var19, false);
                    }
                }
                if (var18 == 2) {
                    if (var16 == 11) {
                        var16 = 10;
                    }
                    class64 var30 = class58.field1348.method766(class121.field2807, var22, var21);
                    if (var30 != null) {
                        var30.field1543 = new class128(var30.field1557 >> 14 & 0x7FFF, var16, var17, var23, var25, var24, var26, var19, false);
                    }
                }
                if (var18 == 3) {
                    class86 var31 = class58.field1348.method725(class121.field2807, var22, var21);
                    if (var31 != null) {
                        var31.field1979 = new class128(var31.field1994 >> 14 & 0x7FFF, 22, var17, var23, var25, var24, var26, var19, false);
                    }
                }
            }
        } else if (class116.field2640 == 100) {
            int var32 = class66.field1578.method821(arg0);
            int var33 = (var32 >> 4 & 0x7) + class35.field846;
            int var34 = (var32 & 0x7) + class80.field1858;
            int var35 = var33 + class66.field1578.method841(true);
            int var36 = class66.field1578.method841(true) + var34;
            int var37 = class66.field1578.method827((byte) -66);
            int var38 = class66.field1578.method870(-1);
            int var39 = class66.field1578.method821(arg0) * 4;
            int var40 = class66.field1578.method821(true) * 4;
            int var41 = class66.field1578.method870(-1);
            int var42 = class66.field1578.method870(-1);
            int var43 = class66.field1578.method821(true);
            int var44 = class66.field1578.method821(arg0);
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var38 != 65535) {
                int var45 = var35 * 128 + 64;
                int var46 = var36 * 128 + 64;
                int var47 = var33 * 128 + 64;
                int var48 = var34 * 128 + 64;
                class56 var49 = new class56(var38, class121.field2807, var47, var48, class47.method340(var47, -6, class121.field2807, var48) - var39, class115.field2614 + var41, class115.field2614 + var42, var43, var44, var37, var40);
                var49.method412(0, class47.method340(var45, -6, class121.field2807, var46) - var40, var46, var45, class115.field2614 + var41);
                class108.field2461.method64(var49, (byte) 79);
            }
        } else if (class116.field2640 == 108) {
            int var50 = class66.field1578.method851(-12543);
            int var51 = class66.field1578.method870(-1);
            int var52 = class66.field1578.method851(-12543);
            int var53 = class66.field1578.method845(false);
            int var54 = (var53 >> 4 & 0x7) + class35.field846;
            int var55 = class80.field1858 + (var53 & 0x7);
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && class101.field2257 != var52) {
                class23 var56 = new class23();
                var56.field598 = var51;
                var56.field593 = var50;
                if (class14.field249[class121.field2807][var54][var55] == null) {
                    class14.field249[class121.field2807][var54][var55] = new class9();
                }
                class14.field249[class121.field2807][var54][var55].method64(var56, (byte) 79);
                class95.method643(var54, var55, false);
            }
        } else if (arg0) {
            if (class116.field2640 == 158) {
                int var57 = class66.field1578.method851(-12543);
                int var58 = class66.field1578.method845(!arg0);
                int var59 = var58 >> 2;
                int var60 = class20.field545[var59];
                int var61 = class66.field1578.method821(arg0);
                int var62 = var58 & 0x3;
                int var63 = (var61 >> 4 & 0x7) + class35.field846;
                int var64 = class80.field1858 + (var61 & 0x7);
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class95.method637(var60, var63, -1, var57, 0, class121.field2807, var59, (byte) 17, var62, var64);
                }
            } else if (class116.field2640 == 238) {
                int var65 = class66.field1578.method821(true);
                int var66 = (var65 & 0x7) + class80.field1858;
                int var67 = (var65 >> 4 & 0x7) + class35.field846;
                int var68 = class66.field1578.method870(-1);
                int var69 = class66.field1578.method821(true);
                int var70 = class66.field1578.method870(-1);
                if (var67 >= 0 && var66 >= 0 && var67 < 104 && var66 < 104) {
                    int var71 = var66 * 128 + 64;
                    int var72 = var67 * 128 + 64;
                    class114 var73 = new class114(var68, class121.field2807, var72, var71, class47.method340(var72, -6, class121.field2807, var71) - var69, var70, class115.field2614);
                    class15.field297.method64(var73, (byte) 79);
                }
            } else if (class116.field2640 == 92) {
                int var74 = class66.field1578.method829(512);
                int var75 = class66.field1578.method821(true);
                int var76 = (var75 >> 4 & 0x7) + class35.field846;
                int var77 = class80.field1858 + (var75 & 0x7);
                int var78 = class66.field1578.method842((byte) 121);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class23 var79 = new class23();
                    var79.field593 = var74;
                    var79.field598 = var78;
                    if (class14.field249[class121.field2807][var76][var77] == null) {
                        class14.field249[class121.field2807][var76][var77] = new class9();
                    }
                    class14.field249[class121.field2807][var76][var77].method64(var79, (byte) 79);
                    class95.method643(var76, var77, false);
                }
            } else {
                if (class116.field2640 == 136) {
                    int var80 = class66.field1578.method821(true);
                    int var81 = (var80 & 0x7) + class80.field1858;
                    int var82 = (var80 >> 4 & 0x7) + class35.field846;
                    int var83 = class66.field1578.method829(512);
                    byte var84 = class66.field1578.method843(true);
                    int var85 = class66.field1578.method829(512);
                    byte var86 = class66.field1578.method852(0);
                    int var87 = class66.field1578.method829(512);
                    int var88 = class66.field1578.method842((byte) 118);
                    byte var89 = class66.field1578.method843(true);
                    int var90 = class66.field1578.method821(true);
                    int var91 = var90 >> 2;
                    int var92 = class20.field545[var91];
                    byte var93 = class66.field1578.method843(true);
                    class77 var94;
                    if (class101.field2257 == var83) {
                        var94 = class62.field1494;
                    } else {
                        var94 = class127.field2895[var83];
                    }
                    int var95 = var90 & 0x3;
                    if (var94 != null) {
                        class59 var96 = class20.method179(6, var85);
                        int var97 = class45.field1058[class121.field2807][var82][var81];
                        int var98 = class45.field1058[class121.field2807][var82 + 1][var81];
                        int var99 = class45.field1058[class121.field2807][var82][var81 + 1];
                        int var100 = class45.field1058[class121.field2807][var82 + 1][var81 + 1];
                        class102 var101 = var96.method433(-73, var97, var99, var95, var91, var98, var100);
                        if (var101 != null) {
                            class95.method637(var92, var82, var88 + 1, -1, var87 + 1, class121.field2807, 0, (byte) 17, 0, var81);
                            int var102 = var96.field1371;
                            if (var89 > var93) {
                                byte var103 = var89;
                                var89 = var93;
                                var93 = var103;
                            }
                            int var104 = var96.field1387;
                            var94.field1774 = class115.field2614 + var88;
                            if (var95 == 1 || var95 == 3) {
                                var104 = var96.field1371;
                                var102 = var96.field1387;
                            }
                            var94.field1760 = var81 * 128 + var104 * 64;
                            var94.field1767 = var82 * 128 + var102 * 64;
                            var94.field1778 = var101;
                            if (var84 < var86) {
                                byte var105 = var86;
                                var86 = var84;
                                var84 = var105;
                            }
                            var94.field1761 = var87 + class115.field2614;
                            var94.field1779 = class47.method340(var94.field1767, -6, class121.field2807, var94.field1760);
                            var94.field1755 = var81 + var84;
                            var94.field1757 = var81 + var86;
                            var94.field1773 = var82 + var89;
                            var94.field1765 = var82 + var93;
                        }
                    }
                }
                if (class116.field2640 == 249) {
                    int var106 = class66.field1578.method821(true);
                    int var107 = (var106 & 0x7) + class80.field1858;
                    int var108 = (var106 >> 4 & 0x7) + class35.field846;
                    int var109 = class66.field1578.method870(-1);
                    int var110 = class66.field1578.method870(-1);
                    int var111 = class66.field1578.method870(-1);
                    if (var108 >= 0 && var107 >= 0 && var108 < 104 && var107 < 104) {
                        class9 var112 = class14.field249[class121.field2807][var108][var107];
                        if (var112 != null) {
                            for (class23 var113 = (class23) var112.method57((byte) 86); var113 != null; var113 = (class23) var112.method66(-29860)) {
                                if ((var109 & 0x7FFF) == var113.field598 && var113.field593 == var110) {
                                    var113.field593 = var111;
                                    break;
                                }
                            }
                            class95.method643(var108, var107, false);
                        }
                    }
                } else if (class116.field2640 == 184) {
                    int var114 = class66.field1578.method821(true);
                    int var115 = (var114 >> 4 & 0x7) + class35.field846;
                    int var116 = (var114 & 0x7) + class80.field1858;
                    int var117 = class66.field1578.method851(-12543);
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        class9 var118 = class14.field249[class121.field2807][var115][var116];
                        if (var118 != null) {
                            for (class23 var119 = (class23) var118.method57((byte) 86); var119 != null; var119 = (class23) var118.method66(-29860)) {
                                if ((var117 & 0x7FFF) == var119.field598) {
                                    var119.method187((byte) 39);
                                    break;
                                }
                            }
                            if (var118.method57((byte) 86) == null) {
                                class14.field249[class121.field2807][var115][var116] = null;
                            }
                            class95.method643(var115, var116, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V", line = 1095)
    public final void method565(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field1909 = -30;
        }
        field1916++;
        if (this.field1912 != arg1) {
            this.method570(this.field1914, -1, arg1, arg0 ^ 0x3402, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIZ)V", line = 1111)
    public final void method566(boolean arg0, int arg1, boolean arg2) {
        field1908++;
        if (arg1 == 1 && this.field1912) {
            return;
        }
        int var4 = this.field1905[class5.field80[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class54 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class63.field1535) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class63.field1535 - 1;
                }
            }
            var5 = class127.method991(853, var4);
        } while (var5 == null || var5.field1261 || (this.field1912 ? 7 : 0) + arg1 != var5.field1241);
        if (!arg0) {
            this.field1905[class5.field80[arg1]] = var4 + 256;
            this.method563(-14408);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 1163)
    public static void method567(byte arg0) {
        field1893 = null;
        field1894 = null;
        field1896 = null;
        field1917 = null;
        field1892 = null;
        field1895 = null;
        field1903 = null;
        if (arg0 != -13) {
            field1895 = null;
        }
        field1907 = null;
        field1899 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILtc;)V", line = 1181)
    public final void method568(int arg0, class113 arg1) {
        field1902++;
        arg1.method836(0, this.field1912 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1905[class5.field80[var3]];
            if (var5 == 0) {
                arg1.method836(arg0, -1);
            } else {
                arg1.method836(arg0, var5 - 256);
            }
        }
        if (arg0 == 0) {
            for (int var4 = 0; var4 < 5; var4++) {
                arg1.method836(arg0, this.field1914[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I", line = 1216)
    public final int method569(byte arg0) {
        int var2 = 41 % ((arg0 - 78) / 45);
        field1900++;
        return this.field1906 == -1 ? (this.field1905[11] << 5) + (this.field1914[0] << 25) + (this.field1914[4] << 20) + (this.field1905[8] << 10) + (this.field1905[0] << 15) + this.field1905[1] : class63.method456((byte) -116, this.field1906).field334 + 305419896;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIZI[I)V", line = 1250)
    public final void method570(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class63.field1535; var7++) {
                    class54 var8 = class127.method991(853, var7);
                    if (var8 != null && !var8.field1261 && (arg2 ? 7 : 0) + var6 == var8.field1241) {
                        arg4[class5.field80[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg3 != 13314) {
            method567((byte) -114);
        }
        field1885++;
        this.field1914 = arg0;
        this.field1912 = arg2;
        this.field1905 = arg4;
        this.field1906 = arg1;
        this.method563(-14408);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBILhe;)Lm;", line = 1296)
    public static final class72 method571(int arg0, byte arg1, int arg2, class47 arg3) {
        field1889++;
        if (arg1 < 116) {
            return null;
        } else if (class5.method36(arg2, 29066, arg3, arg0)) {
            return class25.method198(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V", line = 1312)
    public static final void method572(int arg0) {
        if (class105.field2404.toLowerCase().indexOf("microsoft") == -1) {
            class1.field4[44] = 71;
            class1.field4[45] = 26;
            class1.field4[46] = 72;
            class1.field4[47] = 73;
            class1.field4[59] = 57;
            class1.field4[61] = 27;
            class1.field4[91] = 42;
            class1.field4[92] = 74;
            class1.field4[93] = 43;
            if (class105.field2420 == null) {
                class1.field4[192] = 58;
                class1.field4[222] = 59;
            } else {
                class1.field4[192] = 28;
                class1.field4[222] = 58;
                class1.field4[520] = 59;
            }
        } else {
            class1.field4[186] = 57;
            class1.field4[187] = 27;
            class1.field4[188] = 71;
            class1.field4[189] = 26;
            class1.field4[190] = 72;
            class1.field4[191] = 73;
            class1.field4[192] = 58;
            class1.field4[219] = 42;
            class1.field4[220] = 74;
            class1.field4[221] = 43;
            class1.field4[222] = 59;
            class1.field4[223] = 28;
        }
        field1890++;
        if (arg0 != 8518) {
            field1894 = null;
        }
    }
}
