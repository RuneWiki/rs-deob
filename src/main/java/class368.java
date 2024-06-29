import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class368 extends class395 {

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Lkfa;")
    private class382 field5097;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "Lbb;")
    private class196 field5099;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Z")
    private boolean field5096;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Luq;")
    private class458 field5098;

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lkfa;Lll;[Lfda;Z)V")
    public class368(class382 arg0, class490 arg1, class628[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5097 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class628 var54 = arg2[var6];
            if (var54.field8940 > var5) {
                var5 = var54.field8940;
            }
            if (var54.field8936 > var5) {
                var5 = var54.field8936;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class628 var10 = arg2[var9];
                int var11 = var10.field8940;
                int var12 = var10.field8936;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field8934 == null) {
                    byte[] var17 = var10.field8939;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field8934;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field5099 = class16.method195(6406, var7, (byte) -27, 6406, arg0, var7, false, var8);
            this.field5096 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class628 var39 = arg2[var24];
                int[] var40 = var39.field8938;
                byte[] var41 = var39.field8934;
                byte[] var42 = var39.field8939;
                int var43 = var39.field8940;
                int var44 = var39.field8936;
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
            this.field5099 = class213.method1453(var23, arg0, -2149, false, 0, var7, 0, var7);
            this.field5096 = false;
        }
        this.field5099.method2001(540800, false);
        this.field5098 = new class458(arg0, 256);
        float var25 = this.field5099.field3060 / (float) this.field5099.field3056;
        float var26 = this.field5099.field3063 / (float) this.field5099.field3058;
        for (int var27 = 0; var27 < 256; var27++) {
            class628 var28 = arg2[var27];
            int var29 = var28.field8940;
            int var30 = var28.field8936;
            int var31 = var28.field8935;
            int var32 = var28.field8933;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field5098.method2656(var27, (byte) 76);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field5099.field3063 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field5099.field3063 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field5099.field3063 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field5099.field3063 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field5098.method2657(0);
        }
    }

    @OriginalMember(owner = "client!en", name = "OA", descriptor = "(CIIIZ)V")
    public final void method368(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5097.method2261((byte) -77);
        this.field5097.method2295((byte) 121, this.field5099);
        if (this.field5096 || arg4) {
            this.field5097.method2328(7681, 57, 8448);
            this.field5097.method2262(34168, 0, 34176, 768);
        } else {
            this.field5097.method2328(7681, 47, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5098.method2658(0, arg0);
        OpenGL.glLoadIdentity();
        if (this.field5096 || arg4) {
            this.field5097.method2262(5890, 0, 34176, 768);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method366(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
        class91 var9 = (class91) arg5;
        class196 var10 = var9.field1336;
        this.field5097.method2261((byte) -77);
        this.field5097.method2295((byte) -122, this.field5099);
        if (this.field5096 || arg4) {
            this.field5097.method2328(7681, 102, 8448);
            this.field5097.method2262(34168, 0, 34176, 768);
        } else {
            this.field5097.method2328(7681, 56, 7681);
        }
        this.field5097.method2308(1, -15115);
        this.field5097.method2295((byte) -94, var10);
        this.field5097.method2328(7681, -79, 8448);
        this.field5097.method2262(34168, 0, 34176, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3060 / (float) var10.field3056;
        float var12 = var10.field3063 / (float) var10.field3058;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5098.method2658(0, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5097.method2262(5890, 0, 34176, 768);
        this.field5097.method2328(8448, -79, 8448);
        this.field5097.method2295((byte) -98, null);
        this.field5097.method2308(0, -15115);
        if (this.field5096 || arg4) {
            this.field5097.method2262(5890, 0, 34176, 768);
        }
    }
}
