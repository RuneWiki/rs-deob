package deob;

@ObfuscatedName("dv")
public class class130 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dv.i")
    public int field1481;

    @ObfuscatedName("dv.w")
    public byte field1478;

    @ObfuscatedName("dv.s")
    public int field1476;

    @ObfuscatedName("dv.a")
    public String field1477;

    public class130(class134 arg0) {
        this.this$0 = arg0;
        this.field1481 = -1;
    }

    @ObfuscatedName("dv.i(Lop;I)V")
    public void method2411(class401 arg0) {
        arg0.method6240();
        this.field1481 = arg0.method6242();
        this.field1478 = arg0.method6241();
        this.field1476 = arg0.method6242();
        arg0.method6249();
        this.field1477 = arg0.method6335();
        arg0.method6240();
    }

    @ObfuscatedName("dv.w(Lea;I)V")
    public void method2419(class137 arg0) {
        class119 var2 = (class119) arg0.field1518.get(this.field1481);
        var2.field1388 = this.field1478;
        var2.field1385 = this.field1476;
        var2.field1384 = new class422(this.field1477);
    }
}
