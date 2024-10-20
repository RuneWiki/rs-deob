package deob;

@ObfuscatedName("de")
public class class108 extends class104 {

    // $FF: synthetic field
    public final class107 this$0;

    @ObfuscatedName("de.s")
    public int field1322;

    @ObfuscatedName("de.t")
    public byte field1321;

    public class108(class107 arg0) {
        this.this$0 = arg0;
        this.field1322 = -1;
    }

    @ObfuscatedName("de.s(Lnv;B)V")
    public void method2102(class385 arg0) {
        this.field1322 = arg0.method6053();
        this.field1321 = arg0.method5959();
    }

    @ObfuscatedName("de.t(Ldj;I)V")
    public void method2100(class115 arg0) {
        arg0.method2161(this.field1322, this.field1321);
    }
}
