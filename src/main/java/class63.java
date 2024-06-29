import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class63 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private static int[] field914 = new int[4];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    private static int[] field916 = new int[4];

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    private static int[] field915 = new int[1];

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private static int field917 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I", line = 6)
    public static final int method509() {
        class141.field2025.glGenFramebuffersEXT(1, field915, 0);
        return field915[0];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 10)
    public static final void method510(int arg0) {
        field916[field917++] = arg0;
        class141.field2025.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFFFFII)V", line = 15)
    public static final void method511(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class141.field2025;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field914, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Z", line = 28)
    public static final boolean method512() {
        GL var0 = class141.field2025;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()V", line = 44)
    public static void method513() {
        field915 = null;
        field914 = null;
        field916 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFFII)V", line = 49)
    public static final void method514(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method511(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()I", line = 52)
    public static final int method515() {
        class141.field2025.glGenRenderbuffersEXT(1, field915, 0);
        return field915[0];
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V", line = 57)
    public static final void method516() {
        class141.field2025.glBindFramebufferEXT(36160, --field917 > 0 ? field916[field917 - 1] : 0);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()V", line = 68)
    public static final void method517() {
        GL var0 = class141.field2025;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field914[0], field914[1], field914[2], field914[3]);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 79)
    public static final void method518(int arg0) {
        field915[0] = arg0;
        class141.field2025.glDeleteFramebuffersEXT(1, field915, 0);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 83)
    public static final void method519(int arg0) {
        field915[0] = arg0;
        class141.field2025.glDeleteRenderbuffersEXT(1, field915, 0);
    }
}
