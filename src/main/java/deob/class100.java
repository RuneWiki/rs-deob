package deob;

@ObfuscatedName("dq")
public class class100 extends class489 {

    @ObfuscatedName("dq.af")
    public class181 field1296;

    @ObfuscatedName("dq.aj")
    public class396 field1294 = new class396();

    public class100(class181 arg0) {
        this.field1296 = arg0;
    }

    @ObfuscatedName("dq.am(IIIII)V")
    public void method2548(int arg0, int arg1, int arg2, int arg3) {
        class97 var5 = null;
        int var6 = 0;
        for (class97 var7 = (class97) this.field1294.method6738(); var7 != null; var7 = (class97) this.field1294.method6724()) {
            var6++;
            if (var7.field1253 == arg0) {
                var7.method2393(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1253 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class396.method6710(new class97(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1294.method6738().method7988();
            }
        } else if (var6 < 4) {
            this.field1294.method6709(new class97(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dq.ap(II)Ldo;")
    public class97 method2544(int arg0) {
        class97 var2 = (class97) this.field1294.method6738();
        if (var2 == null || var2.field1253 > arg0) {
            return null;
        }
        for (class97 var3 = (class97) this.field1294.method6724(); var3 != null && var3.field1253 <= arg0; var3 = (class97) this.field1294.method6724()) {
            var2.method7988();
            var2 = var3;
        }
        if (this.field1296.field1895 + var2.field1255 + var2.field1253 > arg0) {
            return var2;
        } else {
            var2.method7988();
            return null;
        }
    }

    @ObfuscatedName("dq.af(I)Z")
    public boolean method2545() {
        return this.field1294.method6711();
    }
}
