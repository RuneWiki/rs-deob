package deob;

@ObfuscatedName("da")
public class class127 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("da.s")
    public long field1533;

    @ObfuscatedName("da.h")
    public String field1534;

    public class127(class132 arg0) {
        this.this$0 = arg0;
        this.field1533 = -1L;
        this.field1534 = null;
    }

    @ObfuscatedName("da.s(Lqr;I)V")
    public void method2621(class444 arg0) {
        if (arg0.method6929() != 255) {
            arg0.field4708--;
            this.field1533 = arg0.method6935();
        }
        this.field1534 = arg0.method6938();
    }

    @ObfuscatedName("da.h(Leh;B)V")
    public void method2622(class140 arg0) {
        arg0.method2727(this.field1533, this.field1534, 0);
    }
}
