import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class8 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field118 = 35632;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    private static int[] field121 = new int[2];

    @OriginalMember(owner = "client!vg", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        class28.method320(this.field119, this.field120);
        super.finalize();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;I)Lvg;", line = 11)
    public static final class8 method93(String arg0, int arg1) {
        GL var2 = class240.field3771;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field121, 0);
        if (field121[0] == 0) {
            if (field121[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field121, 1);
            if (field121[1] > 1) {
                byte[] var4 = new byte[field121[1]];
                var2.glGetInfoLogARB(var3, field121[1], field121, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field121[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class8(var3, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 42)
    public static void method94() {
        field121 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V", line = 55)
    private class8(int arg0, int arg1) {
        this.field119 = arg0;
        this.field120 = class28.field455;
    }
}
