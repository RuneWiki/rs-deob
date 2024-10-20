package deob;

@ObfuscatedName("ds")
public class class123 extends class406 {

    @ObfuscatedName("ds.o")
    public int field1532;

    @ObfuscatedName("ds.q")
    public class118[][] field1531 = (class118[][]) null;

    @ObfuscatedName("ds.l")
    public class118[][] field1533 = (class118[][]) null;

    @ObfuscatedName("ds.k")
    public int field1534;

    @ObfuscatedName("ds.a")
    public int field1535;

    @ObfuscatedName("ds.m")
    public class204 field1536;

    @ObfuscatedName("ds.p")
    public int field1537 = 0;

    @ObfuscatedName("ds.s")
    public boolean field1538;

    @ObfuscatedName("ci.o(Llp;Llp;IZI)Lds;")
    public static class123 method2045(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5249(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5196(0, var7);
        } else {
            var8 = arg1.method5196(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        try {
            return new class123(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class123(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        this.field1532 = arg2;
        byte[] var5 = arg0.method5249(this.field1532 >> 16 & 0xFFFF, this.field1532 & 0xFFFF);
        class440 var6 = new class440(var5);
        int var7 = var6.method7071();
        int var8 = var6.method7082();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5196(0, var8);
        } else {
            var9 = arg1.method5196(var8, 0);
        }
        this.field1536 = new class204(var8, var9);
        this.method2602(var6, var7);
    }

    @ObfuscatedName("ds.q(Lpx;II)V")
    public void method2602(class440 arg0, int arg1) {
        this.field1534 = arg0.method7082();
        this.field1535 = arg0.method7082();
        this.field1537 = arg0.method7071();
        int var3 = arg0.method7082();
        this.field1533 = new class118[this.field1536.method3720().method3700()][];
        this.field1531 = new class118[this.field1536.method3715()][];
        for (int var4 = 0; var4 < var3; var4++) {
            class119 var5 = class119.method2906(arg0.method7071());
            int var6 = arg0.method6907();
            int var7 = arg0.method7071();
            class120 var8 = (class120) class330.method4934(Statics.method1955(), var7);
            if (var8 == null) {
                var8 = class120.field1509;
            }
            class118 var11 = new class118();
            var11.method2546(arg0, arg1);
            int var12 = var5.method2587();
            class118[][] var13;
            if (class119.field1492 == var5) {
                var13 = this.field1533;
            } else {
                var13 = this.field1531;
            }
            if (var13[var6] == null) {
                var13[var6] = new class118[var12];
            }
            var13[var6][var8.method2593()] = var11;
            if (class119.field1491 == var5) {
                this.field1538 = true;
            }
        }
    }

    @ObfuscatedName("ds.l(B)I")
    public int method2631() {
        return this.field1534;
    }

    @ObfuscatedName("ds.k(I)I")
    public int method2604() {
        return this.field1535;
    }

    @ObfuscatedName("ds.a(B)I")
    public int method2605() {
        return this.field1537;
    }

    @ObfuscatedName("ds.m(B)I")
    public int method2606() {
        return this.method2604() - this.method2631();
    }

    @ObfuscatedName("ds.p(B)Z")
    public boolean method2607() {
        return this.field1538;
    }

    @ObfuscatedName("ds.s(ILdb;IIB)V")
    public void method2608(int arg0, class116 arg1, int arg2, int arg3) {
        class389 var5 = class389.method3601();
        this.method2609(var5, arg2, arg1, arg0);
        this.method2610(var5, arg2, arg1, arg0);
        this.method2626(var5, arg2, arg1, arg0);
        arg1.method2506(var5);
        var5.method6292();
    }

    @ObfuscatedName("ds.r(Lnw;ILdb;II)V")
    public void method2609(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2508(this.field1537);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1533[arg1] != null) {
            class118 var9 = this.field1533[arg1][0];
            class118 var10 = this.field1533[arg1][1];
            class118 var11 = this.field1533[arg1][2];
            if (var9 != null) {
                var6 = var9.method2547(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2547(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2547(arg3);
            }
        }
        class388[] var12 = class388.field4396;
        class388 var13;
        synchronized (class388.field4396) {
            if (Statics.field2493 == 0) {
                var13 = new class388();
            } else {
                class388.field4396[--Statics.field2493].method6209();
                var13 = class388.field4396[Statics.field2493];
            }
        }
        var13.method6211(1.0F, 0.0F, 0.0F, var6);
        class388[] var16 = class388.field4396;
        class388 var17;
        synchronized (class388.field4396) {
            if (Statics.field2493 == 0) {
                var17 = new class388();
            } else {
                class388.field4396[--Statics.field2493].method6209();
                var17 = class388.field4396[Statics.field2493];
            }
        }
        var17.method6211(0.0F, 1.0F, 0.0F, var7);
        class388[] var20 = class388.field4396;
        class388 var21;
        synchronized (class388.field4396) {
            if (Statics.field2493 == 0) {
                var21 = new class388();
            } else {
                class388.field4396[--Statics.field2493].method6209();
                var21 = class388.field4396[Statics.field2493];
            }
        }
        var21.method6211(0.0F, 0.0F, 1.0F, var8);
        class388[] var24 = class388.field4396;
        class388 var25;
        synchronized (class388.field4396) {
            if (Statics.field2493 == 0) {
                var25 = new class388();
            } else {
                class388.field4396[--Statics.field2493].method6209();
                var25 = class388.field4396[Statics.field2493];
            }
        }
        var25.method6210(var21);
        var25.method6210(var13);
        var25.method6210(var17);
        class389 var28 = class389.method3601();
        var28.method6244(var25);
        arg0.method6243(var28);
        var13.method6206();
        var17.method6206();
        var21.method6206();
        var25.method6206();
        var28.method6292();
    }

    @ObfuscatedName("ds.v(Lnw;ILdb;IB)V")
    public void method2626(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2516(this.field1537);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1533[arg1] != null) {
            class118 var9 = this.field1533[arg1][3];
            class118 var10 = this.field1533[arg1][4];
            class118 var11 = this.field1533[arg1][5];
            if (var9 != null) {
                var6 = var9.method2547(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2547(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2547(arg3);
            }
        }
        arg0.field4401[12] = var6;
        arg0.field4401[13] = var7;
        arg0.field4401[14] = var8;
    }

    @ObfuscatedName("ds.y(Lnw;ILdb;IB)V")
    public void method2610(class389 arg0, int arg1, class116 arg2, int arg3) {
        float[] var5 = arg2.method2510(this.field1537);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1533[arg1] != null) {
            class118 var9 = this.field1533[arg1][6];
            class118 var10 = this.field1533[arg1][7];
            class118 var11 = this.field1533[arg1][8];
            if (var9 != null) {
                var6 = var9.method2547(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2547(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2547(arg3);
            }
        }
        class389 var12 = class389.method3601();
        var12.method6241(var6, var7, var8);
        arg0.method6243(var12);
        var12.method6292();
    }
}
