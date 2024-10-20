package deob;

@ObfuscatedName("dz")
public class class103 extends class506 {

    @ObfuscatedName("dz.an")
    public class238 field1329;

    @ObfuscatedName("dz.au")
    public class410 field1335 = new class410();

    public class103(class238 arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("dz.ab(IIIII)V")
    public void method2628(int arg0, int arg1, int arg2, int arg3) {
        class99 var5 = null;
        int var6 = 0;
        for (class99 var7 = (class99) this.field1335.method6951(); var7 != null; var7 = (class99) this.field1335.method6945()) {
            var6++;
            if (var7.field1262 == arg0) {
                var7.method2469(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1262 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class410.method6996(new class99(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1335.method6951().method8218();
            }
        } else if (var6 < 4) {
            this.field1335.method6993(new class99(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dz.ay(II)Ldu;")
    public class99 method2629(int arg0) {
        class99 var2 = (class99) this.field1335.method6951();
        if (var2 == null || var2.field1262 > arg0) {
            return null;
        }
        for (class99 var3 = (class99) this.field1335.method6945(); var3 != null && var3.field1262 <= arg0; var3 = (class99) this.field1335.method6945()) {
            var2.method8218();
            var2 = var3;
        }
        if (this.field1329.field2509 + var2.field1262 + var2.field1261 > arg0) {
            return var2;
        } else {
            var2.method8218();
            return null;
        }
    }

    @ObfuscatedName("dz.an(B)Z")
    public boolean method2627() {
        return this.field1335.method6947();
    }
}
