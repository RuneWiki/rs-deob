package deob;

@ObfuscatedName("dm")
public final class class125 {

    @ObfuscatedName("dm.x")
    public class130 field1872 = new class130();

    @ObfuscatedName("dm.n")
    public int field1873;

    @ObfuscatedName("dm.g")
    public int field1874;

    @ObfuscatedName("dm.v")
    public class126 field1875;

    @ObfuscatedName("dm.y")
    public class121 field1876 = new class121();

    public class125(int arg0) {
        this.field1873 = arg0;
        this.field1874 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1875 = new class126(var2);
    }

    @ObfuscatedName("dm.x(J)Ldi;")
    public class130 method2275(long arg0) {
        class130 var3 = (class130) this.field1875.method2286(arg0);
        if (var3 != null) {
            this.field1876.method2240(var3);
        }
        return var3;
    }

    @ObfuscatedName("dm.n(J)V")
    public void method2276(long arg0) {
        class130 var3 = (class130) this.field1875.method2286(arg0);
        if (var3 != null) {
            var3.method2327();
            var3.method2362();
            this.field1874++;
        }
    }

    @ObfuscatedName("dm.g(Ldi;J)V")
    public void method2282(class130 arg0, long arg1) {
        if (this.field1874 == 0) {
            class130 var4 = this.field1876.method2242();
            var4.method2327();
            var4.method2362();
            if (this.field1872 == var4) {
                class130 var5 = this.field1876.method2242();
                var5.method2327();
                var5.method2362();
            }
        } else {
            this.field1874--;
        }
        this.field1875.method2287(arg0, arg1);
        this.field1876.method2240(arg0);
    }

    @ObfuscatedName("dm.v()V")
    public void method2277() {
        this.field1876.method2243();
        this.field1875.method2288();
        this.field1872 = new class130();
        this.field1874 = this.field1873;
    }
}
