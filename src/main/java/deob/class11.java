package deob;

@ObfuscatedName("d")
public final class class11 extends class10 {

    @ObfuscatedName("d.e")
    public final int field259;

    @ObfuscatedName("d.n")
    public final int field261;

    @ObfuscatedName("d.g")
    public final int field255;

    @ObfuscatedName("d.y")
    public final int field256;

    @ObfuscatedName("d.w")
    public final int field263;

    @ObfuscatedName("d.k")
    public final int field258;

    @ObfuscatedName("d.v")
    public final int field253;

    public class11(class135 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field259 = arg0.field1945 + arg1 - arg0.field1940;
        this.field261 = arg0.field1946 + arg2 - arg0.field1949;
        this.field255 = arg0.field1947 + arg3 - arg0.field1943;
        this.field256 = arg0.field1945 + arg1 + arg0.field1940;
        this.field263 = arg0.field1946 + arg2 + arg0.field1949;
        this.field258 = arg0.field1947 + arg3 + arg0.field1943;
        this.field253 = arg4;
    }

    @ObfuscatedName("d.e(B)V")
    public final void method36() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field259 : this.field256;
            int var3 = (var1 & 0x2) == 0 ? this.field261 : this.field263;
            int var4 = (var1 & 0x4) == 0 ? this.field255 : this.field258;
            if ((var1 & 0x1) == 0) {
                class10.method322(var2, var3, var4, this.field256, var3, var4, this.field253);
            }
            if ((var1 & 0x2) == 0) {
                class10.method322(var2, var3, var4, var2, this.field263, var4, this.field253);
            }
            if ((var1 & 0x4) == 0) {
                class10.method322(var2, var3, var4, var2, var3, this.field258, this.field253);
            }
        }
    }
}
