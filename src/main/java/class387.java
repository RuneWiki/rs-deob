import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class387 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lig;")
    private class132 field5471;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    private static int[] field5472 = new int[1];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lig;ILjava/lang/String;)Llc;")
    public static final class387 method2456(class132 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1918;
        var3.glGenProgramsARB(1, field5472, 0);
        int var4 = field5472[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field5472, 0);
        if (field5472[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class387(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5471.method981(this.field5470);
        super.finalize();
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lig;II)V")
    private class387(class132 arg0, int arg1, int arg2) {
        this.field5471 = arg0;
        this.field5470 = arg2;
    }
}
