import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class361 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[F")
    private float[] field5212 = new float[16];

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljm;")
    private class160 field5210 = new class160(786336);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    private int[] field5214 = new int[8191];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[[Leo;")
    private class267[][] field5213 = new class267[1600][64];

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[[Leo;")
    private class267[][] field5218 = new class267[64][768];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    private int field5219 = 0;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    private int[] field5222 = new int[1600];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field5216 = new int[64];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lgm;")
    private class336 field5215;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lgm;")
    private class336 field5220;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lgm;")
    private class336 field5221;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lna;")
    private class50 field5217;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field5211;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnf;)V", line = 3)
    public final void method2360(class256 arg0) {
        this.field5217 = arg0.method1733(24, (byte[]) null, 196584, true);
        this.field5221 = new class336(arg0, this.field5217, 5126, 2, 0);
        this.field5220 = new class336(arg0, this.field5217, 5126, 3, 8);
        this.field5215 = new class336(arg0, this.field5217, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lnf;)V", line = 10)
    private final void method2361(class256 arg0) {
        arg0.method1622();
        this.field5211.glDisable(16384);
        this.field5211.glDisable(16385);
        arg0.method1667(false);
        arg0.method1722(-2);
        this.field5211.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnf;Lop;)V", line = 22)
    public final void method2362(class256 arg0, class352 arg1) {
        this.field5211 = arg0.field3634;
        if (arg0.field3696 == null) {
            return;
        }
        this.method2361(arg0);
        float var3 = arg0.field3696.field3780;
        float var4 = arg0.field3696.field3778;
        float var5 = arg0.field3696.field3774;
        float var6 = arg0.field3696.field3782;
        try {
            if (arg1.field5098) {
                int var23 = arg1.field5102 - arg1.field5094;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class61 var24 = arg1.field5092.field5248;
                class61 var25 = var24.field801;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5219 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5222[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5216[var29] = 0;
                    }
                    while (var24 != var25) {
                        class267 var30 = (class267) var25;
                        if (var27) {
                            var26 = var30.field3852;
                            var27 = false;
                        } else if (var30.field3852 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field3860 >> class156.field2116) * var5 + (float) (var30.field3862 >> class156.field2116) * var4 + (float) (var30.field3849 >> class156.field2116) * var3 + var6) - arg1.field5094;
                        if (var31 <= 1600) {
                            if (this.field5222[var31] < 64) {
                                this.field5213[var31][this.field5222[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5222[var31] == 64) {
                                        if (this.field5219 == 64) {
                                            break label188;
                                        }
                                        this.field5222[var31] += this.field5219++ + 1;
                                    }
                                    this.field5218[this.field5222[var31] - 64 - 1][this.field5216[this.field5222[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field801;
                    }
                    arg0.method1669(var26 >= 0 ? arg0.field3629.method1978(var26, (byte) -91) : null);
                    this.method2363(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class61 var10 = arg1.field5092.field5248;
                for (class61 var11 = var10.field801; var11 != var10; var11 = var11.field801) {
                    class267 var12 = (class267) var11;
                    int var13 = (int) ((float) (var12.field3860 >> class156.field2116) * var5 + (float) (var12.field3862 >> class156.field2116) * var4 + (float) (var12.field3849 >> class156.field2116) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5214[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class61 var15 = var10.field801;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5219 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5222[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5216[var20] = 0;
                    }
                    while (var10 != var15) {
                        class267 var21 = (class267) var15;
                        if (var18) {
                            var17 = var21.field3852;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field3852 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5214[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5222[var22] < 64) {
                                this.field5213[var22][this.field5222[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5222[var22] == 64) {
                                        if (this.field5219 == 64) {
                                            break label186;
                                        }
                                        this.field5222[var22] += this.field5219++ + 1;
                                    }
                                    this.field5218[this.field5222[var22] - 64 - 1][this.field5216[this.field5222[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field801;
                    }
                    arg0.method1669(var17 >= 0 ? arg0.field3629.method1978(var17, (byte) -91) : null);
                    this.method2363(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2364(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnf;I)V", line = 252)
    private final void method2363(class256 arg0, int arg1) {
        this.field5211.glGetFloatv(2982, this.field5212, 0);
        float var3 = this.field5212[0];
        float var4 = this.field5212[4];
        float var5 = this.field5212[8];
        float var6 = this.field5212[1];
        float var7 = this.field5212[5];
        float var8 = this.field5212[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5210.field3029 = 0;
        if (arg0.field3663) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5222[var18] > 64 ? 64 : this.field5222[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class267 var21 = this.field5213[var18][var20];
                        int var22 = var21.field3853;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field3849 >> class156.field2116);
                        float var28 = (float) (var21.field3862 >> class156.field2116);
                        float var29 = (float) (var21.field3860 >> class156.field2116);
                        int var30 = var21.field3861 >> class156.field2116;
                        this.field5210.method990(13302, 0.0F);
                        this.field5210.method990(13302, 0.0F);
                        this.field5210.method990(13302, (float) (-var30) * var9 + var27);
                        this.field5210.method990(13302, (float) (-var30) * var10 + var28);
                        this.field5210.method990(13302, (float) (-var30) * var11 + var29);
                        this.field5210.method1346(var23, 32767);
                        this.field5210.method1346(var24, 32767);
                        this.field5210.method1346(var25, 32767);
                        this.field5210.method1346(var26, 32767);
                        this.field5210.method990(13302, 1.0F);
                        this.field5210.method990(13302, 0.0F);
                        this.field5210.method990(13302, (float) var30 * var12 + var27);
                        this.field5210.method990(13302, (float) var30 * var13 + var28);
                        this.field5210.method990(13302, (float) var30 * var14 + var29);
                        this.field5210.method1346(var23, 32767);
                        this.field5210.method1346(var24, 32767);
                        this.field5210.method1346(var25, 32767);
                        this.field5210.method1346(var26, 32767);
                        this.field5210.method990(13302, 1.0F);
                        this.field5210.method990(13302, 1.0F);
                        this.field5210.method990(13302, (float) var30 * var9 + var27);
                        this.field5210.method990(13302, (float) var30 * var10 + var28);
                        this.field5210.method990(13302, (float) var30 * var11 + var29);
                        this.field5210.method1346(var23, 32767);
                        this.field5210.method1346(var24, 32767);
                        this.field5210.method1346(var25, 32767);
                        this.field5210.method1346(var26, 32767);
                        this.field5210.method990(13302, 0.0F);
                        this.field5210.method990(13302, 1.0F);
                        this.field5210.method990(13302, (float) var30 * var15 + var27);
                        this.field5210.method990(13302, (float) var30 * var16 + var28);
                        this.field5210.method990(13302, (float) var30 * var17 + var29);
                        this.field5210.method1346(var23, 32767);
                        this.field5210.method1346(var24, 32767);
                        this.field5210.method1346(var25, 32767);
                        this.field5210.method1346(var26, 32767);
                    }
                    if (this.field5222[var18] > 64) {
                        int var31 = this.field5222[var18] - 64 - 1;
                        for (int var32 = this.field5216[var31] - 1; var32 >= 0; var32--) {
                            class267 var33 = this.field5218[var31][var32];
                            int var34 = var33.field3853;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field3849 >> class156.field2116);
                            float var40 = (float) (var33.field3862 >> class156.field2116);
                            float var41 = (float) (var33.field3860 >> class156.field2116);
                            int var42 = var33.field3861 >> class156.field2116;
                            this.field5210.method990(13302, 0.0F);
                            this.field5210.method990(13302, 0.0F);
                            this.field5210.method990(13302, (float) (-var42) * var9 + var39);
                            this.field5210.method990(13302, (float) (-var42) * var10 + var40);
                            this.field5210.method990(13302, (float) (-var42) * var11 + var41);
                            this.field5210.method1346(var35, 32767);
                            this.field5210.method1346(var36, 32767);
                            this.field5210.method1346(var37, 32767);
                            this.field5210.method1346(var38, 32767);
                            this.field5210.method990(13302, 1.0F);
                            this.field5210.method990(13302, 0.0F);
                            this.field5210.method990(13302, (float) var42 * var12 + var39);
                            this.field5210.method990(13302, (float) var42 * var13 + var40);
                            this.field5210.method990(13302, (float) var42 * var14 + var41);
                            this.field5210.method1346(var35, 32767);
                            this.field5210.method1346(var36, 32767);
                            this.field5210.method1346(var37, 32767);
                            this.field5210.method1346(var38, 32767);
                            this.field5210.method990(13302, 1.0F);
                            this.field5210.method990(13302, 1.0F);
                            this.field5210.method990(13302, (float) var42 * var9 + var39);
                            this.field5210.method990(13302, (float) var42 * var10 + var40);
                            this.field5210.method990(13302, (float) var42 * var11 + var41);
                            this.field5210.method1346(var35, 32767);
                            this.field5210.method1346(var36, 32767);
                            this.field5210.method1346(var37, 32767);
                            this.field5210.method1346(var38, 32767);
                            this.field5210.method990(13302, 0.0F);
                            this.field5210.method990(13302, 1.0F);
                            this.field5210.method990(13302, (float) var42 * var15 + var39);
                            this.field5210.method990(13302, (float) var42 * var16 + var40);
                            this.field5210.method990(13302, (float) var42 * var17 + var41);
                            this.field5210.method1346(var35, 32767);
                            this.field5210.method1346(var36, 32767);
                            this.field5210.method1346(var37, 32767);
                            this.field5210.method1346(var38, 32767);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5222[var43] > 64 ? 64 : this.field5222[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class267 var46 = this.field5213[var43][var45];
                        int var47 = var46.field3853;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field3849 >> class156.field2116);
                        float var53 = (float) (var46.field3862 >> class156.field2116);
                        float var54 = (float) (var46.field3860 >> class156.field2116);
                        int var55 = var46.field3861 >> class156.field2116;
                        this.field5210.method991(0.0F, (byte) -57);
                        this.field5210.method991(0.0F, (byte) -57);
                        this.field5210.method991((float) (-var55) * var9 + var52, (byte) -57);
                        this.field5210.method991((float) (-var55) * var10 + var53, (byte) -57);
                        this.field5210.method991((float) (-var55) * var11 + var54, (byte) -57);
                        this.field5210.method1346(var48, 32767);
                        this.field5210.method1346(var49, 32767);
                        this.field5210.method1346(var50, 32767);
                        this.field5210.method1346(var51, 32767);
                        this.field5210.method991(1.0F, (byte) -57);
                        this.field5210.method991(0.0F, (byte) -57);
                        this.field5210.method991((float) var55 * var12 + var52, (byte) -57);
                        this.field5210.method991((float) var55 * var13 + var53, (byte) -57);
                        this.field5210.method991((float) var55 * var14 + var54, (byte) -57);
                        this.field5210.method1346(var48, 32767);
                        this.field5210.method1346(var49, 32767);
                        this.field5210.method1346(var50, 32767);
                        this.field5210.method1346(var51, 32767);
                        this.field5210.method991(1.0F, (byte) -57);
                        this.field5210.method991(1.0F, (byte) -57);
                        this.field5210.method991((float) var55 * var9 + var52, (byte) -57);
                        this.field5210.method991((float) var55 * var10 + var53, (byte) -57);
                        this.field5210.method991((float) var55 * var11 + var54, (byte) -57);
                        this.field5210.method1346(var48, 32767);
                        this.field5210.method1346(var49, 32767);
                        this.field5210.method1346(var50, 32767);
                        this.field5210.method1346(var51, 32767);
                        this.field5210.method991(0.0F, (byte) -57);
                        this.field5210.method991(1.0F, (byte) -57);
                        this.field5210.method991((float) var55 * var15 + var52, (byte) -57);
                        this.field5210.method991((float) var55 * var16 + var53, (byte) -57);
                        this.field5210.method991((float) var55 * var17 + var54, (byte) -57);
                        this.field5210.method1346(var48, 32767);
                        this.field5210.method1346(var49, 32767);
                        this.field5210.method1346(var50, 32767);
                        this.field5210.method1346(var51, 32767);
                    }
                    if (this.field5222[var43] > 64) {
                        int var56 = this.field5222[var43] - 64 - 1;
                        for (int var57 = this.field5216[var56] - 1; var57 >= 0; var57--) {
                            class267 var58 = this.field5218[var56][var57];
                            int var59 = var58.field3853;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field3849 >> class156.field2116);
                            float var65 = (float) (var58.field3862 >> class156.field2116);
                            float var66 = (float) (var58.field3860 >> class156.field2116);
                            int var67 = var58.field3861 >> class156.field2116;
                            this.field5210.method991(0.0F, (byte) -57);
                            this.field5210.method991(0.0F, (byte) -57);
                            this.field5210.method991((float) (-var67) * var9 + var64, (byte) -57);
                            this.field5210.method991((float) (-var67) * var10 + var65, (byte) -57);
                            this.field5210.method991((float) (-var67) * var11 + var66, (byte) -57);
                            this.field5210.method1346(var60, 32767);
                            this.field5210.method1346(var61, 32767);
                            this.field5210.method1346(var62, 32767);
                            this.field5210.method1346(var63, 32767);
                            this.field5210.method991(1.0F, (byte) -57);
                            this.field5210.method991(0.0F, (byte) -57);
                            this.field5210.method991((float) var67 * var12 + var64, (byte) -57);
                            this.field5210.method991((float) var67 * var13 + var65, (byte) -57);
                            this.field5210.method991((float) var67 * var14 + var66, (byte) -57);
                            this.field5210.method1346(var60, 32767);
                            this.field5210.method1346(var61, 32767);
                            this.field5210.method1346(var62, 32767);
                            this.field5210.method1346(var63, 32767);
                            this.field5210.method991(1.0F, (byte) -57);
                            this.field5210.method991(1.0F, (byte) -57);
                            this.field5210.method991((float) var67 * var9 + var64, (byte) -57);
                            this.field5210.method991((float) var67 * var10 + var65, (byte) -57);
                            this.field5210.method991((float) var67 * var11 + var66, (byte) -57);
                            this.field5210.method1346(var60, 32767);
                            this.field5210.method1346(var61, 32767);
                            this.field5210.method1346(var62, 32767);
                            this.field5210.method1346(var63, 32767);
                            this.field5210.method991(0.0F, (byte) -57);
                            this.field5210.method991(1.0F, (byte) -57);
                            this.field5210.method991((float) var67 * var15 + var64, (byte) -57);
                            this.field5210.method991((float) var67 * var16 + var65, (byte) -57);
                            this.field5210.method991((float) var67 * var17 + var66, (byte) -57);
                            this.field5210.method1346(var60, 32767);
                            this.field5210.method1346(var61, 32767);
                            this.field5210.method1346(var62, 32767);
                            this.field5210.method1346(var63, 32767);
                        }
                    }
                }
            }
        }
        if (this.field5210.field3029 == 0) {
            return;
        }
        this.field5217.method354(24, this.field5210.field3040, this.field5210.field3029);
        arg0.method1718();
        arg0.method1760(0, this.field5221);
        arg0.method1651(this.field5220);
        arg0.method1635(this.field5215);
        arg0.method1639(7, 0, this.field5210.field3029 / 24);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lnf;)V", line = 599)
    private final void method2364(class256 arg0) {
        arg0.method1667(true);
        this.field5211.glEnable(16384);
        this.field5211.glEnable(16385);
    }
}
