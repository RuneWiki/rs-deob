package deob;

@ObfuscatedName("de")
public class class130 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("de.c")
    public int field1576;

    @ObfuscatedName("de.v")
    public boolean field1575;

    public class130(class132 arg0) {
        this.this$0 = arg0;
        this.field1576 = -1;
    }

    @ObfuscatedName("de.c(Lqt;B)V")
    public void method2682(class443 arg0) {
        this.field1576 = arg0.method7049();
        this.field1575 = arg0.method7047() == 1;
    }

    @ObfuscatedName("de.v(Len;I)V")
    public void method2685(class140 arg0) {
        arg0.method2752(this.field1576, this.field1575);
    }
}
