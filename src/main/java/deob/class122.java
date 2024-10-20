package deob;

import java.util.Iterator;

@ObfuscatedName("dz")
public final class class122 implements Iterable {

    @ObfuscatedName("dz.n")
    public int field1860;

    @ObfuscatedName("dz.d")
    public class128[] field1859;

    @ObfuscatedName("dz.m")
    public class128 field1861;

    public class122(int arg0) {
        this.field1860 = arg0;
        this.field1859 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1859[var2] = new class128();
            var3.field1878 = var3;
            var3.field1880 = var3;
        }
    }

    @ObfuscatedName("dz.n(J)Ldq;")
    public class128 method2202(long arg0) {
        class128 var3 = this.field1859[(int) (arg0 & (long) (this.field1860 - 1))];
        for (this.field1861 = var3.field1878; this.field1861 != var3; this.field1861 = this.field1861.field1878) {
            if (this.field1861.field1879 == arg0) {
                class128 var4 = this.field1861;
                this.field1861 = this.field1861.field1878;
                return var4;
            }
        }
        this.field1861 = null;
        return null;
    }

    @ObfuscatedName("dz.d(Ldq;J)V")
    public void method2197(class128 arg0, long arg1) {
        if (arg0.field1880 != null) {
            arg0.method2273();
        }
        class128 var4 = this.field1859[(int) (arg1 & (long) (this.field1860 - 1))];
        arg0.field1880 = var4.field1880;
        arg0.field1878 = var4;
        arg0.field1880.field1878 = arg0;
        arg0.field1878.field1880 = arg0;
        arg0.field1879 = arg1;
    }

    @ObfuscatedName("dz.m()V")
    public void method2196() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            class128 var2 = this.field1859[var1];
            while (true) {
                class128 var3 = var2.field1878;
                if (var2 == var3) {
                    break;
                }
                var3.method2273();
            }
        }
        this.field1861 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
