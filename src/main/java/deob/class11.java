package deob;

@ObfuscatedName("o")
public final class class11 extends class10 {

    @ObfuscatedName("o.j")
    public final int field257;

    @ObfuscatedName("o.h")
    public final int field254;

    @ObfuscatedName("o.f")
    public final int field255;

    @ObfuscatedName("o.p")
    public final int field256;

    @ObfuscatedName("o.x")
    public final int field258;

    @ObfuscatedName("o.g")
    public final int field260;

    @ObfuscatedName("o.c")
    public final int field259;

    public class11(class135 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field257 = arg0.field1970 + arg1 - arg0.field1943;
        this.field254 = arg0.field1960 + arg2 - arg0.field1963;
        this.field255 = arg0.field1988 + arg3 - arg0.field1984;
        this.field256 = arg0.field1970 + arg1 + arg0.field1943;
        this.field258 = arg0.field1960 + arg2 + arg0.field1963;
        this.field260 = arg0.field1988 + arg3 + arg0.field1984;
        this.field259 = arg4;
    }

    @ObfuscatedName("o.j(I)V")
    public final void method30() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field257 : this.field256;
            int var3 = (var1 & 0x2) == 0 ? this.field254 : this.field258;
            int var4 = (var1 & 0x4) == 0 ? this.field255 : this.field260;
            if ((var1 & 0x1) == 0) {
                class10.method153(var2, var3, var4, this.field256, var3, var4, this.field259);
            }
            if ((var1 & 0x2) == 0) {
                class10.method153(var2, var3, var4, var2, this.field258, var4, this.field259);
            }
            if ((var1 & 0x4) == 0) {
                class10.method153(var2, var3, var4, var2, var3, this.field260, this.field259);
            }
        }
    }
}
