package deob;

import java.io.IOException;

@ObfuscatedName("el")
public class class117 {

    @ObfuscatedName("el.ac")
    public class482 field1481;

    @ObfuscatedName("el.ae")
    public class412 field1482 = new class412();

    @ObfuscatedName("el.ag")
    public int field1483 = 0;

    @ObfuscatedName("el.am")
    public class551 field1484 = new class551(5000);

    @ObfuscatedName("el.ax")
    public class568 field1486;

    @ObfuscatedName("el.aq")
    public class550 field1492 = new class550(40000);

    @ObfuscatedName("el.af")
    public class327 field1487 = null;

    @ObfuscatedName("el.at")
    public int field1488 = 0;

    @ObfuscatedName("el.au")
    public boolean field1485 = true;

    @ObfuscatedName("el.ar")
    public int field1490 = 0;

    @ObfuscatedName("el.al")
    public int field1491 = 0;

    @ObfuscatedName("el.ad")
    public class327 field1493;

    @ObfuscatedName("el.ah")
    public class327 field1489;

    @ObfuscatedName("el.ap")
    public class327 field1494;

    @ObfuscatedName("el.ac(I)V")
    public final void method2964() {
        this.field1482.method7068();
        this.field1483 = 0;
    }

    @ObfuscatedName("el.ae(I)V")
    public final void method2942() throws IOException {
        if (this.field1481 == null || this.field1483 <= 0) {
            return;
        }
        this.field1484.field5415 = 0;
        while (true) {
            class326 var1 = (class326) this.field1482.method7126();
            if (var1 == null || var1.field3432 > this.field1484.field5413.length - this.field1484.field5415) {
                this.field1481.method8216(this.field1484.field5413, 0, this.field1484.field5415);
                this.field1491 = 0;
                break;
            }
            this.field1484.method8967(var1.field3426.field5413, 0, var1.field3432);
            this.field1483 -= var1.field3432;
            var1.method8362();
            var1.field3426.method9028();
            var1.method5750();
        }
    }

    @ObfuscatedName("el.ag(Lmq;I)V")
    public final void method2943(class326 arg0) {
        this.field1482.method7139(arg0);
        arg0.field3432 = arg0.field3426.field5415;
        arg0.field3426.field5415 = 0;
        this.field1483 += arg0.field3432;
    }

    @ObfuscatedName("el.am(Lsk;I)V")
    public void method2944(class482 arg0) {
        this.field1481 = arg0;
    }

    @ObfuscatedName("el.ax(I)V")
    public void method2965() {
        if (this.field1481 != null) {
            this.field1481.method8198();
            this.field1481 = null;
        }
    }

    @ObfuscatedName("el.aq(I)V")
    public void method2955() {
        this.field1481 = null;
    }

    @ObfuscatedName("el.af(I)Lsk;")
    public class482 method2958() {
        return this.field1481;
    }
}
