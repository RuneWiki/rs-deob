import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class514 extends class314 {

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Lfd;")
    private class365 field7573;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Lps;")
    private class63 field7572;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
    private boolean field7571;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Lct;")
    private class98 field7574;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lfd;Lgt;[Lbb;Z)V", line = 7)
    public class514(class365 arg0, class316 arg1, class218[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7573 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class218 var50 = arg2[var6];
            if (var50.field3139 > var5) {
                var5 = var50.field3139;
            }
            if (var50.field3140 > var5) {
                var5 = var50.field3140;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class218 var10 = arg2[var9];
                byte[] var11 = var10.field3141;
                int var12 = var10.field3139;
                int var13 = var10.field3140;
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
            this.field7572 = class482.method2907(false, (byte) -115, var8, arg0, var7, var7, 6406, 6406);
            this.field7571 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class218 var36 = arg2[var21];
                int[] var37 = var36.field3144;
                byte[] var38 = var36.field3145;
                byte[] var39 = var36.field3141;
                int var40 = var36.field3139;
                int var41 = var36.field3140;
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
            this.field7572 = class8.method53(arg0, var7, var20, false, var7, -1);
            this.field7571 = false;
        }
        this.field7572.method2421(122, false);
        this.field7574 = new class98(arg0, 256);
        float var22 = this.field7572.field749 / (float) this.field7572.field743;
        float var23 = this.field7572.field746 / (float) this.field7572.field748;
        for (int var24 = 0; var24 < 256; var24++) {
            class218 var25 = arg2[var24];
            int var26 = var25.field3139;
            int var27 = var25.field3140;
            int var28 = var25.field3146;
            int var29 = var25.field3142;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field7574.method833(var24, true);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field7572.field746 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field7572.field746 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7572.field746 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7572.field746 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field7574.method834((byte) 39);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(CIIIZLma;II)V", line = 211)
    public final void method41(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        class95 var9 = (class95) arg5;
        class63 var10 = var9.field1285;
        this.field7573.method2212(1);
        this.field7573.method2188((byte) 78, this.field7572);
        if (this.field7571 || arg4) {
            this.field7573.method2195(7681, 8448, true);
            this.field7573.method2228((byte) 79, 0, 768, 34168);
        }
        this.field7573.method2219(1, -122);
        this.field7573.method2188((byte) 78, var10);
        this.field7573.method2195(7681, 8448, true);
        this.field7573.method2228((byte) 79, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field749 / (float) var10.field743;
        float var12 = var10.field746 / (float) var10.field748;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7574.method832(arg0, -1);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field7573.method2228((byte) 79, 0, 768, 5890);
        this.field7573.method2195(8448, 8448, true);
        this.field7573.method2188((byte) 78, null);
        this.field7573.method2219(0, -122);
        if (this.field7571 || arg4) {
            this.field7573.method2228((byte) 79, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!fm", name = "OA", descriptor = "(CIIIZ)V", line = 256)
    public final void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7573.method2212(1);
        this.field7573.method2188((byte) 78, this.field7572);
        if (this.field7571 || arg4) {
            this.field7573.method2195(7681, 8448, true);
            this.field7573.method2228((byte) 79, 0, 768, 34168);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7574.method832(arg0, -1);
        OpenGL.glLoadIdentity();
        if (this.field7571 || arg4) {
            this.field7573.method2228((byte) 79, 0, 768, 5890);
        }
    }
}
