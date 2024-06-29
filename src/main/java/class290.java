import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class290 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4562;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4559 = 35632;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
    private static int[] field4560 = new int[2];

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        class177.method1304(this.field4561, this.field4562);
        super.finalize();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;I)La;", line = 19)
    public static final class290 method2039(String arg0, int arg1) {
        GL var2 = class162.field2654;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field4560, 0);
        if (field4560[0] == 0) {
            if (field4560[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4560, 1);
            if (field4560[1] > 1) {
                byte[] var4 = new byte[field4560[1]];
                var2.glGetInfoLogARB(var3, field4560[1], field4560, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field4560[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class290(var3, arg1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 54)
    public static void method2040() {
        field4560 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V", line = 59)
    private class290(int arg0, int arg1) {
        this.field4561 = arg0;
        this.field4562 = class177.field2819;
    }
}
