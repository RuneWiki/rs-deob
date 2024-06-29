import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class34 extends class485 {

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Lqi;")
    private class458 field544;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Lr;")
    private class414 field541;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "Z")
    private boolean field543;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "Lt;")
    private class391 field542;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(CIIIZLvb;II)V", line = 7)
    public final void method258(char arg0, int arg1, int arg2, int arg3, boolean arg4, class90 arg5, int arg6, int arg7) {
        class470 var9 = (class470) arg5;
        class414 var10 = var9.field6580;
        opengl var11 = this.field544.field6330;
        this.field544.method2681();
        this.field544.method2692(this.field541);
        if (this.field543 || arg4) {
            this.field544.method2702(7681, 8448);
            this.field544.method2670(0, 34168, 768);
        }
        this.field544.method2660(1);
        this.field544.method2692(var10);
        this.field544.method2702(7681, 8448);
        this.field544.method2670(0, 34168, 768);
        var11.glTexGeni(8192, 9472, 9216);
        var11.glTexGeni(8193, 9472, 9216);
        float var12 = var10.field5718 / (float) var10.field5719;
        float var13 = var10.field5720 / (float) var10.field5721;
        var11.glTexGenfv(8192, 9474, new float[] { var12, 0.0F, 0.0F, (float) (-arg6) * var12 }, 0);
        var11.glTexGenfv(8193, 9474, new float[] { 0.0F, var13, 0.0F, (float) (-arg7) * var13 }, 0);
        var11.glEnable(3168);
        var11.glEnable(3169);
        var11.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var11.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field542.method2339(arg0);
        var11.glLoadIdentity();
        var11.glDisable(3168);
        var11.glDisable(3169);
        this.field544.method2670(0, 5890, 768);
        this.field544.method2702(8448, 8448);
        this.field544.method2692((class179) null);
        this.field544.method2660(0);
        if (this.field543 || arg4) {
            this.field544.method2670(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(CIIIZ)V", line = 53)
    public final void method259(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        opengl var6 = this.field544.field6330;
        this.field544.method2681();
        this.field544.method2692(this.field541);
        if (this.field543 || arg4) {
            this.field544.method2702(7681, 8448);
            this.field544.method2670(0, 34168, 768);
        }
        var6.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        var6.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field542.method2339(arg0);
        var6.glLoadIdentity();
        if (this.field543 || arg4) {
            this.field544.method2670(0, 5890, 768);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lqi;Lss;[Lua;Z)V", line = 74)
    public class34(class458 arg0, class76 arg1, class140[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field544 = arg0;
        opengl var5 = arg0.field6330;
        int var6 = 0;
        for (int var7 = 0; var7 < 256; var7++) {
            class140 var8 = arg2[var7];
            if (var8.field1989 > var6) {
                var6 = var8.field1989;
            }
            if (var8.field1993 > var6) {
                var6 = var8.field1993;
            }
        }
        int var9 = var6 * 16;
        if (arg3) {
            byte[] var10 = new byte[var9 * var9];
            for (int var11 = 0; var11 < 256; var11++) {
                class140 var12 = arg2[var11];
                byte[] var13 = var12.field1995;
                int var14 = var12.field1989;
                int var15 = var12.field1993;
                int var16 = var11 % 16 * var6;
                int var17 = var11 / 16 * var6;
                int var18 = var9 * var17 + var16;
                int var19 = 0;
                for (int var20 = 0; var20 < var14; var20++) {
                    for (int var21 = 0; var21 < var15; var21++) {
                        var10[var18++] = (byte) (var13[var19++] == 0 ? 0 : -1);
                    }
                    var18 += var9 - var15;
                }
            }
            this.field541 = class414.method2416(-122, var9, arg0, var10, var9, false, 6406, 6406);
            this.field543 = true;
        } else {
            int[] var22 = new int[var9 * var9];
            for (int var23 = 0; var23 < 256; var23++) {
                class140 var24 = arg2[var23];
                int[] var25 = var24.field1991;
                byte[] var26 = var24.field1994;
                byte[] var27 = var24.field1995;
                int var28 = var24.field1989;
                int var29 = var24.field1993;
                int var30 = var23 % 16 * var6;
                int var31 = var23 / 16 * var6;
                int var32 = var9 * var31 + var30;
                int var33 = 0;
                if (var26 == null) {
                    for (int var36 = 0; var36 < var28; var36++) {
                        for (int var37 = 0; var37 < var29; var37++) {
                            var22[var32++] = var25[var27[var33++] & 0xFF] | 0xFF000000;
                        }
                        var32 += var9 - var29;
                    }
                } else {
                    for (int var34 = 0; var34 < var28; var34++) {
                        for (int var35 = 0; var35 < var29; var35++) {
                            var22[var32++] = var26[var33] << 24 | var25[var27[var33] & 0xFF];
                            var33++;
                        }
                        var32 += var9 - var29;
                    }
                }
            }
            this.field541 = class414.method2417(var22, arg0, var9, false, false, var9);
            this.field543 = false;
        }
        this.field541.method1168(false);
        this.field542 = new class391(arg0, 256);
        float var38 = this.field541.field5718 / (float) this.field541.field5719;
        float var39 = this.field541.field5720 / (float) this.field541.field5721;
        for (int var40 = 0; var40 < 256; var40++) {
            class140 var41 = arg2[var40];
            int var42 = var41.field1989;
            int var43 = var41.field1993;
            int var44 = var41.field1988;
            int var45 = var41.field1992;
            float var46 = (float) (var40 % 16 * var6);
            float var47 = (float) (var40 / 16 * var6);
            float var48 = var38 * var46;
            float var49 = var39 * var47;
            float var50 = ((float) var43 + var46) * var38;
            float var51 = ((float) var42 + var47) * var39;
            this.field542.method2338(var40);
            var5.glBegin(7);
            var5.glTexCoord2f(var48, this.field541.field5720 - var49);
            var5.glVertex2i(var45, var44);
            var5.glTexCoord2f(var48, this.field541.field5720 - var51);
            var5.glVertex2i(var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field541.field5720 - var51);
            var5.glVertex2i(var43 + var45, var42 + var44);
            var5.glTexCoord2f(var50, this.field541.field5720 - var49);
            var5.glVertex2i(var43 + var45, var44);
            var5.glEnd();
            this.field542.method2340();
        }
    }
}
