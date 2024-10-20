package deob;

import java.util.Random;

@ObfuscatedName("dk")
public class class121 {

    @ObfuscatedName("dk.s")
    public class110 field1651;

    @ObfuscatedName("dk.g")
    public class110 field1634;

    @ObfuscatedName("dk.m")
    public class110 field1636;

    @ObfuscatedName("dk.h")
    public class110 field1637;

    @ObfuscatedName("dk.i")
    public class110 field1655;

    @ObfuscatedName("dk.w")
    public class110 field1659;

    @ObfuscatedName("dk.t")
    public class110 field1640;

    @ObfuscatedName("dk.d")
    public class110 field1641;

    @ObfuscatedName("dk.z")
    public int[] field1644 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.k")
    public int[] field1643 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.c")
    public int[] field1647 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.o")
    public int field1645 = 0;

    @ObfuscatedName("dk.l")
    public int field1646 = 100;

    @ObfuscatedName("dk.f")
    public class118 field1635;

    @ObfuscatedName("dk.q")
    public class110 field1648;

    @ObfuscatedName("dk.r")
    public int field1649 = 500;

    @ObfuscatedName("dk.x")
    public int field1650 = 0;

    @ObfuscatedName("dk.u")
    public static int[] field1639;

    @ObfuscatedName("dk.b")
    public static int[] field1652 = new int[32768];

    @ObfuscatedName("dk.p")
    public static int[] field1653;

    @ObfuscatedName("dk.n")
    public static int[] field1656;

    @ObfuscatedName("dk.j")
    public static int[] field1642;

    @ObfuscatedName("dk.e")
    public static int[] field1657;

    @ObfuscatedName("dk.v")
    public static int[] field1658;

    @ObfuscatedName("dk.a")
    public static int[] field1638;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1652[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1653 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1653[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1639 = new int[220500];
        field1656 = new int[5];
        field1642 = new int[5];
        field1657 = new int[5];
        field1658 = new int[5];
        field1638 = new int[5];
    }

    @ObfuscatedName("dk.s(II)[I")
    public final int[] method2387(int arg0, int arg1) {
        class195.method3603(field1639, 0, arg0);
        if (arg1 < 10) {
            return field1639;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1651.method2153();
        this.field1634.method2153();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1636 != null) {
            this.field1636.method2153();
            this.field1637.method2153();
            var5 = (int) ((double) (this.field1636.field1568 - this.field1636.field1567) * 32.768D / var3);
            var6 = (int) ((double) this.field1636.field1567 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1655 != null) {
            this.field1655.method2153();
            this.field1659.method2153();
            var8 = (int) ((double) (this.field1655.field1568 - this.field1655.field1567) * 32.768D / var3);
            var9 = (int) ((double) this.field1655.field1567 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1644[var11] != 0) {
                field1656[var11] = 0;
                field1642[var11] = (int) ((double) this.field1647[var11] * var3);
                field1657[var11] = (this.field1644[var11] << 14) / 100;
                field1658[var11] = (int) ((double) (this.field1651.field1568 - this.field1651.field1567) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1643[var11]) / var3);
                field1638[var11] = (int) ((double) this.field1651.field1567 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1651.method2154(arg0);
            int var14 = this.field1634.method2154(arg0);
            if (this.field1636 != null) {
                int var15 = this.field1636.method2154(arg0);
                int var16 = this.field1637.method2154(arg0);
                var13 += this.method2388(var7, var16, this.field1636.field1569) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1655 != null) {
                int var17 = this.field1655.method2154(arg0);
                int var18 = this.field1659.method2154(arg0);
                var14 = var14 * ((this.method2388(var10, var18, this.field1655.field1569) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1644[var19] != 0) {
                    int var20 = field1642[var19] + var12;
                    if (var20 < arg0) {
                        field1639[var20] += this.method2388(field1656[var19], field1657[var19] * var14 >> 15, this.field1651.field1569);
                        field1656[var19] += (field1658[var19] * var13 >> 16) + field1638[var19];
                    }
                }
            }
        }
        if (this.field1640 != null) {
            this.field1640.method2153();
            this.field1641.method2153();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1640.method2154(arg0);
                int var26 = this.field1641.method2154(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1640.field1568 - this.field1640.field1567) * var25 >> 8) + this.field1640.field1567;
                } else {
                    var27 = ((this.field1640.field1568 - this.field1640.field1567) * var26 >> 8) + this.field1640.field1567;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1639[var24] = 0;
                }
            }
        }
        if (this.field1645 > 0 && this.field1646 > 0) {
            int var28 = (int) ((double) this.field1645 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1639[var29] += field1639[var29 - var28] * this.field1646 / 100;
            }
        }
        if (this.field1635.field1620[0] > 0 || this.field1635.field1620[1] > 0) {
            this.field1648.method2153();
            int var30 = this.field1648.method2154(arg0 + 1);
            int var31 = this.field1635.method2372(0, (float) var30 / 65536.0F);
            int var32 = this.field1635.method2372(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1639[var31 + var33] * (long) Statics.field1622 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1639[var31 + var33 - 1 - var36] * (long) class118.field1614[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1639[var33 - 1 - var37] * (long) class118.field1614[1][var37] >> 16);
                    }
                    field1639[var33] = var35;
                    var30 = this.field1648.method2154(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1639[var31 + var33] * (long) Statics.field1622 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1639[var31 + var33 - 1 - var40] * (long) class118.field1614[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1639[var33 - 1 - var41] * (long) class118.field1614[1][var41] >> 16);
                        }
                        field1639[var33] = var39;
                        var30 = this.field1648.method2154(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1639[var31 + var33 - 1 - var43] * (long) class118.field1614[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1639[var33 - 1 - var44] * (long) class118.field1614[1][var44] >> 16);
                            }
                            field1639[var33] = var42;
                            this.field1648.method2154(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1635.method2372(0, (float) var30 / 65536.0F);
                    var32 = this.field1635.method2372(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1639[var46] < -32768) {
                field1639[var46] = -32768;
            }
            if (field1639[var46] > 32767) {
                field1639[var46] = 32767;
            }
        }
        return field1639;
    }

    @ObfuscatedName("dk.g(III)I")
    public final int method2388(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1653[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1652[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dk.m(Lgy;)V")
    public final void method2386(class185 arg0) {
        this.field1651 = new class110();
        this.field1651.method2151(arg0);
        this.field1634 = new class110();
        this.field1634.method2151(arg0);
        int var2 = arg0.method3239();
        if (var2 != 0) {
            arg0.field2514--;
            this.field1636 = new class110();
            this.field1636.method2151(arg0);
            this.field1637 = new class110();
            this.field1637.method2151(arg0);
        }
        int var3 = arg0.method3239();
        if (var3 != 0) {
            arg0.field2514--;
            this.field1655 = new class110();
            this.field1655.method2151(arg0);
            this.field1659 = new class110();
            this.field1659.method2151(arg0);
        }
        int var4 = arg0.method3239();
        if (var4 != 0) {
            arg0.field2514--;
            this.field1640 = new class110();
            this.field1640.method2151(arg0);
            this.field1641 = new class110();
            this.field1641.method2151(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3253();
            if (var6 == 0) {
                break;
            }
            this.field1644[var5] = var6;
            this.field1643[var5] = arg0.method3461();
            this.field1647[var5] = arg0.method3253();
        }
        this.field1645 = arg0.method3253();
        this.field1646 = arg0.method3253();
        this.field1649 = arg0.method3241();
        this.field1650 = arg0.method3241();
        this.field1635 = new class118();
        this.field1648 = new class110();
        this.field1635.method2377(arg0, this.field1648);
    }
}
