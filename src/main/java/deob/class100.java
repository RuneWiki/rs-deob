package deob;

@ObfuscatedName("cw")
public class class100 {

    @ObfuscatedName("cw.k")
    public class72[] field1542 = new class72[100];

    @ObfuscatedName("cw.e")
    public int field1541;

    @ObfuscatedName("cw.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbm;")
    public class72 method1781(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1542[99];
        for (int var6 = this.field1541; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1542[var6] = this.field1542[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3407();
            var5.method3449();
            var5.method1050(arg0, arg1, arg3, arg2);
        }
        this.field1542[0] = var5;
        if (this.field1541 < 100) {
            this.field1541++;
        }
        return var5;
    }

    @ObfuscatedName("cw.k(IS)Lbm;")
    public class72 method1782(int arg0) {
        return arg0 >= 0 && arg0 < this.field1541 ? this.field1542[arg0] : null;
    }

    @ObfuscatedName("cw.e(B)I")
    public int method1780() {
        return this.field1541;
    }
}
