package deob;

@ObfuscatedName("cy")
public class class103 extends class181 {

    @ObfuscatedName("cy.c")
    public byte[][] field1350;

    @ObfuscatedName("cy.x")
    public int field1322;

    @ObfuscatedName("cy.t")
    public int field1327;

    @ObfuscatedName("cy.g")
    public int field1321;

    @ObfuscatedName("cy.l")
    public int field1328;

    @ObfuscatedName("cy.u")
    public boolean field1326;

    @ObfuscatedName("cy.q")
    public static boolean field1324 = false;

    @ObfuscatedName("cy.y")
    public float[] field1339;

    @ObfuscatedName("cy.r")
    public int field1340;

    @ObfuscatedName("cy.k")
    public int field1341;

    @ObfuscatedName("cy.w")
    public boolean field1338;

    @ObfuscatedName("cy.al")
    public byte[] field1352;

    @ObfuscatedName("cy.as")
    public int field1353;

    @ObfuscatedName("cy.ad")
    public int field1354;

    @ObfuscatedName("cy.c(I)F")
    public static float method2205(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cy.x([BI)V")
    public static void method2182(byte[] arg0, int arg1) {
        Statics.field1335 = arg0;
        Statics.field1323 = arg1;
        Statics.field1329 = 0;
    }

    @ObfuscatedName("cy.t()I")
    public static int method2194() {
        int var0 = Statics.field1335[Statics.field1323] >> Statics.field1329 & 0x1;
        Statics.field1329++;
        Statics.field1323 += Statics.field1329 >> 3;
        Statics.field1329 &= 0x7;
        return var0;
    }

    @ObfuscatedName("cy.g(I)I")
    public static int method2190(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1329) {
            int var3 = 8 - Statics.field1329;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1335[Statics.field1323] >> Statics.field1329 & var4) << var2;
            Statics.field1329 = 0;
            Statics.field1323++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1335[Statics.field1323] >> Statics.field1329 & var5) << var2;
            Statics.field1329 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("cy.l([B)V")
    public void method2185(byte[] arg0) {
        class300 var2 = new class300(arg0);
        this.field1322 = var2.method5208();
        this.field1327 = var2.method5208();
        this.field1321 = var2.method5208();
        this.field1328 = var2.method5208();
        if (this.field1328 < 0) {
            this.field1328 = ~this.field1328;
            this.field1326 = true;
        }
        int var3 = var2.method5208();
        this.field1350 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method5103();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method5115(var7, 0, var5);
            this.field1350[var4] = var7;
        }
    }

    @ObfuscatedName("cy.u([B)V")
    public static void method2186(byte[] arg0) {
        method2182(arg0, 0);
        Statics.field1330 = 0x1 << method2190(4);
        Statics.field1331 = 0x1 << method2190(4);
        Statics.field1325 = new float[Statics.field1331];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1330 : Statics.field1331;
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
            int var13 = Statics.method3133(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class189.method477(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1344 = var6;
                Statics.field1345 = var8;
                Statics.field1346 = var10;
                Statics.field1333 = var12;
            } else {
                Statics.field1347 = var6;
                Statics.field1348 = var8;
                Statics.field1349 = var10;
                Statics.field1351 = var12;
            }
        }
        int var15 = method2190(8) + 1;
        Statics.field1332 = new class101[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1332[var16] = new class101();
        }
        int var17 = method2190(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2190(16);
        }
        int var19 = method2190(6) + 1;
        Statics.field1342 = new class105[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1342[var20] = new class105();
        }
        int var21 = method2190(6) + 1;
        Statics.field1334 = new class112[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1334[var22] = new class112();
        }
        int var23 = method2190(6) + 1;
        Statics.field1343 = new class117[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1343[var24] = new class117();
        }
        int var25 = method2190(6) + 1;
        Statics.field1336 = new boolean[var25];
        Statics.field1337 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1336[var26] = method2194() != 0;
            method2190(16);
            method2190(16);
            Statics.field1337[var26] = method2190(8);
        }
    }

    @ObfuscatedName("cy.j(I)[F")
    public float[] method2203(int arg0) {
        method2182(this.field1350[arg0], 0);
        method2194();
        int var2 = method2190(Statics.method3133(Statics.field1337.length - 1));
        boolean var3 = Statics.field1336[var2];
        int var4 = var3 ? Statics.field1331 : Statics.field1330;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2194() != 0;
            var6 = method2194() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1330 >> 2);
            var9 = (Statics.field1330 >> 2) + (var4 >> 2);
            var10 = Statics.field1330 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1330 >> 2);
            var12 = (Statics.field1330 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1330 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class117 var14 = Statics.field1343[Statics.field1337[var2]];
        int var15 = var14.field1465;
        int var16 = var14.field1466[var15];
        boolean var17 = !Statics.field1342[var16].method2223();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1464; var19++) {
            class112 var20 = Statics.field1334[var14.field1467[var19]];
            float[] var21 = Statics.field1325;
            var20.method2311(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1465;
            int var23 = var14.field1466[var22];
            Statics.field1342[var23].method2225(Statics.field1325, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1325[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1325;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1347 : Statics.field1344;
            float[] var32 = var3 ? Statics.field1348 : Statics.field1345;
            float[] var33 = var3 ? Statics.field1349 : Statics.field1346;
            int[] var34 = var3 ? Statics.field1351 : Statics.field1333;
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
            int var47 = Statics.method3133(var4 - 1);
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
                Statics.field1325[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1325[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1340 > 0) {
            int var91 = this.field1340 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1338) {
                for (int var92 = 0; var92 < this.field1341; var92++) {
                    int var93 = (this.field1340 >> 1) + var92;
                    var90[var92] += this.field1339[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1325[var94];
                }
            }
        }
        float[] var96 = this.field1339;
        this.field1339 = Statics.field1325;
        Statics.field1325 = var96;
        this.field1340 = var4;
        this.field1341 = var12 - (var4 >> 1);
        this.field1338 = var17;
        return var90;
    }

    @ObfuscatedName("cy.v(Lhz;)Z")
    public static boolean method2188(class234 arg0) {
        if (!field1324) {
            byte[] var1 = arg0.method3825(0, 0);
            if (var1 == null) {
                return false;
            }
            method2186(var1);
            field1324 = true;
        }
        return true;
    }

    @ObfuscatedName("cy.d(Lhz;II)Lcy;")
    public static class103 method2189(class234 arg0, int arg1, int arg2) {
        if (method2188(arg0)) {
            byte[] var3 = arg0.method3825(arg1, arg2);
            return var3 == null ? null : new class103(var3);
        } else {
            arg0.method3827(arg1, arg2);
            return null;
        }
    }

    public class103(byte[] arg0) {
        this.method2185(arg0);
    }

    @ObfuscatedName("cy.z([I)Lcg;")
    public class104 method2191(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1352 == null) {
            this.field1340 = 0;
            this.field1339 = new float[Statics.field1331];
            this.field1352 = new byte[this.field1327];
            this.field1353 = 0;
            this.field1354 = 0;
        }
        while (this.field1354 < this.field1350.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2203(this.field1354);
            if (var2 != null) {
                int var3 = this.field1353;
                int var4 = var2.length;
                if (var4 > this.field1327 - var3) {
                    var4 = this.field1327 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1352[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1353;
                }
                this.field1353 = var3;
            }
            this.field1354++;
        }
        this.field1339 = null;
        byte[] var7 = this.field1352;
        this.field1352 = null;
        return new class104(this.field1322, var7, this.field1321, this.field1328, this.field1326);
    }
}
