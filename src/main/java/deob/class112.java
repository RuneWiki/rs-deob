package deob;

import java.io.IOException;

@ObfuscatedName("er")
public class class112 {

    @ObfuscatedName("er.au")
    public class439 field1440;

    @ObfuscatedName("er.ae")
    public class380 field1434 = new class380();

    @ObfuscatedName("er.ao")
    public int field1427 = 0;

    @ObfuscatedName("er.at")
    public class515 field1428 = new class515(5000);

    @ObfuscatedName("er.ac")
    public class532 field1429;

    @ObfuscatedName("er.ai")
    public class514 field1430 = new class514(40000);

    @ObfuscatedName("er.az")
    public class298 field1426 = null;

    @ObfuscatedName("er.ap")
    public int field1432 = 0;

    @ObfuscatedName("er.aa")
    public boolean field1433 = true;

    @ObfuscatedName("er.af")
    public int field1436 = 0;

    @ObfuscatedName("er.ad")
    public int field1435 = 0;

    @ObfuscatedName("er.aq")
    public class298 field1431;

    @ObfuscatedName("er.al")
    public class298 field1437;

    @ObfuscatedName("er.an")
    public class298 field1438;

    @ObfuscatedName("er.au(I)V")
    public final void method2678() {
        this.field1434.method6438();
        this.field1427 = 0;
    }

    @ObfuscatedName("er.ae(B)V")
    public final void method2664() throws IOException {
        if (this.field1440 == null || this.field1427 <= 0) {
            return;
        }
        this.field1428.field5111 = 0;
        while (true) {
            class297 var1 = (class297) this.field1434.method6457();
            if (var1 == null || var1.field3223 > this.field1428.field5108.length - this.field1428.field5111) {
                this.field1440.method7369(this.field1428.field5108, 0, this.field1428.field5111);
                this.field1435 = 0;
                break;
            }
            this.field1428.method8293(var1.field3227.field5108, 0, var1.field3223);
            this.field1427 -= var1.field3223;
            var1.method7700();
            var1.field3227.method8282();
            var1.method5193();
        }
    }

    @ObfuscatedName("er.ao(Lly;B)V")
    public final void method2665(class297 arg0) {
        this.field1434.method6439(arg0);
        arg0.field3223 = arg0.field3227.field5111;
        arg0.field3227.field5111 = 0;
        this.field1427 += arg0.field3223;
    }

    @ObfuscatedName("er.at(Lqi;B)V")
    public void method2666(class439 arg0) {
        this.field1440 = arg0;
    }

    @ObfuscatedName("er.ac(I)V")
    public void method2674() {
        if (this.field1440 != null) {
            this.field1440.method7386();
            this.field1440 = null;
        }
    }

    @ObfuscatedName("er.ai(I)V")
    public void method2668() {
        this.field1440 = null;
    }

    @ObfuscatedName("er.az(I)Lqi;")
    public class439 method2669() {
        return this.field1440;
    }
}
