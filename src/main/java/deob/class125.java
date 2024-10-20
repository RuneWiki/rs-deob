package deob;

@ObfuscatedName("dj")
public final class class125 {

    @ObfuscatedName("dj.q")
    public class130 field1872 = new class130();

    @ObfuscatedName("dj.d")
    public int field1870;

    @ObfuscatedName("dj.h")
    public int field1871;

    @ObfuscatedName("dj.p")
    public class126 field1869;

    @ObfuscatedName("dj.j")
    public class121 field1873 = new class121();

    public class125(int arg0) {
        this.field1870 = arg0;
        this.field1871 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1869 = new class126(var2);
    }

    @ObfuscatedName("dj.q(J)Ldr;")
    public class130 method2258(long arg0) {
        class130 var3 = (class130) this.field1869.method2260(arg0);
        if (var3 != null) {
            this.field1873.method2218(var3);
        }
        return var3;
    }

    @ObfuscatedName("dj.d(J)V")
    public void method2247(long arg0) {
        class130 var3 = (class130) this.field1869.method2260(arg0);
        if (var3 != null) {
            var3.method2310();
            var3.method2345();
            this.field1871++;
        }
    }

    @ObfuscatedName("dj.h(Ldr;J)V")
    public void method2248(class130 arg0, long arg1) {
        if (this.field1871 == 0) {
            class130 var4 = this.field1873.method2208();
            var4.method2310();
            var4.method2345();
            if (this.field1872 == var4) {
                class130 var5 = this.field1873.method2208();
                var5.method2310();
                var5.method2345();
            }
        } else {
            this.field1871--;
        }
        this.field1869.method2261(arg0, arg1);
        this.field1873.method2218(arg0);
    }

    @ObfuscatedName("dj.p()V")
    public void method2249() {
        this.field1873.method2210();
        this.field1869.method2262();
        this.field1872 = new class130();
        this.field1871 = this.field1870;
    }
}
