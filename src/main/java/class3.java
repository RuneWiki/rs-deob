import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class61 {

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "Lwh;")
    private class148 field41;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "Liba;")
    private class531 field39;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "Z")
    private boolean field38;

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "Ljr;")
    private class112 field40;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method22(char arg0, int arg1, int arg2, int arg3, boolean arg4, class488 arg5, int arg6, int arg7) {
        class178 var9 = (class178) arg5;
        class531 var10 = var9.field2754;
        this.field41.method1060(-65);
        this.field41.method1088(this.field39, -27749);
        if (this.field38 || arg4) {
            this.field41.method1043((byte) -57, 8448, 7681);
            this.field41.method1052(34168, 34176, 0, 768);
        } else {
            this.field41.method1043((byte) -91, 7681, 7681);
        }
        this.field41.method1024(1, (byte) -11);
        this.field41.method1088(var10, -27749);
        this.field41.method1043((byte) 66, 8448, 7681);
        this.field41.method1052(34168, 34176, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7564 / (float) var10.field7561;
        float var12 = var10.field7568 / (float) var10.field7569;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field40.method838(arg0, true);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field41.method1052(5890, 34176, 0, 768);
        this.field41.method1043((byte) 109, 8448, 8448);
        this.field41.method1088(null, -27749);
        this.field41.method1024(0, (byte) -11);
        if (this.field38 || arg4) {
            this.field41.method1052(5890, 34176, 0, 768);
        }
    }

    @OriginalMember(owner = "client!dp", name = "fa", descriptor = "(CIIIZ)V")
    public final void method23(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field41.method1060(-56);
        this.field41.method1088(this.field39, -27749);
        if (this.field38 || arg4) {
            this.field41.method1043((byte) -13, 8448, 7681);
            this.field41.method1052(34168, 34176, 0, 768);
        } else {
            this.field41.method1043((byte) 121, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field40.method838(arg0, true);
        OpenGL.glLoadIdentity();
        if (this.field38 || arg4) {
            this.field41.method1052(5890, 34176, 0, 768);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lwh;Lhia;[Lfg;Z)V")
    public class3(class148 arg0, class66 arg1, class129[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field41 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class129 var54 = arg2[var6];
            if (var54.field1739 > var5) {
                var5 = var54.field1739;
            }
            if (var54.field1734 > var5) {
                var5 = var54.field1734;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class129 var10 = arg2[var9];
                int var11 = var10.field1739;
                int var12 = var10.field1734;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1736 == null) {
                    byte[] var17 = var10.field1738;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1736;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field39 = class479.method2883(var7, var7, 6406, arg0, var8, 497309962, false, 6406);
            this.field38 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class129 var39 = arg2[var24];
                int[] var40 = var39.field1732;
                byte[] var41 = var39.field1736;
                byte[] var42 = var39.field1738;
                int var43 = var39.field1739;
                int var44 = var39.field1734;
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
            this.field39 = class238.method1581((byte) 62, 0, var7, false, 0, var7, var23, arg0);
            this.field38 = false;
        }
        this.field39.method1362(false, 1287);
        this.field40 = new class112(arg0, 256);
        float var25 = this.field39.field7564 / (float) this.field39.field7561;
        float var26 = this.field39.field7568 / (float) this.field39.field7569;
        for (int var27 = 0; var27 < 256; var27++) {
            class129 var28 = arg2[var27];
            int var29 = var28.field1739;
            int var30 = var28.field1734;
            int var31 = var28.field1737;
            int var32 = var28.field1735;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field40.method841(-121, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field39.field7568 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field39.field7568 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field39.field7568 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field39.field7568 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field40.method840(5);
        }
    }
}
