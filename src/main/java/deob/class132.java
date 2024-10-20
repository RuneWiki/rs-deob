package deob;

import java.util.Random;

@ObfuscatedName("be")
public class class132 {

    @ObfuscatedName("be.f")
    public int[] field1979 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.g")
    public class129 field1977;

    @ObfuscatedName("be.d")
    public static int[] field1973;

    @ObfuscatedName("be.e")
    public int[] field1991 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.b")
    public static int[] field1970;

    @ObfuscatedName("be.c")
    public static int[] field1990 = new int[32768];

    @ObfuscatedName("be.a")
    public static int[] field1994;

    @ObfuscatedName("be.n")
    public class129 field1981;

    @ObfuscatedName("be.o")
    public class129 field1972;

    @ObfuscatedName("be.l")
    public int field1982 = 100;

    @ObfuscatedName("be.m")
    public int field1986 = 0;

    @ObfuscatedName("be.j")
    public class129 field1995;

    @ObfuscatedName("be.k")
    public static int[] field1992;

    @ObfuscatedName("be.h")
    public class129 field1974;

    @ObfuscatedName("be.i")
    public class129 field1984;

    @ObfuscatedName("be.w")
    public class119 field1983;

    @ObfuscatedName("be.v")
    public static int[] field1978;

    @ObfuscatedName("be.u")
    public static int[] field1989;

    @ObfuscatedName("be.t")
    public class129 field1988;

    @ObfuscatedName("be.s")
    public int field1985 = 500;

    @ObfuscatedName("be.r")
    public class129 field1975;

    @ObfuscatedName("be.q")
    public static int[] field1993;

    @ObfuscatedName("be.p")
    public class129 field1971;

    @ObfuscatedName("be.z")
    public int field1987 = 0;

    @ObfuscatedName("be.x")
    public int[] field1980 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.p(III)I")
    public final int method2213(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1989[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1990[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1990[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1989 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1989[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1978 = new int[220500];
        field1970 = new int[5];
        field1992 = new int[5];
        field1993 = new int[5];
        field1973 = new int[5];
        field1994 = new int[5];
    }

    @ObfuscatedName("be.j(II)[I")
    public final int[] method2214(int arg0, int arg1) {
        class29.method333(field1978, 0, arg0);
        if (arg1 < 10) {
            return field1978;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1995.method2182();
        this.field1971.method2182();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1972 != null) {
            this.field1972.method2182();
            this.field1988.method2182();
            var5 = (int) ((double) (this.field1972.field1960 - this.field1972.field1958) * 32.768D / var3);
            var6 = (int) ((double) this.field1972.field1958 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1974 != null) {
            this.field1974.method2182();
            this.field1975.method2182();
            var8 = (int) ((double) (this.field1974.field1960 - this.field1974.field1958) * 32.768D / var3);
            var9 = (int) ((double) this.field1974.field1958 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1991[var11] != 0) {
                field1970[var11] = 0;
                field1992[var11] = (int) ((double) this.field1980[var11] * var3);
                field1993[var11] = (this.field1991[var11] << 14) / 100;
                field1973[var11] = (int) ((double) (this.field1995.field1960 - this.field1995.field1958) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1979[var11]) / var3);
                field1994[var11] = (int) ((double) this.field1995.field1958 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1995.method2191(arg0);
            int var14 = this.field1971.method2191(arg0);
            if (this.field1972 != null) {
                int var15 = this.field1972.method2191(arg0);
                int var16 = this.field1988.method2191(arg0);
                var13 += this.method2213(var7, var16, this.field1972.field1961) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1974 != null) {
                int var17 = this.field1974.method2191(arg0);
                int var18 = this.field1975.method2191(arg0);
                var14 = var14 * ((this.method2213(var10, var18, this.field1974.field1961) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1991[var19] != 0) {
                    int var20 = field1992[var19] + var12;
                    if (var20 < arg0) {
                        field1978[var20] += this.method2213(field1970[var19], field1993[var19] * var14 >> 15, this.field1995.field1961);
                        field1970[var19] += (field1973[var19] * var13 >> 16) + field1994[var19];
                    }
                }
            }
        }
        if (this.field1981 != null) {
            this.field1981.method2182();
            this.field1977.method2182();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1981.method2191(arg0);
                int var26 = this.field1977.method2191(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1981.field1960 - this.field1981.field1958) * var25 >> 8) + this.field1981.field1958;
                } else {
                    var27 = ((this.field1981.field1960 - this.field1981.field1958) * var26 >> 8) + this.field1981.field1958;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1978[var24] = 0;
                }
            }
        }
        if (this.field1987 > 0 && this.field1982 > 0) {
            int var28 = (int) ((double) this.field1987 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1978[var29] += field1978[var29 - var28] * this.field1982 / 100;
            }
        }
        if (this.field1983.field1828[0] > 0 || this.field1983.field1828[1] > 0) {
            this.field1984.method2182();
            int var30 = this.field1984.method2191(arg0 + 1);
            int var31 = this.field1983.method1991(0, (float) var30 / 65536.0F);
            int var32 = this.field1983.method1991(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1978[var31 + var33] * (long) Statics.field1832 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1978[var31 + var33 - 1 - var36] * (long) class119.field1830[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1978[var33 - 1 - var37] * (long) class119.field1830[1][var37] >> 16);
                    }
                    field1978[var33] = var35;
                    var30 = this.field1984.method2191(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1978[var31 + var33] * (long) Statics.field1832 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1978[var31 + var33 - 1 - var40] * (long) class119.field1830[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1978[var33 - 1 - var41] * (long) class119.field1830[1][var41] >> 16);
                        }
                        field1978[var33] = var39;
                        var30 = this.field1984.method2191(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1978[var31 + var33 - 1 - var43] * (long) class119.field1830[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1978[var33 - 1 - var44] * (long) class119.field1830[1][var44] >> 16);
                            }
                            field1978[var33] = var42;
                            this.field1984.method2191(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1983.method1991(0, (float) var30 / 65536.0F);
                    var32 = this.field1983.method1991(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1978[var46] < -32768) {
                field1978[var46] = -32768;
            }
            if (field1978[var46] > 32767) {
                field1978[var46] = 32767;
            }
        }
        return field1978;
    }

    @ObfuscatedName("be.o(Ldy;)V")
    public final void method2219(class31 arg0) {
        this.field1995 = new class129();
        this.field1995.method2183(arg0);
        this.field1971 = new class129();
        this.field1971.method2183(arg0);
        int var2 = arg0.method512();
        if (var2 != 0) {
            arg0.field172--;
            this.field1972 = new class129();
            this.field1972.method2183(arg0);
            this.field1988 = new class129();
            this.field1988.method2183(arg0);
        }
        int var3 = arg0.method512();
        if (var3 != 0) {
            arg0.field172--;
            this.field1974 = new class129();
            this.field1974.method2183(arg0);
            this.field1975 = new class129();
            this.field1975.method2183(arg0);
        }
        int var4 = arg0.method512();
        if (var4 != 0) {
            arg0.field172--;
            this.field1981 = new class129();
            this.field1981.method2183(arg0);
            this.field1977 = new class129();
            this.field1977.method2183(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method384();
            if (var6 == 0) {
                break;
            }
            this.field1991[var5] = var6;
            this.field1979[var5] = arg0.method421();
            this.field1980[var5] = arg0.method384();
        }
        this.field1987 = arg0.method384();
        this.field1982 = arg0.method384();
        this.field1985 = arg0.method373();
        this.field1986 = arg0.method373();
        this.field1983 = new class119();
        this.field1984 = new class129();
        this.field1983.method1987(arg0, this.field1984);
    }
}
