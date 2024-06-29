import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class44 extends class61 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lmm;")
    private class357 field578;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lvj;")
    private class179 field577;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Z")
    private boolean field576;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lhi;")
    private class355 field575;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(CIIIZLde;II)V")
    public final void method373(char arg0, int arg1, int arg2, int arg3, boolean arg4, class165 arg5, int arg6, int arg7) {
        class360 var9 = (class360) arg5;
        class179 var10 = var9.field4976;
        opengl var11 = this.field578.field4794;
        this.field578.method2157();
        this.field578.method2180(this.field577);
        if (this.field576 || arg4) {
            this.field578.method2212(7681, 8448);
            this.field578.method2187(0, 34168, 768);
        }
        this.field578.method2196(1);
        this.field578.method2180(var10);
        this.field578.method2212(7681, 8448);
        this.field578.method2187(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field2552 / (float) var10.field2551;
        float var13 = var10.field2548 / (float) var10.field2549;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field575.method2132(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field578.method2187(0, 5890, 768);
        this.field578.method2212(8448, 8448);
        this.field578.method2180((class321) null);
        this.field578.method2196(0);
        if (this.field576 || arg4) {
            this.field578.method2187(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lmm;Lci;[Ljf;Z)V")
    public class44(class357 arg0, class389 arg1, class96[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field578 = arg0;
        opengl var5 = arg0.field4794;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class96 var8 = arg2[var7];
            if (var8.field1326 > var6) {
                var6 = var8.field1326;
            }
            if (var8.field1327 > var6) {
                var6 = var8.field1327;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class96 var12 = arg2[var11];
                byte[] var13 = var12.field1325;
                int var14 = var12.field1326;
                int var15 = var12.field1327;
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
            this.field577 = class179.method1267(6408, false, var9, var10, 6406, 6406, var9, arg0);
            this.field576 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class96 var24 = arg2[var23];
                int[] var25 = var24.field1324;
                byte[] var26 = var24.field1321;
                byte[] var27 = var24.field1325;
                int var28 = var24.field1326;
                int var29 = var24.field1327;
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
            this.field577 = class179.method1265(var9, var22, var9, arg0, false, 3553);
            this.field576 = false;
        }
        this.field577.method1954(false);
        this.field575 = new class355(arg0, 256);
        float var38 = this.field577.field2552 / (float) this.field577.field2551;
        float var39 = this.field577.field2548 / (float) this.field577.field2549;
        for (int var40 = 0; var40 < 256; var40++) {
            class96 var41 = arg2[var40];
            int var42 = var41.field1326;
            int var43 = var41.field1327;
            int var44 = var41.field1322;
            int var45 = var41.field1319;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field575.method2130(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field577.field2548 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field577.field2548 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field577.field2548 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field577.field2548 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field575.method2131();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(CIIIZ)V")
    public final void method374(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field578.field4794;
        this.field578.method2157();
        this.field578.method2180(this.field577);
        if (this.field576 || arg4) {
            this.field578.method2212(7681, 8448);
            this.field578.method2187(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field575.method2132(arg0);
        var6.glLoadIdentity();
        if (this.field576 || arg4) {
            this.field578.method2187(0, 5890, 768);
        }
    }
}
