package deob;

@ObfuscatedName("dt")
public class class120 implements class140 {

    @ObfuscatedName("dt.s")
    public class125[] field1515;

    @ObfuscatedName("dt.j")
    public class262 field1513 = new class262();

    @ObfuscatedName("dt.i")
    public int field1514;

    @ObfuscatedName("dt.k")
    public int field1516 = 0;

    @ObfuscatedName("dt.u")
    public double field1517 = 1.0D;

    @ObfuscatedName("dt.n")
    public int field1518 = 128;

    @ObfuscatedName("dt.t")
    public class234 field1519;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1519 = arg1;
        this.field1514 = arg2;
        this.field1516 = this.field1514;
        this.field1517 = arg3;
        this.field1518 = arg4;
        int[] var7 = arg0.method3770(0);
        int var8 = var7.length;
        this.field1515 = new class125[arg0.method3776(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3790(0, var7[var9]));
            this.field1515[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dt.s(I)I")
    public int method2492() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1515;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1606 != null) {
                var1 += var5.field1606.length;
                int[] var6 = var5.field1606;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1519.method3768(var8)) {
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

    @ObfuscatedName("dt.j(D)V")
    public void method2493(double arg0) {
        this.field1517 = arg0;
        this.method2497();
    }

    @ObfuscatedName("dt.i(II)[I")
    public int[] method2505(int arg0) {
        class125 var2 = this.field1515[arg0];
        if (var2 != null) {
            if (var2.field1612 != null) {
                this.field1513.method4476(var2);
                var2.field1613 = true;
                return var2.field1612;
            }
            boolean var3 = var2.method2608(this.field1517, this.field1518, this.field1519);
            if (var3) {
                if (this.field1516 == 0) {
                    class125 var4 = (class125) this.field1513.method4479();
                    var4.method2609();
                } else {
                    this.field1516--;
                }
                this.field1513.method4476(var2);
                var2.field1613 = true;
                return var2.field1612;
            }
        }
        return null;
    }

    @ObfuscatedName("dt.k(IB)I")
    public int method2501(int arg0) {
        return this.field1515[arg0] == null ? 0 : this.field1515[arg0].field1604;
    }

    @ObfuscatedName("dt.u(II)Z")
    public boolean method2495(int arg0) {
        return this.field1515[arg0].field1605;
    }

    @ObfuscatedName("dt.n(IS)Z")
    public boolean method2496(int arg0) {
        return this.field1518 == 64;
    }

    @ObfuscatedName("dt.t(I)V")
    public void method2497() {
        for (int var1 = 0; var1 < this.field1515.length; var1++) {
            if (this.field1515[var1] != null) {
                this.field1515[var1].method2609();
            }
        }
        this.field1513 = new class262();
        this.field1516 = this.field1514;
    }

    @ObfuscatedName("dt.q(II)V")
    public void method2498(int arg0) {
        for (int var2 = 0; var2 < this.field1515.length; var2++) {
            class125 var3 = this.field1515[var2];
            if (var3 != null && var3.field1607 != 0 && var3.field1613) {
                var3.method2607(arg0);
                var3.field1613 = false;
            }
        }
    }
}
