package deob;

import java.util.Random;

@ObfuscatedName("dq")
public class class122 {

    @ObfuscatedName("dq.w")
    public class111 field1732;

    @ObfuscatedName("dq.o")
    public class111 field1737;

    @ObfuscatedName("dq.x")
    public class111 field1730;

    @ObfuscatedName("dq.k")
    public class111 field1733;

    @ObfuscatedName("dq.f")
    public class111 field1741;

    @ObfuscatedName("dq.i")
    public class111 field1745;

    @ObfuscatedName("dq.j")
    public class111 field1734;

    @ObfuscatedName("dq.m")
    public class111 field1735;

    @ObfuscatedName("dq.u")
    public int[] field1736 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.r")
    public int[] field1742 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.v")
    public int[] field1738 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dq.h")
    public int field1739 = 0;

    @ObfuscatedName("dq.a")
    public int field1740 = 100;

    @ObfuscatedName("dq.p")
    public class119 field1743;

    @ObfuscatedName("dq.q")
    public class111 field1731;

    @ObfuscatedName("dq.l")
    public int field1728 = 500;

    @ObfuscatedName("dq.c")
    public int field1744 = 0;

    @ObfuscatedName("dq.n")
    public static int[] field1729;

    @ObfuscatedName("dq.z")
    public static int[] field1746 = new int[32768];

    @ObfuscatedName("dq.e")
    public static int[] field1747;

    @ObfuscatedName("dq.d")
    public static int[] field1749;

    @ObfuscatedName("dq.y")
    public static int[] field1750;

    @ObfuscatedName("dq.t")
    public static int[] field1751;

    @ObfuscatedName("dq.b")
    public static int[] field1752;

    @ObfuscatedName("dq.s")
    public static int[] field1753;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1746[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1747 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1747[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1729 = new int[220500];
        field1749 = new int[5];
        field1750 = new int[5];
        field1751 = new int[5];
        field1752 = new int[5];
        field1753 = new int[5];
    }

    @ObfuscatedName("dq.w(II)[I")
    public final int[] method2079(int arg0, int arg1) {
        class187.method3170(field1729, 0, arg0);
        if (arg1 < 10) {
            return field1729;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1732.method1858();
        this.field1737.method1858();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1730 != null) {
            this.field1730.method1858();
            this.field1733.method1858();
            var5 = (int) ((double) (this.field1730.field1658 - this.field1730.field1661) * 32.768D / var3);
            var6 = (int) ((double) this.field1730.field1661 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1741 != null) {
            this.field1741.method1858();
            this.field1745.method1858();
            var8 = (int) ((double) (this.field1741.field1658 - this.field1741.field1661) * 32.768D / var3);
            var9 = (int) ((double) this.field1741.field1661 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1736[var11] != 0) {
                field1749[var11] = 0;
                field1750[var11] = (int) ((double) this.field1738[var11] * var3);
                field1751[var11] = (this.field1736[var11] << 14) / 100;
                field1752[var11] = (int) ((double) (this.field1732.field1658 - this.field1732.field1661) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1742[var11]) / var3);
                field1753[var11] = (int) ((double) this.field1732.field1661 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1732.method1855(arg0);
            int var14 = this.field1737.method1855(arg0);
            if (this.field1730 != null) {
                int var15 = this.field1730.method1855(arg0);
                int var16 = this.field1733.method1855(arg0);
                var13 += this.method2084(var7, var16, this.field1730.field1657) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1741 != null) {
                int var17 = this.field1741.method1855(arg0);
                int var18 = this.field1745.method1855(arg0);
                var14 = var14 * ((this.method2084(var10, var18, this.field1741.field1657) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1736[var19] != 0) {
                    int var20 = field1750[var19] + var12;
                    if (var20 < arg0) {
                        field1729[var20] += this.method2084(field1749[var19], field1751[var19] * var14 >> 15, this.field1732.field1657);
                        field1749[var19] += (field1752[var19] * var13 >> 16) + field1753[var19];
                    }
                }
            }
        }
        if (this.field1734 != null) {
            this.field1734.method1858();
            this.field1735.method1858();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1734.method1855(arg0);
                int var26 = this.field1735.method1855(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1734.field1658 - this.field1734.field1661) * var25 >> 8) + this.field1734.field1661;
                } else {
                    var27 = ((this.field1734.field1658 - this.field1734.field1661) * var26 >> 8) + this.field1734.field1661;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1729[var24] = 0;
                }
            }
        }
        if (this.field1739 > 0 && this.field1740 > 0) {
            int var28 = (int) ((double) this.field1739 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1729[var29] += field1729[var29 - var28] * this.field1740 / 100;
            }
        }
        if (this.field1743.field1710[0] > 0 || this.field1743.field1710[1] > 0) {
            this.field1731.method1858();
            int var30 = this.field1731.method1855(arg0 + 1);
            int var31 = this.field1743.method2056(0, (float) var30 / 65536.0F);
            int var32 = this.field1743.method2056(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1729[var31 + var33] * (long) Statics.field1716 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1729[var31 + var33 - 1 - var36] * (long) class119.field1714[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1729[var33 - 1 - var37] * (long) class119.field1714[1][var37] >> 16);
                    }
                    field1729[var33] = var35;
                    var30 = this.field1731.method1855(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1729[var31 + var33] * (long) Statics.field1716 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1729[var31 + var33 - 1 - var40] * (long) class119.field1714[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1729[var33 - 1 - var41] * (long) class119.field1714[1][var41] >> 16);
                        }
                        field1729[var33] = var39;
                        var30 = this.field1731.method1855(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1729[var31 + var33 - 1 - var43] * (long) class119.field1714[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1729[var33 - 1 - var44] * (long) class119.field1714[1][var44] >> 16);
                            }
                            field1729[var33] = var42;
                            this.field1731.method1855(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1743.method2056(0, (float) var30 / 65536.0F);
                    var32 = this.field1743.method2056(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1729[var46] < -32768) {
                field1729[var46] = -32768;
            }
            if (field1729[var46] > 32767) {
                field1729[var46] = 32767;
            }
        }
        return field1729;
    }

    @ObfuscatedName("dq.o(III)I")
    public final int method2084(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1747[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1746[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dq.x(Lfi;)V")
    public final void method2077(class177 arg0) {
        this.field1732 = new class111();
        this.field1732.method1852(arg0);
        this.field1737 = new class111();
        this.field1737.method1852(arg0);
        int var2 = arg0.method2931();
        if (var2 != 0) {
            arg0.field2412--;
            this.field1730 = new class111();
            this.field1730.method1852(arg0);
            this.field1733 = new class111();
            this.field1733.method1852(arg0);
        }
        int var3 = arg0.method2931();
        if (var3 != 0) {
            arg0.field2412--;
            this.field1741 = new class111();
            this.field1741.method1852(arg0);
            this.field1745 = new class111();
            this.field1745.method1852(arg0);
        }
        int var4 = arg0.method2931();
        if (var4 != 0) {
            arg0.field2412--;
            this.field1734 = new class111();
            this.field1734.method1852(arg0);
            this.field1735 = new class111();
            this.field1735.method1852(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3003();
            if (var6 == 0) {
                break;
            }
            this.field1736[var5] = var6;
            this.field1742[var5] = arg0.method2896();
            this.field1738[var5] = arg0.method3003();
        }
        this.field1739 = arg0.method3003();
        this.field1740 = arg0.method3003();
        this.field1728 = arg0.method2886();
        this.field1744 = arg0.method2886();
        this.field1743 = new class119();
        this.field1731 = new class111();
        this.field1743.method2057(arg0, this.field1731);
    }
}
