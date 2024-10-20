package deob;

@ObfuscatedName("di")
public class class129 implements class149 {

    @ObfuscatedName("di.x")
    public class134[] field1546;

    @ObfuscatedName("di.m")
    public class272 field1544 = new class272();

    @ObfuscatedName("di.k")
    public int field1545;

    @ObfuscatedName("di.d")
    public int field1553 = 0;

    @ObfuscatedName("di.w")
    public double field1547 = 1.0D;

    @ObfuscatedName("di.v")
    public int field1548 = 128;

    @ObfuscatedName("di.q")
    public class244 field1549;

    public class129(class244 arg0, class244 arg1, int arg2, double arg3, int arg4) {
        this.field1549 = arg1;
        this.field1545 = arg2;
        this.field1553 = this.field1545;
        this.field1547 = arg3;
        this.field1548 = arg4;
        int[] var7 = arg0.method3879(0);
        int var8 = var7.length;
        this.field1546 = new class134[arg0.method3891(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class310 var10 = new class310(arg0.method3869(0, var7[var9]));
            this.field1546[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("di.x(I)I")
    public int method2588() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1546;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1640 != null) {
                var1 += var5.field1640.length;
                int[] var6 = var5.field1640;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1549.method3872(var8)) {
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

    @ObfuscatedName("di.m(D)V")
    public void method2589(double arg0) {
        this.field1547 = arg0;
        this.method2594();
    }

    @ObfuscatedName("di.k(II)[I")
    public int[] method2614(int arg0) {
        class134 var2 = this.field1546[arg0];
        if (var2 != null) {
            if (var2.field1638 != null) {
                this.field1544.method4555(var2);
                var2.field1647 = true;
                return var2.field1638;
            }
            boolean var3 = var2.method2690(this.field1547, this.field1548, this.field1549);
            if (var3) {
                if (this.field1553 == 0) {
                    class134 var4 = (class134) this.field1544.method4558();
                    var4.method2691();
                } else {
                    this.field1553--;
                }
                this.field1544.method4555(var2);
                var2.field1647 = true;
                return var2.field1638;
            }
        }
        return null;
    }

    @ObfuscatedName("di.d(IS)I")
    public int method2591(int arg0) {
        return this.field1546[arg0] == null ? 0 : this.field1546[arg0].field1642;
    }

    @ObfuscatedName("di.w(II)Z")
    public boolean method2592(int arg0) {
        return this.field1546[arg0].field1639;
    }

    @ObfuscatedName("di.v(II)Z")
    public boolean method2599(int arg0) {
        return this.field1548 == 64;
    }

    @ObfuscatedName("di.q(I)V")
    public void method2594() {
        for (int var1 = 0; var1 < this.field1546.length; var1++) {
            if (this.field1546[var1] != null) {
                this.field1546[var1].method2691();
            }
        }
        this.field1544 = new class272();
        this.field1553 = this.field1545;
    }

    @ObfuscatedName("di.z(II)V")
    public void method2595(int arg0) {
        for (int var2 = 0; var2 < this.field1546.length; var2++) {
            class134 var3 = this.field1546[var2];
            if (var3 != null && var3.field1644 != 0 && var3.field1647) {
                var3.method2692(arg0);
                var3.field1647 = false;
            }
        }
    }
}
