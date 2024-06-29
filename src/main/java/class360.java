import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class360 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field5693 = 35632;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
    private static int[] field5694 = new int[2];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)Lmo;", line = 6)
    public static final class360 method2503(String arg0, int arg1) {
        GL var2 = class245.field3884;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field5694, 0);
        if (field5694[0] == 0) {
            if (field5694[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field5694, 1);
            if (field5694[1] > 1) {
                byte[] var4 = new byte[field5694[1]];
                var2.glGetInfoLogARB(var3, field5694[1], field5694, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field5694[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class360(var3, arg1);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()V", line = 39)
    public static void method2504() {
        field5694 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(II)V", line = 43)
    private class360(int arg0, int arg1) {
        this.field5691 = arg0;
        this.field5692 = class173.field2703;
    }

    @OriginalMember(owner = "client!mo", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        class173.method1199(this.field5691, this.field5692);
        super.finalize();
    }
}
