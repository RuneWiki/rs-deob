package deob;

@ObfuscatedName("y")
public final class class11 extends class10 {

    @ObfuscatedName("y.o")
    public final int field255;

    @ObfuscatedName("y.k")
    public final int field263;

    @ObfuscatedName("y.t")
    public final int field257;

    @ObfuscatedName("y.d")
    public final int field258;

    @ObfuscatedName("y.h")
    public final int field259;

    @ObfuscatedName("y.m")
    public final int field265;

    @ObfuscatedName("y.z")
    public final int field261;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field255 = arg0.field1881 + arg1 - arg0.field1884;
        this.field263 = arg0.field1882 + arg2 - arg0.field1885;
        this.field257 = arg0.field1886 + arg3 - arg0.field1907;
        this.field258 = arg0.field1881 + arg1 + arg0.field1884;
        this.field259 = arg0.field1882 + arg2 + arg0.field1885;
        this.field265 = arg0.field1886 + arg3 + arg0.field1907;
        this.field261 = arg4;
    }

    @ObfuscatedName("y.o(I)V")
    public final void method30() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field255 : this.field258;
            int var3 = (var1 & 0x2) == 0 ? this.field263 : this.field259;
            int var4 = (var1 & 0x4) == 0 ? this.field257 : this.field265;
            if ((var1 & 0x1) == 0) {
                Statics.method233(var2, var3, var4, this.field258, var3, var4, this.field261);
            }
            if ((var1 & 0x2) == 0) {
                Statics.method233(var2, var3, var4, var2, this.field259, var4, this.field261);
            }
            if ((var1 & 0x4) == 0) {
                Statics.method233(var2, var3, var4, var2, var3, this.field265, this.field261);
            }
        }
    }
}
