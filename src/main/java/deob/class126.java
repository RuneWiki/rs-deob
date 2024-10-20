package deob;

@ObfuscatedName("di")
public final class class126 {

    @ObfuscatedName("di.f")
    public int field1899;

    @ObfuscatedName("di.i")
    public class128[] field1898;

    @ObfuscatedName("di.u")
    public class128 field1901;

    @ObfuscatedName("di.h")
    public class128 field1900;

    @ObfuscatedName("di.r")
    public int field1897 = 0;

    public class126(int arg0) {
        this.field1899 = arg0;
        this.field1898 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1898[var2] = new class128();
            var3.field1906 = var3;
            var3.field1904 = var3;
        }
    }

    @ObfuscatedName("di.f(J)Ldt;")
    public class128 method2254(long arg0) {
        class128 var3 = this.field1898[(int) (arg0 & (long) (this.field1899 - 1))];
        for (this.field1901 = var3.field1906; this.field1901 != var3; this.field1901 = this.field1901.field1906) {
            if (this.field1901.field1905 == arg0) {
                class128 var4 = this.field1901;
                this.field1901 = this.field1901.field1906;
                return var4;
            }
        }
        this.field1901 = null;
        return null;
    }

    @ObfuscatedName("di.i(Ldt;J)V")
    public void method2255(class128 arg0, long arg1) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        class128 var4 = this.field1898[(int) (arg1 & (long) (this.field1899 - 1))];
        arg0.field1904 = var4.field1904;
        arg0.field1906 = var4;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
        arg0.field1905 = arg1;
    }

    @ObfuscatedName("di.u()V")
    public void method2256() {
        for (int var1 = 0; var1 < this.field1899; var1++) {
            class128 var2 = this.field1898[var1];
            while (true) {
                class128 var3 = var2.field1906;
                if (var2 == var3) {
                    break;
                }
                var3.method2289();
            }
        }
        this.field1901 = null;
        this.field1900 = null;
    }

    @ObfuscatedName("di.r()Ldt;")
    public class128 method2257() {
        this.field1897 = 0;
        return this.method2259();
    }

    @ObfuscatedName("di.o()Ldt;")
    public class128 method2259() {
        if (this.field1897 > 0 && this.field1898[this.field1897 - 1] != this.field1900) {
            class128 var1 = this.field1900;
            this.field1900 = var1.field1906;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1897 >= this.field1899) {
                return null;
            }
            var2 = this.field1898[this.field1897++].field1906;
        } while (this.field1898[this.field1897 - 1] == var2);
        this.field1900 = var2.field1906;
        return var2;
    }
}
