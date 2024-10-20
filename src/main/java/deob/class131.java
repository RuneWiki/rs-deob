package deob;

@ObfuscatedName("em")
public class class131 {

    @ObfuscatedName("em.k")
    public class132 field1881 = new class132();

    @ObfuscatedName("em.y")
    public class132 field1880;

    public class131() {
        this.field1881.field1883 = this.field1881;
        this.field1881.field1882 = this.field1881;
    }

    @ObfuscatedName("em.k(Lec;)V")
    public void method2256(class132 arg0) {
        if (arg0.field1882 != null) {
            arg0.method2266();
        }
        arg0.field1882 = this.field1881.field1882;
        arg0.field1883 = this.field1881;
        arg0.field1882.field1883 = arg0;
        arg0.field1883.field1882 = arg0;
    }

    @ObfuscatedName("em.y()Lec;")
    public class132 method2257() {
        class132 var1 = this.field1881.field1883;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("em.o()Lec;")
    public class132 method2258() {
        class132 var1 = this.field1880;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1883;
            return var1;
        }
    }
}
