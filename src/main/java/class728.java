import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class728 extends class60 {

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Lrda;")
    private class663 field10102;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "Lqd;")
    private class452 field10103;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "Z")
    private boolean field10104;

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "Lvi;")
    private class540 field10105;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method115(char arg0, int arg1, int arg2, int arg3, boolean arg4, class490 arg5, int arg6, int arg7) {
        class495 var9 = (class495) arg5;
        class452 var10 = var9.field6674;
        this.field10102.method3594(17776);
        this.field10102.method3639(-2, this.field10103);
        if (this.field10104 || arg4) {
            this.field10102.method3608(123, 8448, 7681);
            this.field10102.method3661(768, 34168, 0, (byte) 4);
        } else {
            this.field10102.method3608(-124, 7681, 7681);
        }
        this.field10102.method3630(true, 1);
        this.field10102.method3639(-2, var10);
        this.field10102.method3608(125, 8448, 7681);
        this.field10102.method3661(768, 34168, 0, (byte) 4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6183 / (float) var10.field6178;
        float var12 = var10.field6181 / (float) var10.field6180;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10105.method3013((byte) 104, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field10102.method3661(768, 5890, 0, (byte) 4);
        this.field10102.method3608(-46, 8448, 8448);
        this.field10102.method3639(-2, null);
        this.field10102.method3630(true, 0);
        if (this.field10104 || arg4) {
            this.field10102.method3661(768, 5890, 0, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lrda;Lrc;[Ljn;Z)V", line = 50)
    public class728(class663 arg0, class539 arg1, class720[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field10102 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class720 var54 = arg2[var6];
            if (var54.field10029 > var5) {
                var5 = var54.field10029;
            }
            if (var54.field10028 > var5) {
                var5 = var54.field10028;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class720 var10 = arg2[var9];
                int var11 = var10.field10029;
                int var12 = var10.field10028;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field10030 == null) {
                    byte[] var17 = var10.field10023;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field10030;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field10103 = class519.method2882(false, var8, arg0, 6406, 6406, var7, var7, -52);
            this.field10104 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class720 var39 = arg2[var24];
                int[] var40 = var39.field10027;
                byte[] var41 = var39.field10030;
                byte[] var42 = var39.field10023;
                int var43 = var39.field10029;
                int var44 = var39.field10028;
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
            this.field10103 = class244.method1518(var7, 0, 98, false, var23, 0, var7, arg0);
            this.field10104 = false;
        }
        this.field10103.method2615(false, false);
        this.field10105 = new class540(arg0, 256);
        float var25 = this.field10103.field6183 / (float) this.field10103.field6178;
        float var26 = this.field10103.field6181 / (float) this.field10103.field6180;
        for (int var27 = 0; var27 < 256; var27++) {
            class720 var28 = arg2[var27];
            int var29 = var28.field10029;
            int var30 = var28.field10028;
            int var31 = var28.field10031;
            int var32 = var28.field10024;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field10105.method3012(-99, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field10103.field6181 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field10103.field6181 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10103.field6181 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10103.field6181 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field10105.method3015((byte) 26);
        }
    }

    @OriginalMember(owner = "client!aca", name = "fa", descriptor = "(CIIIZ)V", line = 289)
    public final void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10102.method3594(17776);
        this.field10102.method3639(-2, this.field10103);
        if (this.field10104 || arg4) {
            this.field10102.method3608(122, 8448, 7681);
            this.field10102.method3661(768, 34168, 0, (byte) 4);
        } else {
            this.field10102.method3608(118, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10105.method3013((byte) 95, arg0);
        OpenGL.glLoadIdentity();
        if (this.field10104 || arg4) {
            this.field10102.method3661(768, 5890, 0, (byte) 4);
        }
    }
}
