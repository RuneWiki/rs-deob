import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class185 {

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "[F")
    private float[] field2685 = new float[16];

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Lfi;")
    private class402 field2684 = new class402(786336);

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
    private int[] field2688 = new int[1600];

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[[Lee;")
    private class430[][] field2687 = new class430[64][768];

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
    private int[] field2689 = new int[64];

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "[I")
    private int[] field2691 = new int[8191];

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "[[Lee;")
    private class430[][] field2690 = new class430[1600][64];

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    private int field2694 = 0;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Luk;")
    private class143 field2686;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Luk;")
    private class143 field2692;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Luk;")
    private class143 field2693;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Lla;")
    private class220 field2695;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Ljaggl/opengl;")
    private opengl field2683;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lqi;I)V", line = 3)
    private final void method1210(class458 arg0, int arg1) {
        this.field2683.glGetFloatv(2982, this.field2685, 0);
        float var3 = this.field2685[0];
        float var4 = this.field2685[4];
        float var5 = this.field2685[8];
        float var6 = this.field2685[1];
        float var7 = this.field2685[5];
        float var8 = this.field2685[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field2684.field5830 = 0;
        if (arg0.field6400) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field2688[var18] > 64 ? 64 : this.field2688[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class430 var21 = this.field2690[var18][var20];
                        int var22 = var21.field5923;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5918 >> class305.field4176);
                        float var28 = (float) (var21.field5928 >> class305.field4176);
                        float var29 = (float) (var21.field5929 >> class305.field4176);
                        int var30 = var21.field5919 >> class305.field4176;
                        this.field2684.method2377(0.0F, (byte) 70);
                        this.field2684.method2377(0.0F, (byte) 70);
                        this.field2684.method2377((float) (-var30) * var9 + var27, (byte) 70);
                        this.field2684.method2377((float) (-var30) * var10 + var28, (byte) 70);
                        this.field2684.method2377((float) (-var30) * var11 + var29, (byte) 70);
                        this.field2684.method2470((byte) -74, var23);
                        this.field2684.method2470((byte) -74, var24);
                        this.field2684.method2470((byte) -74, var25);
                        this.field2684.method2470((byte) -74, var26);
                        this.field2684.method2377(1.0F, (byte) 70);
                        this.field2684.method2377(0.0F, (byte) 70);
                        this.field2684.method2377((float) var30 * var12 + var27, (byte) 70);
                        this.field2684.method2377((float) var30 * var13 + var28, (byte) 70);
                        this.field2684.method2377((float) var30 * var14 + var29, (byte) 70);
                        this.field2684.method2470((byte) -74, var23);
                        this.field2684.method2470((byte) -74, var24);
                        this.field2684.method2470((byte) -74, var25);
                        this.field2684.method2470((byte) -74, var26);
                        this.field2684.method2377(1.0F, (byte) 70);
                        this.field2684.method2377(1.0F, (byte) 70);
                        this.field2684.method2377((float) var30 * var9 + var27, (byte) 70);
                        this.field2684.method2377((float) var30 * var10 + var28, (byte) 70);
                        this.field2684.method2377((float) var30 * var11 + var29, (byte) 70);
                        this.field2684.method2470((byte) -74, var23);
                        this.field2684.method2470((byte) -74, var24);
                        this.field2684.method2470((byte) -74, var25);
                        this.field2684.method2470((byte) -74, var26);
                        this.field2684.method2377(0.0F, (byte) 70);
                        this.field2684.method2377(1.0F, (byte) 70);
                        this.field2684.method2377((float) var30 * var15 + var27, (byte) 70);
                        this.field2684.method2377((float) var30 * var16 + var28, (byte) 70);
                        this.field2684.method2377((float) var30 * var17 + var29, (byte) 70);
                        this.field2684.method2470((byte) -74, var23);
                        this.field2684.method2470((byte) -74, var24);
                        this.field2684.method2470((byte) -74, var25);
                        this.field2684.method2470((byte) -74, var26);
                    }
                    if (this.field2688[var18] > 64) {
                        int var31 = this.field2688[var18] - 64 - 1;
                        for (int var32 = this.field2689[var31] - 1; var32 >= 0; var32--) {
                            class430 var33 = this.field2687[var31][var32];
                            int var34 = var33.field5923;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5918 >> class305.field4176);
                            float var40 = (float) (var33.field5928 >> class305.field4176);
                            float var41 = (float) (var33.field5929 >> class305.field4176);
                            int var42 = var33.field5919 >> class305.field4176;
                            this.field2684.method2377(0.0F, (byte) 70);
                            this.field2684.method2377(0.0F, (byte) 70);
                            this.field2684.method2377((float) (-var42) * var9 + var39, (byte) 70);
                            this.field2684.method2377((float) (-var42) * var10 + var40, (byte) 70);
                            this.field2684.method2377((float) (-var42) * var11 + var41, (byte) 70);
                            this.field2684.method2470((byte) -74, var35);
                            this.field2684.method2470((byte) -74, var36);
                            this.field2684.method2470((byte) -74, var37);
                            this.field2684.method2470((byte) -74, var38);
                            this.field2684.method2377(1.0F, (byte) 70);
                            this.field2684.method2377(0.0F, (byte) 70);
                            this.field2684.method2377((float) var42 * var12 + var39, (byte) 70);
                            this.field2684.method2377((float) var42 * var13 + var40, (byte) 70);
                            this.field2684.method2377((float) var42 * var14 + var41, (byte) 70);
                            this.field2684.method2470((byte) -74, var35);
                            this.field2684.method2470((byte) -74, var36);
                            this.field2684.method2470((byte) -74, var37);
                            this.field2684.method2470((byte) -74, var38);
                            this.field2684.method2377(1.0F, (byte) 70);
                            this.field2684.method2377(1.0F, (byte) 70);
                            this.field2684.method2377((float) var42 * var9 + var39, (byte) 70);
                            this.field2684.method2377((float) var42 * var10 + var40, (byte) 70);
                            this.field2684.method2377((float) var42 * var11 + var41, (byte) 70);
                            this.field2684.method2470((byte) -74, var35);
                            this.field2684.method2470((byte) -74, var36);
                            this.field2684.method2470((byte) -74, var37);
                            this.field2684.method2470((byte) -74, var38);
                            this.field2684.method2377(0.0F, (byte) 70);
                            this.field2684.method2377(1.0F, (byte) 70);
                            this.field2684.method2377((float) var42 * var15 + var39, (byte) 70);
                            this.field2684.method2377((float) var42 * var16 + var40, (byte) 70);
                            this.field2684.method2377((float) var42 * var17 + var41, (byte) 70);
                            this.field2684.method2470((byte) -74, var35);
                            this.field2684.method2470((byte) -74, var36);
                            this.field2684.method2470((byte) -74, var37);
                            this.field2684.method2470((byte) -74, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field2688[var43] > 64 ? 64 : this.field2688[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class430 var46 = this.field2690[var43][var45];
                        int var47 = var46.field5923;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5918 >> class305.field4176);
                        float var53 = (float) (var46.field5928 >> class305.field4176);
                        float var54 = (float) (var46.field5929 >> class305.field4176);
                        int var55 = var46.field5919 >> class305.field4176;
                        this.field2684.method2376(0.0F, -127);
                        this.field2684.method2376(0.0F, -125);
                        this.field2684.method2376((float) (-var55) * var9 + var52, -125);
                        this.field2684.method2376((float) (-var55) * var10 + var53, -125);
                        this.field2684.method2376((float) (-var55) * var11 + var54, -127);
                        this.field2684.method2470((byte) -74, var48);
                        this.field2684.method2470((byte) -74, var49);
                        this.field2684.method2470((byte) -74, var50);
                        this.field2684.method2470((byte) -74, var51);
                        this.field2684.method2376(1.0F, -126);
                        this.field2684.method2376(0.0F, -128);
                        this.field2684.method2376((float) var55 * var12 + var52, -127);
                        this.field2684.method2376((float) var55 * var13 + var53, -125);
                        this.field2684.method2376((float) var55 * var14 + var54, -126);
                        this.field2684.method2470((byte) -74, var48);
                        this.field2684.method2470((byte) -74, var49);
                        this.field2684.method2470((byte) -74, var50);
                        this.field2684.method2470((byte) -74, var51);
                        this.field2684.method2376(1.0F, -126);
                        this.field2684.method2376(1.0F, -126);
                        this.field2684.method2376((float) var55 * var9 + var52, -126);
                        this.field2684.method2376((float) var55 * var10 + var53, -125);
                        this.field2684.method2376((float) var55 * var11 + var54, -128);
                        this.field2684.method2470((byte) -74, var48);
                        this.field2684.method2470((byte) -74, var49);
                        this.field2684.method2470((byte) -74, var50);
                        this.field2684.method2470((byte) -74, var51);
                        this.field2684.method2376(0.0F, -128);
                        this.field2684.method2376(1.0F, -128);
                        this.field2684.method2376((float) var55 * var15 + var52, -125);
                        this.field2684.method2376((float) var55 * var16 + var53, -128);
                        this.field2684.method2376((float) var55 * var17 + var54, -126);
                        this.field2684.method2470((byte) -74, var48);
                        this.field2684.method2470((byte) -74, var49);
                        this.field2684.method2470((byte) -74, var50);
                        this.field2684.method2470((byte) -74, var51);
                    }
                    if (this.field2688[var43] > 64) {
                        int var56 = this.field2688[var43] - 64 - 1;
                        for (int var57 = this.field2689[var56] - 1; var57 >= 0; var57--) {
                            class430 var58 = this.field2687[var56][var57];
                            int var59 = var58.field5923;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5918 >> class305.field4176);
                            float var65 = (float) (var58.field5928 >> class305.field4176);
                            float var66 = (float) (var58.field5929 >> class305.field4176);
                            int var67 = var58.field5919 >> class305.field4176;
                            this.field2684.method2376(0.0F, -127);
                            this.field2684.method2376(0.0F, -125);
                            this.field2684.method2376((float) (-var67) * var9 + var64, -125);
                            this.field2684.method2376((float) (-var67) * var10 + var65, -128);
                            this.field2684.method2376((float) (-var67) * var11 + var66, -127);
                            this.field2684.method2470((byte) -74, var60);
                            this.field2684.method2470((byte) -74, var61);
                            this.field2684.method2470((byte) -74, var62);
                            this.field2684.method2470((byte) -74, var63);
                            this.field2684.method2376(1.0F, -126);
                            this.field2684.method2376(0.0F, -126);
                            this.field2684.method2376((float) var67 * var12 + var64, -125);
                            this.field2684.method2376((float) var67 * var13 + var65, -128);
                            this.field2684.method2376((float) var67 * var14 + var66, -128);
                            this.field2684.method2470((byte) -74, var60);
                            this.field2684.method2470((byte) -74, var61);
                            this.field2684.method2470((byte) -74, var62);
                            this.field2684.method2470((byte) -74, var63);
                            this.field2684.method2376(1.0F, -128);
                            this.field2684.method2376(1.0F, -128);
                            this.field2684.method2376((float) var67 * var9 + var64, -127);
                            this.field2684.method2376((float) var67 * var10 + var65, -128);
                            this.field2684.method2376((float) var67 * var11 + var66, -127);
                            this.field2684.method2470((byte) -74, var60);
                            this.field2684.method2470((byte) -74, var61);
                            this.field2684.method2470((byte) -74, var62);
                            this.field2684.method2470((byte) -74, var63);
                            this.field2684.method2376(0.0F, -128);
                            this.field2684.method2376(1.0F, -126);
                            this.field2684.method2376((float) var67 * var15 + var64, -127);
                            this.field2684.method2376((float) var67 * var16 + var65, -125);
                            this.field2684.method2376((float) var67 * var17 + var66, -125);
                            this.field2684.method2470((byte) -74, var60);
                            this.field2684.method2470((byte) -74, var61);
                            this.field2684.method2470((byte) -74, var62);
                            this.field2684.method2470((byte) -74, var63);
                        }
                    }
                }
            }
        }
        if (this.field2684.field5830 != 0) {
            this.field2695.method879(24, this.field2684.field5886, this.field2684.field5830);
            arg0.method2658(this.field2693, (class143) null, this.field2686, this.field2692);
            arg0.method2698(7, 0, this.field2684.field5830 / 24);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lqi;)V", line = 347)
    private final void method1211(class458 arg0) {
        arg0.method2651(true);
        this.field2683.glEnable(16384);
        this.field2683.glEnable(16385);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lqi;)V", line = 357)
    private final void method1212(class458 arg0) {
        arg0.method2642();
        this.field2683.glDisable(16384);
        this.field2683.glDisable(16385);
        arg0.method2651(false);
        arg0.method2647(-2);
        this.field2683.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(Lqi;)V", line = 366)
    public final void method1213(class458 arg0) {
        this.field2695 = arg0.method2688(24, (byte[]) null, 196584, true);
        this.field2692 = new class143(arg0, this.field2695, 5126, 2, 0);
        this.field2693 = new class143(arg0, this.field2695, 5126, 3, 8);
        this.field2686 = new class143(arg0, this.field2695, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lqi;Lnd;)V", line = 372)
    public final void method1214(class458 arg0, class473 arg1) {
        this.field2683 = arg0.field6330;
        if (arg0.field6378 == null) {
            return;
        }
        this.method1212(arg0);
        float var3 = arg0.field6378.field3085;
        float var4 = arg0.field6378.field3088;
        float var5 = arg0.field6378.field3081;
        float var6 = arg0.field6378.field3089;
        try {
            if (arg1.field6628) {
                int var23 = arg1.field6626 - arg1.field6630;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class238 var24 = arg1.field6625.field3200;
                class238 var25 = var24.field3360;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field2694 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field2688[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field2689[var29] = 0;
                    }
                    while (var24 != var25) {
                        class430 var30 = (class430) var25;
                        if (var27) {
                            var26 = var30.field5921;
                            var27 = false;
                        } else if (var30.field5921 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5929 >> class305.field4176) * var5 + (float) (var30.field5928 >> class305.field4176) * var4 + (float) (var30.field5918 >> class305.field4176) * var3 + var6) - arg1.field6630;
                        if (var31 <= 1600) {
                            if (this.field2688[var31] < 64) {
                                this.field2690[var31][this.field2688[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field2688[var31] == 64) {
                                        if (this.field2694 == 64) {
                                            break label188;
                                        }
                                        this.field2688[var31] += this.field2694++ + 1;
                                    }
                                    this.field2687[this.field2688[var31] - 64 - 1][this.field2689[this.field2688[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field3360;
                    }
                    arg0.method2692(var26 >= 0 ? arg0.field6325.method2012(6408, var26) : null);
                    this.method1210(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class238 var10 = arg1.field6625.field3200;
                for (class238 var11 = var10.field3360; var11 != var10; var11 = var11.field3360) {
                    class430 var12 = (class430) var11;
                    int var13 = (int) ((float) (var12.field5929 >> class305.field4176) * var5 + (float) (var12.field5928 >> class305.field4176) * var4 + (float) (var12.field5918 >> class305.field4176) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field2691[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class238 var15 = var10.field3360;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field2694 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field2688[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field2689[var20] = 0;
                    }
                    while (var10 != var15) {
                        class430 var21 = (class430) var15;
                        if (var18) {
                            var17 = var21.field5921;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5921 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field2691[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field2688[var22] < 64) {
                                this.field2690[var22][this.field2688[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field2688[var22] == 64) {
                                        if (this.field2694 == 64) {
                                            break label186;
                                        }
                                        this.field2688[var22] += this.field2694++ + 1;
                                    }
                                    this.field2687[this.field2688[var22] - 64 - 1][this.field2689[this.field2688[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field3360;
                    }
                    arg0.method2692(var17 >= 0 ? arg0.field6325.method2012(6408, var17) : null);
                    this.method1210(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method1211(arg0);
    }
}
