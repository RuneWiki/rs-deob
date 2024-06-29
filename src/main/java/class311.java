import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class311 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5299 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5300 = 0;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5302 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private static int field5298 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lud;")
    public static class266 field5301 = null;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method2103(int arg0, int arg1, int arg2, int arg3) {
        if (field5300 < arg0) {
            field5300 = arg0;
        }
        if (field5302 < arg1) {
            field5302 = arg1;
        }
        if (field5298 > arg2) {
            field5298 = arg2;
        }
        if (field5299 > arg3) {
            field5299 = arg3;
        }
        GL var4 = class167.field2806;
        var4.glEnable(3089);
        if (field5300 <= field5298 && field5302 <= field5299) {
            var4.glScissor(field5300, class167.field2808 - field5299, field5298 - field5300, field5299 - field5302);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2105();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V", line = 28)
    public static final void method2104(int arg0, int arg1, int arg2, int arg3) {
        class167.method1051();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class167.field2808 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class167.field2806;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 46)
    public static final void method2105() {
        field5301 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V", line = 50)
    public static final void method2106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class167.method1051();
        GL var25 = class167.field2806;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class167.field2808 - var24));
            var25.glVertex2f((float) var19, (float) (class167.field2808 - var23));
            var25.glVertex2f((float) var18, (float) (class167.field2808 - var22));
            var25.glVertex2f((float) var17, (float) (class167.field2808 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class167.field2808 - var21));
            var25.glVertex2f((float) var18, (float) (class167.field2808 - var22));
            var25.glVertex2f((float) var19, (float) (class167.field2808 - var23));
            var25.glVertex2f((float) var20, (float) (class167.field2808 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 121)
    public static final void method2107() {
        field5300 = 0;
        field5302 = 0;
        field5298 = class167.field2776;
        field5299 = class167.field2808;
        GL var0 = class167.field2806;
        var0.glDisable(3089);
        method2105();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIII)V", line = 131)
    public static final void method2108(int arg0, int arg1, int arg2, int arg3) {
        class167.method1051();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class167.field2808 - ((float) arg1 + 0.3F);
        GL var7 = class167.field2806;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lud;)V", line = 147)
    public static final void method2109(class266 arg0) {
        if (field5299 - field5302 != arg0.field1821) {
            throw new IllegalArgumentException();
        }
        field5301 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 157)
    public static final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class167.method1051();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class167.field2808 - ((float) arg1 + 0.3F);
        float var8 = (float) class167.field2808 - ((float) arg3 + 0.3F);
        GL var9 = class167.field2806;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()V", line = 176)
    public static final void method2111() {
        class167.field2806.glClear(16640);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIII)V", line = 192)
    public static final void method2112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.method1051();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class167.field2808 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class167.field2806;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V", line = 215)
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class167.method1051();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class167.field2808 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class167.field2806;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIII)V", line = 241)
    public static final void method2114(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class167.field2776) {
            arg2 = class167.field2776;
        }
        if (arg3 > class167.field2808) {
            arg3 = class167.field2808;
        }
        field5300 = arg0;
        field5302 = arg1;
        field5298 = arg2;
        field5299 = arg3;
        GL var4 = class167.field2806;
        var4.glEnable(3089);
        if (field5300 <= field5298 && field5302 <= field5299) {
            var4.glScissor(field5300, class167.field2808 - field5299, field5298 - field5300, field5299 - field5302);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2105();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIIII)V", line = 269)
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.method1051();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class167.field2808 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class167.field2806;
        var10.glBegin(6);
        var10.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var10.glVertex2f(var7, var8);
        var10.glVertex2f(var6, var8);
        var10.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIII)V", line = 290)
    public static final void method2116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class167.method1051();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class167.field2808 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class167.field2806;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()V", line = 310)
    public static void method2117() {
        field5301 = null;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIIII)V", line = 313)
    public static final void method2118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.method1051();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class167.field2808 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class167.field2806;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
