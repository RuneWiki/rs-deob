package deob;

@ObfuscatedName("db")
public class class129 {

    @ObfuscatedName("db.q")
    public class128 field1884 = new class128();

    @ObfuscatedName("db.d")
    public class128 field1885;

    public class129() {
        this.field1884.field1881 = this.field1884;
        this.field1884.field1883 = this.field1884;
    }

    @ObfuscatedName("db.q()V")
    public void method2313() {
        while (true) {
            class128 var1 = this.field1884.field1881;
            if (this.field1884 == var1) {
                this.field1885 = null;
                return;
            }
            var1.method2310();
        }
    }

    @ObfuscatedName("db.d(Ldg;)V")
    public void method2314(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = this.field1884.field1883;
        arg0.field1881 = this.field1884;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("db.h(Ldg;)V")
    public void method2315(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = this.field1884;
        arg0.field1881 = this.field1884.field1881;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("db.p(Ldg;Ldg;)V")
    public static void method2316(class128 arg0, class128 arg1) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = arg1.field1883;
        arg0.field1881 = arg1;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("db.j()Ldg;")
    public class128 method2320() {
        class128 var1 = this.field1884.field1881;
        if (this.field1884 == var1) {
            return null;
        } else {
            var1.method2310();
            return var1;
        }
    }

    @ObfuscatedName("db.n()Ldg;")
    public class128 method2318() {
        class128 var1 = this.field1884.field1883;
        if (this.field1884 == var1) {
            return null;
        } else {
            var1.method2310();
            return var1;
        }
    }

    @ObfuscatedName("db.c()Ldg;")
    public class128 method2319() {
        class128 var1 = this.field1884.field1881;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1881;
            return var1;
        }
    }

    @ObfuscatedName("db.o()Ldg;")
    public class128 method2332() {
        class128 var1 = this.field1884.field1883;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("db.s()Ldg;")
    public class128 method2333() {
        class128 var1 = this.field1885;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1881;
            return var1;
        }
    }

    @ObfuscatedName("db.u()Ldg;")
    public class128 method2322() {
        class128 var1 = this.field1885;
        if (this.field1884 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1883;
            return var1;
        }
    }
}
