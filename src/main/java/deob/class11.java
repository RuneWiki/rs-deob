package deob;

@ObfuscatedName("e")
public final class class11 extends class10 {

    @ObfuscatedName("e.i")
    public final int field261;

    @ObfuscatedName("e.w")
    public final int field253;

    @ObfuscatedName("e.a")
    public final int field254;

    @ObfuscatedName("e.t")
    public final int field255;

    @ObfuscatedName("e.s")
    public final int field256;

    @ObfuscatedName("e.r")
    public final int field257;

    @ObfuscatedName("e.v")
    public final int field258;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field261 = arg0.field1970 + arg1 - arg0.field1967;
        this.field253 = arg0.field1990 + arg2 - arg0.field1968;
        this.field254 = arg0.field1933 + arg3 - arg0.field1969;
        this.field255 = arg0.field1970 + arg1 + arg0.field1967;
        this.field256 = arg0.field1990 + arg2 + arg0.field1968;
        this.field257 = arg0.field1933 + arg3 + arg0.field1969;
        this.field258 = arg4;
    }

    @ObfuscatedName("e.i(I)V")
    public final void method41() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field261 : this.field255;
            int var3 = (var1 & 0x2) == 0 ? this.field253 : this.field256;
            int var4 = (var1 & 0x4) == 0 ? this.field254 : this.field257;
            if ((var1 & 0x1) == 0) {
                int var5 = this.field255;
                int var6 = this.field258;
                int[] var7 = class140.method2572(var2, var3, var4);
                int[] var8 = class140.method2572(var5, var3, var4);
                class282.method4576(var7[0], var7[1], var8[0], var8[1], var6);
            }
            if ((var1 & 0x2) == 0) {
                int var9 = this.field256;
                int var10 = this.field258;
                int[] var11 = class140.method2572(var2, var3, var4);
                int[] var12 = class140.method2572(var2, var9, var4);
                class282.method4576(var11[0], var11[1], var12[0], var12[1], var10);
            }
            if ((var1 & 0x4) == 0) {
                int var13 = this.field257;
                int var14 = this.field258;
                int[] var15 = class140.method2572(var2, var3, var4);
                int[] var16 = class140.method2572(var2, var3, var13);
                class282.method4576(var15[0], var15[1], var16[0], var16[1], var14);
            }
        }
    }
}
