package deob;

@ObfuscatedName("da")
public final class class126 {

    @ObfuscatedName("da.x")
    public int field1879;

    @ObfuscatedName("da.j")
    public class128[] field1877;

    @ObfuscatedName("da.c")
    public class128 field1878;

    @ObfuscatedName("da.d")
    public class128 field1880;

    @ObfuscatedName("da.w")
    public int field1876 = 0;

    public class126(int arg0) {
        this.field1879 = arg0;
        this.field1877 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1877[var2] = new class128();
            var3.field1884 = var3;
            var3.field1883 = var3;
        }
    }

    @ObfuscatedName("da.x(J)Ldp;")
    public class128 method2247(long arg0) {
        class128 var3 = this.field1877[(int) (arg0 & (long) (this.field1879 - 1))];
        for (this.field1878 = var3.field1884; this.field1878 != var3; this.field1878 = this.field1878.field1884) {
            if (this.field1878.field1885 == arg0) {
                class128 var4 = this.field1878;
                this.field1878 = this.field1878.field1884;
                return var4;
            }
        }
        this.field1878 = null;
        return null;
    }

    @ObfuscatedName("da.j(Ldp;J)V")
    public void method2245(class128 arg0, long arg1) {
        if (arg0.field1883 != null) {
            arg0.method2278();
        }
        class128 var4 = this.field1877[(int) (arg1 & (long) (this.field1879 - 1))];
        arg0.field1883 = var4.field1883;
        arg0.field1884 = var4;
        arg0.field1883.field1884 = arg0;
        arg0.field1884.field1883 = arg0;
        arg0.field1885 = arg1;
    }

    @ObfuscatedName("da.c()V")
    public void method2232() {
        for (int var1 = 0; var1 < this.field1879; var1++) {
            class128 var2 = this.field1877[var1];
            while (true) {
                class128 var3 = var2.field1884;
                if (var2 == var3) {
                    break;
                }
                var3.method2278();
            }
        }
        this.field1878 = null;
        this.field1880 = null;
    }

    @ObfuscatedName("da.d()Ldp;")
    public class128 method2233() {
        this.field1876 = 0;
        return this.method2234();
    }

    @ObfuscatedName("da.w()Ldp;")
    public class128 method2234() {
        if (this.field1876 > 0 && this.field1877[this.field1876 - 1] != this.field1880) {
            class128 var1 = this.field1880;
            this.field1880 = var1.field1884;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1876 >= this.field1879) {
                return null;
            }
            var2 = this.field1877[this.field1876++].field1884;
        } while (this.field1877[this.field1876 - 1] == var2);
        this.field1880 = var2.field1884;
        return var2;
    }
}
