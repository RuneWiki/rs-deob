import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class296 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5080 = 0;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5082 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private static int field5081 = 0;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5083 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lll;")
    public static class221 field5084 = null;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method2082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257.method1737();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class257.field4423 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class257.field4409;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 26)
    public static final void method2083() {
        field5084 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method2084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class257.method1737();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class257.field4423 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class257.field4409;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method2085(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class257.field4396) {
            arg2 = class257.field4396;
        }
        if (arg3 > class257.field4423) {
            arg3 = class257.field4423;
        }
        field5083 = arg0;
        field5082 = arg1;
        field5081 = arg2;
        field5080 = arg3;
        GL var4 = class257.field4409;
        var4.glEnable(3089);
        if (field5083 <= field5081 && field5082 <= field5080) {
            var4.glScissor(field5083, class257.field4423 - field5080, field5081 - field5083, field5080 - field5082);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2083();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V", line = 77)
    public static final void method2086(int arg0, int arg1, int arg2, int arg3) {
        if (field5083 < arg0) {
            field5083 = arg0;
        }
        if (field5082 < arg1) {
            field5082 = arg1;
        }
        if (field5081 > arg2) {
            field5081 = arg2;
        }
        if (field5080 > arg3) {
            field5080 = arg3;
        }
        GL var4 = class257.field4409;
        var4.glEnable(3089);
        if (field5083 <= field5081 && field5082 <= field5080) {
            var4.glScissor(field5083, class257.field4423 - field5080, field5081 - field5083, field5080 - field5082);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method2083();
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(IIII)V", line = 100)
    public static final void method2087(int arg0, int arg1, int arg2, int arg3) {
        class257.method1737();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class257.field4423 - ((float) arg1 + 0.3F);
        GL var7 = class257.field4409;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 127)
    public static final void method2088() {
        field5083 = 0;
        field5082 = 0;
        field5081 = class257.field4396;
        field5080 = class257.field4423;
        GL var0 = class257.field4409;
        var0.glDisable(3089);
        method2083();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIII)V", line = 142)
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257.method1737();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class257.field4423 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class257.field4409;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIII)V", line = 162)
    public static final void method2090(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class257.method1737();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class257.field4423 - ((float) arg1 + 0.3F);
        float var8 = (float) class257.field4423 - ((float) arg3 + 0.3F);
        GL var9 = class257.field4409;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lll;)V", line = 181)
    public static final void method2091(class221 arg0) {
        if (field5080 - field5082 != arg0.field1148) {
            throw new IllegalArgumentException();
        }
        field5084 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(IIII)V", line = 191)
    public static final void method2092(int arg0, int arg1, int arg2, int arg3) {
        class257.method1737();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class257.field4423 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class257.field4409;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V", line = 207)
    public static void method2093() {
        field5084 = null;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()V", line = 211)
    public static final void method2094() {
        class257.field4409.glClear(16640);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(IIIIII)V", line = 215)
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class257.method1737();
        GL var25 = class257.field4409;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class257.field4423 - var24));
            var25.glVertex2f((float) var19, (float) (class257.field4423 - var23));
            var25.glVertex2f((float) var18, (float) (class257.field4423 - var22));
            var25.glVertex2f((float) var17, (float) (class257.field4423 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class257.field4423 - var21));
            var25.glVertex2f((float) var18, (float) (class257.field4423 - var22));
            var25.glVertex2f((float) var19, (float) (class257.field4423 - var23));
            var25.glVertex2f((float) var20, (float) (class257.field4423 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(IIIII)V", line = 290)
    public static final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class257.method1737();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class257.field4423 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class257.field4409;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }
}
