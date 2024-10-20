package deob;

import java.util.Random;

@ObfuscatedName("dw")
public class class121 {

    @ObfuscatedName("dw.n")
    public class110 field1650;

    @ObfuscatedName("dw.v")
    public class110 field1638;

    @ObfuscatedName("dw.y")
    public class110 field1639;

    @ObfuscatedName("dw.r")
    public class110 field1640;

    @ObfuscatedName("dw.h")
    public class110 field1641;

    @ObfuscatedName("dw.d")
    public class110 field1642;

    @ObfuscatedName("dw.s")
    public class110 field1654;

    @ObfuscatedName("dw.b")
    public class110 field1644;

    @ObfuscatedName("dw.e")
    public int[] field1653 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.f")
    public int[] field1651 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.z")
    public int[] field1647 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dw.u")
    public int field1648 = 0;

    @ObfuscatedName("dw.p")
    public int field1646 = 100;

    @ObfuscatedName("dw.w")
    public class118 field1649;

    @ObfuscatedName("dw.t")
    public class110 field1661;

    @ObfuscatedName("dw.o")
    public int field1652 = 500;

    @ObfuscatedName("dw.a")
    public int field1645 = 0;

    @ObfuscatedName("dw.i")
    public static int[] field1655;

    @ObfuscatedName("dw.m")
    public static int[] field1643 = new int[32768];

    @ObfuscatedName("dw.x")
    public static int[] field1656;

    @ObfuscatedName("dw.j")
    public static int[] field1658;

    @ObfuscatedName("dw.g")
    public static int[] field1659;

    @ObfuscatedName("dw.c")
    public static int[] field1660;

    @ObfuscatedName("dw.k")
    public static int[] field1637;

    @ObfuscatedName("dw.q")
    public static int[] field1662;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1643[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1656 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1656[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1655 = new int[220500];
        field1658 = new int[5];
        field1659 = new int[5];
        field1660 = new int[5];
        field1637 = new int[5];
        field1662 = new int[5];
    }

    @ObfuscatedName("dw.n(II)[I")
    public final int[] method2156(int arg0, int arg1) {
        class195.method3347(field1655, 0, arg0);
        if (arg1 < 10) {
            return field1655;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1650.method1939();
        this.field1638.method1939();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1639 != null) {
            this.field1639.method1939();
            this.field1640.method1939();
            var5 = (int) ((double) (this.field1639.field1568 - this.field1639.field1563) * 32.768D / var3);
            var6 = (int) ((double) this.field1639.field1563 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1641 != null) {
            this.field1641.method1939();
            this.field1642.method1939();
            var8 = (int) ((double) (this.field1641.field1568 - this.field1641.field1563) * 32.768D / var3);
            var9 = (int) ((double) this.field1641.field1563 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1653[var11] != 0) {
                field1658[var11] = 0;
                field1659[var11] = (int) ((double) this.field1647[var11] * var3);
                field1660[var11] = (this.field1653[var11] << 14) / 100;
                field1637[var11] = (int) ((double) (this.field1650.field1568 - this.field1650.field1563) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1651[var11]) / var3);
                field1662[var11] = (int) ((double) this.field1650.field1563 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1650.method1949(arg0);
            int var14 = this.field1638.method1949(arg0);
            if (this.field1639 != null) {
                int var15 = this.field1639.method1949(arg0);
                int var16 = this.field1640.method1949(arg0);
                var13 += this.method2155(var7, var16, this.field1639.field1565) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1641 != null) {
                int var17 = this.field1641.method1949(arg0);
                int var18 = this.field1642.method1949(arg0);
                var14 = var14 * ((this.method2155(var10, var18, this.field1641.field1565) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1653[var19] != 0) {
                    int var20 = field1659[var19] + var12;
                    if (var20 < arg0) {
                        field1655[var20] += this.method2155(field1658[var19], field1660[var19] * var14 >> 15, this.field1650.field1565);
                        field1658[var19] += (field1637[var19] * var13 >> 16) + field1662[var19];
                    }
                }
            }
        }
        if (this.field1654 != null) {
            this.field1654.method1939();
            this.field1644.method1939();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1654.method1949(arg0);
                int var26 = this.field1644.method1949(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1654.field1568 - this.field1654.field1563) * var25 >> 8) + this.field1654.field1563;
                } else {
                    var27 = ((this.field1654.field1568 - this.field1654.field1563) * var26 >> 8) + this.field1654.field1563;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1655[var24] = 0;
                }
            }
        }
        if (this.field1648 > 0 && this.field1646 > 0) {
            int var28 = (int) ((double) this.field1648 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1655[var29] += field1655[var29 - var28] * this.field1646 / 100;
            }
        }
        if (this.field1649.field1628[0] > 0 || this.field1649.field1628[1] > 0) {
            this.field1661.method1939();
            int var30 = this.field1661.method1949(arg0 + 1);
            int var31 = this.field1649.method2137(0, (float) var30 / 65536.0F);
            int var32 = this.field1649.method2137(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1655[var31 + var33] * (long) Statics.field1617 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1655[var31 + var33 - 1 - var36] * (long) class118.field1618[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1655[var33 - 1 - var37] * (long) class118.field1618[1][var37] >> 16);
                    }
                    field1655[var33] = var35;
                    var30 = this.field1661.method1949(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1655[var31 + var33] * (long) Statics.field1617 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1655[var31 + var33 - 1 - var40] * (long) class118.field1618[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1655[var33 - 1 - var41] * (long) class118.field1618[1][var41] >> 16);
                        }
                        field1655[var33] = var39;
                        var30 = this.field1661.method1949(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1655[var31 + var33 - 1 - var43] * (long) class118.field1618[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1655[var33 - 1 - var44] * (long) class118.field1618[1][var44] >> 16);
                            }
                            field1655[var33] = var42;
                            this.field1661.method1949(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1649.method2137(0, (float) var30 / 65536.0F);
                    var32 = this.field1649.method2137(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1655[var46] < -32768) {
                field1655[var46] = -32768;
            }
            if (field1655[var46] > 32767) {
                field1655[var46] = 32767;
            }
        }
        return field1655;
    }

    @ObfuscatedName("dw.v(III)I")
    public final int method2155(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1656[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1643[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dw.y(Lgv;)V")
    public final void method2158(class185 arg0) {
        this.field1650 = new class110();
        this.field1650.method1938(arg0);
        this.field1638 = new class110();
        this.field1638.method1938(arg0);
        int var2 = arg0.method3021();
        if (var2 != 0) {
            arg0.field2529--;
            this.field1639 = new class110();
            this.field1639.method1938(arg0);
            this.field1640 = new class110();
            this.field1640.method1938(arg0);
        }
        int var3 = arg0.method3021();
        if (var3 != 0) {
            arg0.field2529--;
            this.field1641 = new class110();
            this.field1641.method1938(arg0);
            this.field1642 = new class110();
            this.field1642.method1938(arg0);
        }
        int var4 = arg0.method3021();
        if (var4 != 0) {
            arg0.field2529--;
            this.field1654 = new class110();
            this.field1654.method1938(arg0);
            this.field1644 = new class110();
            this.field1644.method1938(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3232();
            if (var6 == 0) {
                break;
            }
            this.field1653[var5] = var6;
            this.field1651[var5] = arg0.method3042();
            this.field1647[var5] = arg0.method3232();
        }
        this.field1648 = arg0.method3232();
        this.field1646 = arg0.method3232();
        this.field1652 = arg0.method3015();
        this.field1645 = arg0.method3015();
        this.field1649 = new class118();
        this.field1661 = new class110();
        this.field1649.method2139(arg0, this.field1661);
    }
}
