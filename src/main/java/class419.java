import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class419 extends class416 {

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Lok;")
    private class228 field6103;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "Lot;")
    private class546 field6106;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "Z")
    private boolean field6105;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "Lhg;")
    private class642 field6104;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lok;Luq;[Lfg;Z)V")
    public class419(class228 arg0, class146 arg1, class113[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field6103 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class113 var54 = arg2[var6];
            if (var54.field1708 > var5) {
                var5 = var54.field1708;
            }
            if (var54.field1706 > var5) {
                var5 = var54.field1706;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class113 var10 = arg2[var9];
                int var11 = var10.field1708;
                int var12 = var10.field1706;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field1701 == null) {
                    byte[] var17 = var10.field1709;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field1701;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field6106 = class568.method3231(var7, 100, var7, var8, 6406, false, arg0, 6406);
            this.field6105 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class113 var39 = arg2[var24];
                int[] var40 = var39.field1702;
                byte[] var41 = var39.field1701;
                byte[] var42 = var39.field1709;
                int var43 = var39.field1708;
                int var44 = var39.field1706;
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
            this.field6106 = class64.method656(false, var7, arg0, var7, 125, var23);
            this.field6105 = false;
        }
        this.field6106.method3617((byte) 41, false);
        this.field6104 = new class642(arg0, 256);
        float var25 = this.field6106.field7676 / (float) this.field6106.field7681;
        float var26 = this.field6106.field7682 / (float) this.field6106.field7677;
        for (int var27 = 0; var27 < 256; var27++) {
            class113 var28 = arg2[var27];
            int var29 = var28.field1708;
            int var30 = var28.field1706;
            int var31 = var28.field1707;
            int var32 = var28.field1704;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field6104.method3579((byte) -68, var27);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field6106.field7682 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field6106.field7682 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6106.field7682 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field6106.field7682 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field6104.method3577((byte) -25);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method60(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
        class448 var9 = (class448) arg5;
        class546 var10 = var9.field6481;
        this.field6103.method1540((byte) 117);
        this.field6103.method1505(-2, this.field6106);
        if (this.field6105 || arg4) {
            this.field6103.method1527(1, 7681, 8448);
            this.field6103.method1503(0, 34168, (byte) 2, 768);
        } else {
            this.field6103.method1527(1, 7681, 7681);
        }
        this.field6103.method1500(33984, 1);
        this.field6103.method1505(-2, var10);
        this.field6103.method1527(1, 7681, 8448);
        this.field6103.method1503(0, 34168, (byte) 2, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field7676 / (float) var10.field7681;
        float var12 = var10.field7682 / (float) var10.field7677;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6104.method3574(52, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field6103.method1503(0, 5890, (byte) 2, 768);
        this.field6103.method1527(1, 8448, 8448);
        this.field6103.method1505(-2, null);
        this.field6103.method1500(33984, 0);
        if (this.field6105 || arg4) {
            this.field6103.method1503(0, 5890, (byte) 2, 768);
        }
    }

    @OriginalMember(owner = "client!gt", name = "OA", descriptor = "(CIIIZ)V")
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6103.method1540((byte) 124);
        this.field6103.method1505(-2, this.field6106);
        if (this.field6105 || arg4) {
            this.field6103.method1527(1, 7681, 8448);
            this.field6103.method1503(0, 34168, (byte) 2, 768);
        } else {
            this.field6103.method1527(1, 7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field6104.method3574(126, arg0);
        OpenGL.glLoadIdentity();
        if (this.field6105 || arg4) {
            this.field6103.method1503(0, 5890, (byte) 2, 768);
        }
    }
}
