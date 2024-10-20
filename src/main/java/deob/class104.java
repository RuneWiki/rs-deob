package deob;

@ObfuscatedName("co")
public class class104 {

    @ObfuscatedName("co.v")
    public class74[] field1324 = new class74[100];

    @ObfuscatedName("co.x")
    public int field1321;

    @ObfuscatedName("co.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbg;")
    public class74 method2140(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1324[99];
        for (int var6 = this.field1321; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1324[var6] = this.field1324[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3359();
            var5.method3353();
            var5.method1147(arg0, arg1, arg3, arg2);
        }
        this.field1324[0] = var5;
        if (this.field1321 < 100) {
            this.field1321++;
        }
        return var5;
    }

    @ObfuscatedName("co.v(II)Lbg;")
    public class74 method2141(int arg0) {
        return arg0 >= 0 && arg0 < this.field1321 ? this.field1324[arg0] : null;
    }

    @ObfuscatedName("co.x(I)I")
    public int method2142() {
        return this.field1321;
    }
}
