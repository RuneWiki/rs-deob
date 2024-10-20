package deob;

@ObfuscatedName("dv")
public class class129 {

    @ObfuscatedName("dv.x")
    public class128 field1887 = new class128();

    @ObfuscatedName("dv.j")
    public class128 field1886;

    public class129() {
        this.field1887.field1884 = this.field1887;
        this.field1887.field1883 = this.field1887;
    }

    @ObfuscatedName("dv.x()V")
    public void method2284() {
        while (true) {
            class128 var1 = this.field1887.field1884;
            if (this.field1887 == var1) {
                this.field1886 = null;
                return;
            }
            var1.method2278();
        }
    }

    @ObfuscatedName("dv.j(Ldp;)V")
    public void method2300(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = this.field1887.field1883;
        arg0.field1884 = this.field1887;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dv.c(Ldp;)V")
    public void method2286(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = this.field1887;
        arg0.field1884 = this.field1887.field1884;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dv.d(Ldp;Ldp;)V")
    public static void method2283(class128 arg0, class128 arg1) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = arg1.field1883;
        arg0.field1884 = arg1;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dv.w()Ldp;")
    public class128 method2288() {
        class128 var1 = this.field1887.field1884;
        if (this.field1887 == var1) {
            return null;
        } else {
            var1.method2278();
            return var1;
        }
    }

    @ObfuscatedName("dv.u()Ldp;")
    public class128 method2311() {
        class128 var1 = this.field1887.field1883;
        if (this.field1887 == var1) {
            return null;
        } else {
            var1.method2278();
            return var1;
        }
    }

    @ObfuscatedName("dv.y()Ldp;")
    public class128 method2290() {
        class128 var1 = this.field1887.field1884;
        if (this.field1887 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1884;
            return var1;
        }
    }

    @ObfuscatedName("dv.e()Ldp;")
    public class128 method2291() {
        class128 var1 = this.field1887.field1883;
        if (this.field1887 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("dv.q()Ldp;")
    public class128 method2287() {
        class128 var1 = this.field1886;
        if (this.field1887 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1884;
            return var1;
        }
    }

    @ObfuscatedName("dv.v()Ldp;")
    public class128 method2293() {
        class128 var1 = this.field1886;
        if (this.field1887 == var1) {
            this.field1886 = null;
            return null;
        } else {
            this.field1886 = var1.field1883;
            return var1;
        }
    }
}
