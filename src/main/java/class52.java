import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class52 extends class306 {

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "Lpg;")
    private class333 field752;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "Lgq;")
    private class241 field754;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "Z")
    private boolean field753;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "Llo;")
    private class365 field751;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method343(char arg0, int arg1, int arg2, int arg3, boolean arg4, class336 arg5, int arg6, int arg7) {
        class397 var9 = (class397) arg5;
        class241 var10 = var9.field5703;
        this.field752.method1993(1);
        this.field752.method1977(this.field754, true);
        if (this.field753 || arg4) {
            this.field752.method2023(7681, 8448, 2929);
            this.field752.method2040(false, 0, 768, 34168);
        }
        this.field752.method1990(false, 1);
        this.field752.method1977(var10, true);
        this.field752.method2023(7681, 8448, 2929);
        this.field752.method2040(false, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3329 / (float) var10.field3326;
        float var12 = var10.field3325 / (float) var10.field3324;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field751.method2183((byte) -41, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field752.method2040(false, 0, 768, 5890);
        this.field752.method2023(8448, 8448, 2929);
        this.field752.method1977(null, true);
        this.field752.method1990(false, 0);
        if (this.field753 || arg4) {
            this.field752.method2040(false, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "(CIIIZ)V")
    public final void method344(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field752.method1993(1);
        this.field752.method1977(this.field754, true);
        if (this.field753 || arg4) {
            this.field752.method2023(7681, 8448, 2929);
            this.field752.method2040(false, 0, 768, 34168);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field751.method2183((byte) -41, arg0);
        OpenGL.glLoadIdentity();
        if (this.field753 || arg4) {
            this.field752.method2040(false, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lpg;Lkt;[Lau;Z)V")
    public class52(class333 arg0, class61 arg1, class396[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field752 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class396 var50 = arg2[var6];
            if (var50.field5700 > var5) {
                var5 = var50.field5700;
            }
            if (var50.field5696 > var5) {
                var5 = var50.field5696;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class396 var10 = arg2[var9];
                byte[] var11 = var10.field5698;
                int var12 = var10.field5700;
                int var13 = var10.field5696;
                int var14 = var9 % 16 * var5;
                int var15 = var9 / 16 * var5;
                int var16 = var7 * var15 + var14;
                int var17 = 0;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        var8[var16++] = (byte) (var11[var17++] == 0 ? 0 : -1);
                    }
                    var16 += var7 - var13;
                }
            }
            this.field754 = class79.method612(var7, 6406, arg0, 34037, false, var7, 6406, var8);
            this.field753 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class396 var36 = arg2[var21];
                int[] var37 = var36.field5693;
                byte[] var38 = var36.field5695;
                byte[] var39 = var36.field5698;
                int var40 = var36.field5700;
                int var41 = var36.field5696;
                int var42 = var21 % 16 * var5;
                int var43 = var21 / 16 * var5;
                int var44 = var7 * var43 + var42;
                int var45 = 0;
                if (var38 == null) {
                    for (int var48 = 0; var48 < var40; var48++) {
                        for (int var49 = 0; var49 < var41; var49++) {
                            var20[var44++] = var37[var39[var45++] & 0xFF] | 0xFF000000;
                        }
                        var44 += var7 - var41;
                    }
                } else {
                    for (int var46 = 0; var46 < var40; var46++) {
                        for (int var47 = 0; var47 < var41; var47++) {
                            var20[var44++] = var38[var45] << 24 | var37[var39[var45] & 0xFF];
                            var45++;
                        }
                        var44 += var7 - var41;
                    }
                }
            }
            this.field754 = class100.method789(var20, var7, arg0, var7, false, -56);
            this.field753 = false;
        }
        this.field754.method928(115, false);
        this.field751 = new class365(arg0, 256);
        float var22 = this.field754.field3329 / (float) this.field754.field3326;
        float var23 = this.field754.field3325 / (float) this.field754.field3324;
        for (int var24 = 0; var24 < 256; var24++) {
            class396 var25 = arg2[var24];
            int var26 = var25.field5700;
            int var27 = var25.field5696;
            int var28 = var25.field5699;
            int var29 = var25.field5694;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field751.method2185(-46, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field754.field3325 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field754.field3325 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field754.field3325 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field754.field3325 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field751.method2186((byte) -118);
        }
    }
}
