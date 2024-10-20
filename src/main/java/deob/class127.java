package deob;

import java.util.Iterator;

@ObfuscatedName("dr")
public class class127 implements Iterable {

    @ObfuscatedName("dr.i")
    public class128 field1875 = new class128();

    @ObfuscatedName("dr.e")
    public class128 field1876;

    public class127() {
        this.field1875.field1877 = this.field1875;
        this.field1875.field1878 = this.field1875;
    }

    @ObfuscatedName("dr.i(Ldg;)V")
    public void method2175(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = this.field1875.field1878;
        arg0.field1877 = this.field1875;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dr.e(Ldg;)V")
    public void method2179(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = this.field1875;
        arg0.field1877 = this.field1875.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dr.f(Ldg;Ldg;)V")
    public static void method2182(class128 arg0, class128 arg1) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        arg0.field1878 = arg1;
        arg0.field1877 = arg1.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dr.k()Ldg;")
    public class128 method2176() {
        return this.method2185((class128) null);
    }

    @ObfuscatedName("dr.a(Ldg;)Ldg;")
    public class128 method2185(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1875.field1877;
        } else {
            var2 = arg0;
        }
        if (this.field1875 == var2) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var2.field1877;
            return var2;
        }
    }

    @ObfuscatedName("dr.q()Ldg;")
    public class128 method2177() {
        class128 var1 = this.field1876;
        if (this.field1875 == var1) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("dr.w()Z")
    public boolean method2178() {
        return this.field1875.field1877 == this.field1875;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
