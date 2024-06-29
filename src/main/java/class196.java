import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class196 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lql;")
    private class346 field2637;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "[I")
    private static int[] field2638 = new int[1];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lql;ILjava/lang/String;)Lqn;", line = 6)
    public static final class196 method1057(class346 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4697;
        var3.glGenProgramsARB(1, field2638, 0);
        int var4 = field2638[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field2638, 0);
        if (field2638[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class196(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lql;II)V", line = 28)
    private class196(class346 arg0, int arg1, int arg2) {
        this.field2637 = arg0;
        this.field2639 = arg2;
    }

    @OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        this.field2637.method2090(this.field2639);
        super.finalize();
    }
}
