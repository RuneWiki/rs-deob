import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class193 extends class442 {

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Lpq;")
    private class194 field2389;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Liq;")
    private class227 field2388;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Z")
    private boolean field2391;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "Lup;")
    private class545 field2390;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method1190(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
        class339 var9 = (class339) arg5;
        class227 var10 = var9.field4913;
        this.field2389.method1212((byte) 111);
        this.field2389.method1219((byte) 111, this.field2388);
        if (this.field2391 || arg4) {
            this.field2389.method1230(8448, 7681, false);
            this.field2389.method1223(0, 111, 768, 34168);
        } else {
            this.field2389.method1230(7681, 7681, false);
        }
        this.field2389.method1262(1, 0);
        this.field2389.method1219((byte) 95, var10);
        this.field2389.method1230(8448, 7681, false);
        this.field2389.method1223(0, 50, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3440 / (float) var10.field3437;
        float var12 = var10.field3441 / (float) var10.field3442;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2390.method3226(6, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field2389.method1223(0, 36, 768, 5890);
        this.field2389.method1230(8448, 8448, false);
        this.field2389.method1219((byte) 70, null);
        this.field2389.method1262(0, 0);
        if (this.field2391 || arg4) {
            this.field2389.method1223(0, 112, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!al", name = "fa", descriptor = "(CIIIZ)V", line = 53)
    public final void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2389.method1212((byte) 109);
        this.field2389.method1219((byte) 98, this.field2388);
        if (this.field2391 || arg4) {
            this.field2389.method1230(8448, 7681, false);
            this.field2389.method1223(0, 120, 768, 34168);
        } else {
            this.field2389.method1230(7681, 7681, false);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2390.method3226(6, arg0);
        OpenGL.glLoadIdentity();
        if (this.field2391 || arg4) {
            this.field2389.method1223(0, 106, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lpq;Lhw;[Lfm;Z)V", line = 73)
    public class193(class194 arg0, class300 arg1, class279[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2389 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class279 var54 = arg2[var6];
            if (var54.field4008 > var5) {
                var5 = var54.field4008;
            }
            if (var54.field4014 > var5) {
                var5 = var54.field4014;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class279 var10 = arg2[var9];
                int var11 = var10.field4008;
                int var12 = var10.field4014;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field4009 == null) {
                    byte[] var17 = var10.field4010;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field4009;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field2388 = class179.method1136(6406, 6406, var7, false, var8, arg0, var7, -25900);
            this.field2391 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class279 var39 = arg2[var24];
                int[] var40 = var39.field4012;
                byte[] var41 = var39.field4009;
                byte[] var42 = var39.field4010;
                int var43 = var39.field4008;
                int var44 = var39.field4014;
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
            this.field2388 = class394.method2432(var23, var7, 0, arg0, -7072, 0, var7, false);
            this.field2391 = false;
        }
        this.field2388.method3201(true, false);
        this.field2390 = new class545(arg0, 256);
        float var25 = this.field2388.field3440 / (float) this.field2388.field3437;
        float var26 = this.field2388.field3441 / (float) this.field2388.field3442;
        for (int var27 = 0; var27 < 256; var27++) {
            class279 var28 = arg2[var27];
            int var29 = var28.field4008;
            int var30 = var28.field4014;
            int var31 = var28.field4011;
            int var32 = var28.field4016;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field2390.method3227(var27, (byte) -98);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field2388.field3441 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field2388.field3441 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2388.field3441 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2388.field3441 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field2390.method3225(63);
        }
    }
}
