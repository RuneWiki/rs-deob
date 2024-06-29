import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class198 {

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Lmm;")
    private class357 field2863;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "[I")
    private static int[] field2861 = new int[2];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lmm;ILjava/lang/String;)Lqn;")
    public static final class198 method1371(class357 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4794;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field2861, 0);
        if (field2861[0] == 0) {
            if (field2861[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2861, 1);
            if (field2861[1] > 1) {
                byte[] var5 = new byte[field2861[1]];
                var3.glGetInfoLogARB(var4, field2861[1], field2861, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2861[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class198(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2863.method2208(this.field2862);
        super.finalize();
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lmm;II)V")
    private class198(class357 arg0, int arg1, int arg2) {
        this.field2863 = arg0;
        this.field2862 = arg1;
    }
}
