import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class460 extends class137 {

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "Lcg;")
    private class393 field6802;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "Lqq;")
    private class434 field6803;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "Z")
    private boolean field6801;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "Lcq;")
    private class73 field6804;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CIIIZLor;II)V")
    public final void method739(char arg0, int arg1, int arg2, int arg3, boolean arg4, class153 arg5, int arg6, int arg7) {
        class76 var9 = (class76) arg5;
        class434 var10 = var9.field1023;
        opengl var11 = this.field6802.field5783;
        this.field6802.method2473();
        this.field6802.method2460(this.field6803);
        if (this.field6801 || arg4) {
            this.field6802.method2428(7681, 8448);
            this.field6802.method2425(0, 34168, 768);
        }
        this.field6802.method2452(1);
        this.field6802.method2460(var10);
        this.field6802.method2428(7681, 8448);
        this.field6802.method2425(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field6397 / (float) var10.field6400;
        float var13 = var10.field6398 / (float) var10.field6399;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6804.method483(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field6802.method2425(0, 5890, 768);
        this.field6802.method2428(8448, 8448);
        this.field6802.method2460((class325) null);
        this.field6802.method2452(0);
        if (this.field6801 || arg4) {
            this.field6802.method2425(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CIIIZ)V")
    public final void method742(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field6802.field5783;
        this.field6802.method2473();
        this.field6802.method2460(this.field6803);
        if (this.field6801 || arg4) {
            this.field6802.method2428(7681, 8448);
            this.field6802.method2425(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6804.method483(arg0);
        var6.glLoadIdentity();
        if (this.field6801 || arg4) {
            this.field6802.method2425(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lcg;Lgo;[Lck;Z)V")
    public class460(class393 arg0, class272 arg1, class4[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6802 = arg0;
        opengl var5 = arg0.field5783;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class4 var8 = arg2[var7];
            if (var8.field41 > var6) {
                var6 = var8.field41;
            }
            if (var8.field46 > var6) {
                var6 = var8.field46;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class4 var12 = arg2[var11];
                byte[] var13 = var12.field43;
                int var14 = var12.field41;
                int var15 = var12.field46;
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
            this.field6803 = class434.method2666(6406, var9, var9, false, 6406, false, var10, arg0);
            this.field6801 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class4 var24 = arg2[var23];
                int[] var25 = var24.field48;
                byte[] var26 = var24.field42;
                byte[] var27 = var24.field43;
                int var28 = var24.field41;
                int var29 = var24.field46;
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
            this.field6803 = class434.method2668(0, var9, false, var9, arg0, var22);
            this.field6801 = false;
        }
        this.field6803.method2001(false);
        this.field6804 = new class73(arg0, 256);
        float var38 = this.field6803.field6397 / (float) this.field6803.field6400;
        float var39 = this.field6803.field6398 / (float) this.field6803.field6399;
        for (int var40 = 0; var40 < 256; var40++) {
            class4 var41 = arg2[var40];
            int var42 = var41.field41;
            int var43 = var41.field46;
            int var44 = var41.field49;
            int var45 = var41.field45;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field6804.method482(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field6803.field6398 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field6803.field6398 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field6803.field6398 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field6803.field6398 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field6804.method484();
        }
    }
}
