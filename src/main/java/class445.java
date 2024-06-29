import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class445 extends class298 {

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lql;")
    private class346 field6501;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Lgn;")
    private class170 field6503;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Z")
    private boolean field6502;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lgi;")
    private class253 field6500;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(CIIIZLgo;II)V", line = 5)
    public final void method62(char arg0, int arg1, int arg2, int arg3, boolean arg4, class175 arg5, int arg6, int arg7) {
        class113 var9 = (class113) arg5;
        class170 var10 = var9.field1409;
        opengl var11 = this.field6501.field4697;
        this.field6501.method2059();
        this.field6501.method2032(this.field6503);
        if (this.field6502 || arg4) {
            this.field6501.method2053(7681, 8448);
            this.field6501.method2062(0, 34168, 768);
        }
        this.field6501.method2052(1);
        this.field6501.method2032(var10);
        this.field6501.method2053(7681, 8448);
        this.field6501.method2062(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field2144 / (float) var10.field2143;
        float var13 = var10.field2141 / (float) var10.field2142;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6500.method1427(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field6501.method2062(0, 5890, 768);
        this.field6501.method2053(8448, 8448);
        this.field6501.method2032((class50) null);
        this.field6501.method2052(0);
        if (this.field6502 || arg4) {
            this.field6501.method2062(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(CIIIZ)V", line = 50)
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field6501.field4697;
        this.field6501.method2059();
        this.field6501.method2032(this.field6503);
        if (this.field6502 || arg4) {
            this.field6501.method2053(7681, 8448);
            this.field6501.method2062(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6500.method1427(arg0);
        var6.glLoadIdentity();
        if (this.field6502 || arg4) {
            this.field6501.method2062(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lql;Ljp;[Lv;Z)V", line = 71)
    public class445(class346 arg0, class402 arg1, class241[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6501 = arg0;
        opengl var5 = arg0.field4697;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class241 var8 = arg2[var7];
            if (var8.field3280 > var6) {
                var6 = var8.field3280;
            }
            if (var8.field3282 > var6) {
                var6 = var8.field3282;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class241 var12 = arg2[var11];
                byte[] var13 = var12.field3285;
                int var14 = var12.field3280;
                int var15 = var12.field3282;
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
            this.field6503 = class170.method897((byte) 20, 6406, 6406, var9, var10, var9, arg0, false);
            this.field6502 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class241 var24 = arg2[var23];
                int[] var25 = var24.field3284;
                byte[] var26 = var24.field3281;
                byte[] var27 = var24.field3285;
                int var28 = var24.field3280;
                int var29 = var24.field3282;
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
            this.field6503 = class170.method896(arg0, var22, var9, false, var9, 53);
            this.field6502 = false;
        }
        this.field6503.method242(false);
        this.field6500 = new class253(arg0, 256);
        float var38 = this.field6503.field2144 / (float) this.field6503.field2143;
        float var39 = this.field6503.field2141 / (float) this.field6503.field2142;
        for (int var40 = 0; var40 < 256; var40++) {
            class241 var41 = arg2[var40];
            int var42 = var41.field3280;
            int var43 = var41.field3282;
            int var44 = var41.field3283;
            int var45 = var41.field3278;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field6500.method1429(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field6503.field2141 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field6503.field2141 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field6503.field2141 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field6503.field2141 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field6500.method1428();
        }
    }
}
