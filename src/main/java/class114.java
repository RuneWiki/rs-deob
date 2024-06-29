import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class114 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[F")
    public float[] field1899 = new float[4];

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Z")
    public boolean field1905 = false;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Z")
    public boolean field1898;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Z")
    public boolean field1901;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[S")
    public short[] field1909;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1910 = 3353893;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "[I")
    public static int[] field1923 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "F")
    public float field1908;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "F")
    public float field1917;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lik;")
    public class281 field1918;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Ljava/awt/Font;")
    public static Font field1911;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 6)
    private final void method967(byte arg0) {
        field1921++;
        if (arg0 > -34) {
            method970(-125);
        }
        int var2 = this.field1919;
        if (var2 == 2) {
            this.field1895 = 2048;
            this.field1903 = 2048;
            this.field1897 = 1;
            this.field1916 = 0;
        } else if (var2 == 3) {
            this.field1903 = 2048;
            this.field1897 = 1;
            this.field1895 = 4096;
            this.field1916 = 0;
        } else if (var2 == 4) {
            this.field1916 = 0;
            this.field1895 = 2048;
            this.field1897 = 4;
            this.field1903 = 2048;
        } else if (var2 == 5) {
            this.field1895 = 8192;
            this.field1903 = 2048;
            this.field1897 = 4;
            this.field1916 = 0;
        } else if (var2 == 12) {
            this.field1897 = 2;
            this.field1903 = 2048;
            this.field1895 = 2048;
            this.field1916 = 0;
        } else if (var2 == 13) {
            this.field1895 = 8192;
            this.field1903 = 2048;
            this.field1897 = 2;
            this.field1916 = 0;
        } else if (var2 == 10) {
            this.field1903 = 512;
            this.field1916 = 1536;
            this.field1897 = 3;
            this.field1895 = 2048;
        } else if (var2 == 11) {
            this.field1903 = 512;
            this.field1895 = 4096;
            this.field1897 = 3;
            this.field1916 = 1536;
        } else if (var2 == 6) {
            this.field1895 = 2048;
            this.field1916 = 1280;
            this.field1897 = 3;
            this.field1903 = 768;
        } else if (var2 == 7) {
            this.field1903 = 768;
            this.field1916 = 1280;
            this.field1897 = 3;
            this.field1895 = 4096;
        } else if (var2 == 8) {
            this.field1903 = 1024;
            this.field1895 = 2048;
            this.field1897 = 3;
            this.field1916 = 1024;
        } else if (var2 == 9) {
            this.field1916 = 1024;
            this.field1895 = 4096;
            this.field1897 = 3;
            this.field1903 = 1024;
        } else if (var2 == 14) {
            this.field1897 = 1;
            this.field1903 = 768;
            this.field1895 = 2048;
            this.field1916 = 1280;
        } else if (var2 == 15) {
            this.field1916 = 1536;
            this.field1895 = 4096;
            this.field1903 = 512;
            this.field1897 = 1;
        } else if (var2 == 16) {
            this.field1895 = 8192;
            this.field1903 = 256;
            this.field1897 = 1;
            this.field1916 = 1792;
        } else {
            this.field1903 = 2048;
            this.field1916 = 0;
            this.field1897 = 0;
            this.field1895 = 2048;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 209)
    public final void method968(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1897 = arg1;
        field1900++;
        this.field1916 = arg2;
        this.field1903 = arg3;
        this.field1895 = arg4;
        int var6 = 44 / ((-arg0 - 19) / 52);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 225)
    private final void method969(int arg0) {
        field1896++;
        if (arg0 != -1) {
            method972(-67, 32, 32, -77, 0, -63, -71);
        }
        int var2 = (this.field1913 << 7) + 64;
        this.field1908 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 238)
    public static void method970(int arg0) {
        if (arg0 == 4) {
            field1923 = null;
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 354)
    protected class114() {
        if (class94.field1471 == null) {
            class161.method1285(1985);
        }
        this.method967((byte) -127);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lpi;)V", line = 767)
    public class114(class336 arg0) {
        if (class94.field1471 == null) {
            class161.method1285(1985);
        }
        this.field1914 = arg0.method2364(-9069);
        this.field1898 = (this.field1914 & 0x10) != 0;
        this.field1901 = (this.field1914 & 0x8) != 0;
        this.field1914 &= 0x7;
        this.field1906 = arg0.method2339((byte) -46);
        this.field1920 = arg0.method2339((byte) -46);
        this.field1922 = arg0.method2339((byte) -46);
        this.field1913 = arg0.method2364(-9069);
        this.method969(-1);
        this.field1909 = new short[this.field1913 * 2 + 1];
        for (int var2 = 0; var2 < this.field1909.length; var2++) {
            this.field1909[var2] = (short) arg0.method2339((byte) -46);
        }
        this.field1902 = class62.field955[arg0.method2339((byte) -46)];
        int var3 = arg0.method2364(-9069);
        this.field1919 = var3 & 0x1F;
        this.field1907 = (var3 & 0xE0) << 3;
        if (this.field1919 != 31) {
            this.method967((byte) -87);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ)V", line = 264)
    public final void method971(int arg0, int arg1, boolean arg2) {
        field1904++;
        int var4 = this.field1895 * arg1 / 50 + this.field1907 & 0x7FF;
        int var5 = this.field1897;
        int var6;
        if (var5 == 1) {
            var6 = (class62.field962[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class94.field1471[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0 != -1) {
            field1923 = (int[]) null;
        }
        if (arg2) {
            var6 = 2048;
        }
        this.field1917 = (float) ((this.field1903 * var6 >> 11) + this.field1916) / 2048.0F;
        float var7 = this.field1917 / 255.0F;
        this.field1899[2] = var7 * (float) class36.method319(255, this.field1902);
        this.field1899[1] = var7 * (float) class36.method319(this.field1902 >> 8, 255);
        this.field1899[0] = (float) class36.method319(255, this.field1902 >> 16) * var7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIII)V", line = 369)
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1894++;
        if (class93.field1458 == 0) {
            int var7 = class321.field5096;
            int var8 = class317.field5033;
            int var9 = class298.field4753;
            int var10 = (arg2 - arg3) * (var7 - var8) / arg1 + var8;
            int var11 = class58.field901;
            int var12 = (arg4 - arg5) * (var11 - var9) / arg6 + var9;
            if (class179.field3027 && (class161.field2861 & 0x40) != 0) {
                class137 var13 = class60.method557(class230.field3839, 117, class17.field281);
                if (var13 == null) {
                    class20.method200(-95);
                } else {
                    class86.method770((short) 26, " ->", class50.field784, 61, class292.field4681, 0L, var12, var10);
                }
            } else {
                if (class72.field1199 == 1) {
                    class86.method770((short) 28, "", class104.field1736, 112, -1, 0L, var12, var10);
                }
                class81.field1322++;
                class86.method770((short) 15, "", class79.field1276, 45, -1, 0L, var12, var10);
            }
        }
        long var14 = -1L;
        int var16 = 52 % ((arg0 + 51) / 51);
        for (int var17 = 0; var17 < class213.field3588; var17++) {
            long var18 = class143.field2608[var17];
            int var20 = (int) var18 & 0x7F;
            int var21 = ((int) var18 & 0x3FC9) >> 7;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var23 = (int) var18 >> 29 & 0x3;
            if (var14 != var18) {
                var14 = var18;
                if (var23 == 2 && class156.method1246(class205.field3497, var20, var21, var18)) {
                    class97 var24 = class92.method798((byte) 104, var22);
                    if (var24.field1579 != null) {
                        var24 = var24.method833(false);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class93.field1458 == 1) {
                        class264.field4263++;
                        class86.method770((short) 8, class207.field3516 + " -> <col=00ffff>" + var24.field1566, class198.field3388, 40, class12.field166, var18, var21, var20);
                    } else if (class179.field3027) {
                        class53 var25 = class52.field811 == -1 ? null : class223.method1631(class52.field811, 11);
                        if ((class161.field2861 & 0x4) != 0 && (var25 == null || var24.method831(var25.field832, class52.field811, false) != var25.field832)) {
                            class222.field3712++;
                            class86.method770((short) 39, class28.field386 + " -> <col=00ffff>" + var24.field1566, class50.field784, 38, class292.field4681, var18, var21, var20);
                        }
                    } else {
                        String[] var26 = var24.field1533;
                        class86.field1376++;
                        if (class49.field778) {
                            var26 = class172.method1354(var26, 85);
                        }
                        if (var26 != null) {
                            for (int var27 = 4; var27 >= 0; var27--) {
                                if (var26[var27] != null) {
                                    class139.field2559++;
                                    int var28 = -1;
                                    short var29 = 0;
                                    if (var27 == 0) {
                                        var29 = 31;
                                    }
                                    if (var24.field1526 == var27) {
                                        var28 = var24.field1501;
                                    }
                                    if (var24.field1523 == var27) {
                                        var28 = var24.field1508;
                                    }
                                    if (var27 == 1) {
                                        var29 = 41;
                                    }
                                    if (var27 == 2) {
                                        var29 = 24;
                                    }
                                    if (var27 == 3) {
                                        var29 = 19;
                                    }
                                    if (var27 == 4) {
                                        var29 = 1003;
                                    }
                                    class86.method770(var29, "<col=00ffff>" + var24.field1566, var26[var27], 97, var28, var18, var21, var20);
                                }
                            }
                        }
                        class86.method770((short) 1001, "<col=00ffff>" + var24.field1566, class120.field2077, 62, class44.field703, (long) var24.field1522, var21, var20);
                    }
                }
                if (var23 == 1) {
                    class278 var30 = class320.field5071[var22];
                    if ((var30.field4413.field202 & 0x1) == 0 && (var30.field2036 & 0x7F) == 0 && (var30.field1985 & 0x7F) == 0 || (var30.field4413.field202 & 0x1) == 1 && (var30.field2036 & 0x7F) == 64 && (var30.field1985 & 0x7F) == 64) {
                        int var31 = var30.field2036 - ((var30.field4413.field202 - 1) * 64);
                        int var32 = var30.field1985 + 64 - (var30.field4413.field202 * 64);
                        for (int var33 = 0; var33 < class191.field3200; var33++) {
                            class278 var34 = class320.field5071[class33.field468[var33]];
                            if (var34 != null && !var34.field1954 && var30 != var34 && var34.field1982) {
                                int var35 = var34.field2036 - ((var34.field4413.field202 - 1) * 64);
                                int var36 = var34.field1985 - (var34.field4413.field202 - 1) * 64;
                                if (var31 <= var35 && var34.field4413.field202 <= var30.field4413.field202 - (var35 - var31 >> 7) && var32 <= var36 && var34.field4413.field202 <= var30.field4413.field202 - (var36 - var32 >> 7)) {
                                    class317.method2183((byte) -112, var20, class33.field468[var33], var34.field4413, var21);
                                    var34.field1954 = true;
                                }
                            }
                        }
                        for (int var37 = 0; var37 < class291.field4664; var37++) {
                            class205 var38 = class135.field2359[class119.field2064[var37]];
                            if (var38 != null && !var38.field1954 && var38.field1982) {
                                int var39 = var38.field2036 + 64 - (var38.method987(3047) * 64);
                                int var40 = var38.field1985 - (var38.method987(3047) - 1) * 64;
                                if (var31 <= var39 && var38.method987(3047) <= (var30.field4413.field202 - (var39 - var31 >> 7)) && var40 >= var32 && var38.method987(3047) <= var30.field4413.field202 - (var40 - var32 >> 7)) {
                                    class71.method681(var38, (byte) -6, var21, var20, class119.field2064[var37]);
                                    var38.field1954 = true;
                                }
                            }
                        }
                    }
                    if (var30.field1954) {
                        continue;
                    }
                    class317.method2183((byte) -114, var20, var22, var30.field4413, var21);
                    var30.field1954 = true;
                }
                if (var23 == 0) {
                    class205 var41 = class135.field2359[var22];
                    if ((var41.field2036 & 0x7F) == 64 && (var41.field1985 & 0x7F) == 64) {
                        int var42 = var41.field2036 - ((var41.method987(3047) - 1) * 64);
                        int var43 = var41.field1985 - ((var41.method987(3047) - 1) * 64);
                        for (int var44 = 0; var44 < class191.field3200; var44++) {
                            class278 var45 = class320.field5071[class33.field468[var44]];
                            if (var45 != null && !var45.field1954 && var45.field1982) {
                                int var46 = var45.field2036 + 64 - (var45.field4413.field202 * 64);
                                int var47 = var45.field1985 - ((var45.field4413.field202 - 1) * 64);
                                if (var46 >= var42 && var45.field4413.field202 <= var41.method987(3047) - (var46 - var42 >> 7) && var43 <= var47 && var45.field4413.field202 <= (var41.method987(3047) - (var47 - var43 >> 7))) {
                                    class317.method2183((byte) -108, var20, class33.field468[var44], var45.field4413, var21);
                                    var45.field1954 = true;
                                }
                            }
                        }
                        for (int var48 = 0; var48 < class291.field4664; var48++) {
                            class205 var49 = class135.field2359[class119.field2064[var48]];
                            if (var49 != null && !var49.field1954 && var41 != var49 && var49.field1982) {
                                int var50 = var49.field2036 + 64 - (var49.method987(3047) * 64);
                                int var51 = var49.field1985 + 64 - var49.method987(3047) * 64;
                                if (var50 >= var42 && var49.method987(3047) <= (var41.method987(3047) - (var50 - var42 >> 7)) && var51 >= var43 && var49.method987(3047) <= var41.method987(3047) - (var51 - var43 >> 7)) {
                                    class71.method681(var49, (byte) -6, var21, var20, class119.field2064[var48]);
                                    var49.field1954 = true;
                                }
                            }
                        }
                    }
                    if (var41.field1954) {
                        continue;
                    }
                    class71.method681(var41, (byte) -6, var21, var20, var22);
                    var41.field1954 = true;
                }
                if (var23 == 3) {
                    class331 var52 = class214.field3591[class205.field3497][var20][var21];
                    if (var52 != null) {
                        for (class308 var53 = (class308) var52.method2293(14585); var53 != null; var53 = (class308) var52.method2298((byte) -108)) {
                            int var54 = var53.field4903.field4107;
                            class134 var55 = class5.method31(-1731690365, var54);
                            if (class93.field1458 == 1) {
                                class86.method770((short) 17, class207.field3516 + " -> <col=ff9040>" + var55.field2346, class198.field3388, 42, class12.field166, (long) var54, var21, var20);
                                field1912++;
                            } else if (class179.field3027) {
                                class53 var60 = class52.field811 == -1 ? null : class223.method1631(class52.field811, 11);
                                if ((class161.field2861 & 0x1) != 0 && (var60 == null || var55.method1107(class52.field811, true, var60.field832) != var60.field832)) {
                                    class86.method770((short) 6, class28.field386 + " -> <col=ff9040>" + var55.field2346, class50.field784, 62, class292.field4681, (long) var54, var21, var20);
                                    class84.field1348++;
                                }
                            } else {
                                String[] var56 = var55.field2345;
                                if (class49.field778) {
                                    var56 = class172.method1354(var56, 122);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class277.field4403++;
                                        int var58 = -1;
                                        byte var59 = 0;
                                        if (var55.field2277 == var57) {
                                            var58 = var55.field2335;
                                        }
                                        if (var57 == 0) {
                                            var59 = 32;
                                        }
                                        if (var55.field2315 == var57) {
                                            var58 = var55.field2281;
                                        }
                                        if (var57 == 1) {
                                            var59 = 34;
                                        }
                                        if (var57 == 2) {
                                            var59 = 51;
                                        }
                                        if (var57 == 3) {
                                            var59 = 1;
                                        }
                                        if (var57 == 4) {
                                            var59 = 43;
                                        }
                                        class86.method770(var59, "<col=ff9040>" + var55.field2346, var56[var57], 82, var58, (long) var54, var21, var20);
                                    }
                                }
                                class193.field3236++;
                                class86.method770((short) 1005, "<col=ff9040>" + var55.field2346, class120.field2077, 62, class44.field703, (long) var54, var21, var20);
                            }
                        }
                    }
                }
            }
        }
    }
}
