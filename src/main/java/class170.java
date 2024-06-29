import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class170 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lbf;")
    private class344 field2341;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    private static int[] field2342 = new int[1];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lbf;ILjava/lang/String;)Lkd;")
    public static final class170 method996(class344 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4604;
        var3.glGenProgramsARB(1, field2342, 0);
        int var4 = field2342[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field2342, 0);
        if (field2342[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class170(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2341.method2072(this.field2340);
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbf;II)V")
    private class170(class344 arg0, int arg1, int arg2) {
        this.field2341 = arg0;
        this.field2340 = arg2;
    }
}
