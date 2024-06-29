import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class379 extends class315 {

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lef;")
    private class338 field5543;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Ltq;")
    private class442 field5546;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
    private boolean field5545;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lih;")
    private class492 field5544;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lef;Ldq;[Lft;Z)V")
    public class379(class338 arg0, class490 arg1, class4[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5543 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class4 var50 = arg2[var6];
            if (var50.field36 > var5) {
                var5 = var50.field36;
            }
            if (var50.field41 > var5) {
                var5 = var50.field41;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class4 var10 = arg2[var9];
                byte[] var11 = var10.field34;
                int var12 = var10.field36;
                int var13 = var10.field41;
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
            this.field5546 = class55.method468(false, var7, arg0, var7, (byte) 38, var8, 6406, 6406);
            this.field5545 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class4 var36 = arg2[var21];
                int[] var37 = var36.field40;
                byte[] var38 = var36.field39;
                byte[] var39 = var36.field34;
                int var40 = var36.field36;
                int var41 = var36.field41;
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
            this.field5546 = class300.method1760(var7, false, (byte) -91, var20, var7, arg0);
            this.field5545 = false;
        }
        this.field5546.method335((byte) 51, false);
        this.field5544 = new class492(arg0, 256);
        float var22 = this.field5546.field6542 / (float) this.field5546.field6539;
        float var23 = this.field5546.field6543 / (float) this.field5546.field6545;
        for (int var24 = 0; var24 < 256; var24++) {
            class4 var25 = arg2[var24];
            int var26 = var25.field36;
            int var27 = var25.field41;
            int var28 = var25.field33;
            int var29 = var25.field37;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field5544.method2884(4864, var24);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field5546.field6543 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field5546.field6543 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5546.field6543 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5546.field6543 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field5544.method2883(-30137);
        }
    }

    @OriginalMember(owner = "client!lb", name = "OA", descriptor = "(CIIIZ)V")
    public final void method1057(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5543.method1980((byte) 88);
        this.field5543.method1996(2, this.field5546);
        if (this.field5545 || arg4) {
            this.field5543.method1963(true, 7681, 8448);
            this.field5543.method1975(34176, 34168, 768, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5544.method2881(0, arg0);
        OpenGL.glLoadIdentity();
        if (this.field5545 || arg4) {
            this.field5543.method1975(34176, 5890, 768, 0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method1058(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        class320 var9 = (class320) arg5;
        class442 var10 = var9.field4374;
        this.field5543.method1980((byte) 111);
        this.field5543.method1996(2, this.field5546);
        if (this.field5545 || arg4) {
            this.field5543.method1963(true, 7681, 8448);
            this.field5543.method1975(34176, 34168, 768, 0);
        }
        this.field5543.method1950(-29847, 1);
        this.field5543.method1996(2, var10);
        this.field5543.method1963(true, 7681, 8448);
        this.field5543.method1975(34176, 34168, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field6542 / (float) var10.field6539;
        float var12 = var10.field6543 / (float) var10.field6545;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5544.method2881(0, arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5543.method1975(34176, 5890, 768, 0);
        this.field5543.method1963(true, 8448, 8448);
        this.field5543.method1996(2, null);
        this.field5543.method1950(-29847, 0);
        if (this.field5545 || arg4) {
            this.field5543.method1975(34176, 5890, 768, 0);
        }
    }
}
