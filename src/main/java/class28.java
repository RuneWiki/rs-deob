import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class28 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field411 = 35632;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
    private static int[] field413 = new int[2];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V", line = 10)
    public static void method254() {
        field413 = null;
    }

    @OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        class103.method716(this.field410, this.field412);
        super.finalize();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)Lbd;", line = 21)
    public static final class28 method255(String arg0, int arg1) {
        GL var2 = class109.field1456;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field413, 0);
        if (field413[0] == 0) {
            if (field413[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field413, 1);
            if (field413[1] > 1) {
                byte[] var4 = new byte[field413[1]];
                var2.glGetInfoLogARB(var3, field413[1], field413, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field413[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class28(var3, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V", line = 55)
    private class28(int arg0, int arg1) {
        this.field410 = arg0;
        this.field412 = class103.field1369;
    }
}
