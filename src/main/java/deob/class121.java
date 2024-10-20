package deob;

@ObfuscatedName("dg")
public final class class121 {

    @ObfuscatedName("dg.u")
    public class130 field1847 = new class130();

    public class121() {
        this.field1847.field1873 = this.field1847;
        this.field1847.field1872 = this.field1847;
    }

    @ObfuscatedName("dg.u(Ldm;)V")
    public void method2143(class130 arg0) {
        if (arg0.field1872 != null) {
            arg0.method2264();
        }
        arg0.field1872 = this.field1847.field1872;
        arg0.field1873 = this.field1847;
        arg0.field1872.field1873 = arg0;
        arg0.field1873.field1872 = arg0;
    }

    @ObfuscatedName("dg.x(Ldm;)V")
    public void method2136(class130 arg0) {
        if (arg0.field1872 != null) {
            arg0.method2264();
        }
        arg0.field1872 = this.field1847;
        arg0.field1873 = this.field1847.field1873;
        arg0.field1872.field1873 = arg0;
        arg0.field1873.field1872 = arg0;
    }

    @ObfuscatedName("dg.i()Ldm;")
    public class130 method2134() {
        class130 var1 = this.field1847.field1873;
        if (this.field1847 == var1) {
            return null;
        } else {
            var1.method2264();
            return var1;
        }
    }

    @ObfuscatedName("dg.a()Ldm;")
    public class130 method2132() {
        class130 var1 = this.field1847.field1873;
        return this.field1847 == var1 ? null : var1;
    }

    @ObfuscatedName("dg.c()V")
    public void method2147() {
        while (true) {
            class130 var1 = this.field1847.field1873;
            if (this.field1847 == var1) {
                return;
            }
            var1.method2264();
        }
    }
}
