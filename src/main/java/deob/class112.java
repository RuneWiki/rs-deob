package deob;

import java.io.IOException;

@ObfuscatedName("eb")
public class class112 {

    @ObfuscatedName("eb.aw")
    public class440 field1419;

    @ObfuscatedName("eb.ay")
    public class381 field1411 = new class381();

    @ObfuscatedName("eb.ar")
    public int field1421 = 0;

    @ObfuscatedName("eb.am")
    public class514 field1413 = new class514(5000);

    @ObfuscatedName("eb.as")
    public class531 field1414;

    @ObfuscatedName("eb.aj")
    public class513 field1412 = new class513(40000);

    @ObfuscatedName("eb.ag")
    public class299 field1416 = null;

    @ObfuscatedName("eb.az")
    public int field1410 = 0;

    @ObfuscatedName("eb.av")
    public boolean field1418 = true;

    @ObfuscatedName("eb.ap")
    public int field1424 = 0;

    @ObfuscatedName("eb.aq")
    public int field1420 = 0;

    @ObfuscatedName("eb.at")
    public class299 field1417;

    @ObfuscatedName("eb.ah")
    public class299 field1422;

    @ObfuscatedName("eb.ax")
    public class299 field1423;

    @ObfuscatedName("eb.aw(I)V")
    public final void method2651() {
        this.field1411.method6475();
        this.field1421 = 0;
    }

    @ObfuscatedName("eb.ay(B)V")
    public final void method2652() throws IOException {
        if (this.field1419 == null || this.field1421 <= 0) {
            return;
        }
        this.field1413.field5072 = 0;
        while (true) {
            class298 var1 = (class298) this.field1411.method6419();
            if (var1 == null || var1.field3207 > this.field1413.field5070.length - this.field1413.field5072) {
                this.field1419.method7347(this.field1413.field5070, 0, this.field1413.field5072);
                this.field1420 = 0;
                break;
            }
            this.field1413.method8237(var1.field3205.field5070, 0, var1.field3207);
            this.field1421 -= var1.field3207;
            var1.method7662();
            var1.field3205.method8226();
            var1.method5168();
        }
    }

    @ObfuscatedName("eb.ar(Llv;I)V")
    public final void method2669(class298 arg0) {
        this.field1411.method6446(arg0);
        arg0.field3207 = arg0.field3205.field5072;
        arg0.field3205.field5072 = 0;
        this.field1421 += arg0.field3207;
    }

    @ObfuscatedName("eb.am(Lqh;I)V")
    public void method2654(class440 arg0) {
        this.field1419 = arg0;
    }

    @ObfuscatedName("eb.as(I)V")
    public void method2667() {
        if (this.field1419 != null) {
            this.field1419.method7348();
            this.field1419 = null;
        }
    }

    @ObfuscatedName("eb.aj(I)V")
    public void method2671() {
        this.field1419 = null;
    }

    @ObfuscatedName("eb.ag(B)Lqh;")
    public class440 method2658() {
        return this.field1419;
    }
}
