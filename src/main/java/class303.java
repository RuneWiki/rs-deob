import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class303 extends class262 {

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Los;")
    private class468 field4426;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lgg;")
    private class273 field4428;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Z")
    private boolean field4427;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lni;")
    private class630 field4429;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Los;Ldd;[Lqr;Z)V", line = 6)
    public class303(class468 arg0, class166 arg1, class610[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4426 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class610 var54 = arg2[var6];
            if (var54.field8972 > var5) {
                var5 = var54.field8972;
            }
            if (var54.field8975 > var5) {
                var5 = var54.field8975;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class610 var10 = arg2[var9];
                int var11 = var10.field8972;
                int var12 = var10.field8975;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8970 == null) {
                    byte[] var17 = var10.field8976;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8970;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field4428 = class622.method3630(var8, 6406, false, -106, var7, 6406, arg0, var7);
            this.field4427 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class610 var39 = arg2[var24];
                int[] var40 = var39.field8974;
                byte[] var41 = var39.field8970;
                byte[] var42 = var39.field8976;
                int var43 = var39.field8972;
                int var44 = var39.field8975;
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
            this.field4428 = class32.method151(var7, var7, var23, arg0, (byte) 55, false);
            this.field4427 = false;
        }
        this.field4428.method3174(false, -17759);
        this.field4429 = new class630(arg0, 256);
        float var25 = this.field4428.field4042 / (float) this.field4428.field4035;
        float var26 = this.field4428.field4036 / (float) this.field4428.field4043;
        for (int var27 = 0; var27 < 256; var27++) {
            class610 var28 = arg2[var27];
            int var29 = var28.field8972;
            int var30 = var28.field8975;
            int var31 = var28.field8973;
            int var32 = var28.field8971;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field4429.method3673(var27, -1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field4428.field4036 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field4428.field4036 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4428.field4036 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4428.field4036 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field4429.method3674(true);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(CIIIZLpa;II)V", line = 242)
    public final void method529(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
        class1 var9 = (class1) arg5;
        class273 var10 = var9.field2;
        this.field4426.method2820((byte) 117);
        this.field4426.method2811(this.field4428, -2);
        if (this.field4427 || arg4) {
            this.field4426.method2852(7681, (byte) 34, 8448);
            this.field4426.method2801(false, 34168, 0, 768);
        } else {
            this.field4426.method2852(7681, (byte) 96, 7681);
        }
        this.field4426.method2842(1, (byte) 42);
        this.field4426.method2811(var10, -2);
        this.field4426.method2852(7681, (byte) 50, 8448);
        this.field4426.method2801(false, 34168, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4042 / (float) var10.field4035;
        float var12 = var10.field4036 / (float) var10.field4043;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4429.method3670(arg0, false);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4426.method2801(false, 5890, 0, 768);
        this.field4426.method2852(8448, (byte) 73, 8448);
        this.field4426.method2811(null, -2);
        this.field4426.method2842(0, (byte) 42);
        if (this.field4427 || arg4) {
            this.field4426.method2801(false, 5890, 0, 768);
        }
    }

    @OriginalMember(owner = "client!d", name = "HA", descriptor = "(CIIIZ)V", line = 289)
    public final void method528(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4426.method2820((byte) 124);
        this.field4426.method2811(this.field4428, -2);
        if (this.field4427 || arg4) {
            this.field4426.method2852(7681, (byte) 40, 8448);
            this.field4426.method2801(false, 34168, 0, 768);
        } else {
            this.field4426.method2852(7681, (byte) 53, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4429.method3670(arg0, false);
        OpenGL.glLoadIdentity();
        if (this.field4427 || arg4) {
            this.field4426.method2801(false, 5890, 0, 768);
        }
    }
}
