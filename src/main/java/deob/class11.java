package deob;

@ObfuscatedName("e")
public final class class11 extends class10 {

    @ObfuscatedName("e.n")
    public final int field261;

    @ObfuscatedName("e.p")
    public final int field260;

    @ObfuscatedName("e.i")
    public final int field257;

    @ObfuscatedName("e.j")
    public final int field258;

    @ObfuscatedName("e.f")
    public final int field259;

    @ObfuscatedName("e.m")
    public final int field263;

    @ObfuscatedName("e.c")
    public final int field256;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field261 = arg0.field1993 + arg1 - arg0.field1967;
        this.field260 = arg0.field1933 + arg2 - arg0.field1968;
        this.field257 = arg0.field1934 + arg3 - arg0.field1954;
        this.field258 = arg0.field1993 + arg1 + arg0.field1967;
        this.field259 = arg0.field1933 + arg2 + arg0.field1968;
        this.field263 = arg0.field1934 + arg3 + arg0.field1954;
        this.field256 = arg4;
    }

    @ObfuscatedName("e.n(I)V")
    public final void method48() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field261 : this.field258;
            int var3 = (var1 & 0x2) == 0 ? this.field260 : this.field259;
            int var4 = (var1 & 0x4) == 0 ? this.field257 : this.field263;
            if ((var1 & 0x1) == 0) {
                class10.method997(var2, var3, var4, this.field258, var3, var4, this.field256);
            }
            if ((var1 & 0x2) == 0) {
                class10.method997(var2, var3, var4, var2, this.field259, var4, this.field256);
            }
            if ((var1 & 0x4) == 0) {
                class10.method997(var2, var3, var4, var2, var3, this.field263, this.field256);
            }
        }
    }
}
