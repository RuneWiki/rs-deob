import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class47 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lao;")
    private class157 field563;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    private static int[] field565 = new int[1];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lao;ILjava/lang/String;)Lrf;")
    public static final class47 method275(class157 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1927;
        var3.glGenProgramsARB(1, field565, 0);
        int var4 = field565[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field565, 0);
        if (field565[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class47(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field563.method961(this.field564);
        super.finalize();
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lao;II)V")
    private class47(class157 arg0, int arg1, int arg2) {
        this.field563 = arg0;
        this.field564 = arg2;
    }
}
