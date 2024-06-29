import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class149 extends class167 {

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Lgk;")
    private class463 field1971;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "Lcw;")
    private class386 field1974;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Z")
    private boolean field1973;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Lbf;")
    private class181 field1972;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "(CIIIZ)V")
    public final void method388(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1971.method2751(89);
        this.field1971.method2771(this.field1974, -16785);
        if (this.field1973 || arg4) {
            this.field1971.method2794(7681, 8448, true);
            this.field1971.method2781(34168, 0, 2479, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1972.method1190((byte) 126, arg0);
        OpenGL.glLoadIdentity();
        if (this.field1973 || arg4) {
            this.field1971.method2781(5890, 0, 2479, 768);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lgk;Lov;[Lne;Z)V")
    public class149(class463 arg0, class278 arg1, class136[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1971 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class136 var50 = arg2[var6];
            if (var50.field1832 > var5) {
                var5 = var50.field1832;
            }
            if (var50.field1837 > var5) {
                var5 = var50.field1837;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class136 var10 = arg2[var9];
                byte[] var11 = var10.field1833;
                int var12 = var10.field1832;
                int var13 = var10.field1837;
                int var14 = var9 % 16 * var5;
                int var15 = var9 / 16 * var5;
                int var16 = var7 * var15 + var14;
                int var17 = 0;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        var8[var16++] = (byte) (var11[var17++] == 0 ? 0 : -1);
                    }
                    var16 += var7 - var13;
                }
            }
            this.field1974 = class235.method1497(var8, false, var7, 6406, 6406, arg0, 1, var7);
            this.field1973 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class136 var36 = arg2[var21];
                int[] var37 = var36.field1831;
                byte[] var38 = var36.field1830;
                byte[] var39 = var36.field1833;
                int var40 = var36.field1832;
                int var41 = var36.field1837;
                int var42 = var21 % 16 * var5;
                int var43 = var21 / 16 * var5;
                int var44 = var7 * var43 + var42;
                int var45 = 0;
                if (var38 == null) {
                    for (int var48 = 0; var48 < var40; var48++) {
                        for (int var49 = 0; var49 < var41; var49++) {
                            var20[var44++] = var37[var39[var45++] & 0xFF] | 0xFF000000;
                        }
                        var44 += var7 - var41;
                    }
                } else {
                    for (int var46 = 0; var46 < var40; var46++) {
                        for (int var47 = 0; var47 < var41; var47++) {
                            var20[var44++] = var38[var45] << 24 | var37[var39[var45] & 0xFF];
                            var45++;
                        }
                        var44 += var7 - var41;
                    }
                }
            }
            this.field1974 = class276.method1699(var20, var7, -13, false, var7, arg0);
            this.field1973 = false;
        }
        this.field1974.method210(false, (byte) 44);
        this.field1972 = new class181(arg0, 256);
        float var22 = this.field1974.field5069 / (float) this.field1974.field5070;
        float var23 = this.field1974.field5073 / (float) this.field1974.field5071;
        for (int var24 = 0; var24 < 256; var24++) {
            class136 var25 = arg2[var24];
            int var26 = var25.field1832;
            int var27 = var25.field1837;
            int var28 = var25.field1834;
            int var29 = var25.field1835;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field1972.method1188(var24, (byte) -112);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field1974.field5073 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field1974.field5073 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1974.field5073 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field1974.field5073 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field1972.method1193(68);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method385(char arg0, int arg1, int arg2, int arg3, boolean arg4, class113 arg5, int arg6, int arg7) {
        class116 var9 = (class116) arg5;
        class386 var10 = var9.field1629;
        this.field1971.method2751(107);
        this.field1971.method2771(this.field1974, -16785);
        if (this.field1973 || arg4) {
            this.field1971.method2794(7681, 8448, true);
            this.field1971.method2781(34168, 0, 2479, 768);
        }
        this.field1971.method2741((byte) -38, 1);
        this.field1971.method2771(var10, -16785);
        this.field1971.method2794(7681, 8448, true);
        this.field1971.method2781(34168, 0, 2479, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field5069 / (float) var10.field5070;
        float var12 = var10.field5073 / (float) var10.field5071;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1972.method1190((byte) 74, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1971.method2781(5890, 0, 2479, 768);
        this.field1971.method2794(8448, 8448, true);
        this.field1971.method2771(null, -16785);
        this.field1971.method2741((byte) -38, 0);
        if (this.field1973 || arg4) {
            this.field1971.method2781(5890, 0, 2479, 768);
        }
    }
}
