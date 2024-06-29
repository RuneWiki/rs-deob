import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class262 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lmm;")
    private class357 field3605;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field3607;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
    private static int[] field3606 = new int[1];

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3605.method2164(this.field3607);
        super.finalize();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lmm;II)V")
    private class262(class357 arg0, int arg1, int arg2) {
        this.field3605 = arg0;
        this.field3607 = arg2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lmm;ILjava/lang/String;)Ll;")
    public static final class262 method1685(class357 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4794;
        var3.glGenProgramsARB(1, field3606, 0);
        int var4 = field3606[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field3606, 0);
        if (field3606[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class262(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }
}
