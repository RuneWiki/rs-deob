package deob;

@ObfuscatedName("di")
public class class128 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("di.c")
    public int field1504;

    @ObfuscatedName("di.b")
    public boolean field1500;

    public class128(class130 arg0) {
        this.this$0 = arg0;
        this.field1504 = -1;
    }

    @ObfuscatedName("di.c(Lpi;I)V")
    public void method2590(class419 arg0) {
        this.field1504 = arg0.method6672();
        this.field1500 = arg0.method6781() == 1;
    }

    @ObfuscatedName("di.b(Lej;I)V")
    public void method2591(class138 arg0) {
        arg0.method2648(this.field1504, this.field1500);
    }
}
