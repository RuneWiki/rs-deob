package deob;

@ObfuscatedName("di")
public final class class126 {

    @ObfuscatedName("di.b")
    public int field1874;

    @ObfuscatedName("di.l")
    public class128[] field1870;

    @ObfuscatedName("di.i")
    public class128 field1872;

    @ObfuscatedName("di.t")
    public class128 field1871;

    @ObfuscatedName("di.k")
    public int field1873 = 0;

    public class126(int arg0) {
        this.field1874 = arg0;
        this.field1870 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1870[var2] = new class128();
            var3.field1877 = var3;
            var3.field1878 = var3;
        }
    }

    @ObfuscatedName("di.b(J)Ldz;")
    public class128 method2280(long arg0) {
        class128 var3 = this.field1870[(int) (arg0 & (long) (this.field1874 - 1))];
        for (this.field1872 = var3.field1877; this.field1872 != var3; this.field1872 = this.field1872.field1877) {
            if (this.field1872.field1879 == arg0) {
                class128 var4 = this.field1872;
                this.field1872 = this.field1872.field1877;
                return var4;
            }
        }
        this.field1872 = null;
        return null;
    }

    @ObfuscatedName("di.l(Ldz;J)V")
    public void method2277(class128 arg0, long arg1) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        class128 var4 = this.field1870[(int) (arg1 & (long) (this.field1874 - 1))];
        arg0.field1878 = var4.field1878;
        arg0.field1877 = var4;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
        arg0.field1879 = arg1;
    }

    @ObfuscatedName("di.i()V")
    public void method2274() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            class128 var2 = this.field1870[var1];
            while (true) {
                class128 var3 = var2.field1877;
                if (var2 == var3) {
                    break;
                }
                var3.method2313();
            }
        }
        this.field1872 = null;
        this.field1871 = null;
    }

    @ObfuscatedName("di.t()Ldz;")
    public class128 method2275() {
        this.field1873 = 0;
        return this.method2276();
    }

    @ObfuscatedName("di.k()Ldz;")
    public class128 method2276() {
        if (this.field1873 > 0 && this.field1870[this.field1873 - 1] != this.field1871) {
            class128 var1 = this.field1871;
            this.field1871 = var1.field1877;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1873 >= this.field1874) {
                return null;
            }
            var2 = this.field1870[this.field1873++].field1877;
        } while (this.field1870[this.field1873 - 1] == var2);
        this.field1871 = var2.field1877;
        return var2;
    }
}
