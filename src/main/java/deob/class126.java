package deob;

@ObfuscatedName("dz")
public final class class126 {

    @ObfuscatedName("dz.x")
    public int field1877;

    @ObfuscatedName("dz.n")
    public class128[] field1878;

    @ObfuscatedName("dz.g")
    public class128 field1880;

    @ObfuscatedName("dz.v")
    public class128 field1879;

    @ObfuscatedName("dz.y")
    public int field1881 = 0;

    public class126(int arg0) {
        this.field1877 = arg0;
        this.field1878 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1878[var2] = new class128();
            var3.field1885 = var3;
            var3.field1886 = var3;
        }
    }

    @ObfuscatedName("dz.x(J)Ldn;")
    public class128 method2286(long arg0) {
        class128 var3 = this.field1878[(int) (arg0 & (long) (this.field1877 - 1))];
        for (this.field1880 = var3.field1885; this.field1880 != var3; this.field1880 = this.field1880.field1885) {
            if (this.field1880.field1884 == arg0) {
                class128 var4 = this.field1880;
                this.field1880 = this.field1880.field1885;
                return var4;
            }
        }
        this.field1880 = null;
        return null;
    }

    @ObfuscatedName("dz.n(Ldn;J)V")
    public void method2287(class128 arg0, long arg1) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        class128 var4 = this.field1878[(int) (arg1 & (long) (this.field1877 - 1))];
        arg0.field1886 = var4.field1886;
        arg0.field1885 = var4;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
        arg0.field1884 = arg1;
    }

    @ObfuscatedName("dz.g()V")
    public void method2288() {
        for (int var1 = 0; var1 < this.field1877; var1++) {
            class128 var2 = this.field1878[var1];
            while (true) {
                class128 var3 = var2.field1885;
                if (var2 == var3) {
                    break;
                }
                var3.method2327();
            }
        }
        this.field1880 = null;
        this.field1879 = null;
    }

    @ObfuscatedName("dz.v()Ldn;")
    public class128 method2289() {
        this.field1881 = 0;
        return this.method2290();
    }

    @ObfuscatedName("dz.y()Ldn;")
    public class128 method2290() {
        if (this.field1881 > 0 && this.field1878[this.field1881 - 1] != this.field1879) {
            class128 var1 = this.field1879;
            this.field1879 = var1.field1885;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1881 >= this.field1877) {
                return null;
            }
            var2 = this.field1878[this.field1881++].field1885;
        } while (this.field1878[this.field1881 - 1] == var2);
        this.field1879 = var2.field1885;
        return var2;
    }
}
