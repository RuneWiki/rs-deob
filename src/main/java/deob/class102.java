package deob;

@ObfuscatedName("cb")
public class class102 {

    @ObfuscatedName("cb.w")
    public class73[] field1579 = new class73[100];

    @ObfuscatedName("cb.a")
    public int field1580;

    @ObfuscatedName("cb.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public class73 method1728(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1579[99];
        for (int var6 = this.field1580; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1579[var6] = this.field1579[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3290();
            var5.method3323();
            var5.method1037(arg0, arg1, arg3, arg2);
        }
        this.field1579[0] = var5;
        if (this.field1580 < 100) {
            this.field1580++;
        }
        return var5;
    }

    @ObfuscatedName("cb.w(II)Lbd;")
    public class73 method1719(int arg0) {
        return arg0 >= 0 && arg0 < this.field1580 ? this.field1579[arg0] : null;
    }

    @ObfuscatedName("cb.a(I)I")
    public int method1725() {
        return this.field1580;
    }
}
