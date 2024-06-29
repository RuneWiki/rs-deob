import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class296 extends class419 {

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "Lkga;")
    private class506 field3992;

    @OriginalMember(owner = "client!vv", name = "B", descriptor = "Leb;")
    private class577 field3995;

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "Z")
    private boolean field3993;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "Lqt;")
    private class588 field3994;

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lkga;Lgda;[Lpga;Z)V")
    public class296(class506 arg0, class50 arg1, class495[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3992 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class495 var54 = arg2[var6];
            if (var54.field6906 > var5) {
                var5 = var54.field6906;
            }
            if (var54.field6899 > var5) {
                var5 = var54.field6899;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class495 var10 = arg2[var9];
                int var11 = var10.field6906;
                int var12 = var10.field6899;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field6902 == null) {
                    byte[] var17 = var10.field6907;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field6902;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3995 = class703.method3942(var7, false, var7, 6406, arg0, 6406, var8, -127);
            this.field3993 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class495 var39 = arg2[var24];
                int[] var40 = var39.field6905;
                byte[] var41 = var39.field6902;
                byte[] var42 = var39.field6907;
                int var43 = var39.field6906;
                int var44 = var39.field6899;
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
            this.field3995 = class306.method1812((byte) -87, var7, var23, arg0, var7, false);
            this.field3993 = false;
        }
        this.field3995.method1211(false, (byte) 33);
        this.field3994 = new class588(arg0, 256);
        float var25 = this.field3995.field8429 / (float) this.field3995.field8432;
        float var26 = this.field3995.field8435 / (float) this.field3995.field8436;
        for (int var27 = 0; var27 < 256; var27++) {
            class495 var28 = arg2[var27];
            int var29 = var28.field6906;
            int var30 = var28.field6899;
            int var31 = var28.field6900;
            int var32 = var28.field6901;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3994.method3405(var27, (byte) 96);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3995.field8435 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3995.field8435 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3995.field8435 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3995.field8435 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3994.method3410(1);
        }
    }

    @OriginalMember(owner = "client!vv", name = "OA", descriptor = "(CIIIZ)V")
    public final void method1063(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3992.method2981(0);
        this.field3992.method2932(true, this.field3995);
        if (this.field3993 || arg4) {
            this.field3992.method2948(7681, 8448, (byte) 84);
            this.field3992.method2968(768, 0, (byte) -112, 34168);
        } else {
            this.field3992.method2948(7681, 7681, (byte) -124);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3994.method3409((byte) 127, arg0);
        OpenGL.glLoadIdentity();
        if (this.field3993 || arg4) {
            this.field3992.method2968(768, 0, (byte) -127, 5890);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method1064(char arg0, int arg1, int arg2, int arg3, boolean arg4, class616 arg5, int arg6, int arg7) {
        class681 var9 = (class681) arg5;
        class577 var10 = var9.field9752;
        this.field3992.method2981(0);
        this.field3992.method2932(true, this.field3995);
        if (this.field3993 || arg4) {
            this.field3992.method2948(7681, 8448, (byte) -112);
            this.field3992.method2968(768, 0, (byte) 59, 34168);
        } else {
            this.field3992.method2948(7681, 7681, (byte) -117);
        }
        this.field3992.method2975(1, 106);
        this.field3992.method2932(true, var10);
        this.field3992.method2948(7681, 8448, (byte) 17);
        this.field3992.method2968(768, 0, (byte) 39, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field8429 / (float) var10.field8432;
        float var12 = var10.field8435 / (float) var10.field8436;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3994.method3409((byte) 125, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3992.method2968(768, 0, (byte) -75, 5890);
        this.field3992.method2948(8448, 8448, (byte) 20);
        this.field3992.method2932(true, null);
        this.field3992.method2975(0, 103);
        if (this.field3993 || arg4) {
            this.field3992.method2968(768, 0, (byte) -88, 5890);
        }
    }
}
