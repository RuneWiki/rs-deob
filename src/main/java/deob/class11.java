package deob;

@ObfuscatedName("m")
public final class class11 extends class10 {

    @ObfuscatedName("m.a")
    public final int field259;

    @ObfuscatedName("m.j")
    public final int field253;

    @ObfuscatedName("m.n")
    public final int field254;

    @ObfuscatedName("m.r")
    public final int field255;

    @ObfuscatedName("m.v")
    public final int field258;

    @ObfuscatedName("m.e")
    public final int field252;

    @ObfuscatedName("m.l")
    public final int field269;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field259 = arg0.field1950 + arg1 - arg0.field1948;
        this.field253 = arg0.field1951 + arg2 - arg0.field1975;
        this.field254 = arg0.field1952 + arg3 - arg0.field1955;
        this.field255 = arg0.field1950 + arg1 + arg0.field1948;
        this.field258 = arg0.field1951 + arg2 + arg0.field1975;
        this.field252 = arg0.field1952 + arg3 + arg0.field1955;
        this.field269 = arg4;
    }

    @ObfuscatedName("m.a(B)V")
    public final void method38() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field259 : this.field255;
            int var3 = (var1 & 0x2) == 0 ? this.field253 : this.field258;
            int var4 = (var1 & 0x4) == 0 ? this.field254 : this.field252;
            if ((var1 & 0x1) == 0) {
                class10.method3749(var2, var3, var4, this.field255, var3, var4, this.field269);
            }
            if ((var1 & 0x2) == 0) {
                class10.method3749(var2, var3, var4, var2, this.field258, var4, this.field269);
            }
            if ((var1 & 0x4) == 0) {
                class10.method3749(var2, var3, var4, var2, var3, this.field252, this.field269);
            }
        }
    }
}
