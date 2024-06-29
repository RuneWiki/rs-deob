import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class247 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    private static int[] field4062 = new int[4];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    private static int[] field4061 = new int[4];

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    private static int field4064 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    private static int[] field4063 = new int[1];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I", line = 4)
    public static final int method1738() {
        class241.field4012.glGenFramebuffersEXT(1, field4063, 0);
        return field4063[0];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1739(int arg0) {
        field4063[0] = arg0;
        class241.field4012.glDeleteFramebuffersEXT(1, field4063, 0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V", line = 13)
    public static final void method1740() {
        class241.field4012.glBindFramebufferEXT(36160, --field4064 > 0 ? field4061[field4064 - 1] : 0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 20)
    public static final void method1741(int arg0) {
        field4063[0] = arg0;
        class241.field4012.glDeleteRenderbuffersEXT(1, field4063, 0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(FFFFFFII)V", line = 25)
    public static final void method1742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class241.field4012;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field4062, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 37)
    public static final void method1743(int arg0) {
        field4061[field4064++] = arg0;
        class241.field4012.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()I", line = 44)
    public static final int method1744() {
        class241.field4012.glGenRenderbuffersEXT(1, field4063, 0);
        return field4063[0];
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()Z", line = 49)
    public static final boolean method1745() {
        GL var0 = class241.field4012;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()V", line = 68)
    public static final void method1746() {
        GL var0 = class241.field4012;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field4062[0], field4062[1], field4062[2], field4062[3]);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(FFFFII)V", line = 77)
    public static final void method1747(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1742(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()V", line = 83)
    public static void method1748() {
        field4063 = null;
        field4062 = null;
        field4061 = null;
    }
}
