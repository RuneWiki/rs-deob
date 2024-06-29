import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class69 extends class413 {

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Lvj;")
    private class422 field691;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Lbr;")
    private class196 field689;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Z")
    private boolean field692;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Leaa;")
    private class43 field690;

    @OriginalMember(owner = "client!il", name = "OA", descriptor = "(CIIIZ)V")
    public final void method300(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field691.method2369((byte) -41);
        this.field691.method2396((byte) 36, this.field689);
        if (this.field692 || arg4) {
            this.field691.method2412((byte) -49, 7681, 8448);
            this.field691.method2428(768, 34168, 0, -4);
        } else {
            this.field691.method2412((byte) -49, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field690.method222(arg0, (byte) -116);
        OpenGL.glLoadIdentity();
        if (this.field692 || arg4) {
            this.field691.method2428(768, 5890, 0, -4);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lvj;Lho;[Lqo;Z)V")
    public class69(class422 arg0, class463 arg1, class550[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field691 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class550 var54 = arg2[var6];
            if (var54.field7872 > var5) {
                var5 = var54.field7872;
            }
            if (var54.field7873 > var5) {
                var5 = var54.field7873;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class550 var10 = arg2[var9];
                int var11 = var10.field7872;
                int var12 = var10.field7873;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field7868 == null) {
                    byte[] var17 = var10.field7869;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field7868;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field689 = class254.method1503(6406, var8, false, -36, var7, var7, arg0, 6406);
            this.field692 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class550 var39 = arg2[var24];
                int[] var40 = var39.field7871;
                byte[] var41 = var39.field7868;
                byte[] var42 = var39.field7869;
                int var43 = var39.field7872;
                int var44 = var39.field7873;
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
            this.field689 = class530.method2976(var7, var7, arg0, true, var23, false);
            this.field692 = false;
        }
        this.field689.method1839(false, (byte) 47);
        this.field690 = new class43(arg0, 256);
        float var25 = this.field689.field2266 / (float) this.field689.field2262;
        float var26 = this.field689.field2267 / (float) this.field689.field2261;
        for (int var27 = 0; var27 < 256; var27++) {
            class550 var28 = arg2[var27];
            int var29 = var28.field7872;
            int var30 = var28.field7873;
            int var31 = var28.field7867;
            int var32 = var28.field7870;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field690.method219(24427, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field689.field2267 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field689.field2267 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field689.field2267 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field689.field2267 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field690.method223(1);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class598 arg5, int arg6, int arg7) {
        class417 var9 = (class417) arg5;
        class196 var10 = var9.field5585;
        this.field691.method2369((byte) -47);
        this.field691.method2396((byte) 36, this.field689);
        if (this.field692 || arg4) {
            this.field691.method2412((byte) -49, 7681, 8448);
            this.field691.method2428(768, 34168, 0, -4);
        } else {
            this.field691.method2412((byte) -49, 7681, 7681);
        }
        this.field691.method2431((byte) -92, 1);
        this.field691.method2396((byte) 36, var10);
        this.field691.method2412((byte) -49, 7681, 8448);
        this.field691.method2428(768, 34168, 0, -4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2266 / (float) var10.field2262;
        float var12 = var10.field2267 / (float) var10.field2261;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field690.method222(arg0, (byte) -110);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field691.method2428(768, 5890, 0, -4);
        this.field691.method2412((byte) -49, 8448, 8448);
        this.field691.method2396((byte) 36, null);
        this.field691.method2431((byte) -120, 0);
        if (this.field692 || arg4) {
            this.field691.method2428(768, 5890, 0, -4);
        }
    }
}
