import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class485 extends class413 {

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lqj;")
    private class548 field6438;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Lar;")
    private class4 field6439;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Z")
    private boolean field6437;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lfb;")
    private class52 field6436;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method634(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7) {
        class268 var9 = (class268) arg5;
        class4 var10 = var9.field3385;
        this.field6438.method2995((byte) -107);
        this.field6438.method2960(this.field6439, -2);
        if (this.field6437 || arg4) {
            this.field6438.method2983(7681, -465309136, 8448);
            this.field6438.method2966(0, 768, 768, 34168);
        } else {
            this.field6438.method2983(7681, -465309136, 7681);
        }
        this.field6438.method3027(1, true);
        this.field6438.method2960(var10, -2);
        this.field6438.method2983(7681, -465309136, 8448);
        this.field6438.method2966(0, 768, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field111 / (float) var10.field116;
        float var12 = var10.field109 / (float) var10.field110;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6436.method333(-29240, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6438.method2966(0, 768, 768, 5890);
        this.field6438.method2983(8448, -465309136, 8448);
        this.field6438.method2960(null, -2);
        this.field6438.method3027(0, true);
        if (this.field6437 || arg4) {
            this.field6438.method2966(0, 768, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lqj;Lsa;[Laga;Z)V")
    public class485(class548 arg0, class595 arg1, class661[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6438 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class661 var54 = arg2[var6];
            if (var54.field9353 > var5) {
                var5 = var54.field9353;
            }
            if (var54.field9351 > var5) {
                var5 = var54.field9351;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class661 var10 = arg2[var9];
                int var11 = var10.field9353;
                int var12 = var10.field9351;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field9355 == null) {
                    byte[] var17 = var10.field9352;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field9355;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6439 = class581.method3206(var7, false, arg0, 124, var8, var7, 6406, 6406);
            this.field6437 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class661 var39 = arg2[var24];
                int[] var40 = var39.field9358;
                byte[] var41 = var39.field9355;
                byte[] var42 = var39.field9352;
                int var43 = var39.field9353;
                int var44 = var39.field9351;
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
            this.field6439 = class139.method805(26871, var7, arg0, false, var7, var23);
            this.field6437 = false;
        }
        this.field6439.method3396(false, 17137);
        this.field6436 = new class52(arg0, 256);
        float var25 = this.field6439.field111 / (float) this.field6439.field116;
        float var26 = this.field6439.field109 / (float) this.field6439.field110;
        for (int var27 = 0; var27 < 256; var27++) {
            class661 var28 = arg2[var27];
            int var29 = var28.field9353;
            int var30 = var28.field9351;
            int var31 = var28.field9356;
            int var32 = var28.field9354;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6436.method331(var27, 0);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6439.field109 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6439.field109 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6439.field109 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6439.field109 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6436.method332((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ph", name = "OA", descriptor = "(CIIIZ)V")
    public final void method633(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6438.method2995((byte) -123);
        this.field6438.method2960(this.field6439, -2);
        if (this.field6437 || arg4) {
            this.field6438.method2983(7681, -465309136, 8448);
            this.field6438.method2966(0, 768, 768, 34168);
        } else {
            this.field6438.method2983(7681, -465309136, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6436.method333(-29240, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6437 || arg4) {
            this.field6438.method2966(0, 768, 768, 5890);
        }
    }
}
