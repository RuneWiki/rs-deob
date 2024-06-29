import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class299 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lmi;")
    private class315 field4294;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
    private static int[] field4292 = new int[2];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lmi;ILjava/lang/String;)Lwi;")
    public static final class299 method1841(class315 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4445;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field4292, 0);
        if (field4292[0] == 0) {
            if (field4292[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field4292, 1);
            if (field4292[1] > 1) {
                byte[] var5 = new byte[field4292[1]];
                var3.glGetInfoLogARB(var4, field4292[1], field4292, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4292[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class299(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4294.method2005(this.field4293);
        super.finalize();
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lmi;II)V")
    private class299(class315 arg0, int arg1, int arg2) {
        this.field4294 = arg0;
        this.field4293 = arg1;
    }
}
