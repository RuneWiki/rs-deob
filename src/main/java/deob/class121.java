package deob;

@ObfuscatedName("di")
public final class class121 {

    @ObfuscatedName("di.s")
    public class130 field1867 = new class130();

    public class121() {
        this.field1867.field1893 = this.field1867;
        this.field1867.field1892 = this.field1867;
    }

    @ObfuscatedName("di.s(Ldt;)V")
    public void method2083(class130 arg0) {
        if (arg0.field1892 != null) {
            arg0.method2218();
        }
        arg0.field1892 = this.field1867.field1892;
        arg0.field1893 = this.field1867;
        arg0.field1892.field1893 = arg0;
        arg0.field1893.field1892 = arg0;
    }

    @ObfuscatedName("di.c(Ldt;)V")
    public void method2084(class130 arg0) {
        if (arg0.field1892 != null) {
            arg0.method2218();
        }
        arg0.field1892 = this.field1867;
        arg0.field1893 = this.field1867.field1893;
        arg0.field1892.field1893 = arg0;
        arg0.field1893.field1892 = arg0;
    }

    @ObfuscatedName("di.f()Ldt;")
    public class130 method2085() {
        class130 var1 = this.field1867.field1893;
        if (this.field1867 == var1) {
            return null;
        } else {
            var1.method2218();
            return var1;
        }
    }

    @ObfuscatedName("di.g()Ldt;")
    public class130 method2086() {
        class130 var1 = this.field1867.field1893;
        return this.field1867 == var1 ? null : var1;
    }

    @ObfuscatedName("di.k()V")
    public void method2087() {
        while (true) {
            class130 var1 = this.field1867.field1893;
            if (this.field1867 == var1) {
                return;
            }
            var1.method2218();
        }
    }
}
