package deob;

@ObfuscatedName("u")
public final class class11 extends class10 {

    @ObfuscatedName("u.b")
    public final int field246;

    @ObfuscatedName("u.q")
    public final int field245;

    @ObfuscatedName("u.o")
    public final int field247;

    @ObfuscatedName("u.p")
    public final int field252;

    @ObfuscatedName("u.a")
    public final int field244;

    @ObfuscatedName("u.h")
    public final int field249;

    @ObfuscatedName("u.l")
    public final int field250;

    public class11(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field246 = arg0.field1823 + arg1 - arg0.field1837;
        this.field245 = arg0.field1835 + arg2 - arg0.field1826;
        this.field247 = arg0.field1836 + arg3 - arg0.field1868;
        this.field252 = arg0.field1823 + arg1 + arg0.field1837;
        this.field244 = arg0.field1835 + arg2 + arg0.field1826;
        this.field249 = arg0.field1836 + arg3 + arg0.field1868;
        this.field250 = arg4;
    }

    @ObfuscatedName("u.b(I)V")
    public final void method29() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field246 : this.field252;
            int var3 = (var1 & 0x2) == 0 ? this.field245 : this.field244;
            int var4 = (var1 & 0x4) == 0 ? this.field247 : this.field249;
            if ((var1 & 0x1) == 0) {
                class10.method4067(var2, var3, var4, this.field252, var3, var4, this.field250);
            }
            if ((var1 & 0x2) == 0) {
                class10.method4067(var2, var3, var4, var2, this.field244, var4, this.field250);
            }
            if ((var1 & 0x4) == 0) {
                class10.method4067(var2, var3, var4, var2, var3, this.field249, this.field250);
            }
        }
    }
}
