package deob;

import java.util.Random;

@ObfuscatedName("dk")
public class class120 {

    @ObfuscatedName("dk.d")
    public class109 field1671;

    @ObfuscatedName("dk.z")
    public class109 field1648;

    @ObfuscatedName("dk.n")
    public class109 field1649;

    @ObfuscatedName("dk.r")
    public class109 field1650;

    @ObfuscatedName("dk.e")
    public class109 field1656;

    @ObfuscatedName("dk.y")
    public class109 field1652;

    @ObfuscatedName("dk.k")
    public class109 field1653;

    @ObfuscatedName("dk.s")
    public class109 field1654;

    @ObfuscatedName("dk.p")
    public int[] field1663 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.x")
    public int[] field1661 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.m")
    public int[] field1657 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.h")
    public int field1658 = 0;

    @ObfuscatedName("dk.t")
    public int field1659 = 100;

    @ObfuscatedName("dk.i")
    public class117 field1660;

    @ObfuscatedName("dk.u")
    public class109 field1651;

    @ObfuscatedName("dk.q")
    public int field1655 = 500;

    @ObfuscatedName("dk.v")
    public int field1662 = 0;

    @ObfuscatedName("dk.f")
    public static int[] field1664;

    @ObfuscatedName("dk.b")
    public static int[] field1665 = new int[32768];

    @ObfuscatedName("dk.c")
    public static int[] field1666;

    @ObfuscatedName("dk.l")
    public static int[] field1668;

    @ObfuscatedName("dk.g")
    public static int[] field1669;

    @ObfuscatedName("dk.w")
    public static int[] field1670;

    @ObfuscatedName("dk.o")
    public static int[] field1647;

    @ObfuscatedName("dk.a")
    public static int[] field1672;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1665[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1666 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1666[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1664 = new int[220500];
        field1668 = new int[5];
        field1669 = new int[5];
        field1670 = new int[5];
        field1647 = new int[5];
        field1672 = new int[5];
    }

    @ObfuscatedName("dk.d(II)[I")
    public final int[] method2336(int arg0, int arg1) {
        class206.method3629(field1664, 0, arg0);
        if (arg1 < 10) {
            return field1664;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1671.method2118();
        this.field1648.method2118();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1649 != null) {
            this.field1649.method2118();
            this.field1650.method2118();
            var5 = (int) ((double) (this.field1649.field1577 - this.field1649.field1576) * 32.768D / var3);
            var6 = (int) ((double) this.field1649.field1576 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1656 != null) {
            this.field1656.method2118();
            this.field1652.method2118();
            var8 = (int) ((double) (this.field1656.field1577 - this.field1656.field1576) * 32.768D / var3);
            var9 = (int) ((double) this.field1656.field1576 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1663[var11] != 0) {
                field1668[var11] = 0;
                field1669[var11] = (int) ((double) this.field1657[var11] * var3);
                field1670[var11] = (this.field1663[var11] << 14) / 100;
                field1647[var11] = (int) ((double) (this.field1671.field1577 - this.field1671.field1576) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1661[var11]) / var3);
                field1672[var11] = (int) ((double) this.field1671.field1576 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1671.method2119(arg0);
            int var14 = this.field1648.method2119(arg0);
            if (this.field1649 != null) {
                int var15 = this.field1649.method2119(arg0);
                int var16 = this.field1650.method2119(arg0);
                var13 += this.method2337(var7, var16, this.field1649.field1578) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1656 != null) {
                int var17 = this.field1656.method2119(arg0);
                int var18 = this.field1652.method2119(arg0);
                var14 = var14 * ((this.method2337(var10, var18, this.field1656.field1578) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1663[var19] != 0) {
                    int var20 = field1669[var19] + var12;
                    if (var20 < arg0) {
                        field1664[var20] += this.method2337(field1668[var19], field1670[var19] * var14 >> 15, this.field1671.field1578);
                        field1668[var19] += (field1647[var19] * var13 >> 16) + field1672[var19];
                    }
                }
            }
        }
        if (this.field1653 != null) {
            this.field1653.method2118();
            this.field1654.method2118();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1653.method2119(arg0);
                int var26 = this.field1654.method2119(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1653.field1577 - this.field1653.field1576) * var25 >> 8) + this.field1653.field1576;
                } else {
                    var27 = ((this.field1653.field1577 - this.field1653.field1576) * var26 >> 8) + this.field1653.field1576;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1664[var24] = 0;
                }
            }
        }
        if (this.field1658 > 0 && this.field1659 > 0) {
            int var28 = (int) ((double) this.field1658 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1664[var29] += field1664[var29 - var28] * this.field1659 / 100;
            }
        }
        if (this.field1660.field1635[0] > 0 || this.field1660.field1635[1] > 0) {
            this.field1651.method2118();
            int var30 = this.field1651.method2119(arg0 + 1);
            int var31 = this.field1660.method2319(0, (float) var30 / 65536.0F);
            int var32 = this.field1660.method2319(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1664[var31 + var33] * (long) Statics.field1632 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1664[var31 + var33 - 1 - var36] * (long) class117.field1638[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1664[var33 - 1 - var37] * (long) class117.field1638[1][var37] >> 16);
                    }
                    field1664[var33] = var35;
                    var30 = this.field1651.method2119(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1664[var31 + var33] * (long) Statics.field1632 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1664[var31 + var33 - 1 - var40] * (long) class117.field1638[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1664[var33 - 1 - var41] * (long) class117.field1638[1][var41] >> 16);
                        }
                        field1664[var33] = var39;
                        var30 = this.field1651.method2119(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1664[var31 + var33 - 1 - var43] * (long) class117.field1638[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1664[var33 - 1 - var44] * (long) class117.field1638[1][var44] >> 16);
                            }
                            field1664[var33] = var42;
                            this.field1651.method2119(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1660.method2319(0, (float) var30 / 65536.0F);
                    var32 = this.field1660.method2319(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1664[var46] < -32768) {
                field1664[var46] = -32768;
            }
            if (field1664[var46] > 32767) {
                field1664[var46] = 32767;
            }
        }
        return field1664;
    }

    @ObfuscatedName("dk.z(III)I")
    public final int method2337(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1666[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1665[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dk.n(Lgy;)V")
    public final void method2338(class195 arg0) {
        this.field1671 = new class109();
        this.field1671.method2116(arg0);
        this.field1648 = new class109();
        this.field1648.method2116(arg0);
        int var2 = arg0.method3330();
        if (var2 != 0) {
            arg0.field2568--;
            this.field1649 = new class109();
            this.field1649.method2116(arg0);
            this.field1650 = new class109();
            this.field1650.method2116(arg0);
        }
        int var3 = arg0.method3330();
        if (var3 != 0) {
            arg0.field2568--;
            this.field1656 = new class109();
            this.field1656.method2116(arg0);
            this.field1652 = new class109();
            this.field1652.method2116(arg0);
        }
        int var4 = arg0.method3330();
        if (var4 != 0) {
            arg0.field2568--;
            this.field1653 = new class109();
            this.field1653.method2116(arg0);
            this.field1654 = new class109();
            this.field1654.method2116(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3380();
            if (var6 == 0) {
                break;
            }
            this.field1663[var5] = var6;
            this.field1661[var5] = arg0.method3272();
            this.field1657[var5] = arg0.method3380();
        }
        this.field1658 = arg0.method3380();
        this.field1659 = arg0.method3380();
        this.field1655 = arg0.method3269();
        this.field1662 = arg0.method3269();
        this.field1660 = new class117();
        this.field1651 = new class109();
        this.field1660.method2327(arg0, this.field1651);
    }
}
