import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class97 {

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Ltb;")
    private class227 field1351;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
    private static int[] field1349 = new int[1];

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ltb;ILjava/lang/String;)Lsq;")
    public static final class97 method705(class227 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3184;
        var3.glGenProgramsARB(1, field1349, 0);
        int var4 = field1349[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field1349, 0);
        if (field1349[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class97(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1351.method1546(this.field1350);
        super.finalize();
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ltb;II)V")
    private class97(class227 arg0, int arg1, int arg2) {
        this.field1351 = arg0;
        this.field1350 = arg2;
    }
}
