import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class628 extends class423 {

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "Leq;")
    private class357 field8748;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "Lmba;")
    private class77 field8749;

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "Z")
    private boolean field8747;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "Lbp;")
    private class458 field8750;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(CIIIZLaa;II)V", line = 6)
    public final void method565(char arg0, int arg1, int arg2, int arg3, boolean arg4, class81 arg5, int arg6, int arg7) {
        class553 var9 = (class553) arg5;
        class77 var10 = var9.field7766;
        this.field8748.method2121((byte) 87);
        this.field8748.method2120(-1, this.field8749);
        if (this.field8747 || arg4) {
            this.field8748.method2165((byte) 74, 8448, 7681);
            this.field8748.method2132(768, (byte) 111, 34168, 0);
        } else {
            this.field8748.method2165((byte) 74, 7681, 7681);
        }
        this.field8748.method2135(1, -5027);
        this.field8748.method2120(-1, var10);
        this.field8748.method2165((byte) 74, 8448, 7681);
        this.field8748.method2132(768, (byte) 109, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1028 / (float) var10.field1033;
        float var12 = var10.field1031 / (float) var10.field1023;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8750.method2682(arg0, 105);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8748.method2132(768, (byte) 118, 5890, 0);
        this.field8748.method2165((byte) 74, 8448, 8448);
        this.field8748.method2120(-1, null);
        this.field8748.method2135(0, -5027);
        if (this.field8747 || arg4) {
            this.field8748.method2132(768, (byte) -117, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "fa", descriptor = "(CIIIZ)V", line = 52)
    public final void method564(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8748.method2121((byte) 91);
        this.field8748.method2120(-1, this.field8749);
        if (this.field8747 || arg4) {
            this.field8748.method2165((byte) 74, 8448, 7681);
            this.field8748.method2132(768, (byte) 106, 34168, 0);
        } else {
            this.field8748.method2165((byte) 74, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8750.method2682(arg0, 110);
        OpenGL.glLoadIdentity();
        if (this.field8747 || arg4) {
            this.field8748.method2132(768, (byte) 98, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Leq;Ltba;[Lbe;Z)V", line = 72)
    public class628(class357 arg0, class56 arg1, class196[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8748 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class196 var54 = arg2[var6];
            if (var54.field2525 > var5) {
                var5 = var54.field2525;
            }
            if (var54.field2527 > var5) {
                var5 = var54.field2527;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class196 var10 = arg2[var9];
                int var11 = var10.field2525;
                int var12 = var10.field2527;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2523 == null) {
                    byte[] var17 = var10.field2521;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2523;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8749 = class714.method3957(var7, (byte) 21, 6406, var8, false, 6406, var7, arg0);
            this.field8747 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class196 var39 = arg2[var24];
                int[] var40 = var39.field2529;
                byte[] var41 = var39.field2523;
                byte[] var42 = var39.field2521;
                int var43 = var39.field2525;
                int var44 = var39.field2527;
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
            this.field8749 = class436.method2577(arg0, var7, 0, var7, false, 0, (byte) 97, var23);
            this.field8747 = false;
        }
        this.field8749.method2433(false, -106);
        this.field8750 = new class458(arg0, 256);
        float var25 = this.field8749.field1028 / (float) this.field8749.field1033;
        float var26 = this.field8749.field1031 / (float) this.field8749.field1023;
        for (int var27 = 0; var27 < 256; var27++) {
            class196 var28 = arg2[var27];
            int var29 = var28.field2525;
            int var30 = var28.field2527;
            int var31 = var28.field2522;
            int var32 = var28.field2526;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8750.method2686(var27, (byte) -43);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8749.field1031 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8749.field1031 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8749.field1031 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8749.field1031 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8750.method2685(0);
        }
    }
}
