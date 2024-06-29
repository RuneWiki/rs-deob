import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class360 {

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "Lsq;")
    private class96 field5506;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public int field5505;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[I")
    private static int[] field5504 = new int[2];

    @OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field5506.method663(this.field5505);
        super.finalize();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lsq;ILjava/lang/String;)Liq;", line = 8)
    public static final class360 method2339(class96 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1156;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field5504, 0);
        if (field5504[0] == 0) {
            if (field5504[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5504, 1);
            if (field5504[1] > 1) {
                byte[] var5 = new byte[field5504[1]];
                var3.glGetInfoLogARB(var4, field5504[1], field5504, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field5504[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class360(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lsq;II)V", line = 47)
    private class360(class96 arg0, int arg1, int arg2) {
        this.field5506 = arg0;
        this.field5505 = arg1;
    }
}
