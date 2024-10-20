package deob;

@ObfuscatedName("ef")
public class class131 {

    @ObfuscatedName("ef.o")
    public class132 field1901 = new class132();

    @ObfuscatedName("ef.m")
    public class132 field1902;

    public class131() {
        this.field1901.field1904 = this.field1901;
        this.field1901.field1903 = this.field1901;
    }

    @ObfuscatedName("ef.o(Lei;)V")
    public void method2239(class132 arg0) {
        if (arg0.field1903 != null) {
            arg0.method2247();
        }
        arg0.field1903 = this.field1901.field1903;
        arg0.field1904 = this.field1901;
        arg0.field1903.field1904 = arg0;
        arg0.field1904.field1903 = arg0;
    }

    @ObfuscatedName("ef.m()Lei;")
    public class132 method2235() {
        class132 var1 = this.field1901.field1904;
        if (this.field1901 == var1) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var1.field1904;
            return var1;
        }
    }

    @ObfuscatedName("ef.b()Lei;")
    public class132 method2236() {
        class132 var1 = this.field1902;
        if (this.field1901 == var1) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var1.field1904;
            return var1;
        }
    }
}
