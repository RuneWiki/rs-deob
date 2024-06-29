import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class467 extends class393 {

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "Luca;")
    private class287 field6719;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "Lei;")
    private class506 field6722;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "Z")
    private boolean field6721;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "Lbq;")
    private class646 field6720;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(CIIIZLua;II)V", line = 5)
    public final void method876(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
        class20 var9 = (class20) arg5;
        class506 var10 = var9.field382;
        this.field6719.method1710((byte) 62);
        this.field6719.method1709((byte) -62, this.field6722);
        if (this.field6721 || arg4) {
            this.field6719.method1701(7681, 1, 8448);
            this.field6719.method1755(34168, 34176, 768, 0);
        } else {
            this.field6719.method1701(7681, 1, 7681);
        }
        this.field6719.method1745(true, 1);
        this.field6719.method1709((byte) -58, var10);
        this.field6719.method1701(7681, 1, 8448);
        this.field6719.method1755(34168, 34176, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7159 / (float) var10.field7156;
        float var12 = var10.field7154 / (float) var10.field7160;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6720.method3678(arg0, 83);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6719.method1755(5890, 34176, 768, 0);
        this.field6719.method1701(8448, 1, 8448);
        this.field6719.method1709((byte) -114, null);
        this.field6719.method1745(true, 0);
        if (this.field6721 || arg4) {
            this.field6719.method1755(5890, 34176, 768, 0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Luca;Lfo;[Lut;Z)V", line = 52)
    public class467(class287 arg0, class606 arg1, class616[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6719 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class616 var54 = arg2[var6];
            if (var54.field8868 > var5) {
                var5 = var54.field8868;
            }
            if (var54.field8869 > var5) {
                var5 = var54.field8869;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class616 var10 = arg2[var9];
                int var11 = var10.field8868;
                int var12 = var10.field8869;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8875 == null) {
                    byte[] var17 = var10.field8871;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8875;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6722 = class134.method952(false, true, 6406, 6406, var7, var7, arg0, var8);
            this.field6721 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class616 var39 = arg2[var24];
                int[] var40 = var39.field8873;
                byte[] var41 = var39.field8875;
                byte[] var42 = var39.field8871;
                int var43 = var39.field8868;
                int var44 = var39.field8869;
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
            this.field6722 = class431.method2573(0, var23, var7, var7, 0, false, arg0, (byte) -81);
            this.field6721 = false;
        }
        this.field6722.method2924(false, -75);
        this.field6720 = new class646(arg0, 256);
        float var25 = this.field6722.field7159 / (float) this.field6722.field7156;
        float var26 = this.field6722.field7154 / (float) this.field6722.field7160;
        for (int var27 = 0; var27 < 256; var27++) {
            class616 var28 = arg2[var27];
            int var29 = var28.field8868;
            int var30 = var28.field8869;
            int var31 = var28.field8874;
            int var32 = var28.field8870;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6720.method3680(var27, (byte) -126);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6722.field7154 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6722.field7154 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6722.field7154 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6722.field7154 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6720.method3679(-103);
        }
    }

    @OriginalMember(owner = "client!wt", name = "OA", descriptor = "(CIIIZ)V", line = 289)
    public final void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6719.method1710((byte) 46);
        this.field6719.method1709((byte) -105, this.field6722);
        if (this.field6721 || arg4) {
            this.field6719.method1701(7681, 1, 8448);
            this.field6719.method1755(34168, 34176, 768, 0);
        } else {
            this.field6719.method1701(7681, 1, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6720.method3678(arg0, 90);
        OpenGL.glLoadIdentity();
        if (this.field6721 || arg4) {
            this.field6719.method1755(5890, 34176, 768, 0);
        }
    }
}
