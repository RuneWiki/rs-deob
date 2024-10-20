package deob;

@ObfuscatedName("dd")
public final class class125 {

    @ObfuscatedName("dd.n")
    public class130 field1867 = new class130();

    @ObfuscatedName("dd.d")
    public int field1869;

    @ObfuscatedName("dd.m")
    public int field1868;

    @ObfuscatedName("dd.h")
    public class126 field1870;

    @ObfuscatedName("dd.w")
    public class121 field1866 = new class121();

    public class125(int arg0) {
        this.field1869 = arg0;
        this.field1868 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1870 = new class126(var2);
    }

    @ObfuscatedName("dd.n(J)Ldx;")
    public class130 method2221(long arg0) {
        class130 var3 = (class130) this.field1870.method2229(arg0);
        if (var3 != null) {
            this.field1866.method2176(var3);
        }
        return var3;
    }

    @ObfuscatedName("dd.d(J)V")
    public void method2218(long arg0) {
        class130 var3 = (class130) this.field1870.method2229(arg0);
        if (var3 != null) {
            var3.method2273();
            var3.method2307();
            this.field1868++;
        }
    }

    @ObfuscatedName("dd.m(Ldx;J)V")
    public void method2219(class130 arg0, long arg1) {
        if (this.field1868 == 0) {
            class130 var4 = this.field1866.method2178();
            var4.method2273();
            var4.method2307();
            if (this.field1867 == var4) {
                class130 var5 = this.field1866.method2178();
                var5.method2273();
                var5.method2307();
            }
        } else {
            this.field1868--;
        }
        this.field1870.method2230(arg0, arg1);
        this.field1866.method2176(arg0);
    }

    @ObfuscatedName("dd.h()V")
    public void method2220() {
        this.field1866.method2180();
        this.field1870.method2231();
        this.field1867 = new class130();
        this.field1868 = this.field1869;
    }
}
