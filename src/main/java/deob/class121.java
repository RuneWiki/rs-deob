package deob;

@ObfuscatedName("db")
public class class121 extends class382 {

    @ObfuscatedName("db.c")
    public int field1455;

    @ObfuscatedName("db.b")
    public class116[][] field1454 = (class116[][]) null;

    @ObfuscatedName("db.p")
    public class116[][] field1452 = (class116[][]) null;

    @ObfuscatedName("db.m")
    public int field1453;

    @ObfuscatedName("db.t")
    public int field1457;

    @ObfuscatedName("db.s")
    public class196 field1458;

    @ObfuscatedName("db.j")
    public int field1456 = 0;

    @ObfuscatedName("db.w")
    public boolean field1450;

    @ObfuscatedName("de.c(Lku;Lku;IZI)Ldb;")
    public static class121 method2448(class302 arg0, class302 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5053(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5073(0, var7);
        } else {
            var8 = arg1.method5073(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        try {
            return new class121(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class121(class302 arg0, class302 arg1, int arg2, boolean arg3) {
        this.field1455 = arg2;
        byte[] var5 = arg0.method5053(this.field1455 >> 16 & 0xFFFF, this.field1455 & 0xFFFF);
        class419 var6 = new class419(var5);
        int var7 = var6.method6781();
        int var8 = var6.method6672();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5073(0, var8);
        } else {
            var9 = arg1.method5073(var8, 0);
        }
        this.field1458 = new class196(var8, var9);
        this.method2552(var6, var7);
    }

    @ObfuscatedName("db.b(Lpi;IB)V")
    public void method2552(class419 arg0, int arg1) {
        this.field1453 = arg0.method6672();
        this.field1457 = arg0.method6672();
        this.field1456 = arg0.method6781();
        int var3 = arg0.method6672();
        this.field1452 = new class116[this.field1458.method3627().method3619()][];
        this.field1454 = new class116[this.field1458.method3633()][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6781();
            class117 var6 = (class117) class316.method2616(class117.method1907(), var5);
            if (var6 == null) {
                var6 = class117.field1422;
            }
            int var9 = arg0.method6799();
            int var10 = arg0.method6781();
            class118 var11 = (class118) class316.method2616(class118.method71(), var10);
            if (var11 == null) {
                var11 = class118.field1426;
            }
            class116 var14 = new class116();
            var14.method2510(arg0, arg1);
            int var15 = var6.method2536();
            class116[][] var16;
            if (class117.field1416 == var6) {
                var16 = this.field1452;
            } else {
                var16 = this.field1454;
            }
            if (var16[var9] == null) {
                var16[var9] = new class116[var15];
            }
            var16[var9][var11.method2539()] = var14;
            if (class117.field1419 == var6) {
                this.field1450 = true;
            }
        }
    }

    @ObfuscatedName("db.p(B)I")
    public int method2566() {
        return this.field1453;
    }

    @ObfuscatedName("db.m(I)I")
    public int method2555() {
        return this.field1457;
    }

    @ObfuscatedName("db.t(I)I")
    public int method2556() {
        return this.field1456;
    }

    @ObfuscatedName("db.s(I)I")
    public int method2553() {
        return this.method2555() - this.method2566();
    }

    @ObfuscatedName("db.j(B)Z")
    public boolean method2557() {
        return this.field1450;
    }

    @ObfuscatedName("db.w(ILdf;III)V")
    public void method2562(int arg0, class114 arg1, int arg2, int arg3) {
        class367[] var5 = class367.field4192;
        class367 var6;
        synchronized (class367.field4192) {
            if (Statics.field1664 == 0) {
                var6 = new class367();
            } else {
                class367.field4192[--Statics.field1664].method6009();
                var6 = class367.field4192[Statics.field1664];
            }
        }
        this.method2563(var6, arg2, arg1, arg0);
        this.method2561(var6, arg2, arg1, arg0);
        this.method2560(var6, arg2, arg1, arg0);
        arg1.method2453(var6);
        var6.method6013();
    }

    @ObfuscatedName("db.n(Lno;ILdf;IB)V")
    public void method2563(class367 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2460(this.field1456);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1452[arg1] != null) {
            class116 var9 = this.field1452[arg1][0];
            class116 var10 = this.field1452[arg1][1];
            class116 var11 = this.field1452[arg1][2];
            if (var9 != null) {
                var6 = var9.method2504(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2504(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2504(arg3);
            }
        }
        class366 var12 = class366.method5715();
        var12.method5987(1.0F, 0.0F, 0.0F, var6);
        class366 var13 = class366.method5715();
        var13.method5987(0.0F, 1.0F, 0.0F, var7);
        class366 var14 = class366.method5715();
        var14.method5987(0.0F, 0.0F, 1.0F, var8);
        class366 var15 = class366.method5715();
        var15.method5985(var14);
        var15.method5985(var12);
        var15.method5985(var13);
        class367[] var16 = class367.field4192;
        class367 var17;
        synchronized (class367.field4192) {
            if (Statics.field1664 == 0) {
                var17 = new class367();
            } else {
                class367.field4192[--Statics.field1664].method6009();
                var17 = class367.field4192[Statics.field1664];
            }
        }
        var17.method6068(var15);
        arg0.method6027(var17);
        var12.method6003();
        var13.method6003();
        var14.method6003();
        var15.method6003();
        var17.method6013();
    }

    @ObfuscatedName("db.r(Lno;ILdf;IB)V")
    public void method2560(class367 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2454(this.field1456);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1452[arg1] != null) {
            class116 var9 = this.field1452[arg1][3];
            class116 var10 = this.field1452[arg1][4];
            class116 var11 = this.field1452[arg1][5];
            if (var9 != null) {
                var6 = var9.method2504(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2504(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2504(arg3);
            }
        }
        arg0.field4197[12] = var6;
        arg0.field4197[13] = var7;
        arg0.field4197[14] = var8;
    }

    @ObfuscatedName("db.o(Lno;ILdf;IB)V")
    public void method2561(class367 arg0, int arg1, class114 arg2, int arg3) {
        float[] var5 = arg2.method2462(this.field1456);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1452[arg1] != null) {
            class116 var9 = this.field1452[arg1][6];
            class116 var10 = this.field1452[arg1][7];
            class116 var11 = this.field1452[arg1][8];
            if (var9 != null) {
                var6 = var9.method2504(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2504(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2504(arg3);
            }
        }
        class367[] var12 = class367.field4192;
        class367 var13;
        synchronized (class367.field4192) {
            if (Statics.field1664 == 0) {
                var13 = new class367();
            } else {
                class367.field4192[--Statics.field1664].method6009();
                var13 = class367.field4192[Statics.field1664];
            }
        }
        var13.method6024(var6, var7, var8);
        arg0.method6027(var13);
        var13.method6013();
    }
}
