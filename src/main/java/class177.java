import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class177 extends class66 {

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "Lqfa;")
    private class106 field2742;

    @OriginalMember(owner = "client!bka", name = "C", descriptor = "Lcw;")
    private class192 field2744;

    @OriginalMember(owner = "client!bka", name = "y", descriptor = "Z")
    private boolean field2741;

    @OriginalMember(owner = "client!bka", name = "B", descriptor = "Loi;")
    private class78 field2743;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method215(char arg0, int arg1, int arg2, int arg3, boolean arg4, class511 arg5, int arg6, int arg7) {
        class444 var9 = (class444) arg5;
        class192 var10 = var9.field6042;
        this.field2742.method768((byte) 125);
        this.field2742.method808((byte) 34, this.field2744);
        if (this.field2741 || arg4) {
            this.field2742.method802(8448, 11762, 7681);
            this.field2742.method789(34168, 768, 0, (byte) 47);
        } else {
            this.field2742.method802(7681, 11762, 7681);
        }
        this.field2742.method813((byte) 103, 1);
        this.field2742.method808((byte) 34, var10);
        this.field2742.method802(8448, 11762, 7681);
        this.field2742.method789(34168, 768, 0, (byte) 47);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field2959 / (float) var10.field2967;
        float var12 = var10.field2965 / (float) var10.field2960;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2743.method606(true, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field2742.method789(5890, 768, 0, (byte) 47);
        this.field2742.method802(8448, 11762, 8448);
        this.field2742.method808((byte) 34, null);
        this.field2742.method813((byte) 103, 0);
        if (this.field2741 || arg4) {
            this.field2742.method789(5890, 768, 0, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lqfa;Lie;[Lus;Z)V")
    public class177(class106 arg0, class6 arg1, class1[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field2742 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class1 var54 = arg2[var6];
            if (var54.field7 > var5) {
                var5 = var54.field7;
            }
            if (var54.field4 > var5) {
                var5 = var54.field4;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class1 var10 = arg2[var9];
                int var11 = var10.field7;
                int var12 = var10.field4;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2 == null) {
                    byte[] var17 = var10.field3;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field2744 = class243.method1618(var7, arg0, false, var7, var8, 3361, 6406, 6406);
            this.field2741 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class1 var39 = arg2[var24];
                int[] var40 = var39.field6;
                byte[] var41 = var39.field2;
                byte[] var42 = var39.field3;
                int var43 = var39.field7;
                int var44 = var39.field4;
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
            this.field2744 = class93.method689(0, false, var7, 22, 0, var23, var7, arg0);
            this.field2741 = false;
        }
        this.field2744.method1312((byte) -79, false);
        this.field2743 = new class78(arg0, 256);
        float var25 = this.field2744.field2959 / (float) this.field2744.field2967;
        float var26 = this.field2744.field2965 / (float) this.field2744.field2960;
        for (int var27 = 0; var27 < 256; var27++) {
            class1 var28 = arg2[var27];
            int var29 = var28.field7;
            int var30 = var28.field4;
            int var31 = var28.field5;
            int var32 = var28.field1;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field2743.method607(var27, false);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field2744.field2965 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field2744.field2965 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2744.field2965 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field2744.field2965 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field2743.method608(false);
        }
    }

    @OriginalMember(owner = "client!bka", name = "fa", descriptor = "(CIIIZ)V")
    public final void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2742.method768((byte) 80);
        this.field2742.method808((byte) 34, this.field2744);
        if (this.field2741 || arg4) {
            this.field2742.method802(8448, 11762, 7681);
            this.field2742.method789(34168, 768, 0, (byte) 47);
        } else {
            this.field2742.method802(7681, 11762, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field2743.method606(true, arg0);
        OpenGL.glLoadIdentity();
        if (this.field2741 || arg4) {
            this.field2742.method789(5890, 768, 0, (byte) 47);
        }
    }
}
