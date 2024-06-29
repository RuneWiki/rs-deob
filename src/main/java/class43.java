import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field592 = 35632;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[I")
    private static int[] field593 = new int[2];

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        class275.method1958(this.field591, this.field590);
        super.finalize();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;I)Ldl;", line = 10)
    public static final class43 method294(String arg0, int arg1) {
        GL var2 = class186.field2990;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field593, 0);
        if (field593[0] == 0) {
            if (field593[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field593, 1);
            if (field593[1] > 1) {
                byte[] var4 = new byte[field593[1]];
                var2.glGetInfoLogARB(var3, field593[1], field593, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field593[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class43(var3, arg1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 48)
    public static void method295() {
        field593 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V", line = 55)
    private class43(int arg0, int arg1) {
        this.field591 = arg0;
        this.field590 = class275.field4359;
    }
}
