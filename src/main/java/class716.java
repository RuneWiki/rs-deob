import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class716 extends class400 {

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Lrs;")
    private class166 field10051;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "Lsb;")
    private class89 field10053;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Z")
    private boolean field10052;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "Liw;")
    private class607 field10050;

    @OriginalMember(owner = "client!ks", name = "fa", descriptor = "(CIIIZ)V", line = 5)
    public final void method492(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10051.method1324((byte) 12);
        this.field10051.method1306(this.field10053, 118);
        if (this.field10052 || arg4) {
            this.field10051.method1256(8448, -4, 7681);
            this.field10051.method1239(0, 34168, 768, 768);
        } else {
            this.field10051.method1256(7681, -4, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10050.method3477((byte) 112, arg0);
        OpenGL.glLoadIdentity();
        if (this.field10052 || arg4) {
            this.field10051.method1239(0, 5890, 768, 768);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lrs;Lpia;[Lgu;Z)V", line = 25)
    public class716(class166 arg0, class54 arg1, class726[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field10051 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class726 var54 = arg2[var6];
            if (var54.field10186 > var5) {
                var5 = var54.field10186;
            }
            if (var54.field10184 > var5) {
                var5 = var54.field10184;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class726 var10 = arg2[var9];
                int var11 = var10.field10186;
                int var12 = var10.field10184;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field10185 == null) {
                    byte[] var17 = var10.field10181;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field10185;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field10053 = class582.method3357(var7, 6406, 6406, arg0, 0, var8, var7, false);
            this.field10052 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class726 var39 = arg2[var24];
                int[] var40 = var39.field10183;
                byte[] var41 = var39.field10185;
                byte[] var42 = var39.field10181;
                int var43 = var39.field10186;
                int var44 = var39.field10184;
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
            this.field10053 = class613.method3499(var7, var7, false, var23, arg0, 122, 0, 0);
            this.field10052 = false;
        }
        this.field10053.method2967(true, false);
        this.field10050 = new class607(arg0, 256);
        float var25 = this.field10053.field1360 / (float) this.field10053.field1356;
        float var26 = this.field10053.field1359 / (float) this.field10053.field1357;
        for (int var27 = 0; var27 < 256; var27++) {
            class726 var28 = arg2[var27];
            int var29 = var28.field10186;
            int var30 = var28.field10184;
            int var31 = var28.field10182;
            int var32 = var28.field10179;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field10050.method3481(98, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field10053.field1359 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field10053.field1359 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10053.field1359 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field10053.field1359 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field10050.method3479((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(CIIIZLaa;II)V", line = 264)
    public final void method491(char arg0, int arg1, int arg2, int arg3, boolean arg4, class570 arg5, int arg6, int arg7) {
        class229 var9 = (class229) arg5;
        class89 var10 = var9.field3704;
        this.field10051.method1324((byte) 12);
        this.field10051.method1306(this.field10053, 60);
        if (this.field10052 || arg4) {
            this.field10051.method1256(8448, -4, 7681);
            this.field10051.method1239(0, 34168, 768, 768);
        } else {
            this.field10051.method1256(7681, -4, 7681);
        }
        this.field10051.method1298(1, (byte) -124);
        this.field10051.method1306(var10, 37);
        this.field10051.method1256(8448, -4, 7681);
        this.field10051.method1239(0, 34168, 768, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1360 / (float) var10.field1356;
        float var12 = var10.field1359 / (float) var10.field1357;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field10050.method3477((byte) 65, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field10051.method1239(0, 5890, 768, 768);
        this.field10051.method1256(8448, -4, 8448);
        this.field10051.method1306(null, 40);
        this.field10051.method1298(0, (byte) -124);
        if (this.field10052 || arg4) {
            this.field10051.method1239(0, 5890, 768, 768);
        }
    }
}
