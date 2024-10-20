package deob;

@ObfuscatedName("h")
public final class class11 extends class10 {

    @ObfuscatedName("h.e")
    public final int field254;

    @ObfuscatedName("h.o")
    public final int field257;

    @ObfuscatedName("h.m")
    public final int field251;

    @ObfuscatedName("h.g")
    public final int field252;

    @ObfuscatedName("h.d")
    public final int field253;

    @ObfuscatedName("h.b")
    public final int field250;

    @ObfuscatedName("h.k")
    public final int field249;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field254 = arg0.field1951 + arg1 - arg0.field1954;
        this.field257 = arg0.field1952 + arg2 - arg0.field1920;
        this.field251 = arg0.field1953 + arg3 - arg0.field1986;
        this.field252 = arg0.field1951 + arg1 + arg0.field1954;
        this.field253 = arg0.field1952 + arg2 + arg0.field1920;
        this.field250 = arg0.field1953 + arg3 + arg0.field1986;
        this.field249 = arg4;
    }

    @ObfuscatedName("h.e(S)V")
    public final void method22() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field254 : this.field252;
            int var3 = (var1 & 0x2) == 0 ? this.field257 : this.field253;
            int var4 = (var1 & 0x4) == 0 ? this.field251 : this.field250;
            if ((var1 & 0x1) == 0) {
                Statics.method3749(var2, var3, var4, this.field252, var3, var4, this.field249);
            }
            if ((var1 & 0x2) == 0) {
                Statics.method3749(var2, var3, var4, var2, this.field253, var4, this.field249);
            }
            if ((var1 & 0x4) == 0) {
                Statics.method3749(var2, var3, var4, var2, var3, this.field250, this.field249);
            }
        }
    }
}
