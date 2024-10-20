package deob;

@ObfuscatedName("ct")
public class class104 extends class351 {

    @ObfuscatedName("ct.u")
    public class283 field1314;

    @ObfuscatedName("ct.p")
    public class274 field1315 = new class274();

    public class104(class283 arg0) {
        this.field1314 = arg0;
    }

    @ObfuscatedName("ct.f(IIIIB)V")
    public void method1951(int arg0, int arg1, int arg2, int arg3) {
        class101 var5 = null;
        int var6 = 0;
        for (class101 var7 = (class101) this.field1315.method4212(); var7 != null; var7 = (class101) this.field1315.method4213()) {
            var6++;
            if (var7.field1277 == arg0) {
                var7.method1904(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1277 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class274.method4211(new class101(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1315.method4212().method5354();
            }
        } else if (var6 < 4) {
            this.field1315.method4210(new class101(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ct.o(II)Lcl;")
    public class101 method1952(int arg0) {
        class101 var2 = (class101) this.field1315.method4212();
        if (var2 == null || var2.field1277 > arg0) {
            return null;
        }
        for (class101 var3 = (class101) this.field1315.method4213(); var3 != null && var3.field1277 <= arg0; var3 = (class101) this.field1315.method4213()) {
            var2.method5354();
            var2 = var3;
        }
        if (this.field1314.field3451 + var2.field1277 + var2.field1274 > arg0) {
            return var2;
        } else {
            var2.method5354();
            return null;
        }
    }

    @ObfuscatedName("ct.u(B)Z")
    public boolean method1953() {
        return this.field1315.method4222();
    }
}
