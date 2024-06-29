import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class266 extends class310 {

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "Ltt;")
    private class249 field4239;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Lf;")
    private class412 field4240;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "Z")
    private boolean field4241;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "Lgw;")
    private class108 field4242;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "(CIIIZ)V")
    public final void method1441(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4239.method1720(-79);
        this.field4239.method1749(25752, this.field4240);
        if (this.field4241 || arg4) {
            this.field4239.method1741(7681, (byte) 121, 8448);
            this.field4239.method1780(768, 34168, 34176, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4242.method850(false, arg0);
        OpenGL.glLoadIdentity();
        if (this.field4241 || arg4) {
            this.field4239.method1780(768, 5890, 34176, 0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method1443(char arg0, int arg1, int arg2, int arg3, boolean arg4, class340 arg5, int arg6, int arg7) {
        class415 var9 = (class415) arg5;
        class412 var10 = var9.field6106;
        this.field4239.method1720(-32);
        this.field4239.method1749(25752, this.field4240);
        if (this.field4241 || arg4) {
            this.field4239.method1741(7681, (byte) -59, 8448);
            this.field4239.method1780(768, 34168, 34176, 0);
        }
        this.field4239.method1756(1, 123);
        this.field4239.method1749(25752, var10);
        this.field4239.method1741(7681, (byte) 106, 8448);
        this.field4239.method1780(768, 34168, 34176, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6080 / (float) var10.field6076;
        float var12 = var10.field6075 / (float) var10.field6077;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4242.method850(false, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4239.method1780(768, 5890, 34176, 0);
        this.field4239.method1741(8448, (byte) -99, 8448);
        this.field4239.method1749(25752, null);
        this.field4239.method1756(0, 122);
        if (this.field4241 || arg4) {
            this.field4239.method1780(768, 5890, 34176, 0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ltt;Lap;[Lrr;Z)V")
    public class266(class249 arg0, class29 arg1, class309[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4239 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class309 var50 = arg2[var6];
            if (var50.field4717 > var5) {
                var5 = var50.field4717;
            }
            if (var50.field4713 > var5) {
                var5 = var50.field4713;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class309 var10 = arg2[var9];
                byte[] var11 = var10.field4711;
                int var12 = var10.field4717;
                int var13 = var10.field4713;
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
            this.field4240 = class447.method2751(6406, arg0, (byte) 79, var7, var8, false, var7, 6406);
            this.field4241 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class309 var36 = arg2[var21];
                int[] var37 = var36.field4709;
                byte[] var38 = var36.field4715;
                byte[] var39 = var36.field4711;
                int var40 = var36.field4717;
                int var41 = var36.field4713;
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
            this.field4240 = class98.method813(var7, (byte) -52, arg0, var7, var20, false);
            this.field4241 = false;
        }
        this.field4240.method1210((byte) -81, false);
        this.field4242 = new class108(arg0, 256);
        float var22 = this.field4240.field6080 / (float) this.field4240.field6076;
        float var23 = this.field4240.field6075 / (float) this.field4240.field6077;
        for (int var24 = 0; var24 < 256; var24++) {
            class309 var25 = arg2[var24];
            int var26 = var25.field4717;
            int var27 = var25.field4713;
            int var28 = var25.field4712;
            int var29 = var25.field4716;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field4242.method848(var24, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field4240.field6075 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field4240.field6075 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4240.field6075 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4240.field6075 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field4242.method851(75);
        }
    }
}
