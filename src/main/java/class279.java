import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class279 extends class61 {

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "Lbi;")
    private class483 field3541;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lbaa;")
    private class525 field3542;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Z")
    private boolean field3540;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lvh;")
    private class363 field3539;

    @OriginalMember(owner = "client!gf", name = "fa", descriptor = "(CIIIZ)V")
    public final void method121(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3541.method2798(true);
        this.field3541.method2850(123, this.field3542);
        if (this.field3540 || arg4) {
            this.field3541.method2799(-27874, 7681, 8448);
            this.field3541.method2775(34168, (byte) -88, 768, 0);
        } else {
            this.field3541.method2799(-27874, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3539.method2099(arg0, -119);
        OpenGL.glLoadIdentity();
        if (this.field3540 || arg4) {
            this.field3541.method2775(5890, (byte) -88, 768, 0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lbi;Ljl;[Lhb;Z)V")
    public class279(class483 arg0, class274 arg1, class728[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field3541 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class728 var54 = arg2[var6];
            if (var54.field10132 > var5) {
                var5 = var54.field10132;
            }
            if (var54.field10135 > var5) {
                var5 = var54.field10135;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class728 var10 = arg2[var9];
                int var11 = var10.field10132;
                int var12 = var10.field10135;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field10133 == null) {
                    byte[] var17 = var10.field10134;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field10133;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field3542 = class367.method2120(382, var8, var7, arg0, 6406, 6406, var7, false);
            this.field3540 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class728 var39 = arg2[var24];
                int[] var40 = var39.field10131;
                byte[] var41 = var39.field10133;
                byte[] var42 = var39.field10134;
                int var43 = var39.field10132;
                int var44 = var39.field10135;
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
            this.field3542 = class700.method3934(var23, 0, 0, arg0, true, var7, false, var7);
            this.field3540 = false;
        }
        this.field3542.method3898(false, 58);
        this.field3539 = new class363(arg0, 256);
        float var25 = this.field3542.field7335 / (float) this.field3542.field7334;
        float var26 = this.field3542.field7330 / (float) this.field3542.field7336;
        for (int var27 = 0; var27 < 256; var27++) {
            class728 var28 = arg2[var27];
            int var29 = var28.field10132;
            int var30 = var28.field10135;
            int var31 = var28.field10128;
            int var32 = var28.field10129;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field3539.method2097(var27, -115);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field3542.field7330 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field3542.field7330 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3542.field7330 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field3542.field7330 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field3539.method2100(-122);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4, class489 arg5, int arg6, int arg7) {
        class622 var9 = (class622) arg5;
        class525 var10 = var9.field8565;
        this.field3541.method2798(true);
        this.field3541.method2850(-68, this.field3542);
        if (this.field3540 || arg4) {
            this.field3541.method2799(-27874, 7681, 8448);
            this.field3541.method2775(34168, (byte) -88, 768, 0);
        } else {
            this.field3541.method2799(-27874, 7681, 7681);
        }
        this.field3541.method2847(1, false);
        this.field3541.method2850(80, var10);
        this.field3541.method2799(-27874, 7681, 8448);
        this.field3541.method2775(34168, (byte) -88, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7335 / (float) var10.field7334;
        float var12 = var10.field7330 / (float) var10.field7336;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field3539.method2099(arg0, -128);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field3541.method2775(5890, (byte) -88, 768, 0);
        this.field3541.method2799(-27874, 8448, 8448);
        this.field3541.method2850(-70, null);
        this.field3541.method2847(0, false);
        if (this.field3540 || arg4) {
            this.field3541.method2775(5890, (byte) -88, 768, 0);
        }
    }
}
