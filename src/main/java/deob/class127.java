package deob;

import java.util.Iterator;

@ObfuscatedName("dh")
public class class127 implements Iterable {

    @ObfuscatedName("dh.x")
    public class128 field1881 = new class128();

    @ObfuscatedName("dh.j")
    public class128 field1882;

    public class127() {
        this.field1881.field1884 = this.field1881;
        this.field1881.field1883 = this.field1881;
    }

    @ObfuscatedName("dh.x(Ldp;)V")
    public void method2266(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = this.field1881.field1883;
        arg0.field1884 = this.field1881;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dh.j(Ldp;)V")
    public void method2257(class128 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = this.field1881;
        arg0.field1884 = this.field1881.field1884;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dh.c(Ldp;Ldp;)V")
    public static void method2251(class128 arg0, class128 arg1) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        arg0.field1883 = arg1;
        arg0.field1884 = arg1.field1884;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
    }

    @ObfuscatedName("dh.d()Ldp;")
    public class128 method2253() {
        return this.method2254((class128) null);
    }

    @ObfuscatedName("dh.w(Ldp;)Ldp;")
    public class128 method2254(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1881.field1884;
        } else {
            var2 = arg0;
        }
        if (this.field1881 == var2) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var2.field1884;
            return var2;
        }
    }

    @ObfuscatedName("dh.u()Ldp;")
    public class128 method2265() {
        class128 var1 = this.field1882;
        if (this.field1881 == var1) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var1.field1884;
            return var1;
        }
    }

    @ObfuscatedName("dh.y()Z")
    public boolean method2256() {
        return this.field1881.field1884 == this.field1881;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
