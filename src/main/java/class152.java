import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class152 extends class206 {

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "Lic;")
    private class246 field1830;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "Llm;")
    private class374 field1829;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "Z")
    private boolean field1828;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "Lfa;")
    private class433 field1831;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(CIIIZLhg;II)V", line = 7)
    public final void method256(char arg0, int arg1, int arg2, int arg3, boolean arg4, class313 arg5, int arg6, int arg7) {
        class124 var9 = (class124) arg5;
        class374 var10 = var9.field1533;
        opengl var11 = this.field1830.field3342;
        this.field1830.method1390();
        this.field1830.method1379(this.field1829);
        if (this.field1828 || arg4) {
            this.field1830.method1360(7681, 8448);
            this.field1830.method1458(0, 34168, 768);
        }
        this.field1830.method1365(1);
        this.field1830.method1379(var10);
        this.field1830.method1360(7681, 8448);
        this.field1830.method1458(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field5341 / (float) var10.field5338;
        float var13 = var10.field5339 / (float) var10.field5340;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1831.method2588(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field1830.method1458(0, 5890, 768);
        this.field1830.method1360(8448, 8448);
        this.field1830.method1379((class5) null);
        this.field1830.method1365(0);
        if (this.field1828 || arg4) {
            this.field1830.method1458(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lic;Lbg;[Lkm;Z)V", line = 51)
    public class152(class246 arg0, class406 arg1, class473[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1830 = arg0;
        opengl var5 = arg0.field3342;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class473 var8 = arg2[var7];
            if (var8.field6646 > var6) {
                var6 = var8.field6646;
            }
            if (var8.field6649 > var6) {
                var6 = var8.field6649;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class473 var12 = arg2[var11];
                byte[] var13 = var12.field6652;
                int var14 = var12.field6646;
                int var15 = var12.field6649;
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
            this.field1829 = class374.method2259(6406, var9, (byte) -70, var10, arg0, false, 6406, var9);
            this.field1828 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class473 var24 = arg2[var23];
                int[] var25 = var24.field6650;
                byte[] var26 = var24.field6648;
                byte[] var27 = var24.field6652;
                int var28 = var24.field6646;
                int var29 = var24.field6649;
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
            this.field1829 = class374.method2260(var9, arg0, var9, var22, -2026, false);
            this.field1828 = false;
        }
        this.field1829.method46(false);
        this.field1831 = new class433(arg0, 256);
        float var38 = this.field1829.field5341 / (float) this.field1829.field5338;
        float var39 = this.field1829.field5339 / (float) this.field1829.field5340;
        for (int var40 = 0; var40 < 256; var40++) {
            class473 var41 = arg2[var40];
            int var42 = var41.field6646;
            int var43 = var41.field6649;
            int var44 = var41.field6647;
            int var45 = var41.field6651;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field1831.method2589(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field1829.field5339 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field1829.field5339 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field1829.field5339 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field1829.field5339 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field1831.method2590();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(CIIIZ)V", line = 259)
    public final void method254(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field1830.field3342;
        this.field1830.method1390();
        this.field1830.method1379(this.field1829);
        if (this.field1828 || arg4) {
            this.field1830.method1360(7681, 8448);
            this.field1830.method1458(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1831.method2588(arg0);
        var6.glLoadIdentity();
        if (this.field1828 || arg4) {
            this.field1830.method1458(0, 5890, 768);
        }
    }
}
