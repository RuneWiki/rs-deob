package deob;

@ObfuscatedName("db")
public final class class123 {

    @ObfuscatedName("db.a")
    public int field2017;

    @ObfuscatedName("db.y")
    public int field2013;

    @ObfuscatedName("db.e")
    public int[] field2022 = new int[256];

    @ObfuscatedName("db.g")
    public int[] field2018 = new int[256];

    @ObfuscatedName("db.m")
    public int field2016;

    @ObfuscatedName("db.j")
    public int field2015;

    public class123(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2022[var2] = arg0[var2];
        }
        this.method2607();
    }

    @ObfuscatedName("db.a(I)I")
    public final int method2614() {
        if (0 == --this.field2013 + 1) {
            this.method2608();
            this.field2013 = 255;
        }
        return this.field2022[this.field2013];
    }

    @ObfuscatedName("db.r(I)V")
    public final void method2608() {
        this.field2017 += ++this.field2015;
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = this.field2018[var1];
            if ((var1 & 0x2) == 0) {
                if ((var1 & 0x1) == 0) {
                    this.field2016 ^= this.field2016 << 13;
                } else {
                    this.field2016 ^= this.field2016 >>> 6;
                }
            } else if ((var1 & 0x1) == 0) {
                this.field2016 ^= this.field2016 << 2;
            } else {
                this.field2016 ^= this.field2016 >>> 16;
            }
            this.field2016 += this.field2018[var1 + 128 & 0xFF];
            int var3;
            this.field2018[var1] = var3 = this.field2017 + this.field2016 + this.field2018[(var2 & 0x3FC) >> 2];
            this.field2022[var1] = this.field2017 = this.field2018[(var3 >> 8 & 0x3FC) >> 2] + var2;
        }
    }

    @ObfuscatedName("db.f(I)V")
    public final void method2607() {
        int var1 = -1640531527;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        for (int var9 = 0; var9 < 4; var9++) {
            int var10 = var8 ^ var7 << 11;
            int var11 = var5 + var10;
            int var12 = var6 + var7;
            int var13 = var12 ^ var6 >>> 2;
            int var14 = var4 + var13;
            int var15 = var6 + var11;
            int var16 = var15 ^ var11 << 8;
            int var17 = var3 + var16;
            int var18 = var11 + var14;
            var5 = var18 ^ var14 >>> 16;
            int var19 = var2 + var5;
            int var20 = var14 + var17;
            var4 = var20 ^ var17 << 10;
            int var21 = var1 + var4;
            int var22 = var17 + var19;
            var3 = var22 ^ var19 >>> 4;
            int var23 = var3 + var10;
            int var24 = var19 + var21;
            var2 = var24 ^ var21 << 8;
            var7 = var2 + var13;
            int var25 = var21 + var23;
            var1 = var25 ^ var23 >>> 9;
            var6 = var1 + var16;
            var8 = var7 + var23;
        }
        for (int var26 = 0; var26 < 256; var26 += 8) {
            int var27 = this.field2022[var26] + var8;
            int var28 = this.field2022[var26 + 1] + var7;
            int var29 = this.field2022[var26 + 2] + var6;
            int var30 = this.field2022[var26 + 3] + var5;
            int var31 = this.field2022[var26 + 4] + var4;
            int var32 = this.field2022[var26 + 5] + var3;
            int var33 = this.field2022[var26 + 6] + var2;
            int var34 = this.field2022[var26 + 7] + var1;
            int var35 = var27 ^ var28 << 11;
            int var36 = var30 + var35;
            int var37 = var28 + var29;
            int var38 = var37 ^ var29 >>> 2;
            int var39 = var31 + var38;
            int var40 = var29 + var36;
            int var41 = var40 ^ var36 << 8;
            int var42 = var32 + var41;
            int var43 = var36 + var39;
            var5 = var43 ^ var39 >>> 16;
            int var44 = var5 + var33;
            int var45 = var39 + var42;
            var4 = var45 ^ var42 << 10;
            int var46 = var4 + var34;
            int var47 = var42 + var44;
            var3 = var47 ^ var44 >>> 4;
            int var48 = var3 + var35;
            int var49 = var44 + var46;
            var2 = var49 ^ var46 << 8;
            var7 = var2 + var38;
            int var50 = var46 + var48;
            var1 = var50 ^ var48 >>> 9;
            var6 = var1 + var41;
            var8 = var7 + var48;
            this.field2018[var26] = var8;
            this.field2018[var26 + 1] = var7;
            this.field2018[var26 + 2] = var6;
            this.field2018[var26 + 3] = var5;
            this.field2018[var26 + 4] = var4;
            this.field2018[var26 + 5] = var3;
            this.field2018[var26 + 6] = var2;
            this.field2018[var26 + 7] = var1;
        }
        for (int var51 = 0; var51 < 256; var51 += 8) {
            int var52 = this.field2018[var51] + var8;
            int var53 = this.field2018[var51 + 1] + var7;
            int var54 = this.field2018[var51 + 2] + var6;
            int var55 = this.field2018[var51 + 3] + var5;
            int var56 = this.field2018[var51 + 4] + var4;
            int var57 = this.field2018[var51 + 5] + var3;
            int var58 = this.field2018[var51 + 6] + var2;
            int var59 = this.field2018[var51 + 7] + var1;
            int var60 = var52 ^ var53 << 11;
            int var61 = var55 + var60;
            int var62 = var53 + var54;
            int var63 = var62 ^ var54 >>> 2;
            int var64 = var56 + var63;
            int var65 = var54 + var61;
            int var66 = var65 ^ var61 << 8;
            int var67 = var57 + var66;
            int var68 = var61 + var64;
            var5 = var68 ^ var64 >>> 16;
            int var69 = var5 + var58;
            int var70 = var64 + var67;
            var4 = var70 ^ var67 << 10;
            int var71 = var4 + var59;
            int var72 = var67 + var69;
            var3 = var72 ^ var69 >>> 4;
            int var73 = var3 + var60;
            int var74 = var69 + var71;
            var2 = var74 ^ var71 << 8;
            var7 = var2 + var63;
            int var75 = var71 + var73;
            var1 = var75 ^ var73 >>> 9;
            var6 = var1 + var66;
            var8 = var7 + var73;
            this.field2018[var51] = var8;
            this.field2018[var51 + 1] = var7;
            this.field2018[var51 + 2] = var6;
            this.field2018[var51 + 3] = var5;
            this.field2018[var51 + 4] = var4;
            this.field2018[var51 + 5] = var3;
            this.field2018[var51 + 6] = var2;
            this.field2018[var51 + 7] = var1;
        }
        this.method2608();
        this.field2013 = 256;
    }
}
