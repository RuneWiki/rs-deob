import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class523 extends class597 {

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "Lji;")
    private class622 field6818;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "Lch;")
    private class219 field6817;

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "Z")
    private boolean field6819;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "Luj;")
    private class554 field6816;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(CIIIZLfa;II)V", line = 8)
    public final void method1189(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7) {
        class273 var9 = (class273) arg5;
        class219 var10 = var9.field3598;
        this.field6818.method3446((byte) -126);
        this.field6818.method3388(this.field6817, false);
        if (this.field6819 || arg4) {
            this.field6818.method3462(8448, -5882, 7681);
            this.field6818.method3453(false, 768, 34168, 0);
        } else {
            this.field6818.method3462(7681, -5882, 7681);
        }
        this.field6818.method3469(1, false);
        this.field6818.method3388(var10, false);
        this.field6818.method3462(8448, -5882, 7681);
        this.field6818.method3453(false, 768, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2874 / (float) var10.field2877;
        float var12 = var10.field2872 / (float) var10.field2871;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6816.method2973(26497, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6818.method3453(false, 768, 5890, 0);
        this.field6818.method3462(8448, -5882, 8448);
        this.field6818.method3388(null, false);
        this.field6818.method3469(0, false);
        if (this.field6819 || arg4) {
            this.field6818.method3453(false, 768, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lji;Lsga;[Law;Z)V", line = 52)
    public class523(class622 arg0, class547 arg1, class506[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6818 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class506 var54 = arg2[var6];
            if (var54.field6650 > var5) {
                var5 = var54.field6650;
            }
            if (var54.field6651 > var5) {
                var5 = var54.field6651;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class506 var10 = arg2[var9];
                int var11 = var10.field6650;
                int var12 = var10.field6651;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field6649 == null) {
                    byte[] var17 = var10.field6647;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field6649;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6817 = class521.method2798(6406, arg0, -13842, var8, false, var7, 6406, var7);
            this.field6819 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class506 var39 = arg2[var24];
                int[] var40 = var39.field6648;
                byte[] var41 = var39.field6649;
                byte[] var42 = var39.field6647;
                int var43 = var39.field6650;
                int var44 = var39.field6651;
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
            this.field6817 = class43.method375(var23, arg0, var7, 34037, var7, false);
            this.field6819 = false;
        }
        this.field6817.method3905(false, true);
        this.field6816 = new class554(arg0, 256);
        float var25 = this.field6817.field2874 / (float) this.field6817.field2877;
        float var26 = this.field6817.field2872 / (float) this.field6817.field2871;
        for (int var27 = 0; var27 < 256; var27++) {
            class506 var28 = arg2[var27];
            int var29 = var28.field6650;
            int var30 = var28.field6651;
            int var31 = var28.field6652;
            int var32 = var28.field6646;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6816.method2971(var27, 4864);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6817.field2872 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6817.field2872 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6817.field2872 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6817.field2872 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6816.method2969((byte) -63);
        }
    }

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "(CIIIZ)V", line = 289)
    public final void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6818.method3446((byte) -126);
        this.field6818.method3388(this.field6817, false);
        if (this.field6819 || arg4) {
            this.field6818.method3462(8448, -5882, 7681);
            this.field6818.method3453(false, 768, 34168, 0);
        } else {
            this.field6818.method3462(7681, -5882, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6816.method2973(26497, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6819 || arg4) {
            this.field6818.method3453(false, 768, 5890, 0);
        }
    }
}
