import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class297 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lhj;")
    private class338 field4123;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[I")
    private static int[] field4122 = new int[2];

    @OriginalMember(owner = "client!dk", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field4123.method2108(this.field4124);
        super.finalize();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lhj;ILjava/lang/String;)Ldk;", line = 15)
    public static final class297 method1921(class338 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4607;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field4122, 0);
        if (field4122[0] == 0) {
            if (field4122[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field4122, 1);
            if (field4122[1] > 1) {
                byte[] var5 = new byte[field4122[1]];
                var3.glGetInfoLogARB(var4, field4122[1], field4122, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4122[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class297(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lhj;II)V", line = 48)
    private class297(class338 arg0, int arg1, int arg2) {
        this.field4123 = arg0;
        this.field4124 = arg1;
    }
}
