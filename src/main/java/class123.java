import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class123 extends class195 {

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "Lap;")
    private class435 field1405;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "Lhea;")
    private class385 field1406;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "Z")
    private boolean field1407;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "Lgq;")
    private class470 field1404;

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lap;Led;[Laaa;Z)V")
    public class123(class435 arg0, class645 arg1, class563[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1405 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class563 var54 = arg2[var6];
            if (var54.field8005 > var5) {
                var5 = var54.field8005;
            }
            if (var54.field8002 > var5) {
                var5 = var54.field8002;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class563 var10 = arg2[var9];
                int var11 = var10.field8005;
                int var12 = var10.field8002;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8001 == null) {
                    byte[] var17 = var10.field8006;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8001;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field1406 = class387.method2118(false, var8, var7, arg0, 6406, 6406, var7, 34037);
            this.field1407 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class563 var39 = arg2[var24];
                int[] var40 = var39.field8000;
                byte[] var41 = var39.field8001;
                byte[] var42 = var39.field8006;
                int var43 = var39.field8005;
                int var44 = var39.field8002;
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
            this.field1406 = class472.method2681(arg0, (byte) -88, false, var23, var7, var7);
            this.field1407 = false;
        }
        this.field1406.method2233((byte) -99, false);
        this.field1404 = new class470(arg0, 256);
        float var25 = this.field1406.field5143 / (float) this.field1406.field5148;
        float var26 = this.field1406.field5147 / (float) this.field1406.field5151;
        for (int var27 = 0; var27 < 256; var27++) {
            class563 var28 = arg2[var27];
            int var29 = var28.field8005;
            int var30 = var28.field8002;
            int var31 = var28.field8007;
            int var32 = var28.field8004;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field1404.method2667(var27, -30923);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field1406.field5147 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field1406.field5147 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1406.field5147 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1406.field5147 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field1404.method2668(1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "(CIIIZ)V")
    public final void method13(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1405.method2354((byte) -125);
        this.field1405.method2388((byte) 95, this.field1406);
        if (this.field1407 || arg4) {
            this.field1405.method2371(7681, 8448, -126);
            this.field1405.method2372(0, false, 768, 34168);
        } else {
            this.field1405.method2371(7681, 7681, -95);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1404.method2666(arg0, (byte) 110);
        OpenGL.glLoadIdentity();
        if (this.field1407 || arg4) {
            this.field1405.method2372(0, false, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method17(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7) {
        class690 var9 = (class690) arg5;
        class385 var10 = var9.field9740;
        this.field1405.method2354((byte) -121);
        this.field1405.method2388((byte) 78, this.field1406);
        if (this.field1407 || arg4) {
            this.field1405.method2371(7681, 8448, -102);
            this.field1405.method2372(0, false, 768, 34168);
        } else {
            this.field1405.method2371(7681, 7681, -64);
        }
        this.field1405.method2380(1, (byte) -96);
        this.field1405.method2388((byte) 93, var10);
        this.field1405.method2371(7681, 8448, -115);
        this.field1405.method2372(0, false, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field5143 / (float) var10.field5148;
        float var12 = var10.field5147 / (float) var10.field5151;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1404.method2666(arg0, (byte) 110);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1405.method2372(0, false, 768, 5890);
        this.field1405.method2371(8448, 8448, -110);
        this.field1405.method2388((byte) 89, null);
        this.field1405.method2380(0, (byte) -103);
        if (this.field1407 || arg4) {
            this.field1405.method2372(0, false, 768, 5890);
        }
    }
}
