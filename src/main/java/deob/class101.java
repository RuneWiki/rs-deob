package deob;

@ObfuscatedName("db")
public class class101 extends class492 {

    @ObfuscatedName("db.al")
    public class182 field1326;

    @ObfuscatedName("db.ai")
    public class399 field1328 = new class399();

    public class101(class182 arg0) {
        this.field1326 = arg0;
    }

    @ObfuscatedName("db.aq(IIIIB)V")
    public void method2525(int arg0, int arg1, int arg2, int arg3) {
        class98 var5 = null;
        int var6 = 0;
        for (class98 var7 = (class98) this.field1328.method6756(); var7 != null; var7 = (class98) this.field1328.method6758()) {
            var6++;
            if (var7.field1285 == arg0) {
                var7.method2374(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1285 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class399.method6752(new class98(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1328.method6756().method7996();
            }
        } else if (var6 < 4) {
            this.field1328.method6740(new class98(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("db.aw(II)Ldp;")
    public class98 method2531(int arg0) {
        class98 var2 = (class98) this.field1328.method6756();
        if (var2 == null || var2.field1285 > arg0) {
            return null;
        }
        for (class98 var3 = (class98) this.field1328.method6758(); var3 != null && var3.field1285 <= arg0; var3 = (class98) this.field1328.method6758()) {
            var2.method7996();
            var2 = var3;
        }
        if (this.field1326.field1918 + var2.field1285 + var2.field1284 > arg0) {
            return var2;
        } else {
            var2.method7996();
            return null;
        }
    }

    @ObfuscatedName("db.al(I)Z")
    public boolean method2527() {
        return this.field1328.method6746();
    }
}
