package deob;

@ObfuscatedName("ds")
public class class129 {

    @ObfuscatedName("ds.i")
    public class128 field1880 = new class128();

    @ObfuscatedName("ds.e")
    public class128 field1881;

    public class129() {
        this.field1880.field1877 = this.field1880;
        this.field1880.field1878 = this.field1880;
    }

    @ObfuscatedName("ds.i()V")
    public void method2203() {
        while (true) {
            class128 var1 = this.field1880.field1877;
            if (this.field1880 == var1) {
                this.field1881 = null;
                return;
            }
            var1.method2200();
        }
    }

    @ObfuscatedName("ds.e(Ldg;)V")
    public void method2226(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = this.field1880.field1878;
        arg0.field1877 = this.field1880;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("ds.f(Ldg;)V")
    public void method2205(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = this.field1880;
        arg0.field1877 = this.field1880.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("ds.k(Ldg;Ldg;)V")
    public static void method2206(class128 arg0, class128 arg1) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = arg1.field1878;
        arg0.field1877 = arg1;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("ds.a()Ldg;")
    public class128 method2207() {
        class128 var1 = this.field1880.field1877;
        if (this.field1880 == var1) {
            return null;
        } else {
            var1.method2200();
            return var1;
        }
    }

    @ObfuscatedName("ds.q()Ldg;")
    public class128 method2222() {
        class128 var1 = this.field1880.field1878;
        if (this.field1880 == var1) {
            return null;
        } else {
            var1.method2200();
            return var1;
        }
    }

    @ObfuscatedName("ds.w()Ldg;")
    public class128 method2209() {
        class128 var1 = this.field1880.field1877;
        if (this.field1880 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("ds.v()Ldg;")
    public class128 method2210() {
        class128 var1 = this.field1880.field1878;
        if (this.field1880 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1878;
            return var1;
        }
    }

    @ObfuscatedName("ds.h()Ldg;")
    public class128 method2211() {
        class128 var1 = this.field1881;
        if (this.field1880 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("ds.p()Ldg;")
    public class128 method2212() {
        class128 var1 = this.field1881;
        if (this.field1880 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1878;
            return var1;
        }
    }
}
