import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class309 extends class489 {

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "Lod;")
    private class349 field4444;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "Lwe;")
    private class279 field4446;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "Z")
    private boolean field4447;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Lbw;")
    private class483 field4445;

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lod;Lje;[Lgu;Z)V")
    public class309(class349 arg0, class275 arg1, class408[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4444 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class408 var50 = arg2[var6];
            if (var50.field6151 > var5) {
                var5 = var50.field6151;
            }
            if (var50.field6147 > var5) {
                var5 = var50.field6147;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class408 var10 = arg2[var9];
                byte[] var11 = var10.field6146;
                int var12 = var10.field6151;
                int var13 = var10.field6147;
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
            this.field4446 = class479.method2853(false, arg0, var7, (byte) 89, var7, 6406, 6406, var8);
            this.field4447 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class408 var36 = arg2[var21];
                int[] var37 = var36.field6152;
                byte[] var38 = var36.field6149;
                byte[] var39 = var36.field6146;
                int var40 = var36.field6151;
                int var41 = var36.field6147;
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
            this.field4446 = class226.method1535(var7, false, var7, arg0, 127, var20);
            this.field4447 = false;
        }
        this.field4446.method2683(false, 0);
        this.field4445 = new class483(arg0, 256);
        float var22 = this.field4446.field4017 / (float) this.field4446.field4021;
        float var23 = this.field4446.field4026 / (float) this.field4446.field4020;
        for (int var24 = 0; var24 < 256; var24++) {
            class408 var25 = arg2[var24];
            int var26 = var25.field6151;
            int var27 = var25.field6147;
            int var28 = var25.field6144;
            int var29 = var25.field6148;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field4445.method2869(var24, 107);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field4446.field4026 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field4446.field4026 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4446.field4026 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4446.field4026 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field4445.method2870(1952872654);
        }
    }

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "(CIIIZ)V")
    public final void method326(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4444.method2148((byte) -33);
        this.field4444.method2200(this.field4446, (byte) 114);
        if (this.field4447 || arg4) {
            this.field4444.method2131(34162, 8448, 7681);
            this.field4444.method2156(34168, 768, 2969, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4445.method2863(false, arg0);
        OpenGL.glLoadIdentity();
        if (this.field4447 || arg4) {
            this.field4444.method2156(5890, 768, 2969, 0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method325(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7) {
        class439 var9 = (class439) arg5;
        class279 var10 = var9.field6565;
        this.field4444.method2148((byte) -33);
        this.field4444.method2200(this.field4446, (byte) 113);
        if (this.field4447 || arg4) {
            this.field4444.method2131(34162, 8448, 7681);
            this.field4444.method2156(34168, 768, 2969, 0);
        }
        this.field4444.method2176(1, 71);
        this.field4444.method2200(var10, (byte) 122);
        this.field4444.method2131(34162, 8448, 7681);
        this.field4444.method2156(34168, 768, 2969, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4017 / (float) var10.field4021;
        float var12 = var10.field4026 / (float) var10.field4020;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4445.method2863(false, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4444.method2156(5890, 768, 2969, 0);
        this.field4444.method2131(34162, 8448, 8448);
        this.field4444.method2200(null, (byte) 125);
        this.field4444.method2176(0, 59);
        if (this.field4447 || arg4) {
            this.field4444.method2156(5890, 768, 2969, 0);
        }
    }
}
