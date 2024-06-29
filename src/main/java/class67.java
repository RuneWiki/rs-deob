import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class67 extends class266 {

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lao;")
    private class157 field759;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lrn;")
    private class145 field760;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Z")
    private boolean field761;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Leq;")
    private class115 field762;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(CIIIZLhb;II)V", line = 4)
    public final void method375(char arg0, int arg1, int arg2, int arg3, boolean arg4, class433 arg5, int arg6, int arg7) {
        class90 var9 = (class90) arg5;
        class145 var10 = var9.field1089;
        opengl var11 = this.field759.field1927;
        this.field759.method987();
        this.field759.method1003(this.field760);
        if (this.field761 || arg4) {
            this.field759.method981(7681, 8448);
            this.field759.method991(0, 34168, 768);
        }
        this.field759.method1001(1);
        this.field759.method1003(var10);
        this.field759.method981(7681, 8448);
        this.field759.method991(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field1788 / (float) var10.field1786;
        float var13 = var10.field1784 / (float) var10.field1785;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field762.method714(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field759.method991(0, 5890, 768);
        this.field759.method981(8448, 8448);
        this.field759.method1003((class220) null);
        this.field759.method1001(0);
        if (this.field761 || arg4) {
            this.field759.method991(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(CIIIZ)V", line = 51)
    public final void method376(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field759.field1927;
        this.field759.method987();
        this.field759.method1003(this.field760);
        if (this.field761 || arg4) {
            this.field759.method981(7681, 8448);
            this.field759.method991(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field762.method714(arg0);
        var6.glLoadIdentity();
        if (this.field761 || arg4) {
            this.field759.method991(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lao;Lth;[Lgo;Z)V", line = 72)
    public class67(class157 arg0, class355 arg1, class375[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field759 = arg0;
        opengl var5 = arg0.field1927;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class375 var8 = arg2[var7];
            if (var8.field5262 > var6) {
                var6 = var8.field5262;
            }
            if (var8.field5261 > var6) {
                var6 = var8.field5261;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class375 var12 = arg2[var11];
                byte[] var13 = var12.field5266;
                int var14 = var12.field5262;
                int var15 = var12.field5261;
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
            this.field760 = class145.method883(var9, false, arg0, var10, false, var9, 6406, 6406);
            this.field761 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class375 var24 = arg2[var23];
                int[] var25 = var24.field5267;
                byte[] var26 = var24.field5265;
                byte[] var27 = var24.field5266;
                int var28 = var24.field5262;
                int var29 = var24.field5261;
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
            this.field760 = class145.method884(var9, arg0, var9, (byte) -68, var22, false);
            this.field761 = false;
        }
        this.field760.method1476(false);
        this.field762 = new class115(arg0, 256);
        float var38 = this.field760.field1788 / (float) this.field760.field1786;
        float var39 = this.field760.field1784 / (float) this.field760.field1785;
        for (int var40 = 0; var40 < 256; var40++) {
            class375 var41 = arg2[var40];
            int var42 = var41.field5262;
            int var43 = var41.field5261;
            int var44 = var41.field5260;
            int var45 = var41.field5263;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field762.method716(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field760.field1784 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field760.field1784 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field760.field1784 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field760.field1784 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field762.method715();
        }
    }
}
