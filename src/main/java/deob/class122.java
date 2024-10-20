package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class122 {

    @ObfuscatedName("dw.i")
    public class111 field1742;

    @ObfuscatedName("dw.w")
    public class111 field1736;

    @ObfuscatedName("dw.a")
    public class111 field1746;

    @ObfuscatedName("dw.t")
    public class111 field1737;

    @ObfuscatedName("dw.s")
    public class111 field1756;

    @ObfuscatedName("dw.r")
    public class111 field1739;

    @ObfuscatedName("dw.v")
    public class111 field1740;

    @ObfuscatedName("dw.y")
    public class111 field1741;

    @ObfuscatedName("dw.j")
    public int[] field1753 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.k")
    public int[] field1743 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.e")
    public int[] field1734 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.o")
    public int field1745 = 0;

    @ObfuscatedName("dw.z")
    public int field1754 = 100;

    @ObfuscatedName("dw.l")
    public class119 field1747;

    @ObfuscatedName("dw.c")
    public class111 field1738;

    @ObfuscatedName("dw.m")
    public int field1749 = 500;

    @ObfuscatedName("dw.b")
    public int field1750 = 0;

    @ObfuscatedName("dw.f")
    public static int[] field1751;

    @ObfuscatedName("dw.n")
    public static int[] field1748 = new int[32768];

    @ObfuscatedName("dw.u")
    public static int[] field1735;

    @ObfuscatedName("dw.q")
    public static int[] field1752;

    @ObfuscatedName("dw.d")
    public static int[] field1755;

    @ObfuscatedName("dw.h")
    public static int[] field1757;

    @ObfuscatedName("dw.g")
    public static int[] field1758;

    @ObfuscatedName("dw.x")
    public static int[] field1759;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1748[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1735 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1735[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1751 = new int[220500];
        field1752 = new int[5];
        field1755 = new int[5];
        field1757 = new int[5];
        field1758 = new int[5];
        field1759 = new int[5];
    }

    @ObfuscatedName("dw.i(II)[I")
    public final int[] method2107(int arg0, int arg1) {
        class184.method3160(field1751, 0, arg0);
        if (arg1 < 10) {
            return field1751;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1742.method1900();
        this.field1736.method1900();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1746 != null) {
            this.field1746.method1900();
            this.field1737.method1900();
            var5 = (int) ((double) (this.field1746.field1670 - this.field1746.field1671) * 32.768D / var3);
            var6 = (int) ((double) this.field1746.field1671 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1756 != null) {
            this.field1756.method1900();
            this.field1739.method1900();
            var8 = (int) ((double) (this.field1756.field1670 - this.field1756.field1671) * 32.768D / var3);
            var9 = (int) ((double) this.field1756.field1671 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1753[var11] != 0) {
                field1752[var11] = 0;
                field1755[var11] = (int) ((double) this.field1734[var11] * var3);
                field1757[var11] = (this.field1753[var11] << 14) / 100;
                field1758[var11] = (int) ((double) (this.field1742.field1670 - this.field1742.field1671) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1743[var11]) / var3);
                field1759[var11] = (int) ((double) this.field1742.field1671 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1742.method1889(arg0);
            int var14 = this.field1736.method1889(arg0);
            if (this.field1746 != null) {
                int var15 = this.field1746.method1889(arg0);
                int var16 = this.field1737.method1889(arg0);
                var13 += this.method2098(var7, var16, this.field1746.field1673) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1756 != null) {
                int var17 = this.field1756.method1889(arg0);
                int var18 = this.field1739.method1889(arg0);
                var14 = var14 * ((this.method2098(var10, var18, this.field1756.field1673) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1753[var19] != 0) {
                    int var20 = field1755[var19] + var12;
                    if (var20 < arg0) {
                        field1751[var20] += this.method2098(field1752[var19], field1757[var19] * var14 >> 15, this.field1742.field1673);
                        field1752[var19] += (field1758[var19] * var13 >> 16) + field1759[var19];
                    }
                }
            }
        }
        if (this.field1740 != null) {
            this.field1740.method1900();
            this.field1741.method1900();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1740.method1889(arg0);
                int var26 = this.field1741.method1889(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1740.field1670 - this.field1740.field1671) * var25 >> 8) + this.field1740.field1671;
                } else {
                    var27 = ((this.field1740.field1670 - this.field1740.field1671) * var26 >> 8) + this.field1740.field1671;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1751[var24] = 0;
                }
            }
        }
        if (this.field1745 > 0 && this.field1754 > 0) {
            int var28 = (int) ((double) this.field1745 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1751[var29] += field1751[var29 - var28] * this.field1754 / 100;
            }
        }
        if (this.field1747.field1722[0] > 0 || this.field1747.field1722[1] > 0) {
            this.field1738.method1900();
            int var30 = this.field1738.method1889(arg0 + 1);
            int var31 = this.field1747.method2076(0, (float) var30 / 65536.0F);
            int var32 = this.field1747.method2076(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1751[var31 + var33] * (long) Statics.field1716 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1751[var31 + var33 - 1 - var36] * (long) class119.field1720[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1751[var33 - 1 - var37] * (long) class119.field1720[1][var37] >> 16);
                    }
                    field1751[var33] = var35;
                    var30 = this.field1738.method1889(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1751[var31 + var33] * (long) Statics.field1716 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1751[var31 + var33 - 1 - var40] * (long) class119.field1720[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1751[var33 - 1 - var41] * (long) class119.field1720[1][var41] >> 16);
                        }
                        field1751[var33] = var39;
                        var30 = this.field1738.method1889(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1751[var31 + var33 - 1 - var43] * (long) class119.field1720[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1751[var33 - 1 - var44] * (long) class119.field1720[1][var44] >> 16);
                            }
                            field1751[var33] = var42;
                            this.field1738.method1889(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1747.method2076(0, (float) var30 / 65536.0F);
                    var32 = this.field1747.method2076(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1751[var46] < -32768) {
                field1751[var46] = -32768;
            }
            if (field1751[var46] > 32767) {
                field1751[var46] = 32767;
            }
        }
        return field1751;
    }

    @ObfuscatedName("dw.w(III)I")
    public final int method2098(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1735[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1748[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.a(Lfp;)V")
    public final void method2099(class174 arg0) {
        this.field1742 = new class111();
        this.field1742.method1887(arg0);
        this.field1736 = new class111();
        this.field1736.method1887(arg0);
        int var2 = arg0.method3061();
        if (var2 != 0) {
            arg0.field2399--;
            this.field1746 = new class111();
            this.field1746.method1887(arg0);
            this.field1737 = new class111();
            this.field1737.method1887(arg0);
        }
        int var3 = arg0.method3061();
        if (var3 != 0) {
            arg0.field2399--;
            this.field1756 = new class111();
            this.field1756.method1887(arg0);
            this.field1739 = new class111();
            this.field1739.method1887(arg0);
        }
        int var4 = arg0.method3061();
        if (var4 != 0) {
            arg0.field2399--;
            this.field1740 = new class111();
            this.field1740.method1887(arg0);
            this.field1741 = new class111();
            this.field1741.method1887(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2893();
            if (var6 == 0) {
                break;
            }
            this.field1753[var5] = var6;
            this.field1743[var5] = arg0.method2892();
            this.field1734[var5] = arg0.method2893();
        }
        this.field1745 = arg0.method2893();
        this.field1754 = arg0.method2893();
        this.field1749 = arg0.method2882();
        this.field1750 = arg0.method2882();
        this.field1747 = new class119();
        this.field1738 = new class111();
        this.field1747.method2078(arg0, this.field1738);
    }
}
