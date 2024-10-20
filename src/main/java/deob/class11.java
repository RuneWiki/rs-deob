package deob;

@ObfuscatedName("a")
public final class class11 extends class10 {

    @ObfuscatedName("a.i")
    public final int field256;

    @ObfuscatedName("a.c")
    public final int field253;

    @ObfuscatedName("a.e")
    public final int field257;

    @ObfuscatedName("a.v")
    public final int field255;

    @ObfuscatedName("a.b")
    public final int field260;

    @ObfuscatedName("a.y")
    public final int field252;

    @ObfuscatedName("a.h")
    public final int field258;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field256 = arg0.field1970 + arg1 - arg0.field1973;
        this.field253 = arg0.field1938 + arg2 - arg0.field1974;
        this.field257 = arg0.field1981 + arg3 - arg0.field1982;
        this.field255 = arg0.field1970 + arg1 + arg0.field1973;
        this.field260 = arg0.field1938 + arg2 + arg0.field1974;
        this.field252 = arg0.field1981 + arg3 + arg0.field1982;
        this.field258 = arg4;
    }

    @ObfuscatedName("a.i(I)V")
    public final void method29() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field256 : this.field255;
            int var3 = (var1 & 0x2) == 0 ? this.field253 : this.field260;
            int var4 = (var1 & 0x4) == 0 ? this.field257 : this.field252;
            if ((var1 & 0x1) == 0) {
                class10.method1404(var2, var3, var4, this.field255, var3, var4, this.field258);
            }
            if ((var1 & 0x2) == 0) {
                class10.method1404(var2, var3, var4, var2, this.field260, var4, this.field258);
            }
            if ((var1 & 0x4) == 0) {
                class10.method1404(var2, var3, var4, var2, var3, this.field252, this.field258);
            }
        }
    }
}
