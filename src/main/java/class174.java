import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class174 extends class85 {

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Lks;")
    private class173 field2389;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Lmf;")
    private class16 field2391;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "Z")
    private boolean field2392;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Lhd;")
    private class19 field2390;

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lks;Lhi;[Ltr;Z)V", line = 5)
    public class174(class173 arg0, class365 arg1, class144[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2389 = arg0;
        opengl var5 = arg0.field2253;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class144 var8 = arg2[var7];
            if (var8.field1955 > var6) {
                var6 = var8.field1955;
            }
            if (var8.field1952 > var6) {
                var6 = var8.field1952;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class144 var12 = arg2[var11];
                byte[] var13 = var12.field1958;
                int var14 = var12.field1955;
                int var15 = var12.field1952;
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
            this.field2391 = class16.method220(6406, 6406, var9, arg0, 34037, var9, false, var10);
            this.field2392 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class144 var24 = arg2[var23];
                int[] var25 = var24.field1956;
                byte[] var26 = var24.field1953;
                byte[] var27 = var24.field1958;
                int var28 = var24.field1955;
                int var29 = var24.field1952;
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
            this.field2391 = class16.method221(false, var22, var9, 0, arg0, var9);
            this.field2392 = false;
        }
        this.field2391.method1405(false);
        this.field2390 = new class19(arg0, 256);
        float var38 = this.field2391.field256 / (float) this.field2391.field257;
        float var39 = this.field2391.field254 / (float) this.field2391.field255;
        for (int var40 = 0; var40 < 256; var40++) {
            class144 var41 = arg2[var40];
            int var42 = var41.field1955;
            int var43 = var41.field1952;
            int var44 = var41.field1957;
            int var45 = var41.field1951;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field2390.method233(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field2391.field254 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field2391.field254 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field2391.field254 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field2391.field254 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field2390.method234();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(CIIIZLtm;II)V", line = 211)
    public final void method474(char arg0, int arg1, int arg2, int arg3, boolean arg4, class195 arg5, int arg6, int arg7) {
        class324 var9 = (class324) arg5;
        class16 var10 = var9.field4778;
        opengl var11 = this.field2389.field2253;
        this.field2389.method1194();
        this.field2389.method1160(this.field2391);
        if (this.field2392 || arg4) {
            this.field2389.method1161(7681, 8448);
            this.field2389.method1127(0, 34168, 768);
        }
        this.field2389.method1150(1);
        this.field2389.method1160(var10);
        this.field2389.method1161(7681, 8448);
        this.field2389.method1127(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field256 / (float) var10.field257;
        float var13 = var10.field254 / (float) var10.field255;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2390.method235(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field2389.method1127(0, 5890, 768);
        this.field2389.method1161(8448, 8448);
        this.field2389.method1160((class205) null);
        this.field2389.method1150(0);
        if (this.field2392 || arg4) {
            this.field2389.method1127(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(CIIIZ)V", line = 259)
    public final void method475(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field2389.field2253;
        this.field2389.method1194();
        this.field2389.method1160(this.field2391);
        if (this.field2392 || arg4) {
            this.field2389.method1161(7681, 8448);
            this.field2389.method1127(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2390.method235(arg0);
        var6.glLoadIdentity();
        if (this.field2392 || arg4) {
            this.field2389.method1127(0, 5890, 768);
        }
    }
}
