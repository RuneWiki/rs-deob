package deob;

@ObfuscatedName("cz")
public class class103 {

    @ObfuscatedName("cz.n")
    public class74[] field1548 = new class74[100];

    @ObfuscatedName("cz.g")
    public int field1550;

    @ObfuscatedName("cz.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbs;")
    public class74 method1766(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1548[99];
        for (int var6 = this.field1550; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1548[var6] = this.field1548[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3333();
            var5.method3380();
            var5.method1038(arg0, arg1, arg3, arg2);
        }
        this.field1548[0] = var5;
        if (this.field1550 < 100) {
            this.field1550++;
        }
        return var5;
    }

    @ObfuscatedName("cz.n(II)Lbs;")
    public class74 method1765(int arg0) {
        return arg0 >= 0 && arg0 < this.field1550 ? this.field1548[arg0] : null;
    }

    @ObfuscatedName("cz.g(I)I")
    public int method1760() {
        return this.field1550;
    }
}
