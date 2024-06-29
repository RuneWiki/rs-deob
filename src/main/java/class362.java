import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class362 extends class92 {

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Lte;")
    private class527 field4906;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lrp;")
    private class371 field4907;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
    private boolean field4909;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lwl;")
    private class348 field4908;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(CIIIZLpa;II)V", line = 6)
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class311 arg5, int arg6, int arg7) {
        class97 var9 = (class97) arg5;
        class371 var10 = var9.field1412;
        this.field4906.method3185((byte) 81);
        this.field4906.method3152(-2, this.field4907);
        if (this.field4909 || arg4) {
            this.field4906.method3183(7681, -127, 8448);
            this.field4906.method3157(34168, 0, true, 768);
        } else {
            this.field4906.method3183(7681, -125, 7681);
        }
        this.field4906.method3111(33984, 1);
        this.field4906.method3152(-2, var10);
        this.field4906.method3183(7681, -124, 8448);
        this.field4906.method3157(34168, 0, true, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field5100 / (float) var10.field5095;
        float var12 = var10.field5101 / (float) var10.field5099;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4908.method2110(arg0, (byte) -122);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4906.method3157(5890, 0, true, 768);
        this.field4906.method3183(8448, -124, 8448);
        this.field4906.method3152(-2, null);
        this.field4906.method3111(33984, 0);
        if (this.field4909 || arg4) {
            this.field4906.method3157(5890, 0, true, 768);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lte;Llg;[Lqm;Z)V", line = 53)
    public class362(class527 arg0, class352 arg1, class126[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4906 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class126 var54 = arg2[var6];
            if (var54.field1771 > var5) {
                var5 = var54.field1771;
            }
            if (var54.field1767 > var5) {
                var5 = var54.field1767;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class126 var10 = arg2[var9];
                int var11 = var10.field1771;
                int var12 = var10.field1767;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1769 == null) {
                    byte[] var17 = var10.field1773;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1769;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field4907 = class153.method1114(arg0, var7, false, var8, 6406, false, var7, 6406);
            this.field4909 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class126 var39 = arg2[var24];
                int[] var40 = var39.field1772;
                byte[] var41 = var39.field1769;
                byte[] var42 = var39.field1773;
                int var43 = var39.field1771;
                int var44 = var39.field1767;
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
            this.field4907 = class271.method1708(false, var7, var7, arg0, var23, 27);
            this.field4909 = false;
        }
        this.field4907.method1460(false, -5286);
        this.field4908 = new class348(arg0, 256);
        float var25 = this.field4907.field5100 / (float) this.field4907.field5095;
        float var26 = this.field4907.field5101 / (float) this.field4907.field5099;
        for (int var27 = 0; var27 < 256; var27++) {
            class126 var28 = arg2[var27];
            int var29 = var28.field1771;
            int var30 = var28.field1767;
            int var31 = var28.field1770;
            int var32 = var28.field1766;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field4908.method2113(var27, 25033);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field4907.field5101 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field4907.field5101 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4907.field5101 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4907.field5101 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field4908.method2114(0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "HA", descriptor = "(CIIIZ)V", line = 290)
    public final void method216(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4906.method3185((byte) 81);
        this.field4906.method3152(-2, this.field4907);
        if (this.field4909 || arg4) {
            this.field4906.method3183(7681, -126, 8448);
            this.field4906.method3157(34168, 0, true, 768);
        } else {
            this.field4906.method3183(7681, -124, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4908.method2110(arg0, (byte) -128);
        OpenGL.glLoadIdentity();
        if (this.field4909 || arg4) {
            this.field4906.method3157(5890, 0, true, 768);
        }
    }
}
