import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class447 extends class490 {

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Lht;")
    private class410 field6469;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lcq;")
    private class325 field6471;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Z")
    private boolean field6472;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Lwu;")
    private class250 field6470;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "(CIIIZ)V")
    public final void method544(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6469.method2406((byte) 117);
        this.field6469.method2412((byte) 4, this.field6471);
        if (this.field6472 || arg4) {
            this.field6469.method2383(7681, 62, 8448);
            this.field6469.method2362(34168, (byte) 65, 768, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6470.method1473(-2, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6472 || arg4) {
            this.field6469.method2362(5890, (byte) 65, 768, 0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lht;Lgv;[Lmp;Z)V")
    public class447(class410 arg0, class56 arg1, class531[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6469 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class531 var50 = arg2[var6];
            if (var50.field7815 > var5) {
                var5 = var50.field7815;
            }
            if (var50.field7821 > var5) {
                var5 = var50.field7821;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class531 var10 = arg2[var9];
                byte[] var11 = var10.field7817;
                int var12 = var10.field7815;
                int var13 = var10.field7821;
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
            this.field6471 = class288.method1647(var7, var8, 6406, 6406, (byte) 21, arg0, var7, false);
            this.field6472 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class531 var36 = arg2[var21];
                int[] var37 = var36.field7816;
                byte[] var38 = var36.field7813;
                byte[] var39 = var36.field7817;
                int var40 = var36.field7815;
                int var41 = var36.field7821;
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
            this.field6471 = class178.method1086(var7, false, var7, (byte) -126, arg0, var20);
            this.field6472 = false;
        }
        this.field6471.method1132(false, (byte) 62);
        this.field6470 = new class250(arg0, 256);
        float var22 = this.field6471.field4467 / (float) this.field6471.field4461;
        float var23 = this.field6471.field4466 / (float) this.field6471.field4470;
        for (int var24 = 0; var24 < 256; var24++) {
            class531 var25 = arg2[var24];
            int var26 = var25.field7815;
            int var27 = var25.field7821;
            int var28 = var25.field7820;
            int var29 = var25.field7814;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field6470.method1471(2, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field6471.field4466 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field6471.field4466 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field6471.field4466 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field6471.field4466 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field6470.method1475(17);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method547(char arg0, int arg1, int arg2, int arg3, boolean arg4, class382 arg5, int arg6, int arg7) {
        class482 var9 = (class482) arg5;
        class325 var10 = var9.field7073;
        this.field6469.method2406((byte) 119);
        this.field6469.method2412((byte) 4, this.field6471);
        if (this.field6472 || arg4) {
            this.field6469.method2383(7681, 66, 8448);
            this.field6469.method2362(34168, (byte) 65, 768, 0);
        }
        this.field6469.method2398(1, (byte) -60);
        this.field6469.method2412((byte) 4, var10);
        this.field6469.method2383(7681, 124, 8448);
        this.field6469.method2362(34168, (byte) 65, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4467 / (float) var10.field4461;
        float var12 = var10.field4466 / (float) var10.field4470;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6470.method1473(-2, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6469.method2362(5890, (byte) 65, 768, 0);
        this.field6469.method2383(8448, 96, 8448);
        this.field6469.method2412((byte) 4, null);
        this.field6469.method2398(0, (byte) -30);
        if (this.field6472 || arg4) {
            this.field6469.method2362(5890, (byte) 65, 768, 0);
        }
    }
}
