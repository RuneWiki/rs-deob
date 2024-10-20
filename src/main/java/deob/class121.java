package deob;

@ObfuscatedName("di")
public final class class121 {

    @ObfuscatedName("di.i")
    public class130 field1857 = new class130();

    public class121() {
        this.field1857.field1882 = this.field1857;
        this.field1857.field1883 = this.field1857;
    }

    @ObfuscatedName("di.i(Ldk;)V")
    public void method2108(class130 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2238();
        }
        arg0.field1883 = this.field1857.field1883;
        arg0.field1882 = this.field1857;
        arg0.field1883.field1882 = arg0;
        arg0.field1882.field1883 = arg0;
    }

    @ObfuscatedName("di.e(Ldk;)V")
    public void method2109(class130 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2238();
        }
        arg0.field1883 = this.field1857;
        arg0.field1882 = this.field1857.field1882;
        arg0.field1883.field1882 = arg0;
        arg0.field1882.field1883 = arg0;
    }

    @ObfuscatedName("di.f()Ldk;")
    public class130 method2107() {
        class130 var1 = this.field1857.field1882;
        if (this.field1857 == var1) {
            return null;
        } else {
            var1.method2238();
            return var1;
        }
    }

    @ObfuscatedName("di.k()Ldk;")
    public class130 method2111() {
        class130 var1 = this.field1857.field1882;
        return this.field1857 == var1 ? null : var1;
    }

    @ObfuscatedName("di.a()V")
    public void method2113() {
        while (true) {
            class130 var1 = this.field1857.field1882;
            if (this.field1857 == var1) {
                return;
            }
            var1.method2238();
        }
    }
}
