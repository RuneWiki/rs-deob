import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class443 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lih;")
    private class330 field6466;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
    private static int[] field6464 = new int[1];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lih;ILjava/lang/String;)Lch;", line = 4)
    public static final class443 method2795(class330 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4741;
        var3.glGenProgramsARB(1, field6464, 0);
        int var4 = field6464[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field6464, 0);
        if (field6464[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class443(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        this.field6466.method2095(this.field6465);
        super.finalize();
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lih;II)V", line = 34)
    private class443(class330 arg0, int arg1, int arg2) {
        this.field6466 = arg0;
        this.field6465 = arg2;
    }
}
