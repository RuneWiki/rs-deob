import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class600 extends class59 {

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Loea;")
    private class594 field8720;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Lm;")
    private class189 field8721;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Z")
    private boolean field8722;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Leha;")
    private class89 field8719;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Loea;Lfp;[Lfw;Z)V", line = 4)
    public class600(class594 arg0, class323 arg1, class55[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8720 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class55 var54 = arg2[var6];
            if (var54.field1038 > var5) {
                var5 = var54.field1038;
            }
            if (var54.field1044 > var5) {
                var5 = var54.field1044;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class55 var10 = arg2[var9];
                int var11 = var10.field1038;
                int var12 = var10.field1044;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1040 == null) {
                    byte[] var17 = var10.field1041;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1040;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8721 = class41.method379(6406, 6406, var8, var7, var7, arg0, false, 3553);
            this.field8722 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class55 var39 = arg2[var24];
                int[] var40 = var39.field1039;
                byte[] var41 = var39.field1040;
                byte[] var42 = var39.field1041;
                int var43 = var39.field1038;
                int var44 = var39.field1044;
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
            this.field8721 = class13.method72(var7, var23, false, false, 0, var7, 0, arg0);
            this.field8722 = false;
        }
        this.field8721.method818(false, (byte) 11);
        this.field8719 = new class89(arg0, 256);
        float var25 = this.field8721.field2722 / (float) this.field8721.field2720;
        float var26 = this.field8721.field2719 / (float) this.field8721.field2725;
        for (int var27 = 0; var27 < 256; var27++) {
            class55 var28 = arg2[var27];
            int var29 = var28.field1038;
            int var30 = var28.field1044;
            int var31 = var28.field1036;
            int var32 = var28.field1042;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8719.method836(4864, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8721.field2719 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8721.field2719 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8721.field2719 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8721.field2719 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8719.method832(99);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(CIIIZLaa;II)V", line = 241)
    public final void method106(char arg0, int arg1, int arg2, int arg3, boolean arg4, class484 arg5, int arg6, int arg7) {
        class277 var9 = (class277) arg5;
        class189 var10 = var9.field3912;
        this.field8720.method3430((byte) 114);
        this.field8720.method3425(this.field8721, 116);
        if (this.field8722 || arg4) {
            this.field8720.method3485(7681, (byte) 81, 8448);
            this.field8720.method3464(0, 768, false, 34168);
        } else {
            this.field8720.method3485(7681, (byte) 110, 7681);
        }
        this.field8720.method3413(1, 33984);
        this.field8720.method3425(var10, 121);
        this.field8720.method3485(7681, (byte) 45, 8448);
        this.field8720.method3464(0, 768, false, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2722 / (float) var10.field2720;
        float var12 = var10.field2719 / (float) var10.field2725;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8719.method834((byte) 105, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8720.method3464(0, 768, false, 5890);
        this.field8720.method3485(8448, (byte) 127, 8448);
        this.field8720.method3425(null, -86);
        this.field8720.method3413(0, 33984);
        if (this.field8722 || arg4) {
            this.field8720.method3464(0, 768, false, 5890);
        }
    }

    @OriginalMember(owner = "client!qs", name = "fa", descriptor = "(CIIIZ)V", line = 288)
    public final void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8720.method3430((byte) 115);
        this.field8720.method3425(this.field8721, -122);
        if (this.field8722 || arg4) {
            this.field8720.method3485(7681, (byte) 44, 8448);
            this.field8720.method3464(0, 768, false, 34168);
        } else {
            this.field8720.method3485(7681, (byte) 44, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8719.method834((byte) 105, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8722 || arg4) {
            this.field8720.method3464(0, 768, false, 5890);
        }
    }
}
