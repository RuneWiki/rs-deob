package deob;

@ObfuscatedName("do")
public class class110 extends class120 {

    // $FF: synthetic field
    public final class121 this$0;

    @ObfuscatedName("do.s")
    public int field1335;

    @ObfuscatedName("do.t")
    public byte field1334;

    @ObfuscatedName("do.v")
    public int field1336;

    @ObfuscatedName("do.j")
    public String field1333;

    public class110(class121 arg0) {
        this.this$0 = arg0;
        this.field1335 = -1;
    }

    @ObfuscatedName("do.s(Lnv;I)V")
    public void method2140(class385 arg0) {
        this.field1335 = arg0.method6053();
        this.field1334 = arg0.method5959();
        this.field1336 = arg0.method6053();
        arg0.method5964();
        this.field1333 = arg0.method5967();
    }

    @ObfuscatedName("do.t(Ldt;B)V")
    public void method2135(class124 arg0) {
        class106 var2 = (class106) arg0.field1436.get(this.field1335);
        var2.field1306 = this.field1334;
        var2.field1302 = this.field1336;
        var2.field1303 = new class406(this.field1333);
    }
}
