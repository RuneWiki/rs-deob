package deob;

@ObfuscatedName("dx")
public final class class102 extends class97 {

    @ObfuscatedName("dx.aq")
    public class190 field1331;

    @ObfuscatedName("dx.aw")
    public String field1332 = "";

    @ObfuscatedName("dx.ai")
    public int field1334 = 31;

    @ObfuscatedName("dx.ar")
    public class535 field1336;

    @ObfuscatedName("dx.as")
    public class189 field1335;

    @ObfuscatedName("dx.aa")
    public static int field1337 = 1;

    @ObfuscatedName("dx.az")
    public class189 field1338;

    @ObfuscatedName("dx.ao")
    public static int field1339 = 1;

    @ObfuscatedName("dx.aq(Ljava/lang/String;I)V")
    public void method2538(String arg0) {
        this.field1332 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dx.al(IB)V")
    public void method2539(int arg0) {
        this.field1334 = arg0;
    }

    @ObfuscatedName("dx.ai(II)Z")
    public boolean method2545(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1334 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dx.az(S)Ljava/lang/String;")
    public final String method2550() {
        if (!this.field1332.isEmpty()) {
            return this.field1332;
        }
        class190 var1 = this.field1331;
        if (var1.field2001 != null) {
            var1 = var1.method3398();
            if (var1 == null) {
                var1 = this.field1331;
            }
        }
        return var1.field1969;
    }

    @ObfuscatedName("dx.ao(ILip;B)V")
    public final void method2542(int arg0, class234 arg1) {
        int var3 = this.field1235[0];
        int var4 = this.field1278[0];
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
        if (this.field1251 != -1 && class207.method3902(this.field1251).field2274 == 1) {
            this.field1251 = -1;
        }
        if (this.field1276 < 9) {
            this.field1276++;
        }
        for (int var5 = this.field1276; var5 > 0; var5--) {
            this.field1235[var5] = this.field1235[var5 - 1];
            this.field1278[var5] = this.field1278[var5 - 1];
            this.field1274[var5] = this.field1274[var5 - 1];
        }
        this.field1235[0] = var3;
        this.field1278[0] = var4;
        this.field1274[0] = arg1;
    }

    @ObfuscatedName("dx.au(IIZB)V")
    public final void method2537(int arg0, int arg1, boolean arg2) {
        if (this.field1251 != -1 && class207.method3902(this.field1251).field2274 == 1) {
            this.field1251 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1235[0];
            int var5 = arg1 - this.field1278[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1276 < 9) {
                    this.field1276++;
                }
                for (int var6 = this.field1276; var6 > 0; var6--) {
                    this.field1235[var6] = this.field1235[var6 - 1];
                    this.field1278[var6] = this.field1278[var6 - 1];
                    this.field1274[var6] = this.field1274[var6 - 1];
                }
                this.field1235[0] = arg0;
                this.field1278[0] = arg1;
                this.field1274[0] = class234.field2471;
                return;
            }
        }
        this.field1276 = 0;
        this.field1281 = 0;
        this.field1280 = 0;
        this.field1235[0] = arg0;
        this.field1278[0] = arg1;
        this.field1208 = this.field1235[0] * 128 + this.field1213 * 64;
        this.field1253 = this.field1278[0] * 128 + this.field1213 * 64;
    }

    @ObfuscatedName("dx.aw(I)Lkz;")
    public final class285 method2016() {
        if (this.field1331 == null) {
            return null;
        }
        class207 var1 = this.field1251 != -1 && this.field1254 == 0 ? class207.method3902(this.field1251) : null;
        class207 var2 = this.field1247 == -1 || this.field1247 == this.field1212 && var1 != null ? null : class207.method3902(this.field1247);
        Object var3 = null;
        class285 var4;
        if (this.field1335 != null && this.field1335.field1957) {
            var4 = Statics.field1858.field1158.method5837(var1, this.field1231, var2, this.field1248);
        } else {
            var4 = this.field1331.method3372(var1, this.field1231, var2, this.field1248, this.field1335);
        }
        if (var4 == null) {
            return null;
        }
        var4.method5204();
        this.field1207 = var4.field2924;
        int var5 = var4.field2994;
        class285 var6 = this.method2355(var4);
        if (this.field1331.field1986 == 1) {
            var6.field3028 = true;
        }
        if (this.field1256 == 0 || client.field536 < this.field1263 || client.field536 >= this.field1279) {
            var6.field3059 = 0;
        } else {
            var6.field3056 = this.field1269;
            var6.field3057 = this.field1270;
            var6.field3058 = this.field1277;
            var6.field3059 = this.field1256;
            var6.field3060 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dx.ad(S)Z")
    public final boolean method2289() {
        return this.field1331 != null;
    }

    @ObfuscatedName("dx.ak(I)[I")
    public int[] method2591() {
        return this.field1336 == null ? this.field1331.method3371() : this.field1336.method8833();
    }

    @ObfuscatedName("dx.ah(I)[S")
    public short[] method2598() {
        return this.field1336 == null ? this.field1331.method3414() : this.field1336.method8826();
    }

    @ObfuscatedName("dx.aj(IISI)V")
    public void method2546(int arg0, int arg1, short arg2) {
        if (this.field1336 == null) {
            this.field1336 = new class535(this.field1331);
        }
        this.field1336.method8827(arg0, arg1, arg2);
    }

    @ObfuscatedName("dx.af([I[SI)V")
    public void method2547(int[] arg0, short[] arg1) {
        if (this.field1336 == null) {
            this.field1336 = new class535(this.field1331);
        }
        this.field1336.method8828(arg0, arg1);
    }

    @ObfuscatedName("dx.ax(I)V")
    public void method2548() {
        this.field1336 = null;
    }

    @ObfuscatedName("dx.an(Lht;I)V")
    public void method2589(class189 arg0) {
        this.field1338 = arg0;
    }

    @ObfuscatedName("dx.ag(B)Lht;")
    public class189 method2549() {
        return this.field1338;
    }

    @ObfuscatedName("dx.am(Lht;B)V")
    public void method2579(class189 arg0) {
        this.field1335 = arg0;
    }

    @ObfuscatedName("dx.at(I)V")
    public void method2551() {
        this.field1338 = null;
    }

    @ObfuscatedName("dx.ay(I)V")
    public void method2552() {
        this.field1335 = null;
    }
}
