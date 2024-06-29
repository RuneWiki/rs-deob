import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class261 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3838 = 35632;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    private static int[] field3840 = new int[2];

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        class180.method1251(this.field3837, this.field3839);
        super.finalize();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)Lfc;", line = 19)
    public static final class261 method1787(String arg0, int arg1) {
        GL var2 = class67.field899;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field3840, 0);
        if (field3840[0] == 0) {
            if (field3840[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3840, 1);
            if (field3840[1] > 1) {
                byte[] var4 = new byte[field3840[1]];
                var2.glGetInfoLogARB(var3, field3840[1], field3840, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field3840[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class261(var3, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V", line = 49)
    private class261(int arg0, int arg1) {
        this.field3837 = arg0;
        this.field3839 = class180.field2413;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 63)
    public static void method1788() {
        field3840 = null;
    }
}
