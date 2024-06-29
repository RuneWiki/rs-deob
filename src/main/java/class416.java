import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class416 extends class33 {

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lbv;")
    private class282 field6227;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Log;")
    private class346 field6228;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
    private boolean field6230;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Lgs;")
    private class288 field6229;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lbv;Lse;[Lrl;Z)V")
    public class416(class282 arg0, class4 arg1, class476[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6227 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class476 var50 = arg2[var6];
            if (var50.field6928 > var5) {
                var5 = var50.field6928;
            }
            if (var50.field6933 > var5) {
                var5 = var50.field6933;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class476 var10 = arg2[var9];
                byte[] var11 = var10.field6927;
                int var12 = var10.field6928;
                int var13 = var10.field6933;
                int var14 = var9 % 16 * var5;
                int var15 = var9 / 16 * var5;
                int var16 = var7 * var15 + var14;
                int var17 = 0;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        var8[var16++] = (byte) (var11[var17++] == 0 ? 0 : -1);
                    }
                    var16 += var7 - var13;
                }
            }
            this.field6228 = class215.method1466(6406, false, var7, var8, var7, 6406, arg0, 23409);
            this.field6230 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class476 var36 = arg2[var21];
                int[] var37 = var36.field6929;
                byte[] var38 = var36.field6925;
                byte[] var39 = var36.field6927;
                int var40 = var36.field6928;
                int var41 = var36.field6933;
                int var42 = var21 % 16 * var5;
                int var43 = var21 / 16 * var5;
                int var44 = var7 * var43 + var42;
                int var45 = 0;
                if (var38 == null) {
                    for (int var48 = 0; var48 < var40; var48++) {
                        for (int var49 = 0; var49 < var41; var49++) {
                            var20[var44++] = var37[var39[var45++] & 0xFF] | 0xFF000000;
                        }
                        var44 += var7 - var41;
                    }
                } else {
                    for (int var46 = 0; var46 < var40; var46++) {
                        for (int var47 = 0; var47 < var41; var47++) {
                            var20[var44++] = var38[var45] << 24 | var37[var39[var45] & 0xFF];
                            var45++;
                        }
                        var44 += var7 - var41;
                    }
                }
            }
            this.field6228 = class115.method746(3553, var7, var20, arg0, var7, false);
            this.field6230 = false;
        }
        this.field6228.method123(false, false);
        this.field6229 = new class288(arg0, 256);
        float var22 = this.field6228.field5417 / (float) this.field6228.field5415;
        float var23 = this.field6228.field5412 / (float) this.field6228.field5411;
        for (int var24 = 0; var24 < 256; var24++) {
            class476 var25 = arg2[var24];
            int var26 = var25.field6928;
            int var27 = var25.field6933;
            int var28 = var25.field6926;
            int var29 = var25.field6931;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field6229.method1864((byte) 125, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field6228.field5412 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field6228.field5412 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field6228.field5412 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field6228.field5412 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field6229.method1865(-69);
        }
    }

    @OriginalMember(owner = "client!he", name = "B", descriptor = "(CIIIZ)V")
    public final void method249(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6227.method1781(false);
        this.field6227.method1787(this.field6228, (byte) 121);
        if (this.field6230 || arg4) {
            this.field6227.method1776(-30, 8448, 7681);
            this.field6227.method1828(34168, 768, 0, (byte) -89);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6229.method1866(13, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6230 || arg4) {
            this.field6227.method1828(5890, 768, 0, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method243(char arg0, int arg1, int arg2, int arg3, boolean arg4, class15 arg5, int arg6, int arg7) {
        class277 var9 = (class277) arg5;
        class346 var10 = var9.field3841;
        this.field6227.method1781(false);
        this.field6227.method1787(this.field6228, (byte) 121);
        if (this.field6230 || arg4) {
            this.field6227.method1776(-30, 8448, 7681);
            this.field6227.method1828(34168, 768, 0, (byte) -95);
        }
        this.field6227.method1819(1, (byte) 100);
        this.field6227.method1787(var10, (byte) 121);
        this.field6227.method1776(-30, 8448, 7681);
        this.field6227.method1828(34168, 768, 0, (byte) -92);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field5417 / (float) var10.field5415;
        float var12 = var10.field5412 / (float) var10.field5411;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6229.method1866(13, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6227.method1828(5890, 768, 0, (byte) -77);
        this.field6227.method1776(-30, 8448, 8448);
        this.field6227.method1787(null, (byte) 121);
        this.field6227.method1819(0, (byte) 106);
        if (this.field6230 || arg4) {
            this.field6227.method1828(5890, 768, 0, (byte) -113);
        }
    }
}
