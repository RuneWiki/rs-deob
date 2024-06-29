import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class224 extends class489 {

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lvj;")
    private class303 field3198;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lmk;")
    private class39 field3199;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Z")
    private boolean field3200;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lsc;")
    private class229 field3197;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "(CIIIZ)V")
    public final void method1277(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3198.method1985(-118);
        this.field3198.method1990(this.field3199, 11864);
        if (this.field3200 || arg4) {
            this.field3198.method1951((byte) -26, 7681, 8448);
            this.field3198.method1921(768, 34168, (byte) -118, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3197.method1494(arg0, false);
        OpenGL.glLoadIdentity();
        if (this.field3200 || arg4) {
            this.field3198.method1921(768, 5890, (byte) 99, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lvj;Leu;[Lwe;Z)V")
    public class224(class303 arg0, class332 arg1, class279[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3198 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class279 var50 = arg2[var6];
            if (var50.field4003 > var5) {
                var5 = var50.field4003;
            }
            if (var50.field4005 > var5) {
                var5 = var50.field4005;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class279 var10 = arg2[var9];
                byte[] var11 = var10.field4006;
                int var12 = var10.field4003;
                int var13 = var10.field4005;
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
            this.field3199 = class104.method789(arg0, (byte) 82, false, var8, 6406, 6406, var7, var7);
            this.field3200 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class279 var36 = arg2[var21];
                int[] var37 = var36.field4011;
                byte[] var38 = var36.field4004;
                byte[] var39 = var36.field4006;
                int var40 = var36.field4003;
                int var41 = var36.field4005;
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
            this.field3199 = class245.method1595(var7, arg0, var7, false, var20, 0);
            this.field3200 = false;
        }
        this.field3199.method2929((byte) -97, false);
        this.field3197 = new class229(arg0, 256);
        float var22 = this.field3199.field718 / (float) this.field3199.field723;
        float var23 = this.field3199.field722 / (float) this.field3199.field720;
        for (int var24 = 0; var24 < 256; var24++) {
            class279 var25 = arg2[var24];
            int var26 = var25.field4003;
            int var27 = var25.field4005;
            int var28 = var25.field4008;
            int var29 = var25.field4007;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field3197.method1495(var24, (byte) -115);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field3199.field722 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field3199.field722 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3199.field722 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3199.field722 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field3197.method1493((byte) -121);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7) {
        class363 var9 = (class363) arg5;
        class39 var10 = var9.field5496;
        this.field3198.method1985(-125);
        this.field3198.method1990(this.field3199, 11864);
        if (this.field3200 || arg4) {
            this.field3198.method1951((byte) -94, 7681, 8448);
            this.field3198.method1921(768, 34168, (byte) 84, 0);
        }
        this.field3198.method1929(1, (byte) 77);
        this.field3198.method1990(var10, 11864);
        this.field3198.method1951((byte) 124, 7681, 8448);
        this.field3198.method1921(768, 34168, (byte) 40, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field718 / (float) var10.field723;
        float var12 = var10.field722 / (float) var10.field720;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3197.method1494(arg0, false);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3198.method1921(768, 5890, (byte) 20, 0);
        this.field3198.method1951((byte) -16, 8448, 8448);
        this.field3198.method1990(null, 11864);
        this.field3198.method1929(0, (byte) 108);
        if (this.field3200 || arg4) {
            this.field3198.method1921(768, 5890, (byte) 39, 0);
        }
    }
}
