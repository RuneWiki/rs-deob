package deob;

@ObfuscatedName("k")
public final class class11 extends class10 {

    @ObfuscatedName("k.i")
    public final int field261;

    @ObfuscatedName("k.h")
    public final int field256;

    @ObfuscatedName("k.u")
    public final int field255;

    @ObfuscatedName("k.q")
    public final int field257;

    @ObfuscatedName("k.g")
    public final int field258;

    @ObfuscatedName("k.v")
    public final int field259;

    @ObfuscatedName("k.t")
    public final int field260;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field261 = arg0.field1920 + arg1 - arg0.field1964;
        this.field256 = arg0.field1942 + arg2 - arg0.field1957;
        this.field255 = arg0.field1943 + arg3 - arg0.field1946;
        this.field257 = arg0.field1920 + arg1 + arg0.field1964;
        this.field258 = arg0.field1942 + arg2 + arg0.field1957;
        this.field259 = arg0.field1943 + arg3 + arg0.field1946;
        this.field260 = arg4;
    }

    @ObfuscatedName("k.i(I)V")
    public final void method32() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field261 : this.field257;
            int var3 = (var1 & 0x2) == 0 ? this.field256 : this.field258;
            int var4 = (var1 & 0x4) == 0 ? this.field255 : this.field259;
            if ((var1 & 0x1) == 0) {
                class10.method3174(var2, var3, var4, this.field257, var3, var4, this.field260);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3174(var2, var3, var4, var2, this.field258, var4, this.field260);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3174(var2, var3, var4, var2, var3, this.field259, this.field260);
            }
        }
    }
}
