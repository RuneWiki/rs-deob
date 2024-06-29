import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class382 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[F")
    private float[] field5254 = new float[16];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Led;")
    private class299 field5252 = new class299(786336);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[[Lhf;")
    private class219[][] field5255 = new class219[64][768];

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    private int[] field5260 = new int[1600];

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    private int field5259 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    private int[] field5256 = new int[64];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[Lhf;")
    private class219[][] field5263 = new class219[1600][64];

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    private int[] field5262 = new int[8191];

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lq;")
    private class205 field5264;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lvl;")
    private class376 field5257;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lvl;")
    private class376 field5258;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lvl;")
    private class376 field5261;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field5253;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmm;I)V", line = 4)
    private final void method2360(class357 arg0, int arg1) {
        this.field5253.glGetFloatv(2982, this.field5254, 0);
        float var3 = this.field5254[0];
        float var4 = this.field5254[4];
        float var5 = this.field5254[8];
        float var6 = this.field5254[1];
        float var7 = this.field5254[5];
        float var8 = this.field5254[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5252.field5048 = 0;
        if (arg0.field4829) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5260[var18] > 64 ? 64 : this.field5260[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class219 var21 = this.field5263[var18][var20];
                        int var22 = var21.field3077;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field3076 >> class26.field325);
                        float var28 = (float) (var21.field3070 >> class26.field325);
                        float var29 = (float) (var21.field3071 >> class26.field325);
                        int var30 = var21.field3075 >> class26.field325;
                        this.field5252.method1823((byte) -79, 0.0F);
                        this.field5252.method1823((byte) -87, 0.0F);
                        this.field5252.method1823((byte) -90, (float) (-var30) * var9 + var27);
                        this.field5252.method1823((byte) -78, (float) (-var30) * var10 + var28);
                        this.field5252.method1823((byte) -68, (float) (-var30) * var11 + var29);
                        this.field5252.method2280(var23, 1537846408);
                        this.field5252.method2280(var24, 1537846408);
                        this.field5252.method2280(var25, 1537846408);
                        this.field5252.method2280(var26, 1537846408);
                        this.field5252.method1823((byte) -103, 1.0F);
                        this.field5252.method1823((byte) -75, 0.0F);
                        this.field5252.method1823((byte) -123, (float) var30 * var12 + var27);
                        this.field5252.method1823((byte) -110, (float) var30 * var13 + var28);
                        this.field5252.method1823((byte) -122, (float) var30 * var14 + var29);
                        this.field5252.method2280(var23, 1537846408);
                        this.field5252.method2280(var24, 1537846408);
                        this.field5252.method2280(var25, 1537846408);
                        this.field5252.method2280(var26, 1537846408);
                        this.field5252.method1823((byte) -70, 1.0F);
                        this.field5252.method1823((byte) -110, 1.0F);
                        this.field5252.method1823((byte) -126, (float) var30 * var9 + var27);
                        this.field5252.method1823((byte) -85, (float) var30 * var10 + var28);
                        this.field5252.method1823((byte) -73, (float) var30 * var11 + var29);
                        this.field5252.method2280(var23, 1537846408);
                        this.field5252.method2280(var24, 1537846408);
                        this.field5252.method2280(var25, 1537846408);
                        this.field5252.method2280(var26, 1537846408);
                        this.field5252.method1823((byte) -75, 0.0F);
                        this.field5252.method1823((byte) -107, 1.0F);
                        this.field5252.method1823((byte) -111, (float) var30 * var15 + var27);
                        this.field5252.method1823((byte) -68, (float) var30 * var16 + var28);
                        this.field5252.method1823((byte) -121, (float) var30 * var17 + var29);
                        this.field5252.method2280(var23, 1537846408);
                        this.field5252.method2280(var24, 1537846408);
                        this.field5252.method2280(var25, 1537846408);
                        this.field5252.method2280(var26, 1537846408);
                    }
                    if (this.field5260[var18] > 64) {
                        int var31 = this.field5260[var18] - 64 - 1;
                        for (int var32 = this.field5256[var31] - 1; var32 >= 0; var32--) {
                            class219 var33 = this.field5255[var31][var32];
                            int var34 = var33.field3077;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field3076 >> class26.field325);
                            float var40 = (float) (var33.field3070 >> class26.field325);
                            float var41 = (float) (var33.field3071 >> class26.field325);
                            int var42 = var33.field3075 >> class26.field325;
                            this.field5252.method1823((byte) -126, 0.0F);
                            this.field5252.method1823((byte) -122, 0.0F);
                            this.field5252.method1823((byte) -77, (float) (-var42) * var9 + var39);
                            this.field5252.method1823((byte) -65, (float) (-var42) * var10 + var40);
                            this.field5252.method1823((byte) -112, (float) (-var42) * var11 + var41);
                            this.field5252.method2280(var35, 1537846408);
                            this.field5252.method2280(var36, 1537846408);
                            this.field5252.method2280(var37, 1537846408);
                            this.field5252.method2280(var38, 1537846408);
                            this.field5252.method1823((byte) -106, 1.0F);
                            this.field5252.method1823((byte) -64, 0.0F);
                            this.field5252.method1823((byte) -117, (float) var42 * var12 + var39);
                            this.field5252.method1823((byte) -99, (float) var42 * var13 + var40);
                            this.field5252.method1823((byte) -88, (float) var42 * var14 + var41);
                            this.field5252.method2280(var35, 1537846408);
                            this.field5252.method2280(var36, 1537846408);
                            this.field5252.method2280(var37, 1537846408);
                            this.field5252.method2280(var38, 1537846408);
                            this.field5252.method1823((byte) -80, 1.0F);
                            this.field5252.method1823((byte) -121, 1.0F);
                            this.field5252.method1823((byte) -81, (float) var42 * var9 + var39);
                            this.field5252.method1823((byte) -94, (float) var42 * var10 + var40);
                            this.field5252.method1823((byte) -83, (float) var42 * var11 + var41);
                            this.field5252.method2280(var35, 1537846408);
                            this.field5252.method2280(var36, 1537846408);
                            this.field5252.method2280(var37, 1537846408);
                            this.field5252.method2280(var38, 1537846408);
                            this.field5252.method1823((byte) -117, 0.0F);
                            this.field5252.method1823((byte) -80, 1.0F);
                            this.field5252.method1823((byte) -117, (float) var42 * var15 + var39);
                            this.field5252.method1823((byte) -75, (float) var42 * var16 + var40);
                            this.field5252.method1823((byte) -124, (float) var42 * var17 + var41);
                            this.field5252.method2280(var35, 1537846408);
                            this.field5252.method2280(var36, 1537846408);
                            this.field5252.method2280(var37, 1537846408);
                            this.field5252.method2280(var38, 1537846408);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5260[var43] > 64 ? 64 : this.field5260[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class219 var46 = this.field5263[var43][var45];
                        int var47 = var46.field3077;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field3076 >> class26.field325);
                        float var53 = (float) (var46.field3070 >> class26.field325);
                        float var54 = (float) (var46.field3071 >> class26.field325);
                        int var55 = var46.field3075 >> class26.field325;
                        this.field5252.method1824(0.0F, 10330);
                        this.field5252.method1824(0.0F, 10330);
                        this.field5252.method1824((float) (-var55) * var9 + var52, 10330);
                        this.field5252.method1824((float) (-var55) * var10 + var53, 10330);
                        this.field5252.method1824((float) (-var55) * var11 + var54, 10330);
                        this.field5252.method2280(var48, 1537846408);
                        this.field5252.method2280(var49, 1537846408);
                        this.field5252.method2280(var50, 1537846408);
                        this.field5252.method2280(var51, 1537846408);
                        this.field5252.method1824(1.0F, 10330);
                        this.field5252.method1824(0.0F, 10330);
                        this.field5252.method1824((float) var55 * var12 + var52, 10330);
                        this.field5252.method1824((float) var55 * var13 + var53, 10330);
                        this.field5252.method1824((float) var55 * var14 + var54, 10330);
                        this.field5252.method2280(var48, 1537846408);
                        this.field5252.method2280(var49, 1537846408);
                        this.field5252.method2280(var50, 1537846408);
                        this.field5252.method2280(var51, 1537846408);
                        this.field5252.method1824(1.0F, 10330);
                        this.field5252.method1824(1.0F, 10330);
                        this.field5252.method1824((float) var55 * var9 + var52, 10330);
                        this.field5252.method1824((float) var55 * var10 + var53, 10330);
                        this.field5252.method1824((float) var55 * var11 + var54, 10330);
                        this.field5252.method2280(var48, 1537846408);
                        this.field5252.method2280(var49, 1537846408);
                        this.field5252.method2280(var50, 1537846408);
                        this.field5252.method2280(var51, 1537846408);
                        this.field5252.method1824(0.0F, 10330);
                        this.field5252.method1824(1.0F, 10330);
                        this.field5252.method1824((float) var55 * var15 + var52, 10330);
                        this.field5252.method1824((float) var55 * var16 + var53, 10330);
                        this.field5252.method1824((float) var55 * var17 + var54, 10330);
                        this.field5252.method2280(var48, 1537846408);
                        this.field5252.method2280(var49, 1537846408);
                        this.field5252.method2280(var50, 1537846408);
                        this.field5252.method2280(var51, 1537846408);
                    }
                    if (this.field5260[var43] > 64) {
                        int var56 = this.field5260[var43] - 64 - 1;
                        for (int var57 = this.field5256[var56] - 1; var57 >= 0; var57--) {
                            class219 var58 = this.field5255[var56][var57];
                            int var59 = var58.field3077;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field3076 >> class26.field325);
                            float var65 = (float) (var58.field3070 >> class26.field325);
                            float var66 = (float) (var58.field3071 >> class26.field325);
                            int var67 = var58.field3075 >> class26.field325;
                            this.field5252.method1824(0.0F, 10330);
                            this.field5252.method1824(0.0F, 10330);
                            this.field5252.method1824((float) (-var67) * var9 + var64, 10330);
                            this.field5252.method1824((float) (-var67) * var10 + var65, 10330);
                            this.field5252.method1824((float) (-var67) * var11 + var66, 10330);
                            this.field5252.method2280(var60, 1537846408);
                            this.field5252.method2280(var61, 1537846408);
                            this.field5252.method2280(var62, 1537846408);
                            this.field5252.method2280(var63, 1537846408);
                            this.field5252.method1824(1.0F, 10330);
                            this.field5252.method1824(0.0F, 10330);
                            this.field5252.method1824((float) var67 * var12 + var64, 10330);
                            this.field5252.method1824((float) var67 * var13 + var65, 10330);
                            this.field5252.method1824((float) var67 * var14 + var66, 10330);
                            this.field5252.method2280(var60, 1537846408);
                            this.field5252.method2280(var61, 1537846408);
                            this.field5252.method2280(var62, 1537846408);
                            this.field5252.method2280(var63, 1537846408);
                            this.field5252.method1824(1.0F, 10330);
                            this.field5252.method1824(1.0F, 10330);
                            this.field5252.method1824((float) var67 * var9 + var64, 10330);
                            this.field5252.method1824((float) var67 * var10 + var65, 10330);
                            this.field5252.method1824((float) var67 * var11 + var66, 10330);
                            this.field5252.method2280(var60, 1537846408);
                            this.field5252.method2280(var61, 1537846408);
                            this.field5252.method2280(var62, 1537846408);
                            this.field5252.method2280(var63, 1537846408);
                            this.field5252.method1824(0.0F, 10330);
                            this.field5252.method1824(1.0F, 10330);
                            this.field5252.method1824((float) var67 * var15 + var64, 10330);
                            this.field5252.method1824((float) var67 * var16 + var65, 10330);
                            this.field5252.method1824((float) var67 * var17 + var66, 10330);
                            this.field5252.method2280(var60, 1537846408);
                            this.field5252.method2280(var61, 1537846408);
                            this.field5252.method2280(var62, 1537846408);
                            this.field5252.method2280(var63, 1537846408);
                        }
                    }
                }
            }
        }
        if (this.field5252.field5048 != 0) {
            this.field5264.method576(24, this.field5252.field5076, this.field5252.field5048);
            arg0.method2143(this.field5257, (class376) null, this.field5258, this.field5261);
            arg0.method2166(7, 0, this.field5252.field5048 / 24);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmm;)V", line = 348)
    public final void method2361(class357 arg0) {
        this.field5264 = arg0.method2177(24, (byte[]) null, 196584, true);
        this.field5261 = new class376(arg0, this.field5264, 5126, 2, 0);
        this.field5257 = new class376(arg0, this.field5264, 5126, 3, 8);
        this.field5258 = new class376(arg0, this.field5264, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmm;Lns;)V", line = 356)
    public final void method2362(class357 arg0, class174 arg1) {
        this.field5253 = arg0.field4794;
        if (arg0.field4918 == null) {
            return;
        }
        this.method2363(arg0);
        float var3 = arg0.field4918.field6125;
        float var4 = arg0.field4918.field6133;
        float var5 = arg0.field4918.field6131;
        float var6 = arg0.field4918.field6132;
        try {
            if (arg1.field2488) {
                int var23 = arg1.field2489 - arg1.field2487;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class422 var24 = arg1.field2485.field598;
                class422 var25 = var24.field5847;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5259 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5260[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5256[var29] = 0;
                    }
                    while (var24 != var25) {
                        class219 var30 = (class219) var25;
                        if (var27) {
                            var26 = var30.field3073;
                            var27 = false;
                        } else if (var30.field3073 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field3071 >> class26.field325) * var5 + (float) (var30.field3076 >> class26.field325) * var3 + (float) (var30.field3070 >> class26.field325) * var4 + var6) - arg1.field2487;
                        if (var31 <= 1600) {
                            if (this.field5260[var31] < 64) {
                                this.field5263[var31][this.field5260[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5260[var31] == 64) {
                                        if (this.field5259 == 64) {
                                            break label188;
                                        }
                                        this.field5260[var31] += this.field5259++ + 1;
                                    }
                                    this.field5255[this.field5260[var31] - 64 - 1][this.field5256[this.field5260[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field5847;
                    }
                    arg0.method2180(var26 >= 0 ? arg0.field4804.method713(var26, 64) : null);
                    this.method2360(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class422 var10 = arg1.field2485.field598;
                for (class422 var11 = var10.field5847; var11 != var10; var11 = var11.field5847) {
                    class219 var12 = (class219) var11;
                    int var13 = (int) ((float) (var12.field3071 >> class26.field325) * var5 + (float) (var12.field3076 >> class26.field325) * var3 + (float) (var12.field3070 >> class26.field325) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5262[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class422 var15 = var10.field5847;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5259 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5260[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5256[var20] = 0;
                    }
                    while (var10 != var15) {
                        class219 var21 = (class219) var15;
                        if (var18) {
                            var17 = var21.field3073;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field3073 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5262[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5260[var22] < 64) {
                                this.field5263[var22][this.field5260[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5260[var22] == 64) {
                                        if (this.field5259 == 64) {
                                            break label186;
                                        }
                                        this.field5260[var22] += this.field5259++ + 1;
                                    }
                                    this.field5255[this.field5260[var22] - 64 - 1][this.field5256[this.field5260[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field5847;
                    }
                    arg0.method2180(var17 >= 0 ? arg0.field4804.method713(var17, 64) : null);
                    this.method2360(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2364(arg0);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Lmm;)V", line = 586)
    private final void method2363(class357 arg0) {
        arg0.method2210();
        this.field5253.glDisable(16384);
        this.field5253.glDisable(16385);
        arg0.method2174(false);
        arg0.method2169(-2);
        this.field5253.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Lmm;)V", line = 594)
    private final void method2364(class357 arg0) {
        arg0.method2174(true);
        this.field5253.glEnable(16384);
        this.field5253.glEnable(16385);
    }
}
