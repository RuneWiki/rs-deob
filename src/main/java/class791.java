import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class791 extends class67 {

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Lffa;")
    private class197 field11513;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "Lgda;")
    private class61 field11514;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Z")
    private boolean field11512;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Lbia;")
    private class524 field11515;

    @OriginalMember(owner = "client!ms", name = "fa", descriptor = "(CIIIZ)V", line = 7)
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field11513.method1708(81);
        this.field11513.method1733(this.field11514, 17237);
        if (this.field11512 || arg4) {
            this.field11513.method1684((byte) -61, 8448, 7681);
            this.field11513.method1739(34168, 0, (byte) 19, 768);
        } else {
            this.field11513.method1684((byte) -61, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field11515.method3971(0, arg0);
        OpenGL.glLoadIdentity();
        if (this.field11512 || arg4) {
            this.field11513.method1739(5890, 0, (byte) 19, 768);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(CIIIZLaa;II)V", line = 27)
    public final void method129(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
        class370 var9 = (class370) arg5;
        class61 var10 = var9.field5644;
        this.field11513.method1708(95);
        this.field11513.method1733(this.field11514, 17237);
        if (this.field11512 || arg4) {
            this.field11513.method1684((byte) -61, 8448, 7681);
            this.field11513.method1739(34168, 0, (byte) 19, 768);
        } else {
            this.field11513.method1684((byte) -61, 7681, 7681);
        }
        this.field11513.method1716(33984, 1);
        this.field11513.method1733(var10, 17237);
        this.field11513.method1684((byte) -61, 8448, 7681);
        this.field11513.method1739(34168, 0, (byte) 19, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field646 / (float) var10.field645;
        float var12 = var10.field644 / (float) var10.field640;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field11515.method3971(0, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field11513.method1739(5890, 0, (byte) 19, 768);
        this.field11513.method1684((byte) -61, 8448, 8448);
        this.field11513.method1733(null, 17237);
        this.field11513.method1716(33984, 0);
        if (this.field11512 || arg4) {
            this.field11513.method1739(5890, 0, (byte) 19, 768);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lffa;Llq;[Liga;Z)V", line = 72)
    public class791(class197 arg0, class578 arg1, class481[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field11513 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class481 var54 = arg2[var6];
            if (var54.field6977 > var5) {
                var5 = var54.field6977;
            }
            if (var54.field6970 > var5) {
                var5 = var54.field6970;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class481 var10 = arg2[var9];
                int var11 = var10.field6977;
                int var12 = var10.field6970;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field6973 == null) {
                    byte[] var17 = var10.field6975;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field6973;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field11514 = class329.method2784(6406, arg0, var7, var7, (byte) 53, var8, false, 6406);
            this.field11512 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class481 var39 = arg2[var24];
                int[] var40 = var39.field6969;
                byte[] var41 = var39.field6973;
                byte[] var42 = var39.field6975;
                int var43 = var39.field6977;
                int var44 = var39.field6970;
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
            this.field11514 = class216.method1883(0, var7, 9901, arg0, var23, var7, false, 0);
            this.field11512 = false;
        }
        this.field11514.method3923(25768, false);
        this.field11515 = new class524(arg0, 256);
        float var25 = this.field11514.field646 / (float) this.field11514.field645;
        float var26 = this.field11514.field644 / (float) this.field11514.field640;
        for (int var27 = 0; var27 < 256; var27++) {
            class481 var28 = arg2[var27];
            int var29 = var28.field6977;
            int var30 = var28.field6970;
            int var31 = var28.field6976;
            int var32 = var28.field6971;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field11515.method3972(var27, (byte) -107);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field11514.field644 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field11514.field644 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field11514.field644 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field11514.field644 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field11515.method3973(2);
        }
    }
}
