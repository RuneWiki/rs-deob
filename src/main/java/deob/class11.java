package deob;

@ObfuscatedName("m")
public final class class11 extends class10 {

    @ObfuscatedName("m.d")
    public final int field262;

    @ObfuscatedName("m.z")
    public final int field255;

    @ObfuscatedName("m.n")
    public final int field260;

    @ObfuscatedName("m.r")
    public final int field257;

    @ObfuscatedName("m.e")
    public final int field258;

    @ObfuscatedName("m.y")
    public final int field256;

    @ObfuscatedName("m.k")
    public final int field254;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field262 = arg0.field1866 + arg1 - arg0.field1869;
        this.field255 = arg0.field1867 + arg2 - arg0.field1870;
        this.field260 = arg0.field1868 + arg3 - arg0.field1861;
        this.field257 = arg0.field1866 + arg1 + arg0.field1869;
        this.field258 = arg0.field1867 + arg2 + arg0.field1870;
        this.field256 = arg0.field1868 + arg3 + arg0.field1861;
        this.field254 = arg4;
    }

    @ObfuscatedName("m.d(B)V")
    public final void method41() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field262 : this.field257;
            int var3 = (var1 & 0x2) == 0 ? this.field255 : this.field258;
            int var4 = (var1 & 0x4) == 0 ? this.field260 : this.field256;
            if ((var1 & 0x1) == 0) {
                class10.method335(var2, var3, var4, this.field257, var3, var4, this.field254);
            }
            if ((var1 & 0x2) == 0) {
                class10.method335(var2, var3, var4, var2, this.field258, var4, this.field254);
            }
            if ((var1 & 0x4) == 0) {
                class10.method335(var2, var3, var4, var2, var3, this.field256, this.field254);
            }
        }
    }
}
