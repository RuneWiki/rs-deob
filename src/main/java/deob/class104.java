package deob;

@ObfuscatedName("cb")
public class class104 extends class213 {

    @ObfuscatedName("cb.b")
    public byte[][] field1476;

    @ObfuscatedName("cb.q")
    public int field1461;

    @ObfuscatedName("cb.o")
    public int field1475;

    @ObfuscatedName("cb.p")
    public int field1463;

    @ObfuscatedName("cb.a")
    public int field1473;

    @ObfuscatedName("cb.h")
    public boolean field1465;

    @ObfuscatedName("cb.m")
    public static boolean field1485 = false;

    @ObfuscatedName("cb.x")
    public float[] field1478;

    @ObfuscatedName("cb.w")
    public int field1479;

    @ObfuscatedName("cb.j")
    public int field1480;

    @ObfuscatedName("cb.z")
    public boolean field1481;

    @ObfuscatedName("cb.af")
    public byte[] field1491;

    @ObfuscatedName("cb.ai")
    public int field1492;

    @ObfuscatedName("cb.aq")
    public int field1493;

    @ObfuscatedName("cb.b(I)F")
    public static float method2013(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cb.q([BI)V")
    public static void method1990(byte[] arg0, int arg1) {
        Statics.field1466 = arg0;
        Statics.field1467 = arg1;
        Statics.field1468 = 0;
    }

    @ObfuscatedName("cb.o()I")
    public static int method1991() {
        int var0 = Statics.field1466[Statics.field1467] >> Statics.field1468 & 0x1;
        Statics.field1468++;
        Statics.field1467 += Statics.field1468 >> 3;
        Statics.field1468 &= 0x7;
        return var0;
    }

    @ObfuscatedName("cb.p(I)I")
    public static int method1992(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1468) {
            int var3 = 8 - Statics.field1468;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1466[Statics.field1467] >> Statics.field1468 & var4) << var2;
            Statics.field1468 = 0;
            Statics.field1467++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1466[Statics.field1467] >> Statics.field1468 & var5) << var2;
            Statics.field1468 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("cb.a([B)V")
    public void method1994(byte[] arg0) {
        class194 var2 = new class194(arg0);
        this.field1461 = var2.method3261();
        this.field1475 = var2.method3261();
        this.field1463 = var2.method3261();
        this.field1473 = var2.method3261();
        if (this.field1473 < 0) {
            this.field1473 = ~this.field1473;
            this.field1465 = true;
        }
        int var3 = var2.method3261();
        this.field1476 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3247();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3447(var7, 0, var5);
            this.field1476[var4] = var7;
        }
    }

    @ObfuscatedName("cb.h([B)V")
    public static void method2024(byte[] arg0) {
        method1990(arg0, 0);
        Statics.field1469 = 0x1 << method1992(4);
        Statics.field1462 = 0x1 << method1992(4);
        Statics.field1482 = new float[Statics.field1462];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1469 : Statics.field1462;
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
            int var13 = class198.method2582(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class198.method2880(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1483 = var6;
                Statics.field1484 = var8;
                Statics.field1471 = var10;
                Statics.field1489 = var12;
            } else {
                Statics.field1472 = var6;
                Statics.field1487 = var8;
                Statics.field1477 = var10;
                Statics.field1470 = var12;
            }
        }
        int var15 = method1992(8) + 1;
        Statics.field1488 = new class102[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1488[var16] = new class102();
        }
        int var17 = method1992(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1992(16);
        }
        int var19 = method1992(6) + 1;
        Statics.field1464 = new class106[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1464[var20] = new class106();
        }
        int var21 = method1992(6) + 1;
        Statics.field1486 = new class113[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1486[var22] = new class113();
        }
        int var23 = method1992(6) + 1;
        Statics.field1474 = new class118[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1474[var24] = new class118();
        }
        int var25 = method1992(6) + 1;
        Statics.field1490 = new boolean[var25];
        Statics.field1460 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1490[var26] = method1991() != 0;
            method1992(16);
            method1992(16);
            Statics.field1460[var26] = method1992(8);
        }
    }

    @ObfuscatedName("cb.l(I)[F")
    public float[] method1993(int arg0) {
        method1990(this.field1476[arg0], 0);
        method1991();
        int var2 = method1992(class198.method2582(Statics.field1460.length - 1));
        boolean var3 = Statics.field1490[var2];
        int var4 = var3 ? Statics.field1462 : Statics.field1469;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1991() != 0;
            var6 = method1991() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1469 >> 2);
            var9 = (Statics.field1469 >> 2) + (var4 >> 2);
            var10 = Statics.field1469 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1469 >> 2);
            var12 = (Statics.field1469 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1469 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class118 var14 = Statics.field1474[Statics.field1460[var2]];
        int var15 = var14.field1606;
        int var16 = var14.field1607[var15];
        boolean var17 = !Statics.field1464[var16].method2036();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1608; var19++) {
            class113 var20 = Statics.field1486[var14.field1605[var19]];
            float[] var21 = Statics.field1482;
            var20.method2119(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1606;
            int var23 = var14.field1607[var22];
            Statics.field1464[var23].method2044(Statics.field1482, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1482[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1482;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1472 : Statics.field1483;
            float[] var32 = var3 ? Statics.field1487 : Statics.field1484;
            float[] var33 = var3 ? Statics.field1477 : Statics.field1471;
            int[] var34 = var3 ? Statics.field1470 : Statics.field1489;
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
            int var47 = class198.method2582(var4 - 1);
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
                Statics.field1482[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1482[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1479 > 0) {
            int var91 = this.field1479 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1481) {
                for (int var92 = 0; var92 < this.field1480; var92++) {
                    int var93 = (this.field1479 >> 1) + var92;
                    var90[var92] += this.field1478[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1482[var94];
                }
            }
        }
        float[] var96 = this.field1478;
        this.field1478 = Statics.field1482;
        Statics.field1482 = var96;
        this.field1479 = var4;
        this.field1480 = var12 - (var4 >> 1);
        this.field1481 = var17;
        return var90;
    }

    @ObfuscatedName("cb.y(Lie;)Z")
    public static boolean method1996(class256 arg0) {
        if (!field1485) {
            byte[] var1 = arg0.method4158(0, 0);
            if (var1 == null) {
                return false;
            }
            method2024(var1);
            field1485 = true;
        }
        return true;
    }

    @ObfuscatedName("cb.g(Lie;II)Lcb;")
    public static class104 method1997(class256 arg0, int arg1, int arg2) {
        if (method1996(arg0)) {
            byte[] var3 = arg0.method4158(arg1, arg2);
            return var3 == null ? null : new class104(var3);
        } else {
            arg0.method4221(arg1, arg2);
            return null;
        }
    }

    public class104(byte[] arg0) {
        this.method1994(arg0);
    }

    @ObfuscatedName("cb.c([I)Ldb;")
    public class105 method1998(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1491 == null) {
            this.field1479 = 0;
            this.field1478 = new float[Statics.field1462];
            this.field1491 = new byte[this.field1475];
            this.field1492 = 0;
            this.field1493 = 0;
        }
        while (this.field1493 < this.field1476.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1993(this.field1493);
            if (var2 != null) {
                int var3 = this.field1492;
                int var4 = var2.length;
                if (var4 > this.field1475 - var3) {
                    var4 = this.field1475 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1491[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1492;
                }
                this.field1492 = var3;
            }
            this.field1493++;
        }
        this.field1478 = null;
        byte[] var7 = this.field1491;
        this.field1491 = null;
        return new class105(this.field1461, var7, this.field1463, this.field1473, this.field1465);
    }
}
