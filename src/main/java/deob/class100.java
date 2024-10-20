package deob;

@ObfuscatedName("dm")
public class class100 extends class473 {

    @ObfuscatedName("dm.ao")
    public class191 field1319;

    @ObfuscatedName("dm.at")
    public class380 field1320 = new class380();

    public class100(class191 arg0) {
        this.field1319 = arg0;
    }

    @ObfuscatedName("dm.au(IIIIB)V")
    public void method2453(int arg0, int arg1, int arg2, int arg3) {
        class97 var5 = null;
        int var6 = 0;
        for (class97 var7 = (class97) this.field1320.method6457(); var7 != null; var7 = (class97) this.field1320.method6443()) {
            var6++;
            if (var7.field1280 == arg0) {
                var7.method2303(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1280 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class380.method6483(new class97(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1320.method6457().method7700();
            }
        } else if (var6 < 4) {
            this.field1320.method6514(new class97(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dm.ae(IB)Ldo;")
    public class97 method2460(int arg0) {
        class97 var2 = (class97) this.field1320.method6457();
        if (var2 == null || var2.field1280 > arg0) {
            return null;
        }
        for (class97 var3 = (class97) this.field1320.method6443(); var3 != null && var3.field1280 <= arg0; var3 = (class97) this.field1320.method6443()) {
            var2.method7700();
            var2 = var3;
        }
        if (this.field1319.field1996 + var2.field1280 + var2.field1278 > arg0) {
            return var2;
        } else {
            var2.method7700();
            return null;
        }
    }

    @ObfuscatedName("dm.ao(B)Z")
    public boolean method2461() {
        return this.field1320.method6446();
    }
}
