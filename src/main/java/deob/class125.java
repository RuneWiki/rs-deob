package deob;

@ObfuscatedName("dq")
public final class class125 {

    @ObfuscatedName("dq.s")
    public class130 field1878 = new class130();

    @ObfuscatedName("dq.c")
    public int field1875;

    @ObfuscatedName("dq.f")
    public int field1877;

    @ObfuscatedName("dq.h")
    public class126 field1876;

    @ObfuscatedName("dq.a")
    public class121 field1879 = new class121();

    public class125(int arg0) {
        this.field1875 = arg0;
        this.field1877 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1876 = new class126(var2);
    }

    @ObfuscatedName("dq.s(J)Ldt;")
    public class130 method2121(long arg0) {
        class130 var3 = (class130) this.field1876.method2131(arg0);
        if (var3 != null) {
            this.field1879.method2083(var3);
        }
        return var3;
    }

    @ObfuscatedName("dq.c(J)V")
    public void method2120(long arg0) {
        class130 var3 = (class130) this.field1876.method2131(arg0);
        if (var3 != null) {
            var3.method2179();
            var3.method2218();
            this.field1877++;
        }
    }

    @ObfuscatedName("dq.f(Ldt;J)V")
    public void method2123(class130 arg0, long arg1) {
        if (this.field1877 == 0) {
            class130 var4 = this.field1879.method2085();
            var4.method2179();
            var4.method2218();
            if (this.field1878 == var4) {
                class130 var5 = this.field1879.method2085();
                var5.method2179();
                var5.method2218();
            }
        } else {
            this.field1877--;
        }
        this.field1876.method2139(arg0, arg1);
        this.field1879.method2083(arg0);
    }

    @ObfuscatedName("dq.g()V")
    public void method2124() {
        this.field1879.method2087();
        this.field1876.method2132();
        this.field1878 = new class130();
        this.field1877 = this.field1875;
    }
}
