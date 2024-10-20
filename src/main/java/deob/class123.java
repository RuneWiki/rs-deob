package deob;

import java.util.Random;

@ObfuscatedName("dd")
public class class123 {

    @ObfuscatedName("dd.j")
    public class112 field1753;

    @ObfuscatedName("dd.h")
    public class112 field1736;

    @ObfuscatedName("dd.f")
    public class112 field1737;

    @ObfuscatedName("dd.p")
    public class112 field1738;

    @ObfuscatedName("dd.x")
    public class112 field1739;

    @ObfuscatedName("dd.g")
    public class112 field1752;

    @ObfuscatedName("dd.c")
    public class112 field1741;

    @ObfuscatedName("dd.l")
    public class112 field1742;

    @ObfuscatedName("dd.w")
    public int[] field1743 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.b")
    public int[] field1740 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.o")
    public int[] field1745 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dd.m")
    public int field1746 = 0;

    @ObfuscatedName("dd.i")
    public int field1747 = 100;

    @ObfuscatedName("dd.s")
    public class120 field1749;

    @ObfuscatedName("dd.r")
    public class112 field1756;

    @ObfuscatedName("dd.e")
    public int field1750 = 500;

    @ObfuscatedName("dd.a")
    public int field1751 = 0;

    @ObfuscatedName("dd.v")
    public static int[] field1744;

    @ObfuscatedName("dd.t")
    public static int[] field1754 = new int[32768];

    @ObfuscatedName("dd.y")
    public static int[] field1757;

    @ObfuscatedName("dd.u")
    public static int[] field1748;

    @ObfuscatedName("dd.k")
    public static int[] field1735;

    @ObfuscatedName("dd.q")
    public static int[] field1758;

    @ObfuscatedName("dd.n")
    public static int[] field1759;

    @ObfuscatedName("dd.d")
    public static int[] field1760;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1754[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1757 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1757[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1744 = new int[220500];
        field1748 = new int[5];
        field1735 = new int[5];
        field1758 = new int[5];
        field1759 = new int[5];
        field1760 = new int[5];
    }

    @ObfuscatedName("dd.j(II)[I")
    public final int[] method2121(int arg0, int arg1) {
        class185.method3187(field1744, 0, arg0);
        if (arg1 < 10) {
            return field1744;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1753.method1909();
        this.field1736.method1909();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1737 != null) {
            this.field1737.method1909();
            this.field1738.method1909();
            var5 = (int) ((double) (this.field1737.field1657 - this.field1737.field1656) * 32.768D / var3);
            var6 = (int) ((double) this.field1737.field1656 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1739 != null) {
            this.field1739.method1909();
            this.field1752.method1909();
            var8 = (int) ((double) (this.field1739.field1657 - this.field1739.field1656) * 32.768D / var3);
            var9 = (int) ((double) this.field1739.field1656 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1743[var11] != 0) {
                field1748[var11] = 0;
                field1735[var11] = (int) ((double) this.field1745[var11] * var3);
                field1758[var11] = (this.field1743[var11] << 14) / 100;
                field1759[var11] = (int) ((double) (this.field1753.field1657 - this.field1753.field1656) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1740[var11]) / var3);
                field1760[var11] = (int) ((double) this.field1753.field1656 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1753.method1910(arg0);
            int var14 = this.field1736.method1910(arg0);
            if (this.field1737 != null) {
                int var15 = this.field1737.method1910(arg0);
                int var16 = this.field1738.method1910(arg0);
                var13 += this.method2125(var7, var16, this.field1737.field1654) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1739 != null) {
                int var17 = this.field1739.method1910(arg0);
                int var18 = this.field1752.method1910(arg0);
                var14 = var14 * ((this.method2125(var10, var18, this.field1739.field1654) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1743[var19] != 0) {
                    int var20 = field1735[var19] + var12;
                    if (var20 < arg0) {
                        field1744[var20] += this.method2125(field1748[var19], field1758[var19] * var14 >> 15, this.field1753.field1654);
                        field1748[var19] += (field1759[var19] * var13 >> 16) + field1760[var19];
                    }
                }
            }
        }
        if (this.field1741 != null) {
            this.field1741.method1909();
            this.field1742.method1909();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1741.method1910(arg0);
                int var26 = this.field1742.method1910(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1741.field1657 - this.field1741.field1656) * var25 >> 8) + this.field1741.field1656;
                } else {
                    var27 = ((this.field1741.field1657 - this.field1741.field1656) * var26 >> 8) + this.field1741.field1656;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1744[var24] = 0;
                }
            }
        }
        if (this.field1746 > 0 && this.field1747 > 0) {
            int var28 = (int) ((double) this.field1746 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1744[var29] += field1744[var29 - var28] * this.field1747 / 100;
            }
        }
        if (this.field1749.field1715[0] > 0 || this.field1749.field1715[1] > 0) {
            this.field1756.method1909();
            int var30 = this.field1756.method1910(arg0 + 1);
            int var31 = this.field1749.method2107(0, (float) var30 / 65536.0F);
            int var32 = this.field1749.method2107(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1744[var31 + var33] * (long) Statics.field1723 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1744[var31 + var33 - 1 - var36] * (long) class120.field1721[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1744[var33 - 1 - var37] * (long) class120.field1721[1][var37] >> 16);
                    }
                    field1744[var33] = var35;
                    var30 = this.field1756.method1910(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1744[var31 + var33] * (long) Statics.field1723 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1744[var31 + var33 - 1 - var40] * (long) class120.field1721[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1744[var33 - 1 - var41] * (long) class120.field1721[1][var41] >> 16);
                        }
                        field1744[var33] = var39;
                        var30 = this.field1756.method1910(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1744[var31 + var33 - 1 - var43] * (long) class120.field1721[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1744[var33 - 1 - var44] * (long) class120.field1721[1][var44] >> 16);
                            }
                            field1744[var33] = var42;
                            this.field1756.method1910(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1749.method2107(0, (float) var30 / 65536.0F);
                    var32 = this.field1749.method2107(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1744[var46] < -32768) {
                field1744[var46] = -32768;
            }
            if (field1744[var46] > 32767) {
                field1744[var46] = 32767;
            }
        }
        return field1744;
    }

    @ObfuscatedName("dd.h(III)I")
    public final int method2125(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1757[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1754[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dd.f(Lfb;)V")
    public final void method2122(class175 arg0) {
        this.field1753 = new class112();
        this.field1753.method1908(arg0);
        this.field1736 = new class112();
        this.field1736.method1908(arg0);
        int var2 = arg0.method2903();
        if (var2 != 0) {
            arg0.field2394--;
            this.field1737 = new class112();
            this.field1737.method1908(arg0);
            this.field1738 = new class112();
            this.field1738.method1908(arg0);
        }
        int var3 = arg0.method2903();
        if (var3 != 0) {
            arg0.field2394--;
            this.field1739 = new class112();
            this.field1739.method1908(arg0);
            this.field1752 = new class112();
            this.field1752.method1908(arg0);
        }
        int var4 = arg0.method2903();
        if (var4 != 0) {
            arg0.field2394--;
            this.field1741 = new class112();
            this.field1741.method1908(arg0);
            this.field1742 = new class112();
            this.field1742.method1908(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3013();
            if (var6 == 0) {
                break;
            }
            this.field1743[var5] = var6;
            this.field1740[var5] = arg0.method2949();
            this.field1745[var5] = arg0.method3013();
        }
        this.field1746 = arg0.method3013();
        this.field1747 = arg0.method3013();
        this.field1750 = arg0.method3023();
        this.field1751 = arg0.method3023();
        this.field1749 = new class120();
        this.field1756 = new class112();
        this.field1749.method2108(arg0, this.field1756);
    }
}
