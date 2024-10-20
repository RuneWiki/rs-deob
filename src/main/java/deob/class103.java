package deob;

@ObfuscatedName("dl")
public class class103 extends class505 {

    @ObfuscatedName("dl.ag")
    public class185 field1343;

    @ObfuscatedName("dl.ak")
    public class409 field1342 = new class409();

    public class103(class185 arg0) {
        this.field1343 = arg0;
    }

    @ObfuscatedName("dl.aq(IIIIB)V")
    public void method2561(int arg0, int arg1, int arg2, int arg3) {
        class99 var5 = null;
        int var6 = 0;
        for (class99 var7 = (class99) this.field1342.method6842(); var7 != null; var7 = (class99) this.field1342.method6844()) {
            var6++;
            if (var7.field1275 == arg0) {
                var7.method2402(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1275 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class409.method6869(new class99(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1342.method6842().method8130();
            }
        } else if (var6 < 4) {
            this.field1342.method6840(new class99(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dl.ad(II)Ldh;")
    public class99 method2562(int arg0) {
        class99 var2 = (class99) this.field1342.method6842();
        if (var2 == null || var2.field1275 > arg0) {
            return null;
        }
        for (class99 var3 = (class99) this.field1342.method6844(); var3 != null && var3.field1275 <= arg0; var3 = (class99) this.field1342.method6844()) {
            var2.method8130();
            var2 = var3;
        }
        if (this.field1343.field1938 + var2.field1275 + var2.field1270 > arg0) {
            return var2;
        } else {
            var2.method8130();
            return null;
        }
    }

    @ObfuscatedName("dl.ag(B)Z")
    public boolean method2563() {
        return this.field1342.method6839();
    }
}
