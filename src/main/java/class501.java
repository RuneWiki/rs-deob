import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class501 extends class316 {

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "Lur;")
    private class377 field7304;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Lal;")
    private class67 field7305;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "Z")
    private boolean field7306;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "Lpb;")
    private class468 field7303;

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lur;Lgf;[Lev;Z)V", line = 3)
    public class501(class377 arg0, class183 arg1, class491[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7304 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class491 var50 = arg2[var6];
            if (var50.field7191 > var5) {
                var5 = var50.field7191;
            }
            if (var50.field7196 > var5) {
                var5 = var50.field7196;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class491 var10 = arg2[var9];
                byte[] var11 = var10.field7192;
                int var12 = var10.field7191;
                int var13 = var10.field7196;
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
            this.field7305 = class384.method2336(var7, 6406, var7, false, 6406, arg0, var8, 44);
            this.field7306 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class491 var36 = arg2[var21];
                int[] var37 = var36.field7197;
                byte[] var38 = var36.field7198;
                byte[] var39 = var36.field7192;
                int var40 = var36.field7191;
                int var41 = var36.field7196;
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
            this.field7305 = class380.method2318(var20, arg0, var7, var7, false, 3553);
            this.field7306 = false;
        }
        this.field7305.method1555((byte) 113, false);
        this.field7303 = new class468(arg0, 256);
        float var22 = this.field7305.field770 / (float) this.field7305.field765;
        float var23 = this.field7305.field769 / (float) this.field7305.field766;
        for (int var24 = 0; var24 < 256; var24++) {
            class491 var25 = arg2[var24];
            int var26 = var25.field7191;
            int var27 = var25.field7196;
            int var28 = var25.field7199;
            int var29 = var25.field7195;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field7303.method2854(-110, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field7305.field769 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field7305.field769 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7305.field769 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7305.field769 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field7303.method2855(22228);
        }
    }

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "(CIIIZ)V", line = 210)
    public final void method423(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7304.method2285((byte) 70);
        this.field7304.method2236(this.field7305, -100);
        if (this.field7306 || arg4) {
            this.field7304.method2269(7681, 8960, 8448);
            this.field7304.method2229(34168, (byte) -18, 0, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7303.method2856(arg0, 1);
        OpenGL.glLoadIdentity();
        if (this.field7306 || arg4) {
            this.field7304.method2229(5890, (byte) -18, 0, 768);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(CIIIZLta;II)V", line = 230)
    public final void method422(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7) {
        class357 var9 = (class357) arg5;
        class67 var10 = var9.field4863;
        this.field7304.method2285((byte) 78);
        this.field7304.method2236(this.field7305, -122);
        if (this.field7306 || arg4) {
            this.field7304.method2269(7681, 8960, 8448);
            this.field7304.method2229(34168, (byte) -18, 0, 768);
        }
        this.field7304.method2250((byte) 93, 1);
        this.field7304.method2236(var10, -58);
        this.field7304.method2269(7681, 8960, 8448);
        this.field7304.method2229(34168, (byte) -18, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field770 / (float) var10.field765;
        float var12 = var10.field769 / (float) var10.field766;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7303.method2856(arg0, 1);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field7304.method2229(5890, (byte) -18, 0, 768);
        this.field7304.method2269(8448, 8960, 8448);
        this.field7304.method2236(null, 94);
        this.field7304.method2250((byte) 89, 0);
        if (this.field7306 || arg4) {
            this.field7304.method2229(5890, (byte) -18, 0, 768);
        }
    }
}
