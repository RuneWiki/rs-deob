package deob;

@ObfuscatedName("dk")
public class class105 extends class104 {

    // $FF: synthetic field
    public final class107 this$0;

    @ObfuscatedName("dk.s")
    public int field1298;

    @ObfuscatedName("dk.t")
    public boolean field1299;

    public class105(class107 arg0) {
        this.this$0 = arg0;
        this.field1298 = -1;
    }

    @ObfuscatedName("dk.s(Lnv;B)V")
    public void method2102(class385 arg0) {
        this.field1298 = arg0.method6053();
        this.field1299 = arg0.method5958() == 1;
    }

    @ObfuscatedName("dk.t(Ldj;I)V")
    public void method2100(class115 arg0) {
        arg0.method2163(this.field1298, this.field1299);
    }
}
