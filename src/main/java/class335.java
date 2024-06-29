import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class335 extends class199 {

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "Lfu;")
    private class42 field4654;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Lwc;")
    private class245 field4651;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "Z")
    private boolean field4653;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Ljb;")
    private class461 field4652;

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lfu;Lkg;[Lgm;Z)V")
    public class335(class42 arg0, class194 arg1, class355[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4654 = arg0;
        opengl var5 = arg0.field557;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class355 var8 = arg2[var7];
            if (var8.field4876 > var6) {
                var6 = var8.field4876;
            }
            if (var8.field4877 > var6) {
                var6 = var8.field4877;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class355 var12 = arg2[var11];
                byte[] var13 = var12.field4880;
                int var14 = var12.field4876;
                int var15 = var12.field4877;
                int var16 = var11 % 16 * var6;
                int var17 = var11 / 16 * var6;
                int var18 = var9 * var17 + var16;
                int var19 = 0;
                for (int var20 = 0; var20 < var14; var20++) {
                    for (int var21 = 0; var21 < var15; var21++) {
                        var10[var18++] = (byte) (var13[var19++] == 0 ? 0 : -1);
                    }
                    var18 += var9 - var15;
                }
            }
            this.field4651 = class245.method1690(false, 6406, (byte) -50, 6406, var10, var9, var9, arg0);
            this.field4653 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class355 var24 = arg2[var23];
                int[] var25 = var24.field4881;
                byte[] var26 = var24.field4879;
                byte[] var27 = var24.field4880;
                int var28 = var24.field4876;
                int var29 = var24.field4877;
                int var30 = var23 % 16 * var6;
                int var31 = var23 / 16 * var6;
                int var32 = var9 * var31 + var30;
                int var33 = 0;
                if (var26 == null) {
                    for (int var36 = 0; var36 < var28; var36++) {
                        for (int var37 = 0; var37 < var29; var37++) {
                            var22[var32++] = var25[var27[var33++] & 0xFF] | 0xFF000000;
                        }
                        var32 += var9 - var29;
                    }
                } else {
                    for (int var34 = 0; var34 < var28; var34++) {
                        for (int var35 = 0; var35 < var29; var35++) {
                            var22[var32++] = var26[var33] << 24 | var25[var27[var33] & 0xFF];
                            var33++;
                        }
                        var32 += var9 - var29;
                    }
                }
            }
            this.field4651 = class245.method1691(var22, (byte) -82, false, arg0, var9, var9);
            this.field4653 = false;
        }
        this.field4651.method2297(false);
        this.field4652 = new class461(arg0, 256);
        float var38 = this.field4651.field3550 / (float) this.field4651.field3553;
        float var39 = this.field4651.field3549 / (float) this.field4651.field3551;
        for (int var40 = 0; var40 < 256; var40++) {
            class355 var41 = arg2[var40];
            int var42 = var41.field4876;
            int var43 = var41.field4877;
            int var44 = var41.field4873;
            int var45 = var41.field4874;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field4652.method2760(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field4651.field3549 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field4651.field3549 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field4651.field3549 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field4651.field3549 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field4652.method2762();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(CIIIZ)V")
    public final void method1298(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field4654.field557;
        this.field4654.method405();
        this.field4654.method303(this.field4651);
        if (this.field4653 || arg4) {
            this.field4654.method353(7681, 8448);
            this.field4654.method335(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4652.method2761(arg0);
        var6.glLoadIdentity();
        if (this.field4653 || arg4) {
            this.field4654.method335(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(CIIIZLoj;II)V")
    public final void method1299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class405 arg5, int arg6, int arg7) {
        class60 var9 = (class60) arg5;
        class245 var10 = var9.field880;
        opengl var11 = this.field4654.field557;
        this.field4654.method405();
        this.field4654.method303(this.field4651);
        if (this.field4653 || arg4) {
            this.field4654.method353(7681, 8448);
            this.field4654.method335(0, 34168, 768);
        }
        this.field4654.method407(1);
        this.field4654.method303(var10);
        this.field4654.method353(7681, 8448);
        this.field4654.method335(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field3550 / (float) var10.field3553;
        float var13 = var10.field3549 / (float) var10.field3551;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4652.method2761(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field4654.method335(0, 5890, 768);
        this.field4654.method353(8448, 8448);
        this.field4654.method303((class375) null);
        this.field4654.method407(0);
        if (this.field4653 || arg4) {
            this.field4654.method335(0, 5890, 768);
        }
    }
}
