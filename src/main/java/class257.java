import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class257 extends class443 {

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Llea;")
    private class573 field3663;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "Luk;")
    private class296 field3665;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Z")
    private boolean field3666;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lbfa;")
    private class264 field3664;

    @OriginalMember(owner = "client!ok", name = "fa", descriptor = "(CIIIZ)V")
    public final void method179(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3663.method3371(6);
        this.field3663.method3384(this.field3665, (byte) 91);
        if (this.field3666 || arg4) {
            this.field3663.method3359(7681, 8448, true);
            this.field3663.method3351(768, 0, 34168, (byte) -85);
        } else {
            this.field3663.method3359(7681, 7681, true);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3664.method1700(arg0, 3711);
        OpenGL.glLoadIdentity();
        if (this.field3666 || arg4) {
            this.field3663.method3351(768, 0, 5890, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Llea;Lrt;[Lde;Z)V")
    public class257(class573 arg0, class470 arg1, class418[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3663 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class418 var54 = arg2[var6];
            if (var54.field5792 > var5) {
                var5 = var54.field5792;
            }
            if (var54.field5796 > var5) {
                var5 = var54.field5796;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class418 var10 = arg2[var9];
                int var11 = var10.field5792;
                int var12 = var10.field5796;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field5798 == null) {
                    byte[] var17 = var10.field5793;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field5798;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3665 = class119.method1047(arg0, false, var7, 6406, 32515, var7, 6406, var8);
            this.field3666 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class418 var39 = arg2[var24];
                int[] var40 = var39.field5795;
                byte[] var41 = var39.field5798;
                byte[] var42 = var39.field5793;
                int var43 = var39.field5792;
                int var44 = var39.field5796;
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
            this.field3665 = class596.method3481(arg0, 0, var7, var7, var23, 15765, false, 0);
            this.field3666 = false;
        }
        this.field3665.method2266(42, false);
        this.field3664 = new class264(arg0, 256);
        float var25 = this.field3665.field4299 / (float) this.field3665.field4301;
        float var26 = this.field3665.field4303 / (float) this.field3665.field4305;
        for (int var27 = 0; var27 < 256; var27++) {
            class418 var28 = arg2[var27];
            int var29 = var28.field5792;
            int var30 = var28.field5796;
            int var31 = var28.field5799;
            int var32 = var28.field5794;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3664.method1704(var27, -109);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3665.field4303 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3665.field4303 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3665.field4303 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3665.field4303 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3664.method1701((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method180(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7) {
        class410 var9 = (class410) arg5;
        class296 var10 = var9.field5613;
        this.field3663.method3371(6);
        this.field3663.method3384(this.field3665, (byte) 92);
        if (this.field3666 || arg4) {
            this.field3663.method3359(7681, 8448, true);
            this.field3663.method3351(768, 0, 34168, (byte) -85);
        } else {
            this.field3663.method3359(7681, 7681, true);
        }
        this.field3663.method3321(1, -19587);
        this.field3663.method3384(var10, (byte) 91);
        this.field3663.method3359(7681, 8448, true);
        this.field3663.method3351(768, 0, 34168, (byte) -85);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4299 / (float) var10.field4301;
        float var12 = var10.field4303 / (float) var10.field4305;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3664.method1700(arg0, 3711);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3663.method3351(768, 0, 5890, (byte) -85);
        this.field3663.method3359(8448, 8448, true);
        this.field3663.method3384(null, (byte) 125);
        this.field3663.method3321(0, -19587);
        if (this.field3666 || arg4) {
            this.field3663.method3351(768, 0, 5890, (byte) -85);
        }
    }
}
