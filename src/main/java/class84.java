import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class84 extends class64 {

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Lvf;")
    private class159 field1271;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lub;")
    private class20 field1270;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "Z")
    private boolean field1268;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lfga;")
    private class266 field1269;

    @OriginalMember(owner = "client!kl", name = "fa", descriptor = "(CIIIZ)V", line = 5)
    public final void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1271.method1441(true);
        this.field1271.method1497(this.field1270, true);
        if (this.field1268 || arg4) {
            this.field1271.method1492(8448, 7681, (byte) 17);
            this.field1271.method1456((byte) -101, 768, 34168, 0);
        } else {
            this.field1271.method1492(7681, 7681, (byte) 17);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1269.method2307(-1, arg0);
        OpenGL.glLoadIdentity();
        if (this.field1268 || arg4) {
            this.field1271.method1456((byte) -101, 768, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(CIIIZLaa;II)V", line = 27)
    public final void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
        class553 var9 = (class553) arg5;
        class20 var10 = var9.field8103;
        this.field1271.method1441(true);
        this.field1271.method1497(this.field1270, true);
        if (this.field1268 || arg4) {
            this.field1271.method1492(8448, 7681, (byte) 17);
            this.field1271.method1456((byte) -101, 768, 34168, 0);
        } else {
            this.field1271.method1492(7681, 7681, (byte) 17);
        }
        this.field1271.method1432((byte) 3, 1);
        this.field1271.method1497(var10, true);
        this.field1271.method1492(8448, 7681, (byte) 17);
        this.field1271.method1456((byte) -101, 768, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field201 / (float) var10.field205;
        float var12 = var10.field202 / (float) var10.field197;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field1269.method2307(-1, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field1271.method1456((byte) -101, 768, 5890, 0);
        this.field1271.method1492(8448, 8448, (byte) 17);
        this.field1271.method1497(null, true);
        this.field1271.method1432((byte) 3, 0);
        if (this.field1268 || arg4) {
            this.field1271.method1456((byte) -101, 768, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lvf;Lkaa;[Luh;Z)V", line = 74)
    public class84(class159 arg0, class49 arg1, class174[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field1271 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class174 var54 = arg2[var6];
            if (var54.field2782 > var5) {
                var5 = var54.field2782;
            }
            if (var54.field2781 > var5) {
                var5 = var54.field2781;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class174 var10 = arg2[var9];
                int var11 = var10.field2782;
                int var12 = var10.field2781;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field2779 == null) {
                    byte[] var17 = var10.field2776;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field2779;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field1270 = class271.method2337(var7, var7, arg0, 6406, var8, true, 6406, false);
            this.field1268 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class174 var39 = arg2[var24];
                int[] var40 = var39.field2775;
                byte[] var41 = var39.field2779;
                byte[] var42 = var39.field2776;
                int var43 = var39.field2782;
                int var44 = var39.field2781;
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
            this.field1270 = class447.method3492(false, var7, arg0, var7, 0, 0, var23, 43);
            this.field1268 = false;
        }
        this.field1270.method1967(-124, false);
        this.field1269 = new class266(arg0, 256);
        float var25 = this.field1270.field201 / (float) this.field1270.field205;
        float var26 = this.field1270.field202 / (float) this.field1270.field197;
        for (int var27 = 0; var27 < 256; var27++) {
            class174 var28 = arg2[var27];
            int var29 = var28.field2782;
            int var30 = var28.field2781;
            int var31 = var28.field2778;
            int var32 = var28.field2774;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field1269.method2303(var27, 8334);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field1270.field202 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field1270.field202 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1270.field202 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field1270.field202 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field1269.method2304(false);
        }
    }
}
