package deob;

@ObfuscatedName("eh")
public class class131 {

    @ObfuscatedName("eh.x")
    public class132 field1892 = new class132();

    @ObfuscatedName("eh.n")
    public class132 field1891;

    public class131() {
        this.field1892.field1894 = this.field1892;
        this.field1892.field1893 = this.field1892;
    }

    @ObfuscatedName("eh.x(Lex;)V")
    public void method2364(class132 arg0) {
        if (arg0.field1893 != null) {
            arg0.method2374();
        }
        arg0.field1893 = this.field1892.field1893;
        arg0.field1894 = this.field1892;
        arg0.field1893.field1894 = arg0;
        arg0.field1894.field1893 = arg0;
    }

    @ObfuscatedName("eh.n()Lex;")
    public class132 method2365() {
        class132 var1 = this.field1892.field1894;
        if (this.field1892 == var1) {
            this.field1891 = null;
            return null;
        } else {
            this.field1891 = var1.field1894;
            return var1;
        }
    }

    @ObfuscatedName("eh.g()Lex;")
    public class132 method2369() {
        class132 var1 = this.field1891;
        if (this.field1892 == var1) {
            this.field1891 = null;
            return null;
        } else {
            this.field1891 = var1.field1894;
            return var1;
        }
    }
}
