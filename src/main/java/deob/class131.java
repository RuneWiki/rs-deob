package deob;

@ObfuscatedName("ef")
public class class131 {

    @ObfuscatedName("ef.n")
    public class132 field1885 = new class132();

    @ObfuscatedName("ef.d")
    public class132 field1886;

    public class131() {
        this.field1885.field1887 = this.field1885;
        this.field1885.field1888 = this.field1885;
    }

    @ObfuscatedName("ef.n(Lec;)V")
    public void method2311(class132 arg0) {
        if (arg0.field1888 != null) {
            arg0.method2325();
        }
        arg0.field1888 = this.field1885.field1888;
        arg0.field1887 = this.field1885;
        arg0.field1888.field1887 = arg0;
        arg0.field1887.field1888 = arg0;
    }

    @ObfuscatedName("ef.d()Lec;")
    public class132 method2313() {
        class132 var1 = this.field1885.field1887;
        if (this.field1885 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1887;
            return var1;
        }
    }

    @ObfuscatedName("ef.m()Lec;")
    public class132 method2312() {
        class132 var1 = this.field1886;
        if (this.field1885 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1887;
            return var1;
        }
    }
}
