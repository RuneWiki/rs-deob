package deob;

@ObfuscatedName("w")
public class class13 extends class86 {

    @ObfuscatedName("w.b")
    public int field189;

    @ObfuscatedName("w.g")
    public int field175;

    @ObfuscatedName("w.j")
    public int field178;

    @ObfuscatedName("w.d")
    public int field177;

    @ObfuscatedName("w.x")
    public int field191;

    @ObfuscatedName("w.y")
    public int field179;

    @ObfuscatedName("w.r")
    public class43 field174;

    @ObfuscatedName("w.c")
    public int field180;

    @ObfuscatedName("w.l")
    public int field176;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field189 = arg0;
        this.field175 = arg1;
        this.field178 = arg2;
        this.field177 = arg3;
        this.field191 = arg4;
        this.field179 = arg5;
        if (arg6 != -1) {
            this.field174 = class43.method175(arg6);
            this.field180 = 0;
            this.field176 = client.field297 - 1;
            if (this.field174.field980 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field174 == var10.field174) {
                    this.field180 = var10.field180;
                    this.field176 = var10.field176;
                    return;
                }
            }
            if (arg7 && this.field174.field967 != -1) {
                this.field180 = (int) (Math.random() * (double) this.field174.field966.length);
                this.field176 -= (int) (Math.random() * (double) this.field174.field984[this.field180]);
            }
        }
    }

    @ObfuscatedName("w.j(I)Ldd;")
    public final class106 method16() {
        if (this.field174 != null) {
            int var1 = client.field297 - this.field176;
            if (var1 > 100 && this.field174.field967 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field174.field984[this.field180]) {
                            break label47;
                        }
                        var1 -= this.field174.field984[this.field180];
                        this.field180++;
                    } while (this.field180 < this.field174.field966.length);
                    this.field180 -= this.field174.field967;
                } while (this.field180 >= 0 && this.field180 < this.field174.field966.length);
                this.field174 = null;
            }
            this.field176 = client.field297 - var1;
        }
        class41 var2 = class41.method3164(this.field189);
        if (var2.field950 != null) {
            var2 = var2.method786();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field178 == 1 || this.field178 == 3) {
            var3 = var2.field905;
            var4 = var2.field916;
        } else {
            var3 = var2.field916;
            var4 = var2.field905;
        }
        int var5 = (var3 >> 1) + this.field191;
        int var6 = (var3 + 1 >> 1) + this.field191;
        int var7 = (var4 >> 1) + this.field179;
        int var8 = (var4 + 1 >> 1) + this.field179;
        int[][] var9 = class6.field84[this.field177];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field191 << 7) + (var3 << 6);
        int var12 = (this.field179 << 7) + (var4 << 6);
        return var2.method788(this.field175, this.field178, var9, var11, var10, var12, this.field174, this.field180);
    }
}
