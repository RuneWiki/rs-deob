package deob;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.k")
    public class74[] field1330 = new class74[100];

    @ObfuscatedName("cl.s")
    public int field1329;

    @ObfuscatedName("cl.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public class74 method2146(int arg0, String arg1, String arg2, String arg3) {
        class74 var5 = this.field1330[99];
        for (int var6 = this.field1329; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1330[var6] = this.field1330[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class74(arg0, arg1, arg3, arg2);
        } else {
            var5.method3401();
            var5.method3395();
            var5.method1124(arg0, arg1, arg3, arg2);
        }
        this.field1330[0] = var5;
        if (this.field1329 < 100) {
            this.field1329++;
        }
        return var5;
    }

    @ObfuscatedName("cl.k(II)Lbk;")
    public class74 method2144(int arg0) {
        return arg0 >= 0 && arg0 < this.field1329 ? this.field1330[arg0] : null;
    }

    @ObfuscatedName("cl.s(I)I")
    public int method2154() {
        return this.field1329;
    }
}
