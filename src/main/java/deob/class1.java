package deob;

@ObfuscatedName("fz")
public final class class1 {

    @ObfuscatedName("fz.j")
    public class77 field1 = new class77();

    @ObfuscatedName("fz.p(Lfc;)V")
    public void method3(class77 arg0) {
        if (arg0.field862 != null) {
            arg0.method1049();
        }
        arg0.field862 = this.field1;
        arg0.field861 = this.field1.field861;
        arg0.field862.field861 = arg0;
        arg0.field861.field862 = arg0;
    }

    public class1() {
        this.field1.field861 = this.field1;
        this.field1.field862 = this.field1;
    }

    @ObfuscatedName("fz.t()Lfc;")
    public class77 method4() {
        class77 var1 = this.field1.field861;
        return this.field1 == var1 ? null : var1;
    }

    @ObfuscatedName("fz.h()V")
    public void method5() {
        while (true) {
            class77 var1 = this.field1.field861;
            if (this.field1 == var1) {
                return;
            }
            var1.method1049();
        }
    }

    @ObfuscatedName("fz.j(Lfc;)V")
    public void method9(class77 arg0) {
        if (arg0.field862 != null) {
            arg0.method1049();
        }
        arg0.field862 = this.field1.field862;
        arg0.field861 = this.field1;
        arg0.field862.field861 = arg0;
        arg0.field861.field862 = arg0;
    }

    @ObfuscatedName("fz.o()Lfc;")
    public class77 method17() {
        class77 var1 = this.field1.field861;
        if (this.field1 == var1) {
            return null;
        } else {
            var1.method1049();
            return var1;
        }
    }
}
