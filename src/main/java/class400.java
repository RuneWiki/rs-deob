import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class400 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lge;")
    private class104 field5875;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field5874;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[I")
    private static int[] field5873 = new int[1];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lge;ILjava/lang/String;)Lad;", line = 7)
    public static final class400 method2547(class104 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1604;
        var3.glGenProgramsARB(1, field5873, 0);
        int var4 = field5873[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field5873, 0);
        if (field5873[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class400(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() throws Throwable {
        this.field5875.method888(this.field5874);
        super.finalize();
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lge;II)V", line = 35)
    private class400(class104 arg0, int arg1, int arg2) {
        this.field5875 = arg0;
        this.field5874 = arg2;
    }
}
