import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class267 extends class181 {

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lad;")
    private class362 field3759;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lah;")
    private class325 field3760;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Z")
    private boolean field3757;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lub;")
    private class19 field3758;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lad;Lcq;[Laf;Z)V")
    public class267(class362 arg0, class402 arg1, class372[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3759 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class372 var54 = arg2[var6];
            if (var54.field5692 > var5) {
                var5 = var54.field5692;
            }
            if (var54.field5688 > var5) {
                var5 = var54.field5688;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class372 var10 = arg2[var9];
                int var11 = var10.field5692;
                int var12 = var10.field5688;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field5684 == null) {
                    byte[] var17 = var10.field5685;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field5684;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3760 = class108.method677(arg0, var8, 6406, 6406, var7, 19124, var7, false);
            this.field3757 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class372 var39 = arg2[var24];
                int[] var40 = var39.field5691;
                byte[] var41 = var39.field5684;
                byte[] var42 = var39.field5685;
                int var43 = var39.field5692;
                int var44 = var39.field5688;
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
            this.field3760 = class168.method965(var23, false, arg0, (byte) -57, var7, var7);
            this.field3757 = false;
        }
        this.field3760.method3020(false, 0);
        this.field3758 = new class19(arg0, 256);
        float var25 = this.field3760.field4691 / (float) this.field3760.field4685;
        float var26 = this.field3760.field4687 / (float) this.field3760.field4692;
        for (int var27 = 0; var27 < 256; var27++) {
            class372 var28 = arg2[var27];
            int var29 = var28.field5692;
            int var30 = var28.field5688;
            int var31 = var28.field5687;
            int var32 = var28.field5686;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3758.method121((byte) -18, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3760.field4687 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3760.field4687 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3760.field4687 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3760.field4687 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3758.method124(7);
        }
    }

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "(CIIIZ)V")
    public final void method69(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3759.method2290(7551);
        this.field3759.method2295(-102, this.field3760);
        if (this.field3757 || arg4) {
            this.field3759.method2320(8448, 7681, 0);
            this.field3759.method2291(34168, 0, 768, (byte) -35);
        } else {
            this.field3759.method2320(7681, 7681, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3758.method122(arg0, (byte) 106);
        OpenGL.glLoadIdentity();
        if (this.field3757 || arg4) {
            this.field3759.method2291(5890, 0, 768, (byte) -35);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method73(char arg0, int arg1, int arg2, int arg3, boolean arg4, class199 arg5, int arg6, int arg7) {
        class34 var9 = (class34) arg5;
        class325 var10 = var9.field388;
        this.field3759.method2290(7551);
        this.field3759.method2295(-92, this.field3760);
        if (this.field3757 || arg4) {
            this.field3759.method2320(8448, 7681, 0);
            this.field3759.method2291(34168, 0, 768, (byte) -35);
        } else {
            this.field3759.method2320(7681, 7681, 0);
        }
        this.field3759.method2269((byte) 28, 1);
        this.field3759.method2295(-85, var10);
        this.field3759.method2320(8448, 7681, 0);
        this.field3759.method2291(34168, 0, 768, (byte) -35);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4691 / (float) var10.field4685;
        float var12 = var10.field4687 / (float) var10.field4692;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3758.method122(arg0, (byte) 20);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3759.method2291(5890, 0, 768, (byte) -35);
        this.field3759.method2320(8448, 8448, 0);
        this.field3759.method2295(-97, null);
        this.field3759.method2269((byte) -105, 0);
        if (this.field3757 || arg4) {
            this.field3759.method2291(5890, 0, 768, (byte) -35);
        }
    }
}
