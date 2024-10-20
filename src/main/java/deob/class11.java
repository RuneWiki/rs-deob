package deob;

@ObfuscatedName("i")
public final class class11 extends class10 {

    @ObfuscatedName("i.g")
    public final int field264;

    @ObfuscatedName("i.e")
    public final int field255;

    @ObfuscatedName("i.b")
    public final int field256;

    @ObfuscatedName("i.z")
    public final int field257;

    @ObfuscatedName("i.n")
    public final int field258;

    @ObfuscatedName("i.l")
    public final int field265;

    @ObfuscatedName("i.s")
    public final int field259;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field264 = arg0.field1854 + arg1 - arg0.field1857;
        this.field255 = arg0.field1831 + arg2 - arg0.field1858;
        this.field256 = arg0.field1856 + arg3 - arg0.field1885;
        this.field257 = arg0.field1854 + arg1 + arg0.field1857;
        this.field258 = arg0.field1831 + arg2 + arg0.field1858;
        this.field265 = arg0.field1856 + arg3 + arg0.field1885;
        this.field259 = arg4;
    }

    @ObfuscatedName("i.g(I)V")
    public final void method35() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field264 : this.field257;
            int var3 = (var1 & 0x2) == 0 ? this.field255 : this.field258;
            int var4 = (var1 & 0x4) == 0 ? this.field256 : this.field265;
            if ((var1 & 0x1) == 0) {
                class10.method3032(var2, var3, var4, this.field257, var3, var4, this.field259);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3032(var2, var3, var4, var2, this.field258, var4, this.field259);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3032(var2, var3, var4, var2, var3, this.field265, this.field259);
            }
        }
    }
}
