package deob;

@ObfuscatedName("de")
public final class class100 extends class95 {

    @ObfuscatedName("de.at")
    public class195 field1292;

    @ObfuscatedName("de.av")
    public String field1286 = "";

    @ObfuscatedName("de.ax")
    public int field1285 = 31;

    @ObfuscatedName("de.ap")
    public class502 field1287;

    @ObfuscatedName("de.ab")
    public class194 field1288;

    @ObfuscatedName("de.ak")
    public static int field1282 = 1;

    @ObfuscatedName("de.ae")
    public class194 field1289;

    @ObfuscatedName("de.af")
    public static int field1290 = 1;

    @ObfuscatedName("de.at(Ljava/lang/String;I)V")
    public void method2436(String arg0) {
        this.field1286 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("de.av(IB)V")
    public void method2488(int arg0) {
        this.field1285 = arg0;
    }

    @ObfuscatedName("de.as(II)Z")
    public boolean method2454(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1285 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("de.ax(B)Ljava/lang/String;")
    public final String method2439() {
        if (!this.field1286.isEmpty()) {
            return this.field1286;
        }
        class195 var1 = this.field1292;
        if (var1.field2022 != null) {
            var1 = var1.method3404();
            if (var1 == null) {
                var1 = this.field1292;
            }
        }
        return var1.field1998;
    }

    @ObfuscatedName("de.ae(ILie;I)V")
    public final void method2440(int arg0, class217 arg1) {
        int var3 = this.field1223[0];
        int var4 = this.field1193[0];
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
        if (this.field1217 != -1 && class208.method4648(this.field1217).field2275 == 1) {
            this.field1217 = -1;
        }
        if (this.field1222 < 9) {
            this.field1222++;
        }
        for (int var5 = this.field1222; var5 > 0; var5--) {
            this.field1223[var5] = this.field1223[var5 - 1];
            this.field1193[var5] = this.field1193[var5 - 1];
            this.field1213[var5] = this.field1213[var5 - 1];
        }
        this.field1223[0] = var3;
        this.field1193[0] = var4;
        this.field1213[0] = arg1;
    }

    @ObfuscatedName("de.af(IIZI)V")
    public final void method2438(int arg0, int arg1, boolean arg2) {
        if (this.field1217 != -1 && class208.method4648(this.field1217).field2275 == 1) {
            this.field1217 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1223[0];
            int var5 = arg1 - this.field1193[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1222 < 9) {
                    this.field1222++;
                }
                for (int var6 = this.field1222; var6 > 0; var6--) {
                    this.field1223[var6] = this.field1223[var6 - 1];
                    this.field1193[var6] = this.field1193[var6 - 1];
                    this.field1213[var6] = this.field1213[var6 - 1];
                }
                this.field1223[0] = arg0;
                this.field1193[0] = arg1;
                this.field1213[0] = class217.field2396;
                return;
            }
        }
        this.field1222 = 0;
        this.field1227 = 0;
        this.field1226 = 0;
        this.field1223[0] = arg0;
        this.field1193[0] = arg1;
        this.field1163 = this.field1223[0] * 128 + this.field1156 * 64;
        this.field1153 = this.field1193[0] * 128 + this.field1156 * 64;
    }

    @ObfuscatedName("de.an(I)Ljd;")
    public final class239 method1952() {
        if (this.field1292 == null) {
            return null;
        }
        class208 var1 = this.field1217 != -1 && this.field1208 == 0 ? class208.method4648(this.field1217) : null;
        class208 var2 = this.field1152 == -1 || this.field1158 == this.field1152 && var1 != null ? null : class208.method4648(this.field1152);
        Object var3 = null;
        class239 var4;
        if (this.field1288 != null && this.field1288.field1991) {
            var4 = Statics.field971.field1100.method5441(var1, this.field1198, var2, this.field1161);
        } else {
            var4 = this.field1292.method3370(var1, this.field1198, var2, this.field1161, this.field1288);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4492();
        this.field1205 = var4.field2621;
        int var5 = var4.field2696;
        class239 var6 = this.method2252(var4);
        if (this.field1292.field2029 == 1) {
            var6.field2737 = true;
        }
        if (this.field1218 == 0 || client.field506 < this.field1171 || client.field506 >= this.field1214) {
            var6.field2761 = 0;
        } else {
            var6.field2758 = this.field1165;
            var6.field2759 = this.field1216;
            var6.field2743 = this.field1197;
            var6.field2761 = this.field1218;
            var6.field2762 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("de.az(B)Z")
    public final boolean method2192() {
        return this.field1292 != null;
    }

    @ObfuscatedName("de.ao(S)[I")
    public int[] method2442() {
        return this.field1287 == null ? this.field1292.method3378() : this.field1287.method8380();
    }

    @ObfuscatedName("de.aa(I)[S")
    public short[] method2443() {
        return this.field1287 == null ? this.field1292.method3385() : this.field1287.method8381();
    }

    @ObfuscatedName("de.aj(IISB)V")
    public void method2444(int arg0, int arg1, short arg2) {
        if (this.field1287 == null) {
            this.field1287 = new class502(this.field1292);
        }
        this.field1287.method8388(arg0, arg1, arg2);
    }

    @ObfuscatedName("de.ad([I[SB)V")
    public void method2445(int[] arg0, short[] arg1) {
        if (this.field1287 == null) {
            this.field1287 = new class502(this.field1292);
        }
        this.field1287.method8383(arg0, arg1);
    }

    @ObfuscatedName("de.ac(I)V")
    public void method2446() {
        this.field1287 = null;
    }

    @ObfuscatedName("de.ag(Lhs;I)V")
    public void method2455(class194 arg0) {
        this.field1289 = arg0;
    }

    @ObfuscatedName("de.ar(I)Lhs;")
    public class194 method2461() {
        return this.field1289;
    }

    @ObfuscatedName("de.ah(Lhs;I)V")
    public void method2449(class194 arg0) {
        this.field1288 = arg0;
    }

    @ObfuscatedName("de.au(I)V")
    public void method2450() {
        this.field1289 = null;
    }

    @ObfuscatedName("de.ai(B)V")
    public void method2451() {
        this.field1288 = null;
    }
}
