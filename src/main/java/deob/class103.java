package deob;

@ObfuscatedName("ct")
public class class103 extends class181 {

    @ObfuscatedName("ct.u")
    public byte[][] field1349;

    @ObfuscatedName("ct.f")
    public int field1342;

    @ObfuscatedName("ct.b")
    public int field1344;

    @ObfuscatedName("ct.g")
    public int field1367;

    @ObfuscatedName("ct.z")
    public int field1345;

    @ObfuscatedName("ct.p")
    public boolean field1341;

    @ObfuscatedName("ct.a")
    public static boolean field1358 = false;

    @ObfuscatedName("ct.d")
    public float[] field1359;

    @ObfuscatedName("ct.s")
    public int field1360;

    @ObfuscatedName("ct.t")
    public int field1361;

    @ObfuscatedName("ct.m")
    public boolean field1356;

    @ObfuscatedName("ct.ao")
    public byte[] field1343;

    @ObfuscatedName("ct.aw")
    public int field1373;

    @ObfuscatedName("ct.ak")
    public int field1372;

    @ObfuscatedName("ct.u(I)F")
    public static float method2194(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("ct.f([BI)V")
    public static void method2190(byte[] arg0, int arg1) {
        Statics.field1347 = arg0;
        Statics.field1348 = arg1;
        Statics.field1374 = 0;
    }

    @ObfuscatedName("ct.b()I")
    public static int method2177() {
        int var0 = Statics.field1347[Statics.field1348] >> Statics.field1374 & 0x1;
        Statics.field1374++;
        Statics.field1348 += Statics.field1374 >> 3;
        Statics.field1374 &= 0x7;
        return var0;
    }

    @ObfuscatedName("ct.g(I)I")
    public static int method2178(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1374) {
            int var3 = 8 - Statics.field1374;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1347[Statics.field1348] >> Statics.field1374 & var4) << var2;
            Statics.field1374 = 0;
            Statics.field1348++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1347[Statics.field1348] >> Statics.field1374 & var5) << var2;
            Statics.field1374 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("ct.z([B)V")
    public void method2202(byte[] arg0) {
        class300 var2 = new class300(arg0);
        this.field1342 = var2.method5277();
        this.field1344 = var2.method5277();
        this.field1367 = var2.method5277();
        this.field1345 = var2.method5277();
        if (this.field1345 < 0) {
            this.field1345 = ~this.field1345;
            this.field1341 = true;
        }
        int var3 = var2.method5277();
        this.field1349 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method5138();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method5228(var7, 0, var5);
            this.field1349[var4] = var7;
        }
    }

    @ObfuscatedName("ct.p([B)V")
    public static void method2183(byte[] arg0) {
        method2190(arg0, 0);
        Statics.field1350 = 0x1 << method2178(4);
        Statics.field1364 = 0x1 << method2178(4);
        Statics.field1363 = new float[Statics.field1364];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1350 : Statics.field1364;
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
            int var13 = class189.method3193(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class189.method692(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1346 = var6;
                Statics.field1365 = var8;
                Statics.field1366 = var10;
                Statics.field1370 = var12;
            } else {
                Statics.field1362 = var6;
                Statics.field1368 = var8;
                Statics.field1369 = var10;
                Statics.field1371 = var12;
            }
        }
        int var15 = method2178(8) + 1;
        Statics.field1352 = new class101[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1352[var16] = new class101();
        }
        int var17 = method2178(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2178(16);
        }
        int var19 = method2178(6) + 1;
        Statics.field1353 = new class105[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1353[var20] = new class105();
        }
        int var21 = method2178(6) + 1;
        Statics.field1354 = new class112[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1354[var22] = new class112();
        }
        int var23 = method2178(6) + 1;
        Statics.field1355 = new class117[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1355[var24] = new class117();
        }
        int var25 = method2178(6) + 1;
        Statics.field1351 = new boolean[var25];
        Statics.field1357 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1351[var26] = method2177() != 0;
            method2178(16);
            method2178(16);
            Statics.field1357[var26] = method2178(8);
        }
    }

    @ObfuscatedName("ct.h(I)[F")
    public float[] method2180(int arg0) {
        method2190(this.field1349[arg0], 0);
        method2177();
        int var2 = method2178(class189.method3193(Statics.field1357.length - 1));
        boolean var3 = Statics.field1351[var2];
        int var4 = var3 ? Statics.field1364 : Statics.field1350;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2177() != 0;
            var6 = method2177() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1350 >> 2);
            var9 = (Statics.field1350 >> 2) + (var4 >> 2);
            var10 = Statics.field1350 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1350 >> 2);
            var12 = (Statics.field1350 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1350 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class117 var14 = Statics.field1355[Statics.field1357[var2]];
        int var15 = var14.field1491;
        int var16 = var14.field1490[var15];
        boolean var17 = !Statics.field1353[var16].method2220();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1489; var19++) {
            class112 var20 = Statics.field1354[var14.field1488[var19]];
            float[] var21 = Statics.field1363;
            var20.method2324(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1491;
            int var23 = var14.field1490[var22];
            Statics.field1353[var23].method2227(Statics.field1363, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1363[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1363;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1362 : Statics.field1346;
            float[] var32 = var3 ? Statics.field1368 : Statics.field1365;
            float[] var33 = var3 ? Statics.field1369 : Statics.field1366;
            int[] var34 = var3 ? Statics.field1371 : Statics.field1370;
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
            int var47 = class189.method3193(var4 - 1);
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
                Statics.field1363[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1363[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1360 > 0) {
            int var91 = this.field1360 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1356) {
                for (int var92 = 0; var92 < this.field1361; var92++) {
                    int var93 = (this.field1360 >> 1) + var92;
                    var90[var92] += this.field1359[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1363[var94];
                }
            }
        }
        float[] var96 = this.field1359;
        this.field1359 = Statics.field1363;
        Statics.field1363 = var96;
        this.field1360 = var4;
        this.field1361 = var12 - (var4 >> 1);
        this.field1356 = var17;
        return var90;
    }

    @ObfuscatedName("ct.y(Lhf;)Z")
    public static boolean method2181(class234 arg0) {
        if (!field1358) {
            byte[] var1 = arg0.method3928(0, 0);
            if (var1 == null) {
                return false;
            }
            method2183(var1);
            field1358 = true;
        }
        return true;
    }

    @ObfuscatedName("ct.w(Lhf;II)Lct;")
    public static class103 method2185(class234 arg0, int arg1, int arg2) {
        if (method2181(arg0)) {
            byte[] var3 = arg0.method3928(arg1, arg2);
            return var3 == null ? null : new class103(var3);
        } else {
            arg0.method3897(arg1, arg2);
            return null;
        }
    }

    public class103(byte[] arg0) {
        this.method2202(arg0);
    }

    @ObfuscatedName("ct.i([I)Lcw;")
    public class104 method2184(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1343 == null) {
            this.field1360 = 0;
            this.field1359 = new float[Statics.field1364];
            this.field1343 = new byte[this.field1344];
            this.field1373 = 0;
            this.field1372 = 0;
        }
        while (this.field1372 < this.field1349.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2180(this.field1372);
            if (var2 != null) {
                int var3 = this.field1373;
                int var4 = var2.length;
                if (var4 > this.field1344 - var3) {
                    var4 = this.field1344 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1343[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1373;
                }
                this.field1373 = var3;
            }
            this.field1372++;
        }
        this.field1359 = null;
        byte[] var7 = this.field1343;
        this.field1343 = null;
        return new class104(this.field1342, var7, this.field1367, this.field1345, this.field1341);
    }
}
