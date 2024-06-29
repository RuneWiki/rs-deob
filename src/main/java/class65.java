import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class65 extends class319 {

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "Lih;")
    private class503 field820;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "Lwh;")
    private class102 field819;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "Z")
    private boolean field822;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "Lgk;")
    private class336 field821;

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lih;Lul;[Ldd;Z)V")
    public class65(class503 arg0, class411 arg1, class506[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field820 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class506 var50 = arg2[var6];
            if (var50.field7489 > var5) {
                var5 = var50.field7489;
            }
            if (var50.field7495 > var5) {
                var5 = var50.field7495;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class506 var10 = arg2[var9];
                byte[] var11 = var10.field7490;
                int var12 = var10.field7489;
                int var13 = var10.field7495;
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
            this.field819 = class418.method2477(arg0, var7, 6406, var7, false, false, 6406, var8);
            this.field822 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class506 var36 = arg2[var21];
                int[] var37 = var36.field7496;
                byte[] var38 = var36.field7493;
                byte[] var39 = var36.field7490;
                int var40 = var36.field7489;
                int var41 = var36.field7495;
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
            this.field819 = class362.method2134(var7, false, var20, (byte) -74, var7, arg0);
            this.field822 = false;
        }
        this.field819.method2762(9728, false);
        this.field821 = new class336(arg0, 256);
        float var22 = this.field819.field1354 / (float) this.field819.field1350;
        float var23 = this.field819.field1351 / (float) this.field819.field1349;
        for (int var24 = 0; var24 < 256; var24++) {
            class506 var25 = arg2[var24];
            int var26 = var25.field7489;
            int var27 = var25.field7495;
            int var28 = var25.field7492;
            int var29 = var25.field7497;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field821.method2012(4864, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field819.field1351 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field819.field1351 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field819.field1351 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field819.field1351 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field821.method2013(4864);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method480(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7) {
        class198 var9 = (class198) arg5;
        class102 var10 = var9.field2811;
        this.field820.method2979(-11597);
        this.field820.method2968(this.field819, -74);
        if (this.field822 || arg4) {
            this.field820.method2935((byte) 87, 8448, 7681);
            this.field820.method2969(0, 4611, 34168, 768);
        }
        this.field820.method2940(1, (byte) 96);
        this.field820.method2968(var10, -87);
        this.field820.method2935((byte) 87, 8448, 7681);
        this.field820.method2969(0, 4611, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1354 / (float) var10.field1350;
        float var12 = var10.field1351 / (float) var10.field1349;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field821.method2006(arg0, -14591);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field820.method2969(0, 4611, 5890, 768);
        this.field820.method2935((byte) 87, 8448, 8448);
        this.field820.method2968(null, -39);
        this.field820.method2940(0, (byte) 86);
        if (this.field822 || arg4) {
            this.field820.method2969(0, 4611, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "(CIIIZ)V")
    public final void method483(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field820.method2979(-11597);
        this.field820.method2968(this.field819, -96);
        if (this.field822 || arg4) {
            this.field820.method2935((byte) 87, 8448, 7681);
            this.field820.method2969(0, 4611, 34168, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field821.method2006(arg0, -14591);
        OpenGL.glLoadIdentity();
        if (this.field822 || arg4) {
            this.field820.method2969(0, 4611, 5890, 768);
        }
    }
}
