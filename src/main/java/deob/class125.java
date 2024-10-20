package deob;

@ObfuscatedName("dg")
public class class125 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dg.n")
    public int field1434;

    public class125(class134 arg0) {
        this.this$0 = arg0;
        this.field1434 = -1;
    }

    @ObfuscatedName("dg.n(Lot;I)V")
    public void method2371(class400 arg0) {
        this.field1434 = arg0.method6219();
        arg0.method6217();
        if (arg0.method6217() != 255) {
            arg0.field4272--;
            arg0.method6223();
        }
    }

    @ObfuscatedName("dg.c(Leb;B)V")
    public void method2372(class137 arg0) {
        arg0.method2475(this.field1434);
    }
}
