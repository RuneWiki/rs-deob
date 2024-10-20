package deob;

import java.util.Iterator;

@ObfuscatedName("dx")
public class class127 implements Iterable {

    @ObfuscatedName("dx.p")
    public class128 field1881 = new class128();

    @ObfuscatedName("dx.g")
    public class128 field1882;

    public class127() {
        this.field1881.field1883 = this.field1881;
        this.field1881.field1884 = this.field1881;
    }

    @ObfuscatedName("dx.p(Ldb;)V")
    public void method2223(class128 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = this.field1881.field1884;
        arg0.field1883 = this.field1881;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("dx.g(Ldb;)V")
    public void method2209(class128 arg0) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = this.field1881;
        arg0.field1883 = this.field1881.field1883;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("dx.x(Ldb;Ldb;)V")
    public static void method2205(class128 arg0, class128 arg1) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        arg0.field1884 = arg1;
        arg0.field1883 = arg1.field1883;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
    }

    @ObfuscatedName("dx.q()Ldb;")
    public class128 method2206() {
        return this.method2207((class128) null);
    }

    @ObfuscatedName("dx.d(Ldb;)Ldb;")
    public class128 method2207(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1881.field1883;
        } else {
            var2 = arg0;
        }
        if (this.field1881 == var2) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var2.field1883;
            return var2;
        }
    }

    @ObfuscatedName("dx.k()Ldb;")
    public class128 method2214() {
        class128 var1 = this.field1882;
        if (this.field1881 == var1) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var1.field1883;
            return var1;
        }
    }

    @ObfuscatedName("dx.j()Z")
    public boolean method2208() {
        return this.field1881.field1883 == this.field1881;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
