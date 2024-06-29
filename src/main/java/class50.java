import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class50 {

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lm;")
    public static class49 field716 = null;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    private static int field718 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 5)
    public static final void method344() {
        class231.field4052.glClear(16640);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method345(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class231.field4077) {
            arg2 = class231.field4077;
        }
        if (arg3 > class231.field4079) {
            arg3 = class231.field4079;
        }
        field717 = arg0;
        field719 = arg1;
        field718 = arg2;
        field715 = arg3;
        GL var4 = class231.field4052;
        var4.glEnable(3089);
        if (field717 <= field718 && field719 <= field715) {
            var4.glScissor(field717, class231.field4079 - field715, field718 - field717, field715 - field719);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method354();
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIII)V", line = 36)
    public static final void method346(int arg0, int arg1, int arg2, int arg3) {
        class231.method1571();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class231.field4079 - ((float) arg1 + 0.3F);
        GL var7 = class231.field4052;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)V", line = 53)
    public static final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class231.method1571();
        GL var25 = class231.field4052;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class231.field4079 - var24));
            var25.glVertex2f((float) var19, (float) (class231.field4079 - var23));
            var25.glVertex2f((float) var18, (float) (class231.field4079 - var22));
            var25.glVertex2f((float) var17, (float) (class231.field4079 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class231.field4079 - var21));
            var25.glVertex2f((float) var18, (float) (class231.field4079 - var22));
            var25.glVertex2f((float) var19, (float) (class231.field4079 - var23));
            var25.glVertex2f((float) var20, (float) (class231.field4079 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 125)
    public static final void method348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class231.method1571();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class231.field4079 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class231.field4052;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIIII)V", line = 146)
    public static final void method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class231.method1571();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class231.field4079 - ((float) arg1 + 0.3F);
        float var8 = (float) class231.field4079 - ((float) arg3 + 0.3F);
        GL var9 = class231.field4052;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IIII)V", line = 165)
    public static final void method350(int arg0, int arg1, int arg2, int arg3) {
        if (field717 < arg0) {
            field717 = arg0;
        }
        if (field719 < arg1) {
            field719 = arg1;
        }
        if (field718 > arg2) {
            field718 = arg2;
        }
        if (field715 > arg3) {
            field715 = arg3;
        }
        GL var4 = class231.field4052;
        var4.glEnable(3089);
        if (field717 <= field718 && field719 <= field715) {
            var4.glScissor(field717, class231.field4079 - field715, field718 - field717, field715 - field719);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method354();
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()V", line = 188)
    public static final void method351() {
        field717 = 0;
        field719 = 0;
        field718 = class231.field4077;
        field715 = class231.field4079;
        GL var0 = class231.field4052;
        var0.glDisable(3089);
        method354();
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(IIII)V", line = 202)
    public static final void method352(int arg0, int arg1, int arg2, int arg3) {
        class231.method1571();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class231.field4079 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class231.field4052;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IIIII)V", line = 219)
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class231.method1571();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class231.field4079 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class231.field4052;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V", line = 239)
    public static final void method354() {
        field716 = null;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()V", line = 242)
    public static void method355() {
        field716 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIIIII)V", line = 249)
    public static final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class231.method1571();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class231.field4079 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class231.field4052;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(IIIIII)V", line = 277)
    public static final void method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class231.method1571();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class231.field4079 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class231.field4052;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lm;)V", line = 300)
    public static final void method358(class49 arg0) {
        if (field715 - field719 != arg0.field2329) {
            throw new IllegalArgumentException();
        }
        field716 = arg0;
    }
}
