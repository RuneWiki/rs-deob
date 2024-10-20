package deob;

@ObfuscatedName("el")
public final class class107 extends class247 {

    @ObfuscatedName("el.ac")
    public int field1356;

    @ObfuscatedName("el.al")
    public int field1359;

    @ObfuscatedName("el.ax")
    public int field1357 = 31;

    @ObfuscatedName("el.ac(IB)V")
    public void method2597(int arg0) {
        this.field1357 = arg0;
    }

    @ObfuscatedName("el.ak(IB)Z")
    public boolean method2598(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1357 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.al(B)Ljn;")
    public final class254 method2007() {
        return class221.method3594(this.field1356).method3770(this.field1359);
    }
}
