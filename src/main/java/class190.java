import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3075 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private static int field3077 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lrh;")
    public static class17 field3076 = null;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method1356(int arg0, int arg1, int arg2, int arg3) {
        class166.method1186();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class166.field2651 - ((float) arg1 + 0.3F);
        GL var7 = class166.field2648;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIII)V", line = 20)
    public static final void method1357(int arg0, int arg1, int arg2, int arg3) {
        if (field3075 < arg0) {
            field3075 = arg0;
        }
        if (field3073 < arg1) {
            field3073 = arg1;
        }
        if (field3077 > arg2) {
            field3077 = arg2;
        }
        if (field3074 > arg3) {
            field3074 = arg3;
        }
        GL var4 = class166.field2648;
        var4.glEnable(3089);
        if (field3075 <= field3077 && field3073 <= field3074) {
            var4.glScissor(field3075, class166.field2651 - field3074, field3077 - field3075, field3074 - field3073);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1368();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V", line = 45)
    public static final void method1358() {
        class166.field2648.glClear(16640);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class166.method1186();
        GL var25 = class166.field2648;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class166.field2651 - var24));
            var25.glVertex2f((float) var19, (float) (class166.field2651 - var23));
            var25.glVertex2f((float) var18, (float) (class166.field2651 - var22));
            var25.glVertex2f((float) var17, (float) (class166.field2651 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class166.field2651 - var21));
            var25.glVertex2f((float) var18, (float) (class166.field2651 - var22));
            var25.glVertex2f((float) var19, (float) (class166.field2651 - var23));
            var25.glVertex2f((float) var20, (float) (class166.field2651 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V", line = 127)
    public static void method1360() {
        field3076 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V", line = 130)
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class166.method1186();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class166.field2651 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class166.field2648;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(IIII)V", line = 155)
    public static final void method1362(int arg0, int arg1, int arg2, int arg3) {
        class166.method1186();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class166.field2651 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class166.field2648;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIIII)V", line = 171)
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class166.method1186();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class166.field2651 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class166.field2648;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(IIIII)V", line = 191)
    public static final void method1364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class166.method1186();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class166.field2651 - ((float) arg1 + 0.3F);
        float var8 = (float) class166.field2651 - ((float) arg3 + 0.3F);
        GL var9 = class166.field2648;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIIIII)V", line = 209)
    public static final void method1365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class166.method1186();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class166.field2651 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class166.field2648;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V", line = 229)
    public static final void method1366() {
        field3075 = 0;
        field3073 = 0;
        field3077 = class166.field2626;
        field3074 = class166.field2651;
        GL var0 = class166.field2648;
        var0.glDisable(3089);
        method1368();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lrh;)V", line = 242)
    public static final void method1367(class17 arg0) {
        if (field3074 - field3073 != arg0.field3189) {
            throw new IllegalArgumentException();
        }
        field3076 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()V", line = 254)
    public static final void method1368() {
        field3076 = null;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(IIII)V", line = 264)
    public static final void method1369(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class166.field2626) {
            arg2 = class166.field2626;
        }
        if (arg3 > class166.field2651) {
            arg3 = class166.field2651;
        }
        field3075 = arg0;
        field3073 = arg1;
        field3077 = arg2;
        field3074 = arg3;
        GL var4 = class166.field2648;
        var4.glEnable(3089);
        if (field3075 <= field3077 && field3073 <= field3074) {
            var4.glScissor(field3075, class166.field2651 - field3074, field3077 - field3075, field3074 - field3073);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1368();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(IIIIII)V", line = 293)
    public static final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class166.method1186();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class166.field2651 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class166.field2648;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
