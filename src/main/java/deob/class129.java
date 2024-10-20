package deob;

@ObfuscatedName("df")
public class class129 {

    @ObfuscatedName("df.f")
    public class128 field1908 = new class128();

    @ObfuscatedName("df.i")
    public class128 field1907;

    public class129() {
        this.field1908.field1906 = this.field1908;
        this.field1908.field1904 = this.field1908;
    }

    @ObfuscatedName("df.f()V")
    public void method2295() {
        while (true) {
            class128 var1 = this.field1908.field1906;
            if (this.field1908 == var1) {
                this.field1907 = null;
                return;
            }
            var1.method2289();
        }
    }

    @ObfuscatedName("df.i(Ldt;)V")
    public void method2296(class128 arg0) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = this.field1908.field1904;
        arg0.field1906 = this.field1908;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("df.u(Ldt;)V")
    public void method2297(class128 arg0) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = this.field1908;
        arg0.field1906 = this.field1908.field1906;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("df.r(Ldt;Ldt;)V")
    public static void method2294(class128 arg0, class128 arg1) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = arg1.field1904;
        arg0.field1906 = arg1;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("df.o()Ldt;")
    public class128 method2324() {
        class128 var1 = this.field1908.field1906;
        if (this.field1908 == var1) {
            return null;
        } else {
            var1.method2289();
            return var1;
        }
    }

    @ObfuscatedName("df.l()Ldt;")
    public class128 method2300() {
        class128 var1 = this.field1908.field1904;
        if (this.field1908 == var1) {
            return null;
        } else {
            var1.method2289();
            return var1;
        }
    }

    @ObfuscatedName("df.n()Ldt;")
    public class128 method2301() {
        class128 var1 = this.field1908.field1906;
        if (this.field1908 == var1) {
            this.field1907 = null;
            return null;
        } else {
            this.field1907 = var1.field1906;
            return var1;
        }
    }

    @ObfuscatedName("df.m()Ldt;")
    public class128 method2306() {
        class128 var1 = this.field1908.field1904;
        if (this.field1908 == var1) {
            this.field1907 = null;
            return null;
        } else {
            this.field1907 = var1.field1904;
            return var1;
        }
    }

    @ObfuscatedName("df.w()Ldt;")
    public class128 method2309() {
        class128 var1 = this.field1907;
        if (this.field1908 == var1) {
            this.field1907 = null;
            return null;
        } else {
            this.field1907 = var1.field1906;
            return var1;
        }
    }

    @ObfuscatedName("df.j()Ldt;")
    public class128 method2304() {
        class128 var1 = this.field1907;
        if (this.field1908 == var1) {
            this.field1907 = null;
            return null;
        } else {
            this.field1907 = var1.field1904;
            return var1;
        }
    }
}
