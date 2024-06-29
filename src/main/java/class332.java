import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class332 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lic;")
    private class246 field4774;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    private static int[] field4773 = new int[1];

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field4774.method1380(this.field4775);
        super.finalize();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lic;ILjava/lang/String;)Lvc;", line = 11)
    public static final class332 method2018(class246 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3342;
        var3.glGenProgramsARB(1, field4773, 0);
        int var4 = field4773[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field4773, 0);
        if (field4773[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class332(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lic;II)V", line = 35)
    private class332(class246 arg0, int arg1, int arg2) {
        this.field4774 = arg0;
        this.field4775 = arg2;
    }
}
