import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class273 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    private static int[] field4193 = new int[1];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    private static int[] field4194 = new int[4];

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    private static int field4196 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[I")
    private static int[] field4195 = new int[4];

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFII)V", line = 4)
    public static final void method1825(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1829(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V", line = 9)
    public static void method1826() {
        field4193 = null;
        field4195 = null;
        field4194 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()I", line = 14)
    public static final int method1827() {
        class249.field3898.glGenRenderbuffersEXT(1, field4193, 0);
        return field4193[0];
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()V", line = 18)
    public static final void method1828() {
        class249.field3898.glBindFramebufferEXT(36160, --field4196 > 0 ? field4194[field4196 - 1] : 0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFFFII)V", line = 22)
    public static final void method1829(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class249.field3898;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field4195, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "()Z", line = 35)
    public static final boolean method1830() {
        GL var0 = class249.field3898;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "()V", line = 49)
    public static final void method1831() {
        GL var0 = class249.field3898;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field4195[0], field4195[1], field4195[2], field4195[3]);
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "()I", line = 58)
    public static final int method1832() {
        class249.field3898.glGenFramebuffersEXT(1, field4193, 0);
        return field4193[0];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 67)
    public static final void method1833(int arg0) {
        field4193[0] = arg0;
        class249.field3898.glDeleteFramebuffersEXT(1, field4193, 0);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 71)
    public static final void method1834(int arg0) {
        field4193[0] = arg0;
        class249.field3898.glDeleteRenderbuffersEXT(1, field4193, 0);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 76)
    public static final void method1835(int arg0) {
        field4194[field4196++] = arg0;
        class249.field3898.glBindFramebufferEXT(36160, arg0);
    }
}
