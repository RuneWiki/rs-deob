package deob;

@ObfuscatedName("dc")
public final class class103 extends class98 {

    @ObfuscatedName("dc.ac")
    public class206 field1328;

    @ObfuscatedName("dc.al")
    public String field1320 = "";

    @ObfuscatedName("dc.ax")
    public int field1319 = 31;

    @ObfuscatedName("dc.ao")
    public class531 field1323;

    @ObfuscatedName("dc.ah")
    public class205 field1324;

    @ObfuscatedName("dc.ar")
    public static int field1325 = 1;

    @ObfuscatedName("dc.ab")
    public class205 field1326;

    @ObfuscatedName("dc.am")
    public static int field1327 = 1;

    @ObfuscatedName("dc.ac(Ljava/lang/String;I)V")
    public void method2505(String arg0) {
        this.field1320 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dc.ak(II)V")
    public void method2506(int arg0) {
        this.field1319 = arg0;
    }

    @ObfuscatedName("dc.ax(II)Z")
    public boolean method2507(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1319 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dc.ao(B)Ljava/lang/String;")
    public final String method2551() {
        if (!this.field1320.isEmpty()) {
            return this.field1320;
        }
        class206 var1 = this.field1328;
        if (var1.field2043 != null) {
            var1 = var1.method3500();
            if (var1 == null) {
                var1 = this.field1328;
            }
        }
        return var1.field2083;
    }

    @ObfuscatedName("dc.ar(ILip;B)V")
    public final void method2509(int arg0, class232 arg1) {
        int var3 = this.field1258[0];
        int var4 = this.field1259[0];
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
        if (this.field1232 != -1 && class223.method687(this.field1232).field2340 == 1) {
            this.field1232 = -1;
        }
        if (this.field1219 < 9) {
            this.field1219++;
        }
        for (int var5 = this.field1219; var5 > 0; var5--) {
            this.field1258[var5] = this.field1258[var5 - 1];
            this.field1259[var5] = this.field1259[var5 - 1];
            this.field1200[var5] = this.field1200[var5 - 1];
        }
        this.field1258[0] = var3;
        this.field1259[0] = var4;
        this.field1200[0] = arg1;
    }

    @ObfuscatedName("dc.ab(IIZI)V")
    public final void method2560(int arg0, int arg1, boolean arg2) {
        if (this.field1232 != -1 && class223.method687(this.field1232).field2340 == 1) {
            this.field1232 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1258[0];
            int var5 = arg1 - this.field1259[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1219 < 9) {
                    this.field1219++;
                }
                for (int var6 = this.field1219; var6 > 0; var6--) {
                    this.field1258[var6] = this.field1258[var6 - 1];
                    this.field1259[var6] = this.field1259[var6 - 1];
                    this.field1200[var6] = this.field1200[var6 - 1];
                }
                this.field1258[0] = arg0;
                this.field1259[0] = arg1;
                this.field1200[0] = class232.field2429;
                return;
            }
        }
        this.field1219 = 0;
        this.field1262 = 0;
        this.field1234 = 0;
        this.field1258[0] = arg0;
        this.field1259[0] = arg1;
        this.field1227 = this.field1258[0] * 128 + this.field1190 * 64;
        this.field1187 = this.field1259[0] * 128 + this.field1190 * 64;
    }

    @ObfuscatedName("dc.al(B)Ljn;")
    public final class254 method2007() {
        if (this.field1328 == null) {
            return null;
        }
        class223 var1 = this.field1232 != -1 && this.field1235 == 0 ? class223.method687(this.field1232) : null;
        class223 var2 = this.field1228 == -1 || this.field1242 == this.field1228 && var1 != null ? null : class223.method687(this.field1228);
        Object var3 = null;
        class254 var4;
        if (this.field1324 != null && this.field1324.field2039) {
            var4 = Statics.field2696.field1120.method5679(var1, this.field1192, var2, this.field1229);
        } else {
            var4 = this.field1328.method3472(var1, this.field1192, var2, this.field1229, this.field1324);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4543();
        this.field1211 = var4.field2662;
        int var5 = var4.field2750;
        class254 var6 = this.method2332(var4);
        if (this.field1328.field2050 == 1) {
            var6.field2756 = true;
        }
        if (this.field1253 == 0 || client.field533 < this.field1248 || client.field533 >= this.field1249) {
            var6.field2801 = 0;
        } else {
            var6.field2798 = this.field1250;
            var6.field2770 = this.field1251;
            var6.field2800 = this.field1252;
            var6.field2801 = this.field1253;
            var6.field2802 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dc.an(B)Z")
    public final boolean method2265() {
        return this.field1328 != null;
    }

    @ObfuscatedName("dc.am(B)[I")
    public int[] method2510() {
        return this.field1323 == null ? this.field1328.method3480() : this.field1323.method8616();
    }

    @ObfuscatedName("dc.av(I)[S")
    public short[] method2516() {
        return this.field1323 == null ? this.field1328.method3491() : this.field1323.method8617();
    }

    @ObfuscatedName("dc.ag(IISS)V")
    public void method2545(int arg0, int arg1, short arg2) {
        if (this.field1323 == null) {
            this.field1323 = new class531(this.field1328);
        }
        this.field1323.method8618(arg0, arg1, arg2);
    }

    @ObfuscatedName("dc.aa([I[SB)V")
    public void method2532(int[] arg0, short[] arg1) {
        if (this.field1323 == null) {
            this.field1323 = new class531(this.field1328);
        }
        this.field1323.method8619(arg0, arg1);
    }

    @ObfuscatedName("dc.ap(I)V")
    public void method2514() {
        this.field1323 = null;
    }

    @ObfuscatedName("dc.ay(Lhe;I)V")
    public void method2515(class205 arg0) {
        this.field1326 = arg0;
    }

    @ObfuscatedName("dc.as(I)Lhe;")
    public class205 method2525() {
        return this.field1326;
    }

    @ObfuscatedName("dc.aj(Lhe;I)V")
    public void method2517(class205 arg0) {
        this.field1324 = arg0;
    }

    @ObfuscatedName("dc.au(B)V")
    public void method2518() {
        this.field1326 = null;
    }

    @ObfuscatedName("dc.ai(I)V")
    public void method2519() {
        this.field1324 = null;
    }
}
