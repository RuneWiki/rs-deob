package deob;

@ObfuscatedName("dq")
public class class129 {

    @ObfuscatedName("dq.x")
    public class128 field1888 = new class128();

    @ObfuscatedName("dq.n")
    public class128 field1887;

    public class129() {
        this.field1888.field1885 = this.field1888;
        this.field1888.field1886 = this.field1888;
    }

    @ObfuscatedName("dq.x()V")
    public void method2356() {
        while (true) {
            class128 var1 = this.field1888.field1885;
            if (this.field1888 == var1) {
                this.field1887 = null;
                return;
            }
            var1.method2327();
        }
    }

    @ObfuscatedName("dq.n(Ldn;)V")
    public void method2360(class128 arg0) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = this.field1888.field1886;
        arg0.field1885 = this.field1888;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dq.g(Ldn;)V")
    public void method2349(class128 arg0) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = this.field1888;
        arg0.field1885 = this.field1888.field1885;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dq.v(Ldn;Ldn;)V")
    public static void method2336(class128 arg0, class128 arg1) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = arg1.field1886;
        arg0.field1885 = arg1;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dq.y()Ldn;")
    public class128 method2337() {
        class128 var1 = this.field1888.field1885;
        if (this.field1888 == var1) {
            return null;
        } else {
            var1.method2327();
            return var1;
        }
    }

    @ObfuscatedName("dq.p()Ldn;")
    public class128 method2348() {
        class128 var1 = this.field1888.field1886;
        if (this.field1888 == var1) {
            return null;
        } else {
            var1.method2327();
            return var1;
        }
    }

    @ObfuscatedName("dq.j()Ldn;")
    public class128 method2352() {
        class128 var1 = this.field1888.field1885;
        if (this.field1888 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1885;
            return var1;
        }
    }

    @ObfuscatedName("dq.s()Ldn;")
    public class128 method2342() {
        class128 var1 = this.field1888.field1886;
        if (this.field1888 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1886;
            return var1;
        }
    }

    @ObfuscatedName("dq.k()Ldn;")
    public class128 method2341() {
        class128 var1 = this.field1887;
        if (this.field1888 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1885;
            return var1;
        }
    }

    @ObfuscatedName("dq.f()Ldn;")
    public class128 method2339() {
        class128 var1 = this.field1887;
        if (this.field1888 == var1) {
            this.field1887 = null;
            return null;
        } else {
            this.field1887 = var1.field1886;
            return var1;
        }
    }
}
