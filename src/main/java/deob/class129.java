package deob;

@ObfuscatedName("du")
public class class129 implements class149 {

    @ObfuscatedName("du.m")
    public class134[] field1556;

    @ObfuscatedName("du.o")
    public class272 field1555 = new class272();

    @ObfuscatedName("du.q")
    public int field1553;

    @ObfuscatedName("du.j")
    public int field1559 = 0;

    @ObfuscatedName("du.p")
    public double field1557 = 1.0D;

    @ObfuscatedName("du.g")
    public int field1558 = 128;

    @ObfuscatedName("du.n")
    public class244 field1554;

    public class129(class244 arg0, class244 arg1, int arg2, double arg3, int arg4) {
        this.field1554 = arg1;
        this.field1553 = arg2;
        this.field1559 = this.field1553;
        this.field1557 = arg3;
        this.field1558 = arg4;
        int[] var7 = arg0.method3902(0);
        int var8 = var7.length;
        this.field1556 = new class134[arg0.method3903(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class310 var10 = new class310(arg0.method3891(0, var7[var9]));
            this.field1556[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("du.m(I)I")
    public int method2610() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1556;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1652 != null) {
                var1 += var5.field1652.length;
                int[] var6 = var5.field1652;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1554.method3941(var8)) {
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

    @ObfuscatedName("du.o(D)V")
    public void method2586(double arg0) {
        this.field1557 = arg0;
        this.method2591();
    }

    @ObfuscatedName("du.q(II)[I")
    public int[] method2593(int arg0) {
        class134 var2 = this.field1556[arg0];
        if (var2 != null) {
            if (var2.field1658 != null) {
                this.field1555.method4647(var2);
                var2.field1659 = true;
                return var2.field1658;
            }
            boolean var3 = var2.method2693(this.field1557, this.field1558, this.field1554);
            if (var3) {
                if (this.field1559 == 0) {
                    class134 var4 = (class134) this.field1555.method4650();
                    var4.method2694();
                } else {
                    this.field1559--;
                }
                this.field1555.method4647(var2);
                var2.field1659 = true;
                return var2.field1658;
            }
        }
        return null;
    }

    @ObfuscatedName("du.j(II)I")
    public int method2588(int arg0) {
        return this.field1556[arg0] == null ? 0 : this.field1556[arg0].field1648;
    }

    @ObfuscatedName("du.p(IB)Z")
    public boolean method2589(int arg0) {
        return this.field1556[arg0].field1651;
    }

    @ObfuscatedName("du.g(IB)Z")
    public boolean method2590(int arg0) {
        return this.field1558 == 64;
    }

    @ObfuscatedName("du.n(I)V")
    public void method2591() {
        for (int var1 = 0; var1 < this.field1556.length; var1++) {
            if (this.field1556[var1] != null) {
                this.field1556[var1].method2694();
            }
        }
        this.field1555 = new class272();
        this.field1559 = this.field1553;
    }

    @ObfuscatedName("du.u(II)V")
    public void method2584(int arg0) {
        for (int var2 = 0; var2 < this.field1556.length; var2++) {
            class134 var3 = this.field1556[var2];
            if (var3 != null && var3.field1649 != 0 && var3.field1659) {
                var3.method2695(arg0);
                var3.field1659 = false;
            }
        }
    }
}
