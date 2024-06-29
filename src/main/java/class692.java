import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class692 extends class420 {

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lck;")
    private class733 field8891;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Lrc;")
    private class59 field8889;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
    private boolean field8890;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Lnc;")
    private class516 field8892;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(CIIIZLaa;II)V", line = 4)
    public final void method1039(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
        class787 var9 = (class787) arg5;
        class59 var10 = var9.field10781;
        this.field8891.method3924(90);
        this.field8891.method3975((byte) 113, this.field8889);
        if (this.field8890 || arg4) {
            this.field8891.method3917(124, 7681, 8448);
            this.field8891.method3954(0, 768, 34168, (byte) 103);
        } else {
            this.field8891.method3917(41, 7681, 7681);
        }
        this.field8891.method3945(1, false);
        this.field8891.method3975((byte) 112, var10);
        this.field8891.method3917(41, 7681, 8448);
        this.field8891.method3954(0, 768, 34168, (byte) 127);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field772 / (float) var10.field770;
        float var12 = var10.field768 / (float) var10.field771;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8892.method2855(4864, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8891.method3954(0, 768, 5890, (byte) 123);
        this.field8891.method3917(20, 8448, 8448);
        this.field8891.method3975((byte) 125, null);
        this.field8891.method3945(0, false);
        if (this.field8890 || arg4) {
            this.field8891.method3954(0, 768, 5890, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lck;Lne;[Lvi;Z)V", line = 49)
    public class692(class733 arg0, class166 arg1, class388[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8891 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class388 var54 = arg2[var6];
            if (var54.field4946 > var5) {
                var5 = var54.field4946;
            }
            if (var54.field4950 > var5) {
                var5 = var54.field4950;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class388 var10 = arg2[var9];
                int var11 = var10.field4946;
                int var12 = var10.field4950;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field4947 == null) {
                    byte[] var17 = var10.field4949;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field4947;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8889 = class683.method3666(var7, 6406, 6406, arg0, var8, false, var7, 3553);
            this.field8890 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class388 var39 = arg2[var24];
                int[] var40 = var39.field4951;
                byte[] var41 = var39.field4947;
                byte[] var42 = var39.field4949;
                int var43 = var39.field4946;
                int var44 = var39.field4950;
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
            this.field8889 = class345.method2000(arg0, 0, (byte) -87, var23, 0, false, var7, var7);
            this.field8890 = false;
        }
        this.field8889.method759(0, false);
        this.field8892 = new class516(arg0, 256);
        float var25 = this.field8889.field772 / (float) this.field8889.field770;
        float var26 = this.field8889.field768 / (float) this.field8889.field771;
        for (int var27 = 0; var27 < 256; var27++) {
            class388 var28 = arg2[var27];
            int var29 = var28.field4946;
            int var30 = var28.field4950;
            int var31 = var28.field4945;
            int var32 = var28.field4948;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8892.method2857(var27, (byte) -106);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8889.field768 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8889.field768 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8889.field768 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8889.field768 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8892.method2856((byte) -91);
        }
    }

    @OriginalMember(owner = "client!gf", name = "fa", descriptor = "(CIIIZ)V", line = 288)
    public final void method1037(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8891.method3924(120);
        this.field8891.method3975((byte) 121, this.field8889);
        if (this.field8890 || arg4) {
            this.field8891.method3917(106, 7681, 8448);
            this.field8891.method3954(0, 768, 34168, (byte) 114);
        } else {
            this.field8891.method3917(55, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8892.method2855(4864, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8890 || arg4) {
            this.field8891.method3954(0, 768, 5890, (byte) 117);
        }
    }
}
