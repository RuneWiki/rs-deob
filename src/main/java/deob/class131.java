package deob;

@ObfuscatedName("eu")
public class class131 {

    @ObfuscatedName("eu.i")
    public class132 field1884 = new class132();

    @ObfuscatedName("eu.e")
    public class132 field1885;

    public class131() {
        this.field1884.field1887 = this.field1884;
        this.field1884.field1886 = this.field1884;
    }

    @ObfuscatedName("eu.i(Lew;)V")
    public void method2243(class132 arg0) {
        if (arg0.field1886 != null) {
            arg0.method2256();
        }
        arg0.field1886 = this.field1884.field1886;
        arg0.field1887 = this.field1884;
        arg0.field1886.field1887 = arg0;
        arg0.field1887.field1886 = arg0;
    }

    @ObfuscatedName("eu.e()Lew;")
    public class132 method2249() {
        class132 var1 = this.field1884.field1887;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1887;
            return var1;
        }
    }

    @ObfuscatedName("eu.f()Lew;")
    public class132 method2245() {
        class132 var1 = this.field1885;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1887;
            return var1;
        }
    }
}
