import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class175 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lra;")
    public static class44 field2816 = null;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    private static int field2814 = 0;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1309(int arg0, int arg1, int arg2, int arg3) {
        class73.method556();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) arg2 + var4;
        float var6 = (float) class73.field1080 - ((float) arg1 + 0.3F);
        GL var7 = class73.field1051;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var6);
        var7.glVertex2f(var5, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 22)
    public static void method1310() {
        field2816 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V", line = 25)
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class73.method556();
        float var6 = (float) arg0;
        float var7 = (float) arg2 + var6;
        float var8 = (float) (class73.field1080 - arg1);
        float var9 = var8 - (float) arg3;
        GL var10 = class73.field1051;
        var10.glBegin(6);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([I)V", line = 47)
    public static final void method1312(int[] arg0) {
        method1316(arg0[0], arg0[1], arg0[2], arg0[3]);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 50)
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class73.method556();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) arg2 + 0.3F;
        float var7 = (float) class73.field1080 - ((float) arg1 + 0.3F);
        float var8 = (float) class73.field1080 - ((float) arg3 + 0.3F);
        GL var9 = class73.field1051;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var6, var8);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 72)
    public static final void method1314() {
        field2813 = 0;
        field2817 = 0;
        field2814 = class73.field1037;
        field2815 = class73.field1080;
        GL var0 = class73.field1051;
        var0.glDisable(3089);
        method1317();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIII)V", line = 82)
    public static final void method1315(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class73.method556();
        GL var5 = class73.field1051;
        var5.glRasterPos2i(arg1, class73.field1080 - arg2 - arg4);
        var5.glDisable(3042);
        var5.glDisable(3008);
        var5.glDrawPixels(arg3, arg4, 32993, class73.field1075 ? 33639 : 5121, IntBuffer.wrap(arg0));
        var5.glEnable(3008);
        var5.glEnable(3042);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V", line = 93)
    public static final void method1316(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > class73.field1037) {
            arg2 = class73.field1037;
        }
        if (arg3 > class73.field1080) {
            arg3 = class73.field1080;
        }
        field2813 = arg0;
        field2817 = arg1;
        field2814 = arg2;
        field2815 = arg3;
        GL var4 = class73.field1051;
        var4.glEnable(3089);
        if (field2813 <= field2814 && field2817 <= field2815) {
            var4.glScissor(class73.field1065 + field2813, class73.field1080 - field2815 + class73.field1078, field2814 - field2813, field2815 - field2817);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1317();
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()V", line = 121)
    public static final void method1317() {
        field2816 = null;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIII)V", line = 124)
    public static final void method1318(int arg0, int arg1, int arg2, int arg3) {
        if (field2813 < arg0) {
            field2813 = arg0;
        }
        if (field2817 < arg1) {
            field2817 = arg1;
        }
        if (field2814 > arg2) {
            field2814 = arg2;
        }
        if (field2815 > arg3) {
            field2815 = arg3;
        }
        GL var4 = class73.field1051;
        var4.glEnable(3089);
        if (field2813 <= field2814 && field2817 <= field2815) {
            var4.glScissor(class73.field1065 + field2813, class73.field1080 - field2815 + class73.field1078, field2814 - field2813, field2815 - field2817);
        } else {
            var4.glScissor(0, 0, 0, 0);
        }
        method1317();
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(IIII)V", line = 151)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3) {
        class73.method556();
        float var4 = (float) arg0 + 0.3F;
        float var5 = (float) class73.field1080 - ((float) arg1 + 0.3F);
        float var6 = var5 - (float) arg2;
        GL var7 = class73.field1051;
        var7.glBegin(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glVertex2f(var4, var5);
        var7.glVertex2f(var4, var6);
        var7.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIII)V", line = 168)
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class73.method556();
        float var5 = (float) arg0 + 0.3F;
        float var6 = (float) (arg2 - 1) + var5;
        float var7 = (float) class73.field1080 - ((float) arg1 + 0.3F);
        float var8 = var7 - (float) (arg3 - 1);
        GL var9 = class73.field1051;
        var9.glBegin(2);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIII)V", line = 189)
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class73.method556();
        float var6 = (float) arg0 + 0.3F;
        float var7 = (float) (arg2 - 1) + var6;
        float var8 = (float) class73.field1080 - ((float) arg1 + 0.3F);
        float var9 = var8 - (float) (arg3 - 1);
        GL var10 = class73.field1051;
        var10.glBegin(2);
        var10.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
        var10.glVertex2f(var6, var8);
        var10.glVertex2f(var6, var9);
        var10.glVertex2f(var7, var9);
        var10.glVertex2f(var7, var8);
        var10.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIIII)V", line = 213)
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class73.method556();
        float var5 = (float) arg0;
        float var6 = (float) arg2 + var5;
        float var7 = (float) (class73.field1080 - arg1);
        float var8 = var7 - (float) arg3;
        GL var9 = class73.field1051;
        var9.glBegin(6);
        var9.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
        var9.glVertex2f(var5, var7);
        var9.glVertex2f(var5, var8);
        var9.glVertex2f(var6, var8);
        var9.glVertex2f(var6, var7);
        var9.glEnd();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lra;)V", line = 241)
    public static final void method1323(class44 arg0) {
        if (field2815 - field2817 != arg0.field4184) {
            throw new IllegalArgumentException();
        }
        field2816 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "([I)V", line = 251)
    public static final void method1324(int[] arg0) {
        arg0[0] = field2813;
        arg0[1] = field2817;
        arg0[2] = field2814;
        arg0[3] = field2815;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIIIII)V", line = 258)
    public static final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        GL var6 = class73.field1051;
        var6.glLineWidth((float) arg5);
        method1313(arg0, arg1, arg2, arg3, arg4);
        var6.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "()V", line = 264)
    public static final void method1326() {
        class73.field1051.glClear(16640);
    }
}
