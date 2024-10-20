package deob;

import java.util.Iterator;

@ObfuscatedName("dc")
public class class127 implements Iterable {

    @ObfuscatedName("dc.u")
    public class128 field1865 = new class128();

    @ObfuscatedName("dc.x")
    public class128 field1866;

    public class127() {
        this.field1865.field1868 = this.field1865;
        this.field1865.field1869 = this.field1865;
    }

    @ObfuscatedName("dc.u(Ldv;)V")
    public void method2222(class128 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = this.field1865.field1869;
        arg0.field1868 = this.field1865;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dc.x(Ldv;)V")
    public void method2207(class128 arg0) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = this.field1865;
        arg0.field1868 = this.field1865.field1868;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dc.i(Ldv;Ldv;)V")
    public static void method2208(class128 arg0, class128 arg1) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        arg0.field1869 = arg1;
        arg0.field1868 = arg1.field1868;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
    }

    @ObfuscatedName("dc.a()Ldv;")
    public class128 method2209() {
        return this.method2210((class128) null);
    }

    @ObfuscatedName("dc.c(Ldv;)Ldv;")
    public class128 method2210(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1865.field1868;
        } else {
            var2 = arg0;
        }
        if (this.field1865 == var2) {
            this.field1866 = null;
            return null;
        } else {
            this.field1866 = var2.field1868;
            return var2;
        }
    }

    @ObfuscatedName("dc.g()Ldv;")
    public class128 method2211() {
        class128 var1 = this.field1866;
        if (this.field1865 == var1) {
            this.field1866 = null;
            return null;
        } else {
            this.field1866 = var1.field1868;
            return var1;
        }
    }

    @ObfuscatedName("dc.z()Z")
    public boolean method2213() {
        return this.field1865.field1868 == this.field1865;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
