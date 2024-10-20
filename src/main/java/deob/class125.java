package deob;

@ObfuscatedName("dc")
public final class class125 {

    @ObfuscatedName("dc.p")
    public class130 field1874 = new class130();

    @ObfuscatedName("dc.g")
    public int field1872;

    @ObfuscatedName("dc.x")
    public int field1873;

    @ObfuscatedName("dc.q")
    public class126 field1871;

    @ObfuscatedName("dc.d")
    public class121 field1875 = new class121();

    public class125(int arg0) {
        this.field1872 = arg0;
        this.field1873 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1871 = new class126(var2);
    }

    @ObfuscatedName("dc.p(J)Ldp;")
    public class130 method2169(long arg0) {
        class130 var3 = (class130) this.field1871.method2199(arg0);
        if (var3 != null) {
            this.field1875.method2129(var3);
        }
        return var3;
    }

    @ObfuscatedName("dc.g(J)V")
    public void method2171(long arg0) {
        class130 var3 = (class130) this.field1871.method2199(arg0);
        if (var3 != null) {
            var3.method2225();
            var3.method2265();
            this.field1873++;
        }
    }

    @ObfuscatedName("dc.x(Ldp;J)V")
    public void method2174(class130 arg0, long arg1) {
        if (this.field1873 == 0) {
            class130 var4 = this.field1875.method2127();
            var4.method2225();
            var4.method2265();
            if (this.field1874 == var4) {
                class130 var5 = this.field1875.method2127();
                var5.method2225();
                var5.method2265();
            }
        } else {
            this.field1873--;
        }
        this.field1871.method2189(arg0, arg1);
        this.field1875.method2129(arg0);
    }

    @ObfuscatedName("dc.q()V")
    public void method2170() {
        this.field1875.method2130();
        this.field1871.method2183();
        this.field1874 = new class130();
        this.field1873 = this.field1872;
    }
}
