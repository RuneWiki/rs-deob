package deob;

import java.util.Iterator;

@ObfuscatedName("ds")
public class class127 implements Iterable {

    @ObfuscatedName("ds.s")
    public class128 field1886 = new class128();

    @ObfuscatedName("ds.c")
    public class128 field1885;

    public class127() {
        this.field1886.field1888 = this.field1886;
        this.field1886.field1887 = this.field1886;
    }

    @ObfuscatedName("ds.s(Ldx;)V")
    public void method2149(class128 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = this.field1886.field1887;
        arg0.field1888 = this.field1886;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("ds.c(Ldx;)V")
    public void method2161(class128 arg0) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = this.field1886;
        arg0.field1888 = this.field1886.field1888;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("ds.f(Ldx;Ldx;)V")
    public static void method2151(class128 arg0, class128 arg1) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        arg0.field1887 = arg1;
        arg0.field1888 = arg1.field1888;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
    }

    @ObfuscatedName("ds.g()Ldx;")
    public class128 method2152() {
        return this.method2153((class128) null);
    }

    @ObfuscatedName("ds.k(Ldx;)Ldx;")
    public class128 method2153(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1886.field1888;
        } else {
            var2 = arg0;
        }
        if (this.field1886 == var2) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var2.field1888;
            return var2;
        }
    }

    @ObfuscatedName("ds.u()Ldx;")
    public class128 method2148() {
        class128 var1 = this.field1885;
        if (this.field1886 == var1) {
            this.field1885 = null;
            return null;
        } else {
            this.field1885 = var1.field1888;
            return var1;
        }
    }

    @ObfuscatedName("ds.b()Z")
    public boolean method2155() {
        return this.field1886.field1888 == this.field1886;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
