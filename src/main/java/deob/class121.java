package deob;

@ObfuscatedName("dw")
public final class class121 {

    @ObfuscatedName("dw.b")
    public class130 field1857 = new class130();

    public class121() {
        this.field1857.field1882 = this.field1857;
        this.field1857.field1883 = this.field1857;
    }

    @ObfuscatedName("dw.b(Ldp;)V")
    public void method2219(class130 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2349();
        }
        arg0.field1883 = this.field1857.field1883;
        arg0.field1882 = this.field1857;
        arg0.field1883.field1882 = arg0;
        arg0.field1882.field1883 = arg0;
    }

    @ObfuscatedName("dw.l(Ldp;)V")
    public void method2217(class130 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2349();
        }
        arg0.field1883 = this.field1857;
        arg0.field1882 = this.field1857.field1882;
        arg0.field1883.field1882 = arg0;
        arg0.field1882.field1883 = arg0;
    }

    @ObfuscatedName("dw.i()Ldp;")
    public class130 method2218() {
        class130 var1 = this.field1857.field1882;
        if (this.field1857 == var1) {
            return null;
        } else {
            var1.method2349();
            return var1;
        }
    }

    @ObfuscatedName("dw.t()Ldp;")
    public class130 method2228() {
        class130 var1 = this.field1857.field1882;
        return this.field1857 == var1 ? null : var1;
    }

    @ObfuscatedName("dw.k()V")
    public void method2231() {
        while (true) {
            class130 var1 = this.field1857.field1882;
            if (this.field1857 == var1) {
                return;
            }
            var1.method2349();
        }
    }
}
