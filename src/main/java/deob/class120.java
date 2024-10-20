package deob;

@ObfuscatedName("dp")
public class class120 implements class140 {

    @ObfuscatedName("dp.a")
    public class125[] field1508;

    @ObfuscatedName("dp.t")
    public class262 field1503 = new class262();

    @ObfuscatedName("dp.n")
    public int field1505;

    @ObfuscatedName("dp.q")
    public int field1506 = 0;

    @ObfuscatedName("dp.v")
    public double field1507 = 1.0D;

    @ObfuscatedName("dp.l")
    public int field1504 = 128;

    @ObfuscatedName("dp.c")
    public class234 field1512;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1512 = arg1;
        this.field1505 = arg2;
        this.field1506 = this.field1505;
        this.field1507 = arg3;
        this.field1504 = arg4;
        int[] var7 = arg0.method3887(0);
        int var8 = var7.length;
        this.field1508 = new class125[arg0.method3953(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3873(0, var7[var9]));
            this.field1508[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dp.a(I)I")
    public int method2635() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1508;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1600 != null) {
                var1 += var5.field1600.length;
                int[] var6 = var5.field1600;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1512.method3898(var8)) {
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

    @ObfuscatedName("dp.t(D)V")
    public void method2609(double arg0) {
        this.field1507 = arg0;
        this.method2614();
    }

    @ObfuscatedName("dp.n(II)[I")
    public int[] method2608(int arg0) {
        class125 var2 = this.field1508[arg0];
        if (var2 != null) {
            if (var2.field1606 != null) {
                this.field1503.method4577(var2);
                var2.field1607 = true;
                return var2.field1606;
            }
            boolean var3 = var2.method2715(this.field1507, this.field1504, this.field1512);
            if (var3) {
                if (this.field1506 == 0) {
                    class125 var4 = (class125) this.field1503.method4580();
                    var4.method2722();
                } else {
                    this.field1506--;
                }
                this.field1503.method4577(var2);
                var2.field1607 = true;
                return var2.field1606;
            }
        }
        return null;
    }

    @ObfuscatedName("dp.q(IB)I")
    public int method2637(int arg0) {
        return this.field1508[arg0] == null ? 0 : this.field1508[arg0].field1597;
    }

    @ObfuscatedName("dp.v(II)Z")
    public boolean method2621(int arg0) {
        return this.field1508[arg0].field1594;
    }

    @ObfuscatedName("dp.l(II)Z")
    public boolean method2613(int arg0) {
        return this.field1504 == 64;
    }

    @ObfuscatedName("dp.c(I)V")
    public void method2614() {
        for (int var1 = 0; var1 < this.field1508.length; var1++) {
            if (this.field1508[var1] != null) {
                this.field1508[var1].method2722();
            }
        }
        this.field1503 = new class262();
        this.field1506 = this.field1505;
    }

    @ObfuscatedName("dp.o(II)V")
    public void method2633(int arg0) {
        for (int var2 = 0; var2 < this.field1508.length; var2++) {
            class125 var3 = this.field1508[var2];
            if (var3 != null && var3.field1604 != 0 && var3.field1607) {
                var3.method2717(arg0);
                var3.field1607 = false;
            }
        }
    }
}
