package deob;

import java.util.Random;

@ObfuscatedName("dq")
public class class122 {

    @ObfuscatedName("dq.c")
    public class111 field1693;

    @ObfuscatedName("dq.o")
    public class111 field1690;

    @ObfuscatedName("dq.i")
    public class111 field1714;

    @ObfuscatedName("dq.u")
    public class111 field1691;

    @ObfuscatedName("dq.g")
    public class111 field1689;

    @ObfuscatedName("dq.m")
    public class111 field1694;

    @ObfuscatedName("dq.s")
    public class111 field1695;

    @ObfuscatedName("dq.x")
    public class111 field1696;

    @ObfuscatedName("dq.p")
    public int[] field1697 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.k")
    public int[] field1703 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.r")
    public int[] field1699 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.w")
    public int field1700 = 0;

    @ObfuscatedName("dq.v")
    public int field1698 = 100;

    @ObfuscatedName("dq.h")
    public class119 field1701;

    @ObfuscatedName("dq.t")
    public class111 field1704;

    @ObfuscatedName("dq.a")
    public int field1692 = 500;

    @ObfuscatedName("dq.e")
    public int field1705 = 0;

    @ObfuscatedName("dq.y")
    public static int[] field1706;

    @ObfuscatedName("dq.l")
    public static int[] field1707 = new int[32768];

    @ObfuscatedName("dq.q")
    public static int[] field1708;

    @ObfuscatedName("dq.j")
    public static int[] field1710;

    @ObfuscatedName("dq.n")
    public static int[] field1711;

    @ObfuscatedName("dq.z")
    public static int[] field1702;

    @ObfuscatedName("dq.b")
    public static int[] field1713;

    @ObfuscatedName("dq.d")
    public static int[] field1709;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1707[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1708 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1708[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1706 = new int[220500];
        field1710 = new int[5];
        field1711 = new int[5];
        field1702 = new int[5];
        field1713 = new int[5];
        field1709 = new int[5];
    }

    @ObfuscatedName("dq.c(II)[I")
    public final int[] method2054(int arg0, int arg1) {
        class184.method3150(field1706, 0, arg0);
        if (arg1 < 10) {
            return field1706;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1693.method1849();
        this.field1690.method1849();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1714 != null) {
            this.field1714.method1849();
            this.field1691.method1849();
            var5 = (int) ((double) (this.field1714.field1618 - this.field1714.field1622) * 32.768D / var3);
            var6 = (int) ((double) this.field1714.field1622 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1689 != null) {
            this.field1689.method1849();
            this.field1694.method1849();
            var8 = (int) ((double) (this.field1689.field1618 - this.field1689.field1622) * 32.768D / var3);
            var9 = (int) ((double) this.field1689.field1622 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1697[var11] != 0) {
                field1710[var11] = 0;
                field1711[var11] = (int) ((double) this.field1699[var11] * var3);
                field1702[var11] = (this.field1697[var11] << 14) / 100;
                field1713[var11] = (int) ((double) (this.field1693.field1618 - this.field1693.field1622) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1703[var11]) / var3);
                field1709[var11] = (int) ((double) this.field1693.field1622 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1693.method1841(arg0);
            int var14 = this.field1690.method1841(arg0);
            if (this.field1714 != null) {
                int var15 = this.field1714.method1841(arg0);
                int var16 = this.field1691.method1841(arg0);
                var13 += this.method2058(var7, var16, this.field1714.field1619) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1689 != null) {
                int var17 = this.field1689.method1841(arg0);
                int var18 = this.field1694.method1841(arg0);
                var14 = var14 * ((this.method2058(var10, var18, this.field1689.field1619) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1697[var19] != 0) {
                    int var20 = field1711[var19] + var12;
                    if (var20 < arg0) {
                        field1706[var20] += this.method2058(field1710[var19], field1702[var19] * var14 >> 15, this.field1693.field1619);
                        field1710[var19] += (field1713[var19] * var13 >> 16) + field1709[var19];
                    }
                }
            }
        }
        if (this.field1695 != null) {
            this.field1695.method1849();
            this.field1696.method1849();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1695.method1841(arg0);
                int var26 = this.field1696.method1841(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1695.field1618 - this.field1695.field1622) * var25 >> 8) + this.field1695.field1622;
                } else {
                    var27 = ((this.field1695.field1618 - this.field1695.field1622) * var26 >> 8) + this.field1695.field1622;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1706[var24] = 0;
                }
            }
        }
        if (this.field1700 > 0 && this.field1698 > 0) {
            int var28 = (int) ((double) this.field1700 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1706[var29] += field1706[var29 - var28] * this.field1698 / 100;
            }
        }
        if (this.field1701.field1672[0] > 0 || this.field1701.field1672[1] > 0) {
            this.field1704.method1849();
            int var30 = this.field1704.method1841(arg0 + 1);
            int var31 = this.field1701.method2036(0, (float) var30 / 65536.0F);
            int var32 = this.field1701.method2036(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1706[var31 + var33] * (long) Statics.field1679 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1706[var31 + var33 - 1 - var36] * (long) class119.field1675[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1706[var33 - 1 - var37] * (long) class119.field1675[1][var37] >> 16);
                    }
                    field1706[var33] = var35;
                    var30 = this.field1704.method1841(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1706[var31 + var33] * (long) Statics.field1679 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1706[var31 + var33 - 1 - var40] * (long) class119.field1675[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1706[var33 - 1 - var41] * (long) class119.field1675[1][var41] >> 16);
                        }
                        field1706[var33] = var39;
                        var30 = this.field1704.method1841(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1706[var31 + var33 - 1 - var43] * (long) class119.field1675[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1706[var33 - 1 - var44] * (long) class119.field1675[1][var44] >> 16);
                            }
                            field1706[var33] = var42;
                            this.field1704.method1841(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1701.method2036(0, (float) var30 / 65536.0F);
                    var32 = this.field1701.method2036(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1706[var46] < -32768) {
                field1706[var46] = -32768;
            }
            if (field1706[var46] > 32767) {
                field1706[var46] = 32767;
            }
        }
        return field1706;
    }

    @ObfuscatedName("dq.o(III)I")
    public final int method2058(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1708[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1707[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.i(Lfp;)V")
    public final void method2056(class174 arg0) {
        this.field1693 = new class111();
        this.field1693.method1843(arg0);
        this.field1690 = new class111();
        this.field1690.method1843(arg0);
        int var2 = arg0.method2843();
        if (var2 != 0) {
            arg0.field2357--;
            this.field1714 = new class111();
            this.field1714.method1843(arg0);
            this.field1691 = new class111();
            this.field1691.method1843(arg0);
        }
        int var3 = arg0.method2843();
        if (var3 != 0) {
            arg0.field2357--;
            this.field1689 = new class111();
            this.field1689.method1843(arg0);
            this.field1694 = new class111();
            this.field1694.method1843(arg0);
        }
        int var4 = arg0.method2843();
        if (var4 != 0) {
            arg0.field2357--;
            this.field1695 = new class111();
            this.field1695.method1843(arg0);
            this.field1696 = new class111();
            this.field1696.method1843(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3016();
            if (var6 == 0) {
                break;
            }
            this.field1697[var5] = var6;
            this.field1703[var5] = arg0.method2871();
            this.field1699[var5] = arg0.method3016();
        }
        this.field1700 = arg0.method3016();
        this.field1698 = arg0.method3016();
        this.field1692 = arg0.method2861();
        this.field1705 = arg0.method2861();
        this.field1701 = new class119();
        this.field1704 = new class111();
        this.field1701.method2037(arg0, this.field1704);
    }
}
