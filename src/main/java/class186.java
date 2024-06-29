import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class186 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    private static int field2939 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    private static int[] field2940 = new int[4];

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    private static int[] field2942 = new int[4];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    private static int[] field2941 = new int[1];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFII)V", line = 6)
    public static final void method1373(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class73.field1051;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field2942, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 19)
    public static final void method1374() {
        GL var0 = class73.field1051;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field2942[0], field2942[1], field2942[2], field2942[3]);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFII)V", line = 27)
    public static final void method1375(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1373(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 30)
    public static final void method1376(int arg0) {
        field2941[0] = arg0;
        class73.field1051.glDeleteFramebuffersEXT(1, field2941, 0);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()V", line = 37)
    public static final void method1377() {
        class73.field1051.glBindFramebufferEXT(36160, --field2939 > 0 ? field2940[field2939 - 1] : 0);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()Z", line = 41)
    public static final boolean method1378() {
        GL var0 = class73.field1051;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 57)
    public static final void method1379(int arg0) {
        field2940[field2939++] = arg0;
        class73.field1051.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 62)
    public static final void method1380(int arg0) {
        field2941[0] = arg0;
        class73.field1051.glDeleteRenderbuffersEXT(1, field2941, 0);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()I", line = 67)
    public static final int method1381() {
        class73.field1051.glGenRenderbuffersEXT(1, field2941, 0);
        return field2941[0];
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V", line = 72)
    public static void method1382() {
        field2941 = null;
        field2942 = null;
        field2940 = null;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "()I", line = 77)
    public static final int method1383() {
        class73.field1051.glGenFramebuffersEXT(1, field2941, 0);
        return field2941[0];
    }
}
