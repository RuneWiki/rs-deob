package deob;

import java.util.Iterator;

@ObfuscatedName("dv")
public final class class122 implements Iterable {

    @ObfuscatedName("dv.b")
    public int field1845;

    @ObfuscatedName("dv.e")
    public class128[] field1846;

    @ObfuscatedName("dv.c")
    public class128 field1847;

    public class122(int arg0) {
        this.field1845 = arg0;
        this.field1846 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1846[var2] = new class128();
            var3.field1865 = var3;
            var3.field1866 = var3;
        }
    }

    @ObfuscatedName("dv.b(J)Ldz;")
    public class128 method2229(long arg0) {
        class128 var3 = this.field1846[(int) (arg0 & (long) (this.field1845 - 1))];
        for (this.field1847 = var3.field1865; this.field1847 != var3; this.field1847 = this.field1847.field1865) {
            if (this.field1847.field1864 == arg0) {
                class128 var4 = this.field1847;
                this.field1847 = this.field1847.field1865;
                return var4;
            }
        }
        this.field1847 = null;
        return null;
    }

    @ObfuscatedName("dv.e(Ldz;J)V")
    public void method2227(class128 arg0, long arg1) {
        if (arg0.field1866 != null) {
            arg0.method2298();
        }
        class128 var4 = this.field1846[(int) (arg1 & (long) (this.field1845 - 1))];
        arg0.field1866 = var4.field1866;
        arg0.field1865 = var4;
        arg0.field1866.field1865 = arg0;
        arg0.field1865.field1866 = arg0;
        arg0.field1864 = arg1;
    }

    @ObfuscatedName("dv.c()V")
    public void method2228() {
        for (int var1 = 0; var1 < this.field1845; var1++) {
            class128 var2 = this.field1846[var1];
            while (true) {
                class128 var3 = var2.field1865;
                if (var2 == var3) {
                    break;
                }
                var3.method2298();
            }
        }
        this.field1847 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
