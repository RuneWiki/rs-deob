import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class463 {

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "[F")
    private float[] field6274 = new float[16];

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lji;")
    private class399 field6273 = new class399(786336);

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "[[Lat;")
    private class233[][] field6280 = new class233[1600][64];

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "[I")
    private int[] field6282 = new int[64];

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "[[Lat;")
    private class233[][] field6277 = new class233[64][768];

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    private int field6283 = 0;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "[I")
    private int[] field6281 = new int[8191];

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[I")
    private int[] field6285 = new int[1600];

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "F")
    private static float field6275;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Lkj;")
    private class366 field6278;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Lkj;")
    private class366 field6279;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Lkj;")
    private class366 field6284;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "Lfg;")
    private class74 field6276;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Ljaggl/opengl;")
    private opengl field6272;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lbf;)V")
    private final void method2724(class344 arg0) {
        arg0.method2040(true);
        if (field6275 != arg0.field4641) {
            arg0.method2087(field6275);
        }
        this.field6272.glEnable(16384);
        this.field6272.glEnable(16385);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lbf;I)V")
    private final void method2725(class344 arg0, int arg1) {
        this.field6272.glGetFloatv(2982, this.field6274, 0);
        float var3 = this.field6274[0];
        float var4 = this.field6274[4];
        float var5 = this.field6274[8];
        float var6 = this.field6274[1];
        float var7 = this.field6274[5];
        float var8 = this.field6274[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field6273.field456 = 0;
        if (arg0.field4721) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field6285[var18] > 64 ? 64 : this.field6285[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class233 var21 = this.field6280[var18][var20];
                        int var22 = var21.field3093;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field3088 >> class462.field6253);
                        float var28 = (float) (var21.field3094 >> class462.field6253);
                        float var29 = (float) (var21.field3091 >> class462.field6253);
                        int var30 = var21.field3096 >> class462.field6253;
                        this.field6273.method2422(0.0F, 22553);
                        this.field6273.method2422(0.0F, 22553);
                        this.field6273.method2422((float) (-var30) * var9 + var27, 22553);
                        this.field6273.method2422((float) (-var30) * var10 + var28, 22553);
                        this.field6273.method2422((float) (-var30) * var11 + var29, 22553);
                        this.field6273.method228(var23, 32);
                        this.field6273.method228(var24, 32);
                        this.field6273.method228(var25, 32);
                        this.field6273.method228(var26, 32);
                        this.field6273.method2422(1.0F, 22553);
                        this.field6273.method2422(0.0F, 22553);
                        this.field6273.method2422((float) var30 * var12 + var27, 22553);
                        this.field6273.method2422((float) var30 * var13 + var28, 22553);
                        this.field6273.method2422((float) var30 * var14 + var29, 22553);
                        this.field6273.method228(var23, 32);
                        this.field6273.method228(var24, 32);
                        this.field6273.method228(var25, 32);
                        this.field6273.method228(var26, 32);
                        this.field6273.method2422(1.0F, 22553);
                        this.field6273.method2422(1.0F, 22553);
                        this.field6273.method2422((float) var30 * var9 + var27, 22553);
                        this.field6273.method2422((float) var30 * var10 + var28, 22553);
                        this.field6273.method2422((float) var30 * var11 + var29, 22553);
                        this.field6273.method228(var23, 32);
                        this.field6273.method228(var24, 32);
                        this.field6273.method228(var25, 32);
                        this.field6273.method228(var26, 32);
                        this.field6273.method2422(0.0F, 22553);
                        this.field6273.method2422(1.0F, 22553);
                        this.field6273.method2422((float) var30 * var15 + var27, 22553);
                        this.field6273.method2422((float) var30 * var16 + var28, 22553);
                        this.field6273.method2422((float) var30 * var17 + var29, 22553);
                        this.field6273.method228(var23, 32);
                        this.field6273.method228(var24, 32);
                        this.field6273.method228(var25, 32);
                        this.field6273.method228(var26, 32);
                    }
                    if (this.field6285[var18] > 64) {
                        int var31 = this.field6285[var18] - 64 - 1;
                        for (int var32 = this.field6282[var31] - 1; var32 >= 0; var32--) {
                            class233 var33 = this.field6277[var31][var32];
                            int var34 = var33.field3093;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field3088 >> class462.field6253);
                            float var40 = (float) (var33.field3094 >> class462.field6253);
                            float var41 = (float) (var33.field3091 >> class462.field6253);
                            int var42 = var33.field3096 >> class462.field6253;
                            this.field6273.method2422(0.0F, 22553);
                            this.field6273.method2422(0.0F, 22553);
                            this.field6273.method2422((float) (-var42) * var9 + var39, 22553);
                            this.field6273.method2422((float) (-var42) * var10 + var40, 22553);
                            this.field6273.method2422((float) (-var42) * var11 + var41, 22553);
                            this.field6273.method228(var35, 32);
                            this.field6273.method228(var36, 32);
                            this.field6273.method228(var37, 32);
                            this.field6273.method228(var38, 32);
                            this.field6273.method2422(1.0F, 22553);
                            this.field6273.method2422(0.0F, 22553);
                            this.field6273.method2422((float) var42 * var12 + var39, 22553);
                            this.field6273.method2422((float) var42 * var13 + var40, 22553);
                            this.field6273.method2422((float) var42 * var14 + var41, 22553);
                            this.field6273.method228(var35, 32);
                            this.field6273.method228(var36, 32);
                            this.field6273.method228(var37, 32);
                            this.field6273.method228(var38, 32);
                            this.field6273.method2422(1.0F, 22553);
                            this.field6273.method2422(1.0F, 22553);
                            this.field6273.method2422((float) var42 * var9 + var39, 22553);
                            this.field6273.method2422((float) var42 * var10 + var40, 22553);
                            this.field6273.method2422((float) var42 * var11 + var41, 22553);
                            this.field6273.method228(var35, 32);
                            this.field6273.method228(var36, 32);
                            this.field6273.method228(var37, 32);
                            this.field6273.method228(var38, 32);
                            this.field6273.method2422(0.0F, 22553);
                            this.field6273.method2422(1.0F, 22553);
                            this.field6273.method2422((float) var42 * var15 + var39, 22553);
                            this.field6273.method2422((float) var42 * var16 + var40, 22553);
                            this.field6273.method2422((float) var42 * var17 + var41, 22553);
                            this.field6273.method228(var35, 32);
                            this.field6273.method228(var36, 32);
                            this.field6273.method228(var37, 32);
                            this.field6273.method228(var38, 32);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field6285[var43] > 64 ? 64 : this.field6285[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class233 var46 = this.field6280[var43][var45];
                        int var47 = var46.field3093;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field3088 >> class462.field6253);
                        float var53 = (float) (var46.field3094 >> class462.field6253);
                        float var54 = (float) (var46.field3091 >> class462.field6253);
                        int var55 = var46.field3096 >> class462.field6253;
                        this.field6273.method2421(0.0F, -2062917296);
                        this.field6273.method2421(0.0F, -2062917296);
                        this.field6273.method2421((float) (-var55) * var9 + var52, -2062917296);
                        this.field6273.method2421((float) (-var55) * var10 + var53, -2062917296);
                        this.field6273.method2421((float) (-var55) * var11 + var54, -2062917296);
                        this.field6273.method228(var48, 32);
                        this.field6273.method228(var49, 32);
                        this.field6273.method228(var50, 32);
                        this.field6273.method228(var51, 32);
                        this.field6273.method2421(1.0F, -2062917296);
                        this.field6273.method2421(0.0F, -2062917296);
                        this.field6273.method2421((float) var55 * var12 + var52, -2062917296);
                        this.field6273.method2421((float) var55 * var13 + var53, -2062917296);
                        this.field6273.method2421((float) var55 * var14 + var54, -2062917296);
                        this.field6273.method228(var48, 32);
                        this.field6273.method228(var49, 32);
                        this.field6273.method228(var50, 32);
                        this.field6273.method228(var51, 32);
                        this.field6273.method2421(1.0F, -2062917296);
                        this.field6273.method2421(1.0F, -2062917296);
                        this.field6273.method2421((float) var55 * var9 + var52, -2062917296);
                        this.field6273.method2421((float) var55 * var10 + var53, -2062917296);
                        this.field6273.method2421((float) var55 * var11 + var54, -2062917296);
                        this.field6273.method228(var48, 32);
                        this.field6273.method228(var49, 32);
                        this.field6273.method228(var50, 32);
                        this.field6273.method228(var51, 32);
                        this.field6273.method2421(0.0F, -2062917296);
                        this.field6273.method2421(1.0F, -2062917296);
                        this.field6273.method2421((float) var55 * var15 + var52, -2062917296);
                        this.field6273.method2421((float) var55 * var16 + var53, -2062917296);
                        this.field6273.method2421((float) var55 * var17 + var54, -2062917296);
                        this.field6273.method228(var48, 32);
                        this.field6273.method228(var49, 32);
                        this.field6273.method228(var50, 32);
                        this.field6273.method228(var51, 32);
                    }
                    if (this.field6285[var43] > 64) {
                        int var56 = this.field6285[var43] - 64 - 1;
                        for (int var57 = this.field6282[var56] - 1; var57 >= 0; var57--) {
                            class233 var58 = this.field6277[var56][var57];
                            int var59 = var58.field3093;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field3088 >> class462.field6253);
                            float var65 = (float) (var58.field3094 >> class462.field6253);
                            float var66 = (float) (var58.field3091 >> class462.field6253);
                            int var67 = var58.field3096 >> class462.field6253;
                            this.field6273.method2421(0.0F, -2062917296);
                            this.field6273.method2421(0.0F, -2062917296);
                            this.field6273.method2421((float) (-var67) * var9 + var64, -2062917296);
                            this.field6273.method2421((float) (-var67) * var10 + var65, -2062917296);
                            this.field6273.method2421((float) (-var67) * var11 + var66, -2062917296);
                            this.field6273.method228(var60, 32);
                            this.field6273.method228(var61, 32);
                            this.field6273.method228(var62, 32);
                            this.field6273.method228(var63, 32);
                            this.field6273.method2421(1.0F, -2062917296);
                            this.field6273.method2421(0.0F, -2062917296);
                            this.field6273.method2421((float) var67 * var12 + var64, -2062917296);
                            this.field6273.method2421((float) var67 * var13 + var65, -2062917296);
                            this.field6273.method2421((float) var67 * var14 + var66, -2062917296);
                            this.field6273.method228(var60, 32);
                            this.field6273.method228(var61, 32);
                            this.field6273.method228(var62, 32);
                            this.field6273.method228(var63, 32);
                            this.field6273.method2421(1.0F, -2062917296);
                            this.field6273.method2421(1.0F, -2062917296);
                            this.field6273.method2421((float) var67 * var9 + var64, -2062917296);
                            this.field6273.method2421((float) var67 * var10 + var65, -2062917296);
                            this.field6273.method2421((float) var67 * var11 + var66, -2062917296);
                            this.field6273.method228(var60, 32);
                            this.field6273.method228(var61, 32);
                            this.field6273.method228(var62, 32);
                            this.field6273.method228(var63, 32);
                            this.field6273.method2421(0.0F, -2062917296);
                            this.field6273.method2421(1.0F, -2062917296);
                            this.field6273.method2421((float) var67 * var15 + var64, -2062917296);
                            this.field6273.method2421((float) var67 * var16 + var65, -2062917296);
                            this.field6273.method2421((float) var67 * var17 + var66, -2062917296);
                            this.field6273.method228(var60, 32);
                            this.field6273.method228(var61, 32);
                            this.field6273.method228(var62, 32);
                            this.field6273.method228(var63, 32);
                        }
                    }
                }
            }
        }
        if (this.field6273.field456 != 0) {
            this.field6276.method484(24, this.field6273.field472, this.field6273.field456);
            arg0.method1980(this.field6284, (class366) null, this.field6278, this.field6279);
            arg0.method2071(7, 0, this.field6273.field456 / 24);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lbf;Ltp;)V")
    public final void method2726(class344 arg0, class342 arg1) {
        this.field6272 = arg0.field4604;
        if (arg0.field4688 == null) {
            return;
        }
        this.method2727(arg0);
        float var3 = arg0.field4688.field2434;
        float var4 = arg0.field4688.field2441;
        float var5 = arg0.field4688.field2437;
        float var6 = arg0.field4688.field2442;
        try {
            if (arg1.field4580) {
                int var24 = arg1.field4582 - arg1.field4579;
                if (var24 > 1600) {
                    var24 = 1600;
                }
                class447 var25 = arg1.field4574.field4314;
                class447 var26 = var25.field6079;
                int var27 = -2;
                boolean var28 = true;
                boolean var29 = true;
                while (var25 != var26) {
                    this.field6283 = 0;
                    for (int var30 = 0; var30 < var24; var30++) {
                        this.field6285[var30] = 0;
                    }
                    for (int var31 = 0; var31 < 64; var31++) {
                        this.field6282[var31] = 0;
                    }
                    while (var25 != var26) {
                        class233 var32 = (class233) var26;
                        if (var29) {
                            var27 = var32.field3098;
                            var28 = var32.field3085;
                            var29 = false;
                        } else if (var32.field3098 != var27 || var32.field3085 != var28) {
                            var29 = true;
                            break;
                        }
                        int var33 = (int) ((float) (var32.field3091 >> class462.field6253) * var5 + (float) (var32.field3094 >> class462.field6253) * var4 + (float) (var32.field3088 >> class462.field6253) * var3 + var6) - arg1.field4579;
                        if (var33 < 1600) {
                            if (this.field6285[var33] < 64) {
                                this.field6280[var33][this.field6285[var33]++] = var32;
                            } else {
                                label129: {
                                    if (this.field6285[var33] == 64) {
                                        if (this.field6283 == 64) {
                                            break label129;
                                        }
                                        this.field6285[var33] += this.field6283++ + 1;
                                    }
                                    this.field6277[this.field6285[var33] - 64 - 1][this.field6282[this.field6285[var33] - 64 - 1]++] = var32;
                                }
                            }
                        }
                        var26 = var26.field6079;
                    }
                    if (var27 >= 0) {
                        arg0.method2106(arg0.field4611.method2178(var27, (byte) -99));
                    } else {
                        arg0.method2106((class386) null);
                    }
                    if (var28 && field6275 != arg0.field4641) {
                        arg0.method2087(field6275);
                    } else if (arg0.field4641 != 1.0F) {
                        arg0.method2087(1.0F);
                    }
                    this.method2725(arg0, var24);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class447 var10 = arg1.field4574.field4314;
                for (class447 var11 = var10.field6079; var11 != var10; var11 = var11.field6079) {
                    class233 var12 = (class233) var11;
                    int var13 = (int) ((float) (var12.field3091 >> class462.field6253) * var5 + (float) (var12.field3094 >> class462.field6253) * var4 + (float) (var12.field3088 >> class462.field6253) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field6281[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class447 var15 = var10.field6079;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                boolean var19 = true;
                while (var10 != var15) {
                    this.field6283 = 0;
                    for (int var20 = 0; var20 < var14; var20++) {
                        this.field6285[var20] = 0;
                    }
                    for (int var21 = 0; var21 < 64; var21++) {
                        this.field6282[var21] = 0;
                    }
                    while (var10 != var15) {
                        class233 var22 = (class233) var15;
                        if (var19) {
                            var17 = var22.field3098;
                            var18 = var22.field3085;
                            var19 = false;
                        }
                        if (var16 > 0 && (var22.field3098 != var17 || var22.field3085 != var18)) {
                            var19 = true;
                            break;
                        }
                        int var23 = this.field6281[var16++] - var8;
                        if (var23 < 1600) {
                            if (this.field6285[var23] < 64) {
                                this.field6280[var23][this.field6285[var23]++] = var22;
                            } else {
                                label173: {
                                    if (this.field6285[var23] == 64) {
                                        if (this.field6283 == 64) {
                                            break label173;
                                        }
                                        this.field6285[var23] += this.field6283++ + 1;
                                    }
                                    this.field6277[this.field6285[var23] - 64 - 1][this.field6282[this.field6285[var23] - 64 - 1]++] = var22;
                                }
                            }
                        }
                        var15 = var15.field6079;
                    }
                    if (var17 >= 0) {
                        arg0.method2106(arg0.field4611.method2178(var17, (byte) -86));
                    } else {
                        arg0.method2106((class386) null);
                    }
                    if (var18 && field6275 != arg0.field4641) {
                        arg0.method2087(field6275);
                    } else if (arg0.field4641 != 1.0F) {
                        arg0.method2087(1.0F);
                    }
                    this.method2725(arg0, var14);
                }
            }
        } catch (Exception var35) {
        }
        this.method2724(arg0);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lbf;)V")
    private final void method2727(class344 arg0) {
        field6275 = arg0.field4641;
        arg0.method2114();
        this.field6272.glDisable(16384);
        this.field6272.glDisable(16385);
        arg0.method2040(false);
        arg0.method1963(-2);
        this.field6272.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(Lbf;)V")
    public final void method2728(class344 arg0) {
        this.field6276 = arg0.method2038(24, (byte[]) null, 196584, true);
        this.field6279 = new class366(arg0, this.field6276, 5126, 2, 0);
        this.field6284 = new class366(arg0, this.field6276, 5126, 3, 8);
        this.field6278 = new class366(arg0, this.field6276, 5121, 4, 20);
    }
}
