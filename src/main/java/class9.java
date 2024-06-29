import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class9 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field89 = 35632;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
    private static int[] field92 = new int[2];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 4)
    public static void method56() {
        field92 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;I)Lka;", line = 10)
    public static final class9 method57(String arg0, int arg1) {
        GL var2 = class333.field5160;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field92, 0);
        if (field92[0] == 0) {
            if (field92[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field92, 1);
            if (field92[1] > 1) {
                byte[] var4 = new byte[field92[1]];
                var2.glGetInfoLogARB(var3, field92[1], field92, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field92[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class9(var3, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        class301.method1977(this.field90, this.field91);
        super.finalize();
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(II)V", line = 55)
    private class9(int arg0, int arg1) {
        this.field90 = arg0;
        this.field91 = class301.field4649;
    }
}
