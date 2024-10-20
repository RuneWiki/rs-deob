package deob;

@ObfuscatedName("dc")
public class class129 {

    @ObfuscatedName("dc.s")
    public class128 field1891 = new class128();

    @ObfuscatedName("dc.c")
    public class128 field1890;

    public class129() {
        this.field1891.field1888 = this.field1891;
        this.field1891.field1887 = this.field1891;
    }

    @ObfuscatedName("dc.s()V")
    public void method2181() {
        while (true) {
            class128 var1 = this.field1891.field1888;
            if (this.field1891 == var1) {
                this.field1890 = null;
                return;
            }
            var1.method2179();
        }
    }

    @ObfuscatedName("dc.c(Ldx;)V")
    public void method2190(class128 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = this.field1891.field1887;
        arg0.field1888 = this.field1891;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("dc.f(Ldx;)V")
    public void method2183(class128 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = this.field1891;
        arg0.field1888 = this.field1891.field1888;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("dc.g(Ldx;Ldx;)V")
    public static void method2184(class128 arg0, class128 arg1) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = arg1.field1887;
        arg0.field1888 = arg1;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("dc.k()Ldx;")
    public class128 method2189() {
        class128 var1 = this.field1891.field1888;
        if (this.field1891 == var1) {
            return null;
        } else {
            var1.method2179();
            return var1;
        }
    }

    @ObfuscatedName("dc.u()Ldx;")
    public class128 method2186() {
        class128 var1 = this.field1891.field1887;
        if (this.field1891 == var1) {
            return null;
        } else {
            var1.method2179();
            return var1;
        }
    }

    @ObfuscatedName("dc.b()Ldx;")
    public class128 method2187() {
        class128 var1 = this.field1891.field1888;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1888;
            return var1;
        }
    }

    @ObfuscatedName("dc.x()Ldx;")
    public class128 method2188() {
        class128 var1 = this.field1891.field1887;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1887;
            return var1;
        }
    }

    @ObfuscatedName("dc.r()Ldx;")
    public class128 method2203() {
        class128 var1 = this.field1890;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1888;
            return var1;
        }
    }

    @ObfuscatedName("dc.n()Ldx;")
    public class128 method2192() {
        class128 var1 = this.field1890;
        if (this.field1891 == var1) {
            this.field1890 = null;
            return null;
        } else {
            this.field1890 = var1.field1887;
            return var1;
        }
    }
}
