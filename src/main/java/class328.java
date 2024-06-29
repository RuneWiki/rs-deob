import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class328 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lfu;")
    private class42 field4552;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    private static int[] field4553 = new int[1];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lfu;ILjava/lang/String;)Lhg;", line = 7)
    public static final class328 method2056(class42 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field557;
        var3.glGenProgramsARB(1, field4553, 0);
        int var4 = field4553[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field4553, 0);
        if (field4553[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class328(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() throws Throwable {
        this.field4552.method422(this.field4551);
        super.finalize();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lfu;II)V", line = 30)
    private class328(class42 arg0, int arg1, int arg2) {
        this.field4552 = arg0;
        this.field4551 = arg2;
    }
}
