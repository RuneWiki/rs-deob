package deob;

@ObfuscatedName("cr")
public class class104 {

    @ObfuscatedName("cr.b")
    public class74[] field1331 = new class74[100];

    @ObfuscatedName("cr.l")
    public int field1332;

    @ObfuscatedName("cr.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public class74 method2173(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1331[99];
        for (int var6 = this.field1332; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1331[var6] = this.field1331[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3407();
            var5.method3400();
            var5.method1130(arg0, arg1, arg3, arg2);
        }
        this.field1331[0] = var5;
        if (this.field1332 < 100) {
            this.field1332++;
        }
        return var5;
    }

    @ObfuscatedName("cr.b(IB)Lbk;")
    public class74 method2172(int arg0) {
        return arg0 >= 0 && arg0 < this.field1332 ? this.field1331[arg0] : null;
    }

    @ObfuscatedName("cr.l(I)I")
    public int method2162() {
        return this.field1332;
    }
}
