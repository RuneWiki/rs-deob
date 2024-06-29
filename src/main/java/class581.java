import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class581 extends class90 {

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Lmh;")
    private class537 field8462;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lwo;")
    private class632 field8465;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
    private boolean field8464;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Lam;")
    private class538 field8463;

    @OriginalMember(owner = "client!gi", name = "HA", descriptor = "(CIIIZ)V", line = 5)
    public final void method541(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8462.method3082(34162);
        this.field8462.method3083((byte) 108, this.field8465);
        if (this.field8464 || arg4) {
            this.field8462.method3099(8448, 7681, 8);
            this.field8462.method3126(false, 0, 768, 34168);
        } else {
            this.field8462.method3099(7681, 7681, 8);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8463.method3141(55, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8464 || arg4) {
            this.field8462.method3126(false, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lmh;Lfc;[Ldp;Z)V", line = 28)
    public class581(class537 arg0, class216 arg1, class3[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8462 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class3 var54 = arg2[var6];
            if (var54.field14 > var5) {
                var5 = var54.field14;
            }
            if (var54.field15 > var5) {
                var5 = var54.field15;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class3 var10 = arg2[var9];
                int var11 = var10.field14;
                int var12 = var10.field15;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field9 == null) {
                    byte[] var17 = var10.field11;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field9;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8465 = class638.method3658((byte) 29, 6406, arg0, var7, false, 6406, var8, var7);
            this.field8464 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class3 var39 = arg2[var24];
                int[] var40 = var39.field13;
                byte[] var41 = var39.field9;
                byte[] var42 = var39.field11;
                int var43 = var39.field14;
                int var44 = var39.field15;
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
            this.field8465 = class295.method1648(var7, var7, var23, (byte) -45, arg0, false);
            this.field8464 = false;
        }
        this.field8465.method1358((byte) -45, false);
        this.field8463 = new class538(arg0, 256);
        float var25 = this.field8465.field9100 / (float) this.field8465.field9109;
        float var26 = this.field8465.field9101 / (float) this.field8465.field9099;
        for (int var27 = 0; var27 < 256; var27++) {
            class3 var28 = arg2[var27];
            int var29 = var28.field14;
            int var30 = var28.field15;
            int var31 = var28.field10;
            int var32 = var28.field12;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8463.method3139(var27, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8465.field9101 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8465.field9101 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8465.field9101 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8465.field9101 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8463.method3144(-80);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CIIIZLpa;II)V", line = 265)
    public final void method543(char arg0, int arg1, int arg2, int arg3, boolean arg4, class309 arg5, int arg6, int arg7) {
        class33 var9 = (class33) arg5;
        class632 var10 = var9.field257;
        this.field8462.method3082(34162);
        this.field8462.method3083((byte) 119, this.field8465);
        if (this.field8464 || arg4) {
            this.field8462.method3099(8448, 7681, 8);
            this.field8462.method3126(false, 0, 768, 34168);
        } else {
            this.field8462.method3099(7681, 7681, 8);
        }
        this.field8462.method3078(33984, 1);
        this.field8462.method3083((byte) 103, var10);
        this.field8462.method3099(8448, 7681, 8);
        this.field8462.method3126(false, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field9100 / (float) var10.field9109;
        float var12 = var10.field9101 / (float) var10.field9099;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8463.method3141(78, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8462.method3126(false, 0, 768, 5890);
        this.field8462.method3099(8448, 8448, 8);
        this.field8462.method3083((byte) 79, null);
        this.field8462.method3078(33984, 0);
        if (this.field8464 || arg4) {
            this.field8462.method3126(false, 0, 768, 5890);
        }
    }
}
