package deob;

@ObfuscatedName("cw")
public final class class103 {

    @ObfuscatedName("cw.t")
    public int field1489;

    @ObfuscatedName("cw.n")
    public class106[] field1491;

    @ObfuscatedName("cw.q")
    public class106 field1490;

    @ObfuscatedName("cw.h")
    public class106 field1492;

    @ObfuscatedName("cw.k")
    public int field1493 = 0;

    public class103(int arg0) {
        this.field1489 = arg0;
        this.field1491 = new class106[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class106 var3 = this.field1491[var2] = new class106();
            var3.field1498 = var3;
            var3.field1499 = var3;
        }
    }

    @ObfuscatedName("cw.t(J)Ldd;")
    public class106 method1259(long arg0) {
        class106 var3 = this.field1491[(int) (arg0 & (long) (this.field1489 - 1))];
        for (this.field1490 = var3.field1498; this.field1490 != var3; this.field1490 = this.field1490.field1498) {
            if (this.field1490.field1500 == arg0) {
                class106 var4 = this.field1490;
                this.field1490 = this.field1490.field1498;
                return var4;
            }
        }
        this.field1490 = null;
        return null;
    }

    @ObfuscatedName("cw.n(Ldd;J)V")
    public void method1265(class106 arg0, long arg1) {
        if (arg0.field1499 != null) {
            arg0.method1307();
        }
        class106 var4 = this.field1491[(int) (arg1 & (long) (this.field1489 - 1))];
        arg0.field1499 = var4.field1499;
        arg0.field1498 = var4;
        arg0.field1499.field1498 = arg0;
        arg0.field1498.field1499 = arg0;
        arg0.field1500 = arg1;
    }

    @ObfuscatedName("cw.q()V")
    public void method1258() {
        for (int var1 = 0; var1 < this.field1489; var1++) {
            class106 var2 = this.field1491[var1];
            while (true) {
                class106 var3 = var2.field1498;
                if (var2 == var3) {
                    break;
                }
                var3.method1307();
            }
        }
        this.field1490 = null;
        this.field1492 = null;
    }

    @ObfuscatedName("cw.h()Ldd;")
    public class106 method1262() {
        this.field1493 = 0;
        return this.method1266();
    }

    @ObfuscatedName("cw.k()Ldd;")
    public class106 method1266() {
        if (this.field1493 > 0 && this.field1491[this.field1493 - 1] != this.field1492) {
            class106 var1 = this.field1492;
            this.field1492 = var1.field1498;
            return var1;
        }
        class106 var2;
        do {
            if (this.field1493 >= this.field1489) {
                return null;
            }
            var2 = this.field1491[this.field1493++].field1498;
        } while (this.field1491[this.field1493 - 1] == var2);
        this.field1492 = var2.field1498;
        return var2;
    }
}
