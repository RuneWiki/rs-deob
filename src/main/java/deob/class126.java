package deob;

@ObfuscatedName("dk")
public final class class126 {

    @ObfuscatedName("dk.q")
    public int field1875;

    @ObfuscatedName("dk.d")
    public class128[] field1877;

    @ObfuscatedName("dk.h")
    public class128 field1876;

    @ObfuscatedName("dk.p")
    public class128 field1874;

    @ObfuscatedName("dk.j")
    public int field1878 = 0;

    public class126(int arg0) {
        this.field1875 = arg0;
        this.field1877 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1877[var2] = new class128();
            var3.field1881 = var3;
            var3.field1883 = var3;
        }
    }

    @ObfuscatedName("dk.q(J)Ldg;")
    public class128 method2260(long arg0) {
        class128 var3 = this.field1877[(int) (arg0 & (long) (this.field1875 - 1))];
        for (this.field1876 = var3.field1881; this.field1876 != var3; this.field1876 = this.field1876.field1881) {
            if (this.field1876.field1882 == arg0) {
                class128 var4 = this.field1876;
                this.field1876 = this.field1876.field1881;
                return var4;
            }
        }
        this.field1876 = null;
        return null;
    }

    @ObfuscatedName("dk.d(Ldg;J)V")
    public void method2261(class128 arg0, long arg1) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        class128 var4 = this.field1877[(int) (arg1 & (long) (this.field1875 - 1))];
        arg0.field1883 = var4.field1883;
        arg0.field1881 = var4;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
        arg0.field1882 = arg1;
    }

    @ObfuscatedName("dk.h()V")
    public void method2262() {
        for (int var1 = 0; var1 < this.field1875; var1++) {
            class128 var2 = this.field1877[var1];
            while (true) {
                class128 var3 = var2.field1881;
                if (var2 == var3) {
                    break;
                }
                var3.method2310();
            }
        }
        this.field1876 = null;
        this.field1874 = null;
    }

    @ObfuscatedName("dk.p()Ldg;")
    public class128 method2264() {
        this.field1878 = 0;
        return this.method2272();
    }

    @ObfuscatedName("dk.j()Ldg;")
    public class128 method2272() {
        if (this.field1878 > 0 && this.field1877[this.field1878 - 1] != this.field1874) {
            class128 var1 = this.field1874;
            this.field1874 = var1.field1881;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1878 >= this.field1875) {
                return null;
            }
            var2 = this.field1877[this.field1878++].field1881;
        } while (this.field1877[this.field1878 - 1] == var2);
        this.field1874 = var2.field1881;
        return var2;
    }
}
