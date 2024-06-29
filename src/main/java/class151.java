import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class151 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[I")
    private static int[] field2278 = new int[4];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    private static int[] field2277 = new int[4];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    private static int field2280 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    private static int[] field2279 = new int[1];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1039(int arg0) {
        field2277[field2280++] = arg0;
        class94.field1473.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 8)
    public static void method1040() {
        field2279 = null;
        field2278 = null;
        field2277 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 16)
    public static final void method1041(int arg0) {
        field2279[0] = arg0;
        class94.field1473.glDeleteFramebuffersEXT(1, field2279, 0);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V", line = 24)
    public static final void method1042() {
        class94.field1473.glBindFramebufferEXT(36160, --field2280 > 0 ? field2277[field2280 - 1] : 0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(FFFFII)V", line = 38)
    public static final void method1043(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method1046(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()I", line = 41)
    public static final int method1044() {
        class94.field1473.glGenFramebuffersEXT(1, field2279, 0);
        return field2279[0];
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "()Z", line = 46)
    public static final boolean method1045() {
        GL var0 = class94.field1473;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(FFFFFFII)V", line = 60)
    public static final void method1046(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class94.field1473;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field2278, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 72)
    public static final void method1047(int arg0) {
        field2279[0] = arg0;
        class94.field1473.glDeleteRenderbuffersEXT(1, field2279, 0);
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "()V", line = 77)
    public static final void method1048() {
        GL var0 = class94.field1473;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field2278[0], field2278[1], field2278[2], field2278[3]);
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "()I", line = 85)
    public static final int method1049() {
        class94.field1473.glGenRenderbuffersEXT(1, field2279, 0);
        return field2279[0];
    }
}
