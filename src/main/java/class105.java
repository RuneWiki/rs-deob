import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class105 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[I")
    private static int[] field1420 = new int[1];

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    private static int[] field1421 = new int[4];

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
    private static int[] field1422 = new int[4];

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    private static int field1423 = 0;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 6)
    public static final void method770() {
        class67.field899.glBindFramebufferEXT(36160, --field1423 > 0 ? field1421[field1423 - 1] : 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 9)
    public static final void method771(int arg0) {
        field1420[0] = arg0;
        class67.field899.glDeleteRenderbuffersEXT(1, field1420, 0);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 16)
    public static final void method772(int arg0) {
        field1421[field1423++] = arg0;
        class67.field899.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V", line = 21)
    public static final void method773() {
        GL var0 = class67.field899;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field1422[0], field1422[1], field1422[2], field1422[3]);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()V", line = 29)
    public static void method774() {
        field1420 = null;
        field1422 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()Z", line = 35)
    public static final boolean method775() {
        GL var0 = class67.field899;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 50)
    public static final void method776(int arg0) {
        field1420[0] = arg0;
        class67.field899.glDeleteFramebuffersEXT(1, field1420, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFFFII)V", line = 54)
    public static final void method777(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method778(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFFFFFII)V", line = 58)
    public static final void method778(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class67.field899;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field1422, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()I", line = 76)
    public static final int method779() {
        class67.field899.glGenFramebuffersEXT(1, field1420, 0);
        return field1420[0];
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "()I", line = 80)
    public static final int method780() {
        class67.field899.glGenRenderbuffersEXT(1, field1420, 0);
        return field1420[0];
    }
}
