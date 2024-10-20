package deob;

@ObfuscatedName("dr")
public class class123 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dr.i")
    public int field1420;

    @ObfuscatedName("dr.w")
    public byte field1416;

    @ObfuscatedName("dr.s")
    public int field1418;

    @ObfuscatedName("dr.a")
    public String field1415;

    public class123(class134 arg0) {
        this.this$0 = arg0;
        this.field1420 = -1;
    }

    @ObfuscatedName("dr.i(Lop;I)V")
    public void method2411(class401 arg0) {
        this.field1420 = arg0.method6242();
        this.field1416 = arg0.method6241();
        this.field1418 = arg0.method6242();
        arg0.method6249();
        this.field1415 = arg0.method6335();
    }

    @ObfuscatedName("dr.w(Lea;I)V")
    public void method2419(class137 arg0) {
        class119 var2 = (class119) arg0.field1518.get(this.field1420);
        var2.field1388 = this.field1416;
        var2.field1385 = this.field1418;
        var2.field1384 = new class422(this.field1415);
    }
}
