package deob;

@ObfuscatedName("eg")
public class class131 {

    @ObfuscatedName("eg.b")
    public class132 field1871 = new class132();

    @ObfuscatedName("eg.e")
    public class132 field1872;

    public class131() {
        this.field1871.field1873 = this.field1871;
        this.field1871.field1874 = this.field1871;
    }

    @ObfuscatedName("eg.b(Lef;)V")
    public void method2347(class132 arg0) {
        if (arg0.field1874 != null) {
            arg0.method2358();
        }
        arg0.field1874 = this.field1871.field1874;
        arg0.field1873 = this.field1871;
        arg0.field1874.field1873 = arg0;
        arg0.field1873.field1874 = arg0;
    }

    @ObfuscatedName("eg.e()Lef;")
    public class132 method2346() {
        class132 var1 = this.field1871.field1873;
        if (this.field1871 == var1) {
            this.field1872 = null;
            return null;
        } else {
            this.field1872 = var1.field1873;
            return var1;
        }
    }

    @ObfuscatedName("eg.c()Lef;")
    public class132 method2349() {
        class132 var1 = this.field1872;
        if (this.field1871 == var1) {
            this.field1872 = null;
            return null;
        } else {
            this.field1872 = var1.field1873;
            return var1;
        }
    }
}
