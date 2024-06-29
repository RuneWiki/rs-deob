import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class375 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[F")
    private float[] field5346 = new float[16];

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lkg;")
    private class148 field5347 = new class148(786336);

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[I")
    private int[] field5354 = new int[1600];

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    private int field5356 = 0;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "[[Lnh;")
    private class446[][] field5350 = new class446[1600][64];

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "[I")
    private int[] field5358 = new int[8191];

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[[Lnh;")
    private class446[][] field5349 = new class446[64][768];

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[I")
    private int[] field5355 = new int[64];

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lln;")
    private class212 field5351;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lln;")
    private class212 field5353;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Lln;")
    private class212 field5357;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lsg;")
    private class226 field5352;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field5348;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lhj;)V")
    private final void method2451(class338 arg0) {
        arg0.method2133(true);
        this.field5348.glEnable(16384);
        this.field5348.glEnable(16385);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lhj;Lqd;)V")
    public final void method2452(class338 arg0, class260 arg1) {
        this.field5348 = arg0.field4607;
        if (arg0.field4656 == null) {
            return;
        }
        this.method2455(arg0);
        float var3 = arg0.field4656.field1819;
        float var4 = arg0.field4656.field1829;
        float var5 = arg0.field4656.field1820;
        float var6 = arg0.field4656.field1818;
        try {
            if (arg1.field3566) {
                int var23 = arg1.field3563 - arg1.field3565;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class299 var24 = arg1.field3559.field6401;
                class299 var25 = var24.field4138;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5356 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5354[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5355[var29] = 0;
                    }
                    while (var24 != var25) {
                        class446 var30 = (class446) var25;
                        if (var27) {
                            var26 = var30.field6431;
                            var27 = false;
                        } else if (var30.field6431 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field6430 >> class249.field3454) * var5 + (float) (var30.field6432 >> class249.field3454) * var3 + (float) (var30.field6427 >> class249.field3454) * var4 + var6) - arg1.field3565;
                        if (var31 <= 1600) {
                            if (this.field5354[var31] < 64) {
                                this.field5350[var31][this.field5354[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5354[var31] == 64) {
                                        if (this.field5356 == 64) {
                                            break label188;
                                        }
                                        this.field5354[var31] += this.field5356++ + 1;
                                    }
                                    this.field5349[this.field5354[var31] - 64 - 1][this.field5355[this.field5354[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4138;
                    }
                    arg0.method2165(var26 >= 0 ? arg0.field4612.method391(var26, 256) : null);
                    this.method2453(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class299 var10 = arg1.field3559.field6401;
                for (class299 var11 = var10.field4138; var11 != var10; var11 = var11.field4138) {
                    class446 var12 = (class446) var11;
                    int var13 = (int) ((float) (var12.field6430 >> class249.field3454) * var5 + (float) (var12.field6432 >> class249.field3454) * var3 + (float) (var12.field6427 >> class249.field3454) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5358[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class299 var15 = var10.field4138;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5356 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5354[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5355[var20] = 0;
                    }
                    while (var10 != var15) {
                        class446 var21 = (class446) var15;
                        if (var18) {
                            var17 = var21.field6431;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field6431 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5358[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5354[var22] < 64) {
                                this.field5350[var22][this.field5354[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5354[var22] == 64) {
                                        if (this.field5356 == 64) {
                                            break label186;
                                        }
                                        this.field5354[var22] += this.field5356++ + 1;
                                    }
                                    this.field5349[this.field5354[var22] - 64 - 1][this.field5355[this.field5354[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4138;
                    }
                    arg0.method2165(var17 >= 0 ? arg0.field4612.method391(var17, 256) : null);
                    this.method2453(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2451(arg0);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lhj;I)V")
    private final void method2453(class338 arg0, int arg1) {
        this.field5348.glGetFloatv(2982, this.field5346, 0);
        float var3 = this.field5346[0];
        float var4 = this.field5346[4];
        float var5 = this.field5346[8];
        float var6 = this.field5346[1];
        float var7 = this.field5346[5];
        float var8 = this.field5346[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5347.field5273 = 0;
        if (arg0.field4640) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5354[var18] > 64 ? 64 : this.field5354[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class446 var21 = this.field5350[var18][var20];
                        int var22 = var21.field6437;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field6432 >> class249.field3454);
                        float var28 = (float) (var21.field6427 >> class249.field3454);
                        float var29 = (float) (var21.field6430 >> class249.field3454);
                        int var30 = var21.field6426 >> class249.field3454;
                        this.field5347.method1018(-12641, 0.0F);
                        this.field5347.method1018(-12641, 0.0F);
                        this.field5347.method1018(-12641, (float) (-var30) * var9 + var27);
                        this.field5347.method1018(-12641, (float) (-var30) * var10 + var28);
                        this.field5347.method1018(-12641, (float) (-var30) * var11 + var29);
                        this.field5347.method2396(var23, 12450);
                        this.field5347.method2396(var24, 12450);
                        this.field5347.method2396(var25, 12450);
                        this.field5347.method2396(var26, 12450);
                        this.field5347.method1018(-12641, 1.0F);
                        this.field5347.method1018(-12641, 0.0F);
                        this.field5347.method1018(-12641, (float) var30 * var12 + var27);
                        this.field5347.method1018(-12641, (float) var30 * var13 + var28);
                        this.field5347.method1018(-12641, (float) var30 * var14 + var29);
                        this.field5347.method2396(var23, 12450);
                        this.field5347.method2396(var24, 12450);
                        this.field5347.method2396(var25, 12450);
                        this.field5347.method2396(var26, 12450);
                        this.field5347.method1018(-12641, 1.0F);
                        this.field5347.method1018(-12641, 1.0F);
                        this.field5347.method1018(-12641, (float) var30 * var9 + var27);
                        this.field5347.method1018(-12641, (float) var30 * var10 + var28);
                        this.field5347.method1018(-12641, (float) var30 * var11 + var29);
                        this.field5347.method2396(var23, 12450);
                        this.field5347.method2396(var24, 12450);
                        this.field5347.method2396(var25, 12450);
                        this.field5347.method2396(var26, 12450);
                        this.field5347.method1018(-12641, 0.0F);
                        this.field5347.method1018(-12641, 1.0F);
                        this.field5347.method1018(-12641, (float) var30 * var15 + var27);
                        this.field5347.method1018(-12641, (float) var30 * var16 + var28);
                        this.field5347.method1018(-12641, (float) var30 * var17 + var29);
                        this.field5347.method2396(var23, 12450);
                        this.field5347.method2396(var24, 12450);
                        this.field5347.method2396(var25, 12450);
                        this.field5347.method2396(var26, 12450);
                    }
                    if (this.field5354[var18] > 64) {
                        int var31 = this.field5354[var18] - 64 - 1;
                        for (int var32 = this.field5355[var31] - 1; var32 >= 0; var32--) {
                            class446 var33 = this.field5349[var31][var32];
                            int var34 = var33.field6437;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field6432 >> class249.field3454);
                            float var40 = (float) (var33.field6427 >> class249.field3454);
                            float var41 = (float) (var33.field6430 >> class249.field3454);
                            int var42 = var33.field6426 >> class249.field3454;
                            this.field5347.method1018(-12641, 0.0F);
                            this.field5347.method1018(-12641, 0.0F);
                            this.field5347.method1018(-12641, (float) (-var42) * var9 + var39);
                            this.field5347.method1018(-12641, (float) (-var42) * var10 + var40);
                            this.field5347.method1018(-12641, (float) (-var42) * var11 + var41);
                            this.field5347.method2396(var35, 12450);
                            this.field5347.method2396(var36, 12450);
                            this.field5347.method2396(var37, 12450);
                            this.field5347.method2396(var38, 12450);
                            this.field5347.method1018(-12641, 1.0F);
                            this.field5347.method1018(-12641, 0.0F);
                            this.field5347.method1018(-12641, (float) var42 * var12 + var39);
                            this.field5347.method1018(-12641, (float) var42 * var13 + var40);
                            this.field5347.method1018(-12641, (float) var42 * var14 + var41);
                            this.field5347.method2396(var35, 12450);
                            this.field5347.method2396(var36, 12450);
                            this.field5347.method2396(var37, 12450);
                            this.field5347.method2396(var38, 12450);
                            this.field5347.method1018(-12641, 1.0F);
                            this.field5347.method1018(-12641, 1.0F);
                            this.field5347.method1018(-12641, (float) var42 * var9 + var39);
                            this.field5347.method1018(-12641, (float) var42 * var10 + var40);
                            this.field5347.method1018(-12641, (float) var42 * var11 + var41);
                            this.field5347.method2396(var35, 12450);
                            this.field5347.method2396(var36, 12450);
                            this.field5347.method2396(var37, 12450);
                            this.field5347.method2396(var38, 12450);
                            this.field5347.method1018(-12641, 0.0F);
                            this.field5347.method1018(-12641, 1.0F);
                            this.field5347.method1018(-12641, (float) var42 * var15 + var39);
                            this.field5347.method1018(-12641, (float) var42 * var16 + var40);
                            this.field5347.method1018(-12641, (float) var42 * var17 + var41);
                            this.field5347.method2396(var35, 12450);
                            this.field5347.method2396(var36, 12450);
                            this.field5347.method2396(var37, 12450);
                            this.field5347.method2396(var38, 12450);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5354[var43] > 64 ? 64 : this.field5354[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class446 var46 = this.field5350[var43][var45];
                        int var47 = var46.field6437;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field6432 >> class249.field3454);
                        float var53 = (float) (var46.field6427 >> class249.field3454);
                        float var54 = (float) (var46.field6430 >> class249.field3454);
                        int var55 = var46.field6426 >> class249.field3454;
                        this.field5347.method1017(0.0F, -14822);
                        this.field5347.method1017(0.0F, -14822);
                        this.field5347.method1017((float) (-var55) * var9 + var52, -14822);
                        this.field5347.method1017((float) (-var55) * var10 + var53, -14822);
                        this.field5347.method1017((float) (-var55) * var11 + var54, -14822);
                        this.field5347.method2396(var48, 12450);
                        this.field5347.method2396(var49, 12450);
                        this.field5347.method2396(var50, 12450);
                        this.field5347.method2396(var51, 12450);
                        this.field5347.method1017(1.0F, -14822);
                        this.field5347.method1017(0.0F, -14822);
                        this.field5347.method1017((float) var55 * var12 + var52, -14822);
                        this.field5347.method1017((float) var55 * var13 + var53, -14822);
                        this.field5347.method1017((float) var55 * var14 + var54, -14822);
                        this.field5347.method2396(var48, 12450);
                        this.field5347.method2396(var49, 12450);
                        this.field5347.method2396(var50, 12450);
                        this.field5347.method2396(var51, 12450);
                        this.field5347.method1017(1.0F, -14822);
                        this.field5347.method1017(1.0F, -14822);
                        this.field5347.method1017((float) var55 * var9 + var52, -14822);
                        this.field5347.method1017((float) var55 * var10 + var53, -14822);
                        this.field5347.method1017((float) var55 * var11 + var54, -14822);
                        this.field5347.method2396(var48, 12450);
                        this.field5347.method2396(var49, 12450);
                        this.field5347.method2396(var50, 12450);
                        this.field5347.method2396(var51, 12450);
                        this.field5347.method1017(0.0F, -14822);
                        this.field5347.method1017(1.0F, -14822);
                        this.field5347.method1017((float) var55 * var15 + var52, -14822);
                        this.field5347.method1017((float) var55 * var16 + var53, -14822);
                        this.field5347.method1017((float) var55 * var17 + var54, -14822);
                        this.field5347.method2396(var48, 12450);
                        this.field5347.method2396(var49, 12450);
                        this.field5347.method2396(var50, 12450);
                        this.field5347.method2396(var51, 12450);
                    }
                    if (this.field5354[var43] > 64) {
                        int var56 = this.field5354[var43] - 64 - 1;
                        for (int var57 = this.field5355[var56] - 1; var57 >= 0; var57--) {
                            class446 var58 = this.field5349[var56][var57];
                            int var59 = var58.field6437;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field6432 >> class249.field3454);
                            float var65 = (float) (var58.field6427 >> class249.field3454);
                            float var66 = (float) (var58.field6430 >> class249.field3454);
                            int var67 = var58.field6426 >> class249.field3454;
                            this.field5347.method1017(0.0F, -14822);
                            this.field5347.method1017(0.0F, -14822);
                            this.field5347.method1017((float) (-var67) * var9 + var64, -14822);
                            this.field5347.method1017((float) (-var67) * var10 + var65, -14822);
                            this.field5347.method1017((float) (-var67) * var11 + var66, -14822);
                            this.field5347.method2396(var60, 12450);
                            this.field5347.method2396(var61, 12450);
                            this.field5347.method2396(var62, 12450);
                            this.field5347.method2396(var63, 12450);
                            this.field5347.method1017(1.0F, -14822);
                            this.field5347.method1017(0.0F, -14822);
                            this.field5347.method1017((float) var67 * var12 + var64, -14822);
                            this.field5347.method1017((float) var67 * var13 + var65, -14822);
                            this.field5347.method1017((float) var67 * var14 + var66, -14822);
                            this.field5347.method2396(var60, 12450);
                            this.field5347.method2396(var61, 12450);
                            this.field5347.method2396(var62, 12450);
                            this.field5347.method2396(var63, 12450);
                            this.field5347.method1017(1.0F, -14822);
                            this.field5347.method1017(1.0F, -14822);
                            this.field5347.method1017((float) var67 * var9 + var64, -14822);
                            this.field5347.method1017((float) var67 * var10 + var65, -14822);
                            this.field5347.method1017((float) var67 * var11 + var66, -14822);
                            this.field5347.method2396(var60, 12450);
                            this.field5347.method2396(var61, 12450);
                            this.field5347.method2396(var62, 12450);
                            this.field5347.method2396(var63, 12450);
                            this.field5347.method1017(0.0F, -14822);
                            this.field5347.method1017(1.0F, -14822);
                            this.field5347.method1017((float) var67 * var15 + var64, -14822);
                            this.field5347.method1017((float) var67 * var16 + var65, -14822);
                            this.field5347.method1017((float) var67 * var17 + var66, -14822);
                            this.field5347.method2396(var60, 12450);
                            this.field5347.method2396(var61, 12450);
                            this.field5347.method2396(var62, 12450);
                            this.field5347.method2396(var63, 12450);
                        }
                    }
                }
            }
        }
        if (this.field5347.field5273 != 0) {
            this.field5352.method1433(24, this.field5347.field5258, this.field5347.field5273);
            arg0.method2158(this.field5357, (class212) null, this.field5353, this.field5351);
            arg0.method2120(7, 0, this.field5347.field5273 / 24);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lhj;)V")
    public final void method2454(class338 arg0) {
        this.field5352 = arg0.method2119(24, (byte[]) null, 196584, true);
        this.field5351 = new class212(arg0, this.field5352, 5126, 2, 0);
        this.field5357 = new class212(arg0, this.field5352, 5126, 3, 8);
        this.field5353 = new class212(arg0, this.field5352, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(Lhj;)V")
    private final void method2455(class338 arg0) {
        arg0.method2156();
        this.field5348.glDisable(16384);
        this.field5348.glDisable(16385);
        arg0.method2133(false);
        arg0.method2146(-2);
        this.field5348.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
