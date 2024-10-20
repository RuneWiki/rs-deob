package deob;

@ObfuscatedName("dq")
public class class127 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("dq.o")
    public long field1568;

    @ObfuscatedName("dq.q")
    public String field1567;

    public class127(class132 arg0) {
        this.this$0 = arg0;
        this.field1568 = -1L;
        this.field1567 = null;
    }

    @ObfuscatedName("dq.o(Lpx;I)V")
    public void method2639(class440 arg0) {
        if (arg0.method7071() != 255) {
            arg0.field4678--;
            this.field1568 = arg0.method7014();
        }
        this.field1567 = arg0.method6902();
    }

    @ObfuscatedName("dq.q(Lek;B)V")
    public void method2636(class140 arg0) {
        arg0.method2689(this.field1568, this.field1567, 0);
    }
}
