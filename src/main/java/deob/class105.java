package deob;

@ObfuscatedName("eg")
public class class105 extends class515 {

    @ObfuscatedName("eg.ak")
    public class187 field1364;

    @ObfuscatedName("eg.aj")
    public class413 field1363 = new class413();

    public class105(class187 arg0) {
        this.field1364 = arg0;
    }

    @ObfuscatedName("eg.ap(IIIII)V")
    public void method2844(int arg0, int arg1, int arg2, int arg3) {
        class101 var5 = null;
        int var6 = 0;
        for (class101 var7 = (class101) this.field1363.method7322(); var7 != null; var7 = (class101) this.field1363.method7303()) {
            var6++;
            if (var7.field1300 == arg0) {
                var7.method2664(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1300 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class413.method7333(new class101(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1363.method7322().method8667();
            }
        } else if (var6 < 4) {
            this.field1363.method7300(new class101(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("eg.aw(IB)Lde;")
    public class101 method2845(int arg0) {
        class101 var2 = (class101) this.field1363.method7322();
        if (var2 == null || var2.field1300 > arg0) {
            return null;
        }
        for (class101 var3 = (class101) this.field1363.method7303(); var3 != null && var3.field1300 <= arg0; var3 = (class101) this.field1363.method7303()) {
            var2.method8667();
            var2 = var3;
        }
        if (this.field1364.field1956 + var2.field1300 + var2.field1298 > arg0) {
            return var2;
        } else {
            var2.method8667();
            return null;
        }
    }

    @ObfuscatedName("eg.ak(B)Z")
    public boolean method2850() {
        return this.field1363.method7305();
    }
}
