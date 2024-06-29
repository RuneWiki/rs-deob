import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class348 extends class273 {

    @OriginalMember(owner = "client!br", name = "C", descriptor = "Lnf;")
    private class256 field5033;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "Ldh;")
    private class190 field5034;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "Z")
    private boolean field5035;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "Lpa;")
    private class341 field5032;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(CIIIZLud;II)V")
    public final void method445(char arg0, int arg1, int arg2, int arg3, boolean arg4, class2 arg5, int arg6, int arg7) {
        class176 var9 = (class176) arg5;
        class190 var10 = var9.field2335;
        opengl var11 = this.field5033.field3634;
        this.field5033.method1689();
        this.field5033.method1669(this.field5034);
        if (this.field5035 || arg4) {
            this.field5033.method1627(7681, 8448);
            this.field5033.method1634(0, 34168, 768);
        }
        this.field5033.method1777(1);
        this.field5033.method1669(var10);
        this.field5033.method1627(7681, 8448);
        this.field5033.method1634(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field2552 / (float) var10.field2555;
        float var13 = var10.field2553 / (float) var10.field2556;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5032.method2225(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field5033.method1634(0, 5890, 768);
        this.field5033.method1627(8448, 8448);
        this.field5033.method1669((class360) null);
        this.field5033.method1777(0);
        if (this.field5035 || arg4) {
            this.field5033.method1634(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lnf;Lcl;[Lup;Z)V")
    public class348(class256 arg0, class313 arg1, class441[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5033 = arg0;
        opengl var5 = arg0.field3634;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class441 var8 = arg2[var7];
            if (var8.field6462 > var6) {
                var6 = var8.field6462;
            }
            if (var8.field6466 > var6) {
                var6 = var8.field6466;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class441 var12 = arg2[var11];
                byte[] var13 = var12.field6464;
                int var14 = var12.field6462;
                int var15 = var12.field6466;
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
            this.field5034 = class190.method1148(34037, var10, 6406, arg0, var9, var9, 6406, false);
            this.field5035 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class441 var24 = arg2[var23];
                int[] var25 = var24.field6468;
                byte[] var26 = var24.field6460;
                byte[] var27 = var24.field6464;
                int var28 = var24.field6462;
                int var29 = var24.field6466;
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
            this.field5034 = class190.method1150(var9, var9, var22, false, (byte) -72, arg0);
            this.field5035 = false;
        }
        this.field5034.method2351(false);
        this.field5032 = new class341(arg0, 256);
        float var38 = this.field5034.field2552 / (float) this.field5034.field2555;
        float var39 = this.field5034.field2553 / (float) this.field5034.field2556;
        for (int var40 = 0; var40 < 256; var40++) {
            class441 var41 = arg2[var40];
            int var42 = var41.field6462;
            int var43 = var41.field6466;
            int var44 = var41.field6467;
            int var45 = var41.field6461;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field5032.method2224(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field5034.field2553 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field5034.field2553 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field5034.field2553 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field5034.field2553 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field5032.method2223();
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(CIIIZ)V")
    public final void method443(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field5033.field3634;
        this.field5033.method1689();
        this.field5033.method1669(this.field5034);
        if (this.field5035 || arg4) {
            this.field5033.method1627(7681, 8448);
            this.field5033.method1634(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5032.method2225(arg0);
        var6.glLoadIdentity();
        if (this.field5035 || arg4) {
            this.field5033.method1634(0, 5890, 768);
        }
    }
}
