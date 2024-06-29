import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class245 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[F")
    private float[] field3411 = new float[16];

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Lsb;")
    private class362 field3410 = new class362(786336);

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "[I")
    private int[] field3416 = new int[64];

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[[Lea;")
    private class58[][] field3417 = new class58[64][768];

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "[[Lea;")
    private class58[][] field3415 = new class58[1600][64];

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    private int field3418 = 0;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "[I")
    private int[] field3420 = new int[1600];

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "[I")
    private int[] field3422 = new int[8191];

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Lcj;")
    private class182 field3414;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lam;")
    private class287 field3413;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Lam;")
    private class287 field3419;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Lam;")
    private class287 field3421;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field3412;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lih;)V", line = 4)
    public final void method1507(class330 arg0) {
        this.field3414 = arg0.method2079(24, (byte[]) null, 196584, true);
        this.field3419 = new class287(arg0, this.field3414, 5126, 2, 0);
        this.field3421 = new class287(arg0, this.field3414, 5126, 3, 8);
        this.field3413 = new class287(arg0, this.field3414, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Lih;)V", line = 12)
    private final void method1508(class330 arg0) {
        arg0.method2184(true);
        this.field3412.glEnable(16384);
        this.field3412.glEnable(16385);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lih;Llc;)V", line = 17)
    public final void method1509(class330 arg0, class125 arg1) {
        this.field3412 = arg0.field4741;
        if (arg0.field4841 == null) {
            return;
        }
        this.method1510(arg0);
        float var3 = arg0.field4841.field4343;
        float var4 = arg0.field4841.field4346;
        float var5 = arg0.field4841.field4341;
        float var6 = arg0.field4841.field4347;
        try {
            if (arg1.field1671) {
                int var23 = arg1.field1670 - arg1.field1669;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class59 var24 = arg1.field1666.field5020;
                class59 var25 = var24.field859;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field3418 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field3420[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field3416[var29] = 0;
                    }
                    while (var24 != var25) {
                        class58 var30 = (class58) var25;
                        if (var27) {
                            var26 = var30.field832;
                            var27 = false;
                        } else if (var30.field832 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field836 >> class439.field6436) * var5 + (float) (var30.field844 >> class439.field6436) * var4 + (float) (var30.field840 >> class439.field6436) * var3 + var6) - arg1.field1669;
                        if (var31 <= 1600) {
                            if (this.field3420[var31] < 64) {
                                this.field3415[var31][this.field3420[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field3420[var31] == 64) {
                                        if (this.field3418 == 64) {
                                            break label188;
                                        }
                                        this.field3420[var31] += this.field3418++ + 1;
                                    }
                                    this.field3417[this.field3420[var31] - 64 - 1][this.field3416[this.field3420[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field859;
                    }
                    arg0.method2186(var26 >= 0 ? arg0.field4742.method1972(false, var26) : null);
                    this.method1511(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class59 var10 = arg1.field1666.field5020;
                for (class59 var11 = var10.field859; var11 != var10; var11 = var11.field859) {
                    class58 var12 = (class58) var11;
                    int var13 = (int) ((float) (var12.field836 >> class439.field6436) * var5 + (float) (var12.field844 >> class439.field6436) * var4 + (float) (var12.field840 >> class439.field6436) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field3422[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class59 var15 = var10.field859;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field3418 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field3420[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field3416[var20] = 0;
                    }
                    while (var10 != var15) {
                        class58 var21 = (class58) var15;
                        if (var18) {
                            var17 = var21.field832;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field832 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field3422[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field3420[var22] < 64) {
                                this.field3415[var22][this.field3420[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field3420[var22] == 64) {
                                        if (this.field3418 == 64) {
                                            break label186;
                                        }
                                        this.field3420[var22] += this.field3418++ + 1;
                                    }
                                    this.field3417[this.field3420[var22] - 64 - 1][this.field3416[this.field3420[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field859;
                    }
                    arg0.method2186(var17 >= 0 ? arg0.field4742.method1972(false, var17) : null);
                    this.method1511(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method1508(arg0);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(Lih;)V", line = 246)
    private final void method1510(class330 arg0) {
        arg0.method2140();
        this.field3412.glDisable(16384);
        this.field3412.glDisable(16385);
        arg0.method2184(false);
        arg0.method2127(-2);
        this.field3412.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lih;I)V", line = 274)
    private final void method1511(class330 arg0, int arg1) {
        this.field3412.glGetFloatv(2982, this.field3411, 0);
        float var3 = this.field3411[0];
        float var4 = this.field3411[4];
        float var5 = this.field3411[8];
        float var6 = this.field3411[1];
        float var7 = this.field3411[5];
        float var8 = this.field3411[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field3410.field3915 = 0;
        if (arg0.field4797) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field3420[var18] > 64 ? 64 : this.field3420[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class58 var21 = this.field3415[var18][var20];
                        int var22 = var21.field839;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field840 >> class439.field6436);
                        float var28 = (float) (var21.field844 >> class439.field6436);
                        float var29 = (float) (var21.field836 >> class439.field6436);
                        int var30 = var21.field835 >> class439.field6436;
                        this.field3410.method2376(0.0F, (byte) 126);
                        this.field3410.method2376(0.0F, (byte) 126);
                        this.field3410.method2376((float) (-var30) * var9 + var27, (byte) 126);
                        this.field3410.method2376((float) (-var30) * var10 + var28, (byte) 126);
                        this.field3410.method2376((float) (-var30) * var11 + var29, (byte) 126);
                        this.field3410.method1707(-118, var23);
                        this.field3410.method1707(9, var24);
                        this.field3410.method1707(-112, var25);
                        this.field3410.method1707(-122, var26);
                        this.field3410.method2376(1.0F, (byte) 126);
                        this.field3410.method2376(0.0F, (byte) 126);
                        this.field3410.method2376((float) var30 * var12 + var27, (byte) 126);
                        this.field3410.method2376((float) var30 * var13 + var28, (byte) 126);
                        this.field3410.method2376((float) var30 * var14 + var29, (byte) 126);
                        this.field3410.method1707(-111, var23);
                        this.field3410.method1707(41, var24);
                        this.field3410.method1707(-109, var25);
                        this.field3410.method1707(-126, var26);
                        this.field3410.method2376(1.0F, (byte) 126);
                        this.field3410.method2376(1.0F, (byte) 126);
                        this.field3410.method2376((float) var30 * var9 + var27, (byte) 126);
                        this.field3410.method2376((float) var30 * var10 + var28, (byte) 126);
                        this.field3410.method2376((float) var30 * var11 + var29, (byte) 126);
                        this.field3410.method1707(-127, var23);
                        this.field3410.method1707(112, var24);
                        this.field3410.method1707(-120, var25);
                        this.field3410.method1707(-1, var26);
                        this.field3410.method2376(0.0F, (byte) 126);
                        this.field3410.method2376(1.0F, (byte) 126);
                        this.field3410.method2376((float) var30 * var15 + var27, (byte) 126);
                        this.field3410.method2376((float) var30 * var16 + var28, (byte) 126);
                        this.field3410.method2376((float) var30 * var17 + var29, (byte) 126);
                        this.field3410.method1707(90, var23);
                        this.field3410.method1707(-20, var24);
                        this.field3410.method1707(-119, var25);
                        this.field3410.method1707(-109, var26);
                    }
                    if (this.field3420[var18] > 64) {
                        int var31 = this.field3420[var18] - 64 - 1;
                        for (int var32 = this.field3416[var31] - 1; var32 >= 0; var32--) {
                            class58 var33 = this.field3417[var31][var32];
                            int var34 = var33.field839;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field840 >> class439.field6436);
                            float var40 = (float) (var33.field844 >> class439.field6436);
                            float var41 = (float) (var33.field836 >> class439.field6436);
                            int var42 = var33.field835 >> class439.field6436;
                            this.field3410.method2376(0.0F, (byte) 126);
                            this.field3410.method2376(0.0F, (byte) 126);
                            this.field3410.method2376((float) (-var42) * var9 + var39, (byte) 126);
                            this.field3410.method2376((float) (-var42) * var10 + var40, (byte) 126);
                            this.field3410.method2376((float) (-var42) * var11 + var41, (byte) 126);
                            this.field3410.method1707(-110, var35);
                            this.field3410.method1707(-111, var36);
                            this.field3410.method1707(-117, var37);
                            this.field3410.method1707(111, var38);
                            this.field3410.method2376(1.0F, (byte) 126);
                            this.field3410.method2376(0.0F, (byte) 126);
                            this.field3410.method2376((float) var42 * var12 + var39, (byte) 126);
                            this.field3410.method2376((float) var42 * var13 + var40, (byte) 126);
                            this.field3410.method2376((float) var42 * var14 + var41, (byte) 126);
                            this.field3410.method1707(-118, var35);
                            this.field3410.method1707(-119, var36);
                            this.field3410.method1707(-111, var37);
                            this.field3410.method1707(-125, var38);
                            this.field3410.method2376(1.0F, (byte) 126);
                            this.field3410.method2376(1.0F, (byte) 126);
                            this.field3410.method2376((float) var42 * var9 + var39, (byte) 126);
                            this.field3410.method2376((float) var42 * var10 + var40, (byte) 126);
                            this.field3410.method2376((float) var42 * var11 + var41, (byte) 126);
                            this.field3410.method1707(-124, var35);
                            this.field3410.method1707(47, var36);
                            this.field3410.method1707(18, var37);
                            this.field3410.method1707(-119, var38);
                            this.field3410.method2376(0.0F, (byte) 126);
                            this.field3410.method2376(1.0F, (byte) 126);
                            this.field3410.method2376((float) var42 * var15 + var39, (byte) 126);
                            this.field3410.method2376((float) var42 * var16 + var40, (byte) 126);
                            this.field3410.method2376((float) var42 * var17 + var41, (byte) 126);
                            this.field3410.method1707(-119, var35);
                            this.field3410.method1707(22, var36);
                            this.field3410.method1707(-117, var37);
                            this.field3410.method1707(72, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field3420[var43] > 64 ? 64 : this.field3420[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class58 var46 = this.field3415[var43][var45];
                        int var47 = var46.field839;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field840 >> class439.field6436);
                        float var53 = (float) (var46.field844 >> class439.field6436);
                        float var54 = (float) (var46.field836 >> class439.field6436);
                        int var55 = var46.field835 >> class439.field6436;
                        this.field3410.method2375(0.0F, (byte) -30);
                        this.field3410.method2375(0.0F, (byte) -30);
                        this.field3410.method2375((float) (-var55) * var9 + var52, (byte) -30);
                        this.field3410.method2375((float) (-var55) * var10 + var53, (byte) -30);
                        this.field3410.method2375((float) (-var55) * var11 + var54, (byte) -30);
                        this.field3410.method1707(-115, var48);
                        this.field3410.method1707(-117, var49);
                        this.field3410.method1707(-113, var50);
                        this.field3410.method1707(98, var51);
                        this.field3410.method2375(1.0F, (byte) -30);
                        this.field3410.method2375(0.0F, (byte) -30);
                        this.field3410.method2375((float) var55 * var12 + var52, (byte) -30);
                        this.field3410.method2375((float) var55 * var13 + var53, (byte) -30);
                        this.field3410.method2375((float) var55 * var14 + var54, (byte) -30);
                        this.field3410.method1707(-128, var48);
                        this.field3410.method1707(-115, var49);
                        this.field3410.method1707(-23, var50);
                        this.field3410.method1707(-124, var51);
                        this.field3410.method2375(1.0F, (byte) -30);
                        this.field3410.method2375(1.0F, (byte) -30);
                        this.field3410.method2375((float) var55 * var9 + var52, (byte) -30);
                        this.field3410.method2375((float) var55 * var10 + var53, (byte) -30);
                        this.field3410.method2375((float) var55 * var11 + var54, (byte) -30);
                        this.field3410.method1707(69, var48);
                        this.field3410.method1707(-109, var49);
                        this.field3410.method1707(-115, var50);
                        this.field3410.method1707(-32, var51);
                        this.field3410.method2375(0.0F, (byte) -30);
                        this.field3410.method2375(1.0F, (byte) -30);
                        this.field3410.method2375((float) var55 * var15 + var52, (byte) -30);
                        this.field3410.method2375((float) var55 * var16 + var53, (byte) -30);
                        this.field3410.method2375((float) var55 * var17 + var54, (byte) -30);
                        this.field3410.method1707(110, var48);
                        this.field3410.method1707(62, var49);
                        this.field3410.method1707(-110, var50);
                        this.field3410.method1707(-122, var51);
                    }
                    if (this.field3420[var43] > 64) {
                        int var56 = this.field3420[var43] - 64 - 1;
                        for (int var57 = this.field3416[var56] - 1; var57 >= 0; var57--) {
                            class58 var58 = this.field3417[var56][var57];
                            int var59 = var58.field839;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field840 >> class439.field6436);
                            float var65 = (float) (var58.field844 >> class439.field6436);
                            float var66 = (float) (var58.field836 >> class439.field6436);
                            int var67 = var58.field835 >> class439.field6436;
                            this.field3410.method2375(0.0F, (byte) -30);
                            this.field3410.method2375(0.0F, (byte) -30);
                            this.field3410.method2375((float) (-var67) * var9 + var64, (byte) -30);
                            this.field3410.method2375((float) (-var67) * var10 + var65, (byte) -30);
                            this.field3410.method2375((float) (-var67) * var11 + var66, (byte) -30);
                            this.field3410.method1707(-29, var60);
                            this.field3410.method1707(-121, var61);
                            this.field3410.method1707(-124, var62);
                            this.field3410.method1707(-115, var63);
                            this.field3410.method2375(1.0F, (byte) -30);
                            this.field3410.method2375(0.0F, (byte) -30);
                            this.field3410.method2375((float) var67 * var12 + var64, (byte) -30);
                            this.field3410.method2375((float) var67 * var13 + var65, (byte) -30);
                            this.field3410.method2375((float) var67 * var14 + var66, (byte) -30);
                            this.field3410.method1707(24, var60);
                            this.field3410.method1707(101, var61);
                            this.field3410.method1707(93, var62);
                            this.field3410.method1707(-111, var63);
                            this.field3410.method2375(1.0F, (byte) -30);
                            this.field3410.method2375(1.0F, (byte) -30);
                            this.field3410.method2375((float) var67 * var9 + var64, (byte) -30);
                            this.field3410.method2375((float) var67 * var10 + var65, (byte) -30);
                            this.field3410.method2375((float) var67 * var11 + var66, (byte) -30);
                            this.field3410.method1707(-124, var60);
                            this.field3410.method1707(-118, var61);
                            this.field3410.method1707(-1, var62);
                            this.field3410.method1707(-110, var63);
                            this.field3410.method2375(0.0F, (byte) -30);
                            this.field3410.method2375(1.0F, (byte) -30);
                            this.field3410.method2375((float) var67 * var15 + var64, (byte) -30);
                            this.field3410.method2375((float) var67 * var16 + var65, (byte) -30);
                            this.field3410.method2375((float) var67 * var17 + var66, (byte) -30);
                            this.field3410.method1707(92, var60);
                            this.field3410.method1707(107, var61);
                            this.field3410.method1707(-119, var62);
                            this.field3410.method1707(96, var63);
                        }
                    }
                }
            }
        }
        if (this.field3410.field3915 != 0) {
            this.field3414.method87(24, this.field3410.field3879, this.field3410.field3915);
            arg0.method2087(this.field3421, (class287) null, this.field3413, this.field3419);
            arg0.method2084(7, 0, this.field3410.field3915 / 24);
        }
    }
}
