package deob;

@ObfuscatedName("ew")
public class class131 {

    @ObfuscatedName("ew.b")
    public class132 field1885 = new class132();

    @ObfuscatedName("ew.l")
    public class132 field1884;

    public class131() {
        this.field1885.field1886 = this.field1885;
        this.field1885.field1887 = this.field1885;
    }

    @ObfuscatedName("ew.b(Lev;)V")
    public void method2351(class132 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2362();
        }
        arg0.field1887 = this.field1885.field1887;
        arg0.field1886 = this.field1885;
        arg0.field1887.field1886 = arg0;
        arg0.field1886.field1887 = arg0;
    }

    @ObfuscatedName("ew.l()Lev;")
    public class132 method2352() {
        class132 var1 = this.field1885.field1886;
        if (this.field1885 == var1) {
            this.field1884 = null;
            return null;
        } else {
            this.field1884 = var1.field1886;
            return var1;
        }
    }

    @ObfuscatedName("ew.i()Lev;")
    public class132 method2357() {
        class132 var1 = this.field1884;
        if (this.field1885 == var1) {
            this.field1884 = null;
            return null;
        } else {
            this.field1884 = var1.field1886;
            return var1;
        }
    }
}
