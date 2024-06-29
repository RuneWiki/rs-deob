import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class43 extends class299 {

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Lna;")
    private class211 field467;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Lme;")
    private class508 field468;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "Z")
    private boolean field466;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "Lkp;")
    private class292 field465;

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lna;Laq;[Lok;Z)V")
    public class43(class211 arg0, class340 arg1, class175[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field467 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class175 var50 = arg2[var6];
            if (var50.field2577 > var5) {
                var5 = var50.field2577;
            }
            if (var50.field2576 > var5) {
                var5 = var50.field2576;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class175 var10 = arg2[var9];
                byte[] var11 = var10.field2574;
                int var12 = var10.field2577;
                int var13 = var10.field2576;
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
            this.field468 = class502.method3056(false, arg0, 6406, 6406, var8, var7, var7, (byte) -126);
            this.field466 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class175 var36 = arg2[var21];
                int[] var37 = var36.field2571;
                byte[] var38 = var36.field2572;
                byte[] var39 = var36.field2574;
                int var40 = var36.field2577;
                int var41 = var36.field2576;
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
            this.field468 = class531.method3153((byte) -95, arg0, var7, false, var20, var7);
            this.field466 = false;
        }
        this.field468.method2703(0, false);
        this.field465 = new class292(arg0, 256);
        float var22 = this.field468.field7578 / (float) this.field468.field7575;
        float var23 = this.field468.field7580 / (float) this.field468.field7581;
        for (int var24 = 0; var24 < 256; var24++) {
            class175 var25 = arg2[var24];
            int var26 = var25.field2577;
            int var27 = var25.field2576;
            int var28 = var25.field2579;
            int var29 = var25.field2575;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field465.method1965(var24, (byte) -34);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field468.field7580 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field468.field7580 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field468.field7580 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field468.field7580 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field465.method1962(-6635);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method70(char arg0, int arg1, int arg2, int arg3, boolean arg4, class453 arg5, int arg6, int arg7) {
        class387 var9 = (class387) arg5;
        class508 var10 = var9.field5904;
        this.field467.method1521((byte) -5);
        this.field467.method1540(76, this.field468);
        if (this.field466 || arg4) {
            this.field467.method1568(8448, 2896, 7681);
            this.field467.method1498(34192, 0, 34168, 768);
        }
        this.field467.method1507(1, 0);
        this.field467.method1540(78, var10);
        this.field467.method1568(8448, 2896, 7681);
        this.field467.method1498(34192, 0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7578 / (float) var10.field7575;
        float var12 = var10.field7580 / (float) var10.field7581;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field465.method1963(true, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field467.method1498(34192, 0, 5890, 768);
        this.field467.method1568(8448, 2896, 8448);
        this.field467.method1540(77, null);
        this.field467.method1507(0, 0);
        if (this.field466 || arg4) {
            this.field467.method1498(34192, 0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "(CIIIZ)V")
    public final void method68(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field467.method1521((byte) -5);
        this.field467.method1540(64, this.field468);
        if (this.field466 || arg4) {
            this.field467.method1568(8448, 2896, 7681);
            this.field467.method1498(34192, 0, 34168, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field465.method1963(true, arg0);
        OpenGL.glLoadIdentity();
        if (this.field466 || arg4) {
            this.field467.method1498(34192, 0, 5890, 768);
        }
    }
}
