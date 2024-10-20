package deob;

@ObfuscatedName("dd")
public final class class125 {

    @ObfuscatedName("dd.o")
    public class130 field1886 = new class130();

    @ObfuscatedName("dd.m")
    public int field1882;

    @ObfuscatedName("dd.b")
    public int field1884;

    @ObfuscatedName("dd.g")
    public class126 field1885;

    @ObfuscatedName("dd.h")
    public class121 field1883 = new class121();

    public class125(int arg0) {
        this.field1882 = arg0;
        this.field1884 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1885 = new class126(var2);
    }

    @ObfuscatedName("dd.o(J)Ldn;")
    public class130 method2130(long arg0) {
        class130 var3 = (class130) this.field1885.method2151(arg0);
        if (var3 != null) {
            this.field1883.method2093(var3);
        }
        return var3;
    }

    @ObfuscatedName("dd.m(J)V")
    public void method2131(long arg0) {
        class130 var3 = (class130) this.field1885.method2151(arg0);
        if (var3 != null) {
            var3.method2189();
            var3.method2232();
            this.field1884++;
        }
    }

    @ObfuscatedName("dd.b(Ldn;J)V")
    public void method2132(class130 arg0, long arg1) {
        if (this.field1884 == 0) {
            class130 var4 = this.field1883.method2102();
            var4.method2189();
            var4.method2232();
            if (this.field1886 == var4) {
                class130 var5 = this.field1883.method2102();
                var5.method2189();
                var5.method2232();
            }
        } else {
            this.field1884--;
        }
        this.field1885.method2143(arg0, arg1);
        this.field1883.method2093(arg0);
    }

    @ObfuscatedName("dd.g()V")
    public void method2139() {
        this.field1883.method2103();
        this.field1885.method2144();
        this.field1886 = new class130();
        this.field1884 = this.field1882;
    }
}
