package deob;

import java.util.Iterator;

@ObfuscatedName("di")
public class class127 implements Iterable {

    @ObfuscatedName("di.n")
    public class128 field1876 = new class128();

    @ObfuscatedName("di.d")
    public class128 field1877;

    public class127() {
        this.field1876.field1878 = this.field1876;
        this.field1876.field1880 = this.field1876;
    }

    @ObfuscatedName("di.n(Ldq;)V")
    public void method2245(class128 arg0) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = this.field1876.field1880;
        arg0.field1878 = this.field1876;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("di.d(Ldq;)V")
    public void method2258(class128 arg0) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = this.field1876;
        arg0.field1878 = this.field1876.field1878;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("di.m(Ldq;Ldq;)V")
    public static void method2247(class128 arg0, class128 arg1) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        arg0.field1880 = arg1;
        arg0.field1878 = arg1.field1878;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
    }

    @ObfuscatedName("di.h()Ldq;")
    public class128 method2252() {
        return this.method2249((class128) null);
    }

    @ObfuscatedName("di.w(Ldq;)Ldq;")
    public class128 method2249(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1876.field1878;
        } else {
            var2 = arg0;
        }
        if (this.field1876 == var2) {
            this.field1877 = null;
            return null;
        } else {
            this.field1877 = var2.field1878;
            return var2;
        }
    }

    @ObfuscatedName("di.r()Ldq;")
    public class128 method2244() {
        class128 var1 = this.field1877;
        if (this.field1876 == var1) {
            this.field1877 = null;
            return null;
        } else {
            this.field1877 = var1.field1878;
            return var1;
        }
    }

    @ObfuscatedName("di.c()Z")
    public boolean method2251() {
        return this.field1876.field1878 == this.field1876;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
