import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class628 extends class402 {

    @OriginalMember(owner = "client!im", name = "B", descriptor = "Ldw;")
    private class664 field8440;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "Lgv;")
    private class702 field8438;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "Z")
    private boolean field8441;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "Lhq;")
    private class367 field8439;

    @OriginalMember(owner = "client!im", name = "fa", descriptor = "(CIIIZ)V")
    public final void method829(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8440.method3672((byte) -101);
        this.field8440.method3681(this.field8438, 0);
        if (this.field8441 || arg4) {
            this.field8440.method3729((byte) 95, 7681, 8448);
            this.field8440.method3718(34168, 103, 768, 0);
        } else {
            this.field8440.method3729((byte) 95, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8439.method2315(true, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8441 || arg4) {
            this.field8440.method3718(5890, 123, 768, 0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method830(char arg0, int arg1, int arg2, int arg3, boolean arg4, class573 arg5, int arg6, int arg7) {
        class444 var9 = (class444) arg5;
        class702 var10 = var9.field6165;
        this.field8440.method3672((byte) -101);
        this.field8440.method3681(this.field8438, 0);
        if (this.field8441 || arg4) {
            this.field8440.method3729((byte) 95, 7681, 8448);
            this.field8440.method3718(34168, 95, 768, 0);
        } else {
            this.field8440.method3729((byte) 95, 7681, 7681);
        }
        this.field8440.method3738((byte) -63, 1);
        this.field8440.method3681(var10, 0);
        this.field8440.method3729((byte) 95, 7681, 8448);
        this.field8440.method3718(34168, 121, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field9791 / (float) var10.field9781;
        float var12 = var10.field9782 / (float) var10.field9793;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8439.method2315(true, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8440.method3718(5890, 126, 768, 0);
        this.field8440.method3729((byte) 95, 8448, 8448);
        this.field8440.method3681(null, 0);
        this.field8440.method3738((byte) -63, 0);
        if (this.field8441 || arg4) {
            this.field8440.method3718(5890, 127, 768, 0);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ldw;Lej;[Loia;Z)V")
    public class628(class664 arg0, class179 arg1, class52[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8440 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class52 var54 = arg2[var6];
            if (var54.field766 > var5) {
                var5 = var54.field766;
            }
            if (var54.field767 > var5) {
                var5 = var54.field767;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class52 var10 = arg2[var9];
                int var11 = var10.field766;
                int var12 = var10.field767;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field759 == null) {
                    byte[] var17 = var10.field763;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field759;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8438 = class457.method2792(var7, 6406, false, 6406, arg0, var7, 106, var8);
            this.field8441 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class52 var39 = arg2[var24];
                int[] var40 = var39.field760;
                byte[] var41 = var39.field759;
                byte[] var42 = var39.field763;
                int var43 = var39.field766;
                int var44 = var39.field767;
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
            this.field8438 = class324.method2078(true, 0, false, var23, arg0, var7, var7, 0);
            this.field8441 = false;
        }
        this.field8438.method3292(3, false);
        this.field8439 = new class367(arg0, 256);
        float var25 = this.field8438.field9791 / (float) this.field8438.field9781;
        float var26 = this.field8438.field9782 / (float) this.field8438.field9793;
        for (int var27 = 0; var27 < 256; var27++) {
            class52 var28 = arg2[var27];
            int var29 = var28.field766;
            int var30 = var28.field767;
            int var31 = var28.field761;
            int var32 = var28.field765;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8439.method2311(true, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8438.field9782 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8438.field9782 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8438.field9782 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8438.field9782 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8439.method2314((byte) -103);
        }
    }
}
