package deob;

@ObfuscatedName("ch")
public class class102 {

    @ObfuscatedName("ch.c")
    public class73[] field1569 = new class73[100];

    @ObfuscatedName("ch.e")
    public int field1567;

    @ObfuscatedName("ch.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class73 method1714(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1569[99];
        for (int var6 = this.field1567; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1569[var6] = this.field1569[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3278();
            var5.method3318();
            var5.method993(arg0, arg1, arg3, arg2);
        }
        this.field1569[0] = var5;
        if (this.field1567 < 100) {
            this.field1567++;
        }
        return var5;
    }

    @ObfuscatedName("ch.c(IB)Lbv;")
    public class73 method1716(int arg0) {
        return arg0 >= 0 && arg0 < this.field1567 ? this.field1569[arg0] : null;
    }

    @ObfuscatedName("ch.e(I)I")
    public int method1717() {
        return this.field1567;
    }
}
