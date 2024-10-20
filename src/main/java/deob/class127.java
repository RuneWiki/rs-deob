package deob;

import java.util.Iterator;

@ObfuscatedName("dq")
public class class127 implements Iterable {

    @ObfuscatedName("dq.b")
    public class128 field1863 = new class128();

    @ObfuscatedName("dq.e")
    public class128 field1862;

    public class127() {
        this.field1863.field1865 = this.field1863;
        this.field1863.field1866 = this.field1863;
    }

    @ObfuscatedName("dq.b(Ldz;)V")
    public void method2275(class128 arg0) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = this.field1863.field1866;
        arg0.field1865 = this.field1863;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("dq.e(Ldz;)V")
    public void method2276(class128 arg0) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = this.field1863;
        arg0.field1865 = this.field1863.field1865;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("dq.c(Ldz;Ldz;)V")
    public static void method2279(class128 arg0, class128 arg1) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        arg0.field1866 = arg1;
        arg0.field1865 = arg1.field1865;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
    }

    @ObfuscatedName("dq.l()Ldz;")
    public class128 method2277() {
        return this.method2289((class128) null);
    }

    @ObfuscatedName("dq.y(Ldz;)Ldz;")
    public class128 method2289(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1863.field1865;
        } else {
            var2 = arg0;
        }
        if (this.field1863 == var2) {
            this.field1862 = null;
            return null;
        } else {
            this.field1862 = var2.field1865;
            return var2;
        }
    }

    @ObfuscatedName("dq.j()Ldz;")
    public class128 method2280() {
        class128 var1 = this.field1862;
        if (this.field1863 == var1) {
            this.field1862 = null;
            return null;
        } else {
            this.field1862 = var1.field1865;
            return var1;
        }
    }

    @ObfuscatedName("dq.t()Z")
    public boolean method2282() {
        return this.field1863.field1865 == this.field1863;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
