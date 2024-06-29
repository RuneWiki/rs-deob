import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class241 extends class409 {

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Lag;")
    private class469 field3182;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Lck;")
    private class8 field3180;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "Z")
    private boolean field3181;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Lcl;")
    private class75 field3183;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CIIIZLua;II)V", line = 4)
    public final void method756(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
        class516 var9 = (class516) arg5;
        class8 var10 = var9.field7173;
        this.field3182.method2692(29527);
        this.field3182.method2627(120, this.field3180);
        if (this.field3181 || arg4) {
            this.field3182.method2669(8448, -114, 7681);
            this.field3182.method2636(0, 768, 34168, -89);
        } else {
            this.field3182.method2669(7681, -121, 7681);
        }
        this.field3182.method2625(20296, 1);
        this.field3182.method2627(117, var10);
        this.field3182.method2669(8448, -111, 7681);
        this.field3182.method2636(0, 768, 34168, -127);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field75 / (float) var10.field74;
        float var12 = var10.field73 / (float) var10.field71;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3183.method412(arg0, -114);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3182.method2636(0, 768, 5890, -127);
        this.field3182.method2669(8448, 39, 8448);
        this.field3182.method2627(36, null);
        this.field3182.method2625(20296, 0);
        if (this.field3181 || arg4) {
            this.field3182.method2636(0, 768, 5890, -112);
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lag;Laga;[Ltq;Z)V", line = 49)
    public class241(class469 arg0, class658 arg1, class92[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3182 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class92 var54 = arg2[var6];
            if (var54.field1128 > var5) {
                var5 = var54.field1128;
            }
            if (var54.field1132 > var5) {
                var5 = var54.field1132;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class92 var10 = arg2[var9];
                int var11 = var10.field1128;
                int var12 = var10.field1132;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1129 == null) {
                    byte[] var17 = var10.field1130;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1129;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3180 = class367.method2129(false, var8, var7, (byte) 112, var7, 6406, arg0, 6406);
            this.field3181 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class92 var39 = arg2[var24];
                int[] var40 = var39.field1127;
                byte[] var41 = var39.field1129;
                byte[] var42 = var39.field1130;
                int var43 = var39.field1128;
                int var44 = var39.field1132;
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
            this.field3180 = class546.method3058(var7, arg0, false, 69, var7, var23);
            this.field3181 = false;
        }
        this.field3180.method1582(124, false);
        this.field3183 = new class75(arg0, 256);
        float var25 = this.field3180.field75 / (float) this.field3180.field74;
        float var26 = this.field3180.field73 / (float) this.field3180.field71;
        for (int var27 = 0; var27 < 256; var27++) {
            class92 var28 = arg2[var27];
            int var29 = var28.field1128;
            int var30 = var28.field1132;
            int var31 = var28.field1126;
            int var32 = var28.field1125;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3183.method414((byte) 126, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3180.field73 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3180.field73 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3180.field73 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3180.field73 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3183.method415(false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "OA", descriptor = "(CIIIZ)V", line = 288)
    public final void method754(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3182.method2692(29527);
        this.field3182.method2627(124, this.field3180);
        if (this.field3181 || arg4) {
            this.field3182.method2669(8448, 51, 7681);
            this.field3182.method2636(0, 768, 34168, -97);
        } else {
            this.field3182.method2669(7681, -104, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3183.method412(arg0, -84);
        OpenGL.glLoadIdentity();
        if (this.field3181 || arg4) {
            this.field3182.method2636(0, 768, 5890, -90);
        }
    }
}
