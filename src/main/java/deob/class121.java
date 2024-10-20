package deob;

@ObfuscatedName("di")
public final class class121 {

    @ObfuscatedName("di.b")
    public class130 field1844 = new class130();

    public class121() {
        this.field1844.field1870 = this.field1844;
        this.field1844.field1869 = this.field1844;
    }

    @ObfuscatedName("di.b(Ldh;)V")
    public void method2210(class130 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2343();
        }
        arg0.field1869 = this.field1844.field1869;
        arg0.field1870 = this.field1844;
        arg0.field1869.field1870 = arg0;
        arg0.field1870.field1869 = arg0;
    }

    @ObfuscatedName("di.e(Ldh;)V")
    public void method2211(class130 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2343();
        }
        arg0.field1869 = this.field1844;
        arg0.field1870 = this.field1844.field1870;
        arg0.field1869.field1870 = arg0;
        arg0.field1870.field1869 = arg0;
    }

    @ObfuscatedName("di.c()Ldh;")
    public class130 method2213() {
        class130 var1 = this.field1844.field1870;
        if (this.field1844 == var1) {
            return null;
        } else {
            var1.method2343();
            return var1;
        }
    }

    @ObfuscatedName("di.l()Ldh;")
    public class130 method2212() {
        class130 var1 = this.field1844.field1870;
        return this.field1844 == var1 ? null : var1;
    }

    @ObfuscatedName("di.y()V")
    public void method2214() {
        while (true) {
            class130 var1 = this.field1844.field1870;
            if (this.field1844 == var1) {
                return;
            }
            var1.method2343();
        }
    }
}
