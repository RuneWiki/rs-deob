import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class296 extends class418 {

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Ler;")
    private class92 field4635;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Lcea;")
    private class197 field4634;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
    private boolean field4636;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Lsr;")
    private class231 field4637;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ler;Lufa;[Lwt;Z)V", line = 4)
    public class296(class92 arg0, class632 arg1, class284[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4635 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class284 var54 = arg2[var6];
            if (var54.field4537 > var5) {
                var5 = var54.field4537;
            }
            if (var54.field4535 > var5) {
                var5 = var54.field4535;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class284 var10 = arg2[var9];
                int var11 = var10.field4537;
                int var12 = var10.field4535;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field4539 == null) {
                    byte[] var17 = var10.field4532;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field4539;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field4634 = class174.method1420(var7, false, 6406, var8, var7, 0, arg0, 6406);
            this.field4636 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class284 var39 = arg2[var24];
                int[] var40 = var39.field4538;
                byte[] var41 = var39.field4539;
                byte[] var42 = var39.field4532;
                int var43 = var39.field4537;
                int var44 = var39.field4535;
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
            this.field4634 = class565.method3346(false, var23, 0, var7, arg0, -2, var7, 0);
            this.field4636 = false;
        }
        this.field4634.method2509(false, -86);
        this.field4637 = new class231(arg0, 256);
        float var25 = this.field4634.field3238 / (float) this.field4634.field3231;
        float var26 = this.field4634.field3240 / (float) this.field4634.field3236;
        for (int var27 = 0; var27 < 256; var27++) {
            class284 var28 = arg2[var27];
            int var29 = var28.field4537;
            int var30 = var28.field4535;
            int var31 = var28.field4540;
            int var32 = var28.field4533;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field4637.method1689(-31885, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field4634.field3240 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field4634.field3240 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4634.field3240 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4634.field3240 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field4637.method1690(58);
        }
    }

    @OriginalMember(owner = "client!db", name = "OA", descriptor = "(CIIIZ)V", line = 241)
    public final void method1408(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4635.method830((byte) 123);
        this.field4635.method856(false, this.field4634);
        if (this.field4636 || arg4) {
            this.field4635.method857(8960, 8448, 7681);
            this.field4635.method844(768, 34168, 0, (byte) -102);
        } else {
            this.field4635.method857(8960, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4637.method1687(arg0, 4864);
        OpenGL.glLoadIdentity();
        if (this.field4636 || arg4) {
            this.field4635.method844(768, 5890, 0, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(CIIIZLua;II)V", line = 265)
    public final void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
        class385 var9 = (class385) arg5;
        class197 var10 = var9.field5984;
        this.field4635.method830((byte) 123);
        this.field4635.method856(false, this.field4634);
        if (this.field4636 || arg4) {
            this.field4635.method857(8960, 8448, 7681);
            this.field4635.method844(768, 34168, 0, (byte) -102);
        } else {
            this.field4635.method857(8960, 7681, 7681);
        }
        this.field4635.method834(true, 1);
        this.field4635.method856(false, var10);
        this.field4635.method857(8960, 8448, 7681);
        this.field4635.method844(768, 34168, 0, (byte) -102);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3238 / (float) var10.field3231;
        float var12 = var10.field3240 / (float) var10.field3236;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4637.method1687(arg0, 4864);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4635.method844(768, 5890, 0, (byte) -102);
        this.field4635.method857(8960, 8448, 8448);
        this.field4635.method856(false, null);
        this.field4635.method834(true, 0);
        if (this.field4636 || arg4) {
            this.field4635.method844(768, 5890, 0, (byte) -102);
        }
    }
}
