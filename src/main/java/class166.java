import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class166 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "[F")
    private float[] field2305 = new float[16];

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "Ljj;")
    private class41 field2306 = new class41(786336);

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    private int[] field2309 = new int[1600];

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[I")
    private int[] field2310 = new int[8191];

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[I")
    private int[] field2311 = new int[64];

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[[Loo;")
    private class27[][] field2315 = new class27[1600][64];

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    private int field2307 = 0;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "[[Loo;")
    private class27[][] field2316 = new class27[64][768];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lna;")
    private class226 field2313;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Ltf;")
    private class464 field2308;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Ltf;")
    private class464 field2312;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Ltf;")
    private class464 field2314;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Ljaggl/opengl;")
    private opengl field2304;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lcg;)V")
    public final void method993(class393 arg0) {
        this.field2313 = arg0.method2439(24, (byte[]) null, 196584, true);
        this.field2314 = new class464(arg0, this.field2313, 5126, 2, 0);
        this.field2308 = new class464(arg0, this.field2313, 5126, 3, 8);
        this.field2312 = new class464(arg0, this.field2313, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lcg;I)V")
    private final void method994(class393 arg0, int arg1) {
        this.field2304.glGetFloatv(2982, this.field2305, 0);
        float var3 = this.field2305[0];
        float var4 = this.field2305[4];
        float var5 = this.field2305[8];
        float var6 = this.field2305[1];
        float var7 = this.field2305[5];
        float var8 = this.field2305[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field2306.field5666 = 0;
        if (arg0.field5879) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field2309[var18] > 64 ? 64 : this.field2309[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class27 var21 = this.field2315[var18][var20];
                        int var22 = var21.field352;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field354 >> class150.field2075);
                        float var28 = (float) (var21.field355 >> class150.field2075);
                        float var29 = (float) (var21.field353 >> class150.field2075);
                        int var30 = var21.field350 >> class150.field2075;
                        this.field2306.method229(0.0F, -32);
                        this.field2306.method229(0.0F, -126);
                        this.field2306.method229((float) (-var30) * var9 + var27, -120);
                        this.field2306.method229((float) (-var30) * var10 + var28, -122);
                        this.field2306.method229((float) (-var30) * var11 + var29, -127);
                        this.field2306.method2366(var23, true);
                        this.field2306.method2366(var24, true);
                        this.field2306.method2366(var25, true);
                        this.field2306.method2366(var26, true);
                        this.field2306.method229(1.0F, -116);
                        this.field2306.method229(0.0F, 41);
                        this.field2306.method229((float) var30 * var12 + var27, -120);
                        this.field2306.method229((float) var30 * var13 + var28, -46);
                        this.field2306.method229((float) var30 * var14 + var29, 1);
                        this.field2306.method2366(var23, true);
                        this.field2306.method2366(var24, true);
                        this.field2306.method2366(var25, true);
                        this.field2306.method2366(var26, true);
                        this.field2306.method229(1.0F, -126);
                        this.field2306.method229(1.0F, -22);
                        this.field2306.method229((float) var30 * var9 + var27, -117);
                        this.field2306.method229((float) var30 * var10 + var28, 125);
                        this.field2306.method229((float) var30 * var11 + var29, -116);
                        this.field2306.method2366(var23, true);
                        this.field2306.method2366(var24, true);
                        this.field2306.method2366(var25, true);
                        this.field2306.method2366(var26, true);
                        this.field2306.method229(0.0F, 12);
                        this.field2306.method229(1.0F, 20);
                        this.field2306.method229((float) var30 * var15 + var27, -128);
                        this.field2306.method229((float) var30 * var16 + var28, 0);
                        this.field2306.method229((float) var30 * var17 + var29, -121);
                        this.field2306.method2366(var23, true);
                        this.field2306.method2366(var24, true);
                        this.field2306.method2366(var25, true);
                        this.field2306.method2366(var26, true);
                    }
                    if (this.field2309[var18] > 64) {
                        int var31 = this.field2309[var18] - 64 - 1;
                        for (int var32 = this.field2311[var31] - 1; var32 >= 0; var32--) {
                            class27 var33 = this.field2316[var31][var32];
                            int var34 = var33.field352;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field354 >> class150.field2075);
                            float var40 = (float) (var33.field355 >> class150.field2075);
                            float var41 = (float) (var33.field353 >> class150.field2075);
                            int var42 = var33.field350 >> class150.field2075;
                            this.field2306.method229(0.0F, 6);
                            this.field2306.method229(0.0F, -116);
                            this.field2306.method229((float) (-var42) * var9 + var39, -122);
                            this.field2306.method229((float) (-var42) * var10 + var40, -117);
                            this.field2306.method229((float) (-var42) * var11 + var41, -118);
                            this.field2306.method2366(var35, true);
                            this.field2306.method2366(var36, true);
                            this.field2306.method2366(var37, true);
                            this.field2306.method2366(var38, true);
                            this.field2306.method229(1.0F, -117);
                            this.field2306.method229(0.0F, 33);
                            this.field2306.method229((float) var42 * var12 + var39, -116);
                            this.field2306.method229((float) var42 * var13 + var40, 95);
                            this.field2306.method229((float) var42 * var14 + var41, 103);
                            this.field2306.method2366(var35, true);
                            this.field2306.method2366(var36, true);
                            this.field2306.method2366(var37, true);
                            this.field2306.method2366(var38, true);
                            this.field2306.method229(1.0F, 44);
                            this.field2306.method229(1.0F, 42);
                            this.field2306.method229((float) var42 * var9 + var39, 38);
                            this.field2306.method229((float) var42 * var10 + var40, 77);
                            this.field2306.method229((float) var42 * var11 + var41, -121);
                            this.field2306.method2366(var35, true);
                            this.field2306.method2366(var36, true);
                            this.field2306.method2366(var37, true);
                            this.field2306.method2366(var38, true);
                            this.field2306.method229(0.0F, -126);
                            this.field2306.method229(1.0F, -120);
                            this.field2306.method229((float) var42 * var15 + var39, 88);
                            this.field2306.method229((float) var42 * var16 + var40, -119);
                            this.field2306.method229((float) var42 * var17 + var41, -128);
                            this.field2306.method2366(var35, true);
                            this.field2306.method2366(var36, true);
                            this.field2306.method2366(var37, true);
                            this.field2306.method2366(var38, true);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field2309[var43] > 64 ? 64 : this.field2309[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class27 var46 = this.field2315[var43][var45];
                        int var47 = var46.field352;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field354 >> class150.field2075);
                        float var53 = (float) (var46.field355 >> class150.field2075);
                        float var54 = (float) (var46.field353 >> class150.field2075);
                        int var55 = var46.field350 >> class150.field2075;
                        this.field2306.method228(-1839018424, 0.0F);
                        this.field2306.method228(-1839018424, 0.0F);
                        this.field2306.method228(-1839018424, (float) (-var55) * var9 + var52);
                        this.field2306.method228(-1839018424, (float) (-var55) * var10 + var53);
                        this.field2306.method228(-1839018424, (float) (-var55) * var11 + var54);
                        this.field2306.method2366(var48, true);
                        this.field2306.method2366(var49, true);
                        this.field2306.method2366(var50, true);
                        this.field2306.method2366(var51, true);
                        this.field2306.method228(-1839018424, 1.0F);
                        this.field2306.method228(-1839018424, 0.0F);
                        this.field2306.method228(-1839018424, (float) var55 * var12 + var52);
                        this.field2306.method228(-1839018424, (float) var55 * var13 + var53);
                        this.field2306.method228(-1839018424, (float) var55 * var14 + var54);
                        this.field2306.method2366(var48, true);
                        this.field2306.method2366(var49, true);
                        this.field2306.method2366(var50, true);
                        this.field2306.method2366(var51, true);
                        this.field2306.method228(-1839018424, 1.0F);
                        this.field2306.method228(-1839018424, 1.0F);
                        this.field2306.method228(-1839018424, (float) var55 * var9 + var52);
                        this.field2306.method228(-1839018424, (float) var55 * var10 + var53);
                        this.field2306.method228(-1839018424, (float) var55 * var11 + var54);
                        this.field2306.method2366(var48, true);
                        this.field2306.method2366(var49, true);
                        this.field2306.method2366(var50, true);
                        this.field2306.method2366(var51, true);
                        this.field2306.method228(-1839018424, 0.0F);
                        this.field2306.method228(-1839018424, 1.0F);
                        this.field2306.method228(-1839018424, (float) var55 * var15 + var52);
                        this.field2306.method228(-1839018424, (float) var55 * var16 + var53);
                        this.field2306.method228(-1839018424, (float) var55 * var17 + var54);
                        this.field2306.method2366(var48, true);
                        this.field2306.method2366(var49, true);
                        this.field2306.method2366(var50, true);
                        this.field2306.method2366(var51, true);
                    }
                    if (this.field2309[var43] > 64) {
                        int var56 = this.field2309[var43] - 64 - 1;
                        for (int var57 = this.field2311[var56] - 1; var57 >= 0; var57--) {
                            class27 var58 = this.field2316[var56][var57];
                            int var59 = var58.field352;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field354 >> class150.field2075);
                            float var65 = (float) (var58.field355 >> class150.field2075);
                            float var66 = (float) (var58.field353 >> class150.field2075);
                            int var67 = var58.field350 >> class150.field2075;
                            this.field2306.method228(-1839018424, 0.0F);
                            this.field2306.method228(-1839018424, 0.0F);
                            this.field2306.method228(-1839018424, (float) (-var67) * var9 + var64);
                            this.field2306.method228(-1839018424, (float) (-var67) * var10 + var65);
                            this.field2306.method228(-1839018424, (float) (-var67) * var11 + var66);
                            this.field2306.method2366(var60, true);
                            this.field2306.method2366(var61, true);
                            this.field2306.method2366(var62, true);
                            this.field2306.method2366(var63, true);
                            this.field2306.method228(-1839018424, 1.0F);
                            this.field2306.method228(-1839018424, 0.0F);
                            this.field2306.method228(-1839018424, (float) var67 * var12 + var64);
                            this.field2306.method228(-1839018424, (float) var67 * var13 + var65);
                            this.field2306.method228(-1839018424, (float) var67 * var14 + var66);
                            this.field2306.method2366(var60, true);
                            this.field2306.method2366(var61, true);
                            this.field2306.method2366(var62, true);
                            this.field2306.method2366(var63, true);
                            this.field2306.method228(-1839018424, 1.0F);
                            this.field2306.method228(-1839018424, 1.0F);
                            this.field2306.method228(-1839018424, (float) var67 * var9 + var64);
                            this.field2306.method228(-1839018424, (float) var67 * var10 + var65);
                            this.field2306.method228(-1839018424, (float) var67 * var11 + var66);
                            this.field2306.method2366(var60, true);
                            this.field2306.method2366(var61, true);
                            this.field2306.method2366(var62, true);
                            this.field2306.method2366(var63, true);
                            this.field2306.method228(-1839018424, 0.0F);
                            this.field2306.method228(-1839018424, 1.0F);
                            this.field2306.method228(-1839018424, (float) var67 * var15 + var64);
                            this.field2306.method228(-1839018424, (float) var67 * var16 + var65);
                            this.field2306.method228(-1839018424, (float) var67 * var17 + var66);
                            this.field2306.method2366(var60, true);
                            this.field2306.method2366(var61, true);
                            this.field2306.method2366(var62, true);
                            this.field2306.method2366(var63, true);
                        }
                    }
                }
            }
        }
        if (this.field2306.field5666 != 0) {
            this.field2313.method1371(24, this.field2306.field5685, this.field2306.field5666);
            arg0.method2430(this.field2308, (class464) null, this.field2312, this.field2314);
            arg0.method2456(7, 0, this.field2306.field5666 / 24);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lcg;)V")
    private final void method995(class393 arg0) {
        arg0.method2465(true);
        this.field2304.glEnable(16384);
        this.field2304.glEnable(16385);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lcg;Lwa;)V")
    public final void method996(class393 arg0, class439 arg1) {
        this.field2304 = arg0.field5783;
        if (arg0.field5856 == null) {
            return;
        }
        this.method997(arg0);
        float var3 = arg0.field5856.field1297;
        float var4 = arg0.field5856.field1296;
        float var5 = arg0.field5856.field1298;
        float var6 = arg0.field5856.field1295;
        try {
            if (arg1.field6457) {
                int var23 = arg1.field6458 - arg1.field6459;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class304 var24 = arg1.field6454.field1040;
                class304 var25 = var24.field4597;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field2307 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field2309[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field2311[var29] = 0;
                    }
                    while (var24 != var25) {
                        class27 var30 = (class27) var25;
                        if (var27) {
                            var26 = var30.field349;
                            var27 = false;
                        } else if (var30.field349 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field353 >> class150.field2075) * var5 + (float) (var30.field355 >> class150.field2075) * var4 + (float) (var30.field354 >> class150.field2075) * var3 + var6) - arg1.field6459;
                        if (var31 <= 1600) {
                            if (this.field2309[var31] < 64) {
                                this.field2315[var31][this.field2309[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field2309[var31] == 64) {
                                        if (this.field2307 == 64) {
                                            break label188;
                                        }
                                        this.field2309[var31] += this.field2307++ + 1;
                                    }
                                    this.field2316[this.field2309[var31] - 64 - 1][this.field2311[this.field2309[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4597;
                    }
                    arg0.method2460(var26 >= 0 ? arg0.field5774.method2604(true, var26) : null);
                    this.method994(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class304 var10 = arg1.field6454.field1040;
                for (class304 var11 = var10.field4597; var11 != var10; var11 = var11.field4597) {
                    class27 var12 = (class27) var11;
                    int var13 = (int) ((float) (var12.field353 >> class150.field2075) * var5 + (float) (var12.field355 >> class150.field2075) * var4 + (float) (var12.field354 >> class150.field2075) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field2310[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class304 var15 = var10.field4597;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field2307 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field2309[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field2311[var20] = 0;
                    }
                    while (var10 != var15) {
                        class27 var21 = (class27) var15;
                        if (var18) {
                            var17 = var21.field349;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field349 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field2310[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field2309[var22] < 64) {
                                this.field2315[var22][this.field2309[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field2309[var22] == 64) {
                                        if (this.field2307 == 64) {
                                            break label186;
                                        }
                                        this.field2309[var22] += this.field2307++ + 1;
                                    }
                                    this.field2316[this.field2309[var22] - 64 - 1][this.field2311[this.field2309[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4597;
                    }
                    arg0.method2460(var17 >= 0 ? arg0.field5774.method2604(true, var17) : null);
                    this.method994(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method995(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(Lcg;)V")
    private final void method997(class393 arg0) {
        arg0.method2444();
        this.field2304.glDisable(16384);
        this.field2304.glDisable(16385);
        arg0.method2465(false);
        arg0.method2474(-2);
        this.field2304.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
