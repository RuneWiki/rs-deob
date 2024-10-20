package deob;

@ObfuscatedName("d")
public final class class11 extends class10 {

    @ObfuscatedName("d.i")
    public final int field267;

    @ObfuscatedName("d.j")
    public final int field258;

    @ObfuscatedName("d.a")
    public final int field257;

    @ObfuscatedName("d.r")
    public final int field260;

    @ObfuscatedName("d.o")
    public final int field266;

    @ObfuscatedName("d.n")
    public final int field262;

    @ObfuscatedName("d.q")
    public final int field263;

    public class11(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field267 = arg0.field1964 + arg1 - arg0.field1976;
        this.field258 = arg0.field1933 + arg2 - arg0.field1983;
        this.field257 = arg0.field1966 + arg3 - arg0.field1969;
        this.field260 = arg0.field1964 + arg1 + arg0.field1976;
        this.field266 = arg0.field1933 + arg2 + arg0.field1983;
        this.field262 = arg0.field1966 + arg3 + arg0.field1969;
        this.field263 = arg4;
    }

    @ObfuscatedName("d.i(I)V")
    public final void method35() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field267 : this.field260;
            int var3 = (var1 & 0x2) == 0 ? this.field258 : this.field266;
            int var4 = (var1 & 0x4) == 0 ? this.field257 : this.field262;
            if ((var1 & 0x1) == 0) {
                class10.method485(var2, var3, var4, this.field260, var3, var4, this.field263);
            }
            if ((var1 & 0x2) == 0) {
                class10.method485(var2, var3, var4, var2, this.field266, var4, this.field263);
            }
            if ((var1 & 0x4) == 0) {
                class10.method485(var2, var3, var4, var2, var3, this.field262, this.field263);
            }
        }
    }
}
