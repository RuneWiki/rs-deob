import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class400 {

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lcg;")
    private class393 field5965;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "[I")
    private static int[] field5964 = new int[1];

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lcg;ILjava/lang/String;)Lhr;")
    public static final class400 method2520(class393 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field5783;
        var3.glGenProgramsARB(1, field5964, 0);
        int var4 = field5964[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field5964, 0);
        if (field5964[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class400(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5965.method2455(this.field5963);
        super.finalize();
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lcg;II)V")
    private class400(class393 arg0, int arg1, int arg2) {
        this.field5965 = arg0;
        this.field5963 = arg2;
    }
}
