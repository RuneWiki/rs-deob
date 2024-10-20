package deob;

@ObfuscatedName("dy")
public class class125 implements class145 {

    @ObfuscatedName("dy.i")
    public class130[] field1788;

    @ObfuscatedName("dy.j")
    public class195 field1793 = new class195();

    @ObfuscatedName("dy.a")
    public int field1790;

    @ObfuscatedName("dy.r")
    public int field1789 = 0;

    @ObfuscatedName("dy.o")
    public double field1786 = 1.0D;

    @ObfuscatedName("dy.n")
    public int field1787 = 128;

    @ObfuscatedName("dy.q")
    public class237 field1792;

    public class125(class237 arg0, class237 arg1, int arg2, double arg3, int arg4) {
        this.field1792 = arg1;
        this.field1790 = arg2;
        this.field1789 = this.field1790;
        this.field1786 = arg3;
        this.field1787 = arg4;
        int[] var7 = arg0.method3890(0);
        int var8 = var7.length;
        this.field1788 = new class130[arg0.method3835(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class175 var10 = new class175(arg0.method3824(0, var7[var9]));
            this.field1788[var7[var9]] = new class130(var10);
        }
    }

    @ObfuscatedName("dy.i(D)V")
    public void method2198(double arg0) {
        this.field1786 = arg0;
        this.method2192();
    }

    @ObfuscatedName("dy.j(II)[I")
    public int[] method2190(int arg0) {
        class130 var2 = this.field1788[arg0];
        if (var2 != null) {
            if (var2.field1889 != null) {
                this.field1793.method3406(var2);
                var2.field1896 = true;
                return var2.field1889;
            }
            boolean var3 = var2.method2296(this.field1786, this.field1787, this.field1792);
            if (var3) {
                if (this.field1789 == 0) {
                    class130 var4 = (class130) this.field1793.method3409();
                    var4.method2297();
                } else {
                    this.field1789--;
                }
                this.field1793.method3406(var2);
                var2.field1896 = true;
                return var2.field1889;
            }
        }
        return null;
    }

    @ObfuscatedName("dy.a(II)I")
    public int method2188(int arg0) {
        return this.field1788[arg0] == null ? 0 : this.field1788[arg0].field1894;
    }

    @ObfuscatedName("dy.r(II)Z")
    public boolean method2186(int arg0) {
        return this.field1788[arg0].field1888;
    }

    @ObfuscatedName("dy.o(II)Z")
    public boolean method2191(int arg0) {
        return this.field1787 == 64;
    }

    @ObfuscatedName("dy.n(I)V")
    public void method2192() {
        for (int var1 = 0; var1 < this.field1788.length; var1++) {
            if (this.field1788[var1] != null) {
                this.field1788[var1].method2297();
            }
        }
        this.field1793 = new class195();
        this.field1789 = this.field1790;
    }

    @ObfuscatedName("dy.q(IB)V")
    public void method2193(int arg0) {
        for (int var2 = 0; var2 < this.field1788.length; var2++) {
            class130 var3 = this.field1788[var2];
            if (var3 != null && var3.field1893 != 0 && var3.field1896) {
                var3.method2298(arg0);
                var3.field1896 = false;
            }
        }
    }
}
