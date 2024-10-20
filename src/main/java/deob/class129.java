package deob;

@ObfuscatedName("dz")
public class class129 {

    @ObfuscatedName("dz.u")
    public class128 field1870 = new class128();

    @ObfuscatedName("dz.x")
    public class128 field1871;

    public class129() {
        this.field1870.field1868 = this.field1870;
        this.field1870.field1869 = this.field1870;
    }

    @ObfuscatedName("dz.u()V")
    public void method2236() {
        while (true) {
            class128 var1 = this.field1870.field1868;
            if (this.field1870 == var1) {
                this.field1871 = null;
                return;
            }
            var1.method2228();
        }
    }

    @ObfuscatedName("dz.x(Ldv;)V")
    public void method2245(class128 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = this.field1870.field1869;
        arg0.field1868 = this.field1870;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dz.i(Ldv;)V")
    public void method2238(class128 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = this.field1870;
        arg0.field1868 = this.field1870.field1868;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dz.a(Ldv;Ldv;)V")
    public static void method2258(class128 arg0, class128 arg1) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = arg1.field1869;
        arg0.field1868 = arg1;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dz.c()Ldv;")
    public class128 method2240() {
        class128 var1 = this.field1870.field1868;
        if (this.field1870 == var1) {
            return null;
        } else {
            var1.method2228();
            return var1;
        }
    }

    @ObfuscatedName("dz.g()Ldv;")
    public class128 method2237() {
        class128 var1 = this.field1870.field1869;
        if (this.field1870 == var1) {
            return null;
        } else {
            var1.method2228();
            return var1;
        }
    }

    @ObfuscatedName("dz.z()Ldv;")
    public class128 method2242() {
        class128 var1 = this.field1870.field1868;
        if (this.field1870 == var1) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var1.field1868;
            return var1;
        }
    }

    @ObfuscatedName("dz.t()Ldv;")
    public class128 method2243() {
        class128 var1 = this.field1870.field1869;
        if (this.field1870 == var1) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var1.field1869;
            return var1;
        }
    }

    @ObfuscatedName("dz.m()Ldv;")
    public class128 method2244() {
        class128 var1 = this.field1871;
        if (this.field1870 == var1) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var1.field1868;
            return var1;
        }
    }

    @ObfuscatedName("dz.q()Ldv;")
    public class128 method2241() {
        class128 var1 = this.field1871;
        if (this.field1870 == var1) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var1.field1869;
            return var1;
        }
    }
}
