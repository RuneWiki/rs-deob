package deob;

import java.util.Random;

@ObfuscatedName("dr")
public class class124 {

    @ObfuscatedName("dr.d")
    public class113 field1730;

    @ObfuscatedName("dr.q")
    public class113 field1736;

    @ObfuscatedName("dr.x")
    public class113 field1717;

    @ObfuscatedName("dr.y")
    public class113 field1718;

    @ObfuscatedName("dr.e")
    public class113 field1725;

    @ObfuscatedName("dr.f")
    public class113 field1720;

    @ObfuscatedName("dr.v")
    public class113 field1721;

    @ObfuscatedName("dr.t")
    public class113 field1722;

    @ObfuscatedName("dr.i")
    public int[] field1723 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.r")
    public int[] field1739 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.g")
    public int[] field1715 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dr.s")
    public int field1724 = 0;

    @ObfuscatedName("dr.o")
    public int field1727 = 100;

    @ObfuscatedName("dr.p")
    public class121 field1728;

    @ObfuscatedName("dr.u")
    public class113 field1729;

    @ObfuscatedName("dr.b")
    public int field1716 = 500;

    @ObfuscatedName("dr.w")
    public int field1731 = 0;

    @ObfuscatedName("dr.k")
    public static int[] field1732;

    @ObfuscatedName("dr.n")
    public static int[] field1726 = new int[32768];

    @ObfuscatedName("dr.c")
    public static int[] field1734;

    @ObfuscatedName("dr.m")
    public static int[] field1719;

    @ObfuscatedName("dr.a")
    public static int[] field1737;

    @ObfuscatedName("dr.h")
    public static int[] field1738;

    @ObfuscatedName("dr.z")
    public static int[] field1733;

    @ObfuscatedName("dr.j")
    public static int[] field1740;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1726[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1734 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1734[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1732 = new int[220500];
        field1719 = new int[5];
        field1737 = new int[5];
        field1738 = new int[5];
        field1733 = new int[5];
        field1740 = new int[5];
    }

    @ObfuscatedName("dr.d(II)[I")
    public final int[] method2150(int arg0, int arg1) {
        class184.method3208(field1732, 0, arg0);
        if (arg1 < 10) {
            return field1732;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1730.method1945();
        this.field1736.method1945();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1717 != null) {
            this.field1717.method1945();
            this.field1718.method1945();
            var5 = (int) ((double) (this.field1717.field1645 - this.field1717.field1646) * 32.768D / var3);
            var6 = (int) ((double) this.field1717.field1646 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1725 != null) {
            this.field1725.method1945();
            this.field1720.method1945();
            var8 = (int) ((double) (this.field1725.field1645 - this.field1725.field1646) * 32.768D / var3);
            var9 = (int) ((double) this.field1725.field1646 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1723[var11] != 0) {
                field1719[var11] = 0;
                field1737[var11] = (int) ((double) this.field1715[var11] * var3);
                field1738[var11] = (this.field1723[var11] << 14) / 100;
                field1733[var11] = (int) ((double) (this.field1730.field1645 - this.field1730.field1646) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1739[var11]) / var3);
                field1740[var11] = (int) ((double) this.field1730.field1646 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1730.method1955(arg0);
            int var14 = this.field1736.method1955(arg0);
            if (this.field1717 != null) {
                int var15 = this.field1717.method1955(arg0);
                int var16 = this.field1718.method1955(arg0);
                var13 += this.method2149(var7, var16, this.field1717.field1641) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1725 != null) {
                int var17 = this.field1725.method1955(arg0);
                int var18 = this.field1720.method1955(arg0);
                var14 = var14 * ((this.method2149(var10, var18, this.field1725.field1641) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1723[var19] != 0) {
                    int var20 = field1737[var19] + var12;
                    if (var20 < arg0) {
                        field1732[var20] += this.method2149(field1719[var19], field1738[var19] * var14 >> 15, this.field1730.field1641);
                        field1719[var19] += (field1733[var19] * var13 >> 16) + field1740[var19];
                    }
                }
            }
        }
        if (this.field1721 != null) {
            this.field1721.method1945();
            this.field1722.method1945();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1721.method1955(arg0);
                int var26 = this.field1722.method1955(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1721.field1645 - this.field1721.field1646) * var25 >> 8) + this.field1721.field1646;
                } else {
                    var27 = ((this.field1721.field1645 - this.field1721.field1646) * var26 >> 8) + this.field1721.field1646;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1732[var24] = 0;
                }
            }
        }
        if (this.field1724 > 0 && this.field1727 > 0) {
            int var28 = (int) ((double) this.field1724 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1732[var29] += field1732[var29 - var28] * this.field1727 / 100;
            }
        }
        if (this.field1728.field1704[0] > 0 || this.field1728.field1704[1] > 0) {
            this.field1729.method1945();
            int var30 = this.field1729.method1955(arg0 + 1);
            int var31 = this.field1728.method2126(0, (float) var30 / 65536.0F);
            int var32 = this.field1728.method2126(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1732[var31 + var33] * (long) Statics.field1703 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1732[var31 + var33 - 1 - var36] * (long) class121.field1701[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1732[var33 - 1 - var37] * (long) class121.field1701[1][var37] >> 16);
                    }
                    field1732[var33] = var35;
                    var30 = this.field1729.method1955(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1732[var31 + var33] * (long) Statics.field1703 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1732[var31 + var33 - 1 - var40] * (long) class121.field1701[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1732[var33 - 1 - var41] * (long) class121.field1701[1][var41] >> 16);
                        }
                        field1732[var33] = var39;
                        var30 = this.field1729.method1955(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1732[var31 + var33 - 1 - var43] * (long) class121.field1701[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1732[var33 - 1 - var44] * (long) class121.field1701[1][var44] >> 16);
                            }
                            field1732[var33] = var42;
                            this.field1729.method1955(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1728.method2126(0, (float) var30 / 65536.0F);
                    var32 = this.field1728.method2126(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1732[var46] < -32768) {
                field1732[var46] = -32768;
            }
            if (field1732[var46] > 32767) {
                field1732[var46] = 32767;
            }
        }
        return field1732;
    }

    @ObfuscatedName("dr.q(III)I")
    public final int method2149(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1734[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1726[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dr.x(Lfw;)V")
    public final void method2146(class174 arg0) {
        this.field1730 = new class113();
        this.field1730.method1942(arg0);
        this.field1736 = new class113();
        this.field1736.method1942(arg0);
        int var2 = arg0.method2921();
        if (var2 != 0) {
            arg0.field2364--;
            this.field1717 = new class113();
            this.field1717.method1942(arg0);
            this.field1718 = new class113();
            this.field1718.method1942(arg0);
        }
        int var3 = arg0.method2921();
        if (var3 != 0) {
            arg0.field2364--;
            this.field1725 = new class113();
            this.field1725.method1942(arg0);
            this.field1720 = new class113();
            this.field1720.method1942(arg0);
        }
        int var4 = arg0.method2921();
        if (var4 != 0) {
            arg0.field2364--;
            this.field1721 = new class113();
            this.field1721.method1942(arg0);
            this.field1722 = new class113();
            this.field1722.method1942(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2927();
            if (var6 == 0) {
                break;
            }
            this.field1723[var5] = var6;
            this.field1739[var5] = arg0.method2926();
            this.field1715[var5] = arg0.method2927();
        }
        this.field1724 = arg0.method2927();
        this.field1727 = arg0.method2927();
        this.field1716 = arg0.method2916();
        this.field1731 = arg0.method2916();
        this.field1728 = new class121();
        this.field1729 = new class113();
        this.field1728.method2127(arg0, this.field1729);
    }
}
