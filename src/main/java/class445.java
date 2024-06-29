import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class445 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[F")
    private float[] field6470 = new float[16];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Loi;")
    private class118 field6471 = new class118(786336);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
    private int[] field6474 = new int[1600];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private int field6473 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    private int[] field6472 = new int[8191];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[[Lps;")
    private class394[][] field6475 = new class394[1600][64];

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[[Lps;")
    private class394[][] field6478 = new class394[64][768];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    private int[] field6476 = new int[64];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljm;")
    private class160 field6479;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljm;")
    private class160 field6480;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ljm;")
    private class160 field6481;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Luq;")
    private class233 field6477;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ljaggl/opengl;")
    private opengl field6469;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lge;)V", line = 3)
    public final void method2785(class104 arg0) {
        this.field6477 = arg0.method895(24, (byte[]) null, 196584, true);
        this.field6481 = new class160(arg0, this.field6477, 5126, 2, 0);
        this.field6480 = new class160(arg0, this.field6477, 5126, 3, 8);
        this.field6479 = new class160(arg0, this.field6477, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Lge;)V", line = 9)
    private final void method2786(class104 arg0) {
        arg0.method864(true);
        this.field6469.glEnable(16384);
        this.field6469.glEnable(16385);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lge;I)V", line = 16)
    private final void method2787(class104 arg0, int arg1) {
        this.field6469.glGetFloatv(2982, this.field6470, 0);
        float var3 = this.field6470[0];
        float var4 = this.field6470[4];
        float var5 = this.field6470[8];
        float var6 = this.field6470[1];
        float var7 = this.field6470[5];
        float var8 = this.field6470[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field6471.field565 = 0;
        if (arg0.field1727) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field6474[var18] > 64 ? 64 : this.field6474[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class394 var21 = this.field6475[var18][var20];
                        int var22 = var21.field5757;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5750 >> class339.field4826);
                        float var28 = (float) (var21.field5748 >> class339.field4826);
                        float var29 = (float) (var21.field5760 >> class339.field4826);
                        int var30 = var21.field5752 >> class339.field4826;
                        this.field6471.method997((byte) -75, 0.0F);
                        this.field6471.method997((byte) -75, 0.0F);
                        this.field6471.method997((byte) -75, (float) (-var30) * var9 + var27);
                        this.field6471.method997((byte) -75, (float) (-var30) * var10 + var28);
                        this.field6471.method997((byte) -75, (float) (-var30) * var11 + var29);
                        this.field6471.method267(var23, false);
                        this.field6471.method267(var24, false);
                        this.field6471.method267(var25, false);
                        this.field6471.method267(var26, false);
                        this.field6471.method997((byte) -75, 1.0F);
                        this.field6471.method997((byte) -75, 0.0F);
                        this.field6471.method997((byte) -75, (float) var30 * var12 + var27);
                        this.field6471.method997((byte) -75, (float) var30 * var13 + var28);
                        this.field6471.method997((byte) -75, (float) var30 * var14 + var29);
                        this.field6471.method267(var23, false);
                        this.field6471.method267(var24, false);
                        this.field6471.method267(var25, false);
                        this.field6471.method267(var26, false);
                        this.field6471.method997((byte) -75, 1.0F);
                        this.field6471.method997((byte) -75, 1.0F);
                        this.field6471.method997((byte) -75, (float) var30 * var9 + var27);
                        this.field6471.method997((byte) -75, (float) var30 * var10 + var28);
                        this.field6471.method997((byte) -75, (float) var30 * var11 + var29);
                        this.field6471.method267(var23, false);
                        this.field6471.method267(var24, false);
                        this.field6471.method267(var25, false);
                        this.field6471.method267(var26, false);
                        this.field6471.method997((byte) -75, 0.0F);
                        this.field6471.method997((byte) -75, 1.0F);
                        this.field6471.method997((byte) -75, (float) var30 * var15 + var27);
                        this.field6471.method997((byte) -75, (float) var30 * var16 + var28);
                        this.field6471.method997((byte) -75, (float) var30 * var17 + var29);
                        this.field6471.method267(var23, false);
                        this.field6471.method267(var24, false);
                        this.field6471.method267(var25, false);
                        this.field6471.method267(var26, false);
                    }
                    if (this.field6474[var18] > 64) {
                        int var31 = this.field6474[var18] - 64 - 1;
                        for (int var32 = this.field6476[var31] - 1; var32 >= 0; var32--) {
                            class394 var33 = this.field6478[var31][var32];
                            int var34 = var33.field5757;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5750 >> class339.field4826);
                            float var40 = (float) (var33.field5748 >> class339.field4826);
                            float var41 = (float) (var33.field5760 >> class339.field4826);
                            int var42 = var33.field5752 >> class339.field4826;
                            this.field6471.method997((byte) -75, 0.0F);
                            this.field6471.method997((byte) -75, 0.0F);
                            this.field6471.method997((byte) -75, (float) (-var42) * var9 + var39);
                            this.field6471.method997((byte) -75, (float) (-var42) * var10 + var40);
                            this.field6471.method997((byte) -75, (float) (-var42) * var11 + var41);
                            this.field6471.method267(var35, false);
                            this.field6471.method267(var36, false);
                            this.field6471.method267(var37, false);
                            this.field6471.method267(var38, false);
                            this.field6471.method997((byte) -75, 1.0F);
                            this.field6471.method997((byte) -75, 0.0F);
                            this.field6471.method997((byte) -75, (float) var42 * var12 + var39);
                            this.field6471.method997((byte) -75, (float) var42 * var13 + var40);
                            this.field6471.method997((byte) -75, (float) var42 * var14 + var41);
                            this.field6471.method267(var35, false);
                            this.field6471.method267(var36, false);
                            this.field6471.method267(var37, false);
                            this.field6471.method267(var38, false);
                            this.field6471.method997((byte) -75, 1.0F);
                            this.field6471.method997((byte) -75, 1.0F);
                            this.field6471.method997((byte) -75, (float) var42 * var9 + var39);
                            this.field6471.method997((byte) -75, (float) var42 * var10 + var40);
                            this.field6471.method997((byte) -75, (float) var42 * var11 + var41);
                            this.field6471.method267(var35, false);
                            this.field6471.method267(var36, false);
                            this.field6471.method267(var37, false);
                            this.field6471.method267(var38, false);
                            this.field6471.method997((byte) -75, 0.0F);
                            this.field6471.method997((byte) -75, 1.0F);
                            this.field6471.method997((byte) -75, (float) var42 * var15 + var39);
                            this.field6471.method997((byte) -75, (float) var42 * var16 + var40);
                            this.field6471.method997((byte) -75, (float) var42 * var17 + var41);
                            this.field6471.method267(var35, false);
                            this.field6471.method267(var36, false);
                            this.field6471.method267(var37, false);
                            this.field6471.method267(var38, false);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field6474[var43] > 64 ? 64 : this.field6474[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class394 var46 = this.field6475[var43][var45];
                        int var47 = var46.field5757;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5750 >> class339.field4826);
                        float var53 = (float) (var46.field5748 >> class339.field4826);
                        float var54 = (float) (var46.field5760 >> class339.field4826);
                        int var55 = var46.field5752 >> class339.field4826;
                        this.field6471.method998((byte) 70, 0.0F);
                        this.field6471.method998((byte) 83, 0.0F);
                        this.field6471.method998((byte) 73, (float) (-var55) * var9 + var52);
                        this.field6471.method998((byte) -101, (float) (-var55) * var10 + var53);
                        this.field6471.method998((byte) 74, (float) (-var55) * var11 + var54);
                        this.field6471.method267(var48, false);
                        this.field6471.method267(var49, false);
                        this.field6471.method267(var50, false);
                        this.field6471.method267(var51, false);
                        this.field6471.method998((byte) -77, 1.0F);
                        this.field6471.method998((byte) -56, 0.0F);
                        this.field6471.method998((byte) 90, (float) var55 * var12 + var52);
                        this.field6471.method998((byte) -100, (float) var55 * var13 + var53);
                        this.field6471.method998((byte) -69, (float) var55 * var14 + var54);
                        this.field6471.method267(var48, false);
                        this.field6471.method267(var49, false);
                        this.field6471.method267(var50, false);
                        this.field6471.method267(var51, false);
                        this.field6471.method998((byte) 75, 1.0F);
                        this.field6471.method998((byte) 118, 1.0F);
                        this.field6471.method998((byte) -96, (float) var55 * var9 + var52);
                        this.field6471.method998((byte) -80, (float) var55 * var10 + var53);
                        this.field6471.method998((byte) 61, (float) var55 * var11 + var54);
                        this.field6471.method267(var48, false);
                        this.field6471.method267(var49, false);
                        this.field6471.method267(var50, false);
                        this.field6471.method267(var51, false);
                        this.field6471.method998((byte) 99, 0.0F);
                        this.field6471.method998((byte) -106, 1.0F);
                        this.field6471.method998((byte) -59, (float) var55 * var15 + var52);
                        this.field6471.method998((byte) -116, (float) var55 * var16 + var53);
                        this.field6471.method998((byte) -116, (float) var55 * var17 + var54);
                        this.field6471.method267(var48, false);
                        this.field6471.method267(var49, false);
                        this.field6471.method267(var50, false);
                        this.field6471.method267(var51, false);
                    }
                    if (this.field6474[var43] > 64) {
                        int var56 = this.field6474[var43] - 64 - 1;
                        for (int var57 = this.field6476[var56] - 1; var57 >= 0; var57--) {
                            class394 var58 = this.field6478[var56][var57];
                            int var59 = var58.field5757;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5750 >> class339.field4826);
                            float var65 = (float) (var58.field5748 >> class339.field4826);
                            float var66 = (float) (var58.field5760 >> class339.field4826);
                            int var67 = var58.field5752 >> class339.field4826;
                            this.field6471.method998((byte) 94, 0.0F);
                            this.field6471.method998((byte) 107, 0.0F);
                            this.field6471.method998((byte) 76, (float) (-var67) * var9 + var64);
                            this.field6471.method998((byte) -73, (float) (-var67) * var10 + var65);
                            this.field6471.method998((byte) 70, (float) (-var67) * var11 + var66);
                            this.field6471.method267(var60, false);
                            this.field6471.method267(var61, false);
                            this.field6471.method267(var62, false);
                            this.field6471.method267(var63, false);
                            this.field6471.method998((byte) 106, 1.0F);
                            this.field6471.method998((byte) 97, 0.0F);
                            this.field6471.method998((byte) -104, (float) var67 * var12 + var64);
                            this.field6471.method998((byte) -72, (float) var67 * var13 + var65);
                            this.field6471.method998((byte) -68, (float) var67 * var14 + var66);
                            this.field6471.method267(var60, false);
                            this.field6471.method267(var61, false);
                            this.field6471.method267(var62, false);
                            this.field6471.method267(var63, false);
                            this.field6471.method998((byte) 61, 1.0F);
                            this.field6471.method998((byte) -121, 1.0F);
                            this.field6471.method998((byte) -88, (float) var67 * var9 + var64);
                            this.field6471.method998((byte) -86, (float) var67 * var10 + var65);
                            this.field6471.method998((byte) 114, (float) var67 * var11 + var66);
                            this.field6471.method267(var60, false);
                            this.field6471.method267(var61, false);
                            this.field6471.method267(var62, false);
                            this.field6471.method267(var63, false);
                            this.field6471.method998((byte) -83, 0.0F);
                            this.field6471.method998((byte) -56, 1.0F);
                            this.field6471.method998((byte) -92, (float) var67 * var15 + var64);
                            this.field6471.method998((byte) 88, (float) var67 * var16 + var65);
                            this.field6471.method998((byte) -86, (float) var67 * var17 + var66);
                            this.field6471.method267(var60, false);
                            this.field6471.method267(var61, false);
                            this.field6471.method267(var62, false);
                            this.field6471.method267(var63, false);
                        }
                    }
                }
            }
        }
        if (this.field6471.field565 == 0) {
            return;
        }
        this.field6477.method1277(24, this.field6471.field578, this.field6471.field565);
        arg0.method905(0, this.field6481);
        arg0.method902(this.field6480);
        arg0.method854(this.field6479);
        arg0.method876();
        arg0.method880(7, 0, this.field6471.field565 / 24);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lge;Lhe;)V", line = 363)
    public final void method2788(class104 arg0, class30 arg1) {
        this.field6469 = arg0.field1604;
        if (arg0.field1648 == null) {
            return;
        }
        this.method2789(arg0);
        float var3 = arg0.field1648.field5520;
        float var4 = arg0.field1648.field5519;
        float var5 = arg0.field1648.field5522;
        float var6 = arg0.field1648.field5516;
        try {
            if (arg1.field435) {
                int var23 = arg1.field434 - arg1.field437;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class297 var24 = arg1.field428.field1857;
                class297 var25 = var24.field4393;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field6473 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field6474[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field6476[var29] = 0;
                    }
                    while (var24 != var25) {
                        class394 var30 = (class394) var25;
                        if (var27) {
                            var26 = var30.field5751;
                            var27 = false;
                        } else if (var30.field5751 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5760 >> class339.field4826) * var5 + (float) (var30.field5750 >> class339.field4826) * var3 + (float) (var30.field5748 >> class339.field4826) * var4 + var6) - arg1.field437;
                        if (var31 <= 1600) {
                            if (this.field6474[var31] < 64) {
                                this.field6475[var31][this.field6474[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field6474[var31] == 64) {
                                        if (this.field6473 == 64) {
                                            break label188;
                                        }
                                        this.field6474[var31] += this.field6473++ + 1;
                                    }
                                    this.field6478[this.field6474[var31] - 64 - 1][this.field6476[this.field6474[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4393;
                    }
                    arg0.method929(var26 >= 0 ? arg0.field1597.method1623(var26, true) : null);
                    this.method2787(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class297 var10 = arg1.field428.field1857;
                for (class297 var11 = var10.field4393; var11 != var10; var11 = var11.field4393) {
                    class394 var12 = (class394) var11;
                    int var13 = (int) ((float) (var12.field5760 >> class339.field4826) * var5 + (float) (var12.field5750 >> class339.field4826) * var3 + (float) (var12.field5748 >> class339.field4826) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field6472[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class297 var15 = var10.field4393;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field6473 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field6474[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field6476[var20] = 0;
                    }
                    while (var10 != var15) {
                        class394 var21 = (class394) var15;
                        if (var18) {
                            var17 = var21.field5751;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5751 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field6472[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field6474[var22] < 64) {
                                this.field6475[var22][this.field6474[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field6474[var22] == 64) {
                                        if (this.field6473 == 64) {
                                            break label186;
                                        }
                                        this.field6474[var22] += this.field6473++ + 1;
                                    }
                                    this.field6478[this.field6474[var22] - 64 - 1][this.field6476[this.field6474[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4393;
                    }
                    arg0.method929(var17 >= 0 ? arg0.field1597.method1623(var17, true) : null);
                    this.method2787(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2786(arg0);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Lge;)V", line = 592)
    private final void method2789(class104 arg0) {
        arg0.method887();
        this.field6469.glDisable(16384);
        this.field6469.glDisable(16385);
        arg0.method864(false);
        arg0.method899(-2);
        this.field6469.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
