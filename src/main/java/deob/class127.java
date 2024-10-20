package deob;

import java.util.Iterator;

@ObfuscatedName("dl")
public class class127 implements Iterable {

    @ObfuscatedName("dl.x")
    public class128 field1883 = new class128();

    @ObfuscatedName("dl.n")
    public class128 field1882;

    public class127() {
        this.field1883.field1885 = this.field1883;
        this.field1883.field1886 = this.field1883;
    }

    @ObfuscatedName("dl.x(Ldn;)V")
    public void method2303(class128 arg0) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = this.field1883.field1886;
        arg0.field1885 = this.field1883;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dl.n(Ldn;)V")
    public void method2304(class128 arg0) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = this.field1883;
        arg0.field1885 = this.field1883.field1885;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dl.g(Ldn;Ldn;)V")
    public static void method2305(class128 arg0, class128 arg1) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        arg0.field1886 = arg1;
        arg0.field1885 = arg1.field1885;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
    }

    @ObfuscatedName("dl.v()Ldn;")
    public class128 method2302() {
        return this.method2307((class128) null);
    }

    @ObfuscatedName("dl.y(Ldn;)Ldn;")
    public class128 method2307(class128 arg0) {
        class128 var2;
        if (arg0 == null) {
            var2 = this.field1883.field1885;
        } else {
            var2 = arg0;
        }
        if (this.field1883 == var2) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var2.field1885;
            return var2;
        }
    }

    @ObfuscatedName("dl.p()Ldn;")
    public class128 method2317() {
        class128 var1 = this.field1882;
        if (this.field1883 == var1) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var1.field1885;
            return var1;
        }
    }

    @ObfuscatedName("dl.j()Z")
    public boolean method2309() {
        return this.field1883.field1885 == this.field1883;
    }

    public Iterator iterator() {
        return new class124(this);
    }
}
