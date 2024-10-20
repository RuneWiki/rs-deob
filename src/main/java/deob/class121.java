package deob;

@ObfuscatedName("du")
public final class class121 {

    @ObfuscatedName("du.x")
    public class130 field1863 = new class130();

    public class121() {
        this.field1863.field1888 = this.field1863;
        this.field1863.field1889 = this.field1863;
    }

    @ObfuscatedName("du.x(Ldf;)V")
    public void method2177(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2318();
        }
        arg0.field1889 = this.field1863.field1889;
        arg0.field1888 = this.field1863;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    @ObfuscatedName("du.j(Ldf;)V")
    public void method2178(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2318();
        }
        arg0.field1889 = this.field1863;
        arg0.field1888 = this.field1863.field1888;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    @ObfuscatedName("du.c()Ldf;")
    public class130 method2179() {
        class130 var1 = this.field1863.field1888;
        if (this.field1863 == var1) {
            return null;
        } else {
            var1.method2318();
            return var1;
        }
    }

    @ObfuscatedName("du.d()Ldf;")
    public class130 method2176() {
        class130 var1 = this.field1863.field1888;
        return this.field1863 == var1 ? null : var1;
    }

    @ObfuscatedName("du.w()V")
    public void method2196() {
        while (true) {
            class130 var1 = this.field1863.field1888;
            if (this.field1863 == var1) {
                return;
            }
            var1.method2318();
        }
    }
}
