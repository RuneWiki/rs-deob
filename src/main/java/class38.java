import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class38 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lig;")
    private class132 field525;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[I")
    private static int[] field523 = new int[2];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lig;ILjava/lang/String;)Lbd;", line = 6)
    public static final class38 method253(class132 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1918;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field523, 0);
        if (field523[0] == 0) {
            if (field523[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field523, 1);
            if (field523[1] > 1) {
                byte[] var5 = new byte[field523[1]];
                var3.glGetInfoLogARB(var4, field523[1], field523, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field523[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class38(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() throws Throwable {
        this.field525.method881(this.field524);
        super.finalize();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lig;II)V", line = 48)
    private class38(class132 arg0, int arg1, int arg2) {
        this.field525 = arg0;
        this.field524 = arg1;
    }
}
