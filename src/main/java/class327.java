import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class327 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field5261;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field5259 = 35632;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
    private static int[] field5260 = new int[2];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;I)Led;", line = 6)
    public static final class327 method2331(String arg0, int arg1) {
        GL var2 = class241.field4012;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field5260, 0);
        if (field5260[0] == 0) {
            if (field5260[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field5260, 1);
            if (field5260[1] > 1) {
                byte[] var4 = new byte[field5260[1]];
                var2.glGetInfoLogARB(var3, field5260[1], field5260, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field5260[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class327(var3, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        class239.method1667(this.field5258, this.field5261);
        super.finalize();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 42)
    public static void method2332() {
        field5260 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V", line = 52)
    private class327(int arg0, int arg1) {
        this.field5258 = arg0;
        this.field5261 = class239.field3974;
    }
}
