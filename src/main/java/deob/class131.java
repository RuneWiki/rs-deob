package deob;

@ObfuscatedName("eu")
public class class131 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("eu.c")
    public int field1525;

    @ObfuscatedName("eu.b")
    public byte field1523;

    public class131(class130 arg0) {
        this.this$0 = arg0;
        this.field1525 = -1;
    }

    @ObfuscatedName("eu.c(Lpi;I)V")
    public void method2590(class419 arg0) {
        this.field1525 = arg0.method6672();
        this.field1523 = arg0.method6846();
    }

    @ObfuscatedName("eu.b(Lej;I)V")
    public void method2591(class138 arg0) {
        arg0.method2678(this.field1525, this.field1523);
    }
}
