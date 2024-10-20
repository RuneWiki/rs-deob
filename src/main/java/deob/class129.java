package deob;

@ObfuscatedName("da")
public class class129 {

    @ObfuscatedName("da.p")
    public class128 field1886 = new class128();

    @ObfuscatedName("da.g")
    public class128 field1887;

    public class129() {
        this.field1886.field1883 = this.field1886;
        this.field1886.field1884 = this.field1886;
    }

    @ObfuscatedName("da.p()V")
    public void method2230() {
        while (true) {
            class128 var1 = this.field1886.field1883;
            if (this.field1886 == var1) {
                this.field1887 = null;
                return;
            }
            var1.method2225();
        }
    }

    @ObfuscatedName("da.g(Ldb;)V")
    public void method2232(class128 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = this.field1886.field1884;
        arg0.field1883 = this.field1886;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("da.x(Ldb;)V")
    public void method2233(class128 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = this.field1886;
        arg0.field1883 = this.field1886.field1883;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("da.q(Ldb;Ldb;)V")
    public static void method2234(class128 arg0, class128 arg1) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = arg1.field1884;
        arg0.field1883 = arg1;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("da.d()Ldb;")
    public class128 method2247() {
        class128 var1 = this.field1886.field1883;
        if (this.field1886 == var1) {
            return null;
        } else {
            var1.method2225();
            return var1;
        }
    }

    @ObfuscatedName("da.k()Ldb;")
    public class128 method2236() {
        class128 var1 = this.field1886.field1884;
        if (this.field1886 == var1) {
            return null;
        } else {
            var1.method2225();
            return var1;
        }
    }

    @ObfuscatedName("da.j()Ldb;")
    public class128 method2237() {
        class128 var1 = this.field1886.field1883;
        if (this.field1886 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("da.s()Ldb;")
    public class128 method2238() {
        class128 var1 = this.field1886.field1884;
        if (this.field1886 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1884;
            return var1;
        }
    }

    @ObfuscatedName("da.o()Ldb;")
    public class128 method2251() {
        class128 var1 = this.field1887;
        if (this.field1886 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("da.a()Ldb;")
    public class128 method2240() {
        class128 var1 = this.field1887;
        if (this.field1886 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1884;
            return var1;
        }
    }
}
