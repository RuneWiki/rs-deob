package deob;

@ObfuscatedName("dt")
public class class120 implements class140 {

    @ObfuscatedName("dt.f")
    public class125[] field1509;

    @ObfuscatedName("dt.i")
    public class262 field1504 = new class262();

    @ObfuscatedName("dt.y")
    public int field1505;

    @ObfuscatedName("dt.w")
    public int field1506 = 0;

    @ObfuscatedName("dt.p")
    public double field1507 = 1.0D;

    @ObfuscatedName("dt.b")
    public int field1510 = 128;

    @ObfuscatedName("dt.e")
    public class234 field1508;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1508 = arg1;
        this.field1505 = arg2;
        this.field1506 = this.field1505;
        this.field1507 = arg3;
        this.field1510 = arg4;
        int[] var7 = arg0.method3808(0);
        int var8 = var7.length;
        this.field1509 = new class125[arg0.method3764(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3752(0, var7[var9]));
            this.field1509[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dt.f(I)I")
    public int method2519() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1509;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1607 != null) {
                var1 += var5.field1607.length;
                int[] var6 = var5.field1607;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1508.method3784(var8)) {
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

    @ObfuscatedName("dt.i(D)V")
    public void method2516(double arg0) {
        this.field1507 = arg0;
        this.method2521();
    }

    @ObfuscatedName("dt.y(IS)[I")
    public int[] method2532(int arg0) {
        class125 var2 = this.field1509[arg0];
        if (var2 != null) {
            if (var2.field1600 != null) {
                this.field1504.method4535(var2);
                var2.field1608 = true;
                return var2.field1600;
            }
            boolean var3 = var2.method2620(this.field1507, this.field1510, this.field1508);
            if (var3) {
                if (this.field1506 == 0) {
                    class125 var4 = (class125) this.field1504.method4530();
                    var4.method2621();
                } else {
                    this.field1506--;
                }
                this.field1504.method4535(var2);
                var2.field1608 = true;
                return var2.field1600;
            }
        }
        return null;
    }

    @ObfuscatedName("dt.w(II)I")
    public int method2518(int arg0) {
        return this.field1509[arg0] == null ? 0 : this.field1509[arg0].field1595;
    }

    @ObfuscatedName("dt.p(II)Z")
    public boolean method2517(int arg0) {
        return this.field1509[arg0].field1603;
    }

    @ObfuscatedName("dt.b(IB)Z")
    public boolean method2526(int arg0) {
        return this.field1510 == 64;
    }

    @ObfuscatedName("dt.e(I)V")
    public void method2521() {
        for (int var1 = 0; var1 < this.field1509.length; var1++) {
            if (this.field1509[var1] != null) {
                this.field1509[var1].method2621();
            }
        }
        this.field1504 = new class262();
        this.field1506 = this.field1505;
    }

    @ObfuscatedName("dt.x(II)V")
    public void method2522(int arg0) {
        for (int var2 = 0; var2 < this.field1509.length; var2++) {
            class125 var3 = this.field1509[var2];
            if (var3 != null && var3.field1605 != 0 && var3.field1608) {
                var3.method2622(arg0);
                var3.field1608 = false;
            }
        }
    }
}
