package deob;

@ObfuscatedName("ds")
public class class117 extends class205 {

    @ObfuscatedName("ds.f")
    public int field1564;

    @ObfuscatedName("ds.n")
    public boolean field1560;

    @ObfuscatedName("ds.h")
    public int[] field1570;

    @ObfuscatedName("ds.x")
    public int[] field1566;

    @ObfuscatedName("ds.j")
    public int[] field1567;

    @ObfuscatedName("ds.a")
    public int[] field1568;

    @ObfuscatedName("ds.l")
    public int field1569;

    @ObfuscatedName("ds.d")
    public int field1572;

    @ObfuscatedName("ds.s")
    public int[] field1571;

    @ObfuscatedName("ds.p")
    public boolean field1563 = false;

    public class117(class183 arg0) {
        this.field1564 = arg0.method3268();
        this.field1560 = arg0.method3436() == 1;
        int var2 = arg0.method3436();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1570 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1570[var3] = arg0.method3268();
        }
        if (var2 > 1) {
            this.field1566 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1566[var4] = arg0.method3436();
            }
        }
        if (var2 > 1) {
            this.field1567 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1567[var5] = arg0.method3436();
            }
        }
        this.field1568 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1568[var6] = arg0.method3267();
        }
        this.field1569 = arg0.method3436();
        this.field1572 = arg0.method3436();
        this.field1571 = null;
    }

    @ObfuscatedName("ds.w(DILiv;)Z")
    public boolean method2493(double arg0, int arg1, class248 arg2) {
        for (int var5 = 0; var5 < this.field1570.length; var5++) {
            if (arg2.method4264(this.field1570[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1571 = new int[var6];
        for (int var7 = 0; var7 < this.field1570.length; var7++) {
            class318 var8 = class320.method4826(arg2, this.field1570[var7]);
            var8.method5419();
            byte[] var9 = var8.field3786;
            int[] var10 = var8.field3789;
            int var11 = this.field1568[var7];
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
                var10[var17] = class123.method2612(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1566[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3787 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1571[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3787 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1571[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3787 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1571[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ds.m()V")
    public void method2494() {
        this.field1571 = null;
    }

    @ObfuscatedName("ds.q(I)V")
    public void method2492(int arg0) {
        if (this.field1571 == null) {
            return;
        }
        if (this.field1569 == 1 || this.field1569 == 3) {
            if (Statics.field1573 == null || Statics.field1573.length < this.field1571.length) {
                Statics.field1573 = new int[this.field1571.length];
            }
            short var2;
            if (this.field1571.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1571.length;
            int var4 = arg0 * var2 * this.field1572;
            int var5 = var3 - 1;
            if (this.field1569 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1573[var6] = this.field1571[var7];
            }
            int[] var8 = this.field1571;
            this.field1571 = Statics.field1573;
            Statics.field1573 = var8;
        }
        if (this.field1569 != 2 && this.field1569 != 4) {
            return;
        }
        if (Statics.field1573 == null || Statics.field1573.length < this.field1571.length) {
            Statics.field1573 = new int[this.field1571.length];
        }
        short var9;
        if (this.field1571.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1571.length;
        int var11 = this.field1572 * arg0;
        int var12 = var9 - 1;
        if (this.field1569 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1573[var15] = this.field1571[var16];
            }
        }
        int[] var17 = this.field1571;
        this.field1571 = Statics.field1573;
        Statics.field1573 = var17;
    }
}
