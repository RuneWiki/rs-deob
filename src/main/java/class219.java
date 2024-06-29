import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class219 extends class262 {

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Luq;")
    private class313 field2803;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "Lem;")
    private class600 field2805;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "Z")
    private boolean field2804;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "Lcn;")
    private class21 field2806;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method488(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
        class54 var9 = (class54) arg5;
        class600 var10 = var9.field727;
        this.field2803.method1883(-1150);
        this.field2803.method1884(this.field2805, -2);
        if (this.field2804 || arg4) {
            this.field2803.method1887(70, 7681, 8448);
            this.field2803.method1933(-81, 768, 0, 34168);
        } else {
            this.field2803.method1887(-83, 7681, 7681);
        }
        this.field2803.method1966(3000, 1);
        this.field2803.method1884(var10, -2);
        this.field2803.method1887(112, 7681, 8448);
        this.field2803.method1933(-99, 768, 0, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field8676 / (float) var10.field8672;
        float var12 = var10.field8671 / (float) var10.field8669;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2806.method118(arg0, 0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field2803.method1933(-93, 768, 0, 5890);
        this.field2803.method1887(-93, 8448, 8448);
        this.field2803.method1884(null, -2);
        this.field2803.method1966(3000, 0);
        if (this.field2804 || arg4) {
            this.field2803.method1933(-127, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!wn", name = "HA", descriptor = "(CIIIZ)V")
    public final void method487(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2803.method1883(-1150);
        this.field2803.method1884(this.field2805, -2);
        if (this.field2804 || arg4) {
            this.field2803.method1887(-77, 7681, 8448);
            this.field2803.method1933(-72, 768, 0, 34168);
        } else {
            this.field2803.method1887(-72, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2806.method118(arg0, 0);
        OpenGL.glLoadIdentity();
        if (this.field2804 || arg4) {
            this.field2803.method1933(-128, 768, 0, 5890);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Luq;Lpe;[Lig;Z)V")
    public class219(class313 arg0, class157 arg1, class295[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2803 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class295 var54 = arg2[var6];
            if (var54.field3834 > var5) {
                var5 = var54.field3834;
            }
            if (var54.field3835 > var5) {
                var5 = var54.field3835;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class295 var10 = arg2[var9];
                int var11 = var10.field3834;
                int var12 = var10.field3835;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field3833 == null) {
                    byte[] var17 = var10.field3831;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field3833;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field2805 = class429.method2508(6406, var8, var7, arg0, 3553, var7, false, 6406);
            this.field2804 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class295 var39 = arg2[var24];
                int[] var40 = var39.field3828;
                byte[] var41 = var39.field3833;
                byte[] var42 = var39.field3831;
                int var43 = var39.field3834;
                int var44 = var39.field3835;
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
            this.field2805 = class33.method191(var23, true, var7, false, arg0, var7);
            this.field2804 = false;
        }
        this.field2805.method805(false, -115);
        this.field2806 = new class21(arg0, 256);
        float var25 = this.field2805.field8676 / (float) this.field2805.field8672;
        float var26 = this.field2805.field8671 / (float) this.field2805.field8669;
        for (int var27 = 0; var27 < 256; var27++) {
            class295 var28 = arg2[var27];
            int var29 = var28.field3834;
            int var30 = var28.field3835;
            int var31 = var28.field3832;
            int var32 = var28.field3830;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field2806.method120((byte) -128, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field2805.field8671 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field2805.field8671 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2805.field8671 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2805.field8671 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field2806.method123(4864);
        }
    }
}
