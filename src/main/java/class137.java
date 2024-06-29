import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class137 extends class66 {

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Ldia;")
    private class246 field2005;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Lme;")
    private class207 field2007;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Z")
    private boolean field2008;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lpba;")
    private class352 field2006;

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ldia;Leia;[Leu;Z)V", line = 4)
    public class137(class246 arg0, class255 arg1, class508[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2005 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class508 var54 = arg2[var6];
            if (var54.field7014 > var5) {
                var5 = var54.field7014;
            }
            if (var54.field7017 > var5) {
                var5 = var54.field7017;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class508 var10 = arg2[var9];
                int var11 = var10.field7014;
                int var12 = var10.field7017;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field7019 == null) {
                    byte[] var17 = var10.field7018;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field7019;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field2007 = class125.method1023(var8, 6406, var7, arg0, var7, 6406, false, (byte) -100);
            this.field2008 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class508 var39 = arg2[var24];
                int[] var40 = var39.field7013;
                byte[] var41 = var39.field7019;
                byte[] var42 = var39.field7018;
                int var43 = var39.field7014;
                int var44 = var39.field7017;
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
            this.field2007 = class74.method665(var7, var23, false, 0, var7, arg0, 0, (byte) -98);
            this.field2008 = false;
        }
        this.field2007.method52(false, false);
        this.field2006 = new class352(arg0, 256);
        float var25 = this.field2007.field2710 / (float) this.field2007.field2712;
        float var26 = this.field2007.field2708 / (float) this.field2007.field2704;
        for (int var27 = 0; var27 < 256; var27++) {
            class508 var28 = arg2[var27];
            int var29 = var28.field7014;
            int var30 = var28.field7017;
            int var31 = var28.field7016;
            int var32 = var28.field7020;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field2006.method2218(var27, false);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field2007.field2708 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field2007.field2708 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2007.field2708 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2007.field2708 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field2006.method2220(27294);
        }
    }

    @OriginalMember(owner = "client!di", name = "fa", descriptor = "(CIIIZ)V", line = 245)
    public final void method153(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2005.method1593((byte) 126);
        this.field2005.method1653((byte) 89, this.field2007);
        if (this.field2008 || arg4) {
            this.field2005.method1622(8448, 7681, (byte) 127);
            this.field2005.method1641(34168, 768, 0, 34192);
        } else {
            this.field2005.method1622(7681, 7681, (byte) 126);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2006.method2219(arg0, (byte) -89);
        OpenGL.glLoadIdentity();
        if (this.field2008 || arg4) {
            this.field2005.method1641(5890, 768, 0, 34192);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(CIIIZLaa;II)V", line = 265)
    public final void method154(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
        class148 var9 = (class148) arg5;
        class207 var10 = var9.field2076;
        this.field2005.method1593((byte) 127);
        this.field2005.method1653((byte) 126, this.field2007);
        if (this.field2008 || arg4) {
            this.field2005.method1622(8448, 7681, (byte) 2);
            this.field2005.method1641(34168, 768, 0, 34192);
        } else {
            this.field2005.method1622(7681, 7681, (byte) 125);
        }
        this.field2005.method1637(33984, 1);
        this.field2005.method1653((byte) 127, var10);
        this.field2005.method1622(8448, 7681, (byte) 127);
        this.field2005.method1641(34168, 768, 0, 34192);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2710 / (float) var10.field2712;
        float var12 = var10.field2708 / (float) var10.field2704;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2006.method2219(arg0, (byte) -89);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field2005.method1641(5890, 768, 0, 34192);
        this.field2005.method1622(8448, 8448, (byte) 125);
        this.field2005.method1653((byte) 98, null);
        this.field2005.method1637(33984, 0);
        if (this.field2008 || arg4) {
            this.field2005.method1641(5890, 768, 0, 34192);
        }
    }
}
