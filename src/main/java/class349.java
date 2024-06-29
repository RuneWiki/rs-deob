import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class349 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    private int field5460;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field5458 = 35632;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    private static int[] field5459 = new int[2];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 4)
    public static void method2420() {
        field5459 = null;
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        class298.method2040(this.field5457, this.field5460);
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lec;", line = 19)
    public static final class349 method2421(String arg0, int arg1) {
        GL var2 = class47.field592;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field5459, 0);
        if (field5459[0] == 0) {
            if (field5459[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field5459, 1);
            if (field5459[1] > 1) {
                byte[] var4 = new byte[field5459[1]];
                var2.glGetInfoLogARB(var3, field5459[1], field5459, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field5459[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class349(var3, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II)V", line = 59)
    private class349(int arg0, int arg1) {
        this.field5457 = arg0;
        this.field5460 = class298.field4320;
    }
}
