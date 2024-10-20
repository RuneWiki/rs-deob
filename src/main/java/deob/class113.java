package deob;

import java.awt.Component;

@ObfuscatedName("dy")
public class class113 extends class18 {

    @ObfuscatedName("dy.af")
    public int field1557;

    public class113(class35 arg0, int arg1) {
        Statics.field1556 = arg0.method423();
        this.field1557 = arg1;
    }

    @ObfuscatedName("dy.v(Ljava/awt/Component;)V")
    public void method194(Component arg0) throws Exception {
        Statics.field1556.method156(arg0, Statics.field354, Statics.field243, (byte) -6);
    }

    @ObfuscatedName("dy.f(I)V")
    public void method195(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1556.method152(this.field1557, arg0, -840800567);
    }

    @ObfuscatedName("dy.s()I")
    public int method196() {
        return Statics.field1556.method151(this.field1557, (byte) 62);
    }

    @ObfuscatedName("dy.j()V")
    public void method197() {
        Statics.field1556.method154(this.field1557, this.field260, -626869164);
    }

    @ObfuscatedName("dy.e()V")
    public void method217() {
        Statics.field1556.method155(this.field1557, -26960946);
    }

    @ObfuscatedName("dy.t()V")
    public void method199() {
        Statics.field1556.method166(this.field1557, 1699605072);
    }
}
