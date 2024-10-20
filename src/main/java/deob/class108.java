package deob;

@ObfuscatedName("eo")
public final class class108 extends class286 {

    @ObfuscatedName("eo.aq")
    public int field1388;

    @ObfuscatedName("eo.ad")
    public int field1392;

    @ObfuscatedName("eo.ag")
    public int field1390;

    @ObfuscatedName("eo.ak")
    public int field1391;

    @ObfuscatedName("eo.ap")
    public int field1389;

    @ObfuscatedName("eo.an")
    public boolean field1393;

    @ObfuscatedName("eo.av")
    public int field1395 = 31;

    @ObfuscatedName("eo.aq(II)V")
    public void method2653(int arg0) {
        this.field1395 = arg0;
    }

    @ObfuscatedName("eo.ad(IB)Z")
    public boolean method2656(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1395 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.ah(I)Llv;")
    public final class294 method2050() {
        return class208.method3193(this.field1388).method3694(this.field1392);
    }
}
