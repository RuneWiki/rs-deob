package deob;

@ObfuscatedName("da")
public final class class125 {

    @ObfuscatedName("da.i")
    public class130 field1866 = new class130();

    @ObfuscatedName("da.e")
    public int field1865;

    @ObfuscatedName("da.f")
    public int field1867;

    @ObfuscatedName("da.k")
    public class126 field1868;

    @ObfuscatedName("da.g")
    public class121 field1869 = new class121();

    public class125(int arg0) {
        this.field1865 = arg0;
        this.field1867 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1868 = new class126(var2);
    }

    @ObfuscatedName("da.i(J)Ldk;")
    public class130 method2150(long arg0) {
        class130 var3 = (class130) this.field1868.method2161(arg0);
        if (var3 != null) {
            this.field1869.method2108(var3);
        }
        return var3;
    }

    @ObfuscatedName("da.e(J)V")
    public void method2151(long arg0) {
        class130 var3 = (class130) this.field1868.method2161(arg0);
        if (var3 != null) {
            var3.method2200();
            var3.method2238();
            this.field1867++;
        }
    }

    @ObfuscatedName("da.f(Ldk;J)V")
    public void method2152(class130 arg0, long arg1) {
        if (this.field1867 == 0) {
            class130 var4 = this.field1869.method2107();
            var4.method2200();
            var4.method2238();
            if (this.field1866 == var4) {
                class130 var5 = this.field1869.method2107();
                var5.method2200();
                var5.method2238();
            }
        } else {
            this.field1867--;
        }
        this.field1868.method2162(arg0, arg1);
        this.field1869.method2108(arg0);
    }

    @ObfuscatedName("da.k()V")
    public void method2155() {
        this.field1869.method2113();
        this.field1868.method2160();
        this.field1866 = new class130();
        this.field1867 = this.field1865;
    }
}
