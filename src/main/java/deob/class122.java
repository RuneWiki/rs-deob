package deob;

import java.util.Iterator;

@ObfuscatedName("dj")
public final class class122 implements Iterable {

    @ObfuscatedName("dj.p")
    public int field1866;

    @ObfuscatedName("dj.g")
    public class128[] field1865;

    @ObfuscatedName("dj.x")
    public class128 field1864;

    public class122(int arg0) {
        this.field1866 = arg0;
        this.field1865 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1865[var2] = new class128();
            var3.field1883 = var3;
            var3.field1884 = var3;
        }
    }

    @ObfuscatedName("dj.p(J)Ldb;")
    public class128 method2143(long arg0) {
        class128 var3 = this.field1865[(int) (arg0 & (long) (this.field1866 - 1))];
        for (this.field1864 = var3.field1883; this.field1864 != var3; this.field1864 = this.field1864.field1883) {
            if (this.field1864.field1885 == arg0) {
                class128 var4 = this.field1864;
                this.field1864 = this.field1864.field1883;
                return var4;
            }
        }
        this.field1864 = null;
        return null;
    }

    @ObfuscatedName("dj.g(Ldb;J)V")
    public void method2151(class128 arg0, long arg1) {
        if (arg0.field1884 != null) {
            arg0.method2225();
        }
        class128 var4 = this.field1865[(int) (arg1 & (long) (this.field1866 - 1))];
        arg0.field1884 = var4.field1884;
        arg0.field1883 = var4;
        arg0.field1884.field1883 = arg0;
        arg0.field1883.field1884 = arg0;
        arg0.field1885 = arg1;
    }

    @ObfuscatedName("dj.x()V")
    public void method2154() {
        for (int var1 = 0; var1 < this.field1866; var1++) {
            class128 var2 = this.field1865[var1];
            while (true) {
                class128 var3 = var2.field1883;
                if (var2 == var3) {
                    break;
                }
                var3.method2225();
            }
        }
        this.field1864 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
