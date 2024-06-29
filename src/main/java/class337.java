import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class337 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    private int field5242;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5239 = 35632;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    private static int[] field5240 = new int[2];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V", line = 11)
    public static void method2371() {
        field5240 = null;
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        class305.method2148(this.field5241, this.field5242);
        super.finalize();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)Lac;", line = 29)
    public static final class337 method2372(String arg0, int arg1) {
        GL var2 = class141.field2025;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field5240, 0);
        if (field5240[0] == 0) {
            if (field5240[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field5240, 1);
            if (field5240[1] > 1) {
                byte[] var4 = new byte[field5240[1]];
                var2.glGetInfoLogARB(var3, field5240[1], field5240, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field5240[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class337(var3, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V", line = 59)
    private class337(int arg0, int arg1) {
        this.field5241 = arg0;
        this.field5242 = class305.field4573;
    }
}
