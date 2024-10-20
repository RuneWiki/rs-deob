package deob;

@ObfuscatedName("db")
public final class class126 {

    @ObfuscatedName("db.o")
    public int field1891;

    @ObfuscatedName("db.m")
    public class128[] field1889;

    @ObfuscatedName("db.b")
    public class128 field1887;

    @ObfuscatedName("db.g")
    public class128 field1890;

    @ObfuscatedName("db.h")
    public int field1888 = 0;

    public class126(int arg0) {
        this.field1891 = arg0;
        this.field1889 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1889[var2] = new class128();
            var3.field1895 = var3;
            var3.field1896 = var3;
        }
    }

    @ObfuscatedName("db.o(J)Ldr;")
    public class128 method2151(long arg0) {
        class128 var3 = this.field1889[(int) (arg0 & (long) (this.field1891 - 1))];
        for (this.field1887 = var3.field1895; this.field1887 != var3; this.field1887 = this.field1887.field1895) {
            if (this.field1887.field1894 == arg0) {
                class128 var4 = this.field1887;
                this.field1887 = this.field1887.field1895;
                return var4;
            }
        }
        this.field1887 = null;
        return null;
    }

    @ObfuscatedName("db.m(Ldr;J)V")
    public void method2143(class128 arg0, long arg1) {
        if (arg0.field1896 != null) {
            arg0.method2189();
        }
        class128 var4 = this.field1889[(int) (arg1 & (long) (this.field1891 - 1))];
        arg0.field1896 = var4.field1896;
        arg0.field1895 = var4;
        arg0.field1896.field1895 = arg0;
        arg0.field1895.field1896 = arg0;
        arg0.field1894 = arg1;
    }

    @ObfuscatedName("db.b()V")
    public void method2144() {
        for (int var1 = 0; var1 < this.field1891; var1++) {
            class128 var2 = this.field1889[var1];
            while (true) {
                class128 var3 = var2.field1895;
                if (var2 == var3) {
                    break;
                }
                var3.method2189();
            }
        }
        this.field1887 = null;
        this.field1890 = null;
    }

    @ObfuscatedName("db.g()Ldr;")
    public class128 method2148() {
        this.field1888 = 0;
        return this.method2152();
    }

    @ObfuscatedName("db.l()Ldr;")
    public class128 method2152() {
        if (this.field1888 > 0 && this.field1889[this.field1888 - 1] != this.field1890) {
            class128 var1 = this.field1890;
            this.field1890 = var1.field1895;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1888 >= this.field1891) {
                return null;
            }
            var2 = this.field1889[this.field1888++].field1895;
        } while (this.field1889[this.field1888 - 1] == var2);
        this.field1890 = var2.field1895;
        return var2;
    }
}
