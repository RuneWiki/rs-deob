package deob;

@ObfuscatedName("dc")
public final class class126 {

    @ObfuscatedName("dc.n")
    public int field1873;

    @ObfuscatedName("dc.d")
    public class128[] field1872;

    @ObfuscatedName("dc.m")
    public class128 field1871;

    @ObfuscatedName("dc.h")
    public class128 field1874;

    @ObfuscatedName("dc.w")
    public int field1875 = 0;

    public class126(int arg0) {
        this.field1873 = arg0;
        this.field1872 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1872[var2] = new class128();
            var3.field1878 = var3;
            var3.field1880 = var3;
        }
    }

    @ObfuscatedName("dc.n(J)Ldq;")
    public class128 method2229(long arg0) {
        class128 var3 = this.field1872[(int) (arg0 & (long) (this.field1873 - 1))];
        for (this.field1871 = var3.field1878; this.field1871 != var3; this.field1871 = this.field1871.field1878) {
            if (this.field1871.field1879 == arg0) {
                class128 var4 = this.field1871;
                this.field1871 = this.field1871.field1878;
                return var4;
            }
        }
        this.field1871 = null;
        return null;
    }

    @ObfuscatedName("dc.d(Ldq;J)V")
    public void method2230(class128 arg0, long arg1) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        class128 var4 = this.field1872[(int) (arg1 & (long) (this.field1873 - 1))];
        arg0.field1880 = var4.field1880;
        arg0.field1878 = var4;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
        arg0.field1879 = arg1;
    }

    @ObfuscatedName("dc.m()V")
    public void method2231() {
        for (int var1 = 0; var1 < this.field1873; var1++) {
            class128 var2 = this.field1872[var1];
            while (true) {
                class128 var3 = var2.field1878;
                if (var2 == var3) {
                    break;
                }
                var3.method2273();
            }
        }
        this.field1871 = null;
        this.field1874 = null;
    }

    @ObfuscatedName("dc.h()Ldq;")
    public class128 method2238() {
        this.field1875 = 0;
        return this.method2233();
    }

    @ObfuscatedName("dc.w()Ldq;")
    public class128 method2233() {
        if (this.field1875 > 0 && this.field1872[this.field1875 - 1] != this.field1874) {
            class128 var1 = this.field1874;
            this.field1874 = var1.field1878;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1875 >= this.field1873) {
                return null;
            }
            var2 = this.field1872[this.field1875++].field1878;
        } while (this.field1872[this.field1875 - 1] == var2);
        this.field1874 = var2.field1878;
        return var2;
    }
}
