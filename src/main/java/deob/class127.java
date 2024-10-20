package deob;

import java.util.Iterator;

@ObfuscatedName("du")
public class class127 implements Iterable {

    @ObfuscatedName("du.f")
    public class128 field1903 = new class128();

    @ObfuscatedName("du.i")
    public class128 field1902;

    public class127() {
        this.field1903.field1906 = this.field1903;
        this.field1903.field1904 = this.field1903;
    }

    @ObfuscatedName("du.f(Ldt;)V")
    public void method2267(class128 arg0) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = this.field1903.field1904;
        arg0.field1906 = this.field1903;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("du.i(Ldt;)V")
    public void method2280(class128 arg0) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = this.field1903;
        arg0.field1906 = this.field1903.field1906;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("du.u(Ldt;Ldt;)V")
    public static void method2269(class128 arg0, class128 arg1) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        arg0.field1904 = arg1;
        arg0.field1906 = arg1.field1906;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
    }

    @ObfuscatedName("du.r()Ldt;")
    public class128 method2279() {
        return this.method2271((class128) null);
    }

    @ObfuscatedName("du.o(Ldt;)Ldt;")
    public class128 method2271(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1903.field1906;
        } else {
            var2 = arg0;
        }
        if (this.field1903 == var2) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var2.field1906;
            return var2;
        }
    }

    @ObfuscatedName("du.l()Ldt;")
    public class128 method2270() {
        class128 var1 = this.field1902;
        if (this.field1903 == var1) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var1.field1906;
            return var1;
        }
    }

    @ObfuscatedName("du.n()Z")
    public boolean method2266() {
        return this.field1903.field1906 == this.field1903;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
