package deob;

@ObfuscatedName("dk")
public class class129 {

    @ObfuscatedName("dk.b")
    public class128 field1881 = new class128();

    @ObfuscatedName("dk.l")
    public class128 field1880;

    public class129() {
        this.field1881.field1877 = this.field1881;
        this.field1881.field1878 = this.field1881;
    }

    @ObfuscatedName("dk.b()V")
    public void method2319() {
        while (true) {
            class128 var1 = this.field1881.field1877;
            if (this.field1881 == var1) {
                this.field1880 = null;
                return;
            }
            var1.method2313();
        }
    }

    @ObfuscatedName("dk.l(Ldz;)V")
    public void method2320(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = this.field1881.field1878;
        arg0.field1877 = this.field1881;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dk.i(Ldz;)V")
    public void method2322(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = this.field1881;
        arg0.field1877 = this.field1881.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dk.t(Ldz;Ldz;)V")
    public static void method2321(class128 arg0, class128 arg1) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = arg1.field1878;
        arg0.field1877 = arg1;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dk.k()Ldz;")
    public class128 method2333() {
        class128 var1 = this.field1881.field1877;
        if (this.field1881 == var1) {
            return null;
        } else {
            var1.method2313();
            return var1;
        }
    }

    @ObfuscatedName("dk.x()Ldz;")
    public class128 method2323() {
        class128 var1 = this.field1881.field1878;
        if (this.field1881 == var1) {
            return null;
        } else {
            var1.method2313();
            return var1;
        }
    }

    @ObfuscatedName("dk.z()Ldz;")
    public class128 method2324() {
        class128 var1 = this.field1881.field1877;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("dk.p()Ldz;")
    public class128 method2328() {
        class128 var1 = this.field1881.field1878;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1878;
            return var1;
        }
    }

    @ObfuscatedName("dk.s()Ldz;")
    public class128 method2331() {
        class128 var1 = this.field1880;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("dk.o()Ldz;")
    public class128 method2327() {
        class128 var1 = this.field1880;
        if (this.field1881 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1878;
            return var1;
        }
    }
}
