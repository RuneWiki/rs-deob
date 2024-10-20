package deob;

@ObfuscatedName("dz")
public final class class121 {

    @ObfuscatedName("dz.k")
    public class130 field1853 = new class130();

    public class121() {
        this.field1853.field1878 = this.field1853;
        this.field1853.field1879 = this.field1853;
    }

    @ObfuscatedName("dz.k(Ldh;)V")
    public void method2122(class130 arg0) {
        if (arg0.field1879 != null) {
            arg0.method2251();
        }
        arg0.field1879 = this.field1853.field1879;
        arg0.field1878 = this.field1853;
        arg0.field1879.field1878 = arg0;
        arg0.field1878.field1879 = arg0;
    }

    @ObfuscatedName("dz.y(Ldh;)V")
    public void method2130(class130 arg0) {
        if (arg0.field1879 != null) {
            arg0.method2251();
        }
        arg0.field1879 = this.field1853;
        arg0.field1878 = this.field1853.field1878;
        arg0.field1879.field1878 = arg0;
        arg0.field1878.field1879 = arg0;
    }

    @ObfuscatedName("dz.o()Ldh;")
    public class130 method2121() {
        class130 var1 = this.field1853.field1878;
        if (this.field1853 == var1) {
            return null;
        } else {
            var1.method2251();
            return var1;
        }
    }

    @ObfuscatedName("dz.r()Ldh;")
    public class130 method2123() {
        class130 var1 = this.field1853.field1878;
        return this.field1853 == var1 ? null : var1;
    }

    @ObfuscatedName("dz.w()V")
    public void method2126() {
        while (true) {
            class130 var1 = this.field1853.field1878;
            if (this.field1853 == var1) {
                return;
            }
            var1.method2251();
        }
    }
}
