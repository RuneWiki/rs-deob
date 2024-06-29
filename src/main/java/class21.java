import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class21 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Loc;")
    public static class136 field369 = null;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field371 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private static int field370 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 4)
    public static final void method200() {
        field369 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V", line = 8)
    public static final void method201() {
        class123.field2212.glClear(16640);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V", line = 12)
    public static final void method202(int arg0, int arg1, int arg2, int arg3) {
        class123.method882();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class123.field2207 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class123.field2212;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V", line = 31)
    public static final void method203() {
        field367 = 0;
        field371 = 0;
        field370 = class123.field2208;
        field368 = class123.field2207;
        GL var0 = class123.field2212;
        var0.glDisable(3089);
        method200();
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIII)V", line = 41)
    public static final void method204(int arg0, int arg1, int arg2, int arg3) {
        class123.method882();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class123.field2207 - ((float) arg1 + 0.3F);
        GL var7 = class123.field2212;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V", line = 60)
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class123.method882();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class123.field2207 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class123.field2212;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIIII)V", line = 80)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class123.method882();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class123.field2207 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class123.field2212;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(IIIIII)V", line = 101)
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        class123.method882();
        GL var25 = class123.field2212;
        var25.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var25.glBegin(6);
        if (var12 <= var11) {
            var25.glVertex2f((float) var20, (float) (class123.field2207 - var24));
            var25.glVertex2f((float) var19, (float) (class123.field2207 - var23));
            var25.glVertex2f((float) var18, (float) (class123.field2207 - var22));
            var25.glVertex2f((float) var17, (float) (class123.field2207 - var21));
        } else {
            var25.glVertex2f((float) var17, (float) (class123.field2207 - var21));
            var25.glVertex2f((float) var18, (float) (class123.field2207 - var22));
            var25.glVertex2f((float) var19, (float) (class123.field2207 - var23));
            var25.glVertex2f((float) var20, (float) (class123.field2207 - var24));
        }
        var25.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 172)
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class123.method882();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class123.field2207 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class123.field2212;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(IIII)V", line = 193)
    public static final void method209(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class123.field2208) {
            arg2 = class123.field2208;
        }
        if (arg3 > class123.field2207) {
            arg3 = class123.field2207;
        }
        field367 = arg0;
        field371 = arg1;
        field370 = arg2;
        field368 = arg3;
        GL var4 = class123.field2212;
        var4.glEnable(3089);
        if (field367 <= field370 && field371 <= field368) {
            var4.glScissor(field367, class123.field2207 - field368, field370 - field367, field368 - field371);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method200();
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V", line = 224)
    public static void method210() {
        field369 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIII)V", line = 227)
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class123.method882();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class123.field2207 - ((float) arg1 + 0.3F);
        float var8 = (float) class123.field2207 - ((float) arg3 + 0.3F);
        GL var9 = class123.field2212;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(IIIII)V", line = 245)
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class123.method882();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class123.field2207 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class123.field2212;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Loc;)V", line = 268)
    public static final void method213(class136 arg0) {
        if (field368 - field371 != arg0.field629) {
            throw new IllegalArgumentException();
        }
        field369 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(IIII)V", line = 282)
    public static final void method214(int arg0, int arg1, int arg2, int arg3) {
        if (field367 < arg0) {
            field367 = arg0;
        }
        if (field371 < arg1) {
            field371 = arg1;
        }
        if (field370 > arg2) {
            field370 = arg2;
        }
        if (field368 > arg3) {
            field368 = arg3;
        }
        GL var4 = class123.field2212;
        var4.glEnable(3089);
        if (field367 <= field370 && field371 <= field368) {
            var4.glScissor(field367, class123.field2207 - field368, field370 - field367, field368 - field371);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method200();
    }
}
