package deob;

@ObfuscatedName("ci")
public class class100 {

    @ObfuscatedName("ci.v")
    public class72[] field1452 = new class72[100];

    @ObfuscatedName("ci.y")
    public int field1453;

    @ObfuscatedName("ci.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbs;")
    public class72 method1738(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1452[99];
        for (int var6 = this.field1453; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1452[var6] = this.field1452[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3474();
            var5.method3515();
            var5.method1023(arg0, arg1, arg3, arg2);
        }
        this.field1452[0] = var5;
        if (this.field1453 < 100) {
            this.field1453++;
        }
        return var5;
    }

    @ObfuscatedName("ci.v(II)Lbs;")
    public class72 method1737(int arg0) {
        return arg0 >= 0 && arg0 < this.field1453 ? this.field1452[arg0] : null;
    }

    @ObfuscatedName("ci.y(I)I")
    public int method1741() {
        return this.field1453;
    }
}
