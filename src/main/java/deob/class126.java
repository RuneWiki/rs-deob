package deob;

@ObfuscatedName("dn")
public final class class126 {

    @ObfuscatedName("dn.p")
    public int field1876;

    @ObfuscatedName("dn.g")
    public class128[] field1877;

    @ObfuscatedName("dn.x")
    public class128 field1878;

    @ObfuscatedName("dn.q")
    public class128 field1879;

    @ObfuscatedName("dn.d")
    public int field1880 = 0;

    public class126(int arg0) {
        this.field1876 = arg0;
        this.field1877 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1877[var2] = new class128();
            var3.field1883 = var3;
            var3.field1884 = var3;
        }
    }

    @ObfuscatedName("dn.p(J)Ldb;")
    public class128 method2199(long arg0) {
        class128 var3 = this.field1877[(int) (arg0 & (long) (this.field1876 - 1))];
        for (this.field1878 = var3.field1883; this.field1878 != var3; this.field1878 = this.field1878.field1883) {
            if (this.field1878.field1885 == arg0) {
                class128 var4 = this.field1878;
                this.field1878 = this.field1878.field1883;
                return var4;
            }
        }
        this.field1878 = null;
        return null;
    }

    @ObfuscatedName("dn.g(Ldb;J)V")
    public void method2189(class128 arg0, long arg1) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        class128 var4 = this.field1877[(int) (arg1 & (long) (this.field1876 - 1))];
        arg0.field1884 = var4.field1884;
        arg0.field1883 = var4;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
        arg0.field1885 = arg1;
    }

    @ObfuscatedName("dn.x()V")
    public void method2183() {
        for (int var1 = 0; var1 < this.field1876; var1++) {
            class128 var2 = this.field1877[var1];
            while (true) {
                class128 var3 = var2.field1883;
                if (var2 == var3) {
                    break;
                }
                var3.method2225();
            }
        }
        this.field1878 = null;
        this.field1879 = null;
    }

    @ObfuscatedName("dn.q()Ldb;")
    public class128 method2186() {
        this.field1880 = 0;
        return this.method2194();
    }

    @ObfuscatedName("dn.d()Ldb;")
    public class128 method2194() {
        if (this.field1880 > 0 && this.field1877[this.field1880 - 1] != this.field1879) {
            class128 var1 = this.field1879;
            this.field1879 = var1.field1883;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1880 >= this.field1876) {
                return null;
            }
            var2 = this.field1877[this.field1880++].field1883;
        } while (this.field1877[this.field1880 - 1] == var2);
        this.field1879 = var2.field1883;
        return var2;
    }
}
