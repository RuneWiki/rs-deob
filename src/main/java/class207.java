import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class207 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lnm;")
    private class254 field3127;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    private static int[] field3128 = new int[1];

    @OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3127.method1667(this.field3126);
        super.finalize();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnm;ILjava/lang/String;)Lsb;")
    public static final class207 method1404(class254 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3648;
        var3.glGenProgramsARB(1, field3128, 0);
        int var4 = field3128[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field3128, 0);
        if (field3128[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class207(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lnm;II)V")
    private class207(class254 arg0, int arg1, int arg2) {
        this.field3127 = arg0;
        this.field3126 = arg2;
    }
}
