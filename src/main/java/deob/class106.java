package deob;

@ObfuscatedName("ea")
public final class class106 extends class100 {

    @ObfuscatedName("ea.ac")
    public class195 field1386;

    @ObfuscatedName("ea.ae")
    public int field1381;

    @ObfuscatedName("ea.ag")
    public String field1382 = "";

    @ObfuscatedName("ea.ax")
    public int field1391 = 31;

    @ObfuscatedName("ea.aq")
    public class552 field1385;

    @ObfuscatedName("ea.af")
    public class194 field1388;

    @ObfuscatedName("ea.at")
    public static int field1390 = 1;

    @ObfuscatedName("ea.au")
    public class194 field1387;

    @ObfuscatedName("ea.ar")
    public static int field1389 = 1;

    @ObfuscatedName("ea.az(Ljava/lang/String;I)V")
    public void method2764(String arg0) {
        this.field1382 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("ea.aa(IB)V")
    public void method2781(int arg0) {
        this.field1391 = arg0;
    }

    @ObfuscatedName("ea.ai(II)Z")
    public boolean method2738(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1391 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ea.ao(I)Ljava/lang/String;")
    public final String method2739() {
        if (!this.field1382.isEmpty()) {
            return this.field1382;
        }
        class195 var1 = this.field1386;
        if (var1.field2041 != null) {
            var1 = var1.method3603();
            if (var1 == null) {
                var1 = this.field1386;
            }
        }
        return var1.field2009;
    }

    @ObfuscatedName("ea.as(ILkk;I)V")
    public final void method2740(int arg0, class277 arg1) {
        int var3 = this.field1295[0];
        int var4 = this.field1296[0];
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
        if (this.field1269 != -1 && class213.method2555(this.field1269).field2328 == 1) {
            this.field1269 = -1;
        }
        if (this.field1294 < 9) {
            this.field1294++;
        }
        for (int var5 = this.field1294; var5 > 0; var5--) {
            this.field1295[var5] = this.field1295[var5 - 1];
            this.field1296[var5] = this.field1296[var5 - 1];
            this.field1290[var5] = this.field1290[var5 - 1];
        }
        this.field1295[0] = var3;
        this.field1296[0] = var4;
        this.field1290[0] = arg1;
    }

    @ObfuscatedName("ea.ay(IIZI)V")
    public final void method2735(int arg0, int arg1, boolean arg2) {
        if (this.field1269 != -1 && class213.method2555(this.field1269).field2328 == 1) {
            this.field1269 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1295[0];
            int var5 = arg1 - this.field1296[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1294 < 9) {
                    this.field1294++;
                }
                for (int var6 = this.field1294; var6 > 0; var6--) {
                    this.field1295[var6] = this.field1295[var6 - 1];
                    this.field1296[var6] = this.field1296[var6 - 1];
                    this.field1290[var6] = this.field1290[var6 - 1];
                }
                this.field1295[0] = arg0;
                this.field1296[0] = arg1;
                this.field1290[0] = class277.field3037;
                return;
            }
        }
        this.field1294 = 0;
        this.field1299 = 0;
        this.field1291 = 0;
        this.field1295[0] = arg0;
        this.field1296[0] = arg1;
        this.field1300 = this.field1295[0] * 128 + this.field1228 * 64;
        this.field1225 = this.field1296[0] * 128 + this.field1228 * 64;
    }

    @ObfuscatedName("ea.ad(B)Ljm;")
    public final class256 method2182() {
        if (this.field1386 == null) {
            return null;
        }
        class213 var1 = this.field1269 != -1 && this.field1282 == 0 ? class213.method2555(this.field1269) : null;
        class213 var2 = this.field1265 == -1 || this.field1265 == this.field1230 && var1 != null ? null : class213.method2555(this.field1265);
        Object var3 = null;
        class256 var4;
        if (this.field1388 != null && this.field1388.field1998) {
            var4 = Statics.field4826.field1170.method6177(var1, this.field1270, var2, this.field1266);
        } else {
            var4 = this.field1386.method3600(var1, this.field1270, var2, this.field1266, this.field1388);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4814();
        this.field1284 = var4.field2736;
        int var5 = var4.field2807;
        class256 var6 = this.method2524(var4);
        if (this.field1386.field2010 == 1) {
            var6.field2797 = true;
        }
        if (this.field1286 == 0 || client.field609 < this.field1285 || client.field609 >= this.field1259) {
            var6.field2806 = 0;
        } else {
            var6.field2829 = this.field1260;
            var6.field2833 = this.field1288;
            var6.field2827 = this.field1289;
            var6.field2806 = this.field1286;
            var6.field2835 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("ea.bx(I)Z")
    public final boolean method2443() {
        return this.field1386 != null;
    }

    @ObfuscatedName("ea.aj(B)[I")
    public int[] method2795() {
        return this.field1385 == null ? this.field1386.method3608() : this.field1385.method9221();
    }

    @ObfuscatedName("ea.av(I)[S")
    public short[] method2743() {
        return this.field1385 == null ? this.field1386.method3610() : this.field1385.method9228();
    }

    @ObfuscatedName("ea.aw(IISB)V")
    public void method2744(int arg0, int arg1, short arg2) {
        if (this.field1385 == null) {
            this.field1385 = new class552(this.field1386);
        }
        this.field1385.method9223(arg0, arg1, arg2);
    }

    @ObfuscatedName("ea.an([I[SB)V")
    public void method2736(int[] arg0, short[] arg1) {
        if (this.field1385 == null) {
            this.field1385 = new class552(this.field1386);
        }
        this.field1385.method9224(arg0, arg1);
    }

    @ObfuscatedName("ea.ak(I)V")
    public void method2745() {
        this.field1385 = null;
    }

    @ObfuscatedName("ea.bn(Lhp;I)V")
    public void method2787(class194 arg0) {
        this.field1387 = arg0;
    }

    @ObfuscatedName("ea.bh(I)Lhp;")
    public class194 method2792() {
        return this.field1387;
    }

    @ObfuscatedName("ea.bd(Lhp;I)V")
    public void method2748(class194 arg0) {
        this.field1388 = arg0;
    }

    @ObfuscatedName("ea.bf(I)V")
    public void method2749() {
        this.field1387 = null;
    }

    @ObfuscatedName("ea.bm(I)V")
    public void method2750() {
        this.field1388 = null;
    }

    @ObfuscatedName("ea.dl(I)I")
    public int method2523() {
        return this.field1386.field2050 == -1 ? this.field1284 : this.field1386.field2050;
    }

    @ObfuscatedName("ea.ag(I)I")
    public int method1202() {
        return this.field1381;
    }
}
