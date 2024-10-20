package deob;

import java.util.Iterator;

@ObfuscatedName("dx")
public final class class122 implements Iterable {

    @ObfuscatedName("dx.f")
    public int field1887;

    @ObfuscatedName("dx.i")
    public class128[] field1886;

    @ObfuscatedName("dx.u")
    public class128 field1885;

    public class122(int arg0) {
        this.field1887 = arg0;
        this.field1886 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1886[var2] = new class128();
            var3.field1906 = var3;
            var3.field1904 = var3;
        }
    }

    @ObfuscatedName("dx.f(J)Ldt;")
    public class128 method2217(long arg0) {
        class128 var3 = this.field1886[(int) (arg0 & (long) (this.field1887 - 1))];
        for (this.field1885 = var3.field1906; this.field1885 != var3; this.field1885 = this.field1885.field1906) {
            if (this.field1885.field1905 == arg0) {
                class128 var4 = this.field1885;
                this.field1885 = this.field1885.field1906;
                return var4;
            }
        }
        this.field1885 = null;
        return null;
    }

    @ObfuscatedName("dx.i(Ldt;J)V")
    public void method2226(class128 arg0, long arg1) {
        if (arg0.field1904 != null) {
            arg0.method2289();
        }
        class128 var4 = this.field1886[(int) (arg1 & (long) (this.field1887 - 1))];
        arg0.field1904 = var4.field1904;
        arg0.field1906 = var4;
        arg0.field1904.field1906 = arg0;
        arg0.field1906.field1904 = arg0;
        arg0.field1905 = arg1;
    }

    @ObfuscatedName("dx.u()V")
    public void method2219() {
        for (int var1 = 0; var1 < this.field1887; var1++) {
            class128 var2 = this.field1886[var1];
            while (true) {
                class128 var3 = var2.field1906;
                if (var2 == var3) {
                    break;
                }
                var3.method2289();
            }
        }
        this.field1885 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
