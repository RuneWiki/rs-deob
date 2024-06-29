import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class564 extends class67 {

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "Lpc;")
    private class700 field7790;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "Lqt;")
    private class664 field7791;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "Z")
    private boolean field7792;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Lpia;")
    private class104 field7789;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method225(char arg0, int arg1, int arg2, int arg3, boolean arg4, class513 arg5, int arg6, int arg7) {
        class575 var9 = (class575) arg5;
        class664 var10 = var9.field7865;
        this.field7790.method3955((byte) 44);
        this.field7790.method3936(false, this.field7791);
        if (this.field7792 || arg4) {
            this.field7790.method3961(8448, 7681, 16127);
            this.field7790.method3903(34168, 0, 768, -108);
        } else {
            this.field7790.method3961(7681, 7681, 16127);
        }
        this.field7790.method3925((byte) -111, 1);
        this.field7790.method3936(false, var10);
        this.field7790.method3961(8448, 7681, 16127);
        this.field7790.method3903(34168, 0, 768, -118);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field9127 / (float) var10.field9120;
        float var12 = var10.field9123 / (float) var10.field9126;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7789.method856(-67, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field7790.method3903(5890, 0, 768, -117);
        this.field7790.method3961(8448, 8448, 16127);
        this.field7790.method3936(false, null);
        this.field7790.method3925((byte) 118, 0);
        if (this.field7792 || arg4) {
            this.field7790.method3903(5890, 0, 768, -121);
        }
    }

    @OriginalMember(owner = "client!ur", name = "fa", descriptor = "(CIIIZ)V")
    public final void method226(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7790.method3955((byte) 44);
        this.field7790.method3936(false, this.field7791);
        if (this.field7792 || arg4) {
            this.field7790.method3961(8448, 7681, 16127);
            this.field7790.method3903(34168, 0, 768, -128);
        } else {
            this.field7790.method3961(7681, 7681, 16127);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7789.method856(-87, arg0);
        OpenGL.glLoadIdentity();
        if (this.field7792 || arg4) {
            this.field7790.method3903(5890, 0, 768, -106);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lpc;Lbq;[Lcr;Z)V")
    public class564(class700 arg0, class307 arg1, class600[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7790 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class600 var54 = arg2[var6];
            if (var54.field8116 > var5) {
                var5 = var54.field8116;
            }
            if (var54.field8123 > var5) {
                var5 = var54.field8123;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class600 var10 = arg2[var9];
                int var11 = var10.field8116;
                int var12 = var10.field8123;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8119 == null) {
                    byte[] var17 = var10.field8122;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8119;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field7791 = class30.method287(false, 6406, 2, 6406, arg0, var7, var8, var7);
            this.field7792 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class600 var39 = arg2[var24];
                int[] var40 = var39.field8120;
                byte[] var41 = var39.field8119;
                byte[] var42 = var39.field8122;
                int var43 = var39.field8116;
                int var44 = var39.field8123;
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
            this.field7791 = class245.method1480(false, 0, var7, 3553, arg0, 0, var23, var7);
            this.field7792 = false;
        }
        this.field7791.method2347(false, -90);
        this.field7789 = new class104(arg0, 256);
        float var25 = this.field7791.field9127 / (float) this.field7791.field9120;
        float var26 = this.field7791.field9123 / (float) this.field7791.field9126;
        for (int var27 = 0; var27 < 256; var27++) {
            class600 var28 = arg2[var27];
            int var29 = var28.field8116;
            int var30 = var28.field8123;
            int var31 = var28.field8124;
            int var32 = var28.field8118;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field7789.method858(var27, (byte) -96);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field7791.field9123 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field7791.field9123 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field7791.field9123 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field7791.field9123 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field7789.method857(0);
        }
    }
}
