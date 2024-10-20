package deob;

@ObfuscatedName("v")
public final class class11 extends class10 {

    @ObfuscatedName("v.w")
    public final int field267;

    @ObfuscatedName("v.o")
    public final int field260;

    @ObfuscatedName("v.x")
    public final int field261;

    @ObfuscatedName("v.k")
    public final int field266;

    @ObfuscatedName("v.f")
    public final int field259;

    @ObfuscatedName("v.i")
    public final int field264;

    @ObfuscatedName("v.j")
    public final int field265;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field267 = arg0.field1942 + arg1 - arg0.field1967;
        this.field260 = arg0.field1965 + arg2 - arg0.field1978;
        this.field261 = arg0.field1966 + arg3 - arg0.field1969;
        this.field266 = arg0.field1942 + arg1 + arg0.field1967;
        this.field259 = arg0.field1965 + arg2 + arg0.field1978;
        this.field264 = arg0.field1966 + arg3 + arg0.field1969;
        this.field265 = arg4;
    }

    @ObfuscatedName("v.w(I)V")
    public final void method39() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field267 : this.field266;
            int var3 = (var1 & 0x2) == 0 ? this.field260 : this.field259;
            int var4 = (var1 & 0x4) == 0 ? this.field261 : this.field264;
            if ((var1 & 0x1) == 0) {
                class10.method3955(var2, var3, var4, this.field266, var3, var4, this.field265);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3955(var2, var3, var4, var2, this.field259, var4, this.field265);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3955(var2, var3, var4, var2, var3, this.field264, this.field265);
            }
        }
    }
}
