package deob;

@ObfuscatedName("cc")
public class class103 {

    @ObfuscatedName("cc.h")
    public class74[] field1560 = new class74[100];

    @ObfuscatedName("cc.f")
    public int field1561;

    @ObfuscatedName("cc.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class74 method1724(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1560[99];
        for (int var6 = this.field1561; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1560[var6] = this.field1560[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3314();
            var5.method3350();
            var5.method1065(arg0, arg1, arg3, arg2);
        }
        this.field1560[0] = var5;
        if (this.field1561 < 100) {
            this.field1561++;
        }
        return var5;
    }

    @ObfuscatedName("cc.h(II)Lbv;")
    public class74 method1725(int arg0) {
        return arg0 >= 0 && arg0 < this.field1561 ? this.field1560[arg0] : null;
    }

    @ObfuscatedName("cc.f(I)I")
    public int method1728() {
        return this.field1561;
    }
}
