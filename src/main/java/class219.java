import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class219 extends class357 {

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Ltb;")
    private class227 field3023;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lkf;")
    private class137 field3025;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Z")
    private boolean field3022;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Lbb;")
    private class182 field3024;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(CIIIZLep;II)V", line = 5)
    public final void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class241 arg5, int arg6, int arg7) {
        class234 var9 = (class234) arg5;
        class137 var10 = var9.field3353;
        opengl var11 = this.field3023.field3184;
        this.field3023.method1521();
        this.field3023.method1559(this.field3025);
        if (this.field3022 || arg4) {
            this.field3023.method1542(7681, 8448);
            this.field3023.method1512(0, 34168, 768);
        }
        this.field3023.method1566(1);
        this.field3023.method1559(var10);
        this.field3023.method1542(7681, 8448);
        this.field3023.method1512(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field1976 / (float) var10.field1974;
        float var13 = var10.field1975 / (float) var10.field1977;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3024.method1193(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field3023.method1512(0, 5890, 768);
        this.field3023.method1542(8448, 8448);
        this.field3023.method1559((class127) null);
        this.field3023.method1566(0);
        if (this.field3022 || arg4) {
            this.field3023.method1512(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ltb;Lk;[Llg;Z)V", line = 49)
    public class219(class227 arg0, class337 arg1, class238[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3023 = arg0;
        opengl var5 = arg0.field3184;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class238 var8 = arg2[var7];
            if (var8.field3392 > var6) {
                var6 = var8.field3392;
            }
            if (var8.field3388 > var6) {
                var6 = var8.field3388;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class238 var12 = arg2[var11];
                byte[] var13 = var12.field3390;
                int var14 = var12.field3392;
                int var15 = var12.field3388;
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
            this.field3025 = class137.method949(6406, false, 6406, arg0, (byte) 113, var9, var10, var9);
            this.field3022 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class238 var24 = arg2[var23];
                int[] var25 = var24.field3393;
                byte[] var26 = var24.field3391;
                byte[] var27 = var24.field3390;
                int var28 = var24.field3392;
                int var29 = var24.field3388;
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
            this.field3025 = class137.method948(var9, false, var22, var9, arg0, 34037);
            this.field3022 = false;
        }
        this.field3025.method868(false);
        this.field3024 = new class182(arg0, 256);
        float var38 = this.field3025.field1976 / (float) this.field3025.field1974;
        float var39 = this.field3025.field1975 / (float) this.field3025.field1977;
        for (int var40 = 0; var40 < 256; var40++) {
            class238 var41 = arg2[var40];
            int var42 = var41.field3392;
            int var43 = var41.field3388;
            int var44 = var41.field3387;
            int var45 = var41.field3385;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field3024.method1192(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field3025.field1975 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field3025.field1975 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3025.field1975 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field3025.field1975 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field3024.method1191();
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(CIIIZ)V", line = 256)
    public final void method1411(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field3023.field3184;
        this.field3023.method1521();
        this.field3023.method1559(this.field3025);
        if (this.field3022 || arg4) {
            this.field3023.method1542(7681, 8448);
            this.field3023.method1512(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3024.method1193(arg0);
        var6.glLoadIdentity();
        if (this.field3022 || arg4) {
            this.field3023.method1512(0, 5890, 768);
        }
    }
}
