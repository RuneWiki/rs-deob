package deob;

@ObfuscatedName("ek")
public class class131 {

    @ObfuscatedName("ek.q")
    public class132 field1888 = new class132();

    @ObfuscatedName("ek.d")
    public class132 field1889;

    public class131() {
        this.field1888.field1891 = this.field1888;
        this.field1888.field1890 = this.field1888;
    }

    @ObfuscatedName("ek.q(Leg;)V")
    public void method2348(class132 arg0) {
        if (arg0.field1890 != null) {
            arg0.method2357();
        }
        arg0.field1890 = this.field1888.field1890;
        arg0.field1891 = this.field1888;
        arg0.field1890.field1891 = arg0;
        arg0.field1891.field1890 = arg0;
    }

    @ObfuscatedName("ek.d()Leg;")
    public class132 method2349() {
        class132 var1 = this.field1888.field1891;
        if (this.field1888 == var1) {
            this.field1889 = null;
            return null;
        } else {
            this.field1889 = var1.field1891;
            return var1;
        }
    }

    @ObfuscatedName("ek.h()Leg;")
    public class132 method2350() {
        class132 var1 = this.field1889;
        if (this.field1888 == var1) {
            this.field1889 = null;
            return null;
        } else {
            this.field1889 = var1.field1891;
            return var1;
        }
    }
}
