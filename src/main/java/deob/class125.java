package deob;

@ObfuscatedName("dg")
public final class class125 {

    @ObfuscatedName("dg.f")
    public class130 field1893 = new class130();

    @ObfuscatedName("dg.i")
    public int field1895;

    @ObfuscatedName("dg.u")
    public int field1894;

    @ObfuscatedName("dg.h")
    public class126 field1896;

    @ObfuscatedName("dg.r")
    public class121 field1892 = new class121();

    public class125(int arg0) {
        this.field1895 = arg0;
        this.field1894 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1896 = new class126(var2);
    }

    @ObfuscatedName("dg.f(J)Ldm;")
    public class130 method2240(long arg0) {
        class130 var3 = (class130) this.field1896.method2254(arg0);
        if (var3 != null) {
            this.field1892.method2205(var3);
        }
        return var3;
    }

    @ObfuscatedName("dg.i(J)V")
    public void method2242(long arg0) {
        class130 var3 = (class130) this.field1896.method2254(arg0);
        if (var3 != null) {
            var3.method2289();
            var3.method2332();
            this.field1894++;
        }
    }

    @ObfuscatedName("dg.u(Ldm;J)V")
    public void method2246(class130 arg0, long arg1) {
        if (this.field1894 == 0) {
            class130 var4 = this.field1892.method2202();
            var4.method2289();
            var4.method2332();
            if (this.field1893 == var4) {
                class130 var5 = this.field1892.method2202();
                var5.method2289();
                var5.method2332();
            }
        } else {
            this.field1894--;
        }
        this.field1896.method2255(arg0, arg1);
        this.field1892.method2205(arg0);
    }

    @ObfuscatedName("dg.r()V")
    public void method2244() {
        this.field1892.method2203();
        this.field1896.method2256();
        this.field1893 = new class130();
        this.field1894 = this.field1895;
    }
}
