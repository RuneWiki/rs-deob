package deob;

@ObfuscatedName("du")
public class class129 implements class149 {

    @ObfuscatedName("du.f")
    public class134[] field1560;

    @ObfuscatedName("du.b")
    public class273 field1559 = new class273();

    @ObfuscatedName("du.l")
    public int field1557;

    @ObfuscatedName("du.m")
    public int field1558 = 0;

    @ObfuscatedName("du.z")
    public double field1555 = 1.0D;

    @ObfuscatedName("du.q")
    public int field1556 = 128;

    @ObfuscatedName("du.k")
    public class245 field1561;

    public class129(class245 arg0, class245 arg1, int arg2, double arg3, int arg4) {
        this.field1561 = arg1;
        this.field1557 = arg2;
        this.field1558 = this.field1557;
        this.field1555 = arg3;
        this.field1556 = arg4;
        int[] var7 = arg0.method3962(0);
        int var8 = var7.length;
        this.field1560 = new class134[arg0.method3963(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class311 var10 = new class311(arg0.method3905(0, var7[var9]));
            this.field1560[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("du.f(I)I")
    public int method2624() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1560;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1652 != null) {
                var1 += var5.field1652.length;
                int[] var6 = var5.field1652;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1561.method3908(var8)) {
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

    @ObfuscatedName("du.b(D)V")
    public void method2618(double arg0) {
        this.field1555 = arg0;
        this.method2623();
    }

    @ObfuscatedName("du.l(II)[I")
    public int[] method2619(int arg0) {
        class134 var2 = this.field1560[arg0];
        if (var2 != null) {
            if (var2.field1658 != null) {
                this.field1559.method4652(var2);
                var2.field1649 = true;
                return var2.field1658;
            }
            boolean var3 = var2.method2732(this.field1555, this.field1556, this.field1561);
            if (var3) {
                if (this.field1558 == 0) {
                    class134 var4 = (class134) this.field1559.method4637();
                    var4.method2725();
                } else {
                    this.field1558--;
                }
                this.field1559.method4652(var2);
                var2.field1649 = true;
                return var2.field1658;
            }
        }
        return null;
    }

    @ObfuscatedName("du.m(II)I")
    public int method2620(int arg0) {
        return this.field1560[arg0] == null ? 0 : this.field1560[arg0].field1650;
    }

    @ObfuscatedName("du.z(II)Z")
    public boolean method2621(int arg0) {
        return this.field1560[arg0].field1656;
    }

    @ObfuscatedName("du.q(II)Z")
    public boolean method2622(int arg0) {
        return this.field1556 == 64;
    }

    @ObfuscatedName("du.k(B)V")
    public void method2623() {
        for (int var1 = 0; var1 < this.field1560.length; var1++) {
            if (this.field1560[var1] != null) {
                this.field1560[var1].method2725();
            }
        }
        this.field1559 = new class273();
        this.field1558 = this.field1557;
    }

    @ObfuscatedName("du.c(II)V")
    public void method2642(int arg0) {
        for (int var2 = 0; var2 < this.field1560.length; var2++) {
            class134 var3 = this.field1560[var2];
            if (var3 != null && var3.field1646 != 0 && var3.field1649) {
                var3.method2726(arg0);
                var3.field1649 = false;
            }
        }
    }
}
