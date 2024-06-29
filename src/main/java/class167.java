import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class167 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lal;")
    public static class86 field2551 = null;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private static int field2553 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 5)
    public static final void method1185() {
        class94.field1473.glClear(16640);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method1186(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method673();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class94.field1513 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class94.field1473;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method1187(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class94.field1486) {
            arg2 = class94.field1486;
        }
        if (arg3 > class94.field1513) {
            arg3 = class94.field1513;
        }
        field2550 = arg0;
        field2552 = arg1;
        field2553 = arg2;
        field2554 = arg3;
        GL var4 = class94.field1473;
        var4.glEnable(3089);
        if (field2550 <= field2553 && field2552 <= field2554) {
            var4.glScissor(class94.field1488 + field2550, class94.field1513 - field2554 + class94.field1496, field2553 - field2550, field2554 - field2552);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1195();
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIII)V", line = 58)
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method673();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class94.field1513 - ((float) arg1 + 0.3F);
        float var8 = (float) class94.field1513 - ((float) arg3 + 0.3F);
        GL var9 = class94.field1473;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(IIIII)V", line = 77)
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method673();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class94.field1513 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class94.field1473;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method673();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class94.field1513 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class94.field1473;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()V", line = 117)
    public static final void method1191() {
        field2550 = 0;
        field2552 = 0;
        field2553 = class94.field1486;
        field2554 = class94.field1513;
        GL var0 = class94.field1473;
        var0.glDisable(3089);
        method1195();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIIII)V", line = 127)
    public static final void method1192(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method673();
        GL var5 = class94.field1473;
        var5.glRasterPos2i(arg1, class94.field1513 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class94.field1512 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIIII)V", line = 139)
    public static final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class94.method673();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class94.field1513 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class94.field1473;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)V", line = 160)
    public static final void method1194(int arg0, int arg1, int arg2, int arg3) {
        if (field2550 < arg0) {
            field2550 = arg0;
        }
        if (field2552 < arg1) {
            field2552 = arg1;
        }
        if (field2553 > arg2) {
            field2553 = arg2;
        }
        if (field2554 > arg3) {
            field2554 = arg3;
        }
        GL var4 = class94.field1473;
        var4.glEnable(3089);
        if (field2550 <= field2553 && field2552 <= field2554) {
            var4.glScissor(class94.field1488 + field2550, class94.field1513 - field2554 + class94.field1496, field2553 - field2550, field2554 - field2552);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1195();
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()V", line = 183)
    public static final void method1195() {
        field2551 = null;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(IIII)V", line = 190)
    public static final void method1196(int arg0, int arg1, int arg2, int arg3) {
        class94.method673();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class94.field1513 - ((float) arg1 + 0.3F);
        GL var7 = class94.field1473;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(IIII)V", line = 208)
    public static final void method1197(int arg0, int arg1, int arg2, int arg3) {
        class94.method673();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class94.field1513 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class94.field1473;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "()V", line = 226)
    public static void method1198() {
        field2551 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([I)V", line = 232)
    public static final void method1199(int[] arg0) {
        arg0[0] = field2550;
        arg0[1] = field2552;
        arg0[2] = field2553;
        arg0[3] = field2554;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(IIIIII)V", line = 239)
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class94.field1473;
        var6.glLineWidth((float) arg5);
        method1188(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "([I)V", line = 254)
    public static final void method1201(int[] arg0) {
        method1187(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lal;)V", line = 257)
    public static final void method1202(class86 arg0) {
        if (field2554 - field2552 != arg0.field4207) {
            throw new IllegalArgumentException();
        }
        field2551 = arg0;
    }
}
