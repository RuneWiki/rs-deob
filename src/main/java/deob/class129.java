package deob;

@ObfuscatedName("da")
public class class129 {

    @ObfuscatedName("da.b")
    public class128 field1868 = new class128();

    @ObfuscatedName("da.e")
    public class128 field1867;

    public class129() {
        this.field1868.field1865 = this.field1868;
        this.field1868.field1866 = this.field1868;
    }

    @ObfuscatedName("da.b()V")
    public void method2307() {
        while (true) {
            class128 var1 = this.field1868.field1865;
            if (this.field1868 == var1) {
                this.field1867 = null;
                return;
            }
            var1.method2298();
        }
    }

    @ObfuscatedName("da.e(Ldz;)V")
    public void method2308(class128 arg0) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = this.field1868.field1866;
        arg0.field1865 = this.field1868;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("da.c(Ldz;)V")
    public void method2309(class128 arg0) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = this.field1868;
        arg0.field1865 = this.field1868.field1865;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("da.l(Ldz;Ldz;)V")
    public static void method2312(class128 arg0, class128 arg1) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = arg1.field1866;
        arg0.field1865 = arg1;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("da.y()Ldz;")
    public class128 method2311() {
        class128 var1 = this.field1868.field1865;
        if (this.field1868 == var1) {
            return null;
        } else {
            var1.method2298();
            return var1;
        }
    }

    @ObfuscatedName("da.j()Ldz;")
    public class128 method2327() {
        class128 var1 = this.field1868.field1866;
        if (this.field1868 == var1) {
            return null;
        } else {
            var1.method2298();
            return var1;
        }
    }

    @ObfuscatedName("da.t()Ldz;")
    public class128 method2315() {
        class128 var1 = this.field1868.field1865;
        if (this.field1868 == var1) {
            this.field1867 = null;
            return null;
        } else {
            this.field1867 = var1.field1865;
            return var1;
        }
    }

    @ObfuscatedName("da.k()Ldz;")
    public class128 method2314() {
        class128 var1 = this.field1868.field1866;
        if (this.field1868 == var1) {
            this.field1867 = null;
            return null;
        } else {
            this.field1867 = var1.field1866;
            return var1;
        }
    }

    @ObfuscatedName("da.f()Ldz;")
    public class128 method2332() {
        class128 var1 = this.field1867;
        if (this.field1868 == var1) {
            this.field1867 = null;
            return null;
        } else {
            this.field1867 = var1.field1865;
            return var1;
        }
    }

    @ObfuscatedName("da.a()Ldz;")
    public class128 method2316() {
        class128 var1 = this.field1867;
        if (this.field1868 == var1) {
            this.field1867 = null;
            return null;
        } else {
            this.field1867 = var1.field1866;
            return var1;
        }
    }
}
