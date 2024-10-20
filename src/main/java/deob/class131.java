package deob;

@ObfuscatedName("en")
public class class131 {

    @ObfuscatedName("en.f")
    public class132 field1912 = new class132();

    @ObfuscatedName("en.i")
    public class132 field1911;

    public class131() {
        this.field1912.field1913 = this.field1912;
        this.field1912.field1914 = this.field1912;
    }

    @ObfuscatedName("en.f(Ley;)V")
    public void method2335(class132 arg0) {
        if (arg0.field1914 != null) {
            arg0.method2348();
        }
        arg0.field1914 = this.field1912.field1914;
        arg0.field1913 = this.field1912;
        arg0.field1914.field1913 = arg0;
        arg0.field1913.field1914 = arg0;
    }

    @ObfuscatedName("en.i()Ley;")
    public class132 method2336() {
        class132 var1 = this.field1912.field1913;
        if (this.field1912 == var1) {
            this.field1911 = null;
            return null;
        } else {
            this.field1911 = var1.field1913;
            return var1;
        }
    }

    @ObfuscatedName("en.u()Ley;")
    public class132 method2337() {
        class132 var1 = this.field1911;
        if (this.field1912 == var1) {
            this.field1911 = null;
            return null;
        } else {
            this.field1911 = var1.field1913;
            return var1;
        }
    }
}
