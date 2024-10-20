package deob;

@ObfuscatedName("da")
public class class128 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("da.c")
    public int field1524;

    @ObfuscatedName("da.l")
    public boolean field1521;

    public class128(class130 arg0) {
        this.this$0 = arg0;
        this.field1524 = -1;
    }

    @ObfuscatedName("da.c(Lpi;I)V")
    public void method2583(class421 arg0) {
        this.field1524 = arg0.method6666();
        this.field1521 = arg0.method6686() == 1;
    }

    @ObfuscatedName("da.l(Ley;I)V")
    public void method2576(class138 arg0) {
        arg0.method2672(this.field1524, this.field1521);
    }
}
