import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class162 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lks;")
    private class173 field2154;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    private static int[] field2153 = new int[2];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lks;ILjava/lang/String;)Lqg;")
    public static final class162 method1078(class173 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field2253;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field2153, 0);
        if (field2153[0] == 0) {
            if (field2153[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2153, 1);
            if (field2153[1] > 1) {
                byte[] var5 = new byte[field2153[1]];
                var3.glGetInfoLogARB(var4, field2153[1], field2153, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2153[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class162(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2154.method1153(this.field2155);
        super.finalize();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lks;II)V")
    private class162(class173 arg0, int arg1, int arg2) {
        this.field2154 = arg0;
        this.field2155 = arg1;
    }
}
