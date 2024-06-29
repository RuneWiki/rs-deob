import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class324 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[F")
    private float[] field4399 = new float[16];

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lfb;")
    private class45 field4397 = new class45(786336);

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
    private int[] field4401 = new int[64];

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[[Leb;")
    private class383[][] field4404 = new class383[1600][64];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[I")
    private int[] field4408 = new int[8191];

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
    private int[] field4406 = new int[1600];

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[[Leb;")
    private class383[][] field4407 = new class383[64][768];

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lhk;")
    private class203 field4402;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lrs;")
    private class240 field4403;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Lrs;")
    private class240 field4405;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Lrs;")
    private class240 field4409;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field4398;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lhd;I)V")
    private final void method2061(class17 arg0, int arg1) {
        this.field4398.glGetFloatv(2982, this.field4399, 0);
        float var3 = this.field4399[0];
        float var4 = this.field4399[4];
        float var5 = this.field4399[8];
        float var6 = this.field4399[1];
        float var7 = this.field4399[5];
        float var8 = this.field4399[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field4397.field3938 = 0;
        if (arg0.field292) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field4406[var18] > 64 ? 64 : this.field4406[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class383 var21 = this.field4404[var18][var20];
                        int var22 = var21.field5376;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5371 >> class210.field2931);
                        float var28 = (float) (var21.field5367 >> class210.field2931);
                        float var29 = (float) (var21.field5365 >> class210.field2931);
                        int var30 = var21.field5372 >> class210.field2931;
                        this.field4397.method414(0.0F, -124);
                        this.field4397.method414(0.0F, 109);
                        this.field4397.method414((float) (-var30) * var9 + var27, 41);
                        this.field4397.method414((float) (-var30) * var10 + var28, -32);
                        this.field4397.method414((float) (-var30) * var11 + var29, -128);
                        this.field4397.method1824(47, var23);
                        this.field4397.method1824(58, var24);
                        this.field4397.method1824(93, var25);
                        this.field4397.method1824(109, var26);
                        this.field4397.method414(1.0F, -117);
                        this.field4397.method414(0.0F, 105);
                        this.field4397.method414((float) var30 * var12 + var27, -124);
                        this.field4397.method414((float) var30 * var13 + var28, -40);
                        this.field4397.method414((float) var30 * var14 + var29, -117);
                        this.field4397.method1824(85, var23);
                        this.field4397.method1824(108, var24);
                        this.field4397.method1824(77, var25);
                        this.field4397.method1824(86, var26);
                        this.field4397.method414(1.0F, 22);
                        this.field4397.method414(1.0F, -128);
                        this.field4397.method414((float) var30 * var9 + var27, 55);
                        this.field4397.method414((float) var30 * var10 + var28, -24);
                        this.field4397.method414((float) var30 * var11 + var29, -126);
                        this.field4397.method1824(123, var23);
                        this.field4397.method1824(45, var24);
                        this.field4397.method1824(87, var25);
                        this.field4397.method1824(41, var26);
                        this.field4397.method414(0.0F, 68);
                        this.field4397.method414(1.0F, -124);
                        this.field4397.method414((float) var30 * var15 + var27, -113);
                        this.field4397.method414((float) var30 * var16 + var28, 66);
                        this.field4397.method414((float) var30 * var17 + var29, -112);
                        this.field4397.method1824(109, var23);
                        this.field4397.method1824(93, var24);
                        this.field4397.method1824(78, var25);
                        this.field4397.method1824(52, var26);
                    }
                    if (this.field4406[var18] > 64) {
                        int var31 = this.field4406[var18] - 64 - 1;
                        for (int var32 = this.field4401[var31] - 1; var32 >= 0; var32--) {
                            class383 var33 = this.field4407[var31][var32];
                            int var34 = var33.field5376;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5371 >> class210.field2931);
                            float var40 = (float) (var33.field5367 >> class210.field2931);
                            float var41 = (float) (var33.field5365 >> class210.field2931);
                            int var42 = var33.field5372 >> class210.field2931;
                            this.field4397.method414(0.0F, -128);
                            this.field4397.method414(0.0F, -128);
                            this.field4397.method414((float) (-var42) * var9 + var39, 109);
                            this.field4397.method414((float) (-var42) * var10 + var40, -124);
                            this.field4397.method414((float) (-var42) * var11 + var41, -116);
                            this.field4397.method1824(57, var35);
                            this.field4397.method1824(123, var36);
                            this.field4397.method1824(46, var37);
                            this.field4397.method1824(118, var38);
                            this.field4397.method414(1.0F, 38);
                            this.field4397.method414(0.0F, 117);
                            this.field4397.method414((float) var42 * var12 + var39, -116);
                            this.field4397.method414((float) var42 * var13 + var40, -118);
                            this.field4397.method414((float) var42 * var14 + var41, -12);
                            this.field4397.method1824(50, var35);
                            this.field4397.method1824(52, var36);
                            this.field4397.method1824(39, var37);
                            this.field4397.method1824(48, var38);
                            this.field4397.method414(1.0F, 62);
                            this.field4397.method414(1.0F, -122);
                            this.field4397.method414((float) var42 * var9 + var39, 101);
                            this.field4397.method414((float) var42 * var10 + var40, 119);
                            this.field4397.method414((float) var42 * var11 + var41, -127);
                            this.field4397.method1824(110, var35);
                            this.field4397.method1824(125, var36);
                            this.field4397.method1824(117, var37);
                            this.field4397.method1824(77, var38);
                            this.field4397.method414(0.0F, 119);
                            this.field4397.method414(1.0F, 73);
                            this.field4397.method414((float) var42 * var15 + var39, -120);
                            this.field4397.method414((float) var42 * var16 + var40, -123);
                            this.field4397.method414((float) var42 * var17 + var41, -113);
                            this.field4397.method1824(93, var35);
                            this.field4397.method1824(51, var36);
                            this.field4397.method1824(118, var37);
                            this.field4397.method1824(50, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field4406[var43] > 64 ? 64 : this.field4406[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class383 var46 = this.field4404[var43][var45];
                        int var47 = var46.field5376;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5371 >> class210.field2931);
                        float var53 = (float) (var46.field5367 >> class210.field2931);
                        float var54 = (float) (var46.field5365 >> class210.field2931);
                        int var55 = var46.field5372 >> class210.field2931;
                        this.field4397.method415(0.0F, false);
                        this.field4397.method415(0.0F, false);
                        this.field4397.method415((float) (-var55) * var9 + var52, false);
                        this.field4397.method415((float) (-var55) * var10 + var53, false);
                        this.field4397.method415((float) (-var55) * var11 + var54, false);
                        this.field4397.method1824(48, var48);
                        this.field4397.method1824(36, var49);
                        this.field4397.method1824(45, var50);
                        this.field4397.method1824(126, var51);
                        this.field4397.method415(1.0F, false);
                        this.field4397.method415(0.0F, false);
                        this.field4397.method415((float) var55 * var12 + var52, false);
                        this.field4397.method415((float) var55 * var13 + var53, false);
                        this.field4397.method415((float) var55 * var14 + var54, false);
                        this.field4397.method1824(45, var48);
                        this.field4397.method1824(90, var49);
                        this.field4397.method1824(81, var50);
                        this.field4397.method1824(62, var51);
                        this.field4397.method415(1.0F, false);
                        this.field4397.method415(1.0F, false);
                        this.field4397.method415((float) var55 * var9 + var52, false);
                        this.field4397.method415((float) var55 * var10 + var53, false);
                        this.field4397.method415((float) var55 * var11 + var54, false);
                        this.field4397.method1824(92, var48);
                        this.field4397.method1824(122, var49);
                        this.field4397.method1824(123, var50);
                        this.field4397.method1824(104, var51);
                        this.field4397.method415(0.0F, false);
                        this.field4397.method415(1.0F, false);
                        this.field4397.method415((float) var55 * var15 + var52, false);
                        this.field4397.method415((float) var55 * var16 + var53, false);
                        this.field4397.method415((float) var55 * var17 + var54, false);
                        this.field4397.method1824(87, var48);
                        this.field4397.method1824(117, var49);
                        this.field4397.method1824(88, var50);
                        this.field4397.method1824(73, var51);
                    }
                    if (this.field4406[var43] > 64) {
                        int var56 = this.field4406[var43] - 64 - 1;
                        for (int var57 = this.field4401[var56] - 1; var57 >= 0; var57--) {
                            class383 var58 = this.field4407[var56][var57];
                            int var59 = var58.field5376;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5371 >> class210.field2931);
                            float var65 = (float) (var58.field5367 >> class210.field2931);
                            float var66 = (float) (var58.field5365 >> class210.field2931);
                            int var67 = var58.field5372 >> class210.field2931;
                            this.field4397.method415(0.0F, false);
                            this.field4397.method415(0.0F, false);
                            this.field4397.method415((float) (-var67) * var9 + var64, false);
                            this.field4397.method415((float) (-var67) * var10 + var65, false);
                            this.field4397.method415((float) (-var67) * var11 + var66, false);
                            this.field4397.method1824(53, var60);
                            this.field4397.method1824(60, var61);
                            this.field4397.method1824(124, var62);
                            this.field4397.method1824(109, var63);
                            this.field4397.method415(1.0F, false);
                            this.field4397.method415(0.0F, false);
                            this.field4397.method415((float) var67 * var12 + var64, false);
                            this.field4397.method415((float) var67 * var13 + var65, false);
                            this.field4397.method415((float) var67 * var14 + var66, false);
                            this.field4397.method1824(53, var60);
                            this.field4397.method1824(123, var61);
                            this.field4397.method1824(107, var62);
                            this.field4397.method1824(126, var63);
                            this.field4397.method415(1.0F, false);
                            this.field4397.method415(1.0F, false);
                            this.field4397.method415((float) var67 * var9 + var64, false);
                            this.field4397.method415((float) var67 * var10 + var65, false);
                            this.field4397.method415((float) var67 * var11 + var66, false);
                            this.field4397.method1824(86, var60);
                            this.field4397.method1824(81, var61);
                            this.field4397.method1824(126, var62);
                            this.field4397.method1824(95, var63);
                            this.field4397.method415(0.0F, false);
                            this.field4397.method415(1.0F, false);
                            this.field4397.method415((float) var67 * var15 + var64, false);
                            this.field4397.method415((float) var67 * var16 + var65, false);
                            this.field4397.method415((float) var67 * var17 + var66, false);
                            this.field4397.method1824(104, var60);
                            this.field4397.method1824(124, var61);
                            this.field4397.method1824(65, var62);
                            this.field4397.method1824(43, var63);
                        }
                    }
                }
            }
        }
        if (this.field4397.field3938 == 0) {
            return;
        }
        this.field4402.method821(24, this.field4397.field3882, this.field4397.field3938);
        arg0.method160(0, this.field4409);
        arg0.method161(this.field4405);
        arg0.method257(this.field4403);
        arg0.method180();
        arg0.method107(7, 0, this.field4397.field3938 / 24);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lhd;)V")
    public final void method2062(class17 arg0) {
        this.field4402 = arg0.method165(24, (byte[]) null, 196584, true);
        this.field4409 = new class240(arg0, this.field4402, 5126, 2, 0);
        this.field4405 = new class240(arg0, this.field4402, 5126, 3, 8);
        this.field4403 = new class240(arg0, this.field4402, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lhd;)V")
    private final void method2063(class17 arg0) {
        arg0.method149();
        this.field4398.glDisable(16384);
        this.field4398.glDisable(16385);
        arg0.method158(false);
        arg0.method190(-2);
        this.field4398.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lhd;)V")
    private final void method2064(class17 arg0) {
        arg0.method158(true);
        this.field4398.glEnable(16384);
        this.field4398.glEnable(16385);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lhd;Lbg;)V")
    public final void method2065(class17 arg0, class374 arg1) {
        this.field4398 = arg0.field198;
        if (arg0.field257 == null) {
            return;
        }
        this.method2063(arg0);
        float var3 = arg0.field257.field457;
        float var4 = arg0.field257.field456;
        float var5 = arg0.field257.field459;
        float var6 = arg0.field257.field453;
        try {
            if (arg1.field5265) {
                int var23 = arg1.field5259 - arg1.field5263;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class422 var24 = arg1.field5256.field3518;
                class422 var25 = var24.field5911;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field4400 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field4406[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field4401[var29] = 0;
                    }
                    while (var24 != var25) {
                        class383 var30 = (class383) var25;
                        if (var27) {
                            var26 = var30.field5368;
                            var27 = false;
                        } else if (var30.field5368 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5365 >> class210.field2931) * var5 + (float) (var30.field5371 >> class210.field2931) * var3 + (float) (var30.field5367 >> class210.field2931) * var4 + var6) - arg1.field5263;
                        if (var31 <= 1600) {
                            if (this.field4406[var31] < 64) {
                                this.field4404[var31][this.field4406[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field4406[var31] == 64) {
                                        if (this.field4400 == 64) {
                                            break label188;
                                        }
                                        this.field4406[var31] += this.field4400++ + 1;
                                    }
                                    this.field4407[this.field4406[var31] - 64 - 1][this.field4401[this.field4406[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field5911;
                    }
                    arg0.method207(var26 >= 0 ? arg0.field197.method1435(var26, -16541) : null);
                    this.method2061(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class422 var10 = arg1.field5256.field3518;
                for (class422 var11 = var10.field5911; var11 != var10; var11 = var11.field5911) {
                    class383 var12 = (class383) var11;
                    int var13 = (int) ((float) (var12.field5365 >> class210.field2931) * var5 + (float) (var12.field5371 >> class210.field2931) * var3 + (float) (var12.field5367 >> class210.field2931) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field4408[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class422 var15 = var10.field5911;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field4400 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field4406[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field4401[var20] = 0;
                    }
                    while (var10 != var15) {
                        class383 var21 = (class383) var15;
                        if (var18) {
                            var17 = var21.field5368;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5368 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field4408[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field4406[var22] < 64) {
                                this.field4404[var22][this.field4406[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field4406[var22] == 64) {
                                        if (this.field4400 == 64) {
                                            break label186;
                                        }
                                        this.field4406[var22] += this.field4400++ + 1;
                                    }
                                    this.field4407[this.field4406[var22] - 64 - 1][this.field4401[this.field4406[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field5911;
                    }
                    arg0.method207(var17 >= 0 ? arg0.field197.method1435(var17, -16541) : null);
                    this.method2061(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2064(arg0);
    }
}
