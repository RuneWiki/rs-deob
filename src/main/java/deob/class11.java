package deob;

@ObfuscatedName("r")
public final class class11 extends class10 {

    @ObfuscatedName("r.c")
    public final int field250;

    @ObfuscatedName("r.o")
    public final int field242;

    @ObfuscatedName("r.i")
    public final int field243;

    @ObfuscatedName("r.u")
    public final int field244;

    @ObfuscatedName("r.g")
    public final int field246;

    @ObfuscatedName("r.m")
    public final int field247;

    @ObfuscatedName("r.s")
    public final int field241;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field250 = arg0.field1897 + arg1 - arg0.field1914;
        this.field242 = arg0.field1912 + arg2 - arg0.field1918;
        this.field243 = arg0.field1913 + arg3 - arg0.field1902;
        this.field244 = arg0.field1897 + arg1 + arg0.field1914;
        this.field246 = arg0.field1912 + arg2 + arg0.field1918;
        this.field247 = arg0.field1913 + arg3 + arg0.field1902;
        this.field241 = arg4;
    }

    @ObfuscatedName("r.c(B)V")
    public final void method38() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field250 : this.field244;
            int var3 = (var1 & 0x2) == 0 ? this.field242 : this.field246;
            int var4 = (var1 & 0x4) == 0 ? this.field243 : this.field247;
            if ((var1 & 0x1) == 0) {
                Statics.method3556(var2, var3, var4, this.field244, var3, var4, this.field241);
            }
            if ((var1 & 0x2) == 0) {
                Statics.method3556(var2, var3, var4, var2, this.field246, var4, this.field241);
            }
            if ((var1 & 0x4) == 0) {
                Statics.method3556(var2, var3, var4, var2, var3, this.field247, this.field241);
            }
        }
    }
}
