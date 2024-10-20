package deob;

@ObfuscatedName("dx")
public final class class101 extends class96 {

    @ObfuscatedName("dx.au")
    public class196 field1327;

    @ObfuscatedName("dx.ae")
    public String field1331 = "";

    @ObfuscatedName("dx.at")
    public int field1329 = 31;

    @ObfuscatedName("dx.ac")
    public class516 field1330;

    @ObfuscatedName("dx.ai")
    public class195 field1332;

    @ObfuscatedName("dx.az")
    public static int field1326 = 1;

    @ObfuscatedName("dx.ap")
    public class195 field1333;

    @ObfuscatedName("dx.aa")
    public static int field1334 = 1;

    @ObfuscatedName("dx.au(Ljava/lang/String;I)V")
    public void method2464(String arg0) {
        this.field1331 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dx.ao(II)V")
    public void method2465(int arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("dx.at(II)Z")
    public boolean method2466(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1329 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dx.az(I)Ljava/lang/String;")
    public final String method2467() {
        if (!this.field1331.isEmpty()) {
            return this.field1331;
        }
        class196 var1 = this.field1327;
        if (var1.field2066 != null) {
            var1 = var1.method3409();
            if (var1 == null) {
                var1 = this.field1327;
            }
        }
        return var1.field2037;
    }

    @ObfuscatedName("dx.ap(ILin;I)V")
    public final void method2468(int arg0, class218 arg1) {
        int var3 = this.field1273[0];
        int var4 = this.field1270[0];
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
        if (this.field1243 != -1 && class209.method3394(this.field1243).field2327 == 1) {
            this.field1243 = -1;
        }
        if (this.field1246 < 9) {
            this.field1246++;
        }
        for (int var5 = this.field1246; var5 > 0; var5--) {
            this.field1273[var5] = this.field1273[var5 - 1];
            this.field1270[var5] = this.field1270[var5 - 1];
            this.field1271[var5] = this.field1271[var5 - 1];
        }
        this.field1273[0] = var3;
        this.field1270[0] = var4;
        this.field1271[0] = arg1;
    }

    @ObfuscatedName("dx.aa(IIZI)V")
    public final void method2469(int arg0, int arg1, boolean arg2) {
        if (this.field1243 != -1 && class209.method3394(this.field1243).field2327 == 1) {
            this.field1243 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1273[0];
            int var5 = arg1 - this.field1270[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1246 < 9) {
                    this.field1246++;
                }
                for (int var6 = this.field1246; var6 > 0; var6--) {
                    this.field1273[var6] = this.field1273[var6 - 1];
                    this.field1270[var6] = this.field1270[var6 - 1];
                    this.field1271[var6] = this.field1271[var6 - 1];
                }
                this.field1273[0] = arg0;
                this.field1270[0] = arg1;
                this.field1271[0] = class218.field2411;
                return;
            }
        }
        this.field1246 = 0;
        this.field1262 = 0;
        this.field1272 = 0;
        this.field1273[0] = arg0;
        this.field1270[0] = arg1;
        this.field1228 = this.field1273[0] * 128 + this.field1202 * 64;
        this.field1199 = this.field1270[0] * 128 + this.field1202 * 64;
    }

    @ObfuscatedName("dx.ae(I)Ljr;")
    public final class240 method1990() {
        if (this.field1327 == null) {
            return null;
        }
        class209 var1 = this.field1243 != -1 && this.field1260 == 0 ? class209.method3394(this.field1243) : null;
        class209 var2 = this.field1211 == -1 || this.field1211 == this.field1204 && var1 != null ? null : class209.method3394(this.field1211);
        Object var3 = null;
        class240 var4;
        if (this.field1332 != null && this.field1332.field2029) {
            var4 = Statics.field2132.field1129.method5543(var1, this.field1244, var2, this.field1198);
        } else {
            var4 = this.field1327.method3407(var1, this.field1244, var2, this.field1198, this.field1332);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4450();
        this.field1258 = var4.field2638;
        int var5 = var4.field2712;
        class240 var6 = this.method2277(var4);
        if (this.field1327.field2038 == 1) {
            var6.field2713 = true;
        }
        if (this.field1251 == 0 || client.field833 < this.field1259 || client.field833 >= this.field1201) {
            var6.field2778 = 0;
        } else {
            var6.field2772 = this.field1261;
            var6.field2740 = this.field1219;
            var6.field2738 = this.field1213;
            var6.field2778 = this.field1251;
            var6.field2779 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dx.am(I)Z")
    public final boolean method2220() {
        return this.field1327 != null;
    }

    @ObfuscatedName("dx.af(I)[I")
    public int[] method2470() {
        return this.field1330 == null ? this.field1327.method3414() : this.field1330.method8541();
    }

    @ObfuscatedName("dx.ad(S)[S")
    public short[] method2486() {
        return this.field1330 == null ? this.field1327.method3416() : this.field1330.method8542();
    }

    @ObfuscatedName("dx.aq(IISI)V")
    public void method2511(int arg0, int arg1, short arg2) {
        if (this.field1330 == null) {
            this.field1330 = new class516(this.field1327);
        }
        this.field1330.method8543(arg0, arg1, arg2);
    }

    @ObfuscatedName("dx.al([I[SI)V")
    public void method2473(int[] arg0, short[] arg1) {
        if (this.field1330 == null) {
            this.field1330 = new class516(this.field1327);
        }
        this.field1330.method8544(arg0, arg1);
    }

    @ObfuscatedName("dx.an(I)V")
    public void method2474() {
        this.field1330 = null;
    }

    @ObfuscatedName("dx.ar(Lhq;I)V")
    public void method2496(class195 arg0) {
        this.field1333 = arg0;
    }

    @ObfuscatedName("dx.ab(I)Lhq;")
    public class195 method2476() {
        return this.field1333;
    }

    @ObfuscatedName("dx.ag(Lhq;B)V")
    public void method2477(class195 arg0) {
        this.field1332 = arg0;
    }

    @ObfuscatedName("dx.ax(I)V")
    public void method2475() {
        this.field1333 = null;
    }

    @ObfuscatedName("dx.ah(B)V")
    public void method2479() {
        this.field1332 = null;
    }
}
