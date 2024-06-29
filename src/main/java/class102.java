import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class102 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lha;")
    public static class328 field1398 = null;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    private static int field1402 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method738(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method462();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class67.field897 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class67.field899;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 25)
    public static final void method739() {
        field1398 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I)V", line = 29)
    public static final void method740(int[] arg0) {
        method753(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V", line = 35)
    public static void method741() {
        field1398 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V", line = 38)
    public static final void method742(int arg0, int arg1, int arg2, int arg3) {
        if (field1401 < arg0) {
            field1401 = arg0;
        }
        if (field1400 < arg1) {
            field1400 = arg1;
        }
        if (field1402 > arg2) {
            field1402 = arg2;
        }
        if (field1399 > arg3) {
            field1399 = arg3;
        }
        GL var4 = class67.field899;
        var4.glEnable(3089);
        if (field1401 <= field1402 && field1400 <= field1399) {
            var4.glScissor(class67.field887 + field1401, class67.field897 - field1399 + class67.field891, field1402 - field1401, field1399 - field1400);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method739();
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V", line = 61)
    public static final void method743(int arg0, int arg1, int arg2, int arg3) {
        class67.method462();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class67.field897 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class67.field899;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([IIIII)V", line = 77)
    public static final void method744(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method462();
        GL var5 = class67.field899;
        var5.glRasterPos2i(arg1, class67.field897 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class67.field916 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 89)
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class67.method462();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class67.field897 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class67.field899;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIII)V", line = 110)
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class67.field899;
        var6.glLineWidth((float) arg5);
        method752(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "([I)V", line = 116)
    public static final void method747(int[] arg0) {
        arg0[0] = field1401;
        arg0[1] = field1400;
        arg0[2] = field1402;
        arg0[3] = field1399;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V", line = 123)
    public static final void method748() {
        field1401 = 0;
        field1400 = 0;
        field1402 = class67.field902;
        field1399 = class67.field897;
        GL var0 = class67.field899;
        var0.glDisable(3089);
        method739();
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()V", line = 134)
    public static final void method749() {
        class67.field899.glClear(16640);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII)V", line = 137)
    public static final void method750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method462();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class67.field897 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class67.field899;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lha;)V", line = 160)
    public static final void method751(class328 arg0) {
        if (field1399 - field1400 != arg0.field2317) {
            throw new IllegalArgumentException();
        }
        field1398 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIII)V", line = 171)
    public static final void method752(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method462();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class67.field897 - ((float) arg1 + 0.3F);
        float var8 = (float) class67.field897 - ((float) arg3 + 0.3F);
        GL var9 = class67.field899;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIII)V", line = 195)
    public static final void method753(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class67.field902) {
            arg2 = class67.field902;
        }
        if (arg3 > class67.field897) {
            arg3 = class67.field897;
        }
        field1401 = arg0;
        field1400 = arg1;
        field1402 = arg2;
        field1399 = arg3;
        GL var4 = class67.field899;
        var4.glEnable(3089);
        if (field1401 <= field1402 && field1400 <= field1399) {
            var4.glScissor(class67.field887 + field1401, class67.field897 - field1399 + class67.field891, field1402 - field1401, field1399 - field1400);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method739();
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(IIII)V", line = 222)
    public static final void method754(int arg0, int arg1, int arg2, int arg3) {
        class67.method462();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class67.field897 - ((float) arg1 + 0.3F);
        GL var7 = class67.field899;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIIII)V", line = 244)
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class67.method462();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class67.field897 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class67.field899;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }
}
