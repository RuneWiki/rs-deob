import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class376 extends class488 {

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Lqg;")
    private class321 field5621;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lls;")
    private class92 field5622;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Z")
    private boolean field5620;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lcn;")
    private class356 field5623;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lqg;Lds;[Ldt;Z)V")
    public class376(class321 arg0, class12 arg1, class158[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5621 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class158 var50 = arg2[var6];
            if (var50.field2388 > var5) {
                var5 = var50.field2388;
            }
            if (var50.field2391 > var5) {
                var5 = var50.field2391;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class158 var10 = arg2[var9];
                byte[] var11 = var10.field2384;
                int var12 = var10.field2388;
                int var13 = var10.field2391;
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
            this.field5622 = class168.method1192(53, arg0, 6406, var7, false, 6406, var7, var8);
            this.field5620 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class158 var36 = arg2[var21];
                int[] var37 = var36.field2386;
                byte[] var38 = var36.field2390;
                byte[] var39 = var36.field2384;
                int var40 = var36.field2388;
                int var41 = var36.field2391;
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
            this.field5622 = class440.method2668(false, var7, var7, 3553, var20, arg0);
            this.field5620 = false;
        }
        this.field5622.method2673(94, false);
        this.field5623 = new class356(arg0, 256);
        float var22 = this.field5622.field1513 / (float) this.field5622.field1522;
        float var23 = this.field5622.field1517 / (float) this.field5622.field1520;
        for (int var24 = 0; var24 < 256; var24++) {
            class158 var25 = arg2[var24];
            int var26 = var25.field2388;
            int var27 = var25.field2391;
            int var28 = var25.field2385;
            int var29 = var25.field2392;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field5623.method2295(var24, (byte) 117);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field5622.field1517 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field5622.field1517 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5622.field1517 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5622.field1517 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field5623.method2296(-101);
        }
    }

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "(CIIIZ)V")
    public final void method598(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5621.method2017(-5);
        this.field5621.method2042(this.field5622, 0);
        if (this.field5620 || arg4) {
            this.field5621.method2070(111, 8448, 7681);
            this.field5621.method2053(84, 0, 34168, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5623.method2298(arg0, 0);
        OpenGL.glLoadIdentity();
        if (this.field5620 || arg4) {
            this.field5621.method2053(-113, 0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method599(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7) {
        class124 var9 = (class124) arg5;
        class92 var10 = var9.field1919;
        this.field5621.method2017(-5);
        this.field5621.method2042(this.field5622, 0);
        if (this.field5620 || arg4) {
            this.field5621.method2070(97, 8448, 7681);
            this.field5621.method2053(-128, 0, 34168, 768);
        }
        this.field5621.method2030(1, (byte) -121);
        this.field5621.method2042(var10, 0);
        this.field5621.method2070(108, 8448, 7681);
        this.field5621.method2053(33, 0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1513 / (float) var10.field1522;
        float var12 = var10.field1517 / (float) var10.field1520;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5623.method2298(arg0, 0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5621.method2053(-120, 0, 5890, 768);
        this.field5621.method2070(105, 8448, 8448);
        this.field5621.method2042(null, 0);
        this.field5621.method2030(0, (byte) 14);
        if (this.field5620 || arg4) {
            this.field5621.method2053(103, 0, 5890, 768);
        }
    }
}
