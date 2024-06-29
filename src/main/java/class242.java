import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class242 extends class229 {

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Lnm;")
    private class254 field3490;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "Lup;")
    private class259 field3488;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Z")
    private boolean field3489;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Lp;")
    private class173 field3487;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lnm;Lis;[Lff;Z)V")
    public class242(class254 arg0, class1 arg1, class368[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3490 = arg0;
        opengl var5 = arg0.field3648;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class368 var8 = arg2[var7];
            if (var8.field5559 > var6) {
                var6 = var8.field5559;
            }
            if (var8.field5561 > var6) {
                var6 = var8.field5561;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class368 var12 = arg2[var11];
                byte[] var13 = var12.field5554;
                int var14 = var12.field5559;
                int var15 = var12.field5561;
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
            this.field3488 = class259.method1713(var10, 6406, false, 6406, -34038, var9, arg0, var9);
            this.field3489 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class368 var24 = arg2[var23];
                int[] var25 = var24.field5553;
                byte[] var26 = var24.field5557;
                byte[] var27 = var24.field5554;
                int var28 = var24.field5559;
                int var29 = var24.field5561;
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
            this.field3488 = class259.method1714(var22, var9, var9, 3553, false, arg0);
            this.field3489 = false;
        }
        this.field3488.method228(false);
        this.field3487 = new class173(arg0, 256);
        float var38 = this.field3488.field3860 / (float) this.field3488.field3863;
        float var39 = this.field3488.field3861 / (float) this.field3488.field3859;
        for (int var40 = 0; var40 < 256; var40++) {
            class368 var41 = arg2[var40];
            int var42 = var41.field5559;
            int var43 = var41.field5561;
            int var44 = var41.field5555;
            int var45 = var41.field5560;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field3487.method1191(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field3488.field3861 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field3488.field3861 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3488.field3861 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3488.field3861 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field3487.method1193();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CIIIZ)V")
    public final void method1085(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field3490.field3648;
        this.field3490.method1637();
        this.field3490.method1653(this.field3488);
        if (this.field3489 || arg4) {
            this.field3490.method1679(7681, 8448);
            this.field3490.method1621(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3487.method1192(arg0);
        var6.glLoadIdentity();
        if (this.field3489 || arg4) {
            this.field3490.method1621(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CIIIZLus;II)V")
    public final void method1086(char arg0, int arg1, int arg2, int arg3, boolean arg4, class401 arg5, int arg6, int arg7) {
        class445 var9 = (class445) arg5;
        class259 var10 = var9.field6264;
        opengl var11 = this.field3490.field3648;
        this.field3490.method1637();
        this.field3490.method1653(this.field3488);
        if (this.field3489 || arg4) {
            this.field3490.method1679(7681, 8448);
            this.field3490.method1621(0, 34168, 768);
        }
        this.field3490.method1634(1);
        this.field3490.method1653(var10);
        this.field3490.method1679(7681, 8448);
        this.field3490.method1621(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field3860 / (float) var10.field3863;
        float var13 = var10.field3861 / (float) var10.field3859;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3487.method1192(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field3490.method1621(0, 5890, 768);
        this.field3490.method1679(8448, 8448);
        this.field3490.method1653((class26) null);
        this.field3490.method1634(0);
        if (this.field3489 || arg4) {
            this.field3490.method1621(0, 5890, 768);
        }
    }
}
