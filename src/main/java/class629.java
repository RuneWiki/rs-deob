import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class629 extends class216 {

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "Lml;")
    private class194 field8960;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "Lgda;")
    private class268 field8958;

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "Z")
    private boolean field8959;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "Lkca;")
    private class13 field8961;

    @OriginalMember(owner = "client!mga", name = "fa", descriptor = "(CIIIZ)V")
    public final void method950(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8960.method1662((byte) 83);
        this.field8960.method1618((byte) -127, this.field8958);
        if (this.field8959 || arg4) {
            this.field8960.method1628(8448, 7681, 34162);
            this.field8960.method1669(768, 0, 34168, (byte) -115);
        } else {
            this.field8960.method1628(7681, 7681, 34162);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8961.method88(arg0, (byte) -112);
        OpenGL.glLoadIdentity();
        if (this.field8959 || arg4) {
            this.field8960.method1669(768, 0, 5890, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lml;Lcd;[Lcu;Z)V")
    public class629(class194 arg0, class161 arg1, class66[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8960 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class66 var54 = arg2[var6];
            if (var54.field977 > var5) {
                var5 = var54.field977;
            }
            if (var54.field981 > var5) {
                var5 = var54.field981;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class66 var10 = arg2[var9];
                int var11 = var10.field977;
                int var12 = var10.field981;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field976 == null) {
                    byte[] var17 = var10.field982;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field976;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field8958 = class172.method1453(34037, var7, var8, false, arg0, var7, 6406, 6406);
            this.field8959 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class66 var39 = arg2[var24];
                int[] var40 = var39.field979;
                byte[] var41 = var39.field976;
                byte[] var42 = var39.field982;
                int var43 = var39.field977;
                int var44 = var39.field981;
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
            this.field8958 = class239.method1981(false, -14869, 0, var7, var23, arg0, 0, var7);
            this.field8959 = false;
        }
        this.field8958.method3600(110, false);
        this.field8961 = new class13(arg0, 256);
        float var25 = this.field8958.field3802 / (float) this.field8958.field3804;
        float var26 = this.field8958.field3803 / (float) this.field8958.field3799;
        for (int var27 = 0; var27 < 256; var27++) {
            class66 var28 = arg2[var27];
            int var29 = var28.field977;
            int var30 = var28.field981;
            int var31 = var28.field983;
            int var32 = var28.field984;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field8961.method90(var27, (byte) 81);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field8958.field3803 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field8958.field3803 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8958.field3803 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field8958.field3803 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field8961.method87((byte) 103);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method946(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7) {
        class581 var9 = (class581) arg5;
        class268 var10 = var9.field8395;
        this.field8960.method1662((byte) 83);
        this.field8960.method1618((byte) -93, this.field8958);
        if (this.field8959 || arg4) {
            this.field8960.method1628(8448, 7681, 34162);
            this.field8960.method1669(768, 0, 34168, (byte) -113);
        } else {
            this.field8960.method1628(7681, 7681, 34162);
        }
        this.field8960.method1619(1, (byte) 125);
        this.field8960.method1618((byte) 8, var10);
        this.field8960.method1628(8448, 7681, 34162);
        this.field8960.method1669(768, 0, 34168, (byte) -121);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field3802 / (float) var10.field3804;
        float var12 = var10.field3803 / (float) var10.field3799;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8961.method88(arg0, (byte) -112);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8960.method1669(768, 0, 5890, (byte) -121);
        this.field8960.method1628(8448, 8448, 34162);
        this.field8960.method1618((byte) -98, null);
        this.field8960.method1619(0, (byte) 125);
        if (this.field8959 || arg4) {
            this.field8960.method1669(768, 0, 5890, (byte) -120);
        }
    }
}
