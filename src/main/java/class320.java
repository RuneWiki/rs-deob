import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class320 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    private static int[] field4702 = new int[4];

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    private static int[] field4703 = new int[4];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    private static int[] field4701 = new int[1];

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    private static int field4704 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 5)
    public static final int method2205() {
        class47.field592.glGenRenderbuffersEXT(1, field4701, 0);
        return field4701[0];
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 11)
    public static void method2206() {
        field4701 = null;
        field4702 = null;
        field4703 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()V", line = 24)
    public static final void method2207() {
        GL var0 = class47.field592;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field4702[0], field4702[1], field4702[2], field4702[3]);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()I", line = 32)
    public static final int method2208() {
        class47.field592.glGenFramebuffersEXT(1, field4701, 0);
        return field4701[0];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2209(int arg0) {
        field4701[0] = arg0;
        class47.field592.glDeleteFramebuffersEXT(1, field4701, 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFII)V", line = 41)
    public static final void method2210(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class47.field592;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field4702, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFII)V", line = 53)
    public static final void method2211(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method2210(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 56)
    public static final void method2212(int arg0) {
        field4701[0] = arg0;
        class47.field592.glDeleteRenderbuffersEXT(1, field4701, 0);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "()V", line = 60)
    public static final void method2213() {
        class47.field592.glBindFramebufferEXT(36160, --field4704 > 0 ? field4703[field4704 - 1] : 0);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 63)
    public static final void method2214(int arg0) {
        field4703[field4704++] = arg0;
        class47.field592.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()Z", line = 74)
    public static final boolean method2215() {
        GL var0 = class47.field592;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }
}
