package deob;

import java.util.Iterator;

@ObfuscatedName("dw")
public final class class122 implements Iterable {

    @ObfuscatedName("dw.q")
    public int field1863;

    @ObfuscatedName("dw.d")
    public class128[] field1862;

    @ObfuscatedName("dw.h")
    public class128 field1864;

    public class122(int arg0) {
        this.field1863 = arg0;
        this.field1862 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1862[var2] = new class128();
            var3.field1881 = var3;
            var3.field1883 = var3;
        }
    }

    @ObfuscatedName("dw.q(J)Ldg;")
    public class128 method2233(long arg0) {
        class128 var3 = this.field1862[(int) (arg0 & (long) (this.field1863 - 1))];
        for (this.field1864 = var3.field1881; this.field1864 != var3; this.field1864 = this.field1864.field1881) {
            if (this.field1864.field1882 == arg0) {
                class128 var4 = this.field1864;
                this.field1864 = this.field1864.field1881;
                return var4;
            }
        }
        this.field1864 = null;
        return null;
    }

    @ObfuscatedName("dw.d(Ldg;J)V")
    public void method2226(class128 arg0, long arg1) {
        if (arg0.field1883 != null) {
            arg0.method2310();
        }
        class128 var4 = this.field1862[(int) (arg1 & (long) (this.field1863 - 1))];
        arg0.field1883 = var4.field1883;
        arg0.field1881 = var4;
        arg0.field1883.field1881 = arg0;
        arg0.field1881.field1883 = arg0;
        arg0.field1882 = arg1;
    }

    @ObfuscatedName("dw.h()V")
    public void method2227() {
        for (int var1 = 0; var1 < this.field1863; var1++) {
            class128 var2 = this.field1862[var1];
            while (true) {
                class128 var3 = var2.field1881;
                if (var2 == var3) {
                    break;
                }
                var3.method2310();
            }
        }
        this.field1864 = null;
    }

    public Iterator iterator() {
        return new class133(this);
    }
}
