package deob;

@ObfuscatedName("dh")
public class class129 {

    @ObfuscatedName("dh.n")
    public class128 field1882 = new class128();

    @ObfuscatedName("dh.d")
    public class128 field1881;

    public class129() {
        this.field1882.field1878 = this.field1882;
        this.field1882.field1880 = this.field1882;
    }

    @ObfuscatedName("dh.n()V")
    public void method2277() {
        while (true) {
            class128 var1 = this.field1882.field1878;
            if (this.field1882 == var1) {
                this.field1881 = null;
                return;
            }
            var1.method2273();
        }
    }

    @ObfuscatedName("dh.d(Ldq;)V")
    public void method2278(class128 arg0) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = this.field1882.field1880;
        arg0.field1878 = this.field1882;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("dh.m(Ldq;)V")
    public void method2279(class128 arg0) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = this.field1882;
        arg0.field1878 = this.field1882.field1878;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("dh.h(Ldq;Ldq;)V")
    public static void method2280(class128 arg0, class128 arg1) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = arg1.field1880;
        arg0.field1878 = arg1;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("dh.w()Ldq;")
    public class128 method2298() {
        class128 var1 = this.field1882.field1878;
        if (this.field1882 == var1) {
            return null;
        } else {
            var1.method2273();
            return var1;
        }
    }

    @ObfuscatedName("dh.r()Ldq;")
    public class128 method2282() {
        class128 var1 = this.field1882.field1880;
        if (this.field1882 == var1) {
            return null;
        } else {
            var1.method2273();
            return var1;
        }
    }

    @ObfuscatedName("dh.c()Ldq;")
    public class128 method2290() {
        class128 var1 = this.field1882.field1878;
        if (this.field1882 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1878;
            return var1;
        }
    }

    @ObfuscatedName("dh.z()Ldq;")
    public class128 method2284() {
        class128 var1 = this.field1882.field1880;
        if (this.field1882 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1880;
            return var1;
        }
    }

    @ObfuscatedName("dh.q()Ldq;")
    public class128 method2285() {
        class128 var1 = this.field1881;
        if (this.field1882 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1878;
            return var1;
        }
    }

    @ObfuscatedName("dh.l()Ldq;")
    public class128 method2286() {
        class128 var1 = this.field1881;
        if (this.field1882 == var1) {
            this.field1881 = null;
            return null;
        } else {
            this.field1881 = var1.field1880;
            return var1;
        }
    }
}
