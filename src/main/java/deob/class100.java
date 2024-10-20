package deob;

@ObfuscatedName("ch")
public class class100 {

    @ObfuscatedName("ch.x")
    public class72[] field1463 = new class72[100];

    @ObfuscatedName("ch.k")
    public int field1462;

    @ObfuscatedName("ch.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbh;")
    public class72 method1767(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1463[99];
        for (int var6 = this.field1462; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1463[var6] = this.field1463[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3475();
            var5.method3514();
            var5.method1048(arg0, arg1, arg3, arg2);
        }
        this.field1463[0] = var5;
        if (this.field1462 < 100) {
            this.field1462++;
        }
        return var5;
    }

    @ObfuscatedName("ch.x(IB)Lbh;")
    public class72 method1773(int arg0) {
        return arg0 >= 0 && arg0 < this.field1462 ? this.field1463[arg0] : null;
    }

    @ObfuscatedName("ch.k(I)I")
    public int method1768() {
        return this.field1462;
    }
}
