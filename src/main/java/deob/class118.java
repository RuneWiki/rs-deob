package deob;

@ObfuscatedName("dy")
public class class118 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dy.n")
    public int field1391;

    @ObfuscatedName("dy.c")
    public boolean field1390;

    public class118(class120 arg0) {
        this.this$0 = arg0;
        this.field1391 = -1;
    }

    @ObfuscatedName("dy.n(Lot;I)V")
    public void method2345(class400 arg0) {
        this.field1391 = arg0.method6219();
        this.field1390 = arg0.method6217() == 1;
    }

    @ObfuscatedName("dy.c(Ldi;I)V")
    public void method2348(class128 arg0) {
        arg0.method2420(this.field1391, this.field1390);
    }
}
