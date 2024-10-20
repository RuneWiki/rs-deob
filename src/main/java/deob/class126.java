package deob;

@ObfuscatedName("dd")
public final class class126 {

    @ObfuscatedName("dd.s")
    public int field1884;

    @ObfuscatedName("dd.c")
    public class128[] field1883;

    @ObfuscatedName("dd.f")
    public class128 field1882;

    @ObfuscatedName("dd.h")
    public class128 field1880;

    @ObfuscatedName("dd.a")
    public int field1881 = 0;

    public class126(int arg0) {
        this.field1884 = arg0;
        this.field1883 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1883[var2] = new class128();
            var3.field1888 = var3;
            var3.field1887 = var3;
        }
    }

    @ObfuscatedName("dd.s(J)Ldx;")
    public class128 method2131(long arg0) {
        class128 var3 = this.field1883[(int) (arg0 & (long) (this.field1884 - 1))];
        for (this.field1882 = var3.field1888; this.field1882 != var3; this.field1882 = this.field1882.field1888) {
            if (this.field1882.field1889 == arg0) {
                class128 var4 = this.field1882;
                this.field1882 = this.field1882.field1888;
                return var4;
            }
        }
        this.field1882 = null;
        return null;
    }

    @ObfuscatedName("dd.c(Ldx;J)V")
    public void method2139(class128 arg0, long arg1) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        class128 var4 = this.field1883[(int) (arg1 & (long) (this.field1884 - 1))];
        arg0.field1887 = var4.field1887;
        arg0.field1888 = var4;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
        arg0.field1889 = arg1;
    }

    @ObfuscatedName("dd.f()V")
    public void method2132() {
        for (int var1 = 0; var1 < this.field1884; var1++) {
            class128 var2 = this.field1883[var1];
            while (true) {
                class128 var3 = var2.field1888;
                if (var2 == var3) {
                    break;
                }
                var3.method2179();
            }
        }
        this.field1882 = null;
        this.field1880 = null;
    }

    @ObfuscatedName("dd.g()Ldx;")
    public class128 method2140() {
        this.field1881 = 0;
        return this.method2134();
    }

    @ObfuscatedName("dd.k()Ldx;")
    public class128 method2134() {
        if (this.field1881 > 0 && this.field1883[this.field1881 - 1] != this.field1880) {
            class128 var1 = this.field1880;
            this.field1880 = var1.field1888;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1881 >= this.field1884) {
                return null;
            }
            var2 = this.field1883[this.field1881++].field1888;
        } while (this.field1883[this.field1881 - 1] == var2);
        this.field1880 = var2.field1888;
        return var2;
    }
}
