package deob;

@ObfuscatedName("cz")
public final class class102 {

    @ObfuscatedName("cz.q")
    public class143 field1500 = new class143();

    public class102() {
        this.field1500.field1894 = this.field1500;
        this.field1500.field1895 = this.field1500;
    }

    @ObfuscatedName("cz.q(Lee;)V")
    public void method1247(class143 arg0) {
        if (arg0.field1895 != null) {
            arg0.method1831();
        }
        arg0.field1895 = this.field1500.field1895;
        arg0.field1894 = this.field1500;
        arg0.field1895.field1894 = arg0;
        arg0.field1894.field1895 = arg0;
    }

    @ObfuscatedName("cz.l(Lee;)V")
    public void method1262(class143 arg0) {
        if (arg0.field1895 != null) {
            arg0.method1831();
        }
        arg0.field1895 = this.field1500;
        arg0.field1894 = this.field1500.field1894;
        arg0.field1895.field1894 = arg0;
        arg0.field1894.field1895 = arg0;
    }

    @ObfuscatedName("cz.a()Lee;")
    public class143 method1250() {
        class143 var1 = this.field1500.field1894;
        if (this.field1500 == var1) {
            return null;
        } else {
            var1.method1831();
            return var1;
        }
    }

    @ObfuscatedName("cz.o()Lee;")
    public class143 method1251() {
        class143 var1 = this.field1500.field1894;
        return this.field1500 == var1 ? null : var1;
    }

    @ObfuscatedName("cz.c()V")
    public void method1252() {
        while (true) {
            class143 var1 = this.field1500.field1894;
            if (this.field1500 == var1) {
                return;
            }
            var1.method1831();
        }
    }
}
