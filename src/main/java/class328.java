import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class328 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Lhj;")
    private class338 field4477;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    private static int[] field4475 = new int[1];

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4477.method2110(this.field4476);
        super.finalize();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lhj;II)V")
    private class328(class338 arg0, int arg1, int arg2) {
        this.field4477 = arg0;
        this.field4476 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhj;ILjava/lang/String;)Lii;")
    public static final class328 method2058(class338 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4607;
        var3.glGenProgramsARB(1, field4475, 0);
        int var4 = field4475[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field4475, 0);
        if (field4475[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class328(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }
}
