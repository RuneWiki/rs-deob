package deob;

@ObfuscatedName("dw")
public final class class121 {

    @ObfuscatedName("dw.f")
    public class130 field1884 = new class130();

    public class121() {
        this.field1884.field1910 = this.field1884;
        this.field1884.field1909 = this.field1884;
    }

    @ObfuscatedName("dw.f(Ldm;)V")
    public void method2205(class130 arg0) {
        if (arg0.field1909 != null) {
            arg0.method2332();
        }
        arg0.field1909 = this.field1884.field1909;
        arg0.field1910 = this.field1884;
        arg0.field1909.field1910 = arg0;
        arg0.field1910.field1909 = arg0;
    }

    @ObfuscatedName("dw.i(Ldm;)V")
    public void method2201(class130 arg0) {
        if (arg0.field1909 != null) {
            arg0.method2332();
        }
        arg0.field1909 = this.field1884;
        arg0.field1910 = this.field1884.field1910;
        arg0.field1909.field1910 = arg0;
        arg0.field1910.field1909 = arg0;
    }

    @ObfuscatedName("dw.u()Ldm;")
    public class130 method2202() {
        class130 var1 = this.field1884.field1910;
        if (this.field1884 == var1) {
            return null;
        } else {
            var1.method2332();
            return var1;
        }
    }

    @ObfuscatedName("dw.r()Ldm;")
    public class130 method2206() {
        class130 var1 = this.field1884.field1910;
        return this.field1884 == var1 ? null : var1;
    }

    @ObfuscatedName("dw.o()V")
    public void method2203() {
        while (true) {
            class130 var1 = this.field1884.field1910;
            if (this.field1884 == var1) {
                return;
            }
            var1.method2332();
        }
    }
}
