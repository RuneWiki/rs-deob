package deob;

@ObfuscatedName("db")
public class class120 implements class140 {

    @ObfuscatedName("db.u")
    public class125[] field1520;

    @ObfuscatedName("db.f")
    public class262 field1522 = new class262();

    @ObfuscatedName("db.b")
    public int field1521;

    @ObfuscatedName("db.g")
    public int field1526 = 0;

    @ObfuscatedName("db.z")
    public double field1523 = 1.0D;

    @ObfuscatedName("db.p")
    public int field1525 = 128;

    @ObfuscatedName("db.h")
    public class234 field1519;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1519 = arg1;
        this.field1521 = arg2;
        this.field1526 = this.field1521;
        this.field1523 = arg3;
        this.field1525 = arg4;
        int[] var7 = arg0.method3854(0);
        int var8 = var7.length;
        this.field1520 = new class125[arg0.method3878(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3928(0, var7[var9]));
            this.field1520[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("db.u(I)I")
    public int method2538() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1520;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1613 != null) {
                var1 += var5.field1613.length;
                int[] var6 = var5.field1613;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1519.method3846(var8)) {
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

    @ObfuscatedName("db.f(D)V")
    public void method2527(double arg0) {
        this.field1523 = arg0;
        this.method2519();
    }

    @ObfuscatedName("db.b(IB)[I")
    public int[] method2515(int arg0) {
        class125 var2 = this.field1520[arg0];
        if (var2 != null) {
            if (var2.field1623 != null) {
                this.field1522.method4564(var2);
                var2.field1624 = true;
                return var2.field1623;
            }
            boolean var3 = var2.method2625(this.field1523, this.field1525, this.field1519);
            if (var3) {
                if (this.field1526 == 0) {
                    class125 var4 = (class125) this.field1522.method4567();
                    var4.method2626();
                } else {
                    this.field1526--;
                }
                this.field1522.method4564(var2);
                var2.field1624 = true;
                return var2.field1623;
            }
        }
        return null;
    }

    @ObfuscatedName("db.g(II)I")
    public int method2516(int arg0) {
        return this.field1520[arg0] == null ? 0 : this.field1520[arg0].field1615;
    }

    @ObfuscatedName("db.z(II)Z")
    public boolean method2518(int arg0) {
        return this.field1520[arg0].field1616;
    }

    @ObfuscatedName("db.p(II)Z")
    public boolean method2524(int arg0) {
        return this.field1525 == 64;
    }

    @ObfuscatedName("db.h(I)V")
    public void method2519() {
        for (int var1 = 0; var1 < this.field1520.length; var1++) {
            if (this.field1520[var1] != null) {
                this.field1520[var1].method2626();
            }
        }
        this.field1522 = new class262();
        this.field1526 = this.field1521;
    }

    @ObfuscatedName("db.y(II)V")
    public void method2520(int arg0) {
        for (int var2 = 0; var2 < this.field1520.length; var2++) {
            class125 var3 = this.field1520[var2];
            if (var3 != null && var3.field1621 != 0 && var3.field1624) {
                var3.method2627(arg0);
                var3.field1624 = false;
            }
        }
    }
}
