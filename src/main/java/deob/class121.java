package deob;

@ObfuscatedName("dh")
public final class class121 {

    @ObfuscatedName("dh.p")
    public class130 field1863 = new class130();

    public class121() {
        this.field1863.field1888 = this.field1863;
        this.field1863.field1889 = this.field1863;
    }

    @ObfuscatedName("dh.p(Ldp;)V")
    public void method2129(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2265();
        }
        arg0.field1889 = this.field1863.field1889;
        arg0.field1888 = this.field1863;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    @ObfuscatedName("dh.g(Ldp;)V")
    public void method2131(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2265();
        }
        arg0.field1889 = this.field1863;
        arg0.field1888 = this.field1863.field1888;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    @ObfuscatedName("dh.x()Ldp;")
    public class130 method2127() {
        class130 var1 = this.field1863.field1888;
        if (this.field1863 == var1) {
            return null;
        } else {
            var1.method2265();
            return var1;
        }
    }

    @ObfuscatedName("dh.q()Ldp;")
    public class130 method2139() {
        class130 var1 = this.field1863.field1888;
        return this.field1863 == var1 ? null : var1;
    }

    @ObfuscatedName("dh.d()V")
    public void method2130() {
        while (true) {
            class130 var1 = this.field1863.field1888;
            if (this.field1863 == var1) {
                return;
            }
            var1.method2265();
        }
    }
}
