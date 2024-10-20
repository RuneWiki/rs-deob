package deob;

import java.io.IOException;

@ObfuscatedName("ey")
public class class113 {

    @ObfuscatedName("ey.az")
    public class459 field1434;

    @ObfuscatedName("ey.ah")
    public class400 field1436 = new class400();

    @ObfuscatedName("ey.af")
    public int field1446 = 0;

    @ObfuscatedName("ey.at")
    public class535 field1437 = new class535(5000);

    @ObfuscatedName("ey.an")
    public class552 field1438;

    @ObfuscatedName("ey.ao")
    public class534 field1439 = new class534(40000);

    @ObfuscatedName("ey.ab")
    public class314 field1440 = null;

    @ObfuscatedName("ey.aw")
    public int field1441 = 0;

    @ObfuscatedName("ey.ad")
    public boolean field1435 = true;

    @ObfuscatedName("ey.al")
    public int field1443 = 0;

    @ObfuscatedName("ey.as")
    public int field1444 = 0;

    @ObfuscatedName("ey.ag")
    public class314 field1445;

    @ObfuscatedName("ey.ai")
    public class314 field1447;

    @ObfuscatedName("ey.ax")
    public class314 field1448;

    @ObfuscatedName("ey.az(B)V")
    public final void method2645() {
        this.field1436.method6674();
        this.field1446 = 0;
    }

    @ObfuscatedName("ey.ah(I)V")
    public final void method2643() throws IOException {
        if (this.field1434 == null || this.field1446 <= 0) {
            return;
        }
        this.field1437.field5233 = 0;
        while (true) {
            class313 var1 = (class313) this.field1436.method6649();
            if (var1 == null || var1.field3319 > this.field1437.field5231.length - this.field1437.field5233) {
                this.field1434.method7555(this.field1437.field5231, 0, this.field1437.field5233);
                this.field1444 = 0;
                break;
            }
            this.field1437.method8455(var1.field3318.field5231, 0, var1.field3319);
            this.field1446 -= var1.field3319;
            var1.method7855();
            var1.field3318.method8454();
            var1.method5357();
        }
    }

    @ObfuscatedName("ey.af(Lmh;I)V")
    public final void method2654(class313 arg0) {
        this.field1436.method6647(arg0);
        arg0.field3319 = arg0.field3318.field5233;
        arg0.field3318.field5233 = 0;
        this.field1446 += arg0.field3319;
    }

    @ObfuscatedName("ey.at(Lrq;I)V")
    public void method2641(class459 arg0) {
        this.field1434 = arg0;
    }

    @ObfuscatedName("ey.an(B)V")
    public void method2646() {
        if (this.field1434 != null) {
            this.field1434.method7551();
            this.field1434 = null;
        }
    }

    @ObfuscatedName("ey.ao(I)V")
    public void method2658() {
        this.field1434 = null;
    }

    @ObfuscatedName("ey.ab(I)Lrq;")
    public class459 method2644() {
        return this.field1434;
    }
}
