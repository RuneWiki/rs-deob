package deob;

@ObfuscatedName("dd")
public class class101 extends class493 {

    @ObfuscatedName("dd.af")
    public class200 field1323;

    @ObfuscatedName("dd.at")
    public class400 field1324 = new class400();

    public class101(class200 arg0) {
        this.field1323 = arg0;
    }

    @ObfuscatedName("dd.az(IIIII)V")
    public void method2459(int arg0, int arg1, int arg2, int arg3) {
        class98 var5 = null;
        int var6 = 0;
        for (class98 var7 = (class98) this.field1324.method6649(); var7 != null; var7 = (class98) this.field1324.method6650()) {
            var6++;
            if (var7.field1281 == arg0) {
                var7.method2318(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1281 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class400.method6648(new class98(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1324.method6649().method7855();
            }
        } else if (var6 < 4) {
            this.field1324.method6690(new class98(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dd.ah(II)Ldz;")
    public class98 method2457(int arg0) {
        class98 var2 = (class98) this.field1324.method6649();
        if (var2 == null || var2.field1281 > arg0) {
            return null;
        }
        for (class98 var3 = (class98) this.field1324.method6650(); var3 != null && var3.field1281 <= arg0; var3 = (class98) this.field1324.method6650()) {
            var2.method7855();
            var2 = var3;
        }
        if (this.field1323.field2049 + var2.field1282 + var2.field1281 > arg0) {
            return var2;
        } else {
            var2.method7855();
            return null;
        }
    }

    @ObfuscatedName("dd.af(I)Z")
    public boolean method2458() {
        return this.field1324.method6714();
    }
}
