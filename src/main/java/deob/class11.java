package deob;

@ObfuscatedName("c")
public final class class11 extends class10 {

    @ObfuscatedName("c.m")
    public final int field254;

    @ObfuscatedName("c.p")
    public final int field253;

    @ObfuscatedName("c.i")
    public final int field256;

    @ObfuscatedName("c.j")
    public final int field255;

    @ObfuscatedName("c.v")
    public final int field260;

    @ObfuscatedName("c.x")
    public final int field252;

    @ObfuscatedName("c.e")
    public final int field258;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field254 = arg0.field1893 + arg1 - arg0.field1878;
        this.field253 = arg0.field1876 + arg2 - arg0.field1879;
        this.field256 = arg0.field1877 + arg3 - arg0.field1880;
        this.field255 = arg0.field1893 + arg1 + arg0.field1878;
        this.field260 = arg0.field1876 + arg2 + arg0.field1879;
        this.field252 = arg0.field1877 + arg3 + arg0.field1880;
        this.field258 = arg4;
    }

    @ObfuscatedName("c.m(I)V")
    public final void method42() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field254 : this.field255;
            int var3 = (var1 & 0x2) == 0 ? this.field253 : this.field260;
            int var4 = (var1 & 0x4) == 0 ? this.field256 : this.field252;
            if ((var1 & 0x1) == 0) {
                class10.method4029(var2, var3, var4, this.field255, var3, var4, this.field258);
            }
            if ((var1 & 0x2) == 0) {
                class10.method4029(var2, var3, var4, var2, this.field260, var4, this.field258);
            }
            if ((var1 & 0x4) == 0) {
                class10.method4029(var2, var3, var4, var2, var3, this.field252, this.field258);
            }
        }
    }
}
