package deob;

import java.util.Random;

@ObfuscatedName("dr")
public class class120 {

    @ObfuscatedName("dr.o")
    public class109 field1683;

    @ObfuscatedName("dr.k")
    public class109 field1667;

    @ObfuscatedName("dr.t")
    public class109 field1668;

    @ObfuscatedName("dr.d")
    public class109 field1669;

    @ObfuscatedName("dr.h")
    public class109 field1670;

    @ObfuscatedName("dr.m")
    public class109 field1671;

    @ObfuscatedName("dr.z")
    public class109 field1672;

    @ObfuscatedName("dr.i")
    public class109 field1673;

    @ObfuscatedName("dr.u")
    public int[] field1682 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.x")
    public int[] field1675 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.y")
    public int[] field1684 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.a")
    public int field1677 = 0;

    @ObfuscatedName("dr.w")
    public int field1678 = 100;

    @ObfuscatedName("dr.n")
    public class117 field1679;

    @ObfuscatedName("dr.l")
    public class109 field1691;

    @ObfuscatedName("dr.s")
    public int field1687 = 500;

    @ObfuscatedName("dr.v")
    public int field1676 = 0;

    @ObfuscatedName("dr.q")
    public static int[] field1680;

    @ObfuscatedName("dr.r")
    public static int[] field1666 = new int[32768];

    @ObfuscatedName("dr.j")
    public static int[] field1685;

    @ObfuscatedName("dr.g")
    public static int[] field1674;

    @ObfuscatedName("dr.f")
    public static int[] field1688;

    @ObfuscatedName("dr.p")
    public static int[] field1686;

    @ObfuscatedName("dr.e")
    public static int[] field1690;

    @ObfuscatedName("dr.c")
    public static int[] field1681;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1666[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1685 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1685[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1680 = new int[220500];
        field1674 = new int[5];
        field1688 = new int[5];
        field1686 = new int[5];
        field1690 = new int[5];
        field1681 = new int[5];
    }

    @ObfuscatedName("dr.o(II)[I")
    public final int[] method2284(int arg0, int arg1) {
        class206.method3529(field1680, 0, arg0);
        if (arg1 < 10) {
            return field1680;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1683.method2065();
        this.field1667.method2065();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1668 != null) {
            this.field1668.method2065();
            this.field1669.method2065();
            var5 = (int) ((double) (this.field1668.field1592 - this.field1668.field1588) * 32.768D / var3);
            var6 = (int) ((double) this.field1668.field1588 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1670 != null) {
            this.field1670.method2065();
            this.field1671.method2065();
            var8 = (int) ((double) (this.field1670.field1592 - this.field1670.field1588) * 32.768D / var3);
            var9 = (int) ((double) this.field1670.field1588 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1682[var11] != 0) {
                field1674[var11] = 0;
                field1688[var11] = (int) ((double) this.field1684[var11] * var3);
                field1686[var11] = (this.field1682[var11] << 14) / 100;
                field1690[var11] = (int) ((double) (this.field1683.field1592 - this.field1683.field1588) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1675[var11]) / var3);
                field1681[var11] = (int) ((double) this.field1683.field1588 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1683.method2066(arg0);
            int var14 = this.field1667.method2066(arg0);
            if (this.field1668 != null) {
                int var15 = this.field1668.method2066(arg0);
                int var16 = this.field1669.method2066(arg0);
                var13 += this.method2291(var7, var16, this.field1668.field1593) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1670 != null) {
                int var17 = this.field1670.method2066(arg0);
                int var18 = this.field1671.method2066(arg0);
                var14 = var14 * ((this.method2291(var10, var18, this.field1670.field1593) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1682[var19] != 0) {
                    int var20 = field1688[var19] + var12;
                    if (var20 < arg0) {
                        field1680[var20] += this.method2291(field1674[var19], field1686[var19] * var14 >> 15, this.field1683.field1593);
                        field1674[var19] += (field1690[var19] * var13 >> 16) + field1681[var19];
                    }
                }
            }
        }
        if (this.field1672 != null) {
            this.field1672.method2065();
            this.field1673.method2065();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1672.method2066(arg0);
                int var26 = this.field1673.method2066(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1672.field1592 - this.field1672.field1588) * var25 >> 8) + this.field1672.field1588;
                } else {
                    var27 = ((this.field1672.field1592 - this.field1672.field1588) * var26 >> 8) + this.field1672.field1588;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1680[var24] = 0;
                }
            }
        }
        if (this.field1677 > 0 && this.field1678 > 0) {
            int var28 = (int) ((double) this.field1677 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1680[var29] += field1680[var29 - var28] * this.field1678 / 100;
            }
        }
        if (this.field1679.field1653[0] > 0 || this.field1679.field1653[1] > 0) {
            this.field1691.method2065();
            int var30 = this.field1691.method2066(arg0 + 1);
            int var31 = this.field1679.method2266(0, (float) var30 / 65536.0F);
            int var32 = this.field1679.method2266(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1680[var31 + var33] * (long) Statics.field1654 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1680[var31 + var33 - 1 - var36] * (long) class117.field1652[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1680[var33 - 1 - var37] * (long) class117.field1652[1][var37] >> 16);
                    }
                    field1680[var33] = var35;
                    var30 = this.field1691.method2066(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1680[var31 + var33] * (long) Statics.field1654 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1680[var31 + var33 - 1 - var40] * (long) class117.field1652[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1680[var33 - 1 - var41] * (long) class117.field1652[1][var41] >> 16);
                        }
                        field1680[var33] = var39;
                        var30 = this.field1691.method2066(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1680[var31 + var33 - 1 - var43] * (long) class117.field1652[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1680[var33 - 1 - var44] * (long) class117.field1652[1][var44] >> 16);
                            }
                            field1680[var33] = var42;
                            this.field1691.method2066(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1679.method2266(0, (float) var30 / 65536.0F);
                    var32 = this.field1679.method2266(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1680[var46] < -32768) {
                field1680[var46] = -32768;
            }
            if (field1680[var46] > 32767) {
                field1680[var46] = 32767;
            }
        }
        return field1680;
    }

    @ObfuscatedName("dr.k(III)I")
    public final int method2291(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1685[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1666[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dr.t(Lgc;)V")
    public final void method2286(class195 arg0) {
        this.field1683 = new class109();
        this.field1683.method2063(arg0);
        this.field1667 = new class109();
        this.field1667.method2063(arg0);
        int var2 = arg0.method3205();
        if (var2 != 0) {
            arg0.field2575--;
            this.field1668 = new class109();
            this.field1668.method2063(arg0);
            this.field1669 = new class109();
            this.field1669.method2063(arg0);
        }
        int var3 = arg0.method3205();
        if (var3 != 0) {
            arg0.field2575--;
            this.field1670 = new class109();
            this.field1670.method2063(arg0);
            this.field1671 = new class109();
            this.field1671.method2063(arg0);
        }
        int var4 = arg0.method3205();
        if (var4 != 0) {
            arg0.field2575--;
            this.field1672 = new class109();
            this.field1672.method2063(arg0);
            this.field1673 = new class109();
            this.field1673.method2063(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3219();
            if (var6 == 0) {
                break;
            }
            this.field1682[var5] = var6;
            this.field1675[var5] = arg0.method3218();
            this.field1684[var5] = arg0.method3219();
        }
        this.field1677 = arg0.method3219();
        this.field1678 = arg0.method3219();
        this.field1687 = arg0.method3207();
        this.field1676 = arg0.method3207();
        this.field1679 = new class117();
        this.field1691 = new class109();
        this.field1679.method2267(arg0, this.field1691);
    }
}
