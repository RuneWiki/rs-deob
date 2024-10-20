package deob;

@ObfuscatedName("z")
public final class class11 extends class10 {

    @ObfuscatedName("z.n")
    public final int field246;

    @ObfuscatedName("z.v")
    public final int field245;

    @ObfuscatedName("z.y")
    public final int field252;

    @ObfuscatedName("z.r")
    public final int field247;

    @ObfuscatedName("z.h")
    public final int field251;

    @ObfuscatedName("z.d")
    public final int field249;

    @ObfuscatedName("z.s")
    public final int field250;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field246 = arg0.field1897 + arg1 - arg0.field1864;
        this.field245 = arg0.field1862 + arg2 - arg0.field1865;
        this.field252 = arg0.field1863 + arg3 - arg0.field1886;
        this.field247 = arg0.field1897 + arg1 + arg0.field1864;
        this.field251 = arg0.field1862 + arg2 + arg0.field1865;
        this.field249 = arg0.field1863 + arg3 + arg0.field1886;
        this.field250 = arg4;
    }

    @ObfuscatedName("z.n(I)V")
    public final void method34() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field246 : this.field247;
            int var3 = (var1 & 0x2) == 0 ? this.field245 : this.field251;
            int var4 = (var1 & 0x4) == 0 ? this.field252 : this.field249;
            if ((var1 & 0x1) == 0) {
                class10.method1034(var2, var3, var4, this.field247, var3, var4, this.field250);
            }
            if ((var1 & 0x2) == 0) {
                class10.method1034(var2, var3, var4, var2, this.field251, var4, this.field250);
            }
            if ((var1 & 0x4) == 0) {
                class10.method1034(var2, var3, var4, var2, var3, this.field249, this.field250);
            }
        }
    }
}
