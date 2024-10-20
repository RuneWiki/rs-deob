package deob;

@ObfuscatedName("dn")
public final class class101 extends class96 {

    @ObfuscatedName("dn.at")
    public class189 field1311;

    @ObfuscatedName("dn.ah")
    public String field1307 = "";

    @ObfuscatedName("dn.ao")
    public int field1309 = 31;

    @ObfuscatedName("dn.ab")
    public class528 field1310;

    @ObfuscatedName("dn.au")
    public class188 field1314;

    @ObfuscatedName("dn.aa")
    public static int field1312 = 1;

    @ObfuscatedName("dn.ac")
    public class188 field1313;

    @ObfuscatedName("dn.al")
    public static int field1306 = 1;

    @ObfuscatedName("dn.at(Ljava/lang/String;I)V")
    public void method2577(String arg0) {
        this.field1307 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dn.ar(II)V")
    public void method2531(int arg0) {
        this.field1309 = arg0;
    }

    @ObfuscatedName("dn.ao(II)Z")
    public boolean method2532(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1309 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dn.ab(B)Ljava/lang/String;")
    public final String method2533() {
        if (!this.field1307.isEmpty()) {
            return this.field1307;
        }
        class189 var1 = this.field1311;
        if (var1.field1958 != null) {
            var1 = var1.method3385();
            if (var1 == null) {
                var1 = this.field1311;
            }
        }
        return var1.field1926;
    }

    @ObfuscatedName("dn.az(ILiz;I)V")
    public final void method2535(int arg0, class229 arg1) {
        int var3 = this.field1243[0];
        int var4 = this.field1244[0];
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
        if (this.field1229 != -1 && class205.method2129(this.field1229).field2206 == 1) {
            this.field1229 = -1;
        }
        if (this.field1242 < 9) {
            this.field1242++;
        }
        for (int var5 = this.field1242; var5 > 0; var5--) {
            this.field1243[var5] = this.field1243[var5 - 1];
            this.field1244[var5] = this.field1244[var5 - 1];
            this.field1245[var5] = this.field1245[var5 - 1];
        }
        this.field1243[0] = var3;
        this.field1244[0] = var4;
        this.field1245[0] = arg1;
    }

    @ObfuscatedName("dn.ap(IIZB)V")
    public final void method2566(int arg0, int arg1, boolean arg2) {
        if (this.field1229 != -1 && class205.method2129(this.field1229).field2206 == 1) {
            this.field1229 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1243[0];
            int var5 = arg1 - this.field1244[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1242 < 9) {
                    this.field1242++;
                }
                for (int var6 = this.field1242; var6 > 0; var6--) {
                    this.field1243[var6] = this.field1243[var6 - 1];
                    this.field1244[var6] = this.field1244[var6 - 1];
                    this.field1245[var6] = this.field1245[var6 - 1];
                }
                this.field1243[0] = arg0;
                this.field1244[0] = arg1;
                this.field1245[0] = class229.field2410;
                return;
            }
        }
        this.field1242 = 0;
        this.field1221 = 0;
        this.field1246 = 0;
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        this.field1247 = this.field1243[0] * 128 + this.field1199 * 64;
        this.field1173 = this.field1244[0] * 128 + this.field1199 * 64;
    }

    @ObfuscatedName("dn.ah(B)Lka;")
    public final class280 method2019() {
        if (this.field1311 == null) {
            return null;
        }
        class205 var1 = this.field1229 != -1 && this.field1220 == 0 ? class205.method2129(this.field1229) : null;
        class205 var2 = this.field1213 == -1 || this.field1213 == this.field1178 && var1 != null ? null : class205.method2129(this.field1213);
        Object var3 = null;
        class280 var4;
        if (this.field1314 != null && this.field1314.field1915) {
            var4 = Statics.field2420.field1100.method5671(var1, this.field1218, var2, this.field1214);
        } else {
            var4 = this.field1311.method3422(var1, this.field1218, var2, this.field1214, this.field1314);
        }
        if (var4 == null) {
            return null;
        }
        var4.method5033();
        this.field1232 = var4.field2874;
        int var5 = var4.field2941;
        class280 var6 = this.method2343(var4);
        if (this.field1311.field1927 == 1) {
            var6.field2990 = true;
        }
        if (this.field1238 == 0 || client.field500 < this.field1233 || client.field500 >= this.field1216) {
            var6.field2967 = 0;
        } else {
            var6.field3003 = this.field1235;
            var6.field3004 = this.field1236;
            var6.field2999 = this.field1172;
            var6.field2967 = this.field1238;
            var6.field3007 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dn.ai(I)Z")
    public final boolean method2280() {
        return this.field1311 != null;
    }

    @ObfuscatedName("dn.av(S)[I")
    public int[] method2565() {
        return this.field1310 == null ? this.field1311.method3420() : this.field1310.method8681();
    }

    @ObfuscatedName("dn.ax(B)[S")
    public short[] method2537() {
        return this.field1310 == null ? this.field1311.method3381() : this.field1310.method8682();
    }

    @ObfuscatedName("dn.as(IISI)V")
    public void method2536(int arg0, int arg1, short arg2) {
        if (this.field1310 == null) {
            this.field1310 = new class528(this.field1311);
        }
        this.field1310.method8683(arg0, arg1, arg2);
    }

    @ObfuscatedName("dn.ay([I[SI)V")
    public void method2539(int[] arg0, short[] arg1) {
        if (this.field1310 == null) {
            this.field1310 = new class528(this.field1311);
        }
        this.field1310.method8684(arg0, arg1);
    }

    @ObfuscatedName("dn.ak(B)V")
    public void method2540() {
        this.field1310 = null;
    }

    @ObfuscatedName("dn.aj(Lhf;I)V")
    public void method2541(class188 arg0) {
        this.field1313 = arg0;
    }

    @ObfuscatedName("dn.am(B)Lhf;")
    public class188 method2542() {
        return this.field1313;
    }

    @ObfuscatedName("dn.aq(Lhf;I)V")
    public void method2543(class188 arg0) {
        this.field1314 = arg0;
    }

    @ObfuscatedName("dn.aw(I)V")
    public void method2544() {
        this.field1313 = null;
    }

    @ObfuscatedName("dn.ae(I)V")
    public void method2545() {
        this.field1314 = null;
    }
}
