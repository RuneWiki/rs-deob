import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class489 extends class400 {

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "Lep;")
    private class371 field6584;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "Ldd;")
    private class146 field6583;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "Z")
    private boolean field6585;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "Lrj;")
    private class359 field6586;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lep;Loq;[Ltba;Z)V", line = 7)
    public class489(class371 arg0, class742 arg1, class320[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6584 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class320 var54 = arg2[var6];
            if (var54.field4121 > var5) {
                var5 = var54.field4121;
            }
            if (var54.field4122 > var5) {
                var5 = var54.field4122;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class320 var10 = arg2[var9];
                int var11 = var10.field4121;
                int var12 = var10.field4122;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field4124 == null) {
                    byte[] var17 = var10.field4125;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field4124;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6583 = class60.method392(var8, false, (byte) 105, 6406, arg0, var7, var7, 6406);
            this.field6585 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class320 var39 = arg2[var24];
                int[] var40 = var39.field4128;
                byte[] var41 = var39.field4124;
                byte[] var42 = var39.field4125;
                int var43 = var39.field4121;
                int var44 = var39.field4122;
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
            this.field6583 = class5.method21(0, 0, 3553, arg0, var7, var7, false, var23);
            this.field6585 = false;
        }
        this.field6583.method2419(false, true);
        this.field6586 = new class359(arg0, 256);
        float var25 = this.field6583.field2025 / (float) this.field6583.field2023;
        float var26 = this.field6583.field2019 / (float) this.field6583.field2028;
        for (int var27 = 0; var27 < 256; var27++) {
            class320 var28 = arg2[var27];
            int var29 = var28.field4121;
            int var30 = var28.field4122;
            int var31 = var28.field4123;
            int var32 = var28.field4127;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6586.method2024(var27, 52);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6583.field2019 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6583.field2019 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6583.field2019 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6583.field2019 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6586.method2022(0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(CIIIZLaa;II)V", line = 244)
    public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4, class571 arg5, int arg6, int arg7) {
        class669 var9 = (class669) arg5;
        class146 var10 = var9.field9416;
        this.field6584.method2146(true);
        this.field6584.method2154(this.field6583, -2);
        if (this.field6585 || arg4) {
            this.field6584.method2207(7681, 8448, -25248);
            this.field6584.method2202(390803672, 768, 34168, 0);
        } else {
            this.field6584.method2207(7681, 7681, -25248);
        }
        this.field6584.method2196(1, (byte) 89);
        this.field6584.method2154(var10, -2);
        this.field6584.method2207(7681, 8448, -25248);
        this.field6584.method2202(390803672, 768, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2025 / (float) var10.field2023;
        float var12 = var10.field2019 / (float) var10.field2028;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6586.method2021(-88, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6584.method2202(390803672, 768, 5890, 0);
        this.field6584.method2207(8448, 8448, -25248);
        this.field6584.method2154(null, -2);
        this.field6584.method2196(0, (byte) 89);
        if (this.field6585 || arg4) {
            this.field6584.method2202(390803672, 768, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "fa", descriptor = "(CIIIZ)V", line = 290)
    public final void method296(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6584.method2146(true);
        this.field6584.method2154(this.field6583, -2);
        if (this.field6585 || arg4) {
            this.field6584.method2207(7681, 8448, -25248);
            this.field6584.method2202(390803672, 768, 34168, 0);
        } else {
            this.field6584.method2207(7681, 7681, -25248);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6586.method2021(-122, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6585 || arg4) {
            this.field6584.method2202(390803672, 768, 5890, 0);
        }
    }
}
