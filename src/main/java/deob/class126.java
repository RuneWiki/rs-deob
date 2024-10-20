package deob;

@ObfuscatedName("dr")
public final class class126 {

    @ObfuscatedName("dr.b")
    public int field1857;

    @ObfuscatedName("dr.e")
    public class128[] field1858;

    @ObfuscatedName("dr.c")
    public class128 field1859;

    @ObfuscatedName("dr.l")
    public class128 field1860;

    @ObfuscatedName("dr.y")
    public int field1861 = 0;

    public class126(int arg0) {
        this.field1857 = arg0;
        this.field1858 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1858[var2] = new class128();
            var3.field1865 = var3;
            var3.field1866 = var3;
        }
    }

    @ObfuscatedName("dr.b(J)Ldz;")
    public class128 method2259(long arg0) {
        class128 var3 = this.field1858[(int) (arg0 & (long) (this.field1857 - 1))];
        for (this.field1859 = var3.field1865; this.field1859 != var3; this.field1859 = this.field1859.field1865) {
            if (this.field1859.field1864 == arg0) {
                class128 var4 = this.field1859;
                this.field1859 = this.field1859.field1865;
                return var4;
            }
        }
        this.field1859 = null;
        return null;
    }

    @ObfuscatedName("dr.e(Ldz;J)V")
    public void method2267(class128 arg0, long arg1) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        class128 var4 = this.field1858[(int) (arg1 & (long) (this.field1857 - 1))];
        arg0.field1866 = var4.field1866;
        arg0.field1865 = var4;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
        arg0.field1864 = arg1;
    }

    @ObfuscatedName("dr.c()V")
    public void method2261() {
        for (int var1 = 0; var1 < this.field1857; var1++) {
            class128 var2 = this.field1858[var1];
            while (true) {
                class128 var3 = var2.field1865;
                if (var2 == var3) {
                    break;
                }
                var3.method2298();
            }
        }
        this.field1859 = null;
        this.field1860 = null;
    }

    @ObfuscatedName("dr.l()Ldz;")
    public class128 method2262() {
        this.field1861 = 0;
        return this.method2260();
    }

    @ObfuscatedName("dr.y()Ldz;")
    public class128 method2260() {
        if (this.field1861 > 0 && this.field1858[this.field1861 - 1] != this.field1860) {
            class128 var1 = this.field1860;
            this.field1860 = var1.field1865;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1861 >= this.field1857) {
                return null;
            }
            var2 = this.field1858[this.field1861++].field1865;
        } while (this.field1858[this.field1861 - 1] == var2);
        this.field1860 = var2.field1865;
        return var2;
    }
}
