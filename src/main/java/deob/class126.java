package deob;

@ObfuscatedName("dz")
public final class class126 {

    @ObfuscatedName("dz.i")
    public int field1873;

    @ObfuscatedName("dz.e")
    public class128[] field1871;

    @ObfuscatedName("dz.f")
    public class128 field1872;

    @ObfuscatedName("dz.k")
    public class128 field1874;

    @ObfuscatedName("dz.g")
    public int field1870 = 0;

    public class126(int arg0) {
        this.field1873 = arg0;
        this.field1871 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1871[var2] = new class128();
            var3.field1877 = var3;
            var3.field1878 = var3;
        }
    }

    @ObfuscatedName("dz.i(J)Ldg;")
    public class128 method2161(long arg0) {
        class128 var3 = this.field1871[(int) (arg0 & (long) (this.field1873 - 1))];
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

    @ObfuscatedName("dz.e(Ldg;J)V")
    public void method2162(class128 arg0, long arg1) {
        if (arg0.field1878 != null) {
            arg0.method2200();
        }
        class128 var4 = this.field1871[(int) (arg1 & (long) (this.field1873 - 1))];
        arg0.field1878 = var4.field1878;
        arg0.field1877 = var4;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
        arg0.field1879 = arg1;
    }

    @ObfuscatedName("dz.f()V")
    public void method2160() {
        for (int var1 = 0; var1 < this.field1873; var1++) {
            class128 var2 = this.field1871[var1];
            while (true) {
                class128 var3 = var2.field1877;
                if (var2 == var3) {
                    break;
                }
                var3.method2200();
            }
        }
        this.field1872 = null;
        this.field1874 = null;
    }

    @ObfuscatedName("dz.k()Ldg;")
    public class128 method2163() {
        this.field1870 = 0;
        return this.method2171();
    }

    @ObfuscatedName("dz.a()Ldg;")
    public class128 method2171() {
        if (this.field1870 > 0 && this.field1871[this.field1870 - 1] != this.field1874) {
            class128 var1 = this.field1874;
            this.field1874 = var1.field1877;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1870 >= this.field1873) {
                return null;
            }
            var2 = this.field1871[this.field1870++].field1877;
        } while (this.field1871[this.field1870 - 1] == var2);
        this.field1874 = var2.field1877;
        return var2;
    }
}
