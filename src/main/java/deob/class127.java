package deob;

@ObfuscatedName("du")
public class class127 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("du.c")
    public long field1563;

    @ObfuscatedName("du.v")
    public String field1560;

    public class127(class132 arg0) {
        this.this$0 = arg0;
        this.field1563 = -1L;
        this.field1560 = null;
    }

    @ObfuscatedName("du.c(Lqt;B)V")
    public void method2682(class443 arg0) {
        if (arg0.method7047() != 255) {
            arg0.field4700--;
            this.field1563 = arg0.method7106();
        }
        this.field1560 = arg0.method7056();
    }

    @ObfuscatedName("du.v(Len;I)V")
    public void method2685(class140 arg0) {
        arg0.method2745(this.field1563, this.field1560, 0);
    }
}
