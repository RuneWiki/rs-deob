import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class168 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lse;")
    private class282 field2273;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    private static int[] field2275 = new int[1];

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2273.method1917(this.field2274);
        super.finalize();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lse;II)V")
    private class168(class282 arg0, int arg1, int arg2) {
        this.field2273 = arg0;
        this.field2274 = arg2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lse;ILjava/lang/String;)Lud;")
    public static final class168 method1126(class282 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4140;
        var3.glGenProgramsARB(1, field2275, 0);
        int var4 = field2275[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field2275, 0);
        if (field2275[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class168(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }
}
