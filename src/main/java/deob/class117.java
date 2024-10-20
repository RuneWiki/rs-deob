package deob;

import java.io.IOException;

@ObfuscatedName("ed")
public class class117 {

    @ObfuscatedName("ed.ap")
    public class487 field1470;

    @ObfuscatedName("ed.aw")
    public class413 field1469 = new class413();

    @ObfuscatedName("ed.ak")
    public int field1478 = 0;

    @ObfuscatedName("ed.aj")
    public class558 field1471 = new class558(5000);

    @ObfuscatedName("ed.ai")
    public class575 field1485;

    @ObfuscatedName("ed.ay")
    public class557 field1473 = new class557(40000);

    @ObfuscatedName("ed.as")
    public class326 field1474 = null;

    @ObfuscatedName("ed.ae")
    public int field1475 = 0;

    @ObfuscatedName("ed.am")
    public boolean field1476 = true;

    @ObfuscatedName("ed.at")
    public int field1468 = 0;

    @ObfuscatedName("ed.au")
    public int field1477 = 0;

    @ObfuscatedName("ed.an")
    public class326 field1479;

    @ObfuscatedName("ed.ao")
    public class326 field1480;

    @ObfuscatedName("ed.af")
    public class326 field1481;

    @ObfuscatedName("ed.ap(B)V")
    public final void method3066() {
        this.field1469.method7298();
        this.field1478 = 0;
    }

    @ObfuscatedName("ed.aw(I)V")
    public final void method3048() throws IOException {
        if (this.field1470 == null || this.field1478 <= 0) {
            return;
        }
        this.field1471.field5462 = 0;
        while (true) {
            class325 var1 = (class325) this.field1469.method7322();
            if (var1 == null || var1.field3432 > this.field1471.field5463.length - this.field1471.field5462) {
                this.field1470.method8502(this.field1471.field5463, 0, this.field1471.field5462);
                this.field1477 = 0;
                break;
            }
            this.field1471.method9251(var1.field3433.field5463, 0, var1.field3432);
            this.field1478 -= var1.field3432;
            var1.method8667();
            var1.field3433.method9515();
            var1.method5957();
        }
    }

    @ObfuscatedName("ed.ak(Lme;S)V")
    public final void method3070(class325 arg0) {
        this.field1469.method7299(arg0);
        arg0.field3432 = arg0.field3433.field5462;
        arg0.field3433.field5462 = 0;
        this.field1478 += arg0.field3432;
    }

    @ObfuscatedName("ed.aj(Lsw;B)V")
    public void method3056(class487 arg0) {
        this.field1470 = arg0;
    }

    @ObfuscatedName("ed.ai(I)V")
    public void method3051() {
        if (this.field1470 != null) {
            this.field1470.method8512();
            this.field1470 = null;
        }
    }

    @ObfuscatedName("ed.ay(I)V")
    public void method3052() {
        this.field1470 = null;
    }

    @ObfuscatedName("ed.as(I)Lsw;")
    public class487 method3053() {
        return this.field1470;
    }
}
