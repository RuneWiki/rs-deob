package deob;

@ObfuscatedName("ev")
public final class class106 extends class100 {

    @ObfuscatedName("ev.ap")
    public class195 field1372;

    @ObfuscatedName("ev.aw")
    public int field1373;

    @ObfuscatedName("ev.ak")
    public String field1371 = "";

    @ObfuscatedName("ev.ai")
    public int field1378 = 31;

    @ObfuscatedName("ev.ay")
    public class559 field1376;

    @ObfuscatedName("ev.as")
    public class194 field1374;

    @ObfuscatedName("ev.ae")
    public static int field1370 = 1;

    @ObfuscatedName("ev.am")
    public class194 field1369;

    @ObfuscatedName("ev.at")
    public static int field1377 = 1;

    @ObfuscatedName("ev.af(Ljava/lang/String;I)V")
    public void method2854(String arg0) {
        this.field1371 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("ev.ar(IB)V")
    public void method2855(int arg0) {
        this.field1378 = arg0;
    }

    @ObfuscatedName("ev.ab(II)Z")
    public boolean method2874(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1378 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.az(B)Ljava/lang/String;")
    public final String method2857() {
        if (!this.field1371.isEmpty()) {
            return this.field1371;
        }
        class195 var1 = this.field1372;
        if (var1.field2042 != null) {
            var1 = var1.method3733();
            if (var1 == null) {
                var1 = this.field1372;
            }
        }
        return var1.field2010;
    }

    @ObfuscatedName("ev.ag(ILkk;I)V")
    public final void method2858(int arg0, class276 arg1) {
        int var3 = this.field1288[0];
        int var4 = this.field1234[0];
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
        if (this.field1275 != -1 && class213.method6692(this.field1275).field2328 == 1) {
            this.field1275 = -1;
        }
        if (this.field1256 < 9) {
            this.field1256++;
        }
        for (int var5 = this.field1256; var5 > 0; var5--) {
            this.field1288[var5] = this.field1288[var5 - 1];
            this.field1234[var5] = this.field1234[var5 - 1];
            this.field1230[var5] = this.field1230[var5 - 1];
        }
        this.field1288[0] = var3;
        this.field1234[0] = var4;
        this.field1230[0] = arg1;
    }

    @ObfuscatedName("ev.ad(IIZI)V")
    public final void method2859(int arg0, int arg1, boolean arg2) {
        if (this.field1275 != -1 && class213.method6692(this.field1275).field2328 == 1) {
            this.field1275 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1288[0];
            int var5 = arg1 - this.field1234[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1256 < 9) {
                    this.field1256++;
                }
                for (int var6 = this.field1256; var6 > 0; var6--) {
                    this.field1288[var6] = this.field1288[var6 - 1];
                    this.field1234[var6] = this.field1234[var6 - 1];
                    this.field1230[var6] = this.field1230[var6 - 1];
                }
                this.field1288[0] = arg0;
                this.field1234[0] = arg1;
                this.field1230[0] = class276.field3049;
                return;
            }
        }
        this.field1256 = 0;
        this.field1292 = 0;
        this.field1264 = 0;
        this.field1288[0] = arg0;
        this.field1234[0] = arg1;
        this.field1247 = this.field1288[0] * 128 + this.field1221 * 64;
        this.field1270 = this.field1234[0] * 128 + this.field1221 * 64;
    }

    @ObfuscatedName("ev.au(I)Ljy;")
    public final class256 method2245() {
        if (this.field1372 == null) {
            return null;
        }
        class213 var1 = this.field1275 != -1 && this.field1235 == 0 ? class213.method6692(this.field1275) : null;
        class213 var2 = this.field1217 == -1 || this.field1223 == this.field1217 && var1 != null ? null : class213.method6692(this.field1217);
        Object var3 = null;
        class256 var4;
        if (this.field1374 != null && this.field1374.field2003) {
            var4 = Statics.field3772.field1136.method6338(var1, this.field1263, var2, this.field1236);
        } else {
            var4 = this.field1372.method3775(var1, this.field1263, var2, this.field1236, this.field1374);
        }
        if (var4 == null) {
            return null;
        }
        var4.method5013();
        this.field1294 = var4.field2745;
        int var5 = var4.field2822;
        class256 var6 = this.method2632(var4);
        if (this.field1372.field2014 == 1) {
            var6.field2842 = true;
        }
        if (this.field1283 == 0 || client.field518 < this.field1278 || client.field518 >= this.field1279) {
            var6.field2850 = 0;
        } else {
            var6.field2883 = this.field1277;
            var6.field2834 = this.field1281;
            var6.field2828 = this.field1282;
            var6.field2850 = this.field1283;
            var6.field2887 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("ev.bj(I)Z")
    public final boolean method2526() {
        return this.field1372 != null;
    }

    @ObfuscatedName("ev.ac(B)[I")
    public int[] method2872() {
        return this.field1376 == null ? this.field1372.method3738() : this.field1376.method9550();
    }

    @ObfuscatedName("ev.av(B)[S")
    public short[] method2861() {
        return this.field1376 == null ? this.field1372.method3740() : this.field1376.method9544();
    }

    @ObfuscatedName("ev.ax(IISI)V")
    public void method2885(int arg0, int arg1, short arg2) {
        if (this.field1376 == null) {
            this.field1376 = new class559(this.field1372);
        }
        this.field1376.method9546(arg0, arg1, arg2);
    }

    @ObfuscatedName("ev.aq([I[SB)V")
    public void method2897(int[] arg0, short[] arg1) {
        if (this.field1376 == null) {
            this.field1376 = new class559(this.field1372);
        }
        this.field1376.method9547(arg0, arg1);
    }

    @ObfuscatedName("ev.al(I)V")
    public void method2864() {
        this.field1376 = null;
    }

    @ObfuscatedName("ev.aa(Lhn;B)V")
    public void method2865(class194 arg0) {
        this.field1369 = arg0;
    }

    @ObfuscatedName("ev.ah(B)Lhn;")
    public class194 method2866() {
        return this.field1369;
    }

    @ObfuscatedName("ev.bh(Lhn;S)V")
    public void method2867(class194 arg0) {
        this.field1374 = arg0;
    }

    @ObfuscatedName("ev.bv(S)V")
    public void method2868() {
        this.field1369 = null;
    }

    @ObfuscatedName("ev.bx(I)V")
    public void method2869() {
        this.field1374 = null;
    }

    @ObfuscatedName("ev.dg(I)I")
    public int method2630() {
        return this.field1372.field2051 == -1 ? this.field1294 : this.field1372.field2051;
    }

    @ObfuscatedName("ev.ak(B)I")
    public int method1221() {
        return this.field1373;
    }
}
