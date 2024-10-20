package deob;

@ObfuscatedName("cp")
public class class102 {

    @ObfuscatedName("cp.q")
    public class73[] field1526 = new class73[100];

    @ObfuscatedName("cp.x")
    public int field1527;

    @ObfuscatedName("cp.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbj;")
    public class73 method1710(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1526[99];
        for (int var6 = this.field1527; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1526[var6] = this.field1526[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3312();
            var5.method3350();
            var5.method1020(arg0, arg1, arg3, arg2);
        }
        this.field1526[0] = var5;
        if (this.field1527 < 100) {
            this.field1527++;
        }
        return var5;
    }

    @ObfuscatedName("cp.q(IB)Lbj;")
    public class73 method1711(int arg0) {
        return arg0 >= 0 && arg0 < this.field1527 ? this.field1526[arg0] : null;
    }

    @ObfuscatedName("cp.x(I)I")
    public int method1720() {
        return this.field1527;
    }
}
