import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class54 extends class129 {

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lse;")
    private class282 field824;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Lfj;")
    private class146 field827;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Z")
    private boolean field825;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Lns;")
    private class426 field826;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(CIIIZLsf;II)V")
    public final void method387(char arg0, int arg1, int arg2, int arg3, boolean arg4, class421 arg5, int arg6, int arg7) {
        class442 var9 = (class442) arg5;
        class146 var10 = var9.field6397;
        opengl var11 = this.field824.field4140;
        this.field824.method1868();
        this.field824.method1915(this.field827);
        if (this.field825 || arg4) {
            this.field824.method1911(7681, 8448);
            this.field824.method1866(0, 34168, 768);
        }
        this.field824.method1862(1);
        this.field824.method1915(var10);
        this.field824.method1911(7681, 8448);
        this.field824.method1866(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field1870 / (float) var10.field1873;
        float var13 = var10.field1872 / (float) var10.field1874;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field826.method2672(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field824.method1866(0, 5890, 768);
        this.field824.method1911(8448, 8448);
        this.field824.method1915((class344) null);
        this.field824.method1862(0);
        if (this.field825 || arg4) {
            this.field824.method1866(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lse;Lvn;[Lok;Z)V")
    public class54(class282 arg0, class431 arg1, class10[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field824 = arg0;
        opengl var5 = arg0.field4140;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class10 var8 = arg2[var7];
            if (var8.field187 > var6) {
                var6 = var8.field187;
            }
            if (var8.field183 > var6) {
                var6 = var8.field183;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class10 var12 = arg2[var11];
                byte[] var13 = var12.field182;
                int var14 = var12.field187;
                int var15 = var12.field183;
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
            this.field827 = class146.method1011(6406, var10, false, var9, 34037, arg0, var9, 6406);
            this.field825 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class10 var24 = arg2[var23];
                int[] var25 = var24.field184;
                byte[] var26 = var24.field180;
                byte[] var27 = var24.field182;
                int var28 = var24.field187;
                int var29 = var24.field183;
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
            this.field827 = class146.method1010(-19065, var9, false, var9, arg0, var22);
            this.field825 = false;
        }
        this.field827.method2277(false);
        this.field826 = new class426(arg0, 256);
        float var38 = this.field827.field1870 / (float) this.field827.field1873;
        float var39 = this.field827.field1872 / (float) this.field827.field1874;
        for (int var40 = 0; var40 < 256; var40++) {
            class10 var41 = arg2[var40];
            int var42 = var41.field187;
            int var43 = var41.field183;
            int var44 = var41.field188;
            int var45 = var41.field186;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field826.method2670(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field827.field1872 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field827.field1872 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field827.field1872 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field827.field1872 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field826.method2671();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(CIIIZ)V")
    public final void method388(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field824.field4140;
        this.field824.method1868();
        this.field824.method1915(this.field827);
        if (this.field825 || arg4) {
            this.field824.method1911(7681, 8448);
            this.field824.method1866(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field826.method2672(arg0);
        var6.glLoadIdentity();
        if (this.field825 || arg4) {
            this.field824.method1866(0, 5890, 768);
        }
    }
}
