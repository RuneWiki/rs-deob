package deob;

@ObfuscatedName("o")
public final class class11 extends class10 {

    @ObfuscatedName("o.s")
    public final int field262;

    @ObfuscatedName("o.c")
    public final int field259;

    @ObfuscatedName("o.f")
    public final int field261;

    @ObfuscatedName("o.m")
    public final int field258;

    @ObfuscatedName("o.h")
    public final int field265;

    @ObfuscatedName("o.t")
    public final int field263;

    @ObfuscatedName("o.p")
    public final int field264;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field262 = arg0.field1962 + arg1 - arg0.field1959;
        this.field259 = arg0.field1956 + arg2 - arg0.field1974;
        this.field261 = arg0.field1976 + arg3 - arg0.field1960;
        this.field258 = arg0.field1962 + arg1 + arg0.field1959;
        this.field265 = arg0.field1956 + arg2 + arg0.field1974;
        this.field263 = arg0.field1976 + arg3 + arg0.field1960;
        this.field264 = arg4;
    }

    @ObfuscatedName("o.s(B)V")
    public final void method37() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field262 : this.field258;
            int var3 = (var1 & 0x2) == 0 ? this.field259 : this.field265;
            int var4 = (var1 & 0x4) == 0 ? this.field261 : this.field263;
            if ((var1 & 0x1) == 0) {
                class10.method2183(var2, var3, var4, this.field258, var3, var4, this.field264);
            }
            if ((var1 & 0x2) == 0) {
                class10.method2183(var2, var3, var4, var2, this.field265, var4, this.field264);
            }
            if ((var1 & 0x4) == 0) {
                class10.method2183(var2, var3, var4, var2, var3, this.field263, this.field264);
            }
        }
    }
}
