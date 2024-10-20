package deob;

@ObfuscatedName("dt")
public class class129 implements class149 {

    @ObfuscatedName("dt.z")
    public class134[] field1555;

    @ObfuscatedName("dt.k")
    public class272 field1556 = new class272();

    @ObfuscatedName("dt.s")
    public int field1557;

    @ObfuscatedName("dt.t")
    public int field1558 = 0;

    @ObfuscatedName("dt.i")
    public double field1561 = 1.0D;

    @ObfuscatedName("dt.o")
    public int field1560 = 128;

    @ObfuscatedName("dt.x")
    public class244 field1559;

    public class129(class244 arg0, class244 arg1, int arg2, double arg3, int arg4) {
        this.field1559 = arg1;
        this.field1557 = arg2;
        this.field1558 = this.field1557;
        this.field1561 = arg3;
        this.field1560 = arg4;
        int[] var7 = arg0.method3952(0);
        int var8 = var7.length;
        this.field1555 = new class134[arg0.method3884(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class310 var10 = new class310(arg0.method3873(0, var7[var9]));
            this.field1555[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("dt.z(I)I")
    public int method2612() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1555;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1649 != null) {
                var1 += var5.field1649.length;
                int[] var6 = var5.field1649;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1559.method3887(var8)) {
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

    @ObfuscatedName("dt.k(D)V")
    public void method2613(double arg0) {
        this.field1561 = arg0;
        this.method2618();
    }

    @ObfuscatedName("dt.s(II)[I")
    public int[] method2614(int arg0) {
        class134 var2 = this.field1555[arg0];
        if (var2 != null) {
            if (var2.field1655 != null) {
                this.field1556.method4617(var2);
                var2.field1656 = true;
                return var2.field1655;
            }
            boolean var3 = var2.method2732(this.field1561, this.field1560, this.field1559);
            if (var3) {
                if (this.field1558 == 0) {
                    class134 var4 = (class134) this.field1556.method4620();
                    var4.method2731();
                } else {
                    this.field1558--;
                }
                this.field1556.method4617(var2);
                var2.field1656 = true;
                return var2.field1655;
            }
        }
        return null;
    }

    @ObfuscatedName("dt.t(II)I")
    public int method2615(int arg0) {
        return this.field1555[arg0] == null ? 0 : this.field1555[arg0].field1647;
    }

    @ObfuscatedName("dt.i(II)Z")
    public boolean method2626(int arg0) {
        return this.field1555[arg0].field1648;
    }

    @ObfuscatedName("dt.o(IS)Z")
    public boolean method2617(int arg0) {
        return this.field1560 == 64;
    }

    @ObfuscatedName("dt.x(B)V")
    public void method2618() {
        for (int var1 = 0; var1 < this.field1555.length; var1++) {
            if (this.field1555[var1] != null) {
                this.field1555[var1].method2731();
            }
        }
        this.field1556 = new class272();
        this.field1558 = this.field1557;
    }

    @ObfuscatedName("dt.w(II)V")
    public void method2619(int arg0) {
        for (int var2 = 0; var2 < this.field1555.length; var2++) {
            class134 var3 = this.field1555[var2];
            if (var3 != null && var3.field1644 != 0 && var3.field1656) {
                var3.method2737(arg0);
                var3.field1656 = false;
            }
        }
    }
}
