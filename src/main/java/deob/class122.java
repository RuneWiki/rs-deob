package deob;

import java.util.Iterator;

@ObfuscatedName("dy")
public final class class122 implements Iterable {

    @ObfuscatedName("dy.x")
    public int field1867;

    @ObfuscatedName("dy.n")
    public class128[] field1865;

    @ObfuscatedName("dy.g")
    public class128 field1866;

    public class122(int arg0) {
        this.field1867 = arg0;
        this.field1865 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1865[var2] = new class128();
            var3.field1885 = var3;
            var3.field1886 = var3;
        }
    }

    @ObfuscatedName("dy.x(J)Ldn;")
    public class128 method2253(long arg0) {
        class128 var3 = this.field1865[(int) (arg0 & (long) (this.field1867 - 1))];
        for (this.field1866 = var3.field1885; this.field1866 != var3; this.field1866 = this.field1866.field1885) {
            if (this.field1866.field1884 == arg0) {
                class128 var4 = this.field1866;
                this.field1866 = this.field1866.field1885;
                return var4;
            }
        }
        this.field1866 = null;
        return null;
    }

    @ObfuscatedName("dy.n(Ldn;J)V")
    public void method2261(class128 arg0, long arg1) {
        if (arg0.field1886 != null) {
            arg0.method2327();
        }
        class128 var4 = this.field1865[(int) (arg1 & (long) (this.field1867 - 1))];
        arg0.field1886 = var4.field1886;
        arg0.field1885 = var4;
        arg0.field1886.field1885 = arg0;
        arg0.field1885.field1886 = arg0;
        arg0.field1884 = arg1;
    }

    @ObfuscatedName("dy.g()V")
    public void method2255() {
        for (int var1 = 0; var1 < this.field1867; var1++) {
            class128 var2 = this.field1865[var1];
            while (true) {
                class128 var3 = var2.field1885;
                if (var2 == var3) {
                    break;
                }
                var3.method2327();
            }
        }
        this.field1866 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
