import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class121 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private static int field1894 = 0;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method804(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class264.field4306) {
            arg2 = class264.field4306;
        }
        if (arg3 > class264.field4290) {
            arg3 = class264.field4290;
        }
        field1896 = arg0;
        field1897 = arg1;
        field1894 = arg2;
        field1895 = arg3;
        GL var4 = class264.field4313;
        var4.glEnable(3089);
        if (field1896 <= field1894 && field1897 <= field1895) {
            var4.glScissor(field1896, class264.field4290 - field1895, field1894 - field1896, field1895 - field1897);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIII)V", line = 31)
    public static final void method805(int arg0, int arg1, int arg2, int arg3) {
        class264.method1715();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class264.field4290 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class264.field4313;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(IIII)V", line = 49)
    public static final void method806(int arg0, int arg1, int arg2, int arg3) {
        class264.method1715();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class264.field4290 - ((float) arg1 + 0.3F);
        GL var7 = class264.field4313;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIII)V", line = 65)
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1715();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class264.field4290 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class264.field4313;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 91)
    public static final void method808(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class264.method1715();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class264.field4290 - ((float) arg1 + 0.3F);
        float var8 = (float) class264.field4290 - ((float) arg3 + 0.3F);
        GL var9 = class264.field4313;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIIII)V", line = 109)
    public static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1715();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class264.field4290 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class264.field4313;
        var10.glBegin(6);
        var10.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var10.glVertex2f(var7, var8);
        var10.glVertex2f(var6, var8);
        var10.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(IIIIII)V", line = 130)
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1715();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class264.field4290 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class264.field4313;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIII)V", line = 150)
    public static final void method811(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class264.method1715();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class264.field4290 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class264.field4313;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(IIIIII)V", line = 171)
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class264.method1715();
        GL var25 = class264.field4313;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class264.field4290 - var24));
            var25.glVertex2f((float) var19, (float) (class264.field4290 - var23));
            var25.glVertex2f((float) var18, (float) (class264.field4290 - var22));
            var25.glVertex2f((float) var17, (float) (class264.field4290 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class264.field4290 - var21));
            var25.glVertex2f((float) var18, (float) (class264.field4290 - var22));
            var25.glVertex2f((float) var19, (float) (class264.field4290 - var23));
            var25.glVertex2f((float) var20, (float) (class264.field4290 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(IIIII)V", line = 242)
    public static final void method813(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class264.method1715();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class264.field4290 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class264.field4313;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(IIII)V", line = 262)
    public static final void method814(int arg0, int arg1, int arg2, int arg3) {
        if (field1896 < arg0) {
            field1896 = arg0;
        }
        if (field1897 < arg1) {
            field1897 = arg1;
        }
        if (field1894 > arg2) {
            field1894 = arg2;
        }
        if (field1895 > arg3) {
            field1895 = arg3;
        }
        GL var4 = class264.field4313;
        var4.glEnable(3089);
        if (field1896 <= field1894 && field1897 <= field1895) {
            var4.glScissor(field1896, class264.field4290 - field1895, field1894 - field1896, field1895 - field1897);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 285)
    public static final void method815() {
        class264.field4313.glClear(16640);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()V", line = 291)
    public static final void method816() {
        field1896 = 0;
        field1897 = 0;
        field1894 = class264.field4306;
        field1895 = class264.field4290;
        GL var0 = class264.field4313;
        var0.glDisable(3089);
    }
}
