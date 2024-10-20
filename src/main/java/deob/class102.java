package deob;

@ObfuscatedName("ca")
public class class102 {

    @ObfuscatedName("ca.o")
    public class73[] field1522 = new class73[100];

    @ObfuscatedName("ca.i")
    public int field1524;

    @ObfuscatedName("ca.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class73 method1659(int arg0, String arg1, String arg2, String arg3) {
        class73 var5 = this.field1522[99];
        for (int var6 = this.field1524; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1522[var6] = this.field1522[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class73(arg0, arg1, arg3, arg2);
        } else {
            var5.method3287();
            var5.method3320();
            var5.method968(arg0, arg1, arg3, arg2);
        }
        this.field1522[0] = var5;
        if (this.field1524 < 100) {
            this.field1524++;
        }
        return var5;
    }

    @ObfuscatedName("ca.o(II)Lbv;")
    public class73 method1668(int arg0) {
        return arg0 >= 0 && arg0 < this.field1524 ? this.field1522[arg0] : null;
    }

    @ObfuscatedName("ca.i(I)I")
    public int method1661() {
        return this.field1524;
    }
}
