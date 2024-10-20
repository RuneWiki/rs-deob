package deob;

@ObfuscatedName("n")
public final class class11 extends class10 {

    @ObfuscatedName("n.t")
    public final int field241;

    @ObfuscatedName("n.q")
    public final int field242;

    @ObfuscatedName("n.i")
    public final int field248;

    @ObfuscatedName("n.a")
    public final int field244;

    @ObfuscatedName("n.l")
    public final int field245;

    @ObfuscatedName("n.b")
    public final int field246;

    @ObfuscatedName("n.e")
    public final int field247;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field241 = arg0.field1856 + arg1 - arg0.field1835;
        this.field242 = arg0.field1859 + arg2 - arg0.field1860;
        this.field248 = arg0.field1844 + arg3 - arg0.field1861;
        this.field244 = arg0.field1856 + arg1 + arg0.field1835;
        this.field245 = arg0.field1859 + arg2 + arg0.field1860;
        this.field246 = arg0.field1844 + arg3 + arg0.field1861;
        this.field247 = arg4;
    }

    @ObfuscatedName("n.t(I)V")
    public final void method32() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field241 : this.field244;
            int var3 = (var1 & 0x2) == 0 ? this.field242 : this.field245;
            int var4 = (var1 & 0x4) == 0 ? this.field248 : this.field246;
            if ((var1 & 0x1) == 0) {
                class10.method743(var2, var3, var4, this.field244, var3, var4, this.field247);
            }
            if ((var1 & 0x2) == 0) {
                class10.method743(var2, var3, var4, var2, this.field245, var4, this.field247);
            }
            if ((var1 & 0x4) == 0) {
                class10.method743(var2, var3, var4, var2, var3, this.field246, this.field247);
            }
        }
    }
}
