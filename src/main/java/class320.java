import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class320 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[F")
    private float[] field4378 = new float[16];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lto;")
    private class6 field4376 = new class6(786336);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[[Lua;")
    private class399[][] field4379 = new class399[64][768];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[Lua;")
    private class399[][] field4380 = new class399[1600][64];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
    private int[] field4384 = new int[64];

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
    private int[] field4381 = new int[8191];

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field4385 = 0;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[I")
    private int[] field4387 = new int[1600];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lqb;")
    private class122 field4383;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lq;")
    private class246 field4382;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lq;")
    private class246 field4386;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lq;")
    private class246 field4388;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field4377;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltb;)V")
    private final void method2067(class227 arg0) {
        arg0.method1519(true);
        this.field4377.glEnable(16384);
        this.field4377.glEnable(16385);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltb;I)V")
    private final void method2068(class227 arg0, int arg1) {
        this.field4377.glGetFloatv(2982, this.field4378, 0);
        float var3 = this.field4378[0];
        float var4 = this.field4378[4];
        float var5 = this.field4378[8];
        float var6 = this.field4378[1];
        float var7 = this.field4378[5];
        float var8 = this.field4378[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field4376.field191 = 0;
        if (arg0.field3229) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field4387[var18] > 64 ? 64 : this.field4387[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class399 var21 = this.field4380[var18][var20];
                        int var22 = var21.field5691;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5689 >> class357.field4889);
                        float var28 = (float) (var21.field5688 >> class357.field4889);
                        float var29 = (float) (var21.field5701 >> class357.field4889);
                        int var30 = var21.field5698 >> class357.field4889;
                        this.field4376.method36(true, 0.0F);
                        this.field4376.method36(true, 0.0F);
                        this.field4376.method36(true, (float) (-var30) * var9 + var27);
                        this.field4376.method36(true, (float) (-var30) * var10 + var28);
                        this.field4376.method36(true, (float) (-var30) * var11 + var29);
                        this.field4376.method173(var23, 255);
                        this.field4376.method173(var24, 255);
                        this.field4376.method173(var25, 255);
                        this.field4376.method173(var26, 255);
                        this.field4376.method36(true, 1.0F);
                        this.field4376.method36(true, 0.0F);
                        this.field4376.method36(true, (float) var30 * var12 + var27);
                        this.field4376.method36(true, (float) var30 * var13 + var28);
                        this.field4376.method36(true, (float) var30 * var14 + var29);
                        this.field4376.method173(var23, 255);
                        this.field4376.method173(var24, 255);
                        this.field4376.method173(var25, 255);
                        this.field4376.method173(var26, 255);
                        this.field4376.method36(true, 1.0F);
                        this.field4376.method36(true, 1.0F);
                        this.field4376.method36(true, (float) var30 * var9 + var27);
                        this.field4376.method36(true, (float) var30 * var10 + var28);
                        this.field4376.method36(true, (float) var30 * var11 + var29);
                        this.field4376.method173(var23, 255);
                        this.field4376.method173(var24, 255);
                        this.field4376.method173(var25, 255);
                        this.field4376.method173(var26, 255);
                        this.field4376.method36(true, 0.0F);
                        this.field4376.method36(true, 1.0F);
                        this.field4376.method36(true, (float) var30 * var15 + var27);
                        this.field4376.method36(true, (float) var30 * var16 + var28);
                        this.field4376.method36(true, (float) var30 * var17 + var29);
                        this.field4376.method173(var23, 255);
                        this.field4376.method173(var24, 255);
                        this.field4376.method173(var25, 255);
                        this.field4376.method173(var26, 255);
                    }
                    if (this.field4387[var18] > 64) {
                        int var31 = this.field4387[var18] - 64 - 1;
                        for (int var32 = this.field4384[var31] - 1; var32 >= 0; var32--) {
                            class399 var33 = this.field4379[var31][var32];
                            int var34 = var33.field5691;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5689 >> class357.field4889);
                            float var40 = (float) (var33.field5688 >> class357.field4889);
                            float var41 = (float) (var33.field5701 >> class357.field4889);
                            int var42 = var33.field5698 >> class357.field4889;
                            this.field4376.method36(true, 0.0F);
                            this.field4376.method36(true, 0.0F);
                            this.field4376.method36(true, (float) (-var42) * var9 + var39);
                            this.field4376.method36(true, (float) (-var42) * var10 + var40);
                            this.field4376.method36(true, (float) (-var42) * var11 + var41);
                            this.field4376.method173(var35, 255);
                            this.field4376.method173(var36, 255);
                            this.field4376.method173(var37, 255);
                            this.field4376.method173(var38, 255);
                            this.field4376.method36(true, 1.0F);
                            this.field4376.method36(true, 0.0F);
                            this.field4376.method36(true, (float) var42 * var12 + var39);
                            this.field4376.method36(true, (float) var42 * var13 + var40);
                            this.field4376.method36(true, (float) var42 * var14 + var41);
                            this.field4376.method173(var35, 255);
                            this.field4376.method173(var36, 255);
                            this.field4376.method173(var37, 255);
                            this.field4376.method173(var38, 255);
                            this.field4376.method36(true, 1.0F);
                            this.field4376.method36(true, 1.0F);
                            this.field4376.method36(true, (float) var42 * var9 + var39);
                            this.field4376.method36(true, (float) var42 * var10 + var40);
                            this.field4376.method36(true, (float) var42 * var11 + var41);
                            this.field4376.method173(var35, 255);
                            this.field4376.method173(var36, 255);
                            this.field4376.method173(var37, 255);
                            this.field4376.method173(var38, 255);
                            this.field4376.method36(true, 0.0F);
                            this.field4376.method36(true, 1.0F);
                            this.field4376.method36(true, (float) var42 * var15 + var39);
                            this.field4376.method36(true, (float) var42 * var16 + var40);
                            this.field4376.method36(true, (float) var42 * var17 + var41);
                            this.field4376.method173(var35, 255);
                            this.field4376.method173(var36, 255);
                            this.field4376.method173(var37, 255);
                            this.field4376.method173(var38, 255);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field4387[var43] > 64 ? 64 : this.field4387[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class399 var46 = this.field4380[var43][var45];
                        int var47 = var46.field5691;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5689 >> class357.field4889);
                        float var53 = (float) (var46.field5688 >> class357.field4889);
                        float var54 = (float) (var46.field5701 >> class357.field4889);
                        int var55 = var46.field5698 >> class357.field4889;
                        this.field4376.method37(-1923362568, 0.0F);
                        this.field4376.method37(-1923362568, 0.0F);
                        this.field4376.method37(-1923362568, (float) (-var55) * var9 + var52);
                        this.field4376.method37(-1923362568, (float) (-var55) * var10 + var53);
                        this.field4376.method37(-1923362568, (float) (-var55) * var11 + var54);
                        this.field4376.method173(var48, 255);
                        this.field4376.method173(var49, 255);
                        this.field4376.method173(var50, 255);
                        this.field4376.method173(var51, 255);
                        this.field4376.method37(-1923362568, 1.0F);
                        this.field4376.method37(-1923362568, 0.0F);
                        this.field4376.method37(-1923362568, (float) var55 * var12 + var52);
                        this.field4376.method37(-1923362568, (float) var55 * var13 + var53);
                        this.field4376.method37(-1923362568, (float) var55 * var14 + var54);
                        this.field4376.method173(var48, 255);
                        this.field4376.method173(var49, 255);
                        this.field4376.method173(var50, 255);
                        this.field4376.method173(var51, 255);
                        this.field4376.method37(-1923362568, 1.0F);
                        this.field4376.method37(-1923362568, 1.0F);
                        this.field4376.method37(-1923362568, (float) var55 * var9 + var52);
                        this.field4376.method37(-1923362568, (float) var55 * var10 + var53);
                        this.field4376.method37(-1923362568, (float) var55 * var11 + var54);
                        this.field4376.method173(var48, 255);
                        this.field4376.method173(var49, 255);
                        this.field4376.method173(var50, 255);
                        this.field4376.method173(var51, 255);
                        this.field4376.method37(-1923362568, 0.0F);
                        this.field4376.method37(-1923362568, 1.0F);
                        this.field4376.method37(-1923362568, (float) var55 * var15 + var52);
                        this.field4376.method37(-1923362568, (float) var55 * var16 + var53);
                        this.field4376.method37(-1923362568, (float) var55 * var17 + var54);
                        this.field4376.method173(var48, 255);
                        this.field4376.method173(var49, 255);
                        this.field4376.method173(var50, 255);
                        this.field4376.method173(var51, 255);
                    }
                    if (this.field4387[var43] > 64) {
                        int var56 = this.field4387[var43] - 64 - 1;
                        for (int var57 = this.field4384[var56] - 1; var57 >= 0; var57--) {
                            class399 var58 = this.field4379[var56][var57];
                            int var59 = var58.field5691;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5689 >> class357.field4889);
                            float var65 = (float) (var58.field5688 >> class357.field4889);
                            float var66 = (float) (var58.field5701 >> class357.field4889);
                            int var67 = var58.field5698 >> class357.field4889;
                            this.field4376.method37(-1923362568, 0.0F);
                            this.field4376.method37(-1923362568, 0.0F);
                            this.field4376.method37(-1923362568, (float) (-var67) * var9 + var64);
                            this.field4376.method37(-1923362568, (float) (-var67) * var10 + var65);
                            this.field4376.method37(-1923362568, (float) (-var67) * var11 + var66);
                            this.field4376.method173(var60, 255);
                            this.field4376.method173(var61, 255);
                            this.field4376.method173(var62, 255);
                            this.field4376.method173(var63, 255);
                            this.field4376.method37(-1923362568, 1.0F);
                            this.field4376.method37(-1923362568, 0.0F);
                            this.field4376.method37(-1923362568, (float) var67 * var12 + var64);
                            this.field4376.method37(-1923362568, (float) var67 * var13 + var65);
                            this.field4376.method37(-1923362568, (float) var67 * var14 + var66);
                            this.field4376.method173(var60, 255);
                            this.field4376.method173(var61, 255);
                            this.field4376.method173(var62, 255);
                            this.field4376.method173(var63, 255);
                            this.field4376.method37(-1923362568, 1.0F);
                            this.field4376.method37(-1923362568, 1.0F);
                            this.field4376.method37(-1923362568, (float) var67 * var9 + var64);
                            this.field4376.method37(-1923362568, (float) var67 * var10 + var65);
                            this.field4376.method37(-1923362568, (float) var67 * var11 + var66);
                            this.field4376.method173(var60, 255);
                            this.field4376.method173(var61, 255);
                            this.field4376.method173(var62, 255);
                            this.field4376.method173(var63, 255);
                            this.field4376.method37(-1923362568, 0.0F);
                            this.field4376.method37(-1923362568, 1.0F);
                            this.field4376.method37(-1923362568, (float) var67 * var15 + var64);
                            this.field4376.method37(-1923362568, (float) var67 * var16 + var65);
                            this.field4376.method37(-1923362568, (float) var67 * var17 + var66);
                            this.field4376.method173(var60, 255);
                            this.field4376.method173(var61, 255);
                            this.field4376.method173(var62, 255);
                            this.field4376.method173(var63, 255);
                        }
                    }
                }
            }
        }
        if (this.field4376.field191 != 0) {
            this.field4383.method814(24, this.field4376.field230, this.field4376.field191);
            arg0.method1513(this.field4388, (class246) null, this.field4382, this.field4386);
            arg0.method1504(7, 0, this.field4376.field191 / 24);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltb;Lmr;)V")
    public final void method2069(class227 arg0, class77 arg1) {
        this.field4377 = arg0.field3184;
        if (arg0.field3226 == null) {
            return;
        }
        this.method2070(arg0);
        float var3 = arg0.field3226.field4440;
        float var4 = arg0.field3226.field4439;
        float var5 = arg0.field3226.field4430;
        float var6 = arg0.field3226.field4434;
        try {
            if (arg1.field1110) {
                int var23 = arg1.field1108 - arg1.field1111;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class325 var24 = arg1.field1102.field4089;
                class325 var25 = var24.field4449;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field4385 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field4387[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field4384[var29] = 0;
                    }
                    while (var24 != var25) {
                        class399 var30 = (class399) var25;
                        if (var27) {
                            var26 = var30.field5696;
                            var27 = false;
                        } else if (var30.field5696 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5701 >> class357.field4889) * var5 + (float) (var30.field5689 >> class357.field4889) * var3 + (float) (var30.field5688 >> class357.field4889) * var4 + var6) - arg1.field1111;
                        if (var31 <= 1600) {
                            if (this.field4387[var31] < 64) {
                                this.field4380[var31][this.field4387[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field4387[var31] == 64) {
                                        if (this.field4385 == 64) {
                                            break label188;
                                        }
                                        this.field4387[var31] += this.field4385++ + 1;
                                    }
                                    this.field4379[this.field4387[var31] - 64 - 1][this.field4384[this.field4387[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4449;
                    }
                    arg0.method1559(var26 >= 0 ? arg0.field3191.method2563(34842, var26) : null);
                    this.method2068(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class325 var10 = arg1.field1102.field4089;
                for (class325 var11 = var10.field4449; var11 != var10; var11 = var11.field4449) {
                    class399 var12 = (class399) var11;
                    int var13 = (int) ((float) (var12.field5701 >> class357.field4889) * var5 + (float) (var12.field5689 >> class357.field4889) * var3 + (float) (var12.field5688 >> class357.field4889) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field4381[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class325 var15 = var10.field4449;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field4385 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field4387[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field4384[var20] = 0;
                    }
                    while (var10 != var15) {
                        class399 var21 = (class399) var15;
                        if (var18) {
                            var17 = var21.field5696;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5696 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field4381[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field4387[var22] < 64) {
                                this.field4380[var22][this.field4387[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field4387[var22] == 64) {
                                        if (this.field4385 == 64) {
                                            break label186;
                                        }
                                        this.field4387[var22] += this.field4385++ + 1;
                                    }
                                    this.field4379[this.field4387[var22] - 64 - 1][this.field4384[this.field4387[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4449;
                    }
                    arg0.method1559(var17 >= 0 ? arg0.field3191.method2563(34842, var17) : null);
                    this.method2068(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2067(arg0);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ltb;)V")
    private final void method2070(class227 arg0) {
        arg0.method1528();
        this.field4377.glDisable(16384);
        this.field4377.glDisable(16385);
        arg0.method1519(false);
        arg0.method1516(-2);
        this.field4377.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Ltb;)V")
    public final void method2071(class227 arg0) {
        this.field4383 = arg0.method1554(24, (byte[]) null, 196584, true);
        this.field4386 = new class246(arg0, this.field4383, 5126, 2, 0);
        this.field4388 = new class246(arg0, this.field4383, 5126, 3, 8);
        this.field4382 = new class246(arg0, this.field4383, 5121, 4, 20);
    }
}
