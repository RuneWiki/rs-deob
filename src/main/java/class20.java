import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 extends class452 {

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lsq;")
    private class96 field256;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Ll;")
    private class14 field255;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Z")
    private boolean field257;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lkm;")
    private class197 field258;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(CIIIZLq;II)V")
    public final void method148(char arg0, int arg1, int arg2, int arg3, boolean arg4, class245 arg5, int arg6, int arg7) {
        class438 var9 = (class438) arg5;
        class14 var10 = var9.field6430;
        opengl var11 = this.field256.field1156;
        this.field256.method666();
        this.field256.method688(this.field255);
        if (this.field257 || arg4) {
            this.field256.method680(7681, 8448);
            this.field256.method712(0, 34168, 768);
        }
        this.field256.method628(1);
        this.field256.method688(var10);
        this.field256.method680(7681, 8448);
        this.field256.method712(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field195 / (float) var10.field196;
        float var13 = var10.field198 / (float) var10.field199;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field258.method1380(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field256.method712(0, 5890, 768);
        this.field256.method680(8448, 8448);
        this.field256.method688((class293) null);
        this.field256.method628(0);
        if (this.field257 || arg4) {
            this.field256.method712(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lsq;Lgh;[Lvp;Z)V")
    public class20(class96 arg0, class325 arg1, class100[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field256 = arg0;
        opengl var5 = arg0.field1156;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class100 var8 = arg2[var7];
            if (var8.field1399 > var6) {
                var6 = var8.field1399;
            }
            if (var8.field1401 > var6) {
                var6 = var8.field1401;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class100 var12 = arg2[var11];
                byte[] var13 = var12.field1400;
                int var14 = var12.field1399;
                int var15 = var12.field1401;
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
            this.field255 = class14.method124(arg0, var10, 3553, var9, 6406, 6406, var9, false);
            this.field257 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class100 var24 = arg2[var23];
                int[] var25 = var24.field1396;
                byte[] var26 = var24.field1404;
                byte[] var27 = var24.field1400;
                int var28 = var24.field1399;
                int var29 = var24.field1401;
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
            this.field255 = class14.method126(65, var22, false, var9, arg0, var9);
            this.field257 = false;
        }
        this.field255.method1980(false);
        this.field258 = new class197(arg0, 256);
        float var38 = this.field255.field195 / (float) this.field255.field196;
        float var39 = this.field255.field198 / (float) this.field255.field199;
        for (int var40 = 0; var40 < 256; var40++) {
            class100 var41 = arg2[var40];
            int var42 = var41.field1399;
            int var43 = var41.field1401;
            int var44 = var41.field1402;
            int var45 = var41.field1398;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field258.method1382(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field255.field198 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field255.field198 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field255.field198 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field255.field198 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field258.method1381();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(CIIIZ)V")
    public final void method149(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field256.field1156;
        this.field256.method666();
        this.field256.method688(this.field255);
        if (this.field257 || arg4) {
            this.field256.method680(7681, 8448);
            this.field256.method712(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field258.method1380(arg0);
        var6.glLoadIdentity();
        if (this.field257 || arg4) {
            this.field256.method712(0, 5890, 768);
        }
    }
}
