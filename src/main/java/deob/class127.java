package deob;

import java.util.Iterator;

@ObfuscatedName("dl")
public class class127 implements Iterable {

    @ObfuscatedName("dl.q")
    public class128 field1879 = new class128();

    @ObfuscatedName("dl.d")
    public class128 field1880;

    public class127() {
        this.field1879.field1881 = this.field1879;
        this.field1879.field1883 = this.field1879;
    }

    @ObfuscatedName("dl.q(Ldg;)V")
    public void method2296(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = this.field1879.field1883;
        arg0.field1881 = this.field1879;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("dl.d(Ldg;)V")
    public void method2283(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = this.field1879;
        arg0.field1881 = this.field1879.field1881;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("dl.h(Ldg;Ldg;)V")
    public static void method2290(class128 arg0, class128 arg1) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        arg0.field1883 = arg1;
        arg0.field1881 = arg1.field1881;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
    }

    @ObfuscatedName("dl.p()Ldg;")
    public class128 method2281() {
        return this.method2280((class128) null);
    }

    @ObfuscatedName("dl.j(Ldg;)Ldg;")
    public class128 method2280(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1879.field1881;
        } else {
            var2 = arg0;
        }
        if (this.field1879 == var2) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var2.field1881;
            return var2;
        }
    }

    @ObfuscatedName("dl.n()Ldg;")
    public class128 method2276() {
        class128 var1 = this.field1880;
        if (this.field1879 == var1) {
            this.field1880 = null;
            return null;
        } else {
            this.field1880 = var1.field1881;
            return var1;
        }
    }

    @ObfuscatedName("dl.c()Z")
    public boolean method2282() {
        return this.field1879.field1881 == this.field1879;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
