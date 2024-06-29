import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class596 extends class60 {

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lqo;")
    private class22 field8141;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Leba;")
    private class588 field8143;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Z")
    private boolean field8144;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Ljv;")
    private class80 field8142;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lqo;Loea;[Lrh;Z)V")
    public class596(class22 arg0, class597 arg1, class267[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8141 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class267 var54 = arg2[var6];
            if (var54.field3778 > var5) {
                var5 = var54.field3778;
            }
            if (var54.field3784 > var5) {
                var5 = var54.field3784;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class267 var10 = arg2[var9];
                int var11 = var10.field3778;
                int var12 = var10.field3784;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field3777 == null) {
                    byte[] var17 = var10.field3781;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field3777;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8143 = class412.method2551(false, var8, 6406, var7, arg0, -86, 6406, var7);
            this.field8144 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class267 var39 = arg2[var24];
                int[] var40 = var39.field3779;
                byte[] var41 = var39.field3777;
                byte[] var42 = var39.field3781;
                int var43 = var39.field3778;
                int var44 = var39.field3784;
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
            this.field8143 = class466.method2740(var23, 0, 0, var7, var7, arg0, false, (byte) 12);
            this.field8144 = false;
        }
        this.field8143.method456(9728, false);
        this.field8142 = new class80(arg0, 256);
        float var25 = this.field8143.field8014 / (float) this.field8143.field8017;
        float var26 = this.field8143.field8015 / (float) this.field8143.field8016;
        for (int var27 = 0; var27 < 256; var27++) {
            class267 var28 = arg2[var27];
            int var29 = var28.field3778;
            int var30 = var28.field3784;
            int var31 = var28.field3782;
            int var32 = var28.field3785;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8142.method741((byte) 123, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8143.field8015 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8143.field8015 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8143.field8015 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8143.field8015 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8142.method737(-1);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7) {
        class683 var9 = (class683) arg5;
        class588 var10 = var9.field9252;
        this.field8141.method184(9473);
        this.field8141.method256((byte) -109, this.field8143);
        if (this.field8144 || arg4) {
            this.field8141.method175(7681, (byte) -38, 8448);
            this.field8141.method239(34168, 768, (byte) -87, 0);
        } else {
            this.field8141.method175(7681, (byte) -55, 7681);
        }
        this.field8141.method190(-15039, 1);
        this.field8141.method256((byte) -127, var10);
        this.field8141.method175(7681, (byte) 97, 8448);
        this.field8141.method239(34168, 768, (byte) -87, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field8014 / (float) var10.field8017;
        float var12 = var10.field8015 / (float) var10.field8016;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8142.method740(arg0, 28666);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8141.method239(5890, 768, (byte) -87, 0);
        this.field8141.method175(8448, (byte) -96, 8448);
        this.field8141.method256((byte) -91, null);
        this.field8141.method190(-15039, 0);
        if (this.field8144 || arg4) {
            this.field8141.method239(5890, 768, (byte) -87, 0);
        }
    }

    @OriginalMember(owner = "client!th", name = "fa", descriptor = "(CIIIZ)V")
    public final void method130(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8141.method184(9473);
        this.field8141.method256((byte) -96, this.field8143);
        if (this.field8144 || arg4) {
            this.field8141.method175(7681, (byte) 117, 8448);
            this.field8141.method239(34168, 768, (byte) -87, 0);
        } else {
            this.field8141.method175(7681, (byte) 117, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8142.method740(arg0, 28666);
        OpenGL.glLoadIdentity();
        if (this.field8144 || arg4) {
            this.field8141.method239(5890, 768, (byte) -87, 0);
        }
    }
}
