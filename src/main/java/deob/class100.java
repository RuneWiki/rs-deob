package deob;

@ObfuscatedName("co")
public class class100 {

    @ObfuscatedName("co.s")
    public class72[] field1452 = new class72[100];

    @ObfuscatedName("co.r")
    public int field1456;

    @ObfuscatedName("co.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbn;")
    public class72 method1702(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1452[99];
        for (int var6 = this.field1456; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1452[var6] = this.field1452[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3392();
            var5.method3428();
            var5.method969(arg0, arg1, arg3, arg2);
        }
        this.field1452[0] = var5;
        if (this.field1456 < 100) {
            this.field1456++;
        }
        return var5;
    }

    @ObfuscatedName("co.s(II)Lbn;")
    public class72 method1707(int arg0) {
        return arg0 >= 0 && arg0 < this.field1456 ? this.field1452[arg0] : null;
    }

    @ObfuscatedName("co.r(I)I")
    public int method1706() {
        return this.field1456;
    }
}
