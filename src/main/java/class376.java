import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class376 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lfu;")
    private class42 field5190;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "[I")
    private static int[] field5189 = new int[2];

    @OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5190.method361(this.field5188);
        super.finalize();
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lfu;ILjava/lang/String;)Lfs;")
    public static final class376 method2303(class42 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field557;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field5189, 0);
        if (field5189[0] == 0) {
            if (field5189[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5189, 1);
            if (field5189[1] > 1) {
                byte[] var5 = new byte[field5189[1]];
                var3.glGetInfoLogARB(var4, field5189[1], field5189, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field5189[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class376(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lfu;II)V")
    private class376(class42 arg0, int arg1, int arg2) {
        this.field5190 = arg0;
        this.field5188 = arg1;
    }
}
