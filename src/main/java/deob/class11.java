package deob;

@ObfuscatedName("g")
public final class class11 extends class10 {

    @ObfuscatedName("g.d")
    public final int field250;

    @ObfuscatedName("g.q")
    public final int field242;

    @ObfuscatedName("g.x")
    public final int field243;

    @ObfuscatedName("g.y")
    public final int field241;

    @ObfuscatedName("g.e")
    public final int field244;

    @ObfuscatedName("g.f")
    public final int field246;

    @ObfuscatedName("g.v")
    public final int field251;

    public class11(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field250 = arg0.field1926 + arg1 - arg0.field1907;
        this.field242 = arg0.field1954 + arg2 - arg0.field1929;
        this.field243 = arg0.field1927 + arg3 - arg0.field1930;
        this.field241 = arg0.field1926 + arg1 + arg0.field1907;
        this.field244 = arg0.field1954 + arg2 + arg0.field1929;
        this.field246 = arg0.field1927 + arg3 + arg0.field1930;
        this.field251 = arg4;
    }

    @ObfuscatedName("g.d(I)V")
    public final void method40() {
        for (int var1 = 0; var1 < 8; var1++) {
            int var2 = (var1 & 0x1) == 0 ? this.field250 : this.field241;
            int var3 = (var1 & 0x2) == 0 ? this.field242 : this.field244;
            int var4 = (var1 & 0x4) == 0 ? this.field243 : this.field246;
            if ((var1 & 0x1) == 0) {
                class10.method106(var2, var3, var4, this.field241, var3, var4, this.field251);
            }
            if ((var1 & 0x2) == 0) {
                class10.method106(var2, var3, var4, var2, this.field244, var4, this.field251);
            }
            if ((var1 & 0x4) == 0) {
                class10.method106(var2, var3, var4, var2, var3, this.field246, this.field251);
            }
        }
    }
}
