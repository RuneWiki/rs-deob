package deob;

@ObfuscatedName("du")
public class class107 extends class196 {

    @ObfuscatedName("du.s")
    public byte[][] field1578;

    @ObfuscatedName("du.c")
    public int field1570;

    @ObfuscatedName("du.f")
    public int field1571;

    @ObfuscatedName("du.m")
    public int field1576;

    @ObfuscatedName("du.h")
    public int field1573;

    @ObfuscatedName("du.t")
    public boolean field1574;

    @ObfuscatedName("du.y")
    public static boolean field1601 = false;

    @ObfuscatedName("du.w")
    public float[] field1599;

    @ObfuscatedName("du.i")
    public int field1588;

    @ObfuscatedName("du.g")
    public int field1593;

    @ObfuscatedName("du.a")
    public boolean field1586;

    @ObfuscatedName("du.aa")
    public byte[] field1600;

    @ObfuscatedName("du.aq")
    public int field1587;

    @ObfuscatedName("du.aj")
    public int field1602;

    @ObfuscatedName("du.s(I)F")
    public static float method1840(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("du.c([BI)V")
    public static void method1833(byte[] arg0, int arg1) {
        Statics.field1575 = arg0;
        Statics.field1577 = arg1;
        Statics.field1594 = 0;
    }

    @ObfuscatedName("du.f()I")
    public static int method1834() {
        int var0 = Statics.field1575[Statics.field1577] >> Statics.field1594 & 0x1;
        Statics.field1594++;
        Statics.field1577 += Statics.field1594 >> 3;
        Statics.field1594 &= 0x7;
        return var0;
    }

    @ObfuscatedName("du.m(I)I")
    public static int method1835(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1594) {
            int var3 = 8 - Statics.field1594;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1575[Statics.field1577] >> Statics.field1594 & var4) << var2;
            Statics.field1594 = 0;
            Statics.field1577++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1575[Statics.field1577] >> Statics.field1594 & var5) << var2;
            Statics.field1594 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("du.h([B)V")
    public void method1839(byte[] arg0) {
        class177 var2 = new class177(arg0);
        this.field1570 = var2.method2970();
        this.field1571 = var2.method2970();
        this.field1576 = var2.method2970();
        this.field1573 = var2.method2970();
        if (this.field1573 < 0) {
            this.field1573 = ~this.field1573;
            this.field1574 = true;
        }
        int var3 = var2.method2970();
        this.field1578 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2965();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3065(var7, 0, var5);
            this.field1578[var4] = var7;
        }
    }

    @ObfuscatedName("du.t([B)V")
    public static void method1858(byte[] arg0) {
        method1833(arg0, 0);
        Statics.field1582 = 0x1 << method1835(4);
        Statics.field1579 = 0x1 << method1835(4);
        Statics.field1591 = new float[Statics.field1579];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1582 : Statics.field1579;
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
            int var13 = class181.method1582(var5 - 1);
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
                Statics.field1592 = var6;
                Statics.field1569 = var8;
                Statics.field1597 = var10;
                Statics.field1598 = var12;
            } else {
                Statics.field1595 = var6;
                Statics.field1596 = var8;
                Statics.field1590 = var10;
                Statics.field1589 = var12;
            }
        }
        int var21 = method1835(8) + 1;
        Statics.field1580 = new class105[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1580[var22] = new class105();
        }
        int var23 = method1835(6) + 1;
        for (int var24 = 0; var24 < var23; var24++) {
            method1835(16);
        }
        int var25 = method1835(6) + 1;
        Statics.field1581 = new class109[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1581[var26] = new class109();
        }
        int var27 = method1835(6) + 1;
        Statics.field1572 = new class116[var27];
        for (int var28 = 0; var28 < var27; var28++) {
            Statics.field1572[var28] = new class116();
        }
        int var29 = method1835(6) + 1;
        Statics.field1583 = new class121[var29];
        for (int var30 = 0; var30 < var29; var30++) {
            Statics.field1583[var30] = new class121();
        }
        int var31 = method1835(6) + 1;
        Statics.field1584 = new boolean[var31];
        Statics.field1585 = new int[var31];
        for (int var32 = 0; var32 < var31; var32++) {
            Statics.field1584[var32] = method1834() != 0;
            method1835(16);
            method1835(16);
            Statics.field1585[var32] = method1835(8);
        }
    }

    @ObfuscatedName("du.p(I)[F")
    public float[] method1838(int arg0) {
        method1833(this.field1578[arg0], 0);
        method1834();
        int var2 = method1835(class181.method1582(Statics.field1585.length - 1));
        boolean var3 = Statics.field1584[var2];
        int var4 = var3 ? Statics.field1579 : Statics.field1582;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1834() != 0;
            var6 = method1834() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1582 >> 2);
            var9 = (Statics.field1582 >> 2) + (var4 >> 2);
            var10 = Statics.field1582 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1582 >> 2);
            var12 = (Statics.field1582 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1582 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class121 var14 = Statics.field1583[Statics.field1585[var2]];
        int var15 = var14.field1719;
        int var16 = var14.field1720[var15];
        boolean var17 = !Statics.field1581[var16].method1882();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1718; var19++) {
            class116 var20 = Statics.field1572[var14.field1721[var19]];
            float[] var21 = Statics.field1591;
            var20.method1967(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1719;
            int var23 = var14.field1720[var22];
            Statics.field1581[var23].method1874(Statics.field1591, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1591[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1591;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1595 : Statics.field1592;
            float[] var32 = var3 ? Statics.field1596 : Statics.field1569;
            float[] var33 = var3 ? Statics.field1590 : Statics.field1597;
            int[] var34 = var3 ? Statics.field1589 : Statics.field1598;
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
            int var47 = class181.method1582(var4 - 1);
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
                Statics.field1591[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1591[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1588 > 0) {
            int var91 = this.field1588 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1586) {
                for (int var92 = 0; var92 < this.field1593; var92++) {
                    int var93 = (this.field1588 >> 1) + var92;
                    var90[var92] += this.field1599[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1591[var94];
                }
            }
        }
        float[] var96 = this.field1599;
        this.field1599 = Statics.field1591;
        Statics.field1591 = var96;
        this.field1588 = var4;
        this.field1593 = var12 - (var4 >> 1);
        this.field1586 = var17;
        return var90;
    }

    @ObfuscatedName("du.d(Liw;)Z")
    public static boolean method1832(class239 arg0) {
        if (!field1601) {
            byte[] var1 = arg0.method3840(0, 0);
            if (var1 == null) {
                return false;
            }
            method1858(var1);
            field1601 = true;
        }
        return true;
    }

    @ObfuscatedName("du.n(Liw;II)Ldu;")
    public static class107 method1836(class239 arg0, int arg1, int arg2) {
        if (method1832(arg0)) {
            byte[] var3 = arg0.method3840(arg1, arg2);
            return var3 == null ? null : new class107(var3);
        } else {
            arg0.method3842(arg1, arg2);
            return null;
        }
    }

    public class107(byte[] arg0) {
        this.method1839(arg0);
    }

    @ObfuscatedName("du.z([I)Ldl;")
    public class108 method1841(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1600 == null) {
            this.field1588 = 0;
            this.field1599 = new float[Statics.field1579];
            this.field1600 = new byte[this.field1571];
            this.field1587 = 0;
            this.field1602 = 0;
        }
        while (this.field1602 < this.field1578.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1838(this.field1602);
            if (var2 != null) {
                int var3 = this.field1587;
                int var4 = var2.length;
                if (var4 > this.field1571 - var3) {
                    var4 = this.field1571 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1600[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1587;
                }
                this.field1587 = var3;
            }
            this.field1602++;
        }
        this.field1599 = null;
        byte[] var7 = this.field1600;
        this.field1600 = null;
        return new class108(this.field1570, var7, this.field1576, this.field1573, this.field1574);
    }
}
