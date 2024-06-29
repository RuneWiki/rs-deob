import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class220 {

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lks;")
    private class173 field3194;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
    private static int[] field3193 = new int[1];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lks;ILjava/lang/String;)Ldr;")
    public static final class220 method1521(class173 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field2253;
        var3.glGenProgramsARB(1, field3193, 0);
        int var4 = field3193[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field3193, 0);
        if (field3193[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class220(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3194.method1141(this.field3192);
        super.finalize();
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lks;II)V")
    private class220(class173 arg0, int arg1, int arg2) {
        this.field3194 = arg0;
        this.field3192 = arg2;
    }
}
