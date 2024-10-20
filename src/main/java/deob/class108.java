package deob;

@ObfuscatedName("ed")
public final class class108 extends class189 {

    @ObfuscatedName("ed.ab")
    public int field1384;

    @ObfuscatedName("ed.ay")
    public int field1381;

    @ObfuscatedName("ed.an")
    public int field1376;

    @ObfuscatedName("ed.au")
    public int field1379;

    @ObfuscatedName("ed.ax")
    public int field1378;

    @ObfuscatedName("ed.ao")
    public boolean field1377;

    @ObfuscatedName("ed.ac")
    public int field1374 = 31;

    @ObfuscatedName("ed.ab(II)V")
    public void method2720(int arg0) {
        this.field1374 = arg0;
    }

    @ObfuscatedName("ed.ay(II)Z")
    public boolean method2719(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1374 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ed.ae(I)Lhr;")
    public final class197 method2088() {
        return class262.method2385(this.field1384).method4771(this.field1381);
    }
}
