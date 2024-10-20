package deob;

import java.io.IOException;

@ObfuscatedName("el")
public class class115 {

    @ObfuscatedName("el.ak")
    public class478 field1473;

    @ObfuscatedName("el.al")
    public class408 field1474 = new class408();

    @ObfuscatedName("el.aj")
    public int field1466 = 0;

    @ObfuscatedName("el.az")
    public class546 field1469 = new class546(5000);

    @ObfuscatedName("el.af")
    public class563 field1467;

    @ObfuscatedName("el.aa")
    public class545 field1468 = new class545(40000);

    @ObfuscatedName("el.at")
    public class322 field1470 = null;

    @ObfuscatedName("el.ab")
    public int field1465 = 0;

    @ObfuscatedName("el.ac")
    public boolean field1472 = true;

    @ObfuscatedName("el.ao")
    public int field1471 = 0;

    @ObfuscatedName("el.ah")
    public int field1464 = 0;

    @ObfuscatedName("el.av")
    public class322 field1475;

    @ObfuscatedName("el.aq")
    public class322 field1476;

    @ObfuscatedName("el.ap")
    public class322 field1477;

    @ObfuscatedName("el.ak(I)V")
    public final void method2743() {
        this.field1474.method6885();
        this.field1466 = 0;
    }

    @ObfuscatedName("el.al(I)V")
    public final void method2747() throws IOException {
        if (this.field1473 == null || this.field1466 <= 0) {
            return;
        }
        this.field1469.field5344 = 0;
        while (true) {
            class321 var1 = (class321) this.field1474.method6889();
            if (var1 == null || var1.field3395 > this.field1469.field5346.length - this.field1469.field5344) {
                this.field1473.method8023(this.field1469.field5346, 0, this.field1469.field5344);
                this.field1464 = 0;
                break;
            }
            this.field1469.method8939(var1.field3393.field5346, 0, var1.field3395);
            this.field1466 -= var1.field3395;
            var1.method8189();
            var1.field3393.method8840();
            var1.method5592();
        }
    }

    @ObfuscatedName("el.aj(Lmd;S)V")
    public final void method2745(class321 arg0) {
        this.field1474.method6886(arg0);
        arg0.field3395 = arg0.field3393.field5344;
        arg0.field3393.field5344 = 0;
        this.field1466 += arg0.field3395;
    }

    @ObfuscatedName("el.az(Lsm;I)V")
    public void method2742(class478 arg0) {
        this.field1473 = arg0;
    }

    @ObfuscatedName("el.af(I)V")
    public void method2749() {
        if (this.field1473 != null) {
            this.field1473.method8024();
            this.field1473 = null;
        }
    }

    @ObfuscatedName("el.aa(I)V")
    public void method2751() {
        this.field1473 = null;
    }

    @ObfuscatedName("el.at(B)Lsm;")
    public class478 method2748() {
        return this.field1473;
    }
}
