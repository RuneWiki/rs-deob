package deob;

@ObfuscatedName("dz")
public class class120 implements class140 {

    @ObfuscatedName("dz.z")
    public class125[] field1503;

    @ObfuscatedName("dz.n")
    public class262 field1498 = new class262();

    @ObfuscatedName("dz.v")
    public int field1499;

    @ObfuscatedName("dz.u")
    public int field1500 = 0;

    @ObfuscatedName("dz.r")
    public double field1497 = 1.0D;

    @ObfuscatedName("dz.p")
    public int field1502 = 128;

    @ObfuscatedName("dz.q")
    public class234 field1501;

    public class120(class234 arg0, class234 arg1, int arg2, double arg3, int arg4) {
        this.field1501 = arg1;
        this.field1499 = arg2;
        this.field1500 = this.field1499;
        this.field1497 = arg3;
        this.field1502 = arg4;
        int[] var7 = arg0.method3748(0);
        int var8 = var7.length;
        this.field1503 = new class125[arg0.method3738(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class300 var10 = new class300(arg0.method3726(0, var7[var9]));
            this.field1503[var7[var9]] = new class125(var10);
        }
    }

    @ObfuscatedName("dz.z(I)I")
    public int method2461() {
        int var1 = 0;
        int var2 = 0;
        class125[] var3 = this.field1503;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class125 var5 = var3[var4];
            if (var5 != null && var5.field1589 != null) {
                var1 += var5.field1589.length;
                int[] var6 = var5.field1589;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1501.method3737(var8)) {
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

    @ObfuscatedName("dz.n(D)V")
    public void method2462(double arg0) {
        this.field1497 = arg0;
        this.method2467();
    }

    @ObfuscatedName("dz.v(IB)[I")
    public int[] method2463(int arg0) {
        class125 var2 = this.field1503[arg0];
        if (var2 != null) {
            if (var2.field1595 != null) {
                this.field1498.method4434(var2);
                var2.field1596 = true;
                return var2.field1595;
            }
            boolean var3 = var2.method2578(this.field1497, this.field1502, this.field1501);
            if (var3) {
                if (this.field1500 == 0) {
                    class125 var4 = (class125) this.field1498.method4437();
                    var4.method2579();
                } else {
                    this.field1500--;
                }
                this.field1498.method4434(var2);
                var2.field1596 = true;
                return var2.field1595;
            }
        }
        return null;
    }

    @ObfuscatedName("dz.u(II)I")
    public int method2493(int arg0) {
        return this.field1503[arg0] == null ? 0 : this.field1503[arg0].field1587;
    }

    @ObfuscatedName("dz.r(II)Z")
    public boolean method2478(int arg0) {
        return this.field1503[arg0].field1588;
    }

    @ObfuscatedName("dz.p(II)Z")
    public boolean method2466(int arg0) {
        return this.field1502 == 64;
    }

    @ObfuscatedName("dz.q(I)V")
    public void method2467() {
        for (int var1 = 0; var1 < this.field1503.length; var1++) {
            if (this.field1503[var1] != null) {
                this.field1503[var1].method2579();
            }
        }
        this.field1498 = new class262();
        this.field1500 = this.field1499;
    }

    @ObfuscatedName("dz.m(IB)V")
    public void method2468(int arg0) {
        for (int var2 = 0; var2 < this.field1503.length; var2++) {
            class125 var3 = this.field1503[var2];
            if (var3 != null && var3.field1583 != 0 && var3.field1596) {
                var3.method2577(arg0);
                var3.field1596 = false;
            }
        }
    }
}
