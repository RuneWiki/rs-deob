import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class11 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lhd;")
    private class17 field84;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
    private static int[] field86 = new int[1];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lhd;ILjava/lang/String;)Lbh;", line = 4)
    public static final class11 method58(class17 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field198;
        var3.glGenProgramsARB(1, field86, 0);
        int var4 = field86[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field86, 0);
        if (field86[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class11(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        this.field84.method251(this.field85);
        super.finalize();
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lhd;II)V", line = 31)
    private class11(class17 arg0, int arg1, int arg2) {
        this.field84 = arg0;
        this.field85 = arg2;
    }
}
