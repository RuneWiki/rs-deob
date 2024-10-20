package deob;

import java.util.Random;

@ObfuscatedName("dj")
public class class122 {

    @ObfuscatedName("dj.i")
    public class111 field1764;

    @ObfuscatedName("dj.c")
    public class111 field1742;

    @ObfuscatedName("dj.e")
    public class111 field1743;

    @ObfuscatedName("dj.v")
    public class111 field1744;

    @ObfuscatedName("dj.b")
    public class111 field1745;

    @ObfuscatedName("dj.y")
    public class111 field1746;

    @ObfuscatedName("dj.h")
    public class111 field1747;

    @ObfuscatedName("dj.x")
    public class111 field1748;

    @ObfuscatedName("dj.f")
    public int[] field1749 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.n")
    public int[] field1753 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.a")
    public int[] field1760 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dj.o")
    public int field1752 = 0;

    @ObfuscatedName("dj.z")
    public int field1758 = 100;

    @ObfuscatedName("dj.q")
    public class119 field1754;

    @ObfuscatedName("dj.j")
    public class111 field1755;

    @ObfuscatedName("dj.k")
    public int field1759 = 500;

    @ObfuscatedName("dj.r")
    public int field1750 = 0;

    @ObfuscatedName("dj.m")
    public static int[] field1757;

    @ObfuscatedName("dj.d")
    public static int[] field1751 = new int[32768];

    @ObfuscatedName("dj.s")
    public static int[] field1741;

    @ObfuscatedName("dj.w")
    public static int[] field1762;

    @ObfuscatedName("dj.p")
    public static int[] field1763;

    @ObfuscatedName("dj.l")
    public static int[] field1761;

    @ObfuscatedName("dj.u")
    public static int[] field1765;

    @ObfuscatedName("dj.t")
    public static int[] field1766;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1751[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1741 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1741[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1757 = new int[220500];
        field1762 = new int[5];
        field1763 = new int[5];
        field1761 = new int[5];
        field1765 = new int[5];
        field1766 = new int[5];
    }

    @ObfuscatedName("dj.i(II)[I")
    public final int[] method2091(int arg0, int arg1) {
        class184.method3153(field1757, 0, arg0);
        if (arg1 < 10) {
            return field1757;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1764.method1892();
        this.field1742.method1892();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1743 != null) {
            this.field1743.method1892();
            this.field1744.method1892();
            var5 = (int) ((double) (this.field1743.field1668 - this.field1743.field1665) * 32.768D / var3);
            var6 = (int) ((double) this.field1743.field1665 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1745 != null) {
            this.field1745.method1892();
            this.field1746.method1892();
            var8 = (int) ((double) (this.field1745.field1668 - this.field1745.field1665) * 32.768D / var3);
            var9 = (int) ((double) this.field1745.field1665 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1749[var11] != 0) {
                field1762[var11] = 0;
                field1763[var11] = (int) ((double) this.field1760[var11] * var3);
                field1761[var11] = (this.field1749[var11] << 14) / 100;
                field1765[var11] = (int) ((double) (this.field1764.field1668 - this.field1764.field1665) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1753[var11]) / var3);
                field1766[var11] = (int) ((double) this.field1764.field1665 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1764.method1894(arg0);
            int var14 = this.field1742.method1894(arg0);
            if (this.field1743 != null) {
                int var15 = this.field1743.method1894(arg0);
                int var16 = this.field1744.method1894(arg0);
                var13 += this.method2085(var7, var16, this.field1743.field1669) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1745 != null) {
                int var17 = this.field1745.method1894(arg0);
                int var18 = this.field1746.method1894(arg0);
                var14 = var14 * ((this.method2085(var10, var18, this.field1745.field1669) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1749[var19] != 0) {
                    int var20 = field1763[var19] + var12;
                    if (var20 < arg0) {
                        field1757[var20] += this.method2085(field1762[var19], field1761[var19] * var14 >> 15, this.field1764.field1669);
                        field1762[var19] += (field1765[var19] * var13 >> 16) + field1766[var19];
                    }
                }
            }
        }
        if (this.field1747 != null) {
            this.field1747.method1892();
            this.field1748.method1892();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1747.method1894(arg0);
                int var26 = this.field1748.method1894(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1747.field1668 - this.field1747.field1665) * var25 >> 8) + this.field1747.field1665;
                } else {
                    var27 = ((this.field1747.field1668 - this.field1747.field1665) * var26 >> 8) + this.field1747.field1665;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1757[var24] = 0;
                }
            }
        }
        if (this.field1752 > 0 && this.field1758 > 0) {
            int var28 = (int) ((double) this.field1752 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1757[var29] += field1757[var29 - var28] * this.field1758 / 100;
            }
        }
        if (this.field1754.field1728[0] > 0 || this.field1754.field1728[1] > 0) {
            this.field1755.method1892();
            int var30 = this.field1755.method1894(arg0 + 1);
            int var31 = this.field1754.method2071(0, (float) var30 / 65536.0F);
            int var32 = this.field1754.method2071(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1757[var31 + var33] * (long) Statics.field1730 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1757[var31 + var33 - 1 - var36] * (long) class119.field1729[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1757[var33 - 1 - var37] * (long) class119.field1729[1][var37] >> 16);
                    }
                    field1757[var33] = var35;
                    var30 = this.field1755.method1894(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1757[var31 + var33] * (long) Statics.field1730 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1757[var31 + var33 - 1 - var40] * (long) class119.field1729[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1757[var33 - 1 - var41] * (long) class119.field1729[1][var41] >> 16);
                        }
                        field1757[var33] = var39;
                        var30 = this.field1755.method1894(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1757[var31 + var33 - 1 - var43] * (long) class119.field1729[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1757[var33 - 1 - var44] * (long) class119.field1729[1][var44] >> 16);
                            }
                            field1757[var33] = var42;
                            this.field1755.method1894(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1754.method2071(0, (float) var30 / 65536.0F);
                    var32 = this.field1754.method2071(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1757[var46] < -32768) {
                field1757[var46] = -32768;
            }
            if (field1757[var46] > 32767) {
                field1757[var46] = 32767;
            }
        }
        return field1757;
    }

    @ObfuscatedName("dj.c(III)I")
    public final int method2085(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1741[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1751[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dj.e(Lfx;)V")
    public final void method2094(class174 arg0) {
        this.field1764 = new class111();
        this.field1764.method1891(arg0);
        this.field1742 = new class111();
        this.field1742.method1891(arg0);
        int var2 = arg0.method2870();
        if (var2 != 0) {
            arg0.field2407--;
            this.field1743 = new class111();
            this.field1743.method1891(arg0);
            this.field1744 = new class111();
            this.field1744.method1891(arg0);
        }
        int var3 = arg0.method2870();
        if (var3 != 0) {
            arg0.field2407--;
            this.field1745 = new class111();
            this.field1745.method1891(arg0);
            this.field1746 = new class111();
            this.field1746.method1891(arg0);
        }
        int var4 = arg0.method2870();
        if (var4 != 0) {
            arg0.field2407--;
            this.field1747 = new class111();
            this.field1747.method1891(arg0);
            this.field1748 = new class111();
            this.field1748.method1891(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2883();
            if (var6 == 0) {
                break;
            }
            this.field1749[var5] = var6;
            this.field1753[var5] = arg0.method3011();
            this.field1760[var5] = arg0.method2883();
        }
        this.field1752 = arg0.method2883();
        this.field1758 = arg0.method2883();
        this.field1759 = arg0.method2872();
        this.field1750 = arg0.method2872();
        this.field1754 = new class119();
        this.field1755 = new class111();
        this.field1754.method2070(arg0, this.field1755);
    }
}
