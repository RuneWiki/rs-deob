package deob;

@ObfuscatedName("ec")
public class class131 {

    @ObfuscatedName("ec.u")
    public class132 field1875 = new class132();

    @ObfuscatedName("ec.x")
    public class132 field1874;

    public class131() {
        this.field1875.field1877 = this.field1875;
        this.field1875.field1876 = this.field1875;
    }

    @ObfuscatedName("ec.u(Lee;)V")
    public void method2268(class132 arg0) {
        if (arg0.field1876 != null) {
            arg0.method2282();
        }
        arg0.field1876 = this.field1875.field1876;
        arg0.field1877 = this.field1875;
        arg0.field1876.field1877 = arg0;
        arg0.field1877.field1876 = arg0;
    }

    @ObfuscatedName("ec.x()Lee;")
    public class132 method2267() {
        class132 var1 = this.field1875.field1877;
        if (this.field1875 == var1) {
            this.field1874 = null;
            return null;
        } else {
            this.field1874 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("ec.i()Lee;")
    public class132 method2270() {
        class132 var1 = this.field1874;
        if (this.field1875 == var1) {
            this.field1874 = null;
            return null;
        } else {
            this.field1874 = var1.field1877;
            return var1;
        }
    }
}
