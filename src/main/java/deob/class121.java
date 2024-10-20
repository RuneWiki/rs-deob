package deob;

@ObfuscatedName("dv")
public final class class121 {

    @ObfuscatedName("dv.q")
    public class130 field1861 = new class130();

    public class121() {
        this.field1861.field1886 = this.field1861;
        this.field1861.field1887 = this.field1861;
    }

    @ObfuscatedName("dv.q(Ldr;)V")
    public void method2218(class130 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2345();
        }
        arg0.field1887 = this.field1861.field1887;
        arg0.field1886 = this.field1861;
        arg0.field1887.field1886 = arg0;
        arg0.field1886.field1887 = arg0;
    }

    @ObfuscatedName("dv.d(Ldr;)V")
    public void method2207(class130 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2345();
        }
        arg0.field1887 = this.field1861;
        arg0.field1886 = this.field1861.field1886;
        arg0.field1887.field1886 = arg0;
        arg0.field1886.field1887 = arg0;
    }

    @ObfuscatedName("dv.h()Ldr;")
    public class130 method2208() {
        class130 var1 = this.field1861.field1886;
        if (this.field1861 == var1) {
            return null;
        } else {
            var1.method2345();
            return var1;
        }
    }

    @ObfuscatedName("dv.p()Ldr;")
    public class130 method2209() {
        class130 var1 = this.field1861.field1886;
        return this.field1861 == var1 ? null : var1;
    }

    @ObfuscatedName("dv.j()V")
    public void method2210() {
        while (true) {
            class130 var1 = this.field1861.field1886;
            if (this.field1861 == var1) {
                return;
            }
            var1.method2345();
        }
    }
}
