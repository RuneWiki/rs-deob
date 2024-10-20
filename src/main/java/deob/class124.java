package deob;

@ObfuscatedName("db")
public class class124 extends class212 {

    @ObfuscatedName("db.h")
    public int field1616;

    @ObfuscatedName("db.f")
    public boolean field1618;

    @ObfuscatedName("db.p")
    public int[] field1621;

    @ObfuscatedName("db.m")
    public int[] field1619;

    @ObfuscatedName("db.q")
    public int[] field1620;

    @ObfuscatedName("db.b")
    public int[] field1623;

    @ObfuscatedName("db.n")
    public int field1613;

    @ObfuscatedName("db.e")
    public int field1617;

    @ObfuscatedName("db.r")
    public int[] field1624;

    @ObfuscatedName("db.t")
    public boolean field1622 = false;

    public class124(class190 arg0) {
        this.field1616 = arg0.method3610();
        this.field1618 = arg0.method3443() == 1;
        int var2 = arg0.method3443();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1621 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1621[var3] = arg0.method3610();
        }
        if (var2 > 1) {
            this.field1619 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1619[var4] = arg0.method3443();
            }
        }
        if (var2 > 1) {
            this.field1620 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1620[var5] = arg0.method3443();
            }
        }
        this.field1623 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1623[var6] = arg0.method3460();
        }
        this.field1613 = arg0.method3443();
        this.field1617 = arg0.method3443();
        this.field1624 = null;
    }

    @ObfuscatedName("db.a(DILiz;)Z")
    public boolean method2665(double arg0, int arg1, class255 arg2) {
        for (int var5 = 0; var5 < this.field1621.length; var5++) {
            if (arg2.method4431(this.field1621[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1624 = new int[var6];
        for (int var7 = 0; var7 < this.field1621.length; var7++) {
            class327 var8 = class329.method1954(arg2, this.field1621[var7]);
            var8.method5636();
            byte[] var9 = var8.field3884;
            int[] var10 = var8.field3887;
            int var11 = this.field1623[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class130.method2853(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1619[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3882 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1624[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3882 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1624[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3882 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1624[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("db.s()V")
    public void method2664() {
        this.field1624 = null;
    }

    @ObfuscatedName("db.g(I)V")
    public void method2667(int arg0) {
        if (this.field1624 == null) {
            return;
        }
        if (this.field1613 == 1 || this.field1613 == 3) {
            if (Statics.field1626 == null || Statics.field1626.length < this.field1624.length) {
                Statics.field1626 = new int[this.field1624.length];
            }
            short var2;
            if (this.field1624.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1624.length;
            int var4 = arg0 * var2 * this.field1617;
            int var5 = var3 - 1;
            if (this.field1613 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1626[var6] = this.field1624[var7];
            }
            int[] var8 = this.field1624;
            this.field1624 = Statics.field1626;
            Statics.field1626 = var8;
        }
        if (this.field1613 != 2 && this.field1613 != 4) {
            return;
        }
        if (Statics.field1626 == null || Statics.field1626.length < this.field1624.length) {
            Statics.field1626 = new int[this.field1624.length];
        }
        short var9;
        if (this.field1624.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1624.length;
        int var11 = this.field1617 * arg0;
        int var12 = var9 - 1;
        if (this.field1613 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1626[var15] = this.field1624[var16];
            }
        }
        int[] var17 = this.field1624;
        this.field1624 = Statics.field1626;
        Statics.field1626 = var17;
    }
}
