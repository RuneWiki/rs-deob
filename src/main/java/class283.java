import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class283 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    private int field4376;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4377 = 35632;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    private static int[] field4378 = new int[2];

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        class198.method1405(this.field4375, this.field4376);
        super.finalize();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 8)
    public static void method1934() {
        field4378 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V", line = 15)
    private class283(int arg0, int arg1) {
        this.field4375 = arg0;
        this.field4376 = class198.field2966;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Lpa;", line = 23)
    public static final class283 method1935(String arg0, int arg1) {
        GL var2 = class94.field1473;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field4378, 0);
        if (field4378[0] == 0) {
            if (field4378[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4378, 1);
            if (field4378[1] > 1) {
                byte[] var4 = new byte[field4378[1]];
                var2.glGetInfoLogARB(var3, field4378[1], field4378, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field4378[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class283(var3, arg1);
    }
}
