package deob;

@ObfuscatedName("ca")
public class class102 {

    @ObfuscatedName("ca.c")
    public class73[] field1544 = new class73[100];

    @ObfuscatedName("ca.f")
    public int field1545;

    @ObfuscatedName("ca.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbe;")
    public class73 method1750(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1544[99];
        for (int var6 = this.field1545; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1544[var6] = this.field1544[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3372();
            var5.method3413();
            var5.method995(arg0, arg1, arg3, arg2);
        }
        this.field1544[0] = var5;
        if (this.field1545 < 100) {
            this.field1545++;
        }
        return var5;
    }

    @ObfuscatedName("ca.c(II)Lbe;")
    public class73 method1751(int arg0) {
        return arg0 >= 0 && arg0 < this.field1545 ? this.field1544[arg0] : null;
    }

    @ObfuscatedName("ca.f(I)I")
    public int method1764() {
        return this.field1545;
    }
}
