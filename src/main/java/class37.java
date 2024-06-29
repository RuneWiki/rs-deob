import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 extends class317 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Lda;")
    private class44 field549;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "Lal;")
    private class67 field550;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Z")
    private boolean field547;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Ltm;")
    private class267 field548;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "(CIIIZ)V", line = 7)
    public final void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field549.method292(false);
        this.field549.method381((byte) 28, this.field550);
        if (this.field547 || arg4) {
            this.field549.method426(7681, 8448, -24610);
            this.field549.method412(0, 34168, 768, -30);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field548.method1702(-126, arg0);
        OpenGL.glLoadIdentity();
        if (this.field547 || arg4) {
            this.field549.method412(0, 5890, 768, -22);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(CIIIZLta;II)V", line = 25)
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7) {
        class171 var9 = (class171) arg5;
        class67 var10 = var9.field2770;
        this.field549.method292(false);
        this.field549.method381((byte) 28, this.field550);
        if (this.field547 || arg4) {
            this.field549.method426(7681, 8448, -24610);
            this.field549.method412(0, 34168, 768, 119);
        }
        this.field549.method392((byte) 106, 1);
        this.field549.method381((byte) 28, var10);
        this.field549.method426(7681, 8448, -24610);
        this.field549.method412(0, 34168, 768, -66);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field1369 / (float) var10.field1365;
        float var12 = var10.field1364 / (float) var10.field1368;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field548.method1702(-87, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field549.method412(0, 5890, 768, 96);
        this.field549.method426(8448, 8448, -24610);
        this.field549.method381((byte) 28, null);
        this.field549.method392((byte) 106, 0);
        if (this.field547 || arg4) {
            this.field549.method412(0, 5890, 768, 94);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lda;Lfj;[Lef;Z)V", line = 69)
    public class37(class44 arg0, class470 arg1, class340[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field549 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class340 var50 = arg2[var6];
            if (var50.field5115 > var5) {
                var5 = var50.field5115;
            }
            if (var50.field5114 > var5) {
                var5 = var50.field5114;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class340 var10 = arg2[var9];
                byte[] var11 = var10.field5113;
                int var12 = var10.field5115;
                int var13 = var10.field5114;
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
            this.field550 = class301.method1938(-84, var7, 6406, arg0, 6406, false, var8, var7);
            this.field547 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class340 var36 = arg2[var21];
                int[] var37 = var36.field5112;
                byte[] var38 = var36.field5116;
                byte[] var39 = var36.field5113;
                int var40 = var36.field5115;
                int var41 = var36.field5114;
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
            this.field550 = class374.method2297(arg0, var7, var7, var20, 34037, false);
            this.field547 = false;
        }
        this.field550.method2346(3, false);
        this.field548 = new class267(arg0, 256);
        float var22 = this.field550.field1369 / (float) this.field550.field1365;
        float var23 = this.field550.field1364 / (float) this.field550.field1368;
        for (int var24 = 0; var24 < 256; var24++) {
            class340 var25 = arg2[var24];
            int var26 = var25.field5115;
            int var27 = var25.field5114;
            int var28 = var25.field5118;
            int var29 = var25.field5119;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field548.method1699((byte) 88, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field550.field1364 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field550.field1364 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field550.field1364 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field550.field1364 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field548.method1700(2);
        }
    }
}
