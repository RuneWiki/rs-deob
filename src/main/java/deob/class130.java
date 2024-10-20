package deob;

@ObfuscatedName("dh")
public class class130 extends class425 {

    @ObfuscatedName("dh.a")
    public int field1541;

    @ObfuscatedName("dh.f")
    public class125[][] field1540 = (class125[][]) null;

    @ObfuscatedName("dh.c")
    public class125[][] field1539 = (class125[][]) null;

    @ObfuscatedName("dh.x")
    public class213 field1542;

    @ObfuscatedName("dh.h")
    public int field1543 = 0;

    @ObfuscatedName("dh.j")
    public boolean field1544;

    @ObfuscatedName("dv.a(Llg;Llg;IZB)Ldh;")
    public static class130 method2783(class330 arg0, class330 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method5819(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method5819(0, var7);
        } else {
            var8 = arg1.method5819(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        try {
            return new class130(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class130(class330 arg0, class330 arg1, int arg2, boolean arg3) {
        this.field1541 = arg2;
        byte[] var5 = arg0.method5859(this.field1541 >> 16 & 0xFFFF, this.field1541 & 0xFFFF);
        class464 var6 = new class464(var5);
        int var7 = var6.method7735();
        int var8 = var6.method7716();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5819(0, var8);
        } else {
            var9 = arg1.method5819(var8, 0);
        }
        this.field1542 = new class213(var8, var9);
        this.method2796(var6, var7);
    }

    @ObfuscatedName("dh.f(Lqr;II)V")
    public void method2796(class464 arg0, int arg1) {
        arg0.method7716();
        arg0.method7716();
        this.field1543 = arg0.method7735();
        int var3 = arg0.method7716();
        this.field1539 = new class125[this.field1542.method3916().method3899()][];
        this.field1540 = new class125[this.field1542.method3915()][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7735();
            class126[] var6 = new class126[] { class126.field1511, class126.field1504, class126.field1502, class126.field1503, class126.field1500, class126.field1505 };
            class126 var7 = (class126) class344.method4292(var6, var5);
            if (var7 == null) {
                var7 = class126.field1511;
            }
            int var10 = arg0.method7813();
            class127 var11 = class127.method2136(arg0.method7735());
            class125 var12 = new class125();
            var12.method2753(arg0, arg1);
            int var13 = var7.method2780();
            class125[][] var14;
            if (class126.field1504 == var7) {
                var14 = this.field1539;
            } else {
                var14 = this.field1540;
            }
            if (var14[var10] == null) {
                var14[var10] = new class125[var13];
            }
            var14[var10][var11.method2784()] = var12;
            if (class126.field1500 == var7) {
                this.field1544 = true;
            }
        }
    }

    @ObfuscatedName("dh.c(I)I")
    public int method2798() {
        return this.field1543;
    }

    @ObfuscatedName("dh.x(I)Z")
    public boolean method2803() {
        return this.field1544;
    }

    @ObfuscatedName("dh.h(ILdi;IIB)V")
    public void method2815(int arg0, class123 arg1, int arg2, int arg3) {
        class408 var5 = class408.method5163();
        this.method2800(var5, arg2, arg1, arg0);
        this.method2795(var5, arg2, arg1, arg0);
        this.method2801(var5, arg2, arg1, arg0);
        arg1.method2728(var5);
        var5.method7055();
    }

    @ObfuscatedName("dh.j(Lov;ILdi;IB)V")
    public void method2800(class408 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2726(this.field1543);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1539[arg1] != null) {
            class125 var9 = this.field1539[arg1][0];
            class125 var10 = this.field1539[arg1][1];
            class125 var11 = this.field1539[arg1][2];
            if (var9 != null) {
                var6 = var9.method2764(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2764(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2764(arg3);
            }
        }
        class407 var12 = class407.method1764();
        var12.method6998(1.0F, 0.0F, 0.0F, var6);
        class407 var13 = class407.method1764();
        var13.method6998(0.0F, 1.0F, 0.0F, var7);
        class407 var14 = class407.method1764();
        var14.method6998(0.0F, 0.0F, 1.0F, var8);
        class407 var15 = class407.method1764();
        var15.method6975(var14);
        var15.method6975(var12);
        var15.method6975(var13);
        class408 var16 = class408.method5163();
        var16.method7013(var15);
        arg0.method7012(var16);
        var12.method6983();
        var13.method6983();
        var14.method6983();
        var15.method6983();
        var16.method7055();
    }

    @ObfuscatedName("dh.y(Lov;ILdi;IB)V")
    public void method2801(class408 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2715(this.field1543);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1539[arg1] != null) {
            class125 var9 = this.field1539[arg1][3];
            class125 var10 = this.field1539[arg1][4];
            class125 var11 = this.field1539[arg1][5];
            if (var9 != null) {
                var6 = var9.method2764(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2764(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2764(arg3);
            }
        }
        arg0.field4567[12] = var6;
        arg0.field4567[13] = var7;
        arg0.field4567[14] = var8;
    }

    @ObfuscatedName("dh.d(Lov;ILdi;II)V")
    public void method2795(class408 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2716(this.field1543);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1539[arg1] != null) {
            class125 var9 = this.field1539[arg1][6];
            class125 var10 = this.field1539[arg1][7];
            class125 var11 = this.field1539[arg1][8];
            if (var9 != null) {
                var6 = var9.method2764(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2764(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2764(arg3);
            }
        }
        class408 var12 = class408.method5163();
        var12.method7010(var6, var7, var8);
        arg0.method7012(var12);
        var12.method7055();
    }
}
