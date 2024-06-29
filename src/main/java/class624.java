import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class624 extends class59 {

    @OriginalMember(owner = "client!lha", name = "w", descriptor = "Leea;")
    private class131 field8677;

    @OriginalMember(owner = "client!lha", name = "v", descriptor = "Lll;")
    private class364 field8676;

    @OriginalMember(owner = "client!lha", name = "x", descriptor = "Z")
    private boolean field8678;

    @OriginalMember(owner = "client!lha", name = "u", descriptor = "Lup;")
    private class274 field8675;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method102(char arg0, int arg1, int arg2, int arg3, boolean arg4, class486 arg5, int arg6, int arg7) {
        class397 var9 = (class397) arg5;
        class364 var10 = var9.field5597;
        this.field8677.method888(4);
        this.field8677.method926(this.field8676, 92);
        if (this.field8678 || arg4) {
            this.field8677.method946(false, 7681, 8448);
            this.field8677.method883((byte) 34, 0, 768, 34168);
        } else {
            this.field8677.method946(false, 7681, 7681);
        }
        this.field8677.method884(1, true);
        this.field8677.method926(var10, 105);
        this.field8677.method946(false, 7681, 8448);
        this.field8677.method883((byte) 34, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field5154 / (float) var10.field5158;
        float var12 = var10.field5152 / (float) var10.field5153;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8675.method1783(-24, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8677.method883((byte) 34, 0, 768, 5890);
        this.field8677.method946(false, 8448, 8448);
        this.field8677.method926(null, 66);
        this.field8677.method884(0, true);
        if (this.field8678 || arg4) {
            this.field8677.method883((byte) 34, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!lha", name = "fa", descriptor = "(CIIIZ)V", line = 51)
    public final void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8677.method888(4);
        this.field8677.method926(this.field8676, 62);
        if (this.field8678 || arg4) {
            this.field8677.method946(false, 7681, 8448);
            this.field8677.method883((byte) 34, 0, 768, 34168);
        } else {
            this.field8677.method946(false, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8675.method1783(-32, arg0);
        OpenGL.glLoadIdentity();
        if (this.field8678 || arg4) {
            this.field8677.method883((byte) 34, 0, 768, 5890);
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Leea;Lqm;[Ldga;Z)V", line = 70)
    public class624(class131 arg0, class143 arg1, class204[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8677 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class204 var54 = arg2[var6];
            if (var54.field2664 > var5) {
                var5 = var54.field2664;
            }
            if (var54.field2657 > var5) {
                var5 = var54.field2657;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class204 var10 = arg2[var9];
                int var11 = var10.field2664;
                int var12 = var10.field2657;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2660 == null) {
                    byte[] var17 = var10.field2661;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2660;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8676 = class294.method1914(true, var7, false, var7, var8, arg0, 6406, 6406);
            this.field8678 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class204 var39 = arg2[var24];
                int[] var40 = var39.field2656;
                byte[] var41 = var39.field2660;
                byte[] var42 = var39.field2661;
                int var43 = var39.field2664;
                int var44 = var39.field2657;
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
            this.field8676 = class479.method2862(false, 0, arg0, var23, 0, 34037, var7, var7);
            this.field8678 = false;
        }
        this.field8676.method1297(false, false);
        this.field8675 = new class274(arg0, 256);
        float var25 = this.field8676.field5154 / (float) this.field8676.field5158;
        float var26 = this.field8676.field5152 / (float) this.field8676.field5153;
        for (int var27 = 0; var27 < 256; var27++) {
            class204 var28 = arg2[var27];
            int var29 = var28.field2664;
            int var30 = var28.field2657;
            int var31 = var28.field2659;
            int var32 = var28.field2662;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8675.method1785(var27, 119);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8676.field5152 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8676.field5152 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8676.field5152 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8676.field5152 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8675.method1784(-50135600);
        }
    }
}
