package deob;

@ObfuscatedName("eb")
public class class131 {

    @ObfuscatedName("eb.x")
    public class132 field1890 = new class132();

    @ObfuscatedName("eb.j")
    public class132 field1891;

    public class131() {
        this.field1890.field1892 = this.field1890;
        this.field1890.field1893 = this.field1890;
    }

    @ObfuscatedName("eb.x(Lea;)V")
    public void method2322(class132 arg0) {
        if (arg0.field1893 != null) {
            arg0.method2333();
        }
        arg0.field1893 = this.field1890.field1893;
        arg0.field1892 = this.field1890;
        arg0.field1893.field1892 = arg0;
        arg0.field1892.field1893 = arg0;
    }

    @ObfuscatedName("eb.j()Lea;")
    public class132 method2321() {
        class132 var1 = this.field1890.field1892;
        if (this.field1890 == var1) {
            this.field1891 = null;
            return null;
        } else {
            this.field1891 = var1.field1892;
            return var1;
        }
    }

    @ObfuscatedName("eb.c()Lea;")
    public class132 method2323() {
        class132 var1 = this.field1891;
        if (this.field1890 == var1) {
            this.field1891 = null;
            return null;
        } else {
            this.field1891 = var1.field1892;
            return var1;
        }
    }
}
