package deob;

@ObfuscatedName("dv")
public final class class104 extends class98 {

    @ObfuscatedName("dv.ak")
    public class210 field1360;

    @ObfuscatedName("dv.al")
    public String field1366 = "";

    @ObfuscatedName("dv.az")
    public int field1362 = 31;

    @ObfuscatedName("dv.af")
    public class547 field1363;

    @ObfuscatedName("dv.aa")
    public class209 field1364;

    @ObfuscatedName("dv.at")
    public static int field1365 = 1;

    @ObfuscatedName("dv.ab")
    public class209 field1361;

    @ObfuscatedName("dv.ac")
    public static int field1367 = 1;

    @ObfuscatedName("dv.aq(Ljava/lang/String;B)V")
    public void method2535(String arg0) {
        this.field1366 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dv.ap(II)V")
    public void method2553(int arg0) {
        this.field1362 = arg0;
    }

    @ObfuscatedName("dv.ae(II)Z")
    public boolean method2568(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1362 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dv.ax(I)Ljava/lang/String;")
    public final String method2538() {
        if (!this.field1366.isEmpty()) {
            return this.field1366;
        }
        class210 var1 = this.field1360;
        if (var1.field2152 != null) {
            var1 = var1.method3664();
            if (var1 == null) {
                var1 = this.field1360;
            }
        }
        return var1.field2138;
    }

    @ObfuscatedName("dv.ay(ILjv;I)V")
    public final void method2539(int arg0, class238 arg1) {
        int var3 = this.field1230[0];
        int var4 = this.field1277[0];
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
        if (this.field1224 != -1 && class227.method4744(this.field1224).field2423 == 1) {
            this.field1224 = -1;
        }
        if (this.field1275 < 9) {
            this.field1275++;
        }
        for (int var5 = this.field1275; var5 > 0; var5--) {
            this.field1230[var5] = this.field1230[var5 - 1];
            this.field1277[var5] = this.field1277[var5 - 1];
            this.field1278[var5] = this.field1278[var5 - 1];
        }
        this.field1230[0] = var3;
        this.field1277[0] = var4;
        this.field1278[0] = arg1;
    }

    @ObfuscatedName("dv.au(IIZI)V")
    public final void method2540(int arg0, int arg1, boolean arg2) {
        if (this.field1224 != -1 && class227.method4744(this.field1224).field2423 == 1) {
            this.field1224 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1230[0];
            int var5 = arg1 - this.field1277[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1275 < 9) {
                    this.field1275++;
                }
                for (int var6 = this.field1275; var6 > 0; var6--) {
                    this.field1230[var6] = this.field1230[var6 - 1];
                    this.field1277[var6] = this.field1277[var6 - 1];
                    this.field1278[var6] = this.field1278[var6 - 1];
                }
                this.field1230[0] = arg0;
                this.field1277[0] = arg1;
                this.field1278[0] = class238.field2526;
                return;
            }
        }
        this.field1275 = 0;
        this.field1227 = 0;
        this.field1279 = 0;
        this.field1230[0] = arg0;
        this.field1277[0] = arg1;
        this.field1215 = this.field1230[0] * 128 + this.field1209 * 64;
        this.field1276 = this.field1277[0] * 128 + this.field1209 * 64;
    }

    @ObfuscatedName("dv.ah(I)Lkb;")
    public final class264 method2007() {
        if (this.field1360 == null) {
            return null;
        }
        class227 var1 = this.field1224 != -1 && this.field1253 == 0 ? class227.method4744(this.field1224) : null;
        class227 var2 = this.field1246 == -1 || this.field1246 == this.field1211 && var1 != null ? null : class227.method4744(this.field1246);
        Object var3 = null;
        class264 var4;
        if (this.field1364 != null && this.field1364.field2113) {
            var4 = Statics.field84.field1157.method5977(var1, this.field1251, var2, this.field1272);
        } else {
            var4 = this.field1360.method3661(var1, this.field1251, var2, this.field1272, this.field1364);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4806();
        this.field1280 = var4.field2801;
        int var5 = var4.field2878;
        class264 var6 = this.method2334(var4);
        if (this.field1360.field2121 == 1) {
            var6.field2898 = true;
        }
        if (this.field1271 == 0 || client.field821 < this.field1266 || client.field821 >= this.field1267) {
            var6.field2942 = 0;
        } else {
            var6.field2867 = this.field1268;
            var6.field2940 = this.field1269;
            var6.field2941 = this.field1270;
            var6.field2942 = this.field1271;
            var6.field2892 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dv.bs(I)Z")
    public final boolean method2272() {
        return this.field1360 != null;
    }

    @ObfuscatedName("dv.as(B)[I")
    public int[] method2542() {
        return this.field1363 == null ? this.field1360.method3657() : this.field1363.method9036();
    }

    @ObfuscatedName("dv.aw(I)[S")
    public short[] method2543() {
        return this.field1363 == null ? this.field1360.method3672() : this.field1363.method9033();
    }

    @ObfuscatedName("dv.ad(IISI)V")
    public void method2544(int arg0, int arg1, short arg2) {
        if (this.field1363 == null) {
            this.field1363 = new class547(this.field1360);
        }
        this.field1363.method9034(arg0, arg1, arg2);
    }

    @ObfuscatedName("dv.ai([I[SI)V")
    public void method2545(int[] arg0, short[] arg1) {
        if (this.field1363 == null) {
            this.field1363 = new class547(this.field1360);
        }
        this.field1363.method9035(arg0, arg1);
    }

    @ObfuscatedName("dv.an(I)V")
    public void method2546() {
        this.field1363 = null;
    }

    @ObfuscatedName("dv.am(Lio;I)V")
    public void method2567(class209 arg0) {
        this.field1361 = arg0;
    }

    @ObfuscatedName("dv.ar(S)Lio;")
    public class209 method2548() {
        return this.field1361;
    }

    @ObfuscatedName("dv.ag(Lio;I)V")
    public void method2549(class209 arg0) {
        this.field1364 = arg0;
    }

    @ObfuscatedName("dv.bf(I)V")
    public void method2550() {
        this.field1361 = null;
    }

    @ObfuscatedName("dv.bo(B)V")
    public void method2563() {
        this.field1364 = null;
    }
}
