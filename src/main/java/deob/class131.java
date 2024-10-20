package deob;

@ObfuscatedName("ew")
public class class131 {

    @ObfuscatedName("ew.p")
    public class132 field1891 = new class132();

    @ObfuscatedName("ew.g")
    public class132 field1890;

    public class131() {
        this.field1891.field1892 = this.field1891;
        this.field1891.field1893 = this.field1891;
    }

    @ObfuscatedName("ew.p(Leh;)V")
    public void method2269(class132 arg0) {
        if (arg0.field1893 != null) {
            arg0.method2276();
        }
        arg0.field1893 = this.field1891.field1893;
        arg0.field1892 = this.field1891;
        arg0.field1893.field1892 = arg0;
        arg0.field1892.field1893 = arg0;
    }

    @ObfuscatedName("ew.g()Leh;")
    public class132 method2271() {
        class132 var1 = this.field1891.field1892;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1892;
            return var1;
        }
    }

    @ObfuscatedName("ew.x()Leh;")
    public class132 method2273() {
        class132 var1 = this.field1890;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1892;
            return var1;
        }
    }
}
