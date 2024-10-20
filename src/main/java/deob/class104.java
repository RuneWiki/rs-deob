package deob;

@ObfuscatedName("dx")
public final class class104 extends class98 {

    @ObfuscatedName("dx.aq")
    public class193 field1348;

    @ObfuscatedName("dx.ad")
    public String field1345 = "";

    @ObfuscatedName("dx.ak")
    public int field1346 = 31;

    @ObfuscatedName("dx.ap")
    public class548 field1353;

    @ObfuscatedName("dx.aj")
    public class192 field1349;

    @ObfuscatedName("dx.av")
    public static int field1350 = 1;

    @ObfuscatedName("dx.ab")
    public class192 field1344;

    @ObfuscatedName("dx.ai")
    public static int field1352 = 1;

    @ObfuscatedName("dx.al(Ljava/lang/String;I)V")
    public void method2569(String arg0) {
        this.field1345 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dx.ay(IB)V")
    public void method2570(int arg0) {
        this.field1346 = arg0;
    }

    @ObfuscatedName("dx.ao(IB)Z")
    public boolean method2613(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1346 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dx.aa(I)Ljava/lang/String;")
    public final String method2572() {
        if (!this.field1345.isEmpty()) {
            return this.field1345;
        }
        class193 var1 = this.field1348;
        if (var1.field2014 != null) {
            var1 = var1.method3408();
            if (var1 == null) {
                var1 = this.field1348;
            }
        }
        return var1.field1990;
    }

    @ObfuscatedName("dx.as(ILjb;B)V")
    public final void method2573(int arg0, class239 arg1) {
        int var3 = this.field1205[0];
        int var4 = this.field1247[0];
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
        if (this.field1236 != -1 && class210.method5910(this.field1236).field2284 == 1) {
            this.field1236 = -1;
        }
        if (this.field1230 < 9) {
            this.field1230++;
        }
        for (int var5 = this.field1230; var5 > 0; var5--) {
            this.field1205[var5] = this.field1205[var5 - 1];
            this.field1247[var5] = this.field1247[var5 - 1];
            this.field1264[var5] = this.field1264[var5 - 1];
        }
        this.field1205[0] = var3;
        this.field1247[0] = var4;
        this.field1264[0] = arg1;
    }

    @ObfuscatedName("dx.aw(IIZB)V")
    public final void method2574(int arg0, int arg1, boolean arg2) {
        if (this.field1236 != -1 && class210.method5910(this.field1236).field2284 == 1) {
            this.field1236 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1205[0];
            int var5 = arg1 - this.field1247[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1230 < 9) {
                    this.field1230++;
                }
                for (int var6 = this.field1230; var6 > 0; var6--) {
                    this.field1205[var6] = this.field1205[var6 - 1];
                    this.field1247[var6] = this.field1247[var6 - 1];
                    this.field1264[var6] = this.field1264[var6 - 1];
                }
                this.field1205[0] = arg0;
                this.field1247[0] = arg1;
                this.field1264[0] = class239.field2520;
                return;
            }
        }
        this.field1230 = 0;
        this.field1266 = 0;
        this.field1265 = 0;
        this.field1205[0] = arg0;
        this.field1247[0] = arg1;
        this.field1229 = this.field1205[0] * 128 + this.field1195 * 64;
        this.field1192 = this.field1247[0] * 128 + this.field1195 * 64;
    }

    @ObfuscatedName("dx.ah(I)Llv;")
    public final class294 method2050() {
        if (this.field1348 == null) {
            return null;
        }
        class210 var1 = this.field1236 != -1 && this.field1239 == 0 ? class210.method5910(this.field1236) : null;
        class210 var2 = this.field1199 == -1 || this.field1199 == this.field1197 && var1 != null ? null : class210.method5910(this.field1199);
        Object var3 = null;
        class294 var4;
        if (this.field1349 != null && this.field1349.field1981) {
            var4 = Statics.field297.field1147.method5923(var1, this.field1237, var2, this.field1233);
        } else {
            var4 = this.field1348.method3450(var1, this.field1237, var2, this.field1233, this.field1349);
        }
        if (var4 == null) {
            return null;
        }
        var4.method5249();
        this.field1251 = var4.field3016;
        int var5 = var4.field3092;
        class294 var6 = this.method2363(var4);
        if (this.field1348.field1991 == 1) {
            var6.field3149 = true;
        }
        if (this.field1240 == 0 || client.field516 < this.field1252 || client.field516 >= this.field1216) {
            var6.field3123 = 0;
        } else {
            var6.field3153 = this.field1224;
            var6.field3107 = this.field1255;
            var6.field3155 = this.field1256;
            var6.field3123 = this.field1240;
            var6.field3157 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("dx.bo(I)Z")
    public final boolean method2309() {
        return this.field1348 != null;
    }

    @ObfuscatedName("dx.at(I)[I")
    public int[] method2577() {
        return this.field1353 == null ? this.field1348.method3413() : this.field1353.method8973();
    }

    @ObfuscatedName("dx.af(S)[S")
    public short[] method2586() {
        return this.field1353 == null ? this.field1348.method3415() : this.field1353.method8982();
    }

    @ObfuscatedName("dx.am(IISB)V")
    public void method2578(int arg0, int arg1, short arg2) {
        if (this.field1353 == null) {
            this.field1353 = new class548(this.field1348);
        }
        this.field1353.method8975(arg0, arg1, arg2);
    }

    @ObfuscatedName("dx.ar([I[SI)V")
    public void method2579(int[] arg0, short[] arg1) {
        if (this.field1353 == null) {
            this.field1353 = new class548(this.field1348);
        }
        this.field1353.method8976(arg0, arg1);
    }

    @ObfuscatedName("dx.bt(B)V")
    public void method2587() {
        this.field1353 = null;
    }

    @ObfuscatedName("dx.bj(Lhh;I)V")
    public void method2581(class192 arg0) {
        this.field1344 = arg0;
    }

    @ObfuscatedName("dx.be(B)Lhh;")
    public class192 method2623() {
        return this.field1344;
    }

    @ObfuscatedName("dx.bm(Lhh;I)V")
    public void method2583(class192 arg0) {
        this.field1349 = arg0;
    }

    @ObfuscatedName("dx.bi(B)V")
    public void method2584() {
        this.field1344 = null;
    }

    @ObfuscatedName("dx.ba(I)V")
    public void method2593() {
        this.field1349 = null;
    }

    @ObfuscatedName("dx.dg(B)I")
    public int method2395() {
        return this.field1348.field2031 == -1 ? this.field1251 : this.field1348.field2031;
    }
}
