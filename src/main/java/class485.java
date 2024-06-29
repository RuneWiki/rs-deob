import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class485 extends class307 {

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "Lvd;")
    private class258 field7142;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "Lwq;")
    private class283 field7143;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Z")
    private boolean field7141;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "Lce;")
    private class328 field7144;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method1145(char arg0, int arg1, int arg2, int arg3, boolean arg4, class249 arg5, int arg6, int arg7) {
        class40 var9 = (class40) arg5;
        class283 var10 = var9.field527;
        this.field7142.method1607(true);
        this.field7142.method1546(-2, this.field7143);
        if (this.field7141 || arg4) {
            this.field7142.method1576(7681, 8448, (byte) -86);
            this.field7142.method1590(768, 34168, true, 0);
        }
        this.field7142.method1553(1, -8156);
        this.field7142.method1546(-2, var10);
        this.field7142.method1576(7681, 8448, (byte) 51);
        this.field7142.method1590(768, 34168, true, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4272 / (float) var10.field4273;
        float var12 = var10.field4283 / (float) var10.field4277;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7144.method2035(-124, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field7142.method1590(768, 5890, true, 0);
        this.field7142.method1576(8448, 8448, (byte) 71);
        this.field7142.method1546(-2, null);
        this.field7142.method1553(0, -8156);
        if (this.field7141 || arg4) {
            this.field7142.method1590(768, 5890, true, 0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "OA", descriptor = "(CIIIZ)V")
    public final void method1144(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7142.method1607(true);
        this.field7142.method1546(-2, this.field7143);
        if (this.field7141 || arg4) {
            this.field7142.method1576(7681, 8448, (byte) -118);
            this.field7142.method1590(768, 34168, true, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field7144.method2035(-105, arg0);
        OpenGL.glLoadIdentity();
        if (this.field7141 || arg4) {
            this.field7142.method1590(768, 5890, true, 0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lvd;Ldu;[Lul;Z)V")
    public class485(class258 arg0, class443 arg1, class319[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field7142 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class319 var50 = arg2[var6];
            if (var50.field4920 > var5) {
                var5 = var50.field4920;
            }
            if (var50.field4922 > var5) {
                var5 = var50.field4922;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class319 var10 = arg2[var9];
                byte[] var11 = var10.field4921;
                int var12 = var10.field4920;
                int var13 = var10.field4922;
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
            this.field7143 = class292.method1814(var7, 6406, 6406, var7, arg0, 3557, false, var8);
            this.field7141 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class319 var36 = arg2[var21];
                int[] var37 = var36.field4923;
                byte[] var38 = var36.field4917;
                byte[] var39 = var36.field4921;
                int var40 = var36.field4920;
                int var41 = var36.field4922;
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
            this.field7143 = class133.method981(3553, false, arg0, var7, var20, var7);
            this.field7141 = false;
        }
        this.field7143.method1693(false, (byte) 107);
        this.field7144 = new class328(arg0, 256);
        float var22 = this.field7143.field4272 / (float) this.field7143.field4273;
        float var23 = this.field7143.field4283 / (float) this.field7143.field4277;
        for (int var24 = 0; var24 < 256; var24++) {
            class319 var25 = arg2[var24];
            int var26 = var25.field4920;
            int var27 = var25.field4922;
            int var28 = var25.field4925;
            int var29 = var25.field4918;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field7144.method2036((byte) -107, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field7143.field4283 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field7143.field4283 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7143.field4283 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field7143.field4283 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field7144.method2041((byte) 33);
        }
    }
}
