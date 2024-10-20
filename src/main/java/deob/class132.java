package deob;

@ObfuscatedName("ep")
public class class132 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("ep.n")
    public long field1495;

    @ObfuscatedName("ep.c")
    public String field1496;

    @ObfuscatedName("ep.m")
    public int field1494;

    public class132(class120 arg0) {
        this.this$0 = arg0;
        this.field1495 = -1L;
        this.field1496 = null;
        this.field1494 = 0;
    }

    @ObfuscatedName("ep.n(Lot;I)V")
    public void method2345(class400 arg0) {
        if (arg0.method6217() != 255) {
            arg0.field4272--;
            this.field1495 = arg0.method6223();
        }
        this.field1496 = arg0.method6198();
        this.field1494 = arg0.method6219();
    }

    @ObfuscatedName("ep.c(Ldi;I)V")
    public void method2348(class128 arg0) {
        arg0.method2389(this.field1495, this.field1496, this.field1494);
    }
}
