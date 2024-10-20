package deob;

@ObfuscatedName("dk")
public final class class102 extends class97 {

    @ObfuscatedName("dk.az")
    public class208 field1333;

    @ObfuscatedName("dk.ah")
    public String field1331 = "";

    @ObfuscatedName("dk.at")
    public int field1330 = 31;

    @ObfuscatedName("dk.ao")
    public class536 field1334;

    @ObfuscatedName("dk.ab")
    public class207 field1335;

    @ObfuscatedName("dk.aw")
    public static int field1339 = 1;

    @ObfuscatedName("dk.ad")
    public class207 field1337;

    @ObfuscatedName("dk.al")
    public static int field1338 = 1;

    @ObfuscatedName("dk.az(Ljava/lang/String;B)V")
    public void method2509(String arg0) {
        this.field1331 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dk.af(II)V")
    public void method2470(int arg0) {
        this.field1330 = arg0;
    }

    @ObfuscatedName("dk.at(II)Z")
    public boolean method2471(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1330 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dk.an(I)Ljava/lang/String;")
    public final String method2472() {
        if (!this.field1331.isEmpty()) {
            return this.field1331;
        }
        class208 var1 = this.field1333;
        if (var1.field2139 != null) {
            var1 = var1.method3534();
            if (var1 == null) {
                var1 = this.field1333;
            }
        }
        return var1.field2119;
    }

    @ObfuscatedName("dk.aw(ILiu;B)V")
    public final void method2473(int arg0, class234 arg1) {
        int var3 = this.field1271[0];
        int var4 = this.field1272[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field1201 != -1 && class225.method288(this.field1201).field2400 == 1) {
            this.field1201 = -1;
        }
        if (this.field1274 < 9) {
            this.field1274++;
        }
        for (int var5 = this.field1274; var5 > 0; var5--) {
            this.field1271[var5] = this.field1271[var5 - 1];
            this.field1272[var5] = this.field1272[var5 - 1];
            this.field1209[var5] = this.field1209[var5 - 1];
        }
        this.field1271[0] = var3;
        this.field1272[0] = var4;
        this.field1209[0] = arg1;
    }

    @ObfuscatedName("dk.ad(IIZI)V")
    public final void method2515(int arg0, int arg1, boolean arg2) {
        if (this.field1201 != -1 && class225.method288(this.field1201).field2400 == 1) {
            this.field1201 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1271[0];
            int var5 = arg1 - this.field1272[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1274 < 9) {
                    this.field1274++;
                }
                for (int var6 = this.field1274; var6 > 0; var6--) {
                    this.field1271[var6] = this.field1271[var6 - 1];
                    this.field1272[var6] = this.field1272[var6 - 1];
                    this.field1209[var6] = this.field1209[var6 - 1];
                }
                this.field1271[0] = arg0;
                this.field1272[0] = arg1;
                this.field1209[0] = class234.field2487;
                return;
            }
        }
        this.field1274 = 0;
        this.field1275 = 0;
        this.field1258 = 0;
        this.field1271[0] = arg0;
        this.field1272[0] = arg1;
        this.field1220 = this.field1271[0] * 128 + this.field1250 * 64;
        this.field1260 = this.field1272[0] * 128 + this.field1250 * 64;
    }

    @ObfuscatedName("dk.ah(I)Ljn;")
    public final class256 method1979() {
        if (this.field1333 == null) {
            return null;
        }
        class225 var1 = this.field1201 != -1 && this.field1248 == 0 ? class225.method288(this.field1201) : null;
        class225 var2 = this.field1241 == -1 || this.field1241 == this.field1206 && var1 != null ? null : class225.method288(this.field1241);
        Object var3 = null;
        class256 var4;
        if (this.field1335 != null && this.field1335.field2097) {
            var4 = Statics.field1608.field1123.method5729(var1, this.field1246, var2, this.field1242);
        } else {
            var4 = this.field1333.method3541(var1, this.field1246, var2, this.field1242, this.field1335);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4590();
        this.field1222 = var4.field2716;
        int var5 = var4.field2839;
        class256 var6 = this.method2292(var4);
        if (this.field1333.field2144 == 1) {
            var6.field2809 = true;
        }
        if (this.field1266 == 0 || client.field523 < this.field1261 || client.field523 >= this.field1237) {
            var6.field2826 = 0;
        } else {
            var6.field2829 = this.field1262;
            var6.field2852 = this.field1264;
            var6.field2853 = this.field1236;
            var6.field2826 = this.field1266;
            var6.field2785 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dk.ay(I)Z")
    public final boolean method2240() {
        return this.field1333 != null;
    }

    @ObfuscatedName("dk.al(I)[I")
    public int[] method2495() {
        return this.field1334 == null ? this.field1333.method3547() : this.field1334.method8722();
    }

    @ObfuscatedName("dk.as(I)[S")
    public short[] method2476() {
        return this.field1334 == null ? this.field1333.method3549() : this.field1334.method8715();
    }

    @ObfuscatedName("dk.ag(IISI)V")
    public void method2482(int arg0, int arg1, short arg2) {
        if (this.field1334 == null) {
            this.field1334 = new class536(this.field1333);
        }
        this.field1334.method8716(arg0, arg1, arg2);
    }

    @ObfuscatedName("dk.ai([I[SI)V")
    public void method2478(int[] arg0, short[] arg1) {
        if (this.field1334 == null) {
            this.field1334 = new class536(this.field1333);
        }
        this.field1334.method8717(arg0, arg1);
    }

    @ObfuscatedName("dk.ax(I)V")
    public void method2477() {
        this.field1334 = null;
    }

    @ObfuscatedName("dk.ar(Lhg;I)V")
    public void method2480(class207 arg0) {
        this.field1337 = arg0;
    }

    @ObfuscatedName("dk.aj(I)Lhg;")
    public class207 method2481() {
        return this.field1337;
    }

    @ObfuscatedName("dk.au(Lhg;I)V")
    public void method2474(class207 arg0) {
        this.field1335 = arg0;
    }

    @ObfuscatedName("dk.ap(I)V")
    public void method2508() {
        this.field1337 = null;
    }

    @ObfuscatedName("dk.av(I)V")
    public void method2484() {
        this.field1335 = null;
    }
}
