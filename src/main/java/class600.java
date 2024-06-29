import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class600 extends class417 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Llj;")
    private class565 field8376;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lnea;")
    private class665 field8375;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Z")
    private boolean field8374;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lqm;")
    private class129 field8373;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Llj;Lvn;[Lqga;Z)V")
    public class600(class565 arg0, class283 arg1, class168[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8376 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class168 var54 = arg2[var6];
            if (var54.field2449 > var5) {
                var5 = var54.field2449;
            }
            if (var54.field2445 > var5) {
                var5 = var54.field2445;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class168 var10 = arg2[var9];
                int var11 = var10.field2449;
                int var12 = var10.field2445;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2447 == null) {
                    byte[] var17 = var10.field2450;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2447;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8375 = class128.method910(false, var7, var8, arg0, 6406, (byte) 115, var7, 6406);
            this.field8374 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class168 var39 = arg2[var24];
                int[] var40 = var39.field2442;
                byte[] var41 = var39.field2447;
                byte[] var42 = var39.field2450;
                int var43 = var39.field2449;
                int var44 = var39.field2445;
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
            this.field8375 = class125.method902(false, arg0, var7, var23, 34037, 0, var7, 0);
            this.field8374 = false;
        }
        this.field8375.method944((byte) -111, false);
        this.field8373 = new class129(arg0, 256);
        float var25 = this.field8375.field9325 / (float) this.field8375.field9321;
        float var26 = this.field8375.field9322 / (float) this.field8375.field9324;
        for (int var27 = 0; var27 < 256; var27++) {
            class168 var28 = arg2[var27];
            int var29 = var28.field2449;
            int var30 = var28.field2445;
            int var31 = var28.field2448;
            int var32 = var28.field2446;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8373.method919(var27, 4864);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8375.field9322 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8375.field9322 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8375.field9322 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8375.field9322 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8373.method915((byte) 95);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method1200(char arg0, int arg1, int arg2, int arg3, boolean arg4, class618 arg5, int arg6, int arg7) {
        class572 var9 = (class572) arg5;
        class665 var10 = var9.field8108;
        this.field8376.method3227((byte) 115);
        this.field8376.method3206(this.field8375, (byte) 26);
        if (this.field8374 || arg4) {
            this.field8376.method3210(7681, 56, 8448);
            this.field8376.method3164(34168, 0, (byte) 107, 768);
        } else {
            this.field8376.method3210(7681, -106, 7681);
        }
        this.field8376.method3220(0, 1);
        this.field8376.method3206(var10, (byte) 26);
        this.field8376.method3210(7681, -104, 8448);
        this.field8376.method3164(34168, 0, (byte) 127, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field9325 / (float) var10.field9321;
        float var12 = var10.field9322 / (float) var10.field9324;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8373.method918(1, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8376.method3164(5890, 0, (byte) 119, 768);
        this.field8376.method3210(8448, -123, 8448);
        this.field8376.method3206(null, (byte) 26);
        this.field8376.method3220(0, 0);
        if (this.field8374 || arg4) {
            this.field8376.method3164(5890, 0, (byte) 86, 768);
        }
    }

    @OriginalMember(owner = "client!lc", name = "OA", descriptor = "(CIIIZ)V")
    public final void method1202(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8376.method3227((byte) 110);
        this.field8376.method3206(this.field8375, (byte) 26);
        if (this.field8374 || arg4) {
            this.field8376.method3210(7681, 95, 8448);
            this.field8376.method3164(34168, 0, (byte) 89, 768);
        } else {
            this.field8376.method3210(7681, 76, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8373.method918(1, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8374 || arg4) {
            this.field8376.method3164(5890, 0, (byte) 82, 768);
        }
    }
}
