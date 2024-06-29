import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class163 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lef;")
    public static class326 field2769 = null;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private static int field2768 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class108.method735();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class108.field1916 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class108.field1899;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V", line = 25)
    public static final void method1094(int arg0, int arg1, int arg2, int arg3) {
        class108.method735();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class108.field1916 - ((float) arg1 + 0.3F);
        GL var7 = class108.field1899;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)V", line = 41)
    public static final void method1095(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class108.field1887) {
            arg2 = class108.field1887;
        }
        if (arg3 > class108.field1916) {
            arg3 = class108.field1916;
        }
        field2767 = arg0;
        field2770 = arg1;
        field2768 = arg2;
        field2771 = arg3;
        GL var4 = class108.field1899;
        var4.glEnable(3089);
        if (field2767 <= field2768 && field2770 <= field2771) {
            var4.glScissor(field2767, class108.field1916 - field2771, field2768 - field2767, field2771 - field2770);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1097();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 68)
    public static void method1096() {
        field2769 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()V", line = 71)
    public static final void method1097() {
        field2769 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V", line = 77)
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class108.method735();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class108.field1916 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class108.field1899;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lef;)V", line = 97)
    public static final void method1099(class326 arg0) {
        if (field2771 - field2770 != arg0.field669) {
            throw new IllegalArgumentException();
        }
        field2769 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()V", line = 107)
    public static final void method1100() {
        field2767 = 0;
        field2770 = 0;
        field2768 = class108.field1887;
        field2771 = class108.field1916;
        GL var0 = class108.field1899;
        var0.glDisable(3089);
        method1097();
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIII)V", line = 118)
    public static final void method1101(int arg0, int arg1, int arg2, int arg3) {
        class108.method735();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class108.field1916 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class108.field1899;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIII)V", line = 135)
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class108.method735();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class108.field1916 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class108.field1899;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIIII)V", line = 160)
    public static final void method1103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class108.method735();
        GL var25 = class108.field1899;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class108.field1916 - var24));
            var25.glVertex2f((float) var19, (float) (class108.field1916 - var23));
            var25.glVertex2f((float) var18, (float) (class108.field1916 - var22));
            var25.glVertex2f((float) var17, (float) (class108.field1916 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class108.field1916 - var21));
            var25.glVertex2f((float) var18, (float) (class108.field1916 - var22));
            var25.glVertex2f((float) var19, (float) (class108.field1916 - var23));
            var25.glVertex2f((float) var20, (float) (class108.field1916 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V", line = 234)
    public static final void method1104() {
        class108.field1899.glClear(16640);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIIII)V", line = 248)
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class108.method735();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class108.field1916 - ((float) arg1 + 0.3F);
        float var8 = (float) class108.field1916 - ((float) arg3 + 0.3F);
        GL var9 = class108.field1899;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIIIII)V", line = 266)
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class108.method735();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class108.field1916 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class108.field1899;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(IIII)V", line = 286)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3) {
        if (field2767 < arg0) {
            field2767 = arg0;
        }
        if (field2770 < arg1) {
            field2770 = arg1;
        }
        if (field2768 > arg2) {
            field2768 = arg2;
        }
        if (field2771 > arg3) {
            field2771 = arg3;
        }
        GL var4 = class108.field1899;
        var4.glEnable(3089);
        if (field2767 <= field2768 && field2770 <= field2771) {
            var4.glScissor(field2767, class108.field1916 - field2771, field2768 - field2767, field2771 - field2770);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1097();
    }
}
