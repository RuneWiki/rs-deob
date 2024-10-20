package deob;

@ObfuscatedName("c")
public class class13 extends class85 {

    @ObfuscatedName("c.i")
    public int field179;

    @ObfuscatedName("c.v")
    public int field178;

    @ObfuscatedName("c.f")
    public int field183;

    @ObfuscatedName("c.h")
    public int field180;

    @ObfuscatedName("c.a")
    public int field181;

    @ObfuscatedName("c.s")
    public int field182;

    @ObfuscatedName("c.p")
    public class43 field191;

    @ObfuscatedName("c.r")
    public int field184;

    @ObfuscatedName("c.k")
    public int field185;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field179 = arg0;
        this.field178 = arg1;
        this.field183 = arg2;
        this.field180 = arg3;
        this.field181 = arg4;
        this.field182 = arg5;
        if (arg6 != -1) {
            this.field191 = class43.method3831(arg6);
            this.field184 = 0;
            this.field185 = client.field302 - 1;
            if (this.field191.field1004 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field191 == var10.field191) {
                    this.field184 = var10.field184;
                    this.field185 = var10.field185;
                    return;
                }
            }
            if (arg7 && this.field191.field1015 != -1) {
                this.field184 = (int) (Math.random() * (double) this.field191.field1000.length);
                this.field185 -= (int) (Math.random() * (double) this.field191.field1010[this.field184]);
            }
        }
    }

    @ObfuscatedName("c.f(I)Ldo;")
    public final class105 method29() {
        if (this.field191 != null) {
            int var1 = client.field302 - this.field185;
            if (var1 > 100 && this.field191.field1015 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field191.field1010[this.field184]) {
                            break label47;
                        }
                        var1 -= this.field191.field1010[this.field184];
                        this.field184++;
                    } while (this.field184 < this.field191.field1000.length);
                    this.field184 -= this.field191.field1015;
                } while (this.field184 >= 0 && this.field184 < this.field191.field1000.length);
                this.field191 = null;
            }
            this.field185 = client.field302 - var1;
        }
        class41 var2 = class41.method1443(this.field179);
        if (var2.field977 != null) {
            var2 = var2.method757();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field183 == 1 || this.field183 == 3) {
            var3 = var2.field952;
            var4 = var2.field944;
        } else {
            var3 = var2.field944;
            var4 = var2.field952;
        }
        int var5 = (var3 >> 1) + this.field181;
        int var6 = (var3 + 1 >> 1) + this.field181;
        int var7 = (var4 >> 1) + this.field182;
        int var8 = (var4 + 1 >> 1) + this.field182;
        int[][] var9 = class6.field97[this.field180];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field181 << 7) + (var3 << 6);
        int var12 = (this.field182 << 7) + (var4 << 6);
        return var2.method755(this.field178, this.field183, var9, var11, var10, var12, this.field191, this.field184);
    }
}
