package deob;

@ObfuscatedName("o")
public final class class11 extends class10 {

    @ObfuscatedName("o.p")
    public final int field248;

    @ObfuscatedName("o.i")
    public final int field242;

    @ObfuscatedName("o.w")
    public final int field250;

    @ObfuscatedName("o.s")
    public final int field244;

    @ObfuscatedName("o.j")
    public final int field245;

    @ObfuscatedName("o.a")
    public final int field241;

    @ObfuscatedName("o.t")
    public final int field247;

    public class11(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field248 = arg0.field1844 + arg1 - arg0.field1835;
        this.field242 = arg0.field1833 + arg2 - arg0.field1804;
        this.field250 = arg0.field1834 + arg3 - arg0.field1837;
        this.field244 = arg0.field1844 + arg1 + arg0.field1835;
        this.field245 = arg0.field1833 + arg2 + arg0.field1804;
        this.field241 = arg0.field1834 + arg3 + arg0.field1837;
        this.field247 = arg4;
    }

    @ObfuscatedName("o.p(S)V")
    public final void method49() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field248 : this.field244;
            int var3 = (var1 & 0x2) == 0 ? this.field242 : this.field245;
            int var4 = (var1 & 0x4) == 0 ? this.field250 : this.field241;
            if ((var1 & 0x1) == 0) {
                class10.method3017(var2, var3, var4, this.field244, var3, var4, this.field247);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3017(var2, var3, var4, var2, this.field245, var4, this.field247);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3017(var2, var3, var4, var2, var3, this.field241, this.field247);
            }
        }
    }
}
