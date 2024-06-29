import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class278 extends class317 {

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lkd;")
    private class188 field4224;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Loi;")
    private class53 field4225;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Z")
    private boolean field4226;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lrn;")
    private class178 field4223;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method872(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        class289 var9 = (class289) arg5;
        class53 var10 = var9.field4353;
        this.field4224.method1322((byte) 40);
        this.field4224.method1289(-19391, this.field4225);
        if (this.field4226 || arg4) {
            this.field4224.method1242(34162, 8448, 7681);
            this.field4224.method1266(768, 0, 34168, 8960);
        }
        this.field4224.method1307(1, (byte) 92);
        this.field4224.method1289(-19391, var10);
        this.field4224.method1242(34162, 8448, 7681);
        this.field4224.method1266(768, 0, 34168, 8960);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field664 / (float) var10.field663;
        float var12 = var10.field658 / (float) var10.field656;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4223.method1191(arg0, (byte) 120);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field4224.method1266(768, 0, 5890, 8960);
        this.field4224.method1242(34162, 8448, 8448);
        this.field4224.method1289(-19391, null);
        this.field4224.method1307(0, (byte) 92);
        if (this.field4226 || arg4) {
            this.field4224.method1266(768, 0, 5890, 8960);
        }
    }

    @OriginalMember(owner = "client!je", name = "OA", descriptor = "(CIIIZ)V")
    public final void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4224.method1322((byte) -117);
        this.field4224.method1289(-19391, this.field4225);
        if (this.field4226 || arg4) {
            this.field4224.method1242(34162, 8448, 7681);
            this.field4224.method1266(768, 0, 34168, 8960);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field4223.method1191(arg0, (byte) 105);
        OpenGL.glLoadIdentity();
        if (this.field4226 || arg4) {
            this.field4224.method1266(768, 0, 5890, 8960);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lkd;Llm;[Ldi;Z)V")
    public class278(class188 arg0, class348 arg1, class84[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field4224 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class84 var50 = arg2[var6];
            if (var50.field1207 > var5) {
                var5 = var50.field1207;
            }
            if (var50.field1204 > var5) {
                var5 = var50.field1204;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class84 var10 = arg2[var9];
                byte[] var11 = var10.field1211;
                int var12 = var10.field1207;
                int var13 = var10.field1204;
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
            this.field4225 = class100.method806((byte) -102, var7, 6406, var7, false, arg0, 6406, var8);
            this.field4226 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class84 var36 = arg2[var21];
                int[] var37 = var36.field1208;
                byte[] var38 = var36.field1210;
                byte[] var39 = var36.field1211;
                int var40 = var36.field1207;
                int var41 = var36.field1204;
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
            this.field4225 = class360.method2262(34037, var7, var20, false, var7, arg0);
            this.field4226 = false;
        }
        this.field4225.method2757(false, -86);
        this.field4223 = new class178(arg0, 256);
        float var22 = this.field4225.field664 / (float) this.field4225.field663;
        float var23 = this.field4225.field658 / (float) this.field4225.field656;
        for (int var24 = 0; var24 < 256; var24++) {
            class84 var25 = arg2[var24];
            int var26 = var25.field1207;
            int var27 = var25.field1204;
            int var28 = var25.field1209;
            int var29 = var25.field1205;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field4223.method1192(var24, (byte) 116);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field4225.field658 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field4225.field658 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4225.field658 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field4225.field658 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field4223.method1196(124);
        }
    }
}
