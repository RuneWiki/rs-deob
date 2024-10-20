package deob;

@ObfuscatedName("dc")
public final class class125 {

    @ObfuscatedName("dc.b")
    public class130 field1865 = new class130();

    @ObfuscatedName("dc.l")
    public int field1866;

    @ObfuscatedName("dc.i")
    public int field1867;

    @ObfuscatedName("dc.t")
    public class126 field1868;

    @ObfuscatedName("dc.k")
    public class121 field1869 = new class121();

    public class125(int arg0) {
        this.field1866 = arg0;
        this.field1867 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1868 = new class126(var2);
    }

    @ObfuscatedName("dc.b(J)Ldp;")
    public class130 method2256(long arg0) {
        class130 var3 = (class130) this.field1868.method2280(arg0);
        if (var3 != null) {
            this.field1869.method2219(var3);
        }
        return var3;
    }

    @ObfuscatedName("dc.l(J)V")
    public void method2261(long arg0) {
        class130 var3 = (class130) this.field1868.method2280(arg0);
        if (var3 != null) {
            var3.method2313();
            var3.method2349();
            this.field1867++;
        }
    }

    @ObfuscatedName("dc.i(Ldp;J)V")
    public void method2258(class130 arg0, long arg1) {
        if (this.field1867 == 0) {
            class130 var4 = this.field1869.method2218();
            var4.method2313();
            var4.method2349();
            if (this.field1865 == var4) {
                class130 var5 = this.field1869.method2218();
                var5.method2313();
                var5.method2349();
            }
        } else {
            this.field1867--;
        }
        this.field1868.method2277(arg0, arg1);
        this.field1869.method2219(arg0);
    }

    @ObfuscatedName("dc.t()V")
    public void method2257() {
        this.field1869.method2231();
        this.field1868.method2274();
        this.field1865 = new class130();
        this.field1867 = this.field1866;
    }
}
