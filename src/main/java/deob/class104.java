package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.m")
    public class74[] field1323 = new class74[100];

    @ObfuscatedName("cl.k")
    public int field1322;

    @ObfuscatedName("cl.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lby;")
    public class74 method2144(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1323[99];
        for (int var6 = this.field1322; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1323[var6] = this.field1323[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3355();
            var5.method3351();
            var5.method1139(arg0, arg1, arg3, arg2);
        }
        this.field1323[0] = var5;
        if (this.field1322 < 100) {
            this.field1322++;
        }
        return var5;
    }

    @ObfuscatedName("cl.m(IB)Lby;")
    public class74 method2143(int arg0) {
        return arg0 >= 0 && arg0 < this.field1322 ? this.field1323[arg0] : null;
    }

    @ObfuscatedName("cl.k(I)I")
    public int method2142() {
        return this.field1322;
    }
}
