package deob;

import java.util.Iterator;

@ObfuscatedName("dp")
public class class127 implements Iterable {

    @ObfuscatedName("dp.o")
    public class128 field1892 = new class128();

    @ObfuscatedName("dp.m")
    public class128 field1893;

    public class127() {
        this.field1892.field1895 = this.field1892;
        this.field1892.field1896 = this.field1892;
    }

    @ObfuscatedName("dp.o(Ldr;)V")
    public void method2181(class128 arg0) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = this.field1892.field1896;
        arg0.field1895 = this.field1892;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dp.m(Ldr;)V")
    public void method2165(class128 arg0) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = this.field1892;
        arg0.field1895 = this.field1892.field1895;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dp.b(Ldr;Ldr;)V")
    public static void method2162(class128 arg0, class128 arg1) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        arg0.field1896 = arg1;
        arg0.field1895 = arg1.field1895;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
    }

    @ObfuscatedName("dp.g()Ldr;")
    public class128 method2163() {
        return this.method2184((class128) null);
    }

    @ObfuscatedName("dp.l(Ldr;)Ldr;")
    public class128 method2184(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1892.field1895;
        } else {
            var2 = arg0;
        }
        if (this.field1892 == var2) {
            this.field1893 = null;
            return null;
        } else {
            this.field1893 = var2.field1895;
            return var2;
        }
    }

    @ObfuscatedName("dp.c()Ldr;")
    public class128 method2161() {
        class128 var1 = this.field1893;
        if (this.field1892 == var1) {
            this.field1893 = null;
            return null;
        } else {
            this.field1893 = var1.field1895;
            return var1;
        }
    }

    @ObfuscatedName("dp.u()Z")
    public boolean method2166() {
        return this.field1892.field1895 == this.field1892;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
