package deob;

@ObfuscatedName("ei")
public class class131 {

    @ObfuscatedName("ei.s")
    public class132 field1895 = new class132();

    @ObfuscatedName("ei.c")
    public class132 field1894;

    public class131() {
        this.field1895.field1896 = this.field1895;
        this.field1895.field1897 = this.field1895;
    }

    @ObfuscatedName("ei.s(Lef;)V")
    public void method2223(class132 arg0) {
        if (arg0.field1897 != null) {
            arg0.method2230();
        }
        arg0.field1897 = this.field1895.field1897;
        arg0.field1896 = this.field1895;
        arg0.field1897.field1896 = arg0;
        arg0.field1896.field1897 = arg0;
    }

    @ObfuscatedName("ei.c()Lef;")
    public class132 method2224() {
        class132 var1 = this.field1895.field1896;
        if (this.field1895 == var1) {
            this.field1894 = null;
            return null;
        } else {
            this.field1894 = var1.field1896;
            return var1;
        }
    }

    @ObfuscatedName("ei.f()Lef;")
    public class132 method2225() {
        class132 var1 = this.field1894;
        if (this.field1895 == var1) {
            this.field1894 = null;
            return null;
        } else {
            this.field1894 = var1.field1896;
            return var1;
        }
    }
}
