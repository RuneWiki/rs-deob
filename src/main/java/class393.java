import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class393 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[F")
    private float[] field5589 = new float[16];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lkc;")
    private class472 field5588 = new class472(786336);

    @OriginalMember(owner = "client!du", name = "e", descriptor = "[[Lar;")
    private class52[][] field5592 = new class52[1600][64];

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    private int field5596 = 0;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
    private int[] field5599 = new int[8191];

    @OriginalMember(owner = "client!du", name = "h", descriptor = "[I")
    private int[] field5595 = new int[64];

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[I")
    private int[] field5600 = new int[1600];

    @OriginalMember(owner = "client!du", name = "k", descriptor = "[[Lar;")
    private class52[][] field5598 = new class52[64][768];

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lfh;")
    private class228 field5591;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lfh;")
    private class228 field5593;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lfh;")
    private class228 field5597;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Leb;")
    private class416 field5594;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field5590;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lic;Lcd;)V")
    public final void method2357(class246 arg0, class46 arg1) {
        this.field5590 = arg0.field3342;
        if (arg0.field3397 == null) {
            return;
        }
        this.method2358(arg0);
        float var3 = arg0.field3397.field4861;
        float var4 = arg0.field3397.field4866;
        float var5 = arg0.field3397.field4859;
        float var6 = arg0.field3397.field4864;
        try {
            if (arg1.field603) {
                int var23 = arg1.field605 - arg1.field604;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class325 var24 = arg1.field599.field1510;
                class325 var25 = var24.field4684;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5596 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5600[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5595[var29] = 0;
                    }
                    while (var24 != var25) {
                        class52 var30 = (class52) var25;
                        if (var27) {
                            var26 = var30.field673;
                            var27 = false;
                        } else if (var30.field673 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field675 >> class92.field1149) * var5 + (float) (var30.field678 >> class92.field1149) * var3 + (float) (var30.field674 >> class92.field1149) * var4 + var6) - arg1.field604;
                        if (var31 <= 1600) {
                            if (this.field5600[var31] < 64) {
                                this.field5592[var31][this.field5600[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5600[var31] == 64) {
                                        if (this.field5596 == 64) {
                                            break label188;
                                        }
                                        this.field5600[var31] += this.field5596++ + 1;
                                    }
                                    this.field5598[this.field5600[var31] - 64 - 1][this.field5595[this.field5600[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4684;
                    }
                    arg0.method1379(var26 >= 0 ? arg0.field3345.method468(-1, var26) : null);
                    this.method2360(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class325 var10 = arg1.field599.field1510;
                for (class325 var11 = var10.field4684; var11 != var10; var11 = var11.field4684) {
                    class52 var12 = (class52) var11;
                    int var13 = (int) ((float) (var12.field675 >> class92.field1149) * var5 + (float) (var12.field678 >> class92.field1149) * var3 + (float) (var12.field674 >> class92.field1149) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5599[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class325 var15 = var10.field4684;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5596 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5600[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5595[var20] = 0;
                    }
                    while (var10 != var15) {
                        class52 var21 = (class52) var15;
                        if (var18) {
                            var17 = var21.field673;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field673 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5599[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5600[var22] < 64) {
                                this.field5592[var22][this.field5600[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5600[var22] == 64) {
                                        if (this.field5596 == 64) {
                                            break label186;
                                        }
                                        this.field5600[var22] += this.field5596++ + 1;
                                    }
                                    this.field5598[this.field5600[var22] - 64 - 1][this.field5595[this.field5600[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4684;
                    }
                    arg0.method1379(var17 >= 0 ? arg0.field3345.method468(-1, var17) : null);
                    this.method2360(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2359(arg0);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lic;)V")
    private final void method2358(class246 arg0) {
        arg0.method1425();
        this.field5590.glDisable(16384);
        this.field5590.glDisable(16385);
        arg0.method1441(false);
        arg0.method1418(-2);
        this.field5590.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Lic;)V")
    private final void method2359(class246 arg0) {
        arg0.method1441(true);
        this.field5590.glEnable(16384);
        this.field5590.glEnable(16385);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lic;I)V")
    private final void method2360(class246 arg0, int arg1) {
        this.field5590.glGetFloatv(2982, this.field5589, 0);
        float var3 = this.field5589[0];
        float var4 = this.field5589[4];
        float var5 = this.field5589[8];
        float var6 = this.field5589[1];
        float var7 = this.field5589[5];
        float var8 = this.field5589[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5588.field2206 = 0;
        if (arg0.field3370) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5600[var18] > 64 ? 64 : this.field5600[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class52 var21 = this.field5592[var18][var20];
                        int var22 = var21.field684;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field678 >> class92.field1149);
                        float var28 = (float) (var21.field674 >> class92.field1149);
                        float var29 = (float) (var21.field675 >> class92.field1149);
                        int var30 = var21.field679 >> class92.field1149;
                        this.field5588.method2788(0.0F, -1327473512);
                        this.field5588.method2788(0.0F, -1327473512);
                        this.field5588.method2788((float) (-var30) * var9 + var27, -1327473512);
                        this.field5588.method2788((float) (-var30) * var10 + var28, -1327473512);
                        this.field5588.method2788((float) (-var30) * var11 + var29, -1327473512);
                        this.field5588.method909(var23, -1);
                        this.field5588.method909(var24, -1);
                        this.field5588.method909(var25, -1);
                        this.field5588.method909(var26, -1);
                        this.field5588.method2788(1.0F, -1327473512);
                        this.field5588.method2788(0.0F, -1327473512);
                        this.field5588.method2788((float) var30 * var12 + var27, -1327473512);
                        this.field5588.method2788((float) var30 * var13 + var28, -1327473512);
                        this.field5588.method2788((float) var30 * var14 + var29, -1327473512);
                        this.field5588.method909(var23, -1);
                        this.field5588.method909(var24, -1);
                        this.field5588.method909(var25, -1);
                        this.field5588.method909(var26, -1);
                        this.field5588.method2788(1.0F, -1327473512);
                        this.field5588.method2788(1.0F, -1327473512);
                        this.field5588.method2788((float) var30 * var9 + var27, -1327473512);
                        this.field5588.method2788((float) var30 * var10 + var28, -1327473512);
                        this.field5588.method2788((float) var30 * var11 + var29, -1327473512);
                        this.field5588.method909(var23, -1);
                        this.field5588.method909(var24, -1);
                        this.field5588.method909(var25, -1);
                        this.field5588.method909(var26, -1);
                        this.field5588.method2788(0.0F, -1327473512);
                        this.field5588.method2788(1.0F, -1327473512);
                        this.field5588.method2788((float) var30 * var15 + var27, -1327473512);
                        this.field5588.method2788((float) var30 * var16 + var28, -1327473512);
                        this.field5588.method2788((float) var30 * var17 + var29, -1327473512);
                        this.field5588.method909(var23, -1);
                        this.field5588.method909(var24, -1);
                        this.field5588.method909(var25, -1);
                        this.field5588.method909(var26, -1);
                    }
                    if (this.field5600[var18] > 64) {
                        int var31 = this.field5600[var18] - 64 - 1;
                        for (int var32 = this.field5595[var31] - 1; var32 >= 0; var32--) {
                            class52 var33 = this.field5598[var31][var32];
                            int var34 = var33.field684;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field678 >> class92.field1149);
                            float var40 = (float) (var33.field674 >> class92.field1149);
                            float var41 = (float) (var33.field675 >> class92.field1149);
                            int var42 = var33.field679 >> class92.field1149;
                            this.field5588.method2788(0.0F, -1327473512);
                            this.field5588.method2788(0.0F, -1327473512);
                            this.field5588.method2788((float) (-var42) * var9 + var39, -1327473512);
                            this.field5588.method2788((float) (-var42) * var10 + var40, -1327473512);
                            this.field5588.method2788((float) (-var42) * var11 + var41, -1327473512);
                            this.field5588.method909(var35, -1);
                            this.field5588.method909(var36, -1);
                            this.field5588.method909(var37, -1);
                            this.field5588.method909(var38, -1);
                            this.field5588.method2788(1.0F, -1327473512);
                            this.field5588.method2788(0.0F, -1327473512);
                            this.field5588.method2788((float) var42 * var12 + var39, -1327473512);
                            this.field5588.method2788((float) var42 * var13 + var40, -1327473512);
                            this.field5588.method2788((float) var42 * var14 + var41, -1327473512);
                            this.field5588.method909(var35, -1);
                            this.field5588.method909(var36, -1);
                            this.field5588.method909(var37, -1);
                            this.field5588.method909(var38, -1);
                            this.field5588.method2788(1.0F, -1327473512);
                            this.field5588.method2788(1.0F, -1327473512);
                            this.field5588.method2788((float) var42 * var9 + var39, -1327473512);
                            this.field5588.method2788((float) var42 * var10 + var40, -1327473512);
                            this.field5588.method2788((float) var42 * var11 + var41, -1327473512);
                            this.field5588.method909(var35, -1);
                            this.field5588.method909(var36, -1);
                            this.field5588.method909(var37, -1);
                            this.field5588.method909(var38, -1);
                            this.field5588.method2788(0.0F, -1327473512);
                            this.field5588.method2788(1.0F, -1327473512);
                            this.field5588.method2788((float) var42 * var15 + var39, -1327473512);
                            this.field5588.method2788((float) var42 * var16 + var40, -1327473512);
                            this.field5588.method2788((float) var42 * var17 + var41, -1327473512);
                            this.field5588.method909(var35, -1);
                            this.field5588.method909(var36, -1);
                            this.field5588.method909(var37, -1);
                            this.field5588.method909(var38, -1);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5600[var43] > 64 ? 64 : this.field5600[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class52 var46 = this.field5592[var43][var45];
                        int var47 = var46.field684;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field678 >> class92.field1149);
                        float var53 = (float) (var46.field674 >> class92.field1149);
                        float var54 = (float) (var46.field675 >> class92.field1149);
                        int var55 = var46.field679 >> class92.field1149;
                        this.field5588.method2787(true, 0.0F);
                        this.field5588.method2787(true, 0.0F);
                        this.field5588.method2787(true, (float) (-var55) * var9 + var52);
                        this.field5588.method2787(true, (float) (-var55) * var10 + var53);
                        this.field5588.method2787(true, (float) (-var55) * var11 + var54);
                        this.field5588.method909(var48, -1);
                        this.field5588.method909(var49, -1);
                        this.field5588.method909(var50, -1);
                        this.field5588.method909(var51, -1);
                        this.field5588.method2787(true, 1.0F);
                        this.field5588.method2787(true, 0.0F);
                        this.field5588.method2787(true, (float) var55 * var12 + var52);
                        this.field5588.method2787(true, (float) var55 * var13 + var53);
                        this.field5588.method2787(true, (float) var55 * var14 + var54);
                        this.field5588.method909(var48, -1);
                        this.field5588.method909(var49, -1);
                        this.field5588.method909(var50, -1);
                        this.field5588.method909(var51, -1);
                        this.field5588.method2787(true, 1.0F);
                        this.field5588.method2787(true, 1.0F);
                        this.field5588.method2787(true, (float) var55 * var9 + var52);
                        this.field5588.method2787(true, (float) var55 * var10 + var53);
                        this.field5588.method2787(true, (float) var55 * var11 + var54);
                        this.field5588.method909(var48, -1);
                        this.field5588.method909(var49, -1);
                        this.field5588.method909(var50, -1);
                        this.field5588.method909(var51, -1);
                        this.field5588.method2787(true, 0.0F);
                        this.field5588.method2787(true, 1.0F);
                        this.field5588.method2787(true, (float) var55 * var15 + var52);
                        this.field5588.method2787(true, (float) var55 * var16 + var53);
                        this.field5588.method2787(true, (float) var55 * var17 + var54);
                        this.field5588.method909(var48, -1);
                        this.field5588.method909(var49, -1);
                        this.field5588.method909(var50, -1);
                        this.field5588.method909(var51, -1);
                    }
                    if (this.field5600[var43] > 64) {
                        int var56 = this.field5600[var43] - 64 - 1;
                        for (int var57 = this.field5595[var56] - 1; var57 >= 0; var57--) {
                            class52 var58 = this.field5598[var56][var57];
                            int var59 = var58.field684;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field678 >> class92.field1149);
                            float var65 = (float) (var58.field674 >> class92.field1149);
                            float var66 = (float) (var58.field675 >> class92.field1149);
                            int var67 = var58.field679 >> class92.field1149;
                            this.field5588.method2787(true, 0.0F);
                            this.field5588.method2787(true, 0.0F);
                            this.field5588.method2787(true, (float) (-var67) * var9 + var64);
                            this.field5588.method2787(true, (float) (-var67) * var10 + var65);
                            this.field5588.method2787(true, (float) (-var67) * var11 + var66);
                            this.field5588.method909(var60, -1);
                            this.field5588.method909(var61, -1);
                            this.field5588.method909(var62, -1);
                            this.field5588.method909(var63, -1);
                            this.field5588.method2787(true, 1.0F);
                            this.field5588.method2787(true, 0.0F);
                            this.field5588.method2787(true, (float) var67 * var12 + var64);
                            this.field5588.method2787(true, (float) var67 * var13 + var65);
                            this.field5588.method2787(true, (float) var67 * var14 + var66);
                            this.field5588.method909(var60, -1);
                            this.field5588.method909(var61, -1);
                            this.field5588.method909(var62, -1);
                            this.field5588.method909(var63, -1);
                            this.field5588.method2787(true, 1.0F);
                            this.field5588.method2787(true, 1.0F);
                            this.field5588.method2787(true, (float) var67 * var9 + var64);
                            this.field5588.method2787(true, (float) var67 * var10 + var65);
                            this.field5588.method2787(true, (float) var67 * var11 + var66);
                            this.field5588.method909(var60, -1);
                            this.field5588.method909(var61, -1);
                            this.field5588.method909(var62, -1);
                            this.field5588.method909(var63, -1);
                            this.field5588.method2787(true, 0.0F);
                            this.field5588.method2787(true, 1.0F);
                            this.field5588.method2787(true, (float) var67 * var15 + var64);
                            this.field5588.method2787(true, (float) var67 * var16 + var65);
                            this.field5588.method2787(true, (float) var67 * var17 + var66);
                            this.field5588.method909(var60, -1);
                            this.field5588.method909(var61, -1);
                            this.field5588.method909(var62, -1);
                            this.field5588.method909(var63, -1);
                        }
                    }
                }
            }
        }
        if (this.field5588.field2206 != 0) {
            this.field5594.method1297(24, this.field5588.field2159, this.field5588.field2206);
            arg0.method1412(this.field5593, (class228) null, this.field5597, this.field5591);
            arg0.method1496(7, 0, this.field5588.field2206 / 24);
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(Lic;)V")
    public final void method2361(class246 arg0) {
        this.field5594 = arg0.method1361(24, (byte[]) null, 196584, true);
        this.field5591 = new class228(arg0, this.field5594, 5126, 2, 0);
        this.field5593 = new class228(arg0, this.field5594, 5126, 3, 8);
        this.field5597 = new class228(arg0, this.field5594, 5121, 4, 20);
    }
}
