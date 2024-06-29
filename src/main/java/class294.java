import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class294 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4598 = 35632;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
    private static int[] field4601 = new int[2];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Lae;", line = 13)
    public static final class294 method2088(String arg0, int arg1) {
        GL var2 = class250.field3818;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field4601, 0);
        if (field4601[0] == 0) {
            if (field4601[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4601, 1);
            if (field4601[1] > 1) {
                byte[] var4 = new byte[field4601[1]];
                var2.glGetInfoLogARB(var3, field4601[1], field4601, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field4601[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class294(var3, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        class266.method1933(this.field4600, this.field4599);
        super.finalize();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 48)
    public static void method2089() {
        field4601 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V", line = 59)
    private class294(int arg0, int arg1) {
        this.field4600 = arg0;
        this.field4599 = class266.field4192;
    }
}
