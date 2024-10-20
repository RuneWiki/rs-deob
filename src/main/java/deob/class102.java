package deob;

@ObfuscatedName("cu")
public class class102 {

    @ObfuscatedName("cu.o")
    public class73[] field1565 = new class73[100];

    @ObfuscatedName("cu.x")
    public int field1564;

    @ObfuscatedName("cu.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbw;")
    public class73 method1677(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1565[99];
        for (int var6 = this.field1564; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1565[var6] = this.field1565[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3294();
            var5.method3331();
            var5.method1001(arg0, arg1, arg3, arg2);
        }
        this.field1565[0] = var5;
        if (this.field1564 < 100) {
            this.field1564++;
        }
        return var5;
    }

    @ObfuscatedName("cu.o(II)Lbw;")
    public class73 method1679(int arg0) {
        return arg0 >= 0 && arg0 < this.field1564 ? this.field1565[arg0] : null;
    }

    @ObfuscatedName("cu.x(I)I")
    public int method1684() {
        return this.field1564;
    }
}
