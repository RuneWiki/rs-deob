import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class132 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field2080 = 35632;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[I")
    private static int[] field2081 = new int[2];

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)Ldn;", line = 11)
    public static final class132 method969(String arg0, int arg1) {
        GL var2 = class232.field3716;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field2081, 0);
        if (field2081[0] == 0) {
            if (field2081[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2081, 1);
            if (field2081[1] > 1) {
                byte[] var4 = new byte[field2081[1]];
                var2.glGetInfoLogARB(var3, field2081[1], field2081, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field2081[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class132(var3, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V", line = 43)
    private class132(int arg0, int arg1) {
        this.field2078 = arg0;
        this.field2079 = class230.field3658;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V", line = 50)
    public static void method970() {
        field2081 = null;
    }

    @OriginalMember(owner = "client!dn", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        class230.method1634(this.field2078, this.field2079);
        super.finalize();
    }
}
