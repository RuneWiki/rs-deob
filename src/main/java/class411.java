import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class411 extends class421 {

    @OriginalMember(owner = "client!os", name = "v", descriptor = "Lus;")
    private class1 field5947;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "Ldea;")
    private class225 field5950;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "Z")
    private boolean field5948;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Lqda;")
    private class89 field5949;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method676(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7) {
        class394 var9 = (class394) arg5;
        class225 var10 = var9.field5764;
        this.field5947.method176(109);
        this.field5947.method5(3845, this.field5950);
        if (this.field5948 || arg4) {
            this.field5947.method148(8448, 7681, (byte) -100);
            this.field5947.method10(0, 768, 34168, 34192);
        } else {
            this.field5947.method148(7681, 7681, (byte) -127);
        }
        this.field5947.method125(1, -104);
        this.field5947.method5(3845, var10);
        this.field5947.method148(8448, 7681, (byte) -107);
        this.field5947.method10(0, 768, 34168, 34192);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3371 / (float) var10.field3370;
        float var12 = var10.field3365 / (float) var10.field3363;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5949.method871(false, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5947.method10(0, 768, 5890, 34192);
        this.field5947.method148(8448, 8448, (byte) -99);
        this.field5947.method5(3845, null);
        this.field5947.method125(0, -74);
        if (this.field5948 || arg4) {
            this.field5947.method10(0, 768, 5890, 34192);
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lus;Ldaa;[Lvw;Z)V")
    public class411(class1 arg0, class11 arg1, class279[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5947 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class279 var54 = arg2[var6];
            if (var54.field4171 > var5) {
                var5 = var54.field4171;
            }
            if (var54.field4174 > var5) {
                var5 = var54.field4174;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class279 var10 = arg2[var9];
                int var11 = var10.field4171;
                int var12 = var10.field4174;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field4170 == null) {
                    byte[] var17 = var10.field4167;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field4170;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field5950 = class680.method3824(2, var7, 6406, false, var7, 6406, arg0, var8);
            this.field5948 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class279 var39 = arg2[var24];
                int[] var40 = var39.field4169;
                byte[] var41 = var39.field4170;
                byte[] var42 = var39.field4167;
                int var43 = var39.field4171;
                int var44 = var39.field4174;
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
            this.field5950 = class656.method3731(false, var23, 34037, var7, arg0, var7);
            this.field5948 = false;
        }
        this.field5950.method2939(false, (byte) -69);
        this.field5949 = new class89(arg0, 256);
        float var25 = this.field5950.field3371 / (float) this.field5950.field3370;
        float var26 = this.field5950.field3365 / (float) this.field5950.field3363;
        for (int var27 = 0; var27 < 256; var27++) {
            class279 var28 = arg2[var27];
            int var29 = var28.field4171;
            int var30 = var28.field4174;
            int var31 = var28.field4172;
            int var32 = var28.field4168;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field5949.method874(var27, -118);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field5950.field3365 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field5950.field3365 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field5950.field3365 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field5950.field3365 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field5949.method869((byte) -102);
        }
    }

    @OriginalMember(owner = "client!os", name = "OA", descriptor = "(CIIIZ)V")
    public final void method678(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5947.method176(122);
        this.field5947.method5(3845, this.field5950);
        if (this.field5948 || arg4) {
            this.field5947.method148(8448, 7681, (byte) -102);
            this.field5947.method10(0, 768, 34168, 34192);
        } else {
            this.field5947.method148(7681, 7681, (byte) -105);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5949.method871(false, arg0);
        OpenGL.glLoadIdentity();
        if (this.field5948 || arg4) {
            this.field5947.method10(0, 768, 5890, 34192);
        }
    }
}
