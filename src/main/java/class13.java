import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field185 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lri;")
    public static class68 field184 = null;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    private static int field183 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.method1456();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class217.field3531 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class217.field3551;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lri;)V", line = 29)
    public static final void method69(class68 arg0) {
        if (field182 - field185 != arg0.field3284) {
            throw new IllegalArgumentException();
        }
        field184 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 41)
    public static void method70() {
        field184 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 44)
    public static final void method71() {
        field184 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII)V", line = 47)
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class217.method1456();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class217.field3531 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class217.field3551;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([IIIII)V", line = 69)
    public static final void method73(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.method1456();
        GL var5 = class217.field3551;
        var5.glRasterPos2i(arg1, class217.field3531 - arg2);
        var5.glPixelZoom(1.0F, -1.0F);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class217.field3537 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
        var5.glPixelZoom(1.0F, 1.0F);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIIII)V", line = 82)
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class217.method1456();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class217.field3531 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class217.field3551;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V", line = 103)
    public static final void method75(int arg0, int arg1, int arg2, int arg3) {
        class217.method1456();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class217.field3531 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class217.field3551;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIII)V", line = 119)
    public static final void method76(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class217.field3546) {
            arg2 = class217.field3546;
        }
        if (arg3 > class217.field3531) {
            arg3 = class217.field3531;
        }
        field181 = arg0;
        field185 = arg1;
        field183 = arg2;
        field182 = arg3;
        GL var4 = class217.field3551;
        var4.glEnable(3089);
        if (field181 <= field183 && field185 <= field182) {
            var4.glScissor(field181, class217.field3531 - field182, field183 - field181, field182 - field185);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method71();
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIII)V", line = 146)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.method1456();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class217.field3531 - ((float) arg1 + 0.3F);
        float var8 = (float) class217.field3531 - ((float) arg3 + 0.3F);
        GL var9 = class217.field3551;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IIIII)V", line = 166)
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.method1456();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class217.field3531 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class217.field3551;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IIII)V", line = 189)
    public static final void method79(int arg0, int arg1, int arg2, int arg3) {
        if (field181 < arg0) {
            field181 = arg0;
        }
        if (field185 < arg1) {
            field185 = arg1;
        }
        if (field183 > arg2) {
            field183 = arg2;
        }
        if (field182 > arg3) {
            field182 = arg3;
        }
        GL var4 = class217.field3551;
        var4.glEnable(3089);
        if (field181 <= field183 && field185 <= field182) {
            var4.glScissor(field181, class217.field3531 - field182, field183 - field181, field182 - field185);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method71();
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(IIII)V", line = 212)
    public static final void method80(int arg0, int arg1, int arg2, int arg3) {
        class217.method1456();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class217.field3531 - ((float) arg1 + 0.3F);
        GL var7 = class217.field3551;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 230)
    public static final void method81() {
        field181 = 0;
        field185 = 0;
        field183 = class217.field3546;
        field182 = class217.field3531;
        GL var0 = class217.field3551;
        var0.glDisable(3089);
        method71();
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()V", line = 251)
    public static final void method82() {
        class217.field3551.glClear(16640);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IIIIII)V", line = 256)
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 + var13;
        int var18 = arg0 - var14;
        int var19 = arg0 + var6 - var14;
        int var20 = arg0 + var6 + var13;
        int var21 = arg1 + var15;
        int var22 = arg1 - var16;
        int var23 = arg1 + var7 - var16;
        int var24 = arg1 + var7 + var15;
        class217.method1456();
        GL var25 = class217.field3551;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class217.field3531 - var24));
            var25.glVertex2f((float) var19, (float) (class217.field3531 - var23));
            var25.glVertex2f((float) var18, (float) (class217.field3531 - var22));
            var25.glVertex2f((float) var17, (float) (class217.field3531 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class217.field3531 - var21));
            var25.glVertex2f((float) var18, (float) (class217.field3531 - var22));
            var25.glVertex2f((float) var19, (float) (class217.field3531 - var23));
            var25.glVertex2f((float) var20, (float) (class217.field3531 - var24));
        }
        var25.glEnd();
    }
}
