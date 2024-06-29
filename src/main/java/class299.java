import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class299 extends class175 {

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Lhd;")
    private class17 field4020;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Lmc;")
    private class317 field4023;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Z")
    private boolean field4021;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Lq;")
    private class205 field4022;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLvj;II)V")
    public final void method806(char arg0, int arg1, int arg2, int arg3, boolean arg4, class179 arg5, int arg6, int arg7) {
        class50 var9 = (class50) arg5;
        class317 var10 = var9.field836;
        opengl var11 = this.field4020.field198;
        this.field4020.method119();
        this.field4020.method207(this.field4023);
        if (this.field4021 || arg4) {
            this.field4020.method145(7681, 8448);
            this.field4020.method93(0, 34168, 768);
        }
        this.field4020.method176(1);
        this.field4020.method207(var10);
        this.field4020.method145(7681, 8448);
        this.field4020.method93(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field4302 / (float) var10.field4300;
        float var13 = var10.field4298 / (float) var10.field4299;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4022.method1427(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field4020.method93(0, 5890, 768);
        this.field4020.method145(8448, 8448);
        this.field4020.method207((class4) null);
        this.field4020.method176(0);
        if (this.field4021 || arg4) {
            this.field4020.method93(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZ)V")
    public final void method804(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field4020.field198;
        this.field4020.method119();
        this.field4020.method207(this.field4023);
        if (this.field4021 || arg4) {
            this.field4020.method145(7681, 8448);
            this.field4020.method93(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4022.method1427(arg0);
        var6.glLoadIdentity();
        if (this.field4021 || arg4) {
            this.field4020.method93(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lhd;Lvm;[Ldr;Z)V")
    public class299(class17 arg0, class323 arg1, class214[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4020 = arg0;
        opengl var5 = arg0.field198;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class214 var8 = arg2[var7];
            if (var8.field2974 > var6) {
                var6 = var8.field2974;
            }
            if (var8.field2973 > var6) {
                var6 = var8.field2973;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class214 var12 = arg2[var11];
                byte[] var13 = var12.field2971;
                int var14 = var12.field2974;
                int var15 = var12.field2973;
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
            this.field4023 = class317.method2018(arg0, 6406, var9, true, false, var9, var10, 6406);
            this.field4021 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class214 var24 = arg2[var23];
                int[] var25 = var24.field2972;
                byte[] var26 = var24.field2975;
                byte[] var27 = var24.field2971;
                int var28 = var24.field2974;
                int var29 = var24.field2973;
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
            this.field4023 = class317.method2019((byte) -104, var9, arg0, false, var22, var9);
            this.field4021 = false;
        }
        this.field4023.method17(false);
        this.field4022 = new class205(arg0, 256);
        float var38 = this.field4023.field4302 / (float) this.field4023.field4300;
        float var39 = this.field4023.field4298 / (float) this.field4023.field4299;
        for (int var40 = 0; var40 < 256; var40++) {
            class214 var41 = arg2[var40];
            int var42 = var41.field2974;
            int var43 = var41.field2973;
            int var44 = var41.field2970;
            int var45 = var41.field2968;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field4022.method1426(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field4023.field4298 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field4023.field4298 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field4023.field4298 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field4023.field4298 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field4022.method1425();
        }
    }
}
