package deob;

@ObfuscatedName("y")
public final class class11 extends class10 {

    @ObfuscatedName("y.d")
    public final int field268;

    @ObfuscatedName("y.k")
    public final int field261;

    @ObfuscatedName("y.e")
    public final int field262;

    @ObfuscatedName("y.p")
    public final int field260;

    @ObfuscatedName("y.q")
    public final int field264;

    @ObfuscatedName("y.s")
    public final int field265;

    @ObfuscatedName("y.r")
    public final int field267;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field268 = arg0.field1945 + arg1 - arg0.field1948;
        this.field261 = arg0.field1964 + arg2 - arg0.field1949;
        this.field262 = arg0.field1947 + arg3 - arg0.field1925;
        this.field260 = arg0.field1945 + arg1 + arg0.field1948;
        this.field264 = arg0.field1964 + arg2 + arg0.field1949;
        this.field265 = arg0.field1947 + arg3 + arg0.field1925;
        this.field267 = arg4;
    }

    @ObfuscatedName("y.d(I)V")
    public final void method42() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field268 : this.field260;
            int var3 = (var1 & 0x2) == 0 ? this.field261 : this.field264;
            int var4 = (var1 & 0x4) == 0 ? this.field262 : this.field265;
            if ((var1 & 0x1) == 0) {
                class10.method3686(var2, var3, var4, this.field260, var3, var4, this.field267);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3686(var2, var3, var4, var2, this.field264, var4, this.field267);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3686(var2, var3, var4, var2, var3, this.field265, this.field267);
            }
        }
    }
}
