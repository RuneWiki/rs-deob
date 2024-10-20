package deob;

import java.util.Iterator;

@ObfuscatedName("dg")
public final class class122 implements Iterable {

    @ObfuscatedName("dg.k")
    public int field1855;

    @ObfuscatedName("dg.y")
    public class128[] field1856;

    @ObfuscatedName("dg.o")
    public class128 field1854;

    public class122(int arg0) {
        this.field1855 = arg0;
        this.field1856 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1856[var2] = new class128();
            var3.field1875 = var3;
            var3.field1873 = var3;
        }
    }

    @ObfuscatedName("dg.k(J)Ldb;")
    public class128 method2137(long arg0) {
        class128 var3 = this.field1856[(int) (arg0 & (long) (this.field1855 - 1))];
        for (this.field1854 = var3.field1875; this.field1854 != var3; this.field1854 = this.field1854.field1875) {
            if (this.field1854.field1874 == arg0) {
                class128 var4 = this.field1854;
                this.field1854 = this.field1854.field1875;
                return var4;
            }
        }
        this.field1854 = null;
        return null;
    }

    @ObfuscatedName("dg.y(Ldb;J)V")
    public void method2136(class128 arg0, long arg1) {
        if (arg0.field1873 != null) {
            arg0.method2214();
        }
        class128 var4 = this.field1856[(int) (arg1 & (long) (this.field1855 - 1))];
        arg0.field1873 = var4.field1873;
        arg0.field1875 = var4;
        arg0.field1873.field1875 = arg0;
        arg0.field1875.field1873 = arg0;
        arg0.field1874 = arg1;
    }

    @ObfuscatedName("dg.o()V")
    public void method2142() {
        for (int var1 = 0; var1 < this.field1855; var1++) {
            class128 var2 = this.field1856[var1];
            while (true) {
                class128 var3 = var2.field1875;
                if (var2 == var3) {
                    break;
                }
                var3.method2214();
            }
        }
        this.field1854 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
