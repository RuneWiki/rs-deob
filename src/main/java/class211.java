import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class211 extends class296 {

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lih;")
    private class214 field3363;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lgq;")
    private class536 field3364;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
    private boolean field3362;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lcs;")
    private class426 field3365;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "(CIIIZ)V")
    public final void method335(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3363.method1479(4615);
        this.field3363.method1471(true, this.field3364);
        if (this.field3362 || arg4) {
            this.field3363.method1482(7681, 8960, 8448);
            this.field3363.method1474(0, 34168, -5000, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3365.method2603(arg0, -17213);
        OpenGL.glLoadIdentity();
        if (this.field3362 || arg4) {
            this.field3363.method1474(0, 5890, -5000, 768);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method336(char arg0, int arg1, int arg2, int arg3, boolean arg4, class448 arg5, int arg6, int arg7) {
        class485 var9 = (class485) arg5;
        class536 var10 = var9.field7119;
        this.field3363.method1479(4615);
        this.field3363.method1471(true, this.field3364);
        if (this.field3362 || arg4) {
            this.field3363.method1482(7681, 8960, 8448);
            this.field3363.method1474(0, 34168, -5000, 768);
        }
        this.field3363.method1440(1, 0);
        this.field3363.method1471(true, var10);
        this.field3363.method1482(7681, 8960, 8448);
        this.field3363.method1474(0, 34168, -5000, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7867 / (float) var10.field7877;
        float var12 = var10.field7871 / (float) var10.field7880;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3365.method2603(arg0, -17213);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3363.method1474(0, 5890, -5000, 768);
        this.field3363.method1482(8448, 8960, 8448);
        this.field3363.method1471(true, null);
        this.field3363.method1440(0, 0);
        if (this.field3362 || arg4) {
            this.field3363.method1474(0, 5890, -5000, 768);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lih;Lqm;[Lwh;Z)V")
    public class211(class214 arg0, class331 arg1, class523[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3363 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class523 var50 = arg2[var6];
            if (var50.field7709 > var5) {
                var5 = var50.field7709;
            }
            if (var50.field7707 > var5) {
                var5 = var50.field7707;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class523 var10 = arg2[var9];
                byte[] var11 = var10.field7705;
                int var12 = var10.field7709;
                int var13 = var10.field7707;
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
            this.field3364 = class330.method2075(var8, var7, var7, false, arg0, 6406, 6406, (byte) 93);
            this.field3362 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class523 var36 = arg2[var21];
                int[] var37 = var36.field7712;
                byte[] var38 = var36.field7708;
                byte[] var39 = var36.field7705;
                int var40 = var36.field7709;
                int var41 = var36.field7707;
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
            this.field3364 = class407.method2520(var7, arg0, false, var20, var7, false);
            this.field3362 = false;
        }
        this.field3364.method1208(false, -110);
        this.field3365 = new class426(arg0, 256);
        float var22 = this.field3364.field7867 / (float) this.field3364.field7877;
        float var23 = this.field3364.field7871 / (float) this.field3364.field7880;
        for (int var24 = 0; var24 < 256; var24++) {
            class523 var25 = arg2[var24];
            int var26 = var25.field7709;
            int var27 = var25.field7707;
            int var28 = var25.field7711;
            int var29 = var25.field7710;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field3365.method2604(14, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field3364.field7871 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field3364.field7871 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3364.field7871 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3364.field7871 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field3365.method2601((byte) 122);
        }
    }
}
