package deob;

@ObfuscatedName("dm")
public final class class125 {

    @ObfuscatedName("dm.x")
    public class130 field1873 = new class130();

    @ObfuscatedName("dm.j")
    public int field1872;

    @ObfuscatedName("dm.c")
    public int field1874;

    @ObfuscatedName("dm.d")
    public class126 field1871;

    @ObfuscatedName("dm.w")
    public class121 field1875 = new class121();

    public class125(int arg0) {
        this.field1872 = arg0;
        this.field1874 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1871 = new class126(var2);
    }

    @ObfuscatedName("dm.x(J)Ldf;")
    public class130 method2221(long arg0) {
        class130 var3 = (class130) this.field1871.method2247(arg0);
        if (var3 != null) {
            this.field1875.method2177(var3);
        }
        return var3;
    }

    @ObfuscatedName("dm.j(J)V")
    public void method2222(long arg0) {
        class130 var3 = (class130) this.field1871.method2247(arg0);
        if (var3 != null) {
            var3.method2278();
            var3.method2318();
            this.field1874++;
        }
    }

    @ObfuscatedName("dm.c(Ldf;J)V")
    public void method2223(class130 arg0, long arg1) {
        if (this.field1874 == 0) {
            class130 var4 = this.field1875.method2179();
            var4.method2278();
            var4.method2318();
            if (this.field1873 == var4) {
                class130 var5 = this.field1875.method2179();
                var5.method2278();
                var5.method2318();
            }
        } else {
            this.field1874--;
        }
        this.field1871.method2245(arg0, arg1);
        this.field1875.method2177(arg0);
    }

    @ObfuscatedName("dm.d()V")
    public void method2225() {
        this.field1875.method2196();
        this.field1871.method2232();
        this.field1873 = new class130();
        this.field1874 = this.field1872;
    }
}
