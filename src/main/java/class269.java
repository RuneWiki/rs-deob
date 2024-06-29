import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class269 extends class259 {

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "Ljj;")
    private class66 field3963;

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "Log;")
    private class98 field3962;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "Z")
    private boolean field3961;

    @OriginalMember(owner = "client!taa", name = "y", descriptor = "Lab;")
    private class290 field3964;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(CIIIZLpa;II)V", line = 5)
    public final void method808(char arg0, int arg1, int arg2, int arg3, boolean arg4, class593 arg5, int arg6, int arg7) {
        class435 var9 = (class435) arg5;
        class98 var10 = var9.field6382;
        this.field3963.method625((byte) 125);
        this.field3963.method648(-93, this.field3962);
        if (this.field3961 || arg4) {
            this.field3963.method656(-12645, 8448, 7681);
            this.field3963.method607(34168, 0, 768, 93);
        } else {
            this.field3963.method656(-12645, 7681, 7681);
        }
        this.field3963.method654(false, 1);
        this.field3963.method648(69, var10);
        this.field3963.method656(-12645, 8448, 7681);
        this.field3963.method607(34168, 0, 768, -119);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1705 / (float) var10.field1704;
        float var12 = var10.field1702 / (float) var10.field1701;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3964.method1835((byte) -70, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3963.method607(5890, 0, 768, 68);
        this.field3963.method656(-12645, 8448, 8448);
        this.field3963.method648(89, null);
        this.field3963.method654(false, 0);
        if (this.field3961 || arg4) {
            this.field3963.method607(5890, 0, 768, -119);
        }
    }

    @OriginalMember(owner = "client!taa", name = "HA", descriptor = "(CIIIZ)V", line = 55)
    public final void method807(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3963.method625((byte) 103);
        this.field3963.method648(-125, this.field3962);
        if (this.field3961 || arg4) {
            this.field3963.method656(-12645, 8448, 7681);
            this.field3963.method607(34168, 0, 768, 68);
        } else {
            this.field3963.method656(-12645, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3964.method1835((byte) 92, arg0);
        OpenGL.glLoadIdentity();
        if (this.field3961 || arg4) {
            this.field3963.method607(5890, 0, 768, 94);
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljj;Lrl;[Lfba;Z)V", line = 74)
    public class269(class66 arg0, class633 arg1, class518[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3963 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class518 var54 = arg2[var6];
            if (var54.field7195 > var5) {
                var5 = var54.field7195;
            }
            if (var54.field7202 > var5) {
                var5 = var54.field7202;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class518 var10 = arg2[var9];
                int var11 = var10.field7195;
                int var12 = var10.field7202;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field7196 == null) {
                    byte[] var17 = var10.field7197;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field7196;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3962 = class5.method12(6406, 6406, arg0, var7, true, false, var8, var7);
            this.field3961 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class518 var39 = arg2[var24];
                int[] var40 = var39.field7198;
                byte[] var41 = var39.field7196;
                byte[] var42 = var39.field7197;
                int var43 = var39.field7195;
                int var44 = var39.field7202;
                int var45 = var24 % 16 * var5;
                int var46 = var24 / 16 * var5;
                int var47 = var7 * var46 + var45;
                int var48 = 0;
                if (var41 == null) {
                    for (int var51 = 0; var51 < var43; var51++) {
                        for (int var52 = 0; var52 < var44; var52++) {
                            byte var53;
                            if ((var53 = var42[var48++]) == 0) {
                                var47++;
                            } else {
                                var23[var47++] = var40[var53 & 0xFF] | 0xFF000000;
                            }
                        }
                        var47 += var7 - var44;
                    }
                } else {
                    for (int var49 = 0; var49 < var43; var49++) {
                        for (int var50 = 0; var50 < var44; var50++) {
                            var23[var47++] = var41[var48] << 24 | var40[var42[var48] & 0xFF];
                            var48++;
                        }
                        var47 += var7 - var44;
                    }
                }
            }
            this.field3962 = class503.method2850(0, var7, arg0, var23, false, var7);
            this.field3961 = false;
        }
        this.field3962.method1490((byte) 103, false);
        this.field3964 = new class290(arg0, 256);
        float var25 = this.field3962.field1705 / (float) this.field3962.field1704;
        float var26 = this.field3962.field1702 / (float) this.field3962.field1701;
        for (int var27 = 0; var27 < 256; var27++) {
            class518 var28 = arg2[var27];
            int var29 = var28.field7195;
            int var30 = var28.field7202;
            int var31 = var28.field7200;
            int var32 = var28.field7199;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3964.method1833((byte) 101, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3962.field1702 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3962.field1702 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3962.field1702 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3962.field1702 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3964.method1838(0);
        }
    }
}
