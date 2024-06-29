import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class118 extends class194 {

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "Len;")
    private class289 field1566;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "Lan;")
    private class22 field1568;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "Z")
    private boolean field1565;

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "Lml;")
    private class353 field1567;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "(CIIIZ)V")
    public final void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1566.method1765(-27126);
        this.field1566.method1804(false, this.field1568);
        if (this.field1565 || arg4) {
            this.field1566.method1798(false, 8448, 7681);
            this.field1566.method1797(0, (byte) 82, 768, 34168);
        } else {
            this.field1566.method1798(false, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1567.method2094((byte) 112, arg0);
        OpenGL.glLoadIdentity();
        if (this.field1565 || arg4) {
            this.field1566.method1797(0, (byte) 86, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Len;Lmj;[Lkq;Z)V")
    public class118(class289 arg0, class599 arg1, class543[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1566 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class543 var54 = arg2[var6];
            if (var54.field7373 > var5) {
                var5 = var54.field7373;
            }
            if (var54.field7377 > var5) {
                var5 = var54.field7377;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class543 var10 = arg2[var9];
                int var11 = var10.field7373;
                int var12 = var10.field7377;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field7380 == null) {
                    byte[] var17 = var10.field7378;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field7380;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field1568 = class403.method2307(6406, var7, var8, 6406, false, (byte) -97, var7, arg0);
            this.field1565 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class543 var39 = arg2[var24];
                int[] var40 = var39.field7376;
                byte[] var41 = var39.field7380;
                byte[] var42 = var39.field7378;
                int var43 = var39.field7373;
                int var44 = var39.field7377;
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
            this.field1568 = class272.method1636(var7, var23, arg0, var7, false, (byte) 46);
            this.field1565 = false;
        }
        this.field1568.method3288(0, false);
        this.field1567 = new class353(arg0, 256);
        float var25 = this.field1568.field299 / (float) this.field1568.field302;
        float var26 = this.field1568.field300 / (float) this.field1568.field301;
        for (int var27 = 0; var27 < 256; var27++) {
            class543 var28 = arg2[var27];
            int var29 = var28.field7373;
            int var30 = var28.field7377;
            int var31 = var28.field7374;
            int var32 = var28.field7375;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field1567.method2097(var27, -14434);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field1568.field300 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field1568.field300 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1568.field300 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1568.field300 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field1567.method2099(6493);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4, class212 arg5, int arg6, int arg7) {
        class438 var9 = (class438) arg5;
        class22 var10 = var9.field6173;
        this.field1566.method1765(-27126);
        this.field1566.method1804(false, this.field1568);
        if (this.field1565 || arg4) {
            this.field1566.method1798(false, 8448, 7681);
            this.field1566.method1797(0, (byte) 109, 768, 34168);
        } else {
            this.field1566.method1798(false, 7681, 7681);
        }
        this.field1566.method1747(1, (byte) 108);
        this.field1566.method1804(false, var10);
        this.field1566.method1798(false, 8448, 7681);
        this.field1566.method1797(0, (byte) 79, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field299 / (float) var10.field302;
        float var12 = var10.field300 / (float) var10.field301;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1567.method2094((byte) 125, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1566.method1797(0, (byte) 112, 768, 5890);
        this.field1566.method1798(false, 8448, 8448);
        this.field1566.method1804(false, null);
        this.field1566.method1747(0, (byte) 108);
        if (this.field1565 || arg4) {
            this.field1566.method1797(0, (byte) 97, 768, 5890);
        }
    }
}
