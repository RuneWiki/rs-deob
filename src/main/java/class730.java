import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class730 extends class61 {

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "Lac;")
    private class541 field10185;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Liaa;")
    private class495 field10182;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "Z")
    private boolean field10184;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Lfo;")
    private class518 field10183;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lac;Lmv;[Ltw;Z)V")
    public class730(class541 arg0, class377 arg1, class204[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field10185 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class204 var54 = arg2[var6];
            if (var54.field2419 > var5) {
                var5 = var54.field2419;
            }
            if (var54.field2421 > var5) {
                var5 = var54.field2421;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class204 var10 = arg2[var9];
                int var11 = var10.field2419;
                int var12 = var10.field2421;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2422 == null) {
                    byte[] var17 = var10.field2416;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2422;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field10182 = class457.method2550(6406, var7, 14764, 6406, arg0, false, var8, var7);
            this.field10184 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class204 var39 = arg2[var24];
                int[] var40 = var39.field2417;
                byte[] var41 = var39.field2422;
                byte[] var42 = var39.field2416;
                int var43 = var39.field2419;
                int var44 = var39.field2421;
                int var45 = var24 % 16 * var5;
                int var46 = var24 / 16 * var5;
                int var47 = var7 * var46 + var45;
                int var48 = 0;
                if (var41 == null) {
                    for (int var51 = 0; var51 < var43; var51++) {
                        for (int var52 = 0; var52 < var44; var52++) {
                            byte var53;
                            if ((var53 = var42[var48++]) == 0) {
                                var47++;
                            } else {
                                var23[var47++] = var40[var53 & 0xFF] | 0xFF000000;
                            }
                        }
                        var47 += var7 - var44;
                    }
                } else {
                    for (int var49 = 0; var49 < var43; var49++) {
                        for (int var50 = 0; var50 < var44; var50++) {
                            var23[var47++] = var41[var48] << 24 | var40[var42[var48] & 0xFF];
                            var48++;
                        }
                        var47 += var7 - var44;
                    }
                }
            }
            this.field10182 = class408.method2356(arg0, false, var23, var7, (byte) 120, 0, 0, var7);
            this.field10184 = false;
        }
        this.field10182.method1258(-28003, false);
        this.field10183 = new class518(arg0, 256);
        float var25 = this.field10182.field6740 / (float) this.field10182.field6742;
        float var26 = this.field10182.field6744 / (float) this.field10182.field6739;
        for (int var27 = 0; var27 < 256; var27++) {
            class204 var28 = arg2[var27];
            int var29 = var28.field2419;
            int var30 = var28.field2421;
            int var31 = var28.field2420;
            int var32 = var28.field2424;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field10183.method2852(var27, -30389);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field10182.field6744 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field10182.field6744 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10182.field6744 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10182.field6744 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field10183.method2851((byte) -44);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method76(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7) {
        class24 var9 = (class24) arg5;
        class495 var10 = var9.field180;
        this.field10185.method3032(false);
        this.field10185.method3006(1, this.field10182);
        if (this.field10184 || arg4) {
            this.field10185.method3042(8448, 8960, 7681);
            this.field10185.method2983(0, 768, 104, 34168);
        } else {
            this.field10185.method3042(7681, 8960, 7681);
        }
        this.field10185.method2988(1, 847872872);
        this.field10185.method3006(1, var10);
        this.field10185.method3042(8448, 8960, 7681);
        this.field10185.method2983(0, 768, 110, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6740 / (float) var10.field6742;
        float var12 = var10.field6744 / (float) var10.field6739;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10183.method2853(arg0, false);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field10185.method2983(0, 768, -91, 5890);
        this.field10185.method3042(8448, 8960, 8448);
        this.field10185.method3006(1, null);
        this.field10185.method2988(0, 847872872);
        if (this.field10184 || arg4) {
            this.field10185.method2983(0, 768, -102, 5890);
        }
    }

    @OriginalMember(owner = "client!bo", name = "fa", descriptor = "(CIIIZ)V")
    public final void method74(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10185.method3032(false);
        this.field10185.method3006(1, this.field10182);
        if (this.field10184 || arg4) {
            this.field10185.method3042(8448, 8960, 7681);
            this.field10185.method2983(0, 768, 83, 34168);
        } else {
            this.field10185.method3042(7681, 8960, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10183.method2853(arg0, false);
        OpenGL.glLoadIdentity();
        if (this.field10184 || arg4) {
            this.field10185.method2983(0, 768, 93, 5890);
        }
    }
}
