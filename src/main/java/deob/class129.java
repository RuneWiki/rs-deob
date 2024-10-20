package deob;

@ObfuscatedName("dk")
public class class129 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dk.i")
    public String field1470;

    @ObfuscatedName("dk.w")
    public int field1468;

    @ObfuscatedName("dk.s")
    public byte field1469;

    public class129(class134 arg0) {
        this.this$0 = arg0;
        this.field1470 = null;
    }

    @ObfuscatedName("dk.i(Lop;I)V")
    public void method2411(class401 arg0) {
        if (arg0.method6240() != 255) {
            arg0.field4300--;
            arg0.method6249();
        }
        this.field1470 = arg0.method6369();
        this.field1468 = arg0.method6242();
        this.field1469 = arg0.method6241();
        arg0.method6249();
    }

    @ObfuscatedName("dk.w(Lea;I)V")
    public void method2419(class137 arg0) {
        class119 var2 = new class119();
        var2.field1384 = new class422(this.field1470);
        var2.field1385 = this.field1468;
        var2.field1388 = this.field1469;
        arg0.method2532(var2);
    }
}
