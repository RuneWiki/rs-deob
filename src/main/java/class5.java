import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class67 {

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Lkv;")
    private class280 field58;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lbo;")
    private class759 field60;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Z")
    private boolean field59;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lee;")
    private class703 field57;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(CIIIZLaa;II)V", line = 9)
    public final void method30(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7) {
        class729 var9 = (class729) arg5;
        class759 var10 = var9.field10198;
        this.field58.method1858(108);
        this.field58.method1840(this.field60, 2205);
        if (this.field59 || arg4) {
            this.field58.method1835(false, 7681, 8448);
            this.field58.method1842(768, 111, 0, 34168);
        } else {
            this.field58.method1835(false, 7681, 7681);
        }
        this.field58.method1825(1, 115);
        this.field58.method1840(var10, 2205);
        this.field58.method1835(false, 7681, 8448);
        this.field58.method1842(768, 110, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field10473 / (float) var10.field10474;
        float var12 = var10.field10476 / (float) var10.field10470;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field57.method3982((byte) -120, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field58.method1842(768, 118, 0, 5890);
        this.field58.method1835(false, 8448, 8448);
        this.field58.method1840(null, 2205);
        this.field58.method1825(0, 114);
        if (this.field59 || arg4) {
            this.field58.method1842(768, -88, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lkv;Lkf;[Lre;Z)V", line = 53)
    public class5(class280 arg0, class263 arg1, class625[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field58 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class625 var54 = arg2[var6];
            if (var54.field8822 > var5) {
                var5 = var54.field8822;
            }
            if (var54.field8827 > var5) {
                var5 = var54.field8827;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class625 var10 = arg2[var9];
                int var11 = var10.field8822;
                int var12 = var10.field8827;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8820 == null) {
                    byte[] var17 = var10.field8828;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8820;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field60 = class784.method4293(6406, var7, 6406, var8, false, 34037, arg0, var7);
            this.field59 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class625 var39 = arg2[var24];
                int[] var40 = var39.field8823;
                byte[] var41 = var39.field8820;
                byte[] var42 = var39.field8828;
                int var43 = var39.field8822;
                int var44 = var39.field8827;
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
            this.field60 = class396.method2415(0, var23, arg0, var7, false, var7, 4095, 0);
            this.field59 = false;
        }
        this.field60.method3468(0, false);
        this.field57 = new class703(arg0, 256);
        float var25 = this.field60.field10473 / (float) this.field60.field10474;
        float var26 = this.field60.field10476 / (float) this.field60.field10470;
        for (int var27 = 0; var27 < 256; var27++) {
            class625 var28 = arg2[var27];
            int var29 = var28.field8822;
            int var30 = var28.field8827;
            int var31 = var28.field8825;
            int var32 = var28.field8826;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field57.method3980(var27, -27400);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field60.field10476 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field60.field10476 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field60.field10476 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field60.field10476 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field57.method3978(0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "fa", descriptor = "(CIIIZ)V", line = 290)
    public final void method31(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field58.method1858(110);
        this.field58.method1840(this.field60, 2205);
        if (this.field59 || arg4) {
            this.field58.method1835(false, 7681, 8448);
            this.field58.method1842(768, -90, 0, 34168);
        } else {
            this.field58.method1835(false, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field57.method3982((byte) -120, arg0);
        OpenGL.glLoadIdentity();
        if (this.field59 || arg4) {
            this.field58.method1842(768, -90, 0, 5890);
        }
    }
}
