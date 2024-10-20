package deob;

@ObfuscatedName("ej")
public final class class106 extends class278 {

    @ObfuscatedName("ej.aq")
    public int field1367;

    @ObfuscatedName("ej.aw")
    public int field1370;

    @ObfuscatedName("ej.ai")
    public int field1369 = 31;

    @ObfuscatedName("ej.aq(II)V")
    public void method2630(int arg0) {
        this.field1369 = arg0;
    }

    @ObfuscatedName("ej.al(IB)Z")
    public boolean method2631(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1369 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.aw(I)Lkz;")
    public final class285 method2016() {
        return class205.method6353(this.field1367).method3653(this.field1370);
    }
}
