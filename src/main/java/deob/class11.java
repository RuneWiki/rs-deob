package deob;

@ObfuscatedName("d")
public final class class11 extends class10 {

    @ObfuscatedName("d.b")
    public final int field244;

    @ObfuscatedName("d.s")
    public final int field240;

    @ObfuscatedName("d.r")
    public final int field241;

    @ObfuscatedName("d.g")
    public final int field245;

    @ObfuscatedName("d.x")
    public final int field243;

    @ObfuscatedName("d.f")
    public final int field248;

    @ObfuscatedName("d.u")
    public final int field242;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field244 = arg0.field1876 + arg1 - arg0.field1866;
        this.field240 = arg0.field1864 + arg2 - arg0.field1840;
        this.field241 = arg0.field1865 + arg3 - arg0.field1868;
        this.field245 = arg0.field1876 + arg1 + arg0.field1866;
        this.field243 = arg0.field1864 + arg2 + arg0.field1840;
        this.field248 = arg0.field1865 + arg3 + arg0.field1868;
        this.field242 = arg4;
    }

    @ObfuscatedName("d.b(I)V")
    public final void method38() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field244 : this.field245;
            int var3 = (var1 & 0x2) == 0 ? this.field240 : this.field243;
            int var4 = (var1 & 0x4) == 0 ? this.field241 : this.field248;
            if ((var1 & 0x1) == 0) {
                class10.method2486(var2, var3, var4, this.field245, var3, var4, this.field242);
            }
            if ((var1 & 0x2) == 0) {
                class10.method2486(var2, var3, var4, var2, this.field243, var4, this.field242);
            }
            if ((var1 & 0x4) == 0) {
                class10.method2486(var2, var3, var4, var2, var3, this.field248, this.field242);
            }
        }
    }
}
