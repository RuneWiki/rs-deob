import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class219 extends class268 {

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "Lnq;")
    private class325 field3065;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "Lld;")
    private class116 field3066;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
    private boolean field3064;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "Lhq;")
    private class110 field3067;

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lnq;Lju;[Lmn;Z)V", line = 5)
    public class219(class325 arg0, class82 arg1, class252[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3065 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class252 var50 = arg2[var6];
            if (var50.field3513 > var5) {
                var5 = var50.field3513;
            }
            if (var50.field3512 > var5) {
                var5 = var50.field3512;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class252 var10 = arg2[var9];
                byte[] var11 = var10.field3506;
                int var12 = var10.field3513;
                int var13 = var10.field3512;
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
            this.field3066 = class194.method1312(var7, 6406, 43, arg0, var7, 6406, var8, false);
            this.field3064 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class252 var36 = arg2[var21];
                int[] var37 = var36.field3508;
                byte[] var38 = var36.field3511;
                byte[] var39 = var36.field3506;
                int var40 = var36.field3513;
                int var41 = var36.field3512;
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
            this.field3066 = class208.method1430(var7, arg0, -118, false, var7, var20);
            this.field3064 = false;
        }
        this.field3066.method3176(false, false);
        this.field3067 = new class110(arg0, 256);
        float var22 = this.field3066.field1602 / (float) this.field3066.field1594;
        float var23 = this.field3066.field1598 / (float) this.field3066.field1595;
        for (int var24 = 0; var24 < 256; var24++) {
            class252 var25 = arg2[var24];
            int var26 = var25.field3513;
            int var27 = var25.field3512;
            int var28 = var25.field3505;
            int var29 = var25.field3509;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field3067.method694(4864, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field3066.field1598 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field3066.field1598 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3066.field1598 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field3066.field1598 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field3067.method691(-114);
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(CIIIZ)V", line = 213)
    public final void method164(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3065.method2072(0);
        this.field3065.method2075(this.field3066, 0);
        if (this.field3064 || arg4) {
            this.field3065.method2030(7681, 8448, (byte) 71);
            this.field3065.method2059(34168, 768, 0, -31277);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3067.method693((byte) 104, arg0);
        OpenGL.glLoadIdentity();
        if (this.field3064 || arg4) {
            this.field3065.method2059(5890, 768, 0, -31277);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(CIIIZLi;II)V", line = 231)
    public final void method161(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7) {
        class261 var9 = (class261) arg5;
        class116 var10 = var9.field3678;
        this.field3065.method2072(0);
        this.field3065.method2075(this.field3066, 0);
        if (this.field3064 || arg4) {
            this.field3065.method2030(7681, 8448, (byte) 71);
            this.field3065.method2059(34168, 768, 0, -31277);
        }
        this.field3065.method2040((byte) 17, 1);
        this.field3065.method2075(var10, 0);
        this.field3065.method2030(7681, 8448, (byte) 71);
        this.field3065.method2059(34168, 768, 0, -31277);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1602 / (float) var10.field1594;
        float var12 = var10.field1598 / (float) var10.field1595;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3067.method693((byte) 118, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3065.method2059(5890, 768, 0, -31277);
        this.field3065.method2030(8448, 8448, (byte) 71);
        this.field3065.method2075(null, 0);
        this.field3065.method2040((byte) -87, 0);
        if (this.field3064 || arg4) {
            this.field3065.method2059(5890, 768, 0, -31277);
        }
    }
}
