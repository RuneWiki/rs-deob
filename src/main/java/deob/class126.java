package deob;

@ObfuscatedName("dw")
public final class class126 {

    @ObfuscatedName("dw.k")
    public int field1870;

    @ObfuscatedName("dw.y")
    public class128[] field1867;

    @ObfuscatedName("dw.o")
    public class128 field1866;

    @ObfuscatedName("dw.r")
    public class128 field1869;

    @ObfuscatedName("dw.w")
    public int field1868 = 0;

    public class126(int arg0) {
        this.field1870 = arg0;
        this.field1867 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1867[var2] = new class128();
            var3.field1875 = var3;
            var3.field1873 = var3;
        }
    }

    @ObfuscatedName("dw.k(J)Ldb;")
    public class128 method2171(long arg0) {
        class128 var3 = this.field1867[(int) (arg0 & (long) (this.field1870 - 1))];
        for (this.field1866 = var3.field1875; this.field1866 != var3; this.field1866 = this.field1866.field1875) {
            if (this.field1866.field1874 == arg0) {
                class128 var4 = this.field1866;
                this.field1866 = this.field1866.field1875;
                return var4;
            }
        }
        this.field1866 = null;
        return null;
    }

    @ObfuscatedName("dw.y(Ldb;J)V")
    public void method2173(class128 arg0, long arg1) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        class128 var4 = this.field1867[(int) (arg1 & (long) (this.field1870 - 1))];
        arg0.field1873 = var4.field1873;
        arg0.field1875 = var4;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
        arg0.field1874 = arg1;
    }

    @ObfuscatedName("dw.o()V")
    public void method2180() {
        for (int var1 = 0; var1 < this.field1870; var1++) {
            class128 var2 = this.field1867[var1];
            while (true) {
                class128 var3 = var2.field1875;
                if (var2 == var3) {
                    break;
                }
                var3.method2214();
            }
        }
        this.field1866 = null;
        this.field1869 = null;
    }

    @ObfuscatedName("dw.r()Ldb;")
    public class128 method2174() {
        this.field1868 = 0;
        return this.method2175();
    }

    @ObfuscatedName("dw.w()Ldb;")
    public class128 method2175() {
        if (this.field1868 > 0 && this.field1867[this.field1868 - 1] != this.field1869) {
            class128 var1 = this.field1869;
            this.field1869 = var1.field1875;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1868 >= this.field1870) {
                return null;
            }
            var2 = this.field1867[this.field1868++].field1875;
        } while (this.field1867[this.field1868 - 1] == var2);
        this.field1869 = var2.field1875;
        return var2;
    }
}
