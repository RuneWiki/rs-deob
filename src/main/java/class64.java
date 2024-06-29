import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class64 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lh;")
    private class327 field781;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    private static int[] field779 = new int[1];

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field781.method2105(this.field780);
        super.finalize();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lh;ILjava/lang/String;)Lme;")
    public static final class64 method370(class327 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4363;
        var3.glGenProgramsARB(1, field779, 0);
        int var4 = field779[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field779, 0);
        if (field779[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class64(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lh;II)V")
    private class64(class327 arg0, int arg1, int arg2) {
        this.field781 = arg0;
        this.field780 = arg2;
    }
}
