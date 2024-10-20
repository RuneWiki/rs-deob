package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class121 {

    @ObfuscatedName("dw.i")
    public class110 field1756;

    @ObfuscatedName("dw.j")
    public class110 field1736;

    @ObfuscatedName("dw.a")
    public class110 field1737;

    @ObfuscatedName("dw.r")
    public class110 field1738;

    @ObfuscatedName("dw.o")
    public class110 field1739;

    @ObfuscatedName("dw.n")
    public class110 field1740;

    @ObfuscatedName("dw.q")
    public class110 field1741;

    @ObfuscatedName("dw.b")
    public class110 field1751;

    @ObfuscatedName("dw.k")
    public int[] field1743 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.s")
    public int[] field1753 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.d")
    public int[] field1747 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.l")
    public int field1759 = 0;

    @ObfuscatedName("dw.t")
    public int field1742 = 100;

    @ObfuscatedName("dw.y")
    public class118 field1748;

    @ObfuscatedName("dw.v")
    public class110 field1749;

    @ObfuscatedName("dw.c")
    public int field1746 = 500;

    @ObfuscatedName("dw.z")
    public int field1757 = 0;

    @ObfuscatedName("dw.u")
    public static int[] field1752;

    @ObfuscatedName("dw.e")
    public static int[] field1745 = new int[32768];

    @ObfuscatedName("dw.p")
    public static int[] field1744;

    @ObfuscatedName("dw.x")
    public static int[] field1735;

    @ObfuscatedName("dw.h")
    public static int[] field1754;

    @ObfuscatedName("dw.f")
    public static int[] field1758;

    @ObfuscatedName("dw.g")
    public static int[] field1750;

    @ObfuscatedName("dw.w")
    public static int[] field1760;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1745[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1744 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1744[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1752 = new int[220500];
        field1735 = new int[5];
        field1754 = new int[5];
        field1758 = new int[5];
        field1750 = new int[5];
        field1760 = new int[5];
    }

    @ObfuscatedName("dw.i(II)[I")
    public final int[] method2122(int arg0, int arg1) {
        class185.method3297(field1752, 0, arg0);
        if (arg1 < 10) {
            return field1752;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1756.method1889();
        this.field1736.method1889();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1737 != null) {
            this.field1737.method1889();
            this.field1738.method1889();
            var5 = (int) ((double) (this.field1737.field1656 - this.field1737.field1658) * 32.768D / var3);
            var6 = (int) ((double) this.field1737.field1658 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1739 != null) {
            this.field1739.method1889();
            this.field1740.method1889();
            var8 = (int) ((double) (this.field1739.field1656 - this.field1739.field1658) * 32.768D / var3);
            var9 = (int) ((double) this.field1739.field1658 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1743[var11] != 0) {
                field1735[var11] = 0;
                field1754[var11] = (int) ((double) this.field1747[var11] * var3);
                field1758[var11] = (this.field1743[var11] << 14) / 100;
                field1750[var11] = (int) ((double) (this.field1756.field1656 - this.field1756.field1658) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1753[var11]) / var3);
                field1760[var11] = (int) ((double) this.field1756.field1658 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1756.method1890(arg0);
            int var14 = this.field1736.method1890(arg0);
            if (this.field1737 != null) {
                int var15 = this.field1737.method1890(arg0);
                int var16 = this.field1738.method1890(arg0);
                var13 += this.method2119(var7, var16, this.field1737.field1660) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1739 != null) {
                int var17 = this.field1739.method1890(arg0);
                int var18 = this.field1740.method1890(arg0);
                var14 = var14 * ((this.method2119(var10, var18, this.field1739.field1660) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1743[var19] != 0) {
                    int var20 = field1754[var19] + var12;
                    if (var20 < arg0) {
                        field1752[var20] += this.method2119(field1735[var19], field1758[var19] * var14 >> 15, this.field1756.field1660);
                        field1735[var19] += (field1750[var19] * var13 >> 16) + field1760[var19];
                    }
                }
            }
        }
        if (this.field1741 != null) {
            this.field1741.method1889();
            this.field1751.method1889();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1741.method1890(arg0);
                int var26 = this.field1751.method1890(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1741.field1656 - this.field1741.field1658) * var25 >> 8) + this.field1741.field1658;
                } else {
                    var27 = ((this.field1741.field1656 - this.field1741.field1658) * var26 >> 8) + this.field1741.field1658;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1752[var24] = 0;
                }
            }
        }
        if (this.field1759 > 0 && this.field1742 > 0) {
            int var28 = (int) ((double) this.field1759 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1752[var29] += field1752[var29 - var28] * this.field1742 / 100;
            }
        }
        if (this.field1748.field1717[0] > 0 || this.field1748.field1717[1] > 0) {
            this.field1749.method1889();
            int var30 = this.field1749.method1890(arg0 + 1);
            int var31 = this.field1748.method2099(0, (float) var30 / 65536.0F);
            int var32 = this.field1748.method2099(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1752[var31 + var33] * (long) Statics.field1722 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1752[var31 + var33 - 1 - var36] * (long) class118.field1721[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1752[var33 - 1 - var37] * (long) class118.field1721[1][var37] >> 16);
                    }
                    field1752[var33] = var35;
                    var30 = this.field1749.method1890(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1752[var31 + var33] * (long) Statics.field1722 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1752[var31 + var33 - 1 - var40] * (long) class118.field1721[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1752[var33 - 1 - var41] * (long) class118.field1721[1][var41] >> 16);
                        }
                        field1752[var33] = var39;
                        var30 = this.field1749.method1890(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1752[var31 + var33 - 1 - var43] * (long) class118.field1721[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1752[var33 - 1 - var44] * (long) class118.field1721[1][var44] >> 16);
                            }
                            field1752[var33] = var42;
                            this.field1749.method1890(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1748.method2099(0, (float) var30 / 65536.0F);
                    var32 = this.field1748.method2099(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1752[var46] < -32768) {
                field1752[var46] = -32768;
            }
            if (field1752[var46] > 32767) {
                field1752[var46] = 32767;
            }
        }
        return field1752;
    }

    @ObfuscatedName("dw.j(III)I")
    public final int method2119(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1744[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1745[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.a(Lfp;)V")
    public final void method2120(class175 arg0) {
        this.field1756 = new class110();
        this.field1756.method1886(arg0);
        this.field1736 = new class110();
        this.field1736.method1886(arg0);
        int var2 = arg0.method2999();
        if (var2 != 0) {
            arg0.field2395--;
            this.field1737 = new class110();
            this.field1737.method1886(arg0);
            this.field1738 = new class110();
            this.field1738.method1886(arg0);
        }
        int var3 = arg0.method2999();
        if (var3 != 0) {
            arg0.field2395--;
            this.field1739 = new class110();
            this.field1739.method1886(arg0);
            this.field1740 = new class110();
            this.field1740.method1886(arg0);
        }
        int var4 = arg0.method2999();
        if (var4 != 0) {
            arg0.field2395--;
            this.field1741 = new class110();
            this.field1741.method1886(arg0);
            this.field1751 = new class110();
            this.field1751.method1886(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3007();
            if (var6 == 0) {
                break;
            }
            this.field1743[var5] = var6;
            this.field1753[var5] = arg0.method3006();
            this.field1747[var5] = arg0.method3007();
        }
        this.field1759 = arg0.method3007();
        this.field1742 = arg0.method3007();
        this.field1746 = arg0.method2995();
        this.field1757 = arg0.method2995();
        this.field1748 = new class118();
        this.field1749 = new class110();
        this.field1748.method2100(arg0, this.field1749);
    }
}
