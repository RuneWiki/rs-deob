package deob;

@ObfuscatedName("dr")
public class class120 implements class140 {

    @ObfuscatedName("dr.c")
    public class125[] field1519;

    @ObfuscatedName("dr.t")
    public class263 field1514 = new class263();

    @ObfuscatedName("dr.o")
    public int field1515;

    @ObfuscatedName("dr.e")
    public int field1523 = 0;

    @ObfuscatedName("dr.i")
    public double field1517 = 1.0D;

    @ObfuscatedName("dr.g")
    public int field1518 = 128;

    @ObfuscatedName("dr.d")
    public class235 field1522;

    public class120(class235 arg0, class235 arg1, int arg2, double arg3, int arg4) {
        this.field1522 = arg1;
        this.field1515 = arg2;
        this.field1523 = this.field1515;
        this.field1517 = arg3;
        this.field1518 = arg4;
        int[] var7 = arg0.method3847(0);
        int var8 = var7.length;
        this.field1519 = new class125[arg0.method3848(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class301 var10 = new class301(arg0.method3845(0, var7[var9]));
            this.field1519[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dr.c(I)I")
    public int method2558() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1519;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1610 != null) {
                var1 += var5.field1610.length;
                int[] var6 = var5.field1610;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1522.method3839(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("dr.t(D)V")
    public void method2546(double arg0) {
        this.field1517 = arg0;
        this.method2551();
    }

    @ObfuscatedName("dr.o(II)[I")
    public int[] method2553(int arg0) {
        class125 var2 = this.field1519[arg0];
        if (var2 != null) {
            if (var2.field1612 != null) {
                this.field1514.method4565(var2);
                var2.field1619 = true;
                return var2.field1612;
            }
            boolean var3 = var2.method2652(this.field1517, this.field1518, this.field1522);
            if (var3) {
                if (this.field1523 == 0) {
                    class125 var4 = (class125) this.field1514.method4549();
                    var4.method2661();
                } else {
                    this.field1523--;
                }
                this.field1514.method4565(var2);
                var2.field1619 = true;
                return var2.field1612;
            }
        }
        return null;
    }

    @ObfuscatedName("dr.e(II)I")
    public int method2544(int arg0) {
        return this.field1519[arg0] == null ? 0 : this.field1519[arg0].field1618;
    }

    @ObfuscatedName("dr.i(IB)Z")
    public boolean method2549(int arg0) {
        return this.field1519[arg0].field1611;
    }

    @ObfuscatedName("dr.g(II)Z")
    public boolean method2550(int arg0) {
        return this.field1518 == 64;
    }

    @ObfuscatedName("dr.d(I)V")
    public void method2551() {
        for (int var1 = 0; var1 < this.field1519.length; var1++) {
            if (this.field1519[var1] != null) {
                this.field1519[var1].method2661();
            }
        }
        this.field1514 = new class263();
        this.field1523 = this.field1515;
    }

    @ObfuscatedName("dr.l(II)V")
    public void method2552(int arg0) {
        for (int var2 = 0; var2 < this.field1519.length; var2++) {
            class125 var3 = this.field1519[var2];
            if (var3 != null && var3.field1616 != 0 && var3.field1619) {
                var3.method2654(arg0);
                var3.field1619 = false;
            }
        }
    }
}
