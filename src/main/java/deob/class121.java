package deob;

@ObfuscatedName("dm")
public final class class121 {

    @ObfuscatedName("dm.o")
    public class130 field1874 = new class130();

    public class121() {
        this.field1874.field1900 = this.field1874;
        this.field1874.field1899 = this.field1874;
    }

    @ObfuscatedName("dm.o(Ldn;)V")
    public void method2093(class130 arg0) {
        if (arg0.field1899 != null) {
            arg0.method2232();
        }
        arg0.field1899 = this.field1874.field1899;
        arg0.field1900 = this.field1874;
        arg0.field1899.field1900 = arg0;
        arg0.field1900.field1899 = arg0;
    }

    @ObfuscatedName("dm.m(Ldn;)V")
    public void method2100(class130 arg0) {
        if (arg0.field1899 != null) {
            arg0.method2232();
        }
        arg0.field1899 = this.field1874;
        arg0.field1900 = this.field1874.field1900;
        arg0.field1899.field1900 = arg0;
        arg0.field1900.field1899 = arg0;
    }

    @ObfuscatedName("dm.b()Ldn;")
    public class130 method2102() {
        class130 var1 = this.field1874.field1900;
        if (this.field1874 == var1) {
            return null;
        } else {
            var1.method2232();
            return var1;
        }
    }

    @ObfuscatedName("dm.g()Ldn;")
    public class130 method2096() {
        class130 var1 = this.field1874.field1900;
        return this.field1874 == var1 ? null : var1;
    }

    @ObfuscatedName("dm.l()V")
    public void method2103() {
        while (true) {
            class130 var1 = this.field1874.field1900;
            if (this.field1874 == var1) {
                return;
            }
            var1.method2232();
        }
    }
}
