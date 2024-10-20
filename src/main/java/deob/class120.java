package deob;

@ObfuscatedName("dt")
public class class120 implements class140 {

    @ObfuscatedName("dt.c")
    public class125[] field1502;

    @ObfuscatedName("dt.x")
    public class262 field1496 = new class262();

    @ObfuscatedName("dt.t")
    public int field1497;

    @ObfuscatedName("dt.g")
    public int field1504 = 0;

    @ObfuscatedName("dt.l")
    public double field1499 = 1.0D;

    @ObfuscatedName("dt.u")
    public int field1500 = 128;

    @ObfuscatedName("dt.j")
    public class234 field1501;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1501 = arg1;
        this.field1497 = arg2;
        this.field1504 = this.field1497;
        this.field1499 = arg3;
        this.field1500 = arg4;
        int[] var7 = arg0.method3836(0);
        int var8 = var7.length;
        this.field1502 = new class125[arg0.method3837(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3825(0, var7[var9]));
            this.field1502[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dt.c(B)I")
    public int method2508() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1502;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1594 != null) {
                var1 += var5.field1594.length;
                int[] var6 = var5.field1594;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1501.method3828(var8)) {
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

    @ObfuscatedName("dt.x(D)V")
    public void method2496(double arg0) {
        this.field1499 = arg0;
        this.method2500();
    }

    @ObfuscatedName("dt.t(II)[I")
    public int[] method2495(int arg0) {
        class125 var2 = this.field1502[arg0];
        if (var2 != null) {
            if (var2.field1600 != null) {
                this.field1496.method4543(var2);
                var2.field1599 = true;
                return var2.field1600;
            }
            boolean var3 = var2.method2615(this.field1499, this.field1500, this.field1501);
            if (var3) {
                if (this.field1504 == 0) {
                    class125 var4 = (class125) this.field1496.method4549();
                    var4.method2611();
                } else {
                    this.field1504--;
                }
                this.field1496.method4543(var2);
                var2.field1599 = true;
                return var2.field1600;
            }
        }
        return null;
    }

    @ObfuscatedName("dt.g(II)I")
    public int method2494(int arg0) {
        return this.field1502[arg0] == null ? 0 : this.field1502[arg0].field1597;
    }

    @ObfuscatedName("dt.l(II)Z")
    public boolean method2516(int arg0) {
        return this.field1502[arg0].field1591;
    }

    @ObfuscatedName("dt.u(II)Z")
    public boolean method2502(int arg0) {
        return this.field1500 == 64;
    }

    @ObfuscatedName("dt.j(B)V")
    public void method2500() {
        for (int var1 = 0; var1 < this.field1502.length; var1++) {
            if (this.field1502[var1] != null) {
                this.field1502[var1].method2611();
            }
        }
        this.field1496 = new class262();
        this.field1504 = this.field1497;
    }

    @ObfuscatedName("dt.v(IS)V")
    public void method2501(int arg0) {
        for (int var2 = 0; var2 < this.field1502.length; var2++) {
            class125 var3 = this.field1502[var2];
            if (var3 != null && var3.field1598 != 0 && var3.field1599) {
                var3.method2610(arg0);
                var3.field1599 = false;
            }
        }
    }
}
