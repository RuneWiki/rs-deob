package deob;

@ObfuscatedName("di")
public class class125 implements class145 {

    @ObfuscatedName("di.b")
    public class130[] field1692;

    @ObfuscatedName("di.s")
    public class201 field1684 = new class201();

    @ObfuscatedName("di.r")
    public int field1685;

    @ObfuscatedName("di.g")
    public int field1686 = 0;

    @ObfuscatedName("di.x")
    public double field1683 = 1.0D;

    @ObfuscatedName("di.f")
    public int field1688 = 128;

    @ObfuscatedName("di.u")
    public class243 field1689;

    public class125(class243 arg0, class243 arg1, int arg2, double arg3, int arg4) {
        this.field1689 = arg1;
        this.field1685 = arg2;
        this.field1686 = this.field1685;
        this.field1683 = arg3;
        this.field1688 = arg4;
        int[] var7 = arg0.method3827(0);
        int var8 = var7.length;
        this.field1692 = new class130[arg0.method3883(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class181 var10 = new class181(arg0.method3887(0, var7[var9]));
            this.field1692[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("di.b(D)V")
    public void method2210(double arg0) {
        this.field1683 = arg0;
        this.method2213();
    }

    @ObfuscatedName("di.s(IB)[I")
    public int[] method2190(int arg0) {
        class130 var2 = this.field1692[arg0];
        if (var2 != null) {
            if (var2.field1792 != null) {
                this.field1684.method3401(var2);
                var2.field1793 = true;
                return var2.field1792;
            }
            boolean var3 = var2.method2298(this.field1683, this.field1688, this.field1689);
            if (var3) {
                if (this.field1686 == 0) {
                    class130 var4 = (class130) this.field1684.method3420();
                    var4.method2297();
                } else {
                    this.field1686--;
                }
                this.field1684.method3401(var2);
                var2.field1793 = true;
                return var2.field1792;
            }
        }
        return null;
    }

    @ObfuscatedName("di.r(IB)I")
    public int method2192(int arg0) {
        return this.field1692[arg0] == null ? 0 : this.field1692[arg0].field1788;
    }

    @ObfuscatedName("di.g(II)Z")
    public boolean method2191(int arg0) {
        return this.field1692[arg0].field1784;
    }

    @ObfuscatedName("di.x(II)Z")
    public boolean method2193(int arg0) {
        return this.field1688 == 64;
    }

    @ObfuscatedName("di.f(I)V")
    public void method2213() {
        for (int var1 = 0; var1 < this.field1692.length; var1++) {
            if (this.field1692[var1] != null) {
                this.field1692[var1].method2297();
            }
        }
        this.field1684 = new class201();
        this.field1686 = this.field1685;
    }

    @ObfuscatedName("di.u(IB)V")
    public void method2195(int arg0) {
        for (int var2 = 0; var2 < this.field1692.length; var2++) {
            class130 var3 = this.field1692[var2];
            if (var3 != null && var3.field1790 != 0 && var3.field1793) {
                var3.method2300(arg0);
                var3.field1793 = false;
            }
        }
    }
}
