import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class222 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lgm;")
    public static class277 field3771 = null;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private static int field3772 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3773 = 0;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3775 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 4)
    public static void method1626() {
        field3771 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgm;)V", line = 7)
    public static final void method1627(class277 arg0) {
        if (field3774 - field3775 != arg0.field4320) {
            throw new IllegalArgumentException();
        }
        field3771 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 18)
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class47.method312();
        GL var25 = class47.field739;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class47.field762 - var24));
            var25.glVertex2f((float) var19, (float) (class47.field762 - var23));
            var25.glVertex2f((float) var18, (float) (class47.field762 - var22));
            var25.glVertex2f((float) var17, (float) (class47.field762 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class47.field762 - var21));
            var25.glVertex2f((float) var18, (float) (class47.field762 - var22));
            var25.glVertex2f((float) var19, (float) (class47.field762 - var23));
            var25.glVertex2f((float) var20, (float) (class47.field762 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 89)
    public static final void method1629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method312();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class47.field762 - ((float) arg1 + 0.3F);
        float var8 = (float) class47.field762 - ((float) arg3 + 0.3F);
        GL var9 = class47.field739;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIIII)V", line = 107)
    public static final void method1630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method312();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class47.field762 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class47.field739;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V", line = 129)
    public static final void method1631(int arg0, int arg1, int arg2, int arg3) {
        if (field3773 < arg0) {
            field3773 = arg0;
        }
        if (field3775 < arg1) {
            field3775 = arg1;
        }
        if (field3772 > arg2) {
            field3772 = arg2;
        }
        if (field3774 > arg3) {
            field3774 = arg3;
        }
        GL var4 = class47.field739;
        var4.glEnable(3089);
        if (field3773 <= field3772 && field3775 <= field3774) {
            var4.glScissor(field3773, class47.field762 - field3774, field3772 - field3773, field3774 - field3775);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1636();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V", line = 152)
    public static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method312();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class47.field762 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class47.field739;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 178)
    public static final void method1633() {
        field3773 = 0;
        field3775 = 0;
        field3772 = class47.field745;
        field3774 = class47.field762;
        GL var0 = class47.field739;
        var0.glDisable(3089);
        method1636();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V", line = 188)
    public static final void method1634(int arg0, int arg1, int arg2, int arg3) {
        class47.method312();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class47.field762 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class47.field739;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIII)V", line = 204)
    public static final void method1635(int arg0, int arg1, int arg2, int arg3) {
        class47.method312();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class47.field762 - ((float) arg1 + 0.3F);
        GL var7 = class47.field739;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 220)
    public static final void method1636() {
        field3771 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIIIII)V", line = 227)
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method312();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class47.field762 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class47.field739;
        var10.glBegin(6);
        var10.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var10.glVertex2f(var7, var8);
        var10.glVertex2f(var6, var8);
        var10.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(IIII)V", line = 251)
    public static final void method1638(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class47.field745) {
            arg2 = class47.field745;
        }
        if (arg3 > class47.field762) {
            arg3 = class47.field762;
        }
        field3773 = arg0;
        field3775 = arg1;
        field3772 = arg2;
        field3774 = arg3;
        GL var4 = class47.field739;
        var4.glEnable(3089);
        if (field3773 <= field3772 && field3775 <= field3774) {
            var4.glScissor(field3773, class47.field762 - field3774, field3772 - field3773, field3774 - field3775);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1636();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 278)
    public static final void method1639() {
        class47.field739.glClear(16640);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIIII)V", line = 281)
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method312();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class47.field762 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class47.field739;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(IIIIII)V", line = 306)
    public static final void method1641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method312();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class47.field762 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class47.field739;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
