package deob;

import java.util.Iterator;

@ObfuscatedName("dl")
public final class class122 implements Iterable {

    @ObfuscatedName("dl.b")
    public int field1858;

    @ObfuscatedName("dl.l")
    public class128[] field1859;

    @ObfuscatedName("dl.i")
    public class128 field1860;

    public class122(int arg0) {
        this.field1858 = arg0;
        this.field1859 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1859[var2] = new class128();
            var3.field1877 = var3;
            var3.field1878 = var3;
        }
    }

    @ObfuscatedName("dl.b(J)Ldz;")
    public class128 method2238(long arg0) {
        class128 var3 = this.field1859[(int) (arg0 & (long) (this.field1858 - 1))];
        for (this.field1860 = var3.field1877; this.field1860 != var3; this.field1860 = this.field1860.field1877) {
            if (this.field1860.field1879 == arg0) {
                class128 var4 = this.field1860;
                this.field1860 = this.field1860.field1877;
                return var4;
            }
        }
        this.field1860 = null;
        return null;
    }

    @ObfuscatedName("dl.l(Ldz;J)V")
    public void method2234(class128 arg0, long arg1) {
        if (arg0.field1878 != null) {
            arg0.method2313();
        }
        class128 var4 = this.field1859[(int) (arg1 & (long) (this.field1858 - 1))];
        arg0.field1878 = var4.field1878;
        arg0.field1877 = var4;
        arg0.field1878.field1877 = arg0;
        arg0.field1877.field1878 = arg0;
        arg0.field1879 = arg1;
    }

    @ObfuscatedName("dl.i()V")
    public void method2235() {
        for (int var1 = 0; var1 < this.field1858; var1++) {
            class128 var2 = this.field1859[var1];
            while (true) {
                class128 var3 = var2.field1877;
                if (var2 == var3) {
                    break;
                }
                var3.method2313();
            }
        }
        this.field1860 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
