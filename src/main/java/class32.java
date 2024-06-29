import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 extends class67 {

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "Lhk;")
    private class111 field558;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "Lvq;")
    private class488 field556;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "Z")
    private boolean field555;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "Lcga;")
    private class509 field557;

    @OriginalMember(owner = "client!iha", name = "fa", descriptor = "(CIIIZ)V")
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field558.method946((byte) 108);
        this.field558.method939(this.field556, 8448);
        if (this.field555 || arg4) {
            this.field558.method990(7681, 8448, -29641);
            this.field558.method988(34168, 6, 0, 768);
        } else {
            this.field558.method990(7681, 7681, -29641);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field557.method2906(arg0, 88);
        OpenGL.glLoadIdentity();
        if (this.field555 || arg4) {
            this.field558.method988(5890, 6, 0, 768);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
        class699 var9 = (class699) arg5;
        class488 var10 = var9.field9649;
        this.field558.method946((byte) 124);
        this.field558.method939(this.field556, 8448);
        if (this.field555 || arg4) {
            this.field558.method990(7681, 8448, -29641);
            this.field558.method988(34168, 6, 0, 768);
        } else {
            this.field558.method990(7681, 7681, -29641);
        }
        this.field558.method1002(1, -5172);
        this.field558.method939(var10, 8448);
        this.field558.method990(7681, 8448, -29641);
        this.field558.method988(34168, 6, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6581 / (float) var10.field6588;
        float var12 = var10.field6586 / (float) var10.field6584;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field557.method2906(arg0, -64);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field558.method988(5890, 6, 0, 768);
        this.field558.method990(8448, 8448, -29641);
        this.field558.method939(null, 8448);
        this.field558.method1002(0, -5172);
        if (this.field555 || arg4) {
            this.field558.method988(5890, 6, 0, 768);
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lhk;Lkc;[Lgs;Z)V")
    public class32(class111 arg0, class145 arg1, class49[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field558 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class49 var54 = arg2[var6];
            if (var54.field741 > var5) {
                var5 = var54.field741;
            }
            if (var54.field745 > var5) {
                var5 = var54.field745;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class49 var10 = arg2[var9];
                int var11 = var10.field741;
                int var12 = var10.field745;
                int var13 = var9 % 16 * var5;
                int var14 = var9 / 16 * var5;
                int var15 = var7 * var14 + var13;
                int var16 = 0;
                if (var10.field737 == null) {
                    byte[] var17 = var10.field743;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var12; var19++) {
                            var8[var15++] = (byte) (var17[var16++] == 0 ? 0 : -1);
                        }
                        var15 += var7 - var12;
                    }
                } else {
                    byte[] var20 = var10.field737;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            var8[var15++] = var20[var16++];
                        }
                        var15 += var7 - var12;
                    }
                }
            }
            this.field556 = class384.method2329(6406, var7, false, var7, arg0, 6406, (byte) 113, var8);
            this.field555 = true;
        } else {
            int[] var23 = new int[var7 * var7];
            for (int var24 = 0; var24 < 256; var24++) {
                class49 var39 = arg2[var24];
                int[] var40 = var39.field739;
                byte[] var41 = var39.field737;
                byte[] var42 = var39.field743;
                int var43 = var39.field741;
                int var44 = var39.field745;
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
            this.field556 = class568.method3281(var7, false, 0, arg0, 0, var7, var23, 20539);
            this.field555 = false;
        }
        this.field556.method126(false, -22513);
        this.field557 = new class509(arg0, 256);
        float var25 = this.field556.field6581 / (float) this.field556.field6588;
        float var26 = this.field556.field6586 / (float) this.field556.field6584;
        for (int var27 = 0; var27 < 256; var27++) {
            class49 var28 = arg2[var27];
            int var29 = var28.field741;
            int var30 = var28.field745;
            int var31 = var28.field738;
            int var32 = var28.field744;
            float var33 = (float) (var27 % 16 * var5);
            float var34 = (float) (var27 / 16 * var5);
            float var35 = var25 * var33;
            float var36 = var26 * var34;
            float var37 = ((float) var30 + var33) * var25;
            float var38 = ((float) var29 + var34) * var26;
            this.field557.method2902(var27, 4864);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var35, this.field556.field6586 - var36);
            OpenGL.glVertex2i(var32, var31);
            OpenGL.glTexCoord2f(var35, this.field556.field6586 - var38);
            OpenGL.glVertex2i(var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field556.field6586 - var38);
            OpenGL.glVertex2i(var30 + var32, var29 + var31);
            OpenGL.glTexCoord2f(var37, this.field556.field6586 - var36);
            OpenGL.glVertex2i(var30 + var32, var31);
            OpenGL.glEnd();
            this.field557.method2901(4);
        }
    }
}
