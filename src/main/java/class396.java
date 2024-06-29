import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class396 extends class489 {

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lbo;")
    private class511 field5346;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lgk;")
    private class330 field5347;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Z")
    private boolean field5349;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Liq;")
    private class429 field5348;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lbo;Lre;[Lfq;Z)V", line = 6)
    public class396(class511 arg0, class425 arg1, class134[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5346 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class134 var50 = arg2[var6];
            if (var50.field1925 > var5) {
                var5 = var50.field1925;
            }
            if (var50.field1926 > var5) {
                var5 = var50.field1926;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class134 var10 = arg2[var9];
                byte[] var11 = var10.field1923;
                int var12 = var10.field1925;
                int var13 = var10.field1926;
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
            this.field5347 = class449.method2571(6406, var8, arg0, var7, 6406, -2182, var7, false);
            this.field5349 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class134 var36 = arg2[var21];
                int[] var37 = var36.field1921;
                byte[] var38 = var36.field1920;
                byte[] var39 = var36.field1923;
                int var40 = var36.field1925;
                int var41 = var36.field1926;
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
            this.field5347 = class214.method1346(arg0, var7, var7, 3553, var20, false);
            this.field5349 = false;
        }
        this.field5347.method2866(10241, false);
        this.field5348 = new class429(arg0, 256);
        float var22 = this.field5347.field4349 / (float) this.field5347.field4345;
        float var23 = this.field5347.field4352 / (float) this.field5347.field4346;
        for (int var24 = 0; var24 < 256; var24++) {
            class134 var25 = arg2[var24];
            int var26 = var25.field1925;
            int var27 = var25.field1926;
            int var28 = var25.field1922;
            int var29 = var25.field1919;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field5348.method2482(var24, -57);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field5347.field4352 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field5347.field4352 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5347.field4352 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5347.field4352 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field5348.method2479(-16981);
        }
    }

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "(CIIIZ)V", line = 211)
    public final void method218(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5346.method2990(26286);
        this.field5346.method2980(this.field5347, 119);
        if (this.field5349 || arg4) {
            this.field5346.method3002((byte) -102, 7681, 8448);
            this.field5346.method2953(0, (byte) 72, 768, 34168);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5348.method2480(arg0, -1);
        OpenGL.glLoadIdentity();
        if (this.field5349 || arg4) {
            this.field5346.method2953(0, (byte) 120, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(CIIIZLea;II)V", line = 229)
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7) {
        class160 var9 = (class160) arg5;
        class330 var10 = var9.field2361;
        this.field5346.method2990(26286);
        this.field5346.method2980(this.field5347, 113);
        if (this.field5349 || arg4) {
            this.field5346.method3002((byte) -106, 7681, 8448);
            this.field5346.method2953(0, (byte) 100, 768, 34168);
        }
        this.field5346.method3003(1, 102);
        this.field5346.method2980(var10, 112);
        this.field5346.method3002((byte) -37, 7681, 8448);
        this.field5346.method2953(0, (byte) 126, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4349 / (float) var10.field4345;
        float var12 = var10.field4352 / (float) var10.field4346;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5348.method2480(arg0, -1);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5346.method2953(0, (byte) 127, 768, 5890);
        this.field5346.method3002((byte) -36, 8448, 8448);
        this.field5346.method2980(null, 121);
        this.field5346.method3003(0, 27);
        if (this.field5349 || arg4) {
            this.field5346.method2953(0, (byte) 106, 768, 5890);
        }
    }
}
