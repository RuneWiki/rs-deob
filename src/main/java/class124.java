import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class124 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lgf;")
    public static class109 field1872 = null;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private static int field1871 = 0;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 4)
    public static final void method817() {
        field1872 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class45.method329();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class45.field667 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class45.field688;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 29)
    public static final void method819() {
        field1870 = 0;
        field1874 = 0;
        field1871 = class45.field678;
        field1873 = class45.field667;
        GL var0 = class45.field688;
        var0.glDisable(3089);
        method817();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lgf;)V", line = 39)
    public static final void method820(class109 arg0) {
        if (field1873 - field1874 != arg0.field3914) {
            throw new IllegalArgumentException();
        }
        field1872 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 49)
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class45.method329();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class45.field667 - ((float) arg1 + 0.3F);
        float var8 = (float) class45.field667 - ((float) arg3 + 0.3F);
        GL var9 = class45.field688;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V", line = 67)
    public static final void method822(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class45.field678) {
            arg2 = class45.field678;
        }
        if (arg3 > class45.field667) {
            arg3 = class45.field667;
        }
        field1870 = arg0;
        field1874 = arg1;
        field1871 = arg2;
        field1873 = arg3;
        GL var4 = class45.field688;
        var4.glEnable(3089);
        if (field1870 <= field1871 && field1874 <= field1873) {
            var4.glScissor(field1870, class45.field667 - field1873, field1871 - field1870, field1873 - field1874);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method817();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V", line = 94)
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class45.method329();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class45.field667 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class45.field688;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 114)
    public static final void method824() {
        class45.field688.glClear(16640);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 118)
    public static void method825() {
        field1872 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIIII)V", line = 121)
    public static final void method826(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class45.method329();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class45.field667 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class45.field688;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V", line = 141)
    public static final void method827(int arg0, int arg1, int arg2, int arg3) {
        class45.method329();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class45.field667 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class45.field688;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIII)V", line = 160)
    public static final void method828(int arg0, int arg1, int arg2, int arg3) {
        class45.method329();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class45.field667 - ((float) arg1 + 0.3F);
        GL var7 = class45.field688;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(IIII)V", line = 179)
    public static final void method829(int arg0, int arg1, int arg2, int arg3) {
        if (field1870 < arg0) {
            field1870 = arg0;
        }
        if (field1874 < arg1) {
            field1874 = arg1;
        }
        if (field1871 > arg2) {
            field1871 = arg2;
        }
        if (field1873 > arg3) {
            field1873 = arg3;
        }
        GL var4 = class45.field688;
        var4.glEnable(3089);
        if (field1870 <= field1871 && field1874 <= field1873) {
            var4.glScissor(field1870, class45.field667 - field1873, field1871 - field1870, field1873 - field1874);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method817();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIIII)V", line = 211)
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class45.method329();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class45.field667 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class45.field688;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIIIII)V", line = 231)
    public static final void method831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class45.method329();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class45.field667 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class45.field688;
        var10.glBegin(6);
        var10.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var10.glVertex2f(var7, var8);
        var10.glVertex2f(var6, var8);
        var10.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(IIIIII)V", line = 261)
    public static final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class45.method329();
        GL var25 = class45.field688;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class45.field667 - var24));
            var25.glVertex2f((float) var19, (float) (class45.field667 - var23));
            var25.glVertex2f((float) var18, (float) (class45.field667 - var22));
            var25.glVertex2f((float) var17, (float) (class45.field667 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class45.field667 - var21));
            var25.glVertex2f((float) var18, (float) (class45.field667 - var22));
            var25.glVertex2f((float) var19, (float) (class45.field667 - var23));
            var25.glVertex2f((float) var20, (float) (class45.field667 - var24));
        }
        var25.glEnd();
    }
}
