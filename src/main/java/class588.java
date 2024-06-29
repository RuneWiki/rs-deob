import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class588 extends class91 {

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "Lgi;")
    private class583 field8415;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Les;")
    private class320 field8414;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "Z")
    private boolean field8416;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "Lud;")
    private class31 field8417;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method672(char arg0, int arg1, int arg2, int arg3, boolean arg4, class310 arg5, int arg6, int arg7) {
        class401 var9 = (class401) arg5;
        class320 var10 = var9.field5716;
        this.field8415.method3393((byte) 47);
        this.field8415.method3358(32886, this.field8414);
        if (this.field8416 || arg4) {
            this.field8415.method3389(false, 7681, 8448);
            this.field8415.method3407(0, 768, -127, 34168);
        } else {
            this.field8415.method3389(false, 7681, 7681);
        }
        this.field8415.method3398(-43, 1);
        this.field8415.method3358(32886, var10);
        this.field8415.method3389(false, 7681, 8448);
        this.field8415.method3407(0, 768, -119, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4329 / (float) var10.field4333;
        float var12 = var10.field4331 / (float) var10.field4336;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8417.method317(arg0, true);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8415.method3407(0, 768, -128, 5890);
        this.field8415.method3389(false, 8448, 8448);
        this.field8415.method3358(32886, null);
        this.field8415.method3398(-37, 0);
        if (this.field8416 || arg4) {
            this.field8415.method3407(0, 768, -127, 5890);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lgi;Lpu;[Lbt;Z)V")
    public class588(class583 arg0, class483 arg1, class38[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8415 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class38 var54 = arg2[var6];
            if (var54.field783 > var5) {
                var5 = var54.field783;
            }
            if (var54.field785 > var5) {
                var5 = var54.field785;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class38 var10 = arg2[var9];
                int var11 = var10.field783;
                int var12 = var10.field785;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field790 == null) {
                    byte[] var17 = var10.field782;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field790;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8414 = class46.method454(6406, var8, false, arg0, (byte) 104, 6406, var7, var7);
            this.field8416 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class38 var39 = arg2[var24];
                int[] var40 = var39.field784;
                byte[] var41 = var39.field790;
                byte[] var42 = var39.field782;
                int var43 = var39.field783;
                int var44 = var39.field785;
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
            this.field8414 = class568.method3227(var23, var7, false, var7, arg0, false);
            this.field8416 = false;
        }
        this.field8414.method2513(false, false);
        this.field8417 = new class31(arg0, 256);
        float var25 = this.field8414.field4329 / (float) this.field8414.field4333;
        float var26 = this.field8414.field4331 / (float) this.field8414.field4336;
        for (int var27 = 0; var27 < 256; var27++) {
            class38 var28 = arg2[var27];
            int var29 = var28.field783;
            int var30 = var28.field785;
            int var31 = var28.field786;
            int var32 = var28.field787;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8417.method320(-28457, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8414.field4331 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8414.field4331 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8414.field4331 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8414.field4331 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8417.method321(2);
        }
    }

    @OriginalMember(owner = "client!vm", name = "HA", descriptor = "(CIIIZ)V")
    public final void method669(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8415.method3393((byte) 47);
        this.field8415.method3358(32886, this.field8414);
        if (this.field8416 || arg4) {
            this.field8415.method3389(false, 7681, 8448);
            this.field8415.method3407(0, 768, -116, 34168);
        } else {
            this.field8415.method3389(false, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8417.method317(arg0, true);
        OpenGL.glLoadIdentity();
        if (this.field8416 || arg4) {
            this.field8415.method3407(0, 768, -118, 5890);
        }
    }
}
