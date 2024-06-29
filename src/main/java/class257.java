import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lql;")
    private class346 field3507;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    private static int[] field3508 = new int[2];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lql;ILjava/lang/String;)Loj;", line = 4)
    public static final class257 method1449(class346 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4697;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field3508, 0);
        if (field3508[0] == 0) {
            if (field3508[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3508, 1);
            if (field3508[1] > 1) {
                byte[] var5 = new byte[field3508[1]];
                var3.glGetInfoLogARB(var4, field3508[1], field3508, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3508[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class257(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        this.field3507.method2096(this.field3506);
        super.finalize();
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lql;II)V", line = 44)
    private class257(class346 arg0, int arg1, int arg2) {
        this.field3507 = arg0;
        this.field3506 = arg1;
    }
}
