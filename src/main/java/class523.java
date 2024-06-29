import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class523 extends class200 {

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "Lno;")
    private class658 field6982;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "Lmn;")
    private class340 field6981;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "Z")
    private boolean field6980;

    @OriginalMember(owner = "client!nda", name = "A", descriptor = "Lu;")
    private class68 field6983;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(CIIIZLfa;II)V", line = 6)
    public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7) {
        class311 var9 = (class311) arg5;
        class340 var10 = var9.field4283;
        this.field6982.method3623(true);
        this.field6982.method3630(this.field6981, -2);
        if (this.field6980 || arg4) {
            this.field6982.method3644(8448, 23560, 7681);
            this.field6982.method3609((byte) 27, 768, 0, 34168);
        } else {
            this.field6982.method3644(7681, 23560, 7681);
        }
        this.field6982.method3629((byte) -99, 1);
        this.field6982.method3630(var10, -2);
        this.field6982.method3644(8448, 23560, 7681);
        this.field6982.method3609((byte) 27, 768, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4695 / (float) var10.field4693;
        float var12 = var10.field4701 / (float) var10.field4698;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6983.method536((byte) 114, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6982.method3609((byte) 27, 768, 0, 5890);
        this.field6982.method3644(8448, 23560, 8448);
        this.field6982.method3630(null, -2);
        this.field6982.method3629((byte) 122, 0);
        if (this.field6980 || arg4) {
            this.field6982.method3609((byte) 27, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lno;Lkga;[Lpga;Z)V", line = 50)
    public class523(class658 arg0, class511 arg1, class500[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6982 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class500 var54 = arg2[var6];
            if (var54.field6700 > var5) {
                var5 = var54.field6700;
            }
            if (var54.field6698 > var5) {
                var5 = var54.field6698;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class500 var10 = arg2[var9];
                int var11 = var10.field6700;
                int var12 = var10.field6698;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field6696 == null) {
                    byte[] var17 = var10.field6697;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field6696;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6981 = class595.method3281((byte) 82, 6406, 6406, var7, false, var7, arg0, var8);
            this.field6980 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class500 var39 = arg2[var24];
                int[] var40 = var39.field6702;
                byte[] var41 = var39.field6696;
                byte[] var42 = var39.field6697;
                int var43 = var39.field6700;
                int var44 = var39.field6698;
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
            this.field6981 = class371.method2188(var7, var7, false, (byte) 116, arg0, var23);
            this.field6980 = false;
        }
        this.field6981.method2163(-30033, false);
        this.field6983 = new class68(arg0, 256);
        float var25 = this.field6981.field4695 / (float) this.field6981.field4693;
        float var26 = this.field6981.field4701 / (float) this.field6981.field4698;
        for (int var27 = 0; var27 < 256; var27++) {
            class500 var28 = arg2[var27];
            int var29 = var28.field6700;
            int var30 = var28.field6698;
            int var31 = var28.field6699;
            int var32 = var28.field6695;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6983.method537(var27, (byte) 3);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6981.field4701 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6981.field4701 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6981.field4701 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6981.field4701 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6983.method539(true);
        }
    }

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "(CIIIZ)V", line = 288)
    public final void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6982.method3623(true);
        this.field6982.method3630(this.field6981, -2);
        if (this.field6980 || arg4) {
            this.field6982.method3644(8448, 23560, 7681);
            this.field6982.method3609((byte) 27, 768, 0, 34168);
        } else {
            this.field6982.method3644(7681, 23560, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6983.method536((byte) 119, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6980 || arg4) {
            this.field6982.method3609((byte) 27, 768, 0, 5890);
        }
    }
}
