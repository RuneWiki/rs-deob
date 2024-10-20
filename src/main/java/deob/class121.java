package deob;

@ObfuscatedName("bj")
public class class121 extends class17 {

    @ObfuscatedName("bj.d")
    public boolean field1949;

    @ObfuscatedName("bj.b")
    public byte[][] field1950;

    @ObfuscatedName("bj.a")
    public boolean field1944;

    @ObfuscatedName("bj.n")
    public float[] field1946;

    @ObfuscatedName("bj.k")
    public int field1964;

    @ObfuscatedName("bj.h")
    public int field1945;

    @ObfuscatedName("bj.w")
    public int field1975;

    @ObfuscatedName("bj.u")
    public int field1963;

    @ObfuscatedName("bj.t")
    public int field1948;

    @ObfuscatedName("bj.r")
    public static boolean field1961 = false;

    @ObfuscatedName("bj.y")
    public int field1973;

    @ObfuscatedName("bj.ar")
    public int field1976;

    @ObfuscatedName("bj.ai")
    public int field1977;

    @ObfuscatedName("bj.ab")
    public byte[] field1959;

    @ObfuscatedName("bj.t([B)V")
    public void method2136(byte[] arg0) {
        class50 var2 = new class50(arg0);
        this.field1945 = var2.method685();
        this.field1964 = var2.method685();
        this.field1975 = var2.method685();
        this.field1948 = var2.method685();
        if (this.field1948 < 0) {
            this.field1948 = ~this.field1948;
            this.field1949 = true;
        }
        int var3 = var2.method685();
        this.field1950 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method726();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method691(var7, 0, var5);
            this.field1950[var4] = var7;
        }
    }

    @ObfuscatedName("bj.d([B)V")
    public static void method2137(byte[] arg0) {
        method2146(arg0, 0);
        Statics.field1953 = 0x1 << method2139(4);
        Statics.field1954 = 0x1 << method2139(4);
        Statics.field1966 = new float[Statics.field1954];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1953 : Statics.field1954;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class26.method2515(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                int var17 = var14;
                int var18 = var13;
                int var19 = 0;
                while (var18 > 0) {
                    var19 = var19 << 1 | var17 & 0x1;
                    var17 >>>= 0x1;
                    var18--;
                }
                var12[var14] = var19;
            }
            if (var1 == 0) {
                Statics.field1967 = var6;
                Statics.field1968 = var8;
                Statics.field1969 = var10;
                Statics.field1962 = var12;
            } else {
                Statics.field1970 = var6;
                Statics.field1971 = var8;
                Statics.field1972 = var10;
                Statics.field1974 = var12;
            }
        }
        int var21 = method2139(8) + 1;
        Statics.field1955 = new class122[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1955[var22] = new class122();
        }
        int var23 = method2139(6) + 1;
        for (int var24 = 0; var24 < var23; var24++) {
            method2139(16);
        }
        int var25 = method2139(6) + 1;
        Statics.field1952 = new class186[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1952[var26] = new class186();
        }
        int var27 = method2139(6) + 1;
        Statics.field1957 = new class132[var27];
        for (int var28 = 0; var28 < var27; var28++) {
            Statics.field1957[var28] = new class132();
        }
        int var29 = method2139(6) + 1;
        Statics.field1958 = new class174[var29];
        for (int var30 = 0; var30 < var29; var30++) {
            Statics.field1958[var30] = new class174();
        }
        int var31 = method2139(6) + 1;
        Statics.field1956 = new boolean[var31];
        Statics.field1960 = new int[var31];
        for (int var32 = 0; var32 < var31; var32++) {
            Statics.field1956[var32] = method2150() != 0;
            method2139(16);
            method2139(16);
            Statics.field1960[var32] = method2139(8);
        }
    }

    @ObfuscatedName("bj.w(I)I")
    public static int method2139(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1947) {
            int var3 = 8 - Statics.field1947;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1965[Statics.field1951] >> Statics.field1947 & var4) << var2;
            Statics.field1947 = 0;
            Statics.field1951++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1965[Statics.field1951] >> Statics.field1947 & var5) << var2;
            Statics.field1947 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("bj.l(I)[F")
    public float[] method2140(int arg0) {
        method2146(this.field1950[arg0], 0);
        method2150();
        int var2 = method2139(class26.method2515(Statics.field1960.length - 1));
        boolean var3 = Statics.field1956[var2];
        int var4 = var3 ? Statics.field1954 : Statics.field1953;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2150() != 0;
            var6 = method2150() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1953 >> 2);
            var9 = (Statics.field1953 >> 2) + (var4 >> 2);
            var10 = Statics.field1953 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1953 >> 2);
            var12 = (Statics.field1953 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1953 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class174 var14 = Statics.field1958[Statics.field1960[var2]];
        int var15 = var14.field2589;
        int var16 = var14.field2591[var15];
        boolean var17 = !Statics.field1952[var16].method3403();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2590; var19++) {
            class132 var20 = Statics.field1957[var14.field2592[var19]];
            float[] var21 = Statics.field1966;
            var20.method2310(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2589;
            int var23 = var14.field2591[var22];
            Statics.field1952[var23].method3409(Statics.field1966, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1966[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1966;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1970 : Statics.field1967;
            float[] var32 = var3 ? Statics.field1971 : Statics.field1968;
            float[] var33 = var3 ? Statics.field1972 : Statics.field1969;
            int[] var34 = var3 ? Statics.field1974 : Statics.field1962;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - 4 - var40 * 4];
                float var46 = var31[var25 - 3 - var40 * 4];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class26.method2515(var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - 1 - var55];
                        float var57 = var28[var52 - 3 - var55];
                        float var58 = var28[var53 - 1 - var55];
                        float var59 = var28[var53 - 3 - var55];
                        var28[var52 - 1 - var55] = var56 + var58;
                        var28[var52 - 3 - var55] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - 1 - var55] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - 3 - var55] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - 1 - var71 * 2] = var28[var71 * 4];
                var28[var4 - 2 - var71 * 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - 1 - var71 * 2] = var28[var71 * 4 + 2];
                var28[var4 - var26 - 2 - var71 * 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - 2 - var72 * 2];
                float var78 = var28[var4 - 1 - var72 * 2];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - 2 - var72 * 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 - var78 + var80) * 0.5F;
                var28[var4 - 1 - var72 * 2] = (-var76 + var78 + var80) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + 1 + var25];
                var28[var25 - 1 - var81] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + 1 + var25];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 - var26 + var82] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                Statics.field1966[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1966[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1963 > 0) {
            int var91 = this.field1963 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1944) {
                for (int var92 = 0; var92 < this.field1973; var92++) {
                    int var93 = (this.field1963 >> 1) + var92;
                    var90[var92] += this.field1946[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1966[var94];
                }
            }
        }
        float[] var96 = this.field1946;
        this.field1946 = Statics.field1966;
        Statics.field1966 = var96;
        this.field1963 = var4;
        this.field1973 = var12 - (var4 >> 1);
        this.field1944 = var17;
        return var90;
    }

    public class121(byte[] arg0) {
        this.method2136(arg0);
    }

    @ObfuscatedName("bj.h([BI)V")
    public static void method2146(byte[] arg0, int arg1) {
        Statics.field1965 = arg0;
        Statics.field1951 = arg1;
        Statics.field1947 = 0;
    }

    @ObfuscatedName("bj.k()I")
    public static int method2150() {
        int var0 = Statics.field1965[Statics.field1951] >> Statics.field1947 & 0x1;
        Statics.field1947++;
        Statics.field1951 += Statics.field1947 >> 3;
        Statics.field1947 &= 0x7;
        return var0;
    }

    @ObfuscatedName("bj.s(Lek;II)Lbj;")
    public static class121 method2153(class89 arg0, int arg1, int arg2) {
        if (method2168(arg0)) {
            byte[] var3 = arg0.method1266(arg1, arg2);
            return var3 == null ? null : new class121(var3);
        } else {
            arg0.method1268(arg1, arg2);
            return null;
        }
    }

    @ObfuscatedName("bj.j([I)Lbq;")
    public class120 method2164(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1959 == null) {
            this.field1963 = 0;
            this.field1946 = new float[Statics.field1954];
            this.field1959 = new byte[this.field1964];
            this.field1976 = 0;
            this.field1977 = 0;
        }
        while (this.field1977 < this.field1950.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2140(this.field1977);
            if (var2 != null) {
                int var3 = this.field1976;
                int var4 = var2.length;
                if (var4 > this.field1964 - var3) {
                    var4 = this.field1964 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1959[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1976;
                }
                this.field1976 = var3;
            }
            this.field1977++;
        }
        this.field1946 = null;
        byte[] var7 = this.field1959;
        this.field1959 = null;
        return new class120(this.field1945, var7, this.field1975, this.field1948, this.field1949);
    }

    @ObfuscatedName("bj.f(Lek;)Z")
    public static boolean method2168(class89 arg0) {
        if (!field1961) {
            byte[] var1 = arg0.method1266(0, 0);
            if (var1 == null) {
                return false;
            }
            method2137(var1);
            field1961 = true;
        }
        return true;
    }

    @ObfuscatedName("bj.b(I)F")
    public static float method2171(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
