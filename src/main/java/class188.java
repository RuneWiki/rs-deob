import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class188 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lmi;")
    private class315 field2810;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    private static int[] field2808 = new int[1];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmi;ILjava/lang/String;)Laj;")
    public static final class188 method1169(class315 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4445;
        var3.glGenProgramsARB(1, field2808, 0);
        int var4 = field2808[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field2808, 0);
        if (field2808[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class188(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2810.method2012(this.field2809);
        super.finalize();
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lmi;II)V")
    private class188(class315 arg0, int arg1, int arg2) {
        this.field2810 = arg0;
        this.field2809 = arg2;
    }
}
