import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class90 extends class352 {

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "Lhj;")
    private class338 field1370;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "Lbc;")
    private class205 field1371;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "Z")
    private boolean field1369;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "Lwm;")
    private class334 field1368;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(CIIIZ)V", line = 5)
    public final void method617(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field1370.field4607;
        this.field1370.method2101();
        this.field1370.method2165(this.field1371);
        if (this.field1369 || arg4) {
            this.field1370.method2140(7681, 8448);
            this.field1370.method2161(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1368.method2075(arg0);
        var6.glLoadIdentity();
        if (this.field1369 || arg4) {
            this.field1370.method2161(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lhj;Ldi;[Lnc;Z)V", line = 28)
    public class90(class338 arg0, class65 arg1, class18[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1370 = arg0;
        opengl var5 = arg0.field4607;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class18 var8 = arg2[var7];
            if (var8.field242 > var6) {
                var6 = var8.field242;
            }
            if (var8.field247 > var6) {
                var6 = var8.field247;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class18 var12 = arg2[var11];
                byte[] var13 = var12.field240;
                int var14 = var12.field242;
                int var15 = var12.field247;
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
            this.field1371 = class205.method1343(arg0, false, 6406, var9, var10, 1673, 6406, var9);
            this.field1369 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class18 var24 = arg2[var23];
                int[] var25 = var24.field246;
                byte[] var26 = var24.field243;
                byte[] var27 = var24.field240;
                int var28 = var24.field242;
                int var29 = var24.field247;
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
            this.field1371 = class205.method1344(arg0, var22, false, var9, (byte) 28, var9);
            this.field1369 = false;
        }
        this.field1371.method915(false);
        this.field1368 = new class334(arg0, 256);
        float var38 = this.field1371.field2776 / (float) this.field1371.field2775;
        float var39 = this.field1371.field2777 / (float) this.field1371.field2774;
        for (int var40 = 0; var40 < 256; var40++) {
            class18 var41 = arg2[var40];
            int var42 = var41.field242;
            int var43 = var41.field247;
            int var44 = var41.field245;
            int var45 = var41.field244;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field1368.method2073(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field1371.field2777 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field1371.field2777 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field1371.field2777 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field1371.field2777 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field1368.method2074();
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(CIIIZLtm;II)V", line = 234)
    public final void method618(char arg0, int arg1, int arg2, int arg3, boolean arg4, class220 arg5, int arg6, int arg7) {
        class19 var9 = (class19) arg5;
        class205 var10 = var9.field249;
        opengl var11 = this.field1370.field4607;
        this.field1370.method2101();
        this.field1370.method2165(this.field1371);
        if (this.field1369 || arg4) {
            this.field1370.method2140(7681, 8448);
            this.field1370.method2161(0, 34168, 768);
        }
        this.field1370.method2162(1);
        this.field1370.method2165(var10);
        this.field1370.method2140(7681, 8448);
        this.field1370.method2161(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field2776 / (float) var10.field2775;
        float var13 = var10.field2777 / (float) var10.field2774;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1368.method2075(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field1370.method2161(0, 5890, 768);
        this.field1370.method2140(8448, 8448);
        this.field1370.method2165((class133) null);
        this.field1370.method2162(0);
        if (this.field1369 || arg4) {
            this.field1370.method2161(0, 5890, 768);
        }
    }
}
