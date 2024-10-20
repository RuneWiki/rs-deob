package deob;

@ObfuscatedName("cs")
public class class100 {

    @ObfuscatedName("cs.p")
    public class72[] field1460 = new class72[100];

    @ObfuscatedName("cs.i")
    public int field1461;

    @ObfuscatedName("cs.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbx;")
    public class72 method1775(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1460[99];
        for (int var6 = this.field1461; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1460[var6] = this.field1460[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3476();
            var5.method3513();
            var5.method1052(arg0, arg1, arg3, arg2);
        }
        this.field1460[0] = var5;
        if (this.field1461 < 100) {
            this.field1461++;
        }
        return var5;
    }

    @ObfuscatedName("cs.p(II)Lbx;")
    public class72 method1772(int arg0) {
        return arg0 >= 0 && arg0 < this.field1461 ? this.field1460[arg0] : null;
    }

    @ObfuscatedName("cs.i(I)I")
    public int method1773() {
        return this.field1461;
    }
}
