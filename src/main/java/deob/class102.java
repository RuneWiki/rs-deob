package deob;

@ObfuscatedName("cg")
public class class102 {

    @ObfuscatedName("cg.m")
    public class73[] field1551 = new class73[100];

    @ObfuscatedName("cg.e")
    public int field1555;

    @ObfuscatedName("cg.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbe;")
    public class73 method1655(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1551[99];
        for (int var6 = this.field1555; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1551[var6] = this.field1551[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3234();
            var5.method3285();
            var5.method984(arg0, arg1, arg3, arg2);
        }
        this.field1551[0] = var5;
        if (this.field1555 < 100) {
            this.field1555++;
        }
        return var5;
    }

    @ObfuscatedName("cg.m(IB)Lbe;")
    public class73 method1649(int arg0) {
        return arg0 >= 0 && arg0 < this.field1555 ? this.field1551[arg0] : null;
    }

    @ObfuscatedName("cg.e(B)I")
    public int method1650() {
        return this.field1555;
    }
}
