import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class60 extends class348 {

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "Lrl;")
    private class487 field907;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "Loc;")
    private class129 field904;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "Z")
    private boolean field905;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "Lhu;")
    private class81 field906;

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lrl;Lmo;[Lpi;Z)V", line = 3)
    public class60(class487 arg0, class507 arg1, class328[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field907 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class328 var50 = arg2[var6];
            if (var50.field4780 > var5) {
                var5 = var50.field4780;
            }
            if (var50.field4776 > var5) {
                var5 = var50.field4776;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class328 var10 = arg2[var9];
                byte[] var11 = var10.field4778;
                int var12 = var10.field4780;
                int var13 = var10.field4776;
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
            this.field904 = class379.method2293(arg0, var8, false, var7, 6406, 6406, false, var7);
            this.field905 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class328 var36 = arg2[var21];
                int[] var37 = var36.field4782;
                byte[] var38 = var36.field4781;
                byte[] var39 = var36.field4778;
                int var40 = var36.field4780;
                int var41 = var36.field4776;
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
            this.field904 = class115.method665(-91, var7, var20, false, var7, arg0);
            this.field905 = false;
        }
        this.field904.method1357(false, (byte) 96);
        this.field906 = new class81(arg0, 256);
        float var22 = this.field904.field1645 / (float) this.field904.field1641;
        float var23 = this.field904.field1647 / (float) this.field904.field1643;
        for (int var24 = 0; var24 < 256; var24++) {
            class328 var25 = arg2[var24];
            int var26 = var25.field4780;
            int var27 = var25.field4776;
            int var28 = var25.field4784;
            int var29 = var25.field4779;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field906.method520(122, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field904.field1647 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field904.field1647 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field904.field1647 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field904.field1647 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field906.method522(false);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZ)V", line = 211)
    public final void method433(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field907.method2879((byte) 121);
        this.field907.method2883(this.field904, -111);
        if (this.field905 || arg4) {
            this.field907.method2919(8448, 7681, false);
            this.field907.method2855(0, (byte) 50, 34168, 768);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field906.method523((byte) -98, arg0);
        OpenGL.glLoadIdentity();
        if (this.field905 || arg4) {
            this.field907.method2855(0, (byte) 50, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZLfs;II)V", line = 231)
    public final void method434(char arg0, int arg1, int arg2, int arg3, boolean arg4, class372 arg5, int arg6, int arg7) {
        class357 var9 = (class357) arg5;
        class129 var10 = var9.field5299;
        this.field907.method2879((byte) 103);
        this.field907.method2883(this.field904, 98);
        if (this.field905 || arg4) {
            this.field907.method2919(8448, 7681, false);
            this.field907.method2855(0, (byte) 50, 34168, 768);
        }
        this.field907.method2849(1, (byte) -109);
        this.field907.method2883(var10, 77);
        this.field907.method2919(8448, 7681, false);
        this.field907.method2855(0, (byte) 50, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1645 / (float) var10.field1641;
        float var12 = var10.field1647 / (float) var10.field1643;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field906.method523((byte) -52, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field907.method2855(0, (byte) 50, 5890, 768);
        this.field907.method2919(8448, 8448, false);
        this.field907.method2883(null, -111);
        this.field907.method2849(0, (byte) -109);
        if (this.field905 || arg4) {
            this.field907.method2855(0, (byte) 50, 5890, 768);
        }
    }
}
