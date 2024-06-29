import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class446 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lsq;")
    private class96 field6488;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
    private static int[] field6489 = new int[1];

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6488.method700(this.field6487);
        super.finalize();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lsq;ILjava/lang/String;)Lnh;")
    public static final class446 method2756(class96 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1156;
        var3.glGenProgramsARB(1, field6489, 0);
        int var4 = field6489[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field6489, 0);
        if (field6489[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class446(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lsq;II)V")
    private class446(class96 arg0, int arg1, int arg2) {
        this.field6488 = arg0;
        this.field6487 = arg2;
    }
}
