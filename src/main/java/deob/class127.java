package deob;

import java.util.Iterator;

@ObfuscatedName("do")
public class class127 implements Iterable {

    @ObfuscatedName("do.k")
    public class128 field1872 = new class128();

    @ObfuscatedName("do.y")
    public class128 field1871;

    public class127() {
        this.field1872.field1875 = this.field1872;
        this.field1872.field1873 = this.field1872;
    }

    @ObfuscatedName("do.k(Ldb;)V")
    public void method2187(class128 arg0) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = this.field1872.field1873;
        arg0.field1875 = this.field1872;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("do.y(Ldb;)V")
    public void method2188(class128 arg0) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = this.field1872;
        arg0.field1875 = this.field1872.field1875;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("do.o(Ldb;Ldb;)V")
    public static void method2190(class128 arg0, class128 arg1) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        arg0.field1873 = arg1;
        arg0.field1875 = arg1.field1875;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
    }

    @ObfuscatedName("do.r()Ldb;")
    public class128 method2191() {
        return this.method2192((class128) null);
    }

    @ObfuscatedName("do.w(Ldb;)Ldb;")
    public class128 method2192(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1872.field1875;
        } else {
            var2 = arg0;
        }
        if (this.field1872 == var2) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var2.field1875;
            return var2;
        }
    }

    @ObfuscatedName("do.j()Ldb;")
    public class128 method2193() {
        class128 var1 = this.field1871;
        if (this.field1872 == var1) {
            this.field1871 = null;
            return null;
        } else {
            this.field1871 = var1.field1875;
            return var1;
        }
    }

    @ObfuscatedName("do.c()Z")
    public boolean method2208() {
        return this.field1872.field1875 == this.field1872;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
