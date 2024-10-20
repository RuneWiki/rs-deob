package deob;

@ObfuscatedName("cu")
public final class class104 {

    @ObfuscatedName("cu.q")
    public int field1507;

    @ObfuscatedName("cu.l")
    public class107[] field1504;

    @ObfuscatedName("cu.a")
    public class107 field1505;

    @ObfuscatedName("cu.o")
    public class107 field1503;

    @ObfuscatedName("cu.c")
    public int field1506 = 0;

    public class104(int arg0) {
        this.field1507 = arg0;
        this.field1504 = new class107[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class107 var3 = this.field1504[var2] = new class107();
            var3.field1512 = var3;
            var3.field1514 = var3;
        }
    }

    @ObfuscatedName("cu.q(J)Ldn;")
    public class107 method1290(long arg0) {
        class107 var3 = this.field1504[(int) (arg0 & (long) (this.field1507 - 1))];
        for (this.field1505 = var3.field1512; this.field1505 != var3; this.field1505 = this.field1505.field1512) {
            if (this.field1505.field1513 == arg0) {
                class107 var4 = this.field1505;
                this.field1505 = this.field1505.field1512;
                return var4;
            }
        }
        this.field1505 = null;
        return null;
    }

    @ObfuscatedName("cu.l(Ldn;J)V")
    public void method1279(class107 arg0, long arg1) {
        if (arg0.field1514 != null) {
            arg0.method1328();
        }
        class107 var4 = this.field1504[(int) (arg1 & (long) (this.field1507 - 1))];
        arg0.field1514 = var4.field1514;
        arg0.field1512 = var4;
        arg0.field1514.field1512 = arg0;
        arg0.field1512.field1514 = arg0;
        arg0.field1513 = arg1;
    }

    @ObfuscatedName("cu.a()V")
    public void method1277() {
        for (int var1 = 0; var1 < this.field1507; var1++) {
            class107 var2 = this.field1504[var1];
            while (true) {
                class107 var3 = var2.field1512;
                if (var2 == var3) {
                    break;
                }
                var3.method1328();
            }
        }
        this.field1505 = null;
        this.field1503 = null;
    }

    @ObfuscatedName("cu.o()Ldn;")
    public class107 method1280() {
        this.field1506 = 0;
        return this.method1282();
    }

    @ObfuscatedName("cu.c()Ldn;")
    public class107 method1282() {
        if (this.field1506 > 0 && this.field1504[this.field1506 - 1] != this.field1503) {
            class107 var1 = this.field1503;
            this.field1503 = var1.field1512;
            return var1;
        }
        class107 var2;
        do {
            if (this.field1506 >= this.field1507) {
                return null;
            }
            var2 = this.field1504[this.field1506++].field1512;
        } while (this.field1504[this.field1506 - 1] == var2);
        this.field1503 = var2.field1512;
        return var2;
    }
}
