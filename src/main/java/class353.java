import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class353 extends class269 {

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Lbt;")
    private class33 field5146;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lhf;")
    private class277 field5143;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Z")
    private boolean field5144;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Luv;")
    private class250 field5145;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lbt;Lgg;[Lho;Z)V")
    public class353(class33 arg0, class119 arg1, class104[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field5146 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            class104 var50 = arg2[var6];
            if (var50.field1594 > var5) {
                var5 = var50.field1594;
            }
            if (var50.field1590 > var5) {
                var5 = var50.field1590;
            }
        }
        int var7 = var5 * 16;
        if (arg3) {
            byte[] var8 = new byte[var7 * var7];
            for (int var9 = 0; var9 < 256; var9++) {
                class104 var10 = arg2[var9];
                byte[] var11 = var10.field1587;
                int var12 = var10.field1594;
                int var13 = var10.field1590;
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
            this.field5143 = class152.method1080(var8, 110, false, var7, arg0, 6406, var7, 6406);
            this.field5144 = true;
        } else {
            int[] var20 = new int[var7 * var7];
            for (int var21 = 0; var21 < 256; var21++) {
                class104 var36 = arg2[var21];
                int[] var37 = var36.field1588;
                byte[] var38 = var36.field1589;
                byte[] var39 = var36.field1587;
                int var40 = var36.field1594;
                int var41 = var36.field1590;
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
            this.field5143 = class391.method2355(arg0, var7, var7, false, var20, -125);
            this.field5144 = false;
        }
        this.field5143.method879(false, (byte) 101);
        this.field5145 = new class250(arg0, 256);
        float var22 = this.field5143.field4131 / (float) this.field5143.field4125;
        float var23 = this.field5143.field4127 / (float) this.field5143.field4135;
        for (int var24 = 0; var24 < 256; var24++) {
            class104 var25 = arg2[var24];
            int var26 = var25.field1594;
            int var27 = var25.field1590;
            int var28 = var25.field1595;
            int var29 = var25.field1592;
            float var30 = (float) (var24 % 16 * var5);
            float var31 = (float) (var24 / 16 * var5);
            float var32 = var22 * var30;
            float var33 = var23 * var31;
            float var34 = ((float) var27 + var30) * var22;
            float var35 = ((float) var26 + var31) * var23;
            this.field5145.method1622(var24, (byte) 69);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var32, this.field5143.field4127 - var33);
            OpenGL.glVertex2i(var29, var28);
            OpenGL.glTexCoord2f(var32, this.field5143.field4127 - var35);
            OpenGL.glVertex2i(var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5143.field4127 - var35);
            OpenGL.glVertex2i(var27 + var29, var26 + var28);
            OpenGL.glTexCoord2f(var34, this.field5143.field4127 - var33);
            OpenGL.glVertex2i(var27 + var29, var28);
            OpenGL.glEnd();
            this.field5145.method1624(-22853);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(CIIIZLi;II)V")
    public final void method403(char arg0, int arg1, int arg2, int arg3, boolean arg4, class31 arg5, int arg6, int arg7) {
        class173 var9 = (class173) arg5;
        class277 var10 = var9.field2592;
        this.field5146.method315(3008);
        this.field5146.method285(false, this.field5143);
        if (this.field5144 || arg4) {
            this.field5146.method275(7681, 8448, 125);
            this.field5146.method333(false, 34168, 768, 0);
        }
        this.field5146.method277(1, (byte) 81);
        this.field5146.method285(false, var10);
        this.field5146.method275(7681, 8448, 127);
        this.field5146.method333(false, 34168, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field4131 / (float) var10.field4125;
        float var12 = var10.field4127 / (float) var10.field4135;
        OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) (-arg6) * var11 }, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) (-arg7) * var12 }, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5145.method1625(arg0, (byte) -36);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field5146.method333(false, 5890, 768, 0);
        this.field5146.method275(8448, 8448, 122);
        this.field5146.method285(false, null);
        this.field5146.method277(0, (byte) 79);
        if (this.field5144 || arg4) {
            this.field5146.method333(false, 5890, 768, 0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(CIIIZ)V")
    public final void method406(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5146.method315(3008);
        this.field5146.method285(false, this.field5143);
        if (this.field5144 || arg4) {
            this.field5146.method275(7681, 8448, 120);
            this.field5146.method333(false, 34168, 768, 0);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field5145.method1625(arg0, (byte) -36);
        OpenGL.glLoadIdentity();
        if (this.field5144 || arg4) {
            this.field5146.method333(false, 5890, 768, 0);
        }
    }
}
