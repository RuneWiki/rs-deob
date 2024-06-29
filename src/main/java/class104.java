import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class104 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lpo;")
    private class332 field1180;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[I")
    private static int[] field1179 = new int[1];

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field1180.method2103(this.field1181);
        super.finalize();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpo;ILjava/lang/String;)Lm;", line = 10)
    public static final class104 method561(class332 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4752;
        var3.glGenProgramsARB(1, field1179, 0);
        int var4 = field1179[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field1179, 0);
        if (field1179[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class104(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lpo;II)V", line = 32)
    private class104(class332 arg0, int arg1, int arg2) {
        this.field1180 = arg0;
        this.field1181 = arg2;
    }
}
