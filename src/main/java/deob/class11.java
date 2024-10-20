package deob;

@ObfuscatedName("o")
public final class class11 extends class10 {

    @ObfuscatedName("o.p")
    public final int field267;

    @ObfuscatedName("o.m")
    public final int field258;

    @ObfuscatedName("o.e")
    public final int field259;

    @ObfuscatedName("o.t")
    public final int field257;

    @ObfuscatedName("o.w")
    public final int field263;

    @ObfuscatedName("o.z")
    public final int field262;

    @ObfuscatedName("o.j")
    public final int field260;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field267 = arg0.field1956 + arg1 - arg0.field1959;
        this.field258 = arg0.field1957 + arg2 - arg0.field1960;
        this.field259 = arg0.field1958 + arg3 - arg0.field1929;
        this.field257 = arg0.field1956 + arg1 + arg0.field1959;
        this.field263 = arg0.field1957 + arg2 + arg0.field1960;
        this.field262 = arg0.field1958 + arg3 + arg0.field1929;
        this.field260 = arg4;
    }

    @ObfuscatedName("o.p(B)V")
    public final void method38() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field267 : this.field257;
            int var3 = (var1 & 0x2) == 0 ? this.field258 : this.field263;
            int var4 = (var1 & 0x4) == 0 ? this.field259 : this.field262;
            if ((var1 & 0x1) == 0) {
                class10.method1815(var2, var3, var4, this.field257, var3, var4, this.field260);
            }
            if ((var1 & 0x2) == 0) {
                class10.method1815(var2, var3, var4, var2, this.field263, var4, this.field260);
            }
            if ((var1 & 0x4) == 0) {
                class10.method1815(var2, var3, var4, var2, var3, this.field262, this.field260);
            }
        }
    }
}
