package deob;

@ObfuscatedName("l")
public final class class11 extends class10 {

    @ObfuscatedName("l.d")
    public final int field250;

    @ObfuscatedName("l.x")
    public final int field244;

    @ObfuscatedName("l.k")
    public final int field245;

    @ObfuscatedName("l.z")
    public final int field246;

    @ObfuscatedName("l.v")
    public final int field247;

    @ObfuscatedName("l.m")
    public final int field248;

    @ObfuscatedName("l.b")
    public final int field252;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field250 = arg0.field1832 + arg1 - arg0.field1865;
        this.field244 = arg0.field1839 + arg2 - arg0.field1866;
        this.field245 = arg0.field1894 + arg3 - arg0.field1867;
        this.field246 = arg0.field1832 + arg1 + arg0.field1865;
        this.field247 = arg0.field1839 + arg2 + arg0.field1866;
        this.field248 = arg0.field1894 + arg3 + arg0.field1867;
        this.field252 = arg4;
    }

    @ObfuscatedName("l.d(B)V")
    public final void method44() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field250 : this.field246;
            int var3 = (var1 & 0x2) == 0 ? this.field244 : this.field247;
            int var4 = (var1 & 0x4) == 0 ? this.field245 : this.field248;
            if ((var1 & 0x1) == 0) {
                class10.method51(var2, var3, var4, this.field246, var3, var4, this.field252);
            }
            if ((var1 & 0x2) == 0) {
                class10.method51(var2, var3, var4, var2, this.field247, var4, this.field252);
            }
            if ((var1 & 0x4) == 0) {
                class10.method51(var2, var3, var4, var2, var3, this.field248, this.field252);
            }
        }
    }
}
