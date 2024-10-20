package deob;

@ObfuscatedName("z")
public final class class11 extends class10 {

    @ObfuscatedName("z.w")
    public final int field266;

    @ObfuscatedName("z.s")
    public final int field267;

    @ObfuscatedName("z.q")
    public final int field268;

    @ObfuscatedName("z.o")
    public final int field274;

    @ObfuscatedName("z.g")
    public final int field270;

    @ObfuscatedName("z.v")
    public final int field271;

    @ObfuscatedName("z.p")
    public final int field272;

    public class11(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field266 = arg0.field1968 + arg1 - arg0.field1965;
        this.field267 = arg0.field1944 + arg2 - arg0.field1947;
        this.field268 = arg0.field1945 + arg3 - arg0.field1948;
        this.field274 = arg0.field1968 + arg1 + arg0.field1965;
        this.field270 = arg0.field1944 + arg2 + arg0.field1947;
        this.field271 = arg0.field1945 + arg3 + arg0.field1948;
        this.field272 = arg4;
    }

    @ObfuscatedName("z.w(I)V")
    public final void method33() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field266 : this.field274;
            int var3 = (var1 & 0x2) == 0 ? this.field267 : this.field270;
            int var4 = (var1 & 0x4) == 0 ? this.field268 : this.field271;
            if ((var1 & 0x1) == 0) {
                class10.method152(var2, var3, var4, this.field274, var3, var4, this.field272);
            }
            if ((var1 & 0x2) == 0) {
                class10.method152(var2, var3, var4, var2, this.field270, var4, this.field272);
            }
            if ((var1 & 0x4) == 0) {
                class10.method152(var2, var3, var4, var2, var3, this.field271, this.field272);
            }
        }
    }
}
