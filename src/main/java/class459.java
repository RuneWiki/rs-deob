import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class459 extends class400 {

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lkw;")
    private class346 field6518;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lof;")
    private class9 field6516;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Z")
    private boolean field6517;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Ltw;")
    private class523 field6515;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(CIIIZLaa;II)V", line = 6)
    public final void method1275(char arg0, int arg1, int arg2, int arg3, boolean arg4, class569 arg5, int arg6, int arg7) {
        class512 var9 = (class512) arg5;
        class9 var10 = var9.field7421;
        this.field6518.method2196(29465);
        this.field6518.method2164(6, this.field6516);
        if (this.field6517 || arg4) {
            this.field6518.method2149(-11771, 8448, 7681);
            this.field6518.method2167(34168, 768, 10603, 0);
        } else {
            this.field6518.method2149(-11771, 7681, 7681);
        }
        this.field6518.method2171(124, 1);
        this.field6518.method2164(6, var10);
        this.field6518.method2149(-11771, 8448, 7681);
        this.field6518.method2167(34168, 768, 10603, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field71 / (float) var10.field74;
        float var12 = var10.field72 / (float) var10.field68;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6515.method3185(124, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6518.method2167(5890, 768, 10603, 0);
        this.field6518.method2149(-11771, 8448, 8448);
        this.field6518.method2164(6, null);
        this.field6518.method2171(123, 0);
        if (this.field6517 || arg4) {
            this.field6518.method2167(5890, 768, 10603, 0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "fa", descriptor = "(CIIIZ)V", line = 52)
    public final void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6518.method2196(29465);
        this.field6518.method2164(6, this.field6516);
        if (this.field6517 || arg4) {
            this.field6518.method2149(-11771, 8448, 7681);
            this.field6518.method2167(34168, 768, 10603, 0);
        } else {
            this.field6518.method2149(-11771, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6515.method3185(120, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6517 || arg4) {
            this.field6518.method2167(5890, 768, 10603, 0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lkw;Lqt;[Lffa;Z)V", line = 72)
    public class459(class346 arg0, class502 arg1, class676[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6518 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class676 var54 = arg2[var6];
            if (var54.field9618 > var5) {
                var5 = var54.field9618;
            }
            if (var54.field9614 > var5) {
                var5 = var54.field9614;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class676 var10 = arg2[var9];
                int var11 = var10.field9618;
                int var12 = var10.field9614;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field9616 == null) {
                    byte[] var17 = var10.field9612;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field9616;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6516 = class369.method2317(arg0, 34037, var7, false, var8, 6406, 6406, var7);
            this.field6517 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class676 var39 = arg2[var24];
                int[] var40 = var39.field9615;
                byte[] var41 = var39.field9616;
                byte[] var42 = var39.field9612;
                int var43 = var39.field9618;
                int var44 = var39.field9614;
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
            this.field6516 = class262.method1736(var7, 0, 19180, var7, 0, var23, arg0, false);
            this.field6517 = false;
        }
        this.field6516.method1131((byte) 42, false);
        this.field6515 = new class523(arg0, 256);
        float var25 = this.field6516.field71 / (float) this.field6516.field74;
        float var26 = this.field6516.field72 / (float) this.field6516.field68;
        for (int var27 = 0; var27 < 256; var27++) {
            class676 var28 = arg2[var27];
            int var29 = var28.field9618;
            int var30 = var28.field9614;
            int var31 = var28.field9610;
            int var32 = var28.field9613;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6515.method3184(var27, 103);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6516.field72 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6516.field72 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6516.field72 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6516.field72 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6515.method3181(true);
        }
    }
}
