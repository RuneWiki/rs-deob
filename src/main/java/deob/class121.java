package deob;

import java.util.Random;

@ObfuscatedName("de")
public class class121 {

    @ObfuscatedName("de.b")
    public class110 field1659;

    @ObfuscatedName("de.s")
    public class110 field1647;

    @ObfuscatedName("de.r")
    public class110 field1646;

    @ObfuscatedName("de.g")
    public class110 field1640;

    @ObfuscatedName("de.x")
    public class110 field1662;

    @ObfuscatedName("de.f")
    public class110 field1642;

    @ObfuscatedName("de.u")
    public class110 field1643;

    @ObfuscatedName("de.t")
    public class110 field1644;

    @ObfuscatedName("de.k")
    public int[] field1645 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.n")
    public int[] field1641 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.d")
    public int[] field1637 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("de.o")
    public int field1638 = 0;

    @ObfuscatedName("de.a")
    public int field1661 = 100;

    @ObfuscatedName("de.q")
    public class118 field1650;

    @ObfuscatedName("de.j")
    public class110 field1651;

    @ObfuscatedName("de.m")
    public int field1652 = 500;

    @ObfuscatedName("de.h")
    public int field1653 = 0;

    @ObfuscatedName("de.c")
    public static int[] field1654;

    @ObfuscatedName("de.y")
    public static int[] field1655 = new int[32768];

    @ObfuscatedName("de.p")
    public static int[] field1656;

    @ObfuscatedName("de.l")
    public static int[] field1658;

    @ObfuscatedName("de.z")
    public static int[] field1639;

    @ObfuscatedName("de.e")
    public static int[] field1660;

    @ObfuscatedName("de.v")
    public static int[] field1649;

    @ObfuscatedName("de.w")
    public static int[] field1648;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1655[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1656 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1656[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1654 = new int[220500];
        field1658 = new int[5];
        field1639 = new int[5];
        field1660 = new int[5];
        field1649 = new int[5];
        field1648 = new int[5];
    }

    @ObfuscatedName("de.b(II)[I")
    public final int[] method2120(int arg0, int arg1) {
        class191.method3266(field1654, 0, arg0);
        if (arg1 < 10) {
            return field1654;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1659.method1914();
        this.field1647.method1914();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1646 != null) {
            this.field1646.method1914();
            this.field1640.method1914();
            var5 = (int) ((double) (this.field1646.field1563 - this.field1646.field1562) * 32.768D / var3);
            var6 = (int) ((double) this.field1646.field1562 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1662 != null) {
            this.field1662.method1914();
            this.field1642.method1914();
            var8 = (int) ((double) (this.field1662.field1563 - this.field1662.field1562) * 32.768D / var3);
            var9 = (int) ((double) this.field1662.field1562 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1645[var11] != 0) {
                field1658[var11] = 0;
                field1639[var11] = (int) ((double) this.field1637[var11] * var3);
                field1660[var11] = (this.field1645[var11] << 14) / 100;
                field1649[var11] = (int) ((double) (this.field1659.field1563 - this.field1659.field1562) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1641[var11]) / var3);
                field1648[var11] = (int) ((double) this.field1659.field1562 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1659.method1915(arg0);
            int var14 = this.field1647.method1915(arg0);
            if (this.field1646 != null) {
                int var15 = this.field1646.method1915(arg0);
                int var16 = this.field1640.method1915(arg0);
                var13 += this.method2130(var7, var16, this.field1646.field1564) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1662 != null) {
                int var17 = this.field1662.method1915(arg0);
                int var18 = this.field1642.method1915(arg0);
                var14 = var14 * ((this.method2130(var10, var18, this.field1662.field1564) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1645[var19] != 0) {
                    int var20 = field1639[var19] + var12;
                    if (var20 < arg0) {
                        field1654[var20] += this.method2130(field1658[var19], field1660[var19] * var14 >> 15, this.field1659.field1564);
                        field1658[var19] += (field1649[var19] * var13 >> 16) + field1648[var19];
                    }
                }
            }
        }
        if (this.field1643 != null) {
            this.field1643.method1914();
            this.field1644.method1914();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1643.method1915(arg0);
                int var26 = this.field1644.method1915(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1643.field1563 - this.field1643.field1562) * var25 >> 8) + this.field1643.field1562;
                } else {
                    var27 = ((this.field1643.field1563 - this.field1643.field1562) * var26 >> 8) + this.field1643.field1562;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1654[var24] = 0;
                }
            }
        }
        if (this.field1638 > 0 && this.field1661 > 0) {
            int var28 = (int) ((double) this.field1638 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1654[var29] += field1654[var29 - var28] * this.field1661 / 100;
            }
        }
        if (this.field1650.field1625[0] > 0 || this.field1650.field1625[1] > 0) {
            this.field1651.method1914();
            int var30 = this.field1651.method1915(arg0 + 1);
            int var31 = this.field1650.method2100(0, (float) var30 / 65536.0F);
            int var32 = this.field1650.method2100(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1654[var31 + var33] * (long) Statics.field1617 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1654[var31 + var33 - 1 - var36] * (long) class118.field1623[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1654[var33 - 1 - var37] * (long) class118.field1623[1][var37] >> 16);
                    }
                    field1654[var33] = var35;
                    var30 = this.field1651.method1915(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1654[var31 + var33] * (long) Statics.field1617 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1654[var31 + var33 - 1 - var40] * (long) class118.field1623[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1654[var33 - 1 - var41] * (long) class118.field1623[1][var41] >> 16);
                        }
                        field1654[var33] = var39;
                        var30 = this.field1651.method1915(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1654[var31 + var33 - 1 - var43] * (long) class118.field1623[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1654[var33 - 1 - var44] * (long) class118.field1623[1][var44] >> 16);
                            }
                            field1654[var33] = var42;
                            this.field1651.method1915(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1650.method2100(0, (float) var30 / 65536.0F);
                    var32 = this.field1650.method2100(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1654[var46] < -32768) {
                field1654[var46] = -32768;
            }
            if (field1654[var46] > 32767) {
                field1654[var46] = 32767;
            }
        }
        return field1654;
    }

    @ObfuscatedName("de.s(III)I")
    public final int method2130(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1656[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1655[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("de.r(Lfs;)V")
    public final void method2122(class181 arg0) {
        this.field1659 = new class110();
        this.field1659.method1912(arg0);
        this.field1647 = new class110();
        this.field1647.method1912(arg0);
        int var2 = arg0.method2945();
        if (var2 != 0) {
            arg0.field2488--;
            this.field1646 = new class110();
            this.field1646.method1912(arg0);
            this.field1640 = new class110();
            this.field1640.method1912(arg0);
        }
        int var3 = arg0.method2945();
        if (var3 != 0) {
            arg0.field2488--;
            this.field1662 = new class110();
            this.field1662.method1912(arg0);
            this.field1642 = new class110();
            this.field1642.method1912(arg0);
        }
        int var4 = arg0.method2945();
        if (var4 != 0) {
            arg0.field2488--;
            this.field1643 = new class110();
            this.field1643.method1912(arg0);
            this.field1644 = new class110();
            this.field1644.method1912(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3086();
            if (var6 == 0) {
                break;
            }
            this.field1645[var5] = var6;
            this.field1641[var5] = arg0.method2957();
            this.field1637[var5] = arg0.method3086();
        }
        this.field1638 = arg0.method3086();
        this.field1661 = arg0.method3086();
        this.field1652 = arg0.method3081();
        this.field1653 = arg0.method3081();
        this.field1650 = new class118();
        this.field1651 = new class110();
        this.field1650.method2101(arg0, this.field1651);
    }
}
