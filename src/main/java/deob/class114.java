package deob;

import java.io.IOException;

@ObfuscatedName("ez")
public class class114 {

    @ObfuscatedName("ez.ac")
    public class454 field1422;

    @ObfuscatedName("ez.al")
    public class395 field1429 = new class395();

    @ObfuscatedName("ez.ak")
    public int field1423 = 0;

    @ObfuscatedName("ez.ax")
    public class530 field1424 = new class530(5000);

    @ObfuscatedName("ez.ao")
    public class547 field1425;

    @ObfuscatedName("ez.ah")
    public class529 field1426 = new class529(40000);

    @ObfuscatedName("ez.ar")
    public class312 field1427 = null;

    @ObfuscatedName("ez.ab")
    public int field1428 = 0;

    @ObfuscatedName("ez.am")
    public boolean field1433 = true;

    @ObfuscatedName("ez.av")
    public int field1430 = 0;

    @ObfuscatedName("ez.ag")
    public int field1431 = 0;

    @ObfuscatedName("ez.aa")
    public class312 field1432;

    @ObfuscatedName("ez.ap")
    public class312 field1421;

    @ObfuscatedName("ez.ay")
    public class312 field1434;

    @ObfuscatedName("ez.ac(I)V")
    public final void method2692() {
        this.field1429.method6584();
        this.field1423 = 0;
    }

    @ObfuscatedName("ez.al(I)V")
    public final void method2674() throws IOException {
        if (this.field1422 == null || this.field1423 <= 0) {
            return;
        }
        this.field1424.field5140 = 0;
        while (true) {
            class311 var1 = (class311) this.field1429.method6577();
            if (var1 == null || var1.field3256 > this.field1424.field5139.length - this.field1424.field5140) {
                this.field1422.method7435(this.field1424.field5139, 0, this.field1424.field5140);
                this.field1431 = 0;
                break;
            }
            this.field1424.method8412(var1.field3250.field5139, 0, var1.field3256);
            this.field1423 -= var1.field3256;
            var1.method7776();
            var1.field3250.method8347();
            var1.method5315();
        }
    }

    @ObfuscatedName("ez.ak(Llx;B)V")
    public final void method2682(class311 arg0) {
        this.field1429.method6593(arg0);
        arg0.field3256 = arg0.field3250.field5140;
        arg0.field3250.field5140 = 0;
        this.field1423 += arg0.field3256;
    }

    @ObfuscatedName("ez.ax(Lre;I)V")
    public void method2676(class454 arg0) {
        this.field1422 = arg0;
    }

    @ObfuscatedName("ez.ao(I)V")
    public void method2677() {
        if (this.field1422 != null) {
            this.field1422.method7441();
            this.field1422 = null;
        }
    }

    @ObfuscatedName("ez.ah(I)V")
    public void method2673() {
        this.field1422 = null;
    }

    @ObfuscatedName("ez.ar(I)Lre;")
    public class454 method2679() {
        return this.field1422;
    }
}
