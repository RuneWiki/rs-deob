import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class89 extends class488 {

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lbl;")
    private class442 field1607;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Ljs;")
    private class208 field1606;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Z")
    private boolean field1605;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lkq;")
    private class403 field1604;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbl;Lpm;[Lfd;Z)V")
    public class89(class442 arg0, class396 arg1, class351[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1607 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class351 var50 = arg2[var6];
            if (var50.field5168 > var5) {
                var5 = var50.field5168;
            }
            if (var50.field5166 > var5) {
                var5 = var50.field5166;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class351 var10 = arg2[var9];
                byte[] var11 = var10.field5173;
                int var12 = var10.field5168;
                int var13 = var10.field5166;
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
            this.field1606 = class67.method456(var7, 6406, var7, 6406, (byte) -93, arg0, false, var8);
            this.field1605 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class351 var36 = arg2[var21];
                int[] var37 = var36.field5169;
                byte[] var38 = var36.field5174;
                byte[] var39 = var36.field5173;
                int var40 = var36.field5168;
                int var41 = var36.field5166;
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
            this.field1606 = class170.method1069(0, var20, arg0, var7, false, var7);
            this.field1605 = false;
        }
        this.field1606.method1208(false, false);
        this.field1604 = new class403(arg0, 256);
        float var22 = this.field1606.field3252 / (float) this.field1606.field3255;
        float var23 = this.field1606.field3254 / (float) this.field1606.field3258;
        for (int var24 = 0; var24 < 256; var24++) {
            class351 var25 = arg2[var24];
            int var26 = var25.field5168;
            int var27 = var25.field5166;
            int var28 = var25.field5171;
            int var29 = var25.field5170;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field1604.method2390(var24, -32245);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field1606.field3254 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field1606.field3254 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1606.field3254 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1606.field3254 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field1604.method2391(-89);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(CIIIZLbe;II)V")
    public final void method662(char arg0, int arg1, int arg2, int arg3, boolean arg4, class28 arg5, int arg6, int arg7) {
        class475 var9 = (class475) arg5;
        class208 var10 = var9.field7249;
        this.field1607.method2633(-5);
        this.field1607.method2586(this.field1606, false);
        if (this.field1605 || arg4) {
            this.field1607.method2624((byte) 107, 8448, 7681);
            this.field1607.method2597(34168, (byte) 118, 768, 0);
        }
        this.field1607.method2582((byte) -50, 1);
        this.field1607.method2586(var10, false);
        this.field1607.method2624((byte) 107, 8448, 7681);
        this.field1607.method2597(34168, (byte) 117, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3252 / (float) var10.field3255;
        float var12 = var10.field3254 / (float) var10.field3258;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1604.method2392((byte) 0, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1607.method2597(5890, (byte) 83, 768, 0);
        this.field1607.method2624((byte) 107, 8448, 8448);
        this.field1607.method2586(null, false);
        this.field1607.method2582((byte) -54, 0);
        if (this.field1605 || arg4) {
            this.field1607.method2597(5890, (byte) 106, 768, 0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(CIIIZ)V")
    public final void method663(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1607.method2633(127);
        this.field1607.method2586(this.field1606, false);
        if (this.field1605 || arg4) {
            this.field1607.method2624((byte) 107, 8448, 7681);
            this.field1607.method2597(34168, (byte) 88, 768, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1604.method2392((byte) 0, arg0);
        OpenGL.glLoadIdentity();
        if (this.field1605 || arg4) {
            this.field1607.method2597(5890, (byte) -91, 768, 0);
        }
    }
}
