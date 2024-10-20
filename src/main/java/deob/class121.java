package deob;

@ObfuscatedName("ds")
public final class class121 {

    @ObfuscatedName("ds.x")
    public class130 field1864 = new class130();

    public class121() {
        this.field1864.field1889 = this.field1864;
        this.field1864.field1890 = this.field1864;
    }

    @ObfuscatedName("ds.x(Ldi;)V")
    public void method2240(class130 arg0) {
        if (arg0.field1890 != null) {
            arg0.method2362();
        }
        arg0.field1890 = this.field1864.field1890;
        arg0.field1889 = this.field1864;
        arg0.field1890.field1889 = arg0;
        arg0.field1889.field1890 = arg0;
    }

    @ObfuscatedName("ds.n(Ldi;)V")
    public void method2239(class130 arg0) {
        if (arg0.field1890 != null) {
            arg0.method2362();
        }
        arg0.field1890 = this.field1864;
        arg0.field1889 = this.field1864.field1889;
        arg0.field1890.field1889 = arg0;
        arg0.field1889.field1890 = arg0;
    }

    @ObfuscatedName("ds.g()Ldi;")
    public class130 method2242() {
        class130 var1 = this.field1864.field1889;
        if (this.field1864 == var1) {
            return null;
        } else {
            var1.method2362();
            return var1;
        }
    }

    @ObfuscatedName("ds.v()Ldi;")
    public class130 method2241() {
        class130 var1 = this.field1864.field1889;
        return this.field1864 == var1 ? null : var1;
    }

    @ObfuscatedName("ds.y()V")
    public void method2243() {
        while (true) {
            class130 var1 = this.field1864.field1889;
            if (this.field1864 == var1) {
                return;
            }
            var1.method2362();
        }
    }
}
