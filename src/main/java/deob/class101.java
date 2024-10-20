package deob;

@ObfuscatedName("dh")
public final class class101 extends class96 {

    @ObfuscatedName("dh.aw")
    public class196 field1313;

    @ObfuscatedName("dh.ay")
    public String field1311 = "";

    @ObfuscatedName("dh.am")
    public int field1319 = 31;

    @ObfuscatedName("dh.as")
    public class515 field1314;

    @ObfuscatedName("dh.aj")
    public class195 field1315;

    @ObfuscatedName("dh.ag")
    public static int field1316 = 1;

    @ObfuscatedName("dh.az")
    public class195 field1317;

    @ObfuscatedName("dh.av")
    public static int field1318 = 1;

    @ObfuscatedName("dh.aw(Ljava/lang/String;I)V")
    public void method2477(String arg0) {
        this.field1311 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dh.ar(II)V")
    public void method2490(int arg0) {
        this.field1319 = arg0;
    }

    @ObfuscatedName("dh.am(II)Z")
    public boolean method2479(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1319 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dh.as(I)Ljava/lang/String;")
    public final String method2480() {
        if (!this.field1311.isEmpty()) {
            return this.field1311;
        }
        class196 var1 = this.field1313;
        if (var1.field2020 != null) {
            var1 = var1.method3412();
            if (var1 == null) {
                var1 = this.field1313;
            }
        }
        return var1.field2034;
    }

    @ObfuscatedName("dh.ag(ILio;I)V")
    public final void method2481(int arg0, class219 arg1) {
        int var3 = this.field1188[0];
        int var4 = this.field1255[0];
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
        if (this.field1211 != -1 && class210.method2904(this.field1211).field2285 == 1) {
            this.field1211 = -1;
        }
        if (this.field1253 < 9) {
            this.field1253++;
        }
        for (int var5 = this.field1253; var5 > 0; var5--) {
            this.field1188[var5] = this.field1188[var5 - 1];
            this.field1255[var5] = this.field1255[var5 - 1];
            this.field1241[var5] = this.field1241[var5 - 1];
        }
        this.field1188[0] = var3;
        this.field1255[0] = var4;
        this.field1241[0] = arg1;
    }

    @ObfuscatedName("dh.az(IIZB)V")
    public final void method2482(int arg0, int arg1, boolean arg2) {
        if (this.field1211 != -1 && class210.method2904(this.field1211).field2285 == 1) {
            this.field1211 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1188[0];
            int var5 = arg1 - this.field1255[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1253 < 9) {
                    this.field1253++;
                }
                for (int var6 = this.field1253; var6 > 0; var6--) {
                    this.field1188[var6] = this.field1188[var6 - 1];
                    this.field1255[var6] = this.field1255[var6 - 1];
                    this.field1241[var6] = this.field1241[var6 - 1];
                }
                this.field1188[0] = arg0;
                this.field1255[0] = arg1;
                this.field1241[0] = class219.field2385;
                return;
            }
        }
        this.field1253 = 0;
        this.field1258 = 0;
        this.field1257 = 0;
        this.field1188[0] = arg0;
        this.field1255[0] = arg1;
        this.field1192 = this.field1188[0] * 128 + this.field1224 * 64;
        this.field1206 = this.field1255[0] * 128 + this.field1224 * 64;
    }

    @ObfuscatedName("dh.ay(I)Ljo;")
    public final class241 method1986() {
        if (this.field1313 == null) {
            return null;
        }
        class210 var1 = this.field1211 != -1 && this.field1231 == 0 ? class210.method2904(this.field1211) : null;
        class210 var2 = this.field1256 == -1 || this.field1256 == this.field1232 && var1 != null ? null : class210.method2904(this.field1256);
        Object var3 = null;
        class241 var4;
        if (this.field1315 != null && this.field1315.field1995) {
            var4 = Statics.field1605.field1139.method5523(var1, this.field1229, var2, this.field1254);
        } else {
            var4 = this.field1313.method3374(var1, this.field1229, var2, this.field1254, this.field1315);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4427();
        this.field1243 = var4.field2613;
        int var5 = var4.field2705;
        class241 var6 = this.method2283(var4);
        if (this.field1313.field2003 == 1) {
            var6.field2704 = true;
        }
        if (this.field1249 == 0 || client.field530 < this.field1184 || client.field530 >= this.field1245) {
            var6.field2675 = 0;
        } else {
            var6.field2716 = this.field1246;
            var6.field2747 = this.field1239;
            var6.field2748 = this.field1248;
            var6.field2675 = this.field1249;
            var6.field2685 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dh.ae(B)Z")
    public final boolean method2228() {
        return this.field1313 != null;
    }

    @ObfuscatedName("dh.av(I)[I")
    public int[] method2485() {
        return this.field1314 == null ? this.field1313.method3390() : this.field1314.method8507();
    }

    @ObfuscatedName("dh.ap(B)[S")
    public short[] method2505() {
        return this.field1314 == null ? this.field1313.method3420() : this.field1314.method8508();
    }

    @ObfuscatedName("dh.aq(IISB)V")
    public void method2486(int arg0, int arg1, short arg2) {
        if (this.field1314 == null) {
            this.field1314 = new class515(this.field1313);
        }
        this.field1314.method8509(arg0, arg1, arg2);
    }

    @ObfuscatedName("dh.at([I[SI)V")
    public void method2483(int[] arg0, short[] arg1) {
        if (this.field1314 == null) {
            this.field1314 = new class515(this.field1313);
        }
        this.field1314.method8517(arg0, arg1);
    }

    @ObfuscatedName("dh.ah(I)V")
    public void method2509() {
        this.field1314 = null;
    }

    @ObfuscatedName("dh.ax(Lhs;I)V")
    public void method2494(class195 arg0) {
        this.field1317 = arg0;
    }

    @ObfuscatedName("dh.aa(I)Lhs;")
    public class195 method2491() {
        return this.field1317;
    }

    @ObfuscatedName("dh.au(Lhs;I)V")
    public void method2492(class195 arg0) {
        this.field1315 = arg0;
    }

    @ObfuscatedName("dh.ab(I)V")
    public void method2493() {
        this.field1317 = null;
    }

    @ObfuscatedName("dh.ad(I)V")
    public void method2487() {
        this.field1315 = null;
    }
}
