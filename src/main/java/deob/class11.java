package deob;

@ObfuscatedName("x")
public final class class11 extends class10 {

    @ObfuscatedName("x.a")
    public final int field255;

    @ObfuscatedName("x.w")
    public final int field244;

    @ObfuscatedName("x.e")
    public final int field245;

    @ObfuscatedName("x.k")
    public final int field243;

    @ObfuscatedName("x.u")
    public final int field247;

    @ObfuscatedName("x.z")
    public final int field248;

    @ObfuscatedName("x.t")
    public final int field249;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field255 = arg0.field1843 + arg1 - arg0.field1846;
        this.field244 = arg0.field1844 + arg2 - arg0.field1825;
        this.field245 = arg0.field1845 + arg3 - arg0.field1848;
        this.field243 = arg0.field1843 + arg1 + arg0.field1846;
        this.field247 = arg0.field1844 + arg2 + arg0.field1825;
        this.field248 = arg0.field1845 + arg3 + arg0.field1848;
        this.field249 = arg4;
    }

    @ObfuscatedName("x.a(I)V")
    public final void method32() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field255 : this.field243;
            int var3 = (var1 & 0x2) == 0 ? this.field244 : this.field247;
            int var4 = (var1 & 0x4) == 0 ? this.field245 : this.field248;
            if ((var1 & 0x1) == 0) {
                class10.method1524(var2, var3, var4, this.field243, var3, var4, this.field249);
            }
            if ((var1 & 0x2) == 0) {
                class10.method1524(var2, var3, var4, var2, this.field247, var4, this.field249);
            }
            if ((var1 & 0x4) == 0) {
                class10.method1524(var2, var3, var4, var2, var3, this.field248, this.field249);
            }
        }
    }
}
