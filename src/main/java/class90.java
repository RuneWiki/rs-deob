import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private static int field1206 = 0;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    private static int[] field1207 = new int[4];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    private static int[] field1208 = new int[1];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
    private static int[] field1205 = new int[4];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(FFFFFFII)V", line = 5)
    public static final void method645(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
        GL var8 = class109.field1456;
        var8.glMatrixMode(5889);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
        var8.glMatrixMode(5888);
        var8.glPushMatrix();
        var8.glLoadIdentity();
        var8.glGetIntegerv(2978, field1205, 0);
        var8.glViewport(0, 0, arg6, arg7);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()I", line = 17)
    public static final int method646() {
        class109.field1456.glGenRenderbuffersEXT(1, field1208, 0);
        return field1208[0];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 22)
    public static final void method647(int arg0) {
        field1208[0] = arg0;
        class109.field1456.glDeleteFramebuffersEXT(1, field1208, 0);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V", line = 27)
    public static final void method648() {
        GL var0 = class109.field1456;
        var0.glMatrixMode(5889);
        var0.glPopMatrix();
        var0.glMatrixMode(5888);
        var0.glPopMatrix();
        var0.glViewport(field1205[0], field1205[1], field1205[2], field1205[3]);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 35)
    public static final void method649(int arg0) {
        field1208[0] = arg0;
        class109.field1456.glDeleteRenderbuffersEXT(1, field1208, 0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(FFFFII)V", line = 39)
    public static final void method650(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
        method645(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 42)
    public static final void method651(int arg0) {
        field1207[field1206++] = arg0;
        class109.field1456.glBindFramebufferEXT(36160, arg0);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 46)
    public static void method652() {
        field1208 = null;
        field1205 = null;
        field1207 = null;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()V", line = 51)
    public static final void method653() {
        class109.field1456.glBindFramebufferEXT(36160, --field1206 > 0 ? field1207[field1206 - 1] : 0);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()I", line = 54)
    public static final int method654() {
        class109.field1456.glGenFramebuffersEXT(1, field1208, 0);
        return field1208[0];
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "()Z", line = 69)
    public static final boolean method655() {
        GL var0 = class109.field1456;
        int var1 = var0.glCheckFramebufferStatusEXT(36160);
        return var1 == 36053;
    }
}
