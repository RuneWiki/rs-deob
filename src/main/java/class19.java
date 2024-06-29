import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class19 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private static int field302 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
    private static int[] field301 = new int[4];

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[I")
    private static int[] field303 = new int[1];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    private static int[] field300 = new int[4];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 5)
    public static final void method187(int arg0) {
        field303[0] = arg0;
        class43.field651.glDeleteFramebuffersEXT(1, field303, 0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()I", line = 10)
    public static final int method188() {
        class43.field651.glGenFramebuffersEXT(1, field303, 0);
        return field303[0];
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 14)
    public static final void method189(int arg0) {
        field303[0] = arg0;
        class43.field651.glDeleteRenderbuffersEXT(1, field303, 0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFFFII)V", line = 19)
    public static final void method190(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class43.field651;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field301, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V", line = 31)
    public static final void method191() {
        class43.field651.glBindFramebufferEXT(36160, --field302 > 0 ? field300[field302 - 1] : 0);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()V", line = 37)
    public static final void method192() {
        GL var0 = class43.field651;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field301[0], field301[1], field301[2], field301[3]);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()V", line = 48)
    public static void method193() {
        field303 = null;
        field301 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFII)V", line = 57)
    public static final void method194(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method190(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()I", line = 63)
    public static final int method195() {
        class43.field651.glGenRenderbuffersEXT(1, field303, 0);
        return field303[0];
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 73)
    public static final void method196(int arg0) {
        field300[field302++] = arg0;
        class43.field651.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "()Z", line = 78)
    public static final boolean method197() {
        GL var0 = class43.field651;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }
}
