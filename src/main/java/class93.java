import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class93 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private static int field1366 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    private static int[] field1367 = new int[4];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    private static int[] field1365 = new int[1];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    private static int[] field1368 = new int[4];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFII)V", line = 4)
    public static final void method612(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method621(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()I", line = 7)
    public static final int method613() {
        class245.field3884.glGenRenderbuffersEXT(1, field1365, 0);
        return field1365[0];
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 11)
    public static void method614() {
        field1365 = null;
        field1368 = null;
        field1367 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 16)
    public static final void method615(int arg0) {
        field1365[0] = arg0;
        class245.field3884.glDeleteRenderbuffersEXT(1, field1365, 0);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()Z", line = 21)
    public static final boolean method616() {
        GL var0 = class245.field3884;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 35)
    public static final void method617() {
        class245.field3884.glBindFramebufferEXT(36160, --field1366 > 0 ? field1367[field1366 - 1] : 0);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 41)
    public static final void method618(int arg0) {
        field1365[0] = arg0;
        class245.field3884.glDeleteFramebuffersEXT(1, field1365, 0);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()V", line = 48)
    public static final void method619() {
        GL var0 = class245.field3884;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field1368[0], field1368[1], field1368[2], field1368[3]);
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()I", line = 60)
    public static final int method620() {
        class245.field3884.glGenFramebuffersEXT(1, field1365, 0);
        return field1365[0];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFFFII)V", line = 66)
    public static final void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class245.field3884;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field1368, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 87)
    public static final void method622(int arg0) {
        field1367[field1366++] = arg0;
        class245.field3884.glBindFramebufferEXT(36160, arg0);
    }
}
