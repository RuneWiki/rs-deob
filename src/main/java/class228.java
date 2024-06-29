import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class228 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3800 = 35632;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    private static int[] field3803 = new int[2];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)Lul;", line = 10)
    public static final class228 method1772(String arg0, int arg1) {
        GL var2 = class42.field627;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field3803, 0);
        if (field3803[0] == 0) {
            if (field3803[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3803, 1);
            if (field3803[1] > 1) {
                byte[] var4 = new byte[field3803[1]];
                var2.glGetInfoLogARB(var3, field3803[1], field3803, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field3803[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class228(var3, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        class199.method1528(this.field3801, this.field3802);
        super.finalize();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 49)
    public static void method1773() {
        field3803 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(II)V", line = 52)
    private class228(int arg0, int arg1) {
        this.field3801 = arg0;
        this.field3802 = class199.field3172;
    }
}
