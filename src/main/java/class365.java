import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class365 extends class59 {

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lnv;")
    private class417 field4659;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Ltea;")
    private class238 field4661;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Z")
    private boolean field4662;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Lqha;")
    private class102 field4660;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method82(char arg0, int arg1, int arg2, int arg3, boolean arg4, class485 arg5, int arg6, int arg7) {
        class291 var9 = (class291) arg5;
        class238 var10 = var9.field3585;
        this.field4659.method2547((byte) -80);
        this.field4659.method2621(-2, this.field4661);
        if (this.field4662 || arg4) {
            this.field4659.method2558(7681, 0, 8448);
            this.field4659.method2626(8960, 768, 0, 34168);
        } else {
            this.field4659.method2558(7681, 0, 7681);
        }
        this.field4659.method2545(32886, 1);
        this.field4659.method2621(-2, var10);
        this.field4659.method2558(7681, 0, 8448);
        this.field4659.method2626(8960, 768, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2830 / (float) var10.field2834;
        float var12 = var10.field2835 / (float) var10.field2836;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4660.method712(arg0, 1);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4659.method2626(8960, 768, 0, 5890);
        this.field4659.method2558(8448, 0, 8448);
        this.field4659.method2621(-2, null);
        this.field4659.method2545(32886, 0);
        if (this.field4662 || arg4) {
            this.field4659.method2626(8960, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!bc", name = "fa", descriptor = "(CIIIZ)V")
    public final void method80(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4659.method2547((byte) 16);
        this.field4659.method2621(-2, this.field4661);
        if (this.field4662 || arg4) {
            this.field4659.method2558(7681, 0, 8448);
            this.field4659.method2626(8960, 768, 0, 34168);
        } else {
            this.field4659.method2558(7681, 0, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4660.method712(arg0, 1);
        OpenGL.glLoadIdentity();
        if (this.field4662 || arg4) {
            this.field4659.method2626(8960, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lnv;Lur;[Lg;Z)V")
    public class365(class417 arg0, class535 arg1, class155[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4659 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class155 var54 = arg2[var6];
            if (var54.field1706 > var5) {
                var5 = var54.field1706;
            }
            if (var54.field1708 > var5) {
                var5 = var54.field1708;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class155 var10 = arg2[var9];
                int var11 = var10.field1706;
                int var12 = var10.field1708;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1707 == null) {
                    byte[] var17 = var10.field1702;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1707;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field4661 = class735.method4094(6406, var7, var7, false, var8, 6406, arg0, 121);
            this.field4662 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class155 var39 = arg2[var24];
                int[] var40 = var39.field1710;
                byte[] var41 = var39.field1707;
                byte[] var42 = var39.field1702;
                int var43 = var39.field1706;
                int var44 = var39.field1708;
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
            this.field4661 = class13.method64(var23, var7, var7, true, 0, false, 0, arg0);
            this.field4662 = false;
        }
        this.field4661.method1742(false, 29646);
        this.field4660 = new class102(arg0, 256);
        float var25 = this.field4661.field2830 / (float) this.field4661.field2834;
        float var26 = this.field4661.field2835 / (float) this.field4661.field2836;
        for (int var27 = 0; var27 < 256; var27++) {
            class155 var28 = arg2[var27];
            int var29 = var28.field1706;
            int var30 = var28.field1708;
            int var31 = var28.field1703;
            int var32 = var28.field1709;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field4660.method705(var27, (byte) -32);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field4661.field2835 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field4661.field2835 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4661.field2835 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field4661.field2835 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field4660.method711(22972);
        }
    }
}
