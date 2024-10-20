package deob;

@ObfuscatedName("dl")
public class class125 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("dl.c")
    public long field1486;

    @ObfuscatedName("dl.b")
    public String field1485;

    public class125(class130 arg0) {
        this.this$0 = arg0;
        this.field1486 = -1L;
        this.field1485 = null;
    }

    @ObfuscatedName("dl.c(Lpi;I)V")
    public void method2590(class419 arg0) {
        if (arg0.method6781() != 255) {
            arg0.field4475--;
            this.field1486 = arg0.method6676();
        }
        this.field1485 = arg0.method6679();
    }

    @ObfuscatedName("dl.b(Lej;I)V")
    public void method2591(class138 arg0) {
        arg0.method2641(this.field1486, this.field1485, 0);
    }
}
