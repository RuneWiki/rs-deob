package deob;

@ObfuscatedName("ct")
public class class104 {

    @ObfuscatedName("ct.v")
    public class74[] field1314 = new class74[100];

    @ObfuscatedName("ct.d")
    public int field1316;

    @ObfuscatedName("ct.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;")
    public class74 method2221(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1314[99];
        for (int var6 = this.field1316; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1314[var6] = this.field1314[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3486();
            var5.method3481();
            var5.method1141(arg0, arg1, arg3, arg2);
        }
        this.field1314[0] = var5;
        if (this.field1316 < 100) {
            this.field1316++;
        }
        return var5;
    }

    @ObfuscatedName("ct.v(II)Lbd;")
    public class74 method2215(int arg0) {
        return arg0 >= 0 && arg0 < this.field1316 ? this.field1314[arg0] : null;
    }

    @ObfuscatedName("ct.d(I)I")
    public int method2216() {
        return this.field1316;
    }
}
