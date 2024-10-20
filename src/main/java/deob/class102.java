package deob;

@ObfuscatedName("cz")
public class class102 {

    @ObfuscatedName("cz.p")
    public class73[] field1556 = new class73[100];

    @ObfuscatedName("cz.i")
    public int field1560;

    @ObfuscatedName("cz.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbb;")
    public class73 method1721(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1556[99];
        for (int var6 = this.field1560; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1556[var6] = this.field1556[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3347();
            var5.method3391();
            var5.method1001(arg0, arg1, arg3, arg2);
        }
        this.field1556[0] = var5;
        if (this.field1560 < 100) {
            this.field1560++;
        }
        return var5;
    }

    @ObfuscatedName("cz.p(IB)Lbb;")
    public class73 method1717(int arg0) {
        return arg0 >= 0 && arg0 < this.field1560 ? this.field1556[arg0] : null;
    }

    @ObfuscatedName("cz.i(S)I")
    public int method1718() {
        return this.field1560;
    }
}
