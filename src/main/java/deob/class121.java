package deob;

import java.util.Random;

@ObfuscatedName("du")
public class class121 {

    @ObfuscatedName("du.m")
    public class110 field1643;

    @ObfuscatedName("du.p")
    public class110 field1651;

    @ObfuscatedName("du.i")
    public class110 field1644;

    @ObfuscatedName("du.j")
    public class110 field1645;

    @ObfuscatedName("du.v")
    public class110 field1657;

    @ObfuscatedName("du.x")
    public class110 field1642;

    @ObfuscatedName("du.e")
    public class110 field1648;

    @ObfuscatedName("du.l")
    public class110 field1649;

    @ObfuscatedName("du.b")
    public int[] field1650 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.n")
    public int[] field1660 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.c")
    public int[] field1652 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.a")
    public int field1653 = 0;

    @ObfuscatedName("du.y")
    public int field1654 = 100;

    @ObfuscatedName("du.w")
    public class118 field1655;

    @ObfuscatedName("du.k")
    public class110 field1656;

    @ObfuscatedName("du.t")
    public int field1663 = 500;

    @ObfuscatedName("du.h")
    public int field1658 = 0;

    @ObfuscatedName("du.u")
    public static int[] field1659;

    @ObfuscatedName("du.r")
    public static int[] field1665 = new int[32768];

    @ObfuscatedName("du.g")
    public static int[] field1661;

    @ObfuscatedName("du.o")
    public static int[] field1646;

    @ObfuscatedName("du.d")
    public static int[] field1664;

    @ObfuscatedName("du.s")
    public static int[] field1667;

    @ObfuscatedName("du.f")
    public static int[] field1666;

    @ObfuscatedName("du.q")
    public static int[] field1647;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1665[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1661 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1661[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1659 = new int[220500];
        field1646 = new int[5];
        field1664 = new int[5];
        field1667 = new int[5];
        field1666 = new int[5];
        field1647 = new int[5];
    }

    @ObfuscatedName("du.m(II)[I")
    public final int[] method2199(int arg0, int arg1) {
        class191.method3335(field1659, 0, arg0);
        if (arg1 < 10) {
            return field1659;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1643.method1970();
        this.field1651.method1970();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1644 != null) {
            this.field1644.method1970();
            this.field1645.method1970();
            var5 = (int) ((double) (this.field1644.field1574 - this.field1644.field1573) * 32.768D / var3);
            var6 = (int) ((double) this.field1644.field1573 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1657 != null) {
            this.field1657.method1970();
            this.field1642.method1970();
            var8 = (int) ((double) (this.field1657.field1574 - this.field1657.field1573) * 32.768D / var3);
            var9 = (int) ((double) this.field1657.field1573 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1650[var11] != 0) {
                field1646[var11] = 0;
                field1664[var11] = (int) ((double) this.field1652[var11] * var3);
                field1667[var11] = (this.field1650[var11] << 14) / 100;
                field1666[var11] = (int) ((double) (this.field1643.field1574 - this.field1643.field1573) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1660[var11]) / var3);
                field1647[var11] = (int) ((double) this.field1643.field1573 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1643.method1971(arg0);
            int var14 = this.field1651.method1971(arg0);
            if (this.field1644 != null) {
                int var15 = this.field1644.method1971(arg0);
                int var16 = this.field1645.method1971(arg0);
                var13 += this.method2201(var7, var16, this.field1644.field1572) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1657 != null) {
                int var17 = this.field1657.method1971(arg0);
                int var18 = this.field1642.method1971(arg0);
                var14 = var14 * ((this.method2201(var10, var18, this.field1657.field1572) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1650[var19] != 0) {
                    int var20 = field1664[var19] + var12;
                    if (var20 < arg0) {
                        field1659[var20] += this.method2201(field1646[var19], field1667[var19] * var14 >> 15, this.field1643.field1572);
                        field1646[var19] += (field1666[var19] * var13 >> 16) + field1647[var19];
                    }
                }
            }
        }
        if (this.field1648 != null) {
            this.field1648.method1970();
            this.field1649.method1970();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1648.method1971(arg0);
                int var26 = this.field1649.method1971(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1648.field1574 - this.field1648.field1573) * var25 >> 8) + this.field1648.field1573;
                } else {
                    var27 = ((this.field1648.field1574 - this.field1648.field1573) * var26 >> 8) + this.field1648.field1573;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1659[var24] = 0;
                }
            }
        }
        if (this.field1653 > 0 && this.field1654 > 0) {
            int var28 = (int) ((double) this.field1653 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1659[var29] += field1659[var29 - var28] * this.field1654 / 100;
            }
        }
        if (this.field1655.field1626[0] > 0 || this.field1655.field1626[1] > 0) {
            this.field1656.method1970();
            int var30 = this.field1656.method1971(arg0 + 1);
            int var31 = this.field1655.method2177(0, (float) var30 / 65536.0F);
            int var32 = this.field1655.method2177(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1659[var31 + var33] * (long) Statics.field1630 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1659[var31 + var33 - 1 - var36] * (long) class118.field1628[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1659[var33 - 1 - var37] * (long) class118.field1628[1][var37] >> 16);
                    }
                    field1659[var33] = var35;
                    var30 = this.field1656.method1971(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1659[var31 + var33] * (long) Statics.field1630 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1659[var31 + var33 - 1 - var40] * (long) class118.field1628[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1659[var33 - 1 - var41] * (long) class118.field1628[1][var41] >> 16);
                        }
                        field1659[var33] = var39;
                        var30 = this.field1656.method1971(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1659[var31 + var33 - 1 - var43] * (long) class118.field1628[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1659[var33 - 1 - var44] * (long) class118.field1628[1][var44] >> 16);
                            }
                            field1659[var33] = var42;
                            this.field1656.method1971(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1655.method2177(0, (float) var30 / 65536.0F);
                    var32 = this.field1655.method2177(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1659[var46] < -32768) {
                field1659[var46] = -32768;
            }
            if (field1659[var46] > 32767) {
                field1659[var46] = 32767;
            }
        }
        return field1659;
    }

    @ObfuscatedName("du.p(III)I")
    public final int method2201(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1661[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1665[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("du.i(Lfv;)V")
    public final void method2202(class181 arg0) {
        this.field1643 = new class110();
        this.field1643.method1968(arg0);
        this.field1651 = new class110();
        this.field1651.method1968(arg0);
        int var2 = arg0.method3012();
        if (var2 != 0) {
            arg0.field2498--;
            this.field1644 = new class110();
            this.field1644.method1968(arg0);
            this.field1645 = new class110();
            this.field1645.method1968(arg0);
        }
        int var3 = arg0.method3012();
        if (var3 != 0) {
            arg0.field2498--;
            this.field1657 = new class110();
            this.field1657.method1968(arg0);
            this.field1642 = new class110();
            this.field1642.method1968(arg0);
        }
        int var4 = arg0.method3012();
        if (var4 != 0) {
            arg0.field2498--;
            this.field1648 = new class110();
            this.field1648.method1968(arg0);
            this.field1649 = new class110();
            this.field1649.method1968(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3140();
            if (var6 == 0) {
                break;
            }
            this.field1650[var5] = var6;
            this.field1660[var5] = arg0.method3025();
            this.field1652[var5] = arg0.method3140();
        }
        this.field1653 = arg0.method3140();
        this.field1654 = arg0.method3140();
        this.field1663 = arg0.method3009();
        this.field1658 = arg0.method3009();
        this.field1655 = new class118();
        this.field1656 = new class110();
        this.field1655.method2184(arg0, this.field1656);
    }
}
