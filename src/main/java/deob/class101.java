package deob;

@ObfuscatedName("ds")
public final class class101 extends class96 {

    @ObfuscatedName("ds.am")
    public class189 field1300;

    @ObfuscatedName("ds.ap")
    public String field1301 = "";

    @ObfuscatedName("ds.aj")
    public int field1302 = 31;

    @ObfuscatedName("ds.aq")
    public class532 field1305;

    @ObfuscatedName("ds.ar")
    public class188 field1304;

    @ObfuscatedName("ds.ag")
    public static int field1307 = 1;

    @ObfuscatedName("ds.ao")
    public class188 field1306;

    @ObfuscatedName("ds.ae")
    public static int field1303 = 1;

    @ObfuscatedName("ds.am(Ljava/lang/String;S)V")
    public void method2556(String arg0) {
        this.field1301 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("ds.af(II)V")
    public void method2602(int arg0) {
        this.field1302 = arg0;
    }

    @ObfuscatedName("ds.aj(IB)Z")
    public boolean method2558(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1302 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ds.aq(I)Ljava/lang/String;")
    public final String method2580() {
        if (!this.field1301.isEmpty()) {
            return this.field1301;
        }
        class189 var1 = this.field1300;
        if (var1.field1984 != null) {
            var1 = var1.method3459();
            if (var1 == null) {
                var1 = this.field1300;
            }
        }
        return var1.field1952;
    }

    @ObfuscatedName("ds.ae(ILir;I)V")
    public final void method2560(int arg0, class232 arg1) {
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
        if (this.field1236 != -1 && class205.method73(this.field1236).field2227 == 1) {
            this.field1236 = -1;
        }
        if (this.field1242 < 9) {
            this.field1242++;
        }
        for (int var5 = this.field1242; var5 > 0; var5--) {
            this.field1243[var5] = this.field1243[var5 - 1];
            this.field1244[var5] = this.field1244[var5 - 1];
            this.field1220[var5] = this.field1220[var5 - 1];
        }
        this.field1243[0] = var3;
        this.field1244[0] = var4;
        this.field1220[0] = arg1;
    }

    @ObfuscatedName("ds.aa(IIZI)V")
    public final void method2557(int arg0, int arg1, boolean arg2) {
        if (this.field1236 != -1 && class205.method73(this.field1236).field2227 == 1) {
            this.field1236 = -1;
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
                    this.field1220[var6] = this.field1220[var6 - 1];
                }
                this.field1243[0] = arg0;
                this.field1244[0] = arg1;
                this.field1220[0] = class232.field2459;
                return;
            }
        }
        this.field1242 = 0;
        this.field1216 = 0;
        this.field1246 = 0;
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        this.field1232 = this.field1243[0] * 128 + this.field1176 * 64;
        this.field1173 = this.field1244[0] * 128 + this.field1176 * 64;
    }

    @ObfuscatedName("ds.ap(I)Lko;")
    public final class283 method2053() {
        if (this.field1300 == null) {
            return null;
        }
        class205 var1 = this.field1236 != -1 && this.field1230 == 0 ? class205.method73(this.field1236) : null;
        class205 var2 = this.field1210 == -1 || this.field1210 == this.field1178 && var1 != null ? null : class205.method73(this.field1210);
        Object var3 = null;
        class283 var4;
        if (this.field1304 != null && this.field1304.field1943) {
            var4 = Statics.field133.field1099.method5776(var1, this.field1218, var2, this.field1183);
        } else {
            var4 = this.field1300.method3422(var1, this.field1218, var2, this.field1183, this.field1304);
        }
        if (var4 == null) {
            return null;
        }
        var4.method5136();
        this.field1190 = var4.field2910;
        int var5 = var4.field2983;
        class283 var6 = this.method2385(var4);
        if (this.field1300.field1980 == 1) {
            var6.field3003 = true;
        }
        if (this.field1238 == 0 || client.field677 < this.field1181 || client.field677 >= this.field1234) {
            var6.field3048 = 0;
        } else {
            var6.field3045 = this.field1235;
            var6.field3046 = this.field1194;
            var6.field3047 = this.field1205;
            var6.field3048 = this.field1238;
            var6.field2996 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("ds.ay(B)Z")
    public final boolean method2307() {
        return this.field1300 != null;
    }

    @ObfuscatedName("ds.au(I)[I")
    public int[] method2563() {
        return this.field1305 == null ? this.field1300.method3456() : this.field1305.method8800();
    }

    @ObfuscatedName("ds.an(B)[S")
    public short[] method2579() {
        return this.field1305 == null ? this.field1300.method3403() : this.field1305.method8815();
    }

    @ObfuscatedName("ds.ad(IISS)V")
    public void method2584(int arg0, int arg1, short arg2) {
        if (this.field1305 == null) {
            this.field1305 = new class532(this.field1300);
        }
        this.field1305.method8803(arg0, arg1, arg2);
    }

    @ObfuscatedName("ds.ax([I[SB)V")
    public void method2566(int[] arg0, short[] arg1) {
        if (this.field1305 == null) {
            this.field1305 = new class532(this.field1300);
        }
        this.field1305.method8804(arg0, arg1);
    }

    @ObfuscatedName("ds.aw(I)V")
    public void method2567() {
        this.field1305 = null;
    }

    @ObfuscatedName("ds.az(Lhb;I)V")
    public void method2568(class188 arg0) {
        this.field1306 = arg0;
    }

    @ObfuscatedName("ds.av(I)Lhb;")
    public class188 method2569() {
        return this.field1306;
    }

    @ObfuscatedName("ds.ak(Lhb;I)V")
    public void method2562(class188 arg0) {
        this.field1304 = arg0;
    }

    @ObfuscatedName("ds.as(I)V")
    public void method2571() {
        this.field1306 = null;
    }

    @ObfuscatedName("ds.ab(I)V")
    public void method2572() {
        this.field1304 = null;
    }
}
