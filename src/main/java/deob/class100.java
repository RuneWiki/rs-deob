package deob;

@ObfuscatedName("cv")
public class class100 {

    @ObfuscatedName("cv.s")
    public class72[] field1548 = new class72[100];

    @ObfuscatedName("cv.q")
    public int field1550;

    @ObfuscatedName("cv.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbb;")
    public class72 method1767(int arg0, String arg1, String arg2, String arg3) {
        class72 var5 = this.field1548[99];
        for (int var6 = this.field1550; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1548[var6] = this.field1548[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class72(arg0, arg1, arg3, arg2);
        } else {
            var5.method3425();
            var5.method3457();
            var5.method1020(arg0, arg1, arg3, arg2);
        }
        this.field1548[0] = var5;
        if (this.field1550 < 100) {
            this.field1550++;
        }
        return var5;
    }

    @ObfuscatedName("cv.s(IB)Lbb;")
    public class72 method1777(int arg0) {
        return arg0 >= 0 && arg0 < this.field1550 ? this.field1548[arg0] : null;
    }

    @ObfuscatedName("cv.q(S)I")
    public int method1768() {
        return this.field1550;
    }
}
