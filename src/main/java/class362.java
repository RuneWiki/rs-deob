import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class362 extends class335 {

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Lig;")
    private class132 field5210;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Lrk;")
    private class22 field5209;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Z")
    private boolean field5208;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Loc;")
    private class112 field5207;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CIIIZLsg;II)V", line = 6)
    public final void method1809(char arg0, int arg1, int arg2, int arg3, boolean arg4, class226 arg5, int arg6, int arg7) {
        class133 var9 = (class133) arg5;
        class22 var10 = var9.field2052;
        opengl var11 = this.field5210.field1918;
        this.field5210.method968();
        this.field5210.method888(this.field5209);
        if (this.field5208 || arg4) {
            this.field5210.method926(7681, 8448);
            this.field5210.method949(0, 34168, 768);
        }
        this.field5210.method1002(1);
        this.field5210.method888(var10);
        this.field5210.method926(7681, 8448);
        this.field5210.method949(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field279 / (float) var10.field278;
        float var13 = var10.field276 / (float) var10.field277;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5207.method677(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field5210.method949(0, 5890, 768);
        this.field5210.method926(8448, 8448);
        this.field5210.method888((class404) null);
        this.field5210.method1002(0);
        if (this.field5208 || arg4) {
            this.field5210.method949(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CIIIZ)V", line = 52)
    public final void method1808(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field5210.field1918;
        this.field5210.method968();
        this.field5210.method888(this.field5209);
        if (this.field5208 || arg4) {
            this.field5210.method926(7681, 8448);
            this.field5210.method949(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5207.method677(arg0);
        var6.glLoadIdentity();
        if (this.field5208 || arg4) {
            this.field5210.method949(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lig;Lbb;[Lk;Z)V", line = 74)
    public class362(class132 arg0, class182 arg1, class337[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5210 = arg0;
        opengl var5 = arg0.field1918;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class337 var8 = arg2[var7];
            if (var8.field4888 > var6) {
                var6 = var8.field4888;
            }
            if (var8.field4886 > var6) {
                var6 = var8.field4886;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class337 var12 = arg2[var11];
                byte[] var13 = var12.field4884;
                int var14 = var12.field4888;
                int var15 = var12.field4886;
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
            this.field5209 = class22.method121(arg0, (byte) -125, 6406, var10, 6406, var9, var9, false);
            this.field5208 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class337 var24 = arg2[var23];
                int[] var25 = var24.field4881;
                byte[] var26 = var24.field4885;
                byte[] var27 = var24.field4884;
                int var28 = var24.field4888;
                int var29 = var24.field4886;
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
            this.field5209 = class22.method120(false, false, var9, arg0, var9, var22);
            this.field5208 = false;
        }
        this.field5209.method2524(false);
        this.field5207 = new class112(arg0, 256);
        float var38 = this.field5209.field279 / (float) this.field5209.field278;
        float var39 = this.field5209.field276 / (float) this.field5209.field277;
        for (int var40 = 0; var40 < 256; var40++) {
            class337 var41 = arg2[var40];
            int var42 = var41.field4888;
            int var43 = var41.field4886;
            int var44 = var41.field4880;
            int var45 = var41.field4883;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field5207.method678(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field5209.field276 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field5209.field276 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field5209.field276 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field5209.field276 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field5207.method679();
        }
    }
}
