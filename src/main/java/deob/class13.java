package deob;

@ObfuscatedName("g")
public class class13 extends class89 {

    @ObfuscatedName("g.e")
    public int field195;

    @ObfuscatedName("g.l")
    public int field196;

    @ObfuscatedName("g.c")
    public int field197;

    @ObfuscatedName("g.h")
    public int field203;

    @ObfuscatedName("g.r")
    public int field199;

    @ObfuscatedName("g.a")
    public int field200;

    @ObfuscatedName("g.b")
    public class45 field201;

    @ObfuscatedName("g.u")
    public int field202;

    @ObfuscatedName("g.o")
    public int field205;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field195 = arg0;
        this.field196 = arg1;
        this.field197 = arg2;
        this.field203 = arg3;
        this.field199 = arg4;
        this.field200 = arg5;
        if (arg6 != -1) {
            this.field201 = Statics.method144(arg6);
            this.field202 = 0;
            this.field205 = client.field568 - 1;
            if (this.field201.field1037 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field201 == var10.field201) {
                    this.field202 = var10.field202;
                    this.field205 = var10.field205;
                    return;
                }
            }
            if (arg7 && this.field201.field1028 != -1) {
                this.field202 = (int) (Math.random() * (double) this.field201.field1024.length);
                this.field205 -= (int) (Math.random() * (double) this.field201.field1026[this.field202]);
            }
        }
    }

    @ObfuscatedName("g.c(I)Lds;")
    public final class109 method9() {
        if (this.field201 != null) {
            int var1 = client.field568 - this.field205;
            if (var1 > 100 && this.field201.field1028 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field201.field1026[this.field202]) {
                            break label47;
                        }
                        var1 -= this.field201.field1026[this.field202];
                        this.field202++;
                    } while (this.field202 < this.field201.field1024.length);
                    this.field202 -= this.field201.field1028;
                } while (this.field202 >= 0 && this.field202 < this.field201.field1024.length);
                this.field201 = null;
            }
            this.field205 = client.field568 - var1;
        }
        class43 var2 = class43.method2943(this.field195);
        if (var2.field970 != null) {
            var2 = var2.method815();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field197 == 1 || this.field197 == 3) {
            var3 = var2.field1001;
            var4 = var2.field960;
        } else {
            var3 = var2.field960;
            var4 = var2.field1001;
        }
        int var5 = (var3 >> 1) + this.field199;
        int var6 = (var3 + 1 >> 1) + this.field199;
        int var7 = (var4 >> 1) + this.field200;
        int var8 = (var4 + 1 >> 1) + this.field200;
        int[][] var9 = class6.field79[this.field203];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field199 << 7) + (var3 << 6);
        int var12 = (this.field200 << 7) + (var4 << 6);
        return var2.method813(this.field196, this.field197, var9, var11, var10, var12, this.field201, this.field202);
    }
}
