package deob;

import java.util.Random;

@ObfuscatedName("dt")
public class class122 {

    @ObfuscatedName("dt.e")
    public class111 field1735;

    @ObfuscatedName("dt.o")
    public class111 field1725;

    @ObfuscatedName("dt.m")
    public class111 field1726;

    @ObfuscatedName("dt.g")
    public class111 field1727;

    @ObfuscatedName("dt.d")
    public class111 field1728;

    @ObfuscatedName("dt.b")
    public class111 field1746;

    @ObfuscatedName("dt.k")
    public class111 field1745;

    @ObfuscatedName("dt.f")
    public class111 field1724;

    @ObfuscatedName("dt.j")
    public int[] field1732 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dt.q")
    public int[] field1729 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dt.h")
    public int[] field1734 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dt.i")
    public int field1740 = 0;

    @ObfuscatedName("dt.s")
    public int field1748 = 100;

    @ObfuscatedName("dt.n")
    public class119 field1737;

    @ObfuscatedName("dt.c")
    public class111 field1738;

    @ObfuscatedName("dt.v")
    public int field1739 = 500;

    @ObfuscatedName("dt.u")
    public int field1736 = 0;

    @ObfuscatedName("dt.w")
    public static int[] field1741;

    @ObfuscatedName("dt.z")
    public static int[] field1731 = new int[32768];

    @ObfuscatedName("dt.y")
    public static int[] field1743;

    @ObfuscatedName("dt.l")
    public static int[] field1730;

    @ObfuscatedName("dt.x")
    public static int[] field1742;

    @ObfuscatedName("dt.r")
    public static int[] field1747;

    @ObfuscatedName("dt.t")
    public static int[] field1733;

    @ObfuscatedName("dt.a")
    public static int[] field1749;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1731[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1743 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1743[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1741 = new int[220500];
        field1730 = new int[5];
        field1742 = new int[5];
        field1747 = new int[5];
        field1733 = new int[5];
        field1749 = new int[5];
    }

    @ObfuscatedName("dt.e(II)[I")
    public final int[] method2099(int arg0, int arg1) {
        class184.method3192(field1741, 0, arg0);
        if (arg1 < 10) {
            return field1741;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1735.method1886();
        this.field1725.method1886();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1726 != null) {
            this.field1726.method1886();
            this.field1727.method1886();
            var5 = (int) ((double) (this.field1726.field1660 - this.field1726.field1653) * 32.768D / var3);
            var6 = (int) ((double) this.field1726.field1653 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1728 != null) {
            this.field1728.method1886();
            this.field1746.method1886();
            var8 = (int) ((double) (this.field1728.field1660 - this.field1728.field1653) * 32.768D / var3);
            var9 = (int) ((double) this.field1728.field1653 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1732[var11] != 0) {
                field1730[var11] = 0;
                field1742[var11] = (int) ((double) this.field1734[var11] * var3);
                field1747[var11] = (this.field1732[var11] << 14) / 100;
                field1733[var11] = (int) ((double) (this.field1735.field1660 - this.field1735.field1653) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1729[var11]) / var3);
                field1749[var11] = (int) ((double) this.field1735.field1653 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1735.method1883(arg0);
            int var14 = this.field1725.method1883(arg0);
            if (this.field1726 != null) {
                int var15 = this.field1726.method1883(arg0);
                int var16 = this.field1727.method1883(arg0);
                var13 += this.method2105(var7, var16, this.field1726.field1650) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1728 != null) {
                int var17 = this.field1728.method1883(arg0);
                int var18 = this.field1746.method1883(arg0);
                var14 = var14 * ((this.method2105(var10, var18, this.field1728.field1650) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1732[var19] != 0) {
                    int var20 = field1742[var19] + var12;
                    if (var20 < arg0) {
                        field1741[var20] += this.method2105(field1730[var19], field1747[var19] * var14 >> 15, this.field1735.field1650);
                        field1730[var19] += (field1733[var19] * var13 >> 16) + field1749[var19];
                    }
                }
            }
        }
        if (this.field1745 != null) {
            this.field1745.method1886();
            this.field1724.method1886();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1745.method1883(arg0);
                int var26 = this.field1724.method1883(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1745.field1660 - this.field1745.field1653) * var25 >> 8) + this.field1745.field1653;
                } else {
                    var27 = ((this.field1745.field1660 - this.field1745.field1653) * var26 >> 8) + this.field1745.field1653;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1741[var24] = 0;
                }
            }
        }
        if (this.field1740 > 0 && this.field1748 > 0) {
            int var28 = (int) ((double) this.field1740 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1741[var29] += field1741[var29 - var28] * this.field1748 / 100;
            }
        }
        if (this.field1737.field1709[0] > 0 || this.field1737.field1709[1] > 0) {
            this.field1738.method1886();
            int var30 = this.field1738.method1883(arg0 + 1);
            int var31 = this.field1737.method2080(0, (float) var30 / 65536.0F);
            int var32 = this.field1737.method2080(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1741[var31 + var33] * (long) Statics.field1712 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1741[var31 + var33 - 1 - var36] * (long) class119.field1707[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1741[var33 - 1 - var37] * (long) class119.field1707[1][var37] >> 16);
                    }
                    field1741[var33] = var35;
                    var30 = this.field1738.method1883(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1741[var31 + var33] * (long) Statics.field1712 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1741[var31 + var33 - 1 - var40] * (long) class119.field1707[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1741[var33 - 1 - var41] * (long) class119.field1707[1][var41] >> 16);
                        }
                        field1741[var33] = var39;
                        var30 = this.field1738.method1883(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1741[var31 + var33 - 1 - var43] * (long) class119.field1707[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1741[var33 - 1 - var44] * (long) class119.field1707[1][var44] >> 16);
                            }
                            field1741[var33] = var42;
                            this.field1738.method1883(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1737.method2080(0, (float) var30 / 65536.0F);
                    var32 = this.field1737.method2080(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1741[var46] < -32768) {
                field1741[var46] = -32768;
            }
            if (field1741[var46] > 32767) {
                field1741[var46] = 32767;
            }
        }
        return field1741;
    }

    @ObfuscatedName("dt.o(III)I")
    public final int method2105(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1743[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1731[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dt.m(Lfw;)V")
    public final void method2098(class174 arg0) {
        this.field1735 = new class111();
        this.field1735.method1893(arg0);
        this.field1725 = new class111();
        this.field1725.method1893(arg0);
        int var2 = arg0.method2891();
        if (var2 != 0) {
            arg0.field2370--;
            this.field1726 = new class111();
            this.field1726.method1893(arg0);
            this.field1727 = new class111();
            this.field1727.method1893(arg0);
        }
        int var3 = arg0.method2891();
        if (var3 != 0) {
            arg0.field2370--;
            this.field1728 = new class111();
            this.field1728.method1893(arg0);
            this.field1746 = new class111();
            this.field1746.method1893(arg0);
        }
        int var4 = arg0.method2891();
        if (var4 != 0) {
            arg0.field2370--;
            this.field1745 = new class111();
            this.field1745.method1893(arg0);
            this.field1724 = new class111();
            this.field1724.method1893(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2904();
            if (var6 == 0) {
                break;
            }
            this.field1732[var5] = var6;
            this.field1729[var5] = arg0.method2903();
            this.field1734[var5] = arg0.method2904();
        }
        this.field1740 = arg0.method2904();
        this.field1748 = arg0.method2904();
        this.field1739 = arg0.method2930();
        this.field1736 = arg0.method2930();
        this.field1737 = new class119();
        this.field1738 = new class111();
        this.field1737.method2081(arg0, this.field1738);
    }
}
