package deob;

import java.util.Iterator;

@ObfuscatedName("df")
public final class class122 implements Iterable {

    @ObfuscatedName("df.o")
    public int field1877;

    @ObfuscatedName("df.m")
    public class128[] field1876;

    @ObfuscatedName("df.b")
    public class128 field1875;

    public class122(int arg0) {
        this.field1877 = arg0;
        this.field1876 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1876[var2] = new class128();
            var3.field1895 = var3;
            var3.field1896 = var3;
        }
    }

    @ObfuscatedName("df.o(J)Ldr;")
    public class128 method2110(long arg0) {
        class128 var3 = this.field1876[(int) (arg0 & (long) (this.field1877 - 1))];
        for (this.field1875 = var3.field1895; this.field1875 != var3; this.field1875 = this.field1875.field1895) {
            if (this.field1875.field1894 == arg0) {
                class128 var4 = this.field1875;
                this.field1875 = this.field1875.field1895;
                return var4;
            }
        }
        this.field1875 = null;
        return null;
    }

    @ObfuscatedName("df.m(Ldr;J)V")
    public void method2111(class128 arg0, long arg1) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        class128 var4 = this.field1876[(int) (arg1 & (long) (this.field1877 - 1))];
        arg0.field1896 = var4.field1896;
        arg0.field1895 = var4;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
        arg0.field1894 = arg1;
    }

    @ObfuscatedName("df.b()V")
    public void method2112() {
        for (int var1 = 0; var1 < this.field1877; var1++) {
            class128 var2 = this.field1876[var1];
            while (true) {
                class128 var3 = var2.field1895;
                if (var2 == var3) {
                    break;
                }
                var3.method2189();
            }
        }
        this.field1875 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
