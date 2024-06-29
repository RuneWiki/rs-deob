import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class287 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Lnf;")
    private class256 field4155;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[I")
    private static int[] field4153 = new int[1];

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field4155.method1675(this.field4154);
        super.finalize();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lnf;ILjava/lang/String;)Lqm;", line = 13)
    public static final class287 method1964(class256 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3634;
        var3.glGenProgramsARB(1, field4153, 0);
        int var4 = field4153[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field4153, 0);
        if (field4153[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class287(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lnf;II)V", line = 35)
    private class287(class256 arg0, int arg1, int arg2) {
        this.field4155 = arg0;
        this.field4154 = arg2;
    }
}
