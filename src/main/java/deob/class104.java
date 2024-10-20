package deob;

@ObfuscatedName("ch")
public class class104 extends class353 {

    @ObfuscatedName("ch.v")
    public class143 field1326;

    @ObfuscatedName("ch.y")
    public class297 field1325 = new class297();

    public class104(class143 arg0) {
        this.field1326 = arg0;
    }

    @ObfuscatedName("ch.f(IIIIB)V")
    public void method2066(int arg0, int arg1, int arg2, int arg3) {
        class101 var5 = null;
        int var6 = 0;
        for (class101 var7 = (class101) this.field1325.method4771(); var7 != null; var7 = (class101) this.field1325.method4773()) {
            var6++;
            if (var7.field1288 == arg0) {
                var7.method2013(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1288 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class297.method4820(new class101(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1325.method4771().method5407();
            }
        } else if (var6 < 4) {
            this.field1325.method4769(new class101(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ch.e(II)Lcw;")
    public class101 method2067(int arg0) {
        class101 var2 = (class101) this.field1325.method4771();
        if (var2 == null || var2.field1288 > arg0) {
            return null;
        }
        for (class101 var3 = (class101) this.field1325.method4773(); var3 != null && var3.field1288 <= arg0; var3 = (class101) this.field1325.method4773()) {
            var2.method5407();
            var2 = var3;
        }
        if (this.field1326.field1609 + var2.field1290 + var2.field1288 > arg0) {
            return var2;
        } else {
            var2.method5407();
            return null;
        }
    }

    @ObfuscatedName("ch.v(B)Z")
    public boolean method2065() {
        return this.field1325.method4775();
    }
}
