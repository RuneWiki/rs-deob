import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class548 extends class201 {

    @OriginalMember(owner = "client!nw", name = "y", descriptor = "Ljaa;")
    private class576 field6876;

    @OriginalMember(owner = "client!nw", name = "A", descriptor = "Lhq;")
    private class148 field6878;

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "Z")
    private boolean field6877;

    @OriginalMember(owner = "client!nw", name = "x", descriptor = "Lqda;")
    private class93 field6875;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(CIIIZLfa;II)V", line = 5)
    public final void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, int arg6, int arg7) {
        class257 var9 = (class257) arg5;
        class148 var10 = var9.field3291;
        this.field6876.method3160((byte) -57);
        this.field6876.method3194((byte) 75, this.field6878);
        if (this.field6877 || arg4) {
            this.field6876.method3185(7681, 8448, (byte) -85);
            this.field6876.method3175(34168, 1, 0, 768);
        } else {
            this.field6876.method3185(7681, 7681, (byte) -45);
        }
        this.field6876.method3126(1, -65);
        this.field6876.method3194((byte) 75, var10);
        this.field6876.method3185(7681, 8448, (byte) -112);
        this.field6876.method3175(34168, 1, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1768 / (float) var10.field1767;
        float var12 = var10.field1762 / (float) var10.field1769;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6875.method688((byte) 123, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6876.method3175(5890, 1, 0, 768);
        this.field6876.method3185(8448, 8448, (byte) 79);
        this.field6876.method3194((byte) 75, null);
        this.field6876.method3126(0, -85);
        if (this.field6877 || arg4) {
            this.field6876.method3175(5890, 1, 0, 768);
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Ljaa;Lub;[Liba;Z)V", line = 49)
    public class548(class576 arg0, class20 arg1, class495[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6876 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class495 var54 = arg2[var6];
            if (var54.field6195 > var5) {
                var5 = var54.field6195;
            }
            if (var54.field6193 > var5) {
                var5 = var54.field6193;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class495 var10 = arg2[var9];
                int var11 = var10.field6195;
                int var12 = var10.field6193;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field6189 == null) {
                    byte[] var17 = var10.field6191;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field6189;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6878 = class383.method2204(false, var8, false, var7, 6406, 6406, var7, arg0);
            this.field6877 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class495 var39 = arg2[var24];
                int[] var40 = var39.field6187;
                byte[] var41 = var39.field6189;
                byte[] var42 = var39.field6191;
                int var43 = var39.field6195;
                int var44 = var39.field6193;
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
            this.field6878 = class216.method1254((byte) 10, var23, var7, false, arg0, var7);
            this.field6877 = false;
        }
        this.field6878.method1101(10240, false);
        this.field6875 = new class93(arg0, 256);
        float var25 = this.field6878.field1768 / (float) this.field6878.field1767;
        float var26 = this.field6878.field1762 / (float) this.field6878.field1769;
        for (int var27 = 0; var27 < 256; var27++) {
            class495 var28 = arg2[var27];
            int var29 = var28.field6195;
            int var30 = var28.field6193;
            int var31 = var28.field6192;
            int var32 = var28.field6190;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6875.method684(var27, (byte) -128);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6878.field1762 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6878.field1762 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6878.field1762 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6878.field1762 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6875.method690(true);
        }
    }

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "(CIIIZ)V", line = 289)
    public final void method53(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6876.method3160((byte) -91);
        this.field6876.method3194((byte) 75, this.field6878);
        if (this.field6877 || arg4) {
            this.field6876.method3185(7681, 8448, (byte) -45);
            this.field6876.method3175(34168, 1, 0, 768);
        } else {
            this.field6876.method3185(7681, 7681, (byte) 76);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6875.method688((byte) 100, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6877 || arg4) {
            this.field6876.method3175(5890, 1, 0, 768);
        }
    }
}
