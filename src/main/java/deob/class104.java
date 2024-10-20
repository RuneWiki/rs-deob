package deob;

@ObfuscatedName("dd")
public final class class104 extends class98 {

    @ObfuscatedName("dd.ab")
    public class246 field1340;

    @ObfuscatedName("dd.ay")
    public String field1346 = "";

    @ObfuscatedName("dd.ax")
    public int field1339 = 31;

    @ObfuscatedName("dd.ao")
    public class550 field1338;

    @ObfuscatedName("dd.am")
    public class245 field1341;

    @ObfuscatedName("dd.ac")
    public static int field1342 = 1;

    @ObfuscatedName("dd.ae")
    public class245 field1343;

    @ObfuscatedName("dd.ad")
    public static int field1344 = 1;

    @ObfuscatedName("dd.as(Ljava/lang/String;I)V")
    public void method2638(String arg0) {
        this.field1346 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dd.aw(II)V")
    public void method2639(int arg0) {
        this.field1339 = arg0;
    }

    @ObfuscatedName("dd.af(II)Z")
    public boolean method2640(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1339 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dd.aa(I)Ljava/lang/String;")
    public final String method2641() {
        if (!this.field1346.isEmpty()) {
            return this.field1346;
        }
        class246 var1 = this.field1340;
        if (var1.field2582 != null) {
            var1 = var1.method4522();
            if (var1 == null) {
                var1 = this.field1340;
            }
        }
        return var1.field2570;
    }

    @ObfuscatedName("dd.ah(ILko;I)V")
    public final void method2661(int arg0, class275 arg1) {
        int var3 = this.field1251[0];
        int var4 = this.field1181[0];
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
        if (this.field1257 != -1 && class264.method3551(this.field1257).field2886 == 1) {
            this.field1257 = -1;
        }
        if (this.field1217 < 9) {
            this.field1217++;
        }
        for (int var5 = this.field1217; var5 > 0; var5--) {
            this.field1251[var5] = this.field1251[var5 - 1];
            this.field1181[var5] = this.field1181[var5 - 1];
            this.field1253[var5] = this.field1253[var5 - 1];
        }
        this.field1251[0] = var3;
        this.field1181[0] = var4;
        this.field1253[0] = arg1;
    }

    @ObfuscatedName("dd.ag(IIZB)V")
    public final void method2643(int arg0, int arg1, boolean arg2) {
        if (this.field1257 != -1 && class264.method3551(this.field1257).field2886 == 1) {
            this.field1257 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1251[0];
            int var5 = arg1 - this.field1181[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1217 < 9) {
                    this.field1217++;
                }
                for (int var6 = this.field1217; var6 > 0; var6--) {
                    this.field1251[var6] = this.field1251[var6 - 1];
                    this.field1181[var6] = this.field1181[var6 - 1];
                    this.field1253[var6] = this.field1253[var6 - 1];
                }
                this.field1251[0] = arg0;
                this.field1181[0] = arg1;
                this.field1253[0] = class275.field2984;
                return;
            }
        }
        this.field1217 = 0;
        this.field1256 = 0;
        this.field1254 = 0;
        this.field1251[0] = arg0;
        this.field1181[0] = arg1;
        this.field1249 = this.field1251[0] * 128 + this.field1184 * 64;
        this.field1180 = this.field1181[0] * 128 + this.field1184 * 64;
    }

    @ObfuscatedName("dd.ae(I)Lhr;")
    public final class197 method2088() {
        if (this.field1340 == null) {
            return null;
        }
        class264 var1 = this.field1257 != -1 && this.field1228 == 0 ? class264.method3551(this.field1257) : null;
        class264 var2 = this.field1208 == -1 || this.field1208 == this.field1186 && var1 != null ? null : class264.method3551(this.field1208);
        Object var3 = null;
        class197 var4;
        if (this.field1341 != null && this.field1341.field2563) {
            var4 = Statics.field2672.field1111.method6003(var1, this.field1226, var2, this.field1183);
        } else {
            var4 = this.field1340.method4543(var1, this.field1226, var2, this.field1183, this.field1341);
        }
        if (var4 == null) {
            return null;
        }
        var4.method3909();
        this.field1240 = var4.field2086;
        int var5 = var4.field2163;
        class197 var6 = this.method2458(var4);
        if (this.field1340.field2571 == 1) {
            var6.field2152 = true;
        }
        if (this.field1221 == 0 || client.field519 < this.field1245 || client.field519 >= this.field1242) {
            var6.field2227 = 0;
        } else {
            var6.field2224 = this.field1243;
            var6.field2195 = this.field1244;
            var6.field2226 = this.field1241;
            var6.field2227 = this.field1221;
            var6.field2228 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dd.bz(I)Z")
    public final boolean method2367() {
        return this.field1340 != null;
    }

    @ObfuscatedName("dd.av(I)[I")
    public int[] method2644() {
        return this.field1338 == null ? this.field1340.method4553() : this.field1338.method9050();
    }

    @ObfuscatedName("dd.ar(I)[S")
    public short[] method2646() {
        return this.field1338 == null ? this.field1340.method4533() : this.field1338.method9051();
    }

    @ObfuscatedName("dd.ap(IISI)V")
    public void method2642(int arg0, int arg1, short arg2) {
        if (this.field1338 == null) {
            this.field1338 = new class550(this.field1340);
        }
        this.field1338.method9054(arg0, arg1, arg2);
    }

    @ObfuscatedName("dd.ak([I[SI)V")
    public void method2647(int[] arg0, short[] arg1) {
        if (this.field1338 == null) {
            this.field1338 = new class550(this.field1340);
        }
        this.field1338.method9053(arg0, arg1);
    }

    @ObfuscatedName("dd.ai(I)V")
    public void method2648() {
        this.field1338 = null;
    }

    @ObfuscatedName("dd.at(Ljl;I)V")
    public void method2649(class245 arg0) {
        this.field1343 = arg0;
    }

    @ObfuscatedName("dd.az(B)Ljl;")
    public class245 method2666() {
        return this.field1343;
    }

    @ObfuscatedName("dd.bg(Ljl;I)V")
    public void method2655(class245 arg0) {
        this.field1341 = arg0;
    }

    @ObfuscatedName("dd.bj(I)V")
    public void method2665() {
        this.field1343 = null;
    }

    @ObfuscatedName("dd.bc(B)V")
    public void method2652() {
        this.field1341 = null;
    }

    @ObfuscatedName("dd.df(I)I")
    public int method2423() {
        return this.field1340.field2584 == -1 ? this.field1240 : this.field1340.field2584;
    }
}
