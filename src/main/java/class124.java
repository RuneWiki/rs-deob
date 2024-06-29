import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class124 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field1888 = 35632;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
    private static int[] field1889 = new int[2];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V", line = 5)
    public static void method921() {
        field1889 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)Lsm;", line = 9)
    public static final class124 method922(String arg0, int arg1) {
        GL var2 = class73.field1051;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field1889, 0);
        if (field1889[0] == 0) {
            if (field1889[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field1889, 1);
            if (field1889[1] > 1) {
                byte[] var4 = new byte[field1889[1]];
                var2.glGetInfoLogARB(var3, field1889[1], field1889, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field1889[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class124(var3, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        class80.method621(this.field1887, this.field1886);
        super.finalize();
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V", line = 55)
    private class124(int arg0, int arg1) {
        this.field1887 = arg0;
        this.field1886 = class80.field1183;
    }
}
