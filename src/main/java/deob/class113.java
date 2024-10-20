package deob;

import java.io.IOException;

@ObfuscatedName("ek")
public class class113 {

    @ObfuscatedName("ek.aq")
    public class458 field1427;

    @ObfuscatedName("ek.aw")
    public class399 field1428 = new class399();

    @ObfuscatedName("ek.al")
    public int field1426 = 0;

    @ObfuscatedName("ek.ai")
    public class534 field1437 = new class534(5000);

    @ObfuscatedName("ek.ar")
    public class551 field1435;

    @ObfuscatedName("ek.as")
    public class533 field1429 = new class533(40000);

    @ObfuscatedName("ek.aa")
    public class314 field1430 = null;

    @ObfuscatedName("ek.az")
    public int field1431 = 0;

    @ObfuscatedName("ek.ao")
    public boolean field1432 = true;

    @ObfuscatedName("ek.au")
    public int field1433 = 0;

    @ObfuscatedName("ek.ak")
    public int field1434 = 0;

    @ObfuscatedName("ek.ah")
    public class314 field1424;

    @ObfuscatedName("ek.aj")
    public class314 field1436;

    @ObfuscatedName("ek.af")
    public class314 field1425;

    @ObfuscatedName("ek.aq(I)V")
    public final void method2728() {
        this.field1428.method6738();
        this.field1426 = 0;
    }

    @ObfuscatedName("ek.aw(B)V")
    public final void method2731() throws IOException {
        if (this.field1427 == null || this.field1426 <= 0) {
            return;
        }
        this.field1437.field5200 = 0;
        while (true) {
            class313 var1 = (class313) this.field1428.method6756();
            if (var1 == null || var1.field3292 > this.field1437.field5199.length - this.field1437.field5200) {
                this.field1427.method7671(this.field1437.field5199, 0, this.field1437.field5200);
                this.field1434 = 0;
                break;
            }
            this.field1437.method8584(var1.field3291.field5199, 0, var1.field3292);
            this.field1426 -= var1.field3292;
            var1.method7996();
            var1.field3291.method8650();
            var1.method5433();
        }
    }

    @ObfuscatedName("ek.al(Lmn;I)V")
    public final void method2741(class313 arg0) {
        this.field1428.method6739(arg0);
        arg0.field3292 = arg0.field3291.field5200;
        arg0.field3291.field5200 = 0;
        this.field1426 += arg0.field3292;
    }

    @ObfuscatedName("ek.ai(Lrr;I)V")
    public void method2729(class458 arg0) {
        this.field1427 = arg0;
    }

    @ObfuscatedName("ek.ar(B)V")
    public void method2737() {
        if (this.field1427 != null) {
            this.field1427.method7672();
            this.field1427 = null;
        }
    }

    @ObfuscatedName("ek.as(I)V")
    public void method2739() {
        this.field1427 = null;
    }

    @ObfuscatedName("ek.aa(I)Lrr;")
    public class458 method2732() {
        return this.field1427;
    }
}
