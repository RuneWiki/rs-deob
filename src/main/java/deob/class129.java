package deob;

@ObfuscatedName("dv")
public class class129 {

    @ObfuscatedName("dv.o")
    public class128 field1898 = new class128();

    @ObfuscatedName("dv.m")
    public class128 field1897;

    public class129() {
        this.field1898.field1895 = this.field1898;
        this.field1898.field1896 = this.field1898;
    }

    @ObfuscatedName("dv.o()V")
    public void method2200() {
        while (true) {
            class128 var1 = this.field1898.field1895;
            if (this.field1898 == var1) {
                this.field1897 = null;
                return;
            }
            var1.method2189();
        }
    }

    @ObfuscatedName("dv.m(Ldr;)V")
    public void method2213(class128 arg0) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = this.field1898.field1896;
        arg0.field1895 = this.field1898;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dv.b(Ldr;)V")
    public void method2197(class128 arg0) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = this.field1898;
        arg0.field1895 = this.field1898.field1895;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dv.g(Ldr;Ldr;)V")
    public static void method2198(class128 arg0, class128 arg1) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = arg1.field1896;
        arg0.field1895 = arg1;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dv.l()Ldr;")
    public class128 method2199() {
        class128 var1 = this.field1898.field1895;
        if (this.field1898 == var1) {
            return null;
        } else {
            var1.method2189();
            return var1;
        }
    }

    @ObfuscatedName("dv.c()Ldr;")
    public class128 method2225() {
        class128 var1 = this.field1898.field1896;
        if (this.field1898 == var1) {
            return null;
        } else {
            var1.method2189();
            return var1;
        }
    }

    @ObfuscatedName("dv.u()Ldr;")
    public class128 method2201() {
        class128 var1 = this.field1898.field1895;
        if (this.field1898 == var1) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var1.field1895;
            return var1;
        }
    }

    @ObfuscatedName("dv.k()Ldr;")
    public class128 method2224() {
        class128 var1 = this.field1898.field1896;
        if (this.field1898 == var1) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var1.field1896;
            return var1;
        }
    }

    @ObfuscatedName("dv.z()Ldr;")
    public class128 method2203() {
        class128 var1 = this.field1897;
        if (this.field1898 == var1) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var1.field1895;
            return var1;
        }
    }

    @ObfuscatedName("dv.y()Ldr;")
    public class128 method2214() {
        class128 var1 = this.field1897;
        if (this.field1898 == var1) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var1.field1896;
            return var1;
        }
    }
}
