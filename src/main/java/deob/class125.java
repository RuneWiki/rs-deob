package deob;

@ObfuscatedName("dc")
public final class class125 {

    @ObfuscatedName("dc.b")
    public class130 field1855 = new class130();

    @ObfuscatedName("dc.e")
    public int field1853;

    @ObfuscatedName("dc.c")
    public int field1854;

    @ObfuscatedName("dc.l")
    public class126 field1852;

    @ObfuscatedName("dc.y")
    public class121 field1856 = new class121();

    public class125(int arg0) {
        this.field1853 = arg0;
        this.field1854 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1852 = new class126(var2);
    }

    @ObfuscatedName("dc.b(J)Ldh;")
    public class130 method2246(long arg0) {
        class130 var3 = (class130) this.field1852.method2259(arg0);
        if (var3 != null) {
            this.field1856.method2210(var3);
        }
        return var3;
    }

    @ObfuscatedName("dc.e(J)V")
    public void method2247(long arg0) {
        class130 var3 = (class130) this.field1852.method2259(arg0);
        if (var3 != null) {
            var3.method2298();
            var3.method2343();
            this.field1854++;
        }
    }

    @ObfuscatedName("dc.c(Ldh;J)V")
    public void method2250(class130 arg0, long arg1) {
        if (this.field1854 == 0) {
            class130 var4 = this.field1856.method2213();
            var4.method2298();
            var4.method2343();
            if (this.field1855 == var4) {
                class130 var5 = this.field1856.method2213();
                var5.method2298();
                var5.method2343();
            }
        } else {
            this.field1854--;
        }
        this.field1852.method2267(arg0, arg1);
        this.field1856.method2210(arg0);
    }

    @ObfuscatedName("dc.l()V")
    public void method2249() {
        this.field1856.method2214();
        this.field1852.method2261();
        this.field1855 = new class130();
        this.field1854 = this.field1853;
    }
}
