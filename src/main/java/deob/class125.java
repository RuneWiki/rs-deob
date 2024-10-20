package deob;

@ObfuscatedName("dx")
public class class125 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dx.i")
    public int field1427;

    public class125(class134 arg0) {
        this.this$0 = arg0;
        this.field1427 = -1;
    }

    @ObfuscatedName("dx.i(Lop;I)V")
    public void method2411(class401 arg0) {
        this.field1427 = arg0.method6242();
        arg0.method6240();
        if (arg0.method6240() != 255) {
            arg0.field4300--;
            arg0.method6249();
        }
    }

    @ObfuscatedName("dx.w(Lea;I)V")
    public void method2419(class137 arg0) {
        arg0.method2549(this.field1427);
    }
}
