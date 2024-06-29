import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class27 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Ltb;")
    private class227 field470;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    private static int[] field469 = new int[2];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltb;ILjava/lang/String;)Li;", line = 10)
    public static final class27 method301(class227 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3184;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field469, 0);
        if (field469[0] == 0) {
            if (field469[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field469, 1);
            if (field469[1] > 1) {
                byte[] var5 = new byte[field469[1]];
                var3.glGetInfoLogARB(var4, field469[1], field469, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field469[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class27(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        this.field470.method1576(this.field468);
        super.finalize();
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ltb;II)V", line = 48)
    private class27(class227 arg0, int arg1, int arg2) {
        this.field470 = arg0;
        this.field468 = arg1;
    }
}
