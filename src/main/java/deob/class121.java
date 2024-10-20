package deob;

@ObfuscatedName("du")
public final class class121 {

    @ObfuscatedName("du.n")
    public class130 field1858 = new class130();

    public class121() {
        this.field1858.field1883 = this.field1858;
        this.field1858.field1884 = this.field1858;
    }

    @ObfuscatedName("du.n(Ldx;)V")
    public void method2176(class130 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2307();
        }
        arg0.field1884 = this.field1858.field1884;
        arg0.field1883 = this.field1858;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("du.d(Ldx;)V")
    public void method2194(class130 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2307();
        }
        arg0.field1884 = this.field1858;
        arg0.field1883 = this.field1858.field1883;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("du.m()Ldx;")
    public class130 method2178() {
        class130 var1 = this.field1858.field1883;
        if (this.field1858 == var1) {
            return null;
        } else {
            var1.method2307();
            return var1;
        }
    }

    @ObfuscatedName("du.h()Ldx;")
    public class130 method2179() {
        class130 var1 = this.field1858.field1883;
        return this.field1858 == var1 ? null : var1;
    }

    @ObfuscatedName("du.w()V")
    public void method2180() {
        while (true) {
            class130 var1 = this.field1858.field1883;
            if (this.field1858 == var1) {
                return;
            }
            var1.method2307();
        }
    }
}
