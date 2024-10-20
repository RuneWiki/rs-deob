package deob;

import java.util.Random;

@ObfuscatedName("bg")
public class class126 {

    @ObfuscatedName("bg.f")
    public static int[] field1906 = new int[32768];

    @ObfuscatedName("bg.g")
    public int[] field1897 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.d")
    public class120 field1895;

    @ObfuscatedName("bg.e")
    public class120 field1907;

    @ObfuscatedName("bg.b")
    public class120 field1890;

    @ObfuscatedName("bg.c")
    public class120 field1891;

    @ObfuscatedName("bg.a")
    public int field1899 = 0;

    @ObfuscatedName("bg.n")
    public static int[] field1893;

    @ObfuscatedName("bg.o")
    public int field1888 = 0;

    @ObfuscatedName("bg.l")
    public static int[] field1911;

    @ObfuscatedName("bg.m")
    public class120 field1892;

    @ObfuscatedName("bg.j")
    public int[] field1896 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.k")
    public class109 field1901;

    @ObfuscatedName("bg.h")
    public static int[] field1894;

    @ObfuscatedName("bg.i")
    public class120 field1902;

    @ObfuscatedName("bg.w")
    public static int[] field1889;

    @ObfuscatedName("bg.v")
    public class120 field1912;

    @ObfuscatedName("bg.u")
    public int field1900 = 100;

    @ObfuscatedName("bg.s")
    public static int[] field1913;

    @ObfuscatedName("bg.r")
    public static int[] field1910;

    @ObfuscatedName("bg.q")
    public static int[] field1904;

    @ObfuscatedName("bg.p")
    public int field1909 = 500;

    @ObfuscatedName("bg.z")
    public class120 field1903;

    @ObfuscatedName("bg.y")
    public int[] field1898 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.x")
    public class120 field1905;

    @ObfuscatedName("bg.b(Ldv;)V")
    public final void method2177(class28 arg0) {
        this.field1912 = new class120();
        this.field1912.method2121(arg0);
        this.field1891 = new class120();
        this.field1891.method2121(arg0);
        int var2 = arg0.method450();
        if (var2 != 0) {
            arg0.field303--;
            this.field1890 = new class120();
            this.field1890.method2121(arg0);
            this.field1902 = new class120();
            this.field1902.method2121(arg0);
        }
        int var3 = arg0.method450();
        if (var3 != 0) {
            arg0.field303--;
            this.field1892 = new class120();
            this.field1892.method2121(arg0);
            this.field1903 = new class120();
            this.field1903.method2121(arg0);
        }
        int var4 = arg0.method450();
        if (var4 != 0) {
            arg0.field303--;
            this.field1905 = new class120();
            this.field1905.method2121(arg0);
            this.field1895 = new class120();
            this.field1895.method2121(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method325();
            if (var6 == 0) {
                break;
            }
            this.field1896[var5] = var6;
            this.field1897[var5] = arg0.method324();
            this.field1898[var5] = arg0.method325();
        }
        this.field1899 = arg0.method325();
        this.field1900 = arg0.method325();
        this.field1909 = arg0.method349();
        this.field1888 = arg0.method349();
        this.field1901 = new class109();
        this.field1907 = new class120();
        this.field1901.method1910(arg0, this.field1907);
    }

    @ObfuscatedName("bg.c(III)I")
    public final int method2178(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1894[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1906[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1906[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1894 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1894[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1913 = new int[220500];
        field1889 = new int[5];
        field1910 = new int[5];
        field1911 = new int[5];
        field1893 = new int[5];
        field1904 = new int[5];
    }

    @ObfuscatedName("bg.v(II)[I")
    public final int[] method2181(int arg0, int arg1) {
        class37.method713(field1913, 0, arg0);
        if (arg1 < 10) {
            return field1913;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1912.method2120();
        this.field1891.method2120();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1890 != null) {
            this.field1890.method2120();
            this.field1902.method2120();
            var5 = (int) ((double) (this.field1890.field1842 - this.field1890.field1838) * 32.768D / var3);
            var6 = (int) ((double) this.field1890.field1838 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1892 != null) {
            this.field1892.method2120();
            this.field1903.method2120();
            var8 = (int) ((double) (this.field1892.field1842 - this.field1892.field1838) * 32.768D / var3);
            var9 = (int) ((double) this.field1892.field1838 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1896[var11] != 0) {
                field1889[var11] = 0;
                field1910[var11] = (int) ((double) this.field1898[var11] * var3);
                field1911[var11] = (this.field1896[var11] << 14) / 100;
                field1893[var11] = (int) ((double) (this.field1912.field1842 - this.field1912.field1838) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1897[var11]) / var3);
                field1904[var11] = (int) ((double) this.field1912.field1838 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1912.method2123(arg0);
            int var14 = this.field1891.method2123(arg0);
            if (this.field1890 != null) {
                int var15 = this.field1890.method2123(arg0);
                int var16 = this.field1902.method2123(arg0);
                var13 += this.method2178(var7, var16, this.field1890.field1843) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1892 != null) {
                int var17 = this.field1892.method2123(arg0);
                int var18 = this.field1903.method2123(arg0);
                var14 = var14 * ((this.method2178(var10, var18, this.field1892.field1843) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1896[var19] != 0) {
                    int var20 = field1910[var19] + var12;
                    if (var20 < arg0) {
                        field1913[var20] += this.method2178(field1889[var19], field1911[var19] * var14 >> 15, this.field1912.field1843);
                        field1889[var19] += (field1893[var19] * var13 >> 16) + field1904[var19];
                    }
                }
            }
        }
        if (this.field1905 != null) {
            this.field1905.method2120();
            this.field1895.method2120();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1905.method2123(arg0);
                int var26 = this.field1895.method2123(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1905.field1842 - this.field1905.field1838) * var25 >> 8) + this.field1905.field1838;
                } else {
                    var27 = ((this.field1905.field1842 - this.field1905.field1838) * var26 >> 8) + this.field1905.field1838;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1913[var24] = 0;
                }
            }
        }
        if (this.field1899 > 0 && this.field1900 > 0) {
            int var28 = (int) ((double) this.field1899 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1913[var29] += field1913[var29 - var28] * this.field1900 / 100;
            }
        }
        if (this.field1901.field1746[0] > 0 || this.field1901.field1746[1] > 0) {
            this.field1907.method2120();
            int var30 = this.field1907.method2123(arg0 + 1);
            int var31 = this.field1901.method1921(0, (float) var30 / 65536.0F);
            int var32 = this.field1901.method1921(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1913[var31 + var33] * (long) Statics.field1739 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1913[var31 + var33 - 1 - var36] * (long) class109.field1742[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1913[var33 - 1 - var37] * (long) class109.field1742[1][var37] >> 16);
                    }
                    field1913[var33] = var35;
                    var30 = this.field1907.method2123(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1913[var31 + var33] * (long) Statics.field1739 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1913[var31 + var33 - 1 - var40] * (long) class109.field1742[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1913[var33 - 1 - var41] * (long) class109.field1742[1][var41] >> 16);
                        }
                        field1913[var33] = var39;
                        var30 = this.field1907.method2123(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1913[var31 + var33 - 1 - var43] * (long) class109.field1742[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1913[var33 - 1 - var44] * (long) class109.field1742[1][var44] >> 16);
                            }
                            field1913[var33] = var42;
                            this.field1907.method2123(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1901.method1921(0, (float) var30 / 65536.0F);
                    var32 = this.field1901.method1921(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1913[var46] < -32768) {
                field1913[var46] = -32768;
            }
            if (field1913[var46] > 32767) {
                field1913[var46] = 32767;
            }
        }
        return field1913;
    }
}
