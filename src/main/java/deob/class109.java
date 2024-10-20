package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class109 {

    @ObfuscatedName("bw.f")
    public class124 field1823;

    @ObfuscatedName("bw.g")
    public int field1827 = 0;

    @ObfuscatedName("bw.d")
    public class124 field1821;

    @ObfuscatedName("bw.e")
    public class162 field1829;

    @ObfuscatedName("bw.b")
    public class124 field1839;

    @ObfuscatedName("bw.c")
    public static int[] field1840;

    @ObfuscatedName("bw.a")
    public static int[] field1837;

    @ObfuscatedName("bw.n")
    public static int[] field1834 = new int[32768];

    @ObfuscatedName("bw.o")
    public int field1828 = 100;

    @ObfuscatedName("bw.l")
    public class124 field1816;

    @ObfuscatedName("bw.m")
    public static int[] field1818;

    @ObfuscatedName("bw.j")
    public int[] field1825 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.k")
    public class124 field1841;

    @ObfuscatedName("bw.h")
    public class124 field1817;

    @ObfuscatedName("bw.i")
    public int field1832 = 0;

    @ObfuscatedName("bw.w")
    public class124 field1820;

    @ObfuscatedName("bw.v")
    public static int[] field1835;

    @ObfuscatedName("bw.u")
    public static int[] field1838;

    @ObfuscatedName("bw.t")
    public class124 field1826;

    @ObfuscatedName("bw.s")
    public int[] field1824 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.r")
    public static int[] field1833;

    @ObfuscatedName("bw.q")
    public class124 field1830;

    @ObfuscatedName("bw.p")
    public static int[] field1822;

    @ObfuscatedName("bw.z")
    public int field1831 = 500;

    @ObfuscatedName("bw.x")
    public int[] field1819 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.h(III)I")
    public final int method1985(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1838[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1834[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.b(II)[I")
    public final int[] method1986(int arg0, int arg1) {
        class47.method616(field1833, 0, arg0);
        if (arg1 < 10) {
            return field1833;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1839.method2197();
        this.field1817.method2197();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1841 != null) {
            this.field1841.method2197();
            this.field1820.method2197();
            var5 = (int) ((double) (this.field1841.field1990 - this.field1841.field1993) * 32.768D / var3);
            var6 = (int) ((double) this.field1841.field1993 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1826 != null) {
            this.field1826.method2197();
            this.field1821.method2197();
            var8 = (int) ((double) (this.field1826.field1990 - this.field1826.field1993) * 32.768D / var3);
            var9 = (int) ((double) this.field1826.field1993 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1824[var11] != 0) {
                field1837[var11] = 0;
                field1822[var11] = (int) ((double) this.field1819[var11] * var3);
                field1818[var11] = (this.field1824[var11] << 14) / 100;
                field1840[var11] = (int) ((double) (this.field1839.field1990 - this.field1839.field1993) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1825[var11]) / var3);
                field1835[var11] = (int) ((double) this.field1839.field1993 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1839.method2198(arg0);
            int var14 = this.field1817.method2198(arg0);
            if (this.field1841 != null) {
                int var15 = this.field1841.method2198(arg0);
                int var16 = this.field1820.method2198(arg0);
                var13 += this.method1985(var7, var16, this.field1841.field1991) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1826 != null) {
                int var17 = this.field1826.method2198(arg0);
                int var18 = this.field1821.method2198(arg0);
                var14 = var14 * ((this.method1985(var10, var18, this.field1826.field1991) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1824[var19] != 0) {
                    int var20 = field1822[var19] + var12;
                    if (var20 < arg0) {
                        field1833[var20] += this.method1985(field1837[var19], field1818[var19] * var14 >> 15, this.field1839.field1991);
                        field1837[var19] += (field1840[var19] * var13 >> 16) + field1835[var19];
                    }
                }
            }
        }
        if (this.field1816 != null) {
            this.field1816.method2197();
            this.field1823.method2197();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1816.method2198(arg0);
                int var26 = this.field1823.method2198(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1816.field1990 - this.field1816.field1993) * var25 >> 8) + this.field1816.field1993;
                } else {
                    var27 = ((this.field1816.field1990 - this.field1816.field1993) * var26 >> 8) + this.field1816.field1993;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1833[var24] = 0;
                }
            }
        }
        if (this.field1827 > 0 && this.field1828 > 0) {
            int var28 = (int) ((double) this.field1827 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1833[var29] += field1833[var29 - var28] * this.field1828 / 100;
            }
        }
        if (this.field1829.field2419[0] > 0 || this.field1829.field2419[1] > 0) {
            this.field1830.method2197();
            int var30 = this.field1830.method2198(arg0 + 1);
            int var31 = this.field1829.method2781(0, (float) var30 / 65536.0F);
            int var32 = this.field1829.method2781(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1833[var31 + var33] * (long) Statics.field2426 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1833[var31 + var33 - 1 - var36] * (long) class162.field2429[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1833[var33 - 1 - var37] * (long) class162.field2429[1][var37] >> 16);
                    }
                    field1833[var33] = var35;
                    var30 = this.field1830.method2198(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1833[var31 + var33] * (long) Statics.field2426 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1833[var31 + var33 - 1 - var40] * (long) class162.field2429[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1833[var33 - 1 - var41] * (long) class162.field2429[1][var41] >> 16);
                        }
                        field1833[var33] = var39;
                        var30 = this.field1830.method2198(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1833[var31 + var33 - 1 - var43] * (long) class162.field2429[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1833[var33 - 1 - var44] * (long) class162.field2429[1][var44] >> 16);
                            }
                            field1833[var33] = var42;
                            this.field1830.method2198(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1829.method2781(0, (float) var30 / 65536.0F);
                    var32 = this.field1829.method2781(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1833[var46] < -32768) {
                field1833[var46] = -32768;
            }
            if (field1833[var46] > 32767) {
                field1833[var46] = 32767;
            }
        }
        return field1833;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1834[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1838 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1838[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1833 = new int[220500];
        field1837 = new int[5];
        field1822 = new int[5];
        field1818 = new int[5];
        field1840 = new int[5];
        field1835 = new int[5];
    }

    @ObfuscatedName("bw.k(Ldp;)V")
    public final void method1995(class50 arg0) {
        this.field1839 = new class124();
        this.field1839.method2195(arg0);
        this.field1817 = new class124();
        this.field1817.method2195(arg0);
        int var2 = arg0.method726();
        if (var2 != 0) {
            arg0.field540--;
            this.field1841 = new class124();
            this.field1841.method2195(arg0);
            this.field1820 = new class124();
            this.field1820.method2195(arg0);
        }
        int var3 = arg0.method726();
        if (var3 != 0) {
            arg0.field540--;
            this.field1826 = new class124();
            this.field1826.method2195(arg0);
            this.field1821 = new class124();
            this.field1821.method2195(arg0);
        }
        int var4 = arg0.method726();
        if (var4 != 0) {
            arg0.field540--;
            this.field1816 = new class124();
            this.field1816.method2195(arg0);
            this.field1823 = new class124();
            this.field1823.method2195(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method754();
            if (var6 == 0) {
                break;
            }
            this.field1824[var5] = var6;
            this.field1825[var5] = arg0.method692();
            this.field1819[var5] = arg0.method754();
        }
        this.field1827 = arg0.method754();
        this.field1828 = arg0.method754();
        this.field1831 = arg0.method720();
        this.field1832 = arg0.method720();
        this.field1829 = new class162();
        this.field1830 = new class124();
        this.field1829.method2795(arg0, this.field1830);
    }
}
