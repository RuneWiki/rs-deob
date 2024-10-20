package deob;

import java.util.Iterator;

@ObfuscatedName("dl")
public final class class122 implements Iterable {

    @ObfuscatedName("dl.s")
    public int field1870;

    @ObfuscatedName("dl.c")
    public class128[] field1869;

    @ObfuscatedName("dl.f")
    public class128 field1868;

    public class122(int arg0) {
        this.field1870 = arg0;
        this.field1869 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1869[var2] = new class128();
            var3.field1888 = var3;
            var3.field1887 = var3;
        }
    }

    @ObfuscatedName("dl.s(J)Ldx;")
    public class128 method2108(long arg0) {
        class128 var3 = this.field1869[(int) (arg0 & (long) (this.field1870 - 1))];
        for (this.field1868 = var3.field1888; this.field1868 != var3; this.field1868 = this.field1868.field1888) {
            if (this.field1868.field1889 == arg0) {
                class128 var4 = this.field1868;
                this.field1868 = this.field1868.field1888;
                return var4;
            }
        }
        this.field1868 = null;
        return null;
    }

    @ObfuscatedName("dl.c(Ldx;J)V")
    public void method2099(class128 arg0, long arg1) {
        if (arg0.field1887 != null) {
            arg0.method2179();
        }
        class128 var4 = this.field1869[(int) (arg1 & (long) (this.field1870 - 1))];
        arg0.field1887 = var4.field1887;
        arg0.field1888 = var4;
        arg0.field1887.field1888 = arg0;
        arg0.field1888.field1887 = arg0;
        arg0.field1889 = arg1;
    }

    @ObfuscatedName("dl.f()V")
    public void method2101() {
        for (int var1 = 0; var1 < this.field1870; var1++) {
            class128 var2 = this.field1869[var1];
            while (true) {
                class128 var3 = var2.field1888;
                if (var2 == var3) {
                    break;
                }
                var3.method2179();
            }
        }
        this.field1868 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
