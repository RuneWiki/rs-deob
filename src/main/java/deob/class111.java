package deob;

import java.io.IOException;

@ObfuscatedName("em")
public class class111 {

    @ObfuscatedName("em.at")
    public class427 field1382;

    @ObfuscatedName("em.an")
    public class378 field1381 = new class378();

    @ObfuscatedName("em.av")
    public int field1390 = 0;

    @ObfuscatedName("em.as")
    public class501 field1383 = new class501(5000);

    @ObfuscatedName("em.ax")
    public class518 field1380;

    @ObfuscatedName("em.ap")
    public class500 field1392 = new class500(40000);

    @ObfuscatedName("em.ab")
    public class297 field1386 = null;

    @ObfuscatedName("em.ak")
    public int field1387 = 0;

    @ObfuscatedName("em.ae")
    public boolean field1388 = true;

    @ObfuscatedName("em.af")
    public int field1389 = 0;

    @ObfuscatedName("em.ao")
    public int field1385 = 0;

    @ObfuscatedName("em.aa")
    public class297 field1391;

    @ObfuscatedName("em.aj")
    public class297 field1394;

    @ObfuscatedName("em.ad")
    public class297 field1393;

    @ObfuscatedName("em.at(I)V")
    public final void method2634() {
        this.field1381.method6405();
        this.field1390 = 0;
    }

    @ObfuscatedName("em.an(I)V")
    public final void method2633() throws IOException {
        if (this.field1382 == null || this.field1390 <= 0) {
            return;
        }
        this.field1383.field5017 = 0;
        while (true) {
            class296 var1 = (class296) this.field1381.method6360();
            if (var1 == null || var1.field3214 > this.field1383.field5016.length - this.field1383.field5017) {
                this.field1382.method7262(this.field1383.field5016, 0, this.field1383.field5017);
                this.field1385 = 0;
                break;
            }
            this.field1383.method8122(var1.field3211.field5016, 0, var1.field3214);
            this.field1390 -= var1.field3214;
            var1.method7560();
            var1.field3211.method8251();
            var1.method5136();
        }
    }

    @ObfuscatedName("em.av(Llm;I)V")
    public final void method2642(class296 arg0) {
        this.field1381.method6357(arg0);
        arg0.field3214 = arg0.field3211.field5017;
        arg0.field3211.field5017 = 0;
        this.field1390 += arg0.field3214;
    }

    @ObfuscatedName("em.as(Lqz;I)V")
    public void method2636(class427 arg0) {
        this.field1382 = arg0;
    }

    @ObfuscatedName("em.ax(I)V")
    public void method2637() {
        if (this.field1382 != null) {
            this.field1382.method7263();
            this.field1382 = null;
        }
    }

    @ObfuscatedName("em.ap(I)V")
    public void method2647() {
        this.field1382 = null;
    }

    @ObfuscatedName("em.ab(B)Lqz;")
    public class427 method2639() {
        return this.field1382;
    }
}
