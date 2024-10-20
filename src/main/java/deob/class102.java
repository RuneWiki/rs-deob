package deob;

@ObfuscatedName("ct")
public class class102 {

    @ObfuscatedName("ct.h")
    public class73[] field1549 = new class73[100];

    @ObfuscatedName("ct.u")
    public int field1550;

    @ObfuscatedName("ct.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbu;")
    public class73 method1741(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1549[99];
        for (int var6 = this.field1550; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1549[var6] = this.field1549[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3364();
            var5.method3403();
            var5.method1036(arg0, arg1, arg3, arg2);
        }
        this.field1549[0] = var5;
        if (this.field1550 < 100) {
            this.field1550++;
        }
        return var5;
    }

    @ObfuscatedName("ct.h(II)Lbu;")
    public class73 method1742(int arg0) {
        return arg0 >= 0 && arg0 < this.field1550 ? this.field1549[arg0] : null;
    }

    @ObfuscatedName("ct.u(I)I")
    public int method1743() {
        return this.field1550;
    }
}
