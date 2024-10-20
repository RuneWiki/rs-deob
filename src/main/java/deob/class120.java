package deob;

import java.util.Random;

@ObfuscatedName("du")
public class class120 {

    @ObfuscatedName("du.c")
    public class109 field1660;

    @ObfuscatedName("du.i")
    public class109 field1648;

    @ObfuscatedName("du.o")
    public class109 field1655;

    @ObfuscatedName("du.j")
    public class109 field1650;

    @ObfuscatedName("du.k")
    public class109 field1651;

    @ObfuscatedName("du.x")
    public class109 field1652;

    @ObfuscatedName("du.z")
    public class109 field1664;

    @ObfuscatedName("du.p")
    public class109 field1654;

    @ObfuscatedName("du.w")
    public int[] field1668 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.r")
    public int[] field1672 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.d")
    public int[] field1657 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("du.a")
    public int field1658 = 0;

    @ObfuscatedName("du.e")
    public int field1659 = 100;

    @ObfuscatedName("du.f")
    public class117 field1671;

    @ObfuscatedName("du.l")
    public class109 field1661;

    @ObfuscatedName("du.m")
    public int field1662 = 500;

    @ObfuscatedName("du.b")
    public int field1665 = 0;

    @ObfuscatedName("du.h")
    public static int[] field1647;

    @ObfuscatedName("du.t")
    public static int[] field1656 = new int[32768];

    @ObfuscatedName("du.v")
    public static int[] field1653;

    @ObfuscatedName("du.u")
    public static int[] field1663;

    @ObfuscatedName("du.q")
    public static int[] field1669;

    @ObfuscatedName("du.g")
    public static int[] field1649;

    @ObfuscatedName("du.y")
    public static int[] field1666;

    @ObfuscatedName("du.s")
    public static int[] field1670;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1656[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1653 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1653[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1647 = new int[220500];
        field1663 = new int[5];
        field1669 = new int[5];
        field1649 = new int[5];
        field1666 = new int[5];
        field1670 = new int[5];
    }

    @ObfuscatedName("du.c(II)[I")
    public final int[] method2286(int arg0, int arg1) {
        class206.method3550(field1647, 0, arg0);
        if (arg1 < 10) {
            return field1647;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1660.method2070();
        this.field1648.method2070();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1655 != null) {
            this.field1655.method2070();
            this.field1650.method2070();
            var5 = (int) ((double) (this.field1655.field1577 - this.field1655.field1575) * 32.768D / var3);
            var6 = (int) ((double) this.field1655.field1575 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1651 != null) {
            this.field1651.method2070();
            this.field1652.method2070();
            var8 = (int) ((double) (this.field1651.field1577 - this.field1651.field1575) * 32.768D / var3);
            var9 = (int) ((double) this.field1651.field1575 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1668[var11] != 0) {
                field1663[var11] = 0;
                field1669[var11] = (int) ((double) this.field1657[var11] * var3);
                field1649[var11] = (this.field1668[var11] << 14) / 100;
                field1666[var11] = (int) ((double) (this.field1660.field1577 - this.field1660.field1575) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1672[var11]) / var3);
                field1670[var11] = (int) ((double) this.field1660.field1575 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1660.method2069(arg0);
            int var14 = this.field1648.method2069(arg0);
            if (this.field1655 != null) {
                int var15 = this.field1655.method2069(arg0);
                int var16 = this.field1650.method2069(arg0);
                var13 += this.method2284(var7, var16, this.field1655.field1576) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1651 != null) {
                int var17 = this.field1651.method2069(arg0);
                int var18 = this.field1652.method2069(arg0);
                var14 = var14 * ((this.method2284(var10, var18, this.field1651.field1576) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1668[var19] != 0) {
                    int var20 = field1669[var19] + var12;
                    if (var20 < arg0) {
                        field1647[var20] += this.method2284(field1663[var19], field1649[var19] * var14 >> 15, this.field1660.field1576);
                        field1663[var19] += (field1666[var19] * var13 >> 16) + field1670[var19];
                    }
                }
            }
        }
        if (this.field1664 != null) {
            this.field1664.method2070();
            this.field1654.method2070();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1664.method2069(arg0);
                int var26 = this.field1654.method2069(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1664.field1577 - this.field1664.field1575) * var25 >> 8) + this.field1664.field1575;
                } else {
                    var27 = ((this.field1664.field1577 - this.field1664.field1575) * var26 >> 8) + this.field1664.field1575;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1647[var24] = 0;
                }
            }
        }
        if (this.field1658 > 0 && this.field1659 > 0) {
            int var28 = (int) ((double) this.field1658 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1647[var29] += field1647[var29 - var28] * this.field1659 / 100;
            }
        }
        if (this.field1671.field1633[0] > 0 || this.field1671.field1633[1] > 0) {
            this.field1661.method2070();
            int var30 = this.field1661.method2069(arg0 + 1);
            int var31 = this.field1671.method2277(0, (float) var30 / 65536.0F);
            int var32 = this.field1671.method2277(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1647[var31 + var33] * (long) Statics.field1635 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1647[var31 + var33 - 1 - var36] * (long) class117.field1634[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1647[var33 - 1 - var37] * (long) class117.field1634[1][var37] >> 16);
                    }
                    field1647[var33] = var35;
                    var30 = this.field1661.method2069(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1647[var31 + var33] * (long) Statics.field1635 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1647[var31 + var33 - 1 - var40] * (long) class117.field1634[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1647[var33 - 1 - var41] * (long) class117.field1634[1][var41] >> 16);
                        }
                        field1647[var33] = var39;
                        var30 = this.field1661.method2069(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1647[var31 + var33 - 1 - var43] * (long) class117.field1634[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1647[var33 - 1 - var44] * (long) class117.field1634[1][var44] >> 16);
                            }
                            field1647[var33] = var42;
                            this.field1661.method2069(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1671.method2277(0, (float) var30 / 65536.0F);
                    var32 = this.field1671.method2277(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1647[var46] < -32768) {
                field1647[var46] = -32768;
            }
            if (field1647[var46] > 32767) {
                field1647[var46] = 32767;
            }
        }
        return field1647;
    }

    @ObfuscatedName("du.i(III)I")
    public final int method2284(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1653[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1656[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("du.o(Lgp;)V")
    public final void method2285(class195 arg0) {
        this.field1660 = new class109();
        this.field1660.method2072(arg0);
        this.field1648 = new class109();
        this.field1648.method2072(arg0);
        int var2 = arg0.method3429();
        if (var2 != 0) {
            arg0.field2566--;
            this.field1655 = new class109();
            this.field1655.method2072(arg0);
            this.field1650 = new class109();
            this.field1650.method2072(arg0);
        }
        int var3 = arg0.method3429();
        if (var3 != 0) {
            arg0.field2566--;
            this.field1651 = new class109();
            this.field1651.method2072(arg0);
            this.field1652 = new class109();
            this.field1652.method2072(arg0);
        }
        int var4 = arg0.method3429();
        if (var4 != 0) {
            arg0.field2566--;
            this.field1664 = new class109();
            this.field1664.method2072(arg0);
            this.field1654 = new class109();
            this.field1654.method2072(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3239();
            if (var6 == 0) {
                break;
            }
            this.field1668[var5] = var6;
            this.field1672[var5] = arg0.method3238();
            this.field1657[var5] = arg0.method3239();
        }
        this.field1658 = arg0.method3239();
        this.field1659 = arg0.method3239();
        this.field1662 = arg0.method3218();
        this.field1665 = arg0.method3218();
        this.field1671 = new class117();
        this.field1661 = new class109();
        this.field1671.method2262(arg0, this.field1661);
    }
}
