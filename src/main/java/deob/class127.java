package deob;

import java.util.Iterator;

@ObfuscatedName("dv")
public class class127 implements Iterable {

    @ObfuscatedName("dv.b")
    public class128 field1876 = new class128();

    @ObfuscatedName("dv.l")
    public class128 field1875;

    public class127() {
        this.field1876.field1877 = this.field1876;
        this.field1876.field1878 = this.field1876;
    }

    @ObfuscatedName("dv.b(Ldz;)V")
    public void method2284(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = this.field1876.field1878;
        arg0.field1877 = this.field1876;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dv.l(Ldz;)V")
    public void method2285(class128 arg0) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = this.field1876;
        arg0.field1877 = this.field1876.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dv.i(Ldz;Ldz;)V")
    public static void method2286(class128 arg0, class128 arg1) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        arg0.field1878 = arg1;
        arg0.field1877 = arg1.field1877;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
    }

    @ObfuscatedName("dv.t()Ldz;")
    public class128 method2307() {
        return this.method2288((class128) null);
    }

    @ObfuscatedName("dv.k(Ldz;)Ldz;")
    public class128 method2288(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1876.field1877;
        } else {
            var2 = arg0;
        }
        if (this.field1876 == var2) {
            this.field1875 = null;
            return null;
        } else {
            this.field1875 = var2.field1877;
            return var2;
        }
    }

    @ObfuscatedName("dv.x()Ldz;")
    public class128 method2289() {
        class128 var1 = this.field1875;
        if (this.field1876 == var1) {
            this.field1875 = null;
            return null;
        } else {
            this.field1875 = var1.field1877;
            return var1;
        }
    }

    @ObfuscatedName("dv.z()Z")
    public boolean method2290() {
        return this.field1876.field1877 == this.field1876;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
