package deob;

@ObfuscatedName("ct")
public class class100 {

    @ObfuscatedName("ct.w")
    public class72[] field1443 = new class72[100];

    @ObfuscatedName("ct.e")
    public int field1445;

    @ObfuscatedName("ct.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class72 method1694(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1443[99];
        for (int var6 = this.field1445; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1443[var6] = this.field1443[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3427();
            var5.method3474();
            var5.method965(arg0, arg1, arg3, arg2);
        }
        this.field1443[0] = var5;
        if (this.field1445 < 100) {
            this.field1445++;
        }
        return var5;
    }

    @ObfuscatedName("ct.w(II)Lbv;")
    public class72 method1696(int arg0) {
        return arg0 >= 0 && arg0 < this.field1445 ? this.field1443[arg0] : null;
    }

    @ObfuscatedName("ct.e(I)I")
    public int method1697() {
        return this.field1445;
    }
}
