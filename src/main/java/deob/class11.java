package deob;

@ObfuscatedName("d")
public final class class11 extends class10 {

    @ObfuscatedName("d.c")
    public final int field243;

    @ObfuscatedName("d.i")
    public final int field246;

    @ObfuscatedName("d.o")
    public final int field244;

    @ObfuscatedName("d.j")
    public final int field245;

    @ObfuscatedName("d.k")
    public final int field251;

    @ObfuscatedName("d.x")
    public final int field247;

    @ObfuscatedName("d.z")
    public final int field248;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field243 = arg0.field1874 + arg1 - arg0.field1877;
        this.field246 = arg0.field1875 + arg2 - arg0.field1878;
        this.field244 = arg0.field1876 + arg3 - arg0.field1879;
        this.field245 = arg0.field1874 + arg1 + arg0.field1877;
        this.field251 = arg0.field1875 + arg2 + arg0.field1878;
        this.field247 = arg0.field1876 + arg3 + arg0.field1879;
        this.field248 = arg4;
    }

    @ObfuscatedName("d.c(I)V")
    public final void method43() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field243 : this.field245;
            int var3 = (var1 & 0x2) == 0 ? this.field246 : this.field251;
            int var4 = (var1 & 0x4) == 0 ? this.field244 : this.field247;
            if ((var1 & 0x1) == 0) {
                class10.method3015(var2, var3, var4, this.field245, var3, var4, this.field248);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3015(var2, var3, var4, var2, this.field251, var4, this.field248);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3015(var2, var3, var4, var2, var3, this.field247, this.field248);
            }
        }
    }
}
