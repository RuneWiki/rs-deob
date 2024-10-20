package deob;

import java.util.Iterator;

@ObfuscatedName("dt")
public final class class122 implements Iterable {

    @ObfuscatedName("dt.u")
    public int field1848;

    @ObfuscatedName("dt.x")
    public class128[] field1849;

    @ObfuscatedName("dt.i")
    public class128 field1850;

    public class122(int arg0) {
        this.field1848 = arg0;
        this.field1849 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1849[var2] = new class128();
            var3.field1868 = var3;
            var3.field1869 = var3;
        }
    }

    @ObfuscatedName("dt.u(J)Ldv;")
    public class128 method2151(long arg0) {
        class128 var3 = this.field1849[(int) (arg0 & (long) (this.field1848 - 1))];
        for (this.field1850 = var3.field1868; this.field1850 != var3; this.field1850 = this.field1850.field1868) {
            if (this.field1850.field1867 == arg0) {
                class128 var4 = this.field1850;
                this.field1850 = this.field1850.field1868;
                return var4;
            }
        }
        this.field1850 = null;
        return null;
    }

    @ObfuscatedName("dt.x(Ldv;J)V")
    public void method2152(class128 arg0, long arg1) {
        if (arg0.field1869 != null) {
            arg0.method2228();
        }
        class128 var4 = this.field1849[(int) (arg1 & (long) (this.field1848 - 1))];
        arg0.field1869 = var4.field1869;
        arg0.field1868 = var4;
        arg0.field1869.field1868 = arg0;
        arg0.field1868.field1869 = arg0;
        arg0.field1867 = arg1;
    }

    @ObfuscatedName("dt.i()V")
    public void method2158() {
        for (int var1 = 0; var1 < this.field1848; var1++) {
            class128 var2 = this.field1849[var1];
            while (true) {
                class128 var3 = var2.field1868;
                if (var2 == var3) {
                    break;
                }
                var3.method2228();
            }
        }
        this.field1850 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
