package deob;

import java.awt.Component;

@ObfuscatedName("dm")
public class class112 extends class18 {

    @ObfuscatedName("dm.ai")
    public int field1542;

    public class112(class34 arg0, int arg1) {
        Statics.field1541 = arg0.method423();
        this.field1542 = arg1;
    }

    @ObfuscatedName("dm.g(Ljava/awt/Component;)V")
    public void method218(Component arg0) throws Exception {
        Statics.field1541.method169(arg0, Statics.field823, Statics.field251, (byte) 76);
    }

    @ObfuscatedName("dm.w(I)V")
    public void method211(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1541.method162(this.field1542, arg0, (byte) 12);
    }

    @ObfuscatedName("dm.v()I")
    public int method217() {
        return Statics.field1541.method163(this.field1542, -2014977539);
    }

    @ObfuscatedName("dm.u()V")
    public void method213() {
        Statics.field1541.method164(this.field1542, this.field238, (byte) -81);
    }

    @ObfuscatedName("dm.m()V")
    public void method214() {
        Statics.field1541.method166(this.field1542, 172415392);
    }

    @ObfuscatedName("dm.b()V")
    public void method215() {
        Statics.field1541.method167(this.field1542, 259106950);
    }
}
