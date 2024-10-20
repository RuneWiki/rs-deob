package deob;

@ObfuscatedName("c")
public final class class11 extends class10 {

    @ObfuscatedName("c.s")
    public final int field241;

    @ObfuscatedName("c.g")
    public final int field240;

    @ObfuscatedName("c.m")
    public final int field250;

    @ObfuscatedName("c.h")
    public final int field249;

    @ObfuscatedName("c.i")
    public final int field242;

    @ObfuscatedName("c.w")
    public final int field245;

    @ObfuscatedName("c.t")
    public final int field246;

    public class11(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field241 = arg0.field1812 + arg1 - arg0.field1843;
        this.field240 = arg0.field1816 + arg2 - arg0.field1875;
        this.field250 = arg0.field1842 + arg3 - arg0.field1809;
        this.field249 = arg0.field1812 + arg1 + arg0.field1843;
        this.field242 = arg0.field1816 + arg2 + arg0.field1875;
        this.field245 = arg0.field1842 + arg3 + arg0.field1809;
        this.field246 = arg4;
    }

    @ObfuscatedName("c.s(I)V")
    public final void method35() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field241 : this.field249;
            int var3 = (var1 & 0x2) == 0 ? this.field240 : this.field242;
            int var4 = (var1 & 0x4) == 0 ? this.field250 : this.field245;
            if ((var1 & 0x1) == 0) {
                class10.method93(var2, var3, var4, this.field249, var3, var4, this.field246);
            }
            if ((var1 & 0x2) == 0) {
                class10.method93(var2, var3, var4, var2, this.field242, var4, this.field246);
            }
            if ((var1 & 0x4) == 0) {
                class10.method93(var2, var3, var4, var2, var3, this.field245, this.field246);
            }
        }
    }
}
