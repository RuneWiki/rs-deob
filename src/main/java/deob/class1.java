package deob;

@ObfuscatedName("f")
public class class1 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("f.f")
    public int field1;

    @ObfuscatedName("f.o")
    public long field3;

    public class1(class3 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("f.f(Lnu;I)V")
    public void method2(class382 arg0) {
        this.field1 = arg0.method5861();
        this.field3 = arg0.method6069();
    }

    @ObfuscatedName("f.o(Lm;I)V")
    public void method10(class12 arg0) {
        arg0.method103(this.field1, this.field3);
    }
}
