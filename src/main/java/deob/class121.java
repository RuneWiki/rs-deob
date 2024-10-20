package deob;

@ObfuscatedName("dm")
public class class121 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dm.n")
    public int field1410;

    @ObfuscatedName("dm.c")
    public byte field1409;

    public class121(class120 arg0) {
        this.this$0 = arg0;
        this.field1410 = -1;
    }

    @ObfuscatedName("dm.n(Lot;I)V")
    public void method2345(class400 arg0) {
        this.field1410 = arg0.method6219();
        this.field1409 = arg0.method6218();
    }

    @ObfuscatedName("dm.c(Ldi;I)V")
    public void method2348(class128 arg0) {
        arg0.method2411(this.field1410, this.field1409);
    }
}
