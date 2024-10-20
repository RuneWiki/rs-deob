package deob;

@ObfuscatedName("cw")
public class class104 extends class352 {

    @ObfuscatedName("cw.f")
    public class142 field1340;

    @ObfuscatedName("cw.y")
    public class296 field1341 = new class296();

    public class104(class142 arg0) {
        this.field1340 = arg0;
    }

    @ObfuscatedName("cw.v(IIIII)V")
    public void method2048(int arg0, int arg1, int arg2, int arg3) {
        class101 var5 = null;
        int var6 = 0;
        for (class101 var7 = (class101) this.field1341.method4767(); var7 != null; var7 = (class101) this.field1341.method4769()) {
            var6++;
            if (var7.field1300 == arg0) {
                var7.method1994(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1300 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class296.method4812(new class101(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1341.method4767().method5496();
            }
        } else if (var6 < 4) {
            this.field1341.method4765(new class101(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cw.n(IB)Lcx;")
    public class101 method2049(int arg0) {
        class101 var2 = (class101) this.field1341.method4767();
        if (var2 == null || var2.field1300 > arg0) {
            return null;
        }
        for (class101 var3 = (class101) this.field1341.method4769(); var3 != null && var3.field1300 <= arg0; var3 = (class101) this.field1341.method4769()) {
            var2.method5496();
            var2 = var3;
        }
        if (this.field1340.field1606 + var2.field1302 + var2.field1300 > arg0) {
            return var2;
        } else {
            var2.method5496();
            return null;
        }
    }

    @ObfuscatedName("cw.f(I)Z")
    public boolean method2050() {
        return this.field1341.method4771();
    }
}
