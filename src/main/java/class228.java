import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class228 extends class256 {

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lmi;")
    private class315 field3438;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lrh;")
    private class159 field3439;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Z")
    private boolean field3437;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lma;")
    private class10 field3436;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(CIIIZLsm;II)V")
    public final void method1402(char arg0, int arg1, int arg2, int arg3, boolean arg4, class171 arg5, int arg6, int arg7) {
        class4 var9 = (class4) arg5;
        class159 var10 = var9.field34;
        opengl var11 = this.field3438.field4445;
        this.field3438.method1952();
        this.field3438.method1967(this.field3439);
        if (this.field3437 || arg4) {
            this.field3438.method1992(7681, 8448);
            this.field3438.method2006(0, 34168, 768);
        }
        this.field3438.method1972(1);
        this.field3438.method1967(var10);
        this.field3438.method1992(7681, 8448);
        this.field3438.method2006(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field2357 / (float) var10.field2358;
        float var13 = var10.field2359 / (float) var10.field2361;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3436.method37(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field3438.method2006(0, 5890, 768);
        this.field3438.method1992(8448, 8448);
        this.field3438.method1967((class425) null);
        this.field3438.method1972(0);
        if (this.field3437 || arg4) {
            this.field3438.method2006(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(CIIIZ)V")
    public final void method1399(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field3438.field4445;
        this.field3438.method1952();
        this.field3438.method1967(this.field3439);
        if (this.field3437 || arg4) {
            this.field3438.method1992(7681, 8448);
            this.field3438.method2006(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3436.method37(arg0);
        var6.glLoadIdentity();
        if (this.field3437 || arg4) {
            this.field3438.method2006(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lmi;Lqb;[Lju;Z)V")
    public class228(class315 arg0, class135 arg1, class72[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3438 = arg0;
        opengl var5 = arg0.field4445;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class72 var8 = arg2[var7];
            if (var8.field897 > var6) {
                var6 = var8.field897;
            }
            if (var8.field893 > var6) {
                var6 = var8.field893;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class72 var12 = arg2[var11];
                byte[] var13 = var12.field898;
                int var14 = var12.field897;
                int var15 = var12.field893;
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
            this.field3439 = class159.method990(var9, 6406, false, var9, var10, 6406, arg0, 34037);
            this.field3437 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class72 var24 = arg2[var23];
                int[] var25 = var24.field899;
                byte[] var26 = var24.field892;
                byte[] var27 = var24.field898;
                int var28 = var24.field897;
                int var29 = var24.field893;
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
            this.field3439 = class159.method991(-103, var22, arg0, false, var9, var9);
            this.field3437 = false;
        }
        this.field3439.method2501(false);
        this.field3436 = new class10(arg0, 256);
        float var38 = this.field3439.field2357 / (float) this.field3439.field2358;
        float var39 = this.field3439.field2359 / (float) this.field3439.field2361;
        for (int var40 = 0; var40 < 256; var40++) {
            class72 var41 = arg2[var40];
            int var42 = var41.field897;
            int var43 = var41.field893;
            int var44 = var41.field891;
            int var45 = var41.field896;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field3436.method39(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field3439.field2359 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field3439.field2359 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3439.field2359 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3439.field2359 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field3436.method38();
        }
    }
}
