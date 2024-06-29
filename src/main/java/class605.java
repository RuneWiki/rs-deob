import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class605 extends class301 {

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "Lpea;")
    private class641 field8274;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "Lmm;")
    private class459 field8275;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "Z")
    private boolean field8272;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "Lhea;")
    private class393 field8273;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "(CIIIZ)V", line = 5)
    public final void method1099(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8274.method3546((byte) -74);
        this.field8274.method3553((byte) -121, this.field8275);
        if (this.field8272 || arg4) {
            this.field8274.method3499(8448, 34161, 7681);
            this.field8274.method3525(768, 34168, 0, true);
        } else {
            this.field8274.method3499(7681, 34161, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8273.method2336((byte) 32, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8272 || arg4) {
            this.field8274.method3525(768, 5890, 0, true);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lpea;Lil;[Lme;Z)V", line = 25)
    public class605(class641 arg0, class598 arg1, class366[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8274 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class366 var54 = arg2[var6];
            if (var54.field5253 > var5) {
                var5 = var54.field5253;
            }
            if (var54.field5252 > var5) {
                var5 = var54.field5252;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class366 var10 = arg2[var9];
                int var11 = var10.field5253;
                int var12 = var10.field5252;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field5255 == null) {
                    byte[] var17 = var10.field5256;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field5255;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8275 = class319.method2070(6406, var7, false, 6406, var7, arg0, -2709, var8);
            this.field8272 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class366 var39 = arg2[var24];
                int[] var40 = var39.field5248;
                byte[] var41 = var39.field5255;
                byte[] var42 = var39.field5256;
                int var43 = var39.field5253;
                int var44 = var39.field5252;
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
            this.field8275 = class399.method2360(var7, false, var23, false, var7, arg0);
            this.field8272 = false;
        }
        this.field8275.method1592(-35, false);
        this.field8273 = new class393(arg0, 256);
        float var25 = this.field8275.field6240 / (float) this.field8275.field6239;
        float var26 = this.field8275.field6242 / (float) this.field8275.field6241;
        for (int var27 = 0; var27 < 256; var27++) {
            class366 var28 = arg2[var27];
            int var29 = var28.field5253;
            int var30 = var28.field5252;
            int var31 = var28.field5251;
            int var32 = var28.field5250;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8273.method2339(4864, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8275.field6242 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8275.field6242 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8275.field6242 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8275.field6242 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8273.method2338(-20555);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(CIIIZLfa;II)V", line = 265)
    public final void method1103(char arg0, int arg1, int arg2, int arg3, boolean arg4, class185 arg5, int arg6, int arg7) {
        class200 var9 = (class200) arg5;
        class459 var10 = var9.field2628;
        this.field8274.method3546((byte) -107);
        this.field8274.method3553((byte) -97, this.field8275);
        if (this.field8272 || arg4) {
            this.field8274.method3499(8448, 34161, 7681);
            this.field8274.method3525(768, 34168, 0, true);
        } else {
            this.field8274.method3499(7681, 34161, 7681);
        }
        this.field8274.method3488(1, (byte) 23);
        this.field8274.method3553((byte) -88, var10);
        this.field8274.method3499(8448, 34161, 7681);
        this.field8274.method3525(768, 34168, 0, true);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6240 / (float) var10.field6239;
        float var12 = var10.field6242 / (float) var10.field6241;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8273.method2336((byte) 32, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8274.method3525(768, 5890, 0, true);
        this.field8274.method3499(8448, 34161, 8448);
        this.field8274.method3553((byte) -102, null);
        this.field8274.method3488(0, (byte) 23);
        if (this.field8272 || arg4) {
            this.field8274.method3525(768, 5890, 0, true);
        }
    }
}
