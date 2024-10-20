package deob;

@ObfuscatedName("dr")
public final class class125 {

    @ObfuscatedName("dr.u")
    public class130 field1859 = new class130();

    @ObfuscatedName("dr.x")
    public int field1857;

    @ObfuscatedName("dr.i")
    public int field1855;

    @ObfuscatedName("dr.a")
    public class126 field1858;

    @ObfuscatedName("dr.f")
    public class121 field1856 = new class121();

    public class125(int arg0) {
        this.field1857 = arg0;
        this.field1855 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1858 = new class126(var2);
    }

    @ObfuscatedName("dr.u(J)Ldm;")
    public class130 method2186(long arg0) {
        class130 var3 = (class130) this.field1858.method2190(arg0);
        if (var3 != null) {
            this.field1856.method2143(var3);
        }
        return var3;
    }

    @ObfuscatedName("dr.x(J)V")
    public void method2177(long arg0) {
        class130 var3 = (class130) this.field1858.method2190(arg0);
        if (var3 != null) {
            var3.method2228();
            var3.method2264();
            this.field1855++;
        }
    }

    @ObfuscatedName("dr.i(Ldm;J)V")
    public void method2179(class130 arg0, long arg1) {
        if (this.field1855 == 0) {
            class130 var4 = this.field1856.method2134();
            var4.method2228();
            var4.method2264();
            if (this.field1859 == var4) {
                class130 var5 = this.field1856.method2134();
                var5.method2228();
                var5.method2264();
            }
        } else {
            this.field1855--;
        }
        this.field1858.method2191(arg0, arg1);
        this.field1856.method2143(arg0);
    }

    @ObfuscatedName("dr.a()V")
    public void method2176() {
        this.field1856.method2147();
        this.field1858.method2192();
        this.field1859 = new class130();
        this.field1855 = this.field1857;
    }
}
