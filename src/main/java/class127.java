import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class127 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[I")
    private static int[] field1979 = new int[4];

    @OriginalMember(owner = "client!en", name = "d", descriptor = "[I")
    private static int[] field1980 = new int[1];

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    private static int field1977 = 0;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[I")
    private static int[] field1978 = new int[4];

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFFII)V", line = 4)
    public static final void method849(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method856(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()I", line = 9)
    public static final int method850() {
        class333.field5160.glGenFramebuffersEXT(1, field1980, 0);
        return field1980[0];
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()V", line = 13)
    public static final void method851() {
        class333.field5160.glBindFramebufferEXT(36160, --field1977 > 0 ? field1979[field1977 - 1] : 0);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()Z", line = 20)
    public static final boolean method852() {
        GL var0 = class333.field5160;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()V", line = 37)
    public static final void method853() {
        GL var0 = class333.field5160;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field1978[0], field1978[1], field1978[2], field1978[3]);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()I", line = 45)
    public static final int method854() {
        class333.field5160.glGenRenderbuffersEXT(1, field1980, 0);
        return field1980[0];
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 55)
    public static final void method855(int arg0) {
        field1980[0] = arg0;
        class333.field5160.glDeleteFramebuffersEXT(1, field1980, 0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFFFFII)V", line = 60)
    public static final void method856(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class333.field5160;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field1978, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 75)
    public static final void method857(int arg0) {
        field1979[field1977++] = arg0;
        class333.field5160.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()V", line = 79)
    public static void method858() {
        field1980 = null;
        field1978 = null;
        field1979 = null;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 84)
    public static final void method859(int arg0) {
        field1980[0] = arg0;
        class333.field5160.glDeleteRenderbuffersEXT(1, field1980, 0);
    }
}
